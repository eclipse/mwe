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

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextViewer;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class WorkflowDoubleClickStrategy implements ITextDoubleClickStrategy {
    protected ITextViewer fText;

    public void doubleClicked(final ITextViewer part) {
        final int pos = part.getSelectedRange().x;

        if (pos < 0)
            return;

        fText = part;

        if (!selectComment(pos)) {
            selectWord(pos);
        }
    }

    protected boolean selectComment(final int caretPos) {
        final IDocument doc = fText.getDocument();
        int startPos;
        int endPos;
        String delimiter = null;

        try {
            final int line = doc.getLineOfOffset(caretPos);
            delimiter = doc.getLineDelimiter(line);
        } catch (final BadLocationException e) {
            return false;
        }

        try {
            int pos = caretPos;
            Character c = ' ';

            while (pos >= 0) {
                c = doc.getChar(pos);
                if (c == '\\') {
                    pos -= 2;
                    continue;
                }
                if (delimiter.contains(c.toString()) || c == '\"')
                    break;

                --pos;
            }

            if (c != '\"')
                return false;

            startPos = pos;

            pos = caretPos;
            final int length = doc.getLength();
            c = ' ';

            while (pos < length) {
                c = doc.getChar(pos);
                if (delimiter.contains(c.toString()) || c == '\"')
                    break;

                ++pos;
            }
            if (c != '\"')
                return false;

            endPos = pos;

            final int offset = startPos + 1;
            final int len = endPos - offset;
            fText.setSelectedRange(offset, len);
            return true;
        } catch (final BadLocationException x) {
            // do nothing
        }

        return false;
    }

    protected boolean selectWord(final int caretPos) {

        final IDocument doc = fText.getDocument();
        int startPos, endPos;

        try {
            int pos = caretPos;
            char c;

            while (pos >= 0) {
                c = doc.getChar(pos);
                if (!Character.isJavaIdentifierPart(c))
                    break;

                --pos;
            }

            startPos = pos;

            pos = caretPos;
            final int length = doc.getLength();

            while (pos < length) {
                c = doc.getChar(pos);
                if (!Character.isJavaIdentifierPart(c))
                    break;
                ++pos;
            }

            endPos = pos;
            selectRange(startPos, endPos);
            return true;

        } catch (final BadLocationException x) {
            // do nothing
        }
        return false;
    }

    private void selectRange(final int startPos, final int stopPos) {
        final int offset = startPos + 1;
        final int length = stopPos - offset;
        fText.setSelectedRange(offset, length);
    }
}
