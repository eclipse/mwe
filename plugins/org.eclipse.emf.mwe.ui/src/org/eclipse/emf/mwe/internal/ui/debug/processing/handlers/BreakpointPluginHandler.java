/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.processing.handlers;

import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.BreakpointRuntimeHandler.REMOVE;
import static org.eclipse.emf.mwe.internal.core.debug.processing.handlers.BreakpointRuntimeHandler.SET;

import java.io.IOException;

import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.BreakpointPacket;
import org.eclipse.emf.mwe.internal.ui.debug.model.MWEBreakpoint;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;
import org.eclipse.emf.mwe.internal.ui.debug.processing.PluginHandler;

/**
 * This class handles the communication of breakpoints on the Eclipse side
 */
public class BreakpointPluginHandler implements PluginHandler {

	private Connection connection;

	// -------------------------------------------------------------------------

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	public void setDebugModelManager(final DebugModelManager dmm) {
		// don't need it
	}
	
	// -------------------------------------------------------------------------

	public void sendSetBreakpoint(final MWEBreakpoint bp) throws IOException {
		connection.sendPacket(new BreakpointPacket(SET, bp.createTO()));
	}

	public void sendRemoveBreakpoint(final MWEBreakpoint bp) throws IOException {
		connection.sendPacket(new BreakpointPacket(REMOVE, bp.createTO()));
	}

}
