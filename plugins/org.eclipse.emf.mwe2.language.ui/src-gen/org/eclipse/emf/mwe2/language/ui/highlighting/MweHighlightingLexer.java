package org.eclipse.emf.mwe2.language.ui.highlighting;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MweHighlightingLexer extends Lexer {
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_ID=20;
    public static final int RULE_STRING=22;
    public static final int KEYWORD_OPENBRACE=18;
    public static final int KEYWORD_VAR=6;
    public static final int KEYWORD_SEMICOLON=17;
    public static final int KEYWORD_IMPORT=4;
    public static final int RULE_WS=25;
    public static final int KEYWORD_CLOSINGBRACE=19;
    public static final int RULE_INT=21;
    public static final int EOF=-1;
    public static final int KEYWORD_ASSIGN=15;
    public static final int Tokens=27;
    public static final int RULE_ANY_OTHER=26;
    public static final int KEYWORD_COLON=14;
    public static final int KEYWORD_FALSE=8;
    public static final int RULE_SL_COMMENT=24;
    public static final int KEYWORD_COMMA=16;
    public static final int KEYWORD_AT=13;
    public static final int KEYWORD_TRUE=9;
    public static final int KEYWORD_AS=10;
    public static final int KEYWORD_MODULE=7;
    public static final int KEYWORD_AUTO_INJECT=5;
    public static final int KEYWORD_DOT=11;
    public static final int KEYWORD_STAR=12;
    public MweHighlightingLexer() {;} 
    public MweHighlightingLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g"; }

    // $ANTLR start KEYWORD_IMPORT
    public final void mKEYWORD_IMPORT() throws RecognitionException {
        try {
            int _type = KEYWORD_IMPORT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:16:16: ( 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:16:18: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_IMPORT

    // $ANTLR start KEYWORD_AUTO_INJECT
    public final void mKEYWORD_AUTO_INJECT() throws RecognitionException {
        try {
            int _type = KEYWORD_AUTO_INJECT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:18:21: ( 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:18:23: 'auto-inject'
            {
            match("auto-inject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_AUTO_INJECT

    // $ANTLR start KEYWORD_VAR
    public final void mKEYWORD_VAR() throws RecognitionException {
        try {
            int _type = KEYWORD_VAR;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:20:13: ( 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:20:15: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_VAR

    // $ANTLR start KEYWORD_MODULE
    public final void mKEYWORD_MODULE() throws RecognitionException {
        try {
            int _type = KEYWORD_MODULE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:22:16: ( 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:22:18: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_MODULE

    // $ANTLR start KEYWORD_FALSE
    public final void mKEYWORD_FALSE() throws RecognitionException {
        try {
            int _type = KEYWORD_FALSE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:24:15: ( 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:24:17: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_FALSE

    // $ANTLR start KEYWORD_TRUE
    public final void mKEYWORD_TRUE() throws RecognitionException {
        try {
            int _type = KEYWORD_TRUE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:26:14: ( 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:26:16: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_TRUE

    // $ANTLR start KEYWORD_AS
    public final void mKEYWORD_AS() throws RecognitionException {
        try {
            int _type = KEYWORD_AS;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:28:12: ( 'as' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:28:14: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_AS

    // $ANTLR start KEYWORD_DOT
    public final void mKEYWORD_DOT() throws RecognitionException {
        try {
            int _type = KEYWORD_DOT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:30:13: ( '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:30:15: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_DOT

    // $ANTLR start KEYWORD_STAR
    public final void mKEYWORD_STAR() throws RecognitionException {
        try {
            int _type = KEYWORD_STAR;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:32:14: ( '*' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:32:16: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_STAR

    // $ANTLR start KEYWORD_AT
    public final void mKEYWORD_AT() throws RecognitionException {
        try {
            int _type = KEYWORD_AT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:34:12: ( '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:34:14: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_AT

    // $ANTLR start KEYWORD_COLON
    public final void mKEYWORD_COLON() throws RecognitionException {
        try {
            int _type = KEYWORD_COLON;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:36:15: ( ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:36:17: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_COLON

    // $ANTLR start KEYWORD_ASSIGN
    public final void mKEYWORD_ASSIGN() throws RecognitionException {
        try {
            int _type = KEYWORD_ASSIGN;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:38:16: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:38:18: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_ASSIGN

    // $ANTLR start KEYWORD_COMMA
    public final void mKEYWORD_COMMA() throws RecognitionException {
        try {
            int _type = KEYWORD_COMMA;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:40:15: ( ',' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:40:17: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_COMMA

    // $ANTLR start KEYWORD_SEMICOLON
    public final void mKEYWORD_SEMICOLON() throws RecognitionException {
        try {
            int _type = KEYWORD_SEMICOLON;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:42:19: ( ';' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:42:21: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_SEMICOLON

    // $ANTLR start KEYWORD_OPENBRACE
    public final void mKEYWORD_OPENBRACE() throws RecognitionException {
        try {
            int _type = KEYWORD_OPENBRACE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:44:19: ( '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:44:21: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_OPENBRACE

    // $ANTLR start KEYWORD_CLOSINGBRACE
    public final void mKEYWORD_CLOSINGBRACE() throws RecognitionException {
        try {
            int _type = KEYWORD_CLOSINGBRACE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:22: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:24: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_CLOSINGBRACE

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:49:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:49:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:49:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:49:11: '^'
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

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:49:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:
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

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:51:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:51:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:51:12: ( '0' .. '9' )+
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
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:51:13: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("53:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:53:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:55:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:55:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:55:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:55:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:57:41: '\\r'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:59:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:59:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:59:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:61:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:61:18: .
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
        // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:8: ( KEYWORD_IMPORT | KEYWORD_AUTO_INJECT | KEYWORD_VAR | KEYWORD_MODULE | KEYWORD_FALSE | KEYWORD_TRUE | KEYWORD_AS | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_AT | KEYWORD_COLON | KEYWORD_ASSIGN | KEYWORD_COMMA | KEYWORD_SEMICOLON | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=23;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='i') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='m') ) {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='p') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='o') ) {
                        int LA12_53 = input.LA(5);

                        if ( (LA12_53=='r') ) {
                            int LA12_59 = input.LA(6);

                            if ( (LA12_59=='t') ) {
                                int LA12_64 = input.LA(7);

                                if ( ((LA12_64>='0' && LA12_64<='9')||(LA12_64>='A' && LA12_64<='Z')||LA12_64=='_'||(LA12_64>='a' && LA12_64<='z')) ) {
                                    alt12=17;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA12_26 = input.LA(3);

                if ( ((LA12_26>='0' && LA12_26<='9')||(LA12_26>='A' && LA12_26<='Z')||LA12_26=='_'||(LA12_26>='a' && LA12_26<='z')) ) {
                    alt12=17;
                }
                else {
                    alt12=7;}
                }
                break;
            case 'u':
                {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='t') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='o') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='-') ) {
                            alt12=2;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
                }
                break;
            default:
                alt12=17;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='a') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='r') ) {
                    int LA12_49 = input.LA(4);

                    if ( ((LA12_49>='0' && LA12_49<='9')||(LA12_49>='A' && LA12_49<='Z')||LA12_49=='_'||(LA12_49>='a' && LA12_49<='z')) ) {
                        alt12=17;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='d') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='u') ) {
                        int LA12_56 = input.LA(5);

                        if ( (LA12_56=='l') ) {
                            int LA12_61 = input.LA(6);

                            if ( (LA12_61=='e') ) {
                                int LA12_65 = input.LA(7);

                                if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                                    alt12=17;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='l') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='s') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='e') ) {
                            int LA12_62 = input.LA(6);

                            if ( ((LA12_62>='0' && LA12_62<='9')||(LA12_62>='A' && LA12_62<='Z')||LA12_62=='_'||(LA12_62>='a' && LA12_62<='z')) ) {
                                alt12=17;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='r') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='u') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='e') ) {
                        int LA12_58 = input.LA(5);

                        if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                            alt12=17;
                        }
                        else {
                            alt12=6;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=8;
        }
        else if ( (LA12_0=='*') ) {
            alt12=9;
        }
        else if ( (LA12_0=='@') ) {
            alt12=10;
        }
        else if ( (LA12_0==':') ) {
            alt12=11;
        }
        else if ( (LA12_0=='=') ) {
            alt12=12;
        }
        else if ( (LA12_0==',') ) {
            alt12=13;
        }
        else if ( (LA12_0==';') ) {
            alt12=14;
        }
        else if ( (LA12_0=='{') ) {
            alt12=15;
        }
        else if ( (LA12_0=='}') ) {
            alt12=16;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_16 = input.LA(2);

            if ( ((LA12_16>='A' && LA12_16<='Z')||LA12_16=='_'||(LA12_16>='a' && LA12_16<='z')) ) {
                alt12=17;
            }
            else {
                alt12=23;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='s')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12=17;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=18;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=19;
            }
            else {
                alt12=23;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFE')) ) {
                alt12=19;
            }
            else {
                alt12=23;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=21;
                }
                break;
            case '*':
                {
                alt12=20;
                }
                break;
            default:
                alt12=23;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=22;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||LA12_0=='+'||LA12_0=='-'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='?')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=23;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_IMPORT | KEYWORD_AUTO_INJECT | KEYWORD_VAR | KEYWORD_MODULE | KEYWORD_FALSE | KEYWORD_TRUE | KEYWORD_AS | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_AT | KEYWORD_COLON | KEYWORD_ASSIGN | KEYWORD_COMMA | KEYWORD_SEMICOLON | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:10: KEYWORD_IMPORT
                {
                mKEYWORD_IMPORT(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:25: KEYWORD_AUTO_INJECT
                {
                mKEYWORD_AUTO_INJECT(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:45: KEYWORD_VAR
                {
                mKEYWORD_VAR(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:57: KEYWORD_MODULE
                {
                mKEYWORD_MODULE(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:72: KEYWORD_FALSE
                {
                mKEYWORD_FALSE(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:86: KEYWORD_TRUE
                {
                mKEYWORD_TRUE(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:99: KEYWORD_AS
                {
                mKEYWORD_AS(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:110: KEYWORD_DOT
                {
                mKEYWORD_DOT(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:122: KEYWORD_STAR
                {
                mKEYWORD_STAR(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:135: KEYWORD_AT
                {
                mKEYWORD_AT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:146: KEYWORD_COLON
                {
                mKEYWORD_COLON(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:160: KEYWORD_ASSIGN
                {
                mKEYWORD_ASSIGN(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:175: KEYWORD_COMMA
                {
                mKEYWORD_COMMA(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:189: KEYWORD_SEMICOLON
                {
                mKEYWORD_SEMICOLON(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:207: KEYWORD_OPENBRACE
                {
                mKEYWORD_OPENBRACE(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:225: KEYWORD_CLOSINGBRACE
                {
                mKEYWORD_CLOSINGBRACE(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:246: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:254: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:275: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:291: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:307: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:315: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}