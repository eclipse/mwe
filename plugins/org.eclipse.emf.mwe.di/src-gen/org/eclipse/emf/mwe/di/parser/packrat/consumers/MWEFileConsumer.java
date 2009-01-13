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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.FileElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEComplexValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertyConsumer;

public final class MWEFileConsumer extends NonTerminalConsumer {

	private MWEImportConsumer importConsumer;
	private MWEComplexValueConsumer complexValueConsumer;
	private MWEPropertyConsumer propertyConsumer;

	public MWEFileConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	@SuppressWarnings("unused")
	protected boolean doConsume() throws Exception {
		GROUP$1SUCCESS: {
			IMarker mGROUP$1 = mark();
			GROUP$1FAILURE: {
				GROUP$2SUCCESS: {
					IMarker mGROUP$2 = mark();
					GROUP$2FAILURE: {
						ASSIGNMENT$3SUCCESS: while(true) {
							ASSIGNMENT$3FAILURE: {
								if (consumeNonTerminal(importConsumer, "imports", true, false , getRule().ele000ParserRuleCallImport()))
									break ASSIGNMENT$3FAILURE;
								break ASSIGNMENT$3SUCCESS;
							}
							continue ASSIGNMENT$3SUCCESS;
						}
					}
					GROUP$2FAILURE: {
						ASSIGNMENT$5SUCCESS: while(true) {
							ASSIGNMENT$5FAILURE: {
								if (consumeNonTerminal(propertyConsumer, "properties", true, false , getRule().ele010ParserRuleCallProperty()))
									break ASSIGNMENT$5FAILURE;
								break ASSIGNMENT$5SUCCESS;
							}
							continue ASSIGNMENT$5SUCCESS;
						}
					}
					break GROUP$1FAILURE;
				}
			}
			GROUP$1FAILURE: {
				ASSIGNMENT$7SUCCESS: {
					ASSIGNMENT$7FAILURE: {
						if (consumeNonTerminal(complexValueConsumer, "value", false, false , getRule().ele10ParserRuleCallComplexValue()))
							break ASSIGNMENT$7FAILURE;
						mGROUP$1.rollback();
						break ASSIGNMENT$7SUCCESS;
					}
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			return true;
		}
		return false;
	}

	public FileElements getRule() {
		return MWEGrammarAccess.INSTANCE.prFile();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "File";
	}
	
	public void setImportConsumer(MWEImportConsumer importConsumer) {
		this.importConsumer = importConsumer;
	}
	
	public void setComplexValueConsumer(MWEComplexValueConsumer complexValueConsumer) {
		this.complexValueConsumer = complexValueConsumer;
	}
	
	public void setPropertyConsumer(MWEPropertyConsumer propertyConsumer) {
		this.propertyConsumer = propertyConsumer;
	}
	

}
