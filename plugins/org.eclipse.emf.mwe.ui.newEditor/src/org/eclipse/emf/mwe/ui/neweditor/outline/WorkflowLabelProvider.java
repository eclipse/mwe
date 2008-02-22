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

import org.eclipse.emf.mwe.ui.neweditor.elements.WorkflowElement;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class WorkflowLabelProvider implements ILabelProvider {
    public void addListener(final ILabelProviderListener listener) {
    }

    public void dispose() {
    }

    public Image getImage(final Object element) {
        if (element instanceof WorkflowElement)
            return ((WorkflowElement) element).getImage();
        return null;
    }

    public String getText(final Object element) {
        if (element instanceof WorkflowElement)
            return ((WorkflowElement) element).getLabel();
        return null;
    }

    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    public void removeListener(final ILabelProviderListener listener) {
    }
}
