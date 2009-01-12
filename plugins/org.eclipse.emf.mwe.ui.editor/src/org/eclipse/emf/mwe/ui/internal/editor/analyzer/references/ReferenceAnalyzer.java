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

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.8 $
 */
public class ReferenceAnalyzer implements IReferenceAnalyzerStrategy {

	ReferenceInfoStore store;

	private final Collection<IReferenceAnalyzerStrategy> strategies;

	private final IFile file;

	private final IDocument document;

	public ReferenceAnalyzer(final IFile file, final IDocument document,
			final ReferenceInfoStore store) {
		if (file == null || document == null || store == null)
			throw new IllegalArgumentException();

		this.file = file;
		this.document = document;
		this.store = store;

		strategies = new LinkedList<IReferenceAnalyzerStrategy>();
		init();
	}

	/**
	 * This method overrides the implementation of <code>analyzeElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#analyzeElement(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public void analyzeElement(final IWorkflowElement element) {
		if (!isValid(element))
			return;

		for (final IReferenceAnalyzerStrategy strategy : strategies) {
			if (strategy.isApplicable(element)) {
				strategy.analyzeElement(element);
				return;
			}
		}
	}

	/**
	 * This method overrides the implementation of <code>clearCache</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#clearCache()
	 */
	public void clearCache() {
		store.clear();
	}

	/**
	 * This method overrides the implementation of <code>isApplicable</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#isApplicable(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public boolean isApplicable(final IWorkflowElement element) {
		return true;
	}

	public boolean isValid(final IWorkflowElement element) {
		return element == null
				|| element.hasAttribute(IWorkflowElement.FILE_ATTRIBUTE)
				^ element.hasAttribute(IWorkflowElement.ID_REF_ATTRIBUTE)
				^ element.hasAttribute(IWorkflowElement.ID_ATTRIBUTE);
	}

	public void markUnresolvedReferences() {
		final Collection<ReferenceInfo> references = store.getReferences();
		for (final ReferenceInfo info : references) {
			if (!store.isDefined(info)) {
				MarkerManager.createMarker(info.getFile(), info.getElement()
						.getDocument(), info.getAttribute(),
						"Unresolved reference '" + info.getReferenceValue()
								+ "'", true, false);
			}
		}
	}

	/**
	 * This method overrides the implementation of
	 * <code>setReferenceInfoStore</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#setReferenceInfoStore(org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceInfoStore)
	 */
	public void setReferenceInfoStore(final ReferenceInfoStore store) {
		this.store = store;
	}

	private void init() {
		strategies.add(new ReferenceDefinitionAnalyzerStrategy(file, document,
				store));
		strategies.add(new ReferenceAnalyzerStrategy(file, document, store));
		strategies
				.add(new FileReferenceAnalyzerStrategy(file, document, store));
	}
}
