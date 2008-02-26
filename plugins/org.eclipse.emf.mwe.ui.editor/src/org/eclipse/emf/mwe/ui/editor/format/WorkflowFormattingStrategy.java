/*
 * All rights reserved. This program and the accompanying materials
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.editor.format;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowFormattingStrategy extends DefaultFormattingStrategy {

    boolean lastTagWasOpening;

    private String initialIndentation;

    public WorkflowFormattingStrategy() {
        super();
    }

    @Override
    public String format(final String content, final boolean isLineStart,
            final String indentation, final int[] positions) {
        String indent = indentation;

        if (isLineStart)
            indent = initialIndentation;

        final String cnt = formatContent(content);
        String retVal = cnt;

        if (cnt.indexOf("<") == -1) {
            if (cnt.indexOf("/>") != -1) {
                lastTagWasOpening = false;
            } else {
                lastTagWasOpening = true;
            }
            retVal = cnt;
        } else {
            retVal = formatLeafTag(indent, cnt);

            if (retVal == null) {
                retVal = isEndTag(indent, cnt);

                if (retVal == null)
                    formatStartTag(indent, cnt);
            }
        }
        return retVal;
    }

    @Override
    public void formatterStarts(final String initialIndentation) {
        this.initialIndentation = initialIndentation;
    }

    @Override
    public void formatterStops() {
    }

    protected String formatContent(final String content) {

        final String[] contentParts = content.split("\\s+|\r|\n");
        final StringBuffer buffer = new StringBuffer();
        for (final String element : contentParts) {
            buffer.append(element.trim()).append(" ");
        }
        buffer.delete(buffer.length() - 1, buffer.length());
        return buffer.toString();
    }

    private String formatLeafTag(final String indentation, final String cnt) {
        String retVal = null;
        String indent = indentation;

        if (cnt.indexOf("/>") != -1) {
            if (lastTagWasOpening) {
                indent += "\t";
            }

            lastTagWasOpening = false;
            retVal = LINE_SEPARATOR + indent + cnt;
        }
        return retVal;
    }

    private String formatStartTag(final String indentation, final String cnt) {
        String retVal = null;
        String indent = indentation;

        if (cnt.indexOf("<") != -1) {
            if (lastTagWasOpening) {
                indent += "\t";
            }

            lastTagWasOpening = true;
            retVal = LINE_SEPARATOR + indent + cnt;
        }
        return retVal;
    }

    private String isEndTag(final String indentation, final String cnt) {
        String retVal = null;
        String indent = indentation;

        if (cnt.indexOf("</") != -1) {
            boolean lastOpening = lastTagWasOpening;
            lastTagWasOpening = false;

            if (!lastOpening) {
                if (indent.length() > 1)
                    indent = indent.substring(0, indent.length() - 1);

                retVal = LINE_SEPARATOR + indent + cnt;
            } else
                retVal = cnt;

        }
        return retVal;
    }
}
