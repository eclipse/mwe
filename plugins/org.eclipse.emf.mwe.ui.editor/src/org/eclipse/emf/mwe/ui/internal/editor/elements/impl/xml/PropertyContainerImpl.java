/********************s***********************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.13 $
 */

public class PropertyContainerImpl implements IPropertyContainer {

	private final Map<String, Property> propertyDefinitions = new HashMap<String, Property>();

	private final Map<String, Property> propertyReferences = new HashMap<String, Property>();

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#addProperties(java.util.Collection)
	 */
	public void addProperties(final Collection<Property> collection) {
		if (collection == null)
			throw new IllegalArgumentException();

		for (final Property p : collection) {
			addProperty(p);
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#addProperties(org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer)
	 */
	public void addProperties(final IPropertyContainer container) {
		if (container == null)
			throw new IllegalArgumentException();

		addProperties(container.getProperties());
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#addProperty(org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.Property)
	 */
	public void addProperty(final Property property) {
		if (property == null)
			throw new IllegalArgumentException();

		if (property.isValueReference()) {
			propertyReferences.put(property.getName(), property);
		}
		else {
			propertyDefinitions.put(property.getName(), property);
		}

	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#clear()
	 */
	public void clear() {
		propertyDefinitions.clear();
		propertyReferences.clear();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getFileReferenceProperties()
	 */
	public Collection<Property> getFileReferenceProperties() {
		final List<Property> result = new ArrayList<Property>();
		for (final Property p : propertyDefinitions.values()) {
			if (p.isFileReference()) {
				result.add(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getFileReferencePropertyNames()
	 */
	public Set<String> getFileReferencePropertyNames() {
		final Set<String> result = new HashSet<String>();
		for (final Property p : propertyDefinitions.values()) {
			if (p.isFileReference()) {
				result.add(p.getName());
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getImportedProperties()
	 */
	public IPropertyContainer getImportedProperties() {
		final IPropertyContainer result = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		for (final Property p : getProperties()) {
			if (p.isImported()) {
				result.addProperty(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getLocalProperties()
	 */
	public IPropertyContainer getLocalProperties() {
		final IPropertyContainer result = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		for (final Property p : getProperties()) {
			if (!p.isImported()) {
				result.addProperty(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperties()
	 */
	public Collection<Property> getProperties() {
		final Collection<Property> result = new HashSet<Property>();
		result.addAll(propertyDefinitions.values());
		result.addAll(propertyReferences.values());
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperty(java.lang.String)
	 */
	public Property getProperty(final String name) {
		if (propertyDefinitions.containsKey(name))
			return propertyDefinitions.get(name);

		return propertyReferences.get(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyCount()
	 */
	public int getPropertyCount() {
		return propertyDefinitions.size() + propertyReferences.size();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyNames()
	 */
	public Set<String> getPropertyNames() {
		final Set<String> result = new HashSet<String>();
		for (final Property p : getProperties()) {
			result.add(p.getName());
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getPropertyValueReferences()
	 */
	public IPropertyContainer getPropertyValueReferences() {
		final IPropertyContainer result = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		for (final Property p : propertyReferences.values()) {
			if (p.isValueReference()) {
				result.addProperty(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValueProperties()
	 */
	public Collection<Property> getSimpleValueProperties() {
		final List<Property> result = new ArrayList<Property>();
		for (final Property p : propertyDefinitions.values()) {
			if (p.isSimple()) {
				result.add(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValuePropertyNames()
	 */
	public Set<String> getSimpleValuePropertyNames() {
		final Set<String> result = new HashSet<String>();
		for (final Property p : propertyDefinitions.values()) {
			if (p.isSimple()) {
				result.add(p.getName());
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getUnresolvedReferencePropertyNames()
	 */
	public Set<String> getUnresolvedReferencePropertyNames() {
		final Set<String> result = new HashSet<String>();
		final Set<String> importedRefNames = getImportedProperties().getValueReferencePropertyNames();
		for (final String name : importedRefNames) {
			if (!hasSimpleValueProperty(name)) {
				result.add(name);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getValueReferencePropertyNames()
	 */
	public Set<String> getValueReferencePropertyNames() {
		return propertyReferences.keySet();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasFileReferenceProperty(java.lang.String)
	 */
	public boolean hasFileReferenceProperty(final String name) {
		if (name == null)
			return false;

		for (final Property p : propertyDefinitions.values()) {
			if (p.isFileReference() && name.equals(p.getName()))
				return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperty(java.lang.String)
	 */
	public boolean hasProperty(final String name) {
		final Map<String, Property> result = new HashMap<String, Property>();
		result.putAll(propertyDefinitions);
		result.putAll(propertyReferences);
		return result.containsKey(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasSimpleValueProperty(java.lang.String)
	 */
	public boolean hasSimpleValueProperty(final String name) {
		if (name == null)
			return false;

		for (final Property p : propertyDefinitions.values()) {
			if (p.isSimple() && name.equals(p.getName()))
				return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#hasUnresolvedReferenceProperties()
	 */
	public boolean hasUnresolvedReferenceProperties() {
		return !getUnresolvedReferencePropertyNames().isEmpty();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#hasValueReferenceProperty(java.lang.String)
	 */
	public boolean hasValueReferenceProperty(final String name) {
		return propertyReferences.containsKey(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#isPropertyContainerEmpty()
	 */
	public boolean isPropertyContainerEmpty() {
		return getPropertyCount() == 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#isResolved(java.lang.String)
	 */
	public boolean isResolved(final String name) {
		if (!hasSimpleValueProperty(name))
			throw new IllegalArgumentException("'" + name + "' is not a simple value property");

		return hasValueReferenceProperty(name);
	}
}
