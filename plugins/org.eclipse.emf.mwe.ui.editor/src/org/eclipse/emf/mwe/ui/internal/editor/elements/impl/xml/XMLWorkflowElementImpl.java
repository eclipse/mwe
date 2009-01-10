/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.HierarchyChecker;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.jface.text.IDocument;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */

public class XMLWorkflowElementImpl implements IRangeCheck, IWorkflowElement {

	private final IDocument document;

	private final String name;

	private ElementPositionRange startElementRange;

	private ElementPositionRange endElementRange;

	private IWorkflowElement parent;

	private WorkflowElementType type;

	private String image;

	private boolean recomputeTypeInfo;

	private final List<IWorkflowElement> children =
		new ArrayList<IWorkflowElement>();

	private final Map<String, IWorkflowAttribute> attributes =
		new HashMap<String, IWorkflowAttribute>();

	/**
	 * Creates a workflow element.
	 * 
	 * @param document
	 *            the containing document.
	 * @param name
	 *            the name of the element.
	 */
	public XMLWorkflowElementImpl(final IDocument document, final String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.document = document;
		this.name = name;
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addAttribute(IWorkflowAttribute)
	 */
	public void addAttribute(final IWorkflowAttribute attribute) {
		attributes.put(attribute.getName(), attribute);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addChild(IWorkflowElement)
	 */
	public void addChild(final IWorkflowElement element) {
		element.setParent(this);
		children.add(element);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#clear()
	 */
	public void clear() {
		children.clear();
		attributes.clear();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttribute(java.lang.String)
	 */
	public IWorkflowAttribute getAttribute(final String name) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		return attributes.get(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributeCount()
	 */
	public int getAttributeCount() {
		return attributes.size();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributes()
	 */
	public Collection<IWorkflowAttribute> getAttributes() {
		return attributes.values();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributeValue(java.lang.String)
	 */
	public String getAttributeValue(final String name) {
		if (hasAttribute(name))
			return attributes.get(name).getValue();
		return null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChild(int)
	 */
	public IWorkflowElement getChild(final int index) {
		if (index < 0 || index >= getChildrenCount())
			throw new IllegalArgumentException();

		return children.get(index);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChildrenCount()
	 */
	public int getChildrenCount() {
		return children.size();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChildrenList()
	 */
	public List<IWorkflowElement> getChildrenList() {
		return children;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getDefaultClass()
	 */
	public String getDefaultClass() {
		return WorkflowElementTypeComputer.getDefaultClass(this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getDocument()
	 */
	public IDocument getDocument() {
		return document;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementRange()
	 */
	public ElementPositionRange getElementRange() {
		return new ElementPositionRange(document, startElementRange,
				endElementRange).trimWhitespace();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementType()
	 */
	public WorkflowElementType getElementType() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}

		return type;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementTypeString()
	 */
	public String getElementTypeString() {
		return getElementType().toString();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getEndElementRange()
	 */
	public ElementPositionRange getEndElementRange() {
		return endElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getFirstLineRange()
	 */
	public ElementPositionRange getFirstLineRange() {
		if (startElementRange == null)
			return null;

		return startElementRange.getFirstLine().trimWhitespace();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getImage()
	 */
	public String getImage() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}

		return image;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getParent()
	 */
	public IWorkflowElement getParent() {
		return parent;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getStartElementRange()
	 */
	public ElementPositionRange getStartElementRange() {
		return startElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasAttribute(java.lang.String)
	 */
	public boolean hasAttribute(final String name) {
		return attributes.containsKey(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasAttributes()
	 */
	public boolean hasAttributes() {
		return getAttributeCount() > 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasChildren()
	 */
	public boolean hasChildren() {
		return getChildrenCount() > 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasParent()
	 */
	public boolean hasParent() {
		return parent != null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isAssignment()
	 */
	public boolean isAssignment() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENT;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isAssignmentProperty()
	 */
	public boolean isAssignmentProperty() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENTPROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isComponent()
	 */
	public boolean isComponent() {
		return getComputedElementType() == WorkflowElementType.COMPONENT
		|| isIfComponent();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isFileProperty()
	 */
	public boolean isFileProperty() {
		return getComputedElementType() == WorkflowElementType.FILE_PROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isIfComponent()
	 */
	public boolean isIfComponent() {
		return getComputedElementType() == WorkflowElementType.IF_COMPONENT;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getElementRange().isInRange(offset);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isLeaf()
	 */
	public boolean isLeaf() {
		return getChildrenCount() == 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isProperty()
	 */
	public boolean isProperty() {
		return isSimpleProperty() || isFileProperty();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isSimpleProperty()
	 */
	public boolean isSimpleProperty() {
		return getComputedElementType() == WorkflowElementType.SIMPLE_PROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isValidChildFor(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement)
	 */
	public boolean isValidChildFor(final IWorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isWorkflow()
	 */
	public boolean isWorkflow() {
		return getComputedElementType() == WorkflowElementType.WORKFLOW;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isWorkflowFile()
	 */
	public boolean isWorkflowFile() {
		return getComputedElementType() == WorkflowElementType.WORKFLOWFILE;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setEndElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setEndElementRange(final ElementPositionRange endElementRange) {
		this.endElementRange = endElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setImage(java.lang.String)
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setParent(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement)
	 */
	public void setParent(final IWorkflowElement parent) {
		this.parent = parent;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setStartElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setStartElementRange(
			final ElementPositionRange startElementRange) {
		this.startElementRange = startElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setType(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType)
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
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}

		return type;
	}
}
