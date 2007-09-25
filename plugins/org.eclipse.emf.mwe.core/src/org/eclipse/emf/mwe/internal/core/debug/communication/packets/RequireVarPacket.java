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
package org.eclipse.emf.mwe.internal.core.debug.communication.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * The packet to communicate a request for variable from a specific frame and variable id.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class RequireVarPacket extends AbstractPacket {

	public int frameId;

	public int varId;

	// -------------------------------------------------------------------------

	public RequireVarPacket(int frameId, int varId) {
		setNextId();
		this.frameId = frameId;
		this.varId = varId;
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(DataInputStream in) throws IOException {
		id = in.readInt();
		frameId = in.readInt();
		varId = in.readInt();
	}

	@Override
	public void writeContent(DataOutputStream out) throws IOException {
		out.writeInt(id);
		out.writeInt(frameId);
		out.writeInt(varId);
	}

	@Override
	public String toString() {
		return super.toString() + " frameId=" + frameId + (varId != 0 ? " varId=" + varId : "");
	}

}
