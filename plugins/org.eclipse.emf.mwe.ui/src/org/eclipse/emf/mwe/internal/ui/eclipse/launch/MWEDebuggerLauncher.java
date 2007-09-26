/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.eclipse.launch;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugTarget;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.launching.AbstractVMRunner;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.SocketUtil;
import org.eclipse.jdt.launching.VMRunnerConfiguration;

/**
 * The Launcher starts the workflow execution process in a new runtime VM.<br>
 * It establishes the socket connection for communication between the runtime VM and the debugger framework.<br>
 * It instantiates the debug model representation.
 * 
 */
public class MWEDebuggerLauncher extends AbstractVMRunner {
	private IVMInstall vm;

	public MWEDebuggerLauncher(IVMInstall vmInstance) {
		vm = vmInstance;
	}

	@Override
	protected String getPluginIdentifier() {
		return Activator.PLUGIN_ID;
	}

	@SuppressWarnings("null")
	public void run(VMRunnerConfiguration config, ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// port for communication between runtime VM and Eclipse
		int commPort = SocketUtil.findFreePort();
		if (commPort == -1) {
			throw new DebugException(Activator.createErrorStatus(
					"Unable to find free port to start communication with debugger runtime VM" + " --> aborting",
					null));
		}

		// params for rumtime VM start
		String[] cmdLine = renderCommandLine(config, commPort);
		File workingDir = new File(config.getWorkingDirectory());
		String[] envp = config.getEnvironment();

		Connection connection = new Connection();

		Process p = null;
		try {

			try {
				connection.startListeningSocket(commPort);
			} catch (IOException e) {
				throw new DebugException(Activator.createErrorStatus(
						"Unable to start debugger listening socket on port " + commPort + " --> aborting", e));
			}

			ConnectRunnable runnable = startListeningThread(connection);

			// start runtime VM
			p = DebugPlugin.exec(cmdLine, workingDir, envp);
			if (p == null) {
				throw new DebugException(Activator.createErrorStatus(
						"Couldn't start Debugger runtime process --> aborting", null));
			}

			// instantiate MWE debug model to support Eclipse
			IProcess process = DebugPlugin.newProcess(launch, p, renderProcessLabel("Debugger Process"));

			// wait for runtime process connected to the server socket
			while (runnable.isRunning() && !process.isTerminated()) {
				if (monitor.isCanceled()) {
					p.destroy();
					runnable.cancel();
				}
				try {
					if (p.exitValue() != 0)
						runnable.cancel();
				} catch (IllegalThreadStateException e) {
					// occurs in normal process (p is still running)
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
			Exception e = runnable.getException();
			if (e != null || process.isTerminated()) {
				if (runnable.isRunning())
					runnable.cancel();
				throw new DebugException(Activator.createErrorStatus(
						"Debugger runtime process didn't respond properly --> aborting", null));
			}
			DebugTarget.newDebugTarget(launch, process, connection);
		} catch (CoreException e) {
			if (p != null)
				p.destroy();
			connection.close();
			throw e;
		}
	}

	private String[] renderCommandLine(VMRunnerConfiguration config, int commPort) throws CoreException {
		// program string
		List<String> arguments = new ArrayList<String>();
		arguments.add(findJavaExecutable());

		// VM arguments
		String[] vmArgs = config.getVMArguments();
		if (vmArgs != null)
			for (int i = 0; i < vmArgs.length; i++)
				arguments.add(vmArgs[i]);

		// classpath
		String[] cp = config.getClassPath();
		if (cp.length > 0) {
			arguments.add("-classpath");
			StringBuilder cpSb = new StringBuilder();
			for (String cpEntry : cp) {
				cpSb.append(cpEntry);
				cpSb.append(File.pathSeparator);
			}
			arguments.add(cpSb.substring(0, cpSb.lastIndexOf(File.pathSeparator)));
		}
		// TODO: ER: make sure that all runtime classes that are provided by extensions (handlers, adapters) are in the class path

		// the class to launch
		arguments.add(config.getClassToLaunch());

		// programArgs
		String[] progArgs = config.getProgramArguments();
		for (int i = 0; i < progArgs.length; i++)
			arguments.add(progArgs[i]);

		arguments.add("" + commPort);

		String[] cmdLine = new String[arguments.size()];
		arguments.toArray(cmdLine);
		return cmdLine;
	}

	private String findJavaExecutable() throws CoreException {

		char fgSeparator = File.separatorChar;
		String[] fgCandidateJavaLocations = { "bin" + fgSeparator + "javaw", "bin" + fgSeparator + "javaw.exe",
				"jre" + fgSeparator + "bin" + fgSeparator + "javaw",
				"jre" + fgSeparator + "bin" + fgSeparator + "javaw.exe", "bin" + fgSeparator + "java",
				"bin" + fgSeparator + "java.exe", "jre" + fgSeparator + "bin" + fgSeparator + "java",
				"jre" + fgSeparator + "bin" + fgSeparator + "java.exe" };
		File vmInstallLocation = vm.getInstallLocation();
		for (int i = 0; i < fgCandidateJavaLocations.length; i++) {
			File javaFile = new File(vmInstallLocation, fgCandidateJavaLocations[i]);
			if (javaFile.isFile()) {
				return javaFile.getAbsolutePath();
			}
		}
		throw new DebugException(Activator.createErrorStatus("Unable to locate executable for " + vm.getName()
				+ " --> aborting", null));
	}

	private static String renderProcessLabel(String command) {
		String timestamp = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(
				new Date(System.currentTimeMillis()));
		return command + " (" + timestamp + ")";
	}

	/** ************************************************************************* */

	private ConnectRunnable startListeningThread(Connection connector) {
		ConnectRunnable runnable = new ConnectRunnable(connector);
		Thread connectThread = new Thread(runnable, "Listening Connector");
		runnable.setThread(connectThread);
		connectThread.setDaemon(true);
		connectThread.start();
		return runnable;
	}

	class ConnectRunnable implements Runnable {
		private Connection fConnector = null;

		private Exception fException = null;

		private Thread thread = null;

		public ConnectRunnable(Connection connector) {
			fConnector = connector;
		}

		public void run() {
			try {
				int timeout = JavaRuntime.getPreferences().getInt(JavaRuntime.PREF_CONNECT_TIMEOUT);
				fConnector.accept(timeout);
			} catch (Exception e) {
				fException = e;
			}
		}

		public void cancel() {
			fConnector.close();
		}

		public Exception getException() {
			return fException;
		}

		public void setThread(Thread thread) {
			this.thread = thread;
		}

		public boolean isRunning() {
			return thread.isAlive();
		}
	}

}
