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

import org.xml.sax.Locator;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class ValidationException extends RuntimeException {

    private int lineNumber;

    private int columnNumber;

    private final Locator locator;

    private final boolean isFatal;

    public ValidationException(final Locator locator,
            final String errorMessage, final boolean isFatal) {
        super(errorMessage);
        this.locator = locator;
        this.isFatal = isFatal;
        setPosition();
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public String getDetailedMessage() {
        return (isFatal ? "FATAL " : "Non-Fatal") + "Error on line "
                + lineNumber + ", column " + columnNumber + ": "
                + getMessage();
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isFatal() {
        return isFatal;
    }

    private void setPosition() {
        lineNumber = locator.getLineNumber();
        columnNumber = locator.getColumnNumber();
    }
}