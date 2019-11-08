/*******************************************************************************
 * Copyright (c) 2010, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.emf.mwe2.language.parser.antlr.internal.InternalMwe2Parser;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Mwe2Parser extends AbstractAntlrParser {

	@Inject
	private Mwe2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMwe2Parser createParser(XtextTokenStream stream) {
		return new InternalMwe2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public Mwe2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
