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

package org.eclipse.emf.mwe.ui.internal.editor.scanners;

import org.eclipse.emf.mwe.ui.internal.editor.editor.ColorManager;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowColorConstants;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowWhitespaceDetector;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */
public class WorkflowScanner extends RuleBasedScanner {

	public WorkflowScanner(final ColorManager manager) {
		final IToken procInstr =
				new Token(new TextAttribute(manager
						.getColor(WorkflowColorConstants.PROC_INSTR)));

		final IRule[] rules = new IRule[2];
		rules[0] = new SingleLineRule("<?", "?>", procInstr);
		rules[1] = new WhitespaceRule(new WorkflowWhitespaceDetector());

		setRules(rules);
	}
}
