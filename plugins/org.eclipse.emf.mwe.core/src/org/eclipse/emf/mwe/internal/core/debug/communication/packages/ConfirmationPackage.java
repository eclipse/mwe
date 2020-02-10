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
