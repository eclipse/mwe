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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.23 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

	protected static final String MAPPING_ERROR_MSG =
			"Could not determine a class mapping for element";

	protected static final String FALSE_VALUE = "false";

	protected static final String TRUE_VALUE = "true";

	static final String PROPERTY_REF_REGEX = "\\$\\{(.*?)\\}";

	protected final IFile file;

	protected final IDocument document;

	protected PropertyStore propertyStore;

	public DefaultAnalyzer(final IFile file, final IDocument document,
			final PropertyStore propertyStore) {
		if (file == null || document == null || propertyStore == null) {
			throw new IllegalArgumentException();
		}

		this.file = file;
		this.document = document;
		this.propertyStore = propertyStore;
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.IElementAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public void checkValidity(final IWorkflowElement element) {
		if (!element.hasParent())
			return;

		final IWorkflowElement parent = element.getParent();
		final Class<?> parentClass = getMappedClass(parent);
		if (parentClass == null) {
			createMarker(parent, "Element '" + parent.getName()
					+ "' could not be mapped");
			return;
		}
		checkAttributes(element, parentClass);
	}

	/**
	 * Returns the value of field <code>document</code>.
	 * 
	 * @return value of <code>document</code>.
	 */
	public IDocument getDocument() {
		return document;
	}

	/**
	 * Returns the value of field <code>file</code>.
	 * 
	 * @return value of <code>file</code>.
	 */
	public IFile getFile() {
		return file;
	}

	protected void checkAttribute(final Class<?> mappedClass,
			final IWorkflowElement element, final IWorkflowAttribute attribute) {
		if (mappedClass == null || element == null || attribute == null) {
			throw new IllegalArgumentException();
		}

		final Class<?> type = computeAttributeType(attribute);
		final Method method =
				ReflectionManager.getSetter(mappedClass, attribute.getName(),
						type);
		if (method == null) {
			createMarker(element, "No attribute '" + attribute.getName()
					+ "' available in class '" + mappedClass.getSimpleName()
					+ "'");
			return;
		}
		if (isPropertyReference(attribute)) {
			checkPropertyReference(attribute);
		}
	}

	protected void checkAttributes(final IWorkflowElement element,
			final Class<?> mappedClass) {
		for (final IWorkflowAttribute attr : element.getAttributes()) {
			if (!attr.getName().equals(IWorkflowElement.CLASS_ATTRIBUTE)
					&& !attr.getName().equals(IWorkflowElement.VALUE_ATTRIBUTE)) {
				checkAttribute(mappedClass, element, attr);
			}
		}
	}

	protected void checkPropertyReference(final IWorkflowAttribute attribute) {
		final String attrValue = attribute.getValue();
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attrValue);
		while (m.find()) {
			final String value = m.group(1);
			if (!propertyStore.contains(value)) {
				createMarker(attribute, "Undefined property reference '"
						+ value + "'");
			}
		}
	}

	protected Class<?> computeAttributeType(final IWorkflowAttribute attribute) {
		final String value = attribute.getValue();
		return getValueType(value);
	}

	protected Class<?> computeComponentType(final IWorkflowElement element) {
		final Class<?> clazz = getMappedClass(element);
		return clazz;
	}

	protected void createMarker(final IWorkflowAttribute attribute,
			final String message) {
		if (attribute == null || message == null || message.length() == 0) {
			throw new IllegalArgumentException();
		}

		MarkerManager.createMarker(getFile(), getDocument(), attribute,
				message, true, true);
	}

	protected void createMarker(final IWorkflowElement element,
			final String message) {
		MarkerManager.createMarker(getFile(), getDocument(), element, message,
				true);
	}

	protected void createMarkerForValue(final IWorkflowAttribute attribute,
			final String message) {
		if (attribute == null || message == null || message.length() == 0) {
			throw new IllegalArgumentException();
		}

		MarkerManager.createMarker(getFile(), getDocument(), attribute,
				message, true, true);
	}

	protected Class<?> getClass(final String mappedClassName) {
		return ReflectionManager.getClass(getFile(), mappedClassName);
	}

	protected Class<?> getMappedClass(final IWorkflowElement element) {
		Class<?> clazz = null;
		final String name = element.getName();

		clazz = getClass(name);

		if (clazz == null
				&& !name.equalsIgnoreCase(ReflectionManager.COMPONENT_SUFFIX)) {
			clazz = getClass(ReflectionManager.getComponentName(name, false));
		}

		if (clazz == null
				&& !name.equalsIgnoreCase(ReflectionManager.COMPONENT_SUFFIX)) {
			clazz = getClass(ReflectionManager.getComponentName(name, true));
		}

		if (clazz == null) {
			clazz = element.getDefaultClass();
		}

		if (clazz == null) {
			createMarker(element, "Class '" + name + "' cannot be resolved");
		}
		return clazz;
	}

	protected Class<?> getValueType(final String value) {
		if (value == null)
			return null;

		Class<?> type = null;
		if (isBooleanValue(value)) {
			type = Boolean.class;
		} else {
			type = String.class;
		}
		return type;
	}

	protected boolean isBooleanValue(final String value) {
		return value.equalsIgnoreCase(TRUE_VALUE)
				^ value.equalsIgnoreCase(FALSE_VALUE);
	}

	protected boolean isPropertyReference(final IWorkflowAttribute attribute) {
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attribute.getValue());
		return m.matches();
	}
}
