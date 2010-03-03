package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;

public class ImportTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getImportRule();
	}
	
	public void testSuccessful() {
		parseSuccessfully("import id.id");
		parseSuccessfully("import id");
		parseSuccessfully("import id.id.*");
	}
	
	public void testConversion() {
		checkImportedNamespace("import ^id.^id", "id.id");
		checkImportedNamespace("import ^id.^id.*", "id.id.*");
	}

	public void testWithWS() {
		checkImportedNamespace("import id ", "id");
		checkImportedNamespace("import  id . id ", "id.id");
		checkImportedNamespace("import  id .\n\t id ", "id.id");
	}
	
	public void testWithComments() {
		checkImportedNamespace("import//comment \n id   .* ", "id.*");
		checkImportedNamespace("import/* comment */ id . // comment \n id ", "id.id");
	}
	
	protected void checkImportedNamespace(String input, String expectation) {
		IParseResult result = parseSuccessfully(input);
		assertEquals(expectation, ((Import) result.getRootASTElement()).getImportedNamespace());
	}
}
