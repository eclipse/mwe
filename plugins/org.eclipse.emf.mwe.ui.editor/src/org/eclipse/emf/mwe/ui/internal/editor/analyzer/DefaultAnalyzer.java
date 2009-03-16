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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.38 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

	protected static final String MAPPING_ERROR_MSG = "Could not determine a class mapping for element";

	protected static final String CLASS_ATTRIBUTE = "class";

	protected static final String INHERIT_ALL_ATTRIBUTE = "inheritAll";

	protected static final String FILE_ATTRIBUTE = "file";

	static final String PROPERTY_REF_REGEX = "\\$\\{(.*?)\\}";

	protected final IFile file;

	protected final IDocument document;

	protected PropertyStore propertyStore;

	public DefaultAnalyzer(final IFile file, final IDocument document, final PropertyStore propertyStore) {
		if (file == null || document == null || propertyStore == null)
			throw new IllegalArgumentException();

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
		final IType parentType = parent.getMappedClassType();
		if (parentType == null) {
			createMarker(parent, "Element '" + parent.getName() + "' could not be mapped");
			return;
		}

		if (element.isFragment()) {
			if (!(element.hasAttribute(CLASS_ATTRIBUTE) ^ element.hasAttribute(FILE_ATTRIBUTE))) {
				createMarker(element, "<" + element.getName() + "> needs either a '" + CLASS_ATTRIBUTE + "' or a '"
						+ FILE_ATTRIBUTE + "' attribute.");
				return;
			}

			if (element.getAttributeCount() > 1) {
				for (IWorkflowAttribute attr : element.getAttributeList()) {
					boolean hasErrors = false;
					if (CLASS_ATTRIBUTE.equals(attr.getName()) || FILE_ATTRIBUTE.equals(attr.getName())
							|| INHERIT_ALL_ATTRIBUTE.equals(attr.getName())) {
						continue;
					}

					hasErrors = true;
				}
			}
		}
		checkAttributes(element, parentType);
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

	protected void checkAttribute(final IType mappedType, final IWorkflowElement element,
			final IWorkflowAttribute attribute) {
		if (mappedType == null || element == null || attribute == null)
			throw new IllegalArgumentException();

		if (!IsAllowedFragmentAttribute(attribute)) {
			createMarker(attribute, "Invalid attribute '" + attribute.getName() + "'");
			return;
		}

		final String type = TypeUtils.computeAttributeType(attribute);
		IMethod method = null;
		String name = attribute.getName();
		IType mt = TypeUtils.getSetterParameter(getFile(), element, mappedType);
		if (mt == null) {
			mt = mappedType;
		}
		method = TypeUtils.getSetter(getFile(), mt, name, type);

		if (method == null && element.hasParent()) {
			mt = TypeUtils.getSetterParameter(getFile(), element.getParent(), mappedType);
			if (mt != null) {
				name = element.getName();
				method = TypeUtils.getSetter(getFile(), mt, name, type);
				if (method == null) {
					method = TypeUtils.getSetter(getFile(), mt, name, TypeUtils.WILDCARD);
				}
			}
		}
		if (mt == null) {
			mt = mappedType;
		}

		if (method == null) {
			createMarker(element, "No attribute '" + name + "' available in class '" + mt.getElementName() + "'");
			return;
		}
		if (isPropertyReference(attribute)) {
			checkPropertyReference(attribute);
		}
	}

	protected void checkAttributes(final IWorkflowElement element, final IType mappedType) {
		for (final IWorkflowAttribute attr : element.getAttributeList()) {
			if (!attr.getName().equals(IWorkflowElement.CLASS_ATTRIBUTE)
					&& !attr.getName().equals(IWorkflowElement.VALUE_ATTRIBUTE)) {
				checkAttribute(mappedType, element, attr);
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
				createMarker(attribute, "Undefined property reference '" + value + "'");
			}
		}
	}

	protected IType computeComponentType(final IWorkflowElement element) {
		final IType type = element.getMappedClassType();
		return type;
	}

	protected void createMarker(final IWorkflowAttribute attribute, final String message) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, false, true);
	}

	protected void createMarker(final IWorkflowElement element, final String message) {
		MarkerManager.createMarker(getFile(), getDocument(), element, message, true);
	}

	protected void createMarkerForValue(final IWorkflowAttribute attribute, final String message) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, true, true);
	}

	protected IType getType(final String mappedClassName) {
		return TypeUtils.findType(getFile(), mappedClassName);
	}

	protected boolean isPropertyReference(final IWorkflowAttribute attribute) {
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attribute.getValue());
		return m.matches();
	}

	protected boolean IsAllowedFragmentAttribute(IWorkflowAttribute attribute) {
		if (attribute == null)
			throw new IllegalArgumentException();

		if ((FILE_ATTRIBUTE.equals(attribute.getName()) && !isStringValue(attribute))
				|| (CLASS_ATTRIBUTE.equals(attribute.getName()) && !isStringValue(attribute))
				|| (INHERIT_ALL_ATTRIBUTE.equals(attribute.getName()) && !isBooleanValue(attribute)))
			return false;

		return true;
	}

	private boolean isBooleanValue(IWorkflowAttribute attribute) {
		return TypeUtils.computeAttributeType(attribute).contains("boolean");
	}

	private boolean isStringValue(IWorkflowAttribute attribute) {
		return TypeUtils.computeAttributeType(attribute).contains("String");
	}
}
