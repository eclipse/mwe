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

	private static final String FRAGMENT_ROOT_INTERFACE = "org.eclipse.xtext.generator.IGeneratorFragment";

	public FragmentAnalyzer(final IFile file, final IDocument document) {
		super(file, document);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	@Override
	public void checkValidity(final AbstractWorkflowElement element) {
		super.checkValidity(element);
		checkFragmentValidity(element);
	}

	private void checkFragmentValidity(final AbstractWorkflowElement element) {
		if (!(element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE) ^ element
				.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE))) {
			createMarker(element, "<" + element.getName() + "> needs either a '" + IWorkflowAttribute.CLASS_ATTRIBUTE
					+ "' or a '" + IWorkflowAttribute.FILE_ATTRIBUTE + "' attribute.");
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkClassAttribute(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute)
	 */
	@Override
	protected void checkClassAttribute(final IWorkflowAttribute attribute) {
		final IType type = TypeUtils.findType(getFile().getProject(), attribute.getValue());
		if (type == null) {
			createMarkerForValue(attribute, "Class '" + attribute.getValue() + "' could not be resolved");
		}

		if (!inherits(type, FRAGMENT_ROOT_INTERFACE)) {
			createMarkerForValue(attribute, "Class '" + attribute.getValue() + "' is not a valid fragment");
		}
	}

}
