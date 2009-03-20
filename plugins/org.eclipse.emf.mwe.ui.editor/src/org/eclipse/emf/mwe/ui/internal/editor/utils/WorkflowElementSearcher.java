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

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import java.util.Collection;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.13 $
 */

public final class WorkflowElementSearcher {

	/**
	 * Don't allow instantiation.
	 */
	private WorkflowElementSearcher() {
		throw new UnsupportedOperationException();
	}

	public static AbstractWorkflowElement searchContainerElement(final AbstractWorkflowElement root,
			final IDocument document, final int offset) {
		if (root == null || document == null)
			throw new IllegalArgumentException();

		if (!root.hasChildren())
			return null;

		final AbstractWorkflowElement workflow = root.getChild(0);
		final Collection<AbstractWorkflowElement> allElements = workflow.getChildrenList();
		if (allElements == null)
			return null;

		AbstractWorkflowElement element = internalSearchContainerElement(allElements, offset);
		while (element != null && !element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
			element = element.getParent();
		}
		return element;
	}

	public static AbstractWorkflowElement searchContainerElement(final WorkflowEditor editor, final IDocument document,
			final int offset) {
		if (editor != null || document != null) {
			final AbstractWorkflowElement root = editor.getRootElement();
			if (root != null)
				return searchContainerElement(root, document, offset);
		}
		return null;
	}

	private static AbstractWorkflowElement internalSearchContainerElement(
			final Collection<AbstractWorkflowElement> allElements, final int offset) {
		AbstractWorkflowElement foundElement = null;
		int foundOffset = -1;

		for (final AbstractWorkflowElement e : allElements) {
			final ElementPositionRange range = e.getElementRange();
			final int startOffset = range.getStartOffset();
			final int endOffset = range.getEndOffset();
			if (startOffset < offset && startOffset > foundOffset && (endOffset == 0 || endOffset > offset)) {
				foundElement = e;
				foundOffset = startOffset;
			}
		}
		return foundElement;
	}
}
