package org.eclipse.emf.mwe2.language.ui.contentassist;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Mwe2ContentAssistLexer extends Lexer {
    public static final int RULE_ID=24;
    public static final int ReverseSolidusQuotationMark=13;
    public static final int Import=5;
    public static final int RULE_ANY_OTHER=28;
    public static final int Module=6;
    public static final int False=7;
    public static final int FullStopAsterisk=12;
    public static final int LeftCurlyBracket=22;
    public static final int Colon=19;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=26;
    public static final int ReverseSolidusDollarSignLeftCurlyBracket=9;
    public static final int FullStop=18;
    public static final int RULE_ML_COMMENT=25;
    public static final int ReverseSolidusReverseSolidus=15;
    public static final int CommercialAt=21;
    public static final int DollarSignLeftCurlyBracket=11;
    public static final int AutoInject=4;
    public static final int QuotationMark=16;
    public static final int ReverseSolidusApostrophe=14;
    public static final int True=8;
    public static final int RULE_WS=27;
    public static final int EqualsSign=20;
    public static final int Apostrophe=17;
    public static final int Var=10;
    public static final int RightCurlyBracket=23;

      private boolean singleQuotedString = false;
      private boolean doubleQuotedString = false;
      private boolean stringVariable = false;


    // delegates
    // delegators

    public Mwe2ContentAssistLexer() {;} 
    public Mwe2ContentAssistLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Mwe2ContentAssistLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g"; }

    // $ANTLR start "AutoInject"
    public final void mAutoInject() throws RecognitionException {
        try {
            int _type = AutoInject;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:20:12: ({...}? => 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:20:14: {...}? => 'auto-inject'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:22:8: ({...}? => 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:22:10: {...}? => 'import'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:24:8: ({...}? => 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:24:10: {...}? => 'module'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:26:7: ({...}? => 'false' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:26:9: {...}? => 'false'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:28:6: ({...}? => 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:28:8: {...}? => 'true'
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

    // $ANTLR start "ReverseSolidusDollarSignLeftCurlyBracket"
    public final void mReverseSolidusDollarSignLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = ReverseSolidusDollarSignLeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:30:42: ( '\\\\${' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:30:44: '\\\\${'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:32:5: ({...}? => 'var' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:32:7: {...}? => 'var'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:34:28: ( '${' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:34:30: '${'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:36:18: ({...}? => '.*' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:36:20: {...}? => '.*'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:38:29: ( '\\\\\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:38:31: '\\\\\"'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:40:26: ( '\\\\\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:40:28: '\\\\\\''
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:42:30: ( '\\\\\\\\' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:42:32: '\\\\\\\\'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:44:15: ({...}? => '\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:44:17: {...}? => '\"'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:46:12: ({...}? => '\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:46:13: {...}? => '\\''
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

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:48:10: ({...}? => '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:48:12: {...}? => '.'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:50:7: ({...}? => ':' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:50:9: {...}? => ':'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:52:12: ({...}? => '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:52:14: {...}? => '='
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:54:14: ({...}? => '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:54:16: {...}? => '@'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:56:18: ({...}? => '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:56:20: {...}? => '{'
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:58:19: ({...}? => '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:58:21: {...}? => '}'
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
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:17: ({...}? => ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:64:19: {...}? => ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
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
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:17: ({...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:19: {...}? => ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            if ( !((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {
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

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:66:91: ~ ( ( '\\n' | '\\r' ) )
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
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:70:16: ( . )
            // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:70:18: .
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
        // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:8: ( AutoInject | Import | Module | False | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt8=25;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:10: AutoInject
                {
                mAutoInject(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:21: Import
                {
                mImport(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:28: Module
                {
                mModule(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:35: False
                {
                mFalse(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:41: True
                {
                mTrue(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:46: ReverseSolidusDollarSignLeftCurlyBracket
                {
                mReverseSolidusDollarSignLeftCurlyBracket(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:87: Var
                {
                mVar(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:91: DollarSignLeftCurlyBracket
                {
                mDollarSignLeftCurlyBracket(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:118: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:135: ReverseSolidusQuotationMark
                {
                mReverseSolidusQuotationMark(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:163: ReverseSolidusApostrophe
                {
                mReverseSolidusApostrophe(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:188: ReverseSolidusReverseSolidus
                {
                mReverseSolidusReverseSolidus(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:217: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:231: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:242: FullStop
                {
                mFullStop(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:251: Colon
                {
                mColon(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:257: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:268: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:281: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 20 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:298: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 21 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:316: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:324: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:340: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:356: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.eclipse.emf.mwe2.language.ui/src/org/eclipse/emf/mwe2/language/ui/contentassist/Mwe2ContentAssistLexer.g:1:364: RULE_ANY_OTHER
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
        "\1\12\10\uffff\1\0\11\uffff\1\11\17\uffff\1\2\1\4\1\3\1\1\1\10\1"+
        "\7\1\6\1\5\21\uffff\1\20\4\uffff\1\17\4\uffff\1\16\3\uffff\1\15"+
        "\1\uffff\1\13\1\14\3\uffff}>";
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
            return "1:1: Tokens : ( AutoInject | Import | Module | False | True | ReverseSolidusDollarSignLeftCurlyBracket | Var | DollarSignLeftCurlyBracket | FullStopAsterisk | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusReverseSolidus | QuotationMark | Apostrophe | FullStop | Colon | EqualsSign | CommercialAt | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_9=='*') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 34;}

                        else s = 35;

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_38 = input.LA(1);

                         
                        int index8_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 55;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_38);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_35 = input.LA(1);

                         
                        int index8_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 52;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_37 = input.LA(1);

                         
                        int index8_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!doubleQuotedString || stringVariable)) ) {s = 54;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_37);
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
                        int LA8_42 = input.LA(1);

                         
                        int index8_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 59;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_42);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_41 = input.LA(1);

                         
                        int index8_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 58;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_41);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_40 = input.LA(1);

                         
                        int index8_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 57;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_40);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_39 = input.LA(1);

                         
                        int index8_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 56;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index8_39);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
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
                    case 10 : 
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
                    case 11 : 
                        int LA8_76 = input.LA(1);

                         
                        int index8_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 79;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_76);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_77 = input.LA(1);

                         
                        int index8_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 80;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_77);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_74 = input.LA(1);

                         
                        int index8_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 78;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_74);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_70 = input.LA(1);

                         
                        int index8_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 75;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_70);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_65 = input.LA(1);

                         
                        int index8_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString && !doubleQuotedString || stringVariable)) ) {s = 71;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index8_65);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_60 = input.LA(1);

                         
                        int index8_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_60=='-') && ((!singleQuotedString && !doubleQuotedString || stringVariable))) {s = 66;}

                        else s = 23;

                         
                        input.seek(index8_60);
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