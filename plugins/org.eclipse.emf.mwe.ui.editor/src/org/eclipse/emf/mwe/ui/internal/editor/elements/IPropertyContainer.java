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

import java.util.Collection;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public interface IPropertyContainer extends IPropertyContainerAccess {

	/**
	 * Adds all properties in a collection to the container.
	 * 
	 * @param collection
	 *            the collection of properties to add
	 */
	void addProperties(Collection<Property> collection);

	/**
	 * Adds all properties from another container to the current container.
	 * 
	 * @param container
	 *            the container to add
	 */
	void addProperties(IPropertyContainer container);

	/**
	 * Adds a property to the container.
	 * 
	 * @param property
	 *            the property to add.
	 */
	void addProperty(Property property);

	/**
	 * Removes all properties from the container.
	 */
	void clear();
}