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
import org.eclipse.emf.mwe.ui.editor.internal.images.EditorImages;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class OutlineLabelProvider implements ILabelProvider {
    private static final String PROPERTY_FILE_LABEL = "property file:";

    private static final String PROPERTY_LABEL = "property:";

    public void addListener(final ILabelProviderListener listener) {
    }

    public void dispose() {
    }

    public Image getImage(final Object element) {
        if (!(element instanceof WorkflowElement))
            return null;

        final WorkflowElement workflowElement = (WorkflowElement) element;
        return EditorImages.getImage(workflowElement.getImage());
    }

    public String getText(final Object element) {
        if (!(element instanceof WorkflowElement))
            return null;

        final WorkflowElement workflowElement = (WorkflowElement) element;
        String text = null;

        if (workflowElement.isSimpleProperty()) {
            text =
                    PROPERTY_LABEL
                            + " "
                            + workflowElement
                                    .getAttributeValue(WorkflowElement.NAME_ATTRIBUTE)
                            + " = "
                            + workflowElement
                                    .getAttributeValue(WorkflowElement.VALUE_ATTRIBUTE);
        } else if (workflowElement.isFileProperty()) {
            text =
                    PROPERTY_FILE_LABEL
                            + " "
                            + workflowElement
                                    .getAttributeValue(WorkflowElement.FILE_ATTRIBUTE);
        } else {
            text = workflowElement.getName();
        }
        return text;
    }

    public boolean isLabelProperty(final Object element, final String property) {
        return true;
    }

    public void removeListener(final ILabelProviderListener listener) {
    }
}
