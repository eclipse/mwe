package org.eclipse.emf.mwe2.language.ui.highlighting;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MweHighlightingLexer extends Lexer {
    public static final int KEYWORD_AT=7;
    public static final int KEYWORD_AUTO_INJECT=9;
    public static final int RULE_STRING=20;
    public static final int RULE_SL_COMMENT=22;
    public static final int KEYWORD_VAR=5;
    public static final int KEYWORD_IMPORT=12;
    public static final int KEYWORD_MODULE=4;
    public static final int KEYWORD_ASSIGN=6;
    public static final int EOF=-1;
    public static final int KEYWORD_COLON=8;
    public static final int KEYWORD_NULL=17;
    public static final int RULE_ID=18;
    public static final int KEYWORD_TRUE=16;
    public static final int RULE_WS=23;
    public static final int KEYWORD_STAR=14;
    public static final int RULE_ANY_OTHER=24;
    public static final int KEYWORD_OPENBRACE=10;
    public static final int KEYWORD_CLOSINGBRACE=11;
    public static final int KEYWORD_DOT=13;
    public static final int RULE_INT=19;
    public static final int RULE_ML_COMMENT=21;
    public static final int KEYWORD_FALSE=15;

    // delegates
    // delegators

    public MweHighlightingLexer() {;} 
    public MweHighlightingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MweHighlightingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MweHighlightingLexer.g"; }

    // $ANTLR start "KEYWORD_MODULE"
    public final void mKEYWORD_MODULE() throws RecognitionException {
        try {
            int _type = KEYWORD_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:15:16: ( 'module' )
            // MweHighlightingLexer.g:15:18: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_MODULE"

    // $ANTLR start "KEYWORD_VAR"
    public final void mKEYWORD_VAR() throws RecognitionException {
        try {
            int _type = KEYWORD_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:18:13: ( 'var' )
            // MweHighlightingLexer.g:18:15: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_VAR"

    // $ANTLR start "KEYWORD_ASSIGN"
    public final void mKEYWORD_ASSIGN() throws RecognitionException {
        try {
            int _type = KEYWORD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:19:16: ( '=' )
            // MweHighlightingLexer.g:19:18: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_ASSIGN"

    // $ANTLR start "KEYWORD_AT"
    public final void mKEYWORD_AT() throws RecognitionException {
        try {
            int _type = KEYWORD_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:22:12: ( '@' )
            // MweHighlightingLexer.g:22:14: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_AT"

    // $ANTLR start "KEYWORD_COLON"
    public final void mKEYWORD_COLON() throws RecognitionException {
        try {
            int _type = KEYWORD_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:23:15: ( ':' )
            // MweHighlightingLexer.g:23:17: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_COLON"

    // $ANTLR start "KEYWORD_AUTO_INJECT"
    public final void mKEYWORD_AUTO_INJECT() throws RecognitionException {
        try {
            int _type = KEYWORD_AUTO_INJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:24:21: ( 'auto-inject' )
            // MweHighlightingLexer.g:24:23: 'auto-inject'
            {
            match("auto-inject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_AUTO_INJECT"

    // $ANTLR start "KEYWORD_OPENBRACE"
    public final void mKEYWORD_OPENBRACE() throws RecognitionException {
        try {
            int _type = KEYWORD_OPENBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:25:19: ( '{' )
            // MweHighlightingLexer.g:25:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_OPENBRACE"

    // $ANTLR start "KEYWORD_CLOSINGBRACE"
    public final void mKEYWORD_CLOSINGBRACE() throws RecognitionException {
        try {
            int _type = KEYWORD_CLOSINGBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:26:22: ( '}' )
            // MweHighlightingLexer.g:26:24: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_CLOSINGBRACE"

    // $ANTLR start "KEYWORD_IMPORT"
    public final void mKEYWORD_IMPORT() throws RecognitionException {
        try {
            int _type = KEYWORD_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:29:16: ( 'import' )
            // MweHighlightingLexer.g:29:18: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_IMPORT"

    // $ANTLR start "KEYWORD_DOT"
    public final void mKEYWORD_DOT() throws RecognitionException {
        try {
            int _type = KEYWORD_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:32:13: ( '.' )
            // MweHighlightingLexer.g:32:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_DOT"

    // $ANTLR start "KEYWORD_STAR"
    public final void mKEYWORD_STAR() throws RecognitionException {
        try {
            int _type = KEYWORD_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:33:14: ( '.*' )
            // MweHighlightingLexer.g:33:16: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_STAR"

    // $ANTLR start "KEYWORD_FALSE"
    public final void mKEYWORD_FALSE() throws RecognitionException {
        try {
            int _type = KEYWORD_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:36:15: ( 'false' )
            // MweHighlightingLexer.g:36:17: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_FALSE"

    // $ANTLR start "KEYWORD_TRUE"
    public final void mKEYWORD_TRUE() throws RecognitionException {
        try {
            int _type = KEYWORD_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:37:14: ( 'true' )
            // MweHighlightingLexer.g:37:16: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_TRUE"

    // $ANTLR start "KEYWORD_NULL"
    public final void mKEYWORD_NULL() throws RecognitionException {
        try {
            int _type = KEYWORD_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:40:14: ( 'null' )
            // MweHighlightingLexer.g:40:16: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_NULL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:42:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // MweHighlightingLexer.g:42:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // MweHighlightingLexer.g:42:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // MweHighlightingLexer.g:42:11: '^'
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

            // MweHighlightingLexer.g:42:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MweHighlightingLexer.g:
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
            // MweHighlightingLexer.g:44:10: ( ( '0' .. '9' )+ )
            // MweHighlightingLexer.g:44:12: ( '0' .. '9' )+
            {
            // MweHighlightingLexer.g:44:12: ( '0' .. '9' )+
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
            	    // MweHighlightingLexer.g:44:13: '0' .. '9'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:47:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // MweHighlightingLexer.g:48:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // MweHighlightingLexer.g:48:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // MweHighlightingLexer.g:49:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // MweHighlightingLexer.g:49:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MweHighlightingLexer.g:49:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // MweHighlightingLexer.g:49:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt4=11;
                    	    alt4 = dfa4.predict(input);
                    	    switch (alt4) {
                    	        case 1 :
                    	            // MweHighlightingLexer.g:49:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // MweHighlightingLexer.g:49:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // MweHighlightingLexer.g:49:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // MweHighlightingLexer.g:49:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // MweHighlightingLexer.g:49:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // MweHighlightingLexer.g:49:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // MweHighlightingLexer.g:49:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // MweHighlightingLexer.g:49:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // MweHighlightingLexer.g:49:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // MweHighlightingLexer.g:49:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // MweHighlightingLexer.g:49:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // MweHighlightingLexer.g:49:69: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // MweHighlightingLexer.g:50:5: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // MweHighlightingLexer.g:50:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // MweHighlightingLexer.g:50:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // MweHighlightingLexer.g:50:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt6=11;
                    	    alt6 = dfa6.predict(input);
                    	    switch (alt6) {
                    	        case 1 :
                    	            // MweHighlightingLexer.g:50:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // MweHighlightingLexer.g:50:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // MweHighlightingLexer.g:50:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // MweHighlightingLexer.g:50:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // MweHighlightingLexer.g:50:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // MweHighlightingLexer.g:50:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // MweHighlightingLexer.g:50:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // MweHighlightingLexer.g:50:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // MweHighlightingLexer.g:50:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // MweHighlightingLexer.g:50:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // MweHighlightingLexer.g:50:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // MweHighlightingLexer.g:50:69: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MweHighlightingLexer.g:53:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // MweHighlightingLexer.g:53:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // MweHighlightingLexer.g:53:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MweHighlightingLexer.g:53:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // MweHighlightingLexer.g:55:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // MweHighlightingLexer.g:55:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // MweHighlightingLexer.g:55:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MweHighlightingLexer.g:55:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // MweHighlightingLexer.g:55:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // MweHighlightingLexer.g:55:41: ( '\\r' )? '\\n'
                    {
                    // MweHighlightingLexer.g:55:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // MweHighlightingLexer.g:55:41: '\\r'
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
            // MweHighlightingLexer.g:57:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // MweHighlightingLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // MweHighlightingLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MweHighlightingLexer.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // MweHighlightingLexer.g:59:16: ( . )
            // MweHighlightingLexer.g:59:18: .
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
        // MweHighlightingLexer.g:1:8: ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | KEYWORD_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=21;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // MweHighlightingLexer.g:1:10: KEYWORD_MODULE
                {
                mKEYWORD_MODULE(); 

                }
                break;
            case 2 :
                // MweHighlightingLexer.g:1:25: KEYWORD_VAR
                {
                mKEYWORD_VAR(); 

                }
                break;
            case 3 :
                // MweHighlightingLexer.g:1:37: KEYWORD_ASSIGN
                {
                mKEYWORD_ASSIGN(); 

                }
                break;
            case 4 :
                // MweHighlightingLexer.g:1:52: KEYWORD_AT
                {
                mKEYWORD_AT(); 

                }
                break;
            case 5 :
                // MweHighlightingLexer.g:1:63: KEYWORD_COLON
                {
                mKEYWORD_COLON(); 

                }
                break;
            case 6 :
                // MweHighlightingLexer.g:1:77: KEYWORD_AUTO_INJECT
                {
                mKEYWORD_AUTO_INJECT(); 

                }
                break;
            case 7 :
                // MweHighlightingLexer.g:1:97: KEYWORD_OPENBRACE
                {
                mKEYWORD_OPENBRACE(); 

                }
                break;
            case 8 :
                // MweHighlightingLexer.g:1:115: KEYWORD_CLOSINGBRACE
                {
                mKEYWORD_CLOSINGBRACE(); 

                }
                break;
            case 9 :
                // MweHighlightingLexer.g:1:136: KEYWORD_IMPORT
                {
                mKEYWORD_IMPORT(); 

                }
                break;
            case 10 :
                // MweHighlightingLexer.g:1:151: KEYWORD_DOT
                {
                mKEYWORD_DOT(); 

                }
                break;
            case 11 :
                // MweHighlightingLexer.g:1:163: KEYWORD_STAR
                {
                mKEYWORD_STAR(); 

                }
                break;
            case 12 :
                // MweHighlightingLexer.g:1:176: KEYWORD_FALSE
                {
                mKEYWORD_FALSE(); 

                }
                break;
            case 13 :
                // MweHighlightingLexer.g:1:190: KEYWORD_TRUE
                {
                mKEYWORD_TRUE(); 

                }
                break;
            case 14 :
                // MweHighlightingLexer.g:1:203: KEYWORD_NULL
                {
                mKEYWORD_NULL(); 

                }
                break;
            case 15 :
                // MweHighlightingLexer.g:1:216: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // MweHighlightingLexer.g:1:224: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // MweHighlightingLexer.g:1:233: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // MweHighlightingLexer.g:1:245: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // MweHighlightingLexer.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // MweHighlightingLexer.g:1:277: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // MweHighlightingLexer.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\42\11\uffff\1\52\2\uffff";
    static final String DFA4_maxS =
        "\1\164\11\uffff\1\57\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\6\1\uffff\1\11\2\uffff\1\7\7\uffff\1\12\54\uffff\1\10\5\uffff\1\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\4\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "49:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\42\11\uffff\1\52\2\uffff";
    static final String DFA6_maxS =
        "\1\164\11\uffff\1\57\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\6\1\uffff\1\11\2\uffff\1\7\7\uffff\1\12\54\uffff\1\10\5\uffff\1\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\4\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "50:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\2\27\3\uffff\1\27\2\uffff\1\27\1\41\3\27\1\25\2\uffff\3\25\2\uffff\1\27\1\uffff\1\27\3\uffff\1\27\2\uffff\1\27\2\uffff\3\27\5\uffff\1\27\1\62\6\27\1\uffff\3\27\1\74\1\75\1\27\1\uffff\1\27\1\100\2\uffff\1\101\1\102\3\uffff";
    static final String DFA14_eofS =
        "\103\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\141\3\uffff\1\165\2\uffff\1\155\1\52\1\141\1\162\1\165\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\uffff\1\162\3\uffff\1\164\2\uffff\1\160\2\uffff\1\154\1\165\1\154\5\uffff\1\165\1\60\2\157\1\163\1\145\2\154\1\uffff\1\55\1\162\1\145\2\60\1\145\1\uffff\1\164\1\60\2\uffff\2\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\141\3\uffff\1\165\2\uffff\1\155\1\52\1\141\1\162\1\165\1\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\162\3\uffff\1\164\2\uffff\1\160\2\uffff\1\154\1\165\1\154\5\uffff\1\165\1\172\2\157\1\163\1\145\2\154\1\uffff\1\55\1\162\1\145\2\172\1\145\1\uffff\1\164\1\172\2\uffff\2\172\3\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\6\uffff\1\17\1\20\3\uffff\1\24\1\25\1\uffff\1\17\1\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\13\1\12\3\uffff\1\20\1\21\1\22\1\23\1\24\10\uffff\1\2\6\uffff\1\6\2\uffff\1\15\1\16\2\uffff\1\14\1\1\1\11";
    static final String DFA14_specialS =
        "\1\1\20\uffff\1\0\1\2\60\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\6\25\1\12\1\23\12\20\1\5\2\25\1\3\2\25\1\4\32\17\3\25\1\16\1\17\1\25\1\6\4\17\1\13\2\17\1\11\3\17\1\1\1\15\5\17\1\14\1\17\1\2\4\17\1\7\1\25\1\10\uff82\25",
            "\1\26",
            "\1\30",
            "",
            "",
            "",
            "\1\34",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\55",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\76",
            "",
            "\1\77",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | KEYWORD_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='m') ) {s = 1;}

                        else if ( (LA14_0=='v') ) {s = 2;}

                        else if ( (LA14_0=='=') ) {s = 3;}

                        else if ( (LA14_0=='@') ) {s = 4;}

                        else if ( (LA14_0==':') ) {s = 5;}

                        else if ( (LA14_0=='a') ) {s = 6;}

                        else if ( (LA14_0=='{') ) {s = 7;}

                        else if ( (LA14_0=='}') ) {s = 8;}

                        else if ( (LA14_0=='i') ) {s = 9;}

                        else if ( (LA14_0=='.') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='t') ) {s = 12;}

                        else if ( (LA14_0=='n') ) {s = 13;}

                        else if ( (LA14_0=='^') ) {s = 14;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='o' && LA14_0<='s')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='\"') ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 20;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='?')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 38;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}