/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat.consumers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.packrat.ICharSequenceWithOffset;
import org.eclipse.xtext.parser.packrat.IHiddenTokenHandler;
import org.eclipse.xtext.parser.packrat.IMarkerFactory;
import org.eclipse.xtext.parser.packrat.IMarkerFactory.IMarker;
import org.eclipse.xtext.parser.packrat.consumers.IConsumerUtility;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;
import org.eclipse.xtext.parser.packrat.tokens.IParsedTokenAcceptor;

import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.WorkflowRefElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEAssignmentConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinSTRINGConsumer;

@SuppressWarnings("unused")
public final class MWEWorkflowRefConsumer extends NonTerminalConsumer {

	private MWEAssignmentConsumer assignmentConsumer;
	private XtextBuiltinSTRINGConsumer stringConsumer;

	private ISequenceMatcher ruleCall$7$Delimiter;
	
	private ICharacterClass keyword$11$Delimiter;
	
	private ICharacterClass keyword$8$Delimiter;
	
	private ICharacterClass keyword$5$Delimiter;
	
	public MWEWorkflowRefConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
		ruleCall$7$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		keyword$11$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$8$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$5$Delimiter = ICharacterClass.Factory.nullClass();
	}
	
	protected boolean doConsume() throws Exception {
		return consumeGroup$1();
	}

	protected boolean consumeGroup$1() throws Exception {
		final IMarker marker = mark();
		if (!consumeKeyword$5()) {
			marker.rollback();
			return false;
		}
		if (!consumeAssignment$6()) {
			marker.rollback();
			return false;
		}
		if (!consumeKeyword$8()) {
			marker.rollback();
			return false;
		}
		if (!consumeAssignment$9()) {
			marker.rollback();
			return false;
		}
		if (!consumeKeyword$11()) {
			marker.rollback();
			return false;
		}
		return true;
	}

	protected boolean consumeKeyword$5() throws Exception {
		return consumeKeyword(getRule().ele0000KeywordFile(), null, false, false, getKeyword$5$Delimiter());
	}

	protected boolean consumeAssignment$6() throws Exception {
		if (consumeTerminal(stringConsumer, "uri", false, false, getRule().ele00010LexerRuleCallSTRING(), getRuleCall$7$Delimiter()))
			return true;
		return false;
	}

	protected boolean consumeKeyword$8() throws Exception {
		return consumeKeyword(getRule().ele001KeywordLeftCurlyBracket(), null, false, false, getKeyword$8$Delimiter());
	}

	protected boolean consumeAssignment$9() throws Exception {
		while(doConsumeAssignment$9()) {}
		return true;
	}

	protected boolean doConsumeAssignment$9() throws Exception {
		if (consumeNonTerminal(assignmentConsumer, "assignments", true, false, getRule().ele010ParserRuleCallAssignment()))
			return true;
		return false;
	}

	protected boolean consumeKeyword$11() throws Exception {
		return consumeKeyword(getRule().ele1KeywordRightCurlyBracket(), null, false, false, getKeyword$11$Delimiter());
	}

	public WorkflowRefElements getRule() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "WorkflowRef";
	}
	
	public void setAssignmentConsumer(MWEAssignmentConsumer assignmentConsumer) {
		this.assignmentConsumer = assignmentConsumer;
	}
	
	public void setStringConsumer(XtextBuiltinSTRINGConsumer stringConsumer) {
		this.stringConsumer = stringConsumer;
	}
	
	public ISequenceMatcher getRuleCall$7$Delimiter() {
		return ruleCall$7$Delimiter;
	}
	
	public void setRuleCall$7$Delimiter(ISequenceMatcher matcher) {
		ruleCall$7$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ICharacterClass getKeyword$11$Delimiter() {
		return keyword$11$Delimiter;
	}
	
	public void setKeyword$11$Delimiter(ICharacterClass characterClass) {
		keyword$11$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$8$Delimiter() {
		return keyword$8$Delimiter;
	}
	
	public void setKeyword$8$Delimiter(ICharacterClass characterClass) {
		keyword$8$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$5$Delimiter() {
		return keyword$5$Delimiter;
	}
	
	public void setKeyword$5$Delimiter(ICharacterClass characterClass) {
		keyword$5$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
}
