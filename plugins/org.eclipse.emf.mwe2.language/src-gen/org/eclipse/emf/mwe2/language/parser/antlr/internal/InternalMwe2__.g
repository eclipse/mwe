lexer grammar InternalMwe2;
@header {
package org.eclipse.emf.mwe2.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T9 : 'module' ;
T10 : ';' ;
T11 : 'property' ;
T12 : '=' ;
T13 : '@' ;
T14 : 'as' ;
T15 : 'auto-inject' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'import' ;
T19 : '.*' ;
T20 : 'true' ;
T21 : 'false' ;
T22 : '.' ;
T23 : '${' ;
T24 : ':' ;
T25 : '\'' ;
T26 : '"' ;
T27 : '\\' ;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1590
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1592
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1594
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1596
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g" 1598
RULE_ANY_OTHER : .;


