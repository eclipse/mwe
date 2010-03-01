package org.eclipse.emf.mwe2.language.ui.highlighting;

import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

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
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if (tokenName.startsWith("KEYWORD_"))
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		return super.calculateId(tokenName, tokenType);
	}

}
