package org.eclipse.emf.mwe2.language.tests.parser;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.util.Strings;

public class StringLiteralTest extends AbstractParserTest {

	@Override
	protected ParserRule getRule() {
		return getGrammarAccess().getStringLiteralRule();
	}
	
	public void testEmptyLiteral() {
		checkPlainString("", "");
	}
	
	public void testKeywords() {
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(getGrammarAccess().getGrammar(), false);
		while(iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof TerminalRule 
					|| next == getGrammarAccess().getConstantValueRule()) {
				iterator.prune();
			} else if (next instanceof Keyword) {
				String value = ((Keyword) next).getValue();
				String expectation = value;
				if ("'".equals(value) || "\"".equals(value) || "\\".equals(value) || "${".equals(value))
					value = "\\" + value;
				checkPlainString(value, expectation);
			}
		}
	}
	
	public void testKeywordPrefixes() {
		checkPlainString("$", "$");
		checkPlainString("impo", "impo");
		checkPlainString("/", "/");
	}
	
	public void testComments() {
		checkPlainString("// something\n", "// something\n");
		checkPlainString("/* something */", "/* something */");
	}
	
	public void testEscapedComments() {
		checkPlainString("\\// something", "// something");
		checkPlainString("\\/* something", "/* something");
	}
	
	public void testWS() {
		checkPlainString(" \\n\\r\\t", " \n\r\t");
		checkPlainString(" import ", " import ");
	}
	
	public void testAnyChar() {
		checkPlainString("*/", "*/");
		checkPlainString("#", "#");
		checkPlainString("/", "/");
	}
	
	public void testComplex() {
		checkPlainString(" import var id.id.* ", " import var id.id.* ");
		checkPlainString(" \\${ something . .* } ", " ${ something . .* } ");
	}
	
	protected void checkPlainString(String input, String expectation) {
		IParseResult result = parseSuccessfully(input);
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		if (Strings.isEmpty(expectation)) {
			assertTrue(input, literal.getParts().isEmpty());
		} else {
			assertEquals(input, 1, literal.getParts().size());
			PlainString plain = (PlainString) literal.getParts().get(0);
			assertEquals(input, expectation, plain.getValue());
		}
	}
	
	protected void checkReference(String input, String... expectedReferences) {
		IParseResult result = parseSuccessfully(input);
		StringLiteral literal = (StringLiteral) result.getRootASTElement();
		int i = 0;
		LinkingHelper linkingHelper = get(LinkingHelper.class);
		for(StringPart part: literal.getParts()) {
			if (part instanceof PropertyReference) {
				NodeAdapter adapter = NodeUtil.getNodeAdapter(part);
				CompositeNode node = adapter.getParserNode();
				for(AbstractNode child: node.getChildren()) {
					if (child.getGrammarElement() instanceof CrossReference) {
						String nodeAsString = linkingHelper.getCrossRefNodeAsString(child, true);
						assertEquals(expectedReferences[i], nodeAsString);
						i++;						
					}
				}
			}
		}
		assertEquals(expectedReferences.length, i);
	}
	
	public void testReference() {
		checkReference("${something}", "something");
		checkReference("${ something }", "something");
		checkReference("${something. /* comment */ ^module}", "something.module");
		checkReference("${something.\nsomething // comment \n}", "something.something");
	}
	
	public void testReferences() {
		checkReference("${something } ${ something.else}", "something", "something.else");
		checkReference("${something}${else}", "something", "else");
	}
	
	public void testIncompleteReference() {
		parseWithErrors("${}", 1);
		parseWithErrors("${", 1);
		parseWithErrors("${something", 1);
		parseWithErrors("${something.", 1);
	}
	
	public void testMixed() {
		checkReference("import${something}", "something");
		checkReference("$${something}", "something");
		checkReference(" ${something}}", "something");
		checkReference("{${something}$", "something");
	}
	
	@Override
	protected IParseResult parseSuccessfully(String input) {
		String quotedInput = '"' + input + '"';
		super.parseSuccessfully(quotedInput);
		quotedInput = "'" + input + "'";
		return super.parseSuccessfully(quotedInput);
	}
	
	@Override
	protected IParseResult parseWithErrors(String input, int errorCount) {
		String quotedInput = '"' + input + '"';
		super.parseWithErrors(quotedInput, errorCount);
		quotedInput = "'" + input + "'";
		return super.parseWithErrors(quotedInput, errorCount);
	}

}
