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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.10 $
 */

public class PropertyContentProposalComputer extends
AbstractStringContentProposalComputer {

	public PropertyContentProposalComputer(final IFile file,
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		if (useContractedElementCompletion(offset, document)) {
			text = name;
		} else {
			text = "${" + name + "}";
		}
		return text;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> result = new HashSet<String>();
		final Collection<String> propertyNames = editor.getPropertyNames();
		if (propertyNames != null) {
			for (final String name : propertyNames) {
				final String proposalText = createProposalText(name, offset);
				result.add(proposalText);
			}
		}
		return result;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>removeNonMatchingEntries</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.AbstractContentProposalComputer#removeNonMatchingEntries(java.util.Set,
	 *      int)
	 */
	@Override
	protected List<ICompletionProposal> removeNonMatchingEntries(
			final List<ICompletionProposal> proposalSet, final int offset) {
		final List<ICompletionProposal> resultSet =
			new ArrayList<ICompletionProposal>();
		final int o = offset > 0 ? offset - 1 : offset;
		final TextInfo currentText = currentText(document, o);
		final String startText = currentText.getText();
		for (final ICompletionProposal p : proposalSet) {
			if ("".equals(startText)
					|| p.getDisplayString().startsWith(startText)) {
				resultSet.add(p);
			}
		}
		return resultSet;
	}

}
