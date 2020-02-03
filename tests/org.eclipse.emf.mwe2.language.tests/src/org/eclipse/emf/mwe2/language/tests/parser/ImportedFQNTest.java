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

import org.eclipse.xtext.ParserRule;
import org.junit.Test;

public class ImportedFQNTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getImportedFQNRule();
	}
	
	@Test public void testFQN() {
		parseSuccessfully("Id");
		parseSuccessfully("Id.Id");
		parseSuccessfully("^Id.^Id");
	}
	
	@Test public void testWildcard() {
		parseSuccessfully("Id.*");
		parseSuccessfully("Id.^Id.*");
	}
	
	@Test public void testMissingLastSegment() {
		parseWithErrors("Id.", 1);
	}
	
	@Test public void testDoubleDot() {
		parseWithErrors("Id..",1);
	}
}
