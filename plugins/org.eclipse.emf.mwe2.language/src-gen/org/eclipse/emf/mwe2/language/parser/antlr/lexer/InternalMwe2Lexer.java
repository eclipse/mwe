package org.eclipse.emf.mwe2.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalMwe2Lexer extends Lexer {
    public static final int Null=8;
    public static final int Import=5;
    public static final int DollarSignLeftCurlyBracket=12;
    public static final int ReverseSolidusReverseSolidus=16;
    public static final int Var=11;
    public static final int True=9;
    public static final int ReverseSolidusApostrophe=15;
    public static final int False=7;
    public static final int QuotationMark=17;
    public static final int RULE_SL_COMMENT=30;
    public static final int EqualsSign=23;
    public static final int HyphenMinus=20;
    public static final int AutoInject=4;
    public static final int Colon=22;
    public static final int RightCurlyBracket=26;
    public static final int EOF=-1;
    public static final int Apostrophe=18;
    public static final int FullStop=21;
    public static final int RULE_ID=27;
    public static final int RULE_WS=31;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_ANY_OTHER=32;
    public static final int CommercialAt=24;
    public static final int ReverseSolidusQuotationMark=14;
    public static final int PlusSign=19;
    public static final int RULE_INT=28;
    public static final int FullStopAsterisk=13;
    public static final int RULE_ML_COMMENT=29;
    public static final int ReverseSolidusDollarSignLeftCurlyBracket=10;
    public static final int Module=6;

    // delegates
    // delegators

    public InternalMwe2Lexer() {;} 
    public InternalMwe2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMwe2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMwe2Lexer.g"; }

    // $ANTLR start "AutoInject"
    public final void mAutoInject() throws RecognitionException {
        try {
            int _type = AutoInject;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:19:12: ( 'auto-inject' )
            // InternalMwe2Lexer.g:19:14: 'auto-inject'
            {
            match("auto-inject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AutoInject"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:21:8: ( 'import' )
            // InternalMwe2Lexer.g:21:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Module"
    public final void mModule() throws RecognitionException {
        try {
            int _type = Module;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:23:8: ( 'module' )
            // InternalMwe2Lexer.g:23:10: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Module"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:25:7: ( 'false' )
            // InternalMwe2Lexer.g:25:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:27:6: ( 'null' )
            // InternalMwe2Lexer.g:27:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:29:6: ( 'true' )
            // InternalMwe2Lexer.g:29:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "ReverseSolidusDollarSignLeftCurlyBracket"
    public final void mReverseSolidusDollarSignLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = ReverseSolidusDollarSignLeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:31:42: ( '\\\\${' )
            // InternalMwe2Lexer.g:31:44: '\\\\${'
            {
            match("\\${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusDollarSignLeftCurlyBracket"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:33:5: ( 'var' )
            // InternalMwe2Lexer.g:33:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "DollarSignLeftCurlyBracket"
    public final void mDollarSignLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = DollarSignLeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:35:28: ( '${' )
            // InternalMwe2Lexer.g:35:30: '${'
            {
            match("${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSignLeftCurlyBracket"

    // $ANTLR start "FullStopAsterisk"
    public final void mFullStopAsterisk() throws RecognitionException {
        try {
            int _type = FullStopAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:37:18: ( '.*' )
            // InternalMwe2Lexer.g:37:20: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopAsterisk"

    // $ANTLR start "ReverseSolidusQuotationMark"
    public final void mReverseSolidusQuotationMark() throws RecognitionException {
        try {
            int _type = ReverseSolidusQuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:39:29: ( '\\\\\"' )
            // InternalMwe2Lexer.g:39:31: '\\\\\"'
            {
            match("\\\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusQuotationMark"

    // $ANTLR start "ReverseSolidusApostrophe"
    public final void mReverseSolidusApostrophe() throws RecognitionException {
        try {
            int _type = ReverseSolidusApostrophe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:41:26: ( '\\\\\\'' )
            // InternalMwe2Lexer.g:41:28: '\\\\\\''
            {
            match("\\'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusApostrophe"

    // $ANTLR start "ReverseSolidusReverseSolidus"
    public final void mReverseSolidusReverseSolidus() throws RecognitionException {
        try {
            int _type = ReverseSolidusReverseSolidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:43:30: ( '\\\\\\\\' )
            // InternalMwe2Lexer.g:43:32: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusReverseSolidus"

    // $ANTLR start "QuotationMark"
    public final void mQuotationMark() throws RecognitionException {
        try {
            int _type = QuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:45:15: ( '\"' )
            // InternalMwe2Lexer.g:45:17: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuotationMark"

    // $ANTLR start "Apostrophe"
    public final void mApostrophe() throws RecognitionException {
        try {
            int _type = Apostrophe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:47:12: ( '\\'' )
            // InternalMwe2Lexer.g:47:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Apostrophe"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:49:10: ( '+' )
            // InternalMwe2Lexer.g:49:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:51:13: ( '-' )
            // InternalMwe2Lexer.g:51:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:53:10: ( '.' )
            // InternalMwe2Lexer.g:53:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:55:7: ( ':' )
            // InternalMwe2Lexer.g:55:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:57:12: ( '=' )
            // InternalMwe2Lexer.g:57:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:59:14: ( '@' )
            // InternalMwe2Lexer.g:59:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:61:18: ( '{' )
            // InternalMwe2Lexer.g:61:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:63:19: ( '}' )
            // InternalMwe2Lexer.g:63:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:65:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMwe2Lexer.g:65:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMwe2Lexer.g:65:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMwe2Lexer.g:65:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMwe2Lexer.g:65:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMwe2Lexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:67:10: ( ( '0' .. '9' )+ )
            // InternalMwe2Lexer.g:67:12: ( '0' .. '9' )+
            {
            // InternalMwe2Lexer.g:67:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMwe2Lexer.g:67:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:69:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMwe2Lexer.g:69:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMwe2Lexer.g:69:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMwe2Lexer.g:69:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:71:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMwe2Lexer.g:71:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMwe2Lexer.g:71:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMwe2Lexer.g:71:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMwe2Lexer.g:71:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMwe2Lexer.g:71:41: ( '\\r' )? '\\n'
                    {
                    // InternalMwe2Lexer.g:71:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMwe2Lexer.g:71:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:73:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMwe2Lexer.g:73:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMwe2Lexer.g:73:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMwe2Lexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:75:16: ( . )
            // InternalMwe2Lexer.g:75:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMwe2Lexer.g:1:8: ( AutoInject | Import | Module | False | Null | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | PlusSign | HyphenMinus | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt9=29;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalMwe2Lexer.g:1:10: AutoInject
                {
                mAutoInject(); 

                }
                break;
            case 2 :
                // InternalMwe2Lexer.g:1:21: Import
                {
                mImport(); 

                }
                break;
            case 3 :
                // InternalMwe2Lexer.g:1:28: Module
                {
                mModule(); 

                }
                break;
            case 4 :
                // InternalMwe2Lexer.g:1:35: False
                {
                mFalse(); 

                }
                break;
            case 5 :
                // InternalMwe2Lexer.g:1:41: Null
                {
                mNull(); 

                }
                break;
            case 6 :
                // InternalMwe2Lexer.g:1:46: True
                {
                mTrue(); 

                }
                break;
            case 7 :
                // InternalMwe2Lexer.g:1:51: ReverseSolidusDollarSignLeftCurlyBracket
                {
                mReverseSolidusDollarSignLeftCurlyBracket(); 

                }
                break;
            case 8 :
                // InternalMwe2Lexer.g:1:92: Var
                {
                mVar(); 

                }
                break;
            case 9 :
                // InternalMwe2Lexer.g:1:96: DollarSignLeftCurlyBracket
                {
                mDollarSignLeftCurlyBracket(); 

                }
                break;
            case 10 :
                // InternalMwe2Lexer.g:1:123: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 11 :
                // InternalMwe2Lexer.g:1:140: ReverseSolidusQuotationMark
                {
                mReverseSolidusQuotationMark(); 

                }
                break;
            case 12 :
                // InternalMwe2Lexer.g:1:168: ReverseSolidusApostrophe
                {
                mReverseSolidusApostrophe(); 

                }
                break;
            case 13 :
                // InternalMwe2Lexer.g:1:193: ReverseSolidusReverseSolidus
                {
                mReverseSolidusReverseSolidus(); 

                }
                break;
            case 14 :
                // InternalMwe2Lexer.g:1:222: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 15 :
                // InternalMwe2Lexer.g:1:236: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 16 :
                // InternalMwe2Lexer.g:1:247: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 17 :
                // InternalMwe2Lexer.g:1:256: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 18 :
                // InternalMwe2Lexer.g:1:268: FullStop
                {
                mFullStop(); 

                }
                break;
            case 19 :
                // InternalMwe2Lexer.g:1:277: Colon
                {
                mColon(); 

                }
                break;
            case 20 :
                // InternalMwe2Lexer.g:1:283: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 21 :
                // InternalMwe2Lexer.g:1:294: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 22 :
                // InternalMwe2Lexer.g:1:307: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 23 :
                // InternalMwe2Lexer.g:1:324: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 24 :
                // InternalMwe2Lexer.g:1:342: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalMwe2Lexer.g:1:350: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalMwe2Lexer.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalMwe2Lexer.g:1:375: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalMwe2Lexer.g:1:391: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalMwe2Lexer.g:1:399: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\6\33\1\31\1\33\1\31\1\50\11\uffff\1\31\2\uffff\1\31\2\uffff\1\33\1\uffff\5\33\4\uffff\1\33\20\uffff\6\33\1\103\4\33\1\110\1\111\2\uffff\2\33\1\114\2\uffff\1\115\1\116\3\uffff";
    static final String DFA9_eofS =
        "\117\uffff";
    static final String DFA9_minS =
        "\1\0\1\165\1\155\1\157\1\141\1\165\1\162\1\42\1\141\1\173\1\52\11\uffff\1\101\2\uffff\1\52\2\uffff\1\164\1\uffff\1\160\1\144\2\154\1\165\4\uffff\1\162\20\uffff\2\157\1\165\1\163\1\154\1\145\1\60\1\55\1\162\1\154\1\145\2\60\2\uffff\1\164\1\145\1\60\2\uffff\2\60\3\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\165\1\155\1\157\1\141\1\165\1\162\1\134\1\141\1\173\1\52\11\uffff\1\172\2\uffff\1\57\2\uffff\1\164\1\uffff\1\160\1\144\2\154\1\165\4\uffff\1\162\20\uffff\2\157\1\165\1\163\1\154\1\145\1\172\1\55\1\162\1\154\1\145\2\172\2\uffff\1\164\1\145\1\172\2\uffff\2\172\3\uffff";
    static final String DFA9_acceptS =
        "\13\uffff\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\26\1\27\1\uffff\1\30\1\31\1\uffff\1\34\1\35\1\uffff\1\30\5\uffff\1\7\1\13\1\14\1\15\1\uffff\1\11\1\12\1\22\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1\34\15\uffff\1\10\1\1\3\uffff\1\5\1\6\2\uffff\1\4\1\2\1\3";
    static final String DFA9_specialS =
        "\1\0\116\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\13\1\31\1\11\2\31\1\14\3\31\1\15\1\31\1\16\1\12\1\27\12\26\1\17\2\31\1\20\2\31\1\21\32\25\1\31\1\7\1\31\1\24\1\25\1\31\1\1\4\25\1\4\2\25\1\2\3\25\1\3\1\5\5\25\1\6\1\25\1\10\4\25\1\22\1\31\1\23\uff82\31",
            "\1\32",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\1\uffff\1\41\2\uffff\1\43\64\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\112",
            "\1\113",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AutoInject | Import | Module | False | Null | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | PlusSign | HyphenMinus | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='a') ) {s = 1;}

                        else if ( (LA9_0=='i') ) {s = 2;}

                        else if ( (LA9_0=='m') ) {s = 3;}

                        else if ( (LA9_0=='f') ) {s = 4;}

                        else if ( (LA9_0=='n') ) {s = 5;}

                        else if ( (LA9_0=='t') ) {s = 6;}

                        else if ( (LA9_0=='\\') ) {s = 7;}

                        else if ( (LA9_0=='v') ) {s = 8;}

                        else if ( (LA9_0=='$') ) {s = 9;}

                        else if ( (LA9_0=='.') ) {s = 10;}

                        else if ( (LA9_0=='\"') ) {s = 11;}

                        else if ( (LA9_0=='\'') ) {s = 12;}

                        else if ( (LA9_0=='+') ) {s = 13;}

                        else if ( (LA9_0=='-') ) {s = 14;}

                        else if ( (LA9_0==':') ) {s = 15;}

                        else if ( (LA9_0=='=') ) {s = 16;}

                        else if ( (LA9_0=='@') ) {s = 17;}

                        else if ( (LA9_0=='{') ) {s = 18;}

                        else if ( (LA9_0=='}') ) {s = 19;}

                        else if ( (LA9_0=='^') ) {s = 20;}

                        else if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='b' && LA9_0<='e')||(LA9_0>='g' && LA9_0<='h')||(LA9_0>='j' && LA9_0<='l')||(LA9_0>='o' && LA9_0<='s')||LA9_0=='u'||(LA9_0>='w' && LA9_0<='z')) ) {s = 21;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 22;}

                        else if ( (LA9_0=='/') ) {s = 23;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 24;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||LA9_0=='!'||LA9_0=='#'||(LA9_0>='%' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='*')||LA9_0==','||(LA9_0>=';' && LA9_0<='<')||(LA9_0>='>' && LA9_0<='?')||LA9_0=='['||LA9_0==']'||LA9_0=='`'||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}