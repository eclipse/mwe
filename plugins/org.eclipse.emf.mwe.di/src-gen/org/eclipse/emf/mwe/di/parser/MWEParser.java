/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.parser.IElementFactory;
import org.eclipse.xtext.parser.IParseError;
import org.eclipse.xtext.parser.IParseErrorHandler;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.impl.ParseError;

import org.eclipse.emf.mwe.di.parser.internal.InternalMWELexer;
import org.eclipse.emf.mwe.di.parser.internal.InternalMWEParser;


public class MWEParser extends org.eclipse.xtext.parser.AbstractParser {
	
	@Override
	protected IParseResult parse(ANTLRInputStream in, IElementFactory factory,
			final IParseErrorHandler handler) {
		InternalMWELexer lexer = new InternalMWELexer(in);
		CommonTokenStream stream = new CommonTokenStream(lexer);
		InternalMWEParser parser = new InternalMWEParser(
				stream, factory, grammarAccess.getGrammar()) {
					@Override
			protected void reportError(IParseError error, RecognitionException re) {
				handler.handleParserError(error);
			}
		};
		try {
			return parser.parse();
		} catch (Exception re) {
			CommonToken lt = (CommonToken) parser.getInput().LT(parser.getInput().index());
			ParseError error = new ParseError(lt.getLine(), lt.getStartIndex(), lt.getText() != null ? lt.getText().length()
					: 0, lt.getText(), re.getMessage(), re);
			handler.handleParserError(error);
		}
		return null;
	}
	
}
