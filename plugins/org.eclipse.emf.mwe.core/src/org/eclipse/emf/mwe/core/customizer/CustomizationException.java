/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.core.customizer;

public class CustomizationException extends RuntimeException {

	private static final long serialVersionUID = 4677510940769015447L;

	public CustomizationException() {
		super();
	}

	public CustomizationException(final String message) {
		super(message);
	}

}
