/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class XMLRemoveClosingTagStrategy extends XMLAbstractAutoEditStrategy {

	private static final Pattern TAG_PATTERN =
			Pattern.compile("(<\\s*(\\w+)\\s*.*?\\s*>)\\s*<\\s*/\\s*\\2>",
					Pattern.MULTILINE);

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document,
			final DocumentCommand command) {
		try {
			if (!"/".equals(command.text))
				return;

			final int offset = command.offset;
			final String content = document.get();
			final ITypedRegion region = document.getPartition(offset);
			final int partitionOffset = region.getOffset();
			final Matcher m = TAG_PATTERN.matcher(content);
			if (m.find(partitionOffset)) {
				final int start = m.start();
				final String fullMatch = m.group();
				String startTag = m.group(1);
				startTag = startTag.substring(0, startTag.length() - 1) + "/>";
				deleteClosingTag(command, fullMatch, startTag, start);
			}
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
	}

	private void deleteClosingTag(final DocumentCommand command,
			final String fullMatch, final String startTag, final int start) {
		command.offset = start;
		command.length = fullMatch.length();
		command.text = startTag;
	}

}
