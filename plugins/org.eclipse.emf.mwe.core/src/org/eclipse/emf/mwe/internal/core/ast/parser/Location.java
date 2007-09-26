/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.parser;

public class Location {
	private int lineNumber;

	private int columnNumber;

	private int nameStart;

	private int nameEnd;

	private final String resource;

	public Location(final int line, final int column, final String resource) {
		lineNumber = line;
		columnNumber = column;
		this.resource = resource;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getRawLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(final int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(final int columnNumber) {
		this.columnNumber = columnNumber;
	}

	public int getNameStart() {
		return nameStart;
	}

	public void setNameStart(final int nameStart) {
		this.nameStart = nameStart;
	}

	public int getNameEnd() {
		return nameEnd;
	}

	public void setNameEnd(final int nameEnd) {
		this.nameEnd = nameEnd;
	}

	public String getResource() {
		return resource;
	}

	@Override
	public String toString() {
		return "in " + resource + ":" + lineNumber;
	}

}
