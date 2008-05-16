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

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */

public abstract class AbstractSpecializedStringContentProposalComputer extends
		AbstractStringContentProposalComputer {

	public AbstractSpecializedStringContentProposalComputer(
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	public abstract String[] getTriggerAttributeNames();

	@Override
	public boolean isApplicable(final int offset) {
		return super.isApplicable(offset)
				&& hasAttributeName(getTriggerAttributeNames(), offset);
	}

	private String getAttributeName(final int offset) {
		if (offset == 0)
			return null;

		try {
			int o = offset - 1;
			Character ch = document.getChar(o);
			while (o >= 0 && ch != '=' && ch != '<') {
				o--;
				if (o >= 0) {
					ch = document.getChar(o);
				}
			}

			if (ch != '=')
				return null;

			o = skipWhitespace(o);

			String name = "";
			ch = document.getChar(o);
			while (o >= 0) {
				ch = document.getChar(o);
				if (Character.isWhitespace(ch))
					break;

				name = ch.toString() + name;
				o--;
			}
			return name;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return null;
		}
	}

	private boolean hasAttributeName(final String[] possibleNames,
			final int offset) {
		final String attributeName = getAttributeName(offset);
		for (final String name : possibleNames) {
			if (name.equals(attributeName))
				return true;
		}
		return false;
	}

	private int skipWhitespace(final int offset) throws BadLocationException {
		if (offset == 0)
			return offset;

		int o = offset - 1;
		char ch = document.getChar(o);
		while (o >= 0 && Character.isWhitespace(ch)) {
			o--;
			if (o >= 0) {
				ch = document.getChar(o);
			}
		}
		return o;
	}
}
