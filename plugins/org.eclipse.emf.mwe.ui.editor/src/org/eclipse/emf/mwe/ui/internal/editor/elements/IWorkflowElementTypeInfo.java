/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public interface IWorkflowElementTypeInfo {

	String WORKFLOWFILE_TAG = "workflowfile";

	String FRAGMENT_TAG = "fragment";

	String PROPERTY_TAG = "property";

	String WORKFLOW_TAG = "workflow";

	String COMPONENT_TAG = "component";

	String COMPOSE_TAG = "compose";

	String IF_COMPONENT_TAG = "if";

	/**
	 * Returns the type of the current element.
	 * 
	 * @return type of current element
	 */
	WorkflowElementType getElementType();

	/**
	 * Returns the type of the current element as a string.
	 * 
	 * @return string representation of the type of the current element
	 */
	String getElementTypeString();

	/**
	 * Checks if the current element is an assignment.
	 * 
	 * @return <code>true</code> if current element is an assignment, otherwise
	 *         <code>false</code>.
	 */
	boolean isAssignment();

	/**
	 * Checks if the current element is an assignment property.
	 * 
	 * @return <code>true</code> if current element is an assignment property,
	 *         otherwise <code>false</code>.
	 */
	boolean isAssignmentProperty();

	/**
	 * Checks if the current element is a component.
	 * 
	 * @return <code>true</code> if current element is a component, otherwise
	 *         <code>false</code>.
	 */
	boolean isComponent();

	/**
	 * Checks if the current element is a compose.
	 * 
	 * @return <code>true</code> if current element is a compose, otherwise
	 *         <code>false</code>
	 */
	boolean isCompose();

	/**
	 * Checks if the current element is a file property.
	 * 
	 * @return <code>true</code> if current element is a file property,
	 *         otherwise <code>false</code>
	 */
	boolean isFileProperty();

	/**
	 * Checks if the current element is a fragment.
	 * 
	 * @return <code>true</code> if current element is a fragment, otherwise
	 *         <code>false</code>
	 */
	boolean isFragment();

	/**
	 * Checks if the current element is an if-component.
	 * 
	 * @return <code>true</code> if current element is an if-component,
	 *         otherwise <code>false</code>.
	 */
	boolean isIfComponent();

	/**
	 * This method overrides the implementation of <code>isInRange</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck#isInRange(int)
	 */
	boolean isInRange(final int offset);

	/**
	 * Checks if the current element can be instantiated from within a workflow.
	 * 
	 * @return <code>true</code> if the current element can be instantiated from
	 *         within a workflow, otherwise <code>false</code>
	 */
	boolean isInstantiable();

	/**
	 * Checks if the current element is a leaf element.
	 * 
	 * @return <code>true</code> if current element has no child elements,
	 *         otherwise <code>false</code>
	 */
	boolean isLeaf();

	/**
	 * Checks if the current element is a property.
	 * 
	 * @return <code>true</code> if current element is a property, otherwise
	 *         <code>false</code>
	 */
	boolean isProperty();

	/**
	 * Checks if the current element is a simple property.
	 * 
	 * @return <code>true</code> if current element is a simple property,
	 *         otherwise <code>false</code>
	 */
	boolean isSimpleProperty();

	/**
	 * Checks if the current element is a workflow container.
	 * 
	 * @return <code>true</code> if current element is a workflow container,
	 *         otherwise <code>false</code>
	 */
	boolean isWorkflow();

	/**
	 * Checks if the current element is a workflow file container.
	 * 
	 * @return <code>true</code> if current element is a workflow file
	 *         container, otherwise <code>false</code>
	 */
	boolean isWorkflowFile();

	/**
	 * Sets the type of the current element.
	 * 
	 * @param type
	 *            the type
	 */
	void setType(final WorkflowElementType type);
}
