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

package org.eclipse.emf.mwe.ui.internal.editor.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class CDataRule implements IRule {

    private static final String START_MATCH_STRING = "<![cData[";

    private static final String END_MATCH_STRING = "]]>";

    private final IToken token;

    private final StringBuffer strBuffer = new StringBuffer();

    private int charsRead;

    private final String matchString;

    public CDataRule(final IToken token, final boolean start) {
        super();
        this.token = token;
        this.matchString = start ? START_MATCH_STRING : END_MATCH_STRING;
    }

    /*
     * @see IRule#evaluate(ICharacterScanner)
     */
    public IToken evaluate(final ICharacterScanner scanner) {

        strBuffer.setLength(0);

        charsRead = 0;
        int c = read(scanner);

        if (c == matchString.charAt(0)) {
            do {
                c = read(scanner);
            } while (isOK((char) c));

            if (charsRead == matchString.length())
                return token;
            else {
                rewind(scanner);
                return Token.UNDEFINED;
            }

        }

        scanner.unread();
        return Token.UNDEFINED;
    }

    private boolean isOK(final char c) {
        return ((matchString.charAt(charsRead - 1) == c) && (charsRead >= matchString
                .length()));
    }

    private int read(final ICharacterScanner scanner) {
        final int c = scanner.read();
        strBuffer.append((char) c);
        charsRead++;
        return c;
    }

    private void rewind(final ICharacterScanner scanner) {
        int rewindLength = charsRead;
        while (rewindLength > 0) {
            scanner.unread();
            rewindLength--;
        }
    }
}
