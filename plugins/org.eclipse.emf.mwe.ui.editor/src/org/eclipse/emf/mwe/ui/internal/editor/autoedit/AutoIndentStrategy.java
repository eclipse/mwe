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

package org.eclipse.emf.mwe.ui.internal.editor.autoedit;

import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class AutoIndentStrategy extends
		AbstractAutoEditStrategy {

	private enum IndentType {
		INDENT, UNINDENT
	}

	private class LineInformation {

		private final int lineOffset;

		private final int lineLength;

		private final String text;

		public LineInformation(final IDocument document,
				final DocumentCommand command) throws BadLocationException {
			final int lineNumber = document.getLineOfOffset(command.offset);
			lineOffset = document.getLineOffset(lineNumber);
			final IRegion region = document.getLineInformation(lineNumber);
			lineLength = region.getLength();
			text = document.get(lineOffset, lineLength).trim();
		}

		public int getLineLength() {
			return lineLength;
		}

		public int getLineOffset() {
			return lineOffset;
		}

		public String getText() {
			return text;
		}
	};

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document,
			final DocumentCommand command) {
		if (command.text.length() == 0 || !isCaretAtLineEnd(document, command))
			return;

		final int offset = command.offset;
		try {
			if (offset > 0 && document.getChar(offset - 1) != '>'
					|| offset == 0)
				return;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return;
		}

		final String tag = getTag(document, command);
		changeIndent(document, command, tag);
	}

	private void changeCurrentLine(final IDocument document,
			final DocumentCommand command, final IndentType indentType) {
		try {
			final int currentIndentLevel = getIndentLevel(document, command);
			final LineInformation lineInfo =
					new LineInformation(document, command);
			final String tabs = generateIndent(currentIndentLevel, indentType);
			command.offset = lineInfo.getLineOffset();
			String changedLine = lineInfo.getText();
			changedLine = tabs + changedLine + command.text;
			command.text = changedLine;
			command.length = lineInfo.getLineLength();
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
	}

	private void changeIndent(final IDocument document,
			final DocumentCommand command, final String tag) {
		if (tag == null)
			return;

		if (isStartTag(tag) && isLineDelimiter(document, command)) {
			changeNextLine(document, command, IndentType.INDENT);
		} else if (isEndTag(tag) && isTagAtLineStart(document, command)) {
			changeCurrentLine(document, command, IndentType.UNINDENT);
		}
	}

	private void changeNextLine(final IDocument document,
			final DocumentCommand command, final IndentType indentType) {
		try {
			final int currentIndentLevel = getIndentLevel(document, command);
			final LineInformation lineInfo =
					new LineInformation(document, command);
			final String currentLineTabs = generateTabs(currentIndentLevel);
			final String nextLineTabs =
					generateIndent(currentIndentLevel, indentType);
			command.offset = lineInfo.getLineOffset();

			while (command.text.endsWith("\t")) {
				command.text =
						command.text.substring(0, command.text.length() - 1);
			}

			final String changedLine =
					currentLineTabs + lineInfo.getText() + command.text
							+ nextLineTabs;
			command.text = changedLine;
			command.length = lineInfo.getLineLength();
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
	}

	private String generateIndent(final int currentIndentLevel,
			final IndentType indentType) {
		String tabs = null;
		switch (indentType) {
			case INDENT:
				tabs = generateTabs(currentIndentLevel + 1);
				break;

			case UNINDENT:
				tabs = generateTabs(currentIndentLevel - 1);
				break;

			default:
				throw new IllegalStateException();
		}
		return tabs;
	}

	private String generateTabs(final Integer count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += '\t';
		}
		return result;
	}

	private Integer getIndentLevel(final IDocument document,
			final DocumentCommand command) {
		final int tabWidth = getTabWidth();
		try {
			final int line = document.getLineOfOffset(command.offset);
			final int startOffset = document.getLineOffset(line);
			final int endOffset =
					startOffset + document.getLineLength(line) - 1;
			int offset = startOffset;

			int spaces = 0;
			while (offset <= endOffset) {
				final char ch = document.getChar(offset);

				if (ch == ' ') {
					spaces++;
				} else if (ch == '\t') {
					spaces += tabWidth;
				} else
					break;

				offset++;
			}

			int indentLevel = spaces / tabWidth;
			if (spaces % tabWidth >= tabWidth / 2) {
				indentLevel++;
			}

			return indentLevel;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return null;
		}
	}

	private int getTabWidth() {
		final IPreferenceStore prefStore =
				WorkflowEditorPlugin.getDefault().getCombinedPreferenceStore();
		final int tabWidth =
				prefStore
						.getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH);
		return tabWidth;
	}

	private String getTag(final IDocument document,
			final DocumentCommand command) {
		int offset = command.offset;
		offset--;
		try {
			String result = "";
			Character ch = document.getChar(offset);
			while (offset >= 0) {
				result = ch.toString() + result;
				if (ch == '<')
					break;

				offset--;
				if (offset >= 0) {
					ch = document.getChar(offset);
				}
			}
			return result;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return null;
		}
	}

	private boolean isCaretAtLineEnd(final IDocument document,
			final DocumentCommand command) {
		try {
			final int line = document.getLineOfOffset(command.offset);
			final int lineOffset = document.getLineOffset(line);
			final int lineLength = document.getLineLength(line);
			final int endOffset = lineOffset + lineLength - 1;
			return command.offset == endOffset;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return false;
		}
	}

	private boolean isLineDelimiter(final IDocument document,
			final DocumentCommand command) {
		final String[] delimiters = document.getLegalLineDelimiters();
		for (final String delimiter : delimiters) {
			if (command.text.startsWith(delimiter))
				return true;
		}
		return false;
	}

	private boolean isTagAtLineStart(final IDocument document,
			final DocumentCommand command) {
		try {
			final int line = document.getLineOfOffset(command.offset);
			final int lineOffset = document.getLineOffset(line);
			int offset = command.offset;
			char ch = document.getChar(offset);
			while (ch != '<') {
				offset--;
				ch = document.getChar(offset);
			}
			offset--;
			ch = document.getChar(offset);
			while (offset > lineOffset && Character.isWhitespace(ch)) {
				offset--;
				ch = document.getChar(offset);
			}
			return offset == lineOffset;
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return false;
		}
	}

}
