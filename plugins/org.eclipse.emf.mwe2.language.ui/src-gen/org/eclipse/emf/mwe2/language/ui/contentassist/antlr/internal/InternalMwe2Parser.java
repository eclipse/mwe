package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal; 

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
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMwe2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'\\''", "'\"'", "'\\\\'", "'false'", "':'", "'{'", "'}'", "'true'", "'='", "'import'", "'module'", "'.'", "';'", "'property'", "'@'", "'as'", "'.*'", "'${'", "'auto-inject'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=6;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_SL_COMMENT=8;

        public InternalMwe2Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g"; }


     
     	private Mwe2GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModule
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:61:1: ( ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();
            _fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

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
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:76:1: ( rule__Module__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:76:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:90:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:91:1: ( ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:92:1: ruleDeclaredProperty EOF
            {
             before(grammarAccess.getDeclaredPropertyRule()); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty123);
            ruleDeclaredProperty();
            _fsp--;

             after(grammarAccess.getDeclaredPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredProperty130); 

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
    // $ANTLR end entryRuleDeclaredProperty


    // $ANTLR start ruleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:99:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:103:2: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:104:1: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:104:1: ( ( rule__DeclaredProperty__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:105:1: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:106:1: ( rule__DeclaredProperty__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:106:2: rule__DeclaredProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__Group__0_in_ruleDeclaredProperty156);
            rule__DeclaredProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDeclaredProperty


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:118:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:119:1: ( ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:120:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent183);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent190); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:127:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:131:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:132:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:132:1: ( ( rule__Component__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:133:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:134:1: ( rule__Component__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:134:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent216);
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


    // $ANTLR start entryRuleImport
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:146:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:147:1: ( ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:148:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport243);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport250); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:155:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:159:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:160:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:160:1: ( ( rule__Import__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:161:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:162:1: ( rule__Import__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:162:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport276);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:174:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:175:1: ( ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:176:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN303);
            ruleImportedFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN310); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:183:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:187:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:188:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:188:1: ( ( rule__ImportedFQN__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:189:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:190:1: ( rule__ImportedFQN__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:190:2: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN336);
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


    // $ANTLR start entryRuleAssignment
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:202:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:203:1: ( ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:204:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment363);
            ruleAssignment();
            _fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment370); 

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:211:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:215:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:216:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:216:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:217:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:218:1: ( rule__Assignment__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:218:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment396);
            rule__Assignment__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleValue
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:230:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:231:1: ( ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:232:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue423);
            ruleValue();
            _fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue430); 

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
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:239:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:243:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:244:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:244:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:245:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:246:1: ( rule__Value__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:246:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue456);
            rule__Value__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:258:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:259:1: ( ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:260:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral483);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral490); 

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
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:267:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:271:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:272:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:272:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:273:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:274:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:274:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral516);
            rule__StringLiteral__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:286:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:287:1: ( ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:288:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral543);
            ruleBooleanLiteral();
            _fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral550); 

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
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:295:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:299:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:300:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:300:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:301:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:302:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:302:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral576);
            rule__BooleanLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

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
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleReference
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:314:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:315:1: ( ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:316:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference603);
            ruleReference();
            _fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference610); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:323:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:327:2: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:328:1: ( ( rule__Reference__ReferableAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:328:1: ( ( rule__Reference__ReferableAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:329:1: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:330:1: ( rule__Reference__ReferableAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:330:2: rule__Reference__ReferableAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ReferableAssignment_in_ruleReference636);
            rule__Reference__ReferableAssignment();
            _fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferableAssignment()); 

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


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:342:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:343:1: ( ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:344:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN663);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN670); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:351:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:355:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:356:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:356:1: ( ( rule__FQN__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:357:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:358:1: ( rule__FQN__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:358:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN696);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:370:1: entryRuleMWEString : ruleMWEString EOF ;
    public final void entryRuleMWEString() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:374:1: ( ruleMWEString EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:375:1: ruleMWEString EOF
            {
             before(grammarAccess.getMWEStringRule()); 
            pushFollow(FOLLOW_ruleMWEString_in_entryRuleMWEString728);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getMWEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEString735); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:385:1: ruleMWEString : ( ( rule__MWEString__Alternatives ) ) ;
    public final void ruleMWEString() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:390:2: ( ( ( rule__MWEString__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:391:1: ( ( rule__MWEString__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:391:1: ( ( rule__MWEString__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:392:1: ( rule__MWEString__Alternatives )
            {
             before(grammarAccess.getMWEStringAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:393:1: ( rule__MWEString__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:393:2: rule__MWEString__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString765);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:406:1: entryRuleMWEStringPart : ruleMWEStringPart EOF ;
    public final void entryRuleMWEStringPart() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:407:1: ( ruleMWEStringPart EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:408:1: ruleMWEStringPart EOF
            {
             before(grammarAccess.getMWEStringPartRule()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart792);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEStringPart799); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:415:1: ruleMWEStringPart : ( ( rule__MWEStringPart__Alternatives ) ) ;
    public final void ruleMWEStringPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:419:2: ( ( ( rule__MWEStringPart__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:420:1: ( ( rule__MWEStringPart__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:420:1: ( ( rule__MWEStringPart__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:421:1: ( rule__MWEStringPart__Alternatives )
            {
             before(grammarAccess.getMWEStringPartAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:422:1: ( rule__MWEStringPart__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:422:2: rule__MWEStringPart__Alternatives
            {
            pushFollow(FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart825);
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


    // $ANTLR start entryRuleReplaceableString
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:434:1: entryRuleReplaceableString : ruleReplaceableString EOF ;
    public final void entryRuleReplaceableString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:435:1: ( ruleReplaceableString EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:436:1: ruleReplaceableString EOF
            {
             before(grammarAccess.getReplaceableStringRule()); 
            pushFollow(FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString852);
            ruleReplaceableString();
            _fsp--;

             after(grammarAccess.getReplaceableStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableString859); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:443:1: ruleReplaceableString : ( ( rule__ReplaceableString__Group__0 ) ) ;
    public final void ruleReplaceableString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:447:2: ( ( ( rule__ReplaceableString__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:448:1: ( ( rule__ReplaceableString__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:448:1: ( ( rule__ReplaceableString__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:449:1: ( rule__ReplaceableString__Group__0 )
            {
             before(grammarAccess.getReplaceableStringAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:450:1: ( rule__ReplaceableString__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:450:2: rule__ReplaceableString__Group__0
            {
            pushFollow(FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString885);
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


    // $ANTLR start entryRulePlainString
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:462:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:463:1: ( rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:464:1: rulePlainString EOF
            {
             before(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString912);
            rulePlainString();
            _fsp--;

             after(grammarAccess.getPlainStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString919); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:471:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:475:2: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:476:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:476:1: ( ( rule__PlainString__ValueAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:477:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:478:1: ( rule__PlainString__ValueAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:478:2: rule__PlainString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString945);
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


    // $ANTLR start entryRuleConstantValue
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:490:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:491:1: ( ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:492:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue972);
            ruleConstantValue();
            _fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue979); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:499:1: ruleConstantValue : ( ( rule__ConstantValue__Alternatives ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:503:2: ( ( ( rule__ConstantValue__Alternatives ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:504:1: ( ( rule__ConstantValue__Alternatives ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:504:1: ( ( rule__ConstantValue__Alternatives ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:505:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:506:1: ( rule__ConstantValue__Alternatives )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:506:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1005);
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


    // $ANTLR start entryRuleSingleQuote
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:518:1: entryRuleSingleQuote : ruleSingleQuote EOF ;
    public final void entryRuleSingleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:519:1: ( ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:520:1: ruleSingleQuote EOF
            {
             before(grammarAccess.getSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1032);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote1039); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:527:1: ruleSingleQuote : ( '\\'' ) ;
    public final void ruleSingleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:531:2: ( ( '\\'' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:532:1: ( '\\'' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:532:1: ( '\\'' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:533:1: '\\''
            {
             before(grammarAccess.getSingleQuoteAccess().getApostropheKeyword()); 
            match(input,9,FOLLOW_9_in_ruleSingleQuote1066); 
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:548:1: entryRuleEscapedSingleQuote : ruleEscapedSingleQuote EOF ;
    public final void entryRuleEscapedSingleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:552:1: ( ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:553:1: ruleEscapedSingleQuote EOF
            {
             before(grammarAccess.getEscapedSingleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1099);
            ruleEscapedSingleQuote();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote1106); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:563:1: ruleEscapedSingleQuote : ( ( rule__EscapedSingleQuote__Group__0 ) ) ;
    public final void ruleEscapedSingleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:568:2: ( ( ( rule__EscapedSingleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:569:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:569:1: ( ( rule__EscapedSingleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:570:1: ( rule__EscapedSingleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:571:1: ( rule__EscapedSingleQuote__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:571:2: rule__EscapedSingleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1136);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:584:1: entryRuleDoubleQuote : ruleDoubleQuote EOF ;
    public final void entryRuleDoubleQuote() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:585:1: ( ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:586:1: ruleDoubleQuote EOF
            {
             before(grammarAccess.getDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1163);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote1170); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:593:1: ruleDoubleQuote : ( '\"' ) ;
    public final void ruleDoubleQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:597:2: ( ( '\"' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:598:1: ( '\"' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:598:1: ( '\"' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:599:1: '\"'
            {
             before(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword()); 
            match(input,10,FOLLOW_10_in_ruleDoubleQuote1197); 
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:614:1: entryRuleEscapedDoubleQuote : ruleEscapedDoubleQuote EOF ;
    public final void entryRuleEscapedDoubleQuote() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:618:1: ( ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:619:1: ruleEscapedDoubleQuote EOF
            {
             before(grammarAccess.getEscapedDoubleQuoteRule()); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1230);
            ruleEscapedDoubleQuote();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1237); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:629:1: ruleEscapedDoubleQuote : ( ( rule__EscapedDoubleQuote__Group__0 ) ) ;
    public final void ruleEscapedDoubleQuote() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:634:2: ( ( ( rule__EscapedDoubleQuote__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:635:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:635:1: ( ( rule__EscapedDoubleQuote__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:636:1: ( rule__EscapedDoubleQuote__Group__0 )
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:637:1: ( rule__EscapedDoubleQuote__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:637:2: rule__EscapedDoubleQuote__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1267);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:650:1: entryRuleBackslash : ruleBackslash EOF ;
    public final void entryRuleBackslash() throws RecognitionException {
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:651:1: ( ruleBackslash EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:652:1: ruleBackslash EOF
            {
             before(grammarAccess.getBackslashRule()); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash1294);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash1301); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:659:1: ruleBackslash : ( '\\\\' ) ;
    public final void ruleBackslash() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:663:2: ( ( '\\\\' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:664:1: ( '\\\\' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:664:1: ( '\\\\' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:665:1: '\\\\'
            {
             before(grammarAccess.getBackslashAccess().getReverseSolidusKeyword()); 
            match(input,11,FOLLOW_11_in_ruleBackslash1328); 
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:680:1: entryRuleEscapedBackslash : ruleEscapedBackslash EOF ;
    public final void entryRuleEscapedBackslash() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:684:1: ( ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:685:1: ruleEscapedBackslash EOF
            {
             before(grammarAccess.getEscapedBackslashRule()); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash1361);
            ruleEscapedBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash1368); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:695:1: ruleEscapedBackslash : ( ( rule__EscapedBackslash__Group__0 ) ) ;
    public final void ruleEscapedBackslash() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:700:2: ( ( ( rule__EscapedBackslash__Group__0 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:701:1: ( ( rule__EscapedBackslash__Group__0 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:701:1: ( ( rule__EscapedBackslash__Group__0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:702:1: ( rule__EscapedBackslash__Group__0 )
            {
             before(grammarAccess.getEscapedBackslashAccess().getGroup()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:703:1: ( rule__EscapedBackslash__Group__0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:703:2: rule__EscapedBackslash__Group__0
            {
            pushFollow(FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash1398);
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


    // $ANTLR start rule__Component__Alternatives_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:717:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:721:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("717:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:722:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:722:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:723:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:724:1: ( rule__Component__TypeAssignment_1_0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:724:2: rule__Component__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_11435);
                    rule__Component__TypeAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:728:6: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:728:6: ( ( rule__Component__Group_1_1__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:729:1: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:730:1: ( rule__Component__Group_1_1__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:730:2: rule__Component__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_1_1__0_in_rule__Component__Alternatives_11453);
                    rule__Component__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_1_1()); 

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


    // $ANTLR start rule__Value__Alternatives
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:739:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:743:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==15||LA2_1==21) ) {
                    alt2=4;
                }
                else if ( (LA2_1==14||LA2_1==20||LA2_1==24||LA2_1==27) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("739:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 23:
            case 24:
            case 27:
                {
                alt2=1;
                }
                break;
            case 9:
            case 10:
                {
                alt2=2;
                }
                break;
            case 12:
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("739:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleReference ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:744:1: ( ruleComponent )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:744:1: ( ruleComponent )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:745:1: ruleComponent
                    {
                     before(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__Value__Alternatives1486);
                    ruleComponent();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:750:6: ( ruleStringLiteral )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:750:6: ( ruleStringLiteral )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:751:1: ruleStringLiteral
                    {
                     before(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1503);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:756:6: ( ruleBooleanLiteral )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:756:6: ( ruleBooleanLiteral )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:757:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1520);
                    ruleBooleanLiteral();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:762:6: ( ruleReference )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:762:6: ( ruleReference )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:763:1: ruleReference
                    {
                     before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1537);
                    ruleReference();
                    _fsp--;

                     after(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 

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
    // $ANTLR end rule__Value__Alternatives


    // $ANTLR start rule__BooleanLiteral__Alternatives_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:773:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:777:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("773:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( 'false' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:778:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:778:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:779:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:780:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:780:2: rule__BooleanLiteral__IsTrueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BooleanLiteral__IsTrueAssignment_1_0_in_rule__BooleanLiteral__Alternatives_11569);
                    rule__BooleanLiteral__IsTrueAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:784:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:784:6: ( 'false' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:785:1: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BooleanLiteral__Alternatives_11588); 
                     after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); 

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
    // $ANTLR end rule__BooleanLiteral__Alternatives_1


    // $ANTLR start rule__MWEString__Alternatives
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:797:1: rule__MWEString__Alternatives : ( ( ( rule__MWEString__Group_0__0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) );
    public final void rule__MWEString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:801:1: ( ( ( rule__MWEString__Group_0__0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==9) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("797:1: rule__MWEString__Alternatives : ( ( ( rule__MWEString__Group_0__0 ) ) | ( ( rule__MWEString__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:802:1: ( ( rule__MWEString__Group_0__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:802:1: ( ( rule__MWEString__Group_0__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:803:1: ( rule__MWEString__Group_0__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_0()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:804:1: ( rule__MWEString__Group_0__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:804:2: rule__MWEString__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_0__0_in_rule__MWEString__Alternatives1622);
                    rule__MWEString__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:808:6: ( ( rule__MWEString__Group_1__0 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:808:6: ( ( rule__MWEString__Group_1__0 ) )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:809:1: ( rule__MWEString__Group_1__0 )
                    {
                     before(grammarAccess.getMWEStringAccess().getGroup_1()); 
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:810:1: ( rule__MWEString__Group_1__0 )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:810:2: rule__MWEString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives1640);
                    rule__MWEString__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMWEStringAccess().getGroup_1()); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:819:1: rule__MWEStringPart__Alternatives : ( ( ruleReplaceableString ) | ( rulePlainString ) );
    public final void rule__MWEStringPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:823:1: ( ( ruleReplaceableString ) | ( rulePlainString ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_WS && LA5_0<=RULE_ID)||(LA5_0>=11 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("819:1: rule__MWEStringPart__Alternatives : ( ( ruleReplaceableString ) | ( rulePlainString ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:824:1: ( ruleReplaceableString )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:824:1: ( ruleReplaceableString )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:825:1: ruleReplaceableString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives1673);
                    ruleReplaceableString();
                    _fsp--;

                     after(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:830:6: ( rulePlainString )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:830:6: ( rulePlainString )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:831:1: rulePlainString
                    {
                     before(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives1690);
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


    // $ANTLR start rule__ConstantValue__Alternatives
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:841:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ':' ) | ( '{' ) | ( '}' ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( 'module' ) | ( '.' ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:845:1: ( ( RULE_WS ) | ( ':' ) | ( '{' ) | ( '}' ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( 'module' ) | ( '.' ) )
            int alt6=15;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 9:
                    {
                    alt6=6;
                    }
                    break;
                case 10:
                    {
                    alt6=5;
                    }
                    break;
                case 11:
                    {
                    alt6=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("841:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ':' ) | ( '{' ) | ( '}' ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( 'module' ) | ( '.' ) );", 6, 5, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=7;
                }
                break;
            case RULE_ID:
                {
                alt6=9;
                }
                break;
            case 16:
                {
                alt6=10;
                }
                break;
            case 12:
                {
                alt6=11;
                }
                break;
            case 17:
                {
                alt6=12;
                }
                break;
            case 18:
                {
                alt6=13;
                }
                break;
            case 19:
                {
                alt6=14;
                }
                break;
            case 20:
                {
                alt6=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("841:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( ':' ) | ( '{' ) | ( '}' ) | ( ruleEscapedDoubleQuote ) | ( ruleEscapedSingleQuote ) | ( RULE_ANY_OTHER ) | ( ruleEscapedBackslash ) | ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( '=' ) | ( 'import' ) | ( 'module' ) | ( '.' ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:846:1: ( RULE_WS )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:846:1: ( RULE_WS )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:847:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives1722); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:852:6: ( ':' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:852:6: ( ':' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:853:1: ':'
                    {
                     before(grammarAccess.getConstantValueAccess().getColonKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__ConstantValue__Alternatives1740); 
                     after(grammarAccess.getConstantValueAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:860:6: ( '{' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:860:6: ( '{' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:861:1: '{'
                    {
                     before(grammarAccess.getConstantValueAccess().getLeftCurlyBracketKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__ConstantValue__Alternatives1760); 
                     after(grammarAccess.getConstantValueAccess().getLeftCurlyBracketKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:868:6: ( '}' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:868:6: ( '}' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:869:1: '}'
                    {
                     before(grammarAccess.getConstantValueAccess().getRightCurlyBracketKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__ConstantValue__Alternatives1780); 
                     after(grammarAccess.getConstantValueAccess().getRightCurlyBracketKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:876:6: ( ruleEscapedDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:876:6: ( ruleEscapedDoubleQuote )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:877:1: ruleEscapedDoubleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives1799);
                    ruleEscapedDoubleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:882:6: ( ruleEscapedSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:882:6: ( ruleEscapedSingleQuote )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:883:1: ruleEscapedSingleQuote
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives1816);
                    ruleEscapedSingleQuote();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:888:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:888:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:889:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives1833); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:894:6: ( ruleEscapedBackslash )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:894:6: ( ruleEscapedBackslash )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:895:1: ruleEscapedBackslash
                    {
                     before(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives1850);
                    ruleEscapedBackslash();
                    _fsp--;

                     after(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:900:6: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:900:6: ( RULE_ID )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:901:1: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_8()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantValue__Alternatives1867); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:906:6: ( 'true' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:906:6: ( 'true' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:907:1: 'true'
                    {
                     before(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 
                    match(input,16,FOLLOW_16_in_rule__ConstantValue__Alternatives1885); 
                     after(grammarAccess.getConstantValueAccess().getTrueKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:914:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:914:6: ( 'false' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:915:1: 'false'
                    {
                     before(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 
                    match(input,12,FOLLOW_12_in_rule__ConstantValue__Alternatives1905); 
                     after(grammarAccess.getConstantValueAccess().getFalseKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:922:6: ( '=' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:922:6: ( '=' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:923:1: '='
                    {
                     before(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 
                    match(input,17,FOLLOW_17_in_rule__ConstantValue__Alternatives1925); 
                     after(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:930:6: ( 'import' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:930:6: ( 'import' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:931:1: 'import'
                    {
                     before(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 
                    match(input,18,FOLLOW_18_in_rule__ConstantValue__Alternatives1945); 
                     after(grammarAccess.getConstantValueAccess().getImportKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:938:6: ( 'module' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:938:6: ( 'module' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:939:1: 'module'
                    {
                     before(grammarAccess.getConstantValueAccess().getModuleKeyword_13()); 
                    match(input,19,FOLLOW_19_in_rule__ConstantValue__Alternatives1965); 
                     after(grammarAccess.getConstantValueAccess().getModuleKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:946:6: ( '.' )
                    {
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:946:6: ( '.' )
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:947:1: '.'
                    {
                     before(grammarAccess.getConstantValueAccess().getFullStopKeyword_14()); 
                    match(input,20,FOLLOW_20_in_rule__ConstantValue__Alternatives1985); 
                     after(grammarAccess.getConstantValueAccess().getFullStopKeyword_14()); 

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


    // $ANTLR start rule__Module__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:961:1: rule__Module__Group__0 : ( () ) rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:965:1: ( ( () ) rule__Module__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:966:1: ( () ) rule__Module__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:966:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:967:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:968:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:970:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02031);
            rule__Module__Group__1();
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
    // $ANTLR end rule__Module__Group__0


    // $ANTLR start rule__Module__Group__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:981:1: rule__Module__Group__1 : ( ( rule__Module__Group_1__0 )? ) rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:985:1: ( ( ( rule__Module__Group_1__0 )? ) rule__Module__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:986:1: ( ( rule__Module__Group_1__0 )? ) rule__Module__Group__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:986:1: ( ( rule__Module__Group_1__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:987:1: ( rule__Module__Group_1__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:988:1: ( rule__Module__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:988:2: rule__Module__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_1__0_in_rule__Module__Group__12059);
                    rule__Module__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12069);
            rule__Module__Group__2();
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
    // $ANTLR end rule__Module__Group__1


    // $ANTLR start rule__Module__Group__2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:999:1: rule__Module__Group__2 : ( ( rule__Module__ImportsAssignment_2 )* ) rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1003:1: ( ( ( rule__Module__ImportsAssignment_2 )* ) rule__Module__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1004:1: ( ( rule__Module__ImportsAssignment_2 )* ) rule__Module__Group__3
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1004:1: ( ( rule__Module__ImportsAssignment_2 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1005:1: ( rule__Module__ImportsAssignment_2 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1006:1: ( rule__Module__ImportsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1006:2: rule__Module__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Module__ImportsAssignment_2_in_rule__Module__Group__22097);
            	    rule__Module__ImportsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22107);
            rule__Module__Group__3();
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
    // $ANTLR end rule__Module__Group__2


    // $ANTLR start rule__Module__Group__3
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1017:1: rule__Module__Group__3 : ( ( rule__Module__DeclaredPropertiesAssignment_3 )* ) rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1021:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_3 )* ) rule__Module__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1022:1: ( ( rule__Module__DeclaredPropertiesAssignment_3 )* ) rule__Module__Group__4
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1022:1: ( ( rule__Module__DeclaredPropertiesAssignment_3 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1023:1: ( rule__Module__DeclaredPropertiesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1024:1: ( rule__Module__DeclaredPropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1024:2: rule__Module__DeclaredPropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__DeclaredPropertiesAssignment_3_in_rule__Module__Group__32135);
            	    rule__Module__DeclaredPropertiesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32145);
            rule__Module__Group__4();
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
    // $ANTLR end rule__Module__Group__3


    // $ANTLR start rule__Module__Group__4
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1035:1: rule__Module__Group__4 : ( ( rule__Module__RootAssignment_4 ) ) ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1039:1: ( ( ( rule__Module__RootAssignment_4 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1040:1: ( ( rule__Module__RootAssignment_4 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1040:1: ( ( rule__Module__RootAssignment_4 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1041:1: ( rule__Module__RootAssignment_4 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_4()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1042:1: ( rule__Module__RootAssignment_4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1042:2: rule__Module__RootAssignment_4
            {
            pushFollow(FOLLOW_rule__Module__RootAssignment_4_in_rule__Module__Group__42173);
            rule__Module__RootAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getRootAssignment_4()); 

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
    // $ANTLR end rule__Module__Group__4


    // $ANTLR start rule__Module__Group_1__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1062:1: rule__Module__Group_1__0 : ( 'module' ) rule__Module__Group_1__1 ;
    public final void rule__Module__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1066:1: ( ( 'module' ) rule__Module__Group_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1067:1: ( 'module' ) rule__Module__Group_1__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1067:1: ( 'module' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1068:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Module__Group_1__02218); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Module__Group_1__1_in_rule__Module__Group_1__02228);
            rule__Module__Group_1__1();
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
    // $ANTLR end rule__Module__Group_1__0


    // $ANTLR start rule__Module__Group_1__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1082:1: rule__Module__Group_1__1 : ( ( rule__Module__CanonicalNameAssignment_1_1 ) ) rule__Module__Group_1__2 ;
    public final void rule__Module__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1086:1: ( ( ( rule__Module__CanonicalNameAssignment_1_1 ) ) rule__Module__Group_1__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1087:1: ( ( rule__Module__CanonicalNameAssignment_1_1 ) ) rule__Module__Group_1__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1087:1: ( ( rule__Module__CanonicalNameAssignment_1_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1088:1: ( rule__Module__CanonicalNameAssignment_1_1 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1089:1: ( rule__Module__CanonicalNameAssignment_1_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1089:2: rule__Module__CanonicalNameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Module__CanonicalNameAssignment_1_1_in_rule__Module__Group_1__12256);
            rule__Module__CanonicalNameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getModuleAccess().getCanonicalNameAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Module__Group_1__2_in_rule__Module__Group_1__12265);
            rule__Module__Group_1__2();
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
    // $ANTLR end rule__Module__Group_1__1


    // $ANTLR start rule__Module__Group_1__2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1100:1: rule__Module__Group_1__2 : ( ';' ) ;
    public final void rule__Module__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1104:1: ( ( ';' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1105:1: ( ';' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1105:1: ( ';' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1106:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_1__22294); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end rule__Module__Group_1__2


    // $ANTLR start rule__DeclaredProperty__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1125:1: rule__DeclaredProperty__Group__0 : ( 'property' ) rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1129:1: ( ( 'property' ) rule__DeclaredProperty__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1130:1: ( 'property' ) rule__DeclaredProperty__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1130:1: ( 'property' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1131:1: 'property'
            {
             before(grammarAccess.getDeclaredPropertyAccess().getPropertyKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DeclaredProperty__Group__02336); 
             after(grammarAccess.getDeclaredPropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__1_in_rule__DeclaredProperty__Group__02346);
            rule__DeclaredProperty__Group__1();
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
    // $ANTLR end rule__DeclaredProperty__Group__0


    // $ANTLR start rule__DeclaredProperty__Group__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1145:1: rule__DeclaredProperty__Group__1 : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1149:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) rule__DeclaredProperty__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1150:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) rule__DeclaredProperty__Group__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1150:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1151:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1152:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1152:2: rule__DeclaredProperty__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DeclaredProperty__TypeAssignment_1_in_rule__DeclaredProperty__Group__12374);
                    rule__DeclaredProperty__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__2_in_rule__DeclaredProperty__Group__12384);
            rule__DeclaredProperty__Group__2();
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
    // $ANTLR end rule__DeclaredProperty__Group__1


    // $ANTLR start rule__DeclaredProperty__Group__2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1163:1: rule__DeclaredProperty__Group__2 : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1167:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) rule__DeclaredProperty__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1168:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) ) rule__DeclaredProperty__Group__3
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1168:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1169:1: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1170:1: ( rule__DeclaredProperty__NameAssignment_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1170:2: rule__DeclaredProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__NameAssignment_2_in_rule__DeclaredProperty__Group__22412);
            rule__DeclaredProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__3_in_rule__DeclaredProperty__Group__22421);
            rule__DeclaredProperty__Group__3();
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
    // $ANTLR end rule__DeclaredProperty__Group__2


    // $ANTLR start rule__DeclaredProperty__Group__3
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1181:1: rule__DeclaredProperty__Group__3 : ( ( rule__DeclaredProperty__Group_3__0 )? ) rule__DeclaredProperty__Group__4 ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1185:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) rule__DeclaredProperty__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1186:1: ( ( rule__DeclaredProperty__Group_3__0 )? ) rule__DeclaredProperty__Group__4
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1186:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1187:1: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1188:1: ( rule__DeclaredProperty__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1188:2: rule__DeclaredProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__0_in_rule__DeclaredProperty__Group__32449);
                    rule__DeclaredProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__DeclaredProperty__Group__4_in_rule__DeclaredProperty__Group__32459);
            rule__DeclaredProperty__Group__4();
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
    // $ANTLR end rule__DeclaredProperty__Group__3


    // $ANTLR start rule__DeclaredProperty__Group__4
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1199:1: rule__DeclaredProperty__Group__4 : ( ';' ) ;
    public final void rule__DeclaredProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1203:1: ( ( ';' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1204:1: ( ';' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1204:1: ( ';' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1205:1: ';'
            {
             before(grammarAccess.getDeclaredPropertyAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__DeclaredProperty__Group__42488); 
             after(grammarAccess.getDeclaredPropertyAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end rule__DeclaredProperty__Group__4


    // $ANTLR start rule__DeclaredProperty__Group_3__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1228:1: rule__DeclaredProperty__Group_3__0 : ( '=' ) rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1232:1: ( ( '=' ) rule__DeclaredProperty__Group_3__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1233:1: ( '=' ) rule__DeclaredProperty__Group_3__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1233:1: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1234:1: '='
            {
             before(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__DeclaredProperty__Group_3__02534); 
             after(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__DeclaredProperty__Group_3__1_in_rule__DeclaredProperty__Group_3__02544);
            rule__DeclaredProperty__Group_3__1();
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
    // $ANTLR end rule__DeclaredProperty__Group_3__0


    // $ANTLR start rule__DeclaredProperty__Group_3__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1248:1: rule__DeclaredProperty__Group_3__1 : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1252:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1253:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1253:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1254:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1255:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1255:2: rule__DeclaredProperty__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DeclaredProperty__DefaultAssignment_3_1_in_rule__DeclaredProperty__Group_3__12572);
            rule__DeclaredProperty__DefaultAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 

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
    // $ANTLR end rule__DeclaredProperty__Group_3__1


    // $ANTLR start rule__Component__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1269:1: rule__Component__Group__0 : ( () ) rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1273:1: ( ( () ) rule__Component__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1274:1: ( () ) rule__Component__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1274:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1275:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1276:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1278:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02620);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1289:1: rule__Component__Group__1 : ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1293:1: ( ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1294:1: ( ( rule__Component__Alternatives_1 )? ) rule__Component__Group__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1294:1: ( ( rule__Component__Alternatives_1 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1295:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1296:1: ( rule__Component__Alternatives_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1296:2: rule__Component__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__12648);
                    rule__Component__Alternatives_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12658);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1307:1: rule__Component__Group__2 : ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1311:1: ( ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1312:1: ( ( rule__Component__Group_2__0 )? ) rule__Component__Group__3
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1312:1: ( ( rule__Component__Group_2__0 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1313:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1314:1: ( rule__Component__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1314:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__22686);
                    rule__Component__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22696);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1325:1: rule__Component__Group__3 : ( ( rule__Component__AutoInjectAssignment_3 )? ) rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1329:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) rule__Component__Group__4 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1330:1: ( ( rule__Component__AutoInjectAssignment_3 )? ) rule__Component__Group__4
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1330:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1331:1: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1332:1: ( rule__Component__AutoInjectAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1332:2: rule__Component__AutoInjectAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Component__AutoInjectAssignment_3_in_rule__Component__Group__32724);
                    rule__Component__AutoInjectAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32734);
            rule__Component__Group__4();
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
    // $ANTLR end rule__Component__Group__3


    // $ANTLR start rule__Component__Group__4
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1343:1: rule__Component__Group__4 : ( '{' ) rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1347:1: ( ( '{' ) rule__Component__Group__5 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1348:1: ( '{' ) rule__Component__Group__5
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1348:1: ( '{' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1349:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__42763); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__42773);
            rule__Component__Group__5();
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
    // $ANTLR end rule__Component__Group__4


    // $ANTLR start rule__Component__Group__5
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1363:1: rule__Component__Group__5 : ( ( rule__Component__AssignmentAssignment_5 )* ) rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1367:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) rule__Component__Group__6 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1368:1: ( ( rule__Component__AssignmentAssignment_5 )* ) rule__Component__Group__6
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1368:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1369:1: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1370:1: ( rule__Component__AssignmentAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1370:2: rule__Component__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__AssignmentAssignment_5_in_rule__Component__Group__52801);
            	    rule__Component__AssignmentAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52811);
            rule__Component__Group__6();
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
    // $ANTLR end rule__Component__Group__5


    // $ANTLR start rule__Component__Group__6
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1381:1: rule__Component__Group__6 : ( '}' ) ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1385:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1386:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1386:1: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1387:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group__62840); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__Component__Group__6


    // $ANTLR start rule__Component__Group_1_1__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1414:1: rule__Component__Group_1_1__0 : ( '@' ) rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1418:1: ( ( '@' ) rule__Component__Group_1_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1419:1: ( '@' ) rule__Component__Group_1_1__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1419:1: ( '@' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1420:1: '@'
            {
             before(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Component__Group_1_1__02890); 
             after(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_1_1__1_in_rule__Component__Group_1_1__02900);
            rule__Component__Group_1_1__1();
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
    // $ANTLR end rule__Component__Group_1_1__0


    // $ANTLR start rule__Component__Group_1_1__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1434:1: rule__Component__Group_1_1__1 : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1438:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1439:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1439:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1440:1: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1441:1: ( rule__Component__ModuleAssignment_1_1_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1441:2: rule__Component__ModuleAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Component__ModuleAssignment_1_1_1_in_rule__Component__Group_1_1__12928);
            rule__Component__ModuleAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 

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
    // $ANTLR end rule__Component__Group_1_1__1


    // $ANTLR start rule__Component__Group_2__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1455:1: rule__Component__Group_2__0 : ( 'as' ) rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1459:1: ( ( 'as' ) rule__Component__Group_2__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1460:1: ( 'as' ) rule__Component__Group_2__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1460:1: ( 'as' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1461:1: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Component__Group_2__02967); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__02977);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1475:1: rule__Component__Group_2__1 : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1479:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1480:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1480:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1481:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1482:1: ( rule__Component__NameAssignment_2_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1482:2: rule__Component__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13005);
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


    // $ANTLR start rule__Import__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1496:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1500:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1501:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1501:1: ( 'import' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1502:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__03044); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03054);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1516:1: rule__Import__Group__1 : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1520:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1521:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1521:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1522:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1523:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1523:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13082);
            rule__Import__ImportedNamespaceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__ImportedFQN__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1537:1: rule__ImportedFQN__Group__0 : ( ruleFQN ) rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1541:1: ( ( ruleFQN ) rule__ImportedFQN__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1542:1: ( ruleFQN ) rule__ImportedFQN__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1542:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1543:1: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03120);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03128);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1555:1: rule__ImportedFQN__Group__1 : ( ( '.*' )? ) ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1559:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1560:1: ( ( '.*' )? )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1560:1: ( ( '.*' )? )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1561:1: ( '.*' )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1562:1: ( '.*' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1563:2: '.*'
                    {
                    match(input,25,FOLLOW_25_in_rule__ImportedFQN__Group__13158); 

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


    // $ANTLR start rule__Assignment__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1578:1: rule__Assignment__Group__0 : ( ( rule__Assignment__FeatureAssignment_0 ) ) rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1582:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) rule__Assignment__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1583:1: ( ( rule__Assignment__FeatureAssignment_0 ) ) rule__Assignment__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1583:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1584:1: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1585:1: ( rule__Assignment__FeatureAssignment_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1585:2: rule__Assignment__FeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__FeatureAssignment_0_in_rule__Assignment__Group__03199);
            rule__Assignment__FeatureAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03208);
            rule__Assignment__Group__1();
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
    // $ANTLR end rule__Assignment__Group__0


    // $ANTLR start rule__Assignment__Group__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1596:1: rule__Assignment__Group__1 : ( '=' ) rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1600:1: ( ( '=' ) rule__Assignment__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1601:1: ( '=' ) rule__Assignment__Group__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1601:1: ( '=' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1602:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Assignment__Group__13237); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13247);
            rule__Assignment__Group__2();
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
    // $ANTLR end rule__Assignment__Group__1


    // $ANTLR start rule__Assignment__Group__2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1616:1: rule__Assignment__Group__2 : ( ( rule__Assignment__ValueAssignment_2 ) ) rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1620:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) rule__Assignment__Group__3 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1621:1: ( ( rule__Assignment__ValueAssignment_2 ) ) rule__Assignment__Group__3
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1621:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1622:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1623:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1623:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__23275);
            rule__Assignment__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__23284);
            rule__Assignment__Group__3();
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
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Assignment__Group__3
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1634:1: rule__Assignment__Group__3 : ( ';' ) ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1638:1: ( ( ';' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1639:1: ( ';' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1639:1: ( ';' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1640:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Assignment__Group__33313); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end rule__Assignment__Group__3


    // $ANTLR start rule__BooleanLiteral__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1661:1: rule__BooleanLiteral__Group__0 : ( () ) rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1665:1: ( ( () ) rule__BooleanLiteral__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1666:1: ( () ) rule__BooleanLiteral__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1666:1: ( () )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1667:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1668:1: ()
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1670:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__03366);
            rule__BooleanLiteral__Group__1();
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
    // $ANTLR end rule__BooleanLiteral__Group__0


    // $ANTLR start rule__BooleanLiteral__Group__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1681:1: rule__BooleanLiteral__Group__1 : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1685:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1686:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1686:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1687:1: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1688:1: ( rule__BooleanLiteral__Alternatives_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1688:2: rule__BooleanLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_1_in_rule__BooleanLiteral__Group__13394);
            rule__BooleanLiteral__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 

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
    // $ANTLR end rule__BooleanLiteral__Group__1


    // $ANTLR start rule__FQN__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1702:1: rule__FQN__Group__0 : ( RULE_ID ) rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1706:1: ( ( RULE_ID ) rule__FQN__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1707:1: ( RULE_ID ) rule__FQN__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1707:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1708:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__03432); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03440);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1720:1: rule__FQN__Group__1 : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1724:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1725:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1725:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1726:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1727:1: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1727:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__13468);
            	    rule__FQN__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1741:1: rule__FQN__Group_1__0 : ( '.' ) rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1745:1: ( ( '.' ) rule__FQN__Group_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1746:1: ( '.' ) rule__FQN__Group_1__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1746:1: ( '.' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1747:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__03508); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03518);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1761:1: rule__FQN__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1765:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1766:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1766:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1767:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__13546); 
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


    // $ANTLR start rule__MWEString__Group_0__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1782:1: rule__MWEString__Group_0__0 : ( ( rule__MWEString__BeginAssignment_0_0 ) ) rule__MWEString__Group_0__1 ;
    public final void rule__MWEString__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1786:1: ( ( ( rule__MWEString__BeginAssignment_0_0 ) ) rule__MWEString__Group_0__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1787:1: ( ( rule__MWEString__BeginAssignment_0_0 ) ) rule__MWEString__Group_0__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1787:1: ( ( rule__MWEString__BeginAssignment_0_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1788:1: ( rule__MWEString__BeginAssignment_0_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1789:1: ( rule__MWEString__BeginAssignment_0_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1789:2: rule__MWEString__BeginAssignment_0_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_0_0_in_rule__MWEString__Group_0__03583);
            rule__MWEString__BeginAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_0__1_in_rule__MWEString__Group_0__03592);
            rule__MWEString__Group_0__1();
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
    // $ANTLR end rule__MWEString__Group_0__0


    // $ANTLR start rule__MWEString__Group_0__1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1800:1: rule__MWEString__Group_0__1 : ( ( rule__MWEString__PartsAssignment_0_1 )* ) rule__MWEString__Group_0__2 ;
    public final void rule__MWEString__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1804:1: ( ( ( rule__MWEString__PartsAssignment_0_1 )* ) rule__MWEString__Group_0__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1805:1: ( ( rule__MWEString__PartsAssignment_0_1 )* ) rule__MWEString__Group_0__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1805:1: ( ( rule__MWEString__PartsAssignment_0_1 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1806:1: ( rule__MWEString__PartsAssignment_0_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_0_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1807:1: ( rule__MWEString__PartsAssignment_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WS && LA18_0<=RULE_ID)||(LA18_0>=11 && LA18_0<=20)||LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1807:2: rule__MWEString__PartsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_0_1_in_rule__MWEString__Group_0__13620);
            	    rule__MWEString__PartsAssignment_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMWEStringAccess().getPartsAssignment_0_1()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_0__2_in_rule__MWEString__Group_0__13630);
            rule__MWEString__Group_0__2();
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
    // $ANTLR end rule__MWEString__Group_0__1


    // $ANTLR start rule__MWEString__Group_0__2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1818:1: rule__MWEString__Group_0__2 : ( ( rule__MWEString__EndAssignment_0_2 ) ) ;
    public final void rule__MWEString__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1822:1: ( ( ( rule__MWEString__EndAssignment_0_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1823:1: ( ( rule__MWEString__EndAssignment_0_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1823:1: ( ( rule__MWEString__EndAssignment_0_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1824:1: ( rule__MWEString__EndAssignment_0_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_0_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1825:1: ( rule__MWEString__EndAssignment_0_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1825:2: rule__MWEString__EndAssignment_0_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_0_2_in_rule__MWEString__Group_0__23658);
            rule__MWEString__EndAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getEndAssignment_0_2()); 

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
    // $ANTLR end rule__MWEString__Group_0__2


    // $ANTLR start rule__MWEString__Group_1__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1841:1: rule__MWEString__Group_1__0 : ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 ;
    public final void rule__MWEString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1845:1: ( ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1846:1: ( ( rule__MWEString__BeginAssignment_1_0 ) ) rule__MWEString__Group_1__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1846:1: ( ( rule__MWEString__BeginAssignment_1_0 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1847:1: ( rule__MWEString__BeginAssignment_1_0 )
            {
             before(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1848:1: ( rule__MWEString__BeginAssignment_1_0 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1848:2: rule__MWEString__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__03698);
            rule__MWEString__BeginAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getMWEStringAccess().getBeginAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__03707);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1859:1: rule__MWEString__Group_1__1 : ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 ;
    public final void rule__MWEString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1863:1: ( ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1864:1: ( ( rule__MWEString__PartsAssignment_1_1 )* ) rule__MWEString__Group_1__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1864:1: ( ( rule__MWEString__PartsAssignment_1_1 )* )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1865:1: ( rule__MWEString__PartsAssignment_1_1 )*
            {
             before(grammarAccess.getMWEStringAccess().getPartsAssignment_1_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1866:1: ( rule__MWEString__PartsAssignment_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_WS && LA19_0<=RULE_ID)||(LA19_0>=11 && LA19_0<=20)||LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1866:2: rule__MWEString__PartsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__13735);
            	    rule__MWEString__PartsAssignment_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMWEStringAccess().getPartsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__13745);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1877:1: rule__MWEString__Group_1__2 : ( ( rule__MWEString__EndAssignment_1_2 ) ) ;
    public final void rule__MWEString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1881:1: ( ( ( rule__MWEString__EndAssignment_1_2 ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1882:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1882:1: ( ( rule__MWEString__EndAssignment_1_2 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1883:1: ( rule__MWEString__EndAssignment_1_2 )
            {
             before(grammarAccess.getMWEStringAccess().getEndAssignment_1_2()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1884:1: ( rule__MWEString__EndAssignment_1_2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1884:2: rule__MWEString__EndAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__23773);
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


    // $ANTLR start rule__ReplaceableString__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1900:1: rule__ReplaceableString__Group__0 : ( '${' ) rule__ReplaceableString__Group__1 ;
    public final void rule__ReplaceableString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1904:1: ( ( '${' ) rule__ReplaceableString__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1905:1: ( '${' ) rule__ReplaceableString__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1905:1: ( '${' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1906:1: '${'
            {
             before(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ReplaceableString__Group__03814); 
             after(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__03824);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1920:1: rule__ReplaceableString__Group__1 : ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 ;
    public final void rule__ReplaceableString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1924:1: ( ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1925:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) ) rule__ReplaceableString__Group__2
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1925:1: ( ( rule__ReplaceableString__PropertyAssignment_1 ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1926:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1927:1: ( rule__ReplaceableString__PropertyAssignment_1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1927:2: rule__ReplaceableString__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__13852);
            rule__ReplaceableString__PropertyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getReplaceableStringAccess().getPropertyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__13861);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1938:1: rule__ReplaceableString__Group__2 : ( '}' ) ;
    public final void rule__ReplaceableString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1942:1: ( ( '}' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1943:1: ( '}' )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1943:1: ( '}' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1944:1: '}'
            {
             before(grammarAccess.getReplaceableStringAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ReplaceableString__Group__23890); 
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


    // $ANTLR start rule__EscapedSingleQuote__Group__0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1963:1: rule__EscapedSingleQuote__Group__0 : ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 ;
    public final void rule__EscapedSingleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1967:1: ( ( ruleBackslash ) rule__EscapedSingleQuote__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1968:1: ( ruleBackslash ) rule__EscapedSingleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1968:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1969:1: ruleBackslash
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__03931);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__03939);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1981:1: rule__EscapedSingleQuote__Group__1 : ( ruleSingleQuote ) ;
    public final void rule__EscapedSingleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1985:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1986:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1986:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:1987:1: ruleSingleQuote
            {
             before(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__13967);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2002:1: rule__EscapedDoubleQuote__Group__0 : ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 ;
    public final void rule__EscapedDoubleQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2006:1: ( ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2007:1: ( ruleBackslash ) rule__EscapedDoubleQuote__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2007:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2008:1: ruleBackslash
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__04004);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__04012);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2020:1: rule__EscapedDoubleQuote__Group__1 : ( ruleDoubleQuote ) ;
    public final void rule__EscapedDoubleQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2024:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2025:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2025:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2026:1: ruleDoubleQuote
            {
             before(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__14040);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2041:1: rule__EscapedBackslash__Group__0 : ( ruleBackslash ) rule__EscapedBackslash__Group__1 ;
    public final void rule__EscapedBackslash__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2045:1: ( ( ruleBackslash ) rule__EscapedBackslash__Group__1 )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2046:1: ( ruleBackslash ) rule__EscapedBackslash__Group__1
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2046:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2047:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__04077);
            ruleBackslash();
            _fsp--;

             after(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__04085);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2059:1: rule__EscapedBackslash__Group__1 : ( ruleBackslash ) ;
    public final void rule__EscapedBackslash__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2063:1: ( ( ruleBackslash ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2064:1: ( ruleBackslash )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2064:1: ( ruleBackslash )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2065:1: ruleBackslash
            {
             before(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__14113);
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


    // $ANTLR start rule__Module__CanonicalNameAssignment_1_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2081:1: rule__Module__CanonicalNameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2085:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2086:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2086:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2087:1: ruleFQN
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Module__CanonicalNameAssignment_1_14151);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Module__CanonicalNameAssignment_1_1


    // $ANTLR start rule__Module__ImportsAssignment_2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2096:1: rule__Module__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2100:1: ( ( ruleImport ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2101:1: ( ruleImport )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2101:1: ( ruleImport )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2102:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_24182);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Module__ImportsAssignment_2


    // $ANTLR start rule__Module__DeclaredPropertiesAssignment_3
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2111:1: rule__Module__DeclaredPropertiesAssignment_3 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2115:1: ( ( ruleDeclaredProperty ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2116:1: ( ruleDeclaredProperty )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2116:1: ( ruleDeclaredProperty )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2117:1: ruleDeclaredProperty
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_rule__Module__DeclaredPropertiesAssignment_34213);
            ruleDeclaredProperty();
            _fsp--;

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Module__DeclaredPropertiesAssignment_3


    // $ANTLR start rule__Module__RootAssignment_4
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2126:1: rule__Module__RootAssignment_4 : ( ruleComponent ) ;
    public final void rule__Module__RootAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2130:1: ( ( ruleComponent ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2131:1: ( ruleComponent )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2131:1: ( ruleComponent )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2132:1: ruleComponent
            {
             before(grammarAccess.getModuleAccess().getRootComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Module__RootAssignment_44244);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getModuleAccess().getRootComponentParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Module__RootAssignment_4


    // $ANTLR start rule__DeclaredProperty__TypeAssignment_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2141:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2145:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2146:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2146:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2147:1: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeTypeCrossReference_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2148:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2149:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeTypeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__DeclaredProperty__TypeAssignment_14279);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getTypeTypeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeTypeCrossReference_1_0()); 

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
    // $ANTLR end rule__DeclaredProperty__TypeAssignment_1


    // $ANTLR start rule__DeclaredProperty__NameAssignment_2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2160:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2164:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2165:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2165:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2166:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__DeclaredProperty__NameAssignment_24314);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 

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
    // $ANTLR end rule__DeclaredProperty__NameAssignment_2


    // $ANTLR start rule__DeclaredProperty__DefaultAssignment_3_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2175:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2179:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2180:1: ( ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2180:1: ( ruleValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2181:1: ruleValue
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__DeclaredProperty__DefaultAssignment_3_14345);
            ruleValue();
            _fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__DeclaredProperty__DefaultAssignment_3_1


    // $ANTLR start rule__Component__TypeAssignment_1_0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2190:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2194:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2195:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2195:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2196:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2197:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2198:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getTypeTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_04380);
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


    // $ANTLR start rule__Component__ModuleAssignment_1_1_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2209:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2213:1: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2214:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2214:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2215:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2216:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2217:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__ModuleAssignment_1_1_14419);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 

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
    // $ANTLR end rule__Component__ModuleAssignment_1_1_1


    // $ANTLR start rule__Component__NameAssignment_2_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2228:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2232:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2233:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2233:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2234:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Component__NameAssignment_2_14454);
            ruleFQN();
            _fsp--;

             after(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 

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


    // $ANTLR start rule__Component__AutoInjectAssignment_3
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2243:1: rule__Component__AutoInjectAssignment_3 : ( ( 'auto-inject' ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2247:1: ( ( ( 'auto-inject' ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2248:1: ( ( 'auto-inject' ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2248:1: ( ( 'auto-inject' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2249:1: ( 'auto-inject' )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2250:1: ( 'auto-inject' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2251:1: 'auto-inject'
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Component__AutoInjectAssignment_34490); 
             after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }

             after(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

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
    // $ANTLR end rule__Component__AutoInjectAssignment_3


    // $ANTLR start rule__Component__AssignmentAssignment_5
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2266:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2270:1: ( ( ruleAssignment ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2271:1: ( ruleAssignment )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2271:1: ( ruleAssignment )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2272:1: ruleAssignment
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__Component__AssignmentAssignment_54529);
            ruleAssignment();
            _fsp--;

             after(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Component__AssignmentAssignment_5


    // $ANTLR start rule__Import__ImportedNamespaceAssignment_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2281:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2285:1: ( ( ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2286:1: ( ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2286:1: ( ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2287:1: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_14560);
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


    // $ANTLR start rule__Assignment__FeatureAssignment_0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2296:1: rule__Assignment__FeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2300:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2301:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2301:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2302:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureOperationCrossReference_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2303:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2304:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getFeatureOperationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__FeatureAssignment_04595); 
             after(grammarAccess.getAssignmentAccess().getFeatureOperationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getFeatureOperationCrossReference_0_0()); 

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
    // $ANTLR end rule__Assignment__FeatureAssignment_0


    // $ANTLR start rule__Assignment__ValueAssignment_2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2315:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2319:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2320:1: ( ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2320:1: ( ruleValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2321:1: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_24630);
            ruleValue();
            _fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Assignment__ValueAssignment_2


    // $ANTLR start rule__StringLiteral__ValueAssignment
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2330:1: rule__StringLiteral__ValueAssignment : ( ruleMWEString ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2334:1: ( ( ruleMWEString ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2335:1: ( ruleMWEString )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2335:1: ( ruleMWEString )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2336:1: ruleMWEString
            {
             before(grammarAccess.getStringLiteralAccess().getValueMWEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMWEString_in_rule__StringLiteral__ValueAssignment4661);
            ruleMWEString();
            _fsp--;

             after(grammarAccess.getStringLiteralAccess().getValueMWEStringParserRuleCall_0()); 

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
    // $ANTLR end rule__StringLiteral__ValueAssignment


    // $ANTLR start rule__BooleanLiteral__IsTrueAssignment_1_0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2345:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2349:1: ( ( ( 'true' ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2350:1: ( ( 'true' ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2350:1: ( ( 'true' ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2351:1: ( 'true' )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2352:1: ( 'true' )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2353:1: 'true'
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            match(input,16,FOLLOW_16_in_rule__BooleanLiteral__IsTrueAssignment_1_04697); 
             after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 

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
    // $ANTLR end rule__BooleanLiteral__IsTrueAssignment_1_0


    // $ANTLR start rule__Reference__ReferableAssignment
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2368:1: rule__Reference__ReferableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2372:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2373:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2373:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2374:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2375:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2376:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ReferableAssignment4740); 
             after(grammarAccess.getReferenceAccess().getReferableReferrableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 

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
    // $ANTLR end rule__Reference__ReferableAssignment


    // $ANTLR start rule__MWEString__BeginAssignment_0_0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2387:1: rule__MWEString__BeginAssignment_0_0 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2391:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2392:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2392:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2393:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_0_04775);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_0_0_0()); 

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
    // $ANTLR end rule__MWEString__BeginAssignment_0_0


    // $ANTLR start rule__MWEString__PartsAssignment_0_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2402:1: rule__MWEString__PartsAssignment_0_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2406:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2407:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2407:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2408:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_0_14806);
            ruleMWEStringPart();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_0_1_0()); 

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
    // $ANTLR end rule__MWEString__PartsAssignment_0_1


    // $ANTLR start rule__MWEString__EndAssignment_0_2
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2417:1: rule__MWEString__EndAssignment_0_2 : ( ruleSingleQuote ) ;
    public final void rule__MWEString__EndAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2421:1: ( ( ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2422:1: ( ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2422:1: ( ruleSingleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2423:1: ruleSingleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_0_24837);
            ruleSingleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_0_2_0()); 

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
    // $ANTLR end rule__MWEString__EndAssignment_0_2


    // $ANTLR start rule__MWEString__BeginAssignment_1_0
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2432:1: rule__MWEString__BeginAssignment_1_0 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2436:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2437:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2437:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2438:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_1_04868);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_1_0_0()); 

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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2447:1: rule__MWEString__PartsAssignment_1_1 : ( ruleMWEStringPart ) ;
    public final void rule__MWEString__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2451:1: ( ( ruleMWEStringPart ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2452:1: ( ruleMWEStringPart )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2452:1: ( ruleMWEStringPart )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2453:1: ruleMWEStringPart
            {
             before(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_14899);
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
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2462:1: rule__MWEString__EndAssignment_1_2 : ( ruleDoubleQuote ) ;
    public final void rule__MWEString__EndAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2466:1: ( ( ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2467:1: ( ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2467:1: ( ruleDoubleQuote )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2468:1: ruleDoubleQuote
            {
             before(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_1_24930);
            ruleDoubleQuote();
            _fsp--;

             after(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_1_2_0()); 

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


    // $ANTLR start rule__ReplaceableString__PropertyAssignment_1
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2477:1: rule__ReplaceableString__PropertyAssignment_1 : ( ruleValue ) ;
    public final void rule__ReplaceableString__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2481:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2482:1: ( ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2482:1: ( ruleValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2483:1: ruleValue
            {
             before(grammarAccess.getReplaceableStringAccess().getPropertyValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ReplaceableString__PropertyAssignment_14961);
            ruleValue();
            _fsp--;

             after(grammarAccess.getReplaceableStringAccess().getPropertyValueParserRuleCall_1_0()); 

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


    // $ANTLR start rule__PlainString__ValueAssignment
    // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2492:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2496:1: ( ( ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2497:1: ( ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2497:1: ( ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language.ui/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/internal/InternalMwe2.g:2498:1: ruleConstantValue
            {
             before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment4992);
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\3\6\2\uffff\1\6";
    static final String DFA10_maxS =
        "\1\6\1\25\1\6\2\uffff\1\25";
    static final String DFA10_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\3\12\uffff\1\4\2\uffff\1\2\1\4",
            "\1\5",
            "",
            "",
            "\1\3\12\uffff\1\4\2\uffff\1\2\1\4"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1152:1: ( rule__DeclaredProperty__TypeAssignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredProperty130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__0_in_ruleDeclaredProperty156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__0_in_ruleImportedFQN336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferableAssignment_in_ruleReference636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_entryRuleMWEString728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEString735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Alternatives_in_ruleMWEString765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEStringPart799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEStringPart__Alternatives_in_ruleMWEStringPart825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableString859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__0_in_ruleReplaceableString885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainString__ValueAssignment_in_rulePlainString945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantValue__Alternatives_in_ruleConstantValue1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleSingleQuote1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__0_in_ruleEscapedSingleQuote1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDoubleQuote1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__0_in_ruleEscapedDoubleQuote1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBackslash1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__0_in_ruleEscapedBackslash1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__TypeAssignment_1_0_in_rule__Component__Alternatives_11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__0_in_rule__Component__Alternatives_11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Value__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Value__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Value__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__IsTrueAssignment_1_0_in_rule__BooleanLiteral__Alternatives_11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BooleanLiteral__Alternatives_11588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_0__0_in_rule__MWEString__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__0_in_rule__MWEString__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_rule__MWEStringPart__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_rule__MWEStringPart__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ConstantValue__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConstantValue__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConstantValue__Alternatives1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConstantValue__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_rule__ConstantValue__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_rule__ConstantValue__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ConstantValue__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_rule__ConstantValue__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantValue__Alternatives1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ConstantValue__Alternatives1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ConstantValue__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConstantValue__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConstantValue__Alternatives1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstantValue__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstantValue__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_1__0_in_rule__Module__Group__12059 = new BitSet(new long[]{0x0000000009C44040L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_2_in_rule__Module__Group__22097 = new BitSet(new long[]{0x0000000009C44040L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__DeclaredPropertiesAssignment_3_in_rule__Module__Group__32135 = new BitSet(new long[]{0x0000000009C04040L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__RootAssignment_4_in_rule__Module__Group__42173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Module__Group_1__02218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Module__Group_1__1_in_rule__Module__Group_1__02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__CanonicalNameAssignment_1_1_in_rule__Module__Group_1__12256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Module__Group_1__2_in_rule__Module__Group_1__12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_1__22294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DeclaredProperty__Group__02336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__1_in_rule__DeclaredProperty__Group__02346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__TypeAssignment_1_in_rule__DeclaredProperty__Group__12374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__2_in_rule__DeclaredProperty__Group__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__NameAssignment_2_in_rule__DeclaredProperty__Group__22412 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__3_in_rule__DeclaredProperty__Group__22421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__0_in_rule__DeclaredProperty__Group__32449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group__4_in_rule__DeclaredProperty__Group__32459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DeclaredProperty__Group__42488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DeclaredProperty__Group_3__02534 = new BitSet(new long[]{0x0000000009815640L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__Group_3__1_in_rule__DeclaredProperty__Group_3__02544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredProperty__DefaultAssignment_3_1_in_rule__DeclaredProperty__Group_3__12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_1_in_rule__Component__Group__12648 = new BitSet(new long[]{0x0000000009004000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__22686 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__AutoInjectAssignment_3_in_rule__Component__Group__32724 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__42763 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__42773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__AssignmentAssignment_5_in_rule__Component__Group__52801 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group__62840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Component__Group_1_1__02890 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Component__Group_1_1__1_in_rule__Component__Group_1_1__02900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ModuleAssignment_1_1_1_in_rule__Component__Group_1_1__12928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Component__Group_2__02967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_2_1_in_rule__Component__Group_2__13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__03044 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__13082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ImportedFQN__Group__03120 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ImportedFQN__Group__1_in_rule__ImportedFQN__Group__03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ImportedFQN__Group__13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__FeatureAssignment_0_in_rule__Assignment__Group__03199 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Assignment__Group__13237 = new BitSet(new long[]{0x0000000009815640L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__23275 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__23284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Assignment__Group__33313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_1_in_rule__BooleanLiteral__Group__13394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__03432 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__13468 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__03508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__13546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_0_0_in_rule__MWEString__Group_0__03583 = new BitSet(new long[]{0x00000000041FFA70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_0__1_in_rule__MWEString__Group_0__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_0_1_in_rule__MWEString__Group_0__13620 = new BitSet(new long[]{0x00000000041FFA70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_0__2_in_rule__MWEString__Group_0__13630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_0_2_in_rule__MWEString__Group_0__23658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__BeginAssignment_1_0_in_rule__MWEString__Group_1__03698 = new BitSet(new long[]{0x00000000041FFC70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__1_in_rule__MWEString__Group_1__03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__PartsAssignment_1_1_in_rule__MWEString__Group_1__13735 = new BitSet(new long[]{0x00000000041FFC70L});
    public static final BitSet FOLLOW_rule__MWEString__Group_1__2_in_rule__MWEString__Group_1__13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MWEString__EndAssignment_1_2_in_rule__MWEString__Group_1__23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReplaceableString__Group__03814 = new BitSet(new long[]{0x0000000009815640L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__1_in_rule__ReplaceableString__Group__03824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReplaceableString__PropertyAssignment_1_in_rule__ReplaceableString__Group__13852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ReplaceableString__Group__2_in_rule__ReplaceableString__Group__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReplaceableString__Group__23890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedSingleQuote__Group__03931 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EscapedSingleQuote__Group__1_in_rule__EscapedSingleQuote__Group__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__EscapedSingleQuote__Group__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedDoubleQuote__Group__04004 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EscapedDoubleQuote__Group__1_in_rule__EscapedDoubleQuote__Group__04012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__EscapedDoubleQuote__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__04077 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EscapedBackslash__Group__1_in_rule__EscapedBackslash__Group__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_rule__EscapedBackslash__Group__14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Module__CanonicalNameAssignment_1_14151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_24182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_rule__Module__DeclaredPropertiesAssignment_34213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Module__RootAssignment_44244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__DeclaredProperty__TypeAssignment_14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__DeclaredProperty__NameAssignment_24314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__DeclaredProperty__DefaultAssignment_3_14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__TypeAssignment_1_04380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__ModuleAssignment_1_1_14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Component__NameAssignment_2_14454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Component__AutoInjectAssignment_34490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Component__AssignmentAssignment_54529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_rule__Import__ImportedNamespaceAssignment_14560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__FeatureAssignment_04595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_24630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_rule__StringLiteral__ValueAssignment4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanLiteral__IsTrueAssignment_1_04697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ReferableAssignment4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__BeginAssignment_0_04775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_0_14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_rule__MWEString__EndAssignment_0_24837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__BeginAssignment_1_04868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_rule__MWEString__PartsAssignment_1_14899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_rule__MWEString__EndAssignment_1_24930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ReplaceableString__PropertyAssignment_14961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rule__PlainString__ValueAssignment4992 = new BitSet(new long[]{0x0000000000000002L});

}