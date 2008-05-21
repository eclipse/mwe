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

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public final class WorkflowElementSearcher {

	/**
	 * Don't allow instantiation.
	 */
	private WorkflowElementSearcher() {
		throw new UnsupportedOperationException();
	}

	public static WorkflowElement searchContainerElement(
			final WorkflowEditor editor, final IDocument document,
			final int offset) {
		return searchContainerElement(editor.getRootElement(), document,
				offset);
	}

	public static WorkflowElement searchContainerElement(
			final WorkflowElement rootElement, final IDocument document,
			final int offset) {
		if (rootElement == null || document == null)
			return null;

		final WorkflowElement firstComponent = rootElement.getChild(0);
		if (firstComponent == null)
			return null;

		WorkflowElement element =
				internalSearchContainerElement(firstComponent, null, offset);
		if (!element.hasAttribute("class")) {
			element = element.getParent();
		}
		return element;
	}

	private static WorkflowElement internalSearchContainerElement(
			final WorkflowElement rootElement,
			final WorkflowElement lastFoundElement, final int offset) {
		WorkflowElement foundElement = lastFoundElement;
		int foundOffset;
		if (foundElement != null) {
			foundOffset = foundElement.getElementRange().getStartOffset();
		} else {
			foundOffset = -1;
		}

		if (rootElement == null)
			throw new IllegalStateException();

		final ElementPositionRange range = rootElement.getElementRange();
		final int startOffset = range.getStartOffset();
		final int endOffset = range.getEndOffset();

		if (startOffset < offset && startOffset > foundOffset
				&& (endOffset == 0 || endOffset > offset)) {
			foundElement = rootElement;
			foundOffset = startOffset;
		}
		for (int i = 0; i < rootElement.getChildrenCount(); i++) {
			final WorkflowElement child = rootElement.getChild(i);
			foundElement =
					internalSearchContainerElement(child, foundElement, offset);
		}
		return foundElement;
	}
}
