/*******************************************************************************
 * Copyright (c) 2011, 2018 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.serializer;

import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess.StringLiteralElements;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;

import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class Mwe2SemanticSequencer extends AbstractMwe2SemanticSequencer {
	
	@Inject
	private Mwe2GrammarAccess grammarAccess;

	@Override
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral lit) {
		INodesForEObjectProvider nodes = createNodeProvider(lit);
		SequenceFeeder feeder = createSequencerFeeder(lit, nodes);
		StringLiteralElements g = grammarAccess.getStringLiteralAccess();
		if ("'".equals(lit.getBegin())) {
			feeder.accept(g.getBeginApostropheKeyword_0_0_0());
			if (!lit.getParts().isEmpty()) {
				int i = 0;
				if (lit.getParts().get(i) instanceof PlainString) {
					feeder.accept(g.getPartsPlainStringParserRuleCall_0_1_0(), lit.getParts().get(i), i);
					i++;
				}
				while (i < lit.getParts().size()) {
					feeder.accept(g.getPartsPropertyReferenceParserRuleCall_0_2_0_0(), lit.getParts().get(i), i);
					i++;
					if (i < lit.getParts().size() && lit.getParts().get(i) instanceof PlainString) {
						feeder.accept(g.getPartsPlainStringParserRuleCall_0_2_1_0(), lit.getParts().get(i), i);
						i++;
					}
				}
			}
			feeder.accept(g.getEndApostropheKeyword_0_3_0());
		} else {
			feeder.accept(g.getBeginQuotationMarkKeyword_1_0_0());
			if (!lit.getParts().isEmpty()) {
				int i = 0;
				if (lit.getParts().get(i) instanceof PlainString) {
					feeder.accept(g.getPartsPlainStringParserRuleCall_1_1_0(), lit.getParts().get(i), i);
					i++;
				}
				while (i < lit.getParts().size()) {
					feeder.accept(g.getPartsPropertyReferenceParserRuleCall_1_2_0_0(), lit.getParts().get(i), i);
					i++;
					if (i < lit.getParts().size() && lit.getParts().get(i) instanceof PlainString) {
						feeder.accept(g.getPartsPlainStringParserRuleCall_1_2_1_0(), lit.getParts().get(i), i);
						i++;
					}
				}
			}
			feeder.accept(g.getEndQuotationMarkKeyword_1_3_0());
		}
		feeder.finish();
	}
}
