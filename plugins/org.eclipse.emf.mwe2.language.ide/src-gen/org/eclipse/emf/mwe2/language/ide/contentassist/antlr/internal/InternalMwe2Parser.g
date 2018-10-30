/*******************************************************************************
 * Copyright (c) 2010, 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
parser grammar InternalMwe2Parser;

options {
	tokenVocab=InternalMwe2Lexer;
	superClass=AbstractInternalContentAssistParser;
}

@header {
package org.eclipse.emf.mwe2.language.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;

}
@members {
	private Mwe2GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("QuotationMark", "'\"'");
		tokenNameToValue.put("Apostrophe", "'\''");
		tokenNameToValue.put("PlusSign", "'+'");
		tokenNameToValue.put("HyphenMinus", "'-'");
		tokenNameToValue.put("FullStop", "'.'");
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("EqualsSign", "'='");
		tokenNameToValue.put("CommercialAt", "'@'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("DollarSignLeftCurlyBracket", "'\\u0024{'");
		tokenNameToValue.put("FullStopAsterisk", "'.*'");
		tokenNameToValue.put("ReverseSolidusQuotationMark", "'\\\"'");
		tokenNameToValue.put("ReverseSolidusApostrophe", "'\\\''");
		tokenNameToValue.put("ReverseSolidusReverseSolidus", "'\\\\'");
		tokenNameToValue.put("ReverseSolidusDollarSignLeftCurlyBracket", "'\\\\u0024{'");
		tokenNameToValue.put("Var", "'var'");
		tokenNameToValue.put("Null", "'null'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Import", "'import'");
		tokenNameToValue.put("Module", "'module'");
		tokenNameToValue.put("AutoInject", "'auto-inject'");
	}

	public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleModule
entryRuleModule
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModuleAccess().getGroup()); }
		(rule__Module__Group__0)
		{ after(grammarAccess.getModuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaredProperty
entryRuleDeclaredProperty
:
{ before(grammarAccess.getDeclaredPropertyRule()); }
	 ruleDeclaredProperty
{ after(grammarAccess.getDeclaredPropertyRule()); } 
	 EOF 
;

// Rule DeclaredProperty
ruleDeclaredProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclaredPropertyAccess().getGroup()); }
		(rule__DeclaredProperty__Group__0)
		{ after(grammarAccess.getDeclaredPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRootComponent
entryRuleRootComponent
:
{ before(grammarAccess.getRootComponentRule()); }
	 ruleRootComponent
{ after(grammarAccess.getRootComponentRule()); } 
	 EOF 
;

// Rule RootComponent
ruleRootComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRootComponentAccess().getGroup()); }
		(rule__RootComponent__Group__0)
		{ after(grammarAccess.getRootComponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponent
entryRuleComponent
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentAccess().getGroup()); }
		(rule__Component__Group__0)
		{ after(grammarAccess.getComponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImportedFQN
entryRuleImportedFQN
:
{ before(grammarAccess.getImportedFQNRule()); }
	 ruleImportedFQN
{ after(grammarAccess.getImportedFQNRule()); } 
	 EOF 
;

// Rule ImportedFQN
ruleImportedFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportedFQNAccess().getGroup()); }
		(rule__ImportedFQN__Group__0)
		{ after(grammarAccess.getImportedFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignment
entryRuleAssignment
:
{ before(grammarAccess.getAssignmentRule()); }
	 ruleAssignment
{ after(grammarAccess.getAssignmentRule()); } 
	 EOF 
;

// Rule Assignment
ruleAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentAccess().getGroup()); }
		(rule__Assignment__Group__0)
		{ after(grammarAccess.getAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNullLiteral
entryRuleNullLiteral
:
{ before(grammarAccess.getNullLiteralRule()); }
	 ruleNullLiteral
{ after(grammarAccess.getNullLiteralRule()); } 
	 EOF 
;

// Rule NullLiteral
ruleNullLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNullLiteralAccess().getGroup()); }
		(rule__NullLiteral__Group__0)
		{ after(grammarAccess.getNullLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral
:
{ before(grammarAccess.getDoubleLiteralRule()); }
	 ruleDoubleLiteral
{ after(grammarAccess.getDoubleLiteralRule()); } 
	 EOF 
;

// Rule DoubleLiteral
ruleDoubleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); }
		(rule__DoubleLiteral__ValueAssignment)
		{ after(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDoubleValue
entryRuleDoubleValue
:
{ before(grammarAccess.getDoubleValueRule()); }
	 ruleDoubleValue
{ after(grammarAccess.getDoubleValueRule()); } 
	 EOF 
;

// Rule DoubleValue
ruleDoubleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDoubleValueAccess().getGroup()); }
		(rule__DoubleValue__Group__0)
		{ after(grammarAccess.getDoubleValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); }
		(rule__IntegerLiteral__ValueAssignment)
		{ after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntValue
entryRuleIntValue
:
{ before(grammarAccess.getIntValueRule()); }
	 ruleIntValue
{ after(grammarAccess.getIntValueRule()); } 
	 EOF 
;

// Rule IntValue
ruleIntValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntValueAccess().getGroup()); }
		(rule__IntValue__Group__0)
		{ after(grammarAccess.getIntValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getGroup()); }
		(rule__BooleanLiteral__Group__0)
		{ after(grammarAccess.getBooleanLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReference
entryRuleReference
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceAccess().getReferableAssignment()); }
		(rule__Reference__ReferableAssignment)
		{ after(grammarAccess.getReferenceAccess().getReferableAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFQN
entryRuleFQN
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNAccess().getGroup()); }
		(rule__FQN__Group__0)
		{ after(grammarAccess.getFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule StringLiteral
ruleStringLiteral 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getAlternatives()); }
		(rule__StringLiteral__Alternatives)
		{ after(grammarAccess.getStringLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRulePropertyReference
entryRulePropertyReference
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getPropertyReferenceRule()); }
	 rulePropertyReference
{ after(grammarAccess.getPropertyReferenceRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule PropertyReference
rulePropertyReference 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getGroup()); }
		(rule__PropertyReference__Group__0)
		{ after(grammarAccess.getPropertyReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRulePropertyReferenceImpl
entryRulePropertyReferenceImpl
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
:
{ before(grammarAccess.getPropertyReferenceImplRule()); }
	 rulePropertyReferenceImpl
{ after(grammarAccess.getPropertyReferenceImplRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule PropertyReferenceImpl
rulePropertyReferenceImpl 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); }
		(rule__PropertyReferenceImpl__ReferableAssignment)
		{ after(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRulePlainString
entryRulePlainString
:
{ before(grammarAccess.getPlainStringRule()); }
	 rulePlainString
{ after(grammarAccess.getPlainStringRule()); } 
	 EOF 
;

// Rule PlainString
rulePlainString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlainStringAccess().getValueAssignment()); }
		(rule__PlainString__ValueAssignment)
		{ after(grammarAccess.getPlainStringAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstantValue
entryRuleConstantValue
:
{ before(grammarAccess.getConstantValueRule()); }
	 ruleConstantValue
{ after(grammarAccess.getConstantValueRule()); } 
	 EOF 
;

// Rule ConstantValue
ruleConstantValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getConstantValueAccess().getAlternatives()); }
			(rule__ConstantValue__Alternatives)
			{ after(grammarAccess.getConstantValueAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getConstantValueAccess().getAlternatives()); }
			(rule__ConstantValue__Alternatives)*
			{ after(grammarAccess.getConstantValueAccess().getAlternatives()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); }
		(rule__RootComponent__TypeAssignment_1_0)
		{ after(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getRootComponentAccess().getGroup_1_1()); }
		(rule__RootComponent__Group_1_1__0)
		{ after(grammarAccess.getRootComponentAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); }
		(rule__Component__TypeAssignment_1_0)
		{ after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentAccess().getGroup_1_1()); }
		(rule__Component__Group_1_1__0)
		{ after(grammarAccess.getComponentAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); }
		ruleComponent
		{ after(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); }
		ruleStringLiteral
		{ after(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4()); }
		ruleDoubleLiteral
		{ after(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5()); }
		ruleNullLiteral
		{ after(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getReferenceParserRuleCall_6()); }
		ruleReference
		{ after(grammarAccess.getValueAccess().getReferenceParserRuleCall_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntValue__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); }
		HyphenMinus
		{ after(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1()); }
		PlusSign
		{ after(grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); }
		(rule__BooleanLiteral__IsTrueAssignment_1_0)
		{ after(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
		False
		{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getGroup_0()); }
		(rule__StringLiteral__Group_0__0)
		{ after(grammarAccess.getStringLiteralAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getStringLiteralAccess().getGroup_1()); }
		(rule__StringLiteral__Group_1__0)
		{ after(grammarAccess.getStringLiteralAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstantValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); }
		RULE_WS
		{ after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); }
		RULE_ANY_OTHER
		{ after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); }
		RULE_ID
		{ after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); }
		ReverseSolidusApostrophe
		{ after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); }
		ReverseSolidusQuotationMark
		{ after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); }
		ReverseSolidusDollarSignLeftCurlyBracket
		{ after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); }
		ReverseSolidusReverseSolidus
		{ after(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getModuleAction_0()); }
	()
	{ after(grammarAccess.getModuleAccess().getModuleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getModuleKeyword_1()); }
	Module
	{ after(grammarAccess.getModuleAccess().getModuleKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); }
	(rule__Module__CanonicalNameAssignment_2)
	{ after(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getImportsAssignment_3()); }
	(rule__Module__ImportsAssignment_3)*
	{ after(grammarAccess.getModuleAccess().getImportsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__4__Impl
	rule__Module__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); }
	(rule__Module__DeclaredPropertiesAssignment_4)*
	{ after(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Module__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleAccess().getRootAssignment_5()); }
	(rule__Module__RootAssignment_5)
	{ after(grammarAccess.getModuleAccess().getRootAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclaredProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group__0__Impl
	rule__DeclaredProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); }
	Var
	{ after(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group__1__Impl
	rule__DeclaredProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); }
	(rule__DeclaredProperty__TypeAssignment_1)?
	{ after(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group__2__Impl
	rule__DeclaredProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); }
	(rule__DeclaredProperty__NameAssignment_2)
	{ after(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); }
	(rule__DeclaredProperty__Group_3__0)?
	{ after(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclaredProperty__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group_3__0__Impl
	rule__DeclaredProperty__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); }
	EqualsSign
	{ after(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredProperty__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); }
	(rule__DeclaredProperty__DefaultAssignment_3_1)
	{ after(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RootComponent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__0__Impl
	rule__RootComponent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getComponentAction_0()); }
	()
	{ after(grammarAccess.getRootComponentAccess().getComponentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__1__Impl
	rule__RootComponent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getAlternatives_1()); }
	(rule__RootComponent__Alternatives_1)
	{ after(grammarAccess.getRootComponentAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__2__Impl
	rule__RootComponent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getGroup_2()); }
	(rule__RootComponent__Group_2__0)?
	{ after(grammarAccess.getRootComponentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__3__Impl
	rule__RootComponent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); }
	(rule__RootComponent__AutoInjectAssignment_3)?
	{ after(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__4__Impl
	rule__RootComponent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); }
	LeftCurlyBracket
	{ after(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__5__Impl
	rule__RootComponent__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); }
	(rule__RootComponent__AssignmentAssignment_5)*
	{ after(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); }
	RightCurlyBracket
	{ after(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RootComponent__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group_1_1__0__Impl
	rule__RootComponent__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); }
	CommercialAt
	{ after(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); }
	(rule__RootComponent__ModuleAssignment_1_1_1)
	{ after(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RootComponent__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group_2__0__Impl
	rule__RootComponent__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); }
	Colon
	{ after(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootComponent__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); }
	(rule__RootComponent__NameAssignment_2_1)
	{ after(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getComponentAction_0()); }
	()
	{ after(grammarAccess.getComponentAccess().getComponentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__1__Impl
	rule__Component__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getAlternatives_1()); }
	(rule__Component__Alternatives_1)?
	{ after(grammarAccess.getComponentAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__2__Impl
	rule__Component__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getGroup_2()); }
	(rule__Component__Group_2__0)?
	{ after(grammarAccess.getComponentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__3__Impl
	rule__Component__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); }
	(rule__Component__AutoInjectAssignment_3)?
	{ after(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__4__Impl
	rule__Component__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); }
	LeftCurlyBracket
	{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__5__Impl
	rule__Component__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); }
	(rule__Component__AssignmentAssignment_5)*
	{ after(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); }
	RightCurlyBracket
	{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group_1_1__0__Impl
	rule__Component__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); }
	CommercialAt
	{ after(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); }
	(rule__Component__ModuleAssignment_1_1_1)
	{ after(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group_2__0__Impl
	rule__Component__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getColonKeyword_2_0()); }
	Colon
	{ after(grammarAccess.getComponentAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); }
	(rule__Component__NameAssignment_2_1)
	{ after(grammarAccess.getComponentAccess().getNameAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	Import
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImportedFQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportedFQN__Group__0__Impl
	rule__ImportedFQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportedFQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); }
	ruleFQN
	{ after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportedFQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportedFQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportedFQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); }
	(FullStopAsterisk)?
	{ after(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Assignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__0__Impl
	rule__Assignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); }
	(rule__Assignment__FeatureAssignment_0)
	{ after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__1__Impl
	rule__Assignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); }
	EqualsSign
	{ after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); }
	(rule__Assignment__ValueAssignment_2)
	{ after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NullLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NullLiteral__Group__0__Impl
	rule__NullLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NullLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); }
	()
	{ after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NullLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NullLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NullLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); }
	Null
	{ after(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DoubleValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DoubleValue__Group__0__Impl
	rule__DoubleValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0()); }
	ruleIntValue
	{ after(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DoubleValue__Group__1__Impl
	rule__DoubleValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleValueAccess().getFullStopKeyword_1()); }
	FullStop
	{ after(grammarAccess.getDoubleValueAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DoubleValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntValue__Group__0__Impl
	rule__IntValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntValueAccess().getAlternatives_0()); }
	(rule__IntValue__Alternatives_0)?
	{ after(grammarAccess.getIntValueAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__0__Impl
	rule__BooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
	()
	{ after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
	(rule__BooleanLiteral__Alternatives_1)
	{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getGroup_1()); }
	(rule__FQN__Group_1__0)*
	{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
	FullStop
	{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringLiteral__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0__0__Impl
	rule__StringLiteral__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); }
	(rule__StringLiteral__BeginAssignment_0_0)
	{ after(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0__1__Impl
	rule__StringLiteral__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); }
	(rule__StringLiteral__PartsAssignment_0_1)?
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0__2__Impl
	rule__StringLiteral__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); }
	(rule__StringLiteral__Group_0_2__0)*
	{ after(grammarAccess.getStringLiteralAccess().getGroup_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); }
	(rule__StringLiteral__EndAssignment_0_3)
	{ after(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringLiteral__Group_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0_2__0__Impl
	rule__StringLiteral__Group_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); }
	(rule__StringLiteral__PartsAssignment_0_2_0)
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); }
	(rule__StringLiteral__PartsAssignment_0_2_1)?
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringLiteral__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1__0__Impl
	rule__StringLiteral__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); }
	(rule__StringLiteral__BeginAssignment_1_0)
	{ after(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1__1__Impl
	rule__StringLiteral__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); }
	(rule__StringLiteral__PartsAssignment_1_1)?
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1__2__Impl
	rule__StringLiteral__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); }
	(rule__StringLiteral__Group_1_2__0)*
	{ after(grammarAccess.getStringLiteralAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); }
	(rule__StringLiteral__EndAssignment_1_3)
	{ after(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringLiteral__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1_2__0__Impl
	rule__StringLiteral__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); }
	(rule__StringLiteral__PartsAssignment_1_2_0)
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringLiteral__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); }
	(rule__StringLiteral__PartsAssignment_1_2_1)?
	{ after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__0__Impl
	rule__PropertyReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); }
	DollarSignLeftCurlyBracket
	{ after(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__1__Impl
	rule__PropertyReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); }
	rulePropertyReferenceImpl
	{ after(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); }
	RightCurlyBracket
	{ after(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Module__CanonicalNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); }
		ruleFQN
		{ after(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ImportsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); }
		ruleImport
		{ after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__DeclaredPropertiesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); }
		ruleDeclaredProperty
		{ after(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__RootAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); }
		ruleRootComponent
		{ after(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); }
		ruleFQN
		{ after(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredProperty__DefaultAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); }
		ruleValue
		{ after(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__TypeAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); }
		(
			{ before(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); }
		)
		{ after(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__ModuleAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); }
		(
			{ before(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__NameAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); }
		ruleFQN
		{ after(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__AutoInjectAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
		(
			{ before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
			AutoInject
			{ after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
		)
		{ after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootComponent__AssignmentAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); }
		ruleAssignment
		{ after(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__TypeAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); }
		(
			{ before(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); }
		)
		{ after(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__ModuleAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); }
		(
			{ before(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__NameAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); }
		ruleFQN
		{ after(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__AutoInjectAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
		(
			{ before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
			AutoInject
			{ after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
		)
		{ after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__AssignmentAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); }
		ruleAssignment
		{ after(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); }
		ruleImportedFQN
		{ after(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__FeatureAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); }
		ruleValue
		{ after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleLiteral__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0()); }
		ruleDoubleValue
		{ after(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0()); }
		ruleIntValue
		{ after(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__IsTrueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); }
			True
			{ after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__ReferableAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); }
		(
			{ before(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); }
			ruleFQN
			{ after(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__BeginAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); }
		(
			{ before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); }
			Apostrophe
			{ after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); }
		)
		{ after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); }
		rulePlainString
		{ after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_0_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); }
		rulePropertyReference
		{ after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); }
		rulePlainString
		{ after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__EndAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); }
		(
			{ before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); }
			Apostrophe
			{ after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); }
		)
		{ after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__BeginAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); }
			QuotationMark
			{ after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); }
		rulePlainString
		{ after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); }
		rulePropertyReference
		{ after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__PartsAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); }
		rulePlainString
		{ after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__EndAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); }
		(
			{ before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); }
			QuotationMark
			{ after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); }
		)
		{ after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReferenceImpl__ReferableAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); }
			ruleFQN
			{ after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainString__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); }
		ruleConstantValue
		{ after(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
