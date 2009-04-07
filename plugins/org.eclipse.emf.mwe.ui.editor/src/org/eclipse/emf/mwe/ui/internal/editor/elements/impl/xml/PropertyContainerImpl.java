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
 * @version $Revision: 1.9 $
 */

public class PropertyContainerImpl implements IPropertyContainer {

	private final Map<String, Property> properties = new HashMap<String, Property>();

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

		properties.put(property.getName(), property);

	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#clear()
	 */
	public void clear() {
		properties.clear();
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
		return properties.values();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperty(java.lang.String)
	 */
	public Property getProperty(final String name) {
		return properties.get(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyCount()
	 */
	public int getPropertyCount() {
		return properties.size();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyNames()
	 */
	public Set<String> getPropertyNames() {
		final Set<String> result = new HashSet<String>();
		for (final Property p : properties.values()) {
			result.add(p.getName());
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferenceProperties()
	 */
	public Collection<Property> getReferenceProperties() {
		final List<Property> result = new ArrayList<Property>();
		for (final Property p : properties.values()) {
			if (p.isReference()) {
				result.add(p);
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferencePropertyNames()
	 */
	public Set<String> getReferencePropertyNames() {
		final Set<String> result = new HashSet<String>();
		for (final Property p : properties.values()) {
			if (p.isReference()) {
				result.add(p.getName());
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValueProperties()
	 */
	public Collection<Property> getSimpleValueProperties() {
		final List<Property> result = new ArrayList<Property>();
		for (final Property p : properties.values()) {
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
		for (final Property p : properties.values()) {
			if (p.isSimple()) {
				result.add(p.getName());
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperties()
	 */
	public boolean hasProperties() {
		return getPropertyCount() > 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperty(java.lang.String)
	 */
	public boolean hasProperty(final String name) {
		return properties.containsKey(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasReferenceProperty(java.lang.String)
	 */
	public boolean hasReferenceProperty(final String name) {
		for (final Property p : properties.values()) {
			if (p.isReference())
				return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasSimpleProperty(java.lang.String)
	 */
	public boolean hasSimpleProperty(final String name) {
		for (final Property p : properties.values()) {
			if (p.isSimple())
				return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#isEmpty()
	 */
	public boolean isEmpty() {
		return getPropertyCount() == 0;
	}
}
