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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class MarkingErrorHandler extends WorkflowContentHandler {
    public static final String ERROR_MARKER_ID = "Workflow error";

    private final IFile file;

    private final IDocument document;

    public MarkingErrorHandler(final IFile file, final IDocument document) {
        super();
        this.file = file;
        this.document = document;
    }

    public void removeExistingMarkers() {
        try {
            file.deleteMarkers(ERROR_MARKER_ID, true, IResource.DEPTH_ZERO);
        } catch (final CoreException e1) {
            e1.printStackTrace();
        }
    }
}
