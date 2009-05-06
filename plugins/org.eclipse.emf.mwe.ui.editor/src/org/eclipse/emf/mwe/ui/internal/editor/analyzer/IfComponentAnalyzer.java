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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.13 $
 */
public class IfComponentAnalyzer extends ComponentAnalyzer {

	protected static final String COND_ONLY_MSG = "The component 'if' only accepts an attribute 'cond'";

	private static final String COND_ATTRIBUTE = "cond";

	public IfComponentAnalyzer(final IFile file, final IDocument document) {
		super(file, document);
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.ComponentAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	public void checkValidity(final AbstractWorkflowElement element) {
		if (element.getAttributeCount() != 1 || !element.hasAttribute(COND_ATTRIBUTE)) {
			createMarker(element, COND_ONLY_MSG);
			return;
		}

		final IType mappedType = element.getMappedClassType();
		if (mappedType == null) {
			createMarker(element, "Class '" + element.getName() + "' cannot be resolved");
		}
	}
}
