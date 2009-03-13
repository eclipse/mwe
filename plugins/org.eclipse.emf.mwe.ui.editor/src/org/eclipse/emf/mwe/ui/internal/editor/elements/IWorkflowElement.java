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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

public interface IWorkflowElement {

	String WORKFLOWFILE_TAG = "workflowfile";

	String FILE_ATTRIBUTE = "file";

	String VALUE_ATTRIBUTE = "value";

	String NAME_ATTRIBUTE = "name";

	String CLASS_ATTRIBUTE = "class";

	String ID_REF_ATTRIBUTE = "idRef";

	String ID_ATTRIBUTE = "id";

	String PROPERTY_TAG = "property";

	String WORKFLOW_TAG = "workflow";

	String COMPONENT_TAG = "component";

	String COMPOSE_TAG = "compose";

	String IF_COMPONENT_TAG = "if";

	/**
	 * Adds an attribute to the current element.
	 * 
	 * @param attribute
	 *            attribute added to current element.
	 */
	void addAttribute(final IWorkflowAttribute attribute);

	/**
	 * Add child element to the current element.
	 * 
	 * @param element
	 *            child element added to current element.
	 */
	void addChild(final IWorkflowElement element);

	/**
	 * Deletes all attributes and children of the current element.
	 */
	void clear();

	/**
	 * Returns the specified attribute of the current element.
	 * 
	 * @param name
	 *            name of the requested attribute.
	 * @return the requested attribute or <code>null</code>, if no attribute
	 *         with the specified name is found.
	 */
	IWorkflowAttribute getAttribute(final String name);

	/**
	 * Number of attributes of the current element.
	 * 
	 * @return number of attributes.
	 */
	int getAttributeCount();

	/**
	 * Returns a list containing all attribute elements. Please notice that the
	 * order of attributes within the collection does not necessarily match the
	 * order in which the attributes were defined.
	 * 
	 * @return list of attribute elements.
	 */
	List<IWorkflowAttribute> getAttributeList();

	/**
	 * Returns the value of an attribute of the current element.
	 * 
	 * @param name
	 *            local name of attribute
	 * @return value of attribute or <code>null</code>, if no attribute with the
	 *         specified name is found.
	 */
	String getAttributeValue(final String name);

	/**
	 * Returns child element of the current element at the position
	 * <code>index</code>.
	 * 
	 * @param index
	 *            the index position.
	 * @return child element at position <code>index</code>.
	 */
	IWorkflowElement getChild(final int index);

	/**
	 * Number of child elements of the current element.
	 * 
	 * @return number of child elements.
	 */
	int getChildrenCount();

	/**
	 * Returns a list containing all child elements.
	 * 
	 * @return list of child elements.
	 */
	List<IWorkflowElement> getChildrenList();

	/**
	 * Returns the value of field <code>document</code>.
	 * 
	 * @return value of <code>document</code>.
	 */
	IDocument getDocument();

	/**
	 * Returns the position range of the whole element.
	 * 
	 * @return position range of whole element.
	 */
	ElementPositionRange getElementRange();

	/**
	 * Returns the type of the current element.
	 * 
	 * @return type of current element.
	 */
	WorkflowElementType getElementType();

	/**
	 * Returns the type of the current element as a string.
	 * 
	 * @return string representation of the type of the current element.
	 */
	String getElementTypeString();

	/**
	 * Returns the value of field <code>endElementRange</code>.
	 * 
	 * @return value of <code>endElementRange</code>.
	 */
	ElementPositionRange getEndElementRange();

	/**
	 * Returns the attached source file reference, if any.
	 * 
	 * @return the attached source file reference or <code>null</code> if none
	 *         exists
	 */
	IFile getFile();

	ElementPositionRange getFirstLineRange();

	/**
	 * Returns the name of the icon image of the current element.
	 * 
	 * @return name of image.
	 */
	String getImage();

	/**
	 * Returns the name of the mapped class for this element if there is one.
	 * 
	 * @return name of the mapped class or <code>null</code> if there is none.
	 */
	String getMappedClassName();

	/**
	 * Returns the type of the mapped class for this element if there is one.
	 * 
	 * @return type of the mapped class or <code>null</code> if there is none.
	 */
	IType getMappedClassType();

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	String getName();

	/**
	 * Returns the value of field <code>parent</code>.
	 * 
	 * @return value of <code>parent</code>.
	 */
	IWorkflowElement getParent();

	/**
	 * Returns the value of field <code>startElementRange</code>.
	 * 
	 * @return value of <code>startElementRange</code>.
	 */
	ElementPositionRange getStartElementRange();

	/**
	 * Checks if the current element has a certain attribute.
	 * 
	 * @param name
	 *            name of attribute
	 * @return <code>true</code> if the current element has an attribute named
	 *         <code>name</code>, otherwise <code>false</code>
	 */
	boolean hasAttribute(final String name);

	/**
	 * Checks if the current element has any attributes attached.
	 * 
	 * @return <code>true</code> if current elements has attributes, otherwise
	 *         <code>false</code>.
	 */
	boolean hasAttributes();

	/**
	 * Checks if the current element has any children attached.
	 * 
	 * @return <code>true</code> if current elements has children, otherwise
	 *         <code>false</code>.
	 */
	boolean hasChildren();

	/**
	 * Checks if the current element has a reference to its source file.
	 * 
	 * @return <code>true</code> if the current element has a reference to its
	 *         source file, otherwise <code>false</code>
	 */
	boolean hasFile();

	/**
	 * Checks if the current element has a class it is mapped to.
	 * 
	 * @return <code>true</code> if there exists a class to which the current
	 *         element is mapped, otherwise <code>false</code>
	 */
	boolean hasMappedClass();

	/**
	 * Checks if the current element has a parent node.
	 * 
	 * @return <code>true</code> if field <code>parent</code> is not
	 *         <code>null</code>.
	 */
	boolean hasParent();

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
	 *         <code>false</code>.
	 */
	boolean isCompose();

	/**
	 * Checks if the current element is a file property.
	 * 
	 * @return <code>true</code> if current element is a file property,
	 *         otherwise <code>false</code>.
	 */
	boolean isFileProperty();

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
	 *         otherwise <code>false</code>.
	 */
	boolean isLeaf();

	/**
	 * Checks if the current element is a property.
	 * 
	 * @return <code>true</code> if current element is a property, otherwise
	 *         <code>false</code>.
	 */
	boolean isProperty();

	/**
	 * Checks if the current element is a simple property.
	 * 
	 * @return <code>true</code> if current element is a simple property,
	 *         otherwise <code>false</code>.
	 */
	boolean isSimpleProperty();

	/**
	 * Checks if the current element is a valid child element for
	 * <code>parentElement</code>.
	 * 
	 * @param parentElement
	 *            the potential parent element.
	 * @return <code>true</code> if the current element is a valid child for
	 *         <code>parentElement</code>, otherwise <code>false</code>.
	 */
	boolean isValidChildFor(final IWorkflowElement parentElement);

	/**
	 * Checks if the current element is a workflow container.
	 * 
	 * @return <code>true</code> if current element is a workflow container,
	 *         otherwise <code>false</code>.
	 */
	boolean isWorkflow();

	/**
	 * Checks if the current element is a workflow file container.
	 * 
	 * @return <code>true</code> if current element is a workflow file
	 *         container, otherwise <code>false</code>.
	 */
	boolean isWorkflowFile();

	/**
	 * Sets a new value for field <code>endElementRange</code>.
	 * 
	 * @param endElementRange
	 *            new value for <code>endElementRange</code>.
	 */
	void setEndElementRange(final ElementPositionRange endElementRange);

	/**
	 * Sets the image of the current element.
	 * 
	 * @param image
	 *            the image.
	 */
	void setImage(final String image);

	/**
	 * Sets a new value for field <code>parent</code>.
	 * 
	 * @param parent
	 *            new value for <code>parent</code>.
	 */
	void setParent(final IWorkflowElement parent);

	/**
	 * Sets a new value for field <code>startElementRange</code>.
	 * 
	 * @param startElementRange
	 *            new value for <code>startElementRange</code>.
	 */
	void setStartElementRange(final ElementPositionRange startElementRange);

	/**
	 * Sets the type of the current element.
	 * 
	 * @param type
	 *            the type.
	 */
	void setType(final WorkflowElementType type);

}