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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer.references;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class ReferenceDefinitionAnalyzerStrategy extends
		AbstractReferenceAnalyzerStrategy {

	public ReferenceDefinitionAnalyzerStrategy(final IFile file,
			final IDocument document, final ReferenceInfoStore store) {
		super(file, document, store);
	}

	/**
	 * This method overrides the implementation of <code>isApplicable</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#isApplicable(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public boolean isApplicable(final IWorkflowElement element) {
		return element != null
				&& element.hasAttribute(IWorkflowElement.ID_ATTRIBUTE);
	}

	/**
	 * This method overrides the implementation of <code>doAnalyze</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#doAnalyze(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	protected void doAnalyze(final IWorkflowElement element) {
		if (store.addDefinition(element)) {
			final WorkflowAttribute attribute =
					element.getAttribute(IWorkflowElement.ID_ATTRIBUTE);
			MarkerManager
					.createMarker(file, document, attribute, "Duplicate ID '"
							+ attribute.getValue() + "'", true, false);
		}
	}
}
