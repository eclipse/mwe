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

import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.52 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

	private class SettableCheckResult {

		private final boolean settableFound;

		private final String name;

		private final IType type;

		public SettableCheckResult(final boolean settableFound, final String name, final IType type) {
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
		final IType elementType = element.getMappedClassType();
		if (elementType == null && !parent.isFragment()) {
			createMarker(element, "Element '" + element.getName() + "' could not be mapped");
			return;
		}

		if (parentType != null) {
			if (!element.isFragment()) {
				final SettableCheckResult result = isSettable(element, parentType);
				if (!result.isSettableFound()) {
					createMarker(element, "No setter for '" + result.getName() + "' available in class '"
							+ result.getType().getElementName() + "'");
					return;
				}
			}
			checkAttributes(element, parentType);
		}
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

	public IProject getProject() {
		if (getFile() != null)
			return getFile().getProject();

		return null;
	}

	protected void checkAttribute(final IType mappedType, final AbstractWorkflowElement element,
			final IWorkflowAttribute attribute) {
		if (mappedType == null || element == null || attribute == null)
			throw new IllegalArgumentException();

		if (IWorkflowAttribute.CLASS_ATTRIBUTE.equals(attribute.getName())) {
			checkClassAttribute(attribute);
		}
		else if (IWorkflowAttribute.FILE_ATTRIBUTE.equals(attribute.getName())) {
			checkFileAttribute(attribute);
		}
		else {
			IType referenceType = mappedType;
			if (element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
				referenceType = TypeUtils.findType(getProject(), element
						.getAttributeValue(IWorkflowAttribute.CLASS_ATTRIBUTE));
			}
			final SettableCheckResult result = isSettable(attribute, referenceType);
			if (!result.isSettableFound()) {
				createMarker(attribute, "No attribute '" + result.getName() + "' available in class '"
						+ result.getType().getElementName() + "'");
				return;
			}
		}

		if (isPropertyReference(attribute)) {
			checkPropertyReference(element, attribute);
		}
	}

	protected void checkAttributes(final AbstractWorkflowElement element, final IType mappedType) {
		final List<IWorkflowAttribute> attrList = element.getAttributeList();

		for (final IWorkflowAttribute attr : attrList) {
			final String name = attr.getName();

			if (!name.equals(IWorkflowAttribute.VALUE_ATTRIBUTE)) {
				checkAttribute(mappedType, element, attr);
			}
		}
	}

	protected void checkClassAttribute(final IWorkflowAttribute attribute) {
		final IType type = TypeUtils.findType(getProject(), attribute.getValue());
		if (type == null) {
			createMarkerForValue(attribute, "Class '" + attribute.getValue() + "' could not be resolved");
		}
	}

	protected void checkPropertyReference(final AbstractWorkflowElement element, final IWorkflowAttribute attribute) {
		final String attrValue = attribute.getValue();
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attrValue);
		while (m.find()) {
			final String value = m.group(1);
			if (!element.hasProperty(value)) {
				createMarkerForValue(attribute, "Undefined property reference '" + value + "'");
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

	protected void createMarker(final AbstractWorkflowElement element, final String message, final boolean warning) {
		MarkerManager.createMarker(getFile(), getDocument(), element, message, warning);
	}

	protected void createMarker(final IWorkflowAttribute attribute, final String message) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, false, true);
	}

	protected void createMarker(final IWorkflowAttribute attribute, final String message, final boolean warning) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, false, warning);
	}

	protected void createMarkerForValue(final IWorkflowAttribute attribute, final String message) {
		if (attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		MarkerManager.createMarker(getFile(), getDocument(), attribute, message, true, true);
	}

	protected IType getType(final String mappedClassName) {
		return TypeUtils.findType(getProject(), mappedClassName);
	}

	protected boolean inherits(final IType type, final String rootClassName) {
		if (type == null || rootClassName == null)
			throw new IllegalArgumentException();

		final Set<IType> superTypes = TypeUtils.getSuperTypes(getProject(), type, true);
		for (final IType t : superTypes) {
			final String fqn = t.getFullyQualifiedName();
			if (rootClassName.equals(fqn))
				return true;
		}
		return false;
	}

	protected boolean isPropertyReference(final IWorkflowAttribute attribute) {
		final Pattern p = Pattern.compile(PROPERTY_REF_REGEX);
		final Matcher m = p.matcher(attribute.getValue());
		return m.matches();
	}

	private void checkFileAttribute(final IWorkflowAttribute attribute) {
		final String content = TypeUtils.getFileContent(getProject(), attribute);
		if (content == null) {
			createMarkerForValue(attribute, "Could not load file '" + attribute.getValue() + "'");
		}
	}

	private SettableCheckResult internalIsSettable(final AbstractWorkflowElement element, final IType mappedType,
			final String tagName, final String type) {
		IMethod method = TypeUtils.getSetter(getProject(), mappedType, tagName, type);
		IType mt = null;

		if (method == null) {
			mt = TypeUtils.getSetterParameter(getProject(), element, mappedType);
			if (mt == null) {
				mt = mappedType;
			}
			else {
				method = TypeUtils.getSetter(getProject(), mt, tagName, type);
			}
		}
		if (method == null && element.hasParent()) {
			mt = TypeUtils.getSetterParameter(getProject(), element.getParent(), mappedType);
			if (mt != null) {
				final String name = element.getName();
				method = TypeUtils.getSetter(getProject(), mt, name, type);
				if (method == null) {
					method = TypeUtils.getSetter(getProject(), mt, name, TypeUtils.WILDCARD);
				}
			}
		}
		if (mt == null) {
			mt = mappedType;
		}

		final boolean hasProperty = (element.hasParent()) ? element.getParent().hasProperty(tagName) : false;
		final boolean result = (method != null) || hasProperty;
		return new SettableCheckResult(result, tagName, mt);
	}

	private SettableCheckResult isSettable(final AbstractWorkflowElement element, final IType mappedType) {
		final String type = TypeUtils.WILDCARD;
		final String name = element.getName();
		return internalIsSettable(element, mappedType, name, type);
	}

	private SettableCheckResult isSettable(final IWorkflowAttribute attribute, final IType mappedType) {
		final AbstractWorkflowElement element = attribute.getElement();
		final String type = TypeUtils.computeAttributeType(attribute);
		final String name = attribute.getName();
		return internalIsSettable(element, mappedType, name, type);
	}

}
