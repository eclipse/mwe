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
T16 : '@' ;
T17 : 'true' ;
T18 : '=' ;
T19 : 'import' ;
T20 : 'module' ;
T21 : 'auto-inject' ;
T22 : 'var' ;
T23 : 'as' ;
T24 : ';' ;
T25 : '.' ;
T26 : '.*' ;
T27 : '${' ;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2529
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2531
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2533
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2535
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 2537
RULE_ANY_OTHER : .;


