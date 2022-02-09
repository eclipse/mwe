/*******************************************************************************
 * Copyright (c) 2007, 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.ast.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.util.VisitorAnalyzer;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;
import org.junit.Test;

import test.res.Component;

public class VisitorAnalyzerTest extends AbstractWorkflowParsingTestBase {
	VisitorAnalyzer analyzer;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		final Map<Class<?>, Converter<?>> converter = new HashMap<Class<?>, Converter<?>>();
		final Class<Component> currentComponentClass = test.res.Component.class;
		analyzer = new VisitorAnalyzer(issues, converter, currentComponentClass);
	}

	@Test public void testVisitComponentAST() {

		final Location loc = new Location(0, 0, "nothing");
		final ComponentAST componentAST = new ComponentAST(loc, "types", "test.res.SubComponent", "test");
		analyzer.visitComponentAST(componentAST);
		assertFalse("Analyzer should find no errors", issues.hasErrors());
	}

}
