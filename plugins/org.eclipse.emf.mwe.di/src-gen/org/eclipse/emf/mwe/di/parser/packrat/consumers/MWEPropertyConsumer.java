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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.PropertyElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWELocalVariableConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertiesFileImportConsumer;

@SuppressWarnings("unused")
public final class MWEPropertyConsumer extends NonTerminalConsumer {

	private MWELocalVariableConsumer localVariableConsumer;
	private MWEPropertiesFileImportConsumer propertiesFileImportConsumer;

	public MWEPropertyConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
	}
	
	protected int doConsume() throws Exception {
		return consumeAlternatives$1();
	}

	protected int consumeAlternatives$1() throws Exception {
		int result = ConsumeResult.SUCCESS;
		IMarker bestMarker = mark();
		IMarker currentMarker;
		int tempResult;
		currentMarker = bestMarker.fork();
		tempResult = consumeRuleCall$2(); 
		if (tempResult == ConsumeResult.SUCCESS) {
			bestMarker = currentMarker.join(bestMarker);
			bestMarker.commit();
			return tempResult;
		}
		if (tempResult > result) {
			bestMarker = currentMarker.join(bestMarker);
			result = tempResult;
		} else {
			bestMarker = bestMarker.join(currentMarker);
		}
		currentMarker = null;
		currentMarker = bestMarker.fork();
		tempResult = consumeRuleCall$3(); 
		if (tempResult == ConsumeResult.SUCCESS) {
			bestMarker = currentMarker.join(bestMarker);
			bestMarker.commit();
			return tempResult;
		}
		if (tempResult > result) {
			bestMarker = currentMarker.join(bestMarker);
			result = tempResult;
		} else {
			bestMarker = bestMarker.join(currentMarker);
		}
		currentMarker = null;
		bestMarker.commit();
		return result;
	}

	protected int consumeRuleCall$2() throws Exception {
		return consumeNonTerminal(localVariableConsumer, null, false, false, getRule().ele0ParserRuleCallLocalVariable());
	}

	protected int consumeRuleCall$3() throws Exception {
		return consumeNonTerminal(propertiesFileImportConsumer, null, false, false, getRule().ele1ParserRuleCallPropertiesFileImport());
	}

	public PropertyElements getRule() {
		return MWEGrammarAccess.INSTANCE.prProperty();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "Property";
	}
	
	public void setLocalVariableConsumer(MWELocalVariableConsumer localVariableConsumer) {
		this.localVariableConsumer = localVariableConsumer;
	}
	
	public void setPropertiesFileImportConsumer(MWEPropertiesFileImportConsumer propertiesFileImportConsumer) {
		this.propertiesFileImportConsumer = propertiesFileImportConsumer;
	}
	
}
