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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.QualifiedNameElements;

import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;

public final class MWEQualifiedNameConsumer extends NonTerminalConsumer {

	private XtextBuiltinIDConsumer idConsumer;

	public MWEQualifiedNameConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	@SuppressWarnings("unused")
	protected boolean doConsume() throws Exception {
		GROUP$1SUCCESS: {
			IMarker mGROUP$1 = mark();
			GROUP$1FAILURE: {
				ASSIGNMENT$2SUCCESS: {
					ASSIGNMENT$2FAILURE: {
						if (consumeTerminal(idConsumer, "parts", true, false, getRule().ele00LexerRuleCallID()))
							break ASSIGNMENT$2FAILURE;
						mGROUP$1.rollback();
						break ASSIGNMENT$2SUCCESS;
					}
					break GROUP$1FAILURE;
				}
				mGROUP$1.rollback();
				break GROUP$1SUCCESS;
			}
			GROUP$1FAILURE: {
				GROUP$4SUCCESS: while(true) {
					IMarker mGROUP$4 = mark();
					GROUP$4FAILURE: {
						ASSIGNMENT$5SUCCESS: {
							ASSIGNMENT$5FAILURE: {
								if (consumeKeyword(getRule().ele100KeywordFullStop(), "parts", true, false))
									break ASSIGNMENT$5FAILURE;
								mGROUP$4.rollback();
								break ASSIGNMENT$5SUCCESS;
							}
							break GROUP$4FAILURE;
						}
						mGROUP$4.rollback();
						break GROUP$4SUCCESS;
					}
					GROUP$4FAILURE: {
						ASSIGNMENT$7SUCCESS: {
							ASSIGNMENT$7FAILURE: {
								if (consumeTerminal(idConsumer, "parts", true, false, getRule().ele110LexerRuleCallID()))
									break ASSIGNMENT$7FAILURE;
								mGROUP$4.rollback();
								break ASSIGNMENT$7SUCCESS;
							}
							break GROUP$4FAILURE;
						}
						mGROUP$4.rollback();
						break GROUP$4SUCCESS;
					}
					continue GROUP$4SUCCESS;
				}
			}
			return true;
		}
		return false;
	}

	public QualifiedNameElements getRule() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName();
	}
	
	protected EObject getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected String getDefaultTypeName() {
		return "QualifiedName";
	}
	
	public void setIdConsumer(XtextBuiltinIDConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	

}
