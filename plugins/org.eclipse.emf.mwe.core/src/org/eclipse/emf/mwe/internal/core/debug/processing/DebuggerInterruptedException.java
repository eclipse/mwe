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
