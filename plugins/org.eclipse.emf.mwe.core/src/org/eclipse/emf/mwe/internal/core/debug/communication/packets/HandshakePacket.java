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

/**
 * The packet to communicate a first handshake. There are no data to be communicated.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class HandshakePacket extends AbstractPacket {

	@Override
	public void readContent(DataInputStream in) {
	}

	@Override
	public void writeContent(DataOutputStream out) {
	}

}
