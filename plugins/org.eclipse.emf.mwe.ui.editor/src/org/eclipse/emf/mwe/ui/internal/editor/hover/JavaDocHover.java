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

package org.eclipse.emf.mwe.ui.internal.editor.hover;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowPartitionScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IEditorPart;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */

public class JavaDocHover extends AbstractHover implements
		IJavaEditorTextHover {

	private IEditorPart editor;

	public JavaDocHover(final ISourceViewer sourceViewer) {
		super(sourceViewer);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>setEditor</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover#setEditor(org.eclipse.ui.IEditorPart)
	 */
	public void setEditor(final IEditorPart editor) {
		this.editor = editor;
	}

	@Override
	protected String getHoverInfoInternal(final int lineNumber,
			final int offset) {
		final WorkflowEditor wfEditor = getWorkflowEditor();
		if (wfEditor == null)
			return null;

		try {
			final ITypedRegion region = document.getPartition(offset);
			if (region.getType()
					.equals(WorkflowPartitionScanner.XML_START_TAG)) {

				final Collection<WorkflowElement> allElements =
						wfEditor.getElements();
				if (allElements != null) {
					final WorkflowElement element =
							findElements(allElements, region);
					if (element != null
							&& element
									.hasAttribute(WorkflowElement.CLASS_ATTRIBUTE)) {
						final String className =
								element
										.getAttributeValue(WorkflowElement.CLASS_ATTRIBUTE);
						final IFile file = wfEditor.getInputFile();
						final String javaDoc =
								TypeUtils.getJavaDoc(file, className);
						return javaDoc;
					}
				}
			}
		} catch (final BadLocationException e) {
			return null;
		}
		return null;
	}

	private WorkflowElement findElements(
			final Collection<WorkflowElement> allElements,
			final ITypedRegion region) {
		if (allElements == null || region == null) {
			throw new IllegalArgumentException();
		}

		final int start = region.getOffset();
		final int end = start + region.getLength() - 1;
		for (final WorkflowElement element : allElements) {
			if (WorkflowElement.WORKFLOW_TAG.equals(element.getName())) {
				continue;
			}

			final ElementPositionRange range = element.getStartElementRange();
			final int elementStart = range.getStartOffset();
			final int elementEnd = range.getEndOffset();
			if (start <= elementStart && elementEnd <= end)
				return element;
		}
		return null;
	}

	private WorkflowEditor getWorkflowEditor() {
		if (editor instanceof WorkflowEditor)
			return (WorkflowEditor) editor;

		return null;
	}
}
