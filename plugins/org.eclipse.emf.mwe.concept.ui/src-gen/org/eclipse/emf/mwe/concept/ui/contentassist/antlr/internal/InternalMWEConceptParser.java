package org.eclipse.emf.mwe.concept.ui.contentassist.antlr.internal; 

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
import org.eclipse.emf.mwe.concept.services.MWEConceptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEConceptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "':'", "'.'", "'\\''", "'\"'", "'\\\\'", "'{'", "'}'", "';'", "'property'", "'file'", "'true'", "'false'", "'='", "'import'", "'.*'", "'as'", "','", "'${'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_SL_COMMENT=8;

        public InternalMWEConceptParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g"; }


     
     	private MWEConceptGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MWEConceptGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleMWEFile
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:60:1: entryRuleMWEFile : ruleMWEFile EOF ;
    public final void entryRuleMWEFile() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:61:1: ( ruleMWEFile EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:62:1: ruleMWEFile EOF
            {
             before(grammarAccess.getMWEFileRule()); 
            pushFollow(FOLLOW_ruleMWEFile_in_entryRuleMWEFile61);
            ruleMWEFile();
            _fsp--;

             after(grammarAccess.getMWEFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEFile68); 

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
    // $ANTLR end entryRuleMWEFile


    // $ANTLR start ruleMWEFile
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:69:1: ruleMWEFile : ( ( rule__MWEFile__Group__0 ) ) ;
    public final void ruleMWEFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:73:2: ( ( ( rule__MWEFile__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:74:1: ( ( rule__MWEFile__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:74:1: ( ( rule__MWEFile__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:75:1: ( rule__MWEFile__Group__0 )
            {
             before(grammarAccess.getMWEFileAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:76:1: ( rule__MWEFile__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:76:2: rule__MWEFile__Group__0
            {
            pushFollow(FOLLOW_rule__MWEFile__Group__0_in_ruleMWEFile94);
            rule__MWEFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMWEFileAccess().getGroup()); 

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
    // $ANTLR end ruleMWEFile


    // $ANTLR start entryRuleImport
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:89:1: ( ruleImport EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:104:1: ( rule__Import__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleImportedFQN
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:116:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:117:1: ( ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:118:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN181);
            ruleImportedFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN188); 

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
    // $ANTLR end entryRuleImportedFQN


    // $ANTLR start ruleImportedFQN
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:125:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:129:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:130:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:130:1: ( ( rule__ImportedFQN__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:131:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:132:1: ( rule__ImportedFQN__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:132:2: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN214);
            rule__ImportedFQN__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportedFQNAccess().getGroup()); 

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
    // $ANTLR end ruleImportedFQN


    // $ANTLR start entryRuleSetting
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:144:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:145:1: ( ruleSetting EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:146:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_ruleSetting_in_entryRuleSetting241);
            ruleSetting();
            _fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetting248); 

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
    // $ANTLR end entryRuleSetting


    // $ANTLR start ruleSetting
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:153:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:157:2: ( ( ( rule__Setting__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:158:1: ( ( rule__Setting__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:158:1: ( ( rule__Setting__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:159:1: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:160:1: ( rule__Setting__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:160:2: rule__Setting__Group__0
            {
            pushFollow(FOLLOW_rule__Setting__Group__0_in_ruleSetting274);
            rule__Setting__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSettingAccess().getGroup()); 

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
    // $ANTLR end ruleSetting


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:172:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:173:1: ( ruleComponent EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:174:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent301);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent308); 

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
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:181:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:185:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:186:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:186:1: ( ( rule__Component__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:187:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:188:1: ( rule__Component__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:188:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent334);
            rule__Component__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleComponentWithType
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:200:1: entryRuleComponentWithType : ruleComponentWithType EOF ;
    public final void entryRuleComponentWithType() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:201:1: ( ruleComponentWithType EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:202:1: ruleComponentWithType EOF
            {
             before(grammarAccess.getComponentWithTypeRule()); 
            pushFollow(FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType361);
            ruleComponentWithType();
            _fsp--;

             after(grammarAccess.getComponentWithTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentWithType368); 

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
    // $ANTLR end entryRuleComponentWithType


    // $ANTLR start ruleComponentWithType
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:209:1: ruleComponentWithType : ( ( rule__ComponentWithType__Group__0 ) ) ;
    public final void ruleComponentWithType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:213:2: ( ( ( rule__ComponentWithType__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:214:1: ( ( rule__ComponentWithType__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:214:1: ( ( rule__ComponentWithType__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:215:1: ( rule__ComponentWithType__Group__0 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:216:1: ( rule__ComponentWithType__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:216:2: rule__ComponentWithType__Group__0
            {
            pushFollow(FOLLOW_rule__ComponentWithType__Group__0_in_ruleComponentWithType394);
            rule__ComponentWithType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComponentWithTypeAccess().getGroup()); 

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
    // $ANTLR end ruleComponentWithType


    // $ANTLR start entryRuleConfigurationElement
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:228:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:229:1: ( ruleConfigurationElement EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:230:1: ruleConfigurationElement EOF
            {
             before(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement421);
            ruleConfigurationElement();
            _fsp--;

             after(grammarAccess.getConfigurationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement428); 

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
    // $ANTLR end entryRuleConfigurationElement


    // $ANTLR start ruleConfigurationElement
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:237:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:241:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:242:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:242:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:243:1: ( rule__ConfigurationElement__Alternatives )
            {
             before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:244:1: ( rule__ConfigurationElement__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:244:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement454);
            rule__ConfigurationElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getConfigurationElementAccess().getAlternatives()); 

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
    // $ANTLR end ruleConfigurationElement


    // $ANTLR start entryRuleAttributeList
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:258:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:259:1: ( ruleAttributeList EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:260:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList483);
            ruleAttributeList();
            _fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList490); 

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
    // $ANTLR end entryRuleAttributeList


    // $ANTLR start ruleAttributeList
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:267:1: ruleAttributeList : ( ( rule__AttributeList__Alternatives ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:271:2: ( ( ( rule__AttributeList__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:272:1: ( ( rule__AttributeList__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:272:1: ( ( rule__AttributeList__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:273:1: ( rule__AttributeList__Alternatives )
            {
             before(grammarAccess.getAttributeListAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:274:1: ( rule__AttributeList__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:274:2: rule__AttributeList__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeList__Alternatives_in_ruleAttributeList516);
            rule__AttributeList__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAlternatives()); 

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
    // $ANTLR end ruleAttributeList


    // $ANTLR start entryRuleProperty
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:286:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:287:1: ( ruleProperty EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:288:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty543);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty550); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:295:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:299:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:300:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:300:1: ( ( rule__Property__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:301:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:302:1: ( rule__Property__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:302:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty576);
            rule__Property__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleSimpleProperty
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:316:1: entryRuleSimpleProperty : ruleSimpleProperty EOF ;
    public final void entryRuleSimpleProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:317:1: ( ruleSimpleProperty EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:318:1: ruleSimpleProperty EOF
            {
             before(grammarAccess.getSimplePropertyRule()); 
            pushFollow(FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty605);
            ruleSimpleProperty();
            _fsp--;

             after(grammarAccess.getSimplePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProperty612); 

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
    // $ANTLR end entryRuleSimpleProperty


    // $ANTLR start ruleSimpleProperty
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:325:1: ruleSimpleProperty : ( ( rule__SimpleProperty__Group__0 ) ) ;
    public final void ruleSimpleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:329:2: ( ( ( rule__SimpleProperty__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:330:1: ( ( rule__SimpleProperty__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:330:1: ( ( rule__SimpleProperty__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:331:1: ( rule__SimpleProperty__Group__0 )
            {
             before(grammarAccess.getSimplePropertyAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:332:1: ( rule__SimpleProperty__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:332:2: rule__SimpleProperty__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleProperty__Group__0_in_ruleSimpleProperty638);
            rule__SimpleProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getGroup()); 

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
    // $ANTLR end ruleSimpleProperty


    // $ANTLR start entryRulePropertyFile
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:344:1: entryRulePropertyFile : rulePropertyFile EOF ;
    public final void entryRulePropertyFile() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:345:1: ( rulePropertyFile EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:346:1: rulePropertyFile EOF
            {
             before(grammarAccess.getPropertyFileRule()); 
            pushFollow(FOLLOW_rulePropertyFile_in_entryRulePropertyFile665);
            rulePropertyFile();
            _fsp--;

             after(grammarAccess.getPropertyFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFile672); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:353:1: rulePropertyFile : ( ( rule__PropertyFile__Group__0 ) ) ;
    public final void rulePropertyFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:357:2: ( ( ( rule__PropertyFile__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:358:1: ( ( rule__PropertyFile__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:358:1: ( ( rule__PropertyFile__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:359:1: ( rule__PropertyFile__Group__0 )
            {
             before(grammarAccess.getPropertyFileAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:360:1: ( rule__PropertyFile__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:360:2: rule__PropertyFile__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFile__Group__0_in_rulePropertyFile698);
            rule__PropertyFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyFileAccess().getGroup()); 

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


    // $ANTLR start entryRuleAttribute
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:372:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:373:1: ( ruleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:374:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute725);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute732); 

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:381:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:385:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:386:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:386:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:387:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:388:1: ( rule__Attribute__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:388:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute758);
            rule__Attribute__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleSimpleAttribute
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:400:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:401:1: ( ruleSimpleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:402:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute785);
            ruleSimpleAttribute();
            _fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute792); 

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
    // $ANTLR end entryRuleSimpleAttribute


    // $ANTLR start ruleSimpleAttribute
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:409:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__ValueAssignment ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:413:2: ( ( ( rule__SimpleAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:414:1: ( ( rule__SimpleAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:414:1: ( ( rule__SimpleAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:415:1: ( rule__SimpleAttribute__ValueAssignment )
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:416:1: ( rule__SimpleAttribute__ValueAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:416:2: rule__SimpleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__ValueAssignment_in_ruleSimpleAttribute818);
            rule__SimpleAttribute__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getValueAssignment()); 

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
    // $ANTLR end ruleSimpleAttribute


    // $ANTLR start entryRuleReference
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:428:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:429:1: ( ruleReference EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:430:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference845);
            ruleReference();
            _fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference852); 

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:437:1: ruleReference : ( ( rule__Reference__ComponentAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:441:2: ( ( ( rule__Reference__ComponentAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:442:1: ( ( rule__Reference__ComponentAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:442:1: ( ( rule__Reference__ComponentAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:443:1: ( rule__Reference__ComponentAssignment )
            {
             before(grammarAccess.getReferenceAccess().getComponentAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:444:1: ( rule__Reference__ComponentAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:444:2: rule__Reference__ComponentAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ComponentAssignment_in_ruleReference878);
            rule__Reference__ComponentAssignment();
            _fsp--;


            }

             after(grammarAccess.getReferenceAccess().getComponentAssignment()); 

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
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleValidID
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:456:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:457:1: ( ruleValidID EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:458:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID905);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID912); 

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
    // $ANTLR end entryRuleValidID


    // $ANTLR start ruleValidID
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:465:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:469:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:470:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:470:1: ( ( rule__ValidID__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:471:1: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:472:1: ( rule__ValidID__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:472:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID938);
            rule__ValidID__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

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
    // $ANTLR end ruleValidID


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:484:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:485:1: ( ruleFQN EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:486:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN965);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN972); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:493:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:497:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:498:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:498:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:499:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:500:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:500:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN998);
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


    // $ANTLR start entryRuleMWEString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:514:1: entryRuleMWEString : ruleMWEString EOF ;
    public final void entryRuleMWEString() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:518:1: ( ruleMWEString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:519:1: ruleMWEString EOF
            {
             before(grammarAccess.getMWEStringRule()); 
            pushFollow(FOLLOW_ruleMWEString_in_entryRuleMWEString1032);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getMWEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEString1039); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleMWEString


    // $ANTLR start ruleMWEString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:529:1: ruleMWEString : ( ( rule__MWEString__Alternatives ) ) ;
    public final void ruleMWEString() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:534:2: ( ( ( rule__MWEString__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:535:1: ( ( rule__MWEString__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:535:1: ( ( rule__MWEString__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:536:1: ( rule__MWEString__Alternatives )
            {
             before(grammarAccess.getMWEStringAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:537:1: ( rule__MWEString__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:537:2: rule__MWEString__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString1069);
            rule__MWEString__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleMWEString


    // $ANTLR start entryRuleMWEStringPart
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:552:1: entryRuleMWEStringPart : ruleMWEStringPart EOF ;
    public final void entryRuleMWEStringPart() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:553:1: ( ruleMWEStringPart EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:554:1: ruleMWEStringPart EOF
            {
             before(grammarAccess.getMWEStringPartRule()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1098);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEStringPart1105); 

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
    // $ANTLR end entryRuleMWEStringPart


    // $ANTLR start ruleMWEStringPart
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:561:1: ruleMWEStringPart : ( ( rule__MWEStringPart__Alternatives ) ) ;
    public final void ruleMWEStringPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:565:2: ( ( ( rule__MWEStringPart__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:566:1: ( ( rule__MWEStringPart__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:566:1: ( ( rule__MWEStringPart__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:567:1: ( rule__MWEStringPart__Alternatives )
            {
             before(grammarAccess.getMWEStringPartAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:568:1: ( rule__MWEStringPart__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:568:2: rule__MWEStringPart__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart1131);
            rule__MWEStringPart__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMWEStringPartAccess().getAlternatives()); 

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
    // $ANTLR end ruleMWEStringPart


    // $ANTLR start entryRuleBoolean
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:580:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:581:1: ( ruleBoolean EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:582:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1158);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1165); 

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
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:589:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:593:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:594:1: ( ( rule__Boolean__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:594:1: ( ( rule__Boolean__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:595:1: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:596:1: ( rule__Boolean__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:596:2: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_rule__Boolean__Group__0_in_ruleBoolean1191);
            rule__Boolean__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

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
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleReplaceableString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:608:1: entryRuleReplaceableString : ruleReplaceableString EOF ;
    public final void entryRuleReplaceableString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:609:1: ( ruleReplaceableString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:610:1: ruleReplaceableString EOF
            {
             before(grammarAccess.getReplaceableStringRule()); 
            pushFollow(FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1218);
            ruleReplaceableString();
            _fsp--;

             after(grammarAccess.getReplaceableStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableString1225); 

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
    // $ANTLR end entryRuleReplaceableString


    // $ANTLR start ruleReplaceableString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:617:1: ruleReplaceableString : ( ( rule__ReplaceableString__Group__0 ) ) ;
    public final void ruleReplaceableString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:621:2: ( ( ( rule__ReplaceableString__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:622:1: ( ( rule__ReplaceableString__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:622:1: ( ( rule__ReplaceableString__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:623:1: ( rule__ReplaceableString__Group__0 )
            {
             before(grammarAccess.getReplaceableStringAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:624:1: ( rule__ReplaceableString__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:624:2: rule__ReplaceableString__Group__0
            {
            pushFollow(FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString1251);
            rule__ReplaceableString__Group__0();
            _fsp--;


            }

             after(grammarAccess.getReplaceableStringAccess().getGroup()); 

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
    // $ANTLR end ruleReplaceableString


    // $ANTLR start entryRulePropertyReference
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:636:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:640:1: ( rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:641:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference1283);
            rulePropertyReference();
            _fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference1290); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRulePropertyReference


    // $ANTLR start rulePropertyReference
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:651:1: rulePropertyReference : ( ( rule__PropertyReference__PropertyAssignment ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:656:2: ( ( ( rule__PropertyReference__PropertyAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:657:1: ( ( rule__PropertyReference__PropertyAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:657:1: ( ( rule__PropertyReference__PropertyAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:658:1: ( rule__PropertyReference__PropertyAssignment )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:659:1: ( rule__PropertyReference__PropertyAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:659:2: rule__PropertyReference__PropertyAssignment
            {
            pushFollow(FOLLOW_rule__PropertyReference__PropertyAssignment_in_rulePropertyReference1320);
            rule__PropertyReference__PropertyAssignment();
            _fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end rulePropertyReference


    // $ANTLR start entryRulePlainString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:672:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:673:1: ( rulePlainString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:674:1: rulePlainString EOF
            {
             before(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString1347);
            rulePlainString();
            _fsp--;

             after(grammarAccess.getPlainStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString1354); 

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
    // $ANTLR end entryRulePlainString


    // $ANTLR start rulePlainString
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:681:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:685:2: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:686:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:686:1: ( ( rule__PlainString__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:687:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:688:1: ( rule__PlainString__ValueAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:688:2: rule__PlainString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1380);
            rule__PlainString__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getPlainStringAccess().getValueAssignment()); 

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
    // $ANTLR end rulePlainString


    // $ANTLR start entryRuleFileRef
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:700:1: entryRuleFileRef : ruleFileRef EOF ;
    public final void entryRuleFileRef() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:704:1: ( ruleFileRef EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:705:1: ruleFileRef EOF
            {
             before(grammarAccess.getFileRefRule()); 
            pushFollow(FOLLOW_ruleFileRef_in_entryRuleFileRef1412);
            ruleFileRef();
            _fsp--;

             after(grammarAccess.getFileRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileRef1419); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleFileRef


    // $ANTLR start ruleFileRef
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:715:1: ruleFileRef : ( ( rule__FileRef__Group__0 ) ) ;
    public final void ruleFileRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:720:2: ( ( ( rule__FileRef__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:721:1: ( ( rule__FileRef__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:721:1: ( ( rule__FileRef__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:722:1: ( rule__FileRef__Group__0 )
            {
             before(grammarAccess.getFileRefAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:723:1: ( rule__FileRef__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:723:2: rule__FileRef__Group__0
            {
            pushFollow(FOLLOW_rule__FileRef__Group__0_in_ruleFileRef1449);
            rule__FileRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFileRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleFileRef


    // $ANTLR start entryRuleConstantValue
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:736:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:737:1: ( ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:738:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue1476);
            ruleConstantValue();
            _fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue1483); 

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
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:745:1: ruleConstantValue : ( ( rule__ConstantValue__Alternatives ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:749:2: ( ( ( rule__ConstantValue__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:750:1: ( ( rule__ConstantValue__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:750:1: ( ( rule__ConstantValue__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:751:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:752:1: ( rule__ConstantValue__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:752:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1509);
            rule__ConstantValue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

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
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleColon
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:764:1: entryRuleColon : ruleColon EOF ;
    public final void entryRuleColon() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:765:1: ( ruleColon EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:766:1: ruleColon EOF
            {
             before(grammarAccess.getColonRule()); 
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon1536);
            ruleColon();
            _fsp--;

             after(grammarAccess.getColonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon1543); 

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
    // $ANTLR end entryRuleColon


    // $ANTLR start ruleColon
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:773:1: ruleColon : ( ':' ) ;
    public final void ruleColon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:777:2: ( ( ':' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:778:1: ( ':' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:778:1: ( ':' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:779:1: ':'
            {
             before(grammarAccess.getColonAccess().getColonKeyword()); 
            match(input,9,FOLLOW_9_in_ruleColon1570); 
             after(grammarAccess.getColonAccess().getColonKeyword()); 

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
    // $ANTLR end ruleColon


    // $ANTLR start entryRuleDot
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:794:1: entryRuleDot : ruleDot EOF ;
    public final void entryRuleDot() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:795:1: ( ruleDot EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:796:1: ruleDot EOF
            {
             before(grammarAccess.getDotRule()); 
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot1598);
            ruleDot();
            _fsp--;

             after(grammarAccess.getDotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot1605); 

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
    // $ANTLR end entryRuleDot


    // $ANTLR start ruleDot
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:803:1: ruleDot : ( '.' ) ;
    public final void ruleDot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:807:2: ( ( '.' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:808:1: ( '.' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:808:1: ( '.' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:809:1: '.'
            {
             before(grammarAccess.getDotAccess().getFullStopKeyword()); 
            match(input,10,FOLLOW_10_in_ruleDot1632); 
             after(grammarAccess.getDotAccess().getFullStopKeyword()); 

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
    // $ANTLR end ruleDot


    // $ANTLR start entryRuleSingleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:824:1: entryRuleSingleQuote : ruleSingleQuote EOF ;
    public final void entryRuleSingleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:825:1: ( ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:826:1: ruleSingleQuote EOF
            {
             before(grammarAccess.getSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1660);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote1667); 

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
    // $ANTLR end entryRuleSingleQuote


    // $ANTLR start ruleSingleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:833:1: ruleSingleQuote : ( '\\'' ) ;
    public final void ruleSingleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:837:2: ( ( '\\'' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:838:1: ( '\\'' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:838:1: ( '\\'' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:839:1: '\\''
            {
             before(grammarAccess.getSingleQuoteAccess().getApostropheKeyword()); 
            match(input,11,FOLLOW_11_in_ruleSingleQuote1694); 
             after(grammarAccess.getSingleQuoteAccess().getApostropheKeyword()); 

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
    // $ANTLR end ruleSingleQuote


    // $ANTLR start entryRuleEscapedSingleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:854:1: entryRuleEscapedSingleQuote : ruleEscapedSingleQuote EOF ;
    public final void entryRuleEscapedSingleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:858:1: ( ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:859:1: ruleEscapedSingleQuote EOF
            {
             before(grammarAccess.getEscapedSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1727);
            ruleEscapedSingleQuote();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote1734); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleEscapedSingleQuote


    // $ANTLR start ruleEscapedSingleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:869:1: ruleEscapedSingleQuote : ( ( rule__EscapedSingleQuote__Group__0 ) ) ;
    public final void ruleEscapedSingleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:874:2: ( ( ( rule__EscapedSingleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:875:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:875:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:876:1: ( rule__EscapedSingleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:877:1: ( rule__EscapedSingleQuote__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:877:2: rule__EscapedSingleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1764);
            rule__EscapedSingleQuote__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEscapedSingleQuoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleEscapedSingleQuote


    // $ANTLR start entryRuleDoubleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:890:1: entryRuleDoubleQuote : ruleDoubleQuote EOF ;
    public final void entryRuleDoubleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:891:1: ( ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:892:1: ruleDoubleQuote EOF
            {
             before(grammarAccess.getDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1791);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote1798); 

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
    // $ANTLR end entryRuleDoubleQuote


    // $ANTLR start ruleDoubleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:899:1: ruleDoubleQuote : ( '\"' ) ;
    public final void ruleDoubleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:903:2: ( ( '\"' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:904:1: ( '\"' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:904:1: ( '\"' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:905:1: '\"'
            {
             before(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword()); 
            match(input,12,FOLLOW_12_in_ruleDoubleQuote1825); 
             after(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword()); 

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
    // $ANTLR end ruleDoubleQuote


    // $ANTLR start entryRuleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:920:1: entryRuleEscapedDoubleQuote : ruleEscapedDoubleQuote EOF ;
    public final void entryRuleEscapedDoubleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:924:1: ( ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:925:1: ruleEscapedDoubleQuote EOF
            {
             before(grammarAccess.getEscapedDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1858);
            ruleEscapedDoubleQuote();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1865); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleEscapedDoubleQuote


    // $ANTLR start ruleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:935:1: ruleEscapedDoubleQuote : ( ( rule__EscapedDoubleQuote__Group__0 ) ) ;
    public final void ruleEscapedDoubleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:940:2: ( ( ( rule__EscapedDoubleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:941:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:941:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:942:1: ( rule__EscapedDoubleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:943:1: ( rule__EscapedDoubleQuote__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:943:2: rule__EscapedDoubleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1895);
            rule__EscapedDoubleQuote__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEscapedDoubleQuoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleEscapedDoubleQuote


    // $ANTLR start entryRuleBackslash
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:956:1: entryRuleBackslash : ruleBackslash EOF ;
    public final void entryRuleBackslash() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:957:1: ( ruleBackslash EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:958:1: ruleBackslash EOF
            {
             before(grammarAccess.getBackslashRule()); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash1922);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash1929); 

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
    // $ANTLR end entryRuleBackslash


    // $ANTLR start ruleBackslash
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:965:1: ruleBackslash : ( '\\\\' ) ;
    public final void ruleBackslash() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:969:2: ( ( '\\\\' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:970:1: ( '\\\\' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:970:1: ( '\\\\' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:971:1: '\\\\'
            {
             before(grammarAccess.getBackslashAccess().getReverseSolidusKeyword()); 
            match(input,13,FOLLOW_13_in_ruleBackslash1956); 
             after(grammarAccess.getBackslashAccess().getReverseSolidusKeyword()); 

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
    // $ANTLR end ruleBackslash


    // $ANTLR start entryRuleEscapedBackslash
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:986:1: entryRuleEscapedBackslash : ruleEscapedBackslash EOF ;
    public final void entryRuleEscapedBackslash() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:990:1: ( ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:991:1: ruleEscapedBackslash EOF
            {
             before(grammarAccess.getEscapedBackslashRule()); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash1989);
            ruleEscapedBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash1996); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleEscapedBackslash


    // $ANTLR start ruleEscapedBackslash
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1001:1: ruleEscapedBackslash : ( ( rule__EscapedBackslash__Group__0 ) ) ;
    public final void ruleEscapedBackslash() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1006:2: ( ( ( rule__EscapedBackslash__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1007:1: ( ( rule__EscapedBackslash__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1007:1: ( ( rule__EscapedBackslash__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1008:1: ( rule__EscapedBackslash__Group__0 )
            {
             before(grammarAccess.getEscapedBackslashAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1009:1: ( rule__EscapedBackslash__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1009:2: rule__EscapedBackslash__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash2026);
            rule__EscapedBackslash__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEscapedBackslashAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleEscapedBackslash


    // $ANTLR start entryRuleOpeningBrace
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1022:1: entryRuleOpeningBrace : ruleOpeningBrace EOF ;
    public final void entryRuleOpeningBrace() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1023:1: ( ruleOpeningBrace EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1024:1: ruleOpeningBrace EOF
            {
             before(grammarAccess.getOpeningBraceRule()); 
            pushFollow(FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace2053);
            ruleOpeningBrace();
            _fsp--;

             after(grammarAccess.getOpeningBraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpeningBrace2060); 

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
    // $ANTLR end entryRuleOpeningBrace


    // $ANTLR start ruleOpeningBrace
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1031:1: ruleOpeningBrace : ( '{' ) ;
    public final void ruleOpeningBrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1035:2: ( ( '{' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1036:1: ( '{' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1036:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1037:1: '{'
            {
             before(grammarAccess.getOpeningBraceAccess().getLeftCurlyBracketKeyword()); 
            match(input,14,FOLLOW_14_in_ruleOpeningBrace2087); 
             after(grammarAccess.getOpeningBraceAccess().getLeftCurlyBracketKeyword()); 

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
    // $ANTLR end ruleOpeningBrace


    // $ANTLR start entryRuleClosingBrace
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1052:1: entryRuleClosingBrace : ruleClosingBrace EOF ;
    public final void entryRuleClosingBrace() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1053:1: ( ruleClosingBrace EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1054:1: ruleClosingBrace EOF
            {
             before(grammarAccess.getClosingBraceRule()); 
            pushFollow(FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace2115);
            ruleClosingBrace();
            _fsp--;

             after(grammarAccess.getClosingBraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosingBrace2122); 

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
    // $ANTLR end entryRuleClosingBrace


    // $ANTLR start ruleClosingBrace
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1061:1: ruleClosingBrace : ( '}' ) ;
    public final void ruleClosingBrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1065:2: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1066:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1066:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1067:1: '}'
            {
             before(grammarAccess.getClosingBraceAccess().getRightCurlyBracketKeyword()); 
            match(input,15,FOLLOW_15_in_ruleClosingBrace2149); 
             after(grammarAccess.getClosingBraceAccess().getRightCurlyBracketKeyword()); 

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
    // $ANTLR end ruleClosingBrace


    // $ANTLR start rule__Setting__Alternatives_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1082:1: rule__Setting__Alternatives_1 : ( ( ( rule__Setting__Group_1_0__0 ) ) | ( ( rule__Setting__ValueAssignment_1_1 ) ) );
    public final void rule__Setting__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1086:1: ( ( ( rule__Setting__Group_1_0__0 ) ) | ( ( rule__Setting__ValueAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==14||(LA1_0>=16 && LA1_0<=18)||LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1082:1: rule__Setting__Alternatives_1 : ( ( ( rule__Setting__Group_1_0__0 ) ) | ( ( rule__Setting__ValueAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1087:1: ( ( rule__Setting__Group_1_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1087:1: ( ( rule__Setting__Group_1_0__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1088:1: ( rule__Setting__Group_1_0__0 )
                    {
                     before(grammarAccess.getSettingAccess().getGroup_1_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1089:1: ( rule__Setting__Group_1_0__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1089:2: rule__Setting__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Setting__Group_1_0__0_in_rule__Setting__Alternatives_12186);
                    rule__Setting__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSettingAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1093:6: ( ( rule__Setting__ValueAssignment_1_1 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1093:6: ( ( rule__Setting__ValueAssignment_1_1 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1094:1: ( rule__Setting__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getSettingAccess().getValueAssignment_1_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1095:1: ( rule__Setting__ValueAssignment_1_1 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1095:2: rule__Setting__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Setting__ValueAssignment_1_1_in_rule__Setting__Alternatives_12204);
                    rule__Setting__ValueAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getSettingAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end rule__Setting__Alternatives_1


    // $ANTLR start rule__Component__Alternatives_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1104:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1108:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==10||LA2_2==14||LA2_2==16||LA2_2==24) ) {
                    alt2=1;
                }
                else if ( ((LA2_2>=11 && LA2_2<=12)||(LA2_2>=19 && LA2_2<=20)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1104:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1104:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1109:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1109:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1110:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1111:1: ( rule__Component__TypeAssignment_1_0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1111:2: rule__Component__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_12237);
                    rule__Component__TypeAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1115:6: ( ( rule__Component__FileRefAssignment_1_1 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1115:6: ( ( rule__Component__FileRefAssignment_1_1 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1116:1: ( rule__Component__FileRefAssignment_1_1 )
                    {
                     before(grammarAccess.getComponentAccess().getFileRefAssignment_1_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1117:1: ( rule__Component__FileRefAssignment_1_1 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1117:2: rule__Component__FileRefAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Component__FileRefAssignment_1_1_in_rule__Component__Alternatives_12255);
                    rule__Component__FileRefAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getFileRefAssignment_1_1()); 

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
    // $ANTLR end rule__Component__Alternatives_1


    // $ANTLR start rule__Component__Alternatives_3
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1126:1: rule__Component__Alternatives_3 : ( ( ';' ) | ( ( rule__Component__Group_3_1__0 ) ) );
    public final void rule__Component__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1130:1: ( ( ';' ) | ( ( rule__Component__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1126:1: rule__Component__Alternatives_3 : ( ( ';' ) | ( ( rule__Component__Group_3_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1131:1: ( ';' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1131:1: ( ';' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1132:1: ';'
                    {
                     before(grammarAccess.getComponentAccess().getSemicolonKeyword_3_0()); 
                    match(input,16,FOLLOW_16_in_rule__Component__Alternatives_32289); 
                     after(grammarAccess.getComponentAccess().getSemicolonKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1139:6: ( ( rule__Component__Group_3_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1139:6: ( ( rule__Component__Group_3_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1140:1: ( rule__Component__Group_3_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_3_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1141:1: ( rule__Component__Group_3_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1141:2: rule__Component__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_3_1__0_in_rule__Component__Alternatives_32308);
                    rule__Component__Group_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_3_1()); 

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
    // $ANTLR end rule__Component__Alternatives_3


    // $ANTLR start rule__ComponentWithType__Alternatives_2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1150:1: rule__ComponentWithType__Alternatives_2 : ( ( ';' ) | ( ( rule__ComponentWithType__Group_2_1__0 ) ) );
    public final void rule__ComponentWithType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1154:1: ( ( ';' ) | ( ( rule__ComponentWithType__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1150:1: rule__ComponentWithType__Alternatives_2 : ( ( ';' ) | ( ( rule__ComponentWithType__Group_2_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1155:1: ( ';' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1155:1: ( ';' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1156:1: ';'
                    {
                     before(grammarAccess.getComponentWithTypeAccess().getSemicolonKeyword_2_0()); 
                    match(input,16,FOLLOW_16_in_rule__ComponentWithType__Alternatives_22342); 
                     after(grammarAccess.getComponentWithTypeAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1163:6: ( ( rule__ComponentWithType__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1163:6: ( ( rule__ComponentWithType__Group_2_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1164:1: ( rule__ComponentWithType__Group_2_1__0 )
                    {
                     before(grammarAccess.getComponentWithTypeAccess().getGroup_2_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1165:1: ( rule__ComponentWithType__Group_2_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1165:2: rule__ComponentWithType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__0_in_rule__ComponentWithType__Alternatives_22361);
                    rule__ComponentWithType__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentWithTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__ComponentWithType__Alternatives_2


    // $ANTLR start rule__ConfigurationElement__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1174:1: rule__ConfigurationElement__Alternatives : ( ( ruleSetting ) | ( ruleProperty ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1178:1: ( ( ruleSetting ) | ( ruleProperty ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1179:1: ( ruleSetting )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1179:1: ( ruleSetting )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1180:1: ruleSetting
                    {
                     before(grammarAccess.getConfigurationElementAccess().getSettingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSetting_in_rule__ConfigurationElement__Alternatives2394);
                    ruleSetting();
                    _fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getSettingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1185:6: ( ruleProperty )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1185:6: ( ruleProperty )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1186:1: ruleProperty
                    {
                     before(grammarAccess.getConfigurationElementAccess().getPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__ConfigurationElement__Alternatives2411);
                    ruleProperty();
                    _fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getPropertyParserRuleCall_1()); 

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
    // $ANTLR end rule__ConfigurationElement__Alternatives


    // $ANTLR start rule__AttributeList__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1197:1: rule__AttributeList__Alternatives : ( ( ( rule__AttributeList__Group_0__0 ) ) | ( ( rule__AttributeList__Group_1__0 ) ) );
    public final void rule__AttributeList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1201:1: ( ( ( rule__AttributeList__Group_0__0 ) ) | ( ( rule__AttributeList__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)||(LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1197:1: rule__AttributeList__Alternatives : ( ( ( rule__AttributeList__Group_0__0 ) ) | ( ( rule__AttributeList__Group_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1202:1: ( ( rule__AttributeList__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1202:1: ( ( rule__AttributeList__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1203:1: ( rule__AttributeList__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeListAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1204:1: ( rule__AttributeList__Group_0__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1204:2: rule__AttributeList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Alternatives2444);
                    rule__AttributeList__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAttributeListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1208:6: ( ( rule__AttributeList__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1208:6: ( ( rule__AttributeList__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1209:1: ( rule__AttributeList__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeListAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1210:1: ( rule__AttributeList__Group_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1210:2: rule__AttributeList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Alternatives2462);
                    rule__AttributeList__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAttributeListAccess().getGroup_1()); 

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
    // $ANTLR end rule__AttributeList__Alternatives


    // $ANTLR start rule__Property__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1219:1: rule__Property__Alternatives : ( ( ruleSimpleProperty ) | ( rulePropertyFile ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1223:1: ( ( ruleSimpleProperty ) | ( rulePropertyFile ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=11 && LA7_2<=12)||(LA7_2>=19 && LA7_2<=20)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==10||LA7_2==21) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1219:1: rule__Property__Alternatives : ( ( ruleSimpleProperty ) | ( rulePropertyFile ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==RULE_ID||LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1219:1: rule__Property__Alternatives : ( ( ruleSimpleProperty ) | ( rulePropertyFile ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1219:1: rule__Property__Alternatives : ( ( ruleSimpleProperty ) | ( rulePropertyFile ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1224:1: ( ruleSimpleProperty )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1224:1: ( ruleSimpleProperty )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1225:1: ruleSimpleProperty
                    {
                     before(grammarAccess.getPropertyAccess().getSimplePropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleProperty_in_rule__Property__Alternatives2495);
                    ruleSimpleProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getSimplePropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1230:6: ( rulePropertyFile )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1230:6: ( rulePropertyFile )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1231:1: rulePropertyFile
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyFileParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePropertyFile_in_rule__Property__Alternatives2512);
                    rulePropertyFile();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyFileParserRuleCall_1()); 

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
    // $ANTLR end rule__Property__Alternatives


    // $ANTLR start rule__Attribute__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1241:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleReference ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1245:1: ( ( ruleSimpleAttribute ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)||(LA8_0>=19 && LA8_0<=20)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1241:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1246:1: ( ruleSimpleAttribute )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1246:1: ( ruleSimpleAttribute )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1247:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives2544);
                    ruleSimpleAttribute();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1252:6: ( ruleReference )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1252:6: ( ruleReference )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1253:1: ruleReference
                    {
                     before(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Attribute__Alternatives2561);
                    ruleReference();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end rule__Attribute__Alternatives


    // $ANTLR start rule__ValidID__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1263:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'property' ) | ( 'file' ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1267:1: ( ( RULE_ID ) | ( 'property' ) | ( 'file' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1263:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'property' ) | ( 'file' ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1268:1: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1268:1: ( RULE_ID )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1269:1: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2593); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1274:6: ( 'property' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1274:6: ( 'property' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1275:1: 'property'
                    {
                     before(grammarAccess.getValidIDAccess().getPropertyKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__ValidID__Alternatives2611); 
                     after(grammarAccess.getValidIDAccess().getPropertyKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1282:6: ( 'file' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1282:6: ( 'file' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1283:1: 'file'
                    {
                     before(grammarAccess.getValidIDAccess().getFileKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__ValidID__Alternatives2631); 
                     after(grammarAccess.getValidIDAccess().getFileKeyword_2()); 

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
    // $ANTLR end rule__ValidID__Alternatives


    // $ANTLR start rule__MWEString__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1295:1: rule__MWEString__Alternatives : ( ( ( rule__MWEString__PartsAssignment_0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) | ( ( rule__MWEString__Group_2__0 ) ) );
    public final void rule__MWEString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1299:1: ( ( ( rule__MWEString__PartsAssignment_0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) | ( ( rule__MWEString__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1295:1: rule__MWEString__Alternatives : ( ( ( rule__MWEString__PartsAssignment_0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) | ( ( rule__MWEString__Group_2__0 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1300:1: ( ( rule__MWEString__PartsAssignment_0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1300:1: ( ( rule__MWEString__PartsAssignment_0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1301:1: ( rule__MWEString__PartsAssignment_0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getPartsAssignment_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1302:1: ( rule__MWEString__PartsAssignment_0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1302:2: rule__MWEString__PartsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_0_in_rule__MWEString__Alternatives2665);
                    rule__MWEString__PartsAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getPartsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1306:6: ( ( rule__MWEString__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1306:6: ( ( rule__MWEString__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1307:1: ( rule__MWEString__Group_1__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1308:1: ( rule__MWEString__Group_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1308:2: rule__MWEString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives2683);
                    rule__MWEString__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1312:6: ( ( rule__MWEString__Group_2__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1312:6: ( ( rule__MWEString__Group_2__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1313:1: ( rule__MWEString__Group_2__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_2()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1314:1: ( rule__MWEString__Group_2__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1314:2: rule__MWEString__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_2__0_in_rule__MWEString__Alternatives2701);
                    rule__MWEString__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getGroup_2()); 

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
    // $ANTLR end rule__MWEString__Alternatives


    // $ANTLR start rule__MWEStringPart__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1323:1: rule__MWEStringPart__Alternatives : ( ( ruleReplaceableString ) | ( rulePlainString ) );
    public final void rule__MWEStringPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1327:1: ( ( ruleReplaceableString ) | ( rulePlainString ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||(LA11_0>=9 && LA11_0<=10)||(LA11_0>=13 && LA11_0<=15)||(LA11_0>=17 && LA11_0<=22)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1323:1: rule__MWEStringPart__Alternatives : ( ( ruleReplaceableString ) | ( rulePlainString ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1328:1: ( ruleReplaceableString )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1328:1: ( ruleReplaceableString )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1329:1: ruleReplaceableString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives2734);
                    ruleReplaceableString();
                    _fsp--;

                     after(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1334:6: ( rulePlainString )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1334:6: ( rulePlainString )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1335:1: rulePlainString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives2751);
                    rulePlainString();
                    _fsp--;

                     after(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1()); 

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
    // $ANTLR end rule__MWEStringPart__Alternatives


    // $ANTLR start rule__Boolean__ValueAlternatives_1_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1345:1: rule__Boolean__ValueAlternatives_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1349:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: rule__Boolean__ValueAlternatives_1_0 : ( ( 'true' ) | ( 'false' ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1350:1: ( 'true' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1350:1: ( 'true' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1351:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Boolean__ValueAlternatives_1_02784); 
                     after(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1358:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1358:6: ( 'false' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1359:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Boolean__ValueAlternatives_1_02804); 
                     after(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1()); 

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
    // $ANTLR end rule__Boolean__ValueAlternatives_1_0


    // $ANTLR start rule__ConstantValue__Alternatives
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1371:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1375:1: ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) )
            int alt13=14;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt13=1;
                }
                break;
            case 9:
                {
                alt13=2;
                }
                break;
            case 14:
                {
                alt13=3;
                }
                break;
            case 15:
                {
                alt13=4;
                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    alt13=6;
                    }
                    break;
                case 12:
                    {
                    alt13=5;
                    }
                    break;
                case 13:
                    {
                    alt13=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1371:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) );", 13, 5, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=7;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
                {
                alt13=9;
                }
                break;
            case 19:
                {
                alt13=10;
                }
                break;
            case 20:
                {
                alt13=11;
                }
                break;
            case 21:
                {
                alt13=12;
                }
                break;
            case 22:
                {
                alt13=13;
                }
                break;
            case 10:
                {
                alt13=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1371:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1376:1: ( RULE_WS )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1376:1: ( RULE_WS )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1377:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives2838); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1382:6: ( ruleColon )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1382:6: ( ruleColon )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1383:1: ruleColon
                    {
                     before(grammarAccess.getConstantValueAccess().getColonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleColon_in_rule__ConstantValue__Alternatives2855);
                    ruleColon();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getColonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1388:6: ( ruleOpeningBrace )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1388:6: ( ruleOpeningBrace )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1389:1: ruleOpeningBrace
                    {
                     before(grammarAccess.getConstantValueAccess().getOpeningBraceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOpeningBrace_in_rule__ConstantValue__Alternatives2872);
                    ruleOpeningBrace();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getOpeningBraceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1394:6: ( ruleClosingBrace )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1394:6: ( ruleClosingBrace )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1395:1: ruleClosingBrace
                    {
                     before(grammarAccess.getConstantValueAccess().getClosingBraceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleClosingBrace_in_rule__ConstantValue__Alternatives2889);
                    ruleClosingBrace();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getClosingBraceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1400:6: ( ruleEscapedDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1400:6: ( ruleEscapedDoubleQuote )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1401:1: ruleEscapedDoubleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives2906);
                    ruleEscapedDoubleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1406:6: ( ruleEscapedSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1406:6: ( ruleEscapedSingleQuote )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1407:1: ruleEscapedSingleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives2923);
                    ruleEscapedSingleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1412:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1412:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1413:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives2940); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1418:6: ( ruleEscapedBackslash )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1418:6: ( ruleEscapedBackslash )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1419:1: ruleEscapedBackslash
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives2957);
                    ruleEscapedBackslash();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1424:6: ( ruleValidID )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1424:6: ( ruleValidID )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1425:1: ruleValidID
                    {
                     before(grammarAccess.getConstantValueAccess().getValidIDParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleValidID_in_rule__ConstantValue__Alternatives2974);
                    ruleValidID();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getValidIDParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1430:6: ( 'true' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1430:6: ( 'true' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1431:1: 'true'
                    {
                     before(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 
                    match(input,19,FOLLOW_19_in_rule__ConstantValue__Alternatives2992); 
                     after(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1438:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1438:6: ( 'false' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1439:1: 'false'
                    {
                     before(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 
                    match(input,20,FOLLOW_20_in_rule__ConstantValue__Alternatives3012); 
                     after(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1446:6: ( '=' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1446:6: ( '=' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1447:1: '='
                    {
                     before(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 
                    match(input,21,FOLLOW_21_in_rule__ConstantValue__Alternatives3032); 
                     after(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1454:6: ( 'import' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1454:6: ( 'import' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1455:1: 'import'
                    {
                     before(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 
                    match(input,22,FOLLOW_22_in_rule__ConstantValue__Alternatives3052); 
                     after(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1462:6: ( ruleDot )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1462:6: ( ruleDot )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1463:1: ruleDot
                    {
                     before(grammarAccess.getConstantValueAccess().getDotParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleDot_in_rule__ConstantValue__Alternatives3071);
                    ruleDot();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getDotParserRuleCall_13()); 

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
    // $ANTLR end rule__ConstantValue__Alternatives


    // $ANTLR start rule__MWEFile__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1475:1: rule__MWEFile__Group__0 : ( () ) rule__MWEFile__Group__1 ;
    public final void rule__MWEFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1479:1: ( ( () ) rule__MWEFile__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1480:1: ( () ) rule__MWEFile__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1480:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1481:1: ()
            {
             before(grammarAccess.getMWEFileAccess().getMWEFileAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1482:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1484:1: 
            {
            }

             after(grammarAccess.getMWEFileAccess().getMWEFileAction_0()); 

            }

            pushFollow(FOLLOW_rule__MWEFile__Group__1_in_rule__MWEFile__Group__03115);
            rule__MWEFile__Group__1();
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
    // $ANTLR end rule__MWEFile__Group__0


    // $ANTLR start rule__MWEFile__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1495:1: rule__MWEFile__Group__1 : ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2 ;
    public final void rule__MWEFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1499:1: ( ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1500:1: ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1500:1: ( ( rule__MWEFile__ImportsAssignment_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1501:1: ( rule__MWEFile__ImportsAssignment_1 )*
            {
             before(grammarAccess.getMWEFileAccess().getImportsAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1502:1: ( rule__MWEFile__ImportsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1502:2: rule__MWEFile__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEFile__ImportsAssignment_1_in_rule__MWEFile__Group__13143);
            	    rule__MWEFile__ImportsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMWEFileAccess().getImportsAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MWEFile__Group__2_in_rule__MWEFile__Group__13153);
            rule__MWEFile__Group__2();
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
    // $ANTLR end rule__MWEFile__Group__1


    // $ANTLR start rule__MWEFile__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1513:1: rule__MWEFile__Group__2 : ( ( rule__MWEFile__RootAssignment_2 ) ) ;
    public final void rule__MWEFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1517:1: ( ( ( rule__MWEFile__RootAssignment_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1518:1: ( ( rule__MWEFile__RootAssignment_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1518:1: ( ( rule__MWEFile__RootAssignment_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1519:1: ( rule__MWEFile__RootAssignment_2 )
            {
             before(grammarAccess.getMWEFileAccess().getRootAssignment_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1520:1: ( rule__MWEFile__RootAssignment_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1520:2: rule__MWEFile__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__MWEFile__RootAssignment_2_in_rule__MWEFile__Group__23181);
            rule__MWEFile__RootAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMWEFileAccess().getRootAssignment_2()); 

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
    // $ANTLR end rule__MWEFile__Group__2


    // $ANTLR start rule__Import__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1536:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1540:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1541:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1541:1: ( 'import' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1542:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Import__Group__03222); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03232);
            rule__Import__Group__1();
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
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1556:1: rule__Import__Group__1 : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1560:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1561:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1561:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1562:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1563:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1563:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13260);
            rule__Import__ImportedNamespaceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13269);
            rule__Import__Group__2();
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
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Import__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1574:1: rule__Import__Group__2 : ( ';' ) ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1578:1: ( ( ';' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1579:1: ( ';' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1579:1: ( ';' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1580:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group__23298); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__Import__Group__2


    // $ANTLR start rule__ImportedFQN__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1599:1: rule__ImportedFQN__Group__0 : ( ruleFQN ) rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1603:1: ( ( ruleFQN ) rule__ImportedFQN__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1604:1: ( ruleFQN ) rule__ImportedFQN__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1604:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1605:1: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03339);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03347);
            rule__ImportedFQN__Group__1();
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
    // $ANTLR end rule__ImportedFQN__Group__0


    // $ANTLR start rule__ImportedFQN__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1617:1: rule__ImportedFQN__Group__1 : ( ( '.*' )? ) ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1621:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1622:1: ( ( '.*' )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1622:1: ( ( '.*' )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1623:1: ( '.*' )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1624:1: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1625:2: '.*'
                    {
                    match(input,23,FOLLOW_23_in_rule__ImportedFQN__Group__13377); 

                    }
                    break;

            }

             after(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end rule__ImportedFQN__Group__1


    // $ANTLR start rule__Setting__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1640:1: rule__Setting__Group__0 : ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1644:1: ( ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1645:1: ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1645:1: ( ( rule__Setting__FeatureAssignment_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1646:1: ( rule__Setting__FeatureAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getFeatureAssignment_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1647:1: ( rule__Setting__FeatureAssignment_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1647:2: rule__Setting__FeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Setting__FeatureAssignment_0_in_rule__Setting__Group__03418);
            rule__Setting__FeatureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSettingAccess().getFeatureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__03427);
            rule__Setting__Group__1();
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
    // $ANTLR end rule__Setting__Group__0


    // $ANTLR start rule__Setting__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1658:1: rule__Setting__Group__1 : ( ( rule__Setting__Alternatives_1 ) ) ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1662:1: ( ( ( rule__Setting__Alternatives_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1663:1: ( ( rule__Setting__Alternatives_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1663:1: ( ( rule__Setting__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1664:1: ( rule__Setting__Alternatives_1 )
            {
             before(grammarAccess.getSettingAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1665:1: ( rule__Setting__Alternatives_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1665:2: rule__Setting__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setting__Alternatives_1_in_rule__Setting__Group__13455);
            rule__Setting__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getSettingAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__Setting__Group__1


    // $ANTLR start rule__Setting__Group_1_0__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1679:1: rule__Setting__Group_1_0__0 : ( '=' ) rule__Setting__Group_1_0__1 ;
    public final void rule__Setting__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1683:1: ( ( '=' ) rule__Setting__Group_1_0__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1684:1: ( '=' ) rule__Setting__Group_1_0__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1684:1: ( '=' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1685:1: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_1_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Setting__Group_1_0__03494); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__Setting__Group_1_0__1_in_rule__Setting__Group_1_0__03504);
            rule__Setting__Group_1_0__1();
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
    // $ANTLR end rule__Setting__Group_1_0__0


    // $ANTLR start rule__Setting__Group_1_0__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1699:1: rule__Setting__Group_1_0__1 : ( ( rule__Setting__ValueAssignment_1_0_1 ) ) ;
    public final void rule__Setting__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1703:1: ( ( ( rule__Setting__ValueAssignment_1_0_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1704:1: ( ( rule__Setting__ValueAssignment_1_0_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1704:1: ( ( rule__Setting__ValueAssignment_1_0_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1705:1: ( rule__Setting__ValueAssignment_1_0_1 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_1_0_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1706:1: ( rule__Setting__ValueAssignment_1_0_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1706:2: rule__Setting__ValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Setting__ValueAssignment_1_0_1_in_rule__Setting__Group_1_0__13532);
            rule__Setting__ValueAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getSettingAccess().getValueAssignment_1_0_1()); 

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
    // $ANTLR end rule__Setting__Group_1_0__1


    // $ANTLR start rule__Component__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1720:1: rule__Component__Group__0 : ( () ) rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1724:1: ( ( () ) rule__Component__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1725:1: ( () ) rule__Component__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1725:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1726:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1727:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1729:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__03580);
            rule__Component__Group__1();
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
    // $ANTLR end rule__Component__Group__0


    // $ANTLR start rule__Component__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1740:1: rule__Component__Group__1 : ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1744:1: ( ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1745:1: ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1745:1: ( ( rule__Component__Alternatives_1 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1746:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1747:1: ( rule__Component__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=17 && LA16_0<=18)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1747:2: rule__Component__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__13608);
                    rule__Component__Alternatives_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13618);
            rule__Component__Group__2();
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
    // $ANTLR end rule__Component__Group__1


    // $ANTLR start rule__Component__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1758:1: rule__Component__Group__2 : ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1762:1: ( ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1763:1: ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1763:1: ( ( rule__Component__Group_2__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1764:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1765:1: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1765:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__23646);
                    rule__Component__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23656);
            rule__Component__Group__3();
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
    // $ANTLR end rule__Component__Group__2


    // $ANTLR start rule__Component__Group__3
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1776:1: rule__Component__Group__3 : ( ( rule__Component__Alternatives_3 ) ) ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1780:1: ( ( ( rule__Component__Alternatives_3 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1781:1: ( ( rule__Component__Alternatives_3 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1781:1: ( ( rule__Component__Alternatives_3 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1782:1: ( rule__Component__Alternatives_3 )
            {
             before(grammarAccess.getComponentAccess().getAlternatives_3()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1783:1: ( rule__Component__Alternatives_3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1783:2: rule__Component__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Component__Alternatives_3_in_rule__Component__Group__33684);
            rule__Component__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives_3()); 

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
    // $ANTLR end rule__Component__Group__3


    // $ANTLR start rule__Component__Group_2__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1801:1: rule__Component__Group_2__0 : ( 'as' ) rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1805:1: ( ( 'as' ) rule__Component__Group_2__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1806:1: ( 'as' ) rule__Component__Group_2__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1806:1: ( 'as' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1807:1: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Component__Group_2__03727); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03737);
            rule__Component__Group_2__1();
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
    // $ANTLR end rule__Component__Group_2__0


    // $ANTLR start rule__Component__Group_2__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1821:1: rule__Component__Group_2__1 : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1825:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1826:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1826:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1827:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1828:1: ( rule__Component__NameAssignment_2_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1828:2: rule__Component__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13765);
            rule__Component__NameAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end rule__Component__Group_2__1


    // $ANTLR start rule__Component__Group_3_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1842:1: rule__Component__Group_3_1__0 : ( '{' ) rule__Component__Group_3_1__1 ;
    public final void rule__Component__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1846:1: ( ( '{' ) rule__Component__Group_3_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1847:1: ( '{' ) rule__Component__Group_3_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1847:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1848:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group_3_1__03804); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_3_1__1_in_rule__Component__Group_3_1__03814);
            rule__Component__Group_3_1__1();
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
    // $ANTLR end rule__Component__Group_3_1__0


    // $ANTLR start rule__Component__Group_3_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1862:1: rule__Component__Group_3_1__1 : ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2 ;
    public final void rule__Component__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1866:1: ( ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1867:1: ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1867:1: ( ( rule__Component__ElementsAssignment_3_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1868:1: ( rule__Component__ElementsAssignment_3_1_1 )*
            {
             before(grammarAccess.getComponentAccess().getElementsAssignment_3_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1869:1: ( rule__Component__ElementsAssignment_3_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=17 && LA18_0<=18)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1869:2: rule__Component__ElementsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Component__ElementsAssignment_3_1_1_in_rule__Component__Group_3_1__13842);
            	    rule__Component__ElementsAssignment_3_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getElementsAssignment_3_1_1()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_3_1__2_in_rule__Component__Group_3_1__13852);
            rule__Component__Group_3_1__2();
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
    // $ANTLR end rule__Component__Group_3_1__1


    // $ANTLR start rule__Component__Group_3_1__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1880:1: rule__Component__Group_3_1__2 : ( '}' ) ;
    public final void rule__Component__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1884:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1885:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1885:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1886:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_1_2()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group_3_1__23881); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_1_2()); 

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
    // $ANTLR end rule__Component__Group_3_1__2


    // $ANTLR start rule__ComponentWithType__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1905:1: rule__ComponentWithType__Group__0 : ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1 ;
    public final void rule__ComponentWithType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1909:1: ( ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1910:1: ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1910:1: ( ( rule__ComponentWithType__TypeAssignment_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1911:1: ( rule__ComponentWithType__TypeAssignment_0 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeAssignment_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1912:1: ( rule__ComponentWithType__TypeAssignment_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1912:2: rule__ComponentWithType__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ComponentWithType__TypeAssignment_0_in_rule__ComponentWithType__Group__03922);
            rule__ComponentWithType__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getComponentWithTypeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group__1_in_rule__ComponentWithType__Group__03931);
            rule__ComponentWithType__Group__1();
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
    // $ANTLR end rule__ComponentWithType__Group__0


    // $ANTLR start rule__ComponentWithType__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1923:1: rule__ComponentWithType__Group__1 : ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2 ;
    public final void rule__ComponentWithType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1927:1: ( ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1928:1: ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1928:1: ( ( rule__ComponentWithType__Group_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1929:1: ( rule__ComponentWithType__Group_1__0 )?
            {
             before(grammarAccess.getComponentWithTypeAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1930:1: ( rule__ComponentWithType__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1930:2: rule__ComponentWithType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ComponentWithType__Group_1__0_in_rule__ComponentWithType__Group__13959);
                    rule__ComponentWithType__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentWithTypeAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group__2_in_rule__ComponentWithType__Group__13969);
            rule__ComponentWithType__Group__2();
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
    // $ANTLR end rule__ComponentWithType__Group__1


    // $ANTLR start rule__ComponentWithType__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1941:1: rule__ComponentWithType__Group__2 : ( ( rule__ComponentWithType__Alternatives_2 ) ) ;
    public final void rule__ComponentWithType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1945:1: ( ( ( rule__ComponentWithType__Alternatives_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1946:1: ( ( rule__ComponentWithType__Alternatives_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1946:1: ( ( rule__ComponentWithType__Alternatives_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1947:1: ( rule__ComponentWithType__Alternatives_2 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getAlternatives_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1948:1: ( rule__ComponentWithType__Alternatives_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1948:2: rule__ComponentWithType__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ComponentWithType__Alternatives_2_in_rule__ComponentWithType__Group__23997);
            rule__ComponentWithType__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getComponentWithTypeAccess().getAlternatives_2()); 

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
    // $ANTLR end rule__ComponentWithType__Group__2


    // $ANTLR start rule__ComponentWithType__Group_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1964:1: rule__ComponentWithType__Group_1__0 : ( 'as' ) rule__ComponentWithType__Group_1__1 ;
    public final void rule__ComponentWithType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1968:1: ( ( 'as' ) rule__ComponentWithType__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1969:1: ( 'as' ) rule__ComponentWithType__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1969:1: ( 'as' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1970:1: 'as'
            {
             before(grammarAccess.getComponentWithTypeAccess().getAsKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__ComponentWithType__Group_1__04038); 
             after(grammarAccess.getComponentWithTypeAccess().getAsKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group_1__1_in_rule__ComponentWithType__Group_1__04048);
            rule__ComponentWithType__Group_1__1();
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
    // $ANTLR end rule__ComponentWithType__Group_1__0


    // $ANTLR start rule__ComponentWithType__Group_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1984:1: rule__ComponentWithType__Group_1__1 : ( ( rule__ComponentWithType__NameAssignment_1_1 ) ) ;
    public final void rule__ComponentWithType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1988:1: ( ( ( rule__ComponentWithType__NameAssignment_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1989:1: ( ( rule__ComponentWithType__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1989:1: ( ( rule__ComponentWithType__NameAssignment_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1990:1: ( rule__ComponentWithType__NameAssignment_1_1 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1991:1: ( rule__ComponentWithType__NameAssignment_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:1991:2: rule__ComponentWithType__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComponentWithType__NameAssignment_1_1_in_rule__ComponentWithType__Group_1__14076);
            rule__ComponentWithType__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getComponentWithTypeAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end rule__ComponentWithType__Group_1__1


    // $ANTLR start rule__ComponentWithType__Group_2_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2005:1: rule__ComponentWithType__Group_2_1__0 : ( '{' ) rule__ComponentWithType__Group_2_1__1 ;
    public final void rule__ComponentWithType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2009:1: ( ( '{' ) rule__ComponentWithType__Group_2_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2010:1: ( '{' ) rule__ComponentWithType__Group_2_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2010:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2011:1: '{'
            {
             before(grammarAccess.getComponentWithTypeAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,14,FOLLOW_14_in_rule__ComponentWithType__Group_2_1__04115); 
             after(grammarAccess.getComponentWithTypeAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__1_in_rule__ComponentWithType__Group_2_1__04125);
            rule__ComponentWithType__Group_2_1__1();
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
    // $ANTLR end rule__ComponentWithType__Group_2_1__0


    // $ANTLR start rule__ComponentWithType__Group_2_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2025:1: rule__ComponentWithType__Group_2_1__1 : ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2 ;
    public final void rule__ComponentWithType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2029:1: ( ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2030:1: ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2030:1: ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2031:1: ( rule__ComponentWithType__ElementsAssignment_2_1_1 )*
            {
             before(grammarAccess.getComponentWithTypeAccess().getElementsAssignment_2_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2032:1: ( rule__ComponentWithType__ElementsAssignment_2_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=17 && LA20_0<=18)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2032:2: rule__ComponentWithType__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ComponentWithType__ElementsAssignment_2_1_1_in_rule__ComponentWithType__Group_2_1__14153);
            	    rule__ComponentWithType__ElementsAssignment_2_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComponentWithTypeAccess().getElementsAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__2_in_rule__ComponentWithType__Group_2_1__14163);
            rule__ComponentWithType__Group_2_1__2();
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
    // $ANTLR end rule__ComponentWithType__Group_2_1__1


    // $ANTLR start rule__ComponentWithType__Group_2_1__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2043:1: rule__ComponentWithType__Group_2_1__2 : ( '}' ) ;
    public final void rule__ComponentWithType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2047:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2048:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2048:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2049:1: '}'
            {
             before(grammarAccess.getComponentWithTypeAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,15,FOLLOW_15_in_rule__ComponentWithType__Group_2_1__24192); 
             after(grammarAccess.getComponentWithTypeAccess().getRightCurlyBracketKeyword_2_1_2()); 

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
    // $ANTLR end rule__ComponentWithType__Group_2_1__2


    // $ANTLR start rule__AttributeList__Group_0__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2068:1: rule__AttributeList__Group_0__0 : ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1 ;
    public final void rule__AttributeList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2072:1: ( ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2073:1: ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2073:1: ( ruleSimpleAttribute )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2074:1: ruleSimpleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getSimpleAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__Group_0__04233);
            ruleSimpleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getSimpleAttributeParserRuleCall_0_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__04241);
            rule__AttributeList__Group_0__1();
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
    // $ANTLR end rule__AttributeList__Group_0__0


    // $ANTLR start rule__AttributeList__Group_0__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2086:1: rule__AttributeList__Group_0__1 : ( ( rule__AttributeList__Group_0_1__0 )? ) ;
    public final void rule__AttributeList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2090:1: ( ( ( rule__AttributeList__Group_0_1__0 )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2091:1: ( ( rule__AttributeList__Group_0_1__0 )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2091:1: ( ( rule__AttributeList__Group_0_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2092:1: ( rule__AttributeList__Group_0_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2093:1: ( rule__AttributeList__Group_0_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2093:2: rule__AttributeList__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_0_1__0_in_rule__AttributeList__Group_0__14269);
                    rule__AttributeList__Group_0_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getGroup_0_1()); 

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
    // $ANTLR end rule__AttributeList__Group_0__1


    // $ANTLR start rule__AttributeList__Group_0_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2107:1: rule__AttributeList__Group_0_1__0 : ( () ) rule__AttributeList__Group_0_1__1 ;
    public final void rule__AttributeList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2111:1: ( ( () ) rule__AttributeList__Group_0_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2112:1: ( () ) rule__AttributeList__Group_0_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2112:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2113:1: ()
            {
             before(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2114:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2116:1: 
            {
            }

             after(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0_1__1_in_rule__AttributeList__Group_0_1__04318);
            rule__AttributeList__Group_0_1__1();
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
    // $ANTLR end rule__AttributeList__Group_0_1__0


    // $ANTLR start rule__AttributeList__Group_0_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2127:1: rule__AttributeList__Group_0_1__1 : ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) ) ;
    public final void rule__AttributeList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2131:1: ( ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2132:1: ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2132:1: ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2133:1: ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2133:1: ( ( rule__AttributeList__Group_0_1_1__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2134:1: ( rule__AttributeList__Group_0_1_1__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2135:1: ( rule__AttributeList__Group_0_1_1__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2135:2: rule__AttributeList__Group_0_1_1__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14348);
            rule__AttributeList__Group_0_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 

            }

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2138:1: ( ( rule__AttributeList__Group_0_1_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2139:1: ( rule__AttributeList__Group_0_1_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2140:1: ( rule__AttributeList__Group_0_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2140:2: rule__AttributeList__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14360);
            	    rule__AttributeList__Group_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 

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
    // $ANTLR end rule__AttributeList__Group_0_1__1


    // $ANTLR start rule__AttributeList__Group_0_1_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2155:1: rule__AttributeList__Group_0_1_1__0 : ( ',' ) rule__AttributeList__Group_0_1_1__1 ;
    public final void rule__AttributeList__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2159:1: ( ( ',' ) rule__AttributeList__Group_0_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2160:1: ( ',' ) rule__AttributeList__Group_0_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2160:1: ( ',' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2161:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_0_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttributeList__Group_0_1_1__04402); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_0_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__1_in_rule__AttributeList__Group_0_1_1__04412);
            rule__AttributeList__Group_0_1_1__1();
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
    // $ANTLR end rule__AttributeList__Group_0_1_1__0


    // $ANTLR start rule__AttributeList__Group_0_1_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2175:1: rule__AttributeList__Group_0_1_1__1 : ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) ) ;
    public final void rule__AttributeList__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2179:1: ( ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2180:1: ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2180:1: ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2181:1: ( rule__AttributeList__ContentAssignment_0_1_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getContentAssignment_0_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2182:1: ( rule__AttributeList__ContentAssignment_0_1_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2182:2: rule__AttributeList__ContentAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__AttributeList__ContentAssignment_0_1_1_1_in_rule__AttributeList__Group_0_1_1__14440);
            rule__AttributeList__ContentAssignment_0_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getContentAssignment_0_1_1_1()); 

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
    // $ANTLR end rule__AttributeList__Group_0_1_1__1


    // $ANTLR start rule__AttributeList__Group_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2196:1: rule__AttributeList__Group_1__0 : ( ruleReference ) rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2200:1: ( ( ruleReference ) rule__AttributeList__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2201:1: ( ruleReference ) rule__AttributeList__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2201:1: ( ruleReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2202:1: ruleReference
            {
             before(grammarAccess.getAttributeListAccess().getReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__AttributeList__Group_1__04478);
            ruleReference();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getReferenceParserRuleCall_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__04486);
            rule__AttributeList__Group_1__1();
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
    // $ANTLR end rule__AttributeList__Group_1__0


    // $ANTLR start rule__AttributeList__Group_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2214:1: rule__AttributeList__Group_1__1 : ( ( rule__AttributeList__Group_1_1__0 )? ) ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2218:1: ( ( ( rule__AttributeList__Group_1_1__0 )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2219:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2219:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2220:1: ( rule__AttributeList__Group_1_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2221:1: ( rule__AttributeList__Group_1_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2221:2: rule__AttributeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__14514);
                    rule__AttributeList__Group_1_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getGroup_1_1()); 

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
    // $ANTLR end rule__AttributeList__Group_1__1


    // $ANTLR start rule__AttributeList__Group_1_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2235:1: rule__AttributeList__Group_1_1__0 : ( () ) rule__AttributeList__Group_1_1__1 ;
    public final void rule__AttributeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2239:1: ( ( () ) rule__AttributeList__Group_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2240:1: ( () ) rule__AttributeList__Group_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2240:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2241:1: ()
            {
             before(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2242:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2244:1: 
            {
            }

             after(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__04563);
            rule__AttributeList__Group_1_1__1();
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
    // $ANTLR end rule__AttributeList__Group_1_1__0


    // $ANTLR start rule__AttributeList__Group_1_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2255:1: rule__AttributeList__Group_1_1__1 : ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) ) ;
    public final void rule__AttributeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2259:1: ( ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2260:1: ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2260:1: ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2261:1: ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2261:1: ( ( rule__AttributeList__Group_1_1_1__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2262:1: ( rule__AttributeList__Group_1_1_1__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2263:1: ( rule__AttributeList__Group_1_1_1__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2263:2: rule__AttributeList__Group_1_1_1__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14593);
            rule__AttributeList__Group_1_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 

            }

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2266:1: ( ( rule__AttributeList__Group_1_1_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2267:1: ( rule__AttributeList__Group_1_1_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2268:1: ( rule__AttributeList__Group_1_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2268:2: rule__AttributeList__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14605);
            	    rule__AttributeList__Group_1_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 

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
    // $ANTLR end rule__AttributeList__Group_1_1__1


    // $ANTLR start rule__AttributeList__Group_1_1_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2283:1: rule__AttributeList__Group_1_1_1__0 : ( ',' ) rule__AttributeList__Group_1_1_1__1 ;
    public final void rule__AttributeList__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2287:1: ( ( ',' ) rule__AttributeList__Group_1_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2288:1: ( ',' ) rule__AttributeList__Group_1_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2288:1: ( ',' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2289:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_1_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttributeList__Group_1_1_1__04647); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_1_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__1_in_rule__AttributeList__Group_1_1_1__04657);
            rule__AttributeList__Group_1_1_1__1();
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
    // $ANTLR end rule__AttributeList__Group_1_1_1__0


    // $ANTLR start rule__AttributeList__Group_1_1_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2303:1: rule__AttributeList__Group_1_1_1__1 : ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) ) ;
    public final void rule__AttributeList__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2307:1: ( ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2308:1: ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2308:1: ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2309:1: ( rule__AttributeList__ContentAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getContentAssignment_1_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2310:1: ( rule__AttributeList__ContentAssignment_1_1_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2310:2: rule__AttributeList__ContentAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__AttributeList__ContentAssignment_1_1_1_1_in_rule__AttributeList__Group_1_1_1__14685);
            rule__AttributeList__ContentAssignment_1_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getContentAssignment_1_1_1_1()); 

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
    // $ANTLR end rule__AttributeList__Group_1_1_1__1


    // $ANTLR start rule__SimpleProperty__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2324:1: rule__SimpleProperty__Group__0 : ( 'property' ) rule__SimpleProperty__Group__1 ;
    public final void rule__SimpleProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2328:1: ( ( 'property' ) rule__SimpleProperty__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2329:1: ( 'property' ) rule__SimpleProperty__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2329:1: ( 'property' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2330:1: 'property'
            {
             before(grammarAccess.getSimplePropertyAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SimpleProperty__Group__04724); 
             after(grammarAccess.getSimplePropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__1_in_rule__SimpleProperty__Group__04734);
            rule__SimpleProperty__Group__1();
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
    // $ANTLR end rule__SimpleProperty__Group__0


    // $ANTLR start rule__SimpleProperty__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2344:1: rule__SimpleProperty__Group__1 : ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2 ;
    public final void rule__SimpleProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2348:1: ( ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2349:1: ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2349:1: ( ( rule__SimpleProperty__NameAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2350:1: ( rule__SimpleProperty__NameAssignment_1 )
            {
             before(grammarAccess.getSimplePropertyAccess().getNameAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2351:1: ( rule__SimpleProperty__NameAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2351:2: rule__SimpleProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleProperty__NameAssignment_1_in_rule__SimpleProperty__Group__14762);
            rule__SimpleProperty__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__2_in_rule__SimpleProperty__Group__14771);
            rule__SimpleProperty__Group__2();
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
    // $ANTLR end rule__SimpleProperty__Group__1


    // $ANTLR start rule__SimpleProperty__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2362:1: rule__SimpleProperty__Group__2 : ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3 ;
    public final void rule__SimpleProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2366:1: ( ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2367:1: ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2367:1: ( ( rule__SimpleProperty__DelimiterAssignment_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2368:1: ( rule__SimpleProperty__DelimiterAssignment_2 )
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterAssignment_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2369:1: ( rule__SimpleProperty__DelimiterAssignment_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2369:2: rule__SimpleProperty__DelimiterAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleProperty__DelimiterAssignment_2_in_rule__SimpleProperty__Group__24799);
            rule__SimpleProperty__DelimiterAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getDelimiterAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__3_in_rule__SimpleProperty__Group__24808);
            rule__SimpleProperty__Group__3();
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
    // $ANTLR end rule__SimpleProperty__Group__2


    // $ANTLR start rule__SimpleProperty__Group__3
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2380:1: rule__SimpleProperty__Group__3 : ( ( rule__SimpleProperty__ValueAssignment_3 ) ) ;
    public final void rule__SimpleProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2384:1: ( ( ( rule__SimpleProperty__ValueAssignment_3 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2385:1: ( ( rule__SimpleProperty__ValueAssignment_3 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2385:1: ( ( rule__SimpleProperty__ValueAssignment_3 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2386:1: ( rule__SimpleProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getSimplePropertyAccess().getValueAssignment_3()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2387:1: ( rule__SimpleProperty__ValueAssignment_3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2387:2: rule__SimpleProperty__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleProperty__ValueAssignment_3_in_rule__SimpleProperty__Group__34836);
            rule__SimpleProperty__ValueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getValueAssignment_3()); 

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
    // $ANTLR end rule__SimpleProperty__Group__3


    // $ANTLR start rule__PropertyFile__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2405:1: rule__PropertyFile__Group__0 : ( 'property' ) rule__PropertyFile__Group__1 ;
    public final void rule__PropertyFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2409:1: ( ( 'property' ) rule__PropertyFile__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2410:1: ( 'property' ) rule__PropertyFile__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2410:1: ( 'property' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2411:1: 'property'
            {
             before(grammarAccess.getPropertyFileAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PropertyFile__Group__04879); 
             after(grammarAccess.getPropertyFileAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyFile__Group__1_in_rule__PropertyFile__Group__04889);
            rule__PropertyFile__Group__1();
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
    // $ANTLR end rule__PropertyFile__Group__0


    // $ANTLR start rule__PropertyFile__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2425:1: rule__PropertyFile__Group__1 : ( ( rule__PropertyFile__FileRefAssignment_1 ) ) ;
    public final void rule__PropertyFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2429:1: ( ( ( rule__PropertyFile__FileRefAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2430:1: ( ( rule__PropertyFile__FileRefAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2430:1: ( ( rule__PropertyFile__FileRefAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2431:1: ( rule__PropertyFile__FileRefAssignment_1 )
            {
             before(grammarAccess.getPropertyFileAccess().getFileRefAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2432:1: ( rule__PropertyFile__FileRefAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2432:2: rule__PropertyFile__FileRefAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyFile__FileRefAssignment_1_in_rule__PropertyFile__Group__14917);
            rule__PropertyFile__FileRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyFileAccess().getFileRefAssignment_1()); 

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
    // $ANTLR end rule__PropertyFile__Group__1


    // $ANTLR start rule__FQN__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2446:1: rule__FQN__Group__0 : ( ruleValidID ) rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2450:1: ( ( ruleValidID ) rule__FQN__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2451:1: ( ruleValidID ) rule__FQN__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2451:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2452:1: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__FQN__Group__04955);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04963);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2464:1: rule__FQN__Group__1 : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2468:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2469:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2469:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2470:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2471:1: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==10) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2471:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__14991);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2485:1: rule__FQN__Group_1__0 : ( '.' ) rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2489:1: ( ( '.' ) rule__FQN__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2490:1: ( '.' ) rule__FQN__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2490:1: ( '.' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2491:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,10,FOLLOW_10_in_rule__FQN__Group_1__05031); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05041);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2505:1: rule__FQN__Group_1__1 : ( ruleValidID ) ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2509:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2510:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2510:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2511:1: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__FQN__Group_1__15069);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1()); 

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


    // $ANTLR start rule__MWEString__Group_1__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2526:1: rule__MWEString__Group_1__0 : ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 ;
    public final void rule__MWEString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2530:1: ( ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2531:1: ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2531:1: ( ( rule__MWEString__BeginAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2532:1: ( rule__MWEString__BeginAssignment_1_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2533:1: ( rule__MWEString__BeginAssignment_1_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2533:2: rule__MWEString__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__05106);
            rule__MWEString__BeginAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__05115);
            rule__MWEString__Group_1__1();
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
    // $ANTLR end rule__MWEString__Group_1__0


    // $ANTLR start rule__MWEString__Group_1__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2544:1: rule__MWEString__Group_1__1 : ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 ;
    public final void rule__MWEString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2548:1: ( ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2549:1: ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2549:1: ( ( rule__MWEString__PartsAssignment_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2550:1: ( rule__MWEString__PartsAssignment_1_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2551:1: ( rule__MWEString__PartsAssignment_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_ANY_OTHER)||(LA26_0>=9 && LA26_0<=10)||(LA26_0>=13 && LA26_0<=15)||(LA26_0>=17 && LA26_0<=22)||LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2551:2: rule__MWEString__PartsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__15143);
            	    rule__MWEString__PartsAssignment_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMWEStringAccess().getPartsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__15153);
            rule__MWEString__Group_1__2();
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
    // $ANTLR end rule__MWEString__Group_1__1


    // $ANTLR start rule__MWEString__Group_1__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2562:1: rule__MWEString__Group_1__2 : ( ( rule__MWEString__EndAssignment_1_2 ) ) ;
    public final void rule__MWEString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2566:1: ( ( ( rule__MWEString__EndAssignment_1_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2567:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2567:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2568:1: ( rule__MWEString__EndAssignment_1_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_1_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2569:1: ( rule__MWEString__EndAssignment_1_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2569:2: rule__MWEString__EndAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__25181);
            rule__MWEString__EndAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getEndAssignment_1_2()); 

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
    // $ANTLR end rule__MWEString__Group_1__2


    // $ANTLR start rule__MWEString__Group_2__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2585:1: rule__MWEString__Group_2__0 : ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1 ;
    public final void rule__MWEString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2589:1: ( ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2590:1: ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2590:1: ( ( rule__MWEString__BeginAssignment_2_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2591:1: ( rule__MWEString__BeginAssignment_2_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_2_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2592:1: ( rule__MWEString__BeginAssignment_2_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2592:2: rule__MWEString__BeginAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_2_0_in_rule__MWEString__Group_2__05221);
            rule__MWEString__BeginAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_2__1_in_rule__MWEString__Group_2__05230);
            rule__MWEString__Group_2__1();
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
    // $ANTLR end rule__MWEString__Group_2__0


    // $ANTLR start rule__MWEString__Group_2__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2603:1: rule__MWEString__Group_2__1 : ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2 ;
    public final void rule__MWEString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2607:1: ( ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2608:1: ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2608:1: ( ( rule__MWEString__PartsAssignment_2_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2609:1: ( rule__MWEString__PartsAssignment_2_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_2_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2610:1: ( rule__MWEString__PartsAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_ANY_OTHER)||(LA27_0>=9 && LA27_0<=10)||(LA27_0>=13 && LA27_0<=15)||(LA27_0>=17 && LA27_0<=22)||LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2610:2: rule__MWEString__PartsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_2_1_in_rule__MWEString__Group_2__15258);
            	    rule__MWEString__PartsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMWEStringAccess().getPartsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_2__2_in_rule__MWEString__Group_2__15268);
            rule__MWEString__Group_2__2();
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
    // $ANTLR end rule__MWEString__Group_2__1


    // $ANTLR start rule__MWEString__Group_2__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2621:1: rule__MWEString__Group_2__2 : ( ( rule__MWEString__EndAssignment_2_2 ) ) ;
    public final void rule__MWEString__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2625:1: ( ( ( rule__MWEString__EndAssignment_2_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2626:1: ( ( rule__MWEString__EndAssignment_2_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2626:1: ( ( rule__MWEString__EndAssignment_2_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2627:1: ( rule__MWEString__EndAssignment_2_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_2_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2628:1: ( rule__MWEString__EndAssignment_2_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2628:2: rule__MWEString__EndAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_2_2_in_rule__MWEString__Group_2__25296);
            rule__MWEString__EndAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getEndAssignment_2_2()); 

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
    // $ANTLR end rule__MWEString__Group_2__2


    // $ANTLR start rule__Boolean__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2644:1: rule__Boolean__Group__0 : ( () ) rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2648:1: ( ( () ) rule__Boolean__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2649:1: ( () ) rule__Boolean__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2649:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2650:1: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2651:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2653:1: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0()); 

            }

            pushFollow(FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__05346);
            rule__Boolean__Group__1();
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
    // $ANTLR end rule__Boolean__Group__0


    // $ANTLR start rule__Boolean__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2664:1: rule__Boolean__Group__1 : ( ( rule__Boolean__ValueAssignment_1 ) ) ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2668:1: ( ( ( rule__Boolean__ValueAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2669:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2669:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2670:1: ( rule__Boolean__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2671:1: ( rule__Boolean__ValueAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2671:2: rule__Boolean__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Group__15374);
            rule__Boolean__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment_1()); 

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
    // $ANTLR end rule__Boolean__Group__1


    // $ANTLR start rule__ReplaceableString__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2685:1: rule__ReplaceableString__Group__0 : ( '${' ) rule__ReplaceableString__Group__1 ;
    public final void rule__ReplaceableString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2689:1: ( ( '${' ) rule__ReplaceableString__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2690:1: ( '${' ) rule__ReplaceableString__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2690:1: ( '${' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2691:1: '${'
            {
             before(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ReplaceableString__Group__05413); 
             after(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__05423);
            rule__ReplaceableString__Group__1();
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
    // $ANTLR end rule__ReplaceableString__Group__0


    // $ANTLR start rule__ReplaceableString__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2705:1: rule__ReplaceableString__Group__1 : ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 ;
    public final void rule__ReplaceableString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2709:1: ( ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2710:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2710:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2711:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2712:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2712:2: rule__ReplaceableString__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__15451);
            rule__ReplaceableString__PropertyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__15460);
            rule__ReplaceableString__Group__2();
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
    // $ANTLR end rule__ReplaceableString__Group__1


    // $ANTLR start rule__ReplaceableString__Group__2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2723:1: rule__ReplaceableString__Group__2 : ( '}' ) ;
    public final void rule__ReplaceableString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2727:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2728:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2728:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2729:1: '}'
            {
             before(grammarAccess.getReplaceableStringAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ReplaceableString__Group__25489); 
             after(grammarAccess.getReplaceableStringAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__ReplaceableString__Group__2


    // $ANTLR start rule__FileRef__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2748:1: rule__FileRef__Group__0 : ( 'file' ) rule__FileRef__Group__1 ;
    public final void rule__FileRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2752:1: ( ( 'file' ) rule__FileRef__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2753:1: ( 'file' ) rule__FileRef__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2753:1: ( 'file' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2754:1: 'file'
            {
             before(grammarAccess.getFileRefAccess().getFileKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FileRef__Group__05531); 
             after(grammarAccess.getFileRefAccess().getFileKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FileRef__Group__1_in_rule__FileRef__Group__05541);
            rule__FileRef__Group__1();
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
    // $ANTLR end rule__FileRef__Group__0


    // $ANTLR start rule__FileRef__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2768:1: rule__FileRef__Group__1 : ( ( rule__FileRef__FilePathAssignment_1 ) ) ;
    public final void rule__FileRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2772:1: ( ( ( rule__FileRef__FilePathAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2773:1: ( ( rule__FileRef__FilePathAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2773:1: ( ( rule__FileRef__FilePathAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2774:1: ( rule__FileRef__FilePathAssignment_1 )
            {
             before(grammarAccess.getFileRefAccess().getFilePathAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2775:1: ( rule__FileRef__FilePathAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2775:2: rule__FileRef__FilePathAssignment_1
            {
            pushFollow(FOLLOW_rule__FileRef__FilePathAssignment_1_in_rule__FileRef__Group__15569);
            rule__FileRef__FilePathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFileRefAccess().getFilePathAssignment_1()); 

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
    // $ANTLR end rule__FileRef__Group__1


    // $ANTLR start rule__EscapedSingleQuote__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2789:1: rule__EscapedSingleQuote__Group__0 : ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 ;
    public final void rule__EscapedSingleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2793:1: ( ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2794:1: ( ruleBackslash ) rule__EscapedSingleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2794:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2795:1: ruleBackslash
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__05607);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__05615);
            rule__EscapedSingleQuote__Group__1();
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
    // $ANTLR end rule__EscapedSingleQuote__Group__0


    // $ANTLR start rule__EscapedSingleQuote__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2807:1: rule__EscapedSingleQuote__Group__1 : ( ruleSingleQuote ) ;
    public final void rule__EscapedSingleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2811:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2812:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2812:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2813:1: ruleSingleQuote
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__15643);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1()); 

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
    // $ANTLR end rule__EscapedSingleQuote__Group__1


    // $ANTLR start rule__EscapedDoubleQuote__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2828:1: rule__EscapedDoubleQuote__Group__0 : ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 ;
    public final void rule__EscapedDoubleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2832:1: ( ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2833:1: ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2833:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2834:1: ruleBackslash
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__05680);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__05688);
            rule__EscapedDoubleQuote__Group__1();
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
    // $ANTLR end rule__EscapedDoubleQuote__Group__0


    // $ANTLR start rule__EscapedDoubleQuote__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2846:1: rule__EscapedDoubleQuote__Group__1 : ( ruleDoubleQuote ) ;
    public final void rule__EscapedDoubleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2850:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2851:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2851:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2852:1: ruleDoubleQuote
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__15716);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1()); 

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
    // $ANTLR end rule__EscapedDoubleQuote__Group__1


    // $ANTLR start rule__EscapedBackslash__Group__0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2867:1: rule__EscapedBackslash__Group__0 : ( ruleBackslash ) rule__EscapedBackslash__Group__1 ;
    public final void rule__EscapedBackslash__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2871:1: ( ( ruleBackslash ) rule__EscapedBackslash__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2872:1: ( ruleBackslash ) rule__EscapedBackslash__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2872:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2873:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__05753);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__05761);
            rule__EscapedBackslash__Group__1();
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
    // $ANTLR end rule__EscapedBackslash__Group__0


    // $ANTLR start rule__EscapedBackslash__Group__1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2885:1: rule__EscapedBackslash__Group__1 : ( ruleBackslash ) ;
    public final void rule__EscapedBackslash__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2889:1: ( ( ruleBackslash ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2890:1: ( ruleBackslash )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2890:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2891:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__15789);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1()); 

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
    // $ANTLR end rule__EscapedBackslash__Group__1


    // $ANTLR start rule__MWEFile__ImportsAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2907:1: rule__MWEFile__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__MWEFile__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2911:1: ( ( ruleImport ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2912:1: ( ruleImport )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2912:1: ( ruleImport )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2913:1: ruleImport
            {
             before(grammarAccess.getMWEFileAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__MWEFile__ImportsAssignment_15827);
            ruleImport();
            _fsp--;

             after(grammarAccess.getMWEFileAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end rule__MWEFile__ImportsAssignment_1


    // $ANTLR start rule__MWEFile__RootAssignment_2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2922:1: rule__MWEFile__RootAssignment_2 : ( ruleComponentWithType ) ;
    public final void rule__MWEFile__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2926:1: ( ( ruleComponentWithType ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2927:1: ( ruleComponentWithType )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2927:1: ( ruleComponentWithType )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2928:1: ruleComponentWithType
            {
             before(grammarAccess.getMWEFileAccess().getRootComponentWithTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComponentWithType_in_rule__MWEFile__RootAssignment_25858);
            ruleComponentWithType();
            _fsp--;

             after(grammarAccess.getMWEFileAccess().getRootComponentWithTypeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__MWEFile__RootAssignment_2


    // $ANTLR start rule__Import__ImportedNamespaceAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2937:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2941:1: ( ( ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2942:1: ( ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2942:1: ( ruleImportedFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2943:1: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_15889);
            ruleImportedFQN();
            _fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Import__ImportedNamespaceAssignment_1


    // $ANTLR start rule__Setting__FeatureAssignment_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2952:1: rule__Setting__FeatureAssignment_0 : ( ( ruleValidID ) ) ;
    public final void rule__Setting__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2956:1: ( ( ( ruleValidID ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2957:1: ( ( ruleValidID ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2957:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2958:1: ( ruleValidID )
            {
             before(grammarAccess.getSettingAccess().getFeatureOperationCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2959:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2960:1: ruleValidID
            {
             before(grammarAccess.getSettingAccess().getFeatureOperationValidIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Setting__FeatureAssignment_05924);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getSettingAccess().getFeatureOperationValidIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSettingAccess().getFeatureOperationCrossReference_0_0()); 

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
    // $ANTLR end rule__Setting__FeatureAssignment_0


    // $ANTLR start rule__Setting__ValueAssignment_1_0_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2971:1: rule__Setting__ValueAssignment_1_0_1 : ( ruleAttributeList ) ;
    public final void rule__Setting__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2975:1: ( ( ruleAttributeList ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2976:1: ( ruleAttributeList )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2976:1: ( ruleAttributeList )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2977:1: ruleAttributeList
            {
             before(grammarAccess.getSettingAccess().getValueAttributeListParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__Setting__ValueAssignment_1_0_15959);
            ruleAttributeList();
            _fsp--;

             after(grammarAccess.getSettingAccess().getValueAttributeListParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end rule__Setting__ValueAssignment_1_0_1


    // $ANTLR start rule__Setting__ValueAssignment_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2986:1: rule__Setting__ValueAssignment_1_1 : ( ruleComponent ) ;
    public final void rule__Setting__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2990:1: ( ( ruleComponent ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2991:1: ( ruleComponent )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2991:1: ( ruleComponent )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:2992:1: ruleComponent
            {
             before(grammarAccess.getSettingAccess().getValueComponentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Setting__ValueAssignment_1_15990);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getSettingAccess().getValueComponentParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Setting__ValueAssignment_1_1


    // $ANTLR start rule__Component__TypeAssignment_1_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3001:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3005:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3006:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3006:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3007:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3008:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3009:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getTypeTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_06025);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getComponentAccess().getTypeTypeFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0()); 

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
    // $ANTLR end rule__Component__TypeAssignment_1_0


    // $ANTLR start rule__Component__FileRefAssignment_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3020:1: rule__Component__FileRefAssignment_1_1 : ( ruleFileRef ) ;
    public final void rule__Component__FileRefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3024:1: ( ( ruleFileRef ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3025:1: ( ruleFileRef )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3025:1: ( ruleFileRef )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3026:1: ruleFileRef
            {
             before(grammarAccess.getComponentAccess().getFileRefFileRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFileRef_in_rule__Component__FileRefAssignment_1_16060);
            ruleFileRef();
            _fsp--;

             after(grammarAccess.getComponentAccess().getFileRefFileRefParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Component__FileRefAssignment_1_1


    // $ANTLR start rule__Component__NameAssignment_2_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3035:1: rule__Component__NameAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3039:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3040:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3040:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3041:1: ruleValidID
            {
             before(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Component__NameAssignment_2_16091);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Component__NameAssignment_2_1


    // $ANTLR start rule__Component__ElementsAssignment_3_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3050:1: rule__Component__ElementsAssignment_3_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__Component__ElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3054:1: ( ( ruleConfigurationElement ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3055:1: ( ruleConfigurationElement )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3055:1: ( ruleConfigurationElement )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3056:1: ruleConfigurationElement
            {
             before(grammarAccess.getComponentAccess().getElementsConfigurationElementParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Component__ElementsAssignment_3_1_16122);
            ruleConfigurationElement();
            _fsp--;

             after(grammarAccess.getComponentAccess().getElementsConfigurationElementParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end rule__Component__ElementsAssignment_3_1_1


    // $ANTLR start rule__ComponentWithType__TypeAssignment_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3065:1: rule__ComponentWithType__TypeAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentWithType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3069:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3070:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3070:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3071:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3072:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3073:1: ruleFQN
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeTypeFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ComponentWithType__TypeAssignment_06157);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getComponentWithTypeAccess().getTypeTypeFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getComponentWithTypeAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end rule__ComponentWithType__TypeAssignment_0


    // $ANTLR start rule__ComponentWithType__NameAssignment_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3084:1: rule__ComponentWithType__NameAssignment_1_1 : ( ruleValidID ) ;
    public final void rule__ComponentWithType__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3088:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3089:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3089:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3090:1: ruleValidID
            {
             before(grammarAccess.getComponentWithTypeAccess().getNameValidIDParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__ComponentWithType__NameAssignment_1_16192);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getComponentWithTypeAccess().getNameValidIDParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__ComponentWithType__NameAssignment_1_1


    // $ANTLR start rule__ComponentWithType__ElementsAssignment_2_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3099:1: rule__ComponentWithType__ElementsAssignment_2_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__ComponentWithType__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3103:1: ( ( ruleConfigurationElement ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3104:1: ( ruleConfigurationElement )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3104:1: ( ruleConfigurationElement )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3105:1: ruleConfigurationElement
            {
             before(grammarAccess.getComponentWithTypeAccess().getElementsConfigurationElementParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__ComponentWithType__ElementsAssignment_2_1_16223);
            ruleConfigurationElement();
            _fsp--;

             after(grammarAccess.getComponentWithTypeAccess().getElementsConfigurationElementParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__ComponentWithType__ElementsAssignment_2_1_1


    // $ANTLR start rule__AttributeList__ContentAssignment_0_1_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3114:1: rule__AttributeList__ContentAssignment_0_1_1_1 : ( ruleSimpleAttribute ) ;
    public final void rule__AttributeList__ContentAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3118:1: ( ( ruleSimpleAttribute ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3119:1: ( ruleSimpleAttribute )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3119:1: ( ruleSimpleAttribute )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3120:1: ruleSimpleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getContentSimpleAttributeParserRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__ContentAssignment_0_1_1_16254);
            ruleSimpleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getContentSimpleAttributeParserRuleCall_0_1_1_1_0()); 

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
    // $ANTLR end rule__AttributeList__ContentAssignment_0_1_1_1


    // $ANTLR start rule__AttributeList__ContentAssignment_1_1_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3129:1: rule__AttributeList__ContentAssignment_1_1_1_1 : ( ruleReference ) ;
    public final void rule__AttributeList__ContentAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3133:1: ( ( ruleReference ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3134:1: ( ruleReference )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3134:1: ( ruleReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3135:1: ruleReference
            {
             before(grammarAccess.getAttributeListAccess().getContentReferenceParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__AttributeList__ContentAssignment_1_1_1_16285);
            ruleReference();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getContentReferenceParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end rule__AttributeList__ContentAssignment_1_1_1_1


    // $ANTLR start rule__SimpleProperty__NameAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3144:1: rule__SimpleProperty__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__SimpleProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3148:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3149:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3149:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3150:1: ruleFQN
            {
             before(grammarAccess.getSimplePropertyAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SimpleProperty__NameAssignment_16316);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getSimplePropertyAccess().getNameFQNParserRuleCall_1_0()); 

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
    // $ANTLR end rule__SimpleProperty__NameAssignment_1


    // $ANTLR start rule__SimpleProperty__DelimiterAssignment_2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3159:1: rule__SimpleProperty__DelimiterAssignment_2 : ( ( '=' ) ) ;
    public final void rule__SimpleProperty__DelimiterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3163:1: ( ( ( '=' ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3164:1: ( ( '=' ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3164:1: ( ( '=' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3165:1: ( '=' )
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3166:1: ( '=' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3167:1: '='
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SimpleProperty__DelimiterAssignment_26352); 
             after(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 

            }

             after(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 

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
    // $ANTLR end rule__SimpleProperty__DelimiterAssignment_2


    // $ANTLR start rule__SimpleProperty__ValueAssignment_3
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3182:1: rule__SimpleProperty__ValueAssignment_3 : ( ruleMWEString ) ;
    public final void rule__SimpleProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3186:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3187:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3187:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3188:1: ruleMWEString
            {
             before(grammarAccess.getSimplePropertyAccess().getValueMWEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__SimpleProperty__ValueAssignment_36391);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getSimplePropertyAccess().getValueMWEStringParserRuleCall_3_0()); 

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
    // $ANTLR end rule__SimpleProperty__ValueAssignment_3


    // $ANTLR start rule__PropertyFile__FileRefAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3197:1: rule__PropertyFile__FileRefAssignment_1 : ( ruleFileRef ) ;
    public final void rule__PropertyFile__FileRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3201:1: ( ( ruleFileRef ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3202:1: ( ruleFileRef )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3202:1: ( ruleFileRef )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3203:1: ruleFileRef
            {
             before(grammarAccess.getPropertyFileAccess().getFileRefFileRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFileRef_in_rule__PropertyFile__FileRefAssignment_16422);
            ruleFileRef();
            _fsp--;

             after(grammarAccess.getPropertyFileAccess().getFileRefFileRefParserRuleCall_1_0()); 

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
    // $ANTLR end rule__PropertyFile__FileRefAssignment_1


    // $ANTLR start rule__SimpleAttribute__ValueAssignment
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3212:1: rule__SimpleAttribute__ValueAssignment : ( ruleMWEString ) ;
    public final void rule__SimpleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3216:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3217:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3217:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3218:1: ruleMWEString
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueMWEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__SimpleAttribute__ValueAssignment6453);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getSimpleAttributeAccess().getValueMWEStringParserRuleCall_0()); 

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
    // $ANTLR end rule__SimpleAttribute__ValueAssignment


    // $ANTLR start rule__Reference__ComponentAssignment
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3227:1: rule__Reference__ComponentAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ComponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3231:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3232:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3232:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3233:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getComponentComponentCrossReference_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3234:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3235:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getComponentComponentIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ComponentAssignment6488); 
             after(grammarAccess.getReferenceAccess().getComponentComponentIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getComponentComponentCrossReference_0()); 

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
    // $ANTLR end rule__Reference__ComponentAssignment


    // $ANTLR start rule__MWEString__PartsAssignment_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3246:1: rule__MWEString__PartsAssignment_0 : ( ruleBoolean ) ;
    public final void rule__MWEString__PartsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3250:1: ( ( ruleBoolean ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3251:1: ( ruleBoolean )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3251:1: ( ruleBoolean )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3252:1: ruleBoolean
            {
             before(grammarAccess.getMWEStringAccess().getPartsBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__MWEString__PartsAssignment_06523);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getPartsBooleanParserRuleCall_0_0()); 

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
    // $ANTLR end rule__MWEString__PartsAssignment_0


    // $ANTLR start rule__MWEString__BeginAssignment_1_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3261:1: rule__MWEString__BeginAssignment_1_0 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3265:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3266:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3266:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3267:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_1_06554);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_1_0_0()); 

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
    // $ANTLR end rule__MWEString__BeginAssignment_1_0


    // $ANTLR start rule__MWEString__PartsAssignment_1_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3276:1: rule__MWEString__PartsAssignment_1_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3280:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3281:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3281:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3282:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_16585);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__MWEString__PartsAssignment_1_1


    // $ANTLR start rule__MWEString__EndAssignment_1_2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3291:1: rule__MWEString__EndAssignment_1_2 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__EndAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3295:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3296:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3296:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3297:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_1_26616);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_1_2_0()); 

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
    // $ANTLR end rule__MWEString__EndAssignment_1_2


    // $ANTLR start rule__MWEString__BeginAssignment_2_0
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3306:1: rule__MWEString__BeginAssignment_2_0 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__BeginAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3310:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3311:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3311:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3312:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_2_06647);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_2_0_0()); 

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
    // $ANTLR end rule__MWEString__BeginAssignment_2_0


    // $ANTLR start rule__MWEString__PartsAssignment_2_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3321:1: rule__MWEString__PartsAssignment_2_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3325:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3326:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3326:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3327:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_2_16678);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__MWEString__PartsAssignment_2_1


    // $ANTLR start rule__MWEString__EndAssignment_2_2
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3336:1: rule__MWEString__EndAssignment_2_2 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__EndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3340:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3341:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3341:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3342:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_2_26709);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_2_2_0()); 

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
    // $ANTLR end rule__MWEString__EndAssignment_2_2


    // $ANTLR start rule__Boolean__ValueAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3351:1: rule__Boolean__ValueAssignment_1 : ( ( rule__Boolean__ValueAlternatives_1_0 ) ) ;
    public final void rule__Boolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3355:1: ( ( ( rule__Boolean__ValueAlternatives_1_0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3356:1: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3356:1: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3357:1: ( rule__Boolean__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanAccess().getValueAlternatives_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3358:1: ( rule__Boolean__ValueAlternatives_1_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3358:2: rule__Boolean__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Boolean__ValueAlternatives_1_0_in_rule__Boolean__ValueAssignment_16740);
            rule__Boolean__ValueAlternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAlternatives_1_0()); 

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
    // $ANTLR end rule__Boolean__ValueAssignment_1


    // $ANTLR start rule__ReplaceableString__PropertyAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3367:1: rule__ReplaceableString__PropertyAssignment_1 : ( rulePropertyReference ) ;
    public final void rule__ReplaceableString__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3371:1: ( ( rulePropertyReference ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3372:1: ( rulePropertyReference )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3372:1: ( rulePropertyReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3373:1: rulePropertyReference
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyPropertyReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__ReplaceableString__PropertyAssignment_16773);
            rulePropertyReference();
            _fsp--;

             after(grammarAccess.getReplaceableStringAccess().getPropertyPropertyReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end rule__ReplaceableString__PropertyAssignment_1


    // $ANTLR start rule__PropertyReference__PropertyAssignment
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3382:1: rule__PropertyReference__PropertyAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReference__PropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3386:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3387:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3387:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3388:1: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryCrossReference_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3389:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3390:1: ruleFQN
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__PropertyReference__PropertyAssignment6808);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryCrossReference_0()); 

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
    // $ANTLR end rule__PropertyReference__PropertyAssignment


    // $ANTLR start rule__PlainString__ValueAssignment
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3401:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3405:1: ( ( ruleConstantValue ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3406:1: ( ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3406:1: ( ruleConstantValue )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3407:1: ruleConstantValue
            {
             before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6843);
            ruleConstantValue();
            _fsp--;

             after(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 

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
    // $ANTLR end rule__PlainString__ValueAssignment


    // $ANTLR start rule__FileRef__FilePathAssignment_1
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3416:1: rule__FileRef__FilePathAssignment_1 : ( ruleMWEString ) ;
    public final void rule__FileRef__FilePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3420:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3421:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3421:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/ui/contentassist/antlr/internal/InternalMWEConcept.g:3422:1: ruleMWEString
            {
             before(grammarAccess.getFileRefAccess().getFilePathMWEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__FileRef__FilePathAssignment_16874);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getFileRefAccess().getFilePathMWEStringParserRuleCall_1_0()); 

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
    // $ANTLR end rule__FileRef__FilePathAssignment_1


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\105\uffff";
    static final String DFA5_eofS =
        "\10\uffff\2\7\24\uffff\1\7\17\uffff\1\7\26\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\3\12\1\4\1\uffff\4\4\3\12\5\4\1\13\17\4\1\13\12"+
        "\4\3\12\3\4\3\12\7\4\6\12";
    static final String DFA5_maxS =
        "\1\22\1\uffff\4\30\1\22\1\uffff\2\30\2\32\3\30\1\22\4\32\1\15\11"+
        "\32\1\30\1\22\4\32\1\15\11\32\1\30\3\17\3\32\3\17\3\32\1\22\1\32"+
        "\1\22\1\32\6\17";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\75\uffff";
    static final String DFA5_specialS =
        "\105\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\14\uffff\1\2\1\1",
            "",
            "\1\3\11\uffff\1\1\1\uffff\1\1\1\4\1\5\2\uffff\1\1\2\uffff\1"+
            "\1",
            "\1\6\3\uffff\1\1\1\uffff\1\1\4\uffff\1\7\2\uffff\1\1",
            "\1\6\3\uffff\1\1\1\uffff\1\1\4\uffff\1\7\2\uffff\1\1",
            "\1\6\1\12\1\13\1\uffff\1\1\1\uffff\1\1\2\uffff\1\10\1\11\1\7"+
            "\2\uffff\1\1",
            "\1\14\14\uffff\1\15\1\16",
            "",
            "\1\7\11\uffff\1\1\1\7\1\1\2\7\5\uffff\1\1",
            "\1\7\11\uffff\1\1\1\7\1\1\2\7\5\uffff\1\1",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\6\3\uffff\1\1\1\uffff\1\1\4\uffff\1\7\2\uffff\1\1",
            "\1\6\3\uffff\1\1\1\uffff\1\1\4\uffff\1\7\2\uffff\1\1",
            "\1\6\3\uffff\1\1\1\uffff\1\1\4\uffff\1\7\2\uffff\1\1",
            "\1\57\14\uffff\1\60\1\61",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\63\1\62\1\64",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\7\11\uffff\1\1\1\7\1\1\2\7\5\uffff\1\1",
            "\1\65\14\uffff\1\66\1\67",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\70\1\72\1\71",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\7\11\uffff\1\1\1\7\1\1\2\7\5\uffff\1\1",
            "\1\73\4\uffff\1\74",
            "\1\73\4\uffff\1\74",
            "\1\73\4\uffff\1\74",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\75\4\uffff\1\76",
            "\1\75\4\uffff\1\76",
            "\1\75\4\uffff\1\76",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\77\14\uffff\1\100\1\101",
            "\1\26\1\20\1\25\2\uffff\1\21\1\35\1\36\1\uffff\1\24\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1\17",
            "\1\102\14\uffff\1\103\1\104",
            "\1\46\1\40\1\45\2\uffff\1\41\1\55\1\uffff\1\56\1\44\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\51\1\52\1\53\1\54\3\uffff\1\37",
            "\1\73\4\uffff\1\74",
            "\1\73\4\uffff\1\74",
            "\1\73\4\uffff\1\74",
            "\1\75\4\uffff\1\76",
            "\1\75\4\uffff\1\76",
            "\1\75\4\uffff\1\76"
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
            return "1174:1: rule__ConfigurationElement__Alternatives : ( ( ruleSetting ) | ( ruleProperty ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleMWEFile_in_entryRuleMWEFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__Group__0_in_ruleMWEFile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetting248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Group__0_in_ruleSetting274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentWithType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__0_in_ruleComponentWithType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Alternatives_in_ruleAttributeList516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProperty612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__0_in_ruleSimpleProperty638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_entryRulePropertyFile665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFile672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFile__Group__0_in_rulePropertyFile698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__ValueAssignment_in_ruleSimpleAttribute818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ComponentAssignment_in_ruleReference878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_entryRuleMWEString1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEString1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEStringPart1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__0_in_ruleBoolean1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableString1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__PropertyAssignment_in_rulePropertyReference1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_entryRuleFileRef1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileRef1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileRef__Group__0_in_ruleFileRef1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleColon1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDot1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSingleQuote1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDoubleQuote1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBackslash1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpeningBrace2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpeningBrace2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosingBrace2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClosingBrace2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Group_1_0__0_in_rule__Setting__Alternatives_12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__ValueAssignment_1_1_in_rule__Setting__Alternatives_12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__FileRefAssignment_1_1_in_rule__Component__Alternatives_12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Alternatives_32289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__0_in_rule__Component__Alternatives_32308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentWithType__Alternatives_22342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__0_in_rule__ComponentWithType__Alternatives_22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_rule__ConfigurationElement__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__ConfigurationElement__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Alternatives2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_rule__Property__Alternatives2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_rule__Property__Alternatives2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__Alternatives2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValidID__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValidID__Alternatives2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_0_in_rule__MWEString__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__0_in_rule__MWEString__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Boolean__ValueAlternatives_1_02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Boolean__ValueAlternatives_1_02804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_rule__ConstantValue__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_rule__ConstantValue__Alternatives2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_rule__ConstantValue__Alternatives2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ConstantValue__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstantValue__Alternatives2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstantValue__Alternatives3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConstantValue__Alternatives3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConstantValue__Alternatives3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_rule__ConstantValue__Alternatives3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__Group__1_in_rule__MWEFile__Group__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__ImportsAssignment_1_in_rule__MWEFile__Group__13143 = new BitSet(new long[]{0x0000000000460010L});
    public static final BitSet FOLLOW_rule__MWEFile__Group__2_in_rule__MWEFile__Group__13153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__RootAssignment_2_in_rule__MWEFile__Group__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Import__Group__03222 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13260 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__23298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03339 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ImportedFQN__Group__13377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__FeatureAssignment_0_in_rule__Setting__Group__03418 = new BitSet(new long[]{0x0000000001274010L});
    public static final BitSet FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Alternatives_1_in_rule__Setting__Group__13455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Setting__Group_1_0__03494 = new BitSet(new long[]{0x0000000000181810L});
    public static final BitSet FOLLOW_rule__Setting__Group_1_0__1_in_rule__Setting__Group_1_0__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__ValueAssignment_1_0_1_in_rule__Setting__Group_1_0__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__13608 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__23646 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_3_in_rule__Component__Group__33684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Component__Group_2__03727 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group_3_1__03804 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__1_in_rule__Component__Group_3_1__03814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ElementsAssignment_3_1_1_in_rule__Component__Group_3_1__13842 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__2_in_rule__Component__Group_3_1__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group_3_1__23881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__TypeAssignment_0_in_rule__ComponentWithType__Group__03922 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__1_in_rule__ComponentWithType__Group__03931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_1__0_in_rule__ComponentWithType__Group__13959 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__2_in_rule__ComponentWithType__Group__13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Alternatives_2_in_rule__ComponentWithType__Group__23997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComponentWithType__Group_1__04038 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_1__1_in_rule__ComponentWithType__Group_1__04048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__NameAssignment_1_1_in_rule__ComponentWithType__Group_1__14076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComponentWithType__Group_2_1__04115 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__1_in_rule__ComponentWithType__Group_2_1__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__ElementsAssignment_2_1_1_in_rule__ComponentWithType__Group_2_1__14153 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__2_in_rule__ComponentWithType__Group_2_1__14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComponentWithType__Group_2_1__24192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__Group_0__04233 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__04241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1__0_in_rule__AttributeList__Group_0__14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1__1_in_rule__AttributeList__Group_0_1__04318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14348 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14360 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeList__Group_0_1_1__04402 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__1_in_rule__AttributeList__Group_0_1_1__04412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__ContentAssignment_0_1_1_1_in_rule__AttributeList__Group_0_1_1__14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__AttributeList__Group_1__04478 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__14514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__04563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14593 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14605 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeList__Group_1_1_1__04647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__1_in_rule__AttributeList__Group_1_1_1__04657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__ContentAssignment_1_1_1_1_in_rule__AttributeList__Group_1_1_1__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleProperty__Group__04724 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__1_in_rule__SimpleProperty__Group__04734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__NameAssignment_1_in_rule__SimpleProperty__Group__14762 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__2_in_rule__SimpleProperty__Group__14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__DelimiterAssignment_2_in_rule__SimpleProperty__Group__24799 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__3_in_rule__SimpleProperty__Group__24808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__ValueAssignment_3_in_rule__SimpleProperty__Group__34836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PropertyFile__Group__04879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PropertyFile__Group__1_in_rule__PropertyFile__Group__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFile__FileRefAssignment_1_in_rule__PropertyFile__Group__14917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__FQN__Group__04955 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__14991 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rule__FQN__Group_1__05031 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__FQN__Group_1__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__05106 = new BitSet(new long[]{0x00000000047EEE70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__05115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__15143 = new BitSet(new long[]{0x00000000047EEE70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_2_0_in_rule__MWEString__Group_2__05221 = new BitSet(new long[]{0x00000000047EF670L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__1_in_rule__MWEString__Group_2__05230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_2_1_in_rule__MWEString__Group_2__15258 = new BitSet(new long[]{0x00000000047EF670L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__2_in_rule__MWEString__Group_2__15268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_2_2_in_rule__MWEString__Group_2__25296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Group__15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReplaceableString__Group__05413 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__15451 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReplaceableString__Group__25489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FileRef__Group__05531 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__FileRef__Group__1_in_rule__FileRef__Group__05541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileRef__FilePathAssignment_1_in_rule__FileRef__Group__15569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__05607 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__15643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__05680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__05688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__15716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__05753 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__05761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__15789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__MWEFile__ImportsAssignment_15827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_rule__MWEFile__RootAssignment_25858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_15889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Setting__FeatureAssignment_05924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__Setting__ValueAssignment_1_0_15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Setting__ValueAssignment_1_15990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_rule__Component__FileRefAssignment_1_16060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Component__NameAssignment_2_16091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Component__ElementsAssignment_3_1_16122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ComponentWithType__TypeAssignment_06157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ComponentWithType__NameAssignment_1_16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__ComponentWithType__ElementsAssignment_2_1_16223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__ContentAssignment_0_1_1_16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__AttributeList__ContentAssignment_1_1_1_16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SimpleProperty__NameAssignment_16316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleProperty__DelimiterAssignment_26352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__SimpleProperty__ValueAssignment_36391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_rule__PropertyFile__FileRefAssignment_16422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__SimpleAttribute__ValueAssignment6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ComponentAssignment6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__MWEString__PartsAssignment_06523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_1_06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_16585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_1_26616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_2_06647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_2_16678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_2_26709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAlternatives_1_0_in_rule__Boolean__ValueAssignment_16740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__ReplaceableString__PropertyAssignment_16773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PropertyReference__PropertyAssignment6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__FileRef__FilePathAssignment_16874 = new BitSet(new long[]{0x0000000000000002L});

}