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
import java.util.List;

import org.eclipse.jface.text.Position;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.9 $
 */

public class WorkflowElement {

    public static final String WORKFLOWFILE_TAG = "workflowfile";

    public static final String FILE_ATTRIBUTE = "file";

    public static final String VALUE_ATTRIBUTE = "value";

    public static final String NAME_ATTRIBUTE = "name";

    public static final String PROPERTY_TAG = "property";

    public static final String WORKFLOW_TAG = "workflow";

    protected static final String COMPONENT_TAG = "component";

    private final String name;

    private Position position;

    private int startColumn;

    private int endColumn;

    private WorkflowElement parent;

    private WorkflowElementType type;

    private String image;

    private boolean recomputeTypeInfo;

    private final List<WorkflowElement> children =
            new ArrayList<WorkflowElement>();

    private final List<WorkflowAttribute> attributes =
            new ArrayList<WorkflowAttribute>();

    public WorkflowElement(final String name) {
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
        attributes.add(attribute);
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
     * Returns the attribute at the position <code>index</code>.
     * 
     * @param index
     *            index of attribute.
     * @return the requested attribute.
     */
    public WorkflowAttribute getAttribute(final int index) {
        if (index < 0 || index >= getAttributeCount())
            throw new IllegalArgumentException();

        return attributes.get(index);
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
     * Returns the value of an attribute of the current element.
     * 
     * @param name
     *            local name of attribute
     * @return value of attribute or <code>null</code>, if no attribute with
     *         the specified name is found.
     */
    public String getAttributeValue(final String name) {
        for (final WorkflowAttribute attr : attributes) {
            if (name.equals(attr.getName()))
                return attr.getValue();
        }
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
     * Returns the type of the current element.
     * 
     * @return type of current element.
     */
    public WorkflowElementType getElementType() {
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
     * Returns the value of field <code>endColumn</code>.
     * 
     * @return value of <code>endColumn</code>.
     */
    public int getEndColumn() {
        return endColumn;
    }

    /**
     * Returns the offset of the end line of the current element.
     * 
     * @return offset of end line.
     */
    public int getEndOffset() {
        return getStartOffset() + getLength() - 1;
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
     * Returns the length of current element.
     * 
     * @return length of element.
     */
    public int getLength() {
        return position.getLength();
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
     * Returns the value of field <code>position</code>.
     * 
     * @return value of <code>position</code>.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Returns the value of field <code>startColumn</code>.
     * 
     * @return value of <code>startColumn</code>.
     */
    public int getStartColumn() {
        return startColumn;
    }

    /**
     * Returns the offset of start line of the current element.
     * 
     * @return offset of start line.
     */
    public int getStartOffset() {
        return position.getOffset();
    }

    public boolean hasAttribute(final String name) {
        for (final WorkflowAttribute attr : attributes) {
            if (name.equals(attr.getName()))
                return true;
        }
        return false;
    }

    /**
     * Checks if the current element has any attributes attached.
     * 
     * @return <code>true</code> if current elements has attributes, otherwise
     *         <code>false</code>.
     */
    public boolean hasAttributes() {
        return (getAttributeCount() > 0);
    }

    /**
     * Checks if the current element has a parent node.
     * 
     * @return <code>true</code> if field <code>parent</code> is not
     *         <code>null</code>.
     */
    public boolean hasParent() {
        return (parent != null);
    }

    /**
     * Checks if the current element is an assignment.
     * 
     * @return <code>true</code> if current element is an assignment,
     *         otherwise <code>false</code>.
     */
    public boolean isAssignment() {
        return (getComputedElementType() == WorkflowElementType.ASSIGNMENT);
    }

    /**
     * Checks if the current element is an assignment property.
     * 
     * @return <code>true</code> if current element is an assignment property,
     *         otherwise <code>false</code>.
     */
    public boolean isAssignmentProperty() {
        return (getComputedElementType() == WorkflowElementType.ASSIGNMENTPROPERTY);
    }

    /**
     * Checks if the current element is a component.
     * 
     * @return <code>true</code> if current element is a component, otherwise
     *         <code>false</code>.
     */
    public boolean isComponent() {
        return (WorkflowElementType.COMPONENT == getComputedElementType());
    }

    /**
     * Checks if the current element is a file property.
     * 
     * @return <code>true</code> if current element is a file property,
     *         otherwise <code>false</code>.
     */
    public boolean isFileProperty() {
        return (getComputedElementType() == WorkflowElementType.FILE_PROPERTY);
    }

    /**
     * Checks if the current element is a leaf element.
     * 
     * @return <code>true</code> if current element has no child elements,
     *         otherwise <code>false</code>.
     */
    public boolean isLeaf() {
        return (getChildrenCount() == 0);
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
        return (getComputedElementType() == WorkflowElementType.SIMPLE_PROPERTY);
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
        return (getComputedElementType() == WorkflowElementType.WORKFLOW);
    }

    /**
     * Checks if the current element is a workflow file container.
     * 
     * @return <code>true</code> if current element is a workflow file
     *         container, otherwise <code>false</code>.
     */
    public boolean isWorkflowFile() {
        return (getComputedElementType() == WorkflowElementType.WORKFLOWFILE);
    }

    /**
     * Sets a new value for field <code>endColumn</code>.
     * 
     * @param endColumn
     *            new value for <code>endColumn</code>.
     */
    public void setEndColumn(final int endColumn) {
        this.endColumn = endColumn;
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
     * Sets the length of the current element.
     * 
     * @param length
     *            length of element.
     */
    public void setLength(final int length) {
        createPosition();
        position.setLength(length);
    }

    /**
     * Sets the offset of the current element.
     * 
     * @param offset
     *            offset of current element.
     */
    public void setOffset(final int offset) {
        createPosition();
        position.setOffset(offset);
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
     * Sets a new value for field <code>startColumn</code>.
     * 
     * @param startColumn
     *            new value for <code>startColumn</code>.
     */
    public void setStartColumn(final int startColumn) {
        this.startColumn = startColumn;
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
     * Creates a <code>position</code> object.
     */
    private void createPosition() {
        if (position == null)
            position = new Position(0);
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
