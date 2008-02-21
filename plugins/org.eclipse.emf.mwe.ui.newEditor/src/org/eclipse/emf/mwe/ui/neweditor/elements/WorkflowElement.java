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

package org.eclipse.emf.mwe.ui.neweditor.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.Position;
import org.eclipse.swt.graphics.Image;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */

public class WorkflowElement {

    private final String label;

    private Position position;

    private final Image image;

    private WorkflowElement parent;

    private final List<WorkflowElement> elementChildren =
            new ArrayList<WorkflowElement>();

    private final List<WorkflowAttribute> attributeChildren =
            new ArrayList<WorkflowAttribute>();

    public WorkflowElement(final String label, final int start,
            final int length) {
        this(label, start, length, null);
    }

    public WorkflowElement(final String label, final int start,
            final int length, final Image image) {
        this(label, new Position(start, length), image);
    }

    public WorkflowElement(final String label, final Position position,
            final Image image) {
        this.label = label;
        this.position = position;
        this.image = image;
    }

    /**
     * Adds an attribute to the current element.
     * 
     * @param attribute
     *            attribute added to current element.
     */
    public void addAttribute(final WorkflowAttribute attribute) {
        attributeChildren.add(attribute);
    }

    /**
     * Add child element to the current element.
     * 
     * @param element
     *            child element added to current element.
     */
    public void addChild(final WorkflowElement element) {
        element.setParent(this);
        elementChildren.add(element);
    }

    /**
     * Number of attributes of the current element.
     * 
     * @return number of attributes.
     */
    public int attributeCount() {
        return attributeChildren.size();
    }

    /**
     * Number of child elements of the current element.
     * 
     * @return number of child elements.
     */
    public int childrenCount() {
        return elementChildren.size();
    }

    /**
     * Deletes all attributes and children of the current element.
     */
    public void clear() {
        elementChildren.clear();
        attributeChildren.clear();
    }

    /**
     * Returns the value of an attribute of the current element.
     * 
     * @param localName
     *            local name of attribute
     * @return value of attribute or <code>null</code>, if no attribute with
     *         the specified name is found.
     */
    public String getAttributeValue(final String localName) {
        for (final WorkflowAttribute attr : attributeChildren) {
            if (localName.equals(attr.getName()))
                return attr.getValue();
        }
        return null;
    }

    /**
     * Returns the value of field <code>elementChildren</code>.
     * 
     * @return value of <code>elementChildren</code>.
     */
    public List<WorkflowElement> getElementChildren() {
        return elementChildren;
    }

    /**
     * Returns the value of field <code>image</code>.
     * 
     * @return value of <code>image</code>.
     */
    public Image getImage() {
        return image;
    }

    /**
     * Returns the value of field <code>label</code>.
     * 
     * @return value of <code>label</code>.
     */
    public String getLabel() {
        return label;
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
     * Returns the start line of the current element.
     * 
     * @return start line of element.
     */
    public int getStart() {
        return position.getOffset();
    }

    /**
     * Checks if the current element has any attributes attached.
     * 
     * @return <code>true</code> if current elements has attributes.
     */
    public boolean hasAttributes() {
        return (attributeCount() > 0);
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
     * Checks if the current element is a leaf element.
     * 
     * @return <code>true</code> if current element has no child elements.
     */
    public boolean isLeaf() {
        return (childrenCount() == 0);
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
     * Sets a new value for field <code>position</code>.
     * 
     * @param position
     *            new value for <code>position</code>.
     */
    public void setPosition(final Position position) {
        this.position = position;
    }

    /**
     * Sets the start line and the length of the current element.
     * 
     * @param start
     *            start line of current element.
     * @param length
     *            length of current element.
     */
    public void setStartLength(final int start, final int length) {
        setPosition(new Position(start, length));
    }
}
