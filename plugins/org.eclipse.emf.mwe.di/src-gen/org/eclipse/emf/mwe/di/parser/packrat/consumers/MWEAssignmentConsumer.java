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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.AssignmentElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEValueConsumer;

public final class MWEAssignmentConsumer extends NonTerminalConsumer {

	private XtextBuiltinIDConsumer idConsumer;
	private MWEValueConsumer valueConsumer;

	public MWEAssignmentConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
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
								ASSIGNMENT$4SUCCESS: {
									ASSIGNMENT$4FAILURE: {
										if (consumeTerminal(idConsumer, "feature", false, false, getRule().ele0000LexerRuleCallID()))
											break ASSIGNMENT$4FAILURE;
										break ASSIGNMENT$4SUCCESS;
									}
									break GROUP$3FAILURE;
								}
							}
							GROUP$3FAILURE: {
								ASSIGNMENT$6SUCCESS: {
									ASSIGNMENT$6FAILURE: {
										if (consumeKeyword(getRule().ele00100KeywordEqualsSign(), "operator", false, false))
											break ASSIGNMENT$6FAILURE;
										if (consumeKeyword(getRule().ele00101KeywordPlusSignEqualsSign(), "operator", false, false))
											break ASSIGNMENT$6FAILURE;
										mGROUP$3.rollback();
										break ASSIGNMENT$6SUCCESS;
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
						ASSIGNMENT$10SUCCESS: {
							ASSIGNMENT$10FAILURE: {
								if (consumeNonTerminal(valueConsumer, "value", false, false , getRule().ele010ParserRuleCallValue()))
									break ASSIGNMENT$10FAILURE;
								mGROUP$2.rollback();
								break ASSIGNMENT$10SUCCESS;
							}
							break GROUP$2FAILURE;
						}
						mGROUP$2.rollback();
						break GROUP$2SUCCESS;
					}
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			GROUP$1FAILURE: {
				KEYWORD$12SUCCESS: {
					if (!consumeKeyword(getRule().ele1KeywordSemicolon(), null, false, false))
						break KEYWORD$12SUCCESS;
					break GROUP$1FAILURE;
				}
			}
			return true;
		}
		return false;
	}

	public AssignmentElements getRule() {
		return MWEGrammarAccess.INSTANCE.prAssignment();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "Assignment";
	}
	
	public void setIdConsumer(XtextBuiltinIDConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public void setValueConsumer(MWEValueConsumer valueConsumer) {
		this.valueConsumer = valueConsumer;
	}
	

}
