package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;

public class ParserTest extends AbstractXtextTests {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new Mwe2StandaloneSetup());
	}
}
