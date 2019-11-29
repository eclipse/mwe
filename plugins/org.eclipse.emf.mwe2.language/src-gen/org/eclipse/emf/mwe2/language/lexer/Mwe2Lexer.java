package org.eclipse.emf.mwe2.language.lexer;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Mwe2Lexer extends Lexer {
    public static final int Null=8;
    public static final int Import=5;
    public static final int DollarSignLeftCurlyBracket=12;
    public static final int ReverseSolidusReverseSolidus=16;
    public static final int Var=11;
    public static final int ReverseSolidusApostrophe=15;
    public static final int True=9;
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

      private boolean singleQuotedString = false;
      private boolean doubleQuotedString = false;
      private boolean stringVariable = false;


    // delegates
    // delegators

    public Mwe2Lexer() {;} 
    public Mwe2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Mwe2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Mwe2Lexer.g"; }

    // $ANTLR start "AutoInject"
    public final void mAutoInject() throws RecognitionException {
        try {
            int _type = AutoInject;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mwe2Lexer.g:20:12: ({...}? => 'auto-inject' )
            // Mwe2Lexer.g:20:14: {...}? => 'auto-inject'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "AutoInject", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:22:8: ({...}? => 'import' )
            // Mwe2Lexer.g:22:10: {...}? => 'import'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Import", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:24:8: ({...}? => 'module' )
            // Mwe2Lexer.g:24:10: {...}? => 'module'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Module", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:26:7: ({...}? => 'false' )
            // Mwe2Lexer.g:26:9: {...}? => 'false'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "False", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:28:6: ({...}? => 'true' )
            // Mwe2Lexer.g:28:8: {...}? => 'true'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "True", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mwe2Lexer.g:30:6: ({...}? => 'null' )
            // Mwe2Lexer.g:30:8: {...}? => 'null'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Null", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "ReverseSolidusDollarSignLeftCurlyBracket"
    public final void mReverseSolidusDollarSignLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = ReverseSolidusDollarSignLeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mwe2Lexer.g:32:42: ( '\\\\${' )
            // Mwe2Lexer.g:32:44: '\\\\${'
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
            // Mwe2Lexer.g:34:5: ({...}? => 'var' )
            // Mwe2Lexer.g:34:7: {...}? => 'var'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Var", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:36:28: ( '${' )
            // Mwe2Lexer.g:36:30: '${'
            {
            match("${"); 

            stringVariable = true;

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
            // Mwe2Lexer.g:38:18: ({...}? => '.*' )
            // Mwe2Lexer.g:38:20: {...}? => '.*'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "FullStopAsterisk", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:40:29: ( '\\\\\"' )
            // Mwe2Lexer.g:40:31: '\\\\\"'
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
            // Mwe2Lexer.g:42:26: ( '\\\\\\'' )
            // Mwe2Lexer.g:42:28: '\\\\\\''
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
            // Mwe2Lexer.g:44:30: ( '\\\\\\\\' )
            // Mwe2Lexer.g:44:32: '\\\\\\\\'
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
            // Mwe2Lexer.g:46:15: ({...}? => '\"' )
            // Mwe2Lexer.g:46:17: {...}? => '\"'
            {
            if ( !((!singleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "QuotationMark", "!singleQuotedString || stringVariable");
            }
            match('\"'); 
             if (!singleQuotedString) { doubleQuotedString = !doubleQuotedString; } 

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
            // Mwe2Lexer.g:48:12: ({...}? => '\\'' )
            // Mwe2Lexer.g:48:13: {...}? => '\\''
            {
            if ( !((!doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Apostrophe", "!doubleQuotedString || stringVariable");
            }
            match('\''); 
             if (!doubleQuotedString) { singleQuotedString = !singleQuotedString; } 

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
            // Mwe2Lexer.g:50:10: ({...}? => '+' )
            // Mwe2Lexer.g:50:12: {...}? => '+'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "PlusSign", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:52:13: ({...}? => '-' )
            // Mwe2Lexer.g:52:15: {...}? => '-'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "HyphenMinus", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:54:10: ({...}? => '.' )
            // Mwe2Lexer.g:54:12: {...}? => '.'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "FullStop", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:56:7: ({...}? => ':' )
            // Mwe2Lexer.g:56:9: {...}? => ':'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "Colon", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:58:12: ({...}? => '=' )
            // Mwe2Lexer.g:58:14: {...}? => '='
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "EqualsSign", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:60:14: ({...}? => '@' )
            // Mwe2Lexer.g:60:16: {...}? => '@'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "CommercialAt", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:62:18: ({...}? => '{' )
            // Mwe2Lexer.g:62:20: {...}? => '{'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "LeftCurlyBracket", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
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
            // Mwe2Lexer.g:64:19: ({...}? => '}' )
            // Mwe2Lexer.g:64:21: {...}? => '}'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RightCurlyBracket", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('}'); 
             stringVariable = false; 

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
            // Mwe2Lexer.g:68:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // Mwe2Lexer.g:68:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // Mwe2Lexer.g:68:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Mwe2Lexer.g:68:11: '^'
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

            // Mwe2Lexer.g:68:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Mwe2Lexer.g:
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
            // Mwe2Lexer.g:70:10: ({...}? => ( '0' .. '9' )+ )
            // Mwe2Lexer.g:70:12: {...}? => ( '0' .. '9' )+
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RULE_INT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // Mwe2Lexer.g:70:78: ( '0' .. '9' )+
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
            	    // Mwe2Lexer.g:70:79: '0' .. '9'
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
            // Mwe2Lexer.g:72:17: ({...}? => ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // Mwe2Lexer.g:72:19: {...}? => ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // Mwe2Lexer.g:72:85: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Mwe2Lexer.g:72:86: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // Mwe2Lexer.g:72:91: ( options {greedy=false; } : . )*
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
            	    // Mwe2Lexer.g:72:119: .
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
            // Mwe2Lexer.g:74:17: ({...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // Mwe2Lexer.g:74:19: {...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // Mwe2Lexer.g:74:85: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // Mwe2Lexer.g:74:86: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // Mwe2Lexer.g:74:91: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Mwe2Lexer.g:74:91: ~ ( ( '\\n' | '\\r' ) )
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

            // Mwe2Lexer.g:74:107: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Mwe2Lexer.g:74:108: ( '\\r' )? '\\n'
                    {
                    // Mwe2Lexer.g:74:108: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Mwe2Lexer.g:74:108: '\\r'
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
            // Mwe2Lexer.g:76:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Mwe2Lexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Mwe2Lexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // Mwe2Lexer.g:
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
            // Mwe2Lexer.g:78:16: ( . )
            // Mwe2Lexer.g:78:18: .
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
        // Mwe2Lexer.g:1:8: ( AutoInject | Import | Module | False | True | Null | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | PlusSign | HyphenMinus | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt9=29;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Mwe2Lexer.g:1:10: AutoInject
                {
                mAutoInject(); 

                }
                break;
            case 2 :
                // Mwe2Lexer.g:1:21: Import
                {
                mImport(); 

                }
                break;
            case 3 :
                // Mwe2Lexer.g:1:28: Module
                {
                mModule(); 

                }
                break;
            case 4 :
                // Mwe2Lexer.g:1:35: False
                {
                mFalse(); 

                }
                break;
            case 5 :
                // Mwe2Lexer.g:1:41: True
                {
                mTrue(); 

                }
                break;
            case 6 :
                // Mwe2Lexer.g:1:46: Null
                {
                mNull(); 

                }
                break;
            case 7 :
                // Mwe2Lexer.g:1:51: ReverseSolidusDollarSignLeftCurlyBracket
                {
                mReverseSolidusDollarSignLeftCurlyBracket(); 

                }
                break;
            case 8 :
                // Mwe2Lexer.g:1:92: Var
                {
                mVar(); 

                }
                break;
            case 9 :
                // Mwe2Lexer.g:1:96: DollarSignLeftCurlyBracket
                {
                mDollarSignLeftCurlyBracket(); 

                }
                break;
            case 10 :
                // Mwe2Lexer.g:1:123: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 11 :
                // Mwe2Lexer.g:1:140: ReverseSolidusQuotationMark
                {
                mReverseSolidusQuotationMark(); 

                }
                break;
            case 12 :
                // Mwe2Lexer.g:1:168: ReverseSolidusApostrophe
                {
                mReverseSolidusApostrophe(); 

                }
                break;
            case 13 :
                // Mwe2Lexer.g:1:193: ReverseSolidusReverseSolidus
                {
                mReverseSolidusReverseSolidus(); 

                }
                break;
            case 14 :
                // Mwe2Lexer.g:1:222: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 15 :
                // Mwe2Lexer.g:1:236: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 16 :
                // Mwe2Lexer.g:1:247: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 17 :
                // Mwe2Lexer.g:1:256: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 18 :
                // Mwe2Lexer.g:1:268: FullStop
                {
                mFullStop(); 

                }
                break;
            case 19 :
                // Mwe2Lexer.g:1:277: Colon
                {
                mColon(); 

                }
                break;
            case 20 :
                // Mwe2Lexer.g:1:283: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 21 :
                // Mwe2Lexer.g:1:294: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 22 :
                // Mwe2Lexer.g:1:307: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 23 :
                // Mwe2Lexer.g:1:324: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 24 :
                // Mwe2Lexer.g:1:342: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // Mwe2Lexer.g:1:350: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // Mwe2Lexer.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // Mwe2Lexer.g:1:375: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // Mwe2Lexer.g:1:391: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // Mwe2Lexer.g:1:399: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\6\33\1\31\1\33\1\31\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\31\1\uffff\1\62\1\31\2\uffff\1\33\1\uffff\5\33\4\uffff\1\33\21\uffff\6\33\1\116\12\uffff\4\33\1\123\1\124\2\uffff\2\33\1\130\3\uffff\1\133\1\134\10\uffff";
    static final String DFA9_eofS =
        "\140\uffff";
    static final String DFA9_minS =
        "\1\0\1\165\1\155\1\157\1\141\1\162\1\165\1\42\1\141\1\173\1\52\11\0\1\101\1\uffff\1\60\1\52\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1\165\1\154\4\uffff\1\162\2\uffff\13\0\4\uffff\2\157\1\165\1\163\1\145\1\154\1\60\12\uffff\1\55\1\162\1\154\1\145\2\60\1\0\1\uffff\1\164\1\145\1\60\2\0\1\uffff\2\60\1\0\2\uffff\2\0\3\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\165\1\155\1\157\1\141\1\162\1\165\1\134\1\141\1\173\1\52\11\0\1\172\1\uffff\1\71\1\57\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1\165\1\154\4\uffff\1\162\2\uffff\13\0\4\uffff\2\157\1\165\1\163\1\145\1\154\1\172\12\uffff\1\55\1\162\1\154\1\145\2\172\1\0\1\uffff\1\164\1\145\1\172\2\0\1\uffff\2\172\1\0\2\uffff\2\0\3\uffff";
    static final String DFA9_acceptS =
        "\25\uffff\1\30\2\uffff\1\34\1\35\1\uffff\1\30\5\uffff\1\7\1\13\1\14\1\15\1\uffff\1\11\1\12\13\uffff\1\31\1\32\1\33\1\34\7\uffff\1\22\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\26\1\27\7\uffff\1\1\5\uffff\1\10\3\uffff\1\5\1\6\2\uffff\1\4\1\2\1\3";
    static final String DFA9_specialS =
        "\1\10\11\uffff\1\24\13\uffff\1\3\1\25\20\uffff\1\15\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\23\25\uffff\1\0\5\uffff\1\7\4\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\1\1\2\3\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\13\1\31\1\11\2\31\1\14\3\31\1\15\1\31\1\16\1\12\1\27\12\26\1\17\2\31\1\20\2\31\1\21\32\25\1\31\1\7\1\31\1\24\1\25\1\31\1\1\4\25\1\4\2\25\1\2\3\25\1\3\1\6\5\25\1\5\1\25\1\10\4\25\1\22\1\31\1\23\uff82\31",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\uffff",
            "",
            "\1\126",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\uffff",
            "\1\uffff",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            return "1:1: Tokens : ( AutoInject | Import | Module | False | True | Null | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | PlusSign | HyphenMinus | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_72 = input.LA(1);

                         
                        int index9_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_72=='-') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 79;}

                        else s = 27;

                         
                        input.seek(index9_72);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_91 = input.LA(1);

                         
                        int index9_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 94;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_91);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_92 = input.LA(1);

                         
                        int index9_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 95;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_92);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_22 = input.LA(1);

                         
                        int index9_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_22>='0' && LA9_22<='9')) && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 51;}

                        else s = 50;

                         
                        input.seek(index9_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_88 = input.LA(1);

                         
                        int index9_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 93;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_88);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_83 = input.LA(1);

                         
                        int index9_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 89;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_83);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_84 = input.LA(1);

                         
                        int index9_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 90;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_84);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_78 = input.LA(1);

                         
                        int index9_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 85;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index9_78);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='a') ) {s = 1;}

                        else if ( (LA9_0=='i') ) {s = 2;}

                        else if ( (LA9_0=='m') ) {s = 3;}

                        else if ( (LA9_0=='f') ) {s = 4;}

                        else if ( (LA9_0=='t') ) {s = 5;}

                        else if ( (LA9_0=='n') ) {s = 6;}

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
                    case 9 : 
                        int LA9_41 = input.LA(1);

                         
                        int index9_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString || stringVariable)) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_41);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_42 = input.LA(1);

                         
                        int index9_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!doubleQuotedString || stringVariable)) ) {s = 64;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_42);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_43 = input.LA(1);

                         
                        int index9_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 65;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_43);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_44 = input.LA(1);

                         
                        int index9_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 66;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_44);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_40 = input.LA(1);

                         
                        int index9_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 62;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_45 = input.LA(1);

                         
                        int index9_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 67;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_45);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_46 = input.LA(1);

                         
                        int index9_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 68;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_46);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_47 = input.LA(1);

                         
                        int index9_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 69;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_47);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA9_48 = input.LA(1);

                         
                        int index9_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 70;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_48);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA9_49 = input.LA(1);

                         
                        int index9_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 71;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_49);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA9_50 = input.LA(1);

                         
                        int index9_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 51;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_50);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_10=='*') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 39;}

                        else s = 40;

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA9_23 = input.LA(1);

                         
                        int index9_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_23=='*') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 52;}

                        else if ( (LA9_23=='/') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 53;}

                        else s = 25;

                         
                        input.seek(index9_23);
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