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

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class ComponentAnalyzer extends DefaultAnalyzer {

    protected static final String FILE_AND_CLASS_MSG =
            "A component cannot have a 'class' and a 'file' attribute at the same time";

    public ComponentAnalyzer(final IFile file, final IDocument document) {
        super(file, document);
    }

    /**
     * This method overrides the implementation of <code>checkValidity</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    @Override
    public void checkValidity(final WorkflowElement element) {
        if (element.hasAttribute(CLASS_ATTRIBUTE)
                && element.hasAttribute(FILE_ATTRIBUTE)) {
            createMarker(element, FILE_AND_CLASS_MSG);
        } else if (element.hasAttribute(CLASS_ATTRIBUTE)) {
            final Class<?> mappedClass =
                    getClass(element.getAttributeValue(CLASS_ATTRIBUTE));
            if (mappedClass != null) {
                checkAttributes(element, mappedClass);
            } else {
                createMarker(element, "Class '"
                        + element.getAttributeValue(CLASS_ATTRIBUTE)
                        + "' cannot be resolved");
            }
        } else if (element.hasAttribute(FILE_ATTRIBUTE)) {
            getFileContent(element);
        } else {
            createMarker(element,
                    "A component must either have a 'class' or a 'file' attribute");
        }
    }

    /**
     * This method overrides the implementation of <code>checkAttribute</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttribute(java.lang.Class,
     *      org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement,
     *      int)
     */
    @Override
    protected void checkAttribute(final Class<?> mappedClass,
            final WorkflowElement element, final int attributeIndex) {
        if (attributeIndex < 0
                || attributeIndex >= element.getAttributeCount())
            throw new IllegalArgumentException();

        final WorkflowAttribute attribute =
                element.getAttribute(attributeIndex);
        final Class<?> attrType = getValueType(attribute.getValue());
        final Method method =
                Reflection.getSetter(mappedClass, attribute.getName(),
                        attrType);
        if (method == null) {
            createMarker(element, attributeIndex, "No attribute '"
                    + attribute.getName() + "' in class '"
                    + mappedClass.getCanonicalName() + "'");
        }
    }

    /**
     * This method overrides the implementation of <code>checkAttributes</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkAttributes(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement,
     *      java.lang.Class)
     */
    @Override
    protected void checkAttributes(final WorkflowElement element,
            final Class<?> mappedClass) {
        for (int i = 0; i < element.getAttributeCount(); i++) {
            checkAttribute(mappedClass, element, i);
        }
    }

    protected void checkAttributes(final WorkflowElement element,
            final String content) {

        // TODO implement
    }

    private String getFileContent(final WorkflowElement element) {
        if (!element.hasAttribute(FILE_ATTRIBUTE))
            throw new IllegalArgumentException();

        final String filePath = element.getAttributeValue(FILE_ATTRIBUTE);
        final InputStream stream =
                Activator.class.getResourceAsStream(filePath);
        if (stream == null) {
            createMarker(element, "File '" + filePath + "' could not be found");
        } else {
            try {
                final int length = stream.available();
                final byte[] byteArray = new byte[length];
                stream.read(byteArray);
                final String content = byteArray.toString();
                return content;

            } catch (final IOException e) {
                Log.logError("I/O error", e);
            }
        }
        return null;
    }

}
