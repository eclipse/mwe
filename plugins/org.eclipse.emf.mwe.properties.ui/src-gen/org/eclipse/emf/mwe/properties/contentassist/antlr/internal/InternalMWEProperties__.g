lexer grammar InternalMWEProperties;
@header {
package org.eclipse.emf.mwe.properties.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T9 : '=' ;
T10 : ':' ;
T11 : '\\:' ;
T12 : '\\=' ;
T13 : '/' ;
T14 : '\\' ;
T15 : '.' ;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g" 1941
RULE_LINE_TERMINATOR : ('\r' '\n'?|'\n');

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g" 1943
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g" 1945
RULE_SL_COMMENT : ('#'|'!') ~(('\n'|'\r'))*;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g" 1947
RULE_WS : (' '|'\t')+;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g" 1949
RULE_ANY_OTHER : .;


