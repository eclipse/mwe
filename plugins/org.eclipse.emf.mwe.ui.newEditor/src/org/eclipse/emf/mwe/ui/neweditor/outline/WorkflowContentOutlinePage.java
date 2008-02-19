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

package org.eclipse.emf.mwe.ui.neweditor.outline;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
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
    public void createControl(Composite parent) {
        super.createControl(parent);
        TreeViewer viewer = getTreeViewer();
        viewer.setLabelProvider(getLabelProvider());
        viewer.setContentProvider(getContentProvider());
        viewer.addSelectionChangedListener(this);
    }

    public void refresh() {
        TreeViewer viewer = getTreeViewer();

        if (viewer != null) {
            Control control = viewer.getControl();

            if ((control != null) && !control.isDisposed()) {
                // TODO implement
                // IXtendXpandResource res = null;
                try {
                    // res = parse();
                } catch (RuntimeException re) {
                    // ignore
                    return;
                }
                control.setRedraw(false);
                // if (res != null)
                // res.refresh();
                // viewer.setInput(res);
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
    public final void selectionChanged(SelectionChangedEvent anEvent) {
        super.selectionChanged(anEvent);

        this.selection = anEvent.getSelection();

        this.updateHighlight();
    }

    public void setInput(final IEditorInput input) {
        this.input = input;
    }

    protected WorkflowOutlineElement[] getChildren(final Object parentElement) {
        // TODO Implement
        return null;
    }

    private ITreeContentProvider getContentProvider() {
        return new ITreeContentProvider() {

            public void dispose() {
                // do nothing
            }

            public Object[] getChildren(Object parentElement) {
                return WorkflowContentOutlinePage.this
                        .getChildren(parentElement);
            }

            public Object[] getElements(Object inputElement) {
                return getChildren(inputElement);
            }

            public Object getParent(Object element) {
                return null;
            }

            public boolean hasChildren(Object element) {
                return getChildren(element).length > 0;
            }

            public void inputChanged(Viewer viewer, Object oldInput,
                    Object newInput) {
                // do nothing
            }
        };
    }

    private ILabelProvider getLabelProvider() {
        return new ILabelProvider() {

            public void addListener(ILabelProviderListener listener) {
            }

            public void dispose() {
            }

            public Image getImage(Object element) {
                if (element instanceof WorkflowOutlineElement)
                    return ((WorkflowOutlineElement) element).getImage();
                return null;
            }

            public String getText(Object element) {
                if (element instanceof WorkflowOutlineElement)
                    return ((WorkflowOutlineElement) element).getLabel();
                return null;
            }

            public boolean isLabelProperty(Object element, String property) {
                return false;
            }

            public void removeListener(ILabelProviderListener listener) {
            }
        };
    }

    private final void updateHighlight() {
        if (selection != null) {
            if (selection.isEmpty()) {
                editor.resetHighlightRange();
            } else {
                Object segment = ((IStructuredSelection) selection)
                        .getFirstElement();
                if (segment != null
                        && segment instanceof WorkflowOutlineElement) {
                    WorkflowOutlineElement ext = (WorkflowOutlineElement) segment;
                    int start = ext.getStart();
                    int length = ext.getLength();
                    if (start >= 0) {
                        try {
                            editor.setHighlightRange(start, length, true);
                        } catch (IllegalArgumentException x) {
                            editor.resetHighlightRange();
                        }
                    }
                }
            }
        }
    }
}
