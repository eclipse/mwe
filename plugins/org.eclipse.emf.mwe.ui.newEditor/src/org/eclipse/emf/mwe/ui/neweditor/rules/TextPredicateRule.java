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

package org.eclipse.emf.mwe.ui.neweditor.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * Extra rule which will return specified token if sequence of characters
 * matches
 */
public class TextPredicateRule implements IPredicateRule {

    boolean inCdata;

    private final IToken token;

    private int charsRead;

    private boolean whiteSpaceOnly;

    public TextPredicateRule(final IToken text) {
        this.token = text;
    }

    public IToken evaluate(final ICharacterScanner scanner) {

        reinit();

        int c = read(scanner);

        while (isOK(c, scanner)) {
            if (c == ICharacterScanner.EOF)
                return Token.UNDEFINED;

            whiteSpaceOnly = whiteSpaceOnly
                    && (Character.isWhitespace((char) c));
            c = read(scanner);
        }

        unread(scanner);

        if (whiteSpaceOnly) {
            rewind(scanner, charsRead);
            return Token.UNDEFINED;
        }

        return token;

    }

    public IToken evaluate(final ICharacterScanner scanner,
            final boolean resume) {
        return evaluate(scanner);
    }

    public IToken getSuccessToken() {
        return token;
    }

    private boolean isOK(final int cc, final ICharacterScanner scanner) {

        char c = (char) cc;

        if (!inCdata) {
            if (c == '<') {

                int cdataCharsRead = 0;

                for (int i = 0; i < "![cData[".length(); i++) {
                    c = (char) read(scanner);
                    cdataCharsRead++;

                    if (c != "![cData[".charAt(i)) {

                        rewind(scanner, cdataCharsRead);
                        inCdata = false;
                        return false;
                    }
                }

                inCdata = true;
                return true;
            }
        } else {

            if (c == ']') {

                for (int i = 0; i < "]>".length(); i++) {

                    c = (char) read(scanner);

                    if (c != "]>".charAt(i))
                        return true;
                }

                inCdata = false;
                return true;
            }
        }
        return true;
    }

    private int read(final ICharacterScanner scanner) {
        final int c = scanner.read();
        charsRead++;
        return c;
    }

    private void reinit() {
        charsRead = 0;
        whiteSpaceOnly = true;
    }

    private void rewind(final ICharacterScanner scanner, final int theCharsRead) {
        int c = theCharsRead;
        while (c > 0) {
            c--;
            unread(scanner);
        }
    }

    private void unread(final ICharacterScanner scanner) {
        scanner.unread();
        charsRead--;
    }
}
