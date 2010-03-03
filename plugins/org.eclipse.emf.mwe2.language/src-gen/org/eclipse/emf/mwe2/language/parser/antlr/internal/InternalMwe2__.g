lexer grammar InternalMwe2;
@header {
package org.eclipse.emf.mwe2.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T9 : 'module' ;
T10 : 'var' ;
T11 : '=' ;
T12 : '@' ;
T13 : ':' ;
T14 : 'auto-inject' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'import' ;
T18 : '.*' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : '.' ;
T22 : '${' ;
T23 : '\'' ;
T24 : '"' ;
T25 : '\\' ;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1708
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1710
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1712
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1714
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1716
RULE_ANY_OTHER : .;


