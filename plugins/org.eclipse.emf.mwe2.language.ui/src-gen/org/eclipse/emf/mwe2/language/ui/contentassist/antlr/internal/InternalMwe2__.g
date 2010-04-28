lexer grammar InternalMwe2;
@header {
package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T9 : 'false' ;
T10 : ':' ;
T11 : '{' ;
T12 : '}' ;
T13 : '@' ;
T14 : '\\\'' ;
T15 : '\\"' ;
T16 : '\\${' ;
T17 : '\\\\' ;
T18 : '\\/*' ;
T19 : '\\//' ;
T20 : 'true' ;
T21 : '=' ;
T22 : 'import' ;
T23 : 'module' ;
T24 : 'auto-inject' ;
T25 : 'var' ;
T26 : '.' ;
T27 : '.*' ;
T28 : '${' ;
T29 : '\'' ;
T30 : '"' ;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 3366
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 3368
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 3370
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 3372
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g" 3374
RULE_ANY_OTHER : .;


