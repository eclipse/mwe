/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
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
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
public class StartTagRule extends MultiLineRule {

	public StartTagRule(final IToken token) {
		this(token, false);
	}

	protected StartTagRule(final IToken token, final boolean endAsWell) {
		super("<", endAsWell ? "/>" : ">", token);
	}

	@Override
	protected boolean sequenceDetected(final ICharacterScanner scanner,
			final char[] sequence, final boolean eofAllowed) {
		boolean breakState = false;
		final int c = scanner.read();
		if (sequence[0] == '<') {
			if (c == '?') {
				scanner.unread();
				breakState = true;
			} else if (c == '!') {
				scanner.unread();
				breakState = true;
			}
		} else if (sequence[0] == '>') {
			scanner.unread();
		}
		return !breakState
				&& super.sequenceDetected(scanner, sequence, eofAllowed);
	}
}
