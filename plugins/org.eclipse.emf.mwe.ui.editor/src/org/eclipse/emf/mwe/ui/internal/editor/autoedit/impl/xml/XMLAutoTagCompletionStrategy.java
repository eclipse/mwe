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

package org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class XMLAutoTagCompletionStrategy extends
		XMLAbstractAutoEditStrategy {

	private static final String TRIGGER_STRING = END_TAG_PREFIX;

	private static final Pattern TAG_PATTERN =
			Pattern.compile("<\\s*/?(\\w+).*?/?>", Pattern.MULTILINE);

	private static int characterCount;

	private static String triggerBuffer;

	public XMLAutoTagCompletionStrategy() {
		resetBuffer();
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document,
			final DocumentCommand command) {
		checkTrigger(command.text);
		if (isTriggered()) {
			final String tag = getTagName(document, command.offset);
			if (tag != null) {
				fillInTag(command, tag);
				resetBuffer();
			}
		}
	}

	private void checkTrigger(final String text) {
		char ch1 = 0;
		char ch2 = 0;
		if (text != null && text.length() > 0) {
			ch1 = text.charAt(0);
			ch2 = TRIGGER_STRING.charAt(characterCount);
		} else {
			resetBuffer();
			return;
		}

		if (ch1 == ch2) {
			triggerBuffer += text;
			characterCount++;
		} else {
			resetBuffer();
			return;
		}
	}

	private void fillInTag(final DocumentCommand command, final String tag) {
		command.text = "/" + tag + ">";
	}

	private String getTagName(final IDocument document, final int offset) {
		String previousText;
		try {
			previousText = document.get(0, offset - 1);
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return null;
		}

		final Stack<String> openTags = new Stack<String>();
		final Matcher m = TAG_PATTERN.matcher(previousText);
		while (m.find()) {
			String fullTag = m.group();
			final String tagName = m.group(1);
			fullTag = trimTag(fullTag);
			if (!isTag(fullTag))
				throw new IllegalStateException();

			if (isStartTag(fullTag)) {
				openTags.push(tagName);
			} else if (isEndTag(fullTag)) {
				if (tagName.equals(openTags.peek())) {
					openTags.pop();
				} else
					return null;
			} else if (isLeafTag(fullTag)) {
				// Do nothing
			} else
				throw new IllegalStateException();
		}

		if (!openTags.empty())
			return openTags.peek();
		else
			return null;
	}

	private boolean isTriggered() {
		return triggerBuffer.equals(TRIGGER_STRING);
	}

	private void resetBuffer() {
		characterCount = 0;
		triggerBuffer = "";
	}
}
