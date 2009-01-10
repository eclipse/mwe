/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.communication.packages;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * The packet to communicate a request for variable from a specific frame and variable id.
 */
public class RequireVarPackage extends AbstractPackage {

	public int frameId;

	public int varId;

	// -------------------------------------------------------------------------

	public RequireVarPackage(final int frameId, final int varId) {
		setNextId();
		this.frameId = frameId;
		this.varId = varId;
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		id = in.readInt();
		frameId = in.readInt();
		varId = in.readInt();
	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(id);
		out.writeInt(frameId);
		out.writeInt(varId);
	}

	@Override
	public String toString() {
		return super.toString() + " frameId=" + frameId + (varId != 0 ? " varId=" + varId : "");
	}

}
