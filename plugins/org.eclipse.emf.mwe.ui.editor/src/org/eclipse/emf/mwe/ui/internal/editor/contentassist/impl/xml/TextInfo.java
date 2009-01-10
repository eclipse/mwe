/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

class TextInfo {
	private final String text;

	private final boolean isWhiteSpace;

	private final int documentOffset;

	public TextInfo(final String text, final int documentOffset,
			final boolean isWhiteSpace) {
		this.text = text;
		this.isWhiteSpace = isWhiteSpace;
		this.documentOffset = documentOffset;
	}

	public int getDocumentOffset() {
		return documentOffset;
	}

	public String getText() {
		return text;
	}

	public boolean isWhiteSpace() {
		return isWhiteSpace;
	}
}