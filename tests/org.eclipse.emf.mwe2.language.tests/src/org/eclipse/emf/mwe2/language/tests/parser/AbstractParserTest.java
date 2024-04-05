/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.parser;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe2.language.parser.antlr.Mwe2Parser;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.emf.mwe2.language.tests.Mwe2InjectorProvider;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public abstract class AbstractParserTest {
	
	@Inject
	private Mwe2Parser parser;
	@Inject
	private Mwe2GrammarAccess grammarAccess;

	protected Mwe2GrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
	
	protected IParseResult parseSuccessfully(String input) {
		IParseResult result = getParseResultFromParser(input);
		assertFalse("[" + input + "] - " + toList(result.getSyntaxErrors()).toString(), result.hasSyntaxErrors());
		return result;
	}
	
	protected IParseResult parseWithErrors(String input, int errorCount) {
		IParseResult result = getParseResultFromParser(input);
		List<INode> syntaxErrors = toList(result.getSyntaxErrors());
		assertEquals("[" + input + "] - " + syntaxErrors, errorCount, syntaxErrors.size());
		return result;
	}

	private static <T> List<T> toList(Iterable<T> elements) {
		List<T> list = new ArrayList<>();
		elements.forEach(list::add);
		return list;
	}

	protected IParseResult getParseResultFromParser(String input) {
		return parser.parse(getRule(), new StringReader(input));
	}
	
	protected abstract ParserRule getRule();
}
