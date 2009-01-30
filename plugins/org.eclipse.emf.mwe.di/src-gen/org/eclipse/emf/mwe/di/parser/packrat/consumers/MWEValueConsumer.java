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
	
	protected int doConsume(int entryPoint) throws Exception {
		return consumeAlternatives$1(entryPoint);
	}

	protected int consumeAlternatives$1(int entryPoint) throws Exception {
		announceNextLevel();
		int result = ConsumeResult.SUCCESS;
		IMarker bestMarker = mark();
		IMarker currentMarker;
		int tempResult;
		switch(entryPoint) {
			case -1: // use fallthrough semantics of switch case
				result = ConsumeResult.EMPTY_MATCH;
			case 0:
				announceNextPath();
				currentMarker = bestMarker.fork();
				tempResult = consumeRuleCall$4(nextEntryPoint()); 
				if (tempResult == ConsumeResult.SUCCESS) {
					bestMarker = currentMarker.join(bestMarker);
					bestMarker.commit();
					announceLevelFinished();
					return tempResult;
				}
				if (tempResult > result) {
					bestMarker = currentMarker.join(bestMarker);
					result = tempResult;
				} else {
					bestMarker = bestMarker.join(currentMarker);
				}
				currentMarker = null;
			case 1:
				announceNextPath();
				currentMarker = bestMarker.fork();
				tempResult = consumeRuleCall$5(nextEntryPoint()); 
				if (tempResult == ConsumeResult.SUCCESS) {
					bestMarker = currentMarker.join(bestMarker);
					bestMarker.commit();
					announceLevelFinished();
					return tempResult;
				}
				if (tempResult > result) {
					bestMarker = currentMarker.join(bestMarker);
					result = tempResult;
				} else {
					bestMarker = bestMarker.join(currentMarker);
				}
				currentMarker = null;
			case 2:
				announceNextPath();
				currentMarker = bestMarker.fork();
				tempResult = consumeRuleCall$6(nextEntryPoint()); 
				if (tempResult == ConsumeResult.SUCCESS) {
					bestMarker = currentMarker.join(bestMarker);
					bestMarker.commit();
					announceLevelFinished();
					return tempResult;
				}
				if (tempResult > result) {
					bestMarker = currentMarker.join(bestMarker);
					result = tempResult;
				} else {
					bestMarker = bestMarker.join(currentMarker);
				}
				currentMarker = null;
			case 3:
				announceNextPath();
				currentMarker = bestMarker.fork();
				tempResult = consumeRuleCall$7(nextEntryPoint()); 
				if (tempResult == ConsumeResult.SUCCESS) {
					bestMarker = currentMarker.join(bestMarker);
					bestMarker.commit();
					announceLevelFinished();
					return tempResult;
				}
				if (tempResult > result) {
					bestMarker = currentMarker.join(bestMarker);
					result = tempResult;
				} else {
					bestMarker = bestMarker.join(currentMarker);
				}
				currentMarker = null;
		}
		bestMarker.commit();
		announceLevelFinished();
		return result;
	}

	protected int consumeRuleCall$4(int entryPoint) throws Exception {
		return consumeNonTerminal(simpleValueConsumer, null, false, false, getRule().ele000ParserRuleCallSimpleValue());
	}

	protected int consumeRuleCall$5(int entryPoint) throws Exception {
		return consumeNonTerminal(complexValueConsumer, null, false, false, getRule().ele001ParserRuleCallComplexValue());
	}

	protected int consumeRuleCall$6(int entryPoint) throws Exception {
		return consumeNonTerminal(idRefConsumer, null, false, false, getRule().ele01ParserRuleCallIdRef());
	}

	protected int consumeRuleCall$7(int entryPoint) throws Exception {
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
