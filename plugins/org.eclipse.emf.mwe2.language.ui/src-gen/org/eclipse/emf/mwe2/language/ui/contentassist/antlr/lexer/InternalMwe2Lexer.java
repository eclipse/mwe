package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMwe2Lexer extends Lexer {
    public static final int Import=5;
    public static final int DollarSignLeftCurlyBracket=11;
    public static final int ReverseSolidusReverseSolidus=15;
    public static final int Var=10;
    public static final int True=8;
    public static final int ReverseSolidusApostrophe=14;
    public static final int False=7;
    public static final int QuotationMark=16;
    public static final int RULE_SL_COMMENT=26;
    public static final int EqualsSign=20;
    public static final int AutoInject=4;
    public static final int Colon=19;
    public static final int RightCurlyBracket=23;
    public static final int EOF=-1;
    public static final int Apostrophe=17;
    public static final int FullStop=18;
    public static final int RULE_ID=24;
    public static final int RULE_WS=27;
    public static final int LeftCurlyBracket=22;
    public static final int RULE_ANY_OTHER=28;
    public static final int CommercialAt=21;
    public static final int ReverseSolidusQuotationMark=13;
    public static final int FullStopAsterisk=12;
    public static final int RULE_ML_COMMENT=25;
    public static final int ReverseSolidusDollarSignLeftCurlyBracket=9;
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

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:27:6: ( 'true' )
            // InternalMwe2Lexer.g:27:8: 'true'
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
            // InternalMwe2Lexer.g:29:42: ( '\\\\${' )
            // InternalMwe2Lexer.g:29:44: '\\\\${'
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
            // InternalMwe2Lexer.g:31:5: ( 'var' )
            // InternalMwe2Lexer.g:31:7: 'var'
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
            // InternalMwe2Lexer.g:33:28: ( '${' )
            // InternalMwe2Lexer.g:33:30: '${'
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
            // InternalMwe2Lexer.g:35:18: ( '.*' )
            // InternalMwe2Lexer.g:35:20: '.*'
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
            // InternalMwe2Lexer.g:37:29: ( '\\\\\"' )
            // InternalMwe2Lexer.g:37:31: '\\\\\"'
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
            // InternalMwe2Lexer.g:39:26: ( '\\\\\\'' )
            // InternalMwe2Lexer.g:39:28: '\\\\\\''
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
            // InternalMwe2Lexer.g:41:30: ( '\\\\\\\\' )
            // InternalMwe2Lexer.g:41:32: '\\\\\\\\'
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
            // InternalMwe2Lexer.g:43:15: ( '\"' )
            // InternalMwe2Lexer.g:43:17: '\"'
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
            // InternalMwe2Lexer.g:45:12: ( '\\'' )
            // InternalMwe2Lexer.g:45:14: '\\''
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

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:47:10: ( '.' )
            // InternalMwe2Lexer.g:47:12: '.'
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
            // InternalMwe2Lexer.g:49:7: ( ':' )
            // InternalMwe2Lexer.g:49:9: ':'
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
            // InternalMwe2Lexer.g:51:12: ( '=' )
            // InternalMwe2Lexer.g:51:14: '='
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
            // InternalMwe2Lexer.g:53:14: ( '@' )
            // InternalMwe2Lexer.g:53:16: '@'
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
            // InternalMwe2Lexer.g:55:18: ( '{' )
            // InternalMwe2Lexer.g:55:20: '{'
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
            // InternalMwe2Lexer.g:57:19: ( '}' )
            // InternalMwe2Lexer.g:57:21: '}'
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
            // InternalMwe2Lexer.g:61:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMwe2Lexer.g:61:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMwe2Lexer.g:61:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMwe2Lexer.g:61:11: '^'
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

            // InternalMwe2Lexer.g:61:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMwe2Lexer.g:63:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMwe2Lexer.g:63:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMwe2Lexer.g:63:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMwe2Lexer.g:63:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalMwe2Lexer.g:65:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMwe2Lexer.g:65:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMwe2Lexer.g:65:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMwe2Lexer.g:65:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalMwe2Lexer.g:65:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMwe2Lexer.g:65:41: ( '\\r' )? '\\n'
                    {
                    // InternalMwe2Lexer.g:65:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMwe2Lexer.g:65:41: '\\r'
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
            // InternalMwe2Lexer.g:67:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMwe2Lexer.g:67:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMwe2Lexer.g:67:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalMwe2Lexer.g:69:16: ( . )
            // InternalMwe2Lexer.g:69:18: .
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
        // InternalMwe2Lexer.g:1:8: ( AutoInject | Import | Module | False | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=25;
        alt8 = dfa8.predict(input);
        switch (alt8) {
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
                // InternalMwe2Lexer.g:1:41: True
                {
                mTrue(); 

                }
                break;
            case 6 :
                // InternalMwe2Lexer.g:1:46: ReverseSolidusDollarSignLeftCurlyBracket
                {
                mReverseSolidusDollarSignLeftCurlyBracket(); 

                }
                break;
            case 7 :
                // InternalMwe2Lexer.g:1:87: Var
                {
                mVar(); 

                }
                break;
            case 8 :
                // InternalMwe2Lexer.g:1:91: DollarSignLeftCurlyBracket
                {
                mDollarSignLeftCurlyBracket(); 

                }
                break;
            case 9 :
                // InternalMwe2Lexer.g:1:118: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 10 :
                // InternalMwe2Lexer.g:1:135: ReverseSolidusQuotationMark
                {
                mReverseSolidusQuotationMark(); 

                }
                break;
            case 11 :
                // InternalMwe2Lexer.g:1:163: ReverseSolidusApostrophe
                {
                mReverseSolidusApostrophe(); 

                }
                break;
            case 12 :
                // InternalMwe2Lexer.g:1:188: ReverseSolidusReverseSolidus
                {
                mReverseSolidusReverseSolidus(); 

                }
                break;
            case 13 :
                // InternalMwe2Lexer.g:1:217: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 14 :
                // InternalMwe2Lexer.g:1:231: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 15 :
                // InternalMwe2Lexer.g:1:242: FullStop
                {
                mFullStop(); 

                }
                break;
            case 16 :
                // InternalMwe2Lexer.g:1:251: Colon
                {
                mColon(); 

                }
                break;
            case 17 :
                // InternalMwe2Lexer.g:1:257: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 18 :
                // InternalMwe2Lexer.g:1:268: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 19 :
                // InternalMwe2Lexer.g:1:281: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 20 :
                // InternalMwe2Lexer.g:1:298: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 21 :
                // InternalMwe2Lexer.g:1:316: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalMwe2Lexer.g:1:324: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalMwe2Lexer.g:1:340: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalMwe2Lexer.g:1:356: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalMwe2Lexer.g:1:364: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\27\1\25\1\27\1\25\1\43\7\uffff\1\25\1\uffff\1\25\2\uffff\1\27\1\uffff\4\27\4\uffff\1\27\15\uffff\5\27\1\71\4\27\1\76\2\uffff\2\27\1\101\1\uffff\1\102\1\103\3\uffff";
    static final String DFA8_eofS =
        "\104\uffff";
    static final String DFA8_minS =
        "\1\0\1\165\1\155\1\157\1\141\1\162\1\42\1\141\1\173\1\52\7\uffff\1\101\1\uffff\1\52\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1\165\4\uffff\1\162\15\uffff\2\157\1\165\1\163\1\145\1\60\1\55\1\162\1\154\1\145\1\60\2\uffff\1\164\1\145\1\60\1\uffff\2\60\3\uffff";
    static final String DFA8_maxS =
        "\1\uffff\1\165\1\155\1\157\1\141\1\162\1\134\1\141\1\173\1\52\7\uffff\1\172\1\uffff\1\57\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1\165\4\uffff\1\162\15\uffff\2\157\1\165\1\163\1\145\1\172\1\55\1\162\1\154\1\145\1\172\2\uffff\1\164\1\145\1\172\1\uffff\2\172\3\uffff";
    static final String DFA8_acceptS =
        "\12\uffff\1\15\1\16\1\20\1\21\1\22\1\23\1\24\1\uffff\1\25\1\uffff\1\30\1\31\1\uffff\1\25\4\uffff\1\6\1\12\1\13\1\14\1\uffff\1\10\1\11\1\17\1\15\1\16\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\13\uffff\1\7\1\1\3\uffff\1\5\2\uffff\1\4\1\2\1\3";
    static final String DFA8_specialS =
        "\1\0\103\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\12\1\25\1\10\2\25\1\13\6\25\1\11\1\23\12\25\1\14\2\25\1\15\2\25\1\16\32\22\1\25\1\6\1\25\1\21\1\22\1\25\1\1\4\22\1\4\2\22\1\2\3\22\1\3\6\22\1\5\1\22\1\7\4\22\1\17\1\25\1\20\uff82\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\35\1\uffff\1\34\2\uffff\1\36\64\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\53\4\uffff\1\54",
            "",
            "",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "\1\63",
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
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\77",
            "\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AutoInject | Import | Module | False | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='a') ) {s = 1;}

                        else if ( (LA8_0=='i') ) {s = 2;}

                        else if ( (LA8_0=='m') ) {s = 3;}

                        else if ( (LA8_0=='f') ) {s = 4;}

                        else if ( (LA8_0=='t') ) {s = 5;}

                        else if ( (LA8_0=='\\') ) {s = 6;}

                        else if ( (LA8_0=='v') ) {s = 7;}

                        else if ( (LA8_0=='$') ) {s = 8;}

                        else if ( (LA8_0=='.') ) {s = 9;}

                        else if ( (LA8_0=='\"') ) {s = 10;}

                        else if ( (LA8_0=='\'') ) {s = 11;}

                        else if ( (LA8_0==':') ) {s = 12;}

                        else if ( (LA8_0=='=') ) {s = 13;}

                        else if ( (LA8_0=='@') ) {s = 14;}

                        else if ( (LA8_0=='{') ) {s = 15;}

                        else if ( (LA8_0=='}') ) {s = 16;}

                        else if ( (LA8_0=='^') ) {s = 17;}

                        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='b' && LA8_0<='e')||(LA8_0>='g' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='l')||(LA8_0>='n' && LA8_0<='s')||LA8_0=='u'||(LA8_0>='w' && LA8_0<='z')) ) {s = 18;}

                        else if ( (LA8_0=='/') ) {s = 19;}

                        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {s = 20;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||LA8_0=='#'||(LA8_0>='%' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='-')||(LA8_0>='0' && LA8_0<='9')||(LA8_0>=';' && LA8_0<='<')||(LA8_0>='>' && LA8_0<='?')||LA8_0=='['||LA8_0==']'||LA8_0=='`'||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}