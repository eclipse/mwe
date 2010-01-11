lexer grammar InternalMWEConcept;
@header {
package org.eclipse.emf.mwe.concept.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T9 : 'import' ;
T10 : ';' ;
T11 : '.*' ;
T12 : '=' ;
T13 : 'as' ;
T14 : '{' ;
T15 : '}' ;
T16 : ',' ;
T17 : 'property' ;
T18 : 'file' ;
T19 : '.' ;
T20 : 'true' ;
T21 : 'false' ;
T22 : '${' ;
T23 : ':' ;
T24 : '\'' ;
T25 : '"' ;
T26 : '\\' ;

// $ANTLR src "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g" 2237
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g" 2239
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g" 2241
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g" 2243
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g" 2245
RULE_ANY_OTHER : .;


