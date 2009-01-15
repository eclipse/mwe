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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ImportElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEGenericImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEJavaImportConsumer;

@SuppressWarnings("unused")
public final class MWEImportConsumer extends NonTerminalConsumer {

	private MWEGenericImportConsumer genericImportConsumer;
	private MWEJavaImportConsumer javaImportConsumer;

	public MWEImportConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
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
		return consumeNonTerminal(javaImportConsumer, null, false, false, getRule().ele0ParserRuleCallJavaImport());
	}

	protected boolean consumeRuleCall$3() throws Exception {
		return consumeNonTerminal(genericImportConsumer, null, false, false, getRule().ele1ParserRuleCallGenericImport());
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
	
	public void setGenericImportConsumer(MWEGenericImportConsumer genericImportConsumer) {
		this.genericImportConsumer = genericImportConsumer;
	}
	
	public void setJavaImportConsumer(MWEJavaImportConsumer javaImportConsumer) {
		this.javaImportConsumer = javaImportConsumer;
	}
	
}
