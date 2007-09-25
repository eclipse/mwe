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

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.RequireVarPacket;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.VarDataPacket;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;
import org.eclipse.emf.mwe.internal.ui.debug.processing.PluginHandler;

/**
 * This class handles the communication of variable values on the Eclipse side
 */
public class VariablesPluginHandler implements PluginHandler {

	private Connection connection;

	// -------------------------------------------------------------------------

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setDebugModelManager(DebugModelManager dmm) {
		// don't need it
	}

	// -------------------------------------------------------------------------

	public List<VarValueTO> sendRequireVariables(int frameId) throws IOException {
		RequireVarPacket packet = new RequireVarPacket(frameId, 0);
		int refId = connection.sendPacket(packet);
		return ((VarDataPacket) connection.listenForPacket(VarDataPacket.class, refId)).valueList;
	}

	public List<VarValueTO> sendRequireSubVariables(int frameId, int varId) throws IOException {
		RequireVarPacket packet = new RequireVarPacket(frameId, varId);
		int refId = connection.sendPacket(packet);
		return ((VarDataPacket) connection.listenForPacket(VarDataPacket.class, refId)).valueList;
	}

}
