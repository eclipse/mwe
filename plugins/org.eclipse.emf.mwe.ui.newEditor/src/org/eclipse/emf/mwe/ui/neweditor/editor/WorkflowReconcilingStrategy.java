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

package org.eclipse.emf.mwe.ui.neweditor.editor;

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

public class WorkflowReconcilingStrategy implements IReconcilingStrategy,
        IReconcilingStrategyExtension {

    protected static final int START_TAG = 1;

    protected static final int LEAF_TAG = 2;

    protected static final int END_TAG = 3;

    protected static final int EOR_TAG = 4;

    protected static final int COMMENT_TAG = 5;

    protected static final int PI_TAG = 6;

    protected final ArrayList fPositions = new ArrayList();

    protected int fOffset;

    protected int fRangeEnd;

    /**
     * next character position - used locally and only valid while
     * {@link #calculatePositions()} is in progress.
     */
    protected int cNextPos;

    /** number of newLines found by {@link #classifyTag()} */
    protected int cNewLines;

    protected char cLastNLChar = ' ';

    private WorkflowEditor editor;

    private IDocument fDocument;

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
        fOffset = 0;
        fRangeEnd = fDocument.getLength();
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
        fDocument = document;

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
     * uses {@link #fDocument}, {@link #fOffset} and {@link #fRangeEnd} to
     * calculate {@link #fPositions}. About syntax errors: this method is not a
     * validator, it is useful.
     */
    protected void calculatePositions() {
        fPositions.clear();
        cNextPos = fOffset;

        try {
            recursiveTokens(0);
        } catch (final BadLocationException e) {
            e.printStackTrace();
        }
        // Collections.sort(fPositions, new RangeTokenComparator());

        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                editor.updateFoldingStructure(fPositions);
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
     * when this method is called, {@link #cNextPos} must point to the character
     * after &lt;, when it returns, it points to the character after &gt; or
     * after the range. About syntax errors: this method is not a validator, it
     * is useful. Side effect: writes number of found newLines to
     * {@link #cNewLines}.
     * 
     * @return the tag classification
     */
    protected int classifyTag() {
        int retVal = 0;
        try {
            char ch = fDocument.getChar(cNextPos++);
            cNewLines = 0;

            // processing instruction?
            if ('?' == ch) {
                boolean piFlag = false;
                while (cNextPos < fRangeEnd) {
                    ch = fDocument.getChar(cNextPos++);
                    if (('>' == ch) && piFlag) {
                        retVal = PI_TAG;
                        break;
                    }
                    piFlag = ('?' == ch);
                }
                if (retVal == 0)
                    retVal = EOR_TAG;
            }

            // comment?
            if (retVal == 0 && '!' == ch) {
                // must be '-' but we don't care if not
                cNextPos++;
                // must be '-' but we don't care if not
                cNextPos++;
                int commEnd = 0;
                while (cNextPos < fRangeEnd) {
                    ch = fDocument.getChar(cNextPos++);
                    if (('>' == ch) && (commEnd >= 2)) {
                        retVal = COMMENT_TAG;
                        break;
                    }

                    if (('\n' == ch) || ('\r' == ch)) {
                        if ((ch == cLastNLChar) || (' ' == cLastNLChar)) {
                            cNewLines++;
                            cLastNLChar = ch;
                        }
                    }
                    if ('-' == ch) {
                        commEnd++;
                    } else {
                        commEnd = 0;
                    }
                }
                if (retVal == 0)
                    retVal = EOR_TAG;
            }

            if (retVal == 0) {
                // consume whitespaces
                while ((' ' == ch) || ('\t' == ch) || ('\n' == ch)
                        || ('\r' == ch)) {
                    ch = fDocument.getChar(cNextPos++);
                    if (cNextPos > fRangeEnd) {
                        retVal = EOR_TAG;
                        break;
                    }
                }
            }

            // end tag?
            if (retVal == 0 && '/' == ch) {
                while (cNextPos < fRangeEnd) {
                    ch = fDocument.getChar(cNextPos++);
                    if ('>' == ch) {
                        cNewLines += eatToEndOfLine();
                        retVal = END_TAG;
                    }
                    if ('"' == ch) {
                        ch = fDocument.getChar(cNextPos++);
                        while ((cNextPos < fRangeEnd) && ('"' != ch)) {
                            ch = fDocument.getChar(cNextPos++);
                        }
                    } else if ('\'' == ch) {
                        ch = fDocument.getChar(cNextPos++);
                        while ((cNextPos < fRangeEnd) && ('\'' != ch)) {
                            ch = fDocument.getChar(cNextPos++);
                        }
                    }
                }
                if (retVal == 0)
                    retVal = EOR_TAG;
            }

            if (retVal == 0) {
                // start tag or leaf tag?
                while (cNextPos < fRangeEnd) {
                    ch = fDocument.getChar(cNextPos++);
                    // end tag?
                    s: switch (ch) {
                        case '/':
                            while (cNextPos < fRangeEnd) {
                                ch = fDocument.getChar(cNextPos++);
                                if ('>' == ch) {
                                    cNewLines += eatToEndOfLine();
                                    retVal = LEAF_TAG;
                                    break;
                                }
                            }
                            if (retVal == 0)
                                retVal = EOR_TAG;

                            break;
                        case '"':
                            while (cNextPos < fRangeEnd) {
                                ch = fDocument.getChar(cNextPos++);
                                if ('"' == ch)
                                    break s;
                            }
                            retVal = EOR_TAG;
                            break;
                        case '\'':
                            while (cNextPos < fRangeEnd) {
                                ch = fDocument.getChar(cNextPos++);
                                if ('\'' == ch)
                                    break s;
                            }
                            retVal = EOR_TAG;
                            break;

                        case '>':
                            cNewLines += eatToEndOfLine();
                            retVal = START_TAG;
                            break;
                        default:
                            break;
                    }

                }
            }
            if (retVal == 0)
                retVal = EOR_TAG;

            return retVal;
        } catch (final BadLocationException e) {
            // should not happen, but we treat it as end of range
            return EOR_TAG;
        }
    }

    protected int eatToEndOfLine() throws BadLocationException {
        if (cNextPos >= fRangeEnd)
            return 0;
        char ch = fDocument.getChar(cNextPos++);
        // 1. eat all spaces and tabs
        while ((cNextPos < fRangeEnd) && ((' ' == ch) || ('\t' == ch))) {
            ch = fDocument.getChar(cNextPos++);
        }
        if (cNextPos >= fRangeEnd) {
            cNextPos--;
            return 0;
        }

        // now ch is a new line or a non-whitespace
        if ('\n' == ch) {
            if (cNextPos < fRangeEnd) {
                ch = fDocument.getChar(cNextPos++);
                if ('\r' != ch) {
                    cNextPos--;
                }
            } else {
                cNextPos--;
            }
            return 1;
        }

        if ('\r' == ch) {
            if (cNextPos < fRangeEnd) {
                ch = fDocument.getChar(cNextPos++);
                if ('\n' != ch) {
                    cNextPos--;
                }
            } else {
                cNextPos--;
            }
            return 1;
        }

        return 0;
    }

    protected void emitPosition(final int startOffset, final int length) {
        fPositions.add(new Position(startOffset, length));
    }

    /**
     * emits tokens to {@link #fPositions}.
     * 
     * @return number of newLines
     * @throws BadLocationException
     */
    protected int recursiveTokens(final int depth) throws BadLocationException {
        int newLines = 0;
        while (cNextPos < fRangeEnd) {
            while (cNextPos < fRangeEnd) {
                final char ch = fDocument.getChar(cNextPos++);
                switch (ch) {
                    case '<':
                        final int startOffset = cNextPos - 1;
                        final int startNewLines = newLines;
                        final int classification = classifyTag();
                        final String tagString = fDocument.get(startOffset,
                                Math.min(cNextPos - startOffset, fRangeEnd
                                        - startOffset)); // this is to see
                        // where we are in
                        // the debugger
                        newLines += cNewLines; // cNewLines is written by
                        // classifyTag()

                        switch (classification) {
                            case START_TAG:
                                newLines += recursiveTokens(depth + 1);
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, cNextPos
                                            - startOffset);
                                }
                                break;
                            case LEAF_TAG:
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, cNextPos
                                            - startOffset);
                                }
                                break;
                            case COMMENT_TAG:
                                if (newLines > startNewLines + 1) {
                                    emitPosition(startOffset, cNextPos
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
                        if ((ch == cLastNLChar) || (' ' == cLastNLChar)) {
                            newLines++;
                            cLastNLChar = ch;
                        }
                        break;
                    default:
                        break;
                }
            }

        }
        return newLines;
    }
}
