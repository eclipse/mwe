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

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.outline.WorkflowOutlineContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.IDocument;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.LocatorImpl;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class FileReferenceAnalyzerStrategy extends
        AbstractReferenceAnalyzerStrategy {

    protected static final String PROPERTIES_EXTENSION = ".properties";

    public FileReferenceAnalyzerStrategy(final IFile file,
            final IDocument document, final ReferenceInfoStore store) {
        super(file, document, store);
    }

    /**
     * This method overrides the implementation of <code>clearCache</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#clearCache()
     */
    @Override
    public void clearCache() {
        super.clearCache();
    }

    /**
     * This method overrides the implementation of <code>isApplicable</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#isApplicable(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    public boolean isApplicable(final WorkflowElement element) {
        return element.hasAttribute(WorkflowElement.FILE_ATTRIBUTE);
    }

    /**
     * This method overrides the implementation of <code>doAnalyze</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#doAnalyze(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    @Override
    protected void doAnalyze(final WorkflowElement element) {
        final WorkflowAttribute attribute =
                element.getAttribute(WorkflowElement.FILE_ATTRIBUTE);
        final ClassLoader loader = ReflectionManager.getResourceLoader(file);
        final URL fileURL = loader.getResource(attribute.getValue());
        if (fileURL == null) {
            MarkerManager.createMarker(file, document, attribute, "File '"
                    + attribute.getValue() + "' could not be found", true,
                    false);
            return;
        }

        final String fileURLString = fileURL.toExternalForm();
        if (store.containsFileName(fileURLString))
            return;

        store.addFileName(fileURLString);

        if (!attribute.getValue().endsWith(PROPERTIES_EXTENSION)) {
            final String referencedContent =
                    ReflectionManager
                            .getFileContent(file, document, attribute);
            final XMLParser parser = new XMLParser();
            final WorkflowOutlineContentHandler contentHandler =
                    new WorkflowOutlineContentHandler();
            contentHandler.setDocument(document);
            contentHandler.setPositionCategory("dummy");
            contentHandler.setDocumentLocator(new LocatorImpl());
            try {
                parser.parse(referencedContent);
                final WorkflowElement root = parser.getRootElement();
                final ReferenceAnalyzer analyzer =
                        new ReferenceAnalyzer(file, document, store);
                analyzer.analyzeElement(root);
            } catch (final SAXException e) {
                Log.logError("Parse error", e);
            }
        }
    }
}
