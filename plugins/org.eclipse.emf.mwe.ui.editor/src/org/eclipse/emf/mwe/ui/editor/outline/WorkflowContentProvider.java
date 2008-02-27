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

import org.eclipse.emf.mwe.ui.editor.elements.WorkflowElement;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class WorkflowContentProvider implements ITreeContentProvider {

    private final WorkflowContentOutlinePage outlinePage;

    private final Viewer viewer;

    public WorkflowContentProvider(
            final WorkflowContentOutlinePage outlinePage, final Viewer viewer) {
        this.outlinePage = outlinePage;
        this.viewer = viewer;
    }

    public void dispose() {
        // do nothing
    }

    public WorkflowElement[] getChildren(final Object parentElement) {
        return outlinePage.getChildren((WorkflowElement) parentElement);
    }

    public Object[] getElements(final Object inputElement) {
        return getChildren(inputElement);
    }

    public Object getParent(final Object element) {
        return null;
    }

    public boolean hasChildren(final Object element) {
        return getChildren(element).length > 0;
    }

    public void inputChanged(final Viewer viewer, final Object oldInput,
            final Object newInput) {
        // do nothing
    }

    public void setInput(final IEditorInput input) {
        // do nothing
    }
}
