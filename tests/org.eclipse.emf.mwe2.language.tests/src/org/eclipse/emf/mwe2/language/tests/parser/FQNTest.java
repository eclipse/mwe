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

public class FQNTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getFQNRule();
	}
	
	@Test public void testID() {
		parseSuccessfully("Id");
		parseSuccessfully("^Id");
	}
	
	@Test public void testFQN() {
		parseSuccessfully("Id.Id");
		parseSuccessfully("^Id.^Id");
	}
	
	@Test public void testMissingLastSegment() {
		parseWithErrors("Id.", 1);
	}
	
	@Test public void testDoubleDotWildcard() {
		parseWithErrors("Id..*", 1);
	}
	
	@Test public void testDoubleDot() {
		parseWithErrors("Id..",1);
	}
	
	@Test public void testWithWS() {
		parseSuccessfully(" Id ");
		parseSuccessfully(" Id . Id ");
		parseSuccessfully(" Id .\nId ");
	}
	
	@Test public void testWithComments() {
		parseSuccessfully("//comment \n Id ");
		parseSuccessfully("/* comment */ Id . // comment \n Id ");
	}
}
