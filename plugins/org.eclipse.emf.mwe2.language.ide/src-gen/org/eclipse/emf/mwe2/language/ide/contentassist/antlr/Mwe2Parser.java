/*******************************************************************************
 * Copyright (c) 2010, 2023 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.emf.mwe2.language.ide.contentassist.antlr.internal.InternalMwe2Parser;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class Mwe2Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Mwe2GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Mwe2GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRootComponentAccess().getAlternatives_1(), "rule__RootComponent__Alternatives_1");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_1(), "rule__Component__Alternatives_1");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getIntValueAccess().getAlternatives_0(), "rule__IntValue__Alternatives_0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getStringLiteralAccess().getAlternatives(), "rule__StringLiteral__Alternatives");
			builder.put(grammarAccess.getConstantValueAccess().getAlternatives(), "rule__ConstantValue__Alternatives");
			builder.put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
			builder.put(grammarAccess.getDeclaredPropertyAccess().getGroup(), "rule__DeclaredProperty__Group__0");
			builder.put(grammarAccess.getDeclaredPropertyAccess().getGroup_3(), "rule__DeclaredProperty__Group_3__0");
			builder.put(grammarAccess.getRootComponentAccess().getGroup(), "rule__RootComponent__Group__0");
			builder.put(grammarAccess.getRootComponentAccess().getGroup_1_1(), "rule__RootComponent__Group_1_1__0");
			builder.put(grammarAccess.getRootComponentAccess().getGroup_2(), "rule__RootComponent__Group_2__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_1_1(), "rule__Component__Group_1_1__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_2(), "rule__Component__Group_2__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getImportedFQNAccess().getGroup(), "rule__ImportedFQN__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
			builder.put(grammarAccess.getDoubleValueAccess().getGroup(), "rule__DoubleValue__Group__0");
			builder.put(grammarAccess.getIntValueAccess().getGroup(), "rule__IntValue__Group__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup_0(), "rule__StringLiteral__Group_0__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup_0_2(), "rule__StringLiteral__Group_0_2__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup_1(), "rule__StringLiteral__Group_1__0");
			builder.put(grammarAccess.getStringLiteralAccess().getGroup_1_2(), "rule__StringLiteral__Group_1_2__0");
			builder.put(grammarAccess.getPropertyReferenceAccess().getGroup(), "rule__PropertyReference__Group__0");
			builder.put(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2(), "rule__Module__CanonicalNameAssignment_2");
			builder.put(grammarAccess.getModuleAccess().getImportsAssignment_3(), "rule__Module__ImportsAssignment_3");
			builder.put(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4(), "rule__Module__DeclaredPropertiesAssignment_4");
			builder.put(grammarAccess.getModuleAccess().getRootAssignment_5(), "rule__Module__RootAssignment_5");
			builder.put(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1(), "rule__DeclaredProperty__TypeAssignment_1");
			builder.put(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2(), "rule__DeclaredProperty__NameAssignment_2");
			builder.put(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1(), "rule__DeclaredProperty__DefaultAssignment_3_1");
			builder.put(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0(), "rule__RootComponent__TypeAssignment_1_0");
			builder.put(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1(), "rule__RootComponent__ModuleAssignment_1_1_1");
			builder.put(grammarAccess.getRootComponentAccess().getNameAssignment_2_1(), "rule__RootComponent__NameAssignment_2_1");
			builder.put(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3(), "rule__RootComponent__AutoInjectAssignment_3");
			builder.put(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5(), "rule__RootComponent__AssignmentAssignment_5");
			builder.put(grammarAccess.getComponentAccess().getTypeAssignment_1_0(), "rule__Component__TypeAssignment_1_0");
			builder.put(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1(), "rule__Component__ModuleAssignment_1_1_1");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_2_1(), "rule__Component__NameAssignment_2_1");
			builder.put(grammarAccess.getComponentAccess().getAutoInjectAssignment_3(), "rule__Component__AutoInjectAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getAssignmentAssignment_5(), "rule__Component__AssignmentAssignment_5");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getAssignmentAccess().getFeatureAssignment_0(), "rule__Assignment__FeatureAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
			builder.put(grammarAccess.getDoubleLiteralAccess().getValueAssignment(), "rule__DoubleLiteral__ValueAssignment");
			builder.put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(), "rule__IntegerLiteral__ValueAssignment");
			builder.put(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0(), "rule__BooleanLiteral__IsTrueAssignment_1_0");
			builder.put(grammarAccess.getReferenceAccess().getReferableAssignment(), "rule__Reference__ReferableAssignment");
			builder.put(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0(), "rule__StringLiteral__BeginAssignment_0_0");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1(), "rule__StringLiteral__PartsAssignment_0_1");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0(), "rule__StringLiteral__PartsAssignment_0_2_0");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1(), "rule__StringLiteral__PartsAssignment_0_2_1");
			builder.put(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3(), "rule__StringLiteral__EndAssignment_0_3");
			builder.put(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0(), "rule__StringLiteral__BeginAssignment_1_0");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1(), "rule__StringLiteral__PartsAssignment_1_1");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0(), "rule__StringLiteral__PartsAssignment_1_2_0");
			builder.put(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1(), "rule__StringLiteral__PartsAssignment_1_2_1");
			builder.put(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3(), "rule__StringLiteral__EndAssignment_1_3");
			builder.put(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment(), "rule__PropertyReferenceImpl__ReferableAssignment");
			builder.put(grammarAccess.getPlainStringAccess().getValueAssignment(), "rule__PlainString__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Mwe2GrammarAccess grammarAccess;

	@Override
	protected InternalMwe2Parser createParser() {
		InternalMwe2Parser result = new InternalMwe2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Mwe2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
