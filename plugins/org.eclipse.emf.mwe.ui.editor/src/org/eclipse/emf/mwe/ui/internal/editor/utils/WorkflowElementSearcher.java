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

import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
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
		AbstractWorkflowElement element = internalSearchContainerElement(workflow, document, offset);
		while (element != null && !element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
			element = element.getParent();
		}
		return element;
	}

	public static AbstractWorkflowElement searchCompleteParentElement(final AbstractWorkflowElement root,
			final IDocument document, final int offset) {
		if (root == null || document == null)
			throw new IllegalArgumentException();

		if (!root.hasChildren())
			return null;

		final AbstractWorkflowElement element = internalSearchContainerElement(root, document, offset);
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

	private static AbstractWorkflowElement internalSearchContainerElement(final AbstractWorkflowElement rootElement,
			final IDocument document, final int offset) {
		AbstractWorkflowElement foundElement = null;
		int foundOffset = -1;
		AbstractWorkflowElement element = rootElement;
		final int docEnd = document.getLength() - 1;
		int count = 0;

		while (element.hasChildren() && count < 2) {
			final List<AbstractWorkflowElement> childElements = element.getChildrenList();
			for (final AbstractWorkflowElement e : childElements) {
				final ElementPositionRange range = e.getElementRange();
				final int startOffset = range.getStartOffset();
				final int endOffset = range.getEndOffset();
				final int ofs = (offset <= docEnd) ? offset : docEnd;
				if (startOffset <= ofs && startOffset > foundOffset && ofs <= endOffset && foundOffset < endOffset) {
					foundElement = e;
					foundOffset = startOffset;
					element = foundElement;
					count = 0;
					break;
				}
				count++;
			}
		}
		return foundElement;
	}
}
