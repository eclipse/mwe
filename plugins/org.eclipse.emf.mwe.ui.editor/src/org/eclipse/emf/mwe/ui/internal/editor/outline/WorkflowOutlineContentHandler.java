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

package org.eclipse.emf.mwe.ui.internal.editor.outline;

import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.parser.ValidationException;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.jface.text.BadLocationException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class WorkflowOutlineContentHandler extends WorkflowContentHandler {

    private static final String NO_VALID_CHILD_ELEMENT_MSG =
            "is no valid child element for element";

    private static final String ILLEGAL_TAG_NAME_MSG = "Illegal tag name:";

    private static final String TAG_NAME_PATTERN = "[a-zA-Z0-9]+";

    private WorkflowElement rootElement;

    private WorkflowElement currentElement;

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
        if (isIllegalName(localName))
            throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG
                    + localName, true);

        final int line = locator.getLineNumber();
        final int endLine = getOffsetFromLine(line);
        final int length = endLine - currentElement.getStartOffset();
        currentElement.setLength(length);
        currentElement.setEndColumn(locator.getColumnNumber());
        if (currentElement.hasParent()) {
            currentElement = currentElement.getParent();
        }
    }

    /**
     * Returns the value of field <code>positionCategory</code>.
     * 
     * @return value of <code>positionCategory</code>.
     */
    public String getPositionCategory() {
        return positionCategory;
    }

    /**
     * Returns the value of field <code>rootElement</code>.
     * 
     * @return value of <code>rootElement</code>.
     */
    public WorkflowElement getRootElement() {
        return rootElement;
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
        rootElement = new WorkflowElement(WorkflowElement.WORKFLOWFILE_TAG);
        currentElement = rootElement;
        rootElement.setOffset(0);
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
        final int offset = getOffsetFromLine(line);

        final WorkflowElement element = new WorkflowElement(localName);
        if (isIllegalName(localName))
            throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG + " "
                    + localName, true);

        element.setOffset(offset);
        element.setStartColumn(locator.getColumnNumber());
        for (int i = 0; i < attributes.getLength(); i++) {
            final String attrName = attributes.getLocalName(i);
            final String attrValue = attributes.getValue(i);
            final WorkflowAttribute attr =
                    new WorkflowAttribute(attrName, attrValue);
            element.addAttribute(attr);
        }

        if (element.isValidChildFor(currentElement)) {
            currentElement.addChild(element);
        } else
            throw new ValidationException(locator, "'" + localName + "'"
                    + NO_VALID_CHILD_ELEMENT_MSG + " '"
                    + currentElement.getName() + "'", true);
        currentElement = element;
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

    private boolean isIllegalName(final String localName) {
        return !Pattern.matches(TAG_NAME_PATTERN, localName);
    }
}
