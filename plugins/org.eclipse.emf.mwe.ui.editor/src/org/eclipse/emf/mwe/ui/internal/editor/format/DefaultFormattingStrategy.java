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

package org.eclipse.emf.mwe.ui.internal.editor.format;

import org.eclipse.jface.text.formatter.IFormattingStrategy;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
public class DefaultFormattingStrategy implements IFormattingStrategy {
	protected static final String LINE_SEPARATOR =
			System.getProperty("line.separator");

	public DefaultFormattingStrategy() {
		super();
	}

	public String format(final String content, final boolean isLineStart,
			final String indentation, final int[] positions) {
		return "";
	}

	public void formatterStarts(final String initialIndentation) {
	}

	public void formatterStops() {
	}
}
