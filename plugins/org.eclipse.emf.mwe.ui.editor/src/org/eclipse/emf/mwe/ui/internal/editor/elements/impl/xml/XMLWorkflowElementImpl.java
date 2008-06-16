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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.HierarchyChecker;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementTypeComputer;
import org.eclipse.jface.text.IDocument;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
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

	private final List<XMLWorkflowElementImpl> children =
			new ArrayList<XMLWorkflowElementImpl>();

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
	public XMLWorkflowElementImpl(final IDocument document, final String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.document = document;
		this.name = name;
		recomputeTypeInfo = true;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>addAttribute</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addAttribute(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute)
	 */
	public void addAttribute(final WorkflowAttribute attribute) {
		attributes.put(attribute.getName(), attribute);
		recomputeTypeInfo = true;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>addChild</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addChild(org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl)
	 */
	public void addChild(final XMLWorkflowElementImpl element) {
		element.setParent(this);
		children.add(element);
		recomputeTypeInfo = true;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>clear</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#clear()
	 */
	public void clear() {
		children.clear();
		attributes.clear();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getAttribute</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttribute(java.lang.String)
	 */
	public WorkflowAttribute getAttribute(final String name) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		return attributes.get(name);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getAttributeCount</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributeCount()
	 */
	public int getAttributeCount() {
		return attributes.size();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getAttributes</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributes()
	 */
	public Collection<WorkflowAttribute> getAttributes() {
		return attributes.values();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getAttributeValue</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getAttributeValue(java.lang.String)
	 */
	public String getAttributeValue(final String name) {
		if (hasAttribute(name))
			return attributes.get(name).getValue();
		return null;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getChild</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChild(int)
	 */
	public XMLWorkflowElementImpl getChild(final int index) {
		if (index < 0 || index >= getChildrenCount())
			throw new IllegalArgumentException();

		return children.get(index);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getChildrenCount</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChildrenCount()
	 */
	public int getChildrenCount() {
		return children.size();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getChildrenList</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChildrenList()
	 */
	public List<XMLWorkflowElementImpl> getChildrenList() {
		return children;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getDefaultClass</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getDefaultClass()
	 */
	public Class<?> getDefaultClass() {
		return WorkflowElementTypeComputer.getDefaultClass(this);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getDocument</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getDocument()
	 */
	public IDocument getDocument() {
		return document;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getElementRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementRange()
	 */
	public ElementPositionRange getElementRange() {
		return new ElementPositionRange(document, startElementRange,
				endElementRange).trimWhitespace();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getElementType</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementType()
	 */
	public WorkflowElementType getElementType() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}

		return type;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getElementTypeString</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getElementTypeString()
	 */
	public String getElementTypeString() {
		return getElementType().toString();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getEndElementRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getEndElementRange()
	 */
	public ElementPositionRange getEndElementRange() {
		return endElementRange;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getFirstLineRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getFirstLineRange()
	 */
	public ElementPositionRange getFirstLineRange() {
		if (startElementRange == null)
			return null;

		return startElementRange.getFirstLine().trimWhitespace();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getImage</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getImage()
	 */
	public String getImage() {
		if (recomputeTypeInfo)
			computeTypeInfo();

		return image;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getName</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getParent</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getParent()
	 */
	public IWorkflowElement getParent() {
		return parent;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>getStartElementRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getStartElementRange()
	 */
	public ElementPositionRange getStartElementRange() {
		return startElementRange;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>hasAttribute</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasAttribute(java.lang.String)
	 */
	public boolean hasAttribute(final String name) {
		return attributes.containsKey(name);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>hasAttributes</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasAttributes()
	 */
	public boolean hasAttributes() {
		return getAttributeCount() > 0;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>hasParent</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasParent()
	 */
	public boolean hasParent() {
		return parent != null;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isAssignment</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isAssignment()
	 */
	public boolean isAssignment() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENT;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isAssignmentProperty</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isAssignmentProperty()
	 */
	public boolean isAssignmentProperty() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENTPROPERTY;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isComponent</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isComponent()
	 */
	public boolean isComponent() {
		return getComputedElementType() == WorkflowElementType.COMPONENT
				|| isIfComponent();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isFileProperty</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isFileProperty()
	 */
	public boolean isFileProperty() {
		return getComputedElementType() == WorkflowElementType.FILE_PROPERTY;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isIfComponent</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isIfComponent()
	 */
	public boolean isIfComponent() {
		return getComputedElementType() == WorkflowElementType.IF_COMPONENT;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isInRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getElementRange().isInRange(offset);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isLeaf</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isLeaf()
	 */
	public boolean isLeaf() {
		return getChildrenCount() == 0;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isProperty</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isProperty()
	 */
	public boolean isProperty() {
		return isSimpleProperty() || isFileProperty();
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isSimpleProperty</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isSimpleProperty()
	 */
	public boolean isSimpleProperty() {
		return getComputedElementType() == WorkflowElementType.SIMPLE_PROPERTY;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isValidChildFor</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isValidChildFor(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement)
	 */
	public boolean isValidChildFor(final IWorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isWorkflow</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isWorkflow()
	 */
	public boolean isWorkflow() {
		return getComputedElementType() == WorkflowElementType.WORKFLOW;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>isWorkflowFile</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isWorkflowFile()
	 */
	public boolean isWorkflowFile() {
		return getComputedElementType() == WorkflowElementType.WORKFLOWFILE;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>setEndElementRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setEndElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setEndElementRange(final ElementPositionRange endElementRange) {
		this.endElementRange = endElementRange;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>setImage</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setImage(java.lang.String)
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>setParent</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setParent(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement)
	 */
	public void setParent(final IWorkflowElement parent) {
		this.parent = parent;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>setStartElementRange</code> inherited from the superclass.
	 *
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setStartElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setStartElementRange(
			final ElementPositionRange startElementRange) {
		this.startElementRange = startElementRange;
	}

	/**
	 * This automatically generated method overrides the implementation 
	 * of <code>setType</code> inherited from the superclass.
	 *
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
		if (recomputeTypeInfo)
			computeTypeInfo();

		return type;
	}
}
