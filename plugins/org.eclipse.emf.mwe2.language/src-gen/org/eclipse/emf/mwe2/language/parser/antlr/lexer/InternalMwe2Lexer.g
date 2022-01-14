/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
lexer grammar InternalMwe2Lexer;

@header {
package org.eclipse.emf.mwe2.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

AutoInject : 'auto-inject';

Import : 'import';

Module : 'module';

False : 'false';

Null : 'null';

True : 'true';

ReverseSolidusDollarSignLeftCurlyBracket : '\\${';

Var : 'var';

DollarSignLeftCurlyBracket : '${';

FullStopAsterisk : '.*';

ReverseSolidusQuotationMark : '\\"';

ReverseSolidusApostrophe : '\\\'';

ReverseSolidusReverseSolidus : '\\\\';

QuotationMark : '"';

Apostrophe : '\'';

PlusSign : '+';

HyphenMinus : '-';

FullStop : '.';

Colon : ':';

EqualsSign : '=';

CommercialAt : '@';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
