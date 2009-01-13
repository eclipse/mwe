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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ImportElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEJavaImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEGenericImportConsumer;

public final class MWEImportConsumer extends NonTerminalConsumer {

	private MWEJavaImportConsumer javaImportConsumer;
	private MWEGenericImportConsumer genericImportConsumer;

	public MWEImportConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	@SuppressWarnings("unused")
	protected boolean doConsume() throws Exception {
		ALTERNATIVES$1SUCCESS: {
			ALTERNATIVES$1FAILURE: {
				RULECALL$2SUCCESS: {
					if (!consumeNonTerminal(javaImportConsumer, null, false, false,  getRule().ele0ParserRuleCallJavaImport()))
						break RULECALL$2SUCCESS;
					break ALTERNATIVES$1FAILURE;
				}
				RULECALL$3SUCCESS: {
					if (!consumeNonTerminal(genericImportConsumer, null, false, false,  getRule().ele1ParserRuleCallGenericImport()))
						break RULECALL$3SUCCESS;
					break ALTERNATIVES$1FAILURE;
				}
				break ALTERNATIVES$1SUCCESS;
			}
			return true;
		}
		return false;
	}

	public ImportElements getRule() {
		return MWEGrammarAccess.INSTANCE.prImport();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "Import";
	}
	
	public void setJavaImportConsumer(MWEJavaImportConsumer javaImportConsumer) {
		this.javaImportConsumer = javaImportConsumer;
	}
	
	public void setGenericImportConsumer(MWEGenericImportConsumer genericImportConsumer) {
		this.genericImportConsumer = genericImportConsumer;
	}
	

}
