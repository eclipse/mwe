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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class ClassContentProposalComputer extends AbstractSpecializedStringContentProposalComputer {

	private static final String BINARY_PREFIX = "bin.";

	private static final String WORKFLOW_COMPONENT_BASE_CLASS = "org.eclipse.emf.mwe.core.WorkflowComponent";

	private static final String OLD_WORKFLOW_COMPONENT_BASE_CLASS = "org.openarchitectureware.workflow.WorkflowComponent";

	private static final String FRAGMENT_ROOT = "org.eclipse.xtext.generator.IGeneratorFragment";

	private static final String[] TRIGGER_ATTRIBUTES = { IWorkflowAttribute.CLASS_ATTRIBUTE };

	public ClassContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	public static IType getWorkflowComponentBaseClass(final IFile file) {
		if (file == null)
			throw new IllegalArgumentException();

		IType baseType = TypeUtils.findType(file.getProject(), WORKFLOW_COMPONENT_BASE_CLASS);
		if (baseType == null) {
			baseType = TypeUtils.findType(file.getProject(), OLD_WORKFLOW_COMPONENT_BASE_CLASS);
		}
		return baseType;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getTriggerAttributeNames</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractSpecializedStringContentProposalComputer#getTriggerAttributeNames()
	 */
	@Override
	public String[] getTriggerAttributeNames() {
		return TRIGGER_ATTRIBUTES;
	}

	@Override
	protected List<ExtendedCompletionProposal> createProposal(final String text, final int offset) {
		final List<ExtendedCompletionProposal> result = new ArrayList<ExtendedCompletionProposal>();
		final String simpleName = TypeUtils.getSimpleClassName(text);
		final int length = text.length() - simpleName.length() - 1;
		String packageName = null;
		if (length >= 0) {
			packageName = text.substring(0, length);
		}

		final String displayText = simpleName
				+ ((packageName != null && packageName.length() > 0) ? " (" + packageName + ")" : "");
		final TextInfo currentText = currentText(document, offset);
		final Image img = EditorImages.getImage(EditorImages.COMPONENT);
		if (packageName == null || !packageName.startsWith(BINARY_PREFIX)) {
			result.add(new ExtendedCompletionProposal(text, currentText.getDocumentOffset(), currentText.getText()
					.length(), text.length(), img, displayText, null, null));
			result.add(new ExtendedCompletionProposal(text, currentText.getDocumentOffset(), currentText.getText()
					.length(), text.length(), img, text, null, null));
		}
		return result;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createProposalText</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractContentProposalComputer#createProposalText(java.lang.String,
	 *      int)
	 */
	@Override
	protected String createProposalText(final String name, final int offset) {
		return name;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getProposalSet</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractContentProposalComputer#getProposalSet(int)
	 */
	@Override
	protected Set<String> getProposalSet(final int offset) {
		final String tag = getTag(offset);

		Set<String> classNames = null;
		IType baseType = null;
		if (IWorkflowElementTypeInfo.COMPONENT_TAG.equals(tag)) {
			baseType = getWorkflowComponentBaseClass(file);
			classNames = getSubTypes(baseType);
		}
		else if (IWorkflowElementTypeInfo.FRAGMENT_TAG.equals(tag)) {
			baseType = TypeUtils.findType(file.getProject(), FRAGMENT_ROOT);
			classNames = getSubTypes(baseType);
		}

		if (classNames == null) {
			classNames = TypeUtils.getAllClasses(file.getProject(), new NullProgressMonitor());
		}

		return classNames;
	}

	private Set<String> getSubTypes(final IType baseType) {
		if (baseType != null) {
			final Set<IType> classes = TypeUtils.getSubTypes(file.getProject(), baseType, new NullProgressMonitor());
			final Set<String> classNames = TypeUtils.createClassNameSet(classes);
			return classNames;
		}
		return null;
	}
}
