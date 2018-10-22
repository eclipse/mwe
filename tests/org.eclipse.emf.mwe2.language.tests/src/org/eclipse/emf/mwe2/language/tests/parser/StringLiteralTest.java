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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.Strings;
import org.junit.Test;

import com.google.inject.Inject;

public class StringLiteralTest extends AbstractParserTest {

	@Inject
	private LinkingHelper linkingHelper;
	
	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getStringLiteralRule();
	}
	
	@Test public void testEmptyLiteral() {
		checkPlainString("", "");
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
				String expectation = value;
				if ("'".equals(value) || "\"".equals(value) || "\\".equals(value) || "${".equals(value))
					value = "\\" + value;
				checkPlainString(value, expectation);
			}
		}
	}
	
	@Test public void testKeywordPrefixes() {
		checkPlainString("$", "$");
		checkPlainString("impo", "impo");
		checkPlainString("/", "/");
	}
	
	@Test public void testComments() {
		checkPlainString("// something\n", "// something\n");
		checkPlainString("// something", "// something");
		checkPlainString("/* something */", "/* something */");
		checkPlainString("/* something", "/* something");
	}
	
	@Test public void testEscapedComments() {
		parseWithErrors("\\// something", 1);
		parseWithErrors("\\/* something", 1);
	}
	
	@Test public void testWS() {
		checkPlainString(" \\n\\r\\t", " \n\r\t");
		checkPlainString(" import ", " import ");
	}
	
	@Test public void testInt() {
		checkPlainString("0123", "0123");
		checkPlainString("1", "1");
	}
	
	@Test public void testDouble() {
		checkPlainString("0.123", "0.123");
		checkPlainString("1.456", "1.456");
	}
	
	@Test public void testAnyChar() {
		checkPlainString("*/", "*/");
		checkPlainString("#", "#");
		checkPlainString("/", "/");
	}
	
	@Test public void testComplex() {
		checkPlainString(" import var id.id.* ", " import var id.id.* ");
		checkPlainString(" \\${ something . .* } ", " ${ something . .* } ");
	}
	
	@Test public void testWsAfterRef() {
		checkPlainOrRefString("${something} ", "ref:something", " ");
	}
	
	protected void checkPlainString(String input, String expectation) {
		IParseResult result = parseSuccessfully(input);
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		if (Strings.isEmpty(expectation)) {
			assertTrue(input, literal.getParts().isEmpty());
		} else {
			assertEquals(input, 1, literal.getParts().size());
			PlainString plain = (PlainString) literal.getParts().get(0);
			assertEquals(input, expectation, plain.getValue());
		}
	}
	
	protected void checkPlainOrRefString(String input, String... expectation) {
		IParseResult result = parseSuccessfully(input);
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		int i = 0;
		for(StringPart part: literal.getParts()) {
			if (part instanceof PropertyReference) {
				assertTrue(expectation[i].startsWith("ref:"));
				String expected = expectation[i].substring(4);
				ICompositeNode node = NodeModelUtils.getNode(part);
				for(INode child: node.getChildren()) {
					if (child.getGrammarElement() instanceof CrossReference) {
						String nodeAsString = linkingHelper.getCrossRefNodeAsString(child, true);
						assertEquals(expected, nodeAsString);
					}
				}
			} else if (part instanceof PlainString) {
				PlainString plain = (PlainString) part;
				assertEquals(input, expectation[i], plain.getValue());
			} else {
				fail("Unexpected StringPart: " + part);
			}
			i++;						
		}
		assertEquals(expectation.length, literal.getParts().size());
	}
	
	protected void checkReference(String input, String... expectedReferences) {
		IParseResult result = parseSuccessfully(input);
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		int i = 0;
		for(StringPart part: literal.getParts()) {
			if (part instanceof PropertyReference) {
				ICompositeNode node = NodeModelUtils.getNode(part);
				for(INode child: node.getChildren()) {
					if (child.getGrammarElement() instanceof CrossReference) {
						String nodeAsString = linkingHelper.getCrossRefNodeAsString(child, true);
						assertEquals(expectedReferences[i], nodeAsString);
						i++;						
					}
				}
			}
		}
		assertEquals(expectedReferences.length, i);
	}
	
	@Test public void testReference() {
		checkReference("${something}", "something");
		checkReference("${ something }", "something");
		checkReference("${something. /* comment */ ^module}", "something.module");
		checkReference("${something.\nsomething // comment \n}", "something.something");
	}
	
	@Test public void testReferences() {
		checkReference("${something } ${ something.else}", "something", "something.else");
		checkReference("${something}${else}", "something", "else");
	}
	
	@Test public void testIncompleteReference() {
		parseWithErrors("${}", 1);
		parseWithErrors("${", 1);
		parseWithErrors("${something", 1);
		parseWithErrors("${something.", 1);
	}
	
	@Test public void testMixed() {
		checkReference("import${something}", "something");
		checkReference("$${something}", "something");
		checkReference(" ${something}}", "something");
		checkReference("{${something}$", "something");
	}
	
	@Test public void testHttpInString() {
		checkPlainString("http://www.xtext.org", "http://www.xtext.org");
	}
	
	@Test public void testDoubleQuoteInSingleQuotedString() {
		IParseResult result = super.parseSuccessfully("'\"'");
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		assertEquals("'\"'", 1, literal.getParts().size());
		PlainString plain = (PlainString) literal.getParts().get(0);
		assertEquals("'\"'", "\"", plain.getValue());
	}
	
	@Test public void testSingleQuoteInDoubleQuotedString() {
		IParseResult result = super.parseSuccessfully("\"'\"");
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		assertEquals("\"'\"", 1, literal.getParts().size());
		PlainString plain = (PlainString) literal.getParts().get(0);
		assertEquals("\"'\"", "'", plain.getValue());
	}
	
	@Override
	protected IParseResult parseSuccessfully(String input) {
		String quotedInput = '"' + input + '"';
		super.parseSuccessfully(quotedInput);
		quotedInput = "'" + input + "'";
		return super.parseSuccessfully(quotedInput);
	}
	
	@Override
	protected IParseResult parseWithErrors(String input, int errorCount) {
		String quotedInput = '"' + input + '"';
		super.parseWithErrors(quotedInput, errorCount);
		quotedInput = "'" + input + "'";
		return super.parseWithErrors(quotedInput, errorCount);
	}

}
