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

package org.eclipse.emf.mwe.ui.neweditor.outline;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import workflow.WorkflowFile;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowContentHandler extends DefaultHandler {

    private WorkflowFile root;

    /**
     * This automatically generated method overrides the implementation of
     * <code>endDocument</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#endDocument()
     */
    @Override
    public void endDocument() throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.endDocument();
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>endElement</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    @Override
    public void endElement(final String arg0, final String arg1,
            final String arg2) throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.endElement(arg0, arg1, arg2);
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>error</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException)
     */
    @Override
    public void error(final SAXParseException arg0) throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.error(arg0);
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>fatalError</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException)
     */
    @Override
    public void fatalError(final SAXParseException arg0) throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.fatalError(arg0);
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>setDocumentLocator</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator)
     */
    @Override
    public void setDocumentLocator(final Locator arg0) {
        // TODO Automatically generated method stub. Review needed!
        super.setDocumentLocator(arg0);
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>startDocument</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#startDocument()
     */
    @Override
    public void startDocument() throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.startDocument();
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>startElement</code> inherited from the superclass.
     * 
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
     *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(final String arg0, final String arg1,
            final String arg2, final Attributes arg3) throws SAXException {
        // TODO Automatically generated method stub. Review needed!
        super.startElement(arg0, arg1, arg2, arg3);
    }

}
