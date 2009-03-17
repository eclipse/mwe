/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.elements;

public interface IWorkflowAttribute extends IRangeCheck {

	/**
	 * Returns the position range of the whole attribute.
	 * 
	 * @return position range of attribute.
	 */
	ElementPositionRange getAttributeRange();

	/**
	 * Returns the position range of the attribute value.
	 * 
	 * @return position range of attribute value.
	 */
	ElementPositionRange getAttributeValueRange();

	/**
	 * Returns the value of field <code>element</code>.
	 * 
	 * @return value of <code>element</code>.
	 */
	IWorkflowElement getElement();

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	String getName();

	/**
	 * Returns the value of field <code>value</code>.
	 * 
	 * @return value of <code>value</code>.
	 */
	String getValue();
}