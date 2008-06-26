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

import org.xml.sax.Locator;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */
public class ValidationException extends RuntimeException {

	private final int lineNumber;

	private final int columnNumber;

	private final boolean isFatal;

	public ValidationException(final int line, final int column,
			final String errorMessage, final boolean isFatal) {
		super(errorMessage);
		lineNumber = line;
		columnNumber = column;
		this.isFatal = isFatal;
	}

	public ValidationException(final Locator locator,
			final String errorMessage, final boolean isFatal) {
		super(errorMessage);
		lineNumber = locator.getLineNumber();
		columnNumber = locator.getColumnNumber();
		this.isFatal = isFatal;
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
}
