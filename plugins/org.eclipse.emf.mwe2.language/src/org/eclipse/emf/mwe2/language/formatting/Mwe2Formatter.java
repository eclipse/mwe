/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.formatting;

import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting on how and when to use it
 */
public class Mwe2Formatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		Mwe2GrammarAccess f = (Mwe2GrammarAccess) getGrammarAccess();

		c.setAutoLinewrap(120);

		RuleCall moduleName = f.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0();
		c.setLinewrap(2).between(moduleName, f.getImportRule());
		c.setLinewrap(2).between(moduleName, f.getDeclaredPropertyRule());
		c.setLinewrap(2).between(moduleName, f.getRootComponentRule());

		c.setLinewrap(2).between(f.getImportRule(), f.getDeclaredPropertyRule());
		c.setLinewrap(2).between(f.getImportRule(), f.getRootComponentRule());
		c.setLinewrap(1,1,2).after(f.getImportRule());

		c.setLinewrap(2).between(f.getDeclaredPropertyRule(), f.getRootComponentRule());
		c.setLinewrap().after(f.getDeclaredPropertyRule());

		c.setLinewrap().after(f.getAssignmentRule());

		// Parenthesis
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setLinewrap(1,1,2).after(pair.getFirst());
			c.setLinewrap(1,1,2).after(pair.getSecond());
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setNoSpace().between(pair.getFirst(), pair.getSecond());
		}

		// No space in property refs.
		c.setNoSpace().around(f.getPropertyReferenceImplAccess().getReferableAssignment());

		// Keep some linewraps before/after comments.
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}