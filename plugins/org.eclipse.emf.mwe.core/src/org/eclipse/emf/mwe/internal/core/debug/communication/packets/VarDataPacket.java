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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;

/**
 * The packet to communicate variable values for a specific reference id. Corresponds with
 * <code>RequireVarPacket</code>.
 */
public class VarDataPacket extends AbstractPacket {

	public List<VarValueTO> valueList = new ArrayList<VarValueTO>();

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		refId = in.readInt();
		int noOfValues = in.readInt();
		for (int i = 0; i < noOfValues; i++) {
			VarValueTO var = new VarValueTO();
			var.readContent(in);
			valueList.add(var);
		}
	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(refId);
		out.writeInt(valueList.size());
		for (VarValueTO var : valueList) {
			var.writeContent(out);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + " [");
		for (VarValueTO var : valueList) {
			sb.append(var.name + " ");
		}
		sb.append("]");
		return sb.toString();
	}

}
