/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.parser;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.language.parser.antlr.Mwe2Parser;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.emf.mwe2.language.tests.AbstractMwe2Tests;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;

import com.google.common.collect.Iterables;

public abstract class AbstractParserTest extends AbstractMwe2Tests {
	
	private Mwe2Parser parser;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new Mwe2StandaloneSetup());
		parser = get(Mwe2Parser.class);
	}
	
	@Override
	protected Mwe2GrammarAccess getGrammarAccess() {
		return super.getGrammarAccess();
	}
	
	protected IParseResult parseSuccessfully(String input) {
		IParseResult result = getParseResultFromParser(input);
		assertFalse("[" + input + "] - " + Iterables.toString(result.getSyntaxErrors()), result.hasSyntaxErrors());
		return result;
	}
	
	protected IParseResult parseWithErrors(String input, int errorCount) {
		IParseResult result = getParseResultFromParser(input);
		assertEquals("[" + input + "] - " + Iterables.toString(result.getSyntaxErrors()), errorCount, Iterables.size(result.getSyntaxErrors()));
		return result;
	}

	protected IParseResult getParseResultFromParser(String input) {
		return parser.parse(getRule(), new StringReader(input));
	}
	
	protected abstract ParserRule getRule();
}
