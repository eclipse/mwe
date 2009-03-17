/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import java.util.List;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public interface IAttributeContainer {

	/**
	 * Adds an attribute to the current element.
	 * 
	 * @param attribute
	 *            attribute added to current element
	 */
	void addAttribute(final IWorkflowAttribute attribute);

	/**
	 * Deletes all attributes and children of the current element.
	 */
	void clear();

	/**
	 * Returns the specified attribute of the current element.
	 * 
	 * @param name
	 *            name of the requested attribute
	 * @return the requested attribute or <code>null</code>, if no attribute
	 *         with the specified name is found
	 */
	IWorkflowAttribute getAttribute(final String name);

	/**
	 * Number of attributes of the current element.
	 * 
	 * @return number of attributes
	 */
	int getAttributeCount();

	/**
	 * Returns a list containing all attribute elements. Please notice that the
	 * order of attributes within the collection does not necessarily match the
	 * order in which the attributes were defined.
	 * 
	 * @return list of attribute elements
	 */
	List<IWorkflowAttribute> getAttributeList();

	/**
	 * Returns the value of an attribute of the current element.
	 * 
	 * @param name
	 *            local name of attribute
	 * @return value of attribute or <code>null</code>, if no attribute with the
	 *         specified name is found
	 */
	String getAttributeValue(final String name);

	/**
	 * Checks if the current element has a certain attribute.
	 * 
	 * @param name
	 *            name of attribute
	 * @return <code>true</code> if the current element has an attribute named
	 *         <code>name</code>, otherwise <code>false</code>
	 */
	boolean hasAttribute(final String name);

	/**
	 * Checks if the current element has any attributes attached.
	 * 
	 * @return <code>true</code> if current elements has attributes, otherwise
	 *         <code>false</code>
	 */
	boolean hasAttributes();
}
