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

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class ValidationError {

    private String errorMessage;

    private int lineNumber;

    private int columnNumber;

    public int getColumnNumber() {
        return columnNumber;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setColumnNumber(final int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setLineNumber(final int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("Error on ").append(" line ").append(lineNumber).append(
                ", column ").append(columnNumber).append(": ").append(
                errorMessage);
        return buf.toString();
    }
}
