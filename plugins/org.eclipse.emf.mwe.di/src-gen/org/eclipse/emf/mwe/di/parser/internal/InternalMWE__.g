lexer grammar InternalMWE;
@header {
package org.eclipse.emf.mwe.di.parser.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : '.' ;
T13 : '*' ;
T14 : ';' ;
T15 : 'var' ;
T16 : '=' ;
T17 : 'file' ;
T18 : ':' ;
T19 : '{' ;
T20 : '}' ;
T21 : '+=' ;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 815
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 817
RULE_INT : ('0'..'9')+;

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 819
RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |                '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 821
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 823
RULE_SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')? {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 825
RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g" 827
RULE_ANY_OTHER : .;


