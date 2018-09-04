/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.highlighting;

import static org.junit.Assert.*;

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.tests.AbstractMwe2Tests;
import org.eclipse.emf.mwe2.language.tests.UiTestSetup;
import org.eclipse.emf.mwe2.language.ui.Mwe2UiModule;
import org.eclipse.emf.mwe2.language.ui.highlighting.MweHighlightingLexer;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.junit.Test;

@SuppressWarnings("restriction") 
public class LexerTest extends AbstractMwe2Tests {

	private MweHighlightingLexer lexer;
	private ITokenDefProvider tokenDefProvider;
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new UiTestSetup() {
			@Override
			protected Mwe2UiModule createUiModule(Mwe2Activator activator) {
				return new Mwe2UiModule(activator) {
					@Override
					public Class<? extends Factory> bindIJvmTypeProvider$Factory() {
						return null;
					}
				};
			}
		});
		lexer = get(MweHighlightingLexer.class);
		tokenDefProvider = get(ITokenDefProvider.class);
	}
	
	@Test public void testEmptyLiteral() {
		parseStringLiteral("");
	}
	
	@Test public void testKeywords() {
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(getGrammarAccess().getGrammar(), false);
		while(iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof TerminalRule 
					|| next == getGrammarAccess().getConstantValueRule()) {
				iterator.prune();
			} else if (next instanceof Keyword) {
				String value = ((Keyword) next).getValue();
				if ("'".equals(value) || "\"".equals(value) || "\\".equals(value) || "${".equals(value))
					value = "\\" + value;
				parseStringLiteral(value);
			}
		}
	}
	
	@Test public void testKeywordPrefixes() {
		parseStringLiteral("$",	"impo",	"/");
	}
	
	@Test public void testComments() {
		parseStringLiteral("// something\n", "/* something */");
	}
	
	@Test public void testEscapedComments() {
		parseStringLiteral("\\// something", "\\/* something");
	}
	
	@Test public void testWS() {
		parseStringLiteral(" \\n\\r\\t", " import ");
	}
	
	@Test public void testAnyChar() {
		parseStringLiteral("*/", "#", "/");
	}
	
	@Test public void testComplex() {
		parseStringLiteral(
				" import var id.id.* ", 
				" \\${ something . .* } ");
	}
	
	@Test public void testReference() {
		parseStringLiteral(
				"${something}", 
				"${ something }", 
				"${something. /* comment */ ^module}", 
				"${something.\nsomething // comment \n}");
	}
	
	@Test public void testReferences() {
		parseStringLiteral(
				"${something } ${ something.else}", 
				"${something}${else}");
	}
	
	@Test public void testIncompleteReference() {
		parseStringLiteral("${}", "${", "${something", "${something.");
	}
	
	@Test public void testMixed() {
		parseStringLiteral("import${something}", "$${something}", " ${something}}", "{${something}$");
	}
	
	protected void parseStringLiteral(String... literals) {
		for(String literal: literals) {
			String quoted = "'" + literal + "'";
			parseSuccessfully(quoted, quoted);
			quoted = '"' + literal + '"';
			parseSuccessfully(quoted, quoted);
		}
	}
	
	protected void parseSuccessfully(String input, String... expectedTokens) {
		CharStream stream = new ANTLRStringStream(input);
		lexer.setCharStream(stream);
		XtextTokenStream tokenStream = new XtextTokenStream(lexer, tokenDefProvider);
		List<?> tokens = tokenStream.getTokens();
		assertEquals(input, expectedTokens.length, tokens.size());
		for(int i = 0;i < tokens.size(); i++) {
			Token token = (Token) tokens.get(i);
			assertEquals(token.toString(), expectedTokens[i], token.getText());
		}
	}
}
