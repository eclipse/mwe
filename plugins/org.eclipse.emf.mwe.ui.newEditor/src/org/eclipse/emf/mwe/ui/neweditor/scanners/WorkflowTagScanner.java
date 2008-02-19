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
import org.eclipse.emf.mwe.ui.neweditor.editor.WorkflowWhitespaceDetector;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowTagScanner extends RuleBasedScanner {

    public WorkflowTagScanner(final ColorManager manager) {
        final IToken string = new Token(new TextAttribute(manager
                .getColor(WorkflowColorConstants.STRING)));

        final IRule[] rules = new IRule[3];
        rules[0] = new SingleLineRule("\"", "\"", string, '\\');
        rules[1] = new SingleLineRule("'", "'", string, '\\');
        rules[2] = new WhitespaceRule(new WorkflowWhitespaceDetector());

        setRules(rules);
    }
}
