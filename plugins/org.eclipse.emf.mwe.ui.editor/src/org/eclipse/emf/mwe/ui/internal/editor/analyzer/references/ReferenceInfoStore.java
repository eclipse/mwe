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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer.references;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class ReferenceInfoStore {

    private final IFile file;

    private final Set<ReferenceInfo> definitionSet =
            new HashSet<ReferenceInfo>();

    private final List<ReferenceInfo> references =
            new LinkedList<ReferenceInfo>();

    private final Set<String> fileNameSet = new HashSet<String>();

    public ReferenceInfoStore(final IFile file) {
        this.file = file;
    }

    public boolean addDefinition(final WorkflowElement element) {
        if (element == null
                || !element.hasAttribute(WorkflowElement.ID_ATTRIBUTE))
            throw new IllegalArgumentException();

        final ReferenceInfo info = createReferenceInfo(element);
        return !definitionSet.add(info);
    }

    public boolean addFileName(final String name) {
        if (name == null || name.length() == 0)
            throw new IllegalArgumentException();

        return fileNameSet.add(name);
    }

    public void addReference(final WorkflowElement element) {
        if (element == null
                || !element.hasAttribute(WorkflowElement.ID_REF_ATTRIBUTE))
            throw new IllegalArgumentException();

        final ReferenceInfo info = createReferenceInfo(element);
        references.add(info);
    }

    public void clear() {
        definitionSet.clear();
        references.clear();
        fileNameSet.clear();
    }

    public boolean containsFileName(final String name) {
        if (name == null)
            return false;

        return fileNameSet.contains(name);
    }

    public boolean isDefined(final WorkflowElement element) {
        if (element == null
                || !element.hasAttribute(WorkflowElement.ID_ATTRIBUTE))
            throw new IllegalArgumentException();

        return definitionSet.contains(element);
    }

    public void markUnresolvedReferences() {
        // Remove resolved references
        for (final ListIterator<ReferenceInfo> it = references.listIterator(); it
                .hasNext();) {
            if (definitionSet.contains(it.next())) {
                it.remove();
            }
        }

        // Mark unresolved references
        for (final ReferenceInfo info : references) {
            MarkerManager.createMarker(info.getFile(), info.getElement()
                    .getDocument(), info.getAttribute(),
                    "Unresolved reference '" + info.getReferenceValue() + "'",
                    true, false);
        }

        // Since resolved references have been removed anyway, the remaining
        // data is not really meaningful anymore, so delete it.
        clear();
    }

    private ReferenceInfo createReferenceInfo(final WorkflowElement element) {
        WorkflowAttribute attribute =
                element.getAttribute(WorkflowElement.ID_ATTRIBUTE);
        if (attribute == null) {
            attribute = element.getAttribute(WorkflowElement.ID_REF_ATTRIBUTE);
        }

        if (attribute == null)
            throw new IllegalArgumentException();

        final String name = attribute.getValue();
        return new ReferenceInfo(file, element, attribute);
    }
}
