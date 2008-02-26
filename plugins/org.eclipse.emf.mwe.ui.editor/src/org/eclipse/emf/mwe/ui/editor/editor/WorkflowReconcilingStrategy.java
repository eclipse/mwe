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

package org.eclipse.emf.mwe.ui.editor.editor;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.swt.widgets.Display;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowReconcilingStrategy implements IReconcilingStrategy,
        IReconcilingStrategyExtension {

    protected static final int START_TAG = 1;

    protected static final int LEAF_TAG = 2;

    protected static final int END_TAG = 3;

    protected static final int EOR_TAG = 4;

    protected static final int COMMENT_TAG = 5;

    protected static final int PI_TAG = 6;

    protected final ArrayList positions = new ArrayList();

    protected int offset;

    protected int rangeEnd;

    /**
     * next character position - used locally and only valid while
     * {@link #calculatePositions()} is in progress.
     */
    protected int nextPos;

    /** number of newLines found by {@link #classifyTag()} */
    protected int newLines;

    protected char lastNewLineChar = ' ';

    private WorkflowEditor editor;

    private IDocument document;

    /**
     * @return Returns the editor.
     */
    public WorkflowEditor getEditor() {
        return editor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#initialReconcile()
     */
    public void initialReconcile() {
        offset = 0;
        rangeEnd = document.getLength();
        calculatePositions();

    }

    /*
     * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.reconciler.DirtyRegion,
     *      org.eclipse.jface.text.IRegion)
     */
    public void reconcile(final DirtyRegion dirtyRegion,
            final IRegion subRegion) {
        initialReconcile();
    }

    /**
     * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.IRegion)
     */
    public void reconcile(final IRegion partition) {
        initialReconcile();
    }

    /**
     * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#setDocument(org.eclipse.jface.text.IDocument)
     */
    public void setDocument(final IDocument document) {
        this.document = document;

    }

    public void setEditor(final WorkflowEditor editor) {
        this.editor = editor;
    }

    /**
     * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#setProgressMonitor(org.eclipse.core.runtime.IProgressMonitor)
     */
    public void setProgressMonitor(final IProgressMonitor monitor) {

    }

    /**
     * uses {@link #document}, {@link #offset} and {@link #rangeEnd} to
     * calculate {@link #positions}. About syntax errors: this method is not a
     * validator, it is useful.
     */
    protected void calculatePositions() {
        positions.clear();
        nextPos = offset;

        try {
            recursiveTokens(0);
        } catch (final BadLocationException e) {
            e.printStackTrace();
        }
        // Collections.sort(positions, new RangeTokenComparator());

        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                editor.updateFoldingStructure(positions);
            }

        });
    }

    /**
     * classsifies a tag: <br />
     * &lt;?...?&gt;: {@link #PI_TAG} <br />
     * &lt;!...--&gt;: {@link #COMMENT_TAG} <br />
     * &lt;...&gt;: {@link #START_TAG} <br />
     * &lt;.../&gt;: {@link #LEAF_TAG} <br />
     * &lt;/...&gt;: {@link #END_TAG} <br />
     * &lt;...: {@link #EOR_TAG} (end of range reached before closing &gt; is
     * found). <br />
     * when this method is called, {@link #nextPos} must point to the character
     * after &lt;, when it returns, it points to the character after &gt; or
     * after the range. About syntax errors: this method is not a validator, it
     * is useful. Side effect: writes number of found newLines to
     * {@link #newLines}.
     * 
     * @return the tag classification
     */
    protected int classifyTag() {
        int retVal = 0;
        try {
            final char ch = document.getChar(nextPos++);
            newLines = 0;

            if ('?' == ch)
                retVal = (isProcessingInstruction(document)) ? WorkflowReconcilingStrategy.PI_TAG
                        : WorkflowReconcilingStrategy.EOR_TAG;
            else if ('!' == ch)
                retVal = (isComment(document)) ? WorkflowReconcilingStrategy.COMMENT_TAG
                        : WorkflowReconcilingStrategy.EOR_TAG;

            if (retVal == 0)
                if (consumeWhitespace(document))
                    retVal = WorkflowReconcilingStrategy.EOR_TAG;

            if (retVal == 0 && '/' == ch)
                retVal = (isEndTag(document)) ? WorkflowReconcilingStrategy.END_TAG
                        : WorkflowReconcilingStrategy.EOR_TAG;

            if (retVal == 0)
                retVal = isStartOrLeafTag(document);

            assert (retVal != 0);

            return retVal;
        } catch (final BadLocationException e) {
            // should not happen, but we treat it as end of range
            return WorkflowReconcilingStrategy.EOR_TAG;
        }
    }

    protected int eatToEndOfLine() throws BadLocationException {
        if (nextPos >= rangeEnd)
            return 0;
        char ch = document.getChar(nextPos++);
        // 1. eat all spaces and tabs
        while ((nextPos < rangeEnd) && ((' ' == ch) || ('\t' == ch))) {
            ch = document.getChar(nextPos++);
        }
        if (nextPos >= rangeEnd) {
            nextPos--;
            return 0;
        }

        if ('\n' == ch) {
            if (nextPos < rangeEnd) {
                ch = document.getChar(nextPos++);
                if ('\r' != ch) {
                    nextPos--;
                }
            } else {
                nextPos--;
            }
            return 1;
        }

        if ('\r' == ch) {
            if (nextPos < rangeEnd) {
                ch = document.getChar(nextPos++);
                if ('\n' != ch) {
                    nextPos--;
                }
            } else {
                nextPos--;
            }
            return 1;
        }

        return 0;
    }

    protected void emitPosition(final int startOffset, final int length) {
        positions.add(new Position(startOffset, length));
    }

    /**
     * emits tokens to {@link #positions}.
     * 
     * @return number of newLines
     * @throws BadLocationException
     */
    protected int recursiveTokens(final int depth) throws BadLocationException {
        int newLines = 0;
        while (nextPos < rangeEnd) {
            while (nextPos < rangeEnd) {
                final char ch = document.getChar(nextPos++);
                switch (ch) {
                    case '<':
                        final int startOffset = nextPos - 1;
                        final int startNewLines = newLines;
                        final int classification = classifyTag();
                        final String tagString = document.get(startOffset,
                                Math.min(nextPos - startOffset, rangeEnd
                                        - startOffset));
                        newLines += newLines;

                        switch (classification) {
                            case START_TAG:
                                newLines += recursiveTokens(depth + 1);
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, nextPos
                                            - startOffset);
                                }
                                break;
                            case LEAF_TAG:
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, nextPos
                                            - startOffset);
                                }
                                break;
                            case COMMENT_TAG:
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, nextPos
                                            - startOffset);
                                }
                                break;
                            case PI_TAG:
                                break;
                            case END_TAG:
                            case EOR_TAG:
                                return newLines;
                            default:
                                break;
                        }
                        break;
                    case '\n':
                    case '\r':
                        if ((ch == lastNewLineChar)
                                || (' ' == lastNewLineChar)) {
                            newLines++;
                            lastNewLineChar = ch;
                        }
                        break;
                    default:
                        break;
                }
            }

        }
        return newLines;
    }

    private boolean consumeWhitespace(final IDocument document)
            throws BadLocationException {
        char ch = document.getChar(nextPos++);
        while ((' ' == ch) || ('\t' == ch) || ('\n' == ch) || ('\r' == ch)) {
            ch = document.getChar(nextPos++);
            if (nextPos > rangeEnd)
                return true;
        }
        return false;
    }

    private boolean isComment(final IDocument document)
            throws BadLocationException {
        // skip "--"
        nextPos++;
        nextPos++;

        int commEnd = 0;
        while (nextPos < rangeEnd) {
            final char ch = document.getChar(nextPos++);
            if (('>' == ch) && (commEnd >= 2))
                return true;

            if (('\n' == ch) || ('\r' == ch)) {
                if ((ch == lastNewLineChar) || (' ' == lastNewLineChar)) {
                    newLines++;
                    lastNewLineChar = ch;
                }
            }
            if ('-' == ch) {
                commEnd++;
            } else {
                commEnd = 0;
            }
        }
        return false;
    }

    private boolean isEndTag(final IDocument document)
            throws BadLocationException {
        while (nextPos < rangeEnd) {
            char ch = document.getChar(nextPos++);
            if ('>' == ch) {
                newLines += eatToEndOfLine();
                return true;
            }
            if ('"' == ch) {
                ch = document.getChar(nextPos++);
                while ((nextPos < rangeEnd) && ('"' != ch)) {
                    ch = document.getChar(nextPos++);
                }
            } else if ('\'' == ch) {
                ch = document.getChar(nextPos++);
                while ((nextPos < rangeEnd) && ('\'' != ch)) {
                    ch = document.getChar(nextPos++);
                }
            }
        }
        return false;
    }

    private boolean isProcessingInstruction(final IDocument document)
            throws BadLocationException {
        boolean piFlag = false;
        while (nextPos < rangeEnd) {
            final char ch = document.getChar(nextPos++);
            if (('>' == ch) && piFlag)
                return true;

            piFlag = ('?' == ch);
        }
        return false;

    }

    private int isStartOrLeafTag(final IDocument document)
            throws BadLocationException {
        int retVal = 0;
        while (nextPos < rangeEnd) {
            char ch = document.getChar(nextPos++);
            // end tag?
            restart: switch (ch) {
                case '/':
                    while (nextPos < rangeEnd) {
                        ch = document.getChar(nextPos++);
                        if ('>' == ch) {
                            newLines += eatToEndOfLine();
                            retVal = WorkflowReconcilingStrategy.LEAF_TAG;
                            break;
                        }
                    }
                    if (retVal == 0)
                        retVal = WorkflowReconcilingStrategy.EOR_TAG;

                    break;
                case '"':
                    while (nextPos < rangeEnd) {
                        ch = document.getChar(nextPos++);
                        if ('"' == ch)
                            break restart;
                    }
                    retVal = WorkflowReconcilingStrategy.EOR_TAG;
                    break;
                case '\'':
                    while (nextPos < rangeEnd) {
                        ch = document.getChar(nextPos++);
                        if ('\'' == ch)
                            break restart;
                    }
                    retVal = WorkflowReconcilingStrategy.EOR_TAG;
                    break;

                case '>':
                    newLines += eatToEndOfLine();
                    retVal = WorkflowReconcilingStrategy.START_TAG;
                    break;
                default:
                    break;
            }

        }
        return retVal;
    }
}
