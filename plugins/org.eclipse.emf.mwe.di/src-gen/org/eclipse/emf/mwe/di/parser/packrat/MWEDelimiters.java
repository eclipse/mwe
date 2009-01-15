/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;
import org.eclipse.xtext.parser.packrat.matching.SetBasedKeywordMatcher;

public final class MWEDelimiters {

	private MWEDelimiters() {
		throw new UnsupportedOperationException("Utility classes may not be initialized");
	}
	
	public static ICharacterClass keyword$25$Delimiter = ICharacterClass.Factory.nullClass();
	
	// TODO do not use IDConsumer internals
	public static ICharacterClass keyword$21$Delimiter = XtextBuiltinIDConsumer.IDConsumer$$2;
	
	public static ISequenceMatcher ruleCall$35$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	
	public static ISequenceMatcher ruleCall$49$Delimiter = new SetBasedKeywordMatcher(
		"import", "var", "file");
		
}
