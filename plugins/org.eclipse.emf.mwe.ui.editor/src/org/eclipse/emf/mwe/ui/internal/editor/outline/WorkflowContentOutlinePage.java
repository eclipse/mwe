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

package org.eclipse.emf.mwe.ui.internal.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

public class WorkflowContentOutlinePage extends ContentOutlinePage {

	private final TextEditor editor;

	private IEditorInput input;

	private ISelection selection;

	public WorkflowContentOutlinePage(final TextEditor editor) {
		super();
		this.editor = editor;
	}

	@Override
	public void createControl(final Composite parent) {
		super.createControl(parent);
		final TreeViewer viewer = getTreeViewer();
		viewer.setLabelProvider(getLabelProvider());
		viewer.setContentProvider(getContentProvider());
		viewer.addSelectionChangedListener(this);

		if (input != null) {
			setInput(input);
		}
	}

	public void refresh() {
		final TreeViewer viewer = getTreeViewer();

		if (viewer != null) {
			final Control control = viewer.getControl();

			if (control != null && !control.isDisposed()) {
				control.setRedraw(false);
				viewer.setInput(input);
				((WorkflowEditor) editor).validateAndMark();
				viewer.expandAll();
				control.setRedraw(true);
			}
		}
	}

	/**
	 * Notifies that the selection has changed.
	 * 
	 * @param event
	 *            event object describing the change
	 */
	@Override
	public final void selectionChanged(final SelectionChangedEvent event) {
		super.selectionChanged(event);
		selection = event.getSelection();
		updateHighlight();
	}

	public void setInput(final IEditorInput input) {
		this.input = input;
		refresh();
	}

	protected AbstractWorkflowElement[] getChildren(
			final AbstractWorkflowElement parentElement) {
		final List<AbstractWorkflowElement> list = new ArrayList<AbstractWorkflowElement>();
		for (int i = 0; i < parentElement.getChildrenCount(); i++) {
			list.add(parentElement.getChild(i));
		}
		return list.toArray(new XMLWorkflowElementImpl[0]);
	}

	private ElementPositionRange calculateTagRange(final IDocument document,
			final ElementPositionRange range) {
		int start = range.getStartOffset();
		// skip '<'
		start++;

		int end = start;
		try {
			while (!Character.isWhitespace(document.getChar(end))) {
				end++;
			}

			// Go to last character before whitespace
			end--;
		} catch (final BadLocationException e) {
			Log.logError("Document location error", e);
		}
		return new ElementPositionRange(document, start, end);
	}

	private ITreeContentProvider getContentProvider() {
		return new OutlineContentProvider(editor);
	}

	private ILabelProvider getLabelProvider() {
		return new OutlineLabelProvider();
	}

	private void updateHighlight() {
		if (selection != null) {
			if (selection.isEmpty()) {
				editor.resetHighlightRange();
			} else {
				final Object segment =
						((IStructuredSelection) selection).getFirstElement();
				if (segment != null
						&& segment instanceof XMLWorkflowElementImpl) {
					final AbstractWorkflowElement wfElement =
							(AbstractWorkflowElement) segment;
					final ElementPositionRange range =
							wfElement.getElementRange();
					final ElementPositionRange tagRange =
							calculateTagRange(wfElement.getDocument(), range);
					final int start = tagRange.getStartOffset();
					final int length = tagRange.getLength();
					if (start >= 0) {
						try {
							editor.setHighlightRange(start, length, true);
							final ISelectionProvider selectionProvider =
									editor.getSelectionProvider();
							final ISelection selection =
									new TextSelection(wfElement.getDocument(),
											start, length);
							selectionProvider.setSelection(selection);
						} catch (final IllegalArgumentException x) {
							editor.resetHighlightRange();
						}
					}
				}
			}
		}
	}
}
