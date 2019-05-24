/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.eclipse.launch;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.jdt.internal.launching.LaunchingPlugin;
import org.eclipse.jdt.launching.JavaRuntime;

/**
 * @author kia7si - moved class out of MWEDebuggerLauncher.
 */
@SuppressWarnings("restriction")
public class ConnectRunnable implements Runnable {
	private Connection fConnector = null;

	private Exception fException = null;

	private Thread thread = null;

	public ConnectRunnable(final Connection connector) {
		fConnector = connector;
	}

	@Override
	public void run() {
		try {
			int timeout = Platform.getPreferencesService().getInt(
				LaunchingPlugin.ID_PLUGIN,
				JavaRuntime.PREF_CONNECT_TIMEOUT,
				JavaRuntime.DEF_CONNECT_TIMEOUT,
				null);
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

	public void setThread(final Thread thread) {
		this.thread = thread;
	}

	public boolean isRunning() {
		return thread.isAlive();
	}

	public static ConnectRunnable startListeningThread(final Connection connector) {
		ConnectRunnable runnable = new ConnectRunnable(connector);
		Thread connectThread = new Thread(runnable, "Listening Connector");
		runnable.setThread(connectThread);
		connectThread.setDaemon(true);
		connectThread.start();
		return runnable;
	}
}