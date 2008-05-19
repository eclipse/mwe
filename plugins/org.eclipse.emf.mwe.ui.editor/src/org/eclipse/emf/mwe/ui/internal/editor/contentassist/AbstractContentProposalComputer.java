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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.11 $
 */

public abstract class AbstractContentProposalComputer implements
		IContentProposalComputer {

	protected static Set<Character> terminalSet;

	protected static Set<Character> extendedTerminalSet;

	private static final char[] TERMINALS = { '"', '\'' };

	private static final char[] EXTENDED_TERMINALS = { '<', '>' };

	protected WorkflowEditor editor;

	protected final IDocument document;

	protected final WorkflowTagScanner tagScanner;

	protected TextType textType;

	protected AbstractContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
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
	public Set<ICompletionProposal> computeProposals(final int offset) {
		Set<ICompletionProposal> resultSet =
				new HashSet<ICompletionProposal>();
		final Set<String> proposals = getProposalSet(offset);
		for (final String rawText : proposals) {
			final String proposalText = createProposalText(rawText, offset);
			final ICompletionProposal proposal =
					createProposal(proposalText, offset);
			resultSet.add(proposal);
		}
		resultSet = removeNonMatchingEntries(resultSet, offset);

		return resultSet;
	}

	public TextType getTextType() {
		return textType;
	}

	public void setTextType(final TextType textType) {
		this.textType = textType;
	}

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

		final TextInfo currentText = currentText(document, o);
		return new ExtendedCompletionProposal(text, currentText
				.getDocumentOffset(), currentText.getText().length(), text
				.length());
	}

	protected abstract String createProposalText(final String name,
			final int offset);

	protected Set<Character> createTerminalSet(final char[] charArray) {
		final Set<Character> resultSet = new HashSet<Character>();
		for (final Character c : charArray) {
			resultSet.add(c);
		}
		return resultSet;
	}

	protected TextInfo currentText(final IDocument document,
			final int documentOffset) {
		try {
			final ITypedRegion region = document.getPartition(documentOffset);
			final int partitionOffset = region.getOffset();
			final int partitionLength = region.getLength();
			final int index = documentOffset - partitionOffset;

			final String partitionText =
					document.get(partitionOffset, partitionLength);

			char c = partitionText.charAt(index);

			int start = index;
			c = partitionText.charAt(start);

			boolean moved = false;
			while (!isTerminal(terminalSet(), c) && start >= 0) {
				moved = true;
				start--;
				if (start >= 0) {
					c = partitionText.charAt(start);
				}
			}
			if (moved) {
				start++;
			}

			int end = index;
			c = partitionText.charAt(end);

			while (!isTerminal(terminalSet(), c) && end < documentOffset) {
				end++;
				c = partitionText.charAt(end);
			}

			final String substring = partitionText.substring(start, end + 1);
			return new TextInfo(substring, partitionOffset + start, false);
		} catch (final BadLocationException e) {
			e.printStackTrace();
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

	protected abstract Set<String> getProposalSet(final int offset);

	protected boolean isAttribute() {
		return getTextType() == TextType.ATTRIBUTE;
	}

	protected boolean isOutsideTag() {
		return getTextType() == TextType.OUTSIDE_TAG;
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

		return terminals.contains(ch) || Character.isWhitespace(ch);
	}

	protected Set<ICompletionProposal> removeNonMatchingEntries(
			final Set<ICompletionProposal> proposalSet, final int offset) {
		final Set<ICompletionProposal> resultSet =
				new HashSet<ICompletionProposal>();
		try {
			if (offset > 0
					&& !isTerminal(extendedTerminalSet(), document
							.getChar(offset - 1))) {
				final TextInfo currentText = currentText(document, offset - 1);
				for (final ICompletionProposal p : proposalSet) {
					if (p.getDisplayString().startsWith(currentText.getText())) {
						resultSet.add(p);
					}
				}
			} else
				return proposalSet;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}

		return resultSet;
	}

	protected Set<Character> terminalSet() {
		if (terminalSet == null) {
			terminalSet = createTerminalSet(TERMINALS);
		}
		return terminalSet;
	}

	protected boolean useContractedElementCompletion(final int documentOffset,
			final IDocument document) {
		boolean textReached = false;
		boolean isRemainingWhiteSpace = true;
		try {
			final ITypedRegion region = document.getPartition(documentOffset);
			final int partitionOffset = region.getOffset();
			final int partitionLength = region.getLength();

			final int readLength = documentOffset - partitionOffset;
			final int remainingLength = partitionLength - readLength;

			if (document.getLength() >= documentOffset + 1) {
				final String firstTwo = document.get(partitionOffset, 2);
				if (firstTwo.equals("<<"))
					return false;
			}

			tagScanner.setRange(document, documentOffset, remainingLength);
			IToken token = tagScanner.nextToken();
			while (token != Token.WHITESPACE && token != Token.EOF) {
				isRemainingWhiteSpace = false;
				token = tagScanner.nextToken();
			}

			token = tagScanner.nextToken();
			while (token == Token.WHITESPACE && token != Token.EOF) {
				isRemainingWhiteSpace = true;
				token = tagScanner.nextToken();
			}

			final char c = (char) 0;
			while (c == tagScanner.read()) {
				if (c == ICharacterScanner.EOF)
					break;
				if (c == '<') {
					break;
				}
				if (!Character.isWhitespace(c))
					textReached = true;

			}
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}

		if (textReached || !isRemainingWhiteSpace)
			return true;

		return false;
	}
}
