lexer grammar InternalMWE;
@header {
package org.eclipse.emf.mwe.di.parser.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'import' ;
T13 : '.' ;
T14 : '*' ;
T15 : ';' ;
T16 : 'var' ;
T17 : '=' ;
T18 : 'file' ;
T19 : ':' ;
T20 : '{' ;
T21 : '}' ;
T22 : '+=' ;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 726
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 728
RULE_INT : ('0'..'9')+;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 730
RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 732
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 734
RULE_SL_COMMENT : '//' ( ~('\n'|'\r'))* ((options{greedy=true;}:'\r\n' | '\r' | '\n' ))? {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 736
RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 738
RULE_LEXER_BODY : '<#' '.'* '#>';

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 740
RULE_ANY_OTHER : .;


