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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.PropertyElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWELocalVariableConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertiesFileImportConsumer;

@SuppressWarnings("unused")
public final class MWEPropertyConsumer extends NonTerminalConsumer {

	private MWELocalVariableConsumer localVariableConsumer;
	private MWEPropertiesFileImportConsumer propertiesFileImportConsumer;

	public MWEPropertyConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	protected boolean doConsume() throws Exception {
		return consumeAlternatives$1();
	}

	protected boolean consumeAlternatives$1() throws Exception {
		if (consumeRuleCall$2())
			return true;
		if (consumeRuleCall$3())
			return true;
		return false;
	}

	protected boolean consumeRuleCall$2() throws Exception {
		return consumeNonTerminal(localVariableConsumer, null, false, false, getRule().ele0ParserRuleCallLocalVariable());
	}

	protected boolean consumeRuleCall$3() throws Exception {
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
