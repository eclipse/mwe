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

import org.eclipse.emf.mwe.core.container.IfComponent;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.14 $
 */
public final class WorkflowElementTypeComputer {

	/**
	 * Hide because of utility class.
	 */
	private WorkflowElementTypeComputer() {
		throw new UnsupportedOperationException();
	}

	public static void computeTypeInfo(final AbstractWorkflowElement element) {
		computeElementType(element);
		computeElementImage(element);
	}

	public static String getDefaultClass(final AbstractWorkflowElement element) {
		String name = null;
		if (element.getElementType() == WorkflowElementType.WORKFLOW) {
			name = Workflow.class.getCanonicalName();
		}
		else if (element.hasAttribute(IWorkflowAttribute.CLASS_ATTRIBUTE)) {
			name = element.getAttributeValue(IWorkflowAttribute.CLASS_ATTRIBUTE);
		}
		else if (element.hasProject() && element.hasParent()) {
			IMethod method = null;

			final IType parentType = element.getParent().getMappedClassType();
			if (parentType != null) {
				method = TypeUtils.getSetter(element.getProject(), parentType, element.getName(), TypeUtils.WILDCARD);
				IType mt = parentType;
				if (method == null) {
					mt = TypeUtils.getSetterParameter(element.getProject(), element, parentType);
					if (mt == null) {
						mt = parentType;
					}
					method = TypeUtils.getSetter(element.getProject(), mt, element.getName(), TypeUtils.WILDCARD);
				}
				if (method == null && element.hasParent()) {
					mt = TypeUtils.getSetterParameter(element.getProject(), element.getParent(), parentType);
					if (mt != null) {
						name = element.getName();
						method = TypeUtils.getSetter(element.getProject(), mt, element.getName(), TypeUtils.WILDCARD);
					}
					if (mt == null) {
						mt = parentType;
					}
				}

				if (method != null) {
					name = mt.getFullyQualifiedName();
				}
			}
			else if (element.getElementType() == WorkflowElementType.COMPONENT) {
				name = AbstractWorkflowComponent.class.getCanonicalName();
			}
			else if (element.getElementType() == WorkflowElementType.IF_COMPONENT) {
				name = IfComponent.class.getCanonicalName();
			}
		}
		return name;
	}

	private static void computeElementImage(final AbstractWorkflowElement element) {
		String imageName = null;
		if (element.isWorkflow()) {
			imageName = EditorImages.WORKFLOW;
		}
		else if (element.isComponent()) {
			imageName = EditorImages.COMPONENT;
		}
		else if (element.isProperty() || element.isAssignmentProperty()) {
			imageName = EditorImages.PROPERTY;
		}
		else if (element.isAssignment()) {
			imageName = EditorImages.ASSIGNMENT;
		}

		element.setImage(imageName);
	}

	private static void computeElementType(final AbstractWorkflowElement element) {
		WorkflowElementType type = null;
		final String name = element.getName();
		if (name.equals(IWorkflowElementTypeInfo.WORKFLOWFILE_TAG)) {
			type = WorkflowElementType.WORKFLOWFILE;
		}
		else if (name.equals(IWorkflowElementTypeInfo.COMPONENT_TAG)) {
			type = WorkflowElementType.COMPONENT;
		}
		else if (name.equals(IWorkflowElementTypeInfo.IF_COMPONENT_TAG)) {
			type = WorkflowElementType.IF_COMPONENT;
		}
		else if (name.equals(IWorkflowElementTypeInfo.COMPOSE_TAG)) {
			type = WorkflowElementType.COMPOSE;
		}
		else if (name.equals(IWorkflowElementTypeInfo.WORKFLOW_TAG)) {
			type = WorkflowElementType.WORKFLOW;
		}
		else if (name.equals(IWorkflowElementTypeInfo.FRAGMENT_TAG)
				|| name.equals(IWorkflowElementTypeInfo.FRAGMENT_TAG + "s")) {
			type = WorkflowElementType.FRAGMENT;
		}
		else if (name.equals(IWorkflowElementTypeInfo.PROPERTY_TAG)) {
			if (element.getAttributeCount() == 2 && element.hasAttribute(IWorkflowAttribute.NAME_ATTRIBUTE)
					&& element.hasAttribute(IWorkflowAttribute.VALUE_ATTRIBUTE) || element.getAttributeCount() == 1
					&& element.hasAttribute(IWorkflowAttribute.NAME_ATTRIBUTE)) {
				type = WorkflowElementType.SIMPLE_PROPERTY;
			}
			else if (element.getAttributeCount() == 1 && element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)) {
				type = WorkflowElementType.FILE_PROPERTY;
			}
			else if (!element.isLeaf()) {
				type = WorkflowElementType.ASSIGNMENTPROPERTY;
			}
			else {
				type = WorkflowElementType.PROPERTY;
			}
		}
		else {
			type = WorkflowElementType.ASSIGNMENT;
		}

		element.setType(type);
	}
}
