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
 * The base class for all types of packages. It has the id and refId. Inheriting classes must call setNextId to get
 * a valid id.
 * 
 */
public abstract class AbstractPackage {
	protected int id;

	public int refId;

	private static int nextId = 0;

	// -------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	// -------------------------------------------------------------------------

	/**
	 * fill the packet fields from the <code>DataInputStream</code>. Implementors have to make sure that the
	 * data content matches with the writeContent(out) method!!
	 * 
	 * @param in the DataInputStream
	 * @throws IOException
	 */
	public abstract void readContent(DataInputStream in) throws IOException;

	/**
	 * write the packet fields content to the <code>DataOutputStream</code>. Implementors have to make sure
	 * that the data content matches with the readContent(out) method!!
	 * 
	 * @param out the DataOutputStream
	 * @throws IOException
	 */
	public abstract void writeContent(DataOutputStream out) throws IOException;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " ");
		if (id != 0) {
			sb.append(" id=" + id);
		}
		if (refId != 0) {
			sb.append(" refId=" + refId);
		}
		return sb.toString();
	}

	// -------------------------------------------------------------------------

	protected void setNextId() {
		if (nextId == Integer.MAX_VALUE) {
			nextId = 1;
		} else {
			id = ++nextId;
		}
	}

}
