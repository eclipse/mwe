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

	public MWEValueConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
	}
	
	@Override
	protected int doConsume(int entryPoint) throws Exception {
		return consumeAlternatives$1(entryPoint);
	}

	protected int consumeAlternatives$1(int entryPoint) throws Exception {
		AlternativesResult result = createAlternativesResult();
		switch(entryPoint) {
			case -1: // use fall through semantics of switch case
				result.reset();
			case 0:
				result.nextAlternative();
				if (result.isAlternativeDone(consumeRuleCall$4(nextEntryPoint()))) { 
					return result.getResult(); 
				}
			case 1:
				result.nextAlternative();
				if (result.isAlternativeDone(consumeRuleCall$5(nextEntryPoint()))) { 
					return result.getResult(); 
				}
			case 2:
				result.nextAlternative();
				if (result.isAlternativeDone(consumeRuleCall$6(nextEntryPoint()))) { 
					return result.getResult(); 
				}
			case 3:
				result.nextAlternative();
				if (result.isAlternativeDone(consumeRuleCall$7(nextEntryPoint()))) { 
					return result.getResult(); 
				}
		}
		return result.getResult();
	}

	protected int consumeRuleCall$4(int entryPoint) throws Exception {
		return consumeNonTerminal(simpleValueConsumer, null, false, false, false, getRule().ele000ParserRuleCallSimpleValue());
	}

	protected int consumeRuleCall$5(int entryPoint) throws Exception {
		return consumeNonTerminal(complexValueConsumer, null, false, false, false, getRule().ele001ParserRuleCallComplexValue());
	}

	protected int consumeRuleCall$6(int entryPoint) throws Exception {
		return consumeNonTerminal(idRefConsumer, null, false, false, false, getRule().ele01ParserRuleCallIdRef());
	}

	protected int consumeRuleCall$7(int entryPoint) throws Exception {
		return consumeNonTerminal(workflowRefConsumer, null, false, false, false, getRule().ele1ParserRuleCallWorkflowRef());
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
