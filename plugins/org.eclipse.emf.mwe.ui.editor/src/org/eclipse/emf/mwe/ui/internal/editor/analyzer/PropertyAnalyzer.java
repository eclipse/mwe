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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class PropertyAnalyzer extends DefaultAnalyzer {

    private static final String INVALID_PROPERTY_MSG = "Property not valid";

    public PropertyAnalyzer(final IFile file, final IDocument document,
            final PropertyStore propertyStore) {
        super(file, document, propertyStore);
    }

    /**
     * This method overrides the implementation of <code>checkValidity</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    @Override
    public void checkValidity(final WorkflowElement element) {
        if (element.getName().equals(WorkflowElement.PROPERTY_TAG)
                && !element.isProperty()) {
            createMarker(element, INVALID_PROPERTY_MSG);
        }
        if (element.isSimpleProperty()) {
            propertyStore.add(element
                    .getAttributeValue(WorkflowElement.NAME_ATTRIBUTE));
        } else if (element.isFileProperty()) {
            parseFileProperties(element);
        }
    }

    private void parseFileProperties(final WorkflowElement element) {
        final WorkflowAttribute attribute =
                element.getAttribute(WorkflowElement.FILE_ATTRIBUTE);
        final String content =
                ReflectionManager.getFileContent(file, document, attribute);
        if (content == null) {
            createMarker(attribute, "File '" + attribute.getValue()
                    + "' could not be found");
            return;
        }
        final String[] lines = content.split("\n");
        for (final String line : lines) {
            final int pos = line.indexOf('=');
            if (pos < 0)
                continue;

            final String name = line.substring(0, pos);
        }
    }
}
