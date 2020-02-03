/*******************************************************************************
 * Copyright (c) 2005, 2010 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;

/**
 * @author Peter Friese - Initial contribution and API
 */
public class XMLDoubleClickStrategy implements ITextDoubleClickStrategy {

	private static final Pattern PATTERN_ATTRIBUTE_VALUE = Pattern.compile("\"(.*?)\"|'(.*?)'");

	protected ITextViewer fText;

	@Override
	public void doubleClicked(ITextViewer part) {
		int pos = part.getSelectedRange().x;

		if (pos < 0)
			return;

		fText = part;

		if (!selectAttributeValue(pos)) {
			selectWord(pos);
		}
	}

	protected boolean selectAttributeValue(int caretPos) {
		IDocument doc = fText.getDocument();
		try {
			IRegion lineInformationOfOffset = doc.getLineInformationOfOffset(caretPos);
			int offsetInLine = caretPos - lineInformationOfOffset.getOffset();
			String line = doc.get(lineInformationOfOffset.getOffset(), lineInformationOfOffset.getLength());

			Matcher matcher = PATTERN_ATTRIBUTE_VALUE.matcher(line);
			while (matcher.find()) {
				MatchResult matchResult = matcher.toMatchResult();
				System.out.println("[" + matchResult.start(1) + ":" + matchResult.end(1) + "] " + matchResult.group(1));
				if ((matchResult.start(1) <= offsetInLine) && (offsetInLine <= matchResult.end(1))) {
					System.out.println("FOUND: [" + matchResult.start(1) + ":" + matchResult.end(1) + "] "
							+ matchResult.group(1));
					selectRangeInLine(lineInformationOfOffset, new Region(matchResult.start(1), matchResult.end(1)
							- matchResult.start(1)));
					return true;
				}
			}
		}
		catch (BadLocationException e) {
		}
		return false;
	}

	protected boolean selectWord(int caretPos) {

		IDocument doc = fText.getDocument();
		int startPos, endPos;

		try {

			int pos = caretPos;
			char c;

			while (pos >= 0) {
				c = doc.getChar(pos);
				if (!Character.isJavaIdentifierPart(c))
					break;
				--pos;
			}

			startPos = pos;

			pos = caretPos;
			int length = doc.getLength();

			while (pos < length) {
				c = doc.getChar(pos);
				if (!Character.isJavaIdentifierPart(c))
					break;
				++pos;
			}

			endPos = pos;
			selectRange(startPos, endPos);
			return true;

		}
		catch (BadLocationException x) {
		}

		return false;
	}

	private void selectRangeInLine(IRegion lineInformationOfOffset, IRegion selection) {
		int offset = lineInformationOfOffset.getOffset() + selection.getOffset();
		int length = selection.getLength();
		fText.setSelectedRange(offset, length);
	}

	private void selectRange(int startPos, int stopPos) {
		int offset = startPos + 1;
		int length = stopPos - offset;
		fText.setSelectedRange(offset, length);
	}
}