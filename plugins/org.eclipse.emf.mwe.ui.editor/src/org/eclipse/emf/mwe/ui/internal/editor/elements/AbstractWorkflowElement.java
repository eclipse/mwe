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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.Property;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.WorkflowElementTypeComputer;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfoStore;
import org.eclipse.emf.mwe.ui.internal.editor.utils.FileUtils;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

public abstract class AbstractWorkflowElement implements IWorkflowElement, IAttributeContainer,
		IWorkflowElementTypeInfo, IRangeCheck, IRangeInfo, IClassMapping, IPropertyContainerAccess,
		IWorkflowElementReference {

	protected final String name;

	private ElementPositionRange startElementRange;

	private ElementPositionRange endElementRange;

	private AbstractWorkflowElement parent;

	private AbstractWorkflowElement root;

	private ReferenceInfoStore referenceInfoStore;

	private WorkflowElementType elementType;

	private File file;

	private IType classType;

	private IPropertyContainer propertyContainer;

	private boolean recomputeTypeInfo = true;

	private final List<AbstractWorkflowElement> children = new ArrayList<AbstractWorkflowElement>();

	private final Map<String, IWorkflowAttribute> attributes = new HashMap<String, IWorkflowAttribute>();

	private final IDocument document;

	public AbstractWorkflowElement(final IDocument document, final String name) {
		if (document == null || name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.document = document;
		this.name = name;
		propertyContainer = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		root = this;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IAttributeContainer#addAttribute(org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute)
	 */
	public void addAttribute(final IWorkflowAttribute attribute) {
		attribute.setElement(this);
		attributes.put(attribute.getName(), attribute);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#addChild(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void addChild(final AbstractWorkflowElement element) {
		element.setParent(this);
		element.setRoot(root);
		children.add(element);
		recomputeTypeInfo = true;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#addProperties(org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer)
	 */
	public void addProperties(final IPropertyContainer container) {
		propertyContainer.addProperties(container);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#addProperty(org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.Property)
	 */
	public void addProperty(final Property property) {
		propertyContainer.addProperty(property);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#addReference(AbstractWorkflowElement)
	 */
	public void addReference(final AbstractWorkflowElement element) {
		if (hasReferenceInfoStore()) {
			getReferenceInfoStore().addReference(element);
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#addReferenceDefinition(AbstractWorkflowElement)
	 */
	public boolean addReferenceDefinition(final AbstractWorkflowElement element) {
		if (element == null || !element.hasReferenceDefinition())
			throw new IllegalArgumentException();

		if (hasReferenceInfoStore()) {
			final ReferenceInfoStore store = getReferenceInfoStore();
			if (!store.hasDefinition(element)) {
				store.addDefinition(element);
				return true;
			}
			return false;
		}
		return true;
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
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AbstractWorkflowElement))
			return false;
		final AbstractWorkflowElement other = (AbstractWorkflowElement) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		}
		else if (!attributes.equals(other.attributes))
			return false;
		if (children == null) {
			if (other.children != null)
				return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		if (getElementType() == null) {
			if (other.getElementType() != null)
				return false;
		}
		else if (!getElementType().equals(other.getElementType()))
			return false;
		return true;
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
		final List<IWorkflowAttribute> result = new LinkedList<IWorkflowAttribute>();
		for (final IWorkflowAttribute attr : attributes.values()) {
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
	 * Returns the value of field <code>classType</code>.
	 * 
	 * @return value of <code>classType</code>.
	 */
	public IType getClassType() {
		return classType;
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

		return elementType;
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getFileReferenceProperties()
	 */
	public Collection<Property> getFileReferenceProperties() {
		return getPropertyContainer().getFileReferenceProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#getFileReferencePropertyNames()
	 */
	public Set<String> getFileReferencePropertyNames() {
		return getPropertyContainer().getFileReferencePropertyNames();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getImportedProperties()
	 */
	public IPropertyContainer getImportedProperties() {
		return getPropertyContainer().getImportedProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getLocalProperties()
	 */
	public IPropertyContainer getLocalProperties() {
		return getPropertyContainer().getLocalProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getMappedClassName()
	 */
	public String getMappedClassName() {
		final String name = WorkflowElementTypeComputer.computeClassName(this);
		if (name == null && hasParent())
			return getParent().getMappedClassName();

		return name;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getMappedClassType()
	 */
	public IType getMappedClassType() {
		if (classType != null)
			return classType;

		IType type = null;
		final String name = getMappedClassName();
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
	public Property getProperty(final String name) {
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#getReferencedElement()
	 */
	public AbstractWorkflowElement getReferencedElement() {
		if (hasReferenceInfoStore() && hasReference() && hasResolvedReference()) {
			getReferenceInfoStore().getReferencedElement(this);
		}

		return null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getRoot()
	 */
	public AbstractWorkflowElement getRoot() {
		return root;
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getUnresolvedReferencePropertyNames()
	 */
	public Set<String> getUnresolvedReferencePropertyNames() {
		return getPropertyContainer().getUnresolvedReferencePropertyNames();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#getUnresolvedReferences()
	 */
	public Collection<ReferenceInfo> getUnresolvedReferences() {
		if (hasReferenceInfoStore())
			return getReferenceInfoStore().getUnresolvedReferences();

		return new ArrayList<ReferenceInfo>();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#getValueReferencePropertyNames()
	 */
	public Set<String> getValueReferencePropertyNames() {
		return getPropertyContainer().getValueReferencePropertyNames();
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasFileReferenceProperty(java.lang.String)
	 */
	public boolean hasFileReferenceProperty(final String name) {
		return getPropertyContainer().hasFileReferenceProperty(name);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((getElementType() == null) ? 0 : getElementType().hashCode());
		return result;
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasProperty(java.lang.String)
	 */
	public boolean hasProperty(final String name) {
		return getPropertyContainer().hasProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#hasReference()
	 */
	public boolean hasReference() {
		return hasAttribute(IWorkflowAttribute.ID_REF_ATTRIBUTE);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#hasReferenceDefinition()
	 */
	public boolean hasReferenceDefinition() {
		return hasAttribute(IWorkflowAttribute.ID_ATTRIBUTE);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#hasResolvedReference()
	 */
	public boolean hasResolvedReference() {
		if (hasReferenceInfoStore())
			return hasReference() && getReferenceInfoStore().isResolvable(this);

		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#hasSimpleValueProperty(java.lang.String)
	 */
	public boolean hasSimpleValueProperty(final String name) {
		return getPropertyContainer().hasSimpleValueProperty(name);

	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#hasUnresolvedReferenceProperties()
	 */
	public boolean hasUnresolvedReferenceProperties() {
		return getPropertyContainer().hasUnresolvedReferenceProperties();
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#hasValueReferenceProperty(java.lang.String)
	 */
	public boolean hasValueReferenceProperty(final String name) {
		return getPropertyContainer().hasValueReferenceProperty(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer#isPropertyContainerEmpty()
	 */
	public boolean isPropertyContainerEmpty() {
		return getPropertyContainer().isPropertyContainerEmpty();
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
		final IType type = getMappedClassType();
		return (type != null) ? TypeUtils.isInstantiable(type) : false;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainerAccess#isResolved(java.lang.String)
	 */
	public boolean isResolved(final String name) {
		return getPropertyContainer().isResolved(name);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#isValidChildFor(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public boolean isValidChildFor(final AbstractWorkflowElement parentElement) {
		return HierarchyChecker.checkChildValidity(parentElement, this);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#remove()
	 */
	public void remove() {
		if (hasParent()) {
			getParent().removeChild(this);
		}
	}

	/**
	 * Sets a new value for field <code>classType</code>.
	 * 
	 * @param classType
	 *            new value for <code>classType</code>.
	 */
	public void setClassType(final IType classType) {
		this.classType = classType;
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
	public void setFile(final File file) {
		this.file = file;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(final IFile file) {
		this.file = FileUtils.convertToFile(file);
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
	public void setPropertyContainer(final IPropertyContainer propertyContainer) {
		if (propertyContainer == null)
			throw new IllegalArgumentException();

		this.propertyContainer = propertyContainer;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementReference#setReferenceInfoStore(org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfoStore)
	 */
	public void setReferenceInfoStore(final ReferenceInfoStore store) {
		if (hasParent()) {
			getRoot().setReferenceInfoStore(store);
		}
		else {
			referenceInfoStore = store;
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setRoot(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void setRoot(final AbstractWorkflowElement rootElement) {
		root = rootElement;
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
		this.elementType = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String attrList = "";
		for (final IWorkflowAttribute attr : getAttributeList()) {
			attrList += " " + attr.getName() + "=\"" + attr.getValue() + "\"";
		}
		return "<" + getName() + attrList + "/>";
	}

	/**
	 * Computes the elementType information for the current element.
	 */
	protected void computeTypeInfo() {
		if (!recomputeTypeInfo)
			return;

		recomputeTypeInfo = false;
		WorkflowElementTypeComputer.computeTypeInfo(this);
	}

	/**
	 * Returns the computed elementType of the current workflow element.
	 * 
	 * @return computed elementType of current element.
	 */
	protected WorkflowElementType getComputedElementType() {
		if (recomputeTypeInfo) {
			computeTypeInfo();
		}
		return elementType;
	}

	protected IPropertyContainer getPropertyContainer() {
		final IPropertyContainer result = WorkflowSyntaxFactory.getInstance().newPropertyContainer();
		if (hasParent()) {
			result.addProperties(getParent().getLocalProperties());
		}
		result.addProperties(propertyContainer);
		return result;
	}

	protected ReferenceInfoStore getReferenceInfoStore() {
		if (hasParent())
			return getRoot().getReferenceInfoStore();

		return referenceInfoStore;
	}

	protected boolean hasReferenceInfoStore() {
		return getReferenceInfoStore() != null;
	}

	protected void removeChild(final AbstractWorkflowElement element) {
		if (element == null)
			throw new IllegalArgumentException();

		int index = -1;
		for (int i = 0; i < getChildrenCount(); i++) {
			final AbstractWorkflowElement e = getChild(i);
			if (e == element) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			element.setParent(null);
			element.setRoot(element);
			children.remove(index);
		}
	}
}
