/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.factories;

public class FactoryNotInitializedException extends RuntimeException {

	public FactoryNotInitializedException() {
		super();
	}

	public FactoryNotInitializedException(final String message) {
		super(message);
	}

	public FactoryNotInitializedException(final String message,
			final Throwable cause) {
		super(message, cause);
	}

	public FactoryNotInitializedException(final Throwable cause) {
		super(cause);
	}

}
