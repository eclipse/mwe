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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */

public class PropertyContentProposalComputer extends AbstractStringContentProposalComputer {

	public PropertyContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		text = "${" + name + "}";
		return text;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractContentProposalComputer#createProposal(java.lang.String,
	 *      int)
	 */
	@Override
	protected List<ExtendedCompletionProposal> createProposal(final String text, final int offset) {
		final List<ExtendedCompletionProposal> result = new ArrayList<ExtendedCompletionProposal>();
		int o = offset;
		try {
			if (o > 0 && document.getChar(o - 1) != '>') {
				o--;
			}
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}

		final TextInfo currentText = currentText(document, o);
		String displayText = null;
		if (!currentText.getText().startsWith("$")) {
			displayText = text.substring(2, text.length() - 1);
		}

		if (displayText != null) {
			result.add(new ExtendedCompletionProposal(text, currentText.getDocumentOffset(), currentText.getText()
					.length(), text.length(), null, displayText, null, null));
		}
		else {
			result.add(new ExtendedCompletionProposal(text, currentText.getDocumentOffset(), currentText.getText()
					.length(), text.length()));
		}
		return result;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> result = new HashSet<String>();
		final AbstractWorkflowElement element = WorkflowElementSearcher.searchCompleteParentElement(editor
				.getRootElement(), document, offset);
		if (element != null) {
			result.addAll(element.getSimpleValuePropertyNames());
		}

		return result;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>removeNonMatchingEntries</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractContentProposalComputer#removeNonMatchingEntries(java.util.Set,
	 *      int)
	 */
	@Override
	protected List<ICompletionProposal> removeNonMatchingEntries(final List<ICompletionProposal> proposalSet,
			final int offset) {
		final List<ICompletionProposal> resultSet = new ArrayList<ICompletionProposal>();
		final int o = offset > 0 ? offset - 1 : offset;
		final TextInfo currentText = currentText(document, o);
		final String startText = currentText.getText();
		for (final ICompletionProposal p : proposalSet) {
			if ("".equals(startText) || p.getDisplayString().startsWith(startText)) {
				resultSet.add(p);
			}
		}
		return resultSet;
	}

}
