/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;

public interface IWorkflowElement {

	/**
	 * Add child element to the current element.
	 * 
	 * @param element
	 *            child element added to current element
	 */
	void addChild(final AbstractWorkflowElement element);

	/**
	 * Deletes all attributes and children of the current element.
	 */
	void clear();

	/**
	 * Returns child element of the current element at the position
	 * <code>index</code>.
	 * 
	 * @param index
	 *            the index position
	 * @return child element at position <code>index</code>
	 */
	AbstractWorkflowElement getChild(final int index);

	/**
	 * Number of child elements of the current element.
	 * 
	 * @return number of child elements
	 */
	int getChildrenCount();

	/**
	 * Returns a list containing all child elements.
	 * 
	 * @return list of child elements
	 */
	List<AbstractWorkflowElement> getChildrenList();

	/**
	 * Returns the document
	 * 
	 * @return the document
	 */
	IDocument getDocument();

	/**
	 * Returns the file that the current element is associated with.
	 * 
	 * @return the associated file or <code>null</code> if no such association
	 *         exists
	 */
	File getFile();

	/**
	 * Returns the file that the current element is associated with as an
	 * <code>IFile</code> object.
	 * 
	 * @return the associated file or <code>null</code> if no such association
	 *         exists
	 */
	IFile getIFile();

	/**
	 * Returns the name of the icon image of the current element.
	 * 
	 * @return name of image
	 */
	String getImage();

	/**
	 * Returns the name of the mapped class for this element if there is one.
	 * 
	 * @return name of the mapped class or <code>null</code> if there is none
	 */
	String getMappedClassName();

	/**
	 * Returns the type of the mapped class for this element if there is one.
	 * 
	 * @return type of the mapped class or <code>null</code> if there is none
	 */
	IType getMappedClassType();

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>
	 */
	String getName();

	/**
	 * Returns the value of field <code>parent</code>.
	 * 
	 * @return value of <code>parent</code>.
	 */
	AbstractWorkflowElement getParent();

	/**
	 * Returns the attached source file reference, if any.
	 * 
	 * @return the attached source file reference or <code>null</code> if none
	 *         exists
	 */
	IProject getProject();

	/**
	 * Returns the root element.
	 * 
	 * @return the root element
	 */
	AbstractWorkflowElement getRoot();

	/**
	 * Checks if the current element has any children attached.
	 * 
	 * @return <code>true</code> if current elements has children, otherwise
	 *         <code>false</code>
	 */
	boolean hasChildren();

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
	 *         <code>null</code>
	 */
	boolean hasParent();

	/**
	 * Checks if the current element has a reference to its source file.
	 * 
	 * @return <code>true</code> if the current element has a reference to its
	 *         source file, otherwise <code>false</code>
	 */
	boolean hasProject();

	/**
	 * Checks if the current element is a valid child element for
	 * <code>parentElement</code>.
	 * 
	 * @param parentElement
	 *            the potential parent element.
	 * @return <code>true</code> if the current element is a valid child for
	 *         <code>parentElement</code>, otherwise <code>false</code>
	 */
	boolean isValidChildFor(final AbstractWorkflowElement parentElement);

	/**
	 * Remove current element from parent.
	 */
	void remove();

	/**
	 * Sets the file that the current element is associated with.
	 * 
	 * @param file
	 *            the associated file
	 */
	void setFile(File file);

	/**
	 * Sets the file that the current element is associated with.
	 * 
	 * @param file
	 *            the associated file
	 */
	void setFile(IFile file);

	/**
	 * Sets the image of the current element.
	 * 
	 * @param image
	 *            the image.
	 */
	void setImage(final String image);

	/**
	 * Sets the parent element for the current element
	 * 
	 * @param parent
	 *            the parent element
	 */
	void setParent(final AbstractWorkflowElement parent);

	/**
	 * Attaches a property container to the current element.
	 * 
	 * @param container
	 *            the container to attach
	 */
	void setPropertyContainer(IPropertyContainer container);

	/**
	 * Sets the reference to the root element for the current element.
	 * 
	 * @param rootElement
	 *            the root element
	 */
	void setRoot(AbstractWorkflowElement rootElement);
}