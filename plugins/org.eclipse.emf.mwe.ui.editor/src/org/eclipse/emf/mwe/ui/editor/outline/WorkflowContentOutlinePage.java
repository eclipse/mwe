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

package org.eclipse.emf.mwe.ui.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.ui.editor.elements.WorkflowElement;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
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
    }

    public void refresh() {
        final TreeViewer viewer = getTreeViewer();

        if (viewer != null) {
            final Control control = viewer.getControl();

            if ((control != null) && !control.isDisposed()) {
                // TODO implement
                control.setRedraw(false);
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
    }

    protected WorkflowElement[] getChildren(final WorkflowElement parentElement) {
        final List<WorkflowElement> list = new ArrayList<WorkflowElement>();
        for (int i = 0; i < parentElement.getChildrenCount(); i++) {
            list.add(parentElement.getChild(i));
        }
        return list.toArray(new WorkflowElement[0]);
    }

    private ITreeContentProvider getContentProvider() {
        return new WorkflowContentProvider(this, getTreeViewer());
    }

    private ILabelProvider getLabelProvider() {
        return new WorkflowLabelProvider();
    }

    private void updateHighlight() {
        if (selection != null) {
            if (selection.isEmpty()) {
                editor.resetHighlightRange();
            } else {
                final Object segment =
                        ((IStructuredSelection) selection).getFirstElement();
                if (segment != null && segment instanceof WorkflowElement) {
                    final WorkflowElement ext = (WorkflowElement) segment;
                    final int start = ext.getOffset();
                    final int length = ext.getLength();
                    if (start >= 0) {
                        try {
                            editor.setHighlightRange(start, length, true);
                        } catch (final IllegalArgumentException x) {
                            editor.resetHighlightRange();
                        }
                    }
                }
            }
        }
    }
}
