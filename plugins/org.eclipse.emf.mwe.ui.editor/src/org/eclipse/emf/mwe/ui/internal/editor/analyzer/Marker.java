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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.MarkerUtilities;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.5 $
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
            final String message) {
        final Map map = new HashMap();
        final int lineNumber = element.getStartElementRange().getStartLine();
        MarkerUtilities.setLineNumber(map, lineNumber);
        MarkerUtilities.setMessage(map, message);
        map.put(IMarker.LOCATION, file.getFullPath().toString());

        final int start = element.getFirstLineRange().getStartOffset();
        final int end = element.getFirstLineRange().getEndOffset();
        map.put(IMarker.CHAR_START, start);
        map.put(IMarker.CHAR_END, end);
        map.put(IMarker.SEVERITY, new Integer(IMarker.SEVERITY_ERROR));

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
