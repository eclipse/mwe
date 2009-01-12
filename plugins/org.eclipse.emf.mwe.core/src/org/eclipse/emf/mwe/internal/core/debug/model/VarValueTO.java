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
package org.eclipse.emf.mwe.internal.core.debug.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Transfer object class for variable description in a normalized form.
 */
public class VarValueTO {

	public String name;

	public int valueId;

	public String stringRep;

	public String simpleRep;

	public boolean hasMembers;

	// -------------------------------------------------------------------------

	public VarValueTO() {
	}

	public VarValueTO(final String name) {
		this.name = name;
	}

	// -------------------------------------------------------------------------

	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeInt(valueId);
		out.writeUTF(stringRep);
		if (simpleRep == null) {
			System.out.println("simpleRep of " + stringRep + " is null.");
//			simpleRep = "null";
		}
		out.writeUTF(simpleRep);
		out.writeBoolean(hasMembers);
	}

	public void readContent(final DataInputStream in) throws IOException {
		name = in.readUTF();
		valueId = in.readInt();
		stringRep = in.readUTF();
		simpleRep = in.readUTF();
		hasMembers = in.readBoolean();
	}

}
