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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.FileElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEComplexValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertyConsumer;

@SuppressWarnings("unused")
public final class MWEFileConsumer extends NonTerminalConsumer {

	private MWEComplexValueConsumer complexValueConsumer;
	private MWEImportConsumer importConsumer;
	private MWEPropertyConsumer propertyConsumer;

	public MWEFileConsumer(ICharSequenceWithOffset input, IMarkerFactory markerFactory,
			IParsedTokenAcceptor tokenAcceptor, IHiddenTokenHandler hiddenTokenHandler, IConsumerUtility consumerUtil,
			ITerminalConsumer[] hiddenTokens) {
		super(input, markerFactory, tokenAcceptor, hiddenTokenHandler, consumerUtil, hiddenTokens);
	}
	
	protected boolean doConsume() throws Exception {
		return consumeGroup$1();
	}

	protected boolean consumeGroup$1() throws Exception {
		final IMarker marker = mark();
		if (!consumeAssignment$3()) {
			marker.rollback();
			return false;
		}
		if (!consumeAssignment$5()) {
			marker.rollback();
			return false;
		}
		if (!consumeAssignment$7()) {
			marker.rollback();
			return false;
		}
		return true;
	}

	protected boolean consumeAssignment$3() throws Exception {
		while(doConsumeAssignment$3()) {}
		return true;
	}

	protected boolean doConsumeAssignment$3() throws Exception {
		if (consumeNonTerminal(importConsumer, "imports", true, false, getRule().ele000ParserRuleCallImport()))
			return true;
		return false;
	}

	protected boolean consumeAssignment$5() throws Exception {
		while(doConsumeAssignment$5()) {}
		return true;
	}

	protected boolean doConsumeAssignment$5() throws Exception {
		if (consumeNonTerminal(propertyConsumer, "properties", true, false, getRule().ele010ParserRuleCallProperty()))
			return true;
		return false;
	}

	protected boolean consumeAssignment$7() throws Exception {
		if (consumeNonTerminal(complexValueConsumer, "value", false, false, getRule().ele10ParserRuleCallComplexValue()))
			return true;
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
	
	public void setComplexValueConsumer(MWEComplexValueConsumer complexValueConsumer) {
		this.complexValueConsumer = complexValueConsumer;
	}
	
	public void setImportConsumer(MWEImportConsumer importConsumer) {
		this.importConsumer = importConsumer;
	}
	
	public void setPropertyConsumer(MWEPropertyConsumer propertyConsumer) {
		this.propertyConsumer = propertyConsumer;
	}
	
}
