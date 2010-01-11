package org.eclipse.emf.mwe.concept.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
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
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g"; }


     
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:60:1: entryRuleMWEFile : ruleMWEFile EOF ;
    public final void entryRuleMWEFile() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:61:1: ( ruleMWEFile EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:62:1: ruleMWEFile EOF
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:69:1: ruleMWEFile : ( ( rule__MWEFile__Group__0 ) ) ;
    public final void ruleMWEFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:73:2: ( ( ( rule__MWEFile__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:74:1: ( ( rule__MWEFile__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:74:1: ( ( rule__MWEFile__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:75:1: ( rule__MWEFile__Group__0 )
            {
             before(grammarAccess.getMWEFileAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:76:1: ( rule__MWEFile__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:76:2: rule__MWEFile__Group__0
            {
            pushFollow(FOLLOW_rule__MWEFile__Group__0_in_ruleMWEFile95);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:89:1: ( ruleImport EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport122);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport129); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:104:1: ( rule__Import__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport156);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:116:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:117:1: ( ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:118:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN183);
            ruleImportedFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN190); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:125:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:129:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:130:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:130:1: ( ( rule__ImportedFQN__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:131:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:132:1: ( rule__ImportedFQN__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:132:2: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN217);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:144:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:145:1: ( ruleSetting EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:146:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_ruleSetting_in_entryRuleSetting244);
            ruleSetting();
            _fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetting251); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:153:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:157:2: ( ( ( rule__Setting__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:158:1: ( ( rule__Setting__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:158:1: ( ( rule__Setting__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:159:1: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:160:1: ( rule__Setting__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:160:2: rule__Setting__Group__0
            {
            pushFollow(FOLLOW_rule__Setting__Group__0_in_ruleSetting278);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:172:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:173:1: ( ruleComponent EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:174:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent305);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent312); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:181:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:185:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:186:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:186:1: ( ( rule__Component__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:187:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:188:1: ( rule__Component__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:188:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent339);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:200:1: entryRuleComponentWithType : ruleComponentWithType EOF ;
    public final void entryRuleComponentWithType() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:201:1: ( ruleComponentWithType EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:202:1: ruleComponentWithType EOF
            {
             before(grammarAccess.getComponentWithTypeRule()); 
            pushFollow(FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType366);
            ruleComponentWithType();
            _fsp--;

             after(grammarAccess.getComponentWithTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentWithType373); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:209:1: ruleComponentWithType : ( ( rule__ComponentWithType__Group__0 ) ) ;
    public final void ruleComponentWithType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:213:2: ( ( ( rule__ComponentWithType__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:214:1: ( ( rule__ComponentWithType__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:214:1: ( ( rule__ComponentWithType__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:215:1: ( rule__ComponentWithType__Group__0 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:216:1: ( rule__ComponentWithType__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:216:2: rule__ComponentWithType__Group__0
            {
            pushFollow(FOLLOW_rule__ComponentWithType__Group__0_in_ruleComponentWithType400);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:228:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:229:1: ( ruleConfigurationElement EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:230:1: ruleConfigurationElement EOF
            {
             before(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement427);
            ruleConfigurationElement();
            _fsp--;

             after(grammarAccess.getConfigurationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement434); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:237:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:241:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:242:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:242:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:243:1: ( rule__ConfigurationElement__Alternatives )
            {
             before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:244:1: ( rule__ConfigurationElement__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:244:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement461);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:258:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:259:1: ( ruleAttributeList EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:260:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList490);
            ruleAttributeList();
            _fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList497); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:267:1: ruleAttributeList : ( ( rule__AttributeList__Alternatives ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:271:2: ( ( ( rule__AttributeList__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:272:1: ( ( rule__AttributeList__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:272:1: ( ( rule__AttributeList__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:273:1: ( rule__AttributeList__Alternatives )
            {
             before(grammarAccess.getAttributeListAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:274:1: ( rule__AttributeList__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:274:2: rule__AttributeList__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeList__Alternatives_in_ruleAttributeList524);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:286:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:287:1: ( ruleProperty EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:288:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty551);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty558); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:295:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:299:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:300:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:300:1: ( ( rule__Property__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:301:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:302:1: ( rule__Property__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:302:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty585);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:316:1: entryRuleSimpleProperty : ruleSimpleProperty EOF ;
    public final void entryRuleSimpleProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:317:1: ( ruleSimpleProperty EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:318:1: ruleSimpleProperty EOF
            {
             before(grammarAccess.getSimplePropertyRule()); 
            pushFollow(FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty614);
            ruleSimpleProperty();
            _fsp--;

             after(grammarAccess.getSimplePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProperty621); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:325:1: ruleSimpleProperty : ( ( rule__SimpleProperty__Group__0 ) ) ;
    public final void ruleSimpleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:329:2: ( ( ( rule__SimpleProperty__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:330:1: ( ( rule__SimpleProperty__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:330:1: ( ( rule__SimpleProperty__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:331:1: ( rule__SimpleProperty__Group__0 )
            {
             before(grammarAccess.getSimplePropertyAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:332:1: ( rule__SimpleProperty__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:332:2: rule__SimpleProperty__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleProperty__Group__0_in_ruleSimpleProperty648);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:344:1: entryRulePropertyFile : rulePropertyFile EOF ;
    public final void entryRulePropertyFile() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:345:1: ( rulePropertyFile EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:346:1: rulePropertyFile EOF
            {
             before(grammarAccess.getPropertyFileRule()); 
            pushFollow(FOLLOW_rulePropertyFile_in_entryRulePropertyFile675);
            rulePropertyFile();
            _fsp--;

             after(grammarAccess.getPropertyFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFile682); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:353:1: rulePropertyFile : ( ( rule__PropertyFile__Group__0 ) ) ;
    public final void rulePropertyFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:357:2: ( ( ( rule__PropertyFile__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:358:1: ( ( rule__PropertyFile__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:358:1: ( ( rule__PropertyFile__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:359:1: ( rule__PropertyFile__Group__0 )
            {
             before(grammarAccess.getPropertyFileAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:360:1: ( rule__PropertyFile__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:360:2: rule__PropertyFile__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFile__Group__0_in_rulePropertyFile709);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:372:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:373:1: ( ruleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:374:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute736);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute743); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:381:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:385:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:386:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:386:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:387:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:388:1: ( rule__Attribute__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:388:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute770);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:400:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:401:1: ( ruleSimpleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:402:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute797);
            ruleSimpleAttribute();
            _fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute804); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:409:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__ValueAssignment ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:413:2: ( ( ( rule__SimpleAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:414:1: ( ( rule__SimpleAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:414:1: ( ( rule__SimpleAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:415:1: ( rule__SimpleAttribute__ValueAssignment )
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:416:1: ( rule__SimpleAttribute__ValueAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:416:2: rule__SimpleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__ValueAssignment_in_ruleSimpleAttribute831);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:428:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:429:1: ( ruleReference EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:430:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference858);
            ruleReference();
            _fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference865); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:437:1: ruleReference : ( ( rule__Reference__ComponentAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:441:2: ( ( ( rule__Reference__ComponentAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:442:1: ( ( rule__Reference__ComponentAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:442:1: ( ( rule__Reference__ComponentAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:443:1: ( rule__Reference__ComponentAssignment )
            {
             before(grammarAccess.getReferenceAccess().getComponentAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:444:1: ( rule__Reference__ComponentAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:444:2: rule__Reference__ComponentAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ComponentAssignment_in_ruleReference892);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:456:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:457:1: ( ruleValidID EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:458:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID919);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID926); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:465:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:469:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:470:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:470:1: ( ( rule__ValidID__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:471:1: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:472:1: ( rule__ValidID__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:472:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID953);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:484:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:485:1: ( ruleFQN EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:486:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN980);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN987); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:493:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:497:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:498:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:498:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:499:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:500:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:500:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1014);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:514:1: entryRuleMWEString : ruleMWEString EOF ;
    public final void entryRuleMWEString() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:518:1: ( ruleMWEString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:519:1: ruleMWEString EOF
            {
             before(grammarAccess.getMWEStringRule()); 
            pushFollow(FOLLOW_ruleMWEString_in_entryRuleMWEString1048);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getMWEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEString1055); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:529:1: ruleMWEString : ( ( rule__MWEString__Alternatives ) ) ;
    public final void ruleMWEString() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:534:2: ( ( ( rule__MWEString__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:535:1: ( ( rule__MWEString__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:535:1: ( ( rule__MWEString__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:536:1: ( rule__MWEString__Alternatives )
            {
             before(grammarAccess.getMWEStringAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:537:1: ( rule__MWEString__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:537:2: rule__MWEString__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString1086);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:552:1: entryRuleMWEStringPart : ruleMWEStringPart EOF ;
    public final void entryRuleMWEStringPart() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:553:1: ( ruleMWEStringPart EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:554:1: ruleMWEStringPart EOF
            {
             before(grammarAccess.getMWEStringPartRule()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1115);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEStringPart1122); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:561:1: ruleMWEStringPart : ( ( rule__MWEStringPart__Alternatives ) ) ;
    public final void ruleMWEStringPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:565:2: ( ( ( rule__MWEStringPart__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:566:1: ( ( rule__MWEStringPart__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:566:1: ( ( rule__MWEStringPart__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:567:1: ( rule__MWEStringPart__Alternatives )
            {
             before(grammarAccess.getMWEStringPartAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:568:1: ( rule__MWEStringPart__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:568:2: rule__MWEStringPart__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart1149);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:580:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:581:1: ( ruleBoolean EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:582:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1176);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1183); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:589:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:593:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:594:1: ( ( rule__Boolean__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:594:1: ( ( rule__Boolean__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:595:1: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:596:1: ( rule__Boolean__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:596:2: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_rule__Boolean__Group__0_in_ruleBoolean1210);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:608:1: entryRuleReplaceableString : ruleReplaceableString EOF ;
    public final void entryRuleReplaceableString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:609:1: ( ruleReplaceableString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:610:1: ruleReplaceableString EOF
            {
             before(grammarAccess.getReplaceableStringRule()); 
            pushFollow(FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1237);
            ruleReplaceableString();
            _fsp--;

             after(grammarAccess.getReplaceableStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableString1244); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:617:1: ruleReplaceableString : ( ( rule__ReplaceableString__Group__0 ) ) ;
    public final void ruleReplaceableString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:621:2: ( ( ( rule__ReplaceableString__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:622:1: ( ( rule__ReplaceableString__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:622:1: ( ( rule__ReplaceableString__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:623:1: ( rule__ReplaceableString__Group__0 )
            {
             before(grammarAccess.getReplaceableStringAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:624:1: ( rule__ReplaceableString__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:624:2: rule__ReplaceableString__Group__0
            {
            pushFollow(FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString1271);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:636:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:640:1: ( rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:641:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference1303);
            rulePropertyReference();
            _fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference1310); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:651:1: rulePropertyReference : ( ( rule__PropertyReference__PropertyAssignment ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:656:2: ( ( ( rule__PropertyReference__PropertyAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:657:1: ( ( rule__PropertyReference__PropertyAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:657:1: ( ( rule__PropertyReference__PropertyAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:658:1: ( rule__PropertyReference__PropertyAssignment )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:659:1: ( rule__PropertyReference__PropertyAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:659:2: rule__PropertyReference__PropertyAssignment
            {
            pushFollow(FOLLOW_rule__PropertyReference__PropertyAssignment_in_rulePropertyReference1341);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:672:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:673:1: ( rulePlainString EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:674:1: rulePlainString EOF
            {
             before(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString1368);
            rulePlainString();
            _fsp--;

             after(grammarAccess.getPlainStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString1375); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:681:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:685:2: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:686:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:686:1: ( ( rule__PlainString__ValueAssignment ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:687:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:688:1: ( rule__PlainString__ValueAssignment )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:688:2: rule__PlainString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1402);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:700:1: entryRuleFileRef : ruleFileRef EOF ;
    public final void entryRuleFileRef() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:704:1: ( ruleFileRef EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:705:1: ruleFileRef EOF
            {
             before(grammarAccess.getFileRefRule()); 
            pushFollow(FOLLOW_ruleFileRef_in_entryRuleFileRef1434);
            ruleFileRef();
            _fsp--;

             after(grammarAccess.getFileRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileRef1441); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:715:1: ruleFileRef : ( ( rule__FileRef__Group__0 ) ) ;
    public final void ruleFileRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:720:2: ( ( ( rule__FileRef__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:721:1: ( ( rule__FileRef__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:721:1: ( ( rule__FileRef__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:722:1: ( rule__FileRef__Group__0 )
            {
             before(grammarAccess.getFileRefAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:723:1: ( rule__FileRef__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:723:2: rule__FileRef__Group__0
            {
            pushFollow(FOLLOW_rule__FileRef__Group__0_in_ruleFileRef1472);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:736:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:737:1: ( ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:738:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue1499);
            ruleConstantValue();
            _fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue1506); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:745:1: ruleConstantValue : ( ( rule__ConstantValue__Alternatives ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:749:2: ( ( ( rule__ConstantValue__Alternatives ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:750:1: ( ( rule__ConstantValue__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:750:1: ( ( rule__ConstantValue__Alternatives ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:751:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:752:1: ( rule__ConstantValue__Alternatives )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:752:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1533);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:764:1: entryRuleColon : ruleColon EOF ;
    public final void entryRuleColon() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:765:1: ( ruleColon EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:766:1: ruleColon EOF
            {
             before(grammarAccess.getColonRule()); 
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon1560);
            ruleColon();
            _fsp--;

             after(grammarAccess.getColonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon1567); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:773:1: ruleColon : ( ':' ) ;
    public final void ruleColon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:777:2: ( ( ':' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:778:1: ( ':' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:778:1: ( ':' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:779:1: ':'
            {
             before(grammarAccess.getColonAccess().getColonKeyword()); 
            match(input,9,FOLLOW_9_in_ruleColon1595); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:794:1: entryRuleDot : ruleDot EOF ;
    public final void entryRuleDot() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:795:1: ( ruleDot EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:796:1: ruleDot EOF
            {
             before(grammarAccess.getDotRule()); 
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot1623);
            ruleDot();
            _fsp--;

             after(grammarAccess.getDotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot1630); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:803:1: ruleDot : ( '.' ) ;
    public final void ruleDot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:807:2: ( ( '.' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:808:1: ( '.' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:808:1: ( '.' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:809:1: '.'
            {
             before(grammarAccess.getDotAccess().getFullStopKeyword()); 
            match(input,10,FOLLOW_10_in_ruleDot1658); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:824:1: entryRuleSingleQuote : ruleSingleQuote EOF ;
    public final void entryRuleSingleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:825:1: ( ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:826:1: ruleSingleQuote EOF
            {
             before(grammarAccess.getSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1686);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote1693); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:833:1: ruleSingleQuote : ( '\\'' ) ;
    public final void ruleSingleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:837:2: ( ( '\\'' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:838:1: ( '\\'' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:838:1: ( '\\'' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:839:1: '\\''
            {
             before(grammarAccess.getSingleQuoteAccess().getApostropheKeyword()); 
            match(input,11,FOLLOW_11_in_ruleSingleQuote1721); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:854:1: entryRuleEscapedSingleQuote : ruleEscapedSingleQuote EOF ;
    public final void entryRuleEscapedSingleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:858:1: ( ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:859:1: ruleEscapedSingleQuote EOF
            {
             before(grammarAccess.getEscapedSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1754);
            ruleEscapedSingleQuote();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote1761); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:869:1: ruleEscapedSingleQuote : ( ( rule__EscapedSingleQuote__Group__0 ) ) ;
    public final void ruleEscapedSingleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:874:2: ( ( ( rule__EscapedSingleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:875:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:875:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:876:1: ( rule__EscapedSingleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:877:1: ( rule__EscapedSingleQuote__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:877:2: rule__EscapedSingleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1792);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:890:1: entryRuleDoubleQuote : ruleDoubleQuote EOF ;
    public final void entryRuleDoubleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:891:1: ( ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:892:1: ruleDoubleQuote EOF
            {
             before(grammarAccess.getDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1819);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote1826); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:899:1: ruleDoubleQuote : ( '\"' ) ;
    public final void ruleDoubleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:903:2: ( ( '\"' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:904:1: ( '\"' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:904:1: ( '\"' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:905:1: '\"'
            {
             before(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword()); 
            match(input,12,FOLLOW_12_in_ruleDoubleQuote1854); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:920:1: entryRuleEscapedDoubleQuote : ruleEscapedDoubleQuote EOF ;
    public final void entryRuleEscapedDoubleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:924:1: ( ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:925:1: ruleEscapedDoubleQuote EOF
            {
             before(grammarAccess.getEscapedDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1887);
            ruleEscapedDoubleQuote();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1894); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:935:1: ruleEscapedDoubleQuote : ( ( rule__EscapedDoubleQuote__Group__0 ) ) ;
    public final void ruleEscapedDoubleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:940:2: ( ( ( rule__EscapedDoubleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:941:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:941:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:942:1: ( rule__EscapedDoubleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:943:1: ( rule__EscapedDoubleQuote__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:943:2: rule__EscapedDoubleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1925);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:956:1: entryRuleBackslash : ruleBackslash EOF ;
    public final void entryRuleBackslash() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:957:1: ( ruleBackslash EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:958:1: ruleBackslash EOF
            {
             before(grammarAccess.getBackslashRule()); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash1952);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash1959); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:965:1: ruleBackslash : ( '\\\\' ) ;
    public final void ruleBackslash() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:969:2: ( ( '\\\\' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:970:1: ( '\\\\' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:970:1: ( '\\\\' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:971:1: '\\\\'
            {
             before(grammarAccess.getBackslashAccess().getReverseSolidusKeyword()); 
            match(input,13,FOLLOW_13_in_ruleBackslash1987); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:986:1: entryRuleEscapedBackslash : ruleEscapedBackslash EOF ;
    public final void entryRuleEscapedBackslash() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:990:1: ( ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:991:1: ruleEscapedBackslash EOF
            {
             before(grammarAccess.getEscapedBackslashRule()); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash2020);
            ruleEscapedBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash2027); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1001:1: ruleEscapedBackslash : ( ( rule__EscapedBackslash__Group__0 ) ) ;
    public final void ruleEscapedBackslash() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1006:2: ( ( ( rule__EscapedBackslash__Group__0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1007:1: ( ( rule__EscapedBackslash__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1007:1: ( ( rule__EscapedBackslash__Group__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1008:1: ( rule__EscapedBackslash__Group__0 )
            {
             before(grammarAccess.getEscapedBackslashAccess().getGroup()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1009:1: ( rule__EscapedBackslash__Group__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1009:2: rule__EscapedBackslash__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash2058);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1022:1: entryRuleOpeningBrace : ruleOpeningBrace EOF ;
    public final void entryRuleOpeningBrace() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1023:1: ( ruleOpeningBrace EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1024:1: ruleOpeningBrace EOF
            {
             before(grammarAccess.getOpeningBraceRule()); 
            pushFollow(FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace2085);
            ruleOpeningBrace();
            _fsp--;

             after(grammarAccess.getOpeningBraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpeningBrace2092); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1031:1: ruleOpeningBrace : ( '{' ) ;
    public final void ruleOpeningBrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1035:2: ( ( '{' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1036:1: ( '{' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1036:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1037:1: '{'
            {
             before(grammarAccess.getOpeningBraceAccess().getLeftCurlyBracketKeyword()); 
            match(input,14,FOLLOW_14_in_ruleOpeningBrace2120); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1052:1: entryRuleClosingBrace : ruleClosingBrace EOF ;
    public final void entryRuleClosingBrace() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1053:1: ( ruleClosingBrace EOF )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1054:1: ruleClosingBrace EOF
            {
             before(grammarAccess.getClosingBraceRule()); 
            pushFollow(FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace2148);
            ruleClosingBrace();
            _fsp--;

             after(grammarAccess.getClosingBraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosingBrace2155); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1061:1: ruleClosingBrace : ( '}' ) ;
    public final void ruleClosingBrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1065:2: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1066:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1066:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1067:1: '}'
            {
             before(grammarAccess.getClosingBraceAccess().getRightCurlyBracketKeyword()); 
            match(input,15,FOLLOW_15_in_ruleClosingBrace2183); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1082:1: rule__Setting__Alternatives_1 : ( ( ( rule__Setting__Group_1_0__0 ) ) | ( ( rule__Setting__ValueAssignment_1_1 ) ) );
    public final void rule__Setting__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1086:1: ( ( ( rule__Setting__Group_1_0__0 ) ) | ( ( rule__Setting__ValueAssignment_1_1 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1087:1: ( ( rule__Setting__Group_1_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1087:1: ( ( rule__Setting__Group_1_0__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1088:1: ( rule__Setting__Group_1_0__0 )
                    {
                     before(grammarAccess.getSettingAccess().getGroup_1_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1089:1: ( rule__Setting__Group_1_0__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1089:2: rule__Setting__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Setting__Group_1_0__0_in_rule__Setting__Alternatives_12220);
                    rule__Setting__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSettingAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1093:6: ( ( rule__Setting__ValueAssignment_1_1 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1093:6: ( ( rule__Setting__ValueAssignment_1_1 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1094:1: ( rule__Setting__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getSettingAccess().getValueAssignment_1_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1095:1: ( rule__Setting__ValueAssignment_1_1 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1095:2: rule__Setting__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Setting__ValueAssignment_1_1_in_rule__Setting__Alternatives_12238);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1104:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1108:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__FileRefAssignment_1_1 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1109:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1109:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1110:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1111:1: ( rule__Component__TypeAssignment_1_0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1111:2: rule__Component__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_12271);
                    rule__Component__TypeAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1115:6: ( ( rule__Component__FileRefAssignment_1_1 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1115:6: ( ( rule__Component__FileRefAssignment_1_1 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1116:1: ( rule__Component__FileRefAssignment_1_1 )
                    {
                     before(grammarAccess.getComponentAccess().getFileRefAssignment_1_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1117:1: ( rule__Component__FileRefAssignment_1_1 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1117:2: rule__Component__FileRefAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Component__FileRefAssignment_1_1_in_rule__Component__Alternatives_12289);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1126:1: rule__Component__Alternatives_3 : ( ( ';' ) | ( ( rule__Component__Group_3_1__0 ) ) );
    public final void rule__Component__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1130:1: ( ( ';' ) | ( ( rule__Component__Group_3_1__0 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1131:1: ( ';' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1131:1: ( ';' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1132:1: ';'
                    {
                     before(grammarAccess.getComponentAccess().getSemicolonKeyword_3_0()); 
                    match(input,16,FOLLOW_16_in_rule__Component__Alternatives_32323); 
                     after(grammarAccess.getComponentAccess().getSemicolonKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1139:6: ( ( rule__Component__Group_3_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1139:6: ( ( rule__Component__Group_3_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1140:1: ( rule__Component__Group_3_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_3_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1141:1: ( rule__Component__Group_3_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1141:2: rule__Component__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_3_1__0_in_rule__Component__Alternatives_32342);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1150:1: rule__ComponentWithType__Alternatives_2 : ( ( ';' ) | ( ( rule__ComponentWithType__Group_2_1__0 ) ) );
    public final void rule__ComponentWithType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1154:1: ( ( ';' ) | ( ( rule__ComponentWithType__Group_2_1__0 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1155:1: ( ';' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1155:1: ( ';' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1156:1: ';'
                    {
                     before(grammarAccess.getComponentWithTypeAccess().getSemicolonKeyword_2_0()); 
                    match(input,16,FOLLOW_16_in_rule__ComponentWithType__Alternatives_22376); 
                     after(grammarAccess.getComponentWithTypeAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1163:6: ( ( rule__ComponentWithType__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1163:6: ( ( rule__ComponentWithType__Group_2_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1164:1: ( rule__ComponentWithType__Group_2_1__0 )
                    {
                     before(grammarAccess.getComponentWithTypeAccess().getGroup_2_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1165:1: ( rule__ComponentWithType__Group_2_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1165:2: rule__ComponentWithType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__0_in_rule__ComponentWithType__Alternatives_22395);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1174:1: rule__ConfigurationElement__Alternatives : ( ( ruleSetting ) | ( ruleProperty ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1178:1: ( ( ruleSetting ) | ( ruleProperty ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1179:1: ( ruleSetting )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1179:1: ( ruleSetting )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1180:1: ruleSetting
                    {
                     before(grammarAccess.getConfigurationElementAccess().getSettingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSetting_in_rule__ConfigurationElement__Alternatives2428);
                    ruleSetting();
                    _fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getSettingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1185:6: ( ruleProperty )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1185:6: ( ruleProperty )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1186:1: ruleProperty
                    {
                     before(grammarAccess.getConfigurationElementAccess().getPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProperty_in_rule__ConfigurationElement__Alternatives2445);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1197:1: rule__AttributeList__Alternatives : ( ( ( rule__AttributeList__Group_0__0 ) ) | ( ( rule__AttributeList__Group_1__0 ) ) );
    public final void rule__AttributeList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1201:1: ( ( ( rule__AttributeList__Group_0__0 ) ) | ( ( rule__AttributeList__Group_1__0 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1202:1: ( ( rule__AttributeList__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1202:1: ( ( rule__AttributeList__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1203:1: ( rule__AttributeList__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeListAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1204:1: ( rule__AttributeList__Group_0__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1204:2: rule__AttributeList__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Alternatives2478);
                    rule__AttributeList__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAttributeListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1208:6: ( ( rule__AttributeList__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1208:6: ( ( rule__AttributeList__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1209:1: ( rule__AttributeList__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeListAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1210:1: ( rule__AttributeList__Group_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1210:2: rule__AttributeList__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Alternatives2496);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1219:1: rule__Property__Alternatives : ( ( ruleSimpleProperty ) | ( rulePropertyFile ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1223:1: ( ( ruleSimpleProperty ) | ( rulePropertyFile ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1224:1: ( ruleSimpleProperty )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1224:1: ( ruleSimpleProperty )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1225:1: ruleSimpleProperty
                    {
                     before(grammarAccess.getPropertyAccess().getSimplePropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleProperty_in_rule__Property__Alternatives2529);
                    ruleSimpleProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getSimplePropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1230:6: ( rulePropertyFile )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1230:6: ( rulePropertyFile )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1231:1: rulePropertyFile
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyFileParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePropertyFile_in_rule__Property__Alternatives2546);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1241:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleReference ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1245:1: ( ( ruleSimpleAttribute ) | ( ruleReference ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1246:1: ( ruleSimpleAttribute )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1246:1: ( ruleSimpleAttribute )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1247:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives2578);
                    ruleSimpleAttribute();
                    _fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1252:6: ( ruleReference )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1252:6: ( ruleReference )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1253:1: ruleReference
                    {
                     before(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Attribute__Alternatives2595);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1263:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'property' ) | ( 'file' ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1267:1: ( ( RULE_ID ) | ( 'property' ) | ( 'file' ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1268:1: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1268:1: ( RULE_ID )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1269:1: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2627); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1274:6: ( 'property' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1274:6: ( 'property' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1275:1: 'property'
                    {
                     before(grammarAccess.getValidIDAccess().getPropertyKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__ValidID__Alternatives2645); 
                     after(grammarAccess.getValidIDAccess().getPropertyKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1282:6: ( 'file' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1282:6: ( 'file' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1283:1: 'file'
                    {
                     before(grammarAccess.getValidIDAccess().getFileKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__ValidID__Alternatives2665); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1295:1: rule__MWEString__Alternatives : ( ( ( rule__MWEString__PartsAssignment_0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) | ( ( rule__MWEString__Group_2__0 ) ) );
    public final void rule__MWEString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1299:1: ( ( ( rule__MWEString__PartsAssignment_0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) | ( ( rule__MWEString__Group_2__0 ) ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1300:1: ( ( rule__MWEString__PartsAssignment_0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1300:1: ( ( rule__MWEString__PartsAssignment_0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1301:1: ( rule__MWEString__PartsAssignment_0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getPartsAssignment_0()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1302:1: ( rule__MWEString__PartsAssignment_0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1302:2: rule__MWEString__PartsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_0_in_rule__MWEString__Alternatives2699);
                    rule__MWEString__PartsAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getPartsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1306:6: ( ( rule__MWEString__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1306:6: ( ( rule__MWEString__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1307:1: ( rule__MWEString__Group_1__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1308:1: ( rule__MWEString__Group_1__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1308:2: rule__MWEString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives2717);
                    rule__MWEString__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1312:6: ( ( rule__MWEString__Group_2__0 ) )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1312:6: ( ( rule__MWEString__Group_2__0 ) )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1313:1: ( rule__MWEString__Group_2__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_2()); 
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1314:1: ( rule__MWEString__Group_2__0 )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1314:2: rule__MWEString__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_2__0_in_rule__MWEString__Alternatives2735);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1323:1: rule__MWEStringPart__Alternatives : ( ( ruleReplaceableString ) | ( rulePlainString ) );
    public final void rule__MWEStringPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1327:1: ( ( ruleReplaceableString ) | ( rulePlainString ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1328:1: ( ruleReplaceableString )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1328:1: ( ruleReplaceableString )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1329:1: ruleReplaceableString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives2768);
                    ruleReplaceableString();
                    _fsp--;

                     after(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1334:6: ( rulePlainString )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1334:6: ( rulePlainString )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1335:1: rulePlainString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives2785);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1345:1: rule__Boolean__ValueAlternatives_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1349:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1350:1: ( 'true' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1350:1: ( 'true' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1351:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Boolean__ValueAlternatives_1_02818); 
                     after(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1358:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1358:6: ( 'false' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1359:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Boolean__ValueAlternatives_1_02838); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1371:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1375:1: ( ( RULE_WS ) | ( ruleColon ) | ( ruleOpeningBrace ) | ( ruleClosingBrace ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( ruleValidID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( ruleDot ) )
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
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1376:1: ( RULE_WS )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1376:1: ( RULE_WS )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1377:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives2872); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1382:6: ( ruleColon )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1382:6: ( ruleColon )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1383:1: ruleColon
                    {
                     before(grammarAccess.getConstantValueAccess().getColonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleColon_in_rule__ConstantValue__Alternatives2889);
                    ruleColon();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getColonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1388:6: ( ruleOpeningBrace )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1388:6: ( ruleOpeningBrace )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1389:1: ruleOpeningBrace
                    {
                     before(grammarAccess.getConstantValueAccess().getOpeningBraceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOpeningBrace_in_rule__ConstantValue__Alternatives2906);
                    ruleOpeningBrace();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getOpeningBraceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1394:6: ( ruleClosingBrace )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1394:6: ( ruleClosingBrace )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1395:1: ruleClosingBrace
                    {
                     before(grammarAccess.getConstantValueAccess().getClosingBraceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleClosingBrace_in_rule__ConstantValue__Alternatives2923);
                    ruleClosingBrace();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getClosingBraceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1400:6: ( ruleEscapedDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1400:6: ( ruleEscapedDoubleQuote )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1401:1: ruleEscapedDoubleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives2940);
                    ruleEscapedDoubleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1406:6: ( ruleEscapedSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1406:6: ( ruleEscapedSingleQuote )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1407:1: ruleEscapedSingleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives2957);
                    ruleEscapedSingleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1412:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1412:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1413:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives2974); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1418:6: ( ruleEscapedBackslash )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1418:6: ( ruleEscapedBackslash )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1419:1: ruleEscapedBackslash
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives2991);
                    ruleEscapedBackslash();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1424:6: ( ruleValidID )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1424:6: ( ruleValidID )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1425:1: ruleValidID
                    {
                     before(grammarAccess.getConstantValueAccess().getValidIDParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleValidID_in_rule__ConstantValue__Alternatives3008);
                    ruleValidID();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getValidIDParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1430:6: ( 'true' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1430:6: ( 'true' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1431:1: 'true'
                    {
                     before(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 
                    match(input,19,FOLLOW_19_in_rule__ConstantValue__Alternatives3026); 
                     after(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1438:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1438:6: ( 'false' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1439:1: 'false'
                    {
                     before(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 
                    match(input,20,FOLLOW_20_in_rule__ConstantValue__Alternatives3046); 
                     after(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1446:6: ( '=' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1446:6: ( '=' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1447:1: '='
                    {
                     before(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 
                    match(input,21,FOLLOW_21_in_rule__ConstantValue__Alternatives3066); 
                     after(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1454:6: ( 'import' )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1454:6: ( 'import' )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1455:1: 'import'
                    {
                     before(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 
                    match(input,22,FOLLOW_22_in_rule__ConstantValue__Alternatives3086); 
                     after(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1462:6: ( ruleDot )
                    {
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1462:6: ( ruleDot )
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1463:1: ruleDot
                    {
                     before(grammarAccess.getConstantValueAccess().getDotParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleDot_in_rule__ConstantValue__Alternatives3105);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1475:1: rule__MWEFile__Group__0 : ( () ) rule__MWEFile__Group__1 ;
    public final void rule__MWEFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1479:1: ( ( () ) rule__MWEFile__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1480:1: ( () ) rule__MWEFile__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1480:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1481:1: ()
            {
             before(grammarAccess.getMWEFileAccess().getMWEFileAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1482:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1484:1: 
            {
            }

             after(grammarAccess.getMWEFileAccess().getMWEFileAction_0()); 

            }

            pushFollow(FOLLOW_rule__MWEFile__Group__1_in_rule__MWEFile__Group__03149);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1495:1: rule__MWEFile__Group__1 : ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2 ;
    public final void rule__MWEFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1499:1: ( ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1500:1: ( ( rule__MWEFile__ImportsAssignment_1 )* ) rule__MWEFile__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1500:1: ( ( rule__MWEFile__ImportsAssignment_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1501:1: ( rule__MWEFile__ImportsAssignment_1 )*
            {
             before(grammarAccess.getMWEFileAccess().getImportsAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1502:1: ( rule__MWEFile__ImportsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1502:2: rule__MWEFile__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEFile__ImportsAssignment_1_in_rule__MWEFile__Group__13177);
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

            pushFollow(FOLLOW_rule__MWEFile__Group__2_in_rule__MWEFile__Group__13187);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1513:1: rule__MWEFile__Group__2 : ( ( rule__MWEFile__RootAssignment_2 ) ) ;
    public final void rule__MWEFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1517:1: ( ( ( rule__MWEFile__RootAssignment_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1518:1: ( ( rule__MWEFile__RootAssignment_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1518:1: ( ( rule__MWEFile__RootAssignment_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1519:1: ( rule__MWEFile__RootAssignment_2 )
            {
             before(grammarAccess.getMWEFileAccess().getRootAssignment_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1520:1: ( rule__MWEFile__RootAssignment_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1520:2: rule__MWEFile__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__MWEFile__RootAssignment_2_in_rule__MWEFile__Group__23215);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1536:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1540:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1541:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1541:1: ( 'import' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1542:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Import__Group__03256); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03266);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1556:1: rule__Import__Group__1 : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1560:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1561:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) rule__Import__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1561:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1562:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1563:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1563:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13294);
            rule__Import__ImportedNamespaceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13303);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1574:1: rule__Import__Group__2 : ( ';' ) ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1578:1: ( ( ';' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1579:1: ( ';' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1579:1: ( ';' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1580:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group__23332); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1599:1: rule__ImportedFQN__Group__0 : ( ruleFQN ) rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1603:1: ( ( ruleFQN ) rule__ImportedFQN__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1604:1: ( ruleFQN ) rule__ImportedFQN__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1604:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1605:1: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03373);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03381);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1617:1: rule__ImportedFQN__Group__1 : ( ( '.*' )? ) ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1621:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1622:1: ( ( '.*' )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1622:1: ( ( '.*' )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1623:1: ( '.*' )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1624:1: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1625:2: '.*'
                    {
                    match(input,23,FOLLOW_23_in_rule__ImportedFQN__Group__13411); 

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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1640:1: rule__Setting__Group__0 : ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1644:1: ( ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1645:1: ( ( rule__Setting__FeatureAssignment_0 ) ) rule__Setting__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1645:1: ( ( rule__Setting__FeatureAssignment_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1646:1: ( rule__Setting__FeatureAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getFeatureAssignment_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1647:1: ( rule__Setting__FeatureAssignment_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1647:2: rule__Setting__FeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Setting__FeatureAssignment_0_in_rule__Setting__Group__03452);
            rule__Setting__FeatureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSettingAccess().getFeatureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__03461);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1658:1: rule__Setting__Group__1 : ( ( rule__Setting__Alternatives_1 ) ) ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1662:1: ( ( ( rule__Setting__Alternatives_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1663:1: ( ( rule__Setting__Alternatives_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1663:1: ( ( rule__Setting__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1664:1: ( rule__Setting__Alternatives_1 )
            {
             before(grammarAccess.getSettingAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1665:1: ( rule__Setting__Alternatives_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1665:2: rule__Setting__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Setting__Alternatives_1_in_rule__Setting__Group__13489);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1679:1: rule__Setting__Group_1_0__0 : ( '=' ) rule__Setting__Group_1_0__1 ;
    public final void rule__Setting__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1683:1: ( ( '=' ) rule__Setting__Group_1_0__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1684:1: ( '=' ) rule__Setting__Group_1_0__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1684:1: ( '=' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1685:1: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_1_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Setting__Group_1_0__03528); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__Setting__Group_1_0__1_in_rule__Setting__Group_1_0__03538);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1699:1: rule__Setting__Group_1_0__1 : ( ( rule__Setting__ValueAssignment_1_0_1 ) ) ;
    public final void rule__Setting__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1703:1: ( ( ( rule__Setting__ValueAssignment_1_0_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1704:1: ( ( rule__Setting__ValueAssignment_1_0_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1704:1: ( ( rule__Setting__ValueAssignment_1_0_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1705:1: ( rule__Setting__ValueAssignment_1_0_1 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_1_0_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1706:1: ( rule__Setting__ValueAssignment_1_0_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1706:2: rule__Setting__ValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Setting__ValueAssignment_1_0_1_in_rule__Setting__Group_1_0__13566);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1720:1: rule__Component__Group__0 : ( () ) rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1724:1: ( ( () ) rule__Component__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1725:1: ( () ) rule__Component__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1725:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1726:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1727:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1729:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__03614);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1740:1: rule__Component__Group__1 : ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1744:1: ( ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1745:1: ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1745:1: ( ( rule__Component__Alternatives_1 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1746:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1747:1: ( rule__Component__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=17 && LA16_0<=18)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1747:2: rule__Component__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__13642);
                    rule__Component__Alternatives_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13652);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1758:1: rule__Component__Group__2 : ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1762:1: ( ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1763:1: ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1763:1: ( ( rule__Component__Group_2__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1764:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1765:1: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1765:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__23680);
                    rule__Component__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23690);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1776:1: rule__Component__Group__3 : ( ( rule__Component__Alternatives_3 ) ) ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1780:1: ( ( ( rule__Component__Alternatives_3 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1781:1: ( ( rule__Component__Alternatives_3 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1781:1: ( ( rule__Component__Alternatives_3 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1782:1: ( rule__Component__Alternatives_3 )
            {
             before(grammarAccess.getComponentAccess().getAlternatives_3()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1783:1: ( rule__Component__Alternatives_3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1783:2: rule__Component__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Component__Alternatives_3_in_rule__Component__Group__33718);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1801:1: rule__Component__Group_2__0 : ( 'as' ) rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1805:1: ( ( 'as' ) rule__Component__Group_2__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1806:1: ( 'as' ) rule__Component__Group_2__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1806:1: ( 'as' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1807:1: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Component__Group_2__03761); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03771);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1821:1: rule__Component__Group_2__1 : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1825:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1826:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1826:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1827:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1828:1: ( rule__Component__NameAssignment_2_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1828:2: rule__Component__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13799);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1842:1: rule__Component__Group_3_1__0 : ( '{' ) rule__Component__Group_3_1__1 ;
    public final void rule__Component__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1846:1: ( ( '{' ) rule__Component__Group_3_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1847:1: ( '{' ) rule__Component__Group_3_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1847:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1848:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group_3_1__03838); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_3_1__1_in_rule__Component__Group_3_1__03848);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1862:1: rule__Component__Group_3_1__1 : ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2 ;
    public final void rule__Component__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1866:1: ( ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1867:1: ( ( rule__Component__ElementsAssignment_3_1_1 )* ) rule__Component__Group_3_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1867:1: ( ( rule__Component__ElementsAssignment_3_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1868:1: ( rule__Component__ElementsAssignment_3_1_1 )*
            {
             before(grammarAccess.getComponentAccess().getElementsAssignment_3_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1869:1: ( rule__Component__ElementsAssignment_3_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=17 && LA18_0<=18)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1869:2: rule__Component__ElementsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Component__ElementsAssignment_3_1_1_in_rule__Component__Group_3_1__13876);
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

            pushFollow(FOLLOW_rule__Component__Group_3_1__2_in_rule__Component__Group_3_1__13886);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1880:1: rule__Component__Group_3_1__2 : ( '}' ) ;
    public final void rule__Component__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1884:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1885:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1885:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1886:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_1_2()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group_3_1__23915); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1905:1: rule__ComponentWithType__Group__0 : ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1 ;
    public final void rule__ComponentWithType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1909:1: ( ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1910:1: ( ( rule__ComponentWithType__TypeAssignment_0 ) ) rule__ComponentWithType__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1910:1: ( ( rule__ComponentWithType__TypeAssignment_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1911:1: ( rule__ComponentWithType__TypeAssignment_0 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeAssignment_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1912:1: ( rule__ComponentWithType__TypeAssignment_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1912:2: rule__ComponentWithType__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ComponentWithType__TypeAssignment_0_in_rule__ComponentWithType__Group__03956);
            rule__ComponentWithType__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getComponentWithTypeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group__1_in_rule__ComponentWithType__Group__03965);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1923:1: rule__ComponentWithType__Group__1 : ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2 ;
    public final void rule__ComponentWithType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1927:1: ( ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1928:1: ( ( rule__ComponentWithType__Group_1__0 )? ) rule__ComponentWithType__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1928:1: ( ( rule__ComponentWithType__Group_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1929:1: ( rule__ComponentWithType__Group_1__0 )?
            {
             before(grammarAccess.getComponentWithTypeAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1930:1: ( rule__ComponentWithType__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1930:2: rule__ComponentWithType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ComponentWithType__Group_1__0_in_rule__ComponentWithType__Group__13993);
                    rule__ComponentWithType__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentWithTypeAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group__2_in_rule__ComponentWithType__Group__14003);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1941:1: rule__ComponentWithType__Group__2 : ( ( rule__ComponentWithType__Alternatives_2 ) ) ;
    public final void rule__ComponentWithType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1945:1: ( ( ( rule__ComponentWithType__Alternatives_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1946:1: ( ( rule__ComponentWithType__Alternatives_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1946:1: ( ( rule__ComponentWithType__Alternatives_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1947:1: ( rule__ComponentWithType__Alternatives_2 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getAlternatives_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1948:1: ( rule__ComponentWithType__Alternatives_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1948:2: rule__ComponentWithType__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ComponentWithType__Alternatives_2_in_rule__ComponentWithType__Group__24031);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1964:1: rule__ComponentWithType__Group_1__0 : ( 'as' ) rule__ComponentWithType__Group_1__1 ;
    public final void rule__ComponentWithType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1968:1: ( ( 'as' ) rule__ComponentWithType__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1969:1: ( 'as' ) rule__ComponentWithType__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1969:1: ( 'as' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1970:1: 'as'
            {
             before(grammarAccess.getComponentWithTypeAccess().getAsKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__ComponentWithType__Group_1__04072); 
             after(grammarAccess.getComponentWithTypeAccess().getAsKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group_1__1_in_rule__ComponentWithType__Group_1__04082);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1984:1: rule__ComponentWithType__Group_1__1 : ( ( rule__ComponentWithType__NameAssignment_1_1 ) ) ;
    public final void rule__ComponentWithType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1988:1: ( ( ( rule__ComponentWithType__NameAssignment_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1989:1: ( ( rule__ComponentWithType__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1989:1: ( ( rule__ComponentWithType__NameAssignment_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1990:1: ( rule__ComponentWithType__NameAssignment_1_1 )
            {
             before(grammarAccess.getComponentWithTypeAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1991:1: ( rule__ComponentWithType__NameAssignment_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:1991:2: rule__ComponentWithType__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComponentWithType__NameAssignment_1_1_in_rule__ComponentWithType__Group_1__14110);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2005:1: rule__ComponentWithType__Group_2_1__0 : ( '{' ) rule__ComponentWithType__Group_2_1__1 ;
    public final void rule__ComponentWithType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2009:1: ( ( '{' ) rule__ComponentWithType__Group_2_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2010:1: ( '{' ) rule__ComponentWithType__Group_2_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2010:1: ( '{' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2011:1: '{'
            {
             before(grammarAccess.getComponentWithTypeAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,14,FOLLOW_14_in_rule__ComponentWithType__Group_2_1__04149); 
             after(grammarAccess.getComponentWithTypeAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__1_in_rule__ComponentWithType__Group_2_1__04159);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2025:1: rule__ComponentWithType__Group_2_1__1 : ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2 ;
    public final void rule__ComponentWithType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2029:1: ( ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2030:1: ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* ) rule__ComponentWithType__Group_2_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2030:1: ( ( rule__ComponentWithType__ElementsAssignment_2_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2031:1: ( rule__ComponentWithType__ElementsAssignment_2_1_1 )*
            {
             before(grammarAccess.getComponentWithTypeAccess().getElementsAssignment_2_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2032:1: ( rule__ComponentWithType__ElementsAssignment_2_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=17 && LA20_0<=18)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2032:2: rule__ComponentWithType__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ComponentWithType__ElementsAssignment_2_1_1_in_rule__ComponentWithType__Group_2_1__14187);
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

            pushFollow(FOLLOW_rule__ComponentWithType__Group_2_1__2_in_rule__ComponentWithType__Group_2_1__14197);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2043:1: rule__ComponentWithType__Group_2_1__2 : ( '}' ) ;
    public final void rule__ComponentWithType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2047:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2048:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2048:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2049:1: '}'
            {
             before(grammarAccess.getComponentWithTypeAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,15,FOLLOW_15_in_rule__ComponentWithType__Group_2_1__24226); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2068:1: rule__AttributeList__Group_0__0 : ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1 ;
    public final void rule__AttributeList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2072:1: ( ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2073:1: ( ruleSimpleAttribute ) rule__AttributeList__Group_0__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2073:1: ( ruleSimpleAttribute )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2074:1: ruleSimpleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getSimpleAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__Group_0__04267);
            ruleSimpleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getSimpleAttributeParserRuleCall_0_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__04275);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2086:1: rule__AttributeList__Group_0__1 : ( ( rule__AttributeList__Group_0_1__0 )? ) ;
    public final void rule__AttributeList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2090:1: ( ( ( rule__AttributeList__Group_0_1__0 )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2091:1: ( ( rule__AttributeList__Group_0_1__0 )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2091:1: ( ( rule__AttributeList__Group_0_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2092:1: ( rule__AttributeList__Group_0_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2093:1: ( rule__AttributeList__Group_0_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2093:2: rule__AttributeList__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_0_1__0_in_rule__AttributeList__Group_0__14303);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2107:1: rule__AttributeList__Group_0_1__0 : ( () ) rule__AttributeList__Group_0_1__1 ;
    public final void rule__AttributeList__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2111:1: ( ( () ) rule__AttributeList__Group_0_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2112:1: ( () ) rule__AttributeList__Group_0_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2112:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2113:1: ()
            {
             before(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2114:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2116:1: 
            {
            }

             after(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0_1__1_in_rule__AttributeList__Group_0_1__04352);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2127:1: rule__AttributeList__Group_0_1__1 : ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) ) ;
    public final void rule__AttributeList__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2131:1: ( ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2132:1: ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2132:1: ( ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2133:1: ( ( rule__AttributeList__Group_0_1_1__0 ) ) ( ( rule__AttributeList__Group_0_1_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2133:1: ( ( rule__AttributeList__Group_0_1_1__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2134:1: ( rule__AttributeList__Group_0_1_1__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2135:1: ( rule__AttributeList__Group_0_1_1__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2135:2: rule__AttributeList__Group_0_1_1__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14382);
            rule__AttributeList__Group_0_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 

            }

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2138:1: ( ( rule__AttributeList__Group_0_1_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2139:1: ( rule__AttributeList__Group_0_1_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2140:1: ( rule__AttributeList__Group_0_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2140:2: rule__AttributeList__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14394);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2155:1: rule__AttributeList__Group_0_1_1__0 : ( ',' ) rule__AttributeList__Group_0_1_1__1 ;
    public final void rule__AttributeList__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2159:1: ( ( ',' ) rule__AttributeList__Group_0_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2160:1: ( ',' ) rule__AttributeList__Group_0_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2160:1: ( ',' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2161:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_0_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttributeList__Group_0_1_1__04436); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_0_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_0_1_1__1_in_rule__AttributeList__Group_0_1_1__04446);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2175:1: rule__AttributeList__Group_0_1_1__1 : ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) ) ;
    public final void rule__AttributeList__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2179:1: ( ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2180:1: ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2180:1: ( ( rule__AttributeList__ContentAssignment_0_1_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2181:1: ( rule__AttributeList__ContentAssignment_0_1_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getContentAssignment_0_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2182:1: ( rule__AttributeList__ContentAssignment_0_1_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2182:2: rule__AttributeList__ContentAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__AttributeList__ContentAssignment_0_1_1_1_in_rule__AttributeList__Group_0_1_1__14474);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2196:1: rule__AttributeList__Group_1__0 : ( ruleReference ) rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2200:1: ( ( ruleReference ) rule__AttributeList__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2201:1: ( ruleReference ) rule__AttributeList__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2201:1: ( ruleReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2202:1: ruleReference
            {
             before(grammarAccess.getAttributeListAccess().getReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__AttributeList__Group_1__04512);
            ruleReference();
            _fsp--;

             after(grammarAccess.getAttributeListAccess().getReferenceParserRuleCall_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__04520);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2214:1: rule__AttributeList__Group_1__1 : ( ( rule__AttributeList__Group_1_1__0 )? ) ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2218:1: ( ( ( rule__AttributeList__Group_1_1__0 )? ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2219:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2219:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2220:1: ( rule__AttributeList__Group_1_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2221:1: ( rule__AttributeList__Group_1_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2221:2: rule__AttributeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__14548);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2235:1: rule__AttributeList__Group_1_1__0 : ( () ) rule__AttributeList__Group_1_1__1 ;
    public final void rule__AttributeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2239:1: ( ( () ) rule__AttributeList__Group_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2240:1: ( () ) rule__AttributeList__Group_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2240:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2241:1: ()
            {
             before(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2242:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2244:1: 
            {
            }

             after(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__04597);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2255:1: rule__AttributeList__Group_1_1__1 : ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) ) ;
    public final void rule__AttributeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2259:1: ( ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2260:1: ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2260:1: ( ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2261:1: ( ( rule__AttributeList__Group_1_1_1__0 ) ) ( ( rule__AttributeList__Group_1_1_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2261:1: ( ( rule__AttributeList__Group_1_1_1__0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2262:1: ( rule__AttributeList__Group_1_1_1__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2263:1: ( rule__AttributeList__Group_1_1_1__0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2263:2: rule__AttributeList__Group_1_1_1__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14627);
            rule__AttributeList__Group_1_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 

            }

            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2266:1: ( ( rule__AttributeList__Group_1_1_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2267:1: ( rule__AttributeList__Group_1_1_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2268:1: ( rule__AttributeList__Group_1_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2268:2: rule__AttributeList__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14639);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2283:1: rule__AttributeList__Group_1_1_1__0 : ( ',' ) rule__AttributeList__Group_1_1_1__1 ;
    public final void rule__AttributeList__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2287:1: ( ( ',' ) rule__AttributeList__Group_1_1_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2288:1: ( ',' ) rule__AttributeList__Group_1_1_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2288:1: ( ',' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2289:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_1_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AttributeList__Group_1_1_1__04681); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_1_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1_1__1_in_rule__AttributeList__Group_1_1_1__04691);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2303:1: rule__AttributeList__Group_1_1_1__1 : ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) ) ;
    public final void rule__AttributeList__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2307:1: ( ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2308:1: ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2308:1: ( ( rule__AttributeList__ContentAssignment_1_1_1_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2309:1: ( rule__AttributeList__ContentAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getContentAssignment_1_1_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2310:1: ( rule__AttributeList__ContentAssignment_1_1_1_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2310:2: rule__AttributeList__ContentAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__AttributeList__ContentAssignment_1_1_1_1_in_rule__AttributeList__Group_1_1_1__14719);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2324:1: rule__SimpleProperty__Group__0 : ( 'property' ) rule__SimpleProperty__Group__1 ;
    public final void rule__SimpleProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2328:1: ( ( 'property' ) rule__SimpleProperty__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2329:1: ( 'property' ) rule__SimpleProperty__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2329:1: ( 'property' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2330:1: 'property'
            {
             before(grammarAccess.getSimplePropertyAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SimpleProperty__Group__04758); 
             after(grammarAccess.getSimplePropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__1_in_rule__SimpleProperty__Group__04768);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2344:1: rule__SimpleProperty__Group__1 : ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2 ;
    public final void rule__SimpleProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2348:1: ( ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2349:1: ( ( rule__SimpleProperty__NameAssignment_1 ) ) rule__SimpleProperty__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2349:1: ( ( rule__SimpleProperty__NameAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2350:1: ( rule__SimpleProperty__NameAssignment_1 )
            {
             before(grammarAccess.getSimplePropertyAccess().getNameAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2351:1: ( rule__SimpleProperty__NameAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2351:2: rule__SimpleProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleProperty__NameAssignment_1_in_rule__SimpleProperty__Group__14796);
            rule__SimpleProperty__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__2_in_rule__SimpleProperty__Group__14805);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2362:1: rule__SimpleProperty__Group__2 : ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3 ;
    public final void rule__SimpleProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2366:1: ( ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2367:1: ( ( rule__SimpleProperty__DelimiterAssignment_2 ) ) rule__SimpleProperty__Group__3
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2367:1: ( ( rule__SimpleProperty__DelimiterAssignment_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2368:1: ( rule__SimpleProperty__DelimiterAssignment_2 )
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterAssignment_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2369:1: ( rule__SimpleProperty__DelimiterAssignment_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2369:2: rule__SimpleProperty__DelimiterAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleProperty__DelimiterAssignment_2_in_rule__SimpleProperty__Group__24833);
            rule__SimpleProperty__DelimiterAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSimplePropertyAccess().getDelimiterAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__SimpleProperty__Group__3_in_rule__SimpleProperty__Group__24842);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2380:1: rule__SimpleProperty__Group__3 : ( ( rule__SimpleProperty__ValueAssignment_3 ) ) ;
    public final void rule__SimpleProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2384:1: ( ( ( rule__SimpleProperty__ValueAssignment_3 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2385:1: ( ( rule__SimpleProperty__ValueAssignment_3 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2385:1: ( ( rule__SimpleProperty__ValueAssignment_3 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2386:1: ( rule__SimpleProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getSimplePropertyAccess().getValueAssignment_3()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2387:1: ( rule__SimpleProperty__ValueAssignment_3 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2387:2: rule__SimpleProperty__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleProperty__ValueAssignment_3_in_rule__SimpleProperty__Group__34870);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2405:1: rule__PropertyFile__Group__0 : ( 'property' ) rule__PropertyFile__Group__1 ;
    public final void rule__PropertyFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2409:1: ( ( 'property' ) rule__PropertyFile__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2410:1: ( 'property' ) rule__PropertyFile__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2410:1: ( 'property' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2411:1: 'property'
            {
             before(grammarAccess.getPropertyFileAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PropertyFile__Group__04913); 
             after(grammarAccess.getPropertyFileAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PropertyFile__Group__1_in_rule__PropertyFile__Group__04923);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2425:1: rule__PropertyFile__Group__1 : ( ( rule__PropertyFile__FileRefAssignment_1 ) ) ;
    public final void rule__PropertyFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2429:1: ( ( ( rule__PropertyFile__FileRefAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2430:1: ( ( rule__PropertyFile__FileRefAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2430:1: ( ( rule__PropertyFile__FileRefAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2431:1: ( rule__PropertyFile__FileRefAssignment_1 )
            {
             before(grammarAccess.getPropertyFileAccess().getFileRefAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2432:1: ( rule__PropertyFile__FileRefAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2432:2: rule__PropertyFile__FileRefAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyFile__FileRefAssignment_1_in_rule__PropertyFile__Group__14951);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2446:1: rule__FQN__Group__0 : ( ruleValidID ) rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2450:1: ( ( ruleValidID ) rule__FQN__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2451:1: ( ruleValidID ) rule__FQN__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2451:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2452:1: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__FQN__Group__04989);
            ruleValidID();
            _fsp--;

             after(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04997);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2464:1: rule__FQN__Group__1 : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2468:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2469:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2469:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2470:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2471:1: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==10) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2471:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__15025);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2485:1: rule__FQN__Group_1__0 : ( '.' ) rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2489:1: ( ( '.' ) rule__FQN__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2490:1: ( '.' ) rule__FQN__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2490:1: ( '.' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2491:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,10,FOLLOW_10_in_rule__FQN__Group_1__05065); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05075);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2505:1: rule__FQN__Group_1__1 : ( ruleValidID ) ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2509:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2510:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2510:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2511:1: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__FQN__Group_1__15103);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2526:1: rule__MWEString__Group_1__0 : ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 ;
    public final void rule__MWEString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2530:1: ( ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2531:1: ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2531:1: ( ( rule__MWEString__BeginAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2532:1: ( rule__MWEString__BeginAssignment_1_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2533:1: ( rule__MWEString__BeginAssignment_1_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2533:2: rule__MWEString__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__05140);
            rule__MWEString__BeginAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__05149);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2544:1: rule__MWEString__Group_1__1 : ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 ;
    public final void rule__MWEString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2548:1: ( ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2549:1: ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2549:1: ( ( rule__MWEString__PartsAssignment_1_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2550:1: ( rule__MWEString__PartsAssignment_1_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_1_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2551:1: ( rule__MWEString__PartsAssignment_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_ANY_OTHER)||(LA26_0>=9 && LA26_0<=10)||(LA26_0>=13 && LA26_0<=15)||(LA26_0>=17 && LA26_0<=22)||LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2551:2: rule__MWEString__PartsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__15177);
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

            pushFollow(FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__15187);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2562:1: rule__MWEString__Group_1__2 : ( ( rule__MWEString__EndAssignment_1_2 ) ) ;
    public final void rule__MWEString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2566:1: ( ( ( rule__MWEString__EndAssignment_1_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2567:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2567:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2568:1: ( rule__MWEString__EndAssignment_1_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_1_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2569:1: ( rule__MWEString__EndAssignment_1_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2569:2: rule__MWEString__EndAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__25215);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2585:1: rule__MWEString__Group_2__0 : ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1 ;
    public final void rule__MWEString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2589:1: ( ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2590:1: ( ( rule__MWEString__BeginAssignment_2_0 ) ) rule__MWEString__Group_2__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2590:1: ( ( rule__MWEString__BeginAssignment_2_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2591:1: ( rule__MWEString__BeginAssignment_2_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_2_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2592:1: ( rule__MWEString__BeginAssignment_2_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2592:2: rule__MWEString__BeginAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_2_0_in_rule__MWEString__Group_2__05255);
            rule__MWEString__BeginAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_2__1_in_rule__MWEString__Group_2__05264);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2603:1: rule__MWEString__Group_2__1 : ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2 ;
    public final void rule__MWEString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2607:1: ( ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2608:1: ( ( rule__MWEString__PartsAssignment_2_1 )* ) rule__MWEString__Group_2__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2608:1: ( ( rule__MWEString__PartsAssignment_2_1 )* )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2609:1: ( rule__MWEString__PartsAssignment_2_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_2_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2610:1: ( rule__MWEString__PartsAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_ANY_OTHER)||(LA27_0>=9 && LA27_0<=10)||(LA27_0>=13 && LA27_0<=15)||(LA27_0>=17 && LA27_0<=22)||LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2610:2: rule__MWEString__PartsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_2_1_in_rule__MWEString__Group_2__15292);
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

            pushFollow(FOLLOW_rule__MWEString__Group_2__2_in_rule__MWEString__Group_2__15302);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2621:1: rule__MWEString__Group_2__2 : ( ( rule__MWEString__EndAssignment_2_2 ) ) ;
    public final void rule__MWEString__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2625:1: ( ( ( rule__MWEString__EndAssignment_2_2 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2626:1: ( ( rule__MWEString__EndAssignment_2_2 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2626:1: ( ( rule__MWEString__EndAssignment_2_2 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2627:1: ( rule__MWEString__EndAssignment_2_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_2_2()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2628:1: ( rule__MWEString__EndAssignment_2_2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2628:2: rule__MWEString__EndAssignment_2_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_2_2_in_rule__MWEString__Group_2__25330);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2644:1: rule__Boolean__Group__0 : ( () ) rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2648:1: ( ( () ) rule__Boolean__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2649:1: ( () ) rule__Boolean__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2649:1: ( () )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2650:1: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2651:1: ()
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2653:1: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0()); 

            }

            pushFollow(FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__05380);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2664:1: rule__Boolean__Group__1 : ( ( rule__Boolean__ValueAssignment_1 ) ) ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2668:1: ( ( ( rule__Boolean__ValueAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2669:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2669:1: ( ( rule__Boolean__ValueAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2670:1: ( rule__Boolean__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2671:1: ( rule__Boolean__ValueAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2671:2: rule__Boolean__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Group__15408);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2685:1: rule__ReplaceableString__Group__0 : ( '${' ) rule__ReplaceableString__Group__1 ;
    public final void rule__ReplaceableString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2689:1: ( ( '${' ) rule__ReplaceableString__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2690:1: ( '${' ) rule__ReplaceableString__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2690:1: ( '${' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2691:1: '${'
            {
             before(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ReplaceableString__Group__05447); 
             after(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__05457);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2705:1: rule__ReplaceableString__Group__1 : ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 ;
    public final void rule__ReplaceableString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2709:1: ( ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2710:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2710:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2711:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2712:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2712:2: rule__ReplaceableString__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__15485);
            rule__ReplaceableString__PropertyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__15494);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2723:1: rule__ReplaceableString__Group__2 : ( '}' ) ;
    public final void rule__ReplaceableString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2727:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2728:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2728:1: ( '}' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2729:1: '}'
            {
             before(grammarAccess.getReplaceableStringAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ReplaceableString__Group__25523); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2748:1: rule__FileRef__Group__0 : ( 'file' ) rule__FileRef__Group__1 ;
    public final void rule__FileRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2752:1: ( ( 'file' ) rule__FileRef__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2753:1: ( 'file' ) rule__FileRef__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2753:1: ( 'file' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2754:1: 'file'
            {
             before(grammarAccess.getFileRefAccess().getFileKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FileRef__Group__05565); 
             after(grammarAccess.getFileRefAccess().getFileKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FileRef__Group__1_in_rule__FileRef__Group__05575);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2768:1: rule__FileRef__Group__1 : ( ( rule__FileRef__FilePathAssignment_1 ) ) ;
    public final void rule__FileRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2772:1: ( ( ( rule__FileRef__FilePathAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2773:1: ( ( rule__FileRef__FilePathAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2773:1: ( ( rule__FileRef__FilePathAssignment_1 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2774:1: ( rule__FileRef__FilePathAssignment_1 )
            {
             before(grammarAccess.getFileRefAccess().getFilePathAssignment_1()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2775:1: ( rule__FileRef__FilePathAssignment_1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2775:2: rule__FileRef__FilePathAssignment_1
            {
            pushFollow(FOLLOW_rule__FileRef__FilePathAssignment_1_in_rule__FileRef__Group__15603);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2789:1: rule__EscapedSingleQuote__Group__0 : ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 ;
    public final void rule__EscapedSingleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2793:1: ( ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2794:1: ( ruleBackslash ) rule__EscapedSingleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2794:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2795:1: ruleBackslash
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__05641);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__05649);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2807:1: rule__EscapedSingleQuote__Group__1 : ( ruleSingleQuote ) ;
    public final void rule__EscapedSingleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2811:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2812:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2812:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2813:1: ruleSingleQuote
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__15677);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2828:1: rule__EscapedDoubleQuote__Group__0 : ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 ;
    public final void rule__EscapedDoubleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2832:1: ( ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2833:1: ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2833:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2834:1: ruleBackslash
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__05714);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__05722);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2846:1: rule__EscapedDoubleQuote__Group__1 : ( ruleDoubleQuote ) ;
    public final void rule__EscapedDoubleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2850:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2851:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2851:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2852:1: ruleDoubleQuote
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__15750);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2867:1: rule__EscapedBackslash__Group__0 : ( ruleBackslash ) rule__EscapedBackslash__Group__1 ;
    public final void rule__EscapedBackslash__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2871:1: ( ( ruleBackslash ) rule__EscapedBackslash__Group__1 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2872:1: ( ruleBackslash ) rule__EscapedBackslash__Group__1
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2872:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2873:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__05787);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__05795);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2885:1: rule__EscapedBackslash__Group__1 : ( ruleBackslash ) ;
    public final void rule__EscapedBackslash__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2889:1: ( ( ruleBackslash ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2890:1: ( ruleBackslash )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2890:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2891:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__15823);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2906:1: rule__MWEFile__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__MWEFile__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2910:1: ( ( ruleImport ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2911:1: ( ruleImport )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2911:1: ( ruleImport )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2912:1: ruleImport
            {
             before(grammarAccess.getMWEFileAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__MWEFile__ImportsAssignment_15860);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2921:1: rule__MWEFile__RootAssignment_2 : ( ruleComponentWithType ) ;
    public final void rule__MWEFile__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2925:1: ( ( ruleComponentWithType ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2926:1: ( ruleComponentWithType )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2926:1: ( ruleComponentWithType )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2927:1: ruleComponentWithType
            {
             before(grammarAccess.getMWEFileAccess().getRootComponentWithTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComponentWithType_in_rule__MWEFile__RootAssignment_25891);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2936:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2940:1: ( ( ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2941:1: ( ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2941:1: ( ruleImportedFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2942:1: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_15922);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2951:1: rule__Setting__FeatureAssignment_0 : ( ( ruleValidID ) ) ;
    public final void rule__Setting__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2955:1: ( ( ( ruleValidID ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2956:1: ( ( ruleValidID ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2956:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2957:1: ( ruleValidID )
            {
             before(grammarAccess.getSettingAccess().getFeatureOperationCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2958:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2959:1: ruleValidID
            {
             before(grammarAccess.getSettingAccess().getFeatureOperationValidIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Setting__FeatureAssignment_05957);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2970:1: rule__Setting__ValueAssignment_1_0_1 : ( ruleAttributeList ) ;
    public final void rule__Setting__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2974:1: ( ( ruleAttributeList ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2975:1: ( ruleAttributeList )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2975:1: ( ruleAttributeList )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2976:1: ruleAttributeList
            {
             before(grammarAccess.getSettingAccess().getValueAttributeListParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__Setting__ValueAssignment_1_0_15992);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2985:1: rule__Setting__ValueAssignment_1_1 : ( ruleComponent ) ;
    public final void rule__Setting__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2989:1: ( ( ruleComponent ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2990:1: ( ruleComponent )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2990:1: ( ruleComponent )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:2991:1: ruleComponent
            {
             before(grammarAccess.getSettingAccess().getValueComponentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Setting__ValueAssignment_1_16023);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3000:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3004:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3005:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3005:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3006:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3007:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3008:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getTypeTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_06058);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3019:1: rule__Component__FileRefAssignment_1_1 : ( ruleFileRef ) ;
    public final void rule__Component__FileRefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3023:1: ( ( ruleFileRef ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3024:1: ( ruleFileRef )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3024:1: ( ruleFileRef )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3025:1: ruleFileRef
            {
             before(grammarAccess.getComponentAccess().getFileRefFileRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFileRef_in_rule__Component__FileRefAssignment_1_16093);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3034:1: rule__Component__NameAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3038:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3039:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3039:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3040:1: ruleValidID
            {
             before(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__Component__NameAssignment_2_16124);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3049:1: rule__Component__ElementsAssignment_3_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__Component__ElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3053:1: ( ( ruleConfigurationElement ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3054:1: ( ruleConfigurationElement )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3054:1: ( ruleConfigurationElement )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3055:1: ruleConfigurationElement
            {
             before(grammarAccess.getComponentAccess().getElementsConfigurationElementParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Component__ElementsAssignment_3_1_16155);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3064:1: rule__ComponentWithType__TypeAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentWithType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3068:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3069:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3069:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3070:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3071:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3072:1: ruleFQN
            {
             before(grammarAccess.getComponentWithTypeAccess().getTypeTypeFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ComponentWithType__TypeAssignment_06190);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3083:1: rule__ComponentWithType__NameAssignment_1_1 : ( ruleValidID ) ;
    public final void rule__ComponentWithType__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3087:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3088:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3088:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3089:1: ruleValidID
            {
             before(grammarAccess.getComponentWithTypeAccess().getNameValidIDParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__ComponentWithType__NameAssignment_1_16225);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3098:1: rule__ComponentWithType__ElementsAssignment_2_1_1 : ( ruleConfigurationElement ) ;
    public final void rule__ComponentWithType__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3102:1: ( ( ruleConfigurationElement ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3103:1: ( ruleConfigurationElement )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3103:1: ( ruleConfigurationElement )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3104:1: ruleConfigurationElement
            {
             before(grammarAccess.getComponentWithTypeAccess().getElementsConfigurationElementParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__ComponentWithType__ElementsAssignment_2_1_16256);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3113:1: rule__AttributeList__ContentAssignment_0_1_1_1 : ( ruleSimpleAttribute ) ;
    public final void rule__AttributeList__ContentAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3117:1: ( ( ruleSimpleAttribute ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3118:1: ( ruleSimpleAttribute )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3118:1: ( ruleSimpleAttribute )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3119:1: ruleSimpleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getContentSimpleAttributeParserRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__ContentAssignment_0_1_1_16287);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3128:1: rule__AttributeList__ContentAssignment_1_1_1_1 : ( ruleReference ) ;
    public final void rule__AttributeList__ContentAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3132:1: ( ( ruleReference ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3133:1: ( ruleReference )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3133:1: ( ruleReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3134:1: ruleReference
            {
             before(grammarAccess.getAttributeListAccess().getContentReferenceParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleReference_in_rule__AttributeList__ContentAssignment_1_1_1_16318);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3143:1: rule__SimpleProperty__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__SimpleProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3147:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3148:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3148:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3149:1: ruleFQN
            {
             before(grammarAccess.getSimplePropertyAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SimpleProperty__NameAssignment_16349);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3158:1: rule__SimpleProperty__DelimiterAssignment_2 : ( ( '=' ) ) ;
    public final void rule__SimpleProperty__DelimiterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3162:1: ( ( ( '=' ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3163:1: ( ( '=' ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3163:1: ( ( '=' ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3164:1: ( '=' )
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3165:1: ( '=' )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3166:1: '='
            {
             before(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SimpleProperty__DelimiterAssignment_26385); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3181:1: rule__SimpleProperty__ValueAssignment_3 : ( ruleMWEString ) ;
    public final void rule__SimpleProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3185:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3186:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3186:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3187:1: ruleMWEString
            {
             before(grammarAccess.getSimplePropertyAccess().getValueMWEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__SimpleProperty__ValueAssignment_36424);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3196:1: rule__PropertyFile__FileRefAssignment_1 : ( ruleFileRef ) ;
    public final void rule__PropertyFile__FileRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3200:1: ( ( ruleFileRef ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3201:1: ( ruleFileRef )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3201:1: ( ruleFileRef )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3202:1: ruleFileRef
            {
             before(grammarAccess.getPropertyFileAccess().getFileRefFileRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFileRef_in_rule__PropertyFile__FileRefAssignment_16455);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3211:1: rule__SimpleAttribute__ValueAssignment : ( ruleMWEString ) ;
    public final void rule__SimpleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3215:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3216:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3216:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3217:1: ruleMWEString
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueMWEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__SimpleAttribute__ValueAssignment6486);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3226:1: rule__Reference__ComponentAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ComponentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3230:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3231:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3231:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3232:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getComponentComponentCrossReference_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3233:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3234:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getComponentComponentIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ComponentAssignment6521); 
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3245:1: rule__MWEString__PartsAssignment_0 : ( ruleBoolean ) ;
    public final void rule__MWEString__PartsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3249:1: ( ( ruleBoolean ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3250:1: ( ruleBoolean )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3250:1: ( ruleBoolean )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3251:1: ruleBoolean
            {
             before(grammarAccess.getMWEStringAccess().getPartsBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__MWEString__PartsAssignment_06556);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3260:1: rule__MWEString__BeginAssignment_1_0 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3264:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3265:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3265:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3266:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_1_06587);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3275:1: rule__MWEString__PartsAssignment_1_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3279:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3280:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3280:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3281:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_16618);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3290:1: rule__MWEString__EndAssignment_1_2 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__EndAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3294:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3295:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3295:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3296:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_1_26649);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3305:1: rule__MWEString__BeginAssignment_2_0 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__BeginAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3309:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3310:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3310:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3311:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_2_06680);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3320:1: rule__MWEString__PartsAssignment_2_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3324:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3325:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3325:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3326:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_2_16711);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3335:1: rule__MWEString__EndAssignment_2_2 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__EndAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3339:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3340:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3340:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3341:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_2_26742);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3350:1: rule__Boolean__ValueAssignment_1 : ( ( rule__Boolean__ValueAlternatives_1_0 ) ) ;
    public final void rule__Boolean__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3354:1: ( ( ( rule__Boolean__ValueAlternatives_1_0 ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3355:1: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3355:1: ( ( rule__Boolean__ValueAlternatives_1_0 ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3356:1: ( rule__Boolean__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanAccess().getValueAlternatives_1_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3357:1: ( rule__Boolean__ValueAlternatives_1_0 )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3357:2: rule__Boolean__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Boolean__ValueAlternatives_1_0_in_rule__Boolean__ValueAssignment_16773);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3366:1: rule__ReplaceableString__PropertyAssignment_1 : ( rulePropertyReference ) ;
    public final void rule__ReplaceableString__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3370:1: ( ( rulePropertyReference ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3371:1: ( rulePropertyReference )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3371:1: ( rulePropertyReference )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3372:1: rulePropertyReference
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyPropertyReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertyReference_in_rule__ReplaceableString__PropertyAssignment_16806);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3381:1: rule__PropertyReference__PropertyAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReference__PropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3385:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3386:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3386:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3387:1: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryCrossReference_0()); 
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3388:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3389:1: ruleFQN
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__PropertyReference__PropertyAssignment6841);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3400:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3404:1: ( ( ruleConstantValue ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3405:1: ( ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3405:1: ( ruleConstantValue )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3406:1: ruleConstantValue
            {
             before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6876);
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
    // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3415:1: rule__FileRef__FilePathAssignment_1 : ( ruleMWEString ) ;
    public final void rule__FileRef__FilePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3419:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3420:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3420:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe.concept.ui/src-gen/org/eclipse/emf/mwe/concept/contentassist/antlr/internal/InternalMWEConcept.g:3421:1: ruleMWEString
            {
             before(grammarAccess.getFileRefAccess().getFilePathMWEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__FileRef__FilePathAssignment_16907);
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
    public static final BitSet FOLLOW_rule__MWEFile__Group__0_in_ruleMWEFile95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetting251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Group__0_in_ruleSetting278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentWithType373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__0_in_ruleComponentWithType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Alternatives_in_ruleAttributeList524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProperty621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__0_in_ruleSimpleProperty648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_entryRulePropertyFile675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFile682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFile__Group__0_in_rulePropertyFile709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__ValueAssignment_in_ruleSimpleAttribute831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ComponentAssignment_in_ruleReference892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_entryRuleMWEString1048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEString1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEStringPart1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__0_in_ruleBoolean1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableString1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyReference__PropertyAssignment_in_rulePropertyReference1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_entryRuleFileRef1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileRef1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileRef__Group__0_in_ruleFileRef1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleColon1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDot1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSingleQuote1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDoubleQuote1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBackslash1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpeningBrace2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpeningBrace2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosingBrace2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClosingBrace2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Group_1_0__0_in_rule__Setting__Alternatives_12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__ValueAssignment_1_1_in_rule__Setting__Alternatives_12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__FileRefAssignment_1_1_in_rule__Component__Alternatives_12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Alternatives_32323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__0_in_rule__Component__Alternatives_32342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComponentWithType__Alternatives_22376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__0_in_rule__ComponentWithType__Alternatives_22395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_rule__ConfigurationElement__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__ConfigurationElement__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Alternatives2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_rule__Property__Alternatives2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_rule__Property__Alternatives2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__Alternatives2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValidID__Alternatives2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValidID__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_0_in_rule__MWEString__Alternatives2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__0_in_rule__MWEString__Alternatives2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Boolean__ValueAlternatives_1_02818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Boolean__ValueAlternatives_1_02838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_rule__ConstantValue__Alternatives2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_rule__ConstantValue__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_rule__ConstantValue__Alternatives2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ConstantValue__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstantValue__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstantValue__Alternatives3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConstantValue__Alternatives3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConstantValue__Alternatives3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_rule__ConstantValue__Alternatives3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__Group__1_in_rule__MWEFile__Group__03149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__ImportsAssignment_1_in_rule__MWEFile__Group__13177 = new BitSet(new long[]{0x0000000000460010L});
    public static final BitSet FOLLOW_rule__MWEFile__Group__2_in_rule__MWEFile__Group__13187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEFile__RootAssignment_2_in_rule__MWEFile__Group__23215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Import__Group__03256 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13294 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__23332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03373 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ImportedFQN__Group__13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__FeatureAssignment_0_in_rule__Setting__Group__03452 = new BitSet(new long[]{0x0000000001274010L});
    public static final BitSet FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__Alternatives_1_in_rule__Setting__Group__13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Setting__Group_1_0__03528 = new BitSet(new long[]{0x0000000000181810L});
    public static final BitSet FOLLOW_rule__Setting__Group_1_0__1_in_rule__Setting__Group_1_0__03538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Setting__ValueAssignment_1_0_1_in_rule__Setting__Group_1_0__13566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__13642 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__13652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__23680 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_3_in_rule__Component__Group__33718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Component__Group_2__03761 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group_3_1__03838 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__1_in_rule__Component__Group_3_1__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ElementsAssignment_3_1_1_in_rule__Component__Group_3_1__13876 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__Component__Group_3_1__2_in_rule__Component__Group_3_1__13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group_3_1__23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__TypeAssignment_0_in_rule__ComponentWithType__Group__03956 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__1_in_rule__ComponentWithType__Group__03965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_1__0_in_rule__ComponentWithType__Group__13993 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group__2_in_rule__ComponentWithType__Group__14003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Alternatives_2_in_rule__ComponentWithType__Group__24031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComponentWithType__Group_1__04072 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_1__1_in_rule__ComponentWithType__Group_1__04082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__NameAssignment_1_1_in_rule__ComponentWithType__Group_1__14110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComponentWithType__Group_2_1__04149 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__1_in_rule__ComponentWithType__Group_2_1__04159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComponentWithType__ElementsAssignment_2_1_1_in_rule__ComponentWithType__Group_2_1__14187 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_rule__ComponentWithType__Group_2_1__2_in_rule__ComponentWithType__Group_2_1__14197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComponentWithType__Group_2_1__24226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__Group_0__04267 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__04275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1__0_in_rule__AttributeList__Group_0__14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1__1_in_rule__AttributeList__Group_0_1__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14382 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__0_in_rule__AttributeList__Group_0_1__14394 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeList__Group_0_1_1__04436 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0_1_1__1_in_rule__AttributeList__Group_0_1_1__04446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__ContentAssignment_0_1_1_1_in_rule__AttributeList__Group_0_1_1__14474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__AttributeList__Group_1__04512 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__04520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__04597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14627 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__0_in_rule__AttributeList__Group_1_1__14639 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeList__Group_1_1_1__04681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1_1__1_in_rule__AttributeList__Group_1_1_1__04691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__ContentAssignment_1_1_1_1_in_rule__AttributeList__Group_1_1_1__14719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleProperty__Group__04758 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__1_in_rule__SimpleProperty__Group__04768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__NameAssignment_1_in_rule__SimpleProperty__Group__14796 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__2_in_rule__SimpleProperty__Group__14805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__DelimiterAssignment_2_in_rule__SimpleProperty__Group__24833 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__SimpleProperty__Group__3_in_rule__SimpleProperty__Group__24842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProperty__ValueAssignment_3_in_rule__SimpleProperty__Group__34870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PropertyFile__Group__04913 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PropertyFile__Group__1_in_rule__PropertyFile__Group__04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFile__FileRefAssignment_1_in_rule__PropertyFile__Group__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__FQN__Group__04989 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__15025 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rule__FQN__Group_1__05065 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__05075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__FQN__Group_1__15103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__05140 = new BitSet(new long[]{0x00000000047EEE70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__05149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__15177 = new BitSet(new long[]{0x00000000047EEE70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__25215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_2_0_in_rule__MWEString__Group_2__05255 = new BitSet(new long[]{0x00000000047EF670L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__1_in_rule__MWEString__Group_2__05264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_2_1_in_rule__MWEString__Group_2__15292 = new BitSet(new long[]{0x00000000047EF670L});
    public static final BitSet FOLLOW_rule__MWEString__Group_2__2_in_rule__MWEString__Group_2__15302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_2_2_in_rule__MWEString__Group_2__25330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Group__1_in_rule__Boolean__Group__05380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_1_in_rule__Boolean__Group__15408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReplaceableString__Group__05447 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__05457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__15485 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__15494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReplaceableString__Group__25523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FileRef__Group__05565 = new BitSet(new long[]{0x0000000000181800L});
    public static final BitSet FOLLOW_rule__FileRef__Group__1_in_rule__FileRef__Group__05575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileRef__FilePathAssignment_1_in_rule__FileRef__Group__15603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__05641 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__05649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__15677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__05714 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__05722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__15750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__05787 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__05795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__15823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__MWEFile__ImportsAssignment_15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_rule__MWEFile__RootAssignment_25891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_15922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Setting__FeatureAssignment_05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__Setting__ValueAssignment_1_0_15992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Setting__ValueAssignment_1_16023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_06058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_rule__Component__FileRefAssignment_1_16093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Component__NameAssignment_2_16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Component__ElementsAssignment_3_1_16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ComponentWithType__TypeAssignment_06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ComponentWithType__NameAssignment_1_16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__ComponentWithType__ElementsAssignment_2_1_16256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__AttributeList__ContentAssignment_0_1_1_16287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__AttributeList__ContentAssignment_1_1_1_16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SimpleProperty__NameAssignment_16349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleProperty__DelimiterAssignment_26385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__SimpleProperty__ValueAssignment_36424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_rule__PropertyFile__FileRefAssignment_16455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__SimpleAttribute__ValueAssignment6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ComponentAssignment6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__MWEString__PartsAssignment_06556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_1_06587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_16618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_1_26649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_2_06680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_2_16711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_2_26742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAlternatives_1_0_in_rule__Boolean__ValueAssignment_16773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_rule__ReplaceableString__PropertyAssignment_16806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PropertyReference__PropertyAssignment6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__FileRef__FilePathAssignment_16907 = new BitSet(new long[]{0x0000000000000002L});

}