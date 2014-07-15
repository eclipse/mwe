lexer grammar Mwe2Lexer;

options {
	tokenVocab=InternalMwe2Lexer;
}

@header {
package org.eclipse.emf.mwe2.language.lexer;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.parser.antlr.Lexer;
}

@members{
  private boolean singleQuotedString = false;
  private boolean doubleQuotedString = false;
  private boolean stringVariable = false;
}

AutoInject : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'auto-inject';

Import : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'import';

Module : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'module';

False : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'false';

True : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'true';

ReverseSolidusDollarSignLeftCurlyBracket : '\\${';

Var : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'var';

DollarSignLeftCurlyBracket : '${' {stringVariable = true;};

FullStopAsterisk : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'.*';

ReverseSolidusQuotationMark : '\\"';

ReverseSolidusApostrophe : '\\\'';

ReverseSolidusReverseSolidus : '\\\\';

QuotationMark : {!singleQuotedString || stringVariable}?=>'"' { if (!singleQuotedString) { doubleQuotedString = !doubleQuotedString; } } ;

Apostrophe :{!doubleQuotedString || stringVariable}?=> '\'' { if (!doubleQuotedString) { singleQuotedString = !singleQuotedString; } };

FullStop : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'.';

Colon : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>':';

EqualsSign : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'=';

CommercialAt : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'@';

LeftCurlyBracket : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'{';

RightCurlyBracket : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'}' { stringVariable = false; };



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ML_COMMENT : {!singleQuotedString && !doubleQuotedString || stringVariable}?=> ('/*' ( options {greedy=false;} : . )*'*/');

RULE_SL_COMMENT : {!singleQuotedString && !doubleQuotedString || stringVariable}?=> ('//' ~(('\n'|'\r'))* ('\r'? '\n')?);

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



