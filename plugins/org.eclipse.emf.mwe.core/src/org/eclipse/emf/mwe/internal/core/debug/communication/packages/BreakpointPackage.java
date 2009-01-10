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

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;

/**
 * The packet to communicate set and delete of breakpoints.
 */
public class BreakpointPackage extends AbstractPackage {

	public int type;

	public SyntaxElement se;

	// -------------------------------------------------------------------------

	public BreakpointPackage(final int type, final SyntaxElement se) {
		super();
		this.type = type;
		this.se = se;
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		type = in.readInt();
		se = new SyntaxElement();
		se.readContent(in);

	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(type);
		se.writeContent(out);
	}

	@Override
	public String toString() {
		return super.toString() + " type=" + type + " resource=" + se.resource + " line=" + se.line;
	}
}
