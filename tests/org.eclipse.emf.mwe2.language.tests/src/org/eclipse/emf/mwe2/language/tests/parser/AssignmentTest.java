/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.xtext.ParserRule;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AssignmentTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getAssignmentRule();
	}
	
	@Test public void testSimpleJvmFeatureReference() {
		parseSuccessfully("Id = ''");
	}
	
	@Test public void testFQNJvmFeatureReference() {
		parseSuccessfully("Id.Id = ''");
	}
}
