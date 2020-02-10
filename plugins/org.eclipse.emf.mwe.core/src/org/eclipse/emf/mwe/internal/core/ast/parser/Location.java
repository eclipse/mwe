/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
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

	private String resource;

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

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}

	public int getNameStart() {
		return nameStart;
	}

	public void setNameStart(int nameStart) {
		this.nameStart = nameStart;
	}

	public int getNameEnd() {
		return nameEnd;
	}

	public void setNameEnd(int nameEnd) {
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
