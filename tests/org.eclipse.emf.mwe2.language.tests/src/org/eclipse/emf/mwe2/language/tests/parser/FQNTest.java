package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.xtext.ParserRule;

public class FQNTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getFQNRule();
	}
	
	public void testID() {
		parseSuccessfully("Id");
		parseSuccessfully("^Id");
	}
	
	public void testFQN() {
		parseSuccessfully("Id.Id");
		parseSuccessfully("^Id.^Id");
	}
	
	public void testMissingLastSegment() {
		parseWithErrors("Id.", 1);
	}
	
	public void testDoubleDotWildcard() {
		parseWithErrors("Id..*", 1);
	}
	
	public void testDoubleDot() {
		parseWithErrors("Id..",1);
	}
	
	public void testWithWS() {
		parseSuccessfully(" Id ");
		parseSuccessfully(" Id . Id ");
		parseSuccessfully(" Id .\nId ");
	}
	
	public void testWithComments() {
		parseSuccessfully("//comment \n Id ");
		parseSuccessfully("/* comment */ Id . // comment \n Id ");
	}
}
