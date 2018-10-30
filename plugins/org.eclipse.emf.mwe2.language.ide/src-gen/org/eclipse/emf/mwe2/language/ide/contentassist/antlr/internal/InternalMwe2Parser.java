package org.eclipse.emf.mwe2.language.ide.contentassist.antlr.internal;
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
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
    		tokenNameToValue.put("DollarSignLeftCurlyBracket", "'\\u0024{'");
    		tokenNameToValue.put("FullStopAsterisk", "'.*'");
    		tokenNameToValue.put("ReverseSolidusQuotationMark", "'\\\"'");
    		tokenNameToValue.put("ReverseSolidusApostrophe", "'\\\''");
    		tokenNameToValue.put("ReverseSolidusReverseSolidus", "'\\\\'");
    		tokenNameToValue.put("ReverseSolidusDollarSignLeftCurlyBracket", "'\\\\u0024{'");
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
    // InternalMwe2Parser.g:82:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:83:1: ( ruleModule EOF )
            // InternalMwe2Parser.g:84:1: ruleModule EOF
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
    // InternalMwe2Parser.g:91:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:95:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalMwe2Parser.g:96:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalMwe2Parser.g:96:2: ( ( rule__Module__Group__0 ) )
            // InternalMwe2Parser.g:97:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalMwe2Parser.g:98:3: ( rule__Module__Group__0 )
            // InternalMwe2Parser.g:98:4: rule__Module__Group__0
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
    // InternalMwe2Parser.g:107:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:108:1: ( ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:109:1: ruleDeclaredProperty EOF
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
    // InternalMwe2Parser.g:116:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:120:2: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // InternalMwe2Parser.g:121:2: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // InternalMwe2Parser.g:121:2: ( ( rule__DeclaredProperty__Group__0 ) )
            // InternalMwe2Parser.g:122:3: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // InternalMwe2Parser.g:123:3: ( rule__DeclaredProperty__Group__0 )
            // InternalMwe2Parser.g:123:4: rule__DeclaredProperty__Group__0
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
    // InternalMwe2Parser.g:132:1: entryRuleRootComponent : ruleRootComponent EOF ;
    public final void entryRuleRootComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:133:1: ( ruleRootComponent EOF )
            // InternalMwe2Parser.g:134:1: ruleRootComponent EOF
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
    // InternalMwe2Parser.g:141:1: ruleRootComponent : ( ( rule__RootComponent__Group__0 ) ) ;
    public final void ruleRootComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:145:2: ( ( ( rule__RootComponent__Group__0 ) ) )
            // InternalMwe2Parser.g:146:2: ( ( rule__RootComponent__Group__0 ) )
            {
            // InternalMwe2Parser.g:146:2: ( ( rule__RootComponent__Group__0 ) )
            // InternalMwe2Parser.g:147:3: ( rule__RootComponent__Group__0 )
            {
             before(grammarAccess.getRootComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:148:3: ( rule__RootComponent__Group__0 )
            // InternalMwe2Parser.g:148:4: rule__RootComponent__Group__0
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
    // InternalMwe2Parser.g:157:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:158:1: ( ruleComponent EOF )
            // InternalMwe2Parser.g:159:1: ruleComponent EOF
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
    // InternalMwe2Parser.g:166:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:170:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMwe2Parser.g:171:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMwe2Parser.g:171:2: ( ( rule__Component__Group__0 ) )
            // InternalMwe2Parser.g:172:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:173:3: ( rule__Component__Group__0 )
            // InternalMwe2Parser.g:173:4: rule__Component__Group__0
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
    // InternalMwe2Parser.g:182:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:183:1: ( ruleImport EOF )
            // InternalMwe2Parser.g:184:1: ruleImport EOF
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
    // InternalMwe2Parser.g:191:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:195:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMwe2Parser.g:196:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMwe2Parser.g:196:2: ( ( rule__Import__Group__0 ) )
            // InternalMwe2Parser.g:197:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMwe2Parser.g:198:3: ( rule__Import__Group__0 )
            // InternalMwe2Parser.g:198:4: rule__Import__Group__0
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
    // InternalMwe2Parser.g:207:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:208:1: ( ruleImportedFQN EOF )
            // InternalMwe2Parser.g:209:1: ruleImportedFQN EOF
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
    // InternalMwe2Parser.g:216:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:220:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalMwe2Parser.g:221:2: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:221:2: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalMwe2Parser.g:222:3: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:223:3: ( rule__ImportedFQN__Group__0 )
            // InternalMwe2Parser.g:223:4: rule__ImportedFQN__Group__0
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
    // InternalMwe2Parser.g:232:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:233:1: ( ruleAssignment EOF )
            // InternalMwe2Parser.g:234:1: ruleAssignment EOF
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
    // InternalMwe2Parser.g:241:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:245:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMwe2Parser.g:246:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMwe2Parser.g:246:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMwe2Parser.g:247:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMwe2Parser.g:248:3: ( rule__Assignment__Group__0 )
            // InternalMwe2Parser.g:248:4: rule__Assignment__Group__0
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
    // InternalMwe2Parser.g:257:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:258:1: ( ruleValue EOF )
            // InternalMwe2Parser.g:259:1: ruleValue EOF
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
    // InternalMwe2Parser.g:266:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:270:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMwe2Parser.g:271:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMwe2Parser.g:271:2: ( ( rule__Value__Alternatives ) )
            // InternalMwe2Parser.g:272:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:273:3: ( rule__Value__Alternatives )
            // InternalMwe2Parser.g:273:4: rule__Value__Alternatives
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
    // InternalMwe2Parser.g:282:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:283:1: ( ruleNullLiteral EOF )
            // InternalMwe2Parser.g:284:1: ruleNullLiteral EOF
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
    // InternalMwe2Parser.g:291:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:295:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:296:2: ( ( rule__NullLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:296:2: ( ( rule__NullLiteral__Group__0 ) )
            // InternalMwe2Parser.g:297:3: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:298:3: ( rule__NullLiteral__Group__0 )
            // InternalMwe2Parser.g:298:4: rule__NullLiteral__Group__0
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
    // InternalMwe2Parser.g:307:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:308:1: ( ruleDoubleLiteral EOF )
            // InternalMwe2Parser.g:309:1: ruleDoubleLiteral EOF
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
    // InternalMwe2Parser.g:316:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__ValueAssignment ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:320:2: ( ( ( rule__DoubleLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:321:2: ( ( rule__DoubleLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:321:2: ( ( rule__DoubleLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:322:3: ( rule__DoubleLiteral__ValueAssignment )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:323:3: ( rule__DoubleLiteral__ValueAssignment )
            // InternalMwe2Parser.g:323:4: rule__DoubleLiteral__ValueAssignment
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
    // InternalMwe2Parser.g:332:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:333:1: ( ruleDoubleValue EOF )
            // InternalMwe2Parser.g:334:1: ruleDoubleValue EOF
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
    // InternalMwe2Parser.g:341:1: ruleDoubleValue : ( ( rule__DoubleValue__Group__0 ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:345:2: ( ( ( rule__DoubleValue__Group__0 ) ) )
            // InternalMwe2Parser.g:346:2: ( ( rule__DoubleValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:346:2: ( ( rule__DoubleValue__Group__0 ) )
            // InternalMwe2Parser.g:347:3: ( rule__DoubleValue__Group__0 )
            {
             before(grammarAccess.getDoubleValueAccess().getGroup()); 
            // InternalMwe2Parser.g:348:3: ( rule__DoubleValue__Group__0 )
            // InternalMwe2Parser.g:348:4: rule__DoubleValue__Group__0
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
    // InternalMwe2Parser.g:357:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:358:1: ( ruleIntegerLiteral EOF )
            // InternalMwe2Parser.g:359:1: ruleIntegerLiteral EOF
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
    // InternalMwe2Parser.g:366:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:370:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:371:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:371:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:372:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:373:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMwe2Parser.g:373:4: rule__IntegerLiteral__ValueAssignment
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
    // InternalMwe2Parser.g:382:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:383:1: ( ruleIntValue EOF )
            // InternalMwe2Parser.g:384:1: ruleIntValue EOF
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
    // InternalMwe2Parser.g:391:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:395:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalMwe2Parser.g:396:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:396:2: ( ( rule__IntValue__Group__0 ) )
            // InternalMwe2Parser.g:397:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalMwe2Parser.g:398:3: ( rule__IntValue__Group__0 )
            // InternalMwe2Parser.g:398:4: rule__IntValue__Group__0
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
    // InternalMwe2Parser.g:407:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:408:1: ( ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:409:1: ruleBooleanLiteral EOF
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
    // InternalMwe2Parser.g:416:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:420:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:421:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:421:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalMwe2Parser.g:422:3: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:423:3: ( rule__BooleanLiteral__Group__0 )
            // InternalMwe2Parser.g:423:4: rule__BooleanLiteral__Group__0
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
    // InternalMwe2Parser.g:432:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:433:1: ( ruleReference EOF )
            // InternalMwe2Parser.g:434:1: ruleReference EOF
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
    // InternalMwe2Parser.g:441:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:445:2: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:446:2: ( ( rule__Reference__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:446:2: ( ( rule__Reference__ReferableAssignment ) )
            // InternalMwe2Parser.g:447:3: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:448:3: ( rule__Reference__ReferableAssignment )
            // InternalMwe2Parser.g:448:4: rule__Reference__ReferableAssignment
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
    // InternalMwe2Parser.g:457:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:458:1: ( ruleFQN EOF )
            // InternalMwe2Parser.g:459:1: ruleFQN EOF
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
    // InternalMwe2Parser.g:466:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:470:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMwe2Parser.g:471:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:471:2: ( ( rule__FQN__Group__0 ) )
            // InternalMwe2Parser.g:472:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:473:3: ( rule__FQN__Group__0 )
            // InternalMwe2Parser.g:473:4: rule__FQN__Group__0
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
    // InternalMwe2Parser.g:482:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:486:1: ( ruleStringLiteral EOF )
            // InternalMwe2Parser.g:487:1: ruleStringLiteral EOF
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
    // InternalMwe2Parser.g:497:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:502:2: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // InternalMwe2Parser.g:503:2: ( ( rule__StringLiteral__Alternatives ) )
            {
            // InternalMwe2Parser.g:503:2: ( ( rule__StringLiteral__Alternatives ) )
            // InternalMwe2Parser.g:504:3: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // InternalMwe2Parser.g:505:3: ( rule__StringLiteral__Alternatives )
            // InternalMwe2Parser.g:505:4: rule__StringLiteral__Alternatives
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
    // InternalMwe2Parser.g:515:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:519:1: ( rulePropertyReference EOF )
            // InternalMwe2Parser.g:520:1: rulePropertyReference EOF
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
    // InternalMwe2Parser.g:530:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:535:2: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // InternalMwe2Parser.g:536:2: ( ( rule__PropertyReference__Group__0 ) )
            {
            // InternalMwe2Parser.g:536:2: ( ( rule__PropertyReference__Group__0 ) )
            // InternalMwe2Parser.g:537:3: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // InternalMwe2Parser.g:538:3: ( rule__PropertyReference__Group__0 )
            // InternalMwe2Parser.g:538:4: rule__PropertyReference__Group__0
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
    // InternalMwe2Parser.g:548:1: entryRulePropertyReferenceImpl : rulePropertyReferenceImpl EOF ;
    public final void entryRulePropertyReferenceImpl() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:552:1: ( rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:553:1: rulePropertyReferenceImpl EOF
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
    // InternalMwe2Parser.g:563:1: rulePropertyReferenceImpl : ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) ;
    public final void rulePropertyReferenceImpl() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:568:2: ( ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:569:2: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:569:2: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            // InternalMwe2Parser.g:570:3: ( rule__PropertyReferenceImpl__ReferableAssignment )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:571:3: ( rule__PropertyReferenceImpl__ReferableAssignment )
            // InternalMwe2Parser.g:571:4: rule__PropertyReferenceImpl__ReferableAssignment
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
    // InternalMwe2Parser.g:581:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:582:1: ( rulePlainString EOF )
            // InternalMwe2Parser.g:583:1: rulePlainString EOF
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
    // InternalMwe2Parser.g:590:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:594:2: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // InternalMwe2Parser.g:595:2: ( ( rule__PlainString__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:595:2: ( ( rule__PlainString__ValueAssignment ) )
            // InternalMwe2Parser.g:596:3: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:597:3: ( rule__PlainString__ValueAssignment )
            // InternalMwe2Parser.g:597:4: rule__PlainString__ValueAssignment
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
    // InternalMwe2Parser.g:606:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:607:1: ( ruleConstantValue EOF )
            // InternalMwe2Parser.g:608:1: ruleConstantValue EOF
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
    // InternalMwe2Parser.g:615:1: ruleConstantValue : ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:619:2: ( ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) )
            // InternalMwe2Parser.g:620:2: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            {
            // InternalMwe2Parser.g:620:2: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            // InternalMwe2Parser.g:621:3: ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* )
            {
            // InternalMwe2Parser.g:621:3: ( ( rule__ConstantValue__Alternatives ) )
            // InternalMwe2Parser.g:622:4: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:623:4: ( rule__ConstantValue__Alternatives )
            // InternalMwe2Parser.g:623:5: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }

            // InternalMwe2Parser.g:626:3: ( ( rule__ConstantValue__Alternatives )* )
            // InternalMwe2Parser.g:627:4: ( rule__ConstantValue__Alternatives )*
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:628:4: ( rule__ConstantValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA1_0>=ReverseSolidusQuotationMark && LA1_0<=ReverseSolidusReverseSolidus)||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:628:5: rule__ConstantValue__Alternatives
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
    // InternalMwe2Parser.g:637:1: rule__RootComponent__Alternatives_1 : ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) );
    public final void rule__RootComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:641:1: ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:642:2: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:642:2: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:643:3: ( rule__RootComponent__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:644:3: ( rule__RootComponent__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:644:4: rule__RootComponent__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:648:2: ( ( rule__RootComponent__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:648:2: ( ( rule__RootComponent__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:649:3: ( rule__RootComponent__Group_1_1__0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:650:3: ( rule__RootComponent__Group_1_1__0 )
                    // InternalMwe2Parser.g:650:4: rule__RootComponent__Group_1_1__0
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
    // InternalMwe2Parser.g:658:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:662:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:663:2: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:663:2: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:664:3: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:665:3: ( rule__Component__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:665:4: rule__Component__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:669:2: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:669:2: ( ( rule__Component__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:670:3: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:671:3: ( rule__Component__Group_1_1__0 )
                    // InternalMwe2Parser.g:671:4: rule__Component__Group_1_1__0
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
    // InternalMwe2Parser.g:679:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:683:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:684:2: ( ruleComponent )
                    {
                    // InternalMwe2Parser.g:684:2: ( ruleComponent )
                    // InternalMwe2Parser.g:685:3: ruleComponent
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
                    // InternalMwe2Parser.g:690:2: ( ruleStringLiteral )
                    {
                    // InternalMwe2Parser.g:690:2: ( ruleStringLiteral )
                    // InternalMwe2Parser.g:691:3: ruleStringLiteral
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
                    // InternalMwe2Parser.g:696:2: ( ruleBooleanLiteral )
                    {
                    // InternalMwe2Parser.g:696:2: ( ruleBooleanLiteral )
                    // InternalMwe2Parser.g:697:3: ruleBooleanLiteral
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
                    // InternalMwe2Parser.g:702:2: ( ruleIntegerLiteral )
                    {
                    // InternalMwe2Parser.g:702:2: ( ruleIntegerLiteral )
                    // InternalMwe2Parser.g:703:3: ruleIntegerLiteral
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
                    // InternalMwe2Parser.g:708:2: ( ruleDoubleLiteral )
                    {
                    // InternalMwe2Parser.g:708:2: ( ruleDoubleLiteral )
                    // InternalMwe2Parser.g:709:3: ruleDoubleLiteral
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
                    // InternalMwe2Parser.g:714:2: ( ruleNullLiteral )
                    {
                    // InternalMwe2Parser.g:714:2: ( ruleNullLiteral )
                    // InternalMwe2Parser.g:715:3: ruleNullLiteral
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
                    // InternalMwe2Parser.g:720:2: ( ruleReference )
                    {
                    // InternalMwe2Parser.g:720:2: ( ruleReference )
                    // InternalMwe2Parser.g:721:3: ruleReference
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
    // InternalMwe2Parser.g:730:1: rule__IntValue__Alternatives_0 : ( ( HyphenMinus ) | ( PlusSign ) );
    public final void rule__IntValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:734:1: ( ( HyphenMinus ) | ( PlusSign ) )
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
                    // InternalMwe2Parser.g:735:2: ( HyphenMinus )
                    {
                    // InternalMwe2Parser.g:735:2: ( HyphenMinus )
                    // InternalMwe2Parser.g:736:3: HyphenMinus
                    {
                     before(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,HyphenMinus,FOLLOW_2); 
                     after(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:741:2: ( PlusSign )
                    {
                    // InternalMwe2Parser.g:741:2: ( PlusSign )
                    // InternalMwe2Parser.g:742:3: PlusSign
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
    // InternalMwe2Parser.g:751:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:755:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) )
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
                    // InternalMwe2Parser.g:756:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:756:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // InternalMwe2Parser.g:757:3: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // InternalMwe2Parser.g:758:3: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // InternalMwe2Parser.g:758:4: rule__BooleanLiteral__IsTrueAssignment_1_0
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
                    // InternalMwe2Parser.g:762:2: ( False )
                    {
                    // InternalMwe2Parser.g:762:2: ( False )
                    // InternalMwe2Parser.g:763:3: False
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
    // InternalMwe2Parser.g:772:1: rule__StringLiteral__Alternatives : ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:776:1: ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) )
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
                    // InternalMwe2Parser.g:777:2: ( ( rule__StringLiteral__Group_0__0 ) )
                    {
                    // InternalMwe2Parser.g:777:2: ( ( rule__StringLiteral__Group_0__0 ) )
                    // InternalMwe2Parser.g:778:3: ( rule__StringLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_0()); 
                    // InternalMwe2Parser.g:779:3: ( rule__StringLiteral__Group_0__0 )
                    // InternalMwe2Parser.g:779:4: rule__StringLiteral__Group_0__0
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
                    // InternalMwe2Parser.g:783:2: ( ( rule__StringLiteral__Group_1__0 ) )
                    {
                    // InternalMwe2Parser.g:783:2: ( ( rule__StringLiteral__Group_1__0 ) )
                    // InternalMwe2Parser.g:784:3: ( rule__StringLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_1()); 
                    // InternalMwe2Parser.g:785:3: ( rule__StringLiteral__Group_1__0 )
                    // InternalMwe2Parser.g:785:4: rule__StringLiteral__Group_1__0
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
    // InternalMwe2Parser.g:793:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:797:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) )
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
                    // InternalMwe2Parser.g:798:2: ( RULE_WS )
                    {
                    // InternalMwe2Parser.g:798:2: ( RULE_WS )
                    // InternalMwe2Parser.g:799:3: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:804:2: ( RULE_ANY_OTHER )
                    {
                    // InternalMwe2Parser.g:804:2: ( RULE_ANY_OTHER )
                    // InternalMwe2Parser.g:805:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:810:2: ( RULE_ID )
                    {
                    // InternalMwe2Parser.g:810:2: ( RULE_ID )
                    // InternalMwe2Parser.g:811:3: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:816:2: ( ReverseSolidusApostrophe )
                    {
                    // InternalMwe2Parser.g:816:2: ( ReverseSolidusApostrophe )
                    // InternalMwe2Parser.g:817:3: ReverseSolidusApostrophe
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
                    match(input,ReverseSolidusApostrophe,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:822:2: ( ReverseSolidusQuotationMark )
                    {
                    // InternalMwe2Parser.g:822:2: ( ReverseSolidusQuotationMark )
                    // InternalMwe2Parser.g:823:3: ReverseSolidusQuotationMark
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
                    match(input,ReverseSolidusQuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:828:2: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    {
                    // InternalMwe2Parser.g:828:2: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    // InternalMwe2Parser.g:829:3: ReverseSolidusDollarSignLeftCurlyBracket
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
                    match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:834:2: ( ReverseSolidusReverseSolidus )
                    {
                    // InternalMwe2Parser.g:834:2: ( ReverseSolidusReverseSolidus )
                    // InternalMwe2Parser.g:835:3: ReverseSolidusReverseSolidus
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
    // InternalMwe2Parser.g:844:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:848:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalMwe2Parser.g:849:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalMwe2Parser.g:856:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:860:1: ( ( () ) )
            // InternalMwe2Parser.g:861:1: ( () )
            {
            // InternalMwe2Parser.g:861:1: ( () )
            // InternalMwe2Parser.g:862:2: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // InternalMwe2Parser.g:863:2: ()
            // InternalMwe2Parser.g:863:3: 
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
    // InternalMwe2Parser.g:871:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:875:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalMwe2Parser.g:876:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalMwe2Parser.g:883:1: rule__Module__Group__1__Impl : ( Module ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:887:1: ( ( Module ) )
            // InternalMwe2Parser.g:888:1: ( Module )
            {
            // InternalMwe2Parser.g:888:1: ( Module )
            // InternalMwe2Parser.g:889:2: Module
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
    // InternalMwe2Parser.g:898:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:902:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalMwe2Parser.g:903:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalMwe2Parser.g:910:1: rule__Module__Group__2__Impl : ( ( rule__Module__CanonicalNameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:914:1: ( ( ( rule__Module__CanonicalNameAssignment_2 ) ) )
            // InternalMwe2Parser.g:915:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:915:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            // InternalMwe2Parser.g:916:2: ( rule__Module__CanonicalNameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 
            // InternalMwe2Parser.g:917:2: ( rule__Module__CanonicalNameAssignment_2 )
            // InternalMwe2Parser.g:917:3: rule__Module__CanonicalNameAssignment_2
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
    // InternalMwe2Parser.g:925:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:929:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalMwe2Parser.g:930:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalMwe2Parser.g:937:1: rule__Module__Group__3__Impl : ( ( rule__Module__ImportsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:941:1: ( ( ( rule__Module__ImportsAssignment_3 )* ) )
            // InternalMwe2Parser.g:942:1: ( ( rule__Module__ImportsAssignment_3 )* )
            {
            // InternalMwe2Parser.g:942:1: ( ( rule__Module__ImportsAssignment_3 )* )
            // InternalMwe2Parser.g:943:2: ( rule__Module__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_3()); 
            // InternalMwe2Parser.g:944:2: ( rule__Module__ImportsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Import) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMwe2Parser.g:944:3: rule__Module__ImportsAssignment_3
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
    // InternalMwe2Parser.g:952:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:956:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalMwe2Parser.g:957:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalMwe2Parser.g:964:1: rule__Module__Group__4__Impl : ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:968:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) )
            // InternalMwe2Parser.g:969:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            {
            // InternalMwe2Parser.g:969:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            // InternalMwe2Parser.g:970:2: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 
            // InternalMwe2Parser.g:971:2: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMwe2Parser.g:971:3: rule__Module__DeclaredPropertiesAssignment_4
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
    // InternalMwe2Parser.g:979:1: rule__Module__Group__5 : rule__Module__Group__5__Impl ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:983:1: ( rule__Module__Group__5__Impl )
            // InternalMwe2Parser.g:984:2: rule__Module__Group__5__Impl
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
    // InternalMwe2Parser.g:990:1: rule__Module__Group__5__Impl : ( ( rule__Module__RootAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:994:1: ( ( ( rule__Module__RootAssignment_5 ) ) )
            // InternalMwe2Parser.g:995:1: ( ( rule__Module__RootAssignment_5 ) )
            {
            // InternalMwe2Parser.g:995:1: ( ( rule__Module__RootAssignment_5 ) )
            // InternalMwe2Parser.g:996:2: ( rule__Module__RootAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_5()); 
            // InternalMwe2Parser.g:997:2: ( rule__Module__RootAssignment_5 )
            // InternalMwe2Parser.g:997:3: rule__Module__RootAssignment_5
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
    // InternalMwe2Parser.g:1006:1: rule__DeclaredProperty__Group__0 : rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1010:1: ( rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 )
            // InternalMwe2Parser.g:1011:2: rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1
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
    // InternalMwe2Parser.g:1018:1: rule__DeclaredProperty__Group__0__Impl : ( Var ) ;
    public final void rule__DeclaredProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1022:1: ( ( Var ) )
            // InternalMwe2Parser.g:1023:1: ( Var )
            {
            // InternalMwe2Parser.g:1023:1: ( Var )
            // InternalMwe2Parser.g:1024:2: Var
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
    // InternalMwe2Parser.g:1033:1: rule__DeclaredProperty__Group__1 : rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1037:1: ( rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 )
            // InternalMwe2Parser.g:1038:2: rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2
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
    // InternalMwe2Parser.g:1045:1: rule__DeclaredProperty__Group__1__Impl : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) ;
    public final void rule__DeclaredProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1049:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) )
            // InternalMwe2Parser.g:1050:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            {
            // InternalMwe2Parser.g:1050:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // InternalMwe2Parser.g:1051:2: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // InternalMwe2Parser.g:1052:2: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:1052:3: rule__DeclaredProperty__TypeAssignment_1
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
    // InternalMwe2Parser.g:1060:1: rule__DeclaredProperty__Group__2 : rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1064:1: ( rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 )
            // InternalMwe2Parser.g:1065:2: rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3
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
    // InternalMwe2Parser.g:1072:1: rule__DeclaredProperty__Group__2__Impl : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) ;
    public final void rule__DeclaredProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1076:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) )
            // InternalMwe2Parser.g:1077:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1077:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // InternalMwe2Parser.g:1078:2: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // InternalMwe2Parser.g:1079:2: ( rule__DeclaredProperty__NameAssignment_2 )
            // InternalMwe2Parser.g:1079:3: rule__DeclaredProperty__NameAssignment_2
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
    // InternalMwe2Parser.g:1087:1: rule__DeclaredProperty__Group__3 : rule__DeclaredProperty__Group__3__Impl ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1091:1: ( rule__DeclaredProperty__Group__3__Impl )
            // InternalMwe2Parser.g:1092:2: rule__DeclaredProperty__Group__3__Impl
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
    // InternalMwe2Parser.g:1098:1: rule__DeclaredProperty__Group__3__Impl : ( ( rule__DeclaredProperty__Group_3__0 )? ) ;
    public final void rule__DeclaredProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1102:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) )
            // InternalMwe2Parser.g:1103:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            {
            // InternalMwe2Parser.g:1103:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // InternalMwe2Parser.g:1104:2: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // InternalMwe2Parser.g:1105:2: ( rule__DeclaredProperty__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EqualsSign) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMwe2Parser.g:1105:3: rule__DeclaredProperty__Group_3__0
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
    // InternalMwe2Parser.g:1114:1: rule__DeclaredProperty__Group_3__0 : rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1118:1: ( rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 )
            // InternalMwe2Parser.g:1119:2: rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1
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
    // InternalMwe2Parser.g:1126:1: rule__DeclaredProperty__Group_3__0__Impl : ( EqualsSign ) ;
    public final void rule__DeclaredProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1130:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1131:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1131:1: ( EqualsSign )
            // InternalMwe2Parser.g:1132:2: EqualsSign
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
    // InternalMwe2Parser.g:1141:1: rule__DeclaredProperty__Group_3__1 : rule__DeclaredProperty__Group_3__1__Impl ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1145:1: ( rule__DeclaredProperty__Group_3__1__Impl )
            // InternalMwe2Parser.g:1146:2: rule__DeclaredProperty__Group_3__1__Impl
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
    // InternalMwe2Parser.g:1152:1: rule__DeclaredProperty__Group_3__1__Impl : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1156:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // InternalMwe2Parser.g:1157:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // InternalMwe2Parser.g:1157:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // InternalMwe2Parser.g:1158:2: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // InternalMwe2Parser.g:1159:2: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // InternalMwe2Parser.g:1159:3: rule__DeclaredProperty__DefaultAssignment_3_1
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
    // InternalMwe2Parser.g:1168:1: rule__RootComponent__Group__0 : rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 ;
    public final void rule__RootComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1172:1: ( rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 )
            // InternalMwe2Parser.g:1173:2: rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1
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
    // InternalMwe2Parser.g:1180:1: rule__RootComponent__Group__0__Impl : ( () ) ;
    public final void rule__RootComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1184:1: ( ( () ) )
            // InternalMwe2Parser.g:1185:1: ( () )
            {
            // InternalMwe2Parser.g:1185:1: ( () )
            // InternalMwe2Parser.g:1186:2: ()
            {
             before(grammarAccess.getRootComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1187:2: ()
            // InternalMwe2Parser.g:1187:3: 
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
    // InternalMwe2Parser.g:1195:1: rule__RootComponent__Group__1 : rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 ;
    public final void rule__RootComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1199:1: ( rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 )
            // InternalMwe2Parser.g:1200:2: rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2
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
    // InternalMwe2Parser.g:1207:1: rule__RootComponent__Group__1__Impl : ( ( rule__RootComponent__Alternatives_1 ) ) ;
    public final void rule__RootComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1211:1: ( ( ( rule__RootComponent__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:1212:1: ( ( rule__RootComponent__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:1212:1: ( ( rule__RootComponent__Alternatives_1 ) )
            // InternalMwe2Parser.g:1213:2: ( rule__RootComponent__Alternatives_1 )
            {
             before(grammarAccess.getRootComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1214:2: ( rule__RootComponent__Alternatives_1 )
            // InternalMwe2Parser.g:1214:3: rule__RootComponent__Alternatives_1
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
    // InternalMwe2Parser.g:1222:1: rule__RootComponent__Group__2 : rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 ;
    public final void rule__RootComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1226:1: ( rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 )
            // InternalMwe2Parser.g:1227:2: rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3
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
    // InternalMwe2Parser.g:1234:1: rule__RootComponent__Group__2__Impl : ( ( rule__RootComponent__Group_2__0 )? ) ;
    public final void rule__RootComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1238:1: ( ( ( rule__RootComponent__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1239:1: ( ( rule__RootComponent__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1239:1: ( ( rule__RootComponent__Group_2__0 )? )
            // InternalMwe2Parser.g:1240:2: ( rule__RootComponent__Group_2__0 )?
            {
             before(grammarAccess.getRootComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1241:2: ( rule__RootComponent__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Colon) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:1241:3: rule__RootComponent__Group_2__0
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
    // InternalMwe2Parser.g:1249:1: rule__RootComponent__Group__3 : rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 ;
    public final void rule__RootComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1253:1: ( rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 )
            // InternalMwe2Parser.g:1254:2: rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4
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
    // InternalMwe2Parser.g:1261:1: rule__RootComponent__Group__3__Impl : ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) ;
    public final void rule__RootComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1265:1: ( ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1266:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1266:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1267:2: ( rule__RootComponent__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1268:2: ( rule__RootComponent__AutoInjectAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AutoInject) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMwe2Parser.g:1268:3: rule__RootComponent__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1276:1: rule__RootComponent__Group__4 : rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 ;
    public final void rule__RootComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1280:1: ( rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 )
            // InternalMwe2Parser.g:1281:2: rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5
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
    // InternalMwe2Parser.g:1288:1: rule__RootComponent__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RootComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1292:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1293:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1293:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1294:2: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1303:1: rule__RootComponent__Group__5 : rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 ;
    public final void rule__RootComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1307:1: ( rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 )
            // InternalMwe2Parser.g:1308:2: rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6
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
    // InternalMwe2Parser.g:1315:1: rule__RootComponent__Group__5__Impl : ( ( rule__RootComponent__AssignmentAssignment_5 )* ) ;
    public final void rule__RootComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1319:1: ( ( ( rule__RootComponent__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1320:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1320:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1321:2: ( rule__RootComponent__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1322:2: ( rule__RootComponent__AssignmentAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMwe2Parser.g:1322:3: rule__RootComponent__AssignmentAssignment_5
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
    // InternalMwe2Parser.g:1330:1: rule__RootComponent__Group__6 : rule__RootComponent__Group__6__Impl ;
    public final void rule__RootComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1334:1: ( rule__RootComponent__Group__6__Impl )
            // InternalMwe2Parser.g:1335:2: rule__RootComponent__Group__6__Impl
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
    // InternalMwe2Parser.g:1341:1: rule__RootComponent__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__RootComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1345:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1346:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1346:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1347:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:1357:1: rule__RootComponent__Group_1_1__0 : rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 ;
    public final void rule__RootComponent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1361:1: ( rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 )
            // InternalMwe2Parser.g:1362:2: rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1
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
    // InternalMwe2Parser.g:1369:1: rule__RootComponent__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__RootComponent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1373:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1374:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1374:1: ( CommercialAt )
            // InternalMwe2Parser.g:1375:2: CommercialAt
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
    // InternalMwe2Parser.g:1384:1: rule__RootComponent__Group_1_1__1 : rule__RootComponent__Group_1_1__1__Impl ;
    public final void rule__RootComponent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1388:1: ( rule__RootComponent__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1389:2: rule__RootComponent__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1395:1: rule__RootComponent__Group_1_1__1__Impl : ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__RootComponent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1399:1: ( ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1400:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1400:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1401:2: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1402:2: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1402:3: rule__RootComponent__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1411:1: rule__RootComponent__Group_2__0 : rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 ;
    public final void rule__RootComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1415:1: ( rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 )
            // InternalMwe2Parser.g:1416:2: rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1
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
    // InternalMwe2Parser.g:1423:1: rule__RootComponent__Group_2__0__Impl : ( Colon ) ;
    public final void rule__RootComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1427:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1428:1: ( Colon )
            {
            // InternalMwe2Parser.g:1428:1: ( Colon )
            // InternalMwe2Parser.g:1429:2: Colon
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
    // InternalMwe2Parser.g:1438:1: rule__RootComponent__Group_2__1 : rule__RootComponent__Group_2__1__Impl ;
    public final void rule__RootComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1442:1: ( rule__RootComponent__Group_2__1__Impl )
            // InternalMwe2Parser.g:1443:2: rule__RootComponent__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1449:1: rule__RootComponent__Group_2__1__Impl : ( ( rule__RootComponent__NameAssignment_2_1 ) ) ;
    public final void rule__RootComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1453:1: ( ( ( rule__RootComponent__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1454:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1454:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1455:2: ( rule__RootComponent__NameAssignment_2_1 )
            {
             before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1456:2: ( rule__RootComponent__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1456:3: rule__RootComponent__NameAssignment_2_1
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
    // InternalMwe2Parser.g:1465:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1469:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMwe2Parser.g:1470:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMwe2Parser.g:1477:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1481:1: ( ( () ) )
            // InternalMwe2Parser.g:1482:1: ( () )
            {
            // InternalMwe2Parser.g:1482:1: ( () )
            // InternalMwe2Parser.g:1483:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1484:2: ()
            // InternalMwe2Parser.g:1484:3: 
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
    // InternalMwe2Parser.g:1492:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1496:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMwe2Parser.g:1497:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMwe2Parser.g:1504:1: rule__Component__Group__1__Impl : ( ( rule__Component__Alternatives_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1508:1: ( ( ( rule__Component__Alternatives_1 )? ) )
            // InternalMwe2Parser.g:1509:1: ( ( rule__Component__Alternatives_1 )? )
            {
            // InternalMwe2Parser.g:1509:1: ( ( rule__Component__Alternatives_1 )? )
            // InternalMwe2Parser.g:1510:2: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1511:2: ( rule__Component__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CommercialAt||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMwe2Parser.g:1511:3: rule__Component__Alternatives_1
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
    // InternalMwe2Parser.g:1519:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1523:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMwe2Parser.g:1524:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMwe2Parser.g:1531:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1535:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1536:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1536:1: ( ( rule__Component__Group_2__0 )? )
            // InternalMwe2Parser.g:1537:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1538:2: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Colon) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMwe2Parser.g:1538:3: rule__Component__Group_2__0
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
    // InternalMwe2Parser.g:1546:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1550:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMwe2Parser.g:1551:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMwe2Parser.g:1558:1: rule__Component__Group__3__Impl : ( ( rule__Component__AutoInjectAssignment_3 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1562:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1563:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1563:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1564:2: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1565:2: ( rule__Component__AutoInjectAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AutoInject) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMwe2Parser.g:1565:3: rule__Component__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1573:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1577:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMwe2Parser.g:1578:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMwe2Parser.g:1585:1: rule__Component__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1589:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1590:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1590:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1591:2: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1600:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1604:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMwe2Parser.g:1605:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalMwe2Parser.g:1612:1: rule__Component__Group__5__Impl : ( ( rule__Component__AssignmentAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1616:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1617:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1617:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1618:2: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1619:2: ( rule__Component__AssignmentAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMwe2Parser.g:1619:3: rule__Component__AssignmentAssignment_5
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
    // InternalMwe2Parser.g:1627:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1631:1: ( rule__Component__Group__6__Impl )
            // InternalMwe2Parser.g:1632:2: rule__Component__Group__6__Impl
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
    // InternalMwe2Parser.g:1638:1: rule__Component__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1642:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1643:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1643:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1644:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:1654:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1658:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // InternalMwe2Parser.g:1659:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
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
    // InternalMwe2Parser.g:1666:1: rule__Component__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1670:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1671:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1671:1: ( CommercialAt )
            // InternalMwe2Parser.g:1672:2: CommercialAt
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
    // InternalMwe2Parser.g:1681:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1685:1: ( rule__Component__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1686:2: rule__Component__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1692:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1696:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1697:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1697:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1698:2: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1699:2: ( rule__Component__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1699:3: rule__Component__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1708:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1712:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalMwe2Parser.g:1713:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
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
    // InternalMwe2Parser.g:1720:1: rule__Component__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1724:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1725:1: ( Colon )
            {
            // InternalMwe2Parser.g:1725:1: ( Colon )
            // InternalMwe2Parser.g:1726:2: Colon
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
    // InternalMwe2Parser.g:1735:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1739:1: ( rule__Component__Group_2__1__Impl )
            // InternalMwe2Parser.g:1740:2: rule__Component__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1746:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1750:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1751:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1751:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1752:2: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1753:2: ( rule__Component__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1753:3: rule__Component__NameAssignment_2_1
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
    // InternalMwe2Parser.g:1762:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1766:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMwe2Parser.g:1767:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMwe2Parser.g:1774:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1778:1: ( ( Import ) )
            // InternalMwe2Parser.g:1779:1: ( Import )
            {
            // InternalMwe2Parser.g:1779:1: ( Import )
            // InternalMwe2Parser.g:1780:2: Import
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
    // InternalMwe2Parser.g:1789:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1793:1: ( rule__Import__Group__1__Impl )
            // InternalMwe2Parser.g:1794:2: rule__Import__Group__1__Impl
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
    // InternalMwe2Parser.g:1800:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1804:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMwe2Parser.g:1805:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMwe2Parser.g:1805:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMwe2Parser.g:1806:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMwe2Parser.g:1807:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMwe2Parser.g:1807:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMwe2Parser.g:1816:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1820:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalMwe2Parser.g:1821:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
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
    // InternalMwe2Parser.g:1828:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1832:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:1833:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:1833:1: ( ruleFQN )
            // InternalMwe2Parser.g:1834:2: ruleFQN
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
    // InternalMwe2Parser.g:1843:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1847:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalMwe2Parser.g:1848:2: rule__ImportedFQN__Group__1__Impl
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
    // InternalMwe2Parser.g:1854:1: rule__ImportedFQN__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1858:1: ( ( ( FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:1859:1: ( ( FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:1859:1: ( ( FullStopAsterisk )? )
            // InternalMwe2Parser.g:1860:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMwe2Parser.g:1861:2: ( FullStopAsterisk )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FullStopAsterisk) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMwe2Parser.g:1861:3: FullStopAsterisk
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
    // InternalMwe2Parser.g:1870:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1874:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMwe2Parser.g:1875:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalMwe2Parser.g:1882:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__FeatureAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1886:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) )
            // InternalMwe2Parser.g:1887:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            {
            // InternalMwe2Parser.g:1887:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // InternalMwe2Parser.g:1888:2: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // InternalMwe2Parser.g:1889:2: ( rule__Assignment__FeatureAssignment_0 )
            // InternalMwe2Parser.g:1889:3: rule__Assignment__FeatureAssignment_0
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
    // InternalMwe2Parser.g:1897:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1901:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMwe2Parser.g:1902:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalMwe2Parser.g:1909:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1913:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1914:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1914:1: ( EqualsSign )
            // InternalMwe2Parser.g:1915:2: EqualsSign
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
    // InternalMwe2Parser.g:1924:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1928:1: ( rule__Assignment__Group__2__Impl )
            // InternalMwe2Parser.g:1929:2: rule__Assignment__Group__2__Impl
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
    // InternalMwe2Parser.g:1935:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1939:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMwe2Parser.g:1940:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1940:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMwe2Parser.g:1941:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMwe2Parser.g:1942:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMwe2Parser.g:1942:3: rule__Assignment__ValueAssignment_2
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
    // InternalMwe2Parser.g:1951:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1955:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // InternalMwe2Parser.g:1956:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
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
    // InternalMwe2Parser.g:1963:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1967:1: ( ( () ) )
            // InternalMwe2Parser.g:1968:1: ( () )
            {
            // InternalMwe2Parser.g:1968:1: ( () )
            // InternalMwe2Parser.g:1969:2: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // InternalMwe2Parser.g:1970:2: ()
            // InternalMwe2Parser.g:1970:3: 
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
    // InternalMwe2Parser.g:1978:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1982:1: ( rule__NullLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:1983:2: rule__NullLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:1989:1: rule__NullLiteral__Group__1__Impl : ( Null ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1993:1: ( ( Null ) )
            // InternalMwe2Parser.g:1994:1: ( Null )
            {
            // InternalMwe2Parser.g:1994:1: ( Null )
            // InternalMwe2Parser.g:1995:2: Null
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
    // InternalMwe2Parser.g:2005:1: rule__DoubleValue__Group__0 : rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 ;
    public final void rule__DoubleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2009:1: ( rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 )
            // InternalMwe2Parser.g:2010:2: rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1
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
    // InternalMwe2Parser.g:2017:1: rule__DoubleValue__Group__0__Impl : ( ruleIntValue ) ;
    public final void rule__DoubleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2021:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:2022:1: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:2022:1: ( ruleIntValue )
            // InternalMwe2Parser.g:2023:2: ruleIntValue
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
    // InternalMwe2Parser.g:2032:1: rule__DoubleValue__Group__1 : rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 ;
    public final void rule__DoubleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2036:1: ( rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 )
            // InternalMwe2Parser.g:2037:2: rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2
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
    // InternalMwe2Parser.g:2044:1: rule__DoubleValue__Group__1__Impl : ( FullStop ) ;
    public final void rule__DoubleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2048:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2049:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2049:1: ( FullStop )
            // InternalMwe2Parser.g:2050:2: FullStop
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
    // InternalMwe2Parser.g:2059:1: rule__DoubleValue__Group__2 : rule__DoubleValue__Group__2__Impl ;
    public final void rule__DoubleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2063:1: ( rule__DoubleValue__Group__2__Impl )
            // InternalMwe2Parser.g:2064:2: rule__DoubleValue__Group__2__Impl
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
    // InternalMwe2Parser.g:2070:1: rule__DoubleValue__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2074:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2075:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2075:1: ( RULE_INT )
            // InternalMwe2Parser.g:2076:2: RULE_INT
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
    // InternalMwe2Parser.g:2086:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2090:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalMwe2Parser.g:2091:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
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
    // InternalMwe2Parser.g:2098:1: rule__IntValue__Group__0__Impl : ( ( rule__IntValue__Alternatives_0 )? ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2102:1: ( ( ( rule__IntValue__Alternatives_0 )? ) )
            // InternalMwe2Parser.g:2103:1: ( ( rule__IntValue__Alternatives_0 )? )
            {
            // InternalMwe2Parser.g:2103:1: ( ( rule__IntValue__Alternatives_0 )? )
            // InternalMwe2Parser.g:2104:2: ( rule__IntValue__Alternatives_0 )?
            {
             before(grammarAccess.getIntValueAccess().getAlternatives_0()); 
            // InternalMwe2Parser.g:2105:2: ( rule__IntValue__Alternatives_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PlusSign && LA21_0<=HyphenMinus)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMwe2Parser.g:2105:3: rule__IntValue__Alternatives_0
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
    // InternalMwe2Parser.g:2113:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2117:1: ( rule__IntValue__Group__1__Impl )
            // InternalMwe2Parser.g:2118:2: rule__IntValue__Group__1__Impl
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
    // InternalMwe2Parser.g:2124:1: rule__IntValue__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2128:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2129:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2129:1: ( RULE_INT )
            // InternalMwe2Parser.g:2130:2: RULE_INT
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
    // InternalMwe2Parser.g:2140:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2144:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalMwe2Parser.g:2145:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
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
    // InternalMwe2Parser.g:2152:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2156:1: ( ( () ) )
            // InternalMwe2Parser.g:2157:1: ( () )
            {
            // InternalMwe2Parser.g:2157:1: ( () )
            // InternalMwe2Parser.g:2158:2: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalMwe2Parser.g:2159:2: ()
            // InternalMwe2Parser.g:2159:3: 
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
    // InternalMwe2Parser.g:2167:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2171:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2172:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:2178:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2182:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:2183:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:2183:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalMwe2Parser.g:2184:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:2185:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalMwe2Parser.g:2185:3: rule__BooleanLiteral__Alternatives_1
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
    // InternalMwe2Parser.g:2194:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2198:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMwe2Parser.g:2199:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalMwe2Parser.g:2206:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2210:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2211:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2211:1: ( RULE_ID )
            // InternalMwe2Parser.g:2212:2: RULE_ID
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
    // InternalMwe2Parser.g:2221:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2225:1: ( rule__FQN__Group__1__Impl )
            // InternalMwe2Parser.g:2226:2: rule__FQN__Group__1__Impl
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
    // InternalMwe2Parser.g:2232:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2236:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMwe2Parser.g:2237:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMwe2Parser.g:2237:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMwe2Parser.g:2238:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMwe2Parser.g:2239:2: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==FullStop) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMwe2Parser.g:2239:3: rule__FQN__Group_1__0
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
    // InternalMwe2Parser.g:2248:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2252:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMwe2Parser.g:2253:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalMwe2Parser.g:2260:1: rule__FQN__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2264:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2265:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2265:1: ( FullStop )
            // InternalMwe2Parser.g:2266:2: FullStop
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
    // InternalMwe2Parser.g:2275:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2279:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMwe2Parser.g:2280:2: rule__FQN__Group_1__1__Impl
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
    // InternalMwe2Parser.g:2286:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2290:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2291:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2291:1: ( RULE_ID )
            // InternalMwe2Parser.g:2292:2: RULE_ID
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
    // InternalMwe2Parser.g:2302:1: rule__StringLiteral__Group_0__0 : rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 ;
    public final void rule__StringLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2306:1: ( rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 )
            // InternalMwe2Parser.g:2307:2: rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1
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
    // InternalMwe2Parser.g:2314:1: rule__StringLiteral__Group_0__0__Impl : ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) ;
    public final void rule__StringLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2318:1: ( ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) )
            // InternalMwe2Parser.g:2319:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            {
            // InternalMwe2Parser.g:2319:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            // InternalMwe2Parser.g:2320:2: ( rule__StringLiteral__BeginAssignment_0_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 
            // InternalMwe2Parser.g:2321:2: ( rule__StringLiteral__BeginAssignment_0_0 )
            // InternalMwe2Parser.g:2321:3: rule__StringLiteral__BeginAssignment_0_0
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
    // InternalMwe2Parser.g:2329:1: rule__StringLiteral__Group_0__1 : rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 ;
    public final void rule__StringLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2333:1: ( rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 )
            // InternalMwe2Parser.g:2334:2: rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2
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
    // InternalMwe2Parser.g:2341:1: rule__StringLiteral__Group_0__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) ;
    public final void rule__StringLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2345:1: ( ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) )
            // InternalMwe2Parser.g:2346:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            {
            // InternalMwe2Parser.g:2346:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            // InternalMwe2Parser.g:2347:2: ( rule__StringLiteral__PartsAssignment_0_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 
            // InternalMwe2Parser.g:2348:2: ( rule__StringLiteral__PartsAssignment_0_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA23_0>=ReverseSolidusQuotationMark && LA23_0<=ReverseSolidusReverseSolidus)||LA23_0==RULE_ID||(LA23_0>=RULE_WS && LA23_0<=RULE_ANY_OTHER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMwe2Parser.g:2348:3: rule__StringLiteral__PartsAssignment_0_1
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
    // InternalMwe2Parser.g:2356:1: rule__StringLiteral__Group_0__2 : rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 ;
    public final void rule__StringLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2360:1: ( rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 )
            // InternalMwe2Parser.g:2361:2: rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3
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
    // InternalMwe2Parser.g:2368:1: rule__StringLiteral__Group_0__2__Impl : ( ( rule__StringLiteral__Group_0_2__0 )* ) ;
    public final void rule__StringLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2372:1: ( ( ( rule__StringLiteral__Group_0_2__0 )* ) )
            // InternalMwe2Parser.g:2373:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            {
            // InternalMwe2Parser.g:2373:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            // InternalMwe2Parser.g:2374:2: ( rule__StringLiteral__Group_0_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 
            // InternalMwe2Parser.g:2375:2: ( rule__StringLiteral__Group_0_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DollarSignLeftCurlyBracket) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMwe2Parser.g:2375:3: rule__StringLiteral__Group_0_2__0
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
    // InternalMwe2Parser.g:2383:1: rule__StringLiteral__Group_0__3 : rule__StringLiteral__Group_0__3__Impl ;
    public final void rule__StringLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2387:1: ( rule__StringLiteral__Group_0__3__Impl )
            // InternalMwe2Parser.g:2388:2: rule__StringLiteral__Group_0__3__Impl
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
    // InternalMwe2Parser.g:2394:1: rule__StringLiteral__Group_0__3__Impl : ( ( rule__StringLiteral__EndAssignment_0_3 ) ) ;
    public final void rule__StringLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2398:1: ( ( ( rule__StringLiteral__EndAssignment_0_3 ) ) )
            // InternalMwe2Parser.g:2399:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            {
            // InternalMwe2Parser.g:2399:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            // InternalMwe2Parser.g:2400:2: ( rule__StringLiteral__EndAssignment_0_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 
            // InternalMwe2Parser.g:2401:2: ( rule__StringLiteral__EndAssignment_0_3 )
            // InternalMwe2Parser.g:2401:3: rule__StringLiteral__EndAssignment_0_3
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
    // InternalMwe2Parser.g:2410:1: rule__StringLiteral__Group_0_2__0 : rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 ;
    public final void rule__StringLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2414:1: ( rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 )
            // InternalMwe2Parser.g:2415:2: rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1
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
    // InternalMwe2Parser.g:2422:1: rule__StringLiteral__Group_0_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) ;
    public final void rule__StringLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2426:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) )
            // InternalMwe2Parser.g:2427:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            {
            // InternalMwe2Parser.g:2427:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            // InternalMwe2Parser.g:2428:2: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 
            // InternalMwe2Parser.g:2429:2: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            // InternalMwe2Parser.g:2429:3: rule__StringLiteral__PartsAssignment_0_2_0
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
    // InternalMwe2Parser.g:2437:1: rule__StringLiteral__Group_0_2__1 : rule__StringLiteral__Group_0_2__1__Impl ;
    public final void rule__StringLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2441:1: ( rule__StringLiteral__Group_0_2__1__Impl )
            // InternalMwe2Parser.g:2442:2: rule__StringLiteral__Group_0_2__1__Impl
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
    // InternalMwe2Parser.g:2448:1: rule__StringLiteral__Group_0_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) ;
    public final void rule__StringLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2452:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) )
            // InternalMwe2Parser.g:2453:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            {
            // InternalMwe2Parser.g:2453:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            // InternalMwe2Parser.g:2454:2: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 
            // InternalMwe2Parser.g:2455:2: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA25_0>=ReverseSolidusQuotationMark && LA25_0<=ReverseSolidusReverseSolidus)||LA25_0==RULE_ID||(LA25_0>=RULE_WS && LA25_0<=RULE_ANY_OTHER)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMwe2Parser.g:2455:3: rule__StringLiteral__PartsAssignment_0_2_1
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
    // InternalMwe2Parser.g:2464:1: rule__StringLiteral__Group_1__0 : rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 ;
    public final void rule__StringLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2468:1: ( rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 )
            // InternalMwe2Parser.g:2469:2: rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1
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
    // InternalMwe2Parser.g:2476:1: rule__StringLiteral__Group_1__0__Impl : ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) ;
    public final void rule__StringLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2480:1: ( ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) )
            // InternalMwe2Parser.g:2481:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            {
            // InternalMwe2Parser.g:2481:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            // InternalMwe2Parser.g:2482:2: ( rule__StringLiteral__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 
            // InternalMwe2Parser.g:2483:2: ( rule__StringLiteral__BeginAssignment_1_0 )
            // InternalMwe2Parser.g:2483:3: rule__StringLiteral__BeginAssignment_1_0
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
    // InternalMwe2Parser.g:2491:1: rule__StringLiteral__Group_1__1 : rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 ;
    public final void rule__StringLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2495:1: ( rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 )
            // InternalMwe2Parser.g:2496:2: rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2
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
    // InternalMwe2Parser.g:2503:1: rule__StringLiteral__Group_1__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) ;
    public final void rule__StringLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2507:1: ( ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) )
            // InternalMwe2Parser.g:2508:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            {
            // InternalMwe2Parser.g:2508:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            // InternalMwe2Parser.g:2509:2: ( rule__StringLiteral__PartsAssignment_1_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 
            // InternalMwe2Parser.g:2510:2: ( rule__StringLiteral__PartsAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA26_0>=ReverseSolidusQuotationMark && LA26_0<=ReverseSolidusReverseSolidus)||LA26_0==RULE_ID||(LA26_0>=RULE_WS && LA26_0<=RULE_ANY_OTHER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMwe2Parser.g:2510:3: rule__StringLiteral__PartsAssignment_1_1
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
    // InternalMwe2Parser.g:2518:1: rule__StringLiteral__Group_1__2 : rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 ;
    public final void rule__StringLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2522:1: ( rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 )
            // InternalMwe2Parser.g:2523:2: rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3
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
    // InternalMwe2Parser.g:2530:1: rule__StringLiteral__Group_1__2__Impl : ( ( rule__StringLiteral__Group_1_2__0 )* ) ;
    public final void rule__StringLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2534:1: ( ( ( rule__StringLiteral__Group_1_2__0 )* ) )
            // InternalMwe2Parser.g:2535:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            {
            // InternalMwe2Parser.g:2535:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            // InternalMwe2Parser.g:2536:2: ( rule__StringLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 
            // InternalMwe2Parser.g:2537:2: ( rule__StringLiteral__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DollarSignLeftCurlyBracket) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMwe2Parser.g:2537:3: rule__StringLiteral__Group_1_2__0
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
    // InternalMwe2Parser.g:2545:1: rule__StringLiteral__Group_1__3 : rule__StringLiteral__Group_1__3__Impl ;
    public final void rule__StringLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2549:1: ( rule__StringLiteral__Group_1__3__Impl )
            // InternalMwe2Parser.g:2550:2: rule__StringLiteral__Group_1__3__Impl
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
    // InternalMwe2Parser.g:2556:1: rule__StringLiteral__Group_1__3__Impl : ( ( rule__StringLiteral__EndAssignment_1_3 ) ) ;
    public final void rule__StringLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2560:1: ( ( ( rule__StringLiteral__EndAssignment_1_3 ) ) )
            // InternalMwe2Parser.g:2561:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            {
            // InternalMwe2Parser.g:2561:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            // InternalMwe2Parser.g:2562:2: ( rule__StringLiteral__EndAssignment_1_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 
            // InternalMwe2Parser.g:2563:2: ( rule__StringLiteral__EndAssignment_1_3 )
            // InternalMwe2Parser.g:2563:3: rule__StringLiteral__EndAssignment_1_3
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
    // InternalMwe2Parser.g:2572:1: rule__StringLiteral__Group_1_2__0 : rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 ;
    public final void rule__StringLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2576:1: ( rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 )
            // InternalMwe2Parser.g:2577:2: rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1
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
    // InternalMwe2Parser.g:2584:1: rule__StringLiteral__Group_1_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) ;
    public final void rule__StringLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2588:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) )
            // InternalMwe2Parser.g:2589:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            {
            // InternalMwe2Parser.g:2589:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            // InternalMwe2Parser.g:2590:2: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 
            // InternalMwe2Parser.g:2591:2: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            // InternalMwe2Parser.g:2591:3: rule__StringLiteral__PartsAssignment_1_2_0
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
    // InternalMwe2Parser.g:2599:1: rule__StringLiteral__Group_1_2__1 : rule__StringLiteral__Group_1_2__1__Impl ;
    public final void rule__StringLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2603:1: ( rule__StringLiteral__Group_1_2__1__Impl )
            // InternalMwe2Parser.g:2604:2: rule__StringLiteral__Group_1_2__1__Impl
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
    // InternalMwe2Parser.g:2610:1: rule__StringLiteral__Group_1_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) ;
    public final void rule__StringLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2614:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) )
            // InternalMwe2Parser.g:2615:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            {
            // InternalMwe2Parser.g:2615:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            // InternalMwe2Parser.g:2616:2: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 
            // InternalMwe2Parser.g:2617:2: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA28_0>=ReverseSolidusQuotationMark && LA28_0<=ReverseSolidusReverseSolidus)||LA28_0==RULE_ID||(LA28_0>=RULE_WS && LA28_0<=RULE_ANY_OTHER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMwe2Parser.g:2617:3: rule__StringLiteral__PartsAssignment_1_2_1
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
    // InternalMwe2Parser.g:2626:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2630:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // InternalMwe2Parser.g:2631:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
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
    // InternalMwe2Parser.g:2638:1: rule__PropertyReference__Group__0__Impl : ( DollarSignLeftCurlyBracket ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2642:1: ( ( DollarSignLeftCurlyBracket ) )
            // InternalMwe2Parser.g:2643:1: ( DollarSignLeftCurlyBracket )
            {
            // InternalMwe2Parser.g:2643:1: ( DollarSignLeftCurlyBracket )
            // InternalMwe2Parser.g:2644:2: DollarSignLeftCurlyBracket
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
    // InternalMwe2Parser.g:2653:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2657:1: ( rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 )
            // InternalMwe2Parser.g:2658:2: rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2
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
    // InternalMwe2Parser.g:2665:1: rule__PropertyReference__Group__1__Impl : ( rulePropertyReferenceImpl ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2669:1: ( ( rulePropertyReferenceImpl ) )
            // InternalMwe2Parser.g:2670:1: ( rulePropertyReferenceImpl )
            {
            // InternalMwe2Parser.g:2670:1: ( rulePropertyReferenceImpl )
            // InternalMwe2Parser.g:2671:2: rulePropertyReferenceImpl
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
    // InternalMwe2Parser.g:2680:1: rule__PropertyReference__Group__2 : rule__PropertyReference__Group__2__Impl ;
    public final void rule__PropertyReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2684:1: ( rule__PropertyReference__Group__2__Impl )
            // InternalMwe2Parser.g:2685:2: rule__PropertyReference__Group__2__Impl
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
    // InternalMwe2Parser.g:2691:1: rule__PropertyReference__Group__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__PropertyReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2695:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:2696:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:2696:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:2697:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:2707:1: rule__Module__CanonicalNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2711:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2712:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2712:2: ( ruleFQN )
            // InternalMwe2Parser.g:2713:3: ruleFQN
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
    // InternalMwe2Parser.g:2722:1: rule__Module__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2726:1: ( ( ruleImport ) )
            // InternalMwe2Parser.g:2727:2: ( ruleImport )
            {
            // InternalMwe2Parser.g:2727:2: ( ruleImport )
            // InternalMwe2Parser.g:2728:3: ruleImport
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
    // InternalMwe2Parser.g:2737:1: rule__Module__DeclaredPropertiesAssignment_4 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2741:1: ( ( ruleDeclaredProperty ) )
            // InternalMwe2Parser.g:2742:2: ( ruleDeclaredProperty )
            {
            // InternalMwe2Parser.g:2742:2: ( ruleDeclaredProperty )
            // InternalMwe2Parser.g:2743:3: ruleDeclaredProperty
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
    // InternalMwe2Parser.g:2752:1: rule__Module__RootAssignment_5 : ( ruleRootComponent ) ;
    public final void rule__Module__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2756:1: ( ( ruleRootComponent ) )
            // InternalMwe2Parser.g:2757:2: ( ruleRootComponent )
            {
            // InternalMwe2Parser.g:2757:2: ( ruleRootComponent )
            // InternalMwe2Parser.g:2758:3: ruleRootComponent
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
    // InternalMwe2Parser.g:2767:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2771:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2772:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2772:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2773:3: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
            // InternalMwe2Parser.g:2774:3: ( ruleFQN )
            // InternalMwe2Parser.g:2775:4: ruleFQN
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
    // InternalMwe2Parser.g:2786:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2790:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2791:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2791:2: ( ruleFQN )
            // InternalMwe2Parser.g:2792:3: ruleFQN
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
    // InternalMwe2Parser.g:2801:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2805:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:2806:2: ( ruleValue )
            {
            // InternalMwe2Parser.g:2806:2: ( ruleValue )
            // InternalMwe2Parser.g:2807:3: ruleValue
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
    // InternalMwe2Parser.g:2816:1: rule__RootComponent__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2820:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2821:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2821:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2822:3: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:2823:3: ( ruleFQN )
            // InternalMwe2Parser.g:2824:4: ruleFQN
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
    // InternalMwe2Parser.g:2835:1: rule__RootComponent__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2839:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2840:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2840:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2841:3: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:2842:3: ( ruleFQN )
            // InternalMwe2Parser.g:2843:4: ruleFQN
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
    // InternalMwe2Parser.g:2854:1: rule__RootComponent__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__RootComponent__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2858:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2859:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2859:2: ( ruleFQN )
            // InternalMwe2Parser.g:2860:3: ruleFQN
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
    // InternalMwe2Parser.g:2869:1: rule__RootComponent__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__RootComponent__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2873:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:2874:2: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:2874:2: ( ( AutoInject ) )
            // InternalMwe2Parser.g:2875:3: ( AutoInject )
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:2876:3: ( AutoInject )
            // InternalMwe2Parser.g:2877:4: AutoInject
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
    // InternalMwe2Parser.g:2888:1: rule__RootComponent__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__RootComponent__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2892:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:2893:2: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:2893:2: ( ruleAssignment )
            // InternalMwe2Parser.g:2894:3: ruleAssignment
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
    // InternalMwe2Parser.g:2903:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2907:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2908:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2908:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2909:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:2910:3: ( ruleFQN )
            // InternalMwe2Parser.g:2911:4: ruleFQN
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
    // InternalMwe2Parser.g:2922:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2926:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2927:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2927:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2928:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:2929:3: ( ruleFQN )
            // InternalMwe2Parser.g:2930:4: ruleFQN
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
    // InternalMwe2Parser.g:2941:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2945:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2946:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2946:2: ( ruleFQN )
            // InternalMwe2Parser.g:2947:3: ruleFQN
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
    // InternalMwe2Parser.g:2956:1: rule__Component__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2960:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:2961:2: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:2961:2: ( ( AutoInject ) )
            // InternalMwe2Parser.g:2962:3: ( AutoInject )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:2963:3: ( AutoInject )
            // InternalMwe2Parser.g:2964:4: AutoInject
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
    // InternalMwe2Parser.g:2975:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2979:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:2980:2: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:2980:2: ( ruleAssignment )
            // InternalMwe2Parser.g:2981:3: ruleAssignment
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
    // InternalMwe2Parser.g:2990:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2994:1: ( ( ruleImportedFQN ) )
            // InternalMwe2Parser.g:2995:2: ( ruleImportedFQN )
            {
            // InternalMwe2Parser.g:2995:2: ( ruleImportedFQN )
            // InternalMwe2Parser.g:2996:3: ruleImportedFQN
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
    // InternalMwe2Parser.g:3005:1: rule__Assignment__FeatureAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3009:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3010:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3010:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3011:3: ( ruleFQN )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
            // InternalMwe2Parser.g:3012:3: ( ruleFQN )
            // InternalMwe2Parser.g:3013:4: ruleFQN
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
    // InternalMwe2Parser.g:3024:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3028:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3029:2: ( ruleValue )
            {
            // InternalMwe2Parser.g:3029:2: ( ruleValue )
            // InternalMwe2Parser.g:3030:3: ruleValue
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
    // InternalMwe2Parser.g:3039:1: rule__DoubleLiteral__ValueAssignment : ( ruleDoubleValue ) ;
    public final void rule__DoubleLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3043:1: ( ( ruleDoubleValue ) )
            // InternalMwe2Parser.g:3044:2: ( ruleDoubleValue )
            {
            // InternalMwe2Parser.g:3044:2: ( ruleDoubleValue )
            // InternalMwe2Parser.g:3045:3: ruleDoubleValue
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
    // InternalMwe2Parser.g:3054:1: rule__IntegerLiteral__ValueAssignment : ( ruleIntValue ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3058:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:3059:2: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:3059:2: ( ruleIntValue )
            // InternalMwe2Parser.g:3060:3: ruleIntValue
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
    // InternalMwe2Parser.g:3069:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( True ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3073:1: ( ( ( True ) ) )
            // InternalMwe2Parser.g:3074:2: ( ( True ) )
            {
            // InternalMwe2Parser.g:3074:2: ( ( True ) )
            // InternalMwe2Parser.g:3075:3: ( True )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3076:3: ( True )
            // InternalMwe2Parser.g:3077:4: True
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
    // InternalMwe2Parser.g:3088:1: rule__Reference__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3092:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3093:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3093:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3094:3: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // InternalMwe2Parser.g:3095:3: ( ruleFQN )
            // InternalMwe2Parser.g:3096:4: ruleFQN
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
    // InternalMwe2Parser.g:3107:1: rule__StringLiteral__BeginAssignment_0_0 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3111:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3112:2: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3112:2: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3113:3: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            // InternalMwe2Parser.g:3114:3: ( Apostrophe )
            // InternalMwe2Parser.g:3115:4: Apostrophe
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
    // InternalMwe2Parser.g:3126:1: rule__StringLiteral__PartsAssignment_0_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3130:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3131:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3131:2: ( rulePlainString )
            // InternalMwe2Parser.g:3132:3: rulePlainString
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
    // InternalMwe2Parser.g:3141:1: rule__StringLiteral__PartsAssignment_0_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3145:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3146:2: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3146:2: ( rulePropertyReference )
            // InternalMwe2Parser.g:3147:3: rulePropertyReference
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
    // InternalMwe2Parser.g:3156:1: rule__StringLiteral__PartsAssignment_0_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3160:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3161:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3161:2: ( rulePlainString )
            // InternalMwe2Parser.g:3162:3: rulePlainString
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
    // InternalMwe2Parser.g:3171:1: rule__StringLiteral__EndAssignment_0_3 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3175:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3176:2: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3176:2: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3177:3: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            // InternalMwe2Parser.g:3178:3: ( Apostrophe )
            // InternalMwe2Parser.g:3179:4: Apostrophe
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
    // InternalMwe2Parser.g:3190:1: rule__StringLiteral__BeginAssignment_1_0 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3194:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3195:2: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3195:2: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3196:3: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3197:3: ( QuotationMark )
            // InternalMwe2Parser.g:3198:4: QuotationMark
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
    // InternalMwe2Parser.g:3209:1: rule__StringLiteral__PartsAssignment_1_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3213:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3214:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3214:2: ( rulePlainString )
            // InternalMwe2Parser.g:3215:3: rulePlainString
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
    // InternalMwe2Parser.g:3224:1: rule__StringLiteral__PartsAssignment_1_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3228:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3229:2: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3229:2: ( rulePropertyReference )
            // InternalMwe2Parser.g:3230:3: rulePropertyReference
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
    // InternalMwe2Parser.g:3239:1: rule__StringLiteral__PartsAssignment_1_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3243:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3244:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3244:2: ( rulePlainString )
            // InternalMwe2Parser.g:3245:3: rulePlainString
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
    // InternalMwe2Parser.g:3254:1: rule__StringLiteral__EndAssignment_1_3 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__EndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3258:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3259:2: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3259:2: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3260:3: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            // InternalMwe2Parser.g:3261:3: ( QuotationMark )
            // InternalMwe2Parser.g:3262:4: QuotationMark
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
    // InternalMwe2Parser.g:3273:1: rule__PropertyReferenceImpl__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReferenceImpl__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3277:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3278:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3278:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3279:3: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            // InternalMwe2Parser.g:3280:3: ( ruleFQN )
            // InternalMwe2Parser.g:3281:4: ruleFQN
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
    // InternalMwe2Parser.g:3292:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3296:1: ( ( ruleConstantValue ) )
            // InternalMwe2Parser.g:3297:2: ( ruleConstantValue )
            {
            // InternalMwe2Parser.g:3297:2: ( ruleConstantValue )
            // InternalMwe2Parser.g:3298:3: ruleConstantValue
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
            return "679:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );";
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
            return "1052:2: ( rule__DeclaredProperty__TypeAssignment_1 )?";
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