/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class InconsistentRegistryException extends RuntimeException {

	public InconsistentRegistryException() {
		super();
	}

	public InconsistentRegistryException(final String message) {
		super(message);
	}

	public InconsistentRegistryException(final String message,
			final Throwable cause) {
		super(message, cause);
	}

	public InconsistentRegistryException(final Throwable cause) {
		super(cause);
	}
}
