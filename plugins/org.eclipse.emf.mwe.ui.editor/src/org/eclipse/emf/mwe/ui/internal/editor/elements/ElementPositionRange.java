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

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.9 $
 */
public class ElementPositionRange implements IRangeCheck {

	private final IDocument document;

	private int startOffset;

	private int endOffset;

	/**
	 * Creates a position range with default values.
	 * 
	 * @param document
	 *            the containing document.
	 */
	public ElementPositionRange(final IDocument document) {
		if (document == null)
			throw new IllegalArgumentException();

		this.document = document;
	}

	/**
	 * Creates a position range from a single <code>ElementPositionRange</code>
	 * object.
	 * 
	 * @param document
	 *            the containing document.
	 * @param position
	 *            the position range.
	 */
	public ElementPositionRange(final IDocument document,
			final ElementPositionRange position) {
		if (document == null || position == null)
			throw new IllegalArgumentException();

		this.document = document;
		startOffset = position.getStartOffset();
		endOffset = position.getEndOffset();
		checkOrder();
	}

	/**
	 * Creates a position range from two different
	 * <code>ElementPositionRange</code> objects.
	 * 
	 * @param document
	 *            the containing document.
	 * @param startPosition
	 *            the position range of the start element.
	 * @param endPosition
	 *            the position range of the end element.
	 */
	public ElementPositionRange(final IDocument document,
			final ElementPositionRange startPosition,
			final ElementPositionRange endPosition) {
		if (document == null || startPosition == null || endPosition == null)
			throw new IllegalArgumentException();

		this.document = document;
		startOffset = startPosition.getStartOffset();
		endOffset = endPosition.getEndOffset();
		checkOrder();
	}

	/**
	 * Creates a position range from a start offset and an end offset.
	 * 
	 * @param document
	 *            the containing document.
	 * @param startOffset
	 *            the start offset.
	 * @param endOffset
	 *            the end offset.
	 */
	public ElementPositionRange(final IDocument document,
			final int startOffset, final int endOffset) {
		if (document == null)
			throw new IllegalArgumentException();

		this.document = document;
		this.startOffset = startOffset;
		this.endOffset = endOffset;
		checkOrder();
	}

	/**
	 * Creates a position range from an <code>IRegion</code> object.
	 * 
	 * @param document
	 *            the containing component.
	 * @param region
	 *            the <code>Iregion</code> object.
	 */
	public ElementPositionRange(final IDocument document, final IRegion region) {
		if (document == null || region == null)
			throw new IllegalArgumentException();

		this.document = document;
		startOffset = region.getOffset();
		endOffset = startOffset + region.getLength() - 1;
		checkOrder();
	}

	public Integer getEndColumn() {
		try {
			final int line = getEndLine();
			final int lineOffset = document.getLineOffset(line);
			return endOffset - lineOffset;
		} catch (final BadLocationException e) {
			return null;
		}
	}

	public Integer getEndLine() {
		try {
			final int line = document.getLineOfOffset(endOffset);
			return line;
		} catch (final BadLocationException e) {
			return null;
		}
	}

	/**
	 * Returns the value of field <code>endOffset</code>.
	 * 
	 * @return value of <code>endOffset</code>.
	 */
	public int getEndOffset() {
		return endOffset;
	}

	public ElementPositionRange getFirstLine() {
		try {
			final int line = document.getLineOfOffset(getStartOffset());
			final int lineOffset = document.getLineOffset(line);
			final int end = lineOffset + document.getLineLength(line);
			return new ElementPositionRange(document, lineOffset, end);
		} catch (final BadLocationException e) {
			return null;
		}

	}

	public int getLength() {
		return Math.abs(endOffset - startOffset) + 1;
	}

	public Integer getStartColumn() {
		try {
			final int line = getStartLine();
			final int lineOffset = document.getLineOffset(line);
			return startOffset - lineOffset;
		} catch (final BadLocationException e) {
			return null;
		}
	}

	public Integer getStartLine() {
		try {
			final int line = document.getLineOfOffset(startOffset);
			return line;
		} catch (final BadLocationException e) {
			return null;
		}
	}

	/**
	 * Returns the value of field <code>startOffset</code>.
	 * 
	 * @return value of <code>startOffset</code>.
	 */
	public int getStartOffset() {
		return startOffset;
	}

	public boolean isInRange(final int offset) {
		return startOffset <= offset && offset <= endOffset;
	}

	/**
	 * Sets a new value for field <code>endOffset</code>.
	 * 
	 * @param endOffset
	 *            new value for <code>endOffset</code>.
	 */
	public void setEndOffset(final int endOffset) {
		if (endOffset < 0 || endOffset > document.getLength())
			throw new IllegalArgumentException();

		this.endOffset = endOffset;
	}

	/**
	 * Sets a new value for field <code>startOffset</code>.
	 * 
	 * @param startOffset
	 *            new value for <code>startOffset</code>.
	 */
	public void setStartOffset(final int startOffset) {
		if (startOffset < 0 || startOffset > document.getLength())
			throw new IllegalArgumentException();

		this.startOffset = startOffset;
		checkOrder();
	}

	public ElementPositionRange trimWhitespace() {
		try {
			while (startOffset < document.getLength()
					&& Character.isWhitespace(document.getChar(startOffset))) {
				startOffset++;
			}
		} catch (final BadLocationException e) {
			// Do nothing
		}

		try {
			while (endOffset > 0 && endOffset > startOffset
					&& Character.isWhitespace(document.getChar(endOffset))) {
				endOffset--;
			}
		} catch (final BadLocationException e) {
			// Do nothing
		}
		return this;
	}

	private void checkOrder() {
		if (endOffset < startOffset) {
			final int tmp = startOffset;
			startOffset = endOffset;
			endOffset = tmp;
		}
	}
}
