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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextType;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class ContentProposalComputerRegistry extends
		AbstractContentProposalComputer {

	protected final List<AbstractContentProposalComputer> computers =
			new ArrayList<AbstractContentProposalComputer>();

	public ContentProposalComputerRegistry(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	@Override
	public Set<ICompletionProposal> computeProposals(final int offset) {
		Set<ICompletionProposal> result = new HashSet<ICompletionProposal>();
		for (final AbstractContentProposalComputer c : computers) {
			if (c.isApplicable(offset)) {
				result = c.computeProposals(offset);
				break;
			}
		}
		return result;
	}

	@Override
	public TextType getTextType() {
		throw new UnsupportedOperationException();
	}

	public boolean isApplicable(int offset) {
		return true;
	}

	@Override
	public void setTextType(final TextType textType) {
		for (final AbstractContentProposalComputer c : computers) {
			c.setTextType(textType);
		}
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		return null;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		return null;
	}

}
