/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.processing.handlers;

import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.EventRuntimeHandler.RESUMED;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.EventRuntimeHandler.STARTED;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.EventRuntimeHandler.SUSPENDED;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.EventRuntimeHandler.TERMINATED;

import java.io.IOException;

import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.AbstractPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.ConfirmationPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.EventPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.EventPackageWithFrames;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;

/**
 * This class handles the distribution of debug events on the Eclipse side.<br>
 * It listens in an extra thread for events from the runtime process and forwards them to the
 * <code>DebugModelManager</code>.
 */
public class EventPluginHandler implements Runnable {

	private Connection connection;

	private DebugModelManager dmm;

	private final Class<? extends AbstractPackage> typeToListen = EventPackage.class;

	// -------------------------------------------------------------------------

	public EventPluginHandler() {
	}

	// -------------------------------------------------------------------------

	public void setDmm(final DebugModelManager dmm) {
		this.dmm = dmm;
	}

	public Class<? extends AbstractPackage> getPackageType() {
		return typeToListen;
	}

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	// -------------------------------------------------------------------------

	public void startListener() {
		Thread thread = new Thread(this, getClass().getSimpleName());
		thread.setDaemon(true);
		thread.start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				dispatch((EventPackage) connection.listenForPackage(typeToListen));
			}
		} catch (Exception e) {
			connection.close();
		}
	}

	private void dispatch(final EventPackage packet) throws DebugException {
		dmm.getThread().setBreakpoint(null);

		switch (packet.event) {
		case STARTED:
			dmm.debuggerStarted();
			break;
		case SUSPENDED:
			adaptStackFrames(packet);
			dmm.debuggerSuspended();
			break;
		case RESUMED:
			dmm.debuggerResumed();
			break;
		case TERMINATED:
			dmm.debuggerTerminated();
			break;
		default:
			Activator.logError("Internal error.\nInvalid event received: " + packet.event, null);
			return;
		}

		ConfirmationPackage conf = new ConfirmationPackage(packet.getId());
		try {
			connection.sendPackage(conf);
		} catch (IOException e) {
			throw new DebugException(Activator.createErrorStatus(
					"lost connection to debugger runtime process --> aborting", e));
		}
	}

	private void adaptStackFrames(final EventPackage sp) {
		EventPackageWithFrames packet = (EventPackageWithFrames) sp;
		dmm.adaptStackFrames(packet.cleanStackLevel, packet.frames);
	}

}
