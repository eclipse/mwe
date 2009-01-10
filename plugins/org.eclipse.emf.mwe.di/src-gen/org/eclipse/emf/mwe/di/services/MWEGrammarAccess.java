/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.services;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.BaseEPackageAccess;
import org.eclipse.xtext.builtin.XtextBuiltinGrammarAccess;

public class MWEGrammarAccess extends BaseEPackageAccess implements IGrammarAccess {
	
	public class FileElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(1);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Assignment c00AssignmentImports = (Assignment)c0Group.eContents().get(0);
		private final RuleCall c000ParserRuleCallImport = (RuleCall)c00AssignmentImports.eContents().get(0);
		private final Assignment c01AssignmentProperties = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010ParserRuleCallProperty = (RuleCall)c01AssignmentProperties.eContents().get(0);
		private final Assignment c1AssignmentValue = (Assignment)cGroup.eContents().get(1);
		private final RuleCall c10ParserRuleCallComplexValue = (RuleCall)c1AssignmentValue.eContents().get(0);
		
		// File : ( imports += Import ) * ( properties += Property ) * value = ComplexValue ;
		public ParserRule getRule() { return rule; }

		// ( imports += Import ) * ( properties += Property ) * value = ComplexValue
		public Group eleGroup() { return cGroup; }

		// ( imports += Import ) * ( properties += Property ) *
		public Group ele0Group() { return c0Group; }

		// ( imports += Import ) *
		public Assignment ele00AssignmentImports() { return c00AssignmentImports; }

		// Import
		public RuleCall ele000ParserRuleCallImport() { return c000ParserRuleCallImport; }

		// ( properties += Property ) *
		public Assignment ele01AssignmentProperties() { return c01AssignmentProperties; }

		// Property
		public RuleCall ele010ParserRuleCallProperty() { return c010ParserRuleCallProperty; }

		// value = ComplexValue
		public Assignment ele1AssignmentValue() { return c1AssignmentValue; }

		// ComplexValue
		public RuleCall ele10ParserRuleCallComplexValue() { return c10ParserRuleCallComplexValue; }
	}

	public class ImportElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(2);
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall c0ParserRuleCallJavaImport = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall c1ParserRuleCallGenericImport = (RuleCall)cAlternatives.eContents().get(1);
		
		// Import : JavaImport | GenericImport ;
		public ParserRule getRule() { return rule; }

		// JavaImport | GenericImport
		public Alternatives eleAlternatives() { return cAlternatives; }

		// JavaImport
		public RuleCall ele0ParserRuleCallJavaImport() { return c0ParserRuleCallJavaImport; }

		// GenericImport
		public RuleCall ele1ParserRuleCallGenericImport() { return c1ParserRuleCallGenericImport; }
	}

	public class JavaImportElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(3);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Keyword c000KeywordImport = (Keyword)c00Group.eContents().get(0);
		private final Assignment c001AssignmentJavaImport = (Assignment)c00Group.eContents().get(1);
		private final RuleCall c0010ParserRuleCallQualifiedName = (RuleCall)c001AssignmentJavaImport.eContents().get(0);
		private final Group c01Group = (Group)c0Group.eContents().get(1);
		private final Keyword c010KeywordFullStop = (Keyword)c01Group.eContents().get(0);
		private final Assignment c011AssignmentWildcard = (Assignment)c01Group.eContents().get(1);
		private final Keyword c0110KeywordAsterisk = (Keyword)c011AssignmentWildcard.eContents().get(0);
		private final Keyword c1KeywordSemicolon = (Keyword)cGroup.eContents().get(1);
		
		// JavaImport : 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';' ;
		public ParserRule getRule() { return rule; }

		// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';'
		public Group eleGroup() { return cGroup; }

		// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ?
		public Group ele0Group() { return c0Group; }

		// 'import' javaImport = QualifiedName
		public Group ele00Group() { return c00Group; }

		// 'import'
		public Keyword ele000KeywordImport() { return c000KeywordImport; }

		// javaImport = QualifiedName
		public Assignment ele001AssignmentJavaImport() { return c001AssignmentJavaImport; }

		// QualifiedName
		public RuleCall ele0010ParserRuleCallQualifiedName() { return c0010ParserRuleCallQualifiedName; }

		// ( '.' wildcard ?= '*' ) ?
		public Group ele01Group() { return c01Group; }

		// '.'
		public Keyword ele010KeywordFullStop() { return c010KeywordFullStop; }

		// wildcard ?= '*'
		public Assignment ele011AssignmentWildcard() { return c011AssignmentWildcard; }

		// '*'
		public Keyword ele0110KeywordAsterisk() { return c0110KeywordAsterisk; }

		// ';'
		public Keyword ele1KeywordSemicolon() { return c1KeywordSemicolon; }
	}

	public class GenericImportElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(4);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Keyword c00KeywordImport = (Keyword)c0Group.eContents().get(0);
		private final Assignment c01AssignmentValue = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010LexerRuleCallSTRING = (RuleCall)c01AssignmentValue.eContents().get(0);
		private final Keyword c1KeywordSemicolon = (Keyword)cGroup.eContents().get(1);
		
		// GenericImport : 'import' value = STRING ';' ? ;
		public ParserRule getRule() { return rule; }

		// 'import' value = STRING ';' ?
		public Group eleGroup() { return cGroup; }

		// 'import' value = STRING
		public Group ele0Group() { return c0Group; }

		// 'import'
		public Keyword ele00KeywordImport() { return c00KeywordImport; }

		// value = STRING
		public Assignment ele01AssignmentValue() { return c01AssignmentValue; }

		// STRING
		public RuleCall ele010LexerRuleCallSTRING() { return c010LexerRuleCallSTRING; }

		// ';' ?
		public Keyword ele1KeywordSemicolon() { return c1KeywordSemicolon; }
	}

	public class PropertyElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(5);
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall c0ParserRuleCallLocalVariable = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall c1ParserRuleCallPropertiesFileImport = (RuleCall)cAlternatives.eContents().get(1);
		
		// Property : LocalVariable | PropertiesFileImport ;
		public ParserRule getRule() { return rule; }

		// LocalVariable | PropertiesFileImport
		public Alternatives eleAlternatives() { return cAlternatives; }

		// LocalVariable
		public RuleCall ele0ParserRuleCallLocalVariable() { return c0ParserRuleCallLocalVariable; }

		// PropertiesFileImport
		public RuleCall ele1ParserRuleCallPropertiesFileImport() { return c1ParserRuleCallPropertiesFileImport; }
	}

	public class LocalVariableElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(6);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Keyword c000KeywordVar = (Keyword)c00Group.eContents().get(0);
		private final Assignment c001AssignmentName = (Assignment)c00Group.eContents().get(1);
		private final RuleCall c0010LexerRuleCallID = (RuleCall)c001AssignmentName.eContents().get(0);
		private final Group c01Group = (Group)c0Group.eContents().get(1);
		private final Keyword c010KeywordEqualsSign = (Keyword)c01Group.eContents().get(0);
		private final Assignment c011AssignmentValue = (Assignment)c01Group.eContents().get(1);
		private final RuleCall c0110ParserRuleCallValue = (RuleCall)c011AssignmentValue.eContents().get(0);
		private final Keyword c1KeywordSemicolon = (Keyword)cGroup.eContents().get(1);
		
		// LocalVariable : 'var' name = ID ( '=' value = Value ) ? ';' ;
		public ParserRule getRule() { return rule; }

		// 'var' name = ID ( '=' value = Value ) ? ';'
		public Group eleGroup() { return cGroup; }

		// 'var' name = ID ( '=' value = Value ) ?
		public Group ele0Group() { return c0Group; }

		// 'var' name = ID
		public Group ele00Group() { return c00Group; }

		// 'var'
		public Keyword ele000KeywordVar() { return c000KeywordVar; }

		// name = ID
		public Assignment ele001AssignmentName() { return c001AssignmentName; }

		// ID
		public RuleCall ele0010LexerRuleCallID() { return c0010LexerRuleCallID; }

		// ( '=' value = Value ) ?
		public Group ele01Group() { return c01Group; }

		// '='
		public Keyword ele010KeywordEqualsSign() { return c010KeywordEqualsSign; }

		// value = Value
		public Assignment ele011AssignmentValue() { return c011AssignmentValue; }

		// Value
		public RuleCall ele0110ParserRuleCallValue() { return c0110ParserRuleCallValue; }

		// ';'
		public Keyword ele1KeywordSemicolon() { return c1KeywordSemicolon; }
	}

	public class PropertiesFileImportElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(7);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Keyword c000KeywordVar = (Keyword)c00Group.eContents().get(0);
		private final Keyword c001KeywordFile = (Keyword)c00Group.eContents().get(1);
		private final Assignment c01AssignmentFile = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010LexerRuleCallSTRING = (RuleCall)c01AssignmentFile.eContents().get(0);
		private final Keyword c1KeywordSemicolon = (Keyword)cGroup.eContents().get(1);
		
		// PropertiesFileImport : 'var' 'file' file = STRING ';' ;
		public ParserRule getRule() { return rule; }

		// 'var' 'file' file = STRING ';'
		public Group eleGroup() { return cGroup; }

		// 'var' 'file' file = STRING
		public Group ele0Group() { return c0Group; }

		// 'var' 'file'
		public Group ele00Group() { return c00Group; }

		// 'var'
		public Keyword ele000KeywordVar() { return c000KeywordVar; }

		// 'file'
		public Keyword ele001KeywordFile() { return c001KeywordFile; }

		// file = STRING
		public Assignment ele01AssignmentFile() { return c01AssignmentFile; }

		// STRING
		public RuleCall ele010LexerRuleCallSTRING() { return c010LexerRuleCallSTRING; }

		// ';'
		public Keyword ele1KeywordSemicolon() { return c1KeywordSemicolon; }
	}

	public class ValueElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(8);
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Alternatives c0Alternatives = (Alternatives)cAlternatives.eContents().get(0);
		private final Alternatives c00Alternatives = (Alternatives)c0Alternatives.eContents().get(0);
		private final RuleCall c000ParserRuleCallSimpleValue = (RuleCall)c00Alternatives.eContents().get(0);
		private final RuleCall c001ParserRuleCallComplexValue = (RuleCall)c00Alternatives.eContents().get(1);
		private final RuleCall c01ParserRuleCallIdRef = (RuleCall)c0Alternatives.eContents().get(1);
		private final RuleCall c1ParserRuleCallWorkflowRef = (RuleCall)cAlternatives.eContents().get(1);
		
		// Value : SimpleValue | ComplexValue | IdRef | WorkflowRef ;
		public ParserRule getRule() { return rule; }

		// SimpleValue | ComplexValue | IdRef | WorkflowRef
		public Alternatives eleAlternatives() { return cAlternatives; }

		// SimpleValue | ComplexValue | IdRef
		public Alternatives ele0Alternatives() { return c0Alternatives; }

		// SimpleValue | ComplexValue
		public Alternatives ele00Alternatives() { return c00Alternatives; }

		// SimpleValue
		public RuleCall ele000ParserRuleCallSimpleValue() { return c000ParserRuleCallSimpleValue; }

		// ComplexValue
		public RuleCall ele001ParserRuleCallComplexValue() { return c001ParserRuleCallComplexValue; }

		// IdRef
		public RuleCall ele01ParserRuleCallIdRef() { return c01ParserRuleCallIdRef; }

		// WorkflowRef
		public RuleCall ele1ParserRuleCallWorkflowRef() { return c1ParserRuleCallWorkflowRef; }
	}

	public class SimpleValueElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(9);
		private final Assignment cAssignmentValue = (Assignment)rule.eContents().get(1);
		private final RuleCall c0LexerRuleCallSTRING = (RuleCall)cAssignmentValue.eContents().get(0);
		
		// SimpleValue : value = STRING ;
		public ParserRule getRule() { return rule; }

		// value = STRING
		public Assignment eleAssignmentValue() { return cAssignmentValue; }

		// STRING
		public RuleCall ele0LexerRuleCallSTRING() { return c0LexerRuleCallSTRING; }
	}

	public class AssignableElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(10);
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall c0ParserRuleCallComplexValue = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall c1ParserRuleCallWorkflowRef = (RuleCall)cAlternatives.eContents().get(1);
		
		// Assignable : ComplexValue | WorkflowRef ;
		public ParserRule getRule() { return rule; }

		// ComplexValue | WorkflowRef
		public Alternatives eleAlternatives() { return cAlternatives; }

		// ComplexValue
		public RuleCall ele0ParserRuleCallComplexValue() { return c0ParserRuleCallComplexValue; }

		// WorkflowRef
		public RuleCall ele1ParserRuleCallWorkflowRef() { return c1ParserRuleCallWorkflowRef; }
	}

	public class ComplexValueElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(11);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Group c000Group = (Group)c00Group.eContents().get(0);
		private final Assignment c0000AssignmentClassName = (Assignment)c000Group.eContents().get(0);
		private final RuleCall c00000ParserRuleCallQualifiedName = (RuleCall)c0000AssignmentClassName.eContents().get(0);
		private final Group c0001Group = (Group)c000Group.eContents().get(1);
		private final Keyword c00010KeywordColon = (Keyword)c0001Group.eContents().get(0);
		private final Assignment c00011AssignmentId = (Assignment)c0001Group.eContents().get(1);
		private final RuleCall c000110LexerRuleCallID = (RuleCall)c00011AssignmentId.eContents().get(0);
		private final Assignment c001AssignmentFooBar = (Assignment)c00Group.eContents().get(1);
		private final Keyword c0010KeywordLeftCurlyBracket = (Keyword)c001AssignmentFooBar.eContents().get(0);
		private final Assignment c01AssignmentAssignments = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010ParserRuleCallAssignment = (RuleCall)c01AssignmentAssignments.eContents().get(0);
		private final Keyword c1KeywordRightCurlyBracket = (Keyword)cGroup.eContents().get(1);
		
		// ComplexValue : ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}' ;
		public ParserRule getRule() { return rule; }

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}'
		public Group eleGroup() { return cGroup; }

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) *
		public Group ele0Group() { return c0Group; }

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{'
		public Group ele00Group() { return c00Group; }

		// ( className = QualifiedName ) ? ( ':' id = ID ) ?
		public Group ele000Group() { return c000Group; }

		// ( className = QualifiedName ) ?
		public Assignment ele0000AssignmentClassName() { return c0000AssignmentClassName; }

		// QualifiedName
		public RuleCall ele00000ParserRuleCallQualifiedName() { return c00000ParserRuleCallQualifiedName; }

		// ( ':' id = ID ) ?
		public Group ele0001Group() { return c0001Group; }

		// ':'
		public Keyword ele00010KeywordColon() { return c00010KeywordColon; }

		// id = ID
		public Assignment ele00011AssignmentId() { return c00011AssignmentId; }

		// ID
		public RuleCall ele000110LexerRuleCallID() { return c000110LexerRuleCallID; }

		// fooBar ?= '{'
		public Assignment ele001AssignmentFooBar() { return c001AssignmentFooBar; }

		// '{'
		public Keyword ele0010KeywordLeftCurlyBracket() { return c0010KeywordLeftCurlyBracket; }

		// ( assignments += Assignment ) *
		public Assignment ele01AssignmentAssignments() { return c01AssignmentAssignments; }

		// Assignment
		public RuleCall ele010ParserRuleCallAssignment() { return c010ParserRuleCallAssignment; }

		// '}'
		public Keyword ele1KeywordRightCurlyBracket() { return c1KeywordRightCurlyBracket; }
	}

	public class WorkflowRefElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(12);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Group c000Group = (Group)c00Group.eContents().get(0);
		private final Keyword c0000KeywordFile = (Keyword)c000Group.eContents().get(0);
		private final Assignment c0001AssignmentUri = (Assignment)c000Group.eContents().get(1);
		private final RuleCall c00010LexerRuleCallSTRING = (RuleCall)c0001AssignmentUri.eContents().get(0);
		private final Keyword c001KeywordLeftCurlyBracket = (Keyword)c00Group.eContents().get(1);
		private final Assignment c01AssignmentAssignments = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010ParserRuleCallAssignment = (RuleCall)c01AssignmentAssignments.eContents().get(0);
		private final Keyword c1KeywordRightCurlyBracket = (Keyword)cGroup.eContents().get(1);
		
		// WorkflowRef : 'file' uri = STRING '{' ( assignments += Assignment ) * '}' ;
		public ParserRule getRule() { return rule; }

		// 'file' uri = STRING '{' ( assignments += Assignment ) * '}'
		public Group eleGroup() { return cGroup; }

		// 'file' uri = STRING '{' ( assignments += Assignment ) *
		public Group ele0Group() { return c0Group; }

		// 'file' uri = STRING '{'
		public Group ele00Group() { return c00Group; }

		// 'file' uri = STRING
		public Group ele000Group() { return c000Group; }

		// 'file'
		public Keyword ele0000KeywordFile() { return c0000KeywordFile; }

		// uri = STRING
		public Assignment ele0001AssignmentUri() { return c0001AssignmentUri; }

		// STRING
		public RuleCall ele00010LexerRuleCallSTRING() { return c00010LexerRuleCallSTRING; }

		// '{'
		public Keyword ele001KeywordLeftCurlyBracket() { return c001KeywordLeftCurlyBracket; }

		// ( assignments += Assignment ) *
		public Assignment ele01AssignmentAssignments() { return c01AssignmentAssignments; }

		// Assignment
		public RuleCall ele010ParserRuleCallAssignment() { return c010ParserRuleCallAssignment; }

		// '}'
		public Keyword ele1KeywordRightCurlyBracket() { return c1KeywordRightCurlyBracket; }
	}

	public class IdRefElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(13);
		private final Assignment cAssignmentId = (Assignment)rule.eContents().get(1);
		private final RuleCall c0LexerRuleCallID = (RuleCall)cAssignmentId.eContents().get(0);
		
		// IdRef : id = ID ;
		public ParserRule getRule() { return rule; }

		// id = ID
		public Assignment eleAssignmentId() { return cAssignmentId; }

		// ID
		public RuleCall ele0LexerRuleCallID() { return c0LexerRuleCallID; }
	}

	public class AssignmentElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(14);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group c0Group = (Group)cGroup.eContents().get(0);
		private final Group c00Group = (Group)c0Group.eContents().get(0);
		private final Assignment c000AssignmentFeature = (Assignment)c00Group.eContents().get(0);
		private final RuleCall c0000LexerRuleCallID = (RuleCall)c000AssignmentFeature.eContents().get(0);
		private final Assignment c001AssignmentOperator = (Assignment)c00Group.eContents().get(1);
		private final Alternatives c0010Alternatives = (Alternatives)c001AssignmentOperator.eContents().get(0);
		private final Keyword c00100KeywordEqualsSign = (Keyword)c0010Alternatives.eContents().get(0);
		private final Keyword c00101KeywordPlusSignEqualsSign = (Keyword)c0010Alternatives.eContents().get(1);
		private final Assignment c01AssignmentValue = (Assignment)c0Group.eContents().get(1);
		private final RuleCall c010ParserRuleCallValue = (RuleCall)c01AssignmentValue.eContents().get(0);
		private final Keyword c1KeywordSemicolon = (Keyword)cGroup.eContents().get(1);
		
		// Assignment : ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ? ;
		public ParserRule getRule() { return rule; }

		// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ?
		public Group eleGroup() { return cGroup; }

		// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value
		public Group ele0Group() { return c0Group; }

		// ( feature = ID ) ? operator = ( '=' | '+=' )
		public Group ele00Group() { return c00Group; }

		// ( feature = ID ) ?
		public Assignment ele000AssignmentFeature() { return c000AssignmentFeature; }

		// ID
		public RuleCall ele0000LexerRuleCallID() { return c0000LexerRuleCallID; }

		// operator = ( '=' | '+=' )
		public Assignment ele001AssignmentOperator() { return c001AssignmentOperator; }

		// '=' | '+='
		public Alternatives ele0010Alternatives() { return c0010Alternatives; }

		// '='
		public Keyword ele00100KeywordEqualsSign() { return c00100KeywordEqualsSign; }

		// '+='
		public Keyword ele00101KeywordPlusSignEqualsSign() { return c00101KeywordPlusSignEqualsSign; }

		// value = Value
		public Assignment ele01AssignmentValue() { return c01AssignmentValue; }

		// Value
		public RuleCall ele010ParserRuleCallValue() { return c010ParserRuleCallValue; }

		// ';' ?
		public Keyword ele1KeywordSemicolon() { return c1KeywordSemicolon; }
	}

	public class QualifiedNameElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) getGrammar().eContents().get(15);
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment c0AssignmentParts = (Assignment)cGroup.eContents().get(0);
		private final RuleCall c00LexerRuleCallID = (RuleCall)c0AssignmentParts.eContents().get(0);
		private final Group c1Group = (Group)cGroup.eContents().get(1);
		private final Assignment c10AssignmentParts = (Assignment)c1Group.eContents().get(0);
		private final Keyword c100KeywordFullStop = (Keyword)c10AssignmentParts.eContents().get(0);
		private final Assignment c11AssignmentParts = (Assignment)c1Group.eContents().get(1);
		private final RuleCall c110LexerRuleCallID = (RuleCall)c11AssignmentParts.eContents().get(0);
		
		// QualifiedName : parts += ID ( parts += '.' parts += ID ) * ;
		public ParserRule getRule() { return rule; }

		// parts += ID ( parts += '.' parts += ID ) *
		public Group eleGroup() { return cGroup; }

		// parts += ID
		public Assignment ele0AssignmentParts() { return c0AssignmentParts; }

		// ID
		public RuleCall ele00LexerRuleCallID() { return c00LexerRuleCallID; }

		// ( parts += '.' parts += ID ) *
		public Group ele1Group() { return c1Group; }

		// parts += '.'
		public Assignment ele10AssignmentParts() { return c10AssignmentParts; }

		// '.'
		public Keyword ele100KeywordFullStop() { return c100KeywordFullStop; }

		// parts += ID
		public Assignment ele11AssignmentParts() { return c11AssignmentParts; }

		// ID
		public RuleCall ele110LexerRuleCallID() { return c110LexerRuleCallID; }
	}
	
	public final static MWEGrammarAccess INSTANCE = new MWEGrammarAccess();

	private static final String MWE_GRAMMAR_CP_URI = "classpath:/org/eclipse/emf/mwe/di/MWE.xmi";
	private static Grammar GRAMMAR = null;
	private static FileElements pFile;
	private static ImportElements pImport;
	private static JavaImportElements pJavaImport;
	private static GenericImportElements pGenericImport;
	private static PropertyElements pProperty;
	private static LocalVariableElements pLocalVariable;
	private static PropertiesFileImportElements pPropertiesFileImport;
	private static ValueElements pValue;
	private static SimpleValueElements pSimpleValue;
	private static AssignableElements pAssignable;
	private static ComplexValueElements pComplexValue;
	private static WorkflowRefElements pWorkflowRef;
	private static IdRefElements pIdRef;
	private static AssignmentElements pAssignment;
	private static QualifiedNameElements pQualifiedName;

	@SuppressWarnings("unused")
	public synchronized Grammar getGrammar() {	
		if (GRAMMAR==null) {
			// assert the XtextPackage implementation is loaded
			XtextPackage xtextPackage = XtextPackage.eINSTANCE;
			GRAMMAR = (Grammar) loadGrammarFile(MWEGrammarAccess.class.getClassLoader(),MWE_GRAMMAR_CP_URI);
		}
		return GRAMMAR;
	}
	
	public XtextBuiltinGrammarAccess getSuperGrammar() {
		return XtextBuiltinGrammarAccess.INSTANCE;		
	}

	
	// File : ( imports += Import ) * ( properties += Property ) * value = ComplexValue ;
	public FileElements prFile() {
		return (pFile != null) ? pFile : (pFile = new FileElements());
	} 

	// Import : JavaImport | GenericImport ;
	public ImportElements prImport() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	} 

	// JavaImport : 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';' ;
	public JavaImportElements prJavaImport() {
		return (pJavaImport != null) ? pJavaImport : (pJavaImport = new JavaImportElements());
	} 

	// GenericImport : 'import' value = STRING ';' ? ;
	public GenericImportElements prGenericImport() {
		return (pGenericImport != null) ? pGenericImport : (pGenericImport = new GenericImportElements());
	} 

	// Property : LocalVariable | PropertiesFileImport ;
	public PropertyElements prProperty() {
		return (pProperty != null) ? pProperty : (pProperty = new PropertyElements());
	} 

	// LocalVariable : 'var' name = ID ( '=' value = Value ) ? ';' ;
	public LocalVariableElements prLocalVariable() {
		return (pLocalVariable != null) ? pLocalVariable : (pLocalVariable = new LocalVariableElements());
	} 

	// PropertiesFileImport : 'var' 'file' file = STRING ';' ;
	public PropertiesFileImportElements prPropertiesFileImport() {
		return (pPropertiesFileImport != null) ? pPropertiesFileImport : (pPropertiesFileImport = new PropertiesFileImportElements());
	} 

	// Value : SimpleValue | ComplexValue | IdRef | WorkflowRef ;
	public ValueElements prValue() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	} 

	// SimpleValue : value = STRING ;
	public SimpleValueElements prSimpleValue() {
		return (pSimpleValue != null) ? pSimpleValue : (pSimpleValue = new SimpleValueElements());
	} 

	// Assignable : ComplexValue | WorkflowRef ;
	public AssignableElements prAssignable() {
		return (pAssignable != null) ? pAssignable : (pAssignable = new AssignableElements());
	} 

	// ComplexValue : ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}' ;
	public ComplexValueElements prComplexValue() {
		return (pComplexValue != null) ? pComplexValue : (pComplexValue = new ComplexValueElements());
	} 

	// WorkflowRef : 'file' uri = STRING '{' ( assignments += Assignment ) * '}' ;
	public WorkflowRefElements prWorkflowRef() {
		return (pWorkflowRef != null) ? pWorkflowRef : (pWorkflowRef = new WorkflowRefElements());
	} 

	// IdRef : id = ID ;
	public IdRefElements prIdRef() {
		return (pIdRef != null) ? pIdRef : (pIdRef = new IdRefElements());
	} 

	// Assignment : ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ? ;
	public AssignmentElements prAssignment() {
		return (pAssignment != null) ? pAssignment : (pAssignment = new AssignmentElements());
	} 

	// QualifiedName : parts += ID ( parts += '.' parts += ID ) * ;
	public QualifiedNameElements prQualifiedName() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	} 
}
