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

package org.eclipse.emf.mwe.ui.internal.editor.autoedit;

import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAbstractAutoEditStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.preferences.PreferenceConstants;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextTypeComputer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class SmartQuoteStrategy extends XMLAbstractAutoEditStrategy {

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document, final DocumentCommand command) {
		if (!isAutoQuoteClosingEnabled())
			return;

		final int offset = command.offset;
		final String text = command.text;
		if (startsWithQuote(text)) {
			if (!TextTypeComputer.isString(document, offset) && !followedByQuote(document, command)) {
				duplicateQuote(command);
			}
			else if (TextTypeComputer.isString(document, offset) && followedByQuote(document, command)) {
				command.text = "";
				command.caretOffset = command.offset + 1;
				command.shiftsCaret = true;
			}

		}
	}

	private boolean isAutoQuoteClosingEnabled() {
		final IPreferenceStore store = WorkflowEditorPlugin.getDefault().getCombinedPreferenceStore();
		return store.getBoolean(PreferenceConstants.AUTO_CLOSE_QUOTES);
	}

	private void duplicateQuote(final DocumentCommand command) {
		final Character quote = command.text.charAt(0);
		final int caretPos = command.offset + 1;
		command.text += quote.toString();
		command.caretOffset = caretPos;
		command.shiftsCaret = false;
	}

	private boolean followedByQuote(final IDocument document, final DocumentCommand command) {
		if (command.caretOffset > document.getLength() - 1)
			return false;

		try {
			final int nextPos = command.offset;
			final String text = document.get(nextPos, 1);
			return startsWithQuote(text);
		}
		catch (final BadLocationException e) {
			Log.logError("", e);
			return false;
		}
	}

	private boolean startsWithQuote(final String text) {
		return text != null && (text.startsWith("'") || text.startsWith("\""));
	}

}
