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

import org.eclipse.jface.text.IRegion;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class ElementOffsetRange {

    private final int startOffset;

    private final int endOffset;

    /**
     * Creates an offset range from a single position range element.
     * 
     * @param position
     *            the position range.
     */
    public ElementOffsetRange(final ElementPositionRange position) {
        startOffset = position.getStartOffset();
        endOffset = position.getEndOffset();
    }

    public ElementOffsetRange(final ElementPositionRange startPosition,
            final ElementPositionRange endPosition) {
        startOffset = startPosition.getStartOffset();
        endOffset = endPosition.getEndOffset();
    }

    public ElementOffsetRange(final IRegion region) {
        startOffset = region.getOffset();
        endOffset = startOffset + region.getLength() - 1;
    }

    /**
     * Returns the value of field <code>endOffset</code>.
     * 
     * @return value of <code>endOffset</code>.
     */
    public int getEndOffset() {
        return endOffset;
    }

    public int getLength() {
        return Math.abs(endOffset - startOffset);
    }

    /**
     * Returns the value of field <code>startOffset</code>.
     * 
     * @return value of <code>startOffset</code>.
     */
    public int getStartOffset() {
        return startOffset;
    }
}
