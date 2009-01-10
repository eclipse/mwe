/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.processing.handlers;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.RequireVarPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.VarDataPackage;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;
import org.eclipse.emf.mwe.internal.ui.debug.processing.PluginHandler;

/**
 * This class handles the communication of variable values on the Eclipse side
 */
public class VariablesPluginHandler implements PluginHandler {

	private Connection connection;

	// -------------------------------------------------------------------------

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	public void setDebugModelManager(final DebugModelManager dmm) {
		// don't need it
	}

	// -------------------------------------------------------------------------

	public List<VarValueTO> sendRequireVariables(final int frameId) throws IOException {
		RequireVarPackage packet = new RequireVarPackage(frameId, 0);
		int refId = connection.sendPackage(packet);
		return ((VarDataPackage) connection.listenForPackage(VarDataPackage.class, refId)).valueList;
	}

	public List<VarValueTO> sendRequireSubVariables(final int frameId, final int varId) throws IOException {
		RequireVarPackage packet = new RequireVarPackage(frameId, varId);
		int refId = connection.sendPackage(packet);
		return ((VarDataPackage) connection.listenForPackage(VarDataPackage.class, refId)).valueList;
	}

}
