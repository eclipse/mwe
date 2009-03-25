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
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.43 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

	private class SettableResult {

		private final boolean settableFound;

		private final String name;

		private final IType type;

		public SettableResult(final boolean settableFound, final String name, final IType type) {
			if (name == null || type == null)
				throw new IllegalArgumentException();

			this.settableFound = settableFound;
			this.name = name;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public IType getType() {
			return type;
		}

		public boolean isSettableFound() {
			return settableFound;
		}
	}

	protected static final String MAPPING_ERROR_MSG = "Could not determine a class mapping for element";

	protected static final String CLASS_ATTRIBUTE = "class";

	protected static final String INHERIT_ALL_ATTRIBUTE = "inheritAll";

	protected static final String FILE_ATTRIBUTE = "file";

	static final String PROPERTY_REF_REGEX = "\\$\\{(.*?)\\}";

	protected final IFile file;

	protected final IDocument document;

	public DefaultAnalyzer(final IFile file, final IDocument document) {
		if (file == null || document == null)
			throw new IllegalArgumentException();

		this.file = file;
		this.document = document;
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.IElementAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public void checkValidity(final AbstractWorkflowElement element) {
		if (!element.hasParent())
			return;

		final AbstractWorkflowElement parent = element.getParent();
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
				for (final IWorkflowAttribute attr : element.getAttributeList()) {
					if (CLASS_ATTRIBUTE.equals(attr.getName()) || FILE_ATTRIBUTE.equals(attr.getName())
							|| INHERIT_ALL_ATTRIBUTE.equals(attr.getName())) {
						continue;
					}

					createMarker(attr, "Invalid attribute: " + attr.getName());
				}
			}
		}
		final SettableResult result = isSettable(element, parentType);
		if (!result.isSettableFound()) {
			createMarker(element, "No field '" + result.getName() + "' available in class '"
					+ result.getType().getElementName() + "'");
			return;
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

	protected void checkAttribute(final IType mappedType, final AbstractWorkflowElement element,
			final IWorkflowAttribute attribute) {
		if (mappedType == null || element == null || attribute == null)
			throw new IllegalArgumentException();

		final SettableResult result = isSettable(attribute, mappedType);
		if (!result.isSettableFound()) {
			createMarker(element, "No field '" + result.getName() + "' available in class '"
					+ result.getType().getElementName() + "'");
			return;
		}

		if (isPropertyReference(attribute)) {
			checkPropertyReference(element, attribute);
		}
	}

	protected void checkAttributes(final AbstractWorkflowElement element, final IType mappedType) {
		for (final IWorkflowAttribute attr : element.getAttributeList()) {
			if (!attr.getName().equals(IWorkflowAttribute.CLASS_ATTRIBUTE)
					&& !attr.getName().equals(IWorkflowAttribute.VALUE_ATTRIBUTE)) {
				checkAttribute(mappedType, element, attr);
			}
		}
	}

	protected void checkPropertyReference(final AbstractWorkflowElement element, final IWorkflowAttribute attribute) {
		final String attrValue = attribute.getValue();
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attrValue);
		while (m.find()) {
			final String value = m.group(1);
			if (!element.hasProperty(value)) {
				createMarker(attribute, "Undefined property reference '" + value + "'");
			}
		}
	}

	protected IType computeComponentType(final AbstractWorkflowElement element) {
		final IType type = element.getMappedClassType();
		return type;
	}

	protected void createMarker(final AbstractWorkflowElement element, final String message) {
		MarkerManager.createMarker(getFile(), getDocument(), element, message, true);
	}

	protected void createMarker(final IWorkflowAttribute attribute, final String message) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, false, true);
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

	private SettableResult isSettable(final AbstractWorkflowElement element, final IType mappedType) {
		final String type = TypeUtils.WILDCARD;
		final String name = element.getName();
		return internalIsSettable(element, mappedType, name, type);
	}

	private SettableResult isSettable(final IWorkflowAttribute attribute, final IType mappedType) {
		final AbstractWorkflowElement element = attribute.getElement();
		final String type = TypeUtils.computeAttributeType(attribute);
		final String name = attribute.getName();
		return internalIsSettable(element, mappedType, name, type);
	}

	private SettableResult internalIsSettable(final AbstractWorkflowElement element, final IType mappedType,
			final String tagName, final String type) {
		IMethod method = TypeUtils.getSetter(getFile(), mappedType, tagName, type);
		IType mt = null;

		if (method == null) {
			mt = TypeUtils.getSetterParameter(getFile(), element, mappedType);
			if (mt == null) {
				mt = mappedType;
			}
			else {
				method = TypeUtils.getSetter(getFile(), mt, tagName, type);
			}
		}
		if (method == null && element.hasParent()) {
			mt = TypeUtils.getSetterParameter(getFile(), element.getParent(), mappedType);
			if (mt != null) {
				final String name = element.getName();
				method = TypeUtils.getSetter(getFile(), mt, name, type);
				if (method == null) {
					method = TypeUtils.getSetter(getFile(), mt, name, TypeUtils.WILDCARD);
				}
			}
		}
		if (mt == null) {
			mt = mappedType;
		}

		final boolean hasProperty = (element.hasParent()) ? element.getParent().hasProperty(tagName) : false;
		final boolean result = (method != null) || hasProperty;
		return new SettableResult(result, tagName, mt);
	}
}
