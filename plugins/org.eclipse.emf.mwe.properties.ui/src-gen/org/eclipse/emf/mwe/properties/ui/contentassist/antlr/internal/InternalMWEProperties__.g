lexer grammar InternalMWEProperties;
@header {
package org.eclipse.emf.mwe.properties.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T9 : '=' ;
T10 : ':' ;
T11 : '\\:' ;
T12 : '\\=' ;
T13 : '/' ;
T14 : '\\' ;
T15 : '.' ;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g" 1942
RULE_LINE_TERMINATOR : ('\r' '\n'?|'\n');

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g" 1944
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g" 1946
RULE_SL_COMMENT : ('#'|'!') ~(('\n'|'\r'))*;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g" 1948
RULE_WS : (' '|'\t')+;

// $ANTLR src "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g" 1950
RULE_ANY_OTHER : .;


