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

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;

/**
 * The packet to communicate set and delete of breakpoints.
 */
public class BreakpointPacket extends AbstractPacket {

	public int type;

	public SyntaxElement se;

	// -------------------------------------------------------------------------

	public BreakpointPacket(int type, SyntaxElement se) {
		super();
		this.type = type;
		this.se = se;
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(DataInputStream in) throws IOException {
		type = in.readInt();
		se = new SyntaxElement();
		se.readContent(in);

	}

	@Override
	public void writeContent(DataOutputStream out) throws IOException {
		out.writeInt(type);
		se.writeContent(out);
	}

	@Override
	public String toString() {
		return super.toString() + " type=" + type + " resource=" + se.resource + " line=" + se.line;
	}
}
