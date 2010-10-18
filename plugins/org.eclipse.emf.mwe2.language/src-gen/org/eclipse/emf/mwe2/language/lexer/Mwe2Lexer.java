package org.eclipse.emf.mwe2.language.lexer;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Mwe2Lexer extends Lexer {
    public static final int KEYWORD_7=22;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_ID=24;
    public static final int KEYWORD_17=7;
    public static final int KEYWORD_10=12;
    public static final int KEYWORD_1=16;
    public static final int KEYWORD_18=5;
    public static final int KEYWORD_19=6;
    public static final int KEYWORD_9=11;
    public static final int KEYWORD_2=17;
    public static final int KEYWORD_16=8;
    public static final int KEYWORD_11=13;
    public static final int KEYWORD_4=19;
    public static final int RULE_WS=27;
    public static final int KEYWORD_20=4;
    public static final int KEYWORD_13=15;
    public static final int EOF=-1;
    public static final int KEYWORD_14=9;
    public static final int KEYWORD_5=20;
    public static final int KEYWORD_6=21;
    public static final int RULE_ANY_OTHER=28;
    public static final int KEYWORD_12=14;
    public static final int KEYWORD_15=10;
    public static final int RULE_SL_COMMENT=26;
    public static final int KEYWORD_8=23;
    public static final int KEYWORD_3=18;

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
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g"; }

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:20:12: ({...}? => 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:20:14: {...}? => 'auto-inject'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_20", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("auto-inject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:22:12: ({...}? => 'import' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:22:14: {...}? => 'import'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_18", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:24:12: ({...}? => 'module' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:24:14: {...}? => 'module'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_19", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:26:12: ({...}? => 'false' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:26:14: {...}? => 'false'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_17", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:28:12: ({...}? => 'true' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:28:14: {...}? => 'true'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_16", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:30:12: ( '\\\\${' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:30:14: '\\\\${'
            {
            match("\\${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:32:12: ({...}? => 'var' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:32:14: {...}? => 'var'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_15", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:34:11: ( '${' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:34:13: '${'
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
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:36:12: ({...}? => '.*' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:36:14: {...}? => '.*'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_10", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:38:12: ( '\\\\\"' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:38:14: '\\\\\"'
            {
            match("\\\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:40:12: ( '\\\\\\'' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:40:14: '\\\\\\''
            {
            match("\\'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:42:12: ( '\\\\\\\\' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:42:14: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:44:11: ({...}? => '\"' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:44:13: {...}? => '\"'
            {
            if ( !((!singleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_1", "!singleQuotedString || stringVariable");
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
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:46:11: ({...}? => '\\'' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:46:12: {...}? => '\\''
            {
            if ( !((!doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_2", "!doubleQuotedString || stringVariable");
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
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:48:11: ({...}? => '.' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:48:13: {...}? => '.'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_3", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:50:11: ({...}? => ':' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:50:13: {...}? => ':'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_4", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:52:11: ({...}? => '=' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:52:13: {...}? => '='
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_5", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:54:11: ({...}? => '@' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:54:13: {...}? => '@'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_6", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:56:11: ({...}? => '{' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:56:13: {...}? => '{'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_7", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:58:11: ({...}? => '}' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:58:13: {...}? => '}'
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "KEYWORD_8", "!singleQuotedString && !doubleQuotedString || stringVariable");
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
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:62:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:62:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:62:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:62:11: '^'
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

            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:62:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:
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
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:17: ({...}? => ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:19: {...}? => ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:85: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:86: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:91: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:64:119: .
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
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:17: ({...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:19: {...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:85: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:86: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:91: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:91: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:107: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:108: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:108: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:66:108: '\\r'
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
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:68:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:
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
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:70:16: ( . )
            // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:70:18: .
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
        // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:8: ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=25;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:10: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:21: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:32: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:43: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:54: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:65: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:76: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:87: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:97: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:108: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:119: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:130: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:141: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:151: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:161: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:171: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:181: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:191: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:201: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:211: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:229: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:245: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:261: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.eclipse.emf.mwe2.language/src/org/eclipse/emf/mwe2/language/lexer/Mwe2Lexer.g:1:269: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\27\1\25\1\27\1\25\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\25\1\uffff\1\25\2\uffff\1\27\1\uffff\4\27\4\uffff\1\27\15"+
        "\uffff\5\27\1\101\10\uffff\4\27\1\106\2\uffff\2\27\1\112\2\uffff"+
        "\1\114\1\115\7\uffff";
    static final String DFA8_eofS =
        "\121\uffff";
    static final String DFA8_minS =
        "\1\0\1\165\1\155\1\157\1\141\1\162\1\42\1\141\1\173\1\52\7\0\1\101"+
        "\1\uffff\1\52\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1\165\4\uffff"+
        "\1\162\2\uffff\10\0\3\uffff\2\157\1\165\1\163\1\145\1\60\10\uffff"+
        "\1\55\1\162\1\154\1\145\1\60\1\0\1\uffff\1\164\1\145\1\60\1\0\1"+
        "\uffff\2\60\1\0\1\uffff\2\0\3\uffff";
    static final String DFA8_maxS =
        "\1\uffff\1\165\1\155\1\157\1\141\1\162\1\134\1\141\1\173\1\52\7"+
        "\0\1\172\1\uffff\1\57\2\uffff\1\164\1\uffff\1\160\1\144\1\154\1"+
        "\165\4\uffff\1\162\2\uffff\10\0\3\uffff\2\157\1\165\1\163\1\145"+
        "\1\172\10\uffff\1\55\1\162\1\154\1\145\1\172\1\0\1\uffff\1\164\1"+
        "\145\1\172\1\0\1\uffff\2\172\1\0\1\uffff\2\0\3\uffff";
    static final String DFA8_acceptS =
        "\22\uffff\1\25\1\uffff\1\30\1\31\1\uffff\1\25\4\uffff\1\6\1\12\1"+
        "\13\1\14\1\uffff\1\10\1\11\10\uffff\1\26\1\27\1\30\6\uffff\1\17"+
        "\1\15\1\16\1\20\1\21\1\22\1\23\1\24\6\uffff\1\1\4\uffff\1\7\3\uffff"+
        "\1\5\2\uffff\1\4\1\2\1\3";
    static final String DFA8_specialS =
        "\1\10\10\uffff\1\11\11\uffff\1\16\17\uffff\1\6\1\4\1\5\1\2\1\0\1"+
        "\12\1\15\1\17\21\uffff\1\13\4\uffff\1\7\4\uffff\1\14\3\uffff\1\3"+
        "\1\uffff\1\1\1\20\3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\12\1\25\1\10\2\25\1"+
            "\13\6\25\1\11\1\23\12\25\1\14\2\25\1\15\2\25\1\16\32\22\1\25"+
            "\1\6\1\25\1\21\1\22\1\25\1\1\4\22\1\4\2\22\1\2\3\22\1\3\6\22"+
            "\1\5\1\22\1\7\4\22\1\17\1\25\1\20\uff82\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\35\1\uffff\1\34\2\uffff\1\36\64\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\uffff",
            "",
            "\1\110",
            "\1\111",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\uffff",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
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
            return "1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_39 = input.LA(1);

                         
                        int index8_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 56;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_39);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_76 = input.LA(1);

                         
                        int index8_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 79;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_76);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_38 = input.LA(1);

                         
                        int index8_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 55;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_38);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_74 = input.LA(1);

                         
                        int index8_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 78;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_74);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_36 = input.LA(1);

                         
                        int index8_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString || stringVariable)) ) {s = 53;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_36);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_37 = input.LA(1);

                         
                        int index8_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!doubleQuotedString || stringVariable)) ) {s = 54;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_37);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_35 = input.LA(1);

                         
                        int index8_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 52;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_35);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_65 = input.LA(1);

                         
                        int index8_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 71;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_65);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
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
                    case 9 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_9=='*') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 34;}

                        else s = 35;

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_40 = input.LA(1);

                         
                        int index8_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 57;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_40);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_60 = input.LA(1);

                         
                        int index8_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_60=='-') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 66;}

                        else s = 23;

                         
                        input.seek(index8_60);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_70 = input.LA(1);

                         
                        int index8_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 75;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_70);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_41 = input.LA(1);

                         
                        int index8_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 58;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_41);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_19 = input.LA(1);

                         
                        int index8_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_19=='*') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 43;}

                        else if ( (LA8_19=='/') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 44;}

                        else s = 21;

                         
                        input.seek(index8_19);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_42 = input.LA(1);

                         
                        int index8_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 59;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_77 = input.LA(1);

                         
                        int index8_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 80;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_77);
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