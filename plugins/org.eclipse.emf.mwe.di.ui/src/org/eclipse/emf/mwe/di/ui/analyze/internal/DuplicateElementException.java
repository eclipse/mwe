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
 * @version $Revision: 1.3 $
 */

@SuppressWarnings("serial")
public class DuplicateElementException extends RuntimeException {

	private EObject context;

	public DuplicateElementException() {
		super();
	}

	public DuplicateElementException(final String message) {
		super(message);
	}

	public DuplicateElementException(final String message, final EObject context) {
		super(message);
		this.context = context;
	}

	public DuplicateElementException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DuplicateElementException(final Throwable cause) {
		super(cause);
	}

	public EObject getContext() {
		return context;
	}
}
