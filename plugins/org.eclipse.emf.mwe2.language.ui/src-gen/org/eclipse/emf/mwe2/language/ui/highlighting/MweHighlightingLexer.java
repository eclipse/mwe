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
    public static final int KEYWORD_COLON=8;
    public static final int RULE_ID=17;
    public static final int KEYWORD_ASSIGN=6;
    public static final int RULE_ANY_OTHER=22;
    public static final int KEYWORD_IMPORT=12;
    public static final int KEYWORD_STAR=14;
    public static final int KEYWORD_FALSE=15;
    public static final int KEYWORD_AUTO_INJECT=9;
    public static final int RULE_SL_COMMENT=20;
    public static final int EOF=-1;
    public static final int KEYWORD_CLOSINGBRACE=11;
    public static final int RULE_ML_COMMENT=19;
    public static final int KEYWORD_MODULE=4;
    public static final int RULE_STRING=18;
    public static final int KEYWORD_TRUE=16;
    public static final int KEYWORD_DOT=13;
    public static final int KEYWORD_OPENBRACE=10;
    public static final int KEYWORD_VAR=5;
    public static final int RULE_WS=21;

    // delegates
    // delegators

    public MweHighlightingLexer() {;} 
    public MweHighlightingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MweHighlightingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g"; }

    // $ANTLR start "KEYWORD_MODULE"
    public final void mKEYWORD_MODULE() throws RecognitionException {
        try {
            int _type = KEYWORD_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:15:16: ( 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:15:18: 'module'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:18:13: ( 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:18:15: 'var'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:19:16: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:19:18: '='
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:22:12: ( '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:22:14: '@'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:23:15: ( ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:23:17: ':'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:24:21: ( 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:24:23: 'auto-inject'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:25:19: ( '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:25:21: '{'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:26:22: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:26:24: '}'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:29:16: ( 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:29:18: 'import'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:32:13: ( '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:32:15: '.'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:33:14: ( '.*' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:33:16: '.*'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:36:15: ( 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:36:17: 'false'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:37:14: ( 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:37:16: 'true'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:39:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:39:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:39:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:39:11: '^'
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

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:39:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:44:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:45:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:45:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt3=11;
                    	    alt3 = dfa3.predict(input);
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:46:69: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:5: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt5=11;
                    	    alt5 = dfa5.predict(input);
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:47:69: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:50:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:50:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:50:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:50:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:52:41: '\\r'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:54:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:54:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:54:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:56:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:56:18: .
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
        // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:8: ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=19;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:10: KEYWORD_MODULE
                {
                mKEYWORD_MODULE(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:25: KEYWORD_VAR
                {
                mKEYWORD_VAR(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:37: KEYWORD_ASSIGN
                {
                mKEYWORD_ASSIGN(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:52: KEYWORD_AT
                {
                mKEYWORD_AT(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:63: KEYWORD_COLON
                {
                mKEYWORD_COLON(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:77: KEYWORD_AUTO_INJECT
                {
                mKEYWORD_AUTO_INJECT(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:97: KEYWORD_OPENBRACE
                {
                mKEYWORD_OPENBRACE(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:115: KEYWORD_CLOSINGBRACE
                {
                mKEYWORD_CLOSINGBRACE(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:136: KEYWORD_IMPORT
                {
                mKEYWORD_IMPORT(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:151: KEYWORD_DOT
                {
                mKEYWORD_DOT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:163: KEYWORD_STAR
                {
                mKEYWORD_STAR(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:176: KEYWORD_FALSE
                {
                mKEYWORD_FALSE(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:190: KEYWORD_TRUE
                {
                mKEYWORD_TRUE(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlightingLexer.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\42\11\uffff\1\52\2\uffff";
    static final String DFA3_maxS =
        "\1\164\11\uffff\1\57\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\6\1\uffff\1\11\2\uffff\1\7\7\uffff\1\12\54\uffff\1\10\5\uffff"+
            "\1\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "46:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )";
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\42\11\uffff\1\52\2\uffff";
    static final String DFA5_maxS =
        "\1\164\11\uffff\1\57\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\6\1\uffff\1\11\2\uffff\1\7\7\uffff\1\12\54\uffff\1\10\5\uffff"+
            "\1\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
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

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "47:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\2\25\3\uffff\1\25\2\uffff\1\25\1\37\2\25\1\23\1\uffff\3"+
        "\23\2\uffff\1\25\1\uffff\1\25\3\uffff\1\25\2\uffff\1\25\2\uffff"+
        "\2\25\4\uffff\1\25\1\55\5\25\1\uffff\3\25\1\66\1\25\1\uffff\1\25"+
        "\1\71\1\uffff\1\72\1\73\3\uffff";
    static final String DFA13_eofS =
        "\74\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\1\141\3\uffff\1\165\2\uffff\1\155\1\52\1\141\1\162\1"+
        "\101\1\uffff\2\0\1\52\2\uffff\1\144\1\uffff\1\162\3\uffff\1\164"+
        "\2\uffff\1\160\2\uffff\1\154\1\165\4\uffff\1\165\1\60\2\157\1\163"+
        "\1\145\1\154\1\uffff\1\55\1\162\1\145\1\60\1\145\1\uffff\1\164\1"+
        "\60\1\uffff\2\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\141\3\uffff\1\165\2\uffff\1\155\1\52\1\141\1\162"+
        "\1\172\1\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\162\3\uffff"+
        "\1\164\2\uffff\1\160\2\uffff\1\154\1\165\4\uffff\1\165\1\172\2\157"+
        "\1\163\1\145\1\154\1\uffff\1\55\1\162\1\145\1\172\1\145\1\uffff"+
        "\1\164\1\172\1\uffff\2\172\3\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\5\uffff\1\16\3\uffff\1\22"+
        "\1\23\1\uffff\1\16\1\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff"+
        "\1\13\1\12\2\uffff\1\17\1\20\1\21\1\22\7\uffff\1\2\5\uffff\1\6\2"+
        "\uffff\1\15\2\uffff\1\14\1\1\1\11";
    static final String DFA13_specialS =
        "\1\2\16\uffff\1\0\1\1\53\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\6\23\1"+
            "\12\1\21\12\23\1\5\2\23\1\3\2\23\1\4\32\16\3\23\1\15\1\16\1"+
            "\23\1\6\4\16\1\13\2\16\1\11\3\16\1\1\6\16\1\14\1\16\1\2\4\16"+
            "\1\7\1\23\1\10\uff82\23",
            "\1\24",
            "\1\26",
            "",
            "",
            "",
            "\1\32",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\40",
            "\1\41",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\46",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "\1\51",
            "",
            "",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\67",
            "",
            "\1\70",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFF')) ) {s = 34;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFF')) ) {s = 34;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='m') ) {s = 1;}

                        else if ( (LA13_0=='v') ) {s = 2;}

                        else if ( (LA13_0=='=') ) {s = 3;}

                        else if ( (LA13_0=='@') ) {s = 4;}

                        else if ( (LA13_0==':') ) {s = 5;}

                        else if ( (LA13_0=='a') ) {s = 6;}

                        else if ( (LA13_0=='{') ) {s = 7;}

                        else if ( (LA13_0=='}') ) {s = 8;}

                        else if ( (LA13_0=='i') ) {s = 9;}

                        else if ( (LA13_0=='.') ) {s = 10;}

                        else if ( (LA13_0=='f') ) {s = 11;}

                        else if ( (LA13_0=='t') ) {s = 12;}

                        else if ( (LA13_0=='^') ) {s = 13;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='s')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {s = 14;}

                        else if ( (LA13_0=='\"') ) {s = 15;}

                        else if ( (LA13_0=='\'') ) {s = 16;}

                        else if ( (LA13_0=='/') ) {s = 17;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 18;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||(LA13_0>='0' && LA13_0<='9')||(LA13_0>=';' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}