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
import org.eclipse.emf.mwe.ui.internal.editor.rules.CDataRule;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */
public class CDataScanner extends RuleBasedScanner {

	private final IToken cDataToken;

	public CDataScanner(final ColorManager colorManager) {

		cDataToken =
				new Token(new TextAttribute(colorManager
						.getColor(WorkflowColorConstants.CDATA)));
		final IRule[] rules = new IRule[2];
		rules[0] = new CDataRule(cDataToken, true);
		rules[1] = new CDataRule(cDataToken, false);
		setRules(rules);
	}

	/**
	 * Returns the value of field <code>cDataToken</code>.
	 * 
	 * @return value of <code>cDataToken</code>.
	 */
	public IToken getCDataToken() {
		return cDataToken;
	}

	@Override
	public IToken nextToken() {
		return super.nextToken();
	}
}
