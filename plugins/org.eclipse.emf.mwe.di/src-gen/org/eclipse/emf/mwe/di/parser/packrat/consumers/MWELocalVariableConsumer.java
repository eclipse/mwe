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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.LocalVariableElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEValueConsumer;

public final class MWELocalVariableConsumer extends NonTerminalConsumer {

	private XtextBuiltinIDConsumer idConsumer;
	private MWEValueConsumer valueConsumer;

	public MWELocalVariableConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
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
						GROUP$3SUCCESS: {
							IMarker mGROUP$3 = mark();
							GROUP$3FAILURE: {
								KEYWORD$4SUCCESS: {
									if (!consumeKeyword(getRule().ele000KeywordVar(), null, false, false))
										break KEYWORD$4SUCCESS;
									break GROUP$3FAILURE;
								}
								mGROUP$3.rollback();
								break GROUP$3SUCCESS;
							}
							GROUP$3FAILURE: {
								ASSIGNMENT$5SUCCESS: {
									ASSIGNMENT$5FAILURE: {
										if (consumeTerminal(idConsumer, "name", false, false, getRule().ele0010LexerRuleCallID()))
											break ASSIGNMENT$5FAILURE;
										mGROUP$3.rollback();
										break ASSIGNMENT$5SUCCESS;
									}
									break GROUP$3FAILURE;
								}
								mGROUP$3.rollback();
								break GROUP$3SUCCESS;
							}
							break GROUP$2FAILURE;
						}
						mGROUP$2.rollback();
						break GROUP$2SUCCESS;
					}
					GROUP$2FAILURE: {
						GROUP$7SUCCESS: {
							IMarker mGROUP$7 = mark();
							GROUP$7FAILURE: {
								KEYWORD$8SUCCESS: {
									if (!consumeKeyword(getRule().ele010KeywordEqualsSign(), null, false, false))
										break KEYWORD$8SUCCESS;
									break GROUP$7FAILURE;
								}
								mGROUP$7.rollback();
								break GROUP$7SUCCESS;
							}
							GROUP$7FAILURE: {
								ASSIGNMENT$9SUCCESS: {
									ASSIGNMENT$9FAILURE: {
										if (consumeNonTerminal(valueConsumer, "value", false, false , getRule().ele0110ParserRuleCallValue()))
											break ASSIGNMENT$9FAILURE;
										mGROUP$7.rollback();
										break ASSIGNMENT$9SUCCESS;
									}
									break GROUP$7FAILURE;
								}
								mGROUP$7.rollback();
								break GROUP$7SUCCESS;
							}
							break GROUP$2FAILURE;
						}
					}
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			GROUP$1FAILURE: {
				KEYWORD$11SUCCESS: {
					if (!consumeKeyword(getRule().ele1KeywordSemicolon(), null, false, false))
						break KEYWORD$11SUCCESS;
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			return true;
		}
		return false;
	}

	public LocalVariableElements getRule() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "LocalVariable";
	}
	
	public void setIdConsumer(XtextBuiltinIDConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public void setValueConsumer(MWEValueConsumer valueConsumer) {
		this.valueConsumer = valueConsumer;
	}
	

}
