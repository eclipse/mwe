package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMwe2Lexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=6;
    public static final int T14=14;
    public static final int T29=29;
    public static final int RULE_ID=8;
    public static final int T22=22;
    public static final int T11=11;
    public static final int T9=9;
    public static final int T12=12;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=4;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=31;
    public static final int RULE_ANY_OTHER=5;
    public static final int T16=16;
    public static final int T27=27;
    public static final int RULE_SL_COMMENT=7;
    public static final int T30=30;
    public static final int T24=24;
    public static final int T19=19;
    public InternalMwe2Lexer() {;} 
    public InternalMwe2Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:10:4: ( 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:10:6: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:11:5: ( ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:11:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:12:5: ( '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:12:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:13:5: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:13:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:14:5: ( '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:14:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:15:5: ( '\\\\\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:15:7: '\\\\\\''
            {
            match("\\\'"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:16:5: ( '\\\\\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:16:7: '\\\\\"'
            {
            match("\\\""); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:17:5: ( '\\\\${' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:17:7: '\\\\${'
            {
            match("\\${"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:18:5: ( '\\\\\\\\' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:18:7: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:19:5: ( '\\\\/*' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:19:7: '\\\\/*'
            {
            match("\\/*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:20:5: ( '\\\\//' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:20:7: '\\\\//'
            {
            match("\\//"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:21:5: ( 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:21:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:22:5: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:22:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:23:5: ( 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:23:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:24:5: ( 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:24:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:25:5: ( 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:25:7: 'auto-inject'
            {
            match("auto-inject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:26:5: ( 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:26:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:27:5: ( '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:27:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:28:5: ( '.*' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:28:7: '.*'
            {
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:29:5: ( '${' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:29:7: '${'
            {
            match("${"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:30:5: ( '\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:30:7: '\\''
            {
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:31:5: ( '\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:31:7: '\"'
            {
            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2683:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2683:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2683:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2683:11: '^'
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

            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2683:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:
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
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2685:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2685:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2685:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2685:52: .
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
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2687:41: '\\r'
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
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2689:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2689:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2689:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:
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
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2691:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2691:18: .
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
        // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=27;
        int LA8_0 = input.LA(1);

        if ( (LA8_0=='f') ) {
            int LA8_1 = input.LA(2);

            if ( (LA8_1=='a') ) {
                int LA8_22 = input.LA(3);

                if ( (LA8_22=='l') ) {
                    int LA8_47 = input.LA(4);

                    if ( (LA8_47=='s') ) {
                        int LA8_55 = input.LA(5);

                        if ( (LA8_55=='e') ) {
                            int LA8_61 = input.LA(6);

                            if ( ((LA8_61>='0' && LA8_61<='9')||(LA8_61>='A' && LA8_61<='Z')||LA8_61=='_'||(LA8_61>='a' && LA8_61<='z')) ) {
                                alt8=23;
                            }
                            else {
                                alt8=1;}
                        }
                        else {
                            alt8=23;}
                    }
                    else {
                        alt8=23;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0==':') ) {
            alt8=2;
        }
        else if ( (LA8_0=='{') ) {
            alt8=3;
        }
        else if ( (LA8_0=='}') ) {
            alt8=4;
        }
        else if ( (LA8_0=='@') ) {
            alt8=5;
        }
        else if ( (LA8_0=='\\') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                int LA8_28 = input.LA(3);

                if ( (LA8_28=='*') ) {
                    alt8=10;
                }
                else if ( (LA8_28=='/') ) {
                    alt8=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 28, input);

                    throw nvae;
                }
                }
                break;
            case '\'':
                {
                alt8=6;
                }
                break;
            case '\"':
                {
                alt8=7;
                }
                break;
            case '\\':
                {
                alt8=9;
                }
                break;
            case '$':
                {
                alt8=8;
                }
                break;
            default:
                alt8=27;}

        }
        else if ( (LA8_0=='t') ) {
            int LA8_7 = input.LA(2);

            if ( (LA8_7=='r') ) {
                int LA8_33 = input.LA(3);

                if ( (LA8_33=='u') ) {
                    int LA8_50 = input.LA(4);

                    if ( (LA8_50=='e') ) {
                        int LA8_56 = input.LA(5);

                        if ( ((LA8_56>='0' && LA8_56<='9')||(LA8_56>='A' && LA8_56<='Z')||LA8_56=='_'||(LA8_56>='a' && LA8_56<='z')) ) {
                            alt8=23;
                        }
                        else {
                            alt8=12;}
                    }
                    else {
                        alt8=23;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='=') ) {
            alt8=13;
        }
        else if ( (LA8_0=='i') ) {
            int LA8_9 = input.LA(2);

            if ( (LA8_9=='m') ) {
                int LA8_35 = input.LA(3);

                if ( (LA8_35=='p') ) {
                    int LA8_51 = input.LA(4);

                    if ( (LA8_51=='o') ) {
                        int LA8_57 = input.LA(5);

                        if ( (LA8_57=='r') ) {
                            int LA8_63 = input.LA(6);

                            if ( (LA8_63=='t') ) {
                                int LA8_67 = input.LA(7);

                                if ( ((LA8_67>='0' && LA8_67<='9')||(LA8_67>='A' && LA8_67<='Z')||LA8_67=='_'||(LA8_67>='a' && LA8_67<='z')) ) {
                                    alt8=23;
                                }
                                else {
                                    alt8=14;}
                            }
                            else {
                                alt8=23;}
                        }
                        else {
                            alt8=23;}
                    }
                    else {
                        alt8=23;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='m') ) {
            int LA8_10 = input.LA(2);

            if ( (LA8_10=='o') ) {
                int LA8_36 = input.LA(3);

                if ( (LA8_36=='d') ) {
                    int LA8_52 = input.LA(4);

                    if ( (LA8_52=='u') ) {
                        int LA8_58 = input.LA(5);

                        if ( (LA8_58=='l') ) {
                            int LA8_64 = input.LA(6);

                            if ( (LA8_64=='e') ) {
                                int LA8_68 = input.LA(7);

                                if ( ((LA8_68>='0' && LA8_68<='9')||(LA8_68>='A' && LA8_68<='Z')||LA8_68=='_'||(LA8_68>='a' && LA8_68<='z')) ) {
                                    alt8=23;
                                }
                                else {
                                    alt8=15;}
                            }
                            else {
                                alt8=23;}
                        }
                        else {
                            alt8=23;}
                    }
                    else {
                        alt8=23;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='a') ) {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='u') ) {
                int LA8_37 = input.LA(3);

                if ( (LA8_37=='t') ) {
                    int LA8_53 = input.LA(4);

                    if ( (LA8_53=='o') ) {
                        int LA8_59 = input.LA(5);

                        if ( (LA8_59=='-') ) {
                            alt8=16;
                        }
                        else {
                            alt8=23;}
                    }
                    else {
                        alt8=23;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='v') ) {
            int LA8_12 = input.LA(2);

            if ( (LA8_12=='a') ) {
                int LA8_38 = input.LA(3);

                if ( (LA8_38=='r') ) {
                    int LA8_54 = input.LA(4);

                    if ( ((LA8_54>='0' && LA8_54<='9')||(LA8_54>='A' && LA8_54<='Z')||LA8_54=='_'||(LA8_54>='a' && LA8_54<='z')) ) {
                        alt8=23;
                    }
                    else {
                        alt8=17;}
                }
                else {
                    alt8=23;}
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='.') ) {
            int LA8_13 = input.LA(2);

            if ( (LA8_13=='*') ) {
                alt8=19;
            }
            else {
                alt8=18;}
        }
        else if ( (LA8_0=='$') ) {
            int LA8_14 = input.LA(2);

            if ( (LA8_14=='{') ) {
                alt8=20;
            }
            else {
                alt8=27;}
        }
        else if ( (LA8_0=='\'') ) {
            alt8=21;
        }
        else if ( (LA8_0=='\"') ) {
            alt8=22;
        }
        else if ( (LA8_0=='^') ) {
            int LA8_17 = input.LA(2);

            if ( ((LA8_17>='A' && LA8_17<='Z')||LA8_17=='_'||(LA8_17>='a' && LA8_17<='z')) ) {
                alt8=23;
            }
            else {
                alt8=27;}
        }
        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='b' && LA8_0<='e')||(LA8_0>='g' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='l')||(LA8_0>='n' && LA8_0<='s')||LA8_0=='u'||(LA8_0>='w' && LA8_0<='z')) ) {
            alt8=23;
        }
        else if ( (LA8_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt8=24;
                }
                break;
            case '/':
                {
                alt8=25;
                }
                break;
            default:
                alt8=27;}

        }
        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
            alt8=26;
        }
        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||LA8_0=='#'||(LA8_0>='%' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='-')||(LA8_0>='0' && LA8_0<='9')||(LA8_0>=';' && LA8_0<='<')||(LA8_0>='>' && LA8_0<='?')||LA8_0=='['||LA8_0==']'||LA8_0=='`'||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFE')) ) {
            alt8=27;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 0, input);

            throw nvae;
        }
        switch (alt8) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:37: T16
                {
                mT16(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:41: T17
                {
                mT17(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:45: T18
                {
                mT18(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:49: T19
                {
                mT19(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:53: T20
                {
                mT20(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:57: T21
                {
                mT21(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:61: T22
                {
                mT22(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:65: T23
                {
                mT23(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:69: T24
                {
                mT24(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:73: T25
                {
                mT25(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:77: T26
                {
                mT26(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:81: T27
                {
                mT27(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:85: T28
                {
                mT28(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:89: T29
                {
                mT29(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:93: T30
                {
                mT30(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:97: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}