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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.9 $
 */

public class WorkflowAttribute {

    private final WorkflowElement element;

    private final String name;

    private final String value;

    public WorkflowAttribute(final WorkflowElement element, final String name,
            final String value) {
        if (element == null || name == null || value == null
                || name.length() == 0)
            throw new IllegalArgumentException();

        this.element = element;
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the position range of the whole attribute.
     * 
     * @return position range of attribute.
     */
    public ElementPositionRange getAttributeRange() {
        final IDocument document = element.getDocument();
        final int start = element.getStartElementRange().getStartOffset();
        final int end = element.getStartElementRange().getEndOffset();
        final int length = end - start + 1;
        String text;
        try {
            text = document.get(start, length);
        } catch (final BadLocationException e) {
            Log.logError("Invalid document location", e);
            return null;
        }

        final String pattern = name + "\\s*=\\s*\"" + quote(value) + "\"";
        final Pattern regexPattern = Pattern.compile(pattern);
        final Matcher m = regexPattern.matcher(text);
        if (m.find()) {
            final int attrStart = start + m.start();
            final int attrEnd = start + m.end();
            return new ElementPositionRange(document, attrStart, attrEnd);
        }
        return null;
    }

    /**
     * Returns the position range of the attribute value.
     * 
     * @return position range of attribute value.
     */
    public ElementPositionRange getAttributeValueRange() {
        final IDocument document = element.getDocument();
        int start = getAttributeRange().getStartOffset();
        final int end = getAttributeRange().getEndOffset();

        try {
            // Skip everything to the opening double quote
            while (start <= end && document.getChar(start) != '"') {
                start++;
            }
        } catch (final BadLocationException e) {
            e.printStackTrace();
            return null;
        }

        // Skip the opening double quote as well
        start++;

        return new ElementPositionRange(document, start, end);

    }

    /**
     * Returns the value of field <code>element</code>.
     * 
     * @return value of <code>element</code>.
     */
    public WorkflowElement getElement() {
        return element;
    }

    /**
     * Returns the value of field <code>name</code>.
     * 
     * @return value of <code>name</code>.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value of field <code>value</code>.
     * 
     * @return value of <code>value</code>.
     */
    public String getValue() {
        return value;
    }

    private String quote(final String value) {
        String res = new String();
        for (int i = 0; i < value.length(); i++) {
            final char ch = value.charAt(i);
            if (ch == '$' || ch == '{' || ch == '}') {
                res = res.concat("\\");
            }
            res = res + ch;
        }
        return res;
    }

}
