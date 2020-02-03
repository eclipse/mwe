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

import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;
import org.junit.Test;

public class ImportTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getImportRule();
	}
	
	@Test public void testSuccessful() {
		parseSuccessfully("import id.id");
		parseSuccessfully("import id");
		parseSuccessfully("import id.id.*");
	}
	
	@Test public void testConversion() {
		checkImportedNamespace("import ^id.^id", "id.id");
		checkImportedNamespace("import ^id.^id.*", "id.id.*");
	}

	@Test public void testWithWS() {
		checkImportedNamespace("import id ", "id");
		checkImportedNamespace("import  id . id ", "id.id");
		checkImportedNamespace("import  id .\n\t id ", "id.id");
	}
	
	@Test public void testWithComments() {
		checkImportedNamespace("import//comment \n id   .* ", "id.*");
		checkImportedNamespace("import/* comment */ id . // comment \n id ", "id.id");
	}
	
	protected void checkImportedNamespace(String input, String expectation) {
		IParseResult result = parseSuccessfully(input);
		assertEquals(expectation, ((Import) result.getRootASTElement()).getImportedNamespace());
	}
}
