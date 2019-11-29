/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.eclipse.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugTarget;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugThread;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IModuleDescription;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;

/**
 * This launch delegate decides in which mode to run the workflow execution process (run or debug) and redirects
 * to the JavaLaunchDelegate or delegates to the WorkflowDebuggerLauncher.
 * 
 */
public class MWELaunchDelegate extends AbstractJavaLaunchConfigurationDelegate {

	private static final String wfRunnerClassName = WorkflowRunner.class.getName();

	private String wfFileName;

	private Job refreshJob = new Job("refresh resources") {
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
						IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
			}
			return Status.OK_STATUS;
		}
	};

	@Override
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor)
			throws CoreException {

		if (monitor.isCanceled()) {
			return;
		}

		monitor.beginTask("Launching VM...", 3);
		monitor.worked(1);

		// get file to execute
		wfFileName = configuration.getAttribute(MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE,
				(String) null);
		if (wfFileName == null) {
			throw new DebugException(Activator.createErrorStatus("Workflow file is not specified --> aborting",
					null));
		}

		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(wfFileName));

		// add abs. path because ResourceListSelectionDialog creates it relative
		// to the WS-root
		if (wfFileName.startsWith("/")) {
			wfFileName = file.getLocation().toString();
		}

		// check if file exist
		if (!file.exists()) {
			throw new DebugException(Activator.createErrorStatus("file " + file.getFullPath()
					+ " does not exist. --> aborting", null));
		}

		// register this class as listener for termination of the runtime process (see handleDebugEvents)
		DebugPlugin.getDefault().addDebugEventListener(this);
		boolean javaDebug = configuration.getAttribute(MWELaunchConfigurationConstants.ATTR_MWE_JAVA_DEBUG_MODE,
				false);

		if (!mode.equals(ILaunchManager.DEBUG_MODE) || javaDebug) {
			// redirect to a JavaLauchDelegate; set config attributes accordingly
			monitor.subTask("preparing Java launch...");

			ILaunchConfigurationWorkingCopy wc = configuration.copy("JavaLaunch");

			try {
				final ILaunchConfigurationType configType = getLaunchManager().getLaunchConfigurationType(
						IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
				wc = configType.newInstance(null, configuration.getName());
			} catch (final CoreException e) {
				throw new DebugException(Activator.createErrorStatus(
						"Error creating launch configuration. --> aborting", e));
			}

			wc.setAttributes(configuration.getAttributes());
			String programArguments = configuration.getAttribute(
					IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
					"");
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, wfRunnerClassName);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, "\"" + wfFileName + "\" " + programArguments);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION, "workflow - " + wfFileName);

			monitor.worked(1);
			monitor.subTask("delegating to Java launch...");

			Job[] autoBuildJobs;
			Job[] manBuildJobs;
			do {
				autoBuildJobs = Job.getJobManager().find(ResourcesPlugin.FAMILY_AUTO_BUILD);
				manBuildJobs = Job.getJobManager().find(ResourcesPlugin.FAMILY_MANUAL_BUILD);
			} while ((autoBuildJobs.length > 0) || (manBuildJobs.length > 0));

			getLaunchManager().removeLaunch(launch);

			DebugUITools.launch(wc, mode);

		} else {
			monitor.subTask("preparing debugger launch...");

			// runner
			IVMInstall vm = JavaRuntime.computeVMInstall(configuration);
			MWEDebuggerLauncher launcher = new MWEDebuggerLauncher(vm);

			// classpath
			String[][] classpathAndModulepath = getClasspathAndModulepath(configuration);

			// working dir
			String workingDirName = null;
			IJavaProject jp = getJavaProject(configuration);
			if (jp != null) {
				IProject p = jp.getProject();
				workingDirName = p.getLocation().toFile().getAbsolutePath();
			}

			// program arguments
			String attribute = configuration.getAttribute(
					IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
					"");
			List<String> progArgs = new ArrayList<String>();
			progArgs.add(wfFileName);
			progArgs.add("-m");
			progArgs.add(DebugMonitor.class.getName());
			if (!attribute.equals("")) {
				String[] split = attribute.split("\\s");
				for (String string : split) {
					if ( !string.equals("")) {
						progArgs.add(string);
					}
				}
			}

			String vmArgs = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
					(String) null);

			// bundle config
			VMRunnerConfiguration runnerConfig = new VMRunnerConfiguration(wfRunnerClassName, classpathAndModulepath[0]);
			runnerConfig.setWorkingDirectory(workingDirName);
			runnerConfig.setProgramArguments(progArgs.toArray(new String[0]));
			runnerConfig.setVMArguments(DebugPlugin.parseArguments(vmArgs));
			
			if (!JavaRuntime.isModularConfiguration(configuration)) {
				// Bootpath
				runnerConfig.setBootClassPath(getBootpath(configuration));
			} else {
				// module path
				runnerConfig.setModulepath(classpathAndModulepath[1]);
				try {
					// We do need the current project module later on - write it into the module description
					IJavaProject proj = JavaRuntime.getJavaProject(configuration);
					if (proj != null) {
						IModuleDescription module = proj.getModuleDescription();
						String modName = module == null ? null : module.getElementName();
						if (modName != null) {
							runnerConfig.setModuleDescription(modName);
						}
					}
				}
				catch (CoreException e) {
					// Not a java Project so no need to set module description
				}
			}

			monitor.worked(1);
			monitor.subTask("launching debugger ...");

			// run
			launcher.run(runnerConfig, launch, monitor);
		}
		monitor.done();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#handleDebugEvents(org.eclipse.debug.core.DebugEvent[])
	 */
	@Override
	public void handleDebugEvents(final DebugEvent[] events) {
		for (DebugEvent event : events) {
			if (((event.getSource() instanceof DebugTarget)
                    || (event.getSource() instanceof DebugThread) || (event
                    .getSource() instanceof RuntimeProcess))
                    && event.getKind() == DebugEvent.TERMINATE) {
                if (refreshJob.getState() != Job.WAITING) {
                    refreshJob.schedule();
                }
                DebugPlugin.getDefault().removeDebugEventListener(this);
            }
		}
		super.handleDebugEvents(events);
	}

}
