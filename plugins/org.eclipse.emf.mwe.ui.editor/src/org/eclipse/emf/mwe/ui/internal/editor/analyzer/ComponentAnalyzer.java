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
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.utils.PackageShortcutResolver;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.34 $
 */
public class ComponentAnalyzer extends DefaultAnalyzer {

	protected static final String ABSTRACT_ATTRIBUTE = "abstract";

	private static final String WORKFLOW_ROOT_CLASS = "org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent";

	private static final String FRAGMENT_ROOT_INTERFACE = "org.eclipse.xtext.generator.IGeneratorFragment";

	protected static final String FILE_AND_CLASS_MSG = "A component cannot have a 'class' and a 'file' attribute at the same time";

	private boolean workflowAbstract;

	public ComponentAnalyzer(final IFile file, final IDocument document) {
		super(file, document);
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	public void checkValidity(final AbstractWorkflowElement element) {
		super.checkValidity(element);
		workflowAbstract = isWorkflowAbstract(element);

		if (element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)
				&& element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)) {
			createMarker(element, FILE_AND_CLASS_MSG);
		}
		else if (element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
			final String className = element.getAttributeValue(IWorkflowAttribute.CLASS_ATTRIBUTE);
			final String resolvedClassName = PackageShortcutResolver.resolve(className);
			final IType mappedType = getType(resolvedClassName);
			if (mappedType != null) {
				checkAttributes(element, mappedType);
			}

			if (element.hasAttribute(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr = element.getAttribute(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE);
				createMarkerForValue(inheritAttr, "Attribute '" + IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE
						+ "' is not allowed, if a 'class' attribute is specified");
			}
		}
		else if (element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)) {
			if (element.hasAttribute(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr = element.getAttribute(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE);
				final String valType = TypeUtils.getValueType(inheritAttr.getValue());
				if (!"Boolean".equals(valType)) {
					createMarkerForValue(inheritAttr, "Attribute '" + IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE
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

		super.checkAttribute(mappedType, element, attribute);
		final String name = attribute.getName();

		if (name.equals(IWorkflowAttribute.CLASS_ATTRIBUTE) || name.equals(IWorkflowAttribute.ID_ATTRIBUTE)
				|| name.equals(IWorkflowAttribute.ID_REF_ATTRIBUTE))
			return;
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

		while (e.hasParent() && !e.getName().equals(IWorkflowElementTypeInfo.WORKFLOW_TAG)) {
			e = e.getParent();
		}

		if (e.getName().equals(IWorkflowElementTypeInfo.WORKFLOW_TAG) && e.hasAttribute(ABSTRACT_ATTRIBUTE)
				&& e.getAttributeValue(ABSTRACT_ATTRIBUTE).equalsIgnoreCase(TypeUtils.TRUE_VALUE)) {
			res = true;
		}
		return res;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkClassAttribute(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute)
	 */
	@Override
	protected void checkClassAttribute(final IWorkflowAttribute attribute) {
		final IType type = TypeUtils.findType(getFile().getProject(), attribute.getValue());
		if (type == null) {
			createMarkerForValue(attribute, "Class '" + attribute.getValue() + "' could not be resolved");
			return;
		}

		if (!inherits(type, WORKFLOW_ROOT_CLASS) && !inherits(type, FRAGMENT_ROOT_INTERFACE)) {
			createMarkerForValue(attribute, "Class '" + attribute.getValue() + "' is not a valid workflow component");
		}
	}
}
