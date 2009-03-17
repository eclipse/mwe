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
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.utils.PackageShortcutResolver;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.25 $
 */
public class ComponentAnalyzer extends DefaultAnalyzer {

	protected static final String ABSTRACT_ATTRIBUTE = "abstract";

	protected static final String FILE_AND_CLASS_MSG = "A component cannot have a 'class' and a 'file' attribute at the same time";

	private boolean workflowAbstract;

	public ComponentAnalyzer(final IFile file, final IDocument document, final PropertyStore propertyStore) {
		super(file, document, propertyStore);
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	public void checkValidity(final AbstractWorkflowElement element) {
		workflowAbstract = isWorkflowAbstract(element);

		if (element.hasAttribute(AbstractWorkflowElement.CLASS_ATTRIBUTE)
				&& element.hasAttribute(AbstractWorkflowElement.FILE_ATTRIBUTE)) {
			createMarker(element, FILE_AND_CLASS_MSG);
		}
		else if (element.hasAttribute(AbstractWorkflowElement.CLASS_ATTRIBUTE)) {
			final String className = element.getAttributeValue(AbstractWorkflowElement.CLASS_ATTRIBUTE);
			final String resolvedClassName = PackageShortcutResolver.resolve(className);
			final IType mappedType = getType(resolvedClassName);
			if (mappedType != null) {
				checkAttributes(element, mappedType);
			}
			else {
				createMarker(element, "Class '" + className + "' cannot be resolved");
				return;
			}
			if (element.hasAttribute(INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr = element.getAttribute(INHERIT_ALL_ATTRIBUTE);
				createMarkerForValue(inheritAttr, "Attribute '" + INHERIT_ALL_ATTRIBUTE
						+ "' is not allowed, if a 'class' attribute is specified");
			}
		}
		else if (element.hasAttribute(AbstractWorkflowElement.FILE_ATTRIBUTE)) {
			if (element.hasAttribute(INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr = element.getAttribute(INHERIT_ALL_ATTRIBUTE);
				final String valType = TypeUtils.getValueType(inheritAttr.getValue());
				if (!"Boolean".equals(valType)) {
					createMarkerForValue(inheritAttr, "Attribute '" + INHERIT_ALL_ATTRIBUTE
							+ "' must have a boolean value");
				}
			}
		}
		else {
			createMarker(element, "A component must either have a 'class' or a 'file' attribute");
		}
	}

	/**
	 * This method overrides the implementation of <code>checkAttribute</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttribute(IType,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.XMLWorkflowAttributeImpl)
	 */
	@Override
	protected void checkAttribute(final IType mappedType, final AbstractWorkflowElement element,
			final IWorkflowAttribute attribute) {
		if (mappedType == null || element == null || attribute == null)
			throw new IllegalArgumentException();

		final String name = attribute.getName();
		final String value = attribute.getValue();

		if (name.equals(AbstractWorkflowElement.CLASS_ATTRIBUTE) || name.equals(AbstractWorkflowElement.ID_ATTRIBUTE)
				|| name.equals(AbstractWorkflowElement.ID_REF_ATTRIBUTE))
			return;

		final String attrType = TypeUtils.getValueType(value);
		final IMethod method = TypeUtils.getSetter(getFile(), mappedType, name, attrType);
		if (method == null) {
			createMarker(attribute, "No attribute '" + name + "' in class '" + mappedType.getFullyQualifiedName() + "'");
		}
	}

	protected void checkAttribute(final IWorkflowAttribute attribute, final String filePath, final String content) {
		if (attribute == null || filePath == null || content == null)
			throw new IllegalArgumentException();

		final String regex = createSubstitutorPattern(attribute.getName());
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(content);
		if (!workflowAbstract && !matcher.matches()) {
			createMarker(attribute, "File '" + filePath + "' does not contain an argument '" + attribute.getName()
					+ "'");
		}

	}

	/**
	 * This method overrides the implementation of <code>checkAttributes</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttributes(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl,
	 *      IType)
	 */
	@Override
	protected void checkAttributes(final AbstractWorkflowElement element, final IType mappedType) {
		for (int i = 0; i < element.getAttributeCount(); i++) {
			for (final IWorkflowAttribute attr : element.getAttributeList()) {
				checkAttribute(mappedType, element, attr);
			}
		}
	}

	protected void checkAttributes(final AbstractWorkflowElement element, final String filePath, final String content) {
		if (element == null || filePath == null || content == null)
			throw new IllegalArgumentException();

		for (final IWorkflowAttribute attr : element.getAttributeList()) {
			checkAttribute(attr, filePath, content);
		}
	}

	protected String createSubstitutorPattern(final String name) {
		return "\\$\\{" + name + "\\}";
	}

	protected boolean isWorkflowAbstract(final AbstractWorkflowElement element) {
		boolean res = false;
		AbstractWorkflowElement e = element;

		while (e.hasParent() && !e.getName().equals(AbstractWorkflowElement.WORKFLOW_TAG)) {
			e = e.getParent();
		}

		if (e.getName().equals(AbstractWorkflowElement.WORKFLOW_TAG) && e.hasAttribute(ABSTRACT_ATTRIBUTE)
				&& e.getAttributeValue(ABSTRACT_ATTRIBUTE).equalsIgnoreCase(TypeUtils.TRUE_VALUE)) {
			res = true;
		}
		return res;
	}
}
