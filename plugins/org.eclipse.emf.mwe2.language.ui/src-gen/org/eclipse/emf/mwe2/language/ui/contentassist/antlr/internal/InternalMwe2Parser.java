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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AutoInject", "Import", "Module", "False", "Null", "True", "ReverseSolidusDollarSignLeftCurlyBracket", "Var", "DollarSignLeftCurlyBracket", "FullStopAsterisk", "ReverseSolidusQuotationMark", "ReverseSolidusApostrophe", "ReverseSolidusReverseSolidus", "QuotationMark", "Apostrophe", "PlusSign", "HyphenMinus", "FullStop", "Colon", "EqualsSign", "CommercialAt", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int RULE_SL_COMMENT=30;
    public static final int EqualsSign=23;
    public static final int HyphenMinus=20;
    public static final int AutoInject=4;
    public static final int Colon=22;
    public static final int RightCurlyBracket=26;
    public static final int EOF=-1;
    public static final int Apostrophe=18;
    public static final int FullStop=21;
    public static final int RULE_ID=27;
    public static final int RULE_WS=31;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_ANY_OTHER=32;
    public static final int CommercialAt=24;
    public static final int ReverseSolidusQuotationMark=14;
    public static final int PlusSign=19;
    public static final int RULE_INT=28;
    public static final int FullStopAsterisk=13;
    public static final int RULE_ML_COMMENT=29;
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
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("HyphenMinus", "'-'");
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
    // InternalMwe2Parser.g:86:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:87:1: ( ruleModule EOF )
            // InternalMwe2Parser.g:88:1: ruleModule EOF
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
    // InternalMwe2Parser.g:95:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:99:5: ( ( ( rule__Module__Group__0 ) ) )
            // InternalMwe2Parser.g:100:1: ( ( rule__Module__Group__0 ) )
            {
            // InternalMwe2Parser.g:100:1: ( ( rule__Module__Group__0 ) )
            // InternalMwe2Parser.g:101:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalMwe2Parser.g:102:1: ( rule__Module__Group__0 )
            // InternalMwe2Parser.g:102:2: rule__Module__Group__0
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
    // InternalMwe2Parser.g:114:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:115:1: ( ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:116:1: ruleDeclaredProperty EOF
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
    // InternalMwe2Parser.g:123:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:127:5: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // InternalMwe2Parser.g:128:1: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // InternalMwe2Parser.g:128:1: ( ( rule__DeclaredProperty__Group__0 ) )
            // InternalMwe2Parser.g:129:1: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // InternalMwe2Parser.g:130:1: ( rule__DeclaredProperty__Group__0 )
            // InternalMwe2Parser.g:130:2: rule__DeclaredProperty__Group__0
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
    // InternalMwe2Parser.g:142:1: entryRuleRootComponent : ruleRootComponent EOF ;
    public final void entryRuleRootComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:143:1: ( ruleRootComponent EOF )
            // InternalMwe2Parser.g:144:1: ruleRootComponent EOF
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
    // InternalMwe2Parser.g:151:1: ruleRootComponent : ( ( rule__RootComponent__Group__0 ) ) ;
    public final void ruleRootComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:155:5: ( ( ( rule__RootComponent__Group__0 ) ) )
            // InternalMwe2Parser.g:156:1: ( ( rule__RootComponent__Group__0 ) )
            {
            // InternalMwe2Parser.g:156:1: ( ( rule__RootComponent__Group__0 ) )
            // InternalMwe2Parser.g:157:1: ( rule__RootComponent__Group__0 )
            {
             before(grammarAccess.getRootComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:158:1: ( rule__RootComponent__Group__0 )
            // InternalMwe2Parser.g:158:2: rule__RootComponent__Group__0
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
    // InternalMwe2Parser.g:170:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:171:1: ( ruleComponent EOF )
            // InternalMwe2Parser.g:172:1: ruleComponent EOF
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
    // InternalMwe2Parser.g:179:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:183:5: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMwe2Parser.g:184:1: ( ( rule__Component__Group__0 ) )
            {
            // InternalMwe2Parser.g:184:1: ( ( rule__Component__Group__0 ) )
            // InternalMwe2Parser.g:185:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:186:1: ( rule__Component__Group__0 )
            // InternalMwe2Parser.g:186:2: rule__Component__Group__0
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
    // InternalMwe2Parser.g:198:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:199:1: ( ruleImport EOF )
            // InternalMwe2Parser.g:200:1: ruleImport EOF
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
    // InternalMwe2Parser.g:207:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:211:5: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMwe2Parser.g:212:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalMwe2Parser.g:212:1: ( ( rule__Import__Group__0 ) )
            // InternalMwe2Parser.g:213:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMwe2Parser.g:214:1: ( rule__Import__Group__0 )
            // InternalMwe2Parser.g:214:2: rule__Import__Group__0
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
    // InternalMwe2Parser.g:226:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:227:1: ( ruleImportedFQN EOF )
            // InternalMwe2Parser.g:228:1: ruleImportedFQN EOF
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
    // InternalMwe2Parser.g:235:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:239:5: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalMwe2Parser.g:240:1: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:240:1: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalMwe2Parser.g:241:1: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:242:1: ( rule__ImportedFQN__Group__0 )
            // InternalMwe2Parser.g:242:2: rule__ImportedFQN__Group__0
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
    // InternalMwe2Parser.g:254:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:255:1: ( ruleAssignment EOF )
            // InternalMwe2Parser.g:256:1: ruleAssignment EOF
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
    // InternalMwe2Parser.g:263:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:267:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMwe2Parser.g:268:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMwe2Parser.g:268:1: ( ( rule__Assignment__Group__0 ) )
            // InternalMwe2Parser.g:269:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMwe2Parser.g:270:1: ( rule__Assignment__Group__0 )
            // InternalMwe2Parser.g:270:2: rule__Assignment__Group__0
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
    // InternalMwe2Parser.g:282:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:283:1: ( ruleValue EOF )
            // InternalMwe2Parser.g:284:1: ruleValue EOF
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
    // InternalMwe2Parser.g:291:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:295:5: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMwe2Parser.g:296:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalMwe2Parser.g:296:1: ( ( rule__Value__Alternatives ) )
            // InternalMwe2Parser.g:297:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:298:1: ( rule__Value__Alternatives )
            // InternalMwe2Parser.g:298:2: rule__Value__Alternatives
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
    // InternalMwe2Parser.g:310:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:311:1: ( ruleNullLiteral EOF )
            // InternalMwe2Parser.g:312:1: ruleNullLiteral EOF
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
    // InternalMwe2Parser.g:319:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:323:5: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:324:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:324:1: ( ( rule__NullLiteral__Group__0 ) )
            // InternalMwe2Parser.g:325:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:326:1: ( rule__NullLiteral__Group__0 )
            // InternalMwe2Parser.g:326:2: rule__NullLiteral__Group__0
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
    // InternalMwe2Parser.g:338:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:339:1: ( ruleDoubleLiteral EOF )
            // InternalMwe2Parser.g:340:1: ruleDoubleLiteral EOF
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
    // InternalMwe2Parser.g:347:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__ValueAssignment ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:351:5: ( ( ( rule__DoubleLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:352:1: ( ( rule__DoubleLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:352:1: ( ( rule__DoubleLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:353:1: ( rule__DoubleLiteral__ValueAssignment )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:354:1: ( rule__DoubleLiteral__ValueAssignment )
            // InternalMwe2Parser.g:354:2: rule__DoubleLiteral__ValueAssignment
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
    // InternalMwe2Parser.g:366:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:367:1: ( ruleDoubleValue EOF )
            // InternalMwe2Parser.g:368:1: ruleDoubleValue EOF
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
    // InternalMwe2Parser.g:375:1: ruleDoubleValue : ( ( rule__DoubleValue__Group__0 ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:379:5: ( ( ( rule__DoubleValue__Group__0 ) ) )
            // InternalMwe2Parser.g:380:1: ( ( rule__DoubleValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:380:1: ( ( rule__DoubleValue__Group__0 ) )
            // InternalMwe2Parser.g:381:1: ( rule__DoubleValue__Group__0 )
            {
             before(grammarAccess.getDoubleValueAccess().getGroup()); 
            // InternalMwe2Parser.g:382:1: ( rule__DoubleValue__Group__0 )
            // InternalMwe2Parser.g:382:2: rule__DoubleValue__Group__0
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
    // InternalMwe2Parser.g:394:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:395:1: ( ruleIntegerLiteral EOF )
            // InternalMwe2Parser.g:396:1: ruleIntegerLiteral EOF
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
    // InternalMwe2Parser.g:403:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:407:5: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:408:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:408:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:409:1: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:410:1: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMwe2Parser.g:410:2: rule__IntegerLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleIntValue"
    // InternalMwe2Parser.g:422:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:423:1: ( ruleIntValue EOF )
            // InternalMwe2Parser.g:424:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalMwe2Parser.g:431:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:435:5: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalMwe2Parser.g:436:1: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:436:1: ( ( rule__IntValue__Group__0 ) )
            // InternalMwe2Parser.g:437:1: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalMwe2Parser.g:438:1: ( rule__IntValue__Group__0 )
            // InternalMwe2Parser.g:438:2: rule__IntValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMwe2Parser.g:450:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:451:1: ( ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:452:1: ruleBooleanLiteral EOF
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
    // InternalMwe2Parser.g:459:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:463:5: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:464:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:464:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalMwe2Parser.g:465:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:466:1: ( rule__BooleanLiteral__Group__0 )
            // InternalMwe2Parser.g:466:2: rule__BooleanLiteral__Group__0
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
    // InternalMwe2Parser.g:478:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:479:1: ( ruleReference EOF )
            // InternalMwe2Parser.g:480:1: ruleReference EOF
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
    // InternalMwe2Parser.g:487:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:491:5: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:492:1: ( ( rule__Reference__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:492:1: ( ( rule__Reference__ReferableAssignment ) )
            // InternalMwe2Parser.g:493:1: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:494:1: ( rule__Reference__ReferableAssignment )
            // InternalMwe2Parser.g:494:2: rule__Reference__ReferableAssignment
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
    // InternalMwe2Parser.g:506:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:507:1: ( ruleFQN EOF )
            // InternalMwe2Parser.g:508:1: ruleFQN EOF
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
    // InternalMwe2Parser.g:515:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:519:5: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMwe2Parser.g:520:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:520:1: ( ( rule__FQN__Group__0 ) )
            // InternalMwe2Parser.g:521:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:522:1: ( rule__FQN__Group__0 )
            // InternalMwe2Parser.g:522:2: rule__FQN__Group__0
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
    // InternalMwe2Parser.g:534:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:538:1: ( ruleStringLiteral EOF )
            // InternalMwe2Parser.g:539:1: ruleStringLiteral EOF
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
    // InternalMwe2Parser.g:549:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:554:5: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // InternalMwe2Parser.g:555:1: ( ( rule__StringLiteral__Alternatives ) )
            {
            // InternalMwe2Parser.g:555:1: ( ( rule__StringLiteral__Alternatives ) )
            // InternalMwe2Parser.g:556:1: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // InternalMwe2Parser.g:557:1: ( rule__StringLiteral__Alternatives )
            // InternalMwe2Parser.g:557:2: rule__StringLiteral__Alternatives
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
    // InternalMwe2Parser.g:570:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:574:1: ( rulePropertyReference EOF )
            // InternalMwe2Parser.g:575:1: rulePropertyReference EOF
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
    // InternalMwe2Parser.g:585:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:590:5: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // InternalMwe2Parser.g:591:1: ( ( rule__PropertyReference__Group__0 ) )
            {
            // InternalMwe2Parser.g:591:1: ( ( rule__PropertyReference__Group__0 ) )
            // InternalMwe2Parser.g:592:1: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // InternalMwe2Parser.g:593:1: ( rule__PropertyReference__Group__0 )
            // InternalMwe2Parser.g:593:2: rule__PropertyReference__Group__0
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
    // InternalMwe2Parser.g:606:1: entryRulePropertyReferenceImpl : rulePropertyReferenceImpl EOF ;
    public final void entryRulePropertyReferenceImpl() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:610:1: ( rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:611:1: rulePropertyReferenceImpl EOF
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
    // InternalMwe2Parser.g:621:1: rulePropertyReferenceImpl : ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) ;
    public final void rulePropertyReferenceImpl() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:626:5: ( ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:627:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:627:1: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            // InternalMwe2Parser.g:628:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:629:1: ( rule__PropertyReferenceImpl__ReferableAssignment )
            // InternalMwe2Parser.g:629:2: rule__PropertyReferenceImpl__ReferableAssignment
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
    // InternalMwe2Parser.g:642:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:643:1: ( rulePlainString EOF )
            // InternalMwe2Parser.g:644:1: rulePlainString EOF
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
    // InternalMwe2Parser.g:651:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:655:5: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // InternalMwe2Parser.g:656:1: ( ( rule__PlainString__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:656:1: ( ( rule__PlainString__ValueAssignment ) )
            // InternalMwe2Parser.g:657:1: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:658:1: ( rule__PlainString__ValueAssignment )
            // InternalMwe2Parser.g:658:2: rule__PlainString__ValueAssignment
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
    // InternalMwe2Parser.g:670:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:671:1: ( ruleConstantValue EOF )
            // InternalMwe2Parser.g:672:1: ruleConstantValue EOF
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
    // InternalMwe2Parser.g:679:1: ruleConstantValue : ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:683:5: ( ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) )
            // InternalMwe2Parser.g:684:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            {
            // InternalMwe2Parser.g:684:1: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            // InternalMwe2Parser.g:685:1: ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* )
            {
            // InternalMwe2Parser.g:685:1: ( ( rule__ConstantValue__Alternatives ) )
            // InternalMwe2Parser.g:686:1: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:687:1: ( rule__ConstantValue__Alternatives )
            // InternalMwe2Parser.g:687:2: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }

            // InternalMwe2Parser.g:690:1: ( ( rule__ConstantValue__Alternatives )* )
            // InternalMwe2Parser.g:691:1: ( rule__ConstantValue__Alternatives )*
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:692:1: ( rule__ConstantValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA1_0>=ReverseSolidusQuotationMark && LA1_0<=ReverseSolidusReverseSolidus)||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:692:2: rule__ConstantValue__Alternatives
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
    // InternalMwe2Parser.g:705:1: rule__RootComponent__Alternatives_1 : ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) );
    public final void rule__RootComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:709:1: ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:710:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:710:1: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:711:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:712:1: ( rule__RootComponent__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:712:2: rule__RootComponent__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:716:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:716:6: ( ( rule__RootComponent__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:717:1: ( rule__RootComponent__Group_1_1__0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:718:1: ( rule__RootComponent__Group_1_1__0 )
                    // InternalMwe2Parser.g:718:2: rule__RootComponent__Group_1_1__0
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
    // InternalMwe2Parser.g:727:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:731:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:732:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:732:1: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:733:1: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:734:1: ( rule__Component__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:734:2: rule__Component__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:738:6: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:738:6: ( ( rule__Component__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:739:1: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:740:1: ( rule__Component__Group_1_1__0 )
                    // InternalMwe2Parser.g:740:2: rule__Component__Group_1_1__0
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
    // InternalMwe2Parser.g:749:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:753:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:754:1: ( ruleComponent )
                    {
                    // InternalMwe2Parser.g:754:1: ( ruleComponent )
                    // InternalMwe2Parser.g:755:1: ruleComponent
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
                    // InternalMwe2Parser.g:760:6: ( ruleStringLiteral )
                    {
                    // InternalMwe2Parser.g:760:6: ( ruleStringLiteral )
                    // InternalMwe2Parser.g:761:1: ruleStringLiteral
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
                    // InternalMwe2Parser.g:766:6: ( ruleBooleanLiteral )
                    {
                    // InternalMwe2Parser.g:766:6: ( ruleBooleanLiteral )
                    // InternalMwe2Parser.g:767:1: ruleBooleanLiteral
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
                    // InternalMwe2Parser.g:772:6: ( ruleIntegerLiteral )
                    {
                    // InternalMwe2Parser.g:772:6: ( ruleIntegerLiteral )
                    // InternalMwe2Parser.g:773:1: ruleIntegerLiteral
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
                    // InternalMwe2Parser.g:778:6: ( ruleDoubleLiteral )
                    {
                    // InternalMwe2Parser.g:778:6: ( ruleDoubleLiteral )
                    // InternalMwe2Parser.g:779:1: ruleDoubleLiteral
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
                    // InternalMwe2Parser.g:784:6: ( ruleNullLiteral )
                    {
                    // InternalMwe2Parser.g:784:6: ( ruleNullLiteral )
                    // InternalMwe2Parser.g:785:1: ruleNullLiteral
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
                    // InternalMwe2Parser.g:790:6: ( ruleReference )
                    {
                    // InternalMwe2Parser.g:790:6: ( ruleReference )
                    // InternalMwe2Parser.g:791:1: ruleReference
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


    // $ANTLR start "rule__IntValue__Alternatives_0"
    // InternalMwe2Parser.g:801:1: rule__IntValue__Alternatives_0 : ( ( HyphenMinus ) | ( PlusSign ) );
    public final void rule__IntValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:805:1: ( ( HyphenMinus ) | ( PlusSign ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinus) ) {
                alt5=1;
            }
            else if ( (LA5_0==PlusSign) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMwe2Parser.g:806:1: ( HyphenMinus )
                    {
                    // InternalMwe2Parser.g:806:1: ( HyphenMinus )
                    // InternalMwe2Parser.g:807:1: HyphenMinus
                    {
                     before(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,HyphenMinus,FOLLOW_2); 
                     after(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:814:6: ( PlusSign )
                    {
                    // InternalMwe2Parser.g:814:6: ( PlusSign )
                    // InternalMwe2Parser.g:815:1: PlusSign
                    {
                     before(grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1()); 
                    match(input,PlusSign,FOLLOW_2); 
                     after(grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__IntValue__Alternatives_0"


    // $ANTLR start "rule__BooleanLiteral__Alternatives_1"
    // InternalMwe2Parser.g:827:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:831:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMwe2Parser.g:832:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:832:1: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // InternalMwe2Parser.g:833:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // InternalMwe2Parser.g:834:1: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // InternalMwe2Parser.g:834:2: rule__BooleanLiteral__IsTrueAssignment_1_0
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
                    // InternalMwe2Parser.g:838:6: ( False )
                    {
                    // InternalMwe2Parser.g:838:6: ( False )
                    // InternalMwe2Parser.g:839:1: False
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
    // InternalMwe2Parser.g:851:1: rule__StringLiteral__Alternatives : ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:855:1: ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Apostrophe) ) {
                alt7=1;
            }
            else if ( (LA7_0==QuotationMark) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMwe2Parser.g:856:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    {
                    // InternalMwe2Parser.g:856:1: ( ( rule__StringLiteral__Group_0__0 ) )
                    // InternalMwe2Parser.g:857:1: ( rule__StringLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_0()); 
                    // InternalMwe2Parser.g:858:1: ( rule__StringLiteral__Group_0__0 )
                    // InternalMwe2Parser.g:858:2: rule__StringLiteral__Group_0__0
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
                    // InternalMwe2Parser.g:862:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    {
                    // InternalMwe2Parser.g:862:6: ( ( rule__StringLiteral__Group_1__0 ) )
                    // InternalMwe2Parser.g:863:1: ( rule__StringLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_1()); 
                    // InternalMwe2Parser.g:864:1: ( rule__StringLiteral__Group_1__0 )
                    // InternalMwe2Parser.g:864:2: rule__StringLiteral__Group_1__0
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
    // InternalMwe2Parser.g:873:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:877:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt8=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case ReverseSolidusApostrophe:
                {
                alt8=4;
                }
                break;
            case ReverseSolidusQuotationMark:
                {
                alt8=5;
                }
                break;
            case ReverseSolidusDollarSignLeftCurlyBracket:
                {
                alt8=6;
                }
                break;
            case ReverseSolidusReverseSolidus:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMwe2Parser.g:878:1: ( RULE_WS )
                    {
                    // InternalMwe2Parser.g:878:1: ( RULE_WS )
                    // InternalMwe2Parser.g:879:1: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:884:6: ( RULE_ANY_OTHER )
                    {
                    // InternalMwe2Parser.g:884:6: ( RULE_ANY_OTHER )
                    // InternalMwe2Parser.g:885:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:890:6: ( RULE_ID )
                    {
                    // InternalMwe2Parser.g:890:6: ( RULE_ID )
                    // InternalMwe2Parser.g:891:1: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:896:6: ( ReverseSolidusApostrophe )
                    {
                    // InternalMwe2Parser.g:896:6: ( ReverseSolidusApostrophe )
                    // InternalMwe2Parser.g:897:1: ReverseSolidusApostrophe
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
                    match(input,ReverseSolidusApostrophe,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:904:6: ( ReverseSolidusQuotationMark )
                    {
                    // InternalMwe2Parser.g:904:6: ( ReverseSolidusQuotationMark )
                    // InternalMwe2Parser.g:905:1: ReverseSolidusQuotationMark
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
                    match(input,ReverseSolidusQuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:912:6: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    {
                    // InternalMwe2Parser.g:912:6: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    // InternalMwe2Parser.g:913:1: ReverseSolidusDollarSignLeftCurlyBracket
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
                    match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:920:6: ( ReverseSolidusReverseSolidus )
                    {
                    // InternalMwe2Parser.g:920:6: ( ReverseSolidusReverseSolidus )
                    // InternalMwe2Parser.g:921:1: ReverseSolidusReverseSolidus
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
    // InternalMwe2Parser.g:935:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:939:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalMwe2Parser.g:940:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalMwe2Parser.g:947:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:951:1: ( ( () ) )
            // InternalMwe2Parser.g:952:1: ( () )
            {
            // InternalMwe2Parser.g:952:1: ( () )
            // InternalMwe2Parser.g:953:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // InternalMwe2Parser.g:954:1: ()
            // InternalMwe2Parser.g:956:1: 
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
    // InternalMwe2Parser.g:966:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:970:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalMwe2Parser.g:971:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalMwe2Parser.g:978:1: rule__Module__Group__1__Impl : ( Module ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:982:1: ( ( Module ) )
            // InternalMwe2Parser.g:983:1: ( Module )
            {
            // InternalMwe2Parser.g:983:1: ( Module )
            // InternalMwe2Parser.g:984:1: Module
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
    // InternalMwe2Parser.g:997:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1001:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalMwe2Parser.g:1002:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalMwe2Parser.g:1009:1: rule__Module__Group__2__Impl : ( ( rule__Module__CanonicalNameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1013:1: ( ( ( rule__Module__CanonicalNameAssignment_2 ) ) )
            // InternalMwe2Parser.g:1014:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1014:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            // InternalMwe2Parser.g:1015:1: ( rule__Module__CanonicalNameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 
            // InternalMwe2Parser.g:1016:1: ( rule__Module__CanonicalNameAssignment_2 )
            // InternalMwe2Parser.g:1016:2: rule__Module__CanonicalNameAssignment_2
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
    // InternalMwe2Parser.g:1026:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1030:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalMwe2Parser.g:1031:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalMwe2Parser.g:1038:1: rule__Module__Group__3__Impl : ( ( rule__Module__ImportsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1042:1: ( ( ( rule__Module__ImportsAssignment_3 )* ) )
            // InternalMwe2Parser.g:1043:1: ( ( rule__Module__ImportsAssignment_3 )* )
            {
            // InternalMwe2Parser.g:1043:1: ( ( rule__Module__ImportsAssignment_3 )* )
            // InternalMwe2Parser.g:1044:1: ( rule__Module__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_3()); 
            // InternalMwe2Parser.g:1045:1: ( rule__Module__ImportsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Import) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMwe2Parser.g:1045:2: rule__Module__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Module__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMwe2Parser.g:1055:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1059:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalMwe2Parser.g:1060:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalMwe2Parser.g:1067:1: rule__Module__Group__4__Impl : ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1071:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) )
            // InternalMwe2Parser.g:1072:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            {
            // InternalMwe2Parser.g:1072:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            // InternalMwe2Parser.g:1073:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 
            // InternalMwe2Parser.g:1074:1: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMwe2Parser.g:1074:2: rule__Module__DeclaredPropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Module__DeclaredPropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMwe2Parser.g:1084:1: rule__Module__Group__5 : rule__Module__Group__5__Impl ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1088:1: ( rule__Module__Group__5__Impl )
            // InternalMwe2Parser.g:1089:2: rule__Module__Group__5__Impl
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
    // InternalMwe2Parser.g:1095:1: rule__Module__Group__5__Impl : ( ( rule__Module__RootAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1099:1: ( ( ( rule__Module__RootAssignment_5 ) ) )
            // InternalMwe2Parser.g:1100:1: ( ( rule__Module__RootAssignment_5 ) )
            {
            // InternalMwe2Parser.g:1100:1: ( ( rule__Module__RootAssignment_5 ) )
            // InternalMwe2Parser.g:1101:1: ( rule__Module__RootAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_5()); 
            // InternalMwe2Parser.g:1102:1: ( rule__Module__RootAssignment_5 )
            // InternalMwe2Parser.g:1102:2: rule__Module__RootAssignment_5
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
    // InternalMwe2Parser.g:1124:1: rule__DeclaredProperty__Group__0 : rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1128:1: ( rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 )
            // InternalMwe2Parser.g:1129:2: rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1
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
    // InternalMwe2Parser.g:1136:1: rule__DeclaredProperty__Group__0__Impl : ( Var ) ;
    public final void rule__DeclaredProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1140:1: ( ( Var ) )
            // InternalMwe2Parser.g:1141:1: ( Var )
            {
            // InternalMwe2Parser.g:1141:1: ( Var )
            // InternalMwe2Parser.g:1142:1: Var
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
    // InternalMwe2Parser.g:1155:1: rule__DeclaredProperty__Group__1 : rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1159:1: ( rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 )
            // InternalMwe2Parser.g:1160:2: rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2
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
    // InternalMwe2Parser.g:1167:1: rule__DeclaredProperty__Group__1__Impl : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) ;
    public final void rule__DeclaredProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1171:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) )
            // InternalMwe2Parser.g:1172:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            {
            // InternalMwe2Parser.g:1172:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // InternalMwe2Parser.g:1173:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // InternalMwe2Parser.g:1174:1: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:1174:2: rule__DeclaredProperty__TypeAssignment_1
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
    // InternalMwe2Parser.g:1184:1: rule__DeclaredProperty__Group__2 : rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1188:1: ( rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 )
            // InternalMwe2Parser.g:1189:2: rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3
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
    // InternalMwe2Parser.g:1196:1: rule__DeclaredProperty__Group__2__Impl : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) ;
    public final void rule__DeclaredProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1200:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) )
            // InternalMwe2Parser.g:1201:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1201:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // InternalMwe2Parser.g:1202:1: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // InternalMwe2Parser.g:1203:1: ( rule__DeclaredProperty__NameAssignment_2 )
            // InternalMwe2Parser.g:1203:2: rule__DeclaredProperty__NameAssignment_2
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
    // InternalMwe2Parser.g:1213:1: rule__DeclaredProperty__Group__3 : rule__DeclaredProperty__Group__3__Impl ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1217:1: ( rule__DeclaredProperty__Group__3__Impl )
            // InternalMwe2Parser.g:1218:2: rule__DeclaredProperty__Group__3__Impl
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
    // InternalMwe2Parser.g:1224:1: rule__DeclaredProperty__Group__3__Impl : ( ( rule__DeclaredProperty__Group_3__0 )? ) ;
    public final void rule__DeclaredProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1228:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) )
            // InternalMwe2Parser.g:1229:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            {
            // InternalMwe2Parser.g:1229:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // InternalMwe2Parser.g:1230:1: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // InternalMwe2Parser.g:1231:1: ( rule__DeclaredProperty__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EqualsSign) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMwe2Parser.g:1231:2: rule__DeclaredProperty__Group_3__0
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
    // InternalMwe2Parser.g:1249:1: rule__DeclaredProperty__Group_3__0 : rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1253:1: ( rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 )
            // InternalMwe2Parser.g:1254:2: rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1
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
    // InternalMwe2Parser.g:1261:1: rule__DeclaredProperty__Group_3__0__Impl : ( EqualsSign ) ;
    public final void rule__DeclaredProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1265:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1266:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1266:1: ( EqualsSign )
            // InternalMwe2Parser.g:1267:1: EqualsSign
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
    // InternalMwe2Parser.g:1280:1: rule__DeclaredProperty__Group_3__1 : rule__DeclaredProperty__Group_3__1__Impl ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1284:1: ( rule__DeclaredProperty__Group_3__1__Impl )
            // InternalMwe2Parser.g:1285:2: rule__DeclaredProperty__Group_3__1__Impl
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
    // InternalMwe2Parser.g:1291:1: rule__DeclaredProperty__Group_3__1__Impl : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1295:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // InternalMwe2Parser.g:1296:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // InternalMwe2Parser.g:1296:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // InternalMwe2Parser.g:1297:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // InternalMwe2Parser.g:1298:1: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // InternalMwe2Parser.g:1298:2: rule__DeclaredProperty__DefaultAssignment_3_1
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
    // InternalMwe2Parser.g:1312:1: rule__RootComponent__Group__0 : rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 ;
    public final void rule__RootComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1316:1: ( rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 )
            // InternalMwe2Parser.g:1317:2: rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1
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
    // InternalMwe2Parser.g:1324:1: rule__RootComponent__Group__0__Impl : ( () ) ;
    public final void rule__RootComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1328:1: ( ( () ) )
            // InternalMwe2Parser.g:1329:1: ( () )
            {
            // InternalMwe2Parser.g:1329:1: ( () )
            // InternalMwe2Parser.g:1330:1: ()
            {
             before(grammarAccess.getRootComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1331:1: ()
            // InternalMwe2Parser.g:1333:1: 
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
    // InternalMwe2Parser.g:1343:1: rule__RootComponent__Group__1 : rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 ;
    public final void rule__RootComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1347:1: ( rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 )
            // InternalMwe2Parser.g:1348:2: rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2
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
    // InternalMwe2Parser.g:1355:1: rule__RootComponent__Group__1__Impl : ( ( rule__RootComponent__Alternatives_1 ) ) ;
    public final void rule__RootComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1359:1: ( ( ( rule__RootComponent__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:1360:1: ( ( rule__RootComponent__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:1360:1: ( ( rule__RootComponent__Alternatives_1 ) )
            // InternalMwe2Parser.g:1361:1: ( rule__RootComponent__Alternatives_1 )
            {
             before(grammarAccess.getRootComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1362:1: ( rule__RootComponent__Alternatives_1 )
            // InternalMwe2Parser.g:1362:2: rule__RootComponent__Alternatives_1
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
    // InternalMwe2Parser.g:1372:1: rule__RootComponent__Group__2 : rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 ;
    public final void rule__RootComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1376:1: ( rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 )
            // InternalMwe2Parser.g:1377:2: rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3
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
    // InternalMwe2Parser.g:1384:1: rule__RootComponent__Group__2__Impl : ( ( rule__RootComponent__Group_2__0 )? ) ;
    public final void rule__RootComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1388:1: ( ( ( rule__RootComponent__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1389:1: ( ( rule__RootComponent__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1389:1: ( ( rule__RootComponent__Group_2__0 )? )
            // InternalMwe2Parser.g:1390:1: ( rule__RootComponent__Group_2__0 )?
            {
             before(grammarAccess.getRootComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1391:1: ( rule__RootComponent__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Colon) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:1391:2: rule__RootComponent__Group_2__0
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
    // InternalMwe2Parser.g:1401:1: rule__RootComponent__Group__3 : rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 ;
    public final void rule__RootComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1405:1: ( rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 )
            // InternalMwe2Parser.g:1406:2: rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4
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
    // InternalMwe2Parser.g:1413:1: rule__RootComponent__Group__3__Impl : ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) ;
    public final void rule__RootComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1417:1: ( ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1418:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1418:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1419:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1420:1: ( rule__RootComponent__AutoInjectAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AutoInject) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMwe2Parser.g:1420:2: rule__RootComponent__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1430:1: rule__RootComponent__Group__4 : rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 ;
    public final void rule__RootComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1434:1: ( rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 )
            // InternalMwe2Parser.g:1435:2: rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5
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
    // InternalMwe2Parser.g:1442:1: rule__RootComponent__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RootComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1446:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1447:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1447:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1448:1: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1461:1: rule__RootComponent__Group__5 : rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 ;
    public final void rule__RootComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1465:1: ( rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 )
            // InternalMwe2Parser.g:1466:2: rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6
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
    // InternalMwe2Parser.g:1473:1: rule__RootComponent__Group__5__Impl : ( ( rule__RootComponent__AssignmentAssignment_5 )* ) ;
    public final void rule__RootComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1477:1: ( ( ( rule__RootComponent__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1478:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1478:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1479:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1480:1: ( rule__RootComponent__AssignmentAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMwe2Parser.g:1480:2: rule__RootComponent__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RootComponent__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMwe2Parser.g:1490:1: rule__RootComponent__Group__6 : rule__RootComponent__Group__6__Impl ;
    public final void rule__RootComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1494:1: ( rule__RootComponent__Group__6__Impl )
            // InternalMwe2Parser.g:1495:2: rule__RootComponent__Group__6__Impl
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
    // InternalMwe2Parser.g:1501:1: rule__RootComponent__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__RootComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1505:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1506:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1506:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1507:1: RightCurlyBracket
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
    // InternalMwe2Parser.g:1534:1: rule__RootComponent__Group_1_1__0 : rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 ;
    public final void rule__RootComponent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1538:1: ( rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 )
            // InternalMwe2Parser.g:1539:2: rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1
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
    // InternalMwe2Parser.g:1546:1: rule__RootComponent__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__RootComponent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1550:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1551:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1551:1: ( CommercialAt )
            // InternalMwe2Parser.g:1552:1: CommercialAt
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
    // InternalMwe2Parser.g:1565:1: rule__RootComponent__Group_1_1__1 : rule__RootComponent__Group_1_1__1__Impl ;
    public final void rule__RootComponent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1569:1: ( rule__RootComponent__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1570:2: rule__RootComponent__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1576:1: rule__RootComponent__Group_1_1__1__Impl : ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__RootComponent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1580:1: ( ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1581:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1581:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1582:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1583:1: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1583:2: rule__RootComponent__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1597:1: rule__RootComponent__Group_2__0 : rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 ;
    public final void rule__RootComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1601:1: ( rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 )
            // InternalMwe2Parser.g:1602:2: rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1
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
    // InternalMwe2Parser.g:1609:1: rule__RootComponent__Group_2__0__Impl : ( Colon ) ;
    public final void rule__RootComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1613:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1614:1: ( Colon )
            {
            // InternalMwe2Parser.g:1614:1: ( Colon )
            // InternalMwe2Parser.g:1615:1: Colon
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
    // InternalMwe2Parser.g:1628:1: rule__RootComponent__Group_2__1 : rule__RootComponent__Group_2__1__Impl ;
    public final void rule__RootComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1632:1: ( rule__RootComponent__Group_2__1__Impl )
            // InternalMwe2Parser.g:1633:2: rule__RootComponent__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1639:1: rule__RootComponent__Group_2__1__Impl : ( ( rule__RootComponent__NameAssignment_2_1 ) ) ;
    public final void rule__RootComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1643:1: ( ( ( rule__RootComponent__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1644:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1644:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1645:1: ( rule__RootComponent__NameAssignment_2_1 )
            {
             before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1646:1: ( rule__RootComponent__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1646:2: rule__RootComponent__NameAssignment_2_1
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
    // InternalMwe2Parser.g:1660:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1664:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMwe2Parser.g:1665:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMwe2Parser.g:1672:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1676:1: ( ( () ) )
            // InternalMwe2Parser.g:1677:1: ( () )
            {
            // InternalMwe2Parser.g:1677:1: ( () )
            // InternalMwe2Parser.g:1678:1: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1679:1: ()
            // InternalMwe2Parser.g:1681:1: 
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
    // InternalMwe2Parser.g:1691:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1695:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMwe2Parser.g:1696:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMwe2Parser.g:1703:1: rule__Component__Group__1__Impl : ( ( rule__Component__Alternatives_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1707:1: ( ( ( rule__Component__Alternatives_1 )? ) )
            // InternalMwe2Parser.g:1708:1: ( ( rule__Component__Alternatives_1 )? )
            {
            // InternalMwe2Parser.g:1708:1: ( ( rule__Component__Alternatives_1 )? )
            // InternalMwe2Parser.g:1709:1: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1710:1: ( rule__Component__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CommercialAt||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMwe2Parser.g:1710:2: rule__Component__Alternatives_1
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
    // InternalMwe2Parser.g:1720:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1724:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMwe2Parser.g:1725:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMwe2Parser.g:1732:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1736:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1737:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1737:1: ( ( rule__Component__Group_2__0 )? )
            // InternalMwe2Parser.g:1738:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1739:1: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Colon) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMwe2Parser.g:1739:2: rule__Component__Group_2__0
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
    // InternalMwe2Parser.g:1749:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1753:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMwe2Parser.g:1754:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMwe2Parser.g:1761:1: rule__Component__Group__3__Impl : ( ( rule__Component__AutoInjectAssignment_3 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1765:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1766:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1766:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1767:1: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1768:1: ( rule__Component__AutoInjectAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AutoInject) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMwe2Parser.g:1768:2: rule__Component__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1778:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1782:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMwe2Parser.g:1783:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMwe2Parser.g:1790:1: rule__Component__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1794:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1795:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1795:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1796:1: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1809:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1813:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMwe2Parser.g:1814:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalMwe2Parser.g:1821:1: rule__Component__Group__5__Impl : ( ( rule__Component__AssignmentAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1825:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1826:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1826:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1827:1: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1828:1: ( rule__Component__AssignmentAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMwe2Parser.g:1828:2: rule__Component__AssignmentAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__AssignmentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMwe2Parser.g:1838:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1842:1: ( rule__Component__Group__6__Impl )
            // InternalMwe2Parser.g:1843:2: rule__Component__Group__6__Impl
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
    // InternalMwe2Parser.g:1849:1: rule__Component__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1853:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1854:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1854:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1855:1: RightCurlyBracket
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
    // InternalMwe2Parser.g:1882:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1886:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // InternalMwe2Parser.g:1887:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
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
    // InternalMwe2Parser.g:1894:1: rule__Component__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1898:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1899:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1899:1: ( CommercialAt )
            // InternalMwe2Parser.g:1900:1: CommercialAt
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
    // InternalMwe2Parser.g:1913:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1917:1: ( rule__Component__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1918:2: rule__Component__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1924:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1928:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1929:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1929:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1930:1: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1931:1: ( rule__Component__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1931:2: rule__Component__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1945:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1949:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalMwe2Parser.g:1950:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
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
    // InternalMwe2Parser.g:1957:1: rule__Component__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1961:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1962:1: ( Colon )
            {
            // InternalMwe2Parser.g:1962:1: ( Colon )
            // InternalMwe2Parser.g:1963:1: Colon
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
    // InternalMwe2Parser.g:1976:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1980:1: ( rule__Component__Group_2__1__Impl )
            // InternalMwe2Parser.g:1981:2: rule__Component__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1987:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:1991:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1992:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1992:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1993:1: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1994:1: ( rule__Component__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1994:2: rule__Component__NameAssignment_2_1
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
    // InternalMwe2Parser.g:2008:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2012:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMwe2Parser.g:2013:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMwe2Parser.g:2020:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2024:1: ( ( Import ) )
            // InternalMwe2Parser.g:2025:1: ( Import )
            {
            // InternalMwe2Parser.g:2025:1: ( Import )
            // InternalMwe2Parser.g:2026:1: Import
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
    // InternalMwe2Parser.g:2039:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2043:1: ( rule__Import__Group__1__Impl )
            // InternalMwe2Parser.g:2044:2: rule__Import__Group__1__Impl
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
    // InternalMwe2Parser.g:2050:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2054:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMwe2Parser.g:2055:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMwe2Parser.g:2055:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMwe2Parser.g:2056:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMwe2Parser.g:2057:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMwe2Parser.g:2057:2: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMwe2Parser.g:2071:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2075:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalMwe2Parser.g:2076:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
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
    // InternalMwe2Parser.g:2083:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2087:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2088:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2088:1: ( ruleFQN )
            // InternalMwe2Parser.g:2089:1: ruleFQN
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
    // InternalMwe2Parser.g:2100:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2104:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalMwe2Parser.g:2105:2: rule__ImportedFQN__Group__1__Impl
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
    // InternalMwe2Parser.g:2111:1: rule__ImportedFQN__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2115:1: ( ( ( FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:2116:1: ( ( FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:2116:1: ( ( FullStopAsterisk )? )
            // InternalMwe2Parser.g:2117:1: ( FullStopAsterisk )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMwe2Parser.g:2118:1: ( FullStopAsterisk )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FullStopAsterisk) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMwe2Parser.g:2119:2: FullStopAsterisk
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
    // InternalMwe2Parser.g:2134:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2138:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMwe2Parser.g:2139:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalMwe2Parser.g:2146:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__FeatureAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2150:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) )
            // InternalMwe2Parser.g:2151:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            {
            // InternalMwe2Parser.g:2151:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // InternalMwe2Parser.g:2152:1: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // InternalMwe2Parser.g:2153:1: ( rule__Assignment__FeatureAssignment_0 )
            // InternalMwe2Parser.g:2153:2: rule__Assignment__FeatureAssignment_0
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
    // InternalMwe2Parser.g:2163:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2167:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMwe2Parser.g:2168:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalMwe2Parser.g:2175:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2179:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:2180:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:2180:1: ( EqualsSign )
            // InternalMwe2Parser.g:2181:1: EqualsSign
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
    // InternalMwe2Parser.g:2194:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2198:1: ( rule__Assignment__Group__2__Impl )
            // InternalMwe2Parser.g:2199:2: rule__Assignment__Group__2__Impl
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
    // InternalMwe2Parser.g:2205:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2209:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMwe2Parser.g:2210:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMwe2Parser.g:2210:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMwe2Parser.g:2211:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMwe2Parser.g:2212:1: ( rule__Assignment__ValueAssignment_2 )
            // InternalMwe2Parser.g:2212:2: rule__Assignment__ValueAssignment_2
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
    // InternalMwe2Parser.g:2228:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2232:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // InternalMwe2Parser.g:2233:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
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
    // InternalMwe2Parser.g:2240:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2244:1: ( ( () ) )
            // InternalMwe2Parser.g:2245:1: ( () )
            {
            // InternalMwe2Parser.g:2245:1: ( () )
            // InternalMwe2Parser.g:2246:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // InternalMwe2Parser.g:2247:1: ()
            // InternalMwe2Parser.g:2249:1: 
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
    // InternalMwe2Parser.g:2259:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2263:1: ( rule__NullLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2264:2: rule__NullLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:2270:1: rule__NullLiteral__Group__1__Impl : ( Null ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2274:1: ( ( Null ) )
            // InternalMwe2Parser.g:2275:1: ( Null )
            {
            // InternalMwe2Parser.g:2275:1: ( Null )
            // InternalMwe2Parser.g:2276:1: Null
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
    // InternalMwe2Parser.g:2293:1: rule__DoubleValue__Group__0 : rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 ;
    public final void rule__DoubleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2297:1: ( rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 )
            // InternalMwe2Parser.g:2298:2: rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1
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
    // InternalMwe2Parser.g:2305:1: rule__DoubleValue__Group__0__Impl : ( ruleIntValue ) ;
    public final void rule__DoubleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2309:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:2310:1: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:2310:1: ( ruleIntValue )
            // InternalMwe2Parser.g:2311:1: ruleIntValue
            {
             before(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMwe2Parser.g:2322:1: rule__DoubleValue__Group__1 : rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 ;
    public final void rule__DoubleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2326:1: ( rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 )
            // InternalMwe2Parser.g:2327:2: rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2
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
    // InternalMwe2Parser.g:2334:1: rule__DoubleValue__Group__1__Impl : ( FullStop ) ;
    public final void rule__DoubleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2338:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2339:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2339:1: ( FullStop )
            // InternalMwe2Parser.g:2340:1: FullStop
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
    // InternalMwe2Parser.g:2353:1: rule__DoubleValue__Group__2 : rule__DoubleValue__Group__2__Impl ;
    public final void rule__DoubleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2357:1: ( rule__DoubleValue__Group__2__Impl )
            // InternalMwe2Parser.g:2358:2: rule__DoubleValue__Group__2__Impl
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
    // InternalMwe2Parser.g:2364:1: rule__DoubleValue__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2368:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2369:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2369:1: ( RULE_INT )
            // InternalMwe2Parser.g:2370:1: RULE_INT
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


    // $ANTLR start "rule__IntValue__Group__0"
    // InternalMwe2Parser.g:2387:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2391:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalMwe2Parser.g:2392:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__IntValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1();

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
    // $ANTLR end "rule__IntValue__Group__0"


    // $ANTLR start "rule__IntValue__Group__0__Impl"
    // InternalMwe2Parser.g:2399:1: rule__IntValue__Group__0__Impl : ( ( rule__IntValue__Alternatives_0 )? ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2403:1: ( ( ( rule__IntValue__Alternatives_0 )? ) )
            // InternalMwe2Parser.g:2404:1: ( ( rule__IntValue__Alternatives_0 )? )
            {
            // InternalMwe2Parser.g:2404:1: ( ( rule__IntValue__Alternatives_0 )? )
            // InternalMwe2Parser.g:2405:1: ( rule__IntValue__Alternatives_0 )?
            {
             before(grammarAccess.getIntValueAccess().getAlternatives_0()); 
            // InternalMwe2Parser.g:2406:1: ( rule__IntValue__Alternatives_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PlusSign && LA21_0<=HyphenMinus)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMwe2Parser.g:2406:2: rule__IntValue__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntValue__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__0__Impl"


    // $ANTLR start "rule__IntValue__Group__1"
    // InternalMwe2Parser.g:2416:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2420:1: ( rule__IntValue__Group__1__Impl )
            // InternalMwe2Parser.g:2421:2: rule__IntValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1__Impl();

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
    // $ANTLR end "rule__IntValue__Group__1"


    // $ANTLR start "rule__IntValue__Group__1__Impl"
    // InternalMwe2Parser.g:2427:1: rule__IntValue__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2431:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2432:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2432:1: ( RULE_INT )
            // InternalMwe2Parser.g:2433:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalMwe2Parser.g:2448:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2452:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalMwe2Parser.g:2453:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMwe2Parser.g:2460:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2464:1: ( ( () ) )
            // InternalMwe2Parser.g:2465:1: ( () )
            {
            // InternalMwe2Parser.g:2465:1: ( () )
            // InternalMwe2Parser.g:2466:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalMwe2Parser.g:2467:1: ()
            // InternalMwe2Parser.g:2469:1: 
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
    // InternalMwe2Parser.g:2479:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2483:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2484:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:2490:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2494:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:2495:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:2495:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalMwe2Parser.g:2496:1: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:2497:1: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalMwe2Parser.g:2497:2: rule__BooleanLiteral__Alternatives_1
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
    // InternalMwe2Parser.g:2511:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2515:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMwe2Parser.g:2516:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalMwe2Parser.g:2523:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2527:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2528:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2528:1: ( RULE_ID )
            // InternalMwe2Parser.g:2529:1: RULE_ID
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
    // InternalMwe2Parser.g:2540:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2544:1: ( rule__FQN__Group__1__Impl )
            // InternalMwe2Parser.g:2545:2: rule__FQN__Group__1__Impl
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
    // InternalMwe2Parser.g:2551:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2555:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMwe2Parser.g:2556:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMwe2Parser.g:2556:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMwe2Parser.g:2557:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMwe2Parser.g:2558:1: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==FullStop) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMwe2Parser.g:2558:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMwe2Parser.g:2572:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2576:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMwe2Parser.g:2577:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalMwe2Parser.g:2584:1: rule__FQN__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2588:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2589:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2589:1: ( FullStop )
            // InternalMwe2Parser.g:2590:1: FullStop
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
    // InternalMwe2Parser.g:2603:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2607:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMwe2Parser.g:2608:2: rule__FQN__Group_1__1__Impl
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
    // InternalMwe2Parser.g:2614:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2618:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2619:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2619:1: ( RULE_ID )
            // InternalMwe2Parser.g:2620:1: RULE_ID
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
    // InternalMwe2Parser.g:2635:1: rule__StringLiteral__Group_0__0 : rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 ;
    public final void rule__StringLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2639:1: ( rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 )
            // InternalMwe2Parser.g:2640:2: rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMwe2Parser.g:2647:1: rule__StringLiteral__Group_0__0__Impl : ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) ;
    public final void rule__StringLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2651:1: ( ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) )
            // InternalMwe2Parser.g:2652:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            {
            // InternalMwe2Parser.g:2652:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            // InternalMwe2Parser.g:2653:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 
            // InternalMwe2Parser.g:2654:1: ( rule__StringLiteral__BeginAssignment_0_0 )
            // InternalMwe2Parser.g:2654:2: rule__StringLiteral__BeginAssignment_0_0
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
    // InternalMwe2Parser.g:2664:1: rule__StringLiteral__Group_0__1 : rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 ;
    public final void rule__StringLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2668:1: ( rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 )
            // InternalMwe2Parser.g:2669:2: rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMwe2Parser.g:2676:1: rule__StringLiteral__Group_0__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) ;
    public final void rule__StringLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2680:1: ( ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) )
            // InternalMwe2Parser.g:2681:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            {
            // InternalMwe2Parser.g:2681:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            // InternalMwe2Parser.g:2682:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 
            // InternalMwe2Parser.g:2683:1: ( rule__StringLiteral__PartsAssignment_0_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA23_0>=ReverseSolidusQuotationMark && LA23_0<=ReverseSolidusReverseSolidus)||LA23_0==RULE_ID||(LA23_0>=RULE_WS && LA23_0<=RULE_ANY_OTHER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMwe2Parser.g:2683:2: rule__StringLiteral__PartsAssignment_0_1
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
    // InternalMwe2Parser.g:2693:1: rule__StringLiteral__Group_0__2 : rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 ;
    public final void rule__StringLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2697:1: ( rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 )
            // InternalMwe2Parser.g:2698:2: rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMwe2Parser.g:2705:1: rule__StringLiteral__Group_0__2__Impl : ( ( rule__StringLiteral__Group_0_2__0 )* ) ;
    public final void rule__StringLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2709:1: ( ( ( rule__StringLiteral__Group_0_2__0 )* ) )
            // InternalMwe2Parser.g:2710:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            {
            // InternalMwe2Parser.g:2710:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            // InternalMwe2Parser.g:2711:1: ( rule__StringLiteral__Group_0_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 
            // InternalMwe2Parser.g:2712:1: ( rule__StringLiteral__Group_0_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DollarSignLeftCurlyBracket) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMwe2Parser.g:2712:2: rule__StringLiteral__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__StringLiteral__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMwe2Parser.g:2722:1: rule__StringLiteral__Group_0__3 : rule__StringLiteral__Group_0__3__Impl ;
    public final void rule__StringLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2726:1: ( rule__StringLiteral__Group_0__3__Impl )
            // InternalMwe2Parser.g:2727:2: rule__StringLiteral__Group_0__3__Impl
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
    // InternalMwe2Parser.g:2733:1: rule__StringLiteral__Group_0__3__Impl : ( ( rule__StringLiteral__EndAssignment_0_3 ) ) ;
    public final void rule__StringLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2737:1: ( ( ( rule__StringLiteral__EndAssignment_0_3 ) ) )
            // InternalMwe2Parser.g:2738:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            {
            // InternalMwe2Parser.g:2738:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            // InternalMwe2Parser.g:2739:1: ( rule__StringLiteral__EndAssignment_0_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 
            // InternalMwe2Parser.g:2740:1: ( rule__StringLiteral__EndAssignment_0_3 )
            // InternalMwe2Parser.g:2740:2: rule__StringLiteral__EndAssignment_0_3
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
    // InternalMwe2Parser.g:2758:1: rule__StringLiteral__Group_0_2__0 : rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 ;
    public final void rule__StringLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2762:1: ( rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 )
            // InternalMwe2Parser.g:2763:2: rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMwe2Parser.g:2770:1: rule__StringLiteral__Group_0_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) ;
    public final void rule__StringLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2774:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) )
            // InternalMwe2Parser.g:2775:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            {
            // InternalMwe2Parser.g:2775:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            // InternalMwe2Parser.g:2776:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 
            // InternalMwe2Parser.g:2777:1: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            // InternalMwe2Parser.g:2777:2: rule__StringLiteral__PartsAssignment_0_2_0
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
    // InternalMwe2Parser.g:2787:1: rule__StringLiteral__Group_0_2__1 : rule__StringLiteral__Group_0_2__1__Impl ;
    public final void rule__StringLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2791:1: ( rule__StringLiteral__Group_0_2__1__Impl )
            // InternalMwe2Parser.g:2792:2: rule__StringLiteral__Group_0_2__1__Impl
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
    // InternalMwe2Parser.g:2798:1: rule__StringLiteral__Group_0_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) ;
    public final void rule__StringLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2802:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) )
            // InternalMwe2Parser.g:2803:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            {
            // InternalMwe2Parser.g:2803:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            // InternalMwe2Parser.g:2804:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 
            // InternalMwe2Parser.g:2805:1: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA25_0>=ReverseSolidusQuotationMark && LA25_0<=ReverseSolidusReverseSolidus)||LA25_0==RULE_ID||(LA25_0>=RULE_WS && LA25_0<=RULE_ANY_OTHER)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMwe2Parser.g:2805:2: rule__StringLiteral__PartsAssignment_0_2_1
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
    // InternalMwe2Parser.g:2819:1: rule__StringLiteral__Group_1__0 : rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 ;
    public final void rule__StringLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2823:1: ( rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 )
            // InternalMwe2Parser.g:2824:2: rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMwe2Parser.g:2831:1: rule__StringLiteral__Group_1__0__Impl : ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) ;
    public final void rule__StringLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2835:1: ( ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) )
            // InternalMwe2Parser.g:2836:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            {
            // InternalMwe2Parser.g:2836:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            // InternalMwe2Parser.g:2837:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 
            // InternalMwe2Parser.g:2838:1: ( rule__StringLiteral__BeginAssignment_1_0 )
            // InternalMwe2Parser.g:2838:2: rule__StringLiteral__BeginAssignment_1_0
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
    // InternalMwe2Parser.g:2848:1: rule__StringLiteral__Group_1__1 : rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 ;
    public final void rule__StringLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2852:1: ( rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 )
            // InternalMwe2Parser.g:2853:2: rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMwe2Parser.g:2860:1: rule__StringLiteral__Group_1__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) ;
    public final void rule__StringLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2864:1: ( ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) )
            // InternalMwe2Parser.g:2865:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            {
            // InternalMwe2Parser.g:2865:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            // InternalMwe2Parser.g:2866:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 
            // InternalMwe2Parser.g:2867:1: ( rule__StringLiteral__PartsAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA26_0>=ReverseSolidusQuotationMark && LA26_0<=ReverseSolidusReverseSolidus)||LA26_0==RULE_ID||(LA26_0>=RULE_WS && LA26_0<=RULE_ANY_OTHER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMwe2Parser.g:2867:2: rule__StringLiteral__PartsAssignment_1_1
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
    // InternalMwe2Parser.g:2877:1: rule__StringLiteral__Group_1__2 : rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 ;
    public final void rule__StringLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2881:1: ( rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 )
            // InternalMwe2Parser.g:2882:2: rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMwe2Parser.g:2889:1: rule__StringLiteral__Group_1__2__Impl : ( ( rule__StringLiteral__Group_1_2__0 )* ) ;
    public final void rule__StringLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2893:1: ( ( ( rule__StringLiteral__Group_1_2__0 )* ) )
            // InternalMwe2Parser.g:2894:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            {
            // InternalMwe2Parser.g:2894:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            // InternalMwe2Parser.g:2895:1: ( rule__StringLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 
            // InternalMwe2Parser.g:2896:1: ( rule__StringLiteral__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DollarSignLeftCurlyBracket) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMwe2Parser.g:2896:2: rule__StringLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__StringLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMwe2Parser.g:2906:1: rule__StringLiteral__Group_1__3 : rule__StringLiteral__Group_1__3__Impl ;
    public final void rule__StringLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2910:1: ( rule__StringLiteral__Group_1__3__Impl )
            // InternalMwe2Parser.g:2911:2: rule__StringLiteral__Group_1__3__Impl
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
    // InternalMwe2Parser.g:2917:1: rule__StringLiteral__Group_1__3__Impl : ( ( rule__StringLiteral__EndAssignment_1_3 ) ) ;
    public final void rule__StringLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2921:1: ( ( ( rule__StringLiteral__EndAssignment_1_3 ) ) )
            // InternalMwe2Parser.g:2922:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            {
            // InternalMwe2Parser.g:2922:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            // InternalMwe2Parser.g:2923:1: ( rule__StringLiteral__EndAssignment_1_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 
            // InternalMwe2Parser.g:2924:1: ( rule__StringLiteral__EndAssignment_1_3 )
            // InternalMwe2Parser.g:2924:2: rule__StringLiteral__EndAssignment_1_3
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
    // InternalMwe2Parser.g:2942:1: rule__StringLiteral__Group_1_2__0 : rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 ;
    public final void rule__StringLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2946:1: ( rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 )
            // InternalMwe2Parser.g:2947:2: rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMwe2Parser.g:2954:1: rule__StringLiteral__Group_1_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) ;
    public final void rule__StringLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2958:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) )
            // InternalMwe2Parser.g:2959:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            {
            // InternalMwe2Parser.g:2959:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            // InternalMwe2Parser.g:2960:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 
            // InternalMwe2Parser.g:2961:1: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            // InternalMwe2Parser.g:2961:2: rule__StringLiteral__PartsAssignment_1_2_0
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
    // InternalMwe2Parser.g:2971:1: rule__StringLiteral__Group_1_2__1 : rule__StringLiteral__Group_1_2__1__Impl ;
    public final void rule__StringLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2975:1: ( rule__StringLiteral__Group_1_2__1__Impl )
            // InternalMwe2Parser.g:2976:2: rule__StringLiteral__Group_1_2__1__Impl
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
    // InternalMwe2Parser.g:2982:1: rule__StringLiteral__Group_1_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) ;
    public final void rule__StringLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:2986:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) )
            // InternalMwe2Parser.g:2987:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            {
            // InternalMwe2Parser.g:2987:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            // InternalMwe2Parser.g:2988:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 
            // InternalMwe2Parser.g:2989:1: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA28_0>=ReverseSolidusQuotationMark && LA28_0<=ReverseSolidusReverseSolidus)||LA28_0==RULE_ID||(LA28_0>=RULE_WS && LA28_0<=RULE_ANY_OTHER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMwe2Parser.g:2989:2: rule__StringLiteral__PartsAssignment_1_2_1
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
    // InternalMwe2Parser.g:3003:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3007:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // InternalMwe2Parser.g:3008:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
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
    // InternalMwe2Parser.g:3015:1: rule__PropertyReference__Group__0__Impl : ( DollarSignLeftCurlyBracket ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3019:1: ( ( DollarSignLeftCurlyBracket ) )
            // InternalMwe2Parser.g:3020:1: ( DollarSignLeftCurlyBracket )
            {
            // InternalMwe2Parser.g:3020:1: ( DollarSignLeftCurlyBracket )
            // InternalMwe2Parser.g:3021:1: DollarSignLeftCurlyBracket
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
    // InternalMwe2Parser.g:3034:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3038:1: ( rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 )
            // InternalMwe2Parser.g:3039:2: rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMwe2Parser.g:3046:1: rule__PropertyReference__Group__1__Impl : ( rulePropertyReferenceImpl ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3050:1: ( ( rulePropertyReferenceImpl ) )
            // InternalMwe2Parser.g:3051:1: ( rulePropertyReferenceImpl )
            {
            // InternalMwe2Parser.g:3051:1: ( rulePropertyReferenceImpl )
            // InternalMwe2Parser.g:3052:1: rulePropertyReferenceImpl
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
    // InternalMwe2Parser.g:3063:1: rule__PropertyReference__Group__2 : rule__PropertyReference__Group__2__Impl ;
    public final void rule__PropertyReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3067:1: ( rule__PropertyReference__Group__2__Impl )
            // InternalMwe2Parser.g:3068:2: rule__PropertyReference__Group__2__Impl
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
    // InternalMwe2Parser.g:3074:1: rule__PropertyReference__Group__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__PropertyReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3078:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:3079:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:3079:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:3080:1: RightCurlyBracket
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
    // InternalMwe2Parser.g:3100:1: rule__Module__CanonicalNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3104:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3105:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3105:1: ( ruleFQN )
            // InternalMwe2Parser.g:3106:1: ruleFQN
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
    // InternalMwe2Parser.g:3115:1: rule__Module__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3119:1: ( ( ruleImport ) )
            // InternalMwe2Parser.g:3120:1: ( ruleImport )
            {
            // InternalMwe2Parser.g:3120:1: ( ruleImport )
            // InternalMwe2Parser.g:3121:1: ruleImport
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
    // InternalMwe2Parser.g:3130:1: rule__Module__DeclaredPropertiesAssignment_4 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3134:1: ( ( ruleDeclaredProperty ) )
            // InternalMwe2Parser.g:3135:1: ( ruleDeclaredProperty )
            {
            // InternalMwe2Parser.g:3135:1: ( ruleDeclaredProperty )
            // InternalMwe2Parser.g:3136:1: ruleDeclaredProperty
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
    // InternalMwe2Parser.g:3145:1: rule__Module__RootAssignment_5 : ( ruleRootComponent ) ;
    public final void rule__Module__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3149:1: ( ( ruleRootComponent ) )
            // InternalMwe2Parser.g:3150:1: ( ruleRootComponent )
            {
            // InternalMwe2Parser.g:3150:1: ( ruleRootComponent )
            // InternalMwe2Parser.g:3151:1: ruleRootComponent
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
    // InternalMwe2Parser.g:3160:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3164:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3165:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3165:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3166:1: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
            // InternalMwe2Parser.g:3167:1: ( ruleFQN )
            // InternalMwe2Parser.g:3168:1: ruleFQN
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
    // InternalMwe2Parser.g:3179:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3183:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3184:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3184:1: ( ruleFQN )
            // InternalMwe2Parser.g:3185:1: ruleFQN
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
    // InternalMwe2Parser.g:3194:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3198:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3199:1: ( ruleValue )
            {
            // InternalMwe2Parser.g:3199:1: ( ruleValue )
            // InternalMwe2Parser.g:3200:1: ruleValue
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
    // InternalMwe2Parser.g:3209:1: rule__RootComponent__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3213:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3214:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3214:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3215:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:3216:1: ( ruleFQN )
            // InternalMwe2Parser.g:3217:1: ruleFQN
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
    // InternalMwe2Parser.g:3228:1: rule__RootComponent__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3232:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3233:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3233:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3234:1: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:3235:1: ( ruleFQN )
            // InternalMwe2Parser.g:3236:1: ruleFQN
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
    // InternalMwe2Parser.g:3247:1: rule__RootComponent__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__RootComponent__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3251:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3252:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3252:1: ( ruleFQN )
            // InternalMwe2Parser.g:3253:1: ruleFQN
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
    // InternalMwe2Parser.g:3262:1: rule__RootComponent__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__RootComponent__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3266:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:3267:1: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:3267:1: ( ( AutoInject ) )
            // InternalMwe2Parser.g:3268:1: ( AutoInject )
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:3269:1: ( AutoInject )
            // InternalMwe2Parser.g:3270:1: AutoInject
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
    // InternalMwe2Parser.g:3285:1: rule__RootComponent__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__RootComponent__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3289:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:3290:1: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:3290:1: ( ruleAssignment )
            // InternalMwe2Parser.g:3291:1: ruleAssignment
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
    // InternalMwe2Parser.g:3300:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3304:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3305:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3305:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3306:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:3307:1: ( ruleFQN )
            // InternalMwe2Parser.g:3308:1: ruleFQN
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
    // InternalMwe2Parser.g:3319:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3323:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3324:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3324:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3325:1: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:3326:1: ( ruleFQN )
            // InternalMwe2Parser.g:3327:1: ruleFQN
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
    // InternalMwe2Parser.g:3338:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3342:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3343:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:3343:1: ( ruleFQN )
            // InternalMwe2Parser.g:3344:1: ruleFQN
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
    // InternalMwe2Parser.g:3353:1: rule__Component__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3357:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:3358:1: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:3358:1: ( ( AutoInject ) )
            // InternalMwe2Parser.g:3359:1: ( AutoInject )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:3360:1: ( AutoInject )
            // InternalMwe2Parser.g:3361:1: AutoInject
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
    // InternalMwe2Parser.g:3376:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3380:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:3381:1: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:3381:1: ( ruleAssignment )
            // InternalMwe2Parser.g:3382:1: ruleAssignment
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
    // InternalMwe2Parser.g:3391:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3395:1: ( ( ruleImportedFQN ) )
            // InternalMwe2Parser.g:3396:1: ( ruleImportedFQN )
            {
            // InternalMwe2Parser.g:3396:1: ( ruleImportedFQN )
            // InternalMwe2Parser.g:3397:1: ruleImportedFQN
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
    // InternalMwe2Parser.g:3406:1: rule__Assignment__FeatureAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3410:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3411:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3411:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3412:1: ( ruleFQN )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
            // InternalMwe2Parser.g:3413:1: ( ruleFQN )
            // InternalMwe2Parser.g:3414:1: ruleFQN
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
    // InternalMwe2Parser.g:3425:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3429:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3430:1: ( ruleValue )
            {
            // InternalMwe2Parser.g:3430:1: ( ruleValue )
            // InternalMwe2Parser.g:3431:1: ruleValue
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
    // InternalMwe2Parser.g:3440:1: rule__DoubleLiteral__ValueAssignment : ( ruleDoubleValue ) ;
    public final void rule__DoubleLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3444:1: ( ( ruleDoubleValue ) )
            // InternalMwe2Parser.g:3445:1: ( ruleDoubleValue )
            {
            // InternalMwe2Parser.g:3445:1: ( ruleDoubleValue )
            // InternalMwe2Parser.g:3446:1: ruleDoubleValue
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
    // InternalMwe2Parser.g:3455:1: rule__IntegerLiteral__ValueAssignment : ( ruleIntValue ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3459:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:3460:1: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:3460:1: ( ruleIntValue )
            // InternalMwe2Parser.g:3461:1: ruleIntValue
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMwe2Parser.g:3470:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( True ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3474:1: ( ( ( True ) ) )
            // InternalMwe2Parser.g:3475:1: ( ( True ) )
            {
            // InternalMwe2Parser.g:3475:1: ( ( True ) )
            // InternalMwe2Parser.g:3476:1: ( True )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3477:1: ( True )
            // InternalMwe2Parser.g:3478:1: True
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
    // InternalMwe2Parser.g:3493:1: rule__Reference__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3497:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3498:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3498:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3499:1: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // InternalMwe2Parser.g:3500:1: ( ruleFQN )
            // InternalMwe2Parser.g:3501:1: ruleFQN
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
    // InternalMwe2Parser.g:3512:1: rule__StringLiteral__BeginAssignment_0_0 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3516:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3517:1: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3517:1: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3518:1: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            // InternalMwe2Parser.g:3519:1: ( Apostrophe )
            // InternalMwe2Parser.g:3520:1: Apostrophe
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
    // InternalMwe2Parser.g:3535:1: rule__StringLiteral__PartsAssignment_0_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3539:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3540:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3540:1: ( rulePlainString )
            // InternalMwe2Parser.g:3541:1: rulePlainString
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
    // InternalMwe2Parser.g:3550:1: rule__StringLiteral__PartsAssignment_0_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3554:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3555:1: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3555:1: ( rulePropertyReference )
            // InternalMwe2Parser.g:3556:1: rulePropertyReference
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
    // InternalMwe2Parser.g:3565:1: rule__StringLiteral__PartsAssignment_0_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3569:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3570:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3570:1: ( rulePlainString )
            // InternalMwe2Parser.g:3571:1: rulePlainString
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
    // InternalMwe2Parser.g:3580:1: rule__StringLiteral__EndAssignment_0_3 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3584:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3585:1: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3585:1: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3586:1: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            // InternalMwe2Parser.g:3587:1: ( Apostrophe )
            // InternalMwe2Parser.g:3588:1: Apostrophe
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
    // InternalMwe2Parser.g:3603:1: rule__StringLiteral__BeginAssignment_1_0 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3607:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3608:1: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3608:1: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3609:1: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3610:1: ( QuotationMark )
            // InternalMwe2Parser.g:3611:1: QuotationMark
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
    // InternalMwe2Parser.g:3626:1: rule__StringLiteral__PartsAssignment_1_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3630:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3631:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3631:1: ( rulePlainString )
            // InternalMwe2Parser.g:3632:1: rulePlainString
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
    // InternalMwe2Parser.g:3641:1: rule__StringLiteral__PartsAssignment_1_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3645:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3646:1: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3646:1: ( rulePropertyReference )
            // InternalMwe2Parser.g:3647:1: rulePropertyReference
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
    // InternalMwe2Parser.g:3656:1: rule__StringLiteral__PartsAssignment_1_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3660:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3661:1: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3661:1: ( rulePlainString )
            // InternalMwe2Parser.g:3662:1: rulePlainString
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
    // InternalMwe2Parser.g:3671:1: rule__StringLiteral__EndAssignment_1_3 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__EndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3675:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3676:1: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3676:1: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3677:1: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            // InternalMwe2Parser.g:3678:1: ( QuotationMark )
            // InternalMwe2Parser.g:3679:1: QuotationMark
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
    // InternalMwe2Parser.g:3694:1: rule__PropertyReferenceImpl__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReferenceImpl__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3698:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3699:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3699:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3700:1: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            // InternalMwe2Parser.g:3701:1: ( ruleFQN )
            // InternalMwe2Parser.g:3702:1: ruleFQN
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
    // InternalMwe2Parser.g:3713:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMwe2Parser.g:3717:1: ( ( ruleConstantValue ) )
            // InternalMwe2Parser.g:3718:1: ( ruleConstantValue )
            {
            // InternalMwe2Parser.g:3718:1: ( ruleConstantValue )
            // InternalMwe2Parser.g:3719:1: ruleConstantValue
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
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\uffff\1\12\5\uffff\1\14\5\uffff\1\12";
    static final String dfa_3s = "\2\4\3\uffff\2\34\1\13\1\uffff\1\33\3\uffff\1\4";
    static final String dfa_4s = "\1\34\1\33\3\uffff\2\34\1\33\1\uffff\1\33\3\uffff\1\33";
    static final String dfa_5s = "\2\uffff\1\1\1\2\1\3\3\uffff\1\6\1\uffff\1\7\1\5\1\4\1\uffff";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\4\1\10\1\4\7\uffff\2\3\1\6\1\5\1\uffff\1\2\1\uffff\2\2\1\uffff\1\1\1\7",
            "\1\2\6\uffff\1\12\11\uffff\1\11\1\2\1\uffff\1\12\1\2\2\12",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\14\11\uffff\1\13\2\uffff\1\14\1\uffff\2\14",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\2\6\uffff\1\12\11\uffff\1\11\1\2\1\uffff\1\12\1\2\2\12"
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
            return "749:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );";
        }
    }
    static final String dfa_8s = "\11\uffff";
    static final String dfa_9s = "\1\uffff\1\3\2\uffff\1\7\1\3\2\uffff\1\7";
    static final String dfa_10s = "\1\33\1\13\1\33\1\uffff\1\4\1\13\1\33\1\uffff\1\4";
    static final String dfa_11s = "\3\33\1\uffff\3\33\1\uffff\1\33";
    static final String dfa_12s = "\3\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_13s = "\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\11\uffff\1\2\1\uffff\2\3\2\uffff\1\4",
            "\1\5",
            "",
            "\1\3\6\uffff\1\7\11\uffff\1\6\1\3\2\7\1\3\1\uffff\1\7",
            "\1\3\11\uffff\1\2\1\uffff\2\3\2\uffff\1\4",
            "\1\10",
            "",
            "\1\3\6\uffff\1\7\11\uffff\1\6\1\3\2\7\1\3\1\uffff\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1174:1: ( rule__DeclaredProperty__TypeAssignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000018801C402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000009000820L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001B5E0390L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000B400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010180000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000018805D400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000018801C400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000018803D400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});

}