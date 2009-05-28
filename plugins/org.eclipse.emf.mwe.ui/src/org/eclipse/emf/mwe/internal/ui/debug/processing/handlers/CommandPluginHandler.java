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

import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.RESUME;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.STEP_INTO;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.STEP_OVER;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.STEP_RETURN;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.SUSPEND;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler.TERMINATE;

import java.io.IOException;

import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.CommandPackage;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;

/**
 * This class handles the communication of debug command actions on the Eclipse side
 */
public class CommandPluginHandler {

	private Connection connection;

	// -------------------------------------------------------------------------

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	// -------------------------------------------------------------------------

	public void sendStepIntoCommand() throws DebugException {
		sendCommand(STEP_INTO);
	}

	public void sendStepOverCommand() throws DebugException {
		sendCommand(STEP_OVER);
	}

	public void sendStepReturnCommand() throws DebugException {
		sendCommand(STEP_RETURN);
	}

	public void sendResumeCommand() throws DebugException {
		sendCommand(RESUME);
	}

	public void sendSuspendCommand() throws DebugException {
		sendCommand(SUSPEND);
	}

	public void sendTerminateCommand() throws DebugException {
		sendCommand(TERMINATE);
	}

	// -------------------------------------------------------------------------

	private void sendCommand(final int type) throws DebugException {
		try {
			connection.sendPackage(new CommandPackage(type));
		} catch (IOException e) {
			throw new DebugException(Activator
					.createErrorStatus("lost connection to debugger runtime process", e));
		}
	}

}
