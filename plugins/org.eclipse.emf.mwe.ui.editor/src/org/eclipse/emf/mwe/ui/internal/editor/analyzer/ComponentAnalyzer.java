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
import org.eclipse.emf.mwe.ui.internal.editor.utils.PackageShortcutResolver;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.17 $
 */
public class ComponentAnalyzer extends DefaultAnalyzer {

	protected static final String INHERIT_ALL_ATTRIBUTE = "inheritAll";

	protected static final String ABSTRACT_ATTRIBUTE = "abstract";

	protected static final String FILE_AND_CLASS_MSG =
			"A component cannot have a 'class' and a 'file' attribute at the same time";

	private boolean workflowAbstract;

	public ComponentAnalyzer(final IFile file, final IDocument document,
			final PropertyStore propertyStore) {
		super(file, document, propertyStore);
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	public void checkValidity(final IWorkflowElement element) {
		workflowAbstract = isWorkflowAbstract(element);

		if (element.hasAttribute(IWorkflowElement.CLASS_ATTRIBUTE)
				&& element.hasAttribute(IWorkflowElement.FILE_ATTRIBUTE)) {
			createMarker(element, FILE_AND_CLASS_MSG);
		} else if (element.hasAttribute(IWorkflowElement.CLASS_ATTRIBUTE)) {
			final String className =
					element.getAttributeValue(IWorkflowElement.CLASS_ATTRIBUTE);
			final String resolvedClassName =
					PackageShortcutResolver.resolve(className);
			final Class<?> mappedClass = getClass(resolvedClassName);
			if (mappedClass != null) {
				checkAttributes(element, mappedClass);
			} else {
				createMarker(element, "Class '" + className
						+ "' cannot be resolved");
				return;
			}
			if (element.hasAttribute(INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr =
						element.getAttribute(INHERIT_ALL_ATTRIBUTE);
				createMarkerForValue(
						inheritAttr,
						"Attribute '"
								+ INHERIT_ALL_ATTRIBUTE
								+ "' is not allowed, if a 'class' attribute is specified");
			}
		} else if (element.hasAttribute(IWorkflowElement.FILE_ATTRIBUTE)) {
			final IWorkflowAttribute attribute =
					element.getAttribute(IWorkflowElement.FILE_ATTRIBUTE);
			final String content =
					ReflectionManager
							.getFileContent(file, document, attribute);
			if (element.hasAttribute(INHERIT_ALL_ATTRIBUTE)) {
				final IWorkflowAttribute inheritAttr =
						element.getAttribute(INHERIT_ALL_ATTRIBUTE);
				if (getValueType(inheritAttr.getValue()) != Boolean.class) {
					createMarkerForValue(inheritAttr, "Attribute '"
							+ INHERIT_ALL_ATTRIBUTE
							+ "' must have a boolean value");
				}
			}
		} else {
			createMarker(element,
					"A component must either have a 'class' or a 'file' attribute");
		}
	}

	/**
	 * This method overrides the implementation of <code>checkAttribute</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttribute(java.lang.Class,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.XMLWorkflowAttributeImpl)
	 */
	@Override
	protected void checkAttribute(final Class<?> mappedClass,
			final IWorkflowElement element, final IWorkflowAttribute attribute) {
		if (mappedClass == null || element == null || attribute == null) {
			throw new IllegalArgumentException();
		}

		final String name = attribute.getName();
		final String value = attribute.getValue();

		if (name.equals(IWorkflowElement.CLASS_ATTRIBUTE)
				|| name.equals(IWorkflowElement.ID_ATTRIBUTE)
				|| name.equals(IWorkflowElement.ID_REF_ATTRIBUTE))
			return;

		final Class<?> attrType = getValueType(value);
		final Method method =
				ReflectionManager.getSetter(mappedClass, name, attrType);
		if (method == null) {
			createMarker(attribute, "No attribute '" + name + "' in class '"
					+ mappedClass.getCanonicalName() + "'");
		}
	}

	protected void checkAttribute(final IWorkflowAttribute attribute,
			final String filePath, final String content) {
		if (attribute == null || filePath == null || content == null) {
			throw new IllegalArgumentException();
		}

		final String regex = createSubstitutorPattern(attribute.getName());
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(content);
		if (!workflowAbstract && !matcher.matches()) {
			createMarker(attribute, "File '" + filePath
					+ "' does not contain an argument '" + attribute.getName()
					+ "'");
		}

	}

	/**
	 * This method overrides the implementation of <code>checkAttributes</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttributes(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl,
	 *      java.lang.Class)
	 */
	@Override
	protected void checkAttributes(final IWorkflowElement element,
			final Class<?> mappedClass) {
		for (int i = 0; i < element.getAttributeCount(); i++) {
			for (final IWorkflowAttribute attr : element.getAttributes()) {
				checkAttribute(mappedClass, element, attr);
			}
		}
	}

	protected void checkAttributes(final IWorkflowElement element,
			final String filePath, final String content) {
		if (element == null || filePath == null || content == null) {
			throw new IllegalArgumentException();
		}

		for (final IWorkflowAttribute attr : element.getAttributes()) {
			checkAttribute(attr, filePath, content);
		}
	}

	protected String createSubstitutorPattern(final String name) {
		return "\\$\\{" + name + "\\}";
	}

	protected boolean isWorkflowAbstract(final IWorkflowElement element) {
		boolean res = false;
		IWorkflowElement e = element;

		while (e.hasParent()
				&& !e.getName().equals(IWorkflowElement.WORKFLOW_TAG)) {
			e = e.getParent();
		}

		if (e.getName().equals(IWorkflowElement.WORKFLOW_TAG)
				&& e.hasAttribute(ABSTRACT_ATTRIBUTE)
				&& e.getAttributeValue(ABSTRACT_ATTRIBUTE).equalsIgnoreCase(
						TRUE_VALUE)) {
			res = true;
		}
		return res;
	}
}
