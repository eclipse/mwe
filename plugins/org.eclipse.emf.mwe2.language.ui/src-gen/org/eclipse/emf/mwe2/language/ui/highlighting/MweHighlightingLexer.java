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
    public static final int RULE_ML_COMMENT=19;
    public static final int RULE_ID=17;
    public static final int RULE_STRING=18;
    public static final int KEYWORD_OPENBRACE=10;
    public static final int KEYWORD_VAR=5;
    public static final int KEYWORD_IMPORT=12;
    public static final int RULE_WS=21;
    public static final int KEYWORD_CLOSINGBRACE=11;
    public static final int KEYWORD_ASSIGN=6;
    public static final int EOF=-1;
    public static final int Tokens=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int KEYWORD_COLON=8;
    public static final int KEYWORD_FALSE=15;
    public static final int RULE_SL_COMMENT=20;
    public static final int KEYWORD_AT=7;
    public static final int KEYWORD_TRUE=16;
    public static final int KEYWORD_MODULE=4;
    public static final int KEYWORD_AUTO_INJECT=9;
    public static final int KEYWORD_DOT=13;
    public static final int KEYWORD_STAR=14;
    public MweHighlightingLexer() {;} 
    public MweHighlightingLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g"; }

    // $ANTLR start KEYWORD_MODULE
    public final void mKEYWORD_MODULE() throws RecognitionException {
        try {
            int _type = KEYWORD_MODULE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:15:16: ( 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:15:18: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_MODULE

    // $ANTLR start KEYWORD_VAR
    public final void mKEYWORD_VAR() throws RecognitionException {
        try {
            int _type = KEYWORD_VAR;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:18:13: ( 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:18:15: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_VAR

    // $ANTLR start KEYWORD_ASSIGN
    public final void mKEYWORD_ASSIGN() throws RecognitionException {
        try {
            int _type = KEYWORD_ASSIGN;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:19:16: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:19:18: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_ASSIGN

    // $ANTLR start KEYWORD_AT
    public final void mKEYWORD_AT() throws RecognitionException {
        try {
            int _type = KEYWORD_AT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:22:12: ( '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:22:14: '@'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:23:15: ( ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:23:17: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_COLON

    // $ANTLR start KEYWORD_AUTO_INJECT
    public final void mKEYWORD_AUTO_INJECT() throws RecognitionException {
        try {
            int _type = KEYWORD_AUTO_INJECT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:24:21: ( 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:24:23: 'auto-inject'
            {
            match("auto-inject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_AUTO_INJECT

    // $ANTLR start KEYWORD_OPENBRACE
    public final void mKEYWORD_OPENBRACE() throws RecognitionException {
        try {
            int _type = KEYWORD_OPENBRACE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:25:19: ( '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:25:21: '{'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:26:22: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:26:24: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_CLOSINGBRACE

    // $ANTLR start KEYWORD_IMPORT
    public final void mKEYWORD_IMPORT() throws RecognitionException {
        try {
            int _type = KEYWORD_IMPORT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:29:16: ( 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:29:18: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_IMPORT

    // $ANTLR start KEYWORD_DOT
    public final void mKEYWORD_DOT() throws RecognitionException {
        try {
            int _type = KEYWORD_DOT;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:32:13: ( '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:32:15: '.'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:33:14: ( '.*' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:33:16: '.*'
            {
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_STAR

    // $ANTLR start KEYWORD_FALSE
    public final void mKEYWORD_FALSE() throws RecognitionException {
        try {
            int _type = KEYWORD_FALSE;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:36:15: ( 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:36:17: 'false'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:37:14: ( 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:37:16: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_TRUE

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:39:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:39:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:39:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:39:11: '^'
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

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:39:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:44:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:45:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:45:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("45:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt3=11;
                    	    switch ( input.LA(1) ) {
                    	    case 'b':
                    	        {
                    	        alt3=1;
                    	        }
                    	        break;
                    	    case 't':
                    	        {
                    	        alt3=2;
                    	        }
                    	        break;
                    	    case 'n':
                    	        {
                    	        alt3=3;
                    	        }
                    	        break;
                    	    case 'f':
                    	        {
                    	        alt3=4;
                    	        }
                    	        break;
                    	    case 'r':
                    	        {
                    	        alt3=5;
                    	        }
                    	        break;
                    	    case '\"':
                    	        {
                    	        alt3=6;
                    	        }
                    	        break;
                    	    case '\'':
                    	        {
                    	        alt3=7;
                    	        }
                    	        break;
                    	    case '\\':
                    	        {
                    	        alt3=8;
                    	        }
                    	        break;
                    	    case '$':
                    	        {
                    	        alt3=9;
                    	        }
                    	        break;
                    	    case '/':
                    	        {
                    	        int LA3_10 = input.LA(2);

                    	        if ( (LA3_10=='/') ) {
                    	            alt3=10;
                    	        }
                    	        else if ( (LA3_10=='*') ) {
                    	            alt3=11;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("46:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )", 3, 10, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("46:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )", 3, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:46:69: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:5: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )
                    	    int alt5=11;
                    	    switch ( input.LA(1) ) {
                    	    case 'b':
                    	        {
                    	        alt5=1;
                    	        }
                    	        break;
                    	    case 't':
                    	        {
                    	        alt5=2;
                    	        }
                    	        break;
                    	    case 'n':
                    	        {
                    	        alt5=3;
                    	        }
                    	        break;
                    	    case 'f':
                    	        {
                    	        alt5=4;
                    	        }
                    	        break;
                    	    case 'r':
                    	        {
                    	        alt5=5;
                    	        }
                    	        break;
                    	    case '\"':
                    	        {
                    	        alt5=6;
                    	        }
                    	        break;
                    	    case '\'':
                    	        {
                    	        alt5=7;
                    	        }
                    	        break;
                    	    case '\\':
                    	        {
                    	        alt5=8;
                    	        }
                    	        break;
                    	    case '$':
                    	        {
                    	        alt5=9;
                    	        }
                    	        break;
                    	    case '/':
                    	        {
                    	        int LA5_10 = input.LA(2);

                    	        if ( (LA5_10=='*') ) {
                    	            alt5=11;
                    	        }
                    	        else if ( (LA5_10=='/') ) {
                    	            alt5=10;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("47:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )", 5, 10, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("47:16: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '${' | '//' | '/*' )", 5, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:17: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:21: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:25: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:29: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:33: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:37: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:41: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:46: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:51: '${'
                    	            {
                    	            match("${"); 


                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:56: '//'
                    	            {
                    	            match("//"); 


                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:61: '/*'
                    	            {
                    	            match("/*"); 


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:47:69: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:50:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:50:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:50:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:50:52: .
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:52:41: '\\r'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:54:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:54:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:54:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:56:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:56:18: .
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
        // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:8: ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=19;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='m') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='o') ) {
                int LA13_20 = input.LA(3);

                if ( (LA13_20=='d') ) {
                    int LA13_38 = input.LA(4);

                    if ( (LA13_38=='u') ) {
                        int LA13_44 = input.LA(5);

                        if ( (LA13_44=='l') ) {
                            int LA13_50 = input.LA(6);

                            if ( (LA13_50=='e') ) {
                                int LA13_55 = input.LA(7);

                                if ( ((LA13_55>='0' && LA13_55<='9')||(LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {
                                    alt13=14;
                                }
                                else {
                                    alt13=1;}
                            }
                            else {
                                alt13=14;}
                        }
                        else {
                            alt13=14;}
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='v') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='a') ) {
                int LA13_22 = input.LA(3);

                if ( (LA13_22=='r') ) {
                    int LA13_39 = input.LA(4);

                    if ( ((LA13_39>='0' && LA13_39<='9')||(LA13_39>='A' && LA13_39<='Z')||LA13_39=='_'||(LA13_39>='a' && LA13_39<='z')) ) {
                        alt13=14;
                    }
                    else {
                        alt13=2;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='=') ) {
            alt13=3;
        }
        else if ( (LA13_0=='@') ) {
            alt13=4;
        }
        else if ( (LA13_0==':') ) {
            alt13=5;
        }
        else if ( (LA13_0=='a') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='u') ) {
                int LA13_26 = input.LA(3);

                if ( (LA13_26=='t') ) {
                    int LA13_40 = input.LA(4);

                    if ( (LA13_40=='o') ) {
                        int LA13_46 = input.LA(5);

                        if ( (LA13_46=='-') ) {
                            alt13=6;
                        }
                        else {
                            alt13=14;}
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='{') ) {
            alt13=7;
        }
        else if ( (LA13_0=='}') ) {
            alt13=8;
        }
        else if ( (LA13_0=='i') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='m') ) {
                int LA13_29 = input.LA(3);

                if ( (LA13_29=='p') ) {
                    int LA13_41 = input.LA(4);

                    if ( (LA13_41=='o') ) {
                        int LA13_47 = input.LA(5);

                        if ( (LA13_47=='r') ) {
                            int LA13_52 = input.LA(6);

                            if ( (LA13_52=='t') ) {
                                int LA13_56 = input.LA(7);

                                if ( ((LA13_56>='0' && LA13_56<='9')||(LA13_56>='A' && LA13_56<='Z')||LA13_56=='_'||(LA13_56>='a' && LA13_56<='z')) ) {
                                    alt13=14;
                                }
                                else {
                                    alt13=9;}
                            }
                            else {
                                alt13=14;}
                        }
                        else {
                            alt13=14;}
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='.') ) {
            int LA13_10 = input.LA(2);

            if ( (LA13_10=='*') ) {
                alt13=11;
            }
            else {
                alt13=10;}
        }
        else if ( (LA13_0=='f') ) {
            int LA13_11 = input.LA(2);

            if ( (LA13_11=='a') ) {
                int LA13_32 = input.LA(3);

                if ( (LA13_32=='l') ) {
                    int LA13_42 = input.LA(4);

                    if ( (LA13_42=='s') ) {
                        int LA13_48 = input.LA(5);

                        if ( (LA13_48=='e') ) {
                            int LA13_53 = input.LA(6);

                            if ( ((LA13_53>='0' && LA13_53<='9')||(LA13_53>='A' && LA13_53<='Z')||LA13_53=='_'||(LA13_53>='a' && LA13_53<='z')) ) {
                                alt13=14;
                            }
                            else {
                                alt13=12;}
                        }
                        else {
                            alt13=14;}
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='t') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='r') ) {
                int LA13_33 = input.LA(3);

                if ( (LA13_33=='u') ) {
                    int LA13_43 = input.LA(4);

                    if ( (LA13_43=='e') ) {
                        int LA13_49 = input.LA(5);

                        if ( ((LA13_49>='0' && LA13_49<='9')||(LA13_49>='A' && LA13_49<='Z')||LA13_49=='_'||(LA13_49>='a' && LA13_49<='z')) ) {
                            alt13=14;
                        }
                        else {
                            alt13=13;}
                    }
                    else {
                        alt13=14;}
                }
                else {
                    alt13=14;}
            }
            else {
                alt13=14;}
        }
        else if ( (LA13_0=='^') ) {
            int LA13_13 = input.LA(2);

            if ( ((LA13_13>='A' && LA13_13<='Z')||LA13_13=='_'||(LA13_13>='a' && LA13_13<='z')) ) {
                alt13=14;
            }
            else {
                alt13=19;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='s')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {
            alt13=14;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_15 = input.LA(2);

            if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFE')) ) {
                alt13=15;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_16 = input.LA(2);

            if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFE')) ) {
                alt13=15;
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=17;
                }
                break;
            case '*':
                {
                alt13=16;
                }
                break;
            default:
                alt13=19;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=18;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||(LA13_0>='0' && LA13_0<='9')||(LA13_0>=';' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=19;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_MODULE | KEYWORD_VAR | KEYWORD_ASSIGN | KEYWORD_AT | KEYWORD_COLON | KEYWORD_AUTO_INJECT | KEYWORD_OPENBRACE | KEYWORD_CLOSINGBRACE | KEYWORD_IMPORT | KEYWORD_DOT | KEYWORD_STAR | KEYWORD_FALSE | KEYWORD_TRUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:10: KEYWORD_MODULE
                {
                mKEYWORD_MODULE(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:25: KEYWORD_VAR
                {
                mKEYWORD_VAR(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:37: KEYWORD_ASSIGN
                {
                mKEYWORD_ASSIGN(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:52: KEYWORD_AT
                {
                mKEYWORD_AT(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:63: KEYWORD_COLON
                {
                mKEYWORD_COLON(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:77: KEYWORD_AUTO_INJECT
                {
                mKEYWORD_AUTO_INJECT(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:97: KEYWORD_OPENBRACE
                {
                mKEYWORD_OPENBRACE(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:115: KEYWORD_CLOSINGBRACE
                {
                mKEYWORD_CLOSINGBRACE(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:136: KEYWORD_IMPORT
                {
                mKEYWORD_IMPORT(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:151: KEYWORD_DOT
                {
                mKEYWORD_DOT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:163: KEYWORD_STAR
                {
                mKEYWORD_STAR(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:176: KEYWORD_FALSE
                {
                mKEYWORD_FALSE(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:190: KEYWORD_TRUE
                {
                mKEYWORD_TRUE(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/highlighting/MweHighlighting.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}