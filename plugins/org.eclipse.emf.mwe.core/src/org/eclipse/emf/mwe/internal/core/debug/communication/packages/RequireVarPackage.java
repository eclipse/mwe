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
