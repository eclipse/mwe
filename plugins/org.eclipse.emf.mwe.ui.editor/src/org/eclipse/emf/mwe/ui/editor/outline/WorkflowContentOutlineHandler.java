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

package org.eclipse.emf.mwe.ui.editor.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.WorkflowElement;
import org.eclipse.emf.mwe.ui.editor.model.nodebuilder.NoSuchModelElement;
import org.eclipse.emf.mwe.ui.editor.model.nodebuilder.NodeBuilder;
import org.eclipse.emf.mwe.ui.editor.parser.WorkflowContentHandler;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowContentOutlineHandler extends WorkflowContentHandler {

    private EObject currentElement;

    private Locator locator;

    private IDocument document;

    private String positionCategory;

    /**
     * This method overrides the implementation of <code>endDocument</code>
     * inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#endDocument()
     */
    @Override
    public void endDocument() throws SAXException {
        assert (currentElement == rootElement);
    }

    /**
     * This method overrides the implementation of <code>endElement</code>
     * inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    @Override
    public void endElement(final String uri, final String localName,
            final String qName) throws SAXException {

        final int line = locator.getLineNumber();
        final int endLine = getOffsetFromLine(line);

        if (currentElement instanceof WorkflowElement) {
            final WorkflowElement workflowElement =
                    (WorkflowElement) currentElement;
            final int length = endLine - workflowElement.getOffset();
            workflowElement.setLength(length);
        }
        currentElement = currentElement.eContainer();
    }

    /**
     * Sets a new value for field <code>document</code>.
     * 
     * @param document
     *            new value for <code>document</code>.
     */
    public void setDocument(final IDocument document) {
        this.document = document;
    }

    /**
     * This method overrides the implementation of
     * <code>setDocumentLocator</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator)
     */
    @Override
    public void setDocumentLocator(final Locator locator) {
        this.locator = locator;
    }

    /**
     * Sets a new value for field <code>positionCategory</code>.
     * 
     * @param positionCategory
     *            new value for <code>positionCategory</code>.
     */
    public void setPositionCategory(final String positionCategory) {
        this.positionCategory = positionCategory;
    }

    /**
     * This method overrides the implementation of <code>startDocument</code>
     * inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#startDocument()
     */
    @Override
    public void startDocument() throws SAXException {

    }

    /**
     * This method overrides the implementation of <code>startElement</code>
     * inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
     *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(final String uri, final String localName,
            final String qName, final Attributes attributes)
            throws SAXException {

        final int line = locator.getLineNumber() - 1;
        final int startLine = getOffsetFromLine(line);
        final Position position = new Position(startLine);

        EObject element = null;

        try {
            element =
                    NodeBuilder.create(localName, attributes, currentElement,
                            position);
        } catch (final NoSuchModelElement e) {
            // TODO implement
        }

        currentElement = element;
        if (rootElement == null)
            rootElement = element;
    }

    private void addPosition(final Position position) {
        try {
            document.addPosition(positionCategory, position);
        } catch (final BadLocationException e) {
            e.printStackTrace();
        } catch (final BadPositionCategoryException e) {
            e.printStackTrace();
        }
    }

    private int getOffsetFromLine(final int lineNumber) {
        int offset = 0;
        try {
            offset = document.getLineOffset(lineNumber);
        } catch (final BadLocationException e) {
            try {
                offset = document.getLineOffset(lineNumber - 1);
            } catch (final BadLocationException e1) {
            }
        }
        return offset;
    }
}
