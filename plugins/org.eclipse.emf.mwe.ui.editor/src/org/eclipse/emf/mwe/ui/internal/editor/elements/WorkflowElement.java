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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.IDocument;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.26 $
 */

public class WorkflowElement implements IRangeCheck {

	public static final String WORKFLOWFILE_TAG = "workflowfile";

	public static final String FILE_ATTRIBUTE = "file";

	public static final String VALUE_ATTRIBUTE = "value";

	public static final String NAME_ATTRIBUTE = "name";

	public static final String CLASS_ATTRIBUTE = "class";

	public static final String ID_REF_ATTRIBUTE = "idRef";

	public static final String ID_ATTRIBUTE = "id";

	public static final String PROPERTY_TAG = "property";

	public static final String WORKFLOW_TAG = "workflow";

	public static final String COMPONENT_TAG = "component";

	public static final String IF_COMPONENT_TAG = "if";

	private final IDocument document;

	private final String name;

	private ElementPositionRange startElementRange;

	private ElementPositionRange endElementRange;

	private WorkflowElement parent;

	private WorkflowElementType type;

	private String image;

	private boolean recomputeTypeInfo;

	private final List<WorkflowElement> children =
			new ArrayList<WorkflowElement>();

	private final Map<String, WorkflowAttribute> attributes =
			new HashMap<String, WorkflowAttribute>();

	/**
	 * Creates a workflow element.
	 * 
	 * @param document
	 *            the containing document.
	 * @param name
	 *            the name of the element.
	 */
	public WorkflowElement(final IDocument document, final String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.document = document;
		this.name = name;
		recomputeTypeInfo = true;
	}

	/**
	 * Adds an attribute to the current element.
	 * 
	 * @param attribute
	 *            attribute added to current element.
	 */
	public void addAttribute(final WorkflowAttribute attribute) {
		attributes.put(attribute.getName(), attribute);
		recomputeTypeInfo = true;
	}

	/**
	 * Add child element to the current element.
	 * 
	 * @param element
	 *            child element added to current element.
	 */
	public void addChild(final WorkflowElement element) {
		element.setParent(this);
		children.add(element);
		recomputeTypeInfo = true;
	}

	/**
	 * Deletes all attributes and children of the current element.
	 */
	public void clear() {
		children.clear();
		attributes.clear();
	}

	/**
	 * Returns the specified attribute of the current element.
	 * 
	 * @param name
	 *            name of the requested attribute.
	 * @return the requested attribute or <code>null</code>, if no attribute
	 *         with the specified name is found.
	 */
	public WorkflowAttribute getAttribute(final String name) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		return attributes.get(name);
	}

	/**
	 * Number of attributes of the current element.
	 * 
	 * @return number of attributes.
	 */
	public int getAttributeCount() {
		return attributes.size();
	}

	/**
	 * Returns a collection containing all attributes of the currect element.
	 * Please notice that the order of attributes within the collection does not
	 * necessarily match the order in which the attributes were defined.
	 * 
	 * @return a collection of all attributes of current element.
	 */
	public Collection<WorkflowAttribute> getAttributes() {
		return attributes.values();
	}

	/**
	 * Returns the value of an attribute of the current element.
	 * 
	 * @param name
	 *            local name of attribute
	 * @return value of attribute or <code>null</code>, if no attribute with
	 *         the specified name is found.
	 */
	public String getAttributeValue(final String name) {
		if (hasAttribute(name))
			return attributes.get(name).getValue();
		return null;
	}

	/**
	 * Returns child element of the current element at the position
	 * <code>index</code>.
	 * 
	 * @param index
	 *            the index position.
	 * @return child element at position <code>index</code>.
	 */
	public WorkflowElement getChild(final int index) {
		if (index < 0 || index >= getChildrenCount())
			throw new IllegalArgumentException();

		return children.get(index);
	}

	/**
	 * Number of child elements of the current element.
	 * 
	 * @return number of child elements.
	 */
	public int getChildrenCount() {
		return children.size();
	}

	/**
	 * Returns a list containing all child elements.
	 * 
	 * @return list of child elements.
	 */
	public List<WorkflowElement> getChildrenList() {
		return children;
	}

	/**
	 * Returns the default mapped class for this element if there is a default.
	 * 
	 * @return the default mapped class or <code>null</code> if there is no
	 *         default.
	 */
	public Class<?> getDefaultClass() {
		return WorkflowElementTypeComputer.getDefaultClass(this);
	}

	/**
	 * Returns the value of field <code>document</code>.
	 * 
	 * @return value of <code>document</code>.
	 */
	public IDocument getDocument() {
		return document;
	}

	/**
	 * Returns the position range of the whole element.
	 * 
	 * @return position range of whole element.
	 */
	public ElementPositionRange getElementRange() {
		return new ElementPositionRange(document, startElementRange,
				endElementRange).trimWhitespace();
	}

	/**
	 * Returns the type of the current element.
	 * 
	 * @return type of current element.
	 */
	public WorkflowElementType getElementType() {
		if (recomputeTypeInfo || type == null) {
			computeTypeInfo();
		}

		return type;
	}

	/**
	 * Returns the type of the current element as a string.
	 * 
	 * @return string representation of the type of the current element.
	 */
	public String getElementTypeString() {
		return getElementType().toString();
	}

	/**
	 * Returns the value of field <code>endElementRange</code>.
	 * 
	 * @return value of <code>endElementRange</code>.
	 */
	public ElementPositionRange getEndElementRange() {
		return endElementRange;
	}

	public ElementPositionRange getFirstLineRange() {
		return startElementRange.getFirstLine().trimWhitespace();
	}

	/**
	 * Returns the name of the icon image of the current element.
	 * 
	 * @return name of image.
	 */
	public String getImage() {
		if (recomputeTypeInfo)
			computeTypeInfo();

		return image;
	}

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the value of field <code>parent</code>.
	 * 
	 * @return value of <code>parent</code>.
	 */
	public WorkflowElement getParent() {
		return parent;
	}

	/**
	 * Returns the value of field <code>startElementRange</code>.
	 * 
	 * @return value of <code>startElementRange</code>.
	 */
	public ElementPositionRange getStartElementRange() {
		return startElementRange;
	}

	public boolean hasAttribute(final String name) {
		return attributes.containsKey(name);
	}

	/**
	 * Checks if the current element has any attributes attached.
	 * 
	 * @return <code>true</code> if current elements has attributes, otherwise
	 *         <code>false</code>.
	 */
	public boolean hasAttributes() {
		return getAttributeCount() > 0;
	}

	/**
	 * Checks if the current element has a parent node.
	 * 
	 * @return <code>true</code> if field <code>parent</code> is not
	 *         <code>null</code>.
	 */
	public boolean hasParent() {
		return parent != null;
	}

	/**
	 * Checks if the current element is an assignment.
	 * 
	 * @return <code>true</code> if current element is an assignment,
	 *         otherwise <code>false</code>.
	 */
	public boolean isAssignment() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENT;
	}

	/**
	 * Checks if the current element is an assignment property.
	 * 
	 * @return <code>true</code> if current element is an assignment property,
	 *         otherwise <code>false</code>.
	 */
	public boolean isAssignmentProperty() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENTPROPERTY;
	}

	/**
	 * Checks if the current element is a component.
	 * 
	 * @return <code>true</code> if current element is a component, otherwise
	 *         <code>false</code>.
	 */
	public boolean isComponent() {
		return getComputedElementType() == WorkflowElementType.COMPONENT
				|| isIfComponent();
	}

	/**
	 * Checks if the current element is a file property.
	 * 
	 * @return <code>true</code> if current element is a file property,
	 *         otherwise <code>false</code>.
	 */
	public boolean isFileProperty() {
		return getComputedElementType() == WorkflowElementType.FILE_PROPERTY;
	}

	/**
	 * Checks if the current element is an if-component.
	 * 
	 * @return <code>true</code> if current element is an if-component,
	 *         otherwise <code>false</code>.
	 */
	public boolean isIfComponent() {
		return getComputedElementType() == WorkflowElementType.IF_COMPONENT;
	}

	/**
	 * This method overrides the implementation of <code>isInRange</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getElementRange().isInRange(offset);
	}

	/**
	 * Checks if the current element is a leaf element.
	 * 
	 * @return <code>true</code> if current element has no child elements,
	 *         otherwise <code>false</code>.
	 */
	public boolean isLeaf() {
		return getChildrenCount() == 0;
	}

	/**
	 * Checks if the current element is a property.
	 * 
	 * @return <code>true</code> if current element is a property, otherwise
	 *         <code>false</code>.
	 */
	public boolean isProperty() {
		return isSimpleProperty() || isFileProperty();
	}

	/**
	 * Checks if the current element is a simple property.
	 * 
	 * @return <code>true</code> if current element is a simple property,
	 *         otherwise <code>false</code>.
	 */
	public boolean isSimpleProperty() {
		return getComputedElementType() == WorkflowElementType.SIMPLE_PROPERTY;
	}

	/**
	 * Checks if the current element is a valid child element for
	 * <code>parentElement</code>.
	 * 
	 * @param parentElement
	 *            the potential parent element.
	 * @return <code>true</code> if the current element is a valid child for
	 *         <code>parentElement</code>, otherwise <code>false</code>.
	 */
	public boolean isValidChildFor(final WorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * Checks if the current element is a workflow container.
	 * 
	 * @return <code>true</code> if current element is a workflow container,
	 *         otherwise <code>false</code>.
	 */
	public boolean isWorkflow() {
		return getComputedElementType() == WorkflowElementType.WORKFLOW;
	}

	/**
	 * Checks if the current element is a workflow file container.
	 * 
	 * @return <code>true</code> if current element is a workflow file
	 *         container, otherwise <code>false</code>.
	 */
	public boolean isWorkflowFile() {
		return getComputedElementType() == WorkflowElementType.WORKFLOWFILE;
	}

	/**
	 * Sets a new value for field <code>endElementRange</code>.
	 * 
	 * @param endElementRange
	 *            new value for <code>endElementRange</code>.
	 */
	public void setEndElementRange(final ElementPositionRange endElementRange) {
		this.endElementRange = endElementRange;
	}

	/**
	 * Sets the image of the current element.
	 * 
	 * @param image
	 *            the image.
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * Sets a new value for field <code>parent</code>.
	 * 
	 * @param parent
	 *            new value for <code>parent</code>.
	 */
	public void setParent(final WorkflowElement parent) {
		this.parent = parent;
	}

	/**
	 * Sets a new value for field <code>startElementRange</code>.
	 * 
	 * @param startElementRange
	 *            new value for <code>startElementRange</code>.
	 */
	public void setStartElementRange(
			final ElementPositionRange startElementRange) {
		this.startElementRange = startElementRange;
	}

	/**
	 * Sets the type of the current element.
	 * 
	 * @param type
	 *            the type.
	 */
	public void setType(final WorkflowElementType type) {
		this.type = type;
	}

	/**
	 * Computes the type information for the current element.
	 */
	private void computeTypeInfo() {
		recomputeTypeInfo = false;
		WorkflowElementTypeComputer.computeTypeInfo(this);
	}

	/**
	 * Returns the computed type of the current workflow element.
	 * 
	 * @return computed type of current element.
	 */
	private WorkflowElementType getComputedElementType() {
		if (recomputeTypeInfo)
			computeTypeInfo();

		return type;
	}
}
