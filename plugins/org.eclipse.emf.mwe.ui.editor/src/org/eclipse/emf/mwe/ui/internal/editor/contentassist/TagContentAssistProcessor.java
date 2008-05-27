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
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextType;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextTypeComputer;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.8 $
 */
public class TagContentAssistProcessor implements IContentAssistProcessor {

	private final IFile file;

	private final WorkflowEditor editor;

	private final WorkflowTagScanner tagScanner;

	private TagContentProposalComputerRegistry registry;

	public TagContentAssistProcessor(final IFile file,
			final WorkflowEditor editor, final WorkflowTagScanner tagScanner) {
		this.file = file;
		this.editor = editor;
		this.tagScanner = tagScanner;
	}

	/**
	 * This method overrides the implementation of
	 * <code>computeCompletionProposals</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer,
	 *      int)
	 */
	public ICompletionProposal[] computeCompletionProposals(
			final ITextViewer viewer, final int offset) {
		final IDocument document = viewer.getDocument();
		setupRegistry(document);
		final TextType textType =
				TextTypeComputer.computeType(document, offset);
		registry.setTextType(textType);
		final Set<ICompletionProposal> result =
				registry.computeProposals(offset);
		return result.toArray(new ICompletionProposal[result.size()]);
	}

	public IContextInformation[] computeContextInformation(
			final ITextViewer viewer, final int offset) {
		return null;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}

	private void setupRegistry(final IDocument document) {
		if (registry == null) {
			registry =
					new TagContentProposalComputerRegistry(file, editor,
							document, tagScanner);
		}
	}
}
