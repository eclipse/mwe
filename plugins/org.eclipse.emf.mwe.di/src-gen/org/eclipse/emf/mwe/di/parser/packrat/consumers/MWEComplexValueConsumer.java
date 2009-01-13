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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ComplexValueElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEQualifiedNameConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEAssignmentConsumer;

public final class MWEComplexValueConsumer extends NonTerminalConsumer {

	private XtextBuiltinIDConsumer idConsumer;
	private MWEQualifiedNameConsumer qualifiedNameConsumer;
	private MWEAssignmentConsumer assignmentConsumer;

	public MWEComplexValueConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
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
								GROUP$4SUCCESS: {
									IMarker mGROUP$4 = mark();
									GROUP$4FAILURE: {
										ASSIGNMENT$5SUCCESS: {
											ASSIGNMENT$5FAILURE: {
												if (consumeNonTerminal(qualifiedNameConsumer, "className", false, false , getRule().ele00000ParserRuleCallQualifiedName()))
													break ASSIGNMENT$5FAILURE;
												break ASSIGNMENT$5SUCCESS;
											}
											break GROUP$4FAILURE;
										}
									}
									GROUP$4FAILURE: {
										GROUP$7SUCCESS: {
											IMarker mGROUP$7 = mark();
											GROUP$7FAILURE: {
												KEYWORD$8SUCCESS: {
													if (!consumeKeyword(getRule().ele00010KeywordColon(), null, false, false))
														break KEYWORD$8SUCCESS;
													break GROUP$7FAILURE;
												}
												mGROUP$7.rollback();
												break GROUP$7SUCCESS;
											}
											GROUP$7FAILURE: {
												ASSIGNMENT$9SUCCESS: {
													ASSIGNMENT$9FAILURE: {
														if (consumeTerminal(idConsumer, "id", false, false, getRule().ele000110LexerRuleCallID()))
															break ASSIGNMENT$9FAILURE;
														mGROUP$7.rollback();
														break ASSIGNMENT$9SUCCESS;
													}
													break GROUP$7FAILURE;
												}
												mGROUP$7.rollback();
												break GROUP$7SUCCESS;
											}
											break GROUP$4FAILURE;
										}
									}
									break GROUP$3FAILURE;
								}
							}
							GROUP$3FAILURE: {
								ASSIGNMENT$11SUCCESS: {
									ASSIGNMENT$11FAILURE: {
										if (consumeKeyword(getRule().ele0010KeywordLeftCurlyBracket(), "fooBar", false, true))
											break ASSIGNMENT$11FAILURE;
										mGROUP$3.rollback();
										break ASSIGNMENT$11SUCCESS;
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
						ASSIGNMENT$13SUCCESS: while(true) {
							ASSIGNMENT$13FAILURE: {
								if (consumeNonTerminal(assignmentConsumer, "assignments", true, false , getRule().ele010ParserRuleCallAssignment()))
									break ASSIGNMENT$13FAILURE;
								break ASSIGNMENT$13SUCCESS;
							}
							continue ASSIGNMENT$13SUCCESS;
						}
					}
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			GROUP$1FAILURE: {
				KEYWORD$15SUCCESS: {
					if (!consumeKeyword(getRule().ele1KeywordRightCurlyBracket(), null, false, false))
						break KEYWORD$15SUCCESS;
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			return true;
		}
		return false;
	}

	public ComplexValueElements getRule() {
		return MWEGrammarAccess.INSTANCE.prComplexValue();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "ComplexValue";
	}
	
	public void setIdConsumer(XtextBuiltinIDConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public void setQualifiedNameConsumer(MWEQualifiedNameConsumer qualifiedNameConsumer) {
		this.qualifiedNameConsumer = qualifiedNameConsumer;
	}
	
	public void setAssignmentConsumer(MWEAssignmentConsumer assignmentConsumer) {
		this.assignmentConsumer = assignmentConsumer;
	}
	

}
