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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;

/**
 * The packet to communicate an event from the runtime process together with the current stack frame information.
 */
public class EventPackageWithFrames extends EventPackage {

	public int cleanStackLevel;

	public List<SyntaxElement> frames = new ArrayList<SyntaxElement>();

	// -------------------------------------------------------------------------

	public EventPackageWithFrames(final int event) {
		super(event);
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		super.readContent(in);
		cleanStackLevel = in.readInt();
		int noOfFrames = in.readInt();
		for (int i = 0; i < noOfFrames; i++) {
			SyntaxElement frame = new SyntaxElement();
			frame.readContent(in);
			frames.add(frame);
		}
	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		super.writeContent(out);
		out.writeInt(cleanStackLevel);
		out.writeInt(frames.size());
		for (SyntaxElement frame : frames) {
			frame.writeContent(out);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + " ");
		sb.append(" clean=" + cleanStackLevel);
		sb.append(" " + frames.size() + " frames");
		return sb.toString();
	}

}
