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

package org.eclipse.emf.mwe.ui.neweditor.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.apache.xerces.parsers.SAXParser;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class XMLParser {

    public static final String VALIDATION_FEATURE =
            "http://xml.org/sax/features/validation";

    private ErrorHandler errorHandler;

    private ContentHandler contentHandler;

    public static void main(final String[] args) {
        try {
            final XMLParser parser = new XMLParser();
            parser.setErrorHandler(new ValidationErrorHandler());
            parser.doParse(new File(args[0]));
        } catch (final RuntimeException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public void doParse(final File xmlFilePath) {

        InputSource inputSource = null;
        try {
            inputSource = new InputSource(new FileReader(xmlFilePath));
        } catch (final FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        doParse(inputSource);
    }

    public void doParse(final InputSource inputSource) {
        try {
            final XMLReader reader = new SAXParser();
            reader.setErrorHandler(errorHandler);
            reader.setContentHandler(contentHandler);
            reader.setFeature(VALIDATION_FEATURE, true);
            reader.parse(inputSource);
        } catch (final SAXNotRecognizedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (final SAXNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (final IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (final SAXException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void doParse(final String xmlText) {
        final InputSource inputSource =
                new InputSource(new StringReader(xmlText));
        doParse(inputSource);
    }

    public void setContentHandler(final ContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    public void setErrorHandler(final ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }
}
