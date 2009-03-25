/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

public class FragmentAnalyzer extends DefaultAnalyzer {

	public FragmentAnalyzer(final IFile file, final IDocument document) {
		super(file, document);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttribute(org.eclipse.jdt.core.IType,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement,
	 *      org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute)
	 */
	@Override
	protected void checkAttribute(final IType mappedType, final AbstractWorkflowElement element,
			final IWorkflowAttribute attribute) {

		super.checkAttribute(mappedType, element, attribute);
		if (!IsAllowedFragmentAttribute(attribute)) {
			createMarker(attribute, "Invalid attribute '" + attribute.getName() + "'");
			return;
		}

		if (CLASS_ATTRIBUTE.equals(attribute.getName())) {
			final IType type = TypeUtils.findType(getFile(), attribute.getValue());
			if (type == null) {
				createMarker(attribute, "Class '" + attribute.getValue() + "' could not be resolved");
			}
		}
	}

	protected boolean IsAllowedFragmentAttribute(final IWorkflowAttribute attribute) {
		if (attribute == null)
			throw new IllegalArgumentException();

		if ((FILE_ATTRIBUTE.equals(attribute.getName()) && !isStringValue(attribute))
				|| (CLASS_ATTRIBUTE.equals(attribute.getName()) && !isStringValue(attribute))
				|| (INHERIT_ALL_ATTRIBUTE.equals(attribute.getName()) && !isBooleanValue(attribute)))
			return false;

		return true;

	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	@Override
	public void checkValidity(final AbstractWorkflowElement element) {
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

	private boolean isBooleanValue(final IWorkflowAttribute attribute) {
		return TypeUtils.computeAttributeType(attribute).contains("boolean");
	}

	private boolean isStringValue(final IWorkflowAttribute attribute) {
		return TypeUtils.computeAttributeType(attribute).contains("String");
	}
}
