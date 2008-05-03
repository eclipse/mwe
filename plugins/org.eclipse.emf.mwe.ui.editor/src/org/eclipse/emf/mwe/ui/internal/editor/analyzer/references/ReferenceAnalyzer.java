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
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class ReferenceAnalyzer implements IReferenceAnalyzerStrategy {

	ReferenceInfoStore store;

	private final Collection<IReferenceAnalyzerStrategy> strategies;

	private final IFile file;

	private final IDocument document;

	public ReferenceAnalyzer(final IFile file, final IDocument document,
			final ReferenceInfoStore store) {
		this.file = file;
		this.document = document;
		if (store == null) {
			this.store = new ReferenceInfoStore(file);
		} else {
			this.store = store;
		}

		strategies = new LinkedList<IReferenceAnalyzerStrategy>();
		init();
	}

	/**
	 * This method overrides the implementation of <code>analyzeElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#analyzeElement(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
	 */
	public void analyzeElement(final WorkflowElement element) {
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#isApplicable(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
	 */
	public boolean isApplicable(final WorkflowElement element) {
		return true;
	}

	public boolean isValid(final WorkflowElement element) {
		return (element == null)
				|| (element.hasAttribute(WorkflowElement.FILE_ATTRIBUTE)
						^ element
								.hasAttribute(WorkflowElement.ID_REF_ATTRIBUTE) ^ element
						.hasAttribute(WorkflowElement.ID_ATTRIBUTE));
	}

	public void markUnresolvedReferences() {
		for (final Iterator<ReferenceInfo> it = store.getReferenceIterator(); it
				.hasNext();) {
			final ReferenceInfo info = it.next();
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
