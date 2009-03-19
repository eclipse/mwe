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
import java.util.Set;

public interface IPropertyContainerAccess {

	/**
	 * Disables property inheritance.
	 */
	void disablePropertyInheritance();

	/**
	 * Enables property inheritance.
	 */
	void enablePropertyInheritance();

	/**
	 * Returns a set containing all properties in the container.
	 * 
	 * @return set containing all properties in the container or an empty
	 *         collection if no property exists
	 */
	Collection<Property> getProperties();

	/**
	 * Returns the property named <code>name</code>.
	 * 
	 * @param name
	 *            the name of the requested property
	 * @return the property named <code>name</code> or <code>null</code> if no
	 *         such property exists
	 */
	Property getProperty(String name);

	/**
	 * Returns the number of properties in the container.
	 * 
	 * @return number of properties in the container
	 */
	int getPropertyCount();

	/**
	 * Returns a set containing the names of all properties in the container.
	 * 
	 * @return set containing the names of all properties in the container or an
	 *         empty set if no property exists
	 */
	Set<String> getPropertyNames();

	/**
	 * Returns a collection containing all reference properties in the
	 * container.
	 * 
	 * @return collection containing all reference properties in the container
	 *         or an empty collection if no such property exists
	 */
	Collection<Property> getReferenceProperties();

	/**
	 * Returns a set containing the names of all reference properties in the
	 * container.
	 * 
	 * @return set containing the names of all reference properties in the
	 *         container or an empty set if no such property exists
	 */
	Set<String> getReferencePropertyNames();

	/**
	 * Returns a collection containing all simple value properties in the
	 * container.
	 * 
	 * @return collection containing all simple value properties in the
	 *         container or an empty collection if no such property exists
	 */
	Collection<Property> getSimpleValueProperties();

	/**
	 * Returns a set containing the names of all simple value properties in the
	 * container.
	 * 
	 * @return set containing the names of all simple value properties in the
	 *         container or an empty set if no such property exists
	 */
	Set<String> getSimpleValuePropertyNames();

	/**
	 * Checks if the container holds any properties?
	 * 
	 * @return <code>true</code> if the container holds any properties,
	 *         otherwise <code>false</code>
	 */
	boolean hasProperties();

	/**
	 * Checks if the container has a property with the name <code>name</code>.
	 * 
	 * @param name
	 *            name of property
	 * @return <code>true</code> if the container holds a property
	 *         <code>name</code>, otherwise <code>false</code>
	 */
	boolean hasProperty(String name);

	/**
	 * Checks if the container has a reference property with the name
	 * <code>name</code>.
	 * 
	 * @param name
	 *            name of property
	 * @return <code>true</code> if the container holds a reference property
	 *         <code>name</code>, otherwise <code>false</code>
	 */
	boolean hasReferenceProperty(String name);

	/**
	 * Checks if the container has a simple value property with the name
	 * <code>name</code>.
	 * 
	 * @param name
	 *            name of property
	 * @return <code>true</code> if the container holds a simple value property
	 *         <code>name</code>, otherwise <code>false</code>
	 */
	boolean hasSimpleValueProperty(String name);

	/**
	 * Checks if property container is empty.
	 * 
	 * @return <code>true</code> if property container is empty, otherwise
	 *         <code>false</code>
	 */
	boolean isEmpty();

	/**
	 * Checks if property inheritance is enabled.
	 * 
	 * @return <code>true</code> if property inheritance is enabled, otherwise
	 *         <code>false</code>
	 */
	boolean isPropertyInheritanceEnabled();
}
