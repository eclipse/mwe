/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.parser;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class ParserProblemException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -746617143901049067L;
	private Queue<AbstractWorkflowElement> elementTrace = new LinkedList<AbstractWorkflowElement>();

	public ParserProblemException() {
	}

	public ParserProblemException(String message) {
		super(message);
	}

	public ParserProblemException(Throwable cause) {
		super(cause);
	}

	public ParserProblemException(String message, Throwable cause) {
		super(message, cause);
	}

	public void addElement(AbstractWorkflowElement element) {
		if (element == null)
			throw new IllegalArgumentException();

		elementTrace.add(element);
	}

	public String getElementTrace() {
		StringBuilder builder = new StringBuilder();
		builder.append("Element trace:\n");
		for (AbstractWorkflowElement e : elementTrace) {
			builder.append('\t');
			builder.append(getElementMessage(e));
			builder.append('\n');
		}
		return builder.toString();
	}

	private String getElementMessage(AbstractWorkflowElement element) {
		if (element == null || !element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE))
			throw new IllegalArgumentException();

		String ref = element.getAttributeValue(IWorkflowAttribute.FILE_ATTRIBUTE);
		File file = element.getFile();
		String fileString = (file != null) ? " in file '" + file.getAbsolutePath() : "";
		ElementPositionRange range = element.getElementRange();
		Integer startLine = range.getStartLine();
		String lineString = (startLine != null) ? " in line " + startLine.toString() : "";
		return "Invalid reference '" + ref + "'" + lineString + fileString;
	}
}
