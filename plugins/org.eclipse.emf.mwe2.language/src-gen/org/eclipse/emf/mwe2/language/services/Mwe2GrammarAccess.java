/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Mwe2GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModuleAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModuleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCanonicalNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCanonicalNameFQNParserRuleCall_2_0 = (RuleCall)cCanonicalNameAssignment_2.eContents().get(0);
		private final Assignment cImportsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportsImportParserRuleCall_3_0 = (RuleCall)cImportsAssignment_3.eContents().get(0);
		private final Assignment cDeclaredPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0 = (RuleCall)cDeclaredPropertiesAssignment_4.eContents().get(0);
		private final Assignment cRootAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRootRootComponentParserRuleCall_5_0 = (RuleCall)cRootAssignment_5.eContents().get(0);
		
		//Module:
		//  {Module}
		//  'module' canonicalName=FQN
		//  imports+=Import*
		//  (declaredProperties+=DeclaredProperty)*
		//  root=RootComponent;
		@Override public ParserRule getRule() { return rule; }
		
		//{Module}
		//'module' canonicalName=FQN
		//imports+=Import*
		//(declaredProperties+=DeclaredProperty)*
		//root=RootComponent
		public Group getGroup() { return cGroup; }
		
		//{Module}
		public Action getModuleAction_0() { return cModuleAction_0; }
		
		//'module'
		public Keyword getModuleKeyword_1() { return cModuleKeyword_1; }
		
		//canonicalName=FQN
		public Assignment getCanonicalNameAssignment_2() { return cCanonicalNameAssignment_2; }
		
		//FQN
		public RuleCall getCanonicalNameFQNParserRuleCall_2_0() { return cCanonicalNameFQNParserRuleCall_2_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_3() { return cImportsAssignment_3; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_3_0() { return cImportsImportParserRuleCall_3_0; }
		
		//(declaredProperties+=DeclaredProperty)*
		public Assignment getDeclaredPropertiesAssignment_4() { return cDeclaredPropertiesAssignment_4; }
		
		//DeclaredProperty
		public RuleCall getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0() { return cDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0; }
		
		//root=RootComponent
		public Assignment getRootAssignment_5() { return cRootAssignment_5; }
		
		//RootComponent
		public RuleCall getRootRootComponentParserRuleCall_5_0() { return cRootRootComponentParserRuleCall_5_0; }
	}
	public class DeclaredPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.DeclaredProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeJvmTypeCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeJvmTypeFQNParserRuleCall_1_0_1 = (RuleCall)cTypeJvmTypeCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDefaultAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDefaultValueParserRuleCall_3_1_0 = (RuleCall)cDefaultAssignment_3_1.eContents().get(0);
		
		//DeclaredProperty:
		//  'var' (type=[types::JvmType|FQN])? name=FQN ('=' default=Value)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' (type=[types::JvmType|FQN])? name=FQN ('=' default=Value)?
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//(type=[types::JvmType|FQN])?
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[types::JvmType|FQN]
		public CrossReference getTypeJvmTypeCrossReference_1_0() { return cTypeJvmTypeCrossReference_1_0; }
		
		//FQN
		public RuleCall getTypeJvmTypeFQNParserRuleCall_1_0_1() { return cTypeJvmTypeFQNParserRuleCall_1_0_1; }
		
		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }
		
		//('=' default=Value)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//default=Value
		public Assignment getDefaultAssignment_3_1() { return cDefaultAssignment_3_1; }
		
		//Value
		public RuleCall getDefaultValueParserRuleCall_3_1_0() { return cDefaultValueParserRuleCall_3_1_0; }
	}
	public class RootComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.RootComponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final CrossReference cTypeJvmTypeCrossReference_1_0_0 = (CrossReference)cTypeAssignment_1_0.eContents().get(0);
		private final RuleCall cTypeJvmTypeFQNParserRuleCall_1_0_0_1 = (RuleCall)cTypeJvmTypeCrossReference_1_0_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cCommercialAtKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cModuleAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final CrossReference cModuleModuleCrossReference_1_1_1_0 = (CrossReference)cModuleAssignment_1_1_1.eContents().get(0);
		private final RuleCall cModuleModuleFQNParserRuleCall_1_1_1_0_1 = (RuleCall)cModuleModuleCrossReference_1_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Assignment cAutoInjectAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cAutoInjectAutoInjectKeyword_3_0 = (Keyword)cAutoInjectAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAssignmentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAssignmentAssignmentParserRuleCall_5_0 = (RuleCall)cAssignmentAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RootComponent returns Component:
		//  {Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN]) (':' name=FQN)? (autoInject?='auto-inject')?
		//  '{'
		//    assignment+=Assignment*
		//  '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN]) (':' name=FQN)? (autoInject?='auto-inject')?
		//'{'
		//  assignment+=Assignment*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Component}
		public Action getComponentAction_0() { return cComponentAction_0; }
		
		//(type=[types::JvmType|FQN]| '@' module=[Module|FQN])
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//type=[types::JvmType|FQN]
		public Assignment getTypeAssignment_1_0() { return cTypeAssignment_1_0; }
		
		//[types::JvmType|FQN]
		public CrossReference getTypeJvmTypeCrossReference_1_0_0() { return cTypeJvmTypeCrossReference_1_0_0; }
		
		//FQN
		public RuleCall getTypeJvmTypeFQNParserRuleCall_1_0_0_1() { return cTypeJvmTypeFQNParserRuleCall_1_0_0_1; }
		
		//'@' module=[Module|FQN]
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'@'
		public Keyword getCommercialAtKeyword_1_1_0() { return cCommercialAtKeyword_1_1_0; }
		
		//module=[Module|FQN]
		public Assignment getModuleAssignment_1_1_1() { return cModuleAssignment_1_1_1; }
		
		//[Module|FQN]
		public CrossReference getModuleModuleCrossReference_1_1_1_0() { return cModuleModuleCrossReference_1_1_1_0; }
		
		//FQN
		public RuleCall getModuleModuleFQNParserRuleCall_1_1_1_0_1() { return cModuleModuleFQNParserRuleCall_1_1_1_0_1; }
		
		//(':' name=FQN)?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//name=FQN
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_2_1_0() { return cNameFQNParserRuleCall_2_1_0; }
		
		//(autoInject?='auto-inject')?
		public Assignment getAutoInjectAssignment_3() { return cAutoInjectAssignment_3; }
		
		//'auto-inject'
		public Keyword getAutoInjectAutoInjectKeyword_3_0() { return cAutoInjectAutoInjectKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//assignment+=Assignment*
		public Assignment getAssignmentAssignment_5() { return cAssignmentAssignment_5; }
		
		//Assignment
		public RuleCall getAssignmentAssignmentParserRuleCall_5_0() { return cAssignmentAssignmentParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final CrossReference cTypeJvmTypeCrossReference_1_0_0 = (CrossReference)cTypeAssignment_1_0.eContents().get(0);
		private final RuleCall cTypeJvmTypeFQNParserRuleCall_1_0_0_1 = (RuleCall)cTypeJvmTypeCrossReference_1_0_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cCommercialAtKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cModuleAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final CrossReference cModuleModuleCrossReference_1_1_1_0 = (CrossReference)cModuleAssignment_1_1_1.eContents().get(0);
		private final RuleCall cModuleModuleFQNParserRuleCall_1_1_1_0_1 = (RuleCall)cModuleModuleCrossReference_1_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Assignment cAutoInjectAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cAutoInjectAutoInjectKeyword_3_0 = (Keyword)cAutoInjectAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAssignmentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAssignmentAssignmentParserRuleCall_5_0 = (RuleCall)cAssignmentAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Component:
		//  {Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN])? (':' name=FQN)? (autoInject?='auto-inject')?
		//  '{'
		//    assignment+=Assignment*
		//  '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN])? (':' name=FQN)? (autoInject?='auto-inject')?
		//'{'
		//  assignment+=Assignment*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Component}
		public Action getComponentAction_0() { return cComponentAction_0; }
		
		//(type=[types::JvmType|FQN]| '@' module=[Module|FQN])?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//type=[types::JvmType|FQN]
		public Assignment getTypeAssignment_1_0() { return cTypeAssignment_1_0; }
		
		//[types::JvmType|FQN]
		public CrossReference getTypeJvmTypeCrossReference_1_0_0() { return cTypeJvmTypeCrossReference_1_0_0; }
		
		//FQN
		public RuleCall getTypeJvmTypeFQNParserRuleCall_1_0_0_1() { return cTypeJvmTypeFQNParserRuleCall_1_0_0_1; }
		
		//'@' module=[Module|FQN]
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'@'
		public Keyword getCommercialAtKeyword_1_1_0() { return cCommercialAtKeyword_1_1_0; }
		
		//module=[Module|FQN]
		public Assignment getModuleAssignment_1_1_1() { return cModuleAssignment_1_1_1; }
		
		//[Module|FQN]
		public CrossReference getModuleModuleCrossReference_1_1_1_0() { return cModuleModuleCrossReference_1_1_1_0; }
		
		//FQN
		public RuleCall getModuleModuleFQNParserRuleCall_1_1_1_0_1() { return cModuleModuleFQNParserRuleCall_1_1_1_0_1; }
		
		//(':' name=FQN)?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//name=FQN
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_2_1_0() { return cNameFQNParserRuleCall_2_1_0; }
		
		//(autoInject?='auto-inject')?
		public Assignment getAutoInjectAssignment_3() { return cAutoInjectAssignment_3; }
		
		//'auto-inject'
		public Keyword getAutoInjectAutoInjectKeyword_3_0() { return cAutoInjectAutoInjectKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//assignment+=Assignment*
		public Assignment getAssignmentAssignment_5() { return cAssignmentAssignment_5; }
		
		//Assignment
		public RuleCall getAssignmentAssignmentParserRuleCall_5_0() { return cAssignmentAssignmentParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceImportedFQNParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//  'import' importedNamespace=ImportedFQN;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=ImportedFQN
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=ImportedFQN
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//ImportedFQN
		public RuleCall getImportedNamespaceImportedFQNParserRuleCall_1_0() { return cImportedNamespaceImportedFQNParserRuleCall_1_0; }
	}
	public class ImportedFQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.ImportedFQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ImportedFQN:
		//  FQN ('.*')?;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN ('.*')?
		public Group getGroup() { return cGroup; }
		
		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }
		
		//('.*')?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureJvmIdentifiableElementCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1 = (RuleCall)cFeatureJvmIdentifiableElementCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Assignment:
		//  feature=[types::JvmIdentifiableElement|FQN] '=' value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[types::JvmIdentifiableElement|FQN] '=' value=Value
		public Group getGroup() { return cGroup; }
		
		//feature=[types::JvmIdentifiableElement|FQN]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[types::JvmIdentifiableElement|FQN]
		public CrossReference getFeatureJvmIdentifiableElementCrossReference_0_0() { return cFeatureJvmIdentifiableElementCrossReference_0_0; }
		
		//FQN
		public RuleCall getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1() { return cFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBooleanLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cIntegerLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDoubleLiteralParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cNullLiteralParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cReferenceParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Value:
		//  Component|
		//  StringLiteral|
		//  BooleanLiteral|
		//  IntegerLiteral|
		//  DoubleLiteral|
		//  NullLiteral|
		//  Reference;
		@Override public ParserRule getRule() { return rule; }
		
		//Component|
		//StringLiteral|
		//BooleanLiteral|
		//IntegerLiteral|
		//DoubleLiteral|
		//NullLiteral|
		//Reference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Component
		public RuleCall getComponentParserRuleCall_0() { return cComponentParserRuleCall_0; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_1() { return cStringLiteralParserRuleCall_1; }
		
		//BooleanLiteral
		public RuleCall getBooleanLiteralParserRuleCall_2() { return cBooleanLiteralParserRuleCall_2; }
		
		//IntegerLiteral
		public RuleCall getIntegerLiteralParserRuleCall_3() { return cIntegerLiteralParserRuleCall_3; }
		
		//DoubleLiteral
		public RuleCall getDoubleLiteralParserRuleCall_4() { return cDoubleLiteralParserRuleCall_4; }
		
		//NullLiteral
		public RuleCall getNullLiteralParserRuleCall_5() { return cNullLiteralParserRuleCall_5; }
		
		//Reference
		public RuleCall getReferenceParserRuleCall_6() { return cReferenceParserRuleCall_6; }
	}
	public class NullLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.NullLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNullLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNullKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//NullLiteral:
		//  {NullLiteral} 'null';
		@Override public ParserRule getRule() { return rule; }
		
		//{NullLiteral} 'null'
		public Group getGroup() { return cGroup; }
		
		//{NullLiteral}
		public Action getNullLiteralAction_0() { return cNullLiteralAction_0; }
		
		//'null'
		public Keyword getNullKeyword_1() { return cNullKeyword_1; }
	}
	public class DoubleLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.DoubleLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDoubleValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//DoubleLiteral:
		//  value=DoubleValue;
		@Override public ParserRule getRule() { return rule; }
		
		//value=DoubleValue
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//DoubleValue
		public RuleCall getValueDoubleValueParserRuleCall_0() { return cValueDoubleValueParserRuleCall_0; }
	}
	public class DoubleValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.DoubleValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIntValueParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DoubleValue returns ecore::EDouble:
		//  IntValue '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//IntValue '.' INT
		public Group getGroup() { return cGroup; }
		
		//IntValue
		public RuleCall getIntValueParserRuleCall_0() { return cIntValueParserRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class IntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.IntegerLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIntValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntegerLiteral:
		//  value=IntValue;
		@Override public ParserRule getRule() { return rule; }
		
		//value=IntValue
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//IntValue
		public RuleCall getValueIntValueParserRuleCall_0() { return cValueIntValueParserRuleCall_0; }
	}
	public class IntValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.IntValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//IntValue returns ecore::EInt:
		//  ('-'|'+')? INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('-'|'+')? INT
		public Group getGroup() { return cGroup; }
		
		//('-'|'+')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_0_1() { return cPlusSignKeyword_0_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class BooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.BooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cIsTrueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cIsTrueTrueKeyword_1_0_0 = (Keyword)cIsTrueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//BooleanLiteral:
		//  {BooleanLiteral} (isTrue?='true'|'false');
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanLiteral} (isTrue?='true'|'false')
		public Group getGroup() { return cGroup; }
		
		//{BooleanLiteral}
		public Action getBooleanLiteralAction_0() { return cBooleanLiteralAction_0; }
		
		//(isTrue?='true'|'false')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//isTrue?='true'
		public Assignment getIsTrueAssignment_1_0() { return cIsTrueAssignment_1_0; }
		
		//'true'
		public Keyword getIsTrueTrueKeyword_1_0_0() { return cIsTrueTrueKeyword_1_0_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.Reference");
		private final Assignment cReferableAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cReferableReferrableCrossReference_0 = (CrossReference)cReferableAssignment.eContents().get(0);
		private final RuleCall cReferableReferrableFQNParserRuleCall_0_1 = (RuleCall)cReferableReferrableCrossReference_0.eContents().get(1);
		
		//Reference:
		//  referable=[Referrable|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//referable=[Referrable|FQN]
		public Assignment getReferableAssignment() { return cReferableAssignment; }
		
		//[Referrable|FQN]
		public CrossReference getReferableReferrableCrossReference_0() { return cReferableReferrableCrossReference_0; }
		
		//FQN
		public RuleCall getReferableReferrableFQNParserRuleCall_0_1() { return cReferableReferrableFQNParserRuleCall_0_1; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//  ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.StringLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cBeginAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Keyword cBeginApostropheKeyword_0_0_0 = (Keyword)cBeginAssignment_0_0.eContents().get(0);
		private final Assignment cPartsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cPartsPlainStringParserRuleCall_0_1_0 = (RuleCall)cPartsAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Assignment cPartsAssignment_0_2_0 = (Assignment)cGroup_0_2.eContents().get(0);
		private final RuleCall cPartsPropertyReferenceParserRuleCall_0_2_0_0 = (RuleCall)cPartsAssignment_0_2_0.eContents().get(0);
		private final Assignment cPartsAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cPartsPlainStringParserRuleCall_0_2_1_0 = (RuleCall)cPartsAssignment_0_2_1.eContents().get(0);
		private final Assignment cEndAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final Keyword cEndApostropheKeyword_0_3_0 = (Keyword)cEndAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cBeginAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cBeginQuotationMarkKeyword_1_0_0 = (Keyword)cBeginAssignment_1_0.eContents().get(0);
		private final Assignment cPartsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPartsPlainStringParserRuleCall_1_1_0 = (RuleCall)cPartsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Assignment cPartsAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cPartsPropertyReferenceParserRuleCall_1_2_0_0 = (RuleCall)cPartsAssignment_1_2_0.eContents().get(0);
		private final Assignment cPartsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cPartsPlainStringParserRuleCall_1_2_1_0 = (RuleCall)cPartsAssignment_1_2_1.eContents().get(0);
		private final Assignment cEndAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final Keyword cEndQuotationMarkKeyword_1_3_0 = (Keyword)cEndAssignment_1_3.eContents().get(0);
		
		//StringLiteral hidden ():
		//    begin="'"
		//      parts+=PlainString?
		//      (parts+=PropertyReference parts+=PlainString?)*
		//    end="'"
		//  | begin='"'
		//      parts+=PlainString?
		//      (parts+=PropertyReference parts+=PlainString?)*
		//    end='"'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  begin="'"
		//    parts+=PlainString?
		//    (parts+=PropertyReference parts+=PlainString?)*
		//  end="'"
		//| begin='"'
		//    parts+=PlainString?
		//    (parts+=PropertyReference parts+=PlainString?)*
		//  end='"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//begin="'"
		//  parts+=PlainString?
		//  (parts+=PropertyReference parts+=PlainString?)*
		//end="'"
		public Group getGroup_0() { return cGroup_0; }
		
		//begin="'"
		public Assignment getBeginAssignment_0_0() { return cBeginAssignment_0_0; }
		
		//"'"
		public Keyword getBeginApostropheKeyword_0_0_0() { return cBeginApostropheKeyword_0_0_0; }
		
		//parts+=PlainString?
		public Assignment getPartsAssignment_0_1() { return cPartsAssignment_0_1; }
		
		//PlainString
		public RuleCall getPartsPlainStringParserRuleCall_0_1_0() { return cPartsPlainStringParserRuleCall_0_1_0; }
		
		//(parts+=PropertyReference parts+=PlainString?)*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//parts+=PropertyReference
		public Assignment getPartsAssignment_0_2_0() { return cPartsAssignment_0_2_0; }
		
		//PropertyReference
		public RuleCall getPartsPropertyReferenceParserRuleCall_0_2_0_0() { return cPartsPropertyReferenceParserRuleCall_0_2_0_0; }
		
		//parts+=PlainString?
		public Assignment getPartsAssignment_0_2_1() { return cPartsAssignment_0_2_1; }
		
		//PlainString
		public RuleCall getPartsPlainStringParserRuleCall_0_2_1_0() { return cPartsPlainStringParserRuleCall_0_2_1_0; }
		
		//end="'"
		public Assignment getEndAssignment_0_3() { return cEndAssignment_0_3; }
		
		//"'"
		public Keyword getEndApostropheKeyword_0_3_0() { return cEndApostropheKeyword_0_3_0; }
		
		//begin='"'
		//     parts+=PlainString?
		//     (parts+=PropertyReference parts+=PlainString?)*
		//   end='"'
		public Group getGroup_1() { return cGroup_1; }
		
		//begin='"'
		public Assignment getBeginAssignment_1_0() { return cBeginAssignment_1_0; }
		
		//'"'
		public Keyword getBeginQuotationMarkKeyword_1_0_0() { return cBeginQuotationMarkKeyword_1_0_0; }
		
		//parts+=PlainString?
		public Assignment getPartsAssignment_1_1() { return cPartsAssignment_1_1; }
		
		//PlainString
		public RuleCall getPartsPlainStringParserRuleCall_1_1_0() { return cPartsPlainStringParserRuleCall_1_1_0; }
		
		//(parts+=PropertyReference parts+=PlainString?)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//parts+=PropertyReference
		public Assignment getPartsAssignment_1_2_0() { return cPartsAssignment_1_2_0; }
		
		//PropertyReference
		public RuleCall getPartsPropertyReferenceParserRuleCall_1_2_0_0() { return cPartsPropertyReferenceParserRuleCall_1_2_0_0; }
		
		//parts+=PlainString?
		public Assignment getPartsAssignment_1_2_1() { return cPartsAssignment_1_2_1; }
		
		//PlainString
		public RuleCall getPartsPlainStringParserRuleCall_1_2_1_0() { return cPartsPlainStringParserRuleCall_1_2_1_0; }
		
		//end='"'
		public Assignment getEndAssignment_1_3() { return cEndAssignment_1_3; }
		
		//'"'
		public Keyword getEndQuotationMarkKeyword_1_3_0() { return cEndQuotationMarkKeyword_1_3_0; }
	}
	public class PropertyReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.PropertyReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDollarSignLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cPropertyReferenceImplParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PropertyReference hidden():
		//  '${' PropertyReferenceImpl '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'${' PropertyReferenceImpl '}'
		public Group getGroup() { return cGroup; }
		
		//'${'
		public Keyword getDollarSignLeftCurlyBracketKeyword_0() { return cDollarSignLeftCurlyBracketKeyword_0; }
		
		//PropertyReferenceImpl
		public RuleCall getPropertyReferenceImplParserRuleCall_1() { return cPropertyReferenceImplParserRuleCall_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class PropertyReferenceImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.PropertyReferenceImpl");
		private final Assignment cReferableAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cReferableDeclaredPropertyCrossReference_0 = (CrossReference)cReferableAssignment.eContents().get(0);
		private final RuleCall cReferableDeclaredPropertyFQNParserRuleCall_0_1 = (RuleCall)cReferableDeclaredPropertyCrossReference_0.eContents().get(1);
		
		//PropertyReferenceImpl returns PropertyReference hidden(WS, ML_COMMENT, SL_COMMENT):
		//  referable=[DeclaredProperty|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//referable=[DeclaredProperty|FQN]
		public Assignment getReferableAssignment() { return cReferableAssignment; }
		
		//[DeclaredProperty|FQN]
		public CrossReference getReferableDeclaredPropertyCrossReference_0() { return cReferableDeclaredPropertyCrossReference_0; }
		
		//FQN
		public RuleCall getReferableDeclaredPropertyFQNParserRuleCall_0_1() { return cReferableDeclaredPropertyFQNParserRuleCall_0_1; }
	}
	public class PlainStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.PlainString");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueConstantValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PlainString:
		//  value=ConstantValue;
		@Override public ParserRule getRule() { return rule; }
		
		//value=ConstantValue
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//ConstantValue
		public RuleCall getValueConstantValueParserRuleCall_0() { return cValueConstantValueParserRuleCall_0; }
	}
	public class ConstantValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.ConstantValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cANY_OTHERTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cReverseSolidusApostropheKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cReverseSolidusQuotationMarkKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cReverseSolidusDollarSignLeftCurlyBracketKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cReverseSolidusReverseSolidusKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		
		//// To identify other keywords or INT as allowed parts in a string,
		//// we use a customized lexer with predicates.
		//// This allows us to use e.g. single quotes without escape sequences
		//// in double quoted strings and vice versa.
		//ConstantValue:
		//  (WS|
		//  ANY_OTHER|
		//  ID|
		//  "\\'" |
		//  '\\"' |
		//  "\\${" |
		//  "\\\\")+;
		@Override public ParserRule getRule() { return rule; }
		
		//(WS|
		//ANY_OTHER|
		//ID|
		//"\\'" |
		//'\\"' |
		//"\\${" |
		//"\\\\")+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_0() { return cWSTerminalRuleCall_0; }
		
		//ANY_OTHER
		public RuleCall getANY_OTHERTerminalRuleCall_1() { return cANY_OTHERTerminalRuleCall_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//"\\'"
		public Keyword getReverseSolidusApostropheKeyword_3() { return cReverseSolidusApostropheKeyword_3; }
		
		//'\\"'
		public Keyword getReverseSolidusQuotationMarkKeyword_4() { return cReverseSolidusQuotationMarkKeyword_4; }
		
		//"\\${"
		public Keyword getReverseSolidusDollarSignLeftCurlyBracketKeyword_5() { return cReverseSolidusDollarSignLeftCurlyBracketKeyword_5; }
		
		//"\\\\"
		public Keyword getReverseSolidusReverseSolidusKeyword_6() { return cReverseSolidusReverseSolidusKeyword_6; }
	}
	
	
	private final ModuleElements pModule;
	private final DeclaredPropertyElements pDeclaredProperty;
	private final RootComponentElements pRootComponent;
	private final ComponentElements pComponent;
	private final ImportElements pImport;
	private final ImportedFQNElements pImportedFQN;
	private final AssignmentElements pAssignment;
	private final ValueElements pValue;
	private final NullLiteralElements pNullLiteral;
	private final DoubleLiteralElements pDoubleLiteral;
	private final DoubleValueElements pDoubleValue;
	private final IntegerLiteralElements pIntegerLiteral;
	private final IntValueElements pIntValue;
	private final BooleanLiteralElements pBooleanLiteral;
	private final ReferenceElements pReference;
	private final FQNElements pFQN;
	private final StringLiteralElements pStringLiteral;
	private final PropertyReferenceElements pPropertyReference;
	private final PropertyReferenceImplElements pPropertyReferenceImpl;
	private final PlainStringElements pPlainString;
	private final ConstantValueElements pConstantValue;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public Mwe2GrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModule = new ModuleElements();
		this.pDeclaredProperty = new DeclaredPropertyElements();
		this.pRootComponent = new RootComponentElements();
		this.pComponent = new ComponentElements();
		this.pImport = new ImportElements();
		this.pImportedFQN = new ImportedFQNElements();
		this.pAssignment = new AssignmentElements();
		this.pValue = new ValueElements();
		this.pNullLiteral = new NullLiteralElements();
		this.pDoubleLiteral = new DoubleLiteralElements();
		this.pDoubleValue = new DoubleValueElements();
		this.pIntegerLiteral = new IntegerLiteralElements();
		this.pIntValue = new IntValueElements();
		this.pBooleanLiteral = new BooleanLiteralElements();
		this.pReference = new ReferenceElements();
		this.pFQN = new FQNElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pPropertyReference = new PropertyReferenceElements();
		this.pPropertyReferenceImpl = new PropertyReferenceImplElements();
		this.pPlainString = new PlainStringElements();
		this.pConstantValue = new ConstantValueElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.INT");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.emf.mwe2.language.Mwe2.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.emf.mwe2.language.Mwe2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Module:
	//  {Module}
	//  'module' canonicalName=FQN
	//  imports+=Import*
	//  (declaredProperties+=DeclaredProperty)*
	//  root=RootComponent;
	public ModuleElements getModuleAccess() {
		return pModule;
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}
	
	//DeclaredProperty:
	//  'var' (type=[types::JvmType|FQN])? name=FQN ('=' default=Value)?;
	public DeclaredPropertyElements getDeclaredPropertyAccess() {
		return pDeclaredProperty;
	}
	
	public ParserRule getDeclaredPropertyRule() {
		return getDeclaredPropertyAccess().getRule();
	}
	
	//RootComponent returns Component:
	//  {Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN]) (':' name=FQN)? (autoInject?='auto-inject')?
	//  '{'
	//    assignment+=Assignment*
	//  '}';
	public RootComponentElements getRootComponentAccess() {
		return pRootComponent;
	}
	
	public ParserRule getRootComponentRule() {
		return getRootComponentAccess().getRule();
	}
	
	//Component:
	//  {Component} (type=[types::JvmType|FQN]| '@' module=[Module|FQN])? (':' name=FQN)? (autoInject?='auto-inject')?
	//  '{'
	//    assignment+=Assignment*
	//  '}';
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Import:
	//  'import' importedNamespace=ImportedFQN;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//ImportedFQN:
	//  FQN ('.*')?;
	public ImportedFQNElements getImportedFQNAccess() {
		return pImportedFQN;
	}
	
	public ParserRule getImportedFQNRule() {
		return getImportedFQNAccess().getRule();
	}
	
	//Assignment:
	//  feature=[types::JvmIdentifiableElement|FQN] '=' value=Value;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//Value:
	//  Component|
	//  StringLiteral|
	//  BooleanLiteral|
	//  IntegerLiteral|
	//  DoubleLiteral|
	//  NullLiteral|
	//  Reference;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//NullLiteral:
	//  {NullLiteral} 'null';
	public NullLiteralElements getNullLiteralAccess() {
		return pNullLiteral;
	}
	
	public ParserRule getNullLiteralRule() {
		return getNullLiteralAccess().getRule();
	}
	
	//DoubleLiteral:
	//  value=DoubleValue;
	public DoubleLiteralElements getDoubleLiteralAccess() {
		return pDoubleLiteral;
	}
	
	public ParserRule getDoubleLiteralRule() {
		return getDoubleLiteralAccess().getRule();
	}
	
	//DoubleValue returns ecore::EDouble:
	//  IntValue '.' INT;
	public DoubleValueElements getDoubleValueAccess() {
		return pDoubleValue;
	}
	
	public ParserRule getDoubleValueRule() {
		return getDoubleValueAccess().getRule();
	}
	
	//IntegerLiteral:
	//  value=IntValue;
	public IntegerLiteralElements getIntegerLiteralAccess() {
		return pIntegerLiteral;
	}
	
	public ParserRule getIntegerLiteralRule() {
		return getIntegerLiteralAccess().getRule();
	}
	
	//IntValue returns ecore::EInt:
	//  ('-'|'+')? INT
	//;
	public IntValueElements getIntValueAccess() {
		return pIntValue;
	}
	
	public ParserRule getIntValueRule() {
		return getIntValueAccess().getRule();
	}
	
	//BooleanLiteral:
	//  {BooleanLiteral} (isTrue?='true'|'false');
	public BooleanLiteralElements getBooleanLiteralAccess() {
		return pBooleanLiteral;
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//Reference:
	//  referable=[Referrable|FQN];
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//FQN:
	//  ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//StringLiteral hidden ():
	//    begin="'"
	//      parts+=PlainString?
	//      (parts+=PropertyReference parts+=PlainString?)*
	//    end="'"
	//  | begin='"'
	//      parts+=PlainString?
	//      (parts+=PropertyReference parts+=PlainString?)*
	//    end='"'
	//;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//PropertyReference hidden():
	//  '${' PropertyReferenceImpl '}';
	public PropertyReferenceElements getPropertyReferenceAccess() {
		return pPropertyReference;
	}
	
	public ParserRule getPropertyReferenceRule() {
		return getPropertyReferenceAccess().getRule();
	}
	
	//PropertyReferenceImpl returns PropertyReference hidden(WS, ML_COMMENT, SL_COMMENT):
	//  referable=[DeclaredProperty|FQN];
	public PropertyReferenceImplElements getPropertyReferenceImplAccess() {
		return pPropertyReferenceImpl;
	}
	
	public ParserRule getPropertyReferenceImplRule() {
		return getPropertyReferenceImplAccess().getRule();
	}
	
	//PlainString:
	//  value=ConstantValue;
	public PlainStringElements getPlainStringAccess() {
		return pPlainString;
	}
	
	public ParserRule getPlainStringRule() {
		return getPlainStringAccess().getRule();
	}
	
	//// To identify other keywords or INT as allowed parts in a string,
	//// we use a customized lexer with predicates.
	//// This allows us to use e.g. single quotes without escape sequences
	//// in double quoted strings and vice versa.
	//ConstantValue:
	//  (WS|
	//  ANY_OTHER|
	//  ID|
	//  "\\'" |
	//  '\\"' |
	//  "\\${" |
	//  "\\\\")+;
	public ConstantValueElements getConstantValueAccess() {
		return pConstantValue;
	}
	
	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}
	
	//terminal ID:
	//  '^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//  ('0'..'9')+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal ML_COMMENT:
	//  '/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//  '//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//  (' ' | '\t' | '\r' | '\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
