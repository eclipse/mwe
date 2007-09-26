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

/**
 * The packet to communicate an event from the runtime process.
 */
public class EventPacket extends AbstractPacket {

	public int event;

	// -------------------------------------------------------------------------

	public EventPacket(int event) {
		this.event = event;
		setNextId();
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(DataInputStream in) throws IOException {
		id = in.readInt();
		event = in.readInt();

	}

	@Override
	public void writeContent(DataOutputStream out) throws IOException {
		out.writeInt(id);
		out.writeInt(event);
	}

	@Override
	public String toString() {
		return super.toString() + " event=" + event;
	}

}
