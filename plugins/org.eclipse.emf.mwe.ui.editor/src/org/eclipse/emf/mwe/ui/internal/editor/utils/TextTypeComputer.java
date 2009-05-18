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

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public final class TextTypeComputer {

	/**
	 * Don't allow instantiation.
	 */
	private TextTypeComputer() {
		throw new UnsupportedOperationException();
	}

	public static TextType computeType(final IDocument document, final int offset) {
		TextType type = TextType.UNDEFINED;
		try {
			final ITypedRegion region = document.getPartition(offset);
			final int partitionOffset = region.getOffset();
			boolean hasWhitespace = false;
			if (offset > partitionOffset) {
				char quoteChar = 0;
				int quoteCount = 0;
				int o = offset - 1;
				char ch = 0;
				while (o >= partitionOffset) {
					ch = document.getChar(o);
					if (quoteChar > 0 && ch == quoteChar || quoteChar == 0 && (ch == '"' || ch == '\'')) {
						if (quoteChar == 0) {
							quoteChar = ch;
						}
						quoteCount++;
					}

					if (Character.isWhitespace(ch)) {
						hasWhitespace = true;
					}
					else if (ch == '<') {
						break;
					}

					o--;
				}

				if (quoteCount % 2 > 0) {
					type = TextType.STRING;
				}
				else if (o >= partitionOffset && hasWhitespace) {
					type = TextType.ATTRIBUTE;
				}
				else if (ch == '<') {
					type = TextType.TAG;
				}
				else {
					type = TextType.OUTSIDE_TAG;
				}
			}
			else {
				type = TextType.OUTSIDE_TAG;
			}
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
		return type;
	}

	public static boolean isAttribute(final IDocument document, final int offset) {
		final TextType type = computeType(document, offset);
		return type == TextType.ATTRIBUTE;
	}

	public static boolean isOutsideTag(final IDocument document, final int offset) {
		final TextType type = computeType(document, offset);
		return type == TextType.OUTSIDE_TAG;
	}

	public static boolean isString(final IDocument document, final int offset) {
		final TextType type = computeType(document, offset);
		return type == TextType.STRING;
	}

	public static boolean isTag(final IDocument document, final int offset) {
		final TextType type = computeType(document, offset);
		return type == TextType.TAG;
	}
}
