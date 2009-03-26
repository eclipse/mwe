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
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceInfoStore;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.30 $
 */
public class ElementIterator {

	private static final String[] EXCLUDED_TAGS = { "workflowfile" };

	private final IFile file;

	private final IDocument document;

	private final ElementAnalyzerRegistry analyzer;

	private List<AbstractWorkflowElement> elementList;

	private final List<IWorkflowAttribute> attributeList = new ArrayList<IWorkflowAttribute>();

	private final ReferenceInfoStore referenceInfoStore;

	public ElementIterator(final IFile file, final IDocument document) {
		this.file = file;
		this.document = document;
		analyzer = new ElementAnalyzerRegistry(file, document);
		referenceInfoStore = new ReferenceInfoStore(file);
	}

	public void checkValidity(final AbstractWorkflowElement workflowElement) {
		elementList = flatten(workflowElement);
		for (final AbstractWorkflowElement element : elementList) {
			analyzer.checkValidity(element);
		}

		final ReferenceAnalyzer referenceAnalyzer = new ReferenceAnalyzer(file, document, referenceInfoStore);

		for (final AbstractWorkflowElement element : elementList) {
			referenceAnalyzer.analyzeElement(element);
		}
		referenceAnalyzer.markUnresolvedReferences();
	}

	/**
	 * Returns the value of field <code>attributeList</code>.
	 * 
	 * @return value of <code>attributeList</code>.
	 */
	public List<IWorkflowAttribute> getAttributeList() {
		return attributeList;
	}

	/**
	 * Returns the value of field <code>elementList</code>.
	 * 
	 * @return value of <code>elementList</code>.
	 */
	public List<AbstractWorkflowElement> getElementList() {
		return elementList;
	}

	public Collection<ReferenceInfo> getReferenceDefinitions() {
		return referenceInfoStore.getReferenceDefinitions();
	}

	public Collection<ReferenceInfo> getReferences() {
		return referenceInfoStore.getReferences();
	}

	private void addChild(final List<AbstractWorkflowElement> list, final AbstractWorkflowElement element) {
		for (int i = 0; i < element.getChildrenCount(); i++) {
			final AbstractWorkflowElement child = element.getChild(i);
			list.add(child);
			for (final IWorkflowAttribute attribute : element.getAttributeList()) {
				attributeList.add(attribute);
			}
		}
	}

	private List<AbstractWorkflowElement> flatten(final AbstractWorkflowElement workflowElement) {
		final List<AbstractWorkflowElement> list = new ArrayList<AbstractWorkflowElement>();
		boolean isRootExcluded = false;
		for (final String tag : EXCLUDED_TAGS) {
			if (workflowElement.getName().equals(tag)) {
				isRootExcluded = true;
				break;
			}
		}

		if (workflowElement != null) {
			if (!isRootExcluded) {
				list.add(workflowElement);
			}
			else if (workflowElement.hasChildren()) {
				list.add(workflowElement.getChild(0));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			addChild(list, list.get(i));
		}
		return list;
	}
}
