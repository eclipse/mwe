/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class XMLTagScanner extends RuleBasedScanner {

    public XMLTagScanner(final ColorManager manager) {
        final IToken string = new Token(new TextAttribute(manager.getColor(XMLColorConstants.STRING)));

        final IRule[] rules = new IRule[3];

        // Add rule for double quotes
        rules[0] = new SingleLineRule("\"", "\"", string, '\\');
        // Add a rule for single quotes
        rules[1] = new SingleLineRule("'", "'", string, '\\');
        // Add generic whitespace rule.
        rules[2] = new WhitespaceRule(new XMLWhitespaceDetector());

        setRules(rules);
    }
}
