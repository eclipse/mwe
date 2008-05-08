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

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public abstract class AbstractContentProposalComputer implements
		IContentProposalComputer {

	protected WorkflowEditor editor;

	protected final IDocument document;

	protected final WorkflowTagScanner tagScanner;

	protected AbstractContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		this.editor = editor;
		this.document = document;
		this.tagScanner = tagScanner;
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

			if (Character.isWhitespace(c)
					|| Character.isWhitespace(partitionText.charAt(index - 1)))
				return new TextInfo("", documentOffset, true);
			else if (c == '<')
				return new TextInfo("", documentOffset, true);
			else {
				int start = index;
				c = partitionText.charAt(start);

				while (!Character.isWhitespace(c) && start >= 0) {
					start--;
					if (start >= 0) {
						c = partitionText.charAt(start);
					}
				}
				start++;

				int end = index;
				c = partitionText.charAt(end);

				while (!Character.isWhitespace(c) && end < partitionLength - 1) {
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

	protected boolean isAttribute(final int documentOffset,
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

	protected boolean isString(final int documentOffset,
			final IDocument document) {
		final boolean isString = false;
		try {
			final ITypedRegion region = document.getPartition(documentOffset);

			final int partitionOffset = region.getOffset();

			final int readLength = documentOffset - partitionOffset;
			tagScanner.setRange(document, partitionOffset, readLength);

			final boolean textReached = false;

			final IToken token = tagScanner.nextToken();
			return token != Token.EOF && token instanceof TextAttribute;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
		return false;
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
