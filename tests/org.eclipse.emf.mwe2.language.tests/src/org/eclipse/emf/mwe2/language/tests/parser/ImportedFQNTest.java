package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.xtext.ParserRule;

public class ImportedFQNTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getImportedFQNRule();
	}
	
	public void testFQN() {
		parseSuccessfully("Id");
		parseSuccessfully("Id.Id");
		parseSuccessfully("^Id.^Id");
	}
	
	public void testWildcard() {
		parseSuccessfully("Id.*");
		parseSuccessfully("Id.^Id.*");
	}
	
	public void testMissingLastSegment() {
		parseWithErrors("Id.", 1);
	}
	
	public void testDoubleDot() {
		parseWithErrors("Id..",1);
	}
}
