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

package org.eclipse.emf.mwe.ui.internal.editor.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.apache.xerces.parsers.SAXParser;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.8 $
 */
public class XMLParser {

	public static final String VALIDATION_FEATURE =
			"http://xml.org/sax/features/validation";

	private ErrorHandler errorHandler;

	private WorkflowContentHandler contentHandler;

	public WorkflowElement getRootElement() {
		WorkflowElement root = null;
		if (contentHandler != null)
			root = contentHandler.getRootElement();

		return root;
	}

	public void parse(final File xmlFilePath) throws SAXException {

		InputSource inputSource = null;
		try {
			inputSource = new InputSource(new FileReader(xmlFilePath));
		} catch (final FileNotFoundException e) {
			Log.logError(e);
		}
		parse(inputSource);
	}

	public void parse(final InputSource inputSource) throws SAXException {
		try {
			final XMLReader reader = new SAXParser();
			reader.setErrorHandler(errorHandler);
			reader.setContentHandler(contentHandler);
			reader.setFeature(VALIDATION_FEATURE, true);
			reader.parse(inputSource);
		} catch (final SAXNotRecognizedException e) {
			Log.logError(e);
		} catch (final SAXNotSupportedException e) {
			Log.logError(e);
		} catch (final IOException e) {
			Log.logError(e);
		}
	}

	public void parse(final String xmlText) throws SAXException {
		final InputSource inputSource =
				new InputSource(new StringReader(xmlText));
		parse(inputSource);
	}

	public void setContentHandler(final WorkflowContentHandler contentHandler) {
		this.contentHandler = contentHandler;
	}

	public void setErrorHandler(final WorkflowContentHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
}
