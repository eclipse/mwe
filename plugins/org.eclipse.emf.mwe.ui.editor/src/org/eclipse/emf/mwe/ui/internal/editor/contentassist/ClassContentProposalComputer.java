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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */

public class ClassContentProposalComputer extends
		AbstractSpecializedStringContentProposalComputer {

	private static final String WORKFLOW_BASE_CLASS =
			"org.eclipse.emf.mwe.core.WorkflowComponent";

	private static final String OLD_WORKFLOW_BASE_CLASS =
			"org.openarchitectureware.workflow.WorkflowComponent";

	private static final String[] TRIGGER_ATTRIBUTES =
			{ WorkflowElement.CLASS_ATTRIBUTE };

	private static final String COMPONENT_TAG = "component";

	public ClassContentProposalComputer(final IFile file,
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
		turnOffSorting();
	}

	public static Class<?> getWorkflowBaseClass(final IFile file) {
		if (file == null)
			throw new IllegalArgumentException();

		Class<?> baseClass =
				ReflectionManager.getClass(file, WORKFLOW_BASE_CLASS);
		if (baseClass == null) {
			baseClass =
					ReflectionManager.getClass(file, OLD_WORKFLOW_BASE_CLASS);
		}
		return baseClass;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getTriggerAttributeNames</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.AbstractSpecializedStringContentProposalComputer#getTriggerAttributeNames()
	 */
	@Override
	public String[] getTriggerAttributeNames() {
		return TRIGGER_ATTRIBUTES;
	}

	@Override
	protected ExtendedCompletionProposal createProposal(final String text,
			final int offset) {
		int o = offset;
		try {
			if (o > 0 && document.getChar(o - 1) != '>') {
				o--;
			}
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}

		final String displayText = ReflectionManager.getSimpleClassName(text);
		final TextInfo currentText = currentText(document, o);
		final Image img = EditorImages.getImage(EditorImages.COMPONENT);
		return new ExtendedCompletionProposal(text, currentText
				.getDocumentOffset(), currentText.getText().length(), text
				.length(), img, displayText, null, null);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createProposalText</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.AbstractContentProposalComputer#createProposalText(java.lang.String,
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
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.AbstractContentProposalComputer#getProposalSet(int)
	 */
	@Override
	protected Set<String> getProposalSet(final int offset) {
		final String tag = getTag(offset);

		Set<String> classNames = null;
		if (COMPONENT_TAG.equals(tag)) {
			final Class<?> baseClass = getWorkflowBaseClass(file);
			if (baseClass != null) {
				classNames =
						ReflectionManager.getSubClasses(file, baseClass, true);
			}
		} else {
			classNames = ReflectionManager.getAllClasses(file, true);
		}

		return classNames;
	}
}