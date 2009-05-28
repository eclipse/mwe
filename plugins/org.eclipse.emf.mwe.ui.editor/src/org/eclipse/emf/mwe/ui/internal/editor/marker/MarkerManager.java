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

package org.eclipse.emf.mwe.ui.internal.editor.marker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
public final class MarkerManager {

	private static final String ERROR_MARKER_ID = "org.eclipse.emf.mwe.ui.editor.workflowerror";

	private static final Set<Map> knownMarkers = new HashSet<Map>();

	/**
	 * Don't allow instantiation.
	 */
	private MarkerManager() {
		throw new UnsupportedOperationException();
	}

	public static void createMarker(final IFile file, final IDocument document, final IWorkflowAttribute attribute,
			final String message, final boolean valueOnly, final boolean isError) {
		if (document == null || attribute == null || message == null || message.length() == 0)
			throw new IllegalArgumentException();

		if (valueOnly) {
			createMarkerFromRange(file, document, message, attribute.getAttributeValueRange(), isError);
		}
		else {
			createMarkerFromRange(file, document, message, attribute.getAttributeRange(), isError);
		}
	}

	public static void createMarker(final IFile file, final IDocument document, final AbstractWorkflowElement element,
			final String message, final boolean isError) {
		final ElementPositionRange firstLineRange = element.getFirstLineRange();
		if (firstLineRange == null)
			return;

		createMarkerFromRange(file, document, message, firstLineRange, isError);
	}

	public static void createMarkerFromParserException(final IFile file, final IDocument document,
			final SAXException exception) {
		if (exception instanceof SAXParseException) {
			final SAXParseException ex = (SAXParseException) exception;
			int line = ex.getLineNumber();
			line = (line <= 0) ? 0 : line - 1;
			final int column = ex.getColumnNumber() - 1;
			final String msg = ex.getMessage();
			createMarker(file, document, msg, line, column);
		}
	}

	public static void createMarker(final IFile file, final IDocument document, final String msg, final int line,
			final int column) {
		try {
			final int lineOffset = document.getLineOffset(line);
			int start = lineOffset;
			final int lineLength = document.getLineLength(line);
			int end = start + lineLength - 1;
			if (start + column < lineLength) {
				start += column;
				end -= column;
			}
			else {
				char ch = document.getChar(start);
				while (Character.isWhitespace(ch)) {
					start++;
					end--;
					ch = document.getChar(start);
				}
				ch = document.getChar(end);
				while (Character.isWhitespace(ch)) {
					end--;
					ch = document.getChar(end);
				}
			}

			final ElementPositionRange range = new ElementPositionRange(document, start, end);
			createMarkerFromRange(file, document, msg, range, true);
		}
		catch (final BadLocationException e) {
			Log.logError("Document location error", e);
		}
	}

	public static void createMarkerFromRange(final IFile file, final IDocument document, final String message,
			final ElementPositionRange range, final boolean isError) {
		if (file == null || !file.exists())
			return;

		if (document == null || message == null || range == null)
			throw new IllegalArgumentException();

		final Map map = new HashMap();
		Integer lineNumber;
		try {
			if (range.getStartOffset() < document.getLength()) {
				lineNumber = document.getLineOfOffset(range.getStartOffset());
			}
			else {
				lineNumber = document.getNumberOfLines() - 1;
			}
		}
		catch (final BadLocationException e) {
			Log.logError("Bad document location", e);
			return;
		}

		MarkerUtilities.setLineNumber(map, lineNumber + 1);
		MarkerUtilities.setMessage(map, message);
		map.put(IMarker.LOCATION, "line : " + (lineNumber + 1));

		map.put(IMarker.CHAR_START, range.getStartOffset());
		map.put(IMarker.CHAR_END, range.getEndOffset());
		Integer severity;
		if (isError) {
			severity = IMarker.SEVERITY_ERROR;
		}
		else {
			severity = IMarker.SEVERITY_WARNING;
		}

		map.put(IMarker.SEVERITY, severity);
		try {
			if (!knownMarkers.contains(map)) {
				MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
				knownMarkers.add(map);
			}
		}
		catch (final CoreException e) {
			Log.logError("", e);
		}
	}

	public static void deleteMarkers(final IFile file) {
		try {
			if (file != null && file.exists()) {
				file.deleteMarkers(ERROR_MARKER_ID, true, IResource.DEPTH_INFINITE);
			}
			knownMarkers.clear();
		}
		catch (final CoreException e) {
			Log.logError("", e);
		}
	}
}
