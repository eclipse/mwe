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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.QualifiedNameElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;

@SuppressWarnings("unused")
public final class MWEQualifiedNameConsumer extends NonTerminalConsumer {

	private XtextBuiltinIDConsumer idConsumer;

	private ISequenceMatcher ruleCall$3$Delimiter;
	
	private ISequenceMatcher ruleCall$8$Delimiter;
	
	private ICharacterClass keyword$6$Delimiter;
	
	public MWEQualifiedNameConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
		ruleCall$3$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		ruleCall$8$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		keyword$6$Delimiter = ICharacterClass.Factory.nullClass();
	}
	
	protected boolean doConsume() throws Exception {
		return consumeGroup$1();
	}

	protected boolean consumeGroup$1() throws Exception {
		final IMarker marker = mark();
		if (!consumeAssignment$2()) {
			marker.rollback();
			return false;
		}
		if (!consumeGroup$4()) {
			marker.rollback();
			return false;
		}
		return true;
	}

	protected boolean consumeAssignment$2() throws Exception {
		if (consumeTerminal(idConsumer, "parts", true, false, getRule().ele00LexerRuleCallID(), getRuleCall$3$Delimiter()))
			return true;
		return false;
	}

	protected boolean consumeGroup$4() throws Exception {
		while(doConsumeGroup$4()) {}
		return true;
	}

	protected boolean doConsumeGroup$4() throws Exception {
		final IMarker marker = mark();
		if (!consumeAssignment$5()) {
			marker.rollback();
			return false;
		}
		if (!consumeAssignment$7()) {
			marker.rollback();
			return false;
		}
		return true;
	}

	protected boolean consumeAssignment$5() throws Exception {
		if (consumeKeyword(getRule().ele100KeywordFullStop(), "parts", true, false, getKeyword$6$Delimiter()))
			return true;
		return false;
	}

	protected boolean consumeAssignment$7() throws Exception {
		if (consumeTerminal(idConsumer, "parts", true, false, getRule().ele110LexerRuleCallID(), getRuleCall$8$Delimiter()))
			return true;
		return false;
	}

	public QualifiedNameElements getRule() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "QualifiedName";
	}
	
	public void setIdConsumer(XtextBuiltinIDConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public ISequenceMatcher getRuleCall$3$Delimiter() {
		return ruleCall$3$Delimiter;
	}
	
	public void setRuleCall$3$Delimiter(ISequenceMatcher matcher) {
		ruleCall$3$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ISequenceMatcher getRuleCall$8$Delimiter() {
		return ruleCall$8$Delimiter;
	}
	
	public void setRuleCall$8$Delimiter(ISequenceMatcher matcher) {
		ruleCall$8$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ICharacterClass getKeyword$6$Delimiter() {
		return keyword$6$Delimiter;
	}
	
	public void setKeyword$6$Delimiter(ICharacterClass characterClass) {
		keyword$6$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
}
