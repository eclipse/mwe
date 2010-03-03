package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.language.parser.antlr.Mwe2Parser;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.StringInputStream;

public abstract class AbstractParserTest extends AbstractXtextTests {
	
	private Mwe2Parser parser;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new Mwe2StandaloneSetup());
		parser = get(Mwe2Parser.class);
	}
	
	@Override
	protected Mwe2GrammarAccess getGrammarAccess() {
		return (Mwe2GrammarAccess) super.getGrammarAccess();
	}
	
	protected IParseResult parseSuccessfully(String input) {
		IParseResult result = getParseResult(input);
		assertTrue("[" + input + "] - " + result.getParseErrors().toString(), result.getParseErrors().isEmpty());
		return result;
	}
	
	protected IParseResult parseWithErrors(String input, int errorCount) {
		IParseResult result = getParseResult(input);
		assertEquals(result.getParseErrors().toString(), errorCount, result.getParseErrors().size());
		return result;
	}

	protected IParseResult getParseResult(String input) {
		return parser.parse(getRule().getName(), new StringInputStream(input));
	}
	
	protected abstract ParserRule getRule();
}
