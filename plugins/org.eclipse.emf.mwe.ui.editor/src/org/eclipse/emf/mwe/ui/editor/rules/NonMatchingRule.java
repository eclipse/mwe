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

package org.eclipse.emf.mwe.ui.editor.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class NonMatchingRule implements IPredicateRule {

    public NonMatchingRule() {
        super();
    }

    public IToken evaluate(final ICharacterScanner scanner) {
        return Token.UNDEFINED;
    }

    public IToken evaluate(final ICharacterScanner scanner,
            final boolean resume) {
        return Token.UNDEFINED;
    }

    public IToken getSuccessToken() {
        return Token.UNDEFINED;
    }

}
