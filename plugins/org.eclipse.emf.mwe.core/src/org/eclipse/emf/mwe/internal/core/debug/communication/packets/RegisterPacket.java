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

/**
 * The packet to communicate handlers or adapter class names to be registered in the runtime process.
 */
public class RegisterPacket extends AbstractPacket {

	public static final int HANDLERS = 1;

	public static final int ADAPTERS = 2;

	public int type;

	public List<String> classNames = new ArrayList<String>();

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		type = in.readInt();
		int noOfHandlers = in.readInt();
		for (int i = 0; i < noOfHandlers; i++) {
			classNames.add(in.readUTF());
		}
	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(type);
		out.writeInt(classNames.size());
		for (String name : classNames) {
			out.writeUTF(name);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " type=" + type + " " + classNames;
	}

}
