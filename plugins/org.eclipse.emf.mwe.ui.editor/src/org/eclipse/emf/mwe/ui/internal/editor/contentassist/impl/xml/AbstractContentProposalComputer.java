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
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
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
				final ICompletionProposal proposal = createProposal(proposalText, offset);
				results.add(proposal);
			}
			results = removeNonMatchingEntries(results, offset);
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

	protected Set<String> createEmptySet() {
		if (needsSorting)
			return new TreeSet<String>(new StringComparator());
		else
			return new HashSet<String>();
	}

	protected ExtendedCompletionProposal createProposal(final String text, final int offset) {
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
		return new ExtendedCompletionProposal(text, currentText.getDocumentOffset(), currentText.getText().length(),
				text.length());
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
			final int index = documentOffset - partitionOffset;

			final String partitionText = document.get(partitionOffset, partitionLength);

			if (partitionText.length() == 0)
				return new TextInfo("", 0, true);

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
			if (moved && (isTerminal(terminalSet(), c) || start < 0)) {
				start++;
			}

			int end = index;
			c = partitionText.charAt(end);

			moved = false;
			while (!isTerminal(terminalSet(), c) && end < documentOffset) {
				moved = true;
				end++;
				c = partitionText.charAt(end);
			}

			if (moved && isTerminal(terminalSet(), c)) {
				end--;
			}

			String substring = partitionText.substring(start, end + 1);
			return new TextInfo(substring, partitionOffset + start, false);
		}
		catch (final BadLocationException e) {
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

	protected IFile getFile() {
		return file;
	}

	protected abstract Set<String> getProposalSet(final int offset);

	protected boolean isAttribute() {
		return getTextType() == TextType.ATTRIBUTE;
	}

	protected boolean isOutsideTag() {
		return getTextType() == TextType.OUTSIDE_TAG;
	}

	protected boolean isProposalIncluded(final String proposalText, final String currentText) {
		return proposalText.startsWith(currentText);
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

	protected List<ICompletionProposal> removeNonMatchingEntries(final List<ICompletionProposal> results,
			final int offset) {
		final List<ICompletionProposal> cleanedResults = new ArrayList<ICompletionProposal>();
		try {
			if (offset > 0 && !isTerminal(extendedTerminalSet(), document.getChar(offset - 1))) {
				final TextInfo currentText = currentText(document, offset - 1);
				for (final ICompletionProposal p : results) {
					if (isProposalIncluded(p.getDisplayString(), currentText.getText())) {
						cleanedResults.add(p);
					}
				}
			}
			else
				return results;
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
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

	protected boolean useContractedElementCompletion(final int documentOffset, final IDocument document) {
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
				// TODO dead code because c is = 0 ever!
				// if (c == ICharacterScanner.EOF) {
				// break;
				// }
				// if (c == '<') {
				// break;
				// }
				if (!Character.isWhitespace(c)) {
					textReached = true;
				}

			}
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}

		if (textReached || !isRemainingWhiteSpace)
			return true;

		return false;
	}
}
