/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("serial")
public class MweInstantiationException extends RuntimeException {

	private EObject element;

	public MweInstantiationException(String string, EObject object) {
		super(string);
		this.element = object;
	}
	
	public EObject getElement() {
		return element;
	}

}
