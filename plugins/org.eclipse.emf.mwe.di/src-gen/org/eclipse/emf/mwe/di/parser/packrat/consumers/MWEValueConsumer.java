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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ValueElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEComplexValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEIdRefConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWESimpleValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEWorkflowRefConsumer;

@SuppressWarnings("unused")
public final class MWEValueConsumer extends NonTerminalConsumer {

	private MWEComplexValueConsumer complexValueConsumer;
	private MWEIdRefConsumer idRefConsumer;
	private MWESimpleValueConsumer simpleValueConsumer;
	private MWEWorkflowRefConsumer workflowRefConsumer;

	public MWEValueConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	protected boolean doConsume() throws Exception {
		return consumeAlternatives$1();
	}

	protected boolean consumeAlternatives$1() throws Exception {
		if (consumeRuleCall$4())
			return true;
		if (consumeRuleCall$5())
			return true;
		if (consumeRuleCall$6())
			return true;
		if (consumeRuleCall$7())
			return true;
		return false;
	}

	protected boolean consumeRuleCall$4() throws Exception {
		return consumeNonTerminal(simpleValueConsumer, null, false, false, getRule().ele000ParserRuleCallSimpleValue());
	}

	protected boolean consumeRuleCall$5() throws Exception {
		return consumeNonTerminal(complexValueConsumer, null, false, false, getRule().ele001ParserRuleCallComplexValue());
	}

	protected boolean consumeRuleCall$6() throws Exception {
		return consumeNonTerminal(idRefConsumer, null, false, false, getRule().ele01ParserRuleCallIdRef());
	}

	protected boolean consumeRuleCall$7() throws Exception {
		return consumeNonTerminal(workflowRefConsumer, null, false, false, getRule().ele1ParserRuleCallWorkflowRef());
	}

	public ValueElements getRule() {
		return MWEGrammarAccess.INSTANCE.prValue();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "Value";
	}
	
	public void setComplexValueConsumer(MWEComplexValueConsumer complexValueConsumer) {
		this.complexValueConsumer = complexValueConsumer;
	}
	
	public void setIdRefConsumer(MWEIdRefConsumer idRefConsumer) {
		this.idRefConsumer = idRefConsumer;
	}
	
	public void setSimpleValueConsumer(MWESimpleValueConsumer simpleValueConsumer) {
		this.simpleValueConsumer = simpleValueConsumer;
	}
	
	public void setWorkflowRefConsumer(MWEWorkflowRefConsumer workflowRefConsumer) {
		this.workflowRefConsumer = workflowRefConsumer;
	}
	
}
