package org.eclipse.emf.mwe.tests.ast.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.util.VisitorAnalyzer;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;

import test.res.Component;

public class VisitorAnalyzerTest extends AbstractWorkflowParsingTestBase {
	VisitorAnalyzer analyzer;

	@Override
	@SuppressWarnings("unchecked")
	public void setUp() throws Exception {
		super.setUp();
		final Map<Class<?>, Converter> converter = new HashMap<Class<?>, Converter>();
		final Class<Component> currentComponentClass = test.res.Component.class;
		analyzer = new VisitorAnalyzer(issues, converter, currentComponentClass);
	}

	public void testVisitComponentAST() {

		final Location loc = new Location(0, 0, "nothing");
		final ComponentAST componentAST = new ComponentAST(loc, "types", "test.res.SubComponent", "test");
		analyzer.visitComponentAST(componentAST);
		assertFalse("Analyzer should find no errors", issues.hasErrors());
	}

}
