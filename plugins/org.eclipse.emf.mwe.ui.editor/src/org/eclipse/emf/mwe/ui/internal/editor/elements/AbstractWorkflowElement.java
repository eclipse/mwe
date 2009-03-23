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

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.WorkflowElementTypeComputer;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

public abstract class AbstractWorkflowElement implements IWorkflowElement, IAttributeContainer,
		IWorkflowElementTypeInfo, IRangeCheck, IRangeInfo, IClassMapping, IPropertyContainerAccess {

	protected final String name;

	private ElementPositionRange startElementRange;

	private ElementPositionRange endElementRange;

	private AbstractWorkflowElement parent;

	private WorkflowElementType type;

	private File file;

	private IPropertyContainer propertyContainer;

	private boolean recomputeTypeInfo = true;

	private final List<AbstractWorkflowElement> children = new ArrayList<AbstractWorkflowElement>();

	private final Map<String, IWorkflowAttribute> attributes = new HashMap<String, IWorkflowAttribute>();

	private final IDocument document;

	public AbstractWorkflowElement(IDocument document, String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.document = document;
		this.name = name;
		propertyContainer = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#clear()
	 */
	public void clear() {
		children.clear();
		attributes.clear();
		propertyContainer.clear();
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
	 * Returns the value of field <code>file</code>.
	 * 
	 * @return value of <code>file</code>.
	 */
	public File getFile() {
		return file;
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
	 * @return
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getImportedProperties()
	 */
	public IPropertyContainer getImportedProperties() {
		return propertyContainer.getImportedProperties();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperties()
	 */
	public Collection<Property> getProperties() {
		return getPropertyContainer().getProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getProperty(java.lang.String)
	 */
	public Property getProperty(String name) {
		return getPropertyContainer().getProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyCount()
	 */
	public int getPropertyCount() {
		return getPropertyContainer().getPropertyCount();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getPropertyNames()
	 */
	public Set<String> getPropertyNames() {
		return getPropertyContainer().getPropertyNames();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferenceProperties()
	 */
	public Collection<Property> getReferenceProperties() {
		return getPropertyContainer().getReferenceProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getReferencePropertyNames()
	 */
	public Set<String> getReferencePropertyNames() {
		return getPropertyContainer().getReferencePropertyNames();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValueProperties()
	 */
	public Collection<Property> getSimpleValueProperties() {
		return getPropertyContainer().getSimpleValueProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getSimpleValuePropertyNames()
	 */
	public Set<String> getSimpleValuePropertyNames() {
		return getPropertyContainer().getSimpleValuePropertyNames();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperties()
	 */
	public boolean hasProperties() {
		return getPropertyContainer().hasProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperty(java.lang.String)
	 */
	public boolean hasProperty(String name) {
		return getPropertyContainer().hasProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasReferenceProperty(java.lang.String)
	 */
	public boolean hasReferenceProperty(String name) {
		return getPropertyContainer().hasReferenceProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasSimpleProperty(java.lang.String)
	 */
	public boolean hasSimpleProperty(String name) {
		return getPropertyContainer().hasSimpleProperty(name);

	}

	/**
	 * @return
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#isEmpty()
	 */
	public boolean isEmpty() {
		return getPropertyContainer().isEmpty();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isValidChildFor(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public boolean isValidChildFor(final AbstractWorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeInfo#setEndElementRange(org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange)
	 */
	public void setEndElementRange(final ElementPositionRange endElementRange) {
		this.endElementRange = endElementRange;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(IFile file) {
		this.file = convertToFile(file);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setParent(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void setParent(final AbstractWorkflowElement parent) {
		this.parent = parent;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setPropertyContainer(org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer)
	 */
	public void setPropertyContainer(IPropertyContainer propertyContainer) {
		if (propertyContainer == null)
			throw new IllegalArgumentException();

		this.propertyContainer = propertyContainer;
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
	protected void computeTypeInfo() {
		if (!recomputeTypeInfo)
			return;

		recomputeTypeInfo = false;
		WorkflowElementTypeComputer.computeTypeInfo(this);
	}

	/**
	 * Converts an <codeIFile</code> object to a <code>File</code> object.
	 * 
	 * @param file
	 *            the <code>IFile</code> object
	 * @return the converted <code>File</code> object
	 */
	protected File convertToFile(IFile file) {
		if (file == null)
			return null;

		URI uri = file.getLocationURI();
		if (uri != null)
			return new File(uri);

		return null;
	}

	/**
	 * Returns the computed type of the current workflow element.
	 * 
	 * @return computed type of current element.
	 */
	protected WorkflowElementType getComputedElementType() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}
		return type;
	}

	protected IPropertyContainer getPropertyContainer() {
		if (propertyContainer.isEmpty()) {
			if (hasParent())
				return getParent().getPropertyContainer();
		}
		return propertyContainer;
	}

}
