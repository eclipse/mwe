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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class ElementIterator {

    private final IFile file;

    private final IDocument document;

    private final IElementAnalyzer analyzer;

    public ElementIterator(final IFile file, final IDocument document) {
        this.file = file;
        this.document = document;
        analyzer = new ElementAnalyzerRegistry(file, document);
    }

    public void checkValidity(final WorkflowElement root) {
        Marker.deleteMarkers(file);

        final List<WorkflowElement> list = flatten(root);
        for (final WorkflowElement element : list) {
            analyzer.checkValidity(element);
        }
    }

    private void addChild(final List<WorkflowElement> list,
            final WorkflowElement element) {
        for (int i = 0; i < element.getChildrenCount(); i++) {
            list.add(element.getChild(i));
        }
    }

    private List<WorkflowElement> flatten(final WorkflowElement root) {
        final List<WorkflowElement> list = new ArrayList<WorkflowElement>();
        list.add(root);
        for (int i = 0; i < list.size(); i++) {
            addChild(list, list.get(i));
        }
        return list;
    }
}
