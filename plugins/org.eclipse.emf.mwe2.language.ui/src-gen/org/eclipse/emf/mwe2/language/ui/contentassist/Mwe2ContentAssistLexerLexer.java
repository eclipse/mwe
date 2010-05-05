package org.eclipse.emf.mwe2.language.ui.contentassist;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Mwe2ContentAssistLexerLexer extends Lexer {
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
    public static final int Tokens=29;
    public static final int RULE_ANY_OTHER=28;
    public static final int KEYWORD_12=14;
    public static final int KEYWORD_15=10;
    public static final int RULE_SL_COMMENT=26;
    public static final int KEYWORD_8=23;
    public static final int KEYWORD_3=18;

      private boolean singleQuotedString = false;
      private boolean doubleQuotedString = false;
      private boolean stringVariable = false;

    public Mwe2ContentAssistLexerLexer() {;} 
    public Mwe2ContentAssistLexerLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g"; }

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:20:12: ({...}? => 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:20:14: {...}? => 'auto-inject'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_20", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("auto-inject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:22:12: ({...}? => 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:22:14: {...}? => 'import'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_18", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:24:12: ({...}? => 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:24:14: {...}? => 'module'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_19", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:26:12: ({...}? => 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:26:14: {...}? => 'false'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_17", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:28:12: ({...}? => 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:28:14: {...}? => 'true'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_16", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:30:12: ( '\\\\${' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:30:14: '\\\\${'
            {
            match("\\${"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:32:12: ({...}? => 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:32:14: {...}? => 'var'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_15", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:34:11: ( '${' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:34:13: '${'
            {
            match("${"); 

            stringVariable = true;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:36:12: ({...}? => '.*' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:36:14: {...}? => '.*'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_10", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:38:12: ( '\\\\\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:38:14: '\\\\\"'
            {
            match("\\\""); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:40:12: ( '\\\\\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:40:14: '\\\\\\''
            {
            match("\\\'"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:42:12: ( '\\\\\\\\' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:42:14: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:44:11: ({...}? => '\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:44:13: {...}? => '\"'
            {
            if ( !(!singleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_1", "!singleQuotedString || stringVariable");
            }
            match('\"'); 
             if (!singleQuotedString) { doubleQuotedString = !doubleQuotedString; } 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:46:11: ({...}? => '\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:46:12: {...}? => '\\''
            {
            if ( !(!doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_2", "!doubleQuotedString || stringVariable");
            }
            match('\''); 
             if (!doubleQuotedString) { singleQuotedString = !singleQuotedString; } 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:48:11: ({...}? => '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:48:13: {...}? => '.'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_3", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:50:11: ({...}? => ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:50:13: {...}? => ':'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_4", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:52:11: ({...}? => '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:52:13: {...}? => '='
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_5", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:54:11: ({...}? => '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:54:13: {...}? => '@'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_6", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:56:11: ({...}? => '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:56:13: {...}? => '{'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_7", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:58:11: ({...}? => '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:58:13: {...}? => '}'
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "KEYWORD_8", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            match('}'); 
             stringVariable = false; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:62:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:62:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:62:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:62:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:62:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:17: ({...}? => ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:19: {...}? => ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:85: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:86: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:91: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFE')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:119: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:17: ({...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:19: {...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            if ( !(!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "!singleQuotedString && !doubleQuotedString || stringVariable");
            }
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:85: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:86: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:91: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:91: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:107: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:108: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:108: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:108: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:68:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:70:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:70:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:8: ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=25;
        int LA8_0 = input.LA(1);

        if ( (LA8_0=='a') ) {
            int LA8_1 = input.LA(2);

            if ( (LA8_1=='u') ) {
                int LA8_22 = input.LA(3);

                if ( (LA8_22=='t') ) {
                    int LA8_46 = input.LA(4);

                    if ( (LA8_46=='o') ) {
                        int LA8_60 = input.LA(5);

                        if ( (LA8_60=='-') && (!singleQuotedString && !doubleQuotedString || stringVariable)) {
                            alt8=1;
                        }
                        else {
                            alt8=21;}
                    }
                    else {
                        alt8=21;}
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='i') ) {
            int LA8_2 = input.LA(2);

            if ( (LA8_2=='m') ) {
                int LA8_24 = input.LA(3);

                if ( (LA8_24=='p') ) {
                    int LA8_47 = input.LA(4);

                    if ( (LA8_47=='o') ) {
                        int LA8_61 = input.LA(5);

                        if ( (LA8_61=='r') ) {
                            int LA8_67 = input.LA(6);

                            if ( (LA8_67=='t') ) {
                                int LA8_72 = input.LA(7);

                                if ( ((LA8_72>='0' && LA8_72<='9')||(LA8_72>='A' && LA8_72<='Z')||LA8_72=='_'||(LA8_72>='a' && LA8_72<='z')) ) {
                                    alt8=21;
                                }
                                else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                                    alt8=2;
                                }
                                else if ( (true) ) {
                                    alt8=21;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 72, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt8=21;}
                        }
                        else {
                            alt8=21;}
                    }
                    else {
                        alt8=21;}
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='m') ) {
            int LA8_3 = input.LA(2);

            if ( (LA8_3=='o') ) {
                int LA8_25 = input.LA(3);

                if ( (LA8_25=='d') ) {
                    int LA8_48 = input.LA(4);

                    if ( (LA8_48=='u') ) {
                        int LA8_62 = input.LA(5);

                        if ( (LA8_62=='l') ) {
                            int LA8_68 = input.LA(6);

                            if ( (LA8_68=='e') ) {
                                int LA8_73 = input.LA(7);

                                if ( ((LA8_73>='0' && LA8_73<='9')||(LA8_73>='A' && LA8_73<='Z')||LA8_73=='_'||(LA8_73>='a' && LA8_73<='z')) ) {
                                    alt8=21;
                                }
                                else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                                    alt8=3;
                                }
                                else if ( (true) ) {
                                    alt8=21;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 73, input);

                                    throw nvae;
                                }
                            }
                            else {
                                alt8=21;}
                        }
                        else {
                            alt8=21;}
                    }
                    else {
                        alt8=21;}
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='f') ) {
            int LA8_4 = input.LA(2);

            if ( (LA8_4=='a') ) {
                int LA8_26 = input.LA(3);

                if ( (LA8_26=='l') ) {
                    int LA8_49 = input.LA(4);

                    if ( (LA8_49=='s') ) {
                        int LA8_63 = input.LA(5);

                        if ( (LA8_63=='e') ) {
                            int LA8_69 = input.LA(6);

                            if ( ((LA8_69>='0' && LA8_69<='9')||(LA8_69>='A' && LA8_69<='Z')||LA8_69=='_'||(LA8_69>='a' && LA8_69<='z')) ) {
                                alt8=21;
                            }
                            else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                                alt8=4;
                            }
                            else if ( (true) ) {
                                alt8=21;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 69, input);

                                throw nvae;
                            }
                        }
                        else {
                            alt8=21;}
                    }
                    else {
                        alt8=21;}
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='t') ) {
            int LA8_5 = input.LA(2);

            if ( (LA8_5=='r') ) {
                int LA8_27 = input.LA(3);

                if ( (LA8_27=='u') ) {
                    int LA8_50 = input.LA(4);

                    if ( (LA8_50=='e') ) {
                        int LA8_64 = input.LA(5);

                        if ( ((LA8_64>='0' && LA8_64<='9')||(LA8_64>='A' && LA8_64<='Z')||LA8_64=='_'||(LA8_64>='a' && LA8_64<='z')) ) {
                            alt8=21;
                        }
                        else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                            alt8=5;
                        }
                        else if ( (true) ) {
                            alt8=21;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 64, input);

                            throw nvae;
                        }
                    }
                    else {
                        alt8=21;}
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='\\') ) {
            switch ( input.LA(2) ) {
            case '\'':
                {
                alt8=11;
                }
                break;
            case '$':
                {
                alt8=6;
                }
                break;
            case '\"':
                {
                alt8=10;
                }
                break;
            case '\\':
                {
                alt8=12;
                }
                break;
            default:
                alt8=25;}

        }
        else if ( (LA8_0=='v') ) {
            int LA8_7 = input.LA(2);

            if ( (LA8_7=='a') ) {
                int LA8_32 = input.LA(3);

                if ( (LA8_32=='r') ) {
                    int LA8_51 = input.LA(4);

                    if ( ((LA8_51>='0' && LA8_51<='9')||(LA8_51>='A' && LA8_51<='Z')||LA8_51=='_'||(LA8_51>='a' && LA8_51<='z')) ) {
                        alt8=21;
                    }
                    else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                        alt8=7;
                    }
                    else if ( (true) ) {
                        alt8=21;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 51, input);

                        throw nvae;
                    }
                }
                else {
                    alt8=21;}
            }
            else {
                alt8=21;}
        }
        else if ( (LA8_0=='$') ) {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='{') ) {
                alt8=8;
            }
            else {
                alt8=25;}
        }
        else if ( (LA8_0=='.') ) {
            int LA8_9 = input.LA(2);

            if ( (LA8_9=='*') && (!singleQuotedString && !doubleQuotedString || stringVariable)) {
                alt8=9;
            }
            else if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=15;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 9, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='\"') ) {
            int LA8_10 = input.LA(2);

            if ( (!singleQuotedString || stringVariable) ) {
                alt8=13;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 10, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='\'') ) {
            int LA8_11 = input.LA(2);

            if ( (!doubleQuotedString || stringVariable) ) {
                alt8=14;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 11, input);

                throw nvae;
            }
        }
        else if ( (LA8_0==':') ) {
            int LA8_12 = input.LA(2);

            if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=16;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 12, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='=') ) {
            int LA8_13 = input.LA(2);

            if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=17;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 13, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='@') ) {
            int LA8_14 = input.LA(2);

            if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=18;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 14, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='{') ) {
            int LA8_15 = input.LA(2);

            if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=19;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 15, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='}') ) {
            int LA8_16 = input.LA(2);

            if ( (!singleQuotedString && !doubleQuotedString || stringVariable) ) {
                alt8=20;
            }
            else if ( (true) ) {
                alt8=25;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 16, input);

                throw nvae;
            }
        }
        else if ( (LA8_0=='^') ) {
            int LA8_17 = input.LA(2);

            if ( ((LA8_17>='A' && LA8_17<='Z')||LA8_17=='_'||(LA8_17>='a' && LA8_17<='z')) ) {
                alt8=21;
            }
            else {
                alt8=25;}
        }
        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='b' && LA8_0<='e')||(LA8_0>='g' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='l')||(LA8_0>='n' && LA8_0<='s')||LA8_0=='u'||(LA8_0>='w' && LA8_0<='z')) ) {
            alt8=21;
        }
        else if ( (LA8_0=='/') ) {
            int LA8_19 = input.LA(2);

            if ( (LA8_19=='*') && (!singleQuotedString && !doubleQuotedString || stringVariable)) {
                alt8=22;
            }
            else if ( (LA8_19=='/') && (!singleQuotedString && !doubleQuotedString || stringVariable)) {
                alt8=23;
            }
            else {
                alt8=25;}
        }
        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
            alt8=24;
        }
        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||LA8_0=='#'||(LA8_0>='%' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='-')||(LA8_0>='0' && LA8_0<='9')||(LA8_0>=';' && LA8_0<='<')||(LA8_0>='>' && LA8_0<='?')||LA8_0=='['||LA8_0==']'||LA8_0=='`'||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFE')) ) {
            alt8=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_20 | KEYWORD_18 | KEYWORD_19 | KEYWORD_17 | KEYWORD_16 | KEYWORD_14 | KEYWORD_15 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 0, input);

            throw nvae;
        }
        switch (alt8) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:10: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:21: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:32: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:43: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:54: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:65: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:76: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:87: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:97: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:108: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:119: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:130: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:141: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:151: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:161: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:171: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:181: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:191: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:201: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:211: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:229: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:245: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:261: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:269: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}