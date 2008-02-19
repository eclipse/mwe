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

package org.eclipse.emf.mwe.ui.neweditor.scanners;

import org.eclipse.emf.mwe.ui.neweditor.editor.ColorManager;
import org.eclipse.emf.mwe.ui.neweditor.editor.WorkflowColorConstants;
import org.eclipse.emf.mwe.ui.neweditor.rules.CDataRule;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowTextScanner extends RuleBasedScanner {

    private IToken currentToken;

    private final IToken escapedCharToken;

    private final IToken cDataStartToken;

    private final IToken cDataEndToken;

    private final IToken cDataTextToken;

    public WorkflowTextScanner(final ColorManager colorManager) {

        escapedCharToken = new Token(new TextAttribute(colorManager
                .getColor(WorkflowColorConstants.ESCAPED_CHAR)));
        cDataStartToken = new Token(new TextAttribute(colorManager
                .getColor(WorkflowColorConstants.CDATA)));
        cDataEndToken = new Token(new TextAttribute(colorManager
                .getColor(WorkflowColorConstants.CDATA)));
        cDataTextToken = new Token(new TextAttribute(colorManager
                .getColor(WorkflowColorConstants.CDATA_TEXT)));
        final IRule[] rules = new IRule[2];

        // Add rule to pick up escaped chars
        // Add rule to pick up start of cData section
        rules[0] = new CDataRule(cDataStartToken, true);
        // Add a rule to pick up end of cData sections
        rules[1] = new CDataRule(cDataEndToken, false);
        setRules(rules);

    }

    /**
     * Returns the value of field <code>cDATAEndToken</code>.
     * 
     * @return value of <code>cDATAEndToken</code>.
     */
    public IToken getCDATAEndToken() {
        return cDataEndToken;
    }

    /**
     * Returns the value of field <code>cDATAStartToken</code>.
     * 
     * @return value of <code>cDATAStartToken</code>.
     */
    public IToken getCDATAStartToken() {
        return cDataStartToken;
    }

    /**
     * Returns the value of field <code>cDATATextToken</code>.
     * 
     * @return value of <code>cDATATextToken</code>.
     */
    public IToken getCDATATextToken() {
        return cDataTextToken;
    }

    /**
     * Returns the value of field <code>currentToken</code>.
     * 
     * @return value of <code>currentToken</code>.
     */
    public IToken getCurrentToken() {
        return currentToken;
    }

    /**
     * Returns the value of field <code>escapedCharToken</code>.
     * 
     * @return value of <code>escapedCharToken</code>.
     */
    public IToken getEscapedCharToken() {
        return escapedCharToken;
    }

    @Override
    public IToken nextToken() {
        final IToken token = super.nextToken();
        if (currentToken == cDataStartToken || currentToken == cDataTextToken
                && token != cDataEndToken) {
            currentToken = cDataTextToken;
            return cDataTextToken;
        }
        currentToken = token;
        return token;
    }
}
