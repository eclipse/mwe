package org.eclipse.emf.mwe.properties.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.emf.mwe.properties.services.MWEPropertiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEPropertiesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_SL_COMMENT", "RULE_LINE_TERMINATOR", "RULE_ID", "RULE_ANY_OTHER", "'='", "':'", "'\\\\:'", "'\\\\='", "'/'", "'\\\\'", "'.'"
    };
    public static final int RULE_LINE_TERMINATOR=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_SL_COMMENT=5;

        public InternalMWEPropertiesParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g"; }


     
     	private MWEPropertiesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MWEPropertiesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRulePropertyFile
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:60:1: entryRulePropertyFile : rulePropertyFile EOF ;
    public final void entryRulePropertyFile() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:61:1: ( rulePropertyFile EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:62:1: rulePropertyFile EOF
            {
             before(grammarAccess.getPropertyFileRule()); 
            pushFollow(FOLLOW_rulePropertyFile_in_entryRulePropertyFile61);
            rulePropertyFile();
            _fsp--;

             after(grammarAccess.getPropertyFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePropertyFile


    // $ANTLR start rulePropertyFile
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:69:1: rulePropertyFile : ( ( rule__PropertyFile__EntriesAssignment )* ) ;
    public final void rulePropertyFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:73:2: ( ( ( rule__PropertyFile__EntriesAssignment )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:74:1: ( ( rule__PropertyFile__EntriesAssignment )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:74:1: ( ( rule__PropertyFile__EntriesAssignment )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:75:1: ( rule__PropertyFile__EntriesAssignment )*
            {
             before(grammarAccess.getPropertyFileAccess().getEntriesAssignment()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:76:1: ( rule__PropertyFile__EntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WS && LA1_0<=RULE_ID)||(LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:76:2: rule__PropertyFile__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__PropertyFile__EntriesAssignment_in_rulePropertyFile94);
            	    rule__PropertyFile__EntriesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPropertyFileAccess().getEntriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePropertyFile


    // $ANTLR start entryRuleNaturalLine
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:88:1: entryRuleNaturalLine : ruleNaturalLine EOF ;
    public final void entryRuleNaturalLine() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:89:1: ( ruleNaturalLine EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:90:1: ruleNaturalLine EOF
            {
             before(grammarAccess.getNaturalLineRule()); 
            pushFollow(FOLLOW_ruleNaturalLine_in_entryRuleNaturalLine122);
            ruleNaturalLine();
            _fsp--;

             after(grammarAccess.getNaturalLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLine129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNaturalLine


    // $ANTLR start ruleNaturalLine
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:97:1: ruleNaturalLine : ( ( rule__NaturalLine__Alternatives ) ) ;
    public final void ruleNaturalLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:101:2: ( ( ( rule__NaturalLine__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:102:1: ( ( rule__NaturalLine__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:102:1: ( ( rule__NaturalLine__Alternatives ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:103:1: ( rule__NaturalLine__Alternatives )
            {
             before(grammarAccess.getNaturalLineAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:104:1: ( rule__NaturalLine__Alternatives )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:104:2: rule__NaturalLine__Alternatives
            {
            pushFollow(FOLLOW_rule__NaturalLine__Alternatives_in_ruleNaturalLine155);
            rule__NaturalLine__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNaturalLineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNaturalLine


    // $ANTLR start entryRuleBlankLine
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:116:1: entryRuleBlankLine : ruleBlankLine EOF ;
    public final void entryRuleBlankLine() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:117:1: ( ruleBlankLine EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:118:1: ruleBlankLine EOF
            {
             before(grammarAccess.getBlankLineRule()); 
            pushFollow(FOLLOW_ruleBlankLine_in_entryRuleBlankLine182);
            ruleBlankLine();
            _fsp--;

             after(grammarAccess.getBlankLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankLine189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBlankLine


    // $ANTLR start ruleBlankLine
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:125:1: ruleBlankLine : ( ( rule__BlankLine__Group__0 ) ) ;
    public final void ruleBlankLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:129:2: ( ( ( rule__BlankLine__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:130:1: ( ( rule__BlankLine__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:130:1: ( ( rule__BlankLine__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:131:1: ( rule__BlankLine__Group__0 )
            {
             before(grammarAccess.getBlankLineAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:132:1: ( rule__BlankLine__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:132:2: rule__BlankLine__Group__0
            {
            pushFollow(FOLLOW_rule__BlankLine__Group__0_in_ruleBlankLine215);
            rule__BlankLine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBlankLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBlankLine


    // $ANTLR start entryRulePropertyComment
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:144:1: entryRulePropertyComment : rulePropertyComment EOF ;
    public final void entryRulePropertyComment() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:145:1: ( rulePropertyComment EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:146:1: rulePropertyComment EOF
            {
             before(grammarAccess.getPropertyCommentRule()); 
            pushFollow(FOLLOW_rulePropertyComment_in_entryRulePropertyComment242);
            rulePropertyComment();
            _fsp--;

             after(grammarAccess.getPropertyCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyComment249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePropertyComment


    // $ANTLR start rulePropertyComment
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:153:1: rulePropertyComment : ( ( rule__PropertyComment__Group__0 ) ) ;
    public final void rulePropertyComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:157:2: ( ( ( rule__PropertyComment__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:158:1: ( ( rule__PropertyComment__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:158:1: ( ( rule__PropertyComment__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:159:1: ( rule__PropertyComment__Group__0 )
            {
             before(grammarAccess.getPropertyCommentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:160:1: ( rule__PropertyComment__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:160:2: rule__PropertyComment__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyComment__Group__0_in_rulePropertyComment275);
            rule__PropertyComment__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePropertyComment


    // $ANTLR start entryRulePropertyEntry
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:172:1: entryRulePropertyEntry : rulePropertyEntry EOF ;
    public final void entryRulePropertyEntry() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:173:1: ( rulePropertyEntry EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:174:1: rulePropertyEntry EOF
            {
             before(grammarAccess.getPropertyEntryRule()); 
            pushFollow(FOLLOW_rulePropertyEntry_in_entryRulePropertyEntry302);
            rulePropertyEntry();
            _fsp--;

             after(grammarAccess.getPropertyEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyEntry309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePropertyEntry


    // $ANTLR start rulePropertyEntry
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:181:1: rulePropertyEntry : ( ( rule__PropertyEntry__Group__0 ) ) ;
    public final void rulePropertyEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:185:2: ( ( ( rule__PropertyEntry__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:186:1: ( ( rule__PropertyEntry__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:186:1: ( ( rule__PropertyEntry__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:187:1: ( rule__PropertyEntry__Group__0 )
            {
             before(grammarAccess.getPropertyEntryAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:188:1: ( rule__PropertyEntry__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:188:2: rule__PropertyEntry__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyEntry__Group__0_in_rulePropertyEntry335);
            rule__PropertyEntry__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePropertyEntry


    // $ANTLR start entryRuleDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:200:1: entryRuleDelimiter : ruleDelimiter EOF ;
    public final void entryRuleDelimiter() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:201:1: ( ruleDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:202:1: ruleDelimiter EOF
            {
             before(grammarAccess.getDelimiterRule()); 
            pushFollow(FOLLOW_ruleDelimiter_in_entryRuleDelimiter362);
            ruleDelimiter();
            _fsp--;

             after(grammarAccess.getDelimiterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelimiter369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDelimiter


    // $ANTLR start ruleDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:209:1: ruleDelimiter : ( ( rule__Delimiter__Group__0 ) ) ;
    public final void ruleDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:213:2: ( ( ( rule__Delimiter__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:214:1: ( ( rule__Delimiter__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:214:1: ( ( rule__Delimiter__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:215:1: ( rule__Delimiter__Group__0 )
            {
             before(grammarAccess.getDelimiterAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:216:1: ( rule__Delimiter__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:216:2: rule__Delimiter__Group__0
            {
            pushFollow(FOLLOW_rule__Delimiter__Group__0_in_ruleDelimiter395);
            rule__Delimiter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDelimiterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDelimiter


    // $ANTLR start entryRuleSimpleDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:228:1: entryRuleSimpleDelimiter : ruleSimpleDelimiter EOF ;
    public final void entryRuleSimpleDelimiter() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:229:1: ( ruleSimpleDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:230:1: ruleSimpleDelimiter EOF
            {
             before(grammarAccess.getSimpleDelimiterRule()); 
            pushFollow(FOLLOW_ruleSimpleDelimiter_in_entryRuleSimpleDelimiter422);
            ruleSimpleDelimiter();
            _fsp--;

             after(grammarAccess.getSimpleDelimiterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDelimiter429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleDelimiter


    // $ANTLR start ruleSimpleDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:237:1: ruleSimpleDelimiter : ( RULE_WS ) ;
    public final void ruleSimpleDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:241:2: ( ( RULE_WS ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:242:1: ( RULE_WS )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:242:1: ( RULE_WS )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:243:1: RULE_WS
            {
             before(grammarAccess.getSimpleDelimiterAccess().getWSTerminalRuleCall()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSimpleDelimiter455); 
             after(grammarAccess.getSimpleDelimiterAccess().getWSTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleDelimiter


    // $ANTLR start entryRuleCompoundString
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:256:1: entryRuleCompoundString : ruleCompoundString EOF ;
    public final void entryRuleCompoundString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:257:1: ( ruleCompoundString EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:258:1: ruleCompoundString EOF
            {
             before(grammarAccess.getCompoundStringRule()); 
            pushFollow(FOLLOW_ruleCompoundString_in_entryRuleCompoundString481);
            ruleCompoundString();
            _fsp--;

             after(grammarAccess.getCompoundStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundString


    // $ANTLR start ruleCompoundString
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:265:1: ruleCompoundString : ( ( rule__CompoundString__Alternatives ) ) ;
    public final void ruleCompoundString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:269:2: ( ( ( rule__CompoundString__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:270:1: ( ( rule__CompoundString__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:270:1: ( ( rule__CompoundString__Alternatives ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:271:1: ( rule__CompoundString__Alternatives )
            {
             before(grammarAccess.getCompoundStringAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:272:1: ( rule__CompoundString__Alternatives )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:272:2: rule__CompoundString__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundString__Alternatives_in_ruleCompoundString514);
            rule__CompoundString__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundString


    // $ANTLR start entryRuleCompoundStringLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:284:1: entryRuleCompoundStringLeadingDelimiter : ruleCompoundStringLeadingDelimiter EOF ;
    public final void entryRuleCompoundStringLeadingDelimiter() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:285:1: ( ruleCompoundStringLeadingDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:286:1: ruleCompoundStringLeadingDelimiter EOF
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterRule()); 
            pushFollow(FOLLOW_ruleCompoundStringLeadingDelimiter_in_entryRuleCompoundStringLeadingDelimiter541);
            ruleCompoundStringLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getCompoundStringLeadingDelimiterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringLeadingDelimiter548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundStringLeadingDelimiter


    // $ANTLR start ruleCompoundStringLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:293:1: ruleCompoundStringLeadingDelimiter : ( ( rule__CompoundStringLeadingDelimiter__Alternatives ) ) ;
    public final void ruleCompoundStringLeadingDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:297:2: ( ( ( rule__CompoundStringLeadingDelimiter__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:298:1: ( ( rule__CompoundStringLeadingDelimiter__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:298:1: ( ( rule__CompoundStringLeadingDelimiter__Alternatives ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:299:1: ( rule__CompoundStringLeadingDelimiter__Alternatives )
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:300:1: ( rule__CompoundStringLeadingDelimiter__Alternatives )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:300:2: rule__CompoundStringLeadingDelimiter__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Alternatives_in_ruleCompoundStringLeadingDelimiter574);
            rule__CompoundStringLeadingDelimiter__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundStringLeadingDelimiter


    // $ANTLR start entryRuleCompoundStringPartLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:312:1: entryRuleCompoundStringPartLeadingDelimiter : ruleCompoundStringPartLeadingDelimiter EOF ;
    public final void entryRuleCompoundStringPartLeadingDelimiter() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:313:1: ( ruleCompoundStringPartLeadingDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:314:1: ruleCompoundStringPartLeadingDelimiter EOF
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterRule()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_entryRuleCompoundStringPartLeadingDelimiter601);
            ruleCompoundStringPartLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getCompoundStringPartLeadingDelimiterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiter608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundStringPartLeadingDelimiter


    // $ANTLR start ruleCompoundStringPartLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:321:1: ruleCompoundStringPartLeadingDelimiter : ( ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment ) ) ;
    public final void ruleCompoundStringPartLeadingDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:325:2: ( ( ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:326:1: ( ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:326:1: ( ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:327:1: ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment )
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:328:1: ( rule__CompoundStringPartLeadingDelimiter__ValueAssignment )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:328:2: rule__CompoundStringPartLeadingDelimiter__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CompoundStringPartLeadingDelimiter__ValueAssignment_in_ruleCompoundStringPartLeadingDelimiter634);
            rule__CompoundStringPartLeadingDelimiter__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringPartLeadingDelimiterAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundStringPartLeadingDelimiter


    // $ANTLR start entryRuleCompoundStringPartLeadingDelimiterValue
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:340:1: entryRuleCompoundStringPartLeadingDelimiterValue : ruleCompoundStringPartLeadingDelimiterValue EOF ;
    public final void entryRuleCompoundStringPartLeadingDelimiterValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:341:1: ( ruleCompoundStringPartLeadingDelimiterValue EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:342:1: ruleCompoundStringPartLeadingDelimiterValue EOF
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueRule()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_entryRuleCompoundStringPartLeadingDelimiterValue661);
            ruleCompoundStringPartLeadingDelimiterValue();
            _fsp--;

             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiterValue668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundStringPartLeadingDelimiterValue


    // $ANTLR start ruleCompoundStringPartLeadingDelimiterValue
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:349:1: ruleCompoundStringPartLeadingDelimiterValue : ( ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 ) ) ;
    public final void ruleCompoundStringPartLeadingDelimiterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:353:2: ( ( ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:354:1: ( ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:354:1: ( ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:355:1: ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 )
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:356:1: ( rule__CompoundStringPartLeadingDelimiterValue__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:356:2: rule__CompoundStringPartLeadingDelimiterValue__Group__0
            {
            pushFollow(FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group__0_in_ruleCompoundStringPartLeadingDelimiterValue694);
            rule__CompoundStringPartLeadingDelimiterValue__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundStringPartLeadingDelimiterValue


    // $ANTLR start entryRuleCompoundStringPart
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:368:1: entryRuleCompoundStringPart : ruleCompoundStringPart EOF ;
    public final void entryRuleCompoundStringPart() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:369:1: ( ruleCompoundStringPart EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:370:1: ruleCompoundStringPart EOF
            {
             before(grammarAccess.getCompoundStringPartRule()); 
            pushFollow(FOLLOW_ruleCompoundStringPart_in_entryRuleCompoundStringPart721);
            ruleCompoundStringPart();
            _fsp--;

             after(grammarAccess.getCompoundStringPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPart728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundStringPart


    // $ANTLR start ruleCompoundStringPart
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:377:1: ruleCompoundStringPart : ( ( rule__CompoundStringPart__ValueAssignment ) ) ;
    public final void ruleCompoundStringPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:381:2: ( ( ( rule__CompoundStringPart__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:382:1: ( ( rule__CompoundStringPart__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:382:1: ( ( rule__CompoundStringPart__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:383:1: ( rule__CompoundStringPart__ValueAssignment )
            {
             before(grammarAccess.getCompoundStringPartAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:384:1: ( rule__CompoundStringPart__ValueAssignment )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:384:2: rule__CompoundStringPart__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CompoundStringPart__ValueAssignment_in_ruleCompoundStringPart754);
            rule__CompoundStringPart__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringPartAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundStringPart


    // $ANTLR start entryRuleCompoundStringPartValue
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:396:1: entryRuleCompoundStringPartValue : ruleCompoundStringPartValue EOF ;
    public final void entryRuleCompoundStringPartValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:397:1: ( ruleCompoundStringPartValue EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:398:1: ruleCompoundStringPartValue EOF
            {
             before(grammarAccess.getCompoundStringPartValueRule()); 
            pushFollow(FOLLOW_ruleCompoundStringPartValue_in_entryRuleCompoundStringPartValue781);
            ruleCompoundStringPartValue();
            _fsp--;

             after(grammarAccess.getCompoundStringPartValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartValue788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompoundStringPartValue


    // $ANTLR start ruleCompoundStringPartValue
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:405:1: ruleCompoundStringPartValue : ( ( rule__CompoundStringPartValue__Group__0 ) ) ;
    public final void ruleCompoundStringPartValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:409:2: ( ( ( rule__CompoundStringPartValue__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:410:1: ( ( rule__CompoundStringPartValue__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:410:1: ( ( rule__CompoundStringPartValue__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:411:1: ( rule__CompoundStringPartValue__Group__0 )
            {
             before(grammarAccess.getCompoundStringPartValueAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:412:1: ( rule__CompoundStringPartValue__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:412:2: rule__CompoundStringPartValue__Group__0
            {
            pushFollow(FOLLOW_rule__CompoundStringPartValue__Group__0_in_ruleCompoundStringPartValue814);
            rule__CompoundStringPartValue__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringPartValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundStringPartValue


    // $ANTLR start entryRuleNonWSConstant
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:424:1: entryRuleNonWSConstant : ruleNonWSConstant EOF ;
    public final void entryRuleNonWSConstant() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:425:1: ( ruleNonWSConstant EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:426:1: ruleNonWSConstant EOF
            {
             before(grammarAccess.getNonWSConstantRule()); 
            pushFollow(FOLLOW_ruleNonWSConstant_in_entryRuleNonWSConstant841);
            ruleNonWSConstant();
            _fsp--;

             after(grammarAccess.getNonWSConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonWSConstant848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNonWSConstant


    // $ANTLR start ruleNonWSConstant
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:433:1: ruleNonWSConstant : ( ( rule__NonWSConstant__Alternatives ) ) ;
    public final void ruleNonWSConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:437:2: ( ( ( rule__NonWSConstant__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:438:1: ( ( rule__NonWSConstant__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:438:1: ( ( rule__NonWSConstant__Alternatives ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:439:1: ( rule__NonWSConstant__Alternatives )
            {
             before(grammarAccess.getNonWSConstantAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:440:1: ( rule__NonWSConstant__Alternatives )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:440:2: rule__NonWSConstant__Alternatives
            {
            pushFollow(FOLLOW_rule__NonWSConstant__Alternatives_in_ruleNonWSConstant874);
            rule__NonWSConstant__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNonWSConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNonWSConstant


    // $ANTLR start entryRuleNonWsNonCommentConstant
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:452:1: entryRuleNonWsNonCommentConstant : ruleNonWsNonCommentConstant EOF ;
    public final void entryRuleNonWsNonCommentConstant() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:453:1: ( ruleNonWsNonCommentConstant EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:454:1: ruleNonWsNonCommentConstant EOF
            {
             before(grammarAccess.getNonWsNonCommentConstantRule()); 
            pushFollow(FOLLOW_ruleNonWsNonCommentConstant_in_entryRuleNonWsNonCommentConstant901);
            ruleNonWsNonCommentConstant();
            _fsp--;

             after(grammarAccess.getNonWsNonCommentConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonWsNonCommentConstant908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNonWsNonCommentConstant


    // $ANTLR start ruleNonWsNonCommentConstant
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:461:1: ruleNonWsNonCommentConstant : ( ( rule__NonWsNonCommentConstant__Group__0 ) ) ;
    public final void ruleNonWsNonCommentConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:465:2: ( ( ( rule__NonWsNonCommentConstant__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:466:1: ( ( rule__NonWsNonCommentConstant__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:466:1: ( ( rule__NonWsNonCommentConstant__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:467:1: ( rule__NonWsNonCommentConstant__Group__0 )
            {
             before(grammarAccess.getNonWsNonCommentConstantAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:468:1: ( rule__NonWsNonCommentConstant__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:468:2: rule__NonWsNonCommentConstant__Group__0
            {
            pushFollow(FOLLOW_rule__NonWsNonCommentConstant__Group__0_in_ruleNonWsNonCommentConstant934);
            rule__NonWsNonCommentConstant__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNonWsNonCommentConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNonWsNonCommentConstant


    // $ANTLR start entryRuleKey
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:480:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:481:1: ( ruleKey EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:482:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey961);
            ruleKey();
            _fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleKey


    // $ANTLR start ruleKey
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:489:1: ruleKey : ( ( ( rule__Key__Alternatives ) ) ( ( rule__Key__Alternatives )* ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:493:2: ( ( ( ( rule__Key__Alternatives ) ) ( ( rule__Key__Alternatives )* ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:494:1: ( ( ( rule__Key__Alternatives ) ) ( ( rule__Key__Alternatives )* ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:494:1: ( ( ( rule__Key__Alternatives ) ) ( ( rule__Key__Alternatives )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:495:1: ( ( rule__Key__Alternatives ) ) ( ( rule__Key__Alternatives )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:495:1: ( ( rule__Key__Alternatives ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:496:1: ( rule__Key__Alternatives )
            {
             before(grammarAccess.getKeyAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:497:1: ( rule__Key__Alternatives )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:497:2: rule__Key__Alternatives
            {
            pushFollow(FOLLOW_rule__Key__Alternatives_in_ruleKey996);
            rule__Key__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getKeyAccess().getAlternatives()); 

            }

            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:500:1: ( ( rule__Key__Alternatives )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:501:1: ( rule__Key__Alternatives )*
            {
             before(grammarAccess.getKeyAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:502:1: ( rule__Key__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=11 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:502:2: rule__Key__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Key__Alternatives_in_ruleKey1008);
            	    rule__Key__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getKeyAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleKey


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:515:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:516:1: ( ruleFQN EOF )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:517:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1038);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1045); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:524:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:528:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:529:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:529:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:530:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:531:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:531:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1071);
            rule__FQN__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFQN


    // $ANTLR start rule__NaturalLine__Alternatives
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:543:1: rule__NaturalLine__Alternatives : ( ( ruleBlankLine ) | ( rulePropertyComment ) | ( rulePropertyEntry ) );
    public final void rule__NaturalLine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:547:1: ( ( ruleBlankLine ) | ( rulePropertyComment ) | ( rulePropertyEntry ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 11:
                case 12:
                case 13:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_LINE_TERMINATOR:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_SL_COMMENT:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("543:1: rule__NaturalLine__Alternatives : ( ( ruleBlankLine ) | ( rulePropertyComment ) | ( rulePropertyEntry ) );", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LINE_TERMINATOR:
                {
                alt3=1;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 12:
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("543:1: rule__NaturalLine__Alternatives : ( ( ruleBlankLine ) | ( rulePropertyComment ) | ( rulePropertyEntry ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:548:1: ( ruleBlankLine )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:548:1: ( ruleBlankLine )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:549:1: ruleBlankLine
                    {
                     before(grammarAccess.getNaturalLineAccess().getBlankLineParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlankLine_in_rule__NaturalLine__Alternatives1107);
                    ruleBlankLine();
                    _fsp--;

                     after(grammarAccess.getNaturalLineAccess().getBlankLineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:554:6: ( rulePropertyComment )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:554:6: ( rulePropertyComment )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:555:1: rulePropertyComment
                    {
                     before(grammarAccess.getNaturalLineAccess().getPropertyCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePropertyComment_in_rule__NaturalLine__Alternatives1124);
                    rulePropertyComment();
                    _fsp--;

                     after(grammarAccess.getNaturalLineAccess().getPropertyCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:560:6: ( rulePropertyEntry )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:560:6: ( rulePropertyEntry )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:561:1: rulePropertyEntry
                    {
                     before(grammarAccess.getNaturalLineAccess().getPropertyEntryParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePropertyEntry_in_rule__NaturalLine__Alternatives1141);
                    rulePropertyEntry();
                    _fsp--;

                     after(grammarAccess.getNaturalLineAccess().getPropertyEntryParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalLine__Alternatives


    // $ANTLR start rule__PropertyEntry__Alternatives_2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:571:1: rule__PropertyEntry__Alternatives_2 : ( ( ( rule__PropertyEntry__Group_2_0__0 ) ) | ( ( rule__PropertyEntry__Group_2_1__0 ) ) );
    public final void rule__PropertyEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:575:1: ( ( ( rule__PropertyEntry__Group_2_0__0 ) ) | ( ( rule__PropertyEntry__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WS) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_LINE_TERMINATOR && LA4_1<=RULE_ID)||(LA4_1>=11 && LA4_1<=13)) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=9 && LA4_1<=10)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("571:1: rule__PropertyEntry__Alternatives_2 : ( ( ( rule__PropertyEntry__Group_2_0__0 ) ) | ( ( rule__PropertyEntry__Group_2_1__0 ) ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=9 && LA4_0<=10)) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("571:1: rule__PropertyEntry__Alternatives_2 : ( ( ( rule__PropertyEntry__Group_2_0__0 ) ) | ( ( rule__PropertyEntry__Group_2_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:576:1: ( ( rule__PropertyEntry__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:576:1: ( ( rule__PropertyEntry__Group_2_0__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:577:1: ( rule__PropertyEntry__Group_2_0__0 )
                    {
                     before(grammarAccess.getPropertyEntryAccess().getGroup_2_0()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:578:1: ( rule__PropertyEntry__Group_2_0__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:578:2: rule__PropertyEntry__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyEntry__Group_2_0__0_in_rule__PropertyEntry__Alternatives_21173);
                    rule__PropertyEntry__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPropertyEntryAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:582:6: ( ( rule__PropertyEntry__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:582:6: ( ( rule__PropertyEntry__Group_2_1__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:583:1: ( rule__PropertyEntry__Group_2_1__0 )
                    {
                     before(grammarAccess.getPropertyEntryAccess().getGroup_2_1()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:584:1: ( rule__PropertyEntry__Group_2_1__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:584:2: rule__PropertyEntry__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyEntry__Group_2_1__0_in_rule__PropertyEntry__Alternatives_21191);
                    rule__PropertyEntry__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPropertyEntryAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Alternatives_2


    // $ANTLR start rule__Delimiter__Alternatives_1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:593:1: rule__Delimiter__Alternatives_1 : ( ( '=' ) | ( ':' ) );
    public final void rule__Delimiter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:597:1: ( ( '=' ) | ( ':' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("593:1: rule__Delimiter__Alternatives_1 : ( ( '=' ) | ( ':' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:598:1: ( '=' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:598:1: ( '=' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:599:1: '='
                    {
                     before(grammarAccess.getDelimiterAccess().getEqualsSignKeyword_1_0()); 
                    match(input,9,FOLLOW_9_in_rule__Delimiter__Alternatives_11225); 
                     after(grammarAccess.getDelimiterAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:606:6: ( ':' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:606:6: ( ':' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:607:1: ':'
                    {
                     before(grammarAccess.getDelimiterAccess().getColonKeyword_1_1()); 
                    match(input,10,FOLLOW_10_in_rule__Delimiter__Alternatives_11245); 
                     after(grammarAccess.getDelimiterAccess().getColonKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delimiter__Alternatives_1


    // $ANTLR start rule__CompoundString__Alternatives
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:619:1: rule__CompoundString__Alternatives : ( ( ( rule__CompoundString__Group_0__0 ) ) | ( ( rule__CompoundString__Group_1__0 ) ) );
    public final void rule__CompoundString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:623:1: ( ( ( rule__CompoundString__Group_0__0 ) ) | ( ( rule__CompoundString__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LINE_TERMINATOR) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=13)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("619:1: rule__CompoundString__Alternatives : ( ( ( rule__CompoundString__Group_0__0 ) ) | ( ( rule__CompoundString__Group_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:624:1: ( ( rule__CompoundString__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:624:1: ( ( rule__CompoundString__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:625:1: ( rule__CompoundString__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundStringAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:626:1: ( rule__CompoundString__Group_0__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:626:2: rule__CompoundString__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundString__Group_0__0_in_rule__CompoundString__Alternatives1279);
                    rule__CompoundString__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundStringAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:630:6: ( ( rule__CompoundString__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:630:6: ( ( rule__CompoundString__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:631:1: ( rule__CompoundString__Group_1__0 )
                    {
                     before(grammarAccess.getCompoundStringAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:632:1: ( rule__CompoundString__Group_1__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:632:2: rule__CompoundString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompoundString__Group_1__0_in_rule__CompoundString__Alternatives1297);
                    rule__CompoundString__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundStringAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Alternatives


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Alternatives
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:641:1: rule__CompoundStringLeadingDelimiter__Alternatives : ( ( ( rule__CompoundStringLeadingDelimiter__Group_0__0 ) ) | ( ( rule__CompoundStringLeadingDelimiter__Group_1__0 ) ) );
    public final void rule__CompoundStringLeadingDelimiter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:645:1: ( ( ( rule__CompoundStringLeadingDelimiter__Group_0__0 ) ) | ( ( rule__CompoundStringLeadingDelimiter__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LINE_TERMINATOR) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SL_COMMENT||LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=13)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("641:1: rule__CompoundStringLeadingDelimiter__Alternatives : ( ( ( rule__CompoundStringLeadingDelimiter__Group_0__0 ) ) | ( ( rule__CompoundStringLeadingDelimiter__Group_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:646:1: ( ( rule__CompoundStringLeadingDelimiter__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:646:1: ( ( rule__CompoundStringLeadingDelimiter__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:647:1: ( rule__CompoundStringLeadingDelimiter__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:648:1: ( rule__CompoundStringLeadingDelimiter__Group_0__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:648:2: rule__CompoundStringLeadingDelimiter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_0__0_in_rule__CompoundStringLeadingDelimiter__Alternatives1330);
                    rule__CompoundStringLeadingDelimiter__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:652:6: ( ( rule__CompoundStringLeadingDelimiter__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:652:6: ( ( rule__CompoundStringLeadingDelimiter__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:653:1: ( rule__CompoundStringLeadingDelimiter__Group_1__0 )
                    {
                     before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:654:1: ( rule__CompoundStringLeadingDelimiter__Group_1__0 )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:654:2: rule__CompoundStringLeadingDelimiter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__0_in_rule__CompoundStringLeadingDelimiter__Alternatives1348);
                    rule__CompoundStringLeadingDelimiter__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Alternatives


    // $ANTLR start rule__NonWSConstant__Alternatives
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:663:1: rule__NonWSConstant__Alternatives : ( ( ruleNonWsNonCommentConstant ) | ( RULE_SL_COMMENT ) );
    public final void rule__NonWSConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:667:1: ( ( ruleNonWsNonCommentConstant ) | ( RULE_SL_COMMENT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=13)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SL_COMMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("663:1: rule__NonWSConstant__Alternatives : ( ( ruleNonWsNonCommentConstant ) | ( RULE_SL_COMMENT ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:668:1: ( ruleNonWsNonCommentConstant )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:668:1: ( ruleNonWsNonCommentConstant )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:669:1: ruleNonWsNonCommentConstant
                    {
                     before(grammarAccess.getNonWSConstantAccess().getNonWsNonCommentConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNonWsNonCommentConstant_in_rule__NonWSConstant__Alternatives1381);
                    ruleNonWsNonCommentConstant();
                    _fsp--;

                     after(grammarAccess.getNonWSConstantAccess().getNonWsNonCommentConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:674:6: ( RULE_SL_COMMENT )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:674:6: ( RULE_SL_COMMENT )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:675:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getNonWSConstantAccess().getSL_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__NonWSConstant__Alternatives1398); 
                     after(grammarAccess.getNonWSConstantAccess().getSL_COMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWSConstant__Alternatives


    // $ANTLR start rule__NonWsNonCommentConstant__Alternatives_1_0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:685:1: rule__NonWsNonCommentConstant__Alternatives_1_0 : ( ( ':' ) | ( '=' ) );
    public final void rule__NonWsNonCommentConstant__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:689:1: ( ( ':' ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10) ) {
                alt9=1;
            }
            else if ( (LA9_0==9) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("685:1: rule__NonWsNonCommentConstant__Alternatives_1_0 : ( ( ':' ) | ( '=' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:690:1: ( ':' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:690:1: ( ':' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:691:1: ':'
                    {
                     before(grammarAccess.getNonWsNonCommentConstantAccess().getColonKeyword_1_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__NonWsNonCommentConstant__Alternatives_1_01431); 
                     after(grammarAccess.getNonWsNonCommentConstantAccess().getColonKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:698:6: ( '=' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:698:6: ( '=' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:699:1: '='
                    {
                     before(grammarAccess.getNonWsNonCommentConstantAccess().getEqualsSignKeyword_1_0_1()); 
                    match(input,9,FOLLOW_9_in_rule__NonWsNonCommentConstant__Alternatives_1_01451); 
                     after(grammarAccess.getNonWsNonCommentConstantAccess().getEqualsSignKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWsNonCommentConstant__Alternatives_1_0


    // $ANTLR start rule__Key__Alternatives
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:711:1: rule__Key__Alternatives : ( ( ruleFQN ) | ( '\\\\:' ) | ( '\\\\=' ) | ( '/' ) );
    public final void rule__Key__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:715:1: ( ( ruleFQN ) | ( '\\\\:' ) | ( '\\\\=' ) | ( '/' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 11:
                {
                alt10=2;
                }
                break;
            case 12:
                {
                alt10=3;
                }
                break;
            case 13:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("711:1: rule__Key__Alternatives : ( ( ruleFQN ) | ( '\\\\:' ) | ( '\\\\=' ) | ( '/' ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:716:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:716:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:717:1: ruleFQN
                    {
                     before(grammarAccess.getKeyAccess().getFQNParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFQN_in_rule__Key__Alternatives1485);
                    ruleFQN();
                    _fsp--;

                     after(grammarAccess.getKeyAccess().getFQNParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:722:6: ( '\\\\:' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:722:6: ( '\\\\:' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:723:1: '\\\\:'
                    {
                     before(grammarAccess.getKeyAccess().getReverseSolidusColonKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Key__Alternatives1503); 
                     after(grammarAccess.getKeyAccess().getReverseSolidusColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:730:6: ( '\\\\=' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:730:6: ( '\\\\=' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:731:1: '\\\\='
                    {
                     before(grammarAccess.getKeyAccess().getReverseSolidusEqualsSignKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Key__Alternatives1523); 
                     after(grammarAccess.getKeyAccess().getReverseSolidusEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:738:6: ( '/' )
                    {
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:738:6: ( '/' )
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:739:1: '/'
                    {
                     before(grammarAccess.getKeyAccess().getSolidusKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Key__Alternatives1543); 
                     after(grammarAccess.getKeyAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Key__Alternatives


    // $ANTLR start rule__BlankLine__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:753:1: rule__BlankLine__Group__0 : ( () ) rule__BlankLine__Group__1 ;
    public final void rule__BlankLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:757:1: ( ( () ) rule__BlankLine__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:758:1: ( () ) rule__BlankLine__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:758:1: ( () )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:759:1: ()
            {
             before(grammarAccess.getBlankLineAccess().getBlankLineAction_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:760:1: ()
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:762:1: 
            {
            }

             after(grammarAccess.getBlankLineAccess().getBlankLineAction_0()); 

            }

            pushFollow(FOLLOW_rule__BlankLine__Group__1_in_rule__BlankLine__Group__01589);
            rule__BlankLine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankLine__Group__0


    // $ANTLR start rule__BlankLine__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:773:1: rule__BlankLine__Group__1 : ( ( RULE_WS )? ) rule__BlankLine__Group__2 ;
    public final void rule__BlankLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:777:1: ( ( ( RULE_WS )? ) rule__BlankLine__Group__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:778:1: ( ( RULE_WS )? ) rule__BlankLine__Group__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:778:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:779:1: ( RULE_WS )?
            {
             before(grammarAccess.getBlankLineAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:780:1: ( RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:780:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__BlankLine__Group__11618); 

                    }
                    break;

            }

             after(grammarAccess.getBlankLineAccess().getWSTerminalRuleCall_1()); 

            }

            pushFollow(FOLLOW_rule__BlankLine__Group__2_in_rule__BlankLine__Group__11628);
            rule__BlankLine__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankLine__Group__1


    // $ANTLR start rule__BlankLine__Group__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:791:1: rule__BlankLine__Group__2 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__BlankLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:795:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:796:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:796:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:797:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getBlankLineAccess().getLINE_TERMINATORTerminalRuleCall_2()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__BlankLine__Group__21656); 
             after(grammarAccess.getBlankLineAccess().getLINE_TERMINATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankLine__Group__2


    // $ANTLR start rule__PropertyComment__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:814:1: rule__PropertyComment__Group__0 : ( ( RULE_WS )? ) rule__PropertyComment__Group__1 ;
    public final void rule__PropertyComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:818:1: ( ( ( RULE_WS )? ) rule__PropertyComment__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:819:1: ( ( RULE_WS )? ) rule__PropertyComment__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:819:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:820:1: ( RULE_WS )?
            {
             before(grammarAccess.getPropertyCommentAccess().getWSTerminalRuleCall_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:821:1: ( RULE_WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:821:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__PropertyComment__Group__01696); 

                    }
                    break;

            }

             after(grammarAccess.getPropertyCommentAccess().getWSTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyComment__Group__1_in_rule__PropertyComment__Group__01706);
            rule__PropertyComment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyComment__Group__0


    // $ANTLR start rule__PropertyComment__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:832:1: rule__PropertyComment__Group__1 : ( ( rule__PropertyComment__ValueAssignment_1 ) ) rule__PropertyComment__Group__2 ;
    public final void rule__PropertyComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:836:1: ( ( ( rule__PropertyComment__ValueAssignment_1 ) ) rule__PropertyComment__Group__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:837:1: ( ( rule__PropertyComment__ValueAssignment_1 ) ) rule__PropertyComment__Group__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:837:1: ( ( rule__PropertyComment__ValueAssignment_1 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:838:1: ( rule__PropertyComment__ValueAssignment_1 )
            {
             before(grammarAccess.getPropertyCommentAccess().getValueAssignment_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:839:1: ( rule__PropertyComment__ValueAssignment_1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:839:2: rule__PropertyComment__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyComment__ValueAssignment_1_in_rule__PropertyComment__Group__11734);
            rule__PropertyComment__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyCommentAccess().getValueAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PropertyComment__Group__2_in_rule__PropertyComment__Group__11743);
            rule__PropertyComment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyComment__Group__1


    // $ANTLR start rule__PropertyComment__Group__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:850:1: rule__PropertyComment__Group__2 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__PropertyComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:854:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:855:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:855:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:856:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getPropertyCommentAccess().getLINE_TERMINATORTerminalRuleCall_2()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__PropertyComment__Group__21771); 
             after(grammarAccess.getPropertyCommentAccess().getLINE_TERMINATORTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyComment__Group__2


    // $ANTLR start rule__PropertyEntry__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:873:1: rule__PropertyEntry__Group__0 : ( ( RULE_WS )? ) rule__PropertyEntry__Group__1 ;
    public final void rule__PropertyEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:877:1: ( ( ( RULE_WS )? ) rule__PropertyEntry__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:878:1: ( ( RULE_WS )? ) rule__PropertyEntry__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:878:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:879:1: ( RULE_WS )?
            {
             before(grammarAccess.getPropertyEntryAccess().getWSTerminalRuleCall_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:880:1: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:880:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__PropertyEntry__Group__01811); 

                    }
                    break;

            }

             after(grammarAccess.getPropertyEntryAccess().getWSTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyEntry__Group__1_in_rule__PropertyEntry__Group__01821);
            rule__PropertyEntry__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group__0


    // $ANTLR start rule__PropertyEntry__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:891:1: rule__PropertyEntry__Group__1 : ( ( rule__PropertyEntry__NameAssignment_1 ) ) rule__PropertyEntry__Group__2 ;
    public final void rule__PropertyEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:895:1: ( ( ( rule__PropertyEntry__NameAssignment_1 ) ) rule__PropertyEntry__Group__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:896:1: ( ( rule__PropertyEntry__NameAssignment_1 ) ) rule__PropertyEntry__Group__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:896:1: ( ( rule__PropertyEntry__NameAssignment_1 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:897:1: ( rule__PropertyEntry__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyEntryAccess().getNameAssignment_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:898:1: ( rule__PropertyEntry__NameAssignment_1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:898:2: rule__PropertyEntry__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyEntry__NameAssignment_1_in_rule__PropertyEntry__Group__11849);
            rule__PropertyEntry__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PropertyEntry__Group__2_in_rule__PropertyEntry__Group__11858);
            rule__PropertyEntry__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group__1


    // $ANTLR start rule__PropertyEntry__Group__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:909:1: rule__PropertyEntry__Group__2 : ( ( rule__PropertyEntry__Alternatives_2 ) ) ;
    public final void rule__PropertyEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:913:1: ( ( ( rule__PropertyEntry__Alternatives_2 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:914:1: ( ( rule__PropertyEntry__Alternatives_2 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:914:1: ( ( rule__PropertyEntry__Alternatives_2 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:915:1: ( rule__PropertyEntry__Alternatives_2 )
            {
             before(grammarAccess.getPropertyEntryAccess().getAlternatives_2()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:916:1: ( rule__PropertyEntry__Alternatives_2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:916:2: rule__PropertyEntry__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyEntry__Alternatives_2_in_rule__PropertyEntry__Group__21886);
            rule__PropertyEntry__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group__2


    // $ANTLR start rule__PropertyEntry__Group_2_0__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:932:1: rule__PropertyEntry__Group_2_0__0 : ( ( rule__PropertyEntry__DelimiterAssignment_2_0_0 ) ) rule__PropertyEntry__Group_2_0__1 ;
    public final void rule__PropertyEntry__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:936:1: ( ( ( rule__PropertyEntry__DelimiterAssignment_2_0_0 ) ) rule__PropertyEntry__Group_2_0__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:937:1: ( ( rule__PropertyEntry__DelimiterAssignment_2_0_0 ) ) rule__PropertyEntry__Group_2_0__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:937:1: ( ( rule__PropertyEntry__DelimiterAssignment_2_0_0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:938:1: ( rule__PropertyEntry__DelimiterAssignment_2_0_0 )
            {
             before(grammarAccess.getPropertyEntryAccess().getDelimiterAssignment_2_0_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:939:1: ( rule__PropertyEntry__DelimiterAssignment_2_0_0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:939:2: rule__PropertyEntry__DelimiterAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyEntry__DelimiterAssignment_2_0_0_in_rule__PropertyEntry__Group_2_0__01926);
            rule__PropertyEntry__DelimiterAssignment_2_0_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getDelimiterAssignment_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyEntry__Group_2_0__1_in_rule__PropertyEntry__Group_2_0__01935);
            rule__PropertyEntry__Group_2_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group_2_0__0


    // $ANTLR start rule__PropertyEntry__Group_2_0__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:950:1: rule__PropertyEntry__Group_2_0__1 : ( ( rule__PropertyEntry__ValueAssignment_2_0_1 ) ) ;
    public final void rule__PropertyEntry__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:954:1: ( ( ( rule__PropertyEntry__ValueAssignment_2_0_1 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:955:1: ( ( rule__PropertyEntry__ValueAssignment_2_0_1 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:955:1: ( ( rule__PropertyEntry__ValueAssignment_2_0_1 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:956:1: ( rule__PropertyEntry__ValueAssignment_2_0_1 )
            {
             before(grammarAccess.getPropertyEntryAccess().getValueAssignment_2_0_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:957:1: ( rule__PropertyEntry__ValueAssignment_2_0_1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:957:2: rule__PropertyEntry__ValueAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__PropertyEntry__ValueAssignment_2_0_1_in_rule__PropertyEntry__Group_2_0__11963);
            rule__PropertyEntry__ValueAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getValueAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group_2_0__1


    // $ANTLR start rule__PropertyEntry__Group_2_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:971:1: rule__PropertyEntry__Group_2_1__0 : ( ( rule__PropertyEntry__DelimiterAssignment_2_1_0 ) ) rule__PropertyEntry__Group_2_1__1 ;
    public final void rule__PropertyEntry__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:975:1: ( ( ( rule__PropertyEntry__DelimiterAssignment_2_1_0 ) ) rule__PropertyEntry__Group_2_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:976:1: ( ( rule__PropertyEntry__DelimiterAssignment_2_1_0 ) ) rule__PropertyEntry__Group_2_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:976:1: ( ( rule__PropertyEntry__DelimiterAssignment_2_1_0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:977:1: ( rule__PropertyEntry__DelimiterAssignment_2_1_0 )
            {
             before(grammarAccess.getPropertyEntryAccess().getDelimiterAssignment_2_1_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:978:1: ( rule__PropertyEntry__DelimiterAssignment_2_1_0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:978:2: rule__PropertyEntry__DelimiterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__PropertyEntry__DelimiterAssignment_2_1_0_in_rule__PropertyEntry__Group_2_1__02001);
            rule__PropertyEntry__DelimiterAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getDelimiterAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyEntry__Group_2_1__1_in_rule__PropertyEntry__Group_2_1__02010);
            rule__PropertyEntry__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group_2_1__0


    // $ANTLR start rule__PropertyEntry__Group_2_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:989:1: rule__PropertyEntry__Group_2_1__1 : ( ( rule__PropertyEntry__ValueAssignment_2_1_1 ) ) ;
    public final void rule__PropertyEntry__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:993:1: ( ( ( rule__PropertyEntry__ValueAssignment_2_1_1 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:994:1: ( ( rule__PropertyEntry__ValueAssignment_2_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:994:1: ( ( rule__PropertyEntry__ValueAssignment_2_1_1 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:995:1: ( rule__PropertyEntry__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getPropertyEntryAccess().getValueAssignment_2_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:996:1: ( rule__PropertyEntry__ValueAssignment_2_1_1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:996:2: rule__PropertyEntry__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__PropertyEntry__ValueAssignment_2_1_1_in_rule__PropertyEntry__Group_2_1__12038);
            rule__PropertyEntry__ValueAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyEntryAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__Group_2_1__1


    // $ANTLR start rule__Delimiter__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1010:1: rule__Delimiter__Group__0 : ( ( RULE_WS )? ) rule__Delimiter__Group__1 ;
    public final void rule__Delimiter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1014:1: ( ( ( RULE_WS )? ) rule__Delimiter__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1015:1: ( ( RULE_WS )? ) rule__Delimiter__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1015:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1016:1: ( RULE_WS )?
            {
             before(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1017:1: ( RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1017:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Delimiter__Group__02077); 

                    }
                    break;

            }

             after(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__Delimiter__Group__1_in_rule__Delimiter__Group__02087);
            rule__Delimiter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delimiter__Group__0


    // $ANTLR start rule__Delimiter__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1028:1: rule__Delimiter__Group__1 : ( ( rule__Delimiter__Alternatives_1 ) ) rule__Delimiter__Group__2 ;
    public final void rule__Delimiter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1032:1: ( ( ( rule__Delimiter__Alternatives_1 ) ) rule__Delimiter__Group__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1033:1: ( ( rule__Delimiter__Alternatives_1 ) ) rule__Delimiter__Group__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1033:1: ( ( rule__Delimiter__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1034:1: ( rule__Delimiter__Alternatives_1 )
            {
             before(grammarAccess.getDelimiterAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1035:1: ( rule__Delimiter__Alternatives_1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1035:2: rule__Delimiter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Delimiter__Alternatives_1_in_rule__Delimiter__Group__12115);
            rule__Delimiter__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getDelimiterAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__Delimiter__Group__2_in_rule__Delimiter__Group__12124);
            rule__Delimiter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delimiter__Group__1


    // $ANTLR start rule__Delimiter__Group__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1046:1: rule__Delimiter__Group__2 : ( ( RULE_WS )? ) ;
    public final void rule__Delimiter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1050:1: ( ( ( RULE_WS )? ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1051:1: ( ( RULE_WS )? )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1051:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1052:1: ( RULE_WS )?
            {
             before(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_2()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1053:1: ( RULE_WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_WS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1053:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Delimiter__Group__22153); 

                    }
                    break;

            }

             after(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delimiter__Group__2


    // $ANTLR start rule__CompoundString__Group_0__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1069:1: rule__CompoundString__Group_0__0 : ( () ) rule__CompoundString__Group_0__1 ;
    public final void rule__CompoundString__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1073:1: ( ( () ) rule__CompoundString__Group_0__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1074:1: ( () ) rule__CompoundString__Group_0__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1074:1: ( () )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1075:1: ()
            {
             before(grammarAccess.getCompoundStringAccess().getCompoundStringAction_0_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1076:1: ()
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1078:1: 
            {
            }

             after(grammarAccess.getCompoundStringAccess().getCompoundStringAction_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_0__1_in_rule__CompoundString__Group_0__02204);
            rule__CompoundString__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_0__0


    // $ANTLR start rule__CompoundString__Group_0__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1089:1: rule__CompoundString__Group_0__1 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__CompoundString__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1093:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1094:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1094:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1095:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_0_1()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_0__12232); 
             after(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_0__1


    // $ANTLR start rule__CompoundString__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1110:1: rule__CompoundString__Group_1__0 : ( ( rule__CompoundString__PartsAssignment_1_0 ) ) rule__CompoundString__Group_1__1 ;
    public final void rule__CompoundString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1114:1: ( ( ( rule__CompoundString__PartsAssignment_1_0 ) ) rule__CompoundString__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1115:1: ( ( rule__CompoundString__PartsAssignment_1_0 ) ) rule__CompoundString__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1115:1: ( ( rule__CompoundString__PartsAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1116:1: ( rule__CompoundString__PartsAssignment_1_0 )
            {
             before(grammarAccess.getCompoundStringAccess().getPartsAssignment_1_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1117:1: ( rule__CompoundString__PartsAssignment_1_0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1117:2: rule__CompoundString__PartsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__CompoundString__PartsAssignment_1_0_in_rule__CompoundString__Group_1__02269);
            rule__CompoundString__PartsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringAccess().getPartsAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_1__1_in_rule__CompoundString__Group_1__02278);
            rule__CompoundString__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1__0


    // $ANTLR start rule__CompoundString__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1128:1: rule__CompoundString__Group_1__1 : ( ( rule__CompoundString__Group_1_1__0 )* ) rule__CompoundString__Group_1__2 ;
    public final void rule__CompoundString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1132:1: ( ( ( rule__CompoundString__Group_1_1__0 )* ) rule__CompoundString__Group_1__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1133:1: ( ( rule__CompoundString__Group_1_1__0 )* ) rule__CompoundString__Group_1__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1133:1: ( ( rule__CompoundString__Group_1_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1134:1: ( rule__CompoundString__Group_1_1__0 )*
            {
             before(grammarAccess.getCompoundStringAccess().getGroup_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1135:1: ( rule__CompoundString__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1135:2: rule__CompoundString__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundString__Group_1_1__0_in_rule__CompoundString__Group_1__12306);
            	    rule__CompoundString__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCompoundStringAccess().getGroup_1_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_1__2_in_rule__CompoundString__Group_1__12316);
            rule__CompoundString__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1__1


    // $ANTLR start rule__CompoundString__Group_1__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1146:1: rule__CompoundString__Group_1__2 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__CompoundString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1150:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1151:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1151:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1152:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_2()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_1__22344); 
             after(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1__2


    // $ANTLR start rule__CompoundString__Group_1_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1169:1: rule__CompoundString__Group_1_1__0 : ( '\\\\' ) rule__CompoundString__Group_1_1__1 ;
    public final void rule__CompoundString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1173:1: ( ( '\\\\' ) rule__CompoundString__Group_1_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1174:1: ( '\\\\' ) rule__CompoundString__Group_1_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1174:1: ( '\\\\' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1175:1: '\\\\'
            {
             before(grammarAccess.getCompoundStringAccess().getReverseSolidusKeyword_1_1_0()); 
            match(input,14,FOLLOW_14_in_rule__CompoundString__Group_1_1__02384); 
             after(grammarAccess.getCompoundStringAccess().getReverseSolidusKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_1_1__1_in_rule__CompoundString__Group_1_1__02394);
            rule__CompoundString__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1_1__0


    // $ANTLR start rule__CompoundString__Group_1_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1189:1: rule__CompoundString__Group_1_1__1 : ( RULE_LINE_TERMINATOR ) rule__CompoundString__Group_1_1__2 ;
    public final void rule__CompoundString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1193:1: ( ( RULE_LINE_TERMINATOR ) rule__CompoundString__Group_1_1__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1194:1: ( RULE_LINE_TERMINATOR ) rule__CompoundString__Group_1_1__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1194:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1195:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_1_1__12422); 
             after(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_1_1__2_in_rule__CompoundString__Group_1_1__12430);
            rule__CompoundString__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1_1__1


    // $ANTLR start rule__CompoundString__Group_1_1__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1207:1: rule__CompoundString__Group_1_1__2 : ( ( RULE_WS )? ) rule__CompoundString__Group_1_1__3 ;
    public final void rule__CompoundString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1211:1: ( ( ( RULE_WS )? ) rule__CompoundString__Group_1_1__3 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1212:1: ( ( RULE_WS )? ) rule__CompoundString__Group_1_1__3
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1212:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1213:1: ( RULE_WS )?
            {
             before(grammarAccess.getCompoundStringAccess().getWSTerminalRuleCall_1_1_2()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1214:1: ( RULE_WS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_WS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1214:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CompoundString__Group_1_1__22459); 

                    }
                    break;

            }

             after(grammarAccess.getCompoundStringAccess().getWSTerminalRuleCall_1_1_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundString__Group_1_1__3_in_rule__CompoundString__Group_1_1__22469);
            rule__CompoundString__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1_1__2


    // $ANTLR start rule__CompoundString__Group_1_1__3
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1225:1: rule__CompoundString__Group_1_1__3 : ( ( rule__CompoundString__PartsAssignment_1_1_3 ) ) ;
    public final void rule__CompoundString__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1229:1: ( ( ( rule__CompoundString__PartsAssignment_1_1_3 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1230:1: ( ( rule__CompoundString__PartsAssignment_1_1_3 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1230:1: ( ( rule__CompoundString__PartsAssignment_1_1_3 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1231:1: ( rule__CompoundString__PartsAssignment_1_1_3 )
            {
             before(grammarAccess.getCompoundStringAccess().getPartsAssignment_1_1_3()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1232:1: ( rule__CompoundString__PartsAssignment_1_1_3 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1232:2: rule__CompoundString__PartsAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__CompoundString__PartsAssignment_1_1_3_in_rule__CompoundString__Group_1_1__32497);
            rule__CompoundString__PartsAssignment_1_1_3();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringAccess().getPartsAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__Group_1_1__3


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_0__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1250:1: rule__CompoundStringLeadingDelimiter__Group_0__0 : ( () ) rule__CompoundStringLeadingDelimiter__Group_0__1 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1254:1: ( ( () ) rule__CompoundStringLeadingDelimiter__Group_0__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1255:1: ( () ) rule__CompoundStringLeadingDelimiter__Group_0__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1255:1: ( () )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1256:1: ()
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getEmptyPropertyValueAction_0_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1257:1: ()
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1259:1: 
            {
            }

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getEmptyPropertyValueAction_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_0__1_in_rule__CompoundStringLeadingDelimiter__Group_0__02549);
            rule__CompoundStringLeadingDelimiter__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_0__0


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_0__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1270:1: rule__CompoundStringLeadingDelimiter__Group_0__1 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__CompoundStringLeadingDelimiter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1274:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1275:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1275:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1276:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_0_1()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_0__12577); 
             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_0__1


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1291:1: rule__CompoundStringLeadingDelimiter__Group_1__0 : ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 ) ) rule__CompoundStringLeadingDelimiter__Group_1__1 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1295:1: ( ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 ) ) rule__CompoundStringLeadingDelimiter__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1296:1: ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 ) ) rule__CompoundStringLeadingDelimiter__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1296:1: ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1297:1: ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 )
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsAssignment_1_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1298:1: ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1298:2: rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0_in_rule__CompoundStringLeadingDelimiter__Group_1__02614);
            rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__1_in_rule__CompoundStringLeadingDelimiter__Group_1__02623);
            rule__CompoundStringLeadingDelimiter__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1__0


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1309:1: rule__CompoundStringLeadingDelimiter__Group_1__1 : ( ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )* ) rule__CompoundStringLeadingDelimiter__Group_1__2 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1313:1: ( ( ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )* ) rule__CompoundStringLeadingDelimiter__Group_1__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1314:1: ( ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )* ) rule__CompoundStringLeadingDelimiter__Group_1__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1314:1: ( ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1315:1: ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )*
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1316:1: ( rule__CompoundStringLeadingDelimiter__Group_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1316:2: rule__CompoundStringLeadingDelimiter__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__0_in_rule__CompoundStringLeadingDelimiter__Group_1__12651);
            	    rule__CompoundStringLeadingDelimiter__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getGroup_1_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__2_in_rule__CompoundStringLeadingDelimiter__Group_1__12661);
            rule__CompoundStringLeadingDelimiter__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1__1


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1327:1: rule__CompoundStringLeadingDelimiter__Group_1__2 : ( RULE_LINE_TERMINATOR ) ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1331:1: ( ( RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1332:1: ( RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1332:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1333:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_2()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_1__22689); 
             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1__2


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1350:1: rule__CompoundStringLeadingDelimiter__Group_1_1__0 : ( '\\\\' ) rule__CompoundStringLeadingDelimiter__Group_1_1__1 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1354:1: ( ( '\\\\' ) rule__CompoundStringLeadingDelimiter__Group_1_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1355:1: ( '\\\\' ) rule__CompoundStringLeadingDelimiter__Group_1_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1355:1: ( '\\\\' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1356:1: '\\\\'
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getReverseSolidusKeyword_1_1_0()); 
            match(input,14,FOLLOW_14_in_rule__CompoundStringLeadingDelimiter__Group_1_1__02729); 
             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getReverseSolidusKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__1_in_rule__CompoundStringLeadingDelimiter__Group_1_1__02739);
            rule__CompoundStringLeadingDelimiter__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1_1__0


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1370:1: rule__CompoundStringLeadingDelimiter__Group_1_1__1 : ( RULE_LINE_TERMINATOR ) rule__CompoundStringLeadingDelimiter__Group_1_1__2 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1374:1: ( ( RULE_LINE_TERMINATOR ) rule__CompoundStringLeadingDelimiter__Group_1_1__2 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1375:1: ( RULE_LINE_TERMINATOR ) rule__CompoundStringLeadingDelimiter__Group_1_1__2
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1375:1: ( RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1376:1: RULE_LINE_TERMINATOR
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1()); 
            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_1_1__12767); 
             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__2_in_rule__CompoundStringLeadingDelimiter__Group_1_1__12775);
            rule__CompoundStringLeadingDelimiter__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1_1__1


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1_1__2
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1388:1: rule__CompoundStringLeadingDelimiter__Group_1_1__2 : ( ( RULE_WS )? ) rule__CompoundStringLeadingDelimiter__Group_1_1__3 ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1392:1: ( ( ( RULE_WS )? ) rule__CompoundStringLeadingDelimiter__Group_1_1__3 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1393:1: ( ( RULE_WS )? ) rule__CompoundStringLeadingDelimiter__Group_1_1__3
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1393:1: ( ( RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1394:1: ( RULE_WS )?
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getWSTerminalRuleCall_1_1_2()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1395:1: ( RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1395:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CompoundStringLeadingDelimiter__Group_1_1__22804); 

                    }
                    break;

            }

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getWSTerminalRuleCall_1_1_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__3_in_rule__CompoundStringLeadingDelimiter__Group_1_1__22814);
            rule__CompoundStringLeadingDelimiter__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1_1__2


    // $ANTLR start rule__CompoundStringLeadingDelimiter__Group_1_1__3
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1406:1: rule__CompoundStringLeadingDelimiter__Group_1_1__3 : ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 ) ) ;
    public final void rule__CompoundStringLeadingDelimiter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1410:1: ( ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 ) ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1411:1: ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 ) )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1411:1: ( ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1412:1: ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 )
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsAssignment_1_1_3()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1413:1: ( rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1413:2: rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3
            {
            pushFollow(FOLLOW_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3_in_rule__CompoundStringLeadingDelimiter__Group_1_1__32842);
            rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3();
            _fsp--;


            }

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsAssignment_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__Group_1_1__3


    // $ANTLR start rule__CompoundStringPartLeadingDelimiterValue__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1431:1: rule__CompoundStringPartLeadingDelimiterValue__Group__0 : ( ruleNonWSConstant ) rule__CompoundStringPartLeadingDelimiterValue__Group__1 ;
    public final void rule__CompoundStringPartLeadingDelimiterValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1435:1: ( ( ruleNonWSConstant ) rule__CompoundStringPartLeadingDelimiterValue__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1436:1: ( ruleNonWSConstant ) rule__CompoundStringPartLeadingDelimiterValue__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1436:1: ( ruleNonWSConstant )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1437:1: ruleNonWSConstant
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartLeadingDelimiterValue__Group__02884);
            ruleNonWSConstant();
            _fsp--;

             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group__1_in_rule__CompoundStringPartLeadingDelimiterValue__Group__02892);
            rule__CompoundStringPartLeadingDelimiterValue__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartLeadingDelimiterValue__Group__0


    // $ANTLR start rule__CompoundStringPartLeadingDelimiterValue__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1449:1: rule__CompoundStringPartLeadingDelimiterValue__Group__1 : ( ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )* ) ;
    public final void rule__CompoundStringPartLeadingDelimiterValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1453:1: ( ( ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1454:1: ( ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1454:1: ( ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1455:1: ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )*
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1456:1: ( rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1456:2: rule__CompoundStringPartLeadingDelimiterValue__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group_1__0_in_rule__CompoundStringPartLeadingDelimiterValue__Group__12920);
            	    rule__CompoundStringPartLeadingDelimiterValue__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartLeadingDelimiterValue__Group__1


    // $ANTLR start rule__CompoundStringPartLeadingDelimiterValue__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1470:1: rule__CompoundStringPartLeadingDelimiterValue__Group_1__0 : ( RULE_WS ) rule__CompoundStringPartLeadingDelimiterValue__Group_1__1 ;
    public final void rule__CompoundStringPartLeadingDelimiterValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1474:1: ( ( RULE_WS ) rule__CompoundStringPartLeadingDelimiterValue__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1475:1: ( RULE_WS ) rule__CompoundStringPartLeadingDelimiterValue__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1475:1: ( RULE_WS )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1476:1: RULE_WS
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getWSTerminalRuleCall_1_0()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__02959); 
             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getWSTerminalRuleCall_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group_1__1_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__02967);
            rule__CompoundStringPartLeadingDelimiterValue__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartLeadingDelimiterValue__Group_1__0


    // $ANTLR start rule__CompoundStringPartLeadingDelimiterValue__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1488:1: rule__CompoundStringPartLeadingDelimiterValue__Group_1__1 : ( ( ruleNonWSConstant )? ) ;
    public final void rule__CompoundStringPartLeadingDelimiterValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1492:1: ( ( ( ruleNonWSConstant )? ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1493:1: ( ( ruleNonWSConstant )? )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1493:1: ( ( ruleNonWSConstant )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1494:1: ( ruleNonWSConstant )?
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1495:1: ( ruleNonWSConstant )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SL_COMMENT||LA21_0==RULE_ID||(LA21_0>=11 && LA21_0<=13)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1495:3: ruleNonWSConstant
                    {
                    pushFollow(FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__12996);
                    ruleNonWSConstant();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartLeadingDelimiterValue__Group_1__1


    // $ANTLR start rule__CompoundStringPartValue__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1509:1: rule__CompoundStringPartValue__Group__0 : ( ruleKey ) rule__CompoundStringPartValue__Group__1 ;
    public final void rule__CompoundStringPartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1513:1: ( ( ruleKey ) rule__CompoundStringPartValue__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1514:1: ( ruleKey ) rule__CompoundStringPartValue__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1514:1: ( ruleKey )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1515:1: ruleKey
            {
             before(grammarAccess.getCompoundStringPartValueAccess().getKeyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__CompoundStringPartValue__Group__03035);
            ruleKey();
            _fsp--;

             after(grammarAccess.getCompoundStringPartValueAccess().getKeyParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringPartValue__Group__1_in_rule__CompoundStringPartValue__Group__03043);
            rule__CompoundStringPartValue__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartValue__Group__0


    // $ANTLR start rule__CompoundStringPartValue__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1527:1: rule__CompoundStringPartValue__Group__1 : ( ( rule__CompoundStringPartValue__Group_1__0 )* ) ;
    public final void rule__CompoundStringPartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1531:1: ( ( ( rule__CompoundStringPartValue__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1532:1: ( ( rule__CompoundStringPartValue__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1532:1: ( ( rule__CompoundStringPartValue__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1533:1: ( rule__CompoundStringPartValue__Group_1__0 )*
            {
             before(grammarAccess.getCompoundStringPartValueAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1534:1: ( rule__CompoundStringPartValue__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1534:2: rule__CompoundStringPartValue__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundStringPartValue__Group_1__0_in_rule__CompoundStringPartValue__Group__13071);
            	    rule__CompoundStringPartValue__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCompoundStringPartValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartValue__Group__1


    // $ANTLR start rule__CompoundStringPartValue__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1548:1: rule__CompoundStringPartValue__Group_1__0 : ( RULE_WS ) rule__CompoundStringPartValue__Group_1__1 ;
    public final void rule__CompoundStringPartValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1552:1: ( ( RULE_WS ) rule__CompoundStringPartValue__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1553:1: ( RULE_WS ) rule__CompoundStringPartValue__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1553:1: ( RULE_WS )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1554:1: RULE_WS
            {
             before(grammarAccess.getCompoundStringPartValueAccess().getWSTerminalRuleCall_1_0()); 
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CompoundStringPartValue__Group_1__03110); 
             after(grammarAccess.getCompoundStringPartValueAccess().getWSTerminalRuleCall_1_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundStringPartValue__Group_1__1_in_rule__CompoundStringPartValue__Group_1__03118);
            rule__CompoundStringPartValue__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartValue__Group_1__0


    // $ANTLR start rule__CompoundStringPartValue__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1566:1: rule__CompoundStringPartValue__Group_1__1 : ( ( ruleNonWSConstant )? ) ;
    public final void rule__CompoundStringPartValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1570:1: ( ( ( ruleNonWSConstant )? ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1571:1: ( ( ruleNonWSConstant )? )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1571:1: ( ( ruleNonWSConstant )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1572:1: ( ruleNonWSConstant )?
            {
             before(grammarAccess.getCompoundStringPartValueAccess().getNonWSConstantParserRuleCall_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1573:1: ( ruleNonWSConstant )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SL_COMMENT||LA23_0==RULE_ID||(LA23_0>=11 && LA23_0<=13)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1573:3: ruleNonWSConstant
                    {
                    pushFollow(FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartValue__Group_1__13147);
                    ruleNonWSConstant();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundStringPartValueAccess().getNonWSConstantParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartValue__Group_1__1


    // $ANTLR start rule__NonWsNonCommentConstant__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1587:1: rule__NonWsNonCommentConstant__Group__0 : ( ruleKey ) rule__NonWsNonCommentConstant__Group__1 ;
    public final void rule__NonWsNonCommentConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1591:1: ( ( ruleKey ) rule__NonWsNonCommentConstant__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1592:1: ( ruleKey ) rule__NonWsNonCommentConstant__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1592:1: ( ruleKey )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1593:1: ruleKey
            {
             before(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__NonWsNonCommentConstant__Group__03186);
            ruleKey();
            _fsp--;

             after(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__NonWsNonCommentConstant__Group__1_in_rule__NonWsNonCommentConstant__Group__03194);
            rule__NonWsNonCommentConstant__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWsNonCommentConstant__Group__0


    // $ANTLR start rule__NonWsNonCommentConstant__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1605:1: rule__NonWsNonCommentConstant__Group__1 : ( ( rule__NonWsNonCommentConstant__Group_1__0 )* ) ;
    public final void rule__NonWsNonCommentConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1609:1: ( ( ( rule__NonWsNonCommentConstant__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1610:1: ( ( rule__NonWsNonCommentConstant__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1610:1: ( ( rule__NonWsNonCommentConstant__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1611:1: ( rule__NonWsNonCommentConstant__Group_1__0 )*
            {
             before(grammarAccess.getNonWsNonCommentConstantAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1612:1: ( rule__NonWsNonCommentConstant__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=9 && LA24_0<=10)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1612:2: rule__NonWsNonCommentConstant__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NonWsNonCommentConstant__Group_1__0_in_rule__NonWsNonCommentConstant__Group__13222);
            	    rule__NonWsNonCommentConstant__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getNonWsNonCommentConstantAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWsNonCommentConstant__Group__1


    // $ANTLR start rule__NonWsNonCommentConstant__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1626:1: rule__NonWsNonCommentConstant__Group_1__0 : ( ( rule__NonWsNonCommentConstant__Alternatives_1_0 ) ) rule__NonWsNonCommentConstant__Group_1__1 ;
    public final void rule__NonWsNonCommentConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1630:1: ( ( ( rule__NonWsNonCommentConstant__Alternatives_1_0 ) ) rule__NonWsNonCommentConstant__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1631:1: ( ( rule__NonWsNonCommentConstant__Alternatives_1_0 ) ) rule__NonWsNonCommentConstant__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1631:1: ( ( rule__NonWsNonCommentConstant__Alternatives_1_0 ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1632:1: ( rule__NonWsNonCommentConstant__Alternatives_1_0 )
            {
             before(grammarAccess.getNonWsNonCommentConstantAccess().getAlternatives_1_0()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1633:1: ( rule__NonWsNonCommentConstant__Alternatives_1_0 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1633:2: rule__NonWsNonCommentConstant__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__NonWsNonCommentConstant__Alternatives_1_0_in_rule__NonWsNonCommentConstant__Group_1__03261);
            rule__NonWsNonCommentConstant__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getNonWsNonCommentConstantAccess().getAlternatives_1_0()); 

            }

            pushFollow(FOLLOW_rule__NonWsNonCommentConstant__Group_1__1_in_rule__NonWsNonCommentConstant__Group_1__03270);
            rule__NonWsNonCommentConstant__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWsNonCommentConstant__Group_1__0


    // $ANTLR start rule__NonWsNonCommentConstant__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1644:1: rule__NonWsNonCommentConstant__Group_1__1 : ( ( ruleKey )? ) ;
    public final void rule__NonWsNonCommentConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1648:1: ( ( ( ruleKey )? ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1649:1: ( ( ruleKey )? )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1649:1: ( ( ruleKey )? )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1650:1: ( ruleKey )?
            {
             before(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_1_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1651:1: ( ruleKey )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=11 && LA25_0<=13)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1651:3: ruleKey
                    {
                    pushFollow(FOLLOW_ruleKey_in_rule__NonWsNonCommentConstant__Group_1__13299);
                    ruleKey();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NonWsNonCommentConstant__Group_1__1


    // $ANTLR start rule__FQN__Group__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1665:1: rule__FQN__Group__0 : ( RULE_ID ) rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1669:1: ( ( RULE_ID ) rule__FQN__Group__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1670:1: ( RULE_ID ) rule__FQN__Group__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1670:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1671:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__03338); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03346);
            rule__FQN__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__0


    // $ANTLR start rule__FQN__Group__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1683:1: rule__FQN__Group__1 : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1687:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1688:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1688:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1689:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1690:1: ( rule__FQN__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1690:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__13374);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group__1


    // $ANTLR start rule__FQN__Group_1__0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1704:1: rule__FQN__Group_1__0 : ( '.' ) rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1708:1: ( ( '.' ) rule__FQN__Group_1__1 )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1709:1: ( '.' ) rule__FQN__Group_1__1
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1709:1: ( '.' )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1710:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__FQN__Group_1__03414); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03424);
            rule__FQN__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__0


    // $ANTLR start rule__FQN__Group_1__1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1724:1: rule__FQN__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1728:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1729:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1729:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1730:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__13452); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FQN__Group_1__1


    // $ANTLR start rule__PropertyFile__EntriesAssignment
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1746:1: rule__PropertyFile__EntriesAssignment : ( ruleNaturalLine ) ;
    public final void rule__PropertyFile__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1750:1: ( ( ruleNaturalLine ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1751:1: ( ruleNaturalLine )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1751:1: ( ruleNaturalLine )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1752:1: ruleNaturalLine
            {
             before(grammarAccess.getPropertyFileAccess().getEntriesNaturalLineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNaturalLine_in_rule__PropertyFile__EntriesAssignment3490);
            ruleNaturalLine();
            _fsp--;

             after(grammarAccess.getPropertyFileAccess().getEntriesNaturalLineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyFile__EntriesAssignment


    // $ANTLR start rule__PropertyComment__ValueAssignment_1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1761:1: rule__PropertyComment__ValueAssignment_1 : ( RULE_SL_COMMENT ) ;
    public final void rule__PropertyComment__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1765:1: ( ( RULE_SL_COMMENT ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1766:1: ( RULE_SL_COMMENT )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1766:1: ( RULE_SL_COMMENT )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1767:1: RULE_SL_COMMENT
            {
             before(grammarAccess.getPropertyCommentAccess().getValueSL_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__PropertyComment__ValueAssignment_13521); 
             after(grammarAccess.getPropertyCommentAccess().getValueSL_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyComment__ValueAssignment_1


    // $ANTLR start rule__PropertyEntry__NameAssignment_1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1776:1: rule__PropertyEntry__NameAssignment_1 : ( ruleKey ) ;
    public final void rule__PropertyEntry__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1780:1: ( ( ruleKey ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1781:1: ( ruleKey )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1781:1: ( ruleKey )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1782:1: ruleKey
            {
             before(grammarAccess.getPropertyEntryAccess().getNameKeyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__PropertyEntry__NameAssignment_13552);
            ruleKey();
            _fsp--;

             after(grammarAccess.getPropertyEntryAccess().getNameKeyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__NameAssignment_1


    // $ANTLR start rule__PropertyEntry__DelimiterAssignment_2_0_0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1791:1: rule__PropertyEntry__DelimiterAssignment_2_0_0 : ( ruleDelimiter ) ;
    public final void rule__PropertyEntry__DelimiterAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1795:1: ( ( ruleDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1796:1: ( ruleDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1796:1: ( ruleDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1797:1: ruleDelimiter
            {
             before(grammarAccess.getPropertyEntryAccess().getDelimiterDelimiterParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleDelimiter_in_rule__PropertyEntry__DelimiterAssignment_2_0_03583);
            ruleDelimiter();
            _fsp--;

             after(grammarAccess.getPropertyEntryAccess().getDelimiterDelimiterParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__DelimiterAssignment_2_0_0


    // $ANTLR start rule__PropertyEntry__ValueAssignment_2_0_1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1806:1: rule__PropertyEntry__ValueAssignment_2_0_1 : ( ruleCompoundStringLeadingDelimiter ) ;
    public final void rule__PropertyEntry__ValueAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1810:1: ( ( ruleCompoundStringLeadingDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1811:1: ( ruleCompoundStringLeadingDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1811:1: ( ruleCompoundStringLeadingDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1812:1: ruleCompoundStringLeadingDelimiter
            {
             before(grammarAccess.getPropertyEntryAccess().getValueCompoundStringLeadingDelimiterParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleCompoundStringLeadingDelimiter_in_rule__PropertyEntry__ValueAssignment_2_0_13614);
            ruleCompoundStringLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getPropertyEntryAccess().getValueCompoundStringLeadingDelimiterParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__ValueAssignment_2_0_1


    // $ANTLR start rule__PropertyEntry__DelimiterAssignment_2_1_0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1821:1: rule__PropertyEntry__DelimiterAssignment_2_1_0 : ( ruleSimpleDelimiter ) ;
    public final void rule__PropertyEntry__DelimiterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1825:1: ( ( ruleSimpleDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1826:1: ( ruleSimpleDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1826:1: ( ruleSimpleDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1827:1: ruleSimpleDelimiter
            {
             before(grammarAccess.getPropertyEntryAccess().getDelimiterSimpleDelimiterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleDelimiter_in_rule__PropertyEntry__DelimiterAssignment_2_1_03645);
            ruleSimpleDelimiter();
            _fsp--;

             after(grammarAccess.getPropertyEntryAccess().getDelimiterSimpleDelimiterParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__DelimiterAssignment_2_1_0


    // $ANTLR start rule__PropertyEntry__ValueAssignment_2_1_1
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1836:1: rule__PropertyEntry__ValueAssignment_2_1_1 : ( ruleCompoundString ) ;
    public final void rule__PropertyEntry__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1840:1: ( ( ruleCompoundString ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1841:1: ( ruleCompoundString )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1841:1: ( ruleCompoundString )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1842:1: ruleCompoundString
            {
             before(grammarAccess.getPropertyEntryAccess().getValueCompoundStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleCompoundString_in_rule__PropertyEntry__ValueAssignment_2_1_13676);
            ruleCompoundString();
            _fsp--;

             after(grammarAccess.getPropertyEntryAccess().getValueCompoundStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PropertyEntry__ValueAssignment_2_1_1


    // $ANTLR start rule__CompoundString__PartsAssignment_1_0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1851:1: rule__CompoundString__PartsAssignment_1_0 : ( ruleCompoundStringPart ) ;
    public final void rule__CompoundString__PartsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1855:1: ( ( ruleCompoundStringPart ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1856:1: ( ruleCompoundStringPart )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1856:1: ( ruleCompoundStringPart )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1857:1: ruleCompoundStringPart
            {
             before(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPart_in_rule__CompoundString__PartsAssignment_1_03707);
            ruleCompoundStringPart();
            _fsp--;

             after(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__PartsAssignment_1_0


    // $ANTLR start rule__CompoundString__PartsAssignment_1_1_3
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1866:1: rule__CompoundString__PartsAssignment_1_1_3 : ( ruleCompoundStringPartLeadingDelimiter ) ;
    public final void rule__CompoundString__PartsAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1870:1: ( ( ruleCompoundStringPartLeadingDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1871:1: ( ruleCompoundStringPartLeadingDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1871:1: ( ruleCompoundStringPartLeadingDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1872:1: ruleCompoundStringPartLeadingDelimiter
            {
             before(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundString__PartsAssignment_1_1_33738);
            ruleCompoundStringPartLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundString__PartsAssignment_1_1_3


    // $ANTLR start rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1881:1: rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0 : ( ruleCompoundStringPartLeadingDelimiter ) ;
    public final void rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1885:1: ( ( ruleCompoundStringPartLeadingDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1886:1: ( ruleCompoundStringPartLeadingDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1886:1: ( ruleCompoundStringPartLeadingDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1887:1: ruleCompoundStringPartLeadingDelimiter
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_03769);
            ruleCompoundStringPartLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0


    // $ANTLR start rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1896:1: rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3 : ( ruleCompoundStringPartLeadingDelimiter ) ;
    public final void rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1900:1: ( ( ruleCompoundStringPartLeadingDelimiter ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1901:1: ( ruleCompoundStringPartLeadingDelimiter )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1901:1: ( ruleCompoundStringPartLeadingDelimiter )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1902:1: ruleCompoundStringPartLeadingDelimiter
            {
             before(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_33800);
            ruleCompoundStringPartLeadingDelimiter();
            _fsp--;

             after(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3


    // $ANTLR start rule__CompoundStringPartLeadingDelimiter__ValueAssignment
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1911:1: rule__CompoundStringPartLeadingDelimiter__ValueAssignment : ( ruleCompoundStringPartLeadingDelimiterValue ) ;
    public final void rule__CompoundStringPartLeadingDelimiter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1915:1: ( ( ruleCompoundStringPartLeadingDelimiterValue ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1916:1: ( ruleCompoundStringPartLeadingDelimiterValue )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1916:1: ( ruleCompoundStringPartLeadingDelimiterValue )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1917:1: ruleCompoundStringPartLeadingDelimiterValue
            {
             before(grammarAccess.getCompoundStringPartLeadingDelimiterAccess().getValueCompoundStringPartLeadingDelimiterValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_rule__CompoundStringPartLeadingDelimiter__ValueAssignment3831);
            ruleCompoundStringPartLeadingDelimiterValue();
            _fsp--;

             after(grammarAccess.getCompoundStringPartLeadingDelimiterAccess().getValueCompoundStringPartLeadingDelimiterValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPartLeadingDelimiter__ValueAssignment


    // $ANTLR start rule__CompoundStringPart__ValueAssignment
    // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1926:1: rule__CompoundStringPart__ValueAssignment : ( ruleCompoundStringPartValue ) ;
    public final void rule__CompoundStringPart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1930:1: ( ( ruleCompoundStringPartValue ) )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1931:1: ( ruleCompoundStringPartValue )
            {
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1931:1: ( ruleCompoundStringPartValue )
            // ../org.eclipse.emf.mwe.properties.ui/src-gen/org/eclipse/emf/mwe/properties/ui/contentassist/antlr/internal/InternalMWEProperties.g:1932:1: ruleCompoundStringPartValue
            {
             before(grammarAccess.getCompoundStringPartAccess().getValueCompoundStringPartValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompoundStringPartValue_in_rule__CompoundStringPart__ValueAssignment3862);
            ruleCompoundStringPartValue();
            _fsp--;

             after(grammarAccess.getCompoundStringPartAccess().getValueCompoundStringPartValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundStringPart__ValueAssignment


 

    public static final BitSet FOLLOW_rulePropertyFile_in_entryRulePropertyFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFile__EntriesAssignment_in_rulePropertyFile94 = new BitSet(new long[]{0x00000000000038F2L});
    public static final BitSet FOLLOW_ruleNaturalLine_in_entryRuleNaturalLine122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLine129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalLine__Alternatives_in_ruleNaturalLine155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_entryRuleBlankLine182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankLine189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankLine__Group__0_in_ruleBlankLine215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyComment_in_entryRulePropertyComment242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyComment249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyComment__Group__0_in_rulePropertyComment275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyEntry_in_entryRulePropertyEntry302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyEntry309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group__0_in_rulePropertyEntry335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelimiter_in_entryRuleDelimiter362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelimiter369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delimiter__Group__0_in_ruleDelimiter395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDelimiter_in_entryRuleSimpleDelimiter422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDelimiter429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSimpleDelimiter455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundString_in_entryRuleCompoundString481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundString488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__Alternatives_in_ruleCompoundString514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringLeadingDelimiter_in_entryRuleCompoundStringLeadingDelimiter541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringLeadingDelimiter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Alternatives_in_ruleCompoundStringLeadingDelimiter574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_entryRuleCompoundStringPartLeadingDelimiter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPartLeadingDelimiter__ValueAssignment_in_ruleCompoundStringPartLeadingDelimiter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_entryRuleCompoundStringPartLeadingDelimiterValue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiterValue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group__0_in_ruleCompoundStringPartLeadingDelimiterValue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPart_in_entryRuleCompoundStringPart721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPart728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPart__ValueAssignment_in_ruleCompoundStringPart754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartValue_in_entryRuleCompoundStringPartValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPartValue__Group__0_in_ruleCompoundStringPartValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_entryRuleNonWSConstant841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonWSConstant848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonWSConstant__Alternatives_in_ruleNonWSConstant874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWsNonCommentConstant_in_entryRuleNonWsNonCommentConstant901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonWsNonCommentConstant908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonWsNonCommentConstant__Group__0_in_ruleNonWsNonCommentConstant934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Alternatives_in_ruleKey996 = new BitSet(new long[]{0x0000000000003882L});
    public static final BitSet FOLLOW_rule__Key__Alternatives_in_ruleKey1008 = new BitSet(new long[]{0x0000000000003882L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_rule__NaturalLine__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyComment_in_rule__NaturalLine__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyEntry_in_rule__NaturalLine__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group_2_0__0_in_rule__PropertyEntry__Alternatives_21173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group_2_1__0_in_rule__PropertyEntry__Alternatives_21191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Delimiter__Alternatives_11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Delimiter__Alternatives_11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_0__0_in_rule__CompoundString__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1__0_in_rule__CompoundString__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_0__0_in_rule__CompoundStringLeadingDelimiter__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__0_in_rule__CompoundStringLeadingDelimiter__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWsNonCommentConstant_in_rule__NonWSConstant__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__NonWSConstant__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__NonWsNonCommentConstant__Alternatives_1_01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__NonWsNonCommentConstant__Alternatives_1_01451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Key__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Key__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Key__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Key__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankLine__Group__1_in_rule__BlankLine__Group__01589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__BlankLine__Group__11618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BlankLine__Group__2_in_rule__BlankLine__Group__11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__BlankLine__Group__21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__PropertyComment__Group__01696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyComment__Group__1_in_rule__PropertyComment__Group__01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyComment__ValueAssignment_1_in_rule__PropertyComment__Group__11734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyComment__Group__2_in_rule__PropertyComment__Group__11743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__PropertyComment__Group__21771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__PropertyEntry__Group__01811 = new BitSet(new long[]{0x0000000000003880L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group__1_in_rule__PropertyEntry__Group__01821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__NameAssignment_1_in_rule__PropertyEntry__Group__11849 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group__2_in_rule__PropertyEntry__Group__11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Alternatives_2_in_rule__PropertyEntry__Group__21886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__DelimiterAssignment_2_0_0_in_rule__PropertyEntry__Group_2_0__01926 = new BitSet(new long[]{0x00000000000038E0L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group_2_0__1_in_rule__PropertyEntry__Group_2_0__01935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__ValueAssignment_2_0_1_in_rule__PropertyEntry__Group_2_0__11963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__DelimiterAssignment_2_1_0_in_rule__PropertyEntry__Group_2_1__02001 = new BitSet(new long[]{0x00000000000038C0L});
    public static final BitSet FOLLOW_rule__PropertyEntry__Group_2_1__1_in_rule__PropertyEntry__Group_2_1__02010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyEntry__ValueAssignment_2_1_1_in_rule__PropertyEntry__Group_2_1__12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Delimiter__Group__02077 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Delimiter__Group__1_in_rule__Delimiter__Group__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delimiter__Alternatives_1_in_rule__Delimiter__Group__12115 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delimiter__Group__2_in_rule__Delimiter__Group__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Delimiter__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_0__1_in_rule__CompoundString__Group_0__02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_0__12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__PartsAssignment_1_0_in_rule__CompoundString__Group_1__02269 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1__1_in_rule__CompoundString__Group_1__02278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1_1__0_in_rule__CompoundString__Group_1__12306 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1__2_in_rule__CompoundString__Group_1__12316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_1__22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompoundString__Group_1_1__02384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1_1__1_in_rule__CompoundString__Group_1_1__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundString__Group_1_1__12422 = new BitSet(new long[]{0x00000000000038B0L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1_1__2_in_rule__CompoundString__Group_1_1__12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CompoundString__Group_1_1__22459 = new BitSet(new long[]{0x00000000000038A0L});
    public static final BitSet FOLLOW_rule__CompoundString__Group_1_1__3_in_rule__CompoundString__Group_1_1__22469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundString__PartsAssignment_1_1_3_in_rule__CompoundString__Group_1_1__32497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_0__1_in_rule__CompoundStringLeadingDelimiter__Group_0__02549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_0__12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_0_in_rule__CompoundStringLeadingDelimiter__Group_1__02614 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__1_in_rule__CompoundStringLeadingDelimiter__Group_1__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__0_in_rule__CompoundStringLeadingDelimiter__Group_1__12651 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1__2_in_rule__CompoundStringLeadingDelimiter__Group_1__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_1__22689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CompoundStringLeadingDelimiter__Group_1_1__02729 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__1_in_rule__CompoundStringLeadingDelimiter__Group_1_1__02739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rule__CompoundStringLeadingDelimiter__Group_1_1__12767 = new BitSet(new long[]{0x00000000000038B0L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__2_in_rule__CompoundStringLeadingDelimiter__Group_1_1__12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CompoundStringLeadingDelimiter__Group_1_1__22804 = new BitSet(new long[]{0x00000000000038A0L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__Group_1_1__3_in_rule__CompoundStringLeadingDelimiter__Group_1_1__22814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_3_in_rule__CompoundStringLeadingDelimiter__Group_1_1__32842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartLeadingDelimiterValue__Group__02884 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group__1_in_rule__CompoundStringPartLeadingDelimiterValue__Group__02892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group_1__0_in_rule__CompoundStringPartLeadingDelimiterValue__Group__12920 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__02959 = new BitSet(new long[]{0x00000000000038A2L});
    public static final BitSet FOLLOW_rule__CompoundStringPartLeadingDelimiterValue__Group_1__1_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__02967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartLeadingDelimiterValue__Group_1__12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__CompoundStringPartValue__Group__03035 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CompoundStringPartValue__Group__1_in_rule__CompoundStringPartValue__Group__03043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundStringPartValue__Group_1__0_in_rule__CompoundStringPartValue__Group__13071 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CompoundStringPartValue__Group_1__03110 = new BitSet(new long[]{0x00000000000038A2L});
    public static final BitSet FOLLOW_rule__CompoundStringPartValue__Group_1__1_in_rule__CompoundStringPartValue__Group_1__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_rule__CompoundStringPartValue__Group_1__13147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__NonWsNonCommentConstant__Group__03186 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_rule__NonWsNonCommentConstant__Group__1_in_rule__NonWsNonCommentConstant__Group__03194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonWsNonCommentConstant__Group_1__0_in_rule__NonWsNonCommentConstant__Group__13222 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_rule__NonWsNonCommentConstant__Alternatives_1_0_in_rule__NonWsNonCommentConstant__Group_1__03261 = new BitSet(new long[]{0x0000000000003882L});
    public static final BitSet FOLLOW_rule__NonWsNonCommentConstant__Group_1__1_in_rule__NonWsNonCommentConstant__Group_1__03270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__NonWsNonCommentConstant__Group_1__13299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__03338 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__13374 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rule__FQN__Group_1__03414 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLine_in_rule__PropertyFile__EntriesAssignment3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__PropertyComment__ValueAssignment_13521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__PropertyEntry__NameAssignment_13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelimiter_in_rule__PropertyEntry__DelimiterAssignment_2_0_03583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringLeadingDelimiter_in_rule__PropertyEntry__ValueAssignment_2_0_13614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDelimiter_in_rule__PropertyEntry__DelimiterAssignment_2_1_03645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundString_in_rule__PropertyEntry__ValueAssignment_2_1_13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPart_in_rule__CompoundString__PartsAssignment_1_03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundString__PartsAssignment_1_1_33738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_03769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_rule__CompoundStringLeadingDelimiter__PartsAssignment_1_1_33800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_rule__CompoundStringPartLeadingDelimiter__ValueAssignment3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartValue_in_rule__CompoundStringPart__ValueAssignment3862 = new BitSet(new long[]{0x0000000000000002L});

}