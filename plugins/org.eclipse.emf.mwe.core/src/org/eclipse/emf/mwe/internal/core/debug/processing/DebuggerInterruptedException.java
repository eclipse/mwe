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
package org.eclipse.emf.mwe.internal.core.debug.processing;

import java.io.IOException;

/**
 * A RuntimeException that is thrown when an exception is thrown during debugging or if the user terminates the
 * process
 */
public class DebuggerInterruptedException extends RuntimeException {

	private static final long serialVersionUID = 8297242905634686930L;

	public DebuggerInterruptedException(IOException e) {
		super(e);
	}

	public DebuggerInterruptedException(String msg) {
		super(msg);
	}

}
