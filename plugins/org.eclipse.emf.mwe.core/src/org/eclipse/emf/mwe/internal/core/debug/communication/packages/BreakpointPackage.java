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
