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

package org.eclipse.emf.mwe.ui.editor.parser;

import org.eclipse.emf.mwe.ui.editor.internal.logging.Log;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class ValidationErrorHandler extends DefaultHandler {

    private Locator locator;

    private boolean loggingStatus;

    @Override
    public void error(final SAXParseException e) throws SAXException {
        throw createException(e, false);

    }

    @Override
    public void fatalError(final SAXParseException e) throws SAXException {
        throw createException(e, true);
    }

    public boolean isLogging() {
        return loggingStatus;
    }

    @Override
    public void setDocumentLocator(final Locator locator) {
        this.locator = locator;
    }

    public void setLoggingStatus(final boolean loggingStatus) {
        this.loggingStatus = loggingStatus;
    }

    protected ValidationException createException(final SAXParseException e,
            final boolean isFatal) {
        final String errorMessage = e.getMessage();

        final ValidationException validationException =
                new ValidationException(locator, errorMessage, isFatal);

        if (isLogging())
            log(validationException.getDetailedMessage(), validationException);

        return validationException;
    }

    private void log(final String message, final Throwable cause) {
        Log.logError(message, cause);
    }

}
