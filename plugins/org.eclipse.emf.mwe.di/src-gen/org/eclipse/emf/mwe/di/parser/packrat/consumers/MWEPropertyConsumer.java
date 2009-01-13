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
import org.eclipse.xtext.parser.packrat.tokens.IParsedTokenAcceptor;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.PropertyElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWELocalVariableConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertiesFileImportConsumer;

public final class MWEPropertyConsumer extends NonTerminalConsumer {

	private MWELocalVariableConsumer localVariableConsumer;
	private MWEPropertiesFileImportConsumer propertiesFileImportConsumer;

	public MWEPropertyConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	@SuppressWarnings("unused")
	protected boolean doConsume() throws Exception {
		ALTERNATIVES$1SUCCESS: {
			ALTERNATIVES$1FAILURE: {
				RULECALL$2SUCCESS: {
					if (!consumeNonTerminal(localVariableConsumer, null, false, false,  getRule().ele0ParserRuleCallLocalVariable()))
						break RULECALL$2SUCCESS;
					break ALTERNATIVES$1FAILURE;
				}
				RULECALL$3SUCCESS: {
					if (!consumeNonTerminal(propertiesFileImportConsumer, null, false, false,  getRule().ele1ParserRuleCallPropertiesFileImport()))
						break RULECALL$3SUCCESS;
					break ALTERNATIVES$1FAILURE;
				}
				break ALTERNATIVES$1SUCCESS;
			}
			return true;
		}
		return false;
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
