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

/**
 * The packet to communicate a first handshake. There are no data to be communicated.
 */
public class HandshakePackage extends AbstractPackage {

	@Override
	public void readContent(final DataInputStream in) {
	}

	@Override
	public void writeContent(final DataOutputStream out) {
	}

}
