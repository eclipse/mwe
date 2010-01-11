package org.eclipse.emf.mwe.concept.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEConceptLexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
    public static final int T14=14;
    public static final int RULE_ID=4;
    public static final int T22=22;
    public static final int T11=11;
    public static final int T9=9;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=5;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=27;
    public static final int RULE_ANY_OTHER=6;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=8;
    public static final int T24=24;
    public static final int T19=19;
    public InternalMWEConceptLexer() {;} 
    public InternalMWEConceptLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:10:4: ( ':' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:10:6: ':'
            {
            match(':'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:11:5: ( '.' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:11:7: '.'
            {
            match('.'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:12:5: ( '\\'' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:12:7: '\\''
            {
            match('\''); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:13:5: ( '\"' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:13:7: '\"'
            {
            match('\"'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:14:5: ( '\\\\' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:14:7: '\\\\'
            {
            match('\\'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:15:5: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:15:7: '{'
            {
            match('{'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:16:5: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:16:7: '}'
            {
            match('}'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:17:5: ( ';' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:17:7: ';'
            {
            match(';'); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:18:5: ( 'property' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:18:7: 'property'
            {
            match("property"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:19:5: ( 'file' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:19:7: 'file'
            {
            match("file"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:20:5: ( 'true' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:20:7: 'true'
            {
            match("true"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:21:5: ( 'false' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:21:7: 'false'
            {
            match("false"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:22:5: ( '=' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:22:7: '='
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:23:5: ( 'import' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:23:7: 'import'
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:24:5: ( '.*' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:24:7: '.*'
            {
            match(".*"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:25:5: ( 'as' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:25:7: 'as'
            {
            match("as"); 


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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:26:5: ( ',' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:26:7: ','
            {
            match(','); 

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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:27:5: ( '${' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:27:7: '${'
            {
            match("${"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3431:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3431:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3431:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3431:11: '^'
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

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3431:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3433:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3433:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3433:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3433:52: .
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3435:41: '\\r'
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3437:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3437:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3437:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:
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
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3439:16: ( . )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3439:18: .
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
        // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=23;
        int LA8_0 = input.LA(1);

        if ( (LA8_0==':') ) {
            alt8=1;
        }
        else if ( (LA8_0=='.') ) {
            int LA8_2 = input.LA(2);

            if ( (LA8_2=='*') ) {
                alt8=15;
            }
            else {
                alt8=2;}
        }
        else if ( (LA8_0=='\'') ) {
            alt8=3;
        }
        else if ( (LA8_0=='\"') ) {
            alt8=4;
        }
        else if ( (LA8_0=='\\') ) {
            alt8=5;
        }
        else if ( (LA8_0=='{') ) {
            alt8=6;
        }
        else if ( (LA8_0=='}') ) {
            alt8=7;
        }
        else if ( (LA8_0==';') ) {
            alt8=8;
        }
        else if ( (LA8_0=='p') ) {
            int LA8_9 = input.LA(2);

            if ( (LA8_9=='r') ) {
                int LA8_31 = input.LA(3);

                if ( (LA8_31=='o') ) {
                    int LA8_44 = input.LA(4);

                    if ( (LA8_44=='p') ) {
                        int LA8_50 = input.LA(5);

                        if ( (LA8_50=='e') ) {
                            int LA8_55 = input.LA(6);

                            if ( (LA8_55=='r') ) {
                                int LA8_60 = input.LA(7);

                                if ( (LA8_60=='t') ) {
                                    int LA8_63 = input.LA(8);

                                    if ( (LA8_63=='y') ) {
                                        int LA8_65 = input.LA(9);

                                        if ( ((LA8_65>='0' && LA8_65<='9')||(LA8_65>='A' && LA8_65<='Z')||LA8_65=='_'||(LA8_65>='a' && LA8_65<='z')) ) {
                                            alt8=19;
                                        }
                                        else {
                                            alt8=9;}
                                    }
                                    else {
                                        alt8=19;}
                                }
                                else {
                                    alt8=19;}
                            }
                            else {
                                alt8=19;}
                        }
                        else {
                            alt8=19;}
                    }
                    else {
                        alt8=19;}
                }
                else {
                    alt8=19;}
            }
            else {
                alt8=19;}
        }
        else if ( (LA8_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA8_33 = input.LA(3);

                if ( (LA8_33=='l') ) {
                    int LA8_45 = input.LA(4);

                    if ( (LA8_45=='s') ) {
                        int LA8_51 = input.LA(5);

                        if ( (LA8_51=='e') ) {
                            int LA8_56 = input.LA(6);

                            if ( ((LA8_56>='0' && LA8_56<='9')||(LA8_56>='A' && LA8_56<='Z')||LA8_56=='_'||(LA8_56>='a' && LA8_56<='z')) ) {
                                alt8=19;
                            }
                            else {
                                alt8=12;}
                        }
                        else {
                            alt8=19;}
                    }
                    else {
                        alt8=19;}
                }
                else {
                    alt8=19;}
                }
                break;
            case 'i':
                {
                int LA8_34 = input.LA(3);

                if ( (LA8_34=='l') ) {
                    int LA8_46 = input.LA(4);

                    if ( (LA8_46=='e') ) {
                        int LA8_52 = input.LA(5);

                        if ( ((LA8_52>='0' && LA8_52<='9')||(LA8_52>='A' && LA8_52<='Z')||LA8_52=='_'||(LA8_52>='a' && LA8_52<='z')) ) {
                            alt8=19;
                        }
                        else {
                            alt8=10;}
                    }
                    else {
                        alt8=19;}
                }
                else {
                    alt8=19;}
                }
                break;
            default:
                alt8=19;}

        }
        else if ( (LA8_0=='t') ) {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='r') ) {
                int LA8_35 = input.LA(3);

                if ( (LA8_35=='u') ) {
                    int LA8_47 = input.LA(4);

                    if ( (LA8_47=='e') ) {
                        int LA8_53 = input.LA(5);

                        if ( ((LA8_53>='0' && LA8_53<='9')||(LA8_53>='A' && LA8_53<='Z')||LA8_53=='_'||(LA8_53>='a' && LA8_53<='z')) ) {
                            alt8=19;
                        }
                        else {
                            alt8=11;}
                    }
                    else {
                        alt8=19;}
                }
                else {
                    alt8=19;}
            }
            else {
                alt8=19;}
        }
        else if ( (LA8_0=='=') ) {
            alt8=13;
        }
        else if ( (LA8_0=='i') ) {
            int LA8_13 = input.LA(2);

            if ( (LA8_13=='m') ) {
                int LA8_37 = input.LA(3);

                if ( (LA8_37=='p') ) {
                    int LA8_48 = input.LA(4);

                    if ( (LA8_48=='o') ) {
                        int LA8_54 = input.LA(5);

                        if ( (LA8_54=='r') ) {
                            int LA8_59 = input.LA(6);

                            if ( (LA8_59=='t') ) {
                                int LA8_62 = input.LA(7);

                                if ( ((LA8_62>='0' && LA8_62<='9')||(LA8_62>='A' && LA8_62<='Z')||LA8_62=='_'||(LA8_62>='a' && LA8_62<='z')) ) {
                                    alt8=19;
                                }
                                else {
                                    alt8=14;}
                            }
                            else {
                                alt8=19;}
                        }
                        else {
                            alt8=19;}
                    }
                    else {
                        alt8=19;}
                }
                else {
                    alt8=19;}
            }
            else {
                alt8=19;}
        }
        else if ( (LA8_0=='a') ) {
            int LA8_14 = input.LA(2);

            if ( (LA8_14=='s') ) {
                int LA8_38 = input.LA(3);

                if ( ((LA8_38>='0' && LA8_38<='9')||(LA8_38>='A' && LA8_38<='Z')||LA8_38=='_'||(LA8_38>='a' && LA8_38<='z')) ) {
                    alt8=19;
                }
                else {
                    alt8=16;}
            }
            else {
                alt8=19;}
        }
        else if ( (LA8_0==',') ) {
            alt8=17;
        }
        else if ( (LA8_0=='$') ) {
            int LA8_16 = input.LA(2);

            if ( (LA8_16=='{') ) {
                alt8=18;
            }
            else {
                alt8=23;}
        }
        else if ( (LA8_0=='^') ) {
            int LA8_17 = input.LA(2);

            if ( ((LA8_17>='A' && LA8_17<='Z')||LA8_17=='_'||(LA8_17>='a' && LA8_17<='z')) ) {
                alt8=19;
            }
            else {
                alt8=23;}
        }
        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='b' && LA8_0<='e')||(LA8_0>='g' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='o')||(LA8_0>='q' && LA8_0<='s')||(LA8_0>='u' && LA8_0<='z')) ) {
            alt8=19;
        }
        else if ( (LA8_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt8=21;
                }
                break;
            case '*':
                {
                alt8=20;
                }
                break;
            default:
                alt8=23;}

        }
        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
            alt8=22;
        }
        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||LA8_0=='#'||(LA8_0>='%' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='+')||LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||LA8_0=='<'||(LA8_0>='>' && LA8_0<='@')||LA8_0=='['||LA8_0==']'||LA8_0=='`'||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFE')) ) {
            alt8=23;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 8, 0, input);

            throw nvae;
        }
        switch (alt8) {
            case 1 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:37: T16
                {
                mT16(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:41: T17
                {
                mT17(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:45: T18
                {
                mT18(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:49: T19
                {
                mT19(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:53: T20
                {
                mT20(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:57: T21
                {
                mT21(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:61: T22
                {
                mT22(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:65: T23
                {
                mT23(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:69: T24
                {
                mT24(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:73: T25
                {
                mT25(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:77: T26
                {
                mT26(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:81: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:89: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:105: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:121: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1:129: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}