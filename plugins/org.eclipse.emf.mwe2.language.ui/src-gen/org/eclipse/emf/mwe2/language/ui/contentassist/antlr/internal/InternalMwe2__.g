lexer grammar InternalMwe2;
@header {
package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T9 : '\'' ;
T10 : '"' ;
T11 : '\\' ;
T12 : 'false' ;
T13 : ':' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'true' ;
T17 : '=' ;
T18 : 'import' ;
T19 : 'module' ;
T20 : '.' ;
T21 : ';' ;
T22 : 'property' ;
T23 : '@' ;
T24 : 'as' ;
T25 : '.*' ;
T26 : '${' ;
T27 : 'auto-inject' ;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2508
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2510
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2512
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2514
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2516
RULE_ANY_OTHER : .;


