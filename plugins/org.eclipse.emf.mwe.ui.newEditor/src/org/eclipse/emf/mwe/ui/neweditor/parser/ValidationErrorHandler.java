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

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class ValidationErrorHandler extends DefaultHandler {

    private final List errorList = new ArrayList();

    private Locator locator;

    public ValidationErrorHandler() {
    }

    @Override
    public void error(final SAXParseException e) throws SAXException {

        handleError(e, false);

    }

    @Override
    public void fatalError(final SAXParseException e) throws SAXException {
        handleError(e, true);
    }

    public List getErrorList() {
        return errorList;
    }

    @Override
    public void setDocumentLocator(final Locator locator) {
        this.locator = locator;
    }

    protected ValidationError nextError(final SAXParseException e,
            final boolean isFatal) {
        final String errorMessage = e.getMessage();

        final int lineNumber = locator.getLineNumber();
        final int columnNumber = locator.getColumnNumber();

        log(this, (isFatal ? "FATAL " : "Non-Fatal") + "Error on line "
                + lineNumber + ", column " + columnNumber + ": "
                + errorMessage);

        final ValidationError validationError = new ValidationError();
        validationError.setLineNumber(lineNumber);
        validationError.setColumnNumber(columnNumber);
        validationError.setErrorMessage(errorMessage);
        return validationError;
    }

    private void handleError(final SAXParseException e, final boolean isFatal) {
        final ValidationError validationError = nextError(e, isFatal);
        errorList.add(validationError);
        System.out.println(validationError.toString());

    }

    private void log(final ValidationErrorHandler handler, final String string) {
    }

}
