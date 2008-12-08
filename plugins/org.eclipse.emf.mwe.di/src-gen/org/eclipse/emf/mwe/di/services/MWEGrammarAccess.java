/*
Generated with Xtext
*/

package org.eclipse.emf.mwe.di.services;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.BaseEPackageAccess;
import org.eclipse.xtext.builtin.XtextBuiltinGrammarAccess;

public class MWEGrammarAccess extends BaseEPackageAccess implements IGrammarAccess {
	
	public class FileElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Assignment c00AssignmentImports;
		private RuleCall c000ParserRuleCallImport;
		private Assignment c01AssignmentProperties;
		private RuleCall c010ParserRuleCallProperty;
		private Assignment c1AssignmentValue;
		private RuleCall c10ParserRuleCallComplexValue;
		
		// File : ( imports += Import ) * ( properties += Property ) * value = ComplexValue ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(1)); 
		}

		// ( imports += Import ) * ( properties += Property ) * value = ComplexValue
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// ( imports += Import ) * ( properties += Property ) *
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// ( imports += Import ) *
		public Assignment ele00AssignmentImports() {
			return (c00AssignmentImports != null) ? c00AssignmentImports : (c00AssignmentImports = (Assignment)ele0Group().eContents().get(0)); 
		}

		// Import
		public RuleCall ele000ParserRuleCallImport() {
			return (c000ParserRuleCallImport != null) ? c000ParserRuleCallImport : (c000ParserRuleCallImport = (RuleCall)ele00AssignmentImports().eContents().get(0)); 
		}

		// ( properties += Property ) *
		public Assignment ele01AssignmentProperties() {
			return (c01AssignmentProperties != null) ? c01AssignmentProperties : (c01AssignmentProperties = (Assignment)ele0Group().eContents().get(1)); 
		}

		// Property
		public RuleCall ele010ParserRuleCallProperty() {
			return (c010ParserRuleCallProperty != null) ? c010ParserRuleCallProperty : (c010ParserRuleCallProperty = (RuleCall)ele01AssignmentProperties().eContents().get(0)); 
		}

		// value = ComplexValue
		public Assignment ele1AssignmentValue() {
			return (c1AssignmentValue != null) ? c1AssignmentValue : (c1AssignmentValue = (Assignment)eleGroup().eContents().get(1)); 
		}

		// ComplexValue
		public RuleCall ele10ParserRuleCallComplexValue() {
			return (c10ParserRuleCallComplexValue != null) ? c10ParserRuleCallComplexValue : (c10ParserRuleCallComplexValue = (RuleCall)ele1AssignmentValue().eContents().get(0)); 
		}
	}

	public class ImportElements implements IParserRuleAccess {
		private ParserRule rule;
		private Alternatives cAlternatives;
		private RuleCall c0ParserRuleCallJavaImport;
		private RuleCall c1ParserRuleCallGenericImport;
		
		// Import : JavaImport | GenericImport ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(2)); 
		}

		// JavaImport | GenericImport
		public Alternatives eleAlternatives() {
			return (cAlternatives != null) ? cAlternatives : (cAlternatives = (Alternatives)getRule().eContents().get(0)); 
		}

		// JavaImport
		public RuleCall ele0ParserRuleCallJavaImport() {
			return (c0ParserRuleCallJavaImport != null) ? c0ParserRuleCallJavaImport : (c0ParserRuleCallJavaImport = (RuleCall)eleAlternatives().eContents().get(0)); 
		}

		// GenericImport
		public RuleCall ele1ParserRuleCallGenericImport() {
			return (c1ParserRuleCallGenericImport != null) ? c1ParserRuleCallGenericImport : (c1ParserRuleCallGenericImport = (RuleCall)eleAlternatives().eContents().get(1)); 
		}
	}

	public class JavaImportElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Keyword c000KeywordImport;
		private Assignment c001AssignmentJavaImport;
		private RuleCall c0010ParserRuleCallQualifiedName;
		private Group c01Group;
		private Keyword c010Keyword;
		private Assignment c011AssignmentWildcard;
		private Keyword c0110Keyword;
		private Keyword c1Keyword;
		
		// JavaImport : 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';' ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(3)); 
		}

		// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';'
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ?
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// 'import' javaImport = QualifiedName
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// 'import'
		public Keyword ele000KeywordImport() {
			return (c000KeywordImport != null) ? c000KeywordImport : (c000KeywordImport = (Keyword)ele00Group().eContents().get(0)); 
		}

		// javaImport = QualifiedName
		public Assignment ele001AssignmentJavaImport() {
			return (c001AssignmentJavaImport != null) ? c001AssignmentJavaImport : (c001AssignmentJavaImport = (Assignment)ele00Group().eContents().get(1)); 
		}

		// QualifiedName
		public RuleCall ele0010ParserRuleCallQualifiedName() {
			return (c0010ParserRuleCallQualifiedName != null) ? c0010ParserRuleCallQualifiedName : (c0010ParserRuleCallQualifiedName = (RuleCall)ele001AssignmentJavaImport().eContents().get(0)); 
		}

		// ( '.' wildcard ?= '*' ) ?
		public Group ele01Group() {
			return (c01Group != null) ? c01Group : (c01Group = (Group)ele0Group().eContents().get(1)); 
		}

		// '.'
		public Keyword ele010Keyword() {
			return (c010Keyword != null) ? c010Keyword : (c010Keyword = (Keyword)ele01Group().eContents().get(0)); 
		}

		// wildcard ?= '*'
		public Assignment ele011AssignmentWildcard() {
			return (c011AssignmentWildcard != null) ? c011AssignmentWildcard : (c011AssignmentWildcard = (Assignment)ele01Group().eContents().get(1)); 
		}

		// '*'
		public Keyword ele0110Keyword() {
			return (c0110Keyword != null) ? c0110Keyword : (c0110Keyword = (Keyword)ele011AssignmentWildcard().eContents().get(0)); 
		}

		// ';'
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class GenericImportElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Keyword c00KeywordImport;
		private Assignment c01AssignmentValue;
		private RuleCall c010LexerRuleCallSTRING;
		private Keyword c1Keyword;
		
		// GenericImport : 'import' value = STRING ';' ? ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(4)); 
		}

		// 'import' value = STRING ';' ?
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// 'import' value = STRING
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// 'import'
		public Keyword ele00KeywordImport() {
			return (c00KeywordImport != null) ? c00KeywordImport : (c00KeywordImport = (Keyword)ele0Group().eContents().get(0)); 
		}

		// value = STRING
		public Assignment ele01AssignmentValue() {
			return (c01AssignmentValue != null) ? c01AssignmentValue : (c01AssignmentValue = (Assignment)ele0Group().eContents().get(1)); 
		}

		// STRING
		public RuleCall ele010LexerRuleCallSTRING() {
			return (c010LexerRuleCallSTRING != null) ? c010LexerRuleCallSTRING : (c010LexerRuleCallSTRING = (RuleCall)ele01AssignmentValue().eContents().get(0)); 
		}

		// ';' ?
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class PropertyElements implements IParserRuleAccess {
		private ParserRule rule;
		private Alternatives cAlternatives;
		private RuleCall c0ParserRuleCallLocalVariable;
		private RuleCall c1ParserRuleCallPropertiesFileImport;
		
		// Property : LocalVariable | PropertiesFileImport ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(5)); 
		}

		// LocalVariable | PropertiesFileImport
		public Alternatives eleAlternatives() {
			return (cAlternatives != null) ? cAlternatives : (cAlternatives = (Alternatives)getRule().eContents().get(0)); 
		}

		// LocalVariable
		public RuleCall ele0ParserRuleCallLocalVariable() {
			return (c0ParserRuleCallLocalVariable != null) ? c0ParserRuleCallLocalVariable : (c0ParserRuleCallLocalVariable = (RuleCall)eleAlternatives().eContents().get(0)); 
		}

		// PropertiesFileImport
		public RuleCall ele1ParserRuleCallPropertiesFileImport() {
			return (c1ParserRuleCallPropertiesFileImport != null) ? c1ParserRuleCallPropertiesFileImport : (c1ParserRuleCallPropertiesFileImport = (RuleCall)eleAlternatives().eContents().get(1)); 
		}
	}

	public class LocalVariableElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Keyword c000KeywordVar;
		private Assignment c001AssignmentName;
		private RuleCall c0010LexerRuleCallID;
		private Group c01Group;
		private Keyword c010Keyword;
		private Assignment c011AssignmentValue;
		private RuleCall c0110ParserRuleCallValue;
		private Keyword c1Keyword;
		
		// LocalVariable : 'var' name = ID ( '=' value = Value ) ? ';' ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(6)); 
		}

		// 'var' name = ID ( '=' value = Value ) ? ';'
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// 'var' name = ID ( '=' value = Value ) ?
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// 'var' name = ID
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// 'var'
		public Keyword ele000KeywordVar() {
			return (c000KeywordVar != null) ? c000KeywordVar : (c000KeywordVar = (Keyword)ele00Group().eContents().get(0)); 
		}

		// name = ID
		public Assignment ele001AssignmentName() {
			return (c001AssignmentName != null) ? c001AssignmentName : (c001AssignmentName = (Assignment)ele00Group().eContents().get(1)); 
		}

		// ID
		public RuleCall ele0010LexerRuleCallID() {
			return (c0010LexerRuleCallID != null) ? c0010LexerRuleCallID : (c0010LexerRuleCallID = (RuleCall)ele001AssignmentName().eContents().get(0)); 
		}

		// ( '=' value = Value ) ?
		public Group ele01Group() {
			return (c01Group != null) ? c01Group : (c01Group = (Group)ele0Group().eContents().get(1)); 
		}

		// '='
		public Keyword ele010Keyword() {
			return (c010Keyword != null) ? c010Keyword : (c010Keyword = (Keyword)ele01Group().eContents().get(0)); 
		}

		// value = Value
		public Assignment ele011AssignmentValue() {
			return (c011AssignmentValue != null) ? c011AssignmentValue : (c011AssignmentValue = (Assignment)ele01Group().eContents().get(1)); 
		}

		// Value
		public RuleCall ele0110ParserRuleCallValue() {
			return (c0110ParserRuleCallValue != null) ? c0110ParserRuleCallValue : (c0110ParserRuleCallValue = (RuleCall)ele011AssignmentValue().eContents().get(0)); 
		}

		// ';'
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class PropertiesFileImportElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Keyword c000KeywordVar;
		private Keyword c001KeywordFile;
		private Assignment c01AssignmentFile;
		private RuleCall c010LexerRuleCallSTRING;
		private Keyword c1Keyword;
		
		// PropertiesFileImport : 'var' 'file' file = STRING ';' ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(7)); 
		}

		// 'var' 'file' file = STRING ';'
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// 'var' 'file' file = STRING
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// 'var' 'file'
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// 'var'
		public Keyword ele000KeywordVar() {
			return (c000KeywordVar != null) ? c000KeywordVar : (c000KeywordVar = (Keyword)ele00Group().eContents().get(0)); 
		}

		// 'file'
		public Keyword ele001KeywordFile() {
			return (c001KeywordFile != null) ? c001KeywordFile : (c001KeywordFile = (Keyword)ele00Group().eContents().get(1)); 
		}

		// file = STRING
		public Assignment ele01AssignmentFile() {
			return (c01AssignmentFile != null) ? c01AssignmentFile : (c01AssignmentFile = (Assignment)ele0Group().eContents().get(1)); 
		}

		// STRING
		public RuleCall ele010LexerRuleCallSTRING() {
			return (c010LexerRuleCallSTRING != null) ? c010LexerRuleCallSTRING : (c010LexerRuleCallSTRING = (RuleCall)ele01AssignmentFile().eContents().get(0)); 
		}

		// ';'
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class ValueElements implements IParserRuleAccess {
		private ParserRule rule;
		private Alternatives cAlternatives;
		private Alternatives c0Alternatives;
		private Alternatives c00Alternatives;
		private RuleCall c000ParserRuleCallSimpleValue;
		private RuleCall c001ParserRuleCallComplexValue;
		private RuleCall c01ParserRuleCallIdRef;
		private RuleCall c1ParserRuleCallWorkflowRef;
		
		// Value : SimpleValue | ComplexValue | IdRef | WorkflowRef ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(8)); 
		}

		// SimpleValue | ComplexValue | IdRef | WorkflowRef
		public Alternatives eleAlternatives() {
			return (cAlternatives != null) ? cAlternatives : (cAlternatives = (Alternatives)getRule().eContents().get(0)); 
		}

		// SimpleValue | ComplexValue | IdRef
		public Alternatives ele0Alternatives() {
			return (c0Alternatives != null) ? c0Alternatives : (c0Alternatives = (Alternatives)eleAlternatives().eContents().get(0)); 
		}

		// SimpleValue | ComplexValue
		public Alternatives ele00Alternatives() {
			return (c00Alternatives != null) ? c00Alternatives : (c00Alternatives = (Alternatives)ele0Alternatives().eContents().get(0)); 
		}

		// SimpleValue
		public RuleCall ele000ParserRuleCallSimpleValue() {
			return (c000ParserRuleCallSimpleValue != null) ? c000ParserRuleCallSimpleValue : (c000ParserRuleCallSimpleValue = (RuleCall)ele00Alternatives().eContents().get(0)); 
		}

		// ComplexValue
		public RuleCall ele001ParserRuleCallComplexValue() {
			return (c001ParserRuleCallComplexValue != null) ? c001ParserRuleCallComplexValue : (c001ParserRuleCallComplexValue = (RuleCall)ele00Alternatives().eContents().get(1)); 
		}

		// IdRef
		public RuleCall ele01ParserRuleCallIdRef() {
			return (c01ParserRuleCallIdRef != null) ? c01ParserRuleCallIdRef : (c01ParserRuleCallIdRef = (RuleCall)ele0Alternatives().eContents().get(1)); 
		}

		// WorkflowRef
		public RuleCall ele1ParserRuleCallWorkflowRef() {
			return (c1ParserRuleCallWorkflowRef != null) ? c1ParserRuleCallWorkflowRef : (c1ParserRuleCallWorkflowRef = (RuleCall)eleAlternatives().eContents().get(1)); 
		}
	}

	public class SimpleValueElements implements IParserRuleAccess {
		private ParserRule rule;
		private Assignment cAssignmentValue;
		private RuleCall c0LexerRuleCallSTRING;
		
		// SimpleValue : value = STRING ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(9)); 
		}

		// value = STRING
		public Assignment eleAssignmentValue() {
			return (cAssignmentValue != null) ? cAssignmentValue : (cAssignmentValue = (Assignment)getRule().eContents().get(0)); 
		}

		// STRING
		public RuleCall ele0LexerRuleCallSTRING() {
			return (c0LexerRuleCallSTRING != null) ? c0LexerRuleCallSTRING : (c0LexerRuleCallSTRING = (RuleCall)eleAssignmentValue().eContents().get(0)); 
		}
	}

	public class AssignableElements implements IParserRuleAccess {
		private ParserRule rule;
		private Alternatives cAlternatives;
		private RuleCall c0ParserRuleCallComplexValue;
		private RuleCall c1ParserRuleCallWorkflowRef;
		
		// Assignable : ComplexValue | WorkflowRef ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(10)); 
		}

		// ComplexValue | WorkflowRef
		public Alternatives eleAlternatives() {
			return (cAlternatives != null) ? cAlternatives : (cAlternatives = (Alternatives)getRule().eContents().get(0)); 
		}

		// ComplexValue
		public RuleCall ele0ParserRuleCallComplexValue() {
			return (c0ParserRuleCallComplexValue != null) ? c0ParserRuleCallComplexValue : (c0ParserRuleCallComplexValue = (RuleCall)eleAlternatives().eContents().get(0)); 
		}

		// WorkflowRef
		public RuleCall ele1ParserRuleCallWorkflowRef() {
			return (c1ParserRuleCallWorkflowRef != null) ? c1ParserRuleCallWorkflowRef : (c1ParserRuleCallWorkflowRef = (RuleCall)eleAlternatives().eContents().get(1)); 
		}
	}

	public class ComplexValueElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Group c000Group;
		private Assignment c0000AssignmentClassName;
		private RuleCall c00000ParserRuleCallQualifiedName;
		private Group c0001Group;
		private Keyword c00010Keyword;
		private Assignment c00011AssignmentId;
		private RuleCall c000110LexerRuleCallID;
		private Assignment c001AssignmentFooBar;
		private Keyword c0010Keyword;
		private Assignment c01AssignmentAssignments;
		private RuleCall c010ParserRuleCallAssignment;
		private Keyword c1Keyword;
		
		// ComplexValue : ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}' ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(11)); 
		}

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}'
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) *
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{'
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// ( className = QualifiedName ) ? ( ':' id = ID ) ?
		public Group ele000Group() {
			return (c000Group != null) ? c000Group : (c000Group = (Group)ele00Group().eContents().get(0)); 
		}

		// ( className = QualifiedName ) ?
		public Assignment ele0000AssignmentClassName() {
			return (c0000AssignmentClassName != null) ? c0000AssignmentClassName : (c0000AssignmentClassName = (Assignment)ele000Group().eContents().get(0)); 
		}

		// QualifiedName
		public RuleCall ele00000ParserRuleCallQualifiedName() {
			return (c00000ParserRuleCallQualifiedName != null) ? c00000ParserRuleCallQualifiedName : (c00000ParserRuleCallQualifiedName = (RuleCall)ele0000AssignmentClassName().eContents().get(0)); 
		}

		// ( ':' id = ID ) ?
		public Group ele0001Group() {
			return (c0001Group != null) ? c0001Group : (c0001Group = (Group)ele000Group().eContents().get(1)); 
		}

		// ':'
		public Keyword ele00010Keyword() {
			return (c00010Keyword != null) ? c00010Keyword : (c00010Keyword = (Keyword)ele0001Group().eContents().get(0)); 
		}

		// id = ID
		public Assignment ele00011AssignmentId() {
			return (c00011AssignmentId != null) ? c00011AssignmentId : (c00011AssignmentId = (Assignment)ele0001Group().eContents().get(1)); 
		}

		// ID
		public RuleCall ele000110LexerRuleCallID() {
			return (c000110LexerRuleCallID != null) ? c000110LexerRuleCallID : (c000110LexerRuleCallID = (RuleCall)ele00011AssignmentId().eContents().get(0)); 
		}

		// fooBar ?= '{'
		public Assignment ele001AssignmentFooBar() {
			return (c001AssignmentFooBar != null) ? c001AssignmentFooBar : (c001AssignmentFooBar = (Assignment)ele00Group().eContents().get(1)); 
		}

		// '{'
		public Keyword ele0010Keyword() {
			return (c0010Keyword != null) ? c0010Keyword : (c0010Keyword = (Keyword)ele001AssignmentFooBar().eContents().get(0)); 
		}

		// ( assignments += Assignment ) *
		public Assignment ele01AssignmentAssignments() {
			return (c01AssignmentAssignments != null) ? c01AssignmentAssignments : (c01AssignmentAssignments = (Assignment)ele0Group().eContents().get(1)); 
		}

		// Assignment
		public RuleCall ele010ParserRuleCallAssignment() {
			return (c010ParserRuleCallAssignment != null) ? c010ParserRuleCallAssignment : (c010ParserRuleCallAssignment = (RuleCall)ele01AssignmentAssignments().eContents().get(0)); 
		}

		// '}'
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class WorkflowRefElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Group c000Group;
		private Keyword c0000KeywordFile;
		private Assignment c0001AssignmentUri;
		private RuleCall c00010LexerRuleCallSTRING;
		private Keyword c001Keyword;
		private Assignment c01AssignmentAssignments;
		private RuleCall c010ParserRuleCallAssignment;
		private Keyword c1Keyword;
		
		// WorkflowRef : 'file' uri = STRING '{' ( assignments += Assignment ) * '}' ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(12)); 
		}

		// 'file' uri = STRING '{' ( assignments += Assignment ) * '}'
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// 'file' uri = STRING '{' ( assignments += Assignment ) *
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// 'file' uri = STRING '{'
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// 'file' uri = STRING
		public Group ele000Group() {
			return (c000Group != null) ? c000Group : (c000Group = (Group)ele00Group().eContents().get(0)); 
		}

		// 'file'
		public Keyword ele0000KeywordFile() {
			return (c0000KeywordFile != null) ? c0000KeywordFile : (c0000KeywordFile = (Keyword)ele000Group().eContents().get(0)); 
		}

		// uri = STRING
		public Assignment ele0001AssignmentUri() {
			return (c0001AssignmentUri != null) ? c0001AssignmentUri : (c0001AssignmentUri = (Assignment)ele000Group().eContents().get(1)); 
		}

		// STRING
		public RuleCall ele00010LexerRuleCallSTRING() {
			return (c00010LexerRuleCallSTRING != null) ? c00010LexerRuleCallSTRING : (c00010LexerRuleCallSTRING = (RuleCall)ele0001AssignmentUri().eContents().get(0)); 
		}

		// '{'
		public Keyword ele001Keyword() {
			return (c001Keyword != null) ? c001Keyword : (c001Keyword = (Keyword)ele00Group().eContents().get(1)); 
		}

		// ( assignments += Assignment ) *
		public Assignment ele01AssignmentAssignments() {
			return (c01AssignmentAssignments != null) ? c01AssignmentAssignments : (c01AssignmentAssignments = (Assignment)ele0Group().eContents().get(1)); 
		}

		// Assignment
		public RuleCall ele010ParserRuleCallAssignment() {
			return (c010ParserRuleCallAssignment != null) ? c010ParserRuleCallAssignment : (c010ParserRuleCallAssignment = (RuleCall)ele01AssignmentAssignments().eContents().get(0)); 
		}

		// '}'
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class IdRefElements implements IParserRuleAccess {
		private ParserRule rule;
		private Assignment cAssignmentId;
		private RuleCall c0LexerRuleCallID;
		
		// IdRef : id = ID ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(13)); 
		}

		// id = ID
		public Assignment eleAssignmentId() {
			return (cAssignmentId != null) ? cAssignmentId : (cAssignmentId = (Assignment)getRule().eContents().get(0)); 
		}

		// ID
		public RuleCall ele0LexerRuleCallID() {
			return (c0LexerRuleCallID != null) ? c0LexerRuleCallID : (c0LexerRuleCallID = (RuleCall)eleAssignmentId().eContents().get(0)); 
		}
	}

	public class AssignmentElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Group c0Group;
		private Group c00Group;
		private Assignment c000AssignmentFeature;
		private RuleCall c0000LexerRuleCallID;
		private Assignment c001AssignmentOperator;
		private Alternatives c0010Alternatives;
		private Keyword c00100Keyword;
		private Keyword c00101Keyword;
		private Assignment c01AssignmentValue;
		private RuleCall c010ParserRuleCallValue;
		private Keyword c1Keyword;
		
		// Assignment : ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ? ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(14)); 
		}

		// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ?
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value
		public Group ele0Group() {
			return (c0Group != null) ? c0Group : (c0Group = (Group)eleGroup().eContents().get(0)); 
		}

		// ( feature = ID ) ? operator = ( '=' | '+=' )
		public Group ele00Group() {
			return (c00Group != null) ? c00Group : (c00Group = (Group)ele0Group().eContents().get(0)); 
		}

		// ( feature = ID ) ?
		public Assignment ele000AssignmentFeature() {
			return (c000AssignmentFeature != null) ? c000AssignmentFeature : (c000AssignmentFeature = (Assignment)ele00Group().eContents().get(0)); 
		}

		// ID
		public RuleCall ele0000LexerRuleCallID() {
			return (c0000LexerRuleCallID != null) ? c0000LexerRuleCallID : (c0000LexerRuleCallID = (RuleCall)ele000AssignmentFeature().eContents().get(0)); 
		}

		// operator = ( '=' | '+=' )
		public Assignment ele001AssignmentOperator() {
			return (c001AssignmentOperator != null) ? c001AssignmentOperator : (c001AssignmentOperator = (Assignment)ele00Group().eContents().get(1)); 
		}

		// '=' | '+='
		public Alternatives ele0010Alternatives() {
			return (c0010Alternatives != null) ? c0010Alternatives : (c0010Alternatives = (Alternatives)ele001AssignmentOperator().eContents().get(0)); 
		}

		// '='
		public Keyword ele00100Keyword() {
			return (c00100Keyword != null) ? c00100Keyword : (c00100Keyword = (Keyword)ele0010Alternatives().eContents().get(0)); 
		}

		// '+='
		public Keyword ele00101Keyword() {
			return (c00101Keyword != null) ? c00101Keyword : (c00101Keyword = (Keyword)ele0010Alternatives().eContents().get(1)); 
		}

		// value = Value
		public Assignment ele01AssignmentValue() {
			return (c01AssignmentValue != null) ? c01AssignmentValue : (c01AssignmentValue = (Assignment)ele0Group().eContents().get(1)); 
		}

		// Value
		public RuleCall ele010ParserRuleCallValue() {
			return (c010ParserRuleCallValue != null) ? c010ParserRuleCallValue : (c010ParserRuleCallValue = (RuleCall)ele01AssignmentValue().eContents().get(0)); 
		}

		// ';' ?
		public Keyword ele1Keyword() {
			return (c1Keyword != null) ? c1Keyword : (c1Keyword = (Keyword)eleGroup().eContents().get(1)); 
		}
	}

	public class QualifiedNameElements implements IParserRuleAccess {
		private ParserRule rule;
		private Group cGroup;
		private Assignment c0AssignmentParts;
		private RuleCall c00LexerRuleCallID;
		private Group c1Group;
		private Assignment c10AssignmentParts;
		private Keyword c100Keyword;
		private Assignment c11AssignmentParts;
		private RuleCall c110LexerRuleCallID;
		
		// QualifiedName : parts += ID ( parts += '.' parts += ID ) * ;
		public ParserRule getRule() {
			return (rule != null) ? rule : (rule = (ParserRule) getGrammar().eContents().get(15)); 
		}

		// parts += ID ( parts += '.' parts += ID ) *
		public Group eleGroup() {
			return (cGroup != null) ? cGroup : (cGroup = (Group)getRule().eContents().get(0)); 
		}

		// parts += ID
		public Assignment ele0AssignmentParts() {
			return (c0AssignmentParts != null) ? c0AssignmentParts : (c0AssignmentParts = (Assignment)eleGroup().eContents().get(0)); 
		}

		// ID
		public RuleCall ele00LexerRuleCallID() {
			return (c00LexerRuleCallID != null) ? c00LexerRuleCallID : (c00LexerRuleCallID = (RuleCall)ele0AssignmentParts().eContents().get(0)); 
		}

		// ( parts += '.' parts += ID ) *
		public Group ele1Group() {
			return (c1Group != null) ? c1Group : (c1Group = (Group)eleGroup().eContents().get(1)); 
		}

		// parts += '.'
		public Assignment ele10AssignmentParts() {
			return (c10AssignmentParts != null) ? c10AssignmentParts : (c10AssignmentParts = (Assignment)ele1Group().eContents().get(0)); 
		}

		// '.'
		public Keyword ele100Keyword() {
			return (c100Keyword != null) ? c100Keyword : (c100Keyword = (Keyword)ele10AssignmentParts().eContents().get(0)); 
		}

		// parts += ID
		public Assignment ele11AssignmentParts() {
			return (c11AssignmentParts != null) ? c11AssignmentParts : (c11AssignmentParts = (Assignment)ele1Group().eContents().get(1)); 
		}

		// ID
		public RuleCall ele110LexerRuleCallID() {
			return (c110LexerRuleCallID != null) ? c110LexerRuleCallID : (c110LexerRuleCallID = (RuleCall)ele11AssignmentParts().eContents().get(0)); 
		}
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
