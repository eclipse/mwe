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

public class WorkflowAutoIndentStrategy extends
		AbstractWorkflowAutoEditStrategy {

	private class LineInformation {

		private final int lineOffset;

		private final int lineLength;

		private String text;

		public LineInformation(final IDocument document,
				final DocumentCommand command) throws BadLocationException {
			final int lineNumber = document.getLineOfOffset(command.offset);
			lineOffset = document.getLineOffset(lineNumber);
			final IRegion region = document.getLineInformation(lineNumber);
			lineLength = region.getLength();
			text = document.get(lineOffset, lineLength).trim();
			final String delimiter = document.getLineDelimiter(lineNumber);
			text += delimiter;
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
	}

	private Integer currentIndentLevel;

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>customizeDocumentCommand</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument,
	 *      org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(final IDocument document,
			final DocumentCommand command) {
		final String[] lineDelimiters = document.getLegalLineDelimiters();
		boolean isLineEnd = false;
		for (final String delimiter : lineDelimiters) {
			if (command.text.startsWith(delimiter)) {
				isLineEnd = true;
				break;
			}
		}

		if (!isLineEnd)
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

		currentIndentLevel = getIndentLevel(document, command);
		if (currentIndentLevel != null) {
			final String tag = getTag(document, command);
			changeIndent(document, command, tag);
		}

	}

	private void changeIndent(final IDocument document,
			final DocumentCommand command, final String tag) {
		if (tag == null)
			return;

		if (isStartTag(tag)) {
			indent(document, command);
		} else if (isEndTag(tag)) {
			unindent(document, command);
		}
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

	private void indent(final IDocument document, final DocumentCommand command) {
		try {
			final LineInformation lineInfo =
					new LineInformation(document, command);
			final String currentLineTabs = generateTabs(currentIndentLevel);
			currentIndentLevel++;
			final String nextLineTabs = generateTabs(currentIndentLevel);
			command.offset = lineInfo.getLineOffset();
			final String changedLine =
					currentLineTabs + lineInfo.getText() + nextLineTabs;
			command.text = changedLine;
			command.length = lineInfo.getLineLength();
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
	}

	private void unindent(final IDocument document,
			final DocumentCommand command) {
		try {
			final LineInformation lineInfo =
					new LineInformation(document, command);
			currentIndentLevel--;
			final String tabs = generateTabs(currentIndentLevel);
			command.offset = lineInfo.getLineOffset();
			String changedLine = lineInfo.getText();
			changedLine = tabs + changedLine;
			command.text = changedLine;
			command.length = lineInfo.getLineLength();
		} catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
		}
	}

}
