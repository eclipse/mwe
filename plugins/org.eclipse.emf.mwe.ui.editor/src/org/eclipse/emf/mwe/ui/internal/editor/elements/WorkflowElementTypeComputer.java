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

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public final class WorkflowElementTypeComputer {

    /**
     * Hide because of utility class.
     */
    private WorkflowElementTypeComputer() {
        throw new UnsupportedOperationException();
    }

    public static void computeTypeInfo(final WorkflowElement element) {
        computeElementType(element);
        computeElementImage(element);
    }

    public static Class<?> getDefaultClass(final WorkflowElement element) {
        Class<?> clazz = null;
        if (element.getElementType() == WorkflowElementType.WORKFLOW) {
            clazz = CompositeComponent.class;
        } else if (element.getElementType() == WorkflowElementType.COMPONENT) {
            clazz = AbstractWorkflowComponent.class;
        }
        return clazz;
    }

    private static void computeElementImage(final WorkflowElement element) {
        String imageName = null;
        if (element.isWorkflow())
            imageName = EditorImages.WORKFLOW;
        else if (element.isComponent())
            imageName = EditorImages.COMPONENT;
        else if (element.isProperty() || element.isAssignmentProperty())
            imageName = EditorImages.PROPERTY;
        else if (element.isAssignment())
            imageName = EditorImages.ASSIGNMENT;

        element.setImage(imageName);
    }

    private static void computeElementType(final WorkflowElement element) {
        WorkflowElementType type = null;
        if (element.getName().equals(WorkflowElement.WORKFLOWFILE_TAG))
            type = WorkflowElementType.WORKFLOWFILE;
        else if (element.getName().equals(WorkflowElement.COMPONENT_TAG)
                || element.getName().equals(WorkflowElement.IFCOMPONENT_TAG))
            type = WorkflowElementType.COMPONENT;
        else if (element.getName().equals(WorkflowElement.WORKFLOW_TAG))
            type = WorkflowElementType.WORKFLOW;
        else if (element.getName().equals(WorkflowElement.PROPERTY_TAG)) {
            if ((element.getAttributeCount() == 2
                    && element.hasAttribute(WorkflowElement.NAME_ATTRIBUTE) && element
                    .hasAttribute(WorkflowElement.VALUE_ATTRIBUTE))
                    || (element.getAttributeCount() == 1 && element
                            .hasAttribute(WorkflowElement.NAME_ATTRIBUTE)))
                type = WorkflowElementType.SIMPLE_PROPERTY;
            else if (element.getAttributeCount() == 1
                    && element.hasAttribute(WorkflowElement.FILE_ATTRIBUTE))
                type = WorkflowElementType.FILE_PROPERTY;
        } else if (!element.getName().equals(WorkflowElement.PROPERTY_TAG)
                && element.isLeaf())
            type = WorkflowElementType.ASSIGNMENTPROPERTY;
        else {
            type = WorkflowElementType.ASSIGNMENT;
        }

        element.setType(type);
    }
}
