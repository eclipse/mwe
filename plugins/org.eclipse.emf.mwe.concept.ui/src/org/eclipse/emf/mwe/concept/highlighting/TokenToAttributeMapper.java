package org.eclipse.emf.mwe.concept.highlighting;

import java.util.Set;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

import com.google.common.collect.ImmutableSet;

public class TokenToAttributeMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	private final Set<String> keywords = ImmutableSet.of(
			"KEYWORD_TRUE",
			"KEYWORD_FALSE",
			"KEYWORD_AS",
			"KEYWORD_PROPERTY",
			"KEYWORD_IMPORT",
			"KEYWORD_FILE"
	);
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(keywords.contains(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.KEYWORD_ID;
		}
		if (tokenName.startsWith("KEYWORD_"))
			return DefaultLexicalHighlightingConfiguration.PUNCTUATION_ID;
		return super.calculateId(tokenName, tokenType);
	}

}
