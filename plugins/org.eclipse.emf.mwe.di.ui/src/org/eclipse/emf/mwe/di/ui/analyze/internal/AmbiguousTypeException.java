/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

@SuppressWarnings("serial")
public class AmbiguousTypeException extends RuntimeException {

	private EObject context;

	public AmbiguousTypeException() {
		super();
	}

	public AmbiguousTypeException(final String message) {
		super(message);
	}

	public AmbiguousTypeException(final String message, final EObject context) {
		super(message);
		this.context = context;
	}

	public AmbiguousTypeException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public AmbiguousTypeException(final Throwable cause) {
		super(cause);
	}

	public EObject getContext() {
		return context;
	}
}
