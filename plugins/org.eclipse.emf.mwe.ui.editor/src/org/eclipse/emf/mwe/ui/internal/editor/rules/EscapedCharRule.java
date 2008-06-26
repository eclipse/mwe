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
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */
public class EscapedCharRule implements IRule {

	private final IToken token;

	private final StringBuffer stringBuf = new StringBuffer();

	public EscapedCharRule(final IToken token) {
		super();
		this.token = token;
	}

	/*
	 * @see IRule#evaluate(ICharacterScanner)
	 */
	public IToken evaluate(final ICharacterScanner scanner) {
		stringBuf.setLength(0);
		int c = read(scanner);
		if (c == '&') {
			int i = 0;
			do {
				c = read(scanner);
				i++;

				if (c == '<' || c == ']') {
					for (int j = i - 1; j > 0; j--) {
						scanner.unread();
					}
					return Token.UNDEFINED;
				}
			} while (c != ';');
			return token;
		}

		scanner.unread();
		return Token.UNDEFINED;
	}

	private int read(final ICharacterScanner scanner) {
		final int c = scanner.read();
		stringBuf.append((char) c);
		return c;
	}

}
