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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.6 $
 */
final class Marker {

    private static final String ERROR_MARKER_ID =
            "org.eclipse.emf.mwe.ui.editor.workflowerror";

    /**
     * Don't allow instantiation.
     */
    private Marker() {
        throw new UnsupportedOperationException();
    }

    public static void createMarker(final IFile file,
            final IDocument document, final WorkflowElement element,
            final int attributeIndex, final String message,
            final boolean valueOnly, final boolean isError) {
        if (attributeIndex < 0
                && attributeIndex >= element.getAttributeCount())
            throw new IllegalArgumentException();

        final ElementPositionRange attrRange =
                computeAttributeRange(document, element, attributeIndex,
                        valueOnly);

        if (attrRange == null)
            return;

    }

    public static void createMarker(final IFile file,
            final IDocument document, final WorkflowElement element,
            final String message, final boolean isError) {
        createMarkerFromRange(file, document, message, element
                .getStartElementRange(), isError);
    }

    public static void deleteMarkers(final IFile file) {
        try {
            file.deleteMarkers(ERROR_MARKER_ID, true, IResource.DEPTH_ZERO);
        } catch (final CoreException e) {
            e.printStackTrace();
        }
    }

    private static ElementPositionRange computeAttributeRange(
            final IDocument document, final WorkflowElement element,
            final int attributeIndex, final boolean valueOnly) {
        if (attributeIndex < 0
                && attributeIndex >= element.getAttributeCount())
            throw new IllegalArgumentException();

        final int start = element.getStartElementRange().getStartOffset();
        final int end = element.getStartElementRange().getEndOffset();
        final int length = end - start + 1;
        String text;
        try {
            text = document.get(start, length);
        } catch (final BadLocationException e) {
            e.printStackTrace();
            return null;
        }

        final String pattern =
                element.getAttribute(attributeIndex).getName() + "\\s*=\\s*"
                        + '"'
                        + element.getAttribute(attributeIndex).getValue()
                        + '"';
        final Pattern regexPattern = Pattern.compile(pattern);
        final Matcher m = regexPattern.matcher(text);
        int attrStart = start + m.start();
        int attrEnd = start + m.end() - 1;
        if (valueOnly) {
            // Exclude the closing double quote
            attrEnd--;

            try {
                // Skip everything to the opening double quote
                while (attrStart <= attrEnd
                        && document.getChar(attrStart) != '"') {
                    attrStart++;
                }
            } catch (final BadLocationException e) {
                e.printStackTrace();
                return null;
            }

            // Skip the opening double quote as well
            attrStart++;
        }

        return new ElementPositionRange(document, attrStart, attrEnd);
    }

    private static void createMarkerFromRange(final IFile file,
            final IDocument document, final String message,
            final ElementPositionRange range, final boolean isError) {
        final Map map = new HashMap();
        int lineNumber;
        try {
            lineNumber = document.getLineOfOffset(range.getStartOffset());
        } catch (final BadLocationException e) {
            e.printStackTrace();
            return;
        }

        MarkerUtilities.setLineNumber(map, lineNumber);
        MarkerUtilities.setMessage(map, message);
        map.put(IMarker.LOCATION, file.getFullPath().toString());

        map.put(IMarker.CHAR_START, range.getStartOffset());
        map.put(IMarker.CHAR_END, range.getEndOffset());
        Integer severity;
        if (isError) {
            severity = IMarker.SEVERITY_ERROR;
        } else {
            severity = IMarker.SEVERITY_WARNING;
        }

        map.put(IMarker.SEVERITY, severity);
        try {
            MarkerUtilities.createMarker(file, map, ERROR_MARKER_ID);
        } catch (final CoreException ee) {
            ee.printStackTrace();
        }
    }
}
