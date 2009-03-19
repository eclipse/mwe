/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.20 $
 */
public class XMLWorkflowElementImpl extends AbstractWorkflowElement {

	private IProject project;

	private WorkflowEditor editor;

	private String image;

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
		super(document, name);
		this.editor = editor;
		this.project = project;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getFile()
	 */
	public IFile getFile() {
		return (editor != null) ? editor.getInputFile() : null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#getImage()
	 */
	public String getImage() {
		computeTypeInfo();
		return image;
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#hasProject()
	 */
	public boolean hasProject() {
		return (editor != null && editor.getInputFile() != null) || project != null;
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement#setImage(java.lang.String)
	 */
	public void setImage(final String image) {
		this.image = image;
	}
}
