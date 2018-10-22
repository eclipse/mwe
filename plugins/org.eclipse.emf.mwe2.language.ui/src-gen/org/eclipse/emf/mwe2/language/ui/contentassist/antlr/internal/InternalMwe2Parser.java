package org.eclipse.emf.mwe2.language.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMwe2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AutoInject", "Import", "Module", "False", "Null", "True", "ReverseSolidusDollarSignLeftCurlyBracket", "Var", "DollarSignLeftCurlyBracket", "FullStopAsterisk", "ReverseSolidusQuotationMark", "ReverseSolidusApostrophe", "ReverseSolidusReverseSolidus", "QuotationMark", "Apostrophe", "FullStop", "Colon", "EqualsSign", "CommercialAt", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=8;
    public static final int Import=5;
    public static final int DollarSignLeftCurlyBracket=12;
    public static final int ReverseSolidusReverseSolidus=16;
    public static final int Var=11;
    public static final int True=9;
    public static final int ReverseSolidusApostrophe=15;
    public static final int False=7;
    public static final int QuotationMark=17;
    public static final int RULE_SL_COMMENT=28;
    public static final int EqualsSign=21;
    public static final int AutoInject=4;
    public static final int Colon=20;
    public static final int RightCurlyBracket=24;
    public static final int EOF=-1;
    public static final int Apostrophe=18;
    public static final int FullStop=19;
    public static final int RULE_ID=25;
    public static final int RULE_WS=29;
    public static final int LeftCurlyBracket=23;
    public static final int RULE_ANY_OTHER=30;
    public static final int CommercialAt=22;
    public static final int ReverseSolidusQuotationMark=14;
    public static final int RULE_INT=26;
    public static final int FullStopAsterisk=13;
    public static final int RULE_ML_COMMENT=27;
    public static final int ReverseSolidusDollarSignLeftCurlyBracket=10;
    public static final int Module=6;

    // delegates
    // delegators


        public InternalMwe2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMwe2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMwe2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalMwe2Parser.g"; }


     
     	private Mwe2GrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("QuotationMark", "'\"'");
    		tokenNameToValue.put("Apostrophe", "'\''");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("DollarSignLeftCurlyBracket", "'\u0024{'");
    		tokenNameToValue.put("FullStopAsterisk", "'.*'");
    		tokenNameToValue.put("ReverseSolidusQuotationMark", "'\\\"'");
    		tokenNameToValue.put("ReverseSolidusApostrophe", "'\\\''");
    		tokenNameToValue.put("ReverseSolidusReverseSolidus", "'\\\\'");
    		tokenNameToValue.put("ReverseSolidusDollarSignLeftCurlyBracket", "'\\\u0024{'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Null", "'null'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Import", "'import'");
    		tokenNameToValue.put("Module", "'module'");
    		tokenNameToValue.put("AutoInject", "'auto-inject'");
     	}
     	
        public void setGrammarAccess(Mwe2GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModule"
    // InternalMwe2Parser.g:84:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:85:1: ( ruleModule EOF )
            // InternalMwe2Parser.g:86:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMwe2Parser.g:93:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:97:5: ( ( ( rule__Module__Group__0 ) ) )
            // InternalMwe2Parser.g:98:1: ( ( rule__Module__Group__0 ) )
            {
            // InternalMwe2Parser.g:98:1: ( ( rule__Module__Group__0 ) )
            // InternalMwe2Parser.g:99:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalMwe2Parser.g:100:1: ( rule__Module__Group__0 )
            // InternalMwe2Parser.g:100:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDeclaredProperty"
    // InternalMwe2Parser.g:112:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:113:1: ( ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:114:1: ruleDeclaredProperty EOF
            {
             before(grammarAccess.getDeclaredPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredProperty();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaredProperty"


    // $ANTLR start "ruleDeclaredProperty"
    // InternalMwe2Parser.g:121:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:125:5: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // InternalMwe2Parser.g:126:1: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // InternalMwe2Parser.g:126:1: ( ( rule__DeclaredProperty__Group__0 ) )
            // InternalMwe2Parser.g:127:1: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // InternalMwe2Parser.g:128:1: ( rule__DeclaredProperty__Group__0 )
            // InternalMwe2Parser.g:128:2: rule__DeclaredProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDeclaredProperty"


    // $ANTLR start "entryRuleRootComponent"
    // InternalMwe2Parser.g:140:1: entryRuleRootComponent : ruleRootComponent EOF ;
    public final void entryRuleRootComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:141:1: ( ruleRootComponent EOF )
            // InternalMwe2Parser.g:142:1: ruleRootComponent EOF
            {
             before(grammarAccess.getRootComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleRootComponent();

            state._fsp--;

             after(grammarAccess.getRootComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRootComponent"


    // $ANTLR start "ruleRootComponent"
    // InternalMwe2Parser.g:149:1: ruleRootComponent : ( ( rule__RootComponent__Group__0 ) ) ;
    public final void ruleRootComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:153:5: ( ( ( rule__RootComponent__Group__0 ) ) )
            // InternalMwe2Parser.g:154:1: ( ( rule__RootComponent__Group__0 ) )
            {
            // InternalMwe2Parser.g:154:1: ( ( rule__RootComponent__Group__0 ) )
            // InternalMwe2Parser.g:155:1: ( rule__RootComponent__Group__0 )
            {
             before(grammarAccess.getRootComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:156:1: ( rule__RootComponent__Group__0 )
            // InternalMwe2Parser.g:156:2: rule__RootComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootComponent"


    // $ANTLR start "entryRuleComponent"
    // InternalMwe2Parser.g:168:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:169:1: ( ruleComponent EOF )
            // InternalMwe2Parser.g:170:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMwe2Parser.g:177:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:181:5: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMwe2Parser.g:182:1: ( ( rule__Component__Group__0 ) )
            {
            // InternalMwe2Parser.g:182:1: ( ( rule__Component__Group__0 ) )
            // InternalMwe2Parser.g:183:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:184:1: ( rule__Component__Group__0 )
            // InternalMwe2Parser.g:184:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleImport"
    // InternalMwe2Parser.g:196:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:197:1: ( ruleImport EOF )
            // InternalMwe2Parser.g:198:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMwe2Parser.g:205:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:209:5: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMwe2Parser.g:210:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalMwe2Parser.g:210:1: ( ( rule__Import__Group__0 ) )
            // InternalMwe2Parser.g:211:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMwe2Parser.g:212:1: ( rule__Import__Group__0 )
            // InternalMwe2Parser.g:212:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalMwe2Parser.g:224:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:225:1: ( ruleImportedFQN EOF )
            // InternalMwe2Parser.g:226:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalMwe2Parser.g:233:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:237:5: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalMwe2Parser.g:238:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:238:1: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalMwe2Parser.g:239:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:240:1: ( rule__ImportedFQN__Group__0 )
            // InternalMwe2Parser.g:240:2: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleAssignment"
    // InternalMwe2Parser.g:252:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:253:1: ( ruleAssignment EOF )
            // InternalMwe2Parser.g:254:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMwe2Parser.g:261:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:265:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMwe2Parser.g:266:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMwe2Parser.g:266:1: ( ( rule__Assignment__Group__0 ) )
            // InternalMwe2Parser.g:267:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMwe2Parser.g:268:1: ( rule__Assignment__Group__0 )
            // InternalMwe2Parser.g:268:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalMwe2Parser.g:280:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:281:1: ( ruleValue EOF )
            // InternalMwe2Parser.g:282:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMwe2Parser.g:289:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:293:5: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMwe2Parser.g:294:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalMwe2Parser.g:294:1: ( ( rule__Value__Alternatives ) )
            // InternalMwe2Parser.g:295:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:296:1: ( rule__Value__Alternatives )
            // InternalMwe2Parser.g:296:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNullLiteral"
    // InternalMwe2Parser.g:308:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:309:1: ( ruleNullLiteral EOF )
            // InternalMwe2Parser.g:310:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // InternalMwe2Parser.g:317:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:321:5: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:322:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:322:1: ( ( rule__NullLiteral__Group__0 ) )
            // InternalMwe2Parser.g:323:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:324:1: ( rule__NullLiteral__Group__0 )
            // InternalMwe2Parser.g:324:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalMwe2Parser.g:336:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:337:1: ( ruleDoubleLiteral EOF )
            // InternalMwe2Parser.g:338:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalMwe2Parser.g:345:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__ValueAssignment ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:349:5: ( ( ( rule__DoubleLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:350:1: ( ( rule__DoubleLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:350:1: ( ( rule__DoubleLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:351:1: ( rule__DoubleLiteral__ValueAssignment )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:352:1: ( rule__DoubleLiteral__ValueAssignment )
            // InternalMwe2Parser.g:352:2: rule__DoubleLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DoubleLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleDoubleValue"
    // InternalMwe2Parser.g:364:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:365:1: ( ruleDoubleValue EOF )
            // InternalMwe2Parser.g:366:1: ruleDoubleValue EOF
            {
             before(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleValue();

            state._fsp--;

             after(grammarAccess.getDoubleValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // InternalMwe2Parser.g:373:1: ruleDoubleValue : ( ( rule__DoubleValue__Group__0 ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:377:5: ( ( ( rule__DoubleValue__Group__0 ) ) )
            // InternalMwe2Parser.g:378:1: ( ( rule__DoubleValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:378:1: ( ( rule__DoubleValue__Group__0 ) )
            // InternalMwe2Parser.g:379:1: ( rule__DoubleValue__Group__0 )
            {
             before(grammarAccess.getDoubleValueAccess().getGroup()); 
            // InternalMwe2Parser.g:380:1: ( rule__DoubleValue__Group__0 )
            // InternalMwe2Parser.g:380:2: rule__DoubleValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMwe2Parser.g:392:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:393:1: ( ruleIntegerLiteral EOF )
            // InternalMwe2Parser.g:394:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMwe2Parser.g:401:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:405:5: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:406:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:406:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:407:1: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:408:1: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMwe2Parser.g:408:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMwe2Parser.g:420:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:421:1: ( ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:422:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMwe2Parser.g:429:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:433:5: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:434:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:434:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalMwe2Parser.g:435:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:436:1: ( rule__BooleanLiteral__Group__0 )
            // InternalMwe2Parser.g:436:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleReference"
    // InternalMwe2Parser.g:448:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:449:1: ( ruleReference EOF )
            // InternalMwe2Parser.g:450:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMwe2Parser.g:457:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:461:5: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:462:1: ( ( rule__Reference__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:462:1: ( ( rule__Reference__ReferableAssignment ) )
            // InternalMwe2Parser.g:463:1: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:464:1: ( rule__Reference__ReferableAssignment )
            // InternalMwe2Parser.g:464:2: rule__Reference__ReferableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ReferableAssignment();

            state._fsp--;


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFQN"
    // InternalMwe2Parser.g:476:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:477:1: ( ruleFQN EOF )
            // InternalMwe2Parser.g:478:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMwe2Parser.g:485:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:489:5: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMwe2Parser.g:490:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:490:1: ( ( rule__FQN__Group__0 ) )
            // InternalMwe2Parser.g:491:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:492:1: ( rule__FQN__Group__0 )
            // InternalMwe2Parser.g:492:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMwe2Parser.g:504:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:508:1: ( ruleStringLiteral EOF )
            // InternalMwe2Parser.g:509:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMwe2Parser.g:519:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:524:5: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // InternalMwe2Parser.g:525:1: ( ( rule__StringLiteral__Alternatives ) )
            {
            // InternalMwe2Parser.g:525:1: ( ( rule__StringLiteral__Alternatives ) )
            // InternalMwe2Parser.g:526:1: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // InternalMwe2Parser.g:527:1: ( rule__StringLiteral__Alternatives )
            // InternalMwe2Parser.g:527:2: rule__StringLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // InternalMwe2Parser.g:540:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:544:1: ( rulePropertyReference EOF )
            // InternalMwe2Parser.g:545:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalMwe2Parser.g:555:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:560:5: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // InternalMwe2Parser.g:561:1: ( ( rule__PropertyReference__Group__0 ) )
            {
            // InternalMwe2Parser.g:561:1: ( ( rule__PropertyReference__Group__0 ) )
            // InternalMwe2Parser.g:562:1: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // InternalMwe2Parser.g:563:1: ( rule__PropertyReference__Group__0 )
            // InternalMwe2Parser.g:563:2: rule__PropertyReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRulePropertyReferenceImpl"
    // InternalMwe2Parser.g:576:1: entryRulePropertyReferenceImpl : rulePropertyReferenceImpl EOF ;
    public final void entryRulePropertyReferenceImpl() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:580:1: ( rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:581:1: rulePropertyReferenceImpl EOF
            {
             before(grammarAccess.getPropertyReferenceImplRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyReferenceImpl();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyReferenceImpl"


    // $ANTLR start "rulePropertyReferenceImpl"
    // InternalMwe2Parser.g:591:1: rulePropertyReferenceImpl : ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) ;
    public final void rulePropertyReferenceImpl() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:596:5: ( ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:597:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:597:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            // InternalMwe2Parser.g:598:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:599:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            // InternalMwe2Parser.g:599:2: rule__PropertyReferenceImpl__ReferableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReferenceImpl__ReferableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 

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
    // $ANTLR end "rulePropertyReferenceImpl"


    // $ANTLR start "entryRulePlainString"
    // InternalMwe2Parser.g:612:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:613:1: ( rulePlainString EOF )
            // InternalMwe2Parser.g:614:1: rulePlainString EOF
            {
             before(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_1);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getPlainStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlainString"


    // $ANTLR start "rulePlainString"
    // InternalMwe2Parser.g:621:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:625:5: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // InternalMwe2Parser.g:626:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:626:1: ( ( rule__PlainString__ValueAssignment ) )
            // InternalMwe2Parser.g:627:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:628:1: ( rule__PlainString__ValueAssignment )
            // InternalMwe2Parser.g:628:2: rule__PlainString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PlainString__ValueAssignment();

            state._fsp--;


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
    // $ANTLR end "rulePlainString"


    // $ANTLR start "entryRuleConstantValue"
    // InternalMwe2Parser.g:640:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:641:1: ( ruleConstantValue EOF )
            // InternalMwe2Parser.g:642:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalMwe2Parser.g:649:1: ruleConstantValue : ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:653:5: ( ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) )
            // InternalMwe2Parser.g:654:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            {
            // InternalMwe2Parser.g:654:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            // InternalMwe2Parser.g:655:1: ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* )
            {
            // InternalMwe2Parser.g:655:1: ( ( rule__ConstantValue__Alternatives ) )
            // InternalMwe2Parser.g:656:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:657:1: ( rule__ConstantValue__Alternatives )
            // InternalMwe2Parser.g:657:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }

            // InternalMwe2Parser.g:660:1: ( ( rule__ConstantValue__Alternatives )* )
            // InternalMwe2Parser.g:661:1: ( rule__ConstantValue__Alternatives )*
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:662:1: ( rule__ConstantValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA1_0>=ReverseSolidusQuotationMark && LA1_0<=ReverseSolidusReverseSolidus)||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:662:2: rule__ConstantValue__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ConstantValue__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "rule__RootComponent__Alternatives_1"
    // InternalMwe2Parser.g:675:1: rule__RootComponent__Alternatives_1 : ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) );
    public final void rule__RootComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:679:1: ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==CommercialAt) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMwe2Parser.g:680:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:680:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:681:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:682:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:682:2: rule__RootComponent__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootComponent__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:686:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:686:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:687:1: ( rule__RootComponent__Group_1_1__0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:688:1: ( rule__RootComponent__Group_1_1__0 )
                    // InternalMwe2Parser.g:688:2: rule__RootComponent__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootComponent__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootComponentAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__RootComponent__Alternatives_1"


    // $ANTLR start "rule__Component__Alternatives_1"
    // InternalMwe2Parser.g:697:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:701:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==CommercialAt) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMwe2Parser.g:702:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:702:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:703:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:704:1: ( rule__Component__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:704:2: rule__Component__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:708:6: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:708:6: ( ( rule__Component__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:709:1: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:710:1: ( rule__Component__Group_1_1__0 )
                    // InternalMwe2Parser.g:710:2: rule__Component__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_1_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Component__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMwe2Parser.g:719:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:723:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:724:1: ( ruleComponent )
                    {
                    // InternalMwe2Parser.g:724:1: ( ruleComponent )
                    // InternalMwe2Parser.g:725:1: ruleComponent
                    {
                     before(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:730:6: ( ruleStringLiteral )
                    {
                    // InternalMwe2Parser.g:730:6: ( ruleStringLiteral )
                    // InternalMwe2Parser.g:731:1: ruleStringLiteral
                    {
                     before(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:736:6: ( ruleBooleanLiteral )
                    {
                    // InternalMwe2Parser.g:736:6: ( ruleBooleanLiteral )
                    // InternalMwe2Parser.g:737:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:742:6: ( ruleIntegerLiteral )
                    {
                    // InternalMwe2Parser.g:742:6: ( ruleIntegerLiteral )
                    // InternalMwe2Parser.g:743:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:748:6: ( ruleDoubleLiteral )
                    {
                    // InternalMwe2Parser.g:748:6: ( ruleDoubleLiteral )
                    // InternalMwe2Parser.g:749:1: ruleDoubleLiteral
                    {
                     before(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:754:6: ( ruleNullLiteral )
                    {
                    // InternalMwe2Parser.g:754:6: ( ruleNullLiteral )
                    // InternalMwe2Parser.g:755:1: ruleNullLiteral
                    {
                     before(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNullLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:760:6: ( ruleReference )
                    {
                    // InternalMwe2Parser.g:760:6: ( ruleReference )
                    // InternalMwe2Parser.g:761:1: ruleReference
                    {
                     before(grammarAccess.getValueAccess().getReferenceParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getReferenceParserRuleCall_6()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__Alternatives_1"
    // InternalMwe2Parser.g:771:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:775:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==True) ) {
                alt5=1;
            }
            else if ( (LA5_0==False) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMwe2Parser.g:776:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:776:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // InternalMwe2Parser.g:777:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // InternalMwe2Parser.g:778:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // InternalMwe2Parser.g:778:2: rule__BooleanLiteral__IsTrueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanLiteral__IsTrueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:782:6: ( False )
                    {
                    // InternalMwe2Parser.g:782:6: ( False )
                    // InternalMwe2Parser.g:783:1: False
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); 
                    match(input,False,FOLLOW_2); 
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
    // $ANTLR end "rule__BooleanLiteral__Alternatives_1"


    // $ANTLR start "rule__StringLiteral__Alternatives"
    // InternalMwe2Parser.g:795:1: rule__StringLiteral__Alternatives : ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:799:1: ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Apostrophe) ) {
                alt6=1;
            }
            else if ( (LA6_0==QuotationMark) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMwe2Parser.g:800:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    {
                    // InternalMwe2Parser.g:800:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    // InternalMwe2Parser.g:801:1: ( rule__StringLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_0()); 
                    // InternalMwe2Parser.g:802:1: ( rule__StringLiteral__Group_0__0 )
                    // InternalMwe2Parser.g:802:2: rule__StringLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:806:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    {
                    // InternalMwe2Parser.g:806:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    // InternalMwe2Parser.g:807:1: ( rule__StringLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_1()); 
                    // InternalMwe2Parser.g:808:1: ( rule__StringLiteral__Group_1__0 )
                    // InternalMwe2Parser.g:808:2: rule__StringLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringLiteralAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StringLiteral__Alternatives"


    // $ANTLR start "rule__ConstantValue__Alternatives"
    // InternalMwe2Parser.g:817:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:821:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt7=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case ReverseSolidusApostrophe:
                {
                alt7=4;
                }
                break;
            case ReverseSolidusQuotationMark:
                {
                alt7=5;
                }
                break;
            case ReverseSolidusDollarSignLeftCurlyBracket:
                {
                alt7=6;
                }
                break;
            case ReverseSolidusReverseSolidus:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMwe2Parser.g:822:1: ( RULE_WS )
                    {
                    // InternalMwe2Parser.g:822:1: ( RULE_WS )
                    // InternalMwe2Parser.g:823:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:828:6: ( RULE_ANY_OTHER )
                    {
                    // InternalMwe2Parser.g:828:6: ( RULE_ANY_OTHER )
                    // InternalMwe2Parser.g:829:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:834:6: ( RULE_ID )
                    {
                    // InternalMwe2Parser.g:834:6: ( RULE_ID )
                    // InternalMwe2Parser.g:835:1: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:840:6: ( ReverseSolidusApostrophe )
                    {
                    // InternalMwe2Parser.g:840:6: ( ReverseSolidusApostrophe )
                    // InternalMwe2Parser.g:841:1: ReverseSolidusApostrophe
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
                    match(input,ReverseSolidusApostrophe,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:848:6: ( ReverseSolidusQuotationMark )
                    {
                    // InternalMwe2Parser.g:848:6: ( ReverseSolidusQuotationMark )
                    // InternalMwe2Parser.g:849:1: ReverseSolidusQuotationMark
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
                    match(input,ReverseSolidusQuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:856:6: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    {
                    // InternalMwe2Parser.g:856:6: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    // InternalMwe2Parser.g:857:1: ReverseSolidusDollarSignLeftCurlyBracket
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
                    match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:864:6: ( ReverseSolidusReverseSolidus )
                    {
                    // InternalMwe2Parser.g:864:6: ( ReverseSolidusReverseSolidus )
                    // InternalMwe2Parser.g:865:1: ReverseSolidusReverseSolidus
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); 
                    match(input,ReverseSolidusReverseSolidus,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); 

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
    // $ANTLR end "rule__ConstantValue__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // InternalMwe2Parser.g:879:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:883:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalMwe2Parser.g:884:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalMwe2Parser.g:891:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:895:1: ( ( () ) )
            // InternalMwe2Parser.g:896:1: ( () )
            {
            // InternalMwe2Parser.g:896:1: ( () )
            // InternalMwe2Parser.g:897:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // InternalMwe2Parser.g:898:1: ()
            // InternalMwe2Parser.g:900:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalMwe2Parser.g:910:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:914:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalMwe2Parser.g:915:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalMwe2Parser.g:922:1: rule__Module__Group__1__Impl : ( Module ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:926:1: ( ( Module ) )
            // InternalMwe2Parser.g:927:1: ( Module )
            {
            // InternalMwe2Parser.g:927:1: ( Module )
            // InternalMwe2Parser.g:928:1: Module
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,Module,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalMwe2Parser.g:941:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:945:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalMwe2Parser.g:946:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalMwe2Parser.g:953:1: rule__Module__Group__2__Impl : ( ( rule__Module__CanonicalNameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:957:1: ( ( ( rule__Module__CanonicalNameAssignment_2 ) ) )
            // InternalMwe2Parser.g:958:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:958:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            // InternalMwe2Parser.g:959:1: ( rule__Module__CanonicalNameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 
            // InternalMwe2Parser.g:960:1: ( rule__Module__CanonicalNameAssignment_2 )
            // InternalMwe2Parser.g:960:2: rule__Module__CanonicalNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Module__CanonicalNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalMwe2Parser.g:970:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:974:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalMwe2Parser.g:975:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalMwe2Parser.g:982:1: rule__Module__Group__3__Impl : ( ( rule__Module__ImportsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:986:1: ( ( ( rule__Module__ImportsAssignment_3 )* ) )
            // InternalMwe2Parser.g:987:1: ( ( rule__Module__ImportsAssignment_3 )* )
            {
            // InternalMwe2Parser.g:987:1: ( ( rule__Module__ImportsAssignment_3 )* )
            // InternalMwe2Parser.g:988:1: ( rule__Module__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_3()); 
            // InternalMwe2Parser.g:989:1: ( rule__Module__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Import) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMwe2Parser.g:989:2: rule__Module__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Module__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalMwe2Parser.g:999:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1003:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalMwe2Parser.g:1004:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalMwe2Parser.g:1011:1: rule__Module__Group__4__Impl : ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1015:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) )
            // InternalMwe2Parser.g:1016:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            {
            // InternalMwe2Parser.g:1016:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            // InternalMwe2Parser.g:1017:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 
            // InternalMwe2Parser.g:1018:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Var) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMwe2Parser.g:1018:2: rule__Module__DeclaredPropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Module__DeclaredPropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // InternalMwe2Parser.g:1028:1: rule__Module__Group__5 : rule__Module__Group__5__Impl ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1032:1: ( rule__Module__Group__5__Impl )
            // InternalMwe2Parser.g:1033:2: rule__Module__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // InternalMwe2Parser.g:1039:1: rule__Module__Group__5__Impl : ( ( rule__Module__RootAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1043:1: ( ( ( rule__Module__RootAssignment_5 ) ) )
            // InternalMwe2Parser.g:1044:1: ( ( rule__Module__RootAssignment_5 ) )
            {
            // InternalMwe2Parser.g:1044:1: ( ( rule__Module__RootAssignment_5 ) )
            // InternalMwe2Parser.g:1045:1: ( rule__Module__RootAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_5()); 
            // InternalMwe2Parser.g:1046:1: ( rule__Module__RootAssignment_5 )
            // InternalMwe2Parser.g:1046:2: rule__Module__RootAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Module__RootAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getRootAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__0"
    // InternalMwe2Parser.g:1068:1: rule__DeclaredProperty__Group__0 : rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1072:1: ( rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 )
            // InternalMwe2Parser.g:1073:2: rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DeclaredProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__0"


    // $ANTLR start "rule__DeclaredProperty__Group__0__Impl"
    // InternalMwe2Parser.g:1080:1: rule__DeclaredProperty__Group__0__Impl : ( Var ) ;
    public final void rule__DeclaredProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1084:1: ( ( Var ) )
            // InternalMwe2Parser.g:1085:1: ( Var )
            {
            // InternalMwe2Parser.g:1085:1: ( Var )
            // InternalMwe2Parser.g:1086:1: Var
            {
             before(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__0__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__1"
    // InternalMwe2Parser.g:1099:1: rule__DeclaredProperty__Group__1 : rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1103:1: ( rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 )
            // InternalMwe2Parser.g:1104:2: rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeclaredProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__1"


    // $ANTLR start "rule__DeclaredProperty__Group__1__Impl"
    // InternalMwe2Parser.g:1111:1: rule__DeclaredProperty__Group__1__Impl : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) ;
    public final void rule__DeclaredProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1115:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) )
            // InternalMwe2Parser.g:1116:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            {
            // InternalMwe2Parser.g:1116:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // InternalMwe2Parser.g:1117:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // InternalMwe2Parser.g:1118:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMwe2Parser.g:1118:2: rule__DeclaredProperty__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaredProperty__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__1__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__2"
    // InternalMwe2Parser.g:1128:1: rule__DeclaredProperty__Group__2 : rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1132:1: ( rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 )
            // InternalMwe2Parser.g:1133:2: rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DeclaredProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__2"


    // $ANTLR start "rule__DeclaredProperty__Group__2__Impl"
    // InternalMwe2Parser.g:1140:1: rule__DeclaredProperty__Group__2__Impl : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) ;
    public final void rule__DeclaredProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1144:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) )
            // InternalMwe2Parser.g:1145:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1145:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // InternalMwe2Parser.g:1146:1: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // InternalMwe2Parser.g:1147:1: ( rule__DeclaredProperty__NameAssignment_2 )
            // InternalMwe2Parser.g:1147:2: rule__DeclaredProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__2__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group__3"
    // InternalMwe2Parser.g:1157:1: rule__DeclaredProperty__Group__3 : rule__DeclaredProperty__Group__3__Impl ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1161:1: ( rule__DeclaredProperty__Group__3__Impl )
            // InternalMwe2Parser.g:1162:2: rule__DeclaredProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__3"


    // $ANTLR start "rule__DeclaredProperty__Group__3__Impl"
    // InternalMwe2Parser.g:1168:1: rule__DeclaredProperty__Group__3__Impl : ( ( rule__DeclaredProperty__Group_3__0 )? ) ;
    public final void rule__DeclaredProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1172:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) )
            // InternalMwe2Parser.g:1173:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            {
            // InternalMwe2Parser.g:1173:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // InternalMwe2Parser.g:1174:1: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // InternalMwe2Parser.g:1175:1: ( rule__DeclaredProperty__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSign) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:1175:2: rule__DeclaredProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaredProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group__3__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group_3__0"
    // InternalMwe2Parser.g:1193:1: rule__DeclaredProperty__Group_3__0 : rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1197:1: ( rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 )
            // InternalMwe2Parser.g:1198:2: rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__DeclaredProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__0"


    // $ANTLR start "rule__DeclaredProperty__Group_3__0__Impl"
    // InternalMwe2Parser.g:1205:1: rule__DeclaredProperty__Group_3__0__Impl : ( EqualsSign ) ;
    public final void rule__DeclaredProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1209:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1210:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1210:1: ( EqualsSign )
            // InternalMwe2Parser.g:1211:1: EqualsSign
            {
             before(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__0__Impl"


    // $ANTLR start "rule__DeclaredProperty__Group_3__1"
    // InternalMwe2Parser.g:1224:1: rule__DeclaredProperty__Group_3__1 : rule__DeclaredProperty__Group_3__1__Impl ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1228:1: ( rule__DeclaredProperty__Group_3__1__Impl )
            // InternalMwe2Parser.g:1229:2: rule__DeclaredProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__Group_3__1"


    // $ANTLR start "rule__DeclaredProperty__Group_3__1__Impl"
    // InternalMwe2Parser.g:1235:1: rule__DeclaredProperty__Group_3__1__Impl : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1239:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // InternalMwe2Parser.g:1240:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // InternalMwe2Parser.g:1240:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // InternalMwe2Parser.g:1241:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // InternalMwe2Parser.g:1242:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // InternalMwe2Parser.g:1242:2: rule__DeclaredProperty__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredProperty__DefaultAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__DeclaredProperty__Group_3__1__Impl"


    // $ANTLR start "rule__RootComponent__Group__0"
    // InternalMwe2Parser.g:1256:1: rule__RootComponent__Group__0 : rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 ;
    public final void rule__RootComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1260:1: ( rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 )
            // InternalMwe2Parser.g:1261:2: rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RootComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__0"


    // $ANTLR start "rule__RootComponent__Group__0__Impl"
    // InternalMwe2Parser.g:1268:1: rule__RootComponent__Group__0__Impl : ( () ) ;
    public final void rule__RootComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1272:1: ( ( () ) )
            // InternalMwe2Parser.g:1273:1: ( () )
            {
            // InternalMwe2Parser.g:1273:1: ( () )
            // InternalMwe2Parser.g:1274:1: ()
            {
             before(grammarAccess.getRootComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1275:1: ()
            // InternalMwe2Parser.g:1277:1: 
            {
            }

             after(grammarAccess.getRootComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__0__Impl"


    // $ANTLR start "rule__RootComponent__Group__1"
    // InternalMwe2Parser.g:1287:1: rule__RootComponent__Group__1 : rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 ;
    public final void rule__RootComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1291:1: ( rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 )
            // InternalMwe2Parser.g:1292:2: rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RootComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__1"


    // $ANTLR start "rule__RootComponent__Group__1__Impl"
    // InternalMwe2Parser.g:1299:1: rule__RootComponent__Group__1__Impl : ( ( rule__RootComponent__Alternatives_1 ) ) ;
    public final void rule__RootComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1303:1: ( ( ( rule__RootComponent__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:1304:1: ( ( rule__RootComponent__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:1304:1: ( ( rule__RootComponent__Alternatives_1 ) )
            // InternalMwe2Parser.g:1305:1: ( rule__RootComponent__Alternatives_1 )
            {
             before(grammarAccess.getRootComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1306:1: ( rule__RootComponent__Alternatives_1 )
            // InternalMwe2Parser.g:1306:2: rule__RootComponent__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__1__Impl"


    // $ANTLR start "rule__RootComponent__Group__2"
    // InternalMwe2Parser.g:1316:1: rule__RootComponent__Group__2 : rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 ;
    public final void rule__RootComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1320:1: ( rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 )
            // InternalMwe2Parser.g:1321:2: rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RootComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__2"


    // $ANTLR start "rule__RootComponent__Group__2__Impl"
    // InternalMwe2Parser.g:1328:1: rule__RootComponent__Group__2__Impl : ( ( rule__RootComponent__Group_2__0 )? ) ;
    public final void rule__RootComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1332:1: ( ( ( rule__RootComponent__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1333:1: ( ( rule__RootComponent__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1333:1: ( ( rule__RootComponent__Group_2__0 )? )
            // InternalMwe2Parser.g:1334:1: ( rule__RootComponent__Group_2__0 )?
            {
             before(grammarAccess.getRootComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1335:1: ( rule__RootComponent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Colon) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMwe2Parser.g:1335:2: rule__RootComponent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootComponent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__2__Impl"


    // $ANTLR start "rule__RootComponent__Group__3"
    // InternalMwe2Parser.g:1345:1: rule__RootComponent__Group__3 : rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 ;
    public final void rule__RootComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1349:1: ( rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 )
            // InternalMwe2Parser.g:1350:2: rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__RootComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__3"


    // $ANTLR start "rule__RootComponent__Group__3__Impl"
    // InternalMwe2Parser.g:1357:1: rule__RootComponent__Group__3__Impl : ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) ;
    public final void rule__RootComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1361:1: ( ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1362:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1362:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1363:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1364:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AutoInject) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:1364:2: rule__RootComponent__AutoInjectAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootComponent__AutoInjectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__3__Impl"


    // $ANTLR start "rule__RootComponent__Group__4"
    // InternalMwe2Parser.g:1374:1: rule__RootComponent__Group__4 : rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 ;
    public final void rule__RootComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1378:1: ( rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 )
            // InternalMwe2Parser.g:1379:2: rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RootComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__4"


    // $ANTLR start "rule__RootComponent__Group__4__Impl"
    // InternalMwe2Parser.g:1386:1: rule__RootComponent__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RootComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1390:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1391:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1391:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1392:1: LeftCurlyBracket
            {
             before(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__4__Impl"


    // $ANTLR start "rule__RootComponent__Group__5"
    // InternalMwe2Parser.g:1405:1: rule__RootComponent__Group__5 : rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 ;
    public final void rule__RootComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1409:1: ( rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 )
            // InternalMwe2Parser.g:1410:2: rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__RootComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__5"


    // $ANTLR start "rule__RootComponent__Group__5__Impl"
    // InternalMwe2Parser.g:1417:1: rule__RootComponent__Group__5__Impl : ( ( rule__RootComponent__AssignmentAssignment_5 )* ) ;
    public final void rule__RootComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1421:1: ( ( ( rule__RootComponent__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1422:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1422:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1423:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1424:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMwe2Parser.g:1424:2: rule__RootComponent__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RootComponent__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__5__Impl"


    // $ANTLR start "rule__RootComponent__Group__6"
    // InternalMwe2Parser.g:1434:1: rule__RootComponent__Group__6 : rule__RootComponent__Group__6__Impl ;
    public final void rule__RootComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1438:1: ( rule__RootComponent__Group__6__Impl )
            // InternalMwe2Parser.g:1439:2: rule__RootComponent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__6"


    // $ANTLR start "rule__RootComponent__Group__6__Impl"
    // InternalMwe2Parser.g:1445:1: rule__RootComponent__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__RootComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1449:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1450:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1450:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1451:1: RightCurlyBracket
            {
             before(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group__6__Impl"


    // $ANTLR start "rule__RootComponent__Group_1_1__0"
    // InternalMwe2Parser.g:1478:1: rule__RootComponent__Group_1_1__0 : rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 ;
    public final void rule__RootComponent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1482:1: ( rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 )
            // InternalMwe2Parser.g:1483:2: rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RootComponent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__0"


    // $ANTLR start "rule__RootComponent__Group_1_1__0__Impl"
    // InternalMwe2Parser.g:1490:1: rule__RootComponent__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__RootComponent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1494:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1495:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1495:1: ( CommercialAt )
            // InternalMwe2Parser.g:1496:1: CommercialAt
            {
             before(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); 
            match(input,CommercialAt,FOLLOW_2); 
             after(grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__0__Impl"


    // $ANTLR start "rule__RootComponent__Group_1_1__1"
    // InternalMwe2Parser.g:1509:1: rule__RootComponent__Group_1_1__1 : rule__RootComponent__Group_1_1__1__Impl ;
    public final void rule__RootComponent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1513:1: ( rule__RootComponent__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1514:2: rule__RootComponent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__1"


    // $ANTLR start "rule__RootComponent__Group_1_1__1__Impl"
    // InternalMwe2Parser.g:1520:1: rule__RootComponent__Group_1_1__1__Impl : ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__RootComponent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1524:1: ( ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1525:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1525:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1526:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1527:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1527:2: rule__RootComponent__ModuleAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__ModuleAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_1_1__1__Impl"


    // $ANTLR start "rule__RootComponent__Group_2__0"
    // InternalMwe2Parser.g:1541:1: rule__RootComponent__Group_2__0 : rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 ;
    public final void rule__RootComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1545:1: ( rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 )
            // InternalMwe2Parser.g:1546:2: rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RootComponent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootComponent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__0"


    // $ANTLR start "rule__RootComponent__Group_2__0__Impl"
    // InternalMwe2Parser.g:1553:1: rule__RootComponent__Group_2__0__Impl : ( Colon ) ;
    public final void rule__RootComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1557:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1558:1: ( Colon )
            {
            // InternalMwe2Parser.g:1558:1: ( Colon )
            // InternalMwe2Parser.g:1559:1: Colon
            {
             before(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRootComponentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__0__Impl"


    // $ANTLR start "rule__RootComponent__Group_2__1"
    // InternalMwe2Parser.g:1572:1: rule__RootComponent__Group_2__1 : rule__RootComponent__Group_2__1__Impl ;
    public final void rule__RootComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1576:1: ( rule__RootComponent__Group_2__1__Impl )
            // InternalMwe2Parser.g:1577:2: rule__RootComponent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__1"


    // $ANTLR start "rule__RootComponent__Group_2__1__Impl"
    // InternalMwe2Parser.g:1583:1: rule__RootComponent__Group_2__1__Impl : ( ( rule__RootComponent__NameAssignment_2_1 ) ) ;
    public final void rule__RootComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1587:1: ( ( ( rule__RootComponent__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1588:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1588:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1589:1: ( rule__RootComponent__NameAssignment_2_1 )
            {
             before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1590:1: ( rule__RootComponent__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1590:2: rule__RootComponent__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RootComponent__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalMwe2Parser.g:1604:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1608:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMwe2Parser.g:1609:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalMwe2Parser.g:1616:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1620:1: ( ( () ) )
            // InternalMwe2Parser.g:1621:1: ( () )
            {
            // InternalMwe2Parser.g:1621:1: ( () )
            // InternalMwe2Parser.g:1622:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1623:1: ()
            // InternalMwe2Parser.g:1625:1: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalMwe2Parser.g:1635:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1639:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMwe2Parser.g:1640:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalMwe2Parser.g:1647:1: rule__Component__Group__1__Impl : ( ( rule__Component__Alternatives_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1651:1: ( ( ( rule__Component__Alternatives_1 )? ) )
            // InternalMwe2Parser.g:1652:1: ( ( rule__Component__Alternatives_1 )? )
            {
            // InternalMwe2Parser.g:1652:1: ( ( rule__Component__Alternatives_1 )? )
            // InternalMwe2Parser.g:1653:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1654:1: ( rule__Component__Alternatives_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommercialAt||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMwe2Parser.g:1654:2: rule__Component__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalMwe2Parser.g:1664:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1668:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMwe2Parser.g:1669:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalMwe2Parser.g:1676:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1680:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1681:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1681:1: ( ( rule__Component__Group_2__0 )? )
            // InternalMwe2Parser.g:1682:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1683:1: ( rule__Component__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Colon) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMwe2Parser.g:1683:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalMwe2Parser.g:1693:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1697:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMwe2Parser.g:1698:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalMwe2Parser.g:1705:1: rule__Component__Group__3__Impl : ( ( rule__Component__AutoInjectAssignment_3 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1709:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1710:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1710:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1711:1: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1712:1: ( rule__Component__AutoInjectAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AutoInject) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMwe2Parser.g:1712:2: rule__Component__AutoInjectAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__AutoInjectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalMwe2Parser.g:1722:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1726:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMwe2Parser.g:1727:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalMwe2Parser.g:1734:1: rule__Component__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1738:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1739:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1739:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1740:1: LeftCurlyBracket
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalMwe2Parser.g:1753:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1757:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMwe2Parser.g:1758:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalMwe2Parser.g:1765:1: rule__Component__Group__5__Impl : ( ( rule__Component__AssignmentAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1769:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1770:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1770:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1771:1: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1772:1: ( rule__Component__AssignmentAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMwe2Parser.g:1772:2: rule__Component__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalMwe2Parser.g:1782:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1786:1: ( rule__Component__Group__6__Impl )
            // InternalMwe2Parser.g:1787:2: rule__Component__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalMwe2Parser.g:1793:1: rule__Component__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1797:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1798:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1798:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1799:1: RightCurlyBracket
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group_1_1__0"
    // InternalMwe2Parser.g:1826:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1830:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // InternalMwe2Parser.g:1831:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0"


    // $ANTLR start "rule__Component__Group_1_1__0__Impl"
    // InternalMwe2Parser.g:1838:1: rule__Component__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1842:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1843:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1843:1: ( CommercialAt )
            // InternalMwe2Parser.g:1844:1: CommercialAt
            {
             before(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 
            match(input,CommercialAt,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__0__Impl"


    // $ANTLR start "rule__Component__Group_1_1__1"
    // InternalMwe2Parser.g:1857:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1861:1: ( rule__Component__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1862:2: rule__Component__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_1_1__1"


    // $ANTLR start "rule__Component__Group_1_1__1__Impl"
    // InternalMwe2Parser.g:1868:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1872:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1873:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1873:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1874:1: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1875:1: ( rule__Component__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1875:2: rule__Component__ModuleAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ModuleAssignment_1_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_1_1__1__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalMwe2Parser.g:1889:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1893:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalMwe2Parser.g:1894:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // InternalMwe2Parser.g:1901:1: rule__Component__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1905:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1906:1: ( Colon )
            {
            // InternalMwe2Parser.g:1906:1: ( Colon )
            // InternalMwe2Parser.g:1907:1: Colon
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_2_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalMwe2Parser.g:1920:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1924:1: ( rule__Component__Group_2__1__Impl )
            // InternalMwe2Parser.g:1925:2: rule__Component__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // InternalMwe2Parser.g:1931:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1935:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1936:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1936:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1937:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1938:1: ( rule__Component__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1938:2: rule__Component__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMwe2Parser.g:1952:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1956:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMwe2Parser.g:1957:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMwe2Parser.g:1964:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1968:1: ( ( Import ) )
            // InternalMwe2Parser.g:1969:1: ( Import )
            {
            // InternalMwe2Parser.g:1969:1: ( Import )
            // InternalMwe2Parser.g:1970:1: Import
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,Import,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMwe2Parser.g:1983:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1987:1: ( rule__Import__Group__1__Impl )
            // InternalMwe2Parser.g:1988:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMwe2Parser.g:1994:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1998:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMwe2Parser.g:1999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMwe2Parser.g:1999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMwe2Parser.g:2000:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMwe2Parser.g:2001:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMwe2Parser.g:2001:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__0"
    // InternalMwe2Parser.g:2015:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2019:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalMwe2Parser.g:2020:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ImportedFQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0"


    // $ANTLR start "rule__ImportedFQN__Group__0__Impl"
    // InternalMwe2Parser.g:2027:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2031:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2032:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2032:1: ( ruleFQN )
            // InternalMwe2Parser.g:2033:1: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__1"
    // InternalMwe2Parser.g:2044:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2048:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalMwe2Parser.g:2049:2: rule__ImportedFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1"


    // $ANTLR start "rule__ImportedFQN__Group__1__Impl"
    // InternalMwe2Parser.g:2055:1: rule__ImportedFQN__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2059:1: ( ( ( FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:2060:1: ( ( FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:2060:1: ( ( FullStopAsterisk )? )
            // InternalMwe2Parser.g:2061:1: ( FullStopAsterisk )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMwe2Parser.g:2062:1: ( FullStopAsterisk )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FullStopAsterisk) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMwe2Parser.g:2063:2: FullStopAsterisk
                    {
                    match(input,FullStopAsterisk,FOLLOW_2); 

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
    // $ANTLR end "rule__ImportedFQN__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMwe2Parser.g:2078:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2082:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMwe2Parser.g:2083:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMwe2Parser.g:2090:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__FeatureAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2094:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) )
            // InternalMwe2Parser.g:2095:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            {
            // InternalMwe2Parser.g:2095:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // InternalMwe2Parser.g:2096:1: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // InternalMwe2Parser.g:2097:1: ( rule__Assignment__FeatureAssignment_0 )
            // InternalMwe2Parser.g:2097:2: rule__Assignment__FeatureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__FeatureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMwe2Parser.g:2107:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2111:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMwe2Parser.g:2112:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMwe2Parser.g:2119:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2123:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:2124:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:2124:1: ( EqualsSign )
            // InternalMwe2Parser.g:2125:1: EqualsSign
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMwe2Parser.g:2138:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2142:1: ( rule__Assignment__Group__2__Impl )
            // InternalMwe2Parser.g:2143:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMwe2Parser.g:2149:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2153:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMwe2Parser.g:2154:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMwe2Parser.g:2154:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMwe2Parser.g:2155:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMwe2Parser.g:2156:1: ( rule__Assignment__ValueAssignment_2 )
            // InternalMwe2Parser.g:2156:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__NullLiteral__Group__0"
    // InternalMwe2Parser.g:2172:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2176:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // InternalMwe2Parser.g:2177:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0"


    // $ANTLR start "rule__NullLiteral__Group__0__Impl"
    // InternalMwe2Parser.g:2184:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2188:1: ( ( () ) )
            // InternalMwe2Parser.g:2189:1: ( () )
            {
            // InternalMwe2Parser.g:2189:1: ( () )
            // InternalMwe2Parser.g:2190:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // InternalMwe2Parser.g:2191:1: ()
            // InternalMwe2Parser.g:2193:1: 
            {
            }

             after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0__Impl"


    // $ANTLR start "rule__NullLiteral__Group__1"
    // InternalMwe2Parser.g:2203:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2207:1: ( rule__NullLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2208:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1"


    // $ANTLR start "rule__NullLiteral__Group__1__Impl"
    // InternalMwe2Parser.g:2214:1: rule__NullLiteral__Group__1__Impl : ( Null ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2218:1: ( ( Null ) )
            // InternalMwe2Parser.g:2219:1: ( Null )
            {
            // InternalMwe2Parser.g:2219:1: ( Null )
            // InternalMwe2Parser.g:2220:1: Null
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 
            match(input,Null,FOLLOW_2); 
             after(grammarAccess.getNullLiteralAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1__Impl"


    // $ANTLR start "rule__DoubleValue__Group__0"
    // InternalMwe2Parser.g:2237:1: rule__DoubleValue__Group__0 : rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 ;
    public final void rule__DoubleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2241:1: ( rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 )
            // InternalMwe2Parser.g:2242:2: rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DoubleValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__0"


    // $ANTLR start "rule__DoubleValue__Group__0__Impl"
    // InternalMwe2Parser.g:2249:1: rule__DoubleValue__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DoubleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2253:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2254:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2254:1: ( RULE_INT )
            // InternalMwe2Parser.g:2255:1: RULE_INT
            {
             before(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__0__Impl"


    // $ANTLR start "rule__DoubleValue__Group__1"
    // InternalMwe2Parser.g:2266:1: rule__DoubleValue__Group__1 : rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 ;
    public final void rule__DoubleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2270:1: ( rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 )
            // InternalMwe2Parser.g:2271:2: rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DoubleValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__1"


    // $ANTLR start "rule__DoubleValue__Group__1__Impl"
    // InternalMwe2Parser.g:2278:1: rule__DoubleValue__Group__1__Impl : ( FullStop ) ;
    public final void rule__DoubleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2282:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2283:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2283:1: ( FullStop )
            // InternalMwe2Parser.g:2284:1: FullStop
            {
             before(grammarAccess.getDoubleValueAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getDoubleValueAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__1__Impl"


    // $ANTLR start "rule__DoubleValue__Group__2"
    // InternalMwe2Parser.g:2297:1: rule__DoubleValue__Group__2 : rule__DoubleValue__Group__2__Impl ;
    public final void rule__DoubleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2301:1: ( rule__DoubleValue__Group__2__Impl )
            // InternalMwe2Parser.g:2302:2: rule__DoubleValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__2"


    // $ANTLR start "rule__DoubleValue__Group__2__Impl"
    // InternalMwe2Parser.g:2308:1: rule__DoubleValue__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2312:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2313:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2313:1: ( RULE_INT )
            // InternalMwe2Parser.g:2314:1: RULE_INT
            {
             before(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__Group__2__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalMwe2Parser.g:2331:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2335:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalMwe2Parser.g:2336:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // InternalMwe2Parser.g:2343:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2347:1: ( ( () ) )
            // InternalMwe2Parser.g:2348:1: ( () )
            {
            // InternalMwe2Parser.g:2348:1: ( () )
            // InternalMwe2Parser.g:2349:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalMwe2Parser.g:2350:1: ()
            // InternalMwe2Parser.g:2352:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // InternalMwe2Parser.g:2362:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2366:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2367:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // InternalMwe2Parser.g:2373:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2377:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:2378:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:2378:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalMwe2Parser.g:2379:1: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:2380:1: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalMwe2Parser.g:2380:2: rule__BooleanLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Alternatives_1();

            state._fsp--;


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
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalMwe2Parser.g:2394:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2398:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMwe2Parser.g:2399:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalMwe2Parser.g:2406:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2410:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2411:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2411:1: ( RULE_ID )
            // InternalMwe2Parser.g:2412:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalMwe2Parser.g:2423:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2427:1: ( rule__FQN__Group__1__Impl )
            // InternalMwe2Parser.g:2428:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalMwe2Parser.g:2434:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2438:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMwe2Parser.g:2439:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMwe2Parser.g:2439:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMwe2Parser.g:2440:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMwe2Parser.g:2441:1: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==FullStop) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMwe2Parser.g:2441:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalMwe2Parser.g:2455:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2459:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMwe2Parser.g:2460:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalMwe2Parser.g:2467:1: rule__FQN__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2471:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2472:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2472:1: ( FullStop )
            // InternalMwe2Parser.g:2473:1: FullStop
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalMwe2Parser.g:2486:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2490:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMwe2Parser.g:2491:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalMwe2Parser.g:2497:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2501:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2502:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2502:1: ( RULE_ID )
            // InternalMwe2Parser.g:2503:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__0"
    // InternalMwe2Parser.g:2518:1: rule__StringLiteral__Group_0__0 : rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 ;
    public final void rule__StringLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2522:1: ( rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 )
            // InternalMwe2Parser.g:2523:2: rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__StringLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__0"


    // $ANTLR start "rule__StringLiteral__Group_0__0__Impl"
    // InternalMwe2Parser.g:2530:1: rule__StringLiteral__Group_0__0__Impl : ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) ;
    public final void rule__StringLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2534:1: ( ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) )
            // InternalMwe2Parser.g:2535:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            {
            // InternalMwe2Parser.g:2535:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            // InternalMwe2Parser.g:2536:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 
            // InternalMwe2Parser.g:2537:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            // InternalMwe2Parser.g:2537:2: rule__StringLiteral__BeginAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__BeginAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__1"
    // InternalMwe2Parser.g:2547:1: rule__StringLiteral__Group_0__1 : rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 ;
    public final void rule__StringLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2551:1: ( rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 )
            // InternalMwe2Parser.g:2552:2: rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__StringLiteral__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__1"


    // $ANTLR start "rule__StringLiteral__Group_0__1__Impl"
    // InternalMwe2Parser.g:2559:1: rule__StringLiteral__Group_0__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) ;
    public final void rule__StringLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2563:1: ( ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) )
            // InternalMwe2Parser.g:2564:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            {
            // InternalMwe2Parser.g:2564:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            // InternalMwe2Parser.g:2565:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 
            // InternalMwe2Parser.g:2566:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA21_0>=ReverseSolidusQuotationMark && LA21_0<=ReverseSolidusReverseSolidus)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMwe2Parser.g:2566:2: rule__StringLiteral__PartsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__PartsAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__2"
    // InternalMwe2Parser.g:2576:1: rule__StringLiteral__Group_0__2 : rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 ;
    public final void rule__StringLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2580:1: ( rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 )
            // InternalMwe2Parser.g:2581:2: rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__StringLiteral__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__2"


    // $ANTLR start "rule__StringLiteral__Group_0__2__Impl"
    // InternalMwe2Parser.g:2588:1: rule__StringLiteral__Group_0__2__Impl : ( ( rule__StringLiteral__Group_0_2__0 )* ) ;
    public final void rule__StringLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2592:1: ( ( ( rule__StringLiteral__Group_0_2__0 )* ) )
            // InternalMwe2Parser.g:2593:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            {
            // InternalMwe2Parser.g:2593:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            // InternalMwe2Parser.g:2594:1: ( rule__StringLiteral__Group_0_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 
            // InternalMwe2Parser.g:2595:1: ( rule__StringLiteral__Group_0_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DollarSignLeftCurlyBracket) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMwe2Parser.g:2595:2: rule__StringLiteral__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__StringLiteral__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0__3"
    // InternalMwe2Parser.g:2605:1: rule__StringLiteral__Group_0__3 : rule__StringLiteral__Group_0__3__Impl ;
    public final void rule__StringLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2609:1: ( rule__StringLiteral__Group_0__3__Impl )
            // InternalMwe2Parser.g:2610:2: rule__StringLiteral__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__3"


    // $ANTLR start "rule__StringLiteral__Group_0__3__Impl"
    // InternalMwe2Parser.g:2616:1: rule__StringLiteral__Group_0__3__Impl : ( ( rule__StringLiteral__EndAssignment_0_3 ) ) ;
    public final void rule__StringLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2620:1: ( ( ( rule__StringLiteral__EndAssignment_0_3 ) ) )
            // InternalMwe2Parser.g:2621:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            {
            // InternalMwe2Parser.g:2621:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            // InternalMwe2Parser.g:2622:1: ( rule__StringLiteral__EndAssignment_0_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 
            // InternalMwe2Parser.g:2623:1: ( rule__StringLiteral__EndAssignment_0_3 )
            // InternalMwe2Parser.g:2623:2: rule__StringLiteral__EndAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__EndAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0__3__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0_2__0"
    // InternalMwe2Parser.g:2641:1: rule__StringLiteral__Group_0_2__0 : rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 ;
    public final void rule__StringLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2645:1: ( rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 )
            // InternalMwe2Parser.g:2646:2: rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1
            {
            pushFollow(FOLLOW_23);
            rule__StringLiteral__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__0"


    // $ANTLR start "rule__StringLiteral__Group_0_2__0__Impl"
    // InternalMwe2Parser.g:2653:1: rule__StringLiteral__Group_0_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) ;
    public final void rule__StringLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2657:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) )
            // InternalMwe2Parser.g:2658:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            {
            // InternalMwe2Parser.g:2658:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            // InternalMwe2Parser.g:2659:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 
            // InternalMwe2Parser.g:2660:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            // InternalMwe2Parser.g:2660:2: rule__StringLiteral__PartsAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__PartsAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_0_2__1"
    // InternalMwe2Parser.g:2670:1: rule__StringLiteral__Group_0_2__1 : rule__StringLiteral__Group_0_2__1__Impl ;
    public final void rule__StringLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2674:1: ( rule__StringLiteral__Group_0_2__1__Impl )
            // InternalMwe2Parser.g:2675:2: rule__StringLiteral__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__1"


    // $ANTLR start "rule__StringLiteral__Group_0_2__1__Impl"
    // InternalMwe2Parser.g:2681:1: rule__StringLiteral__Group_0_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) ;
    public final void rule__StringLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2685:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) )
            // InternalMwe2Parser.g:2686:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            {
            // InternalMwe2Parser.g:2686:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            // InternalMwe2Parser.g:2687:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 
            // InternalMwe2Parser.g:2688:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA23_0>=ReverseSolidusQuotationMark && LA23_0<=ReverseSolidusReverseSolidus)||LA23_0==RULE_ID||(LA23_0>=RULE_WS && LA23_0<=RULE_ANY_OTHER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMwe2Parser.g:2688:2: rule__StringLiteral__PartsAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__PartsAssignment_0_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_0_2__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__0"
    // InternalMwe2Parser.g:2702:1: rule__StringLiteral__Group_1__0 : rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 ;
    public final void rule__StringLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2706:1: ( rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 )
            // InternalMwe2Parser.g:2707:2: rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__StringLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__0"


    // $ANTLR start "rule__StringLiteral__Group_1__0__Impl"
    // InternalMwe2Parser.g:2714:1: rule__StringLiteral__Group_1__0__Impl : ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) ;
    public final void rule__StringLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2718:1: ( ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) )
            // InternalMwe2Parser.g:2719:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            {
            // InternalMwe2Parser.g:2719:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            // InternalMwe2Parser.g:2720:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 
            // InternalMwe2Parser.g:2721:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            // InternalMwe2Parser.g:2721:2: rule__StringLiteral__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__BeginAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__1"
    // InternalMwe2Parser.g:2731:1: rule__StringLiteral__Group_1__1 : rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 ;
    public final void rule__StringLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2735:1: ( rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 )
            // InternalMwe2Parser.g:2736:2: rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__StringLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__1"


    // $ANTLR start "rule__StringLiteral__Group_1__1__Impl"
    // InternalMwe2Parser.g:2743:1: rule__StringLiteral__Group_1__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) ;
    public final void rule__StringLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2747:1: ( ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) )
            // InternalMwe2Parser.g:2748:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            {
            // InternalMwe2Parser.g:2748:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            // InternalMwe2Parser.g:2749:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 
            // InternalMwe2Parser.g:2750:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA24_0>=ReverseSolidusQuotationMark && LA24_0<=ReverseSolidusReverseSolidus)||LA24_0==RULE_ID||(LA24_0>=RULE_WS && LA24_0<=RULE_ANY_OTHER)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMwe2Parser.g:2750:2: rule__StringLiteral__PartsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__PartsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__2"
    // InternalMwe2Parser.g:2760:1: rule__StringLiteral__Group_1__2 : rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 ;
    public final void rule__StringLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2764:1: ( rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 )
            // InternalMwe2Parser.g:2765:2: rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3
            {
            pushFollow(FOLLOW_24);
            rule__StringLiteral__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__2"


    // $ANTLR start "rule__StringLiteral__Group_1__2__Impl"
    // InternalMwe2Parser.g:2772:1: rule__StringLiteral__Group_1__2__Impl : ( ( rule__StringLiteral__Group_1_2__0 )* ) ;
    public final void rule__StringLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2776:1: ( ( ( rule__StringLiteral__Group_1_2__0 )* ) )
            // InternalMwe2Parser.g:2777:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            {
            // InternalMwe2Parser.g:2777:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            // InternalMwe2Parser.g:2778:1: ( rule__StringLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 
            // InternalMwe2Parser.g:2779:1: ( rule__StringLiteral__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DollarSignLeftCurlyBracket) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMwe2Parser.g:2779:2: rule__StringLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__StringLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1__3"
    // InternalMwe2Parser.g:2789:1: rule__StringLiteral__Group_1__3 : rule__StringLiteral__Group_1__3__Impl ;
    public final void rule__StringLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2793:1: ( rule__StringLiteral__Group_1__3__Impl )
            // InternalMwe2Parser.g:2794:2: rule__StringLiteral__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__3"


    // $ANTLR start "rule__StringLiteral__Group_1__3__Impl"
    // InternalMwe2Parser.g:2800:1: rule__StringLiteral__Group_1__3__Impl : ( ( rule__StringLiteral__EndAssignment_1_3 ) ) ;
    public final void rule__StringLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2804:1: ( ( ( rule__StringLiteral__EndAssignment_1_3 ) ) )
            // InternalMwe2Parser.g:2805:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            {
            // InternalMwe2Parser.g:2805:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            // InternalMwe2Parser.g:2806:1: ( rule__StringLiteral__EndAssignment_1_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 
            // InternalMwe2Parser.g:2807:1: ( rule__StringLiteral__EndAssignment_1_3 )
            // InternalMwe2Parser.g:2807:2: rule__StringLiteral__EndAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__EndAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1__3__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1_2__0"
    // InternalMwe2Parser.g:2825:1: rule__StringLiteral__Group_1_2__0 : rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 ;
    public final void rule__StringLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2829:1: ( rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 )
            // InternalMwe2Parser.g:2830:2: rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_23);
            rule__StringLiteral__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__0"


    // $ANTLR start "rule__StringLiteral__Group_1_2__0__Impl"
    // InternalMwe2Parser.g:2837:1: rule__StringLiteral__Group_1_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) ;
    public final void rule__StringLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2841:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) )
            // InternalMwe2Parser.g:2842:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            {
            // InternalMwe2Parser.g:2842:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            // InternalMwe2Parser.g:2843:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 
            // InternalMwe2Parser.g:2844:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            // InternalMwe2Parser.g:2844:2: rule__StringLiteral__PartsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__PartsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group_1_2__1"
    // InternalMwe2Parser.g:2854:1: rule__StringLiteral__Group_1_2__1 : rule__StringLiteral__Group_1_2__1__Impl ;
    public final void rule__StringLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2858:1: ( rule__StringLiteral__Group_1_2__1__Impl )
            // InternalMwe2Parser.g:2859:2: rule__StringLiteral__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__1"


    // $ANTLR start "rule__StringLiteral__Group_1_2__1__Impl"
    // InternalMwe2Parser.g:2865:1: rule__StringLiteral__Group_1_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) ;
    public final void rule__StringLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2869:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) )
            // InternalMwe2Parser.g:2870:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            {
            // InternalMwe2Parser.g:2870:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            // InternalMwe2Parser.g:2871:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 
            // InternalMwe2Parser.g:2872:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA26_0>=ReverseSolidusQuotationMark && LA26_0<=ReverseSolidusReverseSolidus)||LA26_0==RULE_ID||(LA26_0>=RULE_WS && LA26_0<=RULE_ANY_OTHER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMwe2Parser.g:2872:2: rule__StringLiteral__PartsAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringLiteral__PartsAssignment_1_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group_1_2__1__Impl"


    // $ANTLR start "rule__PropertyReference__Group__0"
    // InternalMwe2Parser.g:2886:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2890:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // InternalMwe2Parser.g:2891:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PropertyReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0"


    // $ANTLR start "rule__PropertyReference__Group__0__Impl"
    // InternalMwe2Parser.g:2898:1: rule__PropertyReference__Group__0__Impl : ( DollarSignLeftCurlyBracket ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2902:1: ( ( DollarSignLeftCurlyBracket ) )
            // InternalMwe2Parser.g:2903:1: ( DollarSignLeftCurlyBracket )
            {
            // InternalMwe2Parser.g:2903:1: ( DollarSignLeftCurlyBracket )
            // InternalMwe2Parser.g:2904:1: DollarSignLeftCurlyBracket
            {
             before(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,DollarSignLeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0__Impl"


    // $ANTLR start "rule__PropertyReference__Group__1"
    // InternalMwe2Parser.g:2917:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2921:1: ( rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 )
            // InternalMwe2Parser.g:2922:2: rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__PropertyReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1"


    // $ANTLR start "rule__PropertyReference__Group__1__Impl"
    // InternalMwe2Parser.g:2929:1: rule__PropertyReference__Group__1__Impl : ( rulePropertyReferenceImpl ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2933:1: ( ( rulePropertyReferenceImpl ) )
            // InternalMwe2Parser.g:2934:1: ( rulePropertyReferenceImpl )
            {
            // InternalMwe2Parser.g:2934:1: ( rulePropertyReferenceImpl )
            // InternalMwe2Parser.g:2935:1: rulePropertyReferenceImpl
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePropertyReferenceImpl();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1__Impl"


    // $ANTLR start "rule__PropertyReference__Group__2"
    // InternalMwe2Parser.g:2946:1: rule__PropertyReference__Group__2 : rule__PropertyReference__Group__2__Impl ;
    public final void rule__PropertyReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2950:1: ( rule__PropertyReference__Group__2__Impl )
            // InternalMwe2Parser.g:2951:2: rule__PropertyReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__2"


    // $ANTLR start "rule__PropertyReference__Group__2__Impl"
    // InternalMwe2Parser.g:2957:1: rule__PropertyReference__Group__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__PropertyReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2961:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:2962:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:2962:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:2963:1: RightCurlyBracket
            {
             before(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__2__Impl"


    // $ANTLR start "rule__Module__CanonicalNameAssignment_2"
    // InternalMwe2Parser.g:2983:1: rule__Module__CanonicalNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2987:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2988:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2988:1: ( ruleFQN )
            // InternalMwe2Parser.g:2989:1: ruleFQN
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__CanonicalNameAssignment_2"


    // $ANTLR start "rule__Module__ImportsAssignment_3"
    // InternalMwe2Parser.g:2998:1: rule__Module__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3002:1: ( ( ruleImport ) )
            // InternalMwe2Parser.g:3003:1: ( ruleImport )
            {
            // InternalMwe2Parser.g:3003:1: ( ruleImport )
            // InternalMwe2Parser.g:3004:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ImportsAssignment_3"


    // $ANTLR start "rule__Module__DeclaredPropertiesAssignment_4"
    // InternalMwe2Parser.g:3013:1: rule__Module__DeclaredPropertiesAssignment_4 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3017:1: ( ( ruleDeclaredProperty ) )
            // InternalMwe2Parser.g:3018:1: ( ruleDeclaredProperty )
            {
            // InternalMwe2Parser.g:3018:1: ( ruleDeclaredProperty )
            // InternalMwe2Parser.g:3019:1: ruleDeclaredProperty
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredProperty();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__DeclaredPropertiesAssignment_4"


    // $ANTLR start "rule__Module__RootAssignment_5"
    // InternalMwe2Parser.g:3028:1: rule__Module__RootAssignment_5 : ( ruleRootComponent ) ;
    public final void rule__Module__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3032:1: ( ( ruleRootComponent ) )
            // InternalMwe2Parser.g:3033:1: ( ruleRootComponent )
            {
            // InternalMwe2Parser.g:3033:1: ( ruleRootComponent )
            // InternalMwe2Parser.g:3034:1: ruleRootComponent
            {
             before(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRootComponent();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__RootAssignment_5"


    // $ANTLR start "rule__DeclaredProperty__TypeAssignment_1"
    // InternalMwe2Parser.g:3043:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3047:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3048:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3048:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3049:1: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
            // InternalMwe2Parser.g:3050:1: ( ruleFQN )
            // InternalMwe2Parser.g:3051:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredProperty__TypeAssignment_1"


    // $ANTLR start "rule__DeclaredProperty__NameAssignment_2"
    // InternalMwe2Parser.g:3062:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3066:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3067:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3067:1: ( ruleFQN )
            // InternalMwe2Parser.g:3068:1: ruleFQN
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

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
    // $ANTLR end "rule__DeclaredProperty__NameAssignment_2"


    // $ANTLR start "rule__DeclaredProperty__DefaultAssignment_3_1"
    // InternalMwe2Parser.g:3077:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3081:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3082:1: ( ruleValue )
            {
            // InternalMwe2Parser.g:3082:1: ( ruleValue )
            // InternalMwe2Parser.g:3083:1: ruleValue
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

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
    // $ANTLR end "rule__DeclaredProperty__DefaultAssignment_3_1"


    // $ANTLR start "rule__RootComponent__TypeAssignment_1_0"
    // InternalMwe2Parser.g:3092:1: rule__RootComponent__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3096:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3097:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3097:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3098:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:3099:1: ( ruleFQN )
            // InternalMwe2Parser.g:3100:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__TypeAssignment_1_0"


    // $ANTLR start "rule__RootComponent__ModuleAssignment_1_1_1"
    // InternalMwe2Parser.g:3111:1: rule__RootComponent__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3115:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3116:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3116:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3117:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:3118:1: ( ruleFQN )
            // InternalMwe2Parser.g:3119:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__ModuleAssignment_1_1_1"


    // $ANTLR start "rule__RootComponent__NameAssignment_2_1"
    // InternalMwe2Parser.g:3130:1: rule__RootComponent__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__RootComponent__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3134:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3135:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3135:1: ( ruleFQN )
            // InternalMwe2Parser.g:3136:1: ruleFQN
            {
             before(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__NameAssignment_2_1"


    // $ANTLR start "rule__RootComponent__AutoInjectAssignment_3"
    // InternalMwe2Parser.g:3145:1: rule__RootComponent__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__RootComponent__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3149:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:3150:1: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:3150:1: ( ( AutoInject ) )
            // InternalMwe2Parser.g:3151:1: ( AutoInject )
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:3152:1: ( AutoInject )
            // InternalMwe2Parser.g:3153:1: AutoInject
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            match(input,AutoInject,FOLLOW_2); 
             after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }

             after(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__AutoInjectAssignment_3"


    // $ANTLR start "rule__RootComponent__AssignmentAssignment_5"
    // InternalMwe2Parser.g:3168:1: rule__RootComponent__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__RootComponent__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3172:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:3173:1: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:3173:1: ( ruleAssignment )
            // InternalMwe2Parser.g:3174:1: ruleAssignment
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootComponent__AssignmentAssignment_5"


    // $ANTLR start "rule__Component__TypeAssignment_1_0"
    // InternalMwe2Parser.g:3183:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3187:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3188:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3188:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3189:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:3190:1: ( ruleFQN )
            // InternalMwe2Parser.g:3191:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getTypeJvmTypeFQNParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__TypeAssignment_1_0"


    // $ANTLR start "rule__Component__ModuleAssignment_1_1_1"
    // InternalMwe2Parser.g:3202:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3206:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3207:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3207:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3208:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:3209:1: ( ruleFQN )
            // InternalMwe2Parser.g:3210:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getModuleModuleFQNParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

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
    // $ANTLR end "rule__Component__ModuleAssignment_1_1_1"


    // $ANTLR start "rule__Component__NameAssignment_2_1"
    // InternalMwe2Parser.g:3221:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3225:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3226:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3226:1: ( ruleFQN )
            // InternalMwe2Parser.g:3227:1: ruleFQN
            {
             before(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

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
    // $ANTLR end "rule__Component__NameAssignment_2_1"


    // $ANTLR start "rule__Component__AutoInjectAssignment_3"
    // InternalMwe2Parser.g:3236:1: rule__Component__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3240:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:3241:1: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:3241:1: ( ( AutoInject ) )
            // InternalMwe2Parser.g:3242:1: ( AutoInject )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:3243:1: ( AutoInject )
            // InternalMwe2Parser.g:3244:1: AutoInject
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            match(input,AutoInject,FOLLOW_2); 
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
    // $ANTLR end "rule__Component__AutoInjectAssignment_3"


    // $ANTLR start "rule__Component__AssignmentAssignment_5"
    // InternalMwe2Parser.g:3259:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3263:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:3264:1: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:3264:1: ( ruleAssignment )
            // InternalMwe2Parser.g:3265:1: ruleAssignment
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

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
    // $ANTLR end "rule__Component__AssignmentAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMwe2Parser.g:3274:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3278:1: ( ( ruleImportedFQN ) )
            // InternalMwe2Parser.g:3279:1: ( ruleImportedFQN )
            {
            // InternalMwe2Parser.g:3279:1: ( ruleImportedFQN )
            // InternalMwe2Parser.g:3280:1: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedFQN();

            state._fsp--;

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Assignment__FeatureAssignment_0"
    // InternalMwe2Parser.g:3289:1: rule__Assignment__FeatureAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3293:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3294:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3294:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3295:1: ( ruleFQN )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
            // InternalMwe2Parser.g:3296:1: ( ruleFQN )
            // InternalMwe2Parser.g:3297:1: ruleFQN
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FeatureAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMwe2Parser.g:3308:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3312:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3313:1: ( ruleValue )
            {
            // InternalMwe2Parser.g:3313:1: ( ruleValue )
            // InternalMwe2Parser.g:3314:1: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

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
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__DoubleLiteral__ValueAssignment"
    // InternalMwe2Parser.g:3323:1: rule__DoubleLiteral__ValueAssignment : ( ruleDoubleValue ) ;
    public final void rule__DoubleLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3327:1: ( ( ruleDoubleValue ) )
            // InternalMwe2Parser.g:3328:1: ( ruleDoubleValue )
            {
            // InternalMwe2Parser.g:3328:1: ( ruleDoubleValue )
            // InternalMwe2Parser.g:3329:1: ruleDoubleValue
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDoubleValue();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalMwe2Parser.g:3338:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3342:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:3343:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:3343:1: ( RULE_INT )
            // InternalMwe2Parser.g:3344:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__IsTrueAssignment_1_0"
    // InternalMwe2Parser.g:3353:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( True ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3357:1: ( ( ( True ) ) )
            // InternalMwe2Parser.g:3358:1: ( ( True ) )
            {
            // InternalMwe2Parser.g:3358:1: ( ( True ) )
            // InternalMwe2Parser.g:3359:1: ( True )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3360:1: ( True )
            // InternalMwe2Parser.g:3361:1: True
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            match(input,True,FOLLOW_2); 
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
    // $ANTLR end "rule__BooleanLiteral__IsTrueAssignment_1_0"


    // $ANTLR start "rule__Reference__ReferableAssignment"
    // InternalMwe2Parser.g:3376:1: rule__Reference__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3380:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3381:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3381:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3382:1: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // InternalMwe2Parser.g:3383:1: ( ruleFQN )
            // InternalMwe2Parser.g:3384:1: ruleFQN
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Reference__ReferableAssignment"


    // $ANTLR start "rule__StringLiteral__BeginAssignment_0_0"
    // InternalMwe2Parser.g:3395:1: rule__StringLiteral__BeginAssignment_0_0 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3399:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3400:1: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3400:1: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3401:1: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            // InternalMwe2Parser.g:3402:1: ( Apostrophe )
            // InternalMwe2Parser.g:3403:1: Apostrophe
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            match(input,Apostrophe,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__BeginAssignment_0_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_1"
    // InternalMwe2Parser.g:3418:1: rule__StringLiteral__PartsAssignment_0_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3422:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3423:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3423:1: ( rulePlainString )
            // InternalMwe2Parser.g:3424:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_1"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_2_0"
    // InternalMwe2Parser.g:3433:1: rule__StringLiteral__PartsAssignment_0_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3437:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3438:1: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3438:1: ( rulePropertyReference )
            // InternalMwe2Parser.g:3439:1: rulePropertyReference
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_2_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_0_2_1"
    // InternalMwe2Parser.g:3448:1: rule__StringLiteral__PartsAssignment_0_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3452:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3453:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3453:1: ( rulePlainString )
            // InternalMwe2Parser.g:3454:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_0_2_1"


    // $ANTLR start "rule__StringLiteral__EndAssignment_0_3"
    // InternalMwe2Parser.g:3463:1: rule__StringLiteral__EndAssignment_0_3 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3467:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3468:1: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3468:1: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3469:1: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            // InternalMwe2Parser.g:3470:1: ( Apostrophe )
            // InternalMwe2Parser.g:3471:1: Apostrophe
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            match(input,Apostrophe,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__EndAssignment_0_3"


    // $ANTLR start "rule__StringLiteral__BeginAssignment_1_0"
    // InternalMwe2Parser.g:3486:1: rule__StringLiteral__BeginAssignment_1_0 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3490:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3491:1: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3491:1: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3492:1: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3493:1: ( QuotationMark )
            // InternalMwe2Parser.g:3494:1: QuotationMark
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            match(input,QuotationMark,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__BeginAssignment_1_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_1"
    // InternalMwe2Parser.g:3509:1: rule__StringLiteral__PartsAssignment_1_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3513:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3514:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3514:1: ( rulePlainString )
            // InternalMwe2Parser.g:3515:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_1"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_2_0"
    // InternalMwe2Parser.g:3524:1: rule__StringLiteral__PartsAssignment_1_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3528:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3529:1: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3529:1: ( rulePropertyReference )
            // InternalMwe2Parser.g:3530:1: rulePropertyReference
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_2_0"


    // $ANTLR start "rule__StringLiteral__PartsAssignment_1_2_1"
    // InternalMwe2Parser.g:3539:1: rule__StringLiteral__PartsAssignment_1_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3543:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3544:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3544:1: ( rulePlainString )
            // InternalMwe2Parser.g:3545:1: rulePlainString
            {
             before(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlainString();

            state._fsp--;

             after(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__PartsAssignment_1_2_1"


    // $ANTLR start "rule__StringLiteral__EndAssignment_1_3"
    // InternalMwe2Parser.g:3554:1: rule__StringLiteral__EndAssignment_1_3 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__EndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3558:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3559:1: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3559:1: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3560:1: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            // InternalMwe2Parser.g:3561:1: ( QuotationMark )
            // InternalMwe2Parser.g:3562:1: QuotationMark
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            match(input,QuotationMark,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 

            }

             after(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__EndAssignment_1_3"


    // $ANTLR start "rule__PropertyReferenceImpl__ReferableAssignment"
    // InternalMwe2Parser.g:3577:1: rule__PropertyReferenceImpl__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReferenceImpl__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3581:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3582:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3582:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3583:1: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            // InternalMwe2Parser.g:3584:1: ( ruleFQN )
            // InternalMwe2Parser.g:3585:1: ruleFQN
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReferenceImpl__ReferableAssignment"


    // $ANTLR start "rule__PlainString__ValueAssignment"
    // InternalMwe2Parser.g:3596:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3600:1: ( ( ruleConstantValue ) )
            // InternalMwe2Parser.g:3601:1: ( ruleConstantValue )
            {
            // InternalMwe2Parser.g:3601:1: ( ruleConstantValue )
            // InternalMwe2Parser.g:3602:1: ruleConstantValue
            {
             before(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConstantValue();

            state._fsp--;

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
    // $ANTLR end "rule__PlainString__ValueAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\10\3\uffff\1\12\5\uffff\1\10";
    static final String dfa_3s = "\2\4\3\uffff\1\13\1\uffff\1\31\3\uffff\1\4";
    static final String dfa_4s = "\1\32\1\31\3\uffff\1\31\1\uffff\1\31\3\uffff\1\31";
    static final String dfa_5s = "\2\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff\1\7\1\5\1\4\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\4\1\6\1\4\7\uffff\2\3\1\uffff\1\2\1\uffff\2\2\1\uffff\1\1\1\5",
            "\1\2\6\uffff\1\10\7\uffff\1\7\1\2\1\uffff\1\10\1\2\2\10",
            "",
            "",
            "",
            "\1\12\7\uffff\1\11\2\uffff\1\12\1\uffff\2\12",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\2\6\uffff\1\10\7\uffff\1\7\1\2\1\uffff\1\10\1\2\2\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "719:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );";
        }
    }
    static final String dfa_8s = "\11\uffff";
    static final String dfa_9s = "\1\uffff\1\4\1\uffff\1\7\1\uffff\1\4\2\uffff\1\7";
    static final String dfa_10s = "\1\31\1\13\1\31\1\4\1\uffff\1\13\1\31\1\uffff\1\4";
    static final String dfa_11s = "\4\31\1\uffff\2\31\1\uffff\1\31";
    static final String dfa_12s = "\4\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_13s = "\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\7\uffff\1\2\1\uffff\2\4\2\uffff\1\3",
            "\1\5",
            "\1\4\6\uffff\1\7\7\uffff\1\6\1\4\2\7\1\4\1\uffff\1\7",
            "",
            "\1\4\7\uffff\1\2\1\uffff\2\4\2\uffff\1\3",
            "\1\10",
            "",
            "\1\4\6\uffff\1\7\7\uffff\1\6\1\4\2\7\1\4\1\uffff\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1118:1: ( rule__DeclaredProperty__TypeAssignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000006201C402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002400820L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000006D60390L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002D00010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000006205D400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000006201C400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000006203D400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});

}