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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class TagContentAssistProcessor implements IContentAssistProcessor {

	static class TextInfo {
		String text;

		boolean isWhiteSpace;

		int documentOffset;

		TextInfo(final String text, final int documentOffset,
				final boolean isWhiteSpace) {
			this.text = text;
			this.isWhiteSpace = isWhiteSpace;
			this.documentOffset = documentOffset;
		}
	}

	private final WorkflowEditor editor;

	private final WorkflowTagScanner tagScanner;

	public TagContentAssistProcessor(final WorkflowEditor editor,
			final WorkflowTagScanner tagScanner) {
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
		boolean isAttribute = isAttribute(offset, document);

		final TextInfo currentText = currentText(document, offset);

		if (!isAttribute) {
			final List<WorkflowElement> allElements = editor.getElementList();

			final ICompletionProposal[] result =
					new ICompletionProposal[allElements.size()];
			int i = 0;
			for (final Object el : allElements) {
				final WorkflowElement element = (WorkflowElement) el;
				final String name = element.getName();

				String text = null;

				if (useContractedElementCompletion(offset, document)) {
					text = name;
				} else {
					text = "" + name + ">" + "</" + name + ">";
				}

				result[i++] =
						new CompletionProposal(text,
								currentText.documentOffset, currentText.text
										.length(), text.length());

			}
			return result;

		} else {
			final List allAttributes = editor.getAttributeList();

			final ICompletionProposal[] result =
					new ICompletionProposal[allAttributes.size()];
			int i = 0;
			for (final Iterator iter = allAttributes.iterator(); iter
					.hasNext();) {
				final String name = (String) iter.next();

				String text = null;

				if (currentText.isWhiteSpace) {
					text = name + "= \"\" ";
				} else {
					text = name;
				}

				result[i++] =
						new CompletionProposal(text,
								currentText.documentOffset, currentText.text
										.length(), text.length());
			}
			return result;
		}
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

	private TextInfo currentText(final IDocument document,
			final int documentOffset) {

		try {
			final ITypedRegion region = document.getPartition(documentOffset);
			final int partitionOffset = region.getOffset();
			final int partitionLength = region.getLength();
			final int index = documentOffset - partitionOffset;

			final String partitionText =
					document.get(partitionOffset, partitionLength);

			char c = partitionText.charAt(index);

			if (Character.isWhitespace(c)
					|| Character.isWhitespace(partitionText.charAt(index - 1)))
				return new TextInfo("", documentOffset, true);
			else if (c == '<')
				return new TextInfo("", documentOffset, true);
			else {
				int start = index;
				c = partitionText.charAt(start);

				while (!Character.isWhitespace(c) && c != '<' && start >= 0) {
					start--;
					c = partitionText.charAt(start);
				}
				start++;

				int end = index;
				c = partitionText.charAt(end);

				while (!Character.isWhitespace(c) && c != '>'
						&& end < partitionLength - 1) {
					end++;
					c = partitionText.charAt(end);
				}

				final String substring = partitionText.substring(start, end);
				return new TextInfo(substring, partitionOffset + start, false);

			}

		} catch (final BadLocationException e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean isAttribute(final int documentOffset,
			final IDocument document) {
		boolean isAttribute = false;
		try {
			final ITypedRegion region = document.getPartition(documentOffset);

			final int partitionOffset = region.getOffset();

			final int readLength = documentOffset - partitionOffset;
			tagScanner.setRange(document, partitionOffset, readLength);

			boolean textReached = false;

			IToken token = null;
			while ((token = tagScanner.nextToken()) != Token.EOF) {
				if (token.getData() instanceof TextAttribute) {
					textReached = true;
					continue;
				}

				if (textReached && token.isWhitespace()) {
					isAttribute = true;
				}
			}
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
		return isAttribute;
	}

	private boolean useContractedElementCompletion(final int documentOffset,
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
			while ((c == tagScanner.read())) {
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
