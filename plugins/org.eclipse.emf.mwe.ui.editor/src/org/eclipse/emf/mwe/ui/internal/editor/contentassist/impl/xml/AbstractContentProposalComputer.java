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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.13 $
 */

public abstract class AbstractContentProposalComputer implements IContentProposalComputer {

	public class StringComparator implements Comparator<String> {

		public int compare(final String str1, final String str2) {
			if (str1 == str2)
				return 0;
			else if (str1 == null)
				return -1;
			else if (str2 == null)
				return 1;

			return str1.compareTo(str2);
		}
	}

	private class ProposalComparator implements Comparator<ICompletionProposal> {

		public int compare(final ICompletionProposal proposal1, final ICompletionProposal proposal2) {
			if (proposal1 == proposal2)
				return 0;
			else if (proposal1 == null)
				return -1;
			else if (proposal2 == null)
				return 1;

			return proposal1.getDisplayString().compareTo(proposal2.getDisplayString());
		}
	}

	protected static Set<Character> terminalSet;

	protected static Set<Character> extendedTerminalSet;

	private static final char[] TERMINALS = { '"', '\'' };

	private static final char[] EXTENDED_TERMINALS = { '<', '>' };

	protected IFile file;

	protected WorkflowEditor editor;

	protected final IDocument document;

	protected final WorkflowTagScanner tagScanner;

	protected TextType textType;

	protected boolean needsSorting = true;

	protected AbstractContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		this.file = file;
		this.editor = editor;
		this.document = document;
		this.tagScanner = tagScanner;
		textType = TextType.UNDEFINED;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>computeProposals</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#computeProposals(int)
	 */
	public List<ICompletionProposal> computeProposals(final int offset) {
		List<ICompletionProposal> results = new ArrayList<ICompletionProposal>();
		final Set<String> proposals = getProposalSet(offset);
		if (proposals != null) {
			for (final String rawText : proposals) {
				final String proposalText = createProposalText(rawText, offset);
				results.addAll(createProposal(proposalText, offset));
			}
			results = removeNonMatchingEntries(results, offset);
		}
		if (needsSorting) {
			Collections.sort(results, new ProposalComparator());
		}
		return results;
	}

	public String getTag(final int offset) {
		if (offset <= 0)
			return null;

		try {
			String result = "";
			int ofs = offset;
			boolean moved = false;
			char ch = 0;
			while (ofs >= 0 && (ch = document.getChar(ofs)) != '<') {
				moved = true;
				ofs--;
			}

			if (moved) {
				ofs++;
			}

			if (ch != '<')
				return null;

			while (ofs <= document.getLength() && !Character.isWhitespace(ch = document.getChar(ofs))) {
				result += Character.toString(ch);
				ofs++;
			}
			return result;
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return null;
		}
	}

	public TextType getTextType() {
		return textType;
	}

	public void setTextType(final TextType textType) {
		this.textType = textType;
	}

	protected List<ExtendedCompletionProposal> createProposal(final String text, final int offset) {
		final List<ExtendedCompletionProposal> result = new ArrayList<ExtendedCompletionProposal>();

		final TextInfo currentText = currentText(document, offset);
		result.add(new ExtendedCompletionProposal(text, currentText.getDocumentOffset(),
				currentText.getText().length(), text.length()));
		return result;
	}

	protected abstract String createProposalText(final String name, final int offset);

	protected Set<Character> createTerminalSet(final char[] charArray) {
		final Set<Character> resultSet = new HashSet<Character>();
		for (final Character c : charArray) {
			resultSet.add(c);
		}
		return resultSet;
	}

	protected TextInfo currentText(final IDocument document, final int documentOffset) {
		try {
			final ITypedRegion region = document.getPartition(documentOffset);
			final int partitionOffset = region.getOffset();
			final int partitionLength = region.getLength();
			int index = documentOffset - partitionOffset;

			if (documentOffset > partitionOffset) {
				final char ch = document.getChar(documentOffset - 1);
				if (!isTerminal(terminalSet(), ch)) {
					index--;
				}
			}

			final String partitionText = document.get(partitionOffset, partitionLength);

			if (partitionText.length() == 0)
				return new TextInfo("", 0, true);

			int start = index;

			char c = partitionText.charAt(start);

			boolean moved = false;
			while (!isTerminal(terminalSet(), c) && start >= 0) {
				moved = true;
				start--;
				if (start >= 0) {
					c = partitionText.charAt(start);
				}
			}
			if (moved && (isTerminal(terminalSet(), c) || start < 0)) {
				start++;
			}

			int end = index;
			c = partitionText.charAt(end);

			moved = false;
			while (!isTerminal(terminalSet(), c) && end < partitionLength - 1) {
				moved = true;
				end++;
				c = partitionText.charAt(end);
			}

			if (moved && isTerminal(terminalSet(), c)) {
				end--;
			}

			String substring = partitionText.substring(start, end + 1);
			int startOffset = partitionOffset + start;
			final int length = documentOffset - startOffset;
			substring = substring.substring(0, length);
			if ("'".equals(substring) || "\"".equals(substring) || "\r".equals(substring) || "\n".equals(substring)) {
				substring = "";
				start++;
				startOffset++;
			}

			return new TextInfo(substring, startOffset, false);
		}
		catch (final BadLocationException e) {
			Log.logError(e);
		}
		return null;
	}

	protected Set<Character> extendedTerminalSet() {
		if (extendedTerminalSet == null) {
			extendedTerminalSet = new HashSet<Character>();
			extendedTerminalSet.addAll(terminalSet());
			extendedTerminalSet.addAll(createTerminalSet(EXTENDED_TERMINALS));
		}
		return extendedTerminalSet;
	}

	protected IFile getFile() {
		return file;
	}

	protected abstract Set<String> getProposalSet(final int offset);

	protected AbstractWorkflowElement getRoot() {
		if (editor != null)
			return editor.getRootElement();

		return null;
	}

	protected boolean isAttribute() {
		return getTextType() == TextType.ATTRIBUTE;
	}

	protected boolean isOutsideTag() {
		return getTextType() == TextType.OUTSIDE_TAG;
	}

	protected boolean isProposalIncluded(final String proposalText, final String currentText) {
		final String prop = proposalText.toLowerCase();
		final String curr = currentText.toLowerCase();
		return prop.trim().startsWith(curr.trim());
	}

	protected boolean isString() {
		return getTextType() == TextType.STRING;
	}

	protected boolean isTag() {
		return getTextType() == TextType.TAG;
	}

	protected boolean isTerminal(final Set<Character> terminals, final char ch) {
		if (terminals == null)
			throw new IllegalArgumentException();

		return terminals.contains(ch) || Character.isWhitespace(ch) || ch == '\r';
	}

	protected List<ICompletionProposal> removeNonMatchingEntries(final List<ICompletionProposal> results,
			final int offset) {
		final List<ICompletionProposal> cleanedResults = new ArrayList<ICompletionProposal>();
		final TextInfo currentText = currentText(document, offset);
		for (final ICompletionProposal p : results) {
			if (isProposalIncluded(p.getDisplayString(), currentText.getText())) {
				cleanedResults.add(p);
			}
		}
		return cleanedResults;
	}

	protected Set<Character> terminalSet() {
		if (terminalSet == null) {
			terminalSet = createTerminalSet(TERMINALS);
		}
		return terminalSet;
	}

	protected void turnOffSorting() {
		needsSorting = false;
	}
}
