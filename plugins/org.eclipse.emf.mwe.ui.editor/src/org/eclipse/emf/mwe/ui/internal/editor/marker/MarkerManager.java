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

package org.eclipse.emf.mwe.ui.internal.editor.marker;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public final class MarkerManager {

    private static final String ERROR_MARKER_ID =
            "org.eclipse.emf.mwe.ui.editor.workflowerror";

    /**
     * Don't allow instantiation.
     */
    private MarkerManager() {
        throw new UnsupportedOperationException();
    }

    public static void createMarker(final IFile file,
            final IDocument document, final WorkflowAttribute attribute,
            final String message, final boolean valueOnly,
            final boolean isError) {
        if (document == null || attribute == null || message == null
                || message.length() == 0)
            throw new IllegalArgumentException();

        createMarkerFromRange(file, document, message, attribute
                .getAttributeValueRange(), true);
    }

    public static void createMarker(final IFile file,
            final IDocument document, final WorkflowElement element,
            final String message, final boolean isError) {
        createMarkerFromRange(file, document, message, element
                .getFirstLineRange(), isError);
    }

    public static void createMarkerFromRange(final IFile file,
            final IDocument document, final String message,
            final ElementPositionRange range, final boolean isError) {
        final Map map = new HashMap();
        Integer lineNumber;
        try {
            lineNumber = document.getLineOfOffset(range.getStartOffset());
        } catch (final BadLocationException e) {
            e.printStackTrace();
            return;
        }

        MarkerUtilities.setLineNumber(map, lineNumber);
        MarkerUtilities.setMessage(map, message);
        map.put(IMarker.LOCATION, "line : " + (lineNumber + 1));

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

    public static void deleteMarkers(final IFile file) {
        try {
            file.deleteMarkers(ERROR_MARKER_ID, true, IResource.DEPTH_ZERO);
        } catch (final CoreException e) {
            e.printStackTrace();
        }
    }
}
