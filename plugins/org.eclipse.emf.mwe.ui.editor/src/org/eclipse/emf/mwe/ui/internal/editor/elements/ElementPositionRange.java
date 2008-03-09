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

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class ElementPositionRange {
    private final IDocument document;

    private int startOffset;

    private int endOffset;

    public ElementPositionRange(final IDocument document) {
        if (document == null)
            throw new IllegalArgumentException();

        this.document = document;
    }

    public ElementPositionRange(final IDocument document,
            final int startOffset, final int endOffset) {
        if (document == null)
            throw new IllegalArgumentException();

        this.document = document;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
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

    /**
     * Sets a new value for field <code>endOffset</code>.
     * 
     * @param endOffset
     *            new value for <code>endOffset</code>.
     */
    public void setEndOffset(final int endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * Sets a new value for field <code>startOffset</code>.
     * 
     * @param startOffset
     *            new value for <code>startOffset</code>.
     */
    public void setStartOffset(final int startOffset) {
        this.startOffset = startOffset;
        checkOrder();
    }

    private void checkOrder() {
        if (endOffset < startOffset) {
            final int tmp = startOffset;
            startOffset = endOffset;
            endOffset = tmp;
        }
    }
}
