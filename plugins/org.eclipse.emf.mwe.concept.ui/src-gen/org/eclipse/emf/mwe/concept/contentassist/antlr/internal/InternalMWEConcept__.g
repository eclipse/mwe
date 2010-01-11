lexer grammar InternalMWEConcept;
@header {
package org.eclipse.emf.mwe.concept.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T9 : ':' ;
T10 : '.' ;
T11 : '\'' ;
T12 : '"' ;
T13 : '\\' ;
T14 : '{' ;
T15 : '}' ;
T16 : ';' ;
T17 : 'property' ;
T18 : 'file' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : '=' ;
T22 : 'import' ;
T23 : '.*' ;
T24 : 'as' ;
T25 : ',' ;
T26 : '${' ;

// $ANTLR src "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g" 3431
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g" 3433
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g" 3435
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g" 3437
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g" 3439
RULE_ANY_OTHER : .;


