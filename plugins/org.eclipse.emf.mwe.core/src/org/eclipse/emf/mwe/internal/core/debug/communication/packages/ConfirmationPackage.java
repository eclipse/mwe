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
import java.io.IOException;

/**
 * The packet to communicate the confirmation of a specific packet reference id.
 */
public class ConfirmationPackage extends AbstractPackage {

	// -------------------------------------------------------------------------

	public ConfirmationPackage(final int packId) {
		refId = packId;
	}

	// -------------------------------------------------------------------------

	@Override
	public void readContent(final DataInputStream in) throws IOException {
		refId = in.readInt();
	}

	@Override
	public void writeContent(final DataOutputStream out) throws IOException {
		out.writeInt(refId);
	}

}
