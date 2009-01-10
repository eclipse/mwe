/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.autoedit;

import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAbstractAutoEditStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TextTypeComputer;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public class SmartQuoteStrategy extends XMLAbstractAutoEditStrategy {

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document,
			final DocumentCommand command) {
		final int offset = command.offset;
		final String text = command.text;
		if (!TextTypeComputer.isString(document, offset)
				&& (text.startsWith("'") || text.startsWith("\""))) {
			duplicateQuote(command);
		}
	}

	private void duplicateQuote(final DocumentCommand command) {
		final Character quote = command.text.charAt(0);
		final int caretPos = command.offset + 1;
		command.text += quote.toString();
		command.caretOffset = caretPos;
		command.shiftsCaret = false;
	}

}
