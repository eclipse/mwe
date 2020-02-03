/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.highlighting;

import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import com.google.common.collect.ImmutableSet;

public class TokenToAttributeMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	private final Set<String> keywords = ImmutableSet.of(
			"KEYWORD_TRUE",
			"KEYWORD_FALSE", 
			"KEYWORD_VAR", 
			"KEYWORD_IMPORT",
			"KEYWORD_NULL",
			"KEYWORD_MODULE", 
			"KEYWORD_AUTO_INJECT");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (keywords.contains(tokenName)) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if (tokenName.startsWith("KEYWORD_"))
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		return super.calculateId(tokenName, tokenType);
	}

}
