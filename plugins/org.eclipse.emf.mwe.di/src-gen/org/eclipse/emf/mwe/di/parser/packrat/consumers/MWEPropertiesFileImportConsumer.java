/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat.consumers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.packrat.IMarkerFactory.IMarker;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ConsumeResult;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;

import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.PropertiesFileImportElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinSTRINGConsumer;

@SuppressWarnings("unused")
public final class MWEPropertiesFileImportConsumer extends NonTerminalConsumer {

	private XtextBuiltinSTRINGConsumer stringConsumer;

	private ICharacterClass keyword$4$Delimiter;
	
	private ICharacterClass keyword$5$Delimiter;
	
	private ICharacterClass keyword$8$Delimiter;
	
	private ISequenceMatcher ruleCall$7$Delimiter;
	
	public MWEPropertiesFileImportConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
		keyword$4$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$5$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$8$Delimiter = ICharacterClass.Factory.nullClass();
		ruleCall$7$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	}
	
	protected int doConsume(int entryPoint) throws Exception {
		return consumeGroup$1(entryPoint);
	}

	protected int consumeGroup$1(int entryPoint) throws Exception {
		announceNextLevel();
		final IMarker marker = mark();
		int result = ConsumeResult.SUCCESS;
		switch(entryPoint) {
			case -1: // use fallthrough semantics of switch case
				result = ConsumeResult.EMPTY_MATCH;
			case 0:
				announceNextStep();
				result = consumeKeyword$4(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele000KeywordVar());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 1:
				announceNextStep();
				result = consumeKeyword$5(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele001KeywordFile());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 2:
				announceNextStep();
				result = consumeAssignment$6(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele01AssignmentFile());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 3:
				announceNextStep();
				result = consumeKeyword$8(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele1KeywordSemicolon());
					marker.commit();
					announceLevelFinished();
					return result;
				}
		}
		marker.commit();
		announceLevelFinished();
		return result;
	}

	protected int consumeKeyword$4(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele000KeywordVar(), null, false, false, getKeyword$4$Delimiter());
	}

	protected int consumeKeyword$5(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele001KeywordFile(), null, false, false, getKeyword$5$Delimiter());
	}

	protected int consumeAssignment$6(int entryPoint) throws Exception {
		int result = ConsumeResult.EMPTY_MATCH;
		int tempResult;
		announceNextLevel();
		tempResult = consumeTerminal(stringConsumer, "file", false, false, getRule().ele010LexerRuleCallSTRING(), getRuleCall$7$Delimiter());
		if (tempResult == ConsumeResult.SUCCESS) {
			announceLevelFinished();
			return tempResult;
		}
		result = tempResult >= result ? tempResult : result; 
		announceLevelFinished();
		return result;
	}

	protected int consumeKeyword$8(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele1KeywordSemicolon(), null, false, false, getKeyword$8$Delimiter());
	}

	public PropertiesFileImportElements getRule() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "PropertiesFileImport";
	}
	
	public void setStringConsumer(XtextBuiltinSTRINGConsumer stringConsumer) {
		this.stringConsumer = stringConsumer;
	}
	
	public ICharacterClass getKeyword$4$Delimiter() {
		return keyword$4$Delimiter;
	}
	
	public void setKeyword$4$Delimiter(ICharacterClass characterClass) {
		keyword$4$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$5$Delimiter() {
		return keyword$5$Delimiter;
	}
	
	public void setKeyword$5$Delimiter(ICharacterClass characterClass) {
		keyword$5$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$8$Delimiter() {
		return keyword$8$Delimiter;
	}
	
	public void setKeyword$8$Delimiter(ICharacterClass characterClass) {
		keyword$8$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ISequenceMatcher getRuleCall$7$Delimiter() {
		return ruleCall$7$Delimiter;
	}
	
	public void setRuleCall$7$Delimiter(ISequenceMatcher matcher) {
		ruleCall$7$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
}
