lexer grammar Mwe2ContentAssistLexer;

options {
	tokenVocab=InternalMwe2Lexer;
}

@header {
package org.eclipse.emf.mwe2.language.ui.contentassist;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@members{
  private boolean singleQuotedString = false;
  private boolean doubleQuotedString = false;
  private boolean stringVariable = false;
}

KEYWORD_20 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'auto-inject';

KEYWORD_18 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'import';

KEYWORD_19 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'module';

KEYWORD_17 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'false';

KEYWORD_16 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'true';

KEYWORD_14 : '\\${';

KEYWORD_15 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'var';

KEYWORD_9 : '${' {stringVariable = true;};

KEYWORD_10 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'.*';

KEYWORD_11 : '\\"';

KEYWORD_12 : '\\\'';

KEYWORD_13 : '\\\\';

KEYWORD_1 : {!singleQuotedString || stringVariable}?=>'"' { if (!singleQuotedString) { doubleQuotedString = !doubleQuotedString; } } ;

KEYWORD_2 :{!doubleQuotedString || stringVariable}?=> '\'' { if (!doubleQuotedString) { singleQuotedString = !singleQuotedString; } };

KEYWORD_3 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'.';

KEYWORD_4 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>':';

KEYWORD_5 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'=';

KEYWORD_6 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'@';

KEYWORD_7 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'{';

KEYWORD_8 : {!singleQuotedString && !doubleQuotedString || stringVariable}?=>'}' { stringVariable = false; };



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ML_COMMENT : {!singleQuotedString && !doubleQuotedString || stringVariable}?=> ('/*' ( options {greedy=false;} : . )*'*/');

RULE_SL_COMMENT : {!singleQuotedString && !doubleQuotedString || stringVariable}?=> ('//' ~(('\n'|'\r'))* ('\r'? '\n')?);

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



