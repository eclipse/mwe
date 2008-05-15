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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.5 $
 */

public class TagContentProposalComputer extends
		AbstractContentProposalComputer {

	private static final String[] DEFAULT_PROPOSALS =
			{ "workflow", "property", "component", "bean" };

	public TagContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>computeProposals</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#computeProposals(int)
	 */
	public Set<ICompletionProposal> computeProposals(final int offset) {
		final Collection<WorkflowElement> allElements = editor.getElements();

		Set<ICompletionProposal> resultSet = createDefaultProposals(offset);

		if (allElements != null) {
			for (final Object el : allElements) {
				final WorkflowElement element = (WorkflowElement) el;
				final String name = element.getName();
				final String text = createProposalText(name, offset);

				final ExtendedCompletionProposal proposal =
						createProposal(text, offset);
				resultSet.add(proposal);
			}
		}
		resultSet = removeNonMatchingEntries(resultSet, offset);
		return resultSet;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isApplicable</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#isApplicable(int)
	 */
	@Override
	public boolean isApplicable(final int offset) {
		return isTag(offset);
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		if (useContractedElementCompletion(offset, document)) {
			text = name;
		} else {
			text = "<" + name + ">";
		}
		return text;
	}

	private Set<ICompletionProposal> createDefaultProposals(final int offset) {
		final Set<ICompletionProposal> resultSet =
				new HashSet<ICompletionProposal>();
		for (final String s : DEFAULT_PROPOSALS) {
			final String proposalText = createProposalText(s, offset);
			final ExtendedCompletionProposal proposal =
					createProposal(proposalText, offset);
			resultSet.add(proposal);
		}
		return resultSet;
	}
}
