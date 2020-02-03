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
package org.eclipse.emf.mwe.core.debug.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Transfer object class for syntax element description in a normalized form.
 * 
 */
public class SyntaxElement {

	public String resource = "";

	public int start;

	public int end;

	public int line;

	public int frameId;

	public String containerName = "";

	public String elementName = "";

	public String type = "";

	public boolean visible = true;
	
	// -------------------------------------------------------------------------

	public void readContent(final DataInputStream in) throws IOException {
		resource = in.readUTF();
		start = in.readInt();
		end = in.readInt();
		line = in.readInt();
		frameId = in.readInt();
		containerName = in.readUTF();
		elementName = in.readUTF();
		type = in.readUTF();
		visible = in.readBoolean();
	}

	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeUTF(resource);
		out.writeInt(start);
		out.writeInt(end);
		out.writeInt(line);
		out.writeInt(frameId);
		out.writeUTF(containerName);
		out.writeUTF(elementName);
		out.writeUTF(type);
		out.writeBoolean(visible);
	}

	public boolean equalsBP(final SyntaxElement se){
		return resource.equals(se.resource) && (line == se.line) && (start == se.start);
	}
	
}
