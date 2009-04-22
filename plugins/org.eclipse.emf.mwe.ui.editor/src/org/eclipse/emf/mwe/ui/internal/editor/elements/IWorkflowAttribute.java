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

import java.util.regex.Pattern;

public interface IWorkflowAttribute extends IRangeCheck {

	String FILE_ATTRIBUTE = "file";

	String VALUE_ATTRIBUTE = "value";

	String NAME_ATTRIBUTE = "name";

	String CLASS_ATTRIBUTE = "class";

	String ID_ATTRIBUTE = "id";

	String ID_REF_ATTRIBUTE = "idRef";

	String INHERIT_ALL_ATTRIBUTE = "inheritAll";

	Pattern PROPERTY_REFERENCE_PATTERN = Pattern.compile("\\$\\{([a-zA-Z0-9._\\-]+)\\}");

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
	AbstractWorkflowElement getElement();

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	String getName();

	/**
	 * Returns the name of the property reference, if any exists.
	 * 
	 * @return name of property reference or <code>null</code> if attribute
	 *         holds no property reference
	 */
	String getPropertyReferenceName();

	/**
	 * Returns the value of field <code>value</code>.
	 * 
	 * @return value of <code>value</code>.
	 */
	String getValue();

	/**
	 * Checks if current attribute contains a property reference.
	 * 
	 * @return <code>true</code> if current attribute contains a property
	 *         reference, otherwise <code>false</code>
	 */
	boolean hasPropertyReference();

	/**
	 * Checks if current attribute contains a resolved property reference.
	 * 
	 * @return <code>true</code> if current attribute contains a resolved
	 *         property reference, otherwise <code>false</code>
	 */
	boolean hasResolvedPropertyReference();

	/**
	 * Sets the workflow element that the current attribute is attached to.
	 * 
	 * @param element
	 *            the element
	 */
	void setElement(AbstractWorkflowElement element);
}