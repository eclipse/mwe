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

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.container.IfComponent;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */
public final class WorkflowElementTypeComputer {

	/**
	 * Hide because of utility class.
	 */
	private WorkflowElementTypeComputer() {
		throw new UnsupportedOperationException();
	}

	public static void computeTypeInfo(final IWorkflowElement element) {
		computeElementType(element);
		computeElementImage(element);
	}

	public static String getDefaultClass(final IWorkflowElement element) {
		Class<?> clazz = null;
		if (element.getElementType() == WorkflowElementType.WORKFLOW) {
			clazz = CompositeComponent.class;
		} else if (element.getElementType() == WorkflowElementType.COMPONENT) {
			clazz = AbstractWorkflowComponent.class;
		} else if (element.getElementType() == WorkflowElementType.IF_COMPONENT) {
			clazz = IfComponent.class;
		}
		final String name = clazz != null ? clazz.getName() : null;
		return name;
	}

	private static void computeElementImage(final IWorkflowElement element) {
		String imageName = null;
		if (element.isWorkflow()) {
			imageName = EditorImages.WORKFLOW;
		} else if (element.isComponent()) {
			imageName = EditorImages.COMPONENT;
		} else if (element.isProperty() || element.isAssignmentProperty()) {
			imageName = EditorImages.PROPERTY;
		} else if (element.isAssignment()) {
			imageName = EditorImages.ASSIGNMENT;
		}

		element.setImage(imageName);
	}

	private static void computeElementType(final IWorkflowElement element) {
		WorkflowElementType type = null;
		final String name = element.getName();
		if (name.equals(IWorkflowElement.WORKFLOWFILE_TAG)) {
			type = WorkflowElementType.WORKFLOWFILE;
		} else if (name.equals(IWorkflowElement.COMPONENT_TAG)
				|| element.hasAttribute(IWorkflowElement.CLASS_ATTRIBUTE)) {
			type = WorkflowElementType.COMPONENT;
		} else if (name.equals(IWorkflowElement.IF_COMPONENT_TAG)) {
			type = WorkflowElementType.IF_COMPONENT;
		} else if (name.equals(IWorkflowElement.WORKFLOW_TAG)) {
			type = WorkflowElementType.WORKFLOW;
		} else if (name.equals(IWorkflowElement.PROPERTY_TAG)) {
			if (element.getAttributeCount() == 2
					&& element.hasAttribute(IWorkflowElement.NAME_ATTRIBUTE)
					&& element.hasAttribute(IWorkflowElement.VALUE_ATTRIBUTE)
					|| element.getAttributeCount() == 1
					&& element.hasAttribute(IWorkflowElement.NAME_ATTRIBUTE)) {
				type = WorkflowElementType.SIMPLE_PROPERTY;
			} else if (element.getAttributeCount() == 1
					&& element.hasAttribute(IWorkflowElement.FILE_ATTRIBUTE)) {
				type = WorkflowElementType.FILE_PROPERTY;
			} else if (!element.isLeaf()) {
				type = WorkflowElementType.ASSIGNMENTPROPERTY;
			} else {
				type = WorkflowElementType.PROPERTY;
			}
		} else {
			type = WorkflowElementType.ASSIGNMENT;
		}

		element.setType(type);
	}
}
