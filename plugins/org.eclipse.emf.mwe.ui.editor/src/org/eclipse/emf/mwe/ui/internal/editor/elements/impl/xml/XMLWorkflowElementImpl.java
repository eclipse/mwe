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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.HierarchyChecker;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.Property;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.17 $
 */
public class XMLWorkflowElementImpl extends AbstractWorkflowElement {

	private IProject project;

	private WorkflowEditor editor;

	private final IDocument document;

	private final String name;

	private ElementPositionRange startElementRange;

	private ElementPositionRange endElementRange;

	private AbstractWorkflowElement parent;

	private WorkflowElementType type;

	private IPropertyContainer propertyContainer;

	private String image;

	private boolean recomputeTypeInfo;

	private final List<AbstractWorkflowElement> children = new ArrayList<AbstractWorkflowElement>();

	private final Map<String, IWorkflowAttribute> attributes = new HashMap<String, IWorkflowAttribute>();

	/**
	 * Instantiates a new xML workflow element impl.
	 * 
	 * @param editor
	 *            the editor
	 * @param project
	 *            the project
	 * @param document
	 *            the document
	 * @param name
	 *            the name
	 */
	public XMLWorkflowElementImpl(WorkflowEditor editor, IProject project, final IDocument document, final String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.editor = editor;
		this.project = project;
		this.document = document;
		this.name = name;
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#addAttribute(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute)
	 */
	public void addAttribute(final IWorkflowAttribute attribute) {
		attributes.put(attribute.getName(), attribute);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addChild(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void addChild(final AbstractWorkflowElement element) {
		element.setParent(this);
		children.add(element);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#addProperties(java.util.Collection)
	 */
	public void addProperties(Collection<Property> collection) {
		initializePropertyContainer();
		propertyContainer.addProperties(collection);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#addProperty(org.eclipse.emf.mwe.ui.internal.editor.elements.Property)
	 */
	public void addProperty(Property property) {
		initializePropertyContainer();
		propertyContainer.addProperty(property);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#clear()
	 */
	public void clear() {
		children.clear();
		attributes.clear();
		if (isPropertyContainerInitialized()) {
			propertyContainer.clear();
			propertyContainer = null;
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#getAttribute(java.lang.String)
	 */
	public IWorkflowAttribute getAttribute(final String name) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		return attributes.get(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#getAttributeCount()
	 */
	public int getAttributeCount() {
		return attributes.size();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#getAttributeList()
	 */
	public List<IWorkflowAttribute> getAttributeList() {
		List<IWorkflowAttribute> result = new LinkedList<IWorkflowAttribute>();
		for (IWorkflowAttribute attr : attributes.values()) {
			result.add(attr);
		}
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#getAttributeValue(java.lang.String)
	 */
	public String getAttributeValue(final String name) {
		if (hasAttribute(name))
			return attributes.get(name).getValue();
		return null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getChild(int)
	 */
	public AbstractWorkflowElement getChild(final int index) {
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
	public List<AbstractWorkflowElement> getChildrenList() {
		return children;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getDocument()
	 */
	public IDocument getDocument() {
		return document;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#getElementRange()
	 */
	public ElementPositionRange getElementRange() {
		return new ElementPositionRange(document, startElementRange, endElementRange).trimWhitespace();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#getElementType()
	 */
	public WorkflowElementType getElementType() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}

		return type;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#getElementTypeString()
	 */
	public String getElementTypeString() {
		return getElementType().toString();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#getEndElementRange()
	 */
	public ElementPositionRange getEndElementRange() {
		return endElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#getFirstLineRange()
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getMappedClassName()
	 */
	public String getMappedClassName() {
		return WorkflowElementTypeComputer.getDefaultClass(this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getMappedClassType()
	 */
	public IType getMappedClassType() {
		IType type = null;
		String name = getMappedClassName();
		if (hasProject() && name != null) {
			type = TypeUtils.findType(getProject(), name);
		}

		return type;
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
	public AbstractWorkflowElement getParent() {
		return parent;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getProject()
	 */
	public IProject getProject() {
		if (editor != null && editor.getInputFile() != null)
			return editor.getInputFile().getProject();

		return project;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperties()
	 */
	public Collection<Property> getProperties() {
		return isPropertyContainerInitialized() ? propertyContainer.getProperties() : new LinkedList<Property>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperty(java.lang.String)
	 */
	public Property getProperty(String name) {
		return isPropertyContainerInitialized() ? propertyContainer.getProperty(name) : null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyNames()
	 */
	public Set<String> getPropertyNames() {
		return isPropertyContainerInitialized() ? propertyContainer.getPropertyNames() : new HashSet<String>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferenceProperties()
	 */
	public Collection<Property> getReferenceProperties() {
		return isPropertyContainerInitialized() ? propertyContainer.getReferenceProperties()
				: new LinkedList<Property>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferencePropertyNames()
	 */
	public Set<String> getReferencePropertyNames() {
		return propertyContainer.getReferencePropertyNames();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValueProperties()
	 */
	public Collection<Property> getSimpleValueProperties() {
		return isPropertyContainerInitialized() ? propertyContainer.getSimpleValueProperties()
				: new LinkedList<Property>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValuePropertyNames()
	 */
	public Set<String> getSimpleValuePropertyNames() {
		return isPropertyContainerInitialized() ? propertyContainer.getSimpleValuePropertyNames()
				: new HashSet<String>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#getStartElementRange()
	 */
	public ElementPositionRange getStartElementRange() {
		return startElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#hasAttribute(java.lang.String)
	 */
	public boolean hasAttribute(final String name) {
		return attributes.containsKey(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#hasAttributes()
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasMappedClass()
	 */
	public boolean hasMappedClass() {
		return getMappedClassType() != null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasParent()
	 */
	public boolean hasParent() {
		return parent != null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasProject()
	 */
	public boolean hasProject() {
		return (editor != null && editor.getInputFile() != null) || project != null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperties()
	 */
	public boolean hasProperties() {
		return propertyContainer.hasProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperty(java.lang.String)
	 */
	public boolean hasProperty(String name) {
		return propertyContainer.hasProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasReferenceProperty(java.lang.String)
	 */
	public boolean hasReferenceProperty(String name) {
		return isPropertyContainerInitialized() ? propertyContainer.hasReferenceProperty(name) : false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasSimpleValueProperty(java.lang.String)
	 */
	public boolean hasSimpleValueProperty(String name) {
		return isPropertyContainerInitialized() ? propertyContainer.hasSimpleValueProperty(name) : false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isAssignment()
	 */
	public boolean isAssignment() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENT;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isAssignmentProperty()
	 */
	public boolean isAssignmentProperty() {
		return getComputedElementType() == WorkflowElementType.ASSIGNMENTPROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isComponent()
	 */
	public boolean isComponent() {
		return getComputedElementType() == WorkflowElementType.COMPONENT || isIfComponent();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isCompose()
	 */
	public boolean isCompose() {
		return getComputedElementType() == WorkflowElementType.COMPOSE;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isFileProperty()
	 */
	public boolean isFileProperty() {
		return getComputedElementType() == WorkflowElementType.FILE_PROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isFragment()
	 */
	public boolean isFragment() {
		return getComputedElementType() == WorkflowElementType.FRAGMENT;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isIfComponent()
	 */
	public boolean isIfComponent() {
		return getComputedElementType() == WorkflowElementType.IF_COMPONENT;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getElementRange().isInRange(offset);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isInstantiable()
	 */
	public boolean isInstantiable() {
		IType type = getMappedClassType();
		return (type != null) ? TypeUtils.isInstantiable(type) : false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isLeaf()
	 */
	public boolean isLeaf() {
		return getChildrenCount() == 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isProperty()
	 */
	public boolean isProperty() {
		return isSimpleProperty() || isFileProperty();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isSimpleProperty()
	 */
	public boolean isSimpleProperty() {
		return getComputedElementType() == WorkflowElementType.SIMPLE_PROPERTY;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isValidChildFor(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public boolean isValidChildFor(final AbstractWorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isWorkflow()
	 */
	public boolean isWorkflow() {
		return getComputedElementType() == WorkflowElementType.WORKFLOW;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#isWorkflowFile()
	 */
	public boolean isWorkflowFile() {
		return getComputedElementType() == WorkflowElementType.WORKFLOWFILE;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#propertyCount()
	 */
	public int propertyCount() {
		return isPropertyContainerInitialized() ? propertyContainer.propertyCount() : 0;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#setEndElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setParent(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void setParent(final AbstractWorkflowElement parent) {
		this.parent = parent;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#setStartElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setStartElementRange(final ElementPositionRange startElementRange) {
		this.startElementRange = startElementRange;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo#setType(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType)
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

	private void initializePropertyContainer() {
		if (!isPropertyContainerInitialized()) {
			propertyContainer = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		}
	}

	private boolean isPropertyContainerInitialized() {
		return propertyContainer != null;
	}
}
