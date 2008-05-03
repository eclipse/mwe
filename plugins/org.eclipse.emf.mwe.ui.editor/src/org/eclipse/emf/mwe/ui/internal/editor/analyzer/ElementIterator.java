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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceAnalyzer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.9 $
 */
public class ElementIterator {

	private final IFile file;

	private final IDocument document;

	private final IElementAnalyzer analyzer;

	private List<WorkflowElement> elementList;

	private final List<WorkflowAttribute> attributeList =
			new ArrayList<WorkflowAttribute>();

	public ElementIterator(final IFile file, final IDocument document) {
		this.file = file;
		this.document = document;
		analyzer = new ElementAnalyzerRegistry(file, document, null);
	}

	public void checkValidity(final WorkflowElement root) {
		MarkerManager.deleteMarkers(file);

		elementList = flatten(root);
		for (final WorkflowElement element : elementList) {
			analyzer.checkValidity(element);
		}

		final ReferenceAnalyzer referenceAnalyzer =
				new ReferenceAnalyzer(file, document, null);

		for (final WorkflowElement element : elementList) {
			referenceAnalyzer.analyzeElement(element);
		}
		referenceAnalyzer.markUnresolvedReferences();
	}

	/**
	 * Returns the value of field <code>attributeList</code>.
	 * 
	 * @return value of <code>attributeList</code>.
	 */
	public List<WorkflowAttribute> getAttributeList() {
		return attributeList;
	}

	/**
	 * Returns the value of field <code>elementList</code>.
	 * 
	 * @return value of <code>elementList</code>.
	 */
	public List<WorkflowElement> getElementList() {
		if (elementList == null)
			throw new IllegalStateException();

		return elementList;
	}

	private void addChild(final List<WorkflowElement> list,
			final WorkflowElement element) {
		for (int i = 0; i < element.getChildrenCount(); i++) {
			final WorkflowElement child = element.getChild(i);
			list.add(child);
			final Collection<WorkflowAttribute> attributes =
					element.getAttributes();
			for (final WorkflowAttribute attribute : attributes) {
				attributeList.add(attribute);
			}
		}
	}

	private List<WorkflowElement> flatten(final WorkflowElement root) {
		final List<WorkflowElement> list = new ArrayList<WorkflowElement>();
		list.add(root);
		for (int i = 0; i < list.size(); i++) {
			addChild(list, list.get(i));
		}
		return list;
	}
}
