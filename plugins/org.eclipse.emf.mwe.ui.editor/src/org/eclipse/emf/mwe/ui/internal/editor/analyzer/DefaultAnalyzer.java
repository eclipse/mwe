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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.SettableCheckResult;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.62 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

	protected static final String MAPPING_ERROR_MSG = "Could not determine a class mapping for element";

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

		if (element.hasUnresolvedReferenceProperties()) {
			final Set<String> propertyNames = element.getUnresolvedReferencePropertyNames();
			for (final String name : propertyNames) {
				createMarker(element, "Missing definition for property '" + name + "'", false);
			}
		}
		final AbstractWorkflowElement parent = element.getParent();
		final IType parentType = parent.getMappedClassType();
		final IType elementType = element.getMappedClassType();
		if (elementType == null) {
			createMarker(element, "Element '" + element.getName() + "' could not be mapped");
			return;
		}

		if (parentType != null) {
			final SettableCheckResult result = TypeUtils.isSettable(getProject(), element, parentType);
			if (!result.isSettableFound()) {
				createMarker(element, "No setter for '" + result.getName() + "' available in class '"
						+ result.getType().getElementName() + "'");
				return;
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

		if (IWorkflowAttribute.ID_REF_ATTRIBUTE.equals(attribute.getName()))
			return;

		if (IWorkflowAttribute.CLASS_ATTRIBUTE.equals(attribute.getName())) {
			checkClassAttribute(attribute);
		}
		else if (IWorkflowAttribute.FILE_ATTRIBUTE.equals(attribute.getName())) {
			checkFileAttribute(attribute);
		}
		else if (IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE.equals(attribute.getName())) {
			final String value = attribute.getValue();
			if (!TypeUtils.isBooleanValue(value)) {
				createMarkerForValue(attribute, "Boolean value required");
			}
		}
		else {
			IType referenceType = mappedType;
			if (element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
				referenceType = TypeUtils.findType(getProject(), element
						.getAttributeValue(IWorkflowAttribute.CLASS_ATTRIBUTE));
			}
			final SettableCheckResult result = TypeUtils.isSettable(getProject(), attribute, referenceType);
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
		final Matcher m = IWorkflowAttribute.PROPERTY_REFERENCE_PATTERN.matcher(attrValue);
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

		final Set<IType> superTypes = TypeUtils.getSuperTypes(getProject(), type);
		for (final IType t : superTypes) {
			final String fqn = t.getFullyQualifiedName();
			if (rootClassName.equals(fqn))
				return true;
		}
		return false;
	}

	protected boolean isPropertyReference(final IWorkflowAttribute attribute) {
		final Matcher m = IWorkflowAttribute.PROPERTY_REFERENCE_PATTERN.matcher(attribute.getValue());
		return m.matches();
	}

	private void checkFileAttribute(final IWorkflowAttribute attribute) {
		final String content = TypeUtils.getFileContent(getProject(), attribute.getValue());
		if (content == null) {
			createMarkerForValue(attribute, "Could not load file '" + attribute.getValue() + "'");
		}
	}
}
