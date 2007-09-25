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
package org.eclipse.emf.mwe.internal.core.debug.model;

/**
 * name / value utility class
 */
public class NameValuePair {
	public String name;

	public Object value;

	public NameValuePair(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return name + " = " + value.toString();
	}

}
