/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.xtext.ParserRule;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AssignmentTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getAssignmentRule();
	}
	
	public void testSimpleJvmFeatureReference() {
		parseSuccessfully("Id = ''");
	}
	
	public void testFQNJvmFeatureReference() {
		parseSuccessfully("Id.Id = ''");
	}
}
