/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
parser grammar InternalMwe2Parser;

options {
	tokenVocab=InternalMwe2Lexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package org.eclipse.emf.mwe2.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;

}

@members {

 	private Mwe2GrammarAccess grammarAccess;

    public InternalMwe2Parser(TokenStream input, Mwe2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Module";
   	}

   	@Override
   	protected Mwe2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	iv_ruleModule=ruleModule
	{ $current=$iv_ruleModule.current; }
	EOF;

// Rule Module
ruleModule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModuleAccess().getModuleAction_0(),
					$current);
			}
		)
		otherlv_1=Module
		{
			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0());
				}
				lv_canonicalName_2_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleRule());
					}
					set(
						$current,
						"canonicalName",
						lv_canonicalName_2_0,
						"org.eclipse.emf.mwe2.language.Mwe2.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0());
				}
				lv_imports_3_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleRule());
					}
					add(
						$current,
						"imports",
						lv_imports_3_0,
						"org.eclipse.emf.mwe2.language.Mwe2.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0());
				}
				lv_declaredProperties_4_0=ruleDeclaredProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleRule());
					}
					add(
						$current,
						"declaredProperties",
						lv_declaredProperties_4_0,
						"org.eclipse.emf.mwe2.language.Mwe2.DeclaredProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0());
				}
				lv_root_5_0=ruleRootComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleRule());
					}
					set(
						$current,
						"root",
						lv_root_5_0,
						"org.eclipse.emf.mwe2.language.Mwe2.RootComponent");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDeclaredProperty
entryRuleDeclaredProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclaredPropertyRule()); }
	iv_ruleDeclaredProperty=ruleDeclaredProperty
	{ $current=$iv_ruleDeclaredProperty.current; }
	EOF;

// Rule DeclaredProperty
ruleDeclaredProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Var
		{
			newLeafNode(otherlv_0, grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclaredPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0());
				}
				lv_name_2_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.emf.mwe2.language.Mwe2.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=EqualsSign
			{
				newLeafNode(otherlv_3, grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0());
					}
					lv_default_4_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
						}
						set(
							$current,
							"default",
							lv_default_4_0,
							"org.eclipse.emf.mwe2.language.Mwe2.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRootComponent
entryRuleRootComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootComponentRule()); }
	iv_ruleRootComponent=ruleRootComponent
	{ $current=$iv_ruleRootComponent.current; }
	EOF;

// Rule RootComponent
ruleRootComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRootComponentAccess().getComponentAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRootComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2=CommercialAt
				{
					newLeafNode(otherlv_2, grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRootComponentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0());
						}
						ruleFQN
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		(
			otherlv_4=Colon
			{
				newLeafNode(otherlv_4, grammarAccess.getRootComponentAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0());
					}
					lv_name_5_0=ruleFQN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootComponentRule());
						}
						set(
							$current,
							"name",
							lv_name_5_0,
							"org.eclipse.emf.mwe2.language.Mwe2.FQN");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				lv_autoInject_6_0=AutoInject
				{
					newLeafNode(lv_autoInject_6_0, grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootComponentRule());
					}
					setWithLastConsumed($current, "autoInject", lv_autoInject_6_0 != null, "auto-inject");
				}
			)
		)?
		otherlv_7=LeftCurlyBracket
		{
			newLeafNode(otherlv_7, grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0());
				}
				lv_assignment_8_0=ruleAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootComponentRule());
					}
					add(
						$current,
						"assignment",
						lv_assignment_8_0,
						"org.eclipse.emf.mwe2.language.Mwe2.Assignment");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9=RightCurlyBracket
		{
			newLeafNode(otherlv_9, grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getComponentAccess().getComponentAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2=CommercialAt
				{
					newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComponentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0());
						}
						ruleFQN
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
		(
			otherlv_4=Colon
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0());
					}
					lv_name_5_0=ruleFQN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						set(
							$current,
							"name",
							lv_name_5_0,
							"org.eclipse.emf.mwe2.language.Mwe2.FQN");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				lv_autoInject_6_0=AutoInject
				{
					newLeafNode(lv_autoInject_6_0, grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
					setWithLastConsumed($current, "autoInject", lv_autoInject_6_0 != null, "auto-inject");
				}
			)
		)?
		otherlv_7=LeftCurlyBracket
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0());
				}
				lv_assignment_8_0=ruleAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"assignment",
						lv_assignment_8_0,
						"org.eclipse.emf.mwe2.language.Mwe2.Assignment");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9=RightCurlyBracket
		{
			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Import
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleImportedFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.eclipse.emf.mwe2.language.Mwe2.ImportedFQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImportedFQN
entryRuleImportedFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getImportedFQNRule()); }
	iv_ruleImportedFQN=ruleImportedFQN
	{ $current=$iv_ruleImportedFQN.current.getText(); }
	EOF;

// Rule ImportedFQN
ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0());
		}
		this_FQN_0=ruleFQN
		{
			$current.merge(this_FQN_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw=FullStopAsterisk
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=EqualsSign
		{
			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.emf.mwe2.language.Mwe2.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0());
		}
		this_Component_0=ruleComponent
		{
			$current = $this_Component_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1());
		}
		this_StringLiteral_1=ruleStringLiteral
		{
			$current = $this_StringLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2());
		}
		this_BooleanLiteral_2=ruleBooleanLiteral
		{
			$current = $this_BooleanLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3());
		}
		this_IntegerLiteral_3=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4());
		}
		this_DoubleLiteral_4=ruleDoubleLiteral
		{
			$current = $this_DoubleLiteral_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5());
		}
		this_NullLiteral_5=ruleNullLiteral
		{
			$current = $this_NullLiteral_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_6());
		}
		this_Reference_6=ruleReference
		{
			$current = $this_Reference_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNullLiteral
entryRuleNullLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullLiteralRule()); }
	iv_ruleNullLiteral=ruleNullLiteral
	{ $current=$iv_ruleNullLiteral.current; }
	EOF;

// Rule NullLiteral
ruleNullLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
					$current);
			}
		)
		otherlv_1=Null
		{
			newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
		}
	)
;

// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoubleLiteralRule()); }
	iv_ruleDoubleLiteral=ruleDoubleLiteral
	{ $current=$iv_ruleDoubleLiteral.current; }
	EOF;

// Rule DoubleLiteral
ruleDoubleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0());
			}
			lv_value_0_0=ruleDoubleValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.emf.mwe2.language.Mwe2.DoubleValue");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleDoubleValue
entryRuleDoubleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDoubleValueRule()); }
	iv_ruleDoubleValue=ruleDoubleValue
	{ $current=$iv_ruleDoubleValue.current.getText(); }
	EOF;

// Rule DoubleValue
ruleDoubleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0());
		}
		this_IntValue_0=ruleIntValue
		{
			$current.merge(this_IntValue_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=FullStop
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0());
			}
			lv_value_0_0=ruleIntValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.emf.mwe2.language.Mwe2.IntValue");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current.getText(); }
	EOF;

// Rule IntValue
ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw=HyphenMinus
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0());
			}
			    |
			kw=PlusSign
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1());
			}
		)?
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	iv_ruleBooleanLiteral=ruleBooleanLiteral
	{ $current=$iv_ruleBooleanLiteral.current; }
	EOF;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_isTrue_1_0=True
					{
						newLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBooleanLiteralRule());
						}
						setWithLastConsumed($current, "isTrue", lv_isTrue_1_0 != null, "true");
					}
				)
			)
			    |
			otherlv_2=False
			{
				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getReferenceRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0());
			}
			ruleFQN
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw=FullStop
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	iv_ruleStringLiteral=ruleStringLiteral
	{ $current=$iv_ruleStringLiteral.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_begin_0_0=Apostrophe
					{
						newLeafNode(lv_begin_0_0, grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringLiteralRule());
						}
						setWithLastConsumed($current, "begin", lv_begin_0_0, "\'");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0());
					}
					lv_parts_1_0=rulePlainString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
						}
						add(
							$current,
							"parts",
							lv_parts_1_0,
							"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0());
						}
						lv_parts_2_0=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
							}
							add(
								$current,
								"parts",
								lv_parts_2_0,
								"org.eclipse.emf.mwe2.language.Mwe2.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0());
						}
						lv_parts_3_0=rulePlainString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
							}
							add(
								$current,
								"parts",
								lv_parts_3_0,
								"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)*
			(
				(
					lv_end_4_0=Apostrophe
					{
						newLeafNode(lv_end_4_0, grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringLiteralRule());
						}
						setWithLastConsumed($current, "end", lv_end_4_0, "\'");
					}
				)
			)
		)
		    |
		(
			(
				(
					lv_begin_5_0=QuotationMark
					{
						newLeafNode(lv_begin_5_0, grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringLiteralRule());
						}
						setWithLastConsumed($current, "begin", lv_begin_5_0, "\"");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0());
					}
					lv_parts_6_0=rulePlainString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
						}
						add(
							$current,
							"parts",
							lv_parts_6_0,
							"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0());
						}
						lv_parts_7_0=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
							}
							add(
								$current,
								"parts",
								lv_parts_7_0,
								"org.eclipse.emf.mwe2.language.Mwe2.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0());
						}
						lv_parts_8_0=rulePlainString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStringLiteralRule());
							}
							add(
								$current,
								"parts",
								lv_parts_8_0,
								"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)*
			(
				(
					lv_end_9_0=QuotationMark
					{
						newLeafNode(lv_end_9_0, grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringLiteralRule());
						}
						setWithLastConsumed($current, "end", lv_end_9_0, "\"");
					}
				)
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRulePropertyReference
entryRulePropertyReference returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getPropertyReferenceRule()); }
	iv_rulePropertyReference=rulePropertyReference
	{ $current=$iv_rulePropertyReference.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule PropertyReference
rulePropertyReference returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=DollarSignLeftCurlyBracket
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1());
		}
		this_PropertyReferenceImpl_1=rulePropertyReferenceImpl
		{
			$current = $this_PropertyReferenceImpl_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=RightCurlyBracket
		{
			newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRulePropertyReferenceImpl
entryRulePropertyReferenceImpl returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}:
	{ newCompositeNode(grammarAccess.getPropertyReferenceImplRule()); }
	iv_rulePropertyReferenceImpl=rulePropertyReferenceImpl
	{ $current=$iv_rulePropertyReferenceImpl.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule PropertyReferenceImpl
rulePropertyReferenceImpl returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyReferenceImplRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0());
			}
			ruleFQN
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRulePlainString
entryRulePlainString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlainStringRule()); }
	iv_rulePlainString=rulePlainString
	{ $current=$iv_rulePlainString.current; }
	EOF;

// Rule PlainString
rulePlainString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0());
			}
			lv_value_0_0=ruleConstantValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPlainStringRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.emf.mwe2.language.Mwe2.ConstantValue");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleConstantValue
entryRuleConstantValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConstantValueRule()); }
	iv_ruleConstantValue=ruleConstantValue
	{ $current=$iv_ruleConstantValue.current.getText(); }
	EOF;

// Rule ConstantValue
ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WS_0=RULE_WS
		{
			$current.merge(this_WS_0);
		}
		{
			newLeafNode(this_WS_0, grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0());
		}
		    |
		this_ANY_OTHER_1=RULE_ANY_OTHER
		{
			$current.merge(this_ANY_OTHER_1);
		}
		{
			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1());
		}
		    |
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2());
		}
		    |
		kw=ReverseSolidusApostrophe
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3());
		}
		    |
		kw=ReverseSolidusQuotationMark
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4());
		}
		    |
		kw=ReverseSolidusDollarSignLeftCurlyBracket
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5());
		}
		    |
		kw=ReverseSolidusReverseSolidus
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6());
		}
	)+
;
