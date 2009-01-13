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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ValueElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWESimpleValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEIdRefConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEWorkflowRefConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEComplexValueConsumer;

public final class MWEValueConsumer extends NonTerminalConsumer {

	private MWESimpleValueConsumer simpleValueConsumer;
	private MWEIdRefConsumer idRefConsumer;
	private MWEWorkflowRefConsumer workflowRefConsumer;
	private MWEComplexValueConsumer complexValueConsumer;

	public MWEValueConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	@SuppressWarnings("unused")
	protected boolean doConsume() throws Exception {
		ALTERNATIVES$1SUCCESS: {
			ALTERNATIVES$1FAILURE: {
				ALTERNATIVES$2SUCCESS: {
					ALTERNATIVES$2FAILURE: {
						ALTERNATIVES$3SUCCESS: {
							ALTERNATIVES$3FAILURE: {
								RULECALL$4SUCCESS: {
									if (!consumeNonTerminal(simpleValueConsumer, null, false, false,  getRule().ele000ParserRuleCallSimpleValue()))
										break RULECALL$4SUCCESS;
									break ALTERNATIVES$3FAILURE;
								}
								RULECALL$5SUCCESS: {
									if (!consumeNonTerminal(complexValueConsumer, null, false, false,  getRule().ele001ParserRuleCallComplexValue()))
										break RULECALL$5SUCCESS;
									break ALTERNATIVES$3FAILURE;
								}
								break ALTERNATIVES$3SUCCESS;
							}
							break ALTERNATIVES$2FAILURE;
						}
						RULECALL$6SUCCESS: {
							if (!consumeNonTerminal(idRefConsumer, null, false, false,  getRule().ele01ParserRuleCallIdRef()))
								break RULECALL$6SUCCESS;
							break ALTERNATIVES$2FAILURE;
						}
						break ALTERNATIVES$2SUCCESS;
					}
					break ALTERNATIVES$1FAILURE;
				}
				RULECALL$7SUCCESS: {
					if (!consumeNonTerminal(workflowRefConsumer, null, false, false,  getRule().ele1ParserRuleCallWorkflowRef()))
						break RULECALL$7SUCCESS;
					break ALTERNATIVES$1FAILURE;
				}
				break ALTERNATIVES$1SUCCESS;
			}
			return true;
		}
		return false;
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
	
	public void setSimpleValueConsumer(MWESimpleValueConsumer simpleValueConsumer) {
		this.simpleValueConsumer = simpleValueConsumer;
	}
	
	public void setIdRefConsumer(MWEIdRefConsumer idRefConsumer) {
		this.idRefConsumer = idRefConsumer;
	}
	
	public void setWorkflowRefConsumer(MWEWorkflowRefConsumer workflowRefConsumer) {
		this.workflowRefConsumer = workflowRefConsumer;
	}
	
	public void setComplexValueConsumer(MWEComplexValueConsumer complexValueConsumer) {
		this.complexValueConsumer = complexValueConsumer;
	}
	

}
