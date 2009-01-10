/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.outline;

import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.16 $
 */
public class OutlineContentProvider implements ITreeContentProvider {

	protected IPositionUpdater positionUpdater;

	private IWorkflowElement rootElement;

	private IEditorInput input;

	private final IDocumentProvider documentProvider;

	private final TextEditor editor;

	public OutlineContentProvider(final TextEditor editor) {
		this.editor = editor;
		documentProvider = editor.getDocumentProvider();
		positionUpdater =
				new DefaultPositionUpdater(DocumentParser.TAG_POSITIONS);
	}

	public void dispose() {
		// do nothing
	}

	public Object[] getChildren(final Object parentElement) {
		if (parentElement == input) {
			if (rootElement == null)
				return new Object[0];
			final List<IWorkflowElement> childList =
					rootElement.getChildrenList();
			if (childList != null)
				return childList.toArray();
		} else {
			final IWorkflowElement parent = (IWorkflowElement) parentElement;
			final List<IWorkflowElement> childList = parent.getChildrenList();
			if (childList != null)
				return childList.toArray();
		}
		return new Object[0];
	}

	public Object[] getElements(final Object inputElement) {
		return getChildren(inputElement);
	}

	public Object getParent(final Object element) {
		if (element instanceof XMLWorkflowElementImpl)
			return ((IWorkflowElement) element).getParent();

		return null;
	}

	public boolean hasChildren(final Object element) {
		return getChildren(element).length > 0;
	}

	public void inputChanged(final Viewer viewer, final Object oldInput,
			final Object newInput) {
		if (oldInput != null) {
			final IDocument document = documentProvider.getDocument(oldInput);
			if (document != null) {
				try {
					document
							.removePositionCategory(DocumentParser.TAG_POSITIONS);
				} catch (final BadPositionCategoryException x) {
				}
				document.removePositionUpdater(positionUpdater);
			}
		}

		input = (IEditorInput) newInput;

		if (newInput != null) {
			final IDocument document = documentProvider.getDocument(newInput);
			if (document != null) {
				document.addPositionCategory(DocumentParser.TAG_POSITIONS);
				document.addPositionUpdater(positionUpdater);

				final WorkflowEditor wfEditor = (WorkflowEditor) editor;
				final IWorkflowElement rootElement =
						wfEditor.parseRootElement(document);
				if (rootElement != null) {
					this.rootElement = rootElement;
				}
			}
		}
	}

	public void setInput(final IEditorInput input) {
		// do nothing
	}
}
