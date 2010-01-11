package org.eclipse.emf.mwe.properties.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEPropertiesLexer extends Lexer {
    public static final int T10=10;
    public static final int T14=14;
    public static final int RULE_LINE_TERMINATOR=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=4;
    public static final int T11=11;
    public static final int T9=9;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int T12=12;
    public static final int Tokens=16;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T13=13;
    public InternalMWEPropertiesLexer() {;} 
    public InternalMWEPropertiesLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:10:4: ( '=' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:10:6: '='
            {
            match('='); 

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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:11:5: ( ':' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:11:7: ':'
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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:12:5: ( '\\\\:' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:12:7: '\\\\:'
            {
            match("\\:"); 


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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:13:5: ( '\\\\=' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:13:7: '\\\\='
            {
            match("\\="); 


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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:14:5: ( '/' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:14:7: '/'
            {
            match('/'); 

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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:15:5: ( '\\\\' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:15:7: '\\\\'
            {
            match('\\'); 

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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:16:5: ( '.' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:16:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start RULE_LINE_TERMINATOR
    public final void mRULE_LINE_TERMINATOR() throws RecognitionException {
        try {
            int _type = RULE_LINE_TERMINATOR;
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:22: ( ( '\\r' ( '\\n' )? | '\\n' ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:24: ( '\\r' ( '\\n' )? | '\\n' )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:24: ( '\\r' ( '\\n' )? | '\\n' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            else if ( (LA2_0=='\n') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1941:24: ( '\\r' ( '\\n' )? | '\\n' )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:25: '\\r' ( '\\n' )?
                    {
                    match('\r'); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:30: ( '\\n' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='\n') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:30: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1941:36: '\\n'
                    {
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
    // $ANTLR end RULE_LINE_TERMINATOR

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1943:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1943:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1943:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1943:11: '^'
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

            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1943:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:
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
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1945:17: ( ( '#' | '!' ) (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1945:19: ( '#' | '!' ) (~ ( ( '\\n' | '\\r' ) ) )*
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1945:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1945:29: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
                }
            } while (true);


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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1947:9: ( ( ' ' | '\\t' )+ )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1947:11: ( ' ' | '\\t' )+
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1947:11: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1949:16: ( . )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1949:18: .
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
        // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | RULE_LINE_TERMINATOR | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt7=12;
        int LA7_0 = input.LA(1);

        if ( (LA7_0=='=') ) {
            alt7=1;
        }
        else if ( (LA7_0==':') ) {
            alt7=2;
        }
        else if ( (LA7_0=='\\') ) {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt7=4;
                }
                break;
            case ':':
                {
                alt7=3;
                }
                break;
            default:
                alt7=6;}

        }
        else if ( (LA7_0=='/') ) {
            alt7=5;
        }
        else if ( (LA7_0=='.') ) {
            alt7=7;
        }
        else if ( (LA7_0=='\r') ) {
            alt7=8;
        }
        else if ( (LA7_0=='\n') ) {
            alt7=8;
        }
        else if ( (LA7_0=='^') ) {
            int LA7_8 = input.LA(2);

            if ( ((LA7_8>='A' && LA7_8<='Z')||LA7_8=='_'||(LA7_8>='a' && LA7_8<='z')) ) {
                alt7=9;
            }
            else {
                alt7=12;}
        }
        else if ( ((LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
            alt7=9;
        }
        else if ( (LA7_0=='!'||LA7_0=='#') ) {
            alt7=10;
        }
        else if ( (LA7_0=='\t'||LA7_0==' ') ) {
            alt7=11;
        }
        else if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||LA7_0=='\"'||(LA7_0>='$' && LA7_0<='-')||(LA7_0>='0' && LA7_0<='9')||(LA7_0>=';' && LA7_0<='<')||(LA7_0>='>' && LA7_0<='@')||LA7_0=='['||LA7_0==']'||LA7_0=='`'||(LA7_0>='{' && LA7_0<='\uFFFE')) ) {
            alt7=12;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | RULE_LINE_TERMINATOR | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 7, 0, input);

            throw nvae;
        }
        switch (alt7) {
            case 1 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:37: RULE_LINE_TERMINATOR
                {
                mRULE_LINE_TERMINATOR(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:58: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:66: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:82: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/contentassist/antlr/internal/InternalMWEProperties.g:1:90: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}