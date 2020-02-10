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
 * The packet to communicate an event from the runtime process.
 */
public class EventPackage extends AbstractPackage {

	public int event;

	// -------------------------------------------------------------------------

	public EventPackage(final int event) {
		this.event = event;
		setNextId();
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		id = in.readInt();
		event = in.readInt();

	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(id);
		out.writeInt(event);
	}

	@Override
	public String toString() {
		return super.toString() + " event=" + event;
	}

}
