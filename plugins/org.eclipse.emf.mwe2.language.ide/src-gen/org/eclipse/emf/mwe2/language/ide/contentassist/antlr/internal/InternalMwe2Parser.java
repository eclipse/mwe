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
 * Copyright (c) 2010, 2024 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
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
    // InternalMwe2Parser.g:83:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:84:1: ( ruleModule EOF )
            // InternalMwe2Parser.g:85:1: ruleModule EOF
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
    // InternalMwe2Parser.g:92:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:96:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalMwe2Parser.g:97:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalMwe2Parser.g:97:2: ( ( rule__Module__Group__0 ) )
            // InternalMwe2Parser.g:98:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalMwe2Parser.g:99:3: ( rule__Module__Group__0 )
            // InternalMwe2Parser.g:99:4: rule__Module__Group__0
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
    // InternalMwe2Parser.g:108:1: entryRuleDeclaredProperty : ruleDeclaredProperty EOF ;
    public final void entryRuleDeclaredProperty() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:109:1: ( ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:110:1: ruleDeclaredProperty EOF
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
    // InternalMwe2Parser.g:117:1: ruleDeclaredProperty : ( ( rule__DeclaredProperty__Group__0 ) ) ;
    public final void ruleDeclaredProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:121:2: ( ( ( rule__DeclaredProperty__Group__0 ) ) )
            // InternalMwe2Parser.g:122:2: ( ( rule__DeclaredProperty__Group__0 ) )
            {
            // InternalMwe2Parser.g:122:2: ( ( rule__DeclaredProperty__Group__0 ) )
            // InternalMwe2Parser.g:123:3: ( rule__DeclaredProperty__Group__0 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup()); 
            // InternalMwe2Parser.g:124:3: ( rule__DeclaredProperty__Group__0 )
            // InternalMwe2Parser.g:124:4: rule__DeclaredProperty__Group__0
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
    // InternalMwe2Parser.g:133:1: entryRuleRootComponent : ruleRootComponent EOF ;
    public final void entryRuleRootComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:134:1: ( ruleRootComponent EOF )
            // InternalMwe2Parser.g:135:1: ruleRootComponent EOF
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
    // InternalMwe2Parser.g:142:1: ruleRootComponent : ( ( rule__RootComponent__Group__0 ) ) ;
    public final void ruleRootComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:146:2: ( ( ( rule__RootComponent__Group__0 ) ) )
            // InternalMwe2Parser.g:147:2: ( ( rule__RootComponent__Group__0 ) )
            {
            // InternalMwe2Parser.g:147:2: ( ( rule__RootComponent__Group__0 ) )
            // InternalMwe2Parser.g:148:3: ( rule__RootComponent__Group__0 )
            {
             before(grammarAccess.getRootComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:149:3: ( rule__RootComponent__Group__0 )
            // InternalMwe2Parser.g:149:4: rule__RootComponent__Group__0
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
    // InternalMwe2Parser.g:158:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:159:1: ( ruleComponent EOF )
            // InternalMwe2Parser.g:160:1: ruleComponent EOF
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
    // InternalMwe2Parser.g:167:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:171:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMwe2Parser.g:172:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMwe2Parser.g:172:2: ( ( rule__Component__Group__0 ) )
            // InternalMwe2Parser.g:173:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMwe2Parser.g:174:3: ( rule__Component__Group__0 )
            // InternalMwe2Parser.g:174:4: rule__Component__Group__0
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
    // InternalMwe2Parser.g:183:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:184:1: ( ruleImport EOF )
            // InternalMwe2Parser.g:185:1: ruleImport EOF
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
    // InternalMwe2Parser.g:192:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:196:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMwe2Parser.g:197:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMwe2Parser.g:197:2: ( ( rule__Import__Group__0 ) )
            // InternalMwe2Parser.g:198:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMwe2Parser.g:199:3: ( rule__Import__Group__0 )
            // InternalMwe2Parser.g:199:4: rule__Import__Group__0
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
    // InternalMwe2Parser.g:208:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:209:1: ( ruleImportedFQN EOF )
            // InternalMwe2Parser.g:210:1: ruleImportedFQN EOF
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
    // InternalMwe2Parser.g:217:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:221:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalMwe2Parser.g:222:2: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:222:2: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalMwe2Parser.g:223:3: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:224:3: ( rule__ImportedFQN__Group__0 )
            // InternalMwe2Parser.g:224:4: rule__ImportedFQN__Group__0
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
    // InternalMwe2Parser.g:233:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:234:1: ( ruleAssignment EOF )
            // InternalMwe2Parser.g:235:1: ruleAssignment EOF
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
    // InternalMwe2Parser.g:242:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:246:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMwe2Parser.g:247:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMwe2Parser.g:247:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMwe2Parser.g:248:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMwe2Parser.g:249:3: ( rule__Assignment__Group__0 )
            // InternalMwe2Parser.g:249:4: rule__Assignment__Group__0
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
    // InternalMwe2Parser.g:258:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:259:1: ( ruleValue EOF )
            // InternalMwe2Parser.g:260:1: ruleValue EOF
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
    // InternalMwe2Parser.g:267:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:271:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMwe2Parser.g:272:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMwe2Parser.g:272:2: ( ( rule__Value__Alternatives ) )
            // InternalMwe2Parser.g:273:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:274:3: ( rule__Value__Alternatives )
            // InternalMwe2Parser.g:274:4: rule__Value__Alternatives
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
    // InternalMwe2Parser.g:283:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:284:1: ( ruleNullLiteral EOF )
            // InternalMwe2Parser.g:285:1: ruleNullLiteral EOF
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
    // InternalMwe2Parser.g:292:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:296:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:297:2: ( ( rule__NullLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:297:2: ( ( rule__NullLiteral__Group__0 ) )
            // InternalMwe2Parser.g:298:3: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:299:3: ( rule__NullLiteral__Group__0 )
            // InternalMwe2Parser.g:299:4: rule__NullLiteral__Group__0
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
    // InternalMwe2Parser.g:308:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:309:1: ( ruleDoubleLiteral EOF )
            // InternalMwe2Parser.g:310:1: ruleDoubleLiteral EOF
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
    // InternalMwe2Parser.g:317:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__ValueAssignment ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:321:2: ( ( ( rule__DoubleLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:322:2: ( ( rule__DoubleLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:322:2: ( ( rule__DoubleLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:323:3: ( rule__DoubleLiteral__ValueAssignment )
            {
             before(grammarAccess.getDoubleLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:324:3: ( rule__DoubleLiteral__ValueAssignment )
            // InternalMwe2Parser.g:324:4: rule__DoubleLiteral__ValueAssignment
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
    // InternalMwe2Parser.g:333:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:334:1: ( ruleDoubleValue EOF )
            // InternalMwe2Parser.g:335:1: ruleDoubleValue EOF
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
    // InternalMwe2Parser.g:342:1: ruleDoubleValue : ( ( rule__DoubleValue__Group__0 ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:346:2: ( ( ( rule__DoubleValue__Group__0 ) ) )
            // InternalMwe2Parser.g:347:2: ( ( rule__DoubleValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:347:2: ( ( rule__DoubleValue__Group__0 ) )
            // InternalMwe2Parser.g:348:3: ( rule__DoubleValue__Group__0 )
            {
             before(grammarAccess.getDoubleValueAccess().getGroup()); 
            // InternalMwe2Parser.g:349:3: ( rule__DoubleValue__Group__0 )
            // InternalMwe2Parser.g:349:4: rule__DoubleValue__Group__0
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
    // InternalMwe2Parser.g:358:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:359:1: ( ruleIntegerLiteral EOF )
            // InternalMwe2Parser.g:360:1: ruleIntegerLiteral EOF
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
    // InternalMwe2Parser.g:367:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:371:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMwe2Parser.g:372:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:372:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMwe2Parser.g:373:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:374:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMwe2Parser.g:374:4: rule__IntegerLiteral__ValueAssignment
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
    // InternalMwe2Parser.g:383:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:384:1: ( ruleIntValue EOF )
            // InternalMwe2Parser.g:385:1: ruleIntValue EOF
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
    // InternalMwe2Parser.g:392:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:396:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalMwe2Parser.g:397:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalMwe2Parser.g:397:2: ( ( rule__IntValue__Group__0 ) )
            // InternalMwe2Parser.g:398:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalMwe2Parser.g:399:3: ( rule__IntValue__Group__0 )
            // InternalMwe2Parser.g:399:4: rule__IntValue__Group__0
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
    // InternalMwe2Parser.g:408:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:409:1: ( ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:410:1: ruleBooleanLiteral EOF
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
    // InternalMwe2Parser.g:417:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:421:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalMwe2Parser.g:422:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalMwe2Parser.g:422:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalMwe2Parser.g:423:3: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalMwe2Parser.g:424:3: ( rule__BooleanLiteral__Group__0 )
            // InternalMwe2Parser.g:424:4: rule__BooleanLiteral__Group__0
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
    // InternalMwe2Parser.g:433:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:434:1: ( ruleReference EOF )
            // InternalMwe2Parser.g:435:1: ruleReference EOF
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
    // InternalMwe2Parser.g:442:1: ruleReference : ( ( rule__Reference__ReferableAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:446:2: ( ( ( rule__Reference__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:447:2: ( ( rule__Reference__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:447:2: ( ( rule__Reference__ReferableAssignment ) )
            // InternalMwe2Parser.g:448:3: ( rule__Reference__ReferableAssignment )
            {
             before(grammarAccess.getReferenceAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:449:3: ( rule__Reference__ReferableAssignment )
            // InternalMwe2Parser.g:449:4: rule__Reference__ReferableAssignment
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
    // InternalMwe2Parser.g:458:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:459:1: ( ruleFQN EOF )
            // InternalMwe2Parser.g:460:1: ruleFQN EOF
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
    // InternalMwe2Parser.g:467:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:471:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMwe2Parser.g:472:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMwe2Parser.g:472:2: ( ( rule__FQN__Group__0 ) )
            // InternalMwe2Parser.g:473:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMwe2Parser.g:474:3: ( rule__FQN__Group__0 )
            // InternalMwe2Parser.g:474:4: rule__FQN__Group__0
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
    // InternalMwe2Parser.g:483:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:487:1: ( ruleStringLiteral EOF )
            // InternalMwe2Parser.g:488:1: ruleStringLiteral EOF
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
    // InternalMwe2Parser.g:498:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:503:2: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // InternalMwe2Parser.g:504:2: ( ( rule__StringLiteral__Alternatives ) )
            {
            // InternalMwe2Parser.g:504:2: ( ( rule__StringLiteral__Alternatives ) )
            // InternalMwe2Parser.g:505:3: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // InternalMwe2Parser.g:506:3: ( rule__StringLiteral__Alternatives )
            // InternalMwe2Parser.g:506:4: rule__StringLiteral__Alternatives
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
    // InternalMwe2Parser.g:516:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:520:1: ( rulePropertyReference EOF )
            // InternalMwe2Parser.g:521:1: rulePropertyReference EOF
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
    // InternalMwe2Parser.g:531:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:536:2: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // InternalMwe2Parser.g:537:2: ( ( rule__PropertyReference__Group__0 ) )
            {
            // InternalMwe2Parser.g:537:2: ( ( rule__PropertyReference__Group__0 ) )
            // InternalMwe2Parser.g:538:3: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // InternalMwe2Parser.g:539:3: ( rule__PropertyReference__Group__0 )
            // InternalMwe2Parser.g:539:4: rule__PropertyReference__Group__0
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
    // InternalMwe2Parser.g:549:1: entryRulePropertyReferenceImpl : rulePropertyReferenceImpl EOF ;
    public final void entryRulePropertyReferenceImpl() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:553:1: ( rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:554:1: rulePropertyReferenceImpl EOF
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
    // InternalMwe2Parser.g:564:1: rulePropertyReferenceImpl : ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) ;
    public final void rulePropertyReferenceImpl() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:569:2: ( ( ( rule__PropertyReferenceImpl__ReferableAssignment ) ) )
            // InternalMwe2Parser.g:570:2: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            {
            // InternalMwe2Parser.g:570:2: ( ( rule__PropertyReferenceImpl__ReferableAssignment ) )
            // InternalMwe2Parser.g:571:3: ( rule__PropertyReferenceImpl__ReferableAssignment )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableAssignment()); 
            // InternalMwe2Parser.g:572:3: ( rule__PropertyReferenceImpl__ReferableAssignment )
            // InternalMwe2Parser.g:572:4: rule__PropertyReferenceImpl__ReferableAssignment
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
    // InternalMwe2Parser.g:582:1: entryRulePlainString : rulePlainString EOF ;
    public final void entryRulePlainString() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:583:1: ( rulePlainString EOF )
            // InternalMwe2Parser.g:584:1: rulePlainString EOF
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
    // InternalMwe2Parser.g:591:1: rulePlainString : ( ( rule__PlainString__ValueAssignment ) ) ;
    public final void rulePlainString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:595:2: ( ( ( rule__PlainString__ValueAssignment ) ) )
            // InternalMwe2Parser.g:596:2: ( ( rule__PlainString__ValueAssignment ) )
            {
            // InternalMwe2Parser.g:596:2: ( ( rule__PlainString__ValueAssignment ) )
            // InternalMwe2Parser.g:597:3: ( rule__PlainString__ValueAssignment )
            {
             before(grammarAccess.getPlainStringAccess().getValueAssignment()); 
            // InternalMwe2Parser.g:598:3: ( rule__PlainString__ValueAssignment )
            // InternalMwe2Parser.g:598:4: rule__PlainString__ValueAssignment
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
    // InternalMwe2Parser.g:607:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalMwe2Parser.g:608:1: ( ruleConstantValue EOF )
            // InternalMwe2Parser.g:609:1: ruleConstantValue EOF
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
    // InternalMwe2Parser.g:616:1: ruleConstantValue : ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:620:2: ( ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) ) )
            // InternalMwe2Parser.g:621:2: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            {
            // InternalMwe2Parser.g:621:2: ( ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* ) )
            // InternalMwe2Parser.g:622:3: ( ( rule__ConstantValue__Alternatives ) ) ( ( rule__ConstantValue__Alternatives )* )
            {
            // InternalMwe2Parser.g:622:3: ( ( rule__ConstantValue__Alternatives ) )
            // InternalMwe2Parser.g:623:4: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:624:4: ( rule__ConstantValue__Alternatives )
            // InternalMwe2Parser.g:624:5: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }

            // InternalMwe2Parser.g:627:3: ( ( rule__ConstantValue__Alternatives )* )
            // InternalMwe2Parser.g:628:4: ( rule__ConstantValue__Alternatives )*
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMwe2Parser.g:629:4: ( rule__ConstantValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA1_0>=ReverseSolidusQuotationMark && LA1_0<=ReverseSolidusReverseSolidus)||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:629:5: rule__ConstantValue__Alternatives
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
    // InternalMwe2Parser.g:638:1: rule__RootComponent__Alternatives_1 : ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) );
    public final void rule__RootComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:642:1: ( ( ( rule__RootComponent__TypeAssignment_1_0 ) ) | ( ( rule__RootComponent__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:643:2: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:643:2: ( ( rule__RootComponent__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:644:3: ( rule__RootComponent__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:645:3: ( rule__RootComponent__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:645:4: rule__RootComponent__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:649:2: ( ( rule__RootComponent__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:649:2: ( ( rule__RootComponent__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:650:3: ( rule__RootComponent__Group_1_1__0 )
                    {
                     before(grammarAccess.getRootComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:651:3: ( rule__RootComponent__Group_1_1__0 )
                    // InternalMwe2Parser.g:651:4: rule__RootComponent__Group_1_1__0
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
    // InternalMwe2Parser.g:659:1: rule__Component__Alternatives_1 : ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) );
    public final void rule__Component__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:663:1: ( ( ( rule__Component__TypeAssignment_1_0 ) ) | ( ( rule__Component__Group_1_1__0 ) ) )
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
                    // InternalMwe2Parser.g:664:2: ( ( rule__Component__TypeAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:664:2: ( ( rule__Component__TypeAssignment_1_0 ) )
                    // InternalMwe2Parser.g:665:3: ( rule__Component__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getComponentAccess().getTypeAssignment_1_0()); 
                    // InternalMwe2Parser.g:666:3: ( rule__Component__TypeAssignment_1_0 )
                    // InternalMwe2Parser.g:666:4: rule__Component__TypeAssignment_1_0
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
                    // InternalMwe2Parser.g:670:2: ( ( rule__Component__Group_1_1__0 ) )
                    {
                    // InternalMwe2Parser.g:670:2: ( ( rule__Component__Group_1_1__0 ) )
                    // InternalMwe2Parser.g:671:3: ( rule__Component__Group_1_1__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_1_1()); 
                    // InternalMwe2Parser.g:672:3: ( rule__Component__Group_1_1__0 )
                    // InternalMwe2Parser.g:672:4: rule__Component__Group_1_1__0
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
    // InternalMwe2Parser.g:680:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:684:1: ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:685:2: ( ruleComponent )
                    {
                    // InternalMwe2Parser.g:685:2: ( ruleComponent )
                    // InternalMwe2Parser.g:686:3: ruleComponent
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
                    // InternalMwe2Parser.g:691:2: ( ruleStringLiteral )
                    {
                    // InternalMwe2Parser.g:691:2: ( ruleStringLiteral )
                    // InternalMwe2Parser.g:692:3: ruleStringLiteral
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
                    // InternalMwe2Parser.g:697:2: ( ruleBooleanLiteral )
                    {
                    // InternalMwe2Parser.g:697:2: ( ruleBooleanLiteral )
                    // InternalMwe2Parser.g:698:3: ruleBooleanLiteral
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
                    // InternalMwe2Parser.g:703:2: ( ruleIntegerLiteral )
                    {
                    // InternalMwe2Parser.g:703:2: ( ruleIntegerLiteral )
                    // InternalMwe2Parser.g:704:3: ruleIntegerLiteral
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
                    // InternalMwe2Parser.g:709:2: ( ruleDoubleLiteral )
                    {
                    // InternalMwe2Parser.g:709:2: ( ruleDoubleLiteral )
                    // InternalMwe2Parser.g:710:3: ruleDoubleLiteral
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
                    // InternalMwe2Parser.g:715:2: ( ruleNullLiteral )
                    {
                    // InternalMwe2Parser.g:715:2: ( ruleNullLiteral )
                    // InternalMwe2Parser.g:716:3: ruleNullLiteral
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
                    // InternalMwe2Parser.g:721:2: ( ruleReference )
                    {
                    // InternalMwe2Parser.g:721:2: ( ruleReference )
                    // InternalMwe2Parser.g:722:3: ruleReference
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
    // InternalMwe2Parser.g:731:1: rule__IntValue__Alternatives_0 : ( ( HyphenMinus ) | ( PlusSign ) );
    public final void rule__IntValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:735:1: ( ( HyphenMinus ) | ( PlusSign ) )
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
                    // InternalMwe2Parser.g:736:2: ( HyphenMinus )
                    {
                    // InternalMwe2Parser.g:736:2: ( HyphenMinus )
                    // InternalMwe2Parser.g:737:3: HyphenMinus
                    {
                     before(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,HyphenMinus,FOLLOW_2); 
                     after(grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:742:2: ( PlusSign )
                    {
                    // InternalMwe2Parser.g:742:2: ( PlusSign )
                    // InternalMwe2Parser.g:743:3: PlusSign
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
    // InternalMwe2Parser.g:752:1: rule__BooleanLiteral__Alternatives_1 : ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) );
    public final void rule__BooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:756:1: ( ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) ) | ( False ) )
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
                    // InternalMwe2Parser.g:757:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    {
                    // InternalMwe2Parser.g:757:2: ( ( rule__BooleanLiteral__IsTrueAssignment_1_0 ) )
                    // InternalMwe2Parser.g:758:3: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getIsTrueAssignment_1_0()); 
                    // InternalMwe2Parser.g:759:3: ( rule__BooleanLiteral__IsTrueAssignment_1_0 )
                    // InternalMwe2Parser.g:759:4: rule__BooleanLiteral__IsTrueAssignment_1_0
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
                    // InternalMwe2Parser.g:763:2: ( False )
                    {
                    // InternalMwe2Parser.g:763:2: ( False )
                    // InternalMwe2Parser.g:764:3: False
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
    // InternalMwe2Parser.g:773:1: rule__StringLiteral__Alternatives : ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:777:1: ( ( ( rule__StringLiteral__Group_0__0 ) ) | ( ( rule__StringLiteral__Group_1__0 ) ) )
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
                    // InternalMwe2Parser.g:778:2: ( ( rule__StringLiteral__Group_0__0 ) )
                    {
                    // InternalMwe2Parser.g:778:2: ( ( rule__StringLiteral__Group_0__0 ) )
                    // InternalMwe2Parser.g:779:3: ( rule__StringLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_0()); 
                    // InternalMwe2Parser.g:780:3: ( rule__StringLiteral__Group_0__0 )
                    // InternalMwe2Parser.g:780:4: rule__StringLiteral__Group_0__0
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
                    // InternalMwe2Parser.g:784:2: ( ( rule__StringLiteral__Group_1__0 ) )
                    {
                    // InternalMwe2Parser.g:784:2: ( ( rule__StringLiteral__Group_1__0 ) )
                    // InternalMwe2Parser.g:785:3: ( rule__StringLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getStringLiteralAccess().getGroup_1()); 
                    // InternalMwe2Parser.g:786:3: ( rule__StringLiteral__Group_1__0 )
                    // InternalMwe2Parser.g:786:4: rule__StringLiteral__Group_1__0
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
    // InternalMwe2Parser.g:794:1: rule__ConstantValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:798:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ReverseSolidusDollarSignLeftCurlyBracket ) | ( ReverseSolidusReverseSolidus ) )
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
                    // InternalMwe2Parser.g:799:2: ( RULE_WS )
                    {
                    // InternalMwe2Parser.g:799:2: ( RULE_WS )
                    // InternalMwe2Parser.g:800:3: RULE_WS
                    {
                     before(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:805:2: ( RULE_ANY_OTHER )
                    {
                    // InternalMwe2Parser.g:805:2: ( RULE_ANY_OTHER )
                    // InternalMwe2Parser.g:806:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:811:2: ( RULE_ID )
                    {
                    // InternalMwe2Parser.g:811:2: ( RULE_ID )
                    // InternalMwe2Parser.g:812:3: RULE_ID
                    {
                     before(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:817:2: ( ReverseSolidusApostrophe )
                    {
                    // InternalMwe2Parser.g:817:2: ( ReverseSolidusApostrophe )
                    // InternalMwe2Parser.g:818:3: ReverseSolidusApostrophe
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
                    match(input,ReverseSolidusApostrophe,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:823:2: ( ReverseSolidusQuotationMark )
                    {
                    // InternalMwe2Parser.g:823:2: ( ReverseSolidusQuotationMark )
                    // InternalMwe2Parser.g:824:3: ReverseSolidusQuotationMark
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
                    match(input,ReverseSolidusQuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:829:2: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    {
                    // InternalMwe2Parser.g:829:2: ( ReverseSolidusDollarSignLeftCurlyBracket )
                    // InternalMwe2Parser.g:830:3: ReverseSolidusDollarSignLeftCurlyBracket
                    {
                     before(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
                    match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:835:2: ( ReverseSolidusReverseSolidus )
                    {
                    // InternalMwe2Parser.g:835:2: ( ReverseSolidusReverseSolidus )
                    // InternalMwe2Parser.g:836:3: ReverseSolidusReverseSolidus
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
    // InternalMwe2Parser.g:845:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:849:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalMwe2Parser.g:850:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalMwe2Parser.g:857:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:861:1: ( ( () ) )
            // InternalMwe2Parser.g:862:1: ( () )
            {
            // InternalMwe2Parser.g:862:1: ( () )
            // InternalMwe2Parser.g:863:2: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // InternalMwe2Parser.g:864:2: ()
            // InternalMwe2Parser.g:864:3: 
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
    // InternalMwe2Parser.g:872:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:876:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalMwe2Parser.g:877:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalMwe2Parser.g:884:1: rule__Module__Group__1__Impl : ( Module ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:888:1: ( ( Module ) )
            // InternalMwe2Parser.g:889:1: ( Module )
            {
            // InternalMwe2Parser.g:889:1: ( Module )
            // InternalMwe2Parser.g:890:2: Module
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
    // InternalMwe2Parser.g:899:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:903:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalMwe2Parser.g:904:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalMwe2Parser.g:911:1: rule__Module__Group__2__Impl : ( ( rule__Module__CanonicalNameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:915:1: ( ( ( rule__Module__CanonicalNameAssignment_2 ) ) )
            // InternalMwe2Parser.g:916:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:916:1: ( ( rule__Module__CanonicalNameAssignment_2 ) )
            // InternalMwe2Parser.g:917:2: ( rule__Module__CanonicalNameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getCanonicalNameAssignment_2()); 
            // InternalMwe2Parser.g:918:2: ( rule__Module__CanonicalNameAssignment_2 )
            // InternalMwe2Parser.g:918:3: rule__Module__CanonicalNameAssignment_2
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
    // InternalMwe2Parser.g:926:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:930:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalMwe2Parser.g:931:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalMwe2Parser.g:938:1: rule__Module__Group__3__Impl : ( ( rule__Module__ImportsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:942:1: ( ( ( rule__Module__ImportsAssignment_3 )* ) )
            // InternalMwe2Parser.g:943:1: ( ( rule__Module__ImportsAssignment_3 )* )
            {
            // InternalMwe2Parser.g:943:1: ( ( rule__Module__ImportsAssignment_3 )* )
            // InternalMwe2Parser.g:944:2: ( rule__Module__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_3()); 
            // InternalMwe2Parser.g:945:2: ( rule__Module__ImportsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Import) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMwe2Parser.g:945:3: rule__Module__ImportsAssignment_3
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
    // InternalMwe2Parser.g:953:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:957:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalMwe2Parser.g:958:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalMwe2Parser.g:965:1: rule__Module__Group__4__Impl : ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:969:1: ( ( ( rule__Module__DeclaredPropertiesAssignment_4 )* ) )
            // InternalMwe2Parser.g:970:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            {
            // InternalMwe2Parser.g:970:1: ( ( rule__Module__DeclaredPropertiesAssignment_4 )* )
            // InternalMwe2Parser.g:971:2: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            {
             before(grammarAccess.getModuleAccess().getDeclaredPropertiesAssignment_4()); 
            // InternalMwe2Parser.g:972:2: ( rule__Module__DeclaredPropertiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMwe2Parser.g:972:3: rule__Module__DeclaredPropertiesAssignment_4
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
    // InternalMwe2Parser.g:980:1: rule__Module__Group__5 : rule__Module__Group__5__Impl ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:984:1: ( rule__Module__Group__5__Impl )
            // InternalMwe2Parser.g:985:2: rule__Module__Group__5__Impl
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
    // InternalMwe2Parser.g:991:1: rule__Module__Group__5__Impl : ( ( rule__Module__RootAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:995:1: ( ( ( rule__Module__RootAssignment_5 ) ) )
            // InternalMwe2Parser.g:996:1: ( ( rule__Module__RootAssignment_5 ) )
            {
            // InternalMwe2Parser.g:996:1: ( ( rule__Module__RootAssignment_5 ) )
            // InternalMwe2Parser.g:997:2: ( rule__Module__RootAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getRootAssignment_5()); 
            // InternalMwe2Parser.g:998:2: ( rule__Module__RootAssignment_5 )
            // InternalMwe2Parser.g:998:3: rule__Module__RootAssignment_5
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
    // InternalMwe2Parser.g:1007:1: rule__DeclaredProperty__Group__0 : rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 ;
    public final void rule__DeclaredProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1011:1: ( rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1 )
            // InternalMwe2Parser.g:1012:2: rule__DeclaredProperty__Group__0__Impl rule__DeclaredProperty__Group__1
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
    // InternalMwe2Parser.g:1019:1: rule__DeclaredProperty__Group__0__Impl : ( Var ) ;
    public final void rule__DeclaredProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1023:1: ( ( Var ) )
            // InternalMwe2Parser.g:1024:1: ( Var )
            {
            // InternalMwe2Parser.g:1024:1: ( Var )
            // InternalMwe2Parser.g:1025:2: Var
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
    // InternalMwe2Parser.g:1034:1: rule__DeclaredProperty__Group__1 : rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 ;
    public final void rule__DeclaredProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1038:1: ( rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2 )
            // InternalMwe2Parser.g:1039:2: rule__DeclaredProperty__Group__1__Impl rule__DeclaredProperty__Group__2
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
    // InternalMwe2Parser.g:1046:1: rule__DeclaredProperty__Group__1__Impl : ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) ;
    public final void rule__DeclaredProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1050:1: ( ( ( rule__DeclaredProperty__TypeAssignment_1 )? ) )
            // InternalMwe2Parser.g:1051:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            {
            // InternalMwe2Parser.g:1051:1: ( ( rule__DeclaredProperty__TypeAssignment_1 )? )
            // InternalMwe2Parser.g:1052:2: ( rule__DeclaredProperty__TypeAssignment_1 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeAssignment_1()); 
            // InternalMwe2Parser.g:1053:2: ( rule__DeclaredProperty__TypeAssignment_1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:1053:3: rule__DeclaredProperty__TypeAssignment_1
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
    // InternalMwe2Parser.g:1061:1: rule__DeclaredProperty__Group__2 : rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 ;
    public final void rule__DeclaredProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1065:1: ( rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3 )
            // InternalMwe2Parser.g:1066:2: rule__DeclaredProperty__Group__2__Impl rule__DeclaredProperty__Group__3
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
    // InternalMwe2Parser.g:1073:1: rule__DeclaredProperty__Group__2__Impl : ( ( rule__DeclaredProperty__NameAssignment_2 ) ) ;
    public final void rule__DeclaredProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1077:1: ( ( ( rule__DeclaredProperty__NameAssignment_2 ) ) )
            // InternalMwe2Parser.g:1078:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1078:1: ( ( rule__DeclaredProperty__NameAssignment_2 ) )
            // InternalMwe2Parser.g:1079:2: ( rule__DeclaredProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getNameAssignment_2()); 
            // InternalMwe2Parser.g:1080:2: ( rule__DeclaredProperty__NameAssignment_2 )
            // InternalMwe2Parser.g:1080:3: rule__DeclaredProperty__NameAssignment_2
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
    // InternalMwe2Parser.g:1088:1: rule__DeclaredProperty__Group__3 : rule__DeclaredProperty__Group__3__Impl ;
    public final void rule__DeclaredProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1092:1: ( rule__DeclaredProperty__Group__3__Impl )
            // InternalMwe2Parser.g:1093:2: rule__DeclaredProperty__Group__3__Impl
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
    // InternalMwe2Parser.g:1099:1: rule__DeclaredProperty__Group__3__Impl : ( ( rule__DeclaredProperty__Group_3__0 )? ) ;
    public final void rule__DeclaredProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1103:1: ( ( ( rule__DeclaredProperty__Group_3__0 )? ) )
            // InternalMwe2Parser.g:1104:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            {
            // InternalMwe2Parser.g:1104:1: ( ( rule__DeclaredProperty__Group_3__0 )? )
            // InternalMwe2Parser.g:1105:2: ( rule__DeclaredProperty__Group_3__0 )?
            {
             before(grammarAccess.getDeclaredPropertyAccess().getGroup_3()); 
            // InternalMwe2Parser.g:1106:2: ( rule__DeclaredProperty__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EqualsSign) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMwe2Parser.g:1106:3: rule__DeclaredProperty__Group_3__0
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
    // InternalMwe2Parser.g:1115:1: rule__DeclaredProperty__Group_3__0 : rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 ;
    public final void rule__DeclaredProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1119:1: ( rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1 )
            // InternalMwe2Parser.g:1120:2: rule__DeclaredProperty__Group_3__0__Impl rule__DeclaredProperty__Group_3__1
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
    // InternalMwe2Parser.g:1127:1: rule__DeclaredProperty__Group_3__0__Impl : ( EqualsSign ) ;
    public final void rule__DeclaredProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1131:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1132:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1132:1: ( EqualsSign )
            // InternalMwe2Parser.g:1133:2: EqualsSign
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
    // InternalMwe2Parser.g:1142:1: rule__DeclaredProperty__Group_3__1 : rule__DeclaredProperty__Group_3__1__Impl ;
    public final void rule__DeclaredProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1146:1: ( rule__DeclaredProperty__Group_3__1__Impl )
            // InternalMwe2Parser.g:1147:2: rule__DeclaredProperty__Group_3__1__Impl
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
    // InternalMwe2Parser.g:1153:1: rule__DeclaredProperty__Group_3__1__Impl : ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) ;
    public final void rule__DeclaredProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1157:1: ( ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) ) )
            // InternalMwe2Parser.g:1158:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            {
            // InternalMwe2Parser.g:1158:1: ( ( rule__DeclaredProperty__DefaultAssignment_3_1 ) )
            // InternalMwe2Parser.g:1159:2: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getDefaultAssignment_3_1()); 
            // InternalMwe2Parser.g:1160:2: ( rule__DeclaredProperty__DefaultAssignment_3_1 )
            // InternalMwe2Parser.g:1160:3: rule__DeclaredProperty__DefaultAssignment_3_1
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
    // InternalMwe2Parser.g:1169:1: rule__RootComponent__Group__0 : rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 ;
    public final void rule__RootComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1173:1: ( rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1 )
            // InternalMwe2Parser.g:1174:2: rule__RootComponent__Group__0__Impl rule__RootComponent__Group__1
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
    // InternalMwe2Parser.g:1181:1: rule__RootComponent__Group__0__Impl : ( () ) ;
    public final void rule__RootComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1185:1: ( ( () ) )
            // InternalMwe2Parser.g:1186:1: ( () )
            {
            // InternalMwe2Parser.g:1186:1: ( () )
            // InternalMwe2Parser.g:1187:2: ()
            {
             before(grammarAccess.getRootComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1188:2: ()
            // InternalMwe2Parser.g:1188:3: 
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
    // InternalMwe2Parser.g:1196:1: rule__RootComponent__Group__1 : rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 ;
    public final void rule__RootComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1200:1: ( rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2 )
            // InternalMwe2Parser.g:1201:2: rule__RootComponent__Group__1__Impl rule__RootComponent__Group__2
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
    // InternalMwe2Parser.g:1208:1: rule__RootComponent__Group__1__Impl : ( ( rule__RootComponent__Alternatives_1 ) ) ;
    public final void rule__RootComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1212:1: ( ( ( rule__RootComponent__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:1213:1: ( ( rule__RootComponent__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:1213:1: ( ( rule__RootComponent__Alternatives_1 ) )
            // InternalMwe2Parser.g:1214:2: ( rule__RootComponent__Alternatives_1 )
            {
             before(grammarAccess.getRootComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1215:2: ( rule__RootComponent__Alternatives_1 )
            // InternalMwe2Parser.g:1215:3: rule__RootComponent__Alternatives_1
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
    // InternalMwe2Parser.g:1223:1: rule__RootComponent__Group__2 : rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 ;
    public final void rule__RootComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1227:1: ( rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3 )
            // InternalMwe2Parser.g:1228:2: rule__RootComponent__Group__2__Impl rule__RootComponent__Group__3
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
    // InternalMwe2Parser.g:1235:1: rule__RootComponent__Group__2__Impl : ( ( rule__RootComponent__Group_2__0 )? ) ;
    public final void rule__RootComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1239:1: ( ( ( rule__RootComponent__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1240:1: ( ( rule__RootComponent__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1240:1: ( ( rule__RootComponent__Group_2__0 )? )
            // InternalMwe2Parser.g:1241:2: ( rule__RootComponent__Group_2__0 )?
            {
             before(grammarAccess.getRootComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1242:2: ( rule__RootComponent__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Colon) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:1242:3: rule__RootComponent__Group_2__0
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
    // InternalMwe2Parser.g:1250:1: rule__RootComponent__Group__3 : rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 ;
    public final void rule__RootComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1254:1: ( rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4 )
            // InternalMwe2Parser.g:1255:2: rule__RootComponent__Group__3__Impl rule__RootComponent__Group__4
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
    // InternalMwe2Parser.g:1262:1: rule__RootComponent__Group__3__Impl : ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) ;
    public final void rule__RootComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1266:1: ( ( ( rule__RootComponent__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1267:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1267:1: ( ( rule__RootComponent__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1268:2: ( rule__RootComponent__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1269:2: ( rule__RootComponent__AutoInjectAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AutoInject) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMwe2Parser.g:1269:3: rule__RootComponent__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1277:1: rule__RootComponent__Group__4 : rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 ;
    public final void rule__RootComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1281:1: ( rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5 )
            // InternalMwe2Parser.g:1282:2: rule__RootComponent__Group__4__Impl rule__RootComponent__Group__5
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
    // InternalMwe2Parser.g:1289:1: rule__RootComponent__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RootComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1293:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1294:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1294:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1295:2: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1304:1: rule__RootComponent__Group__5 : rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 ;
    public final void rule__RootComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1308:1: ( rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6 )
            // InternalMwe2Parser.g:1309:2: rule__RootComponent__Group__5__Impl rule__RootComponent__Group__6
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
    // InternalMwe2Parser.g:1316:1: rule__RootComponent__Group__5__Impl : ( ( rule__RootComponent__AssignmentAssignment_5 )* ) ;
    public final void rule__RootComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1320:1: ( ( ( rule__RootComponent__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1321:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1321:1: ( ( rule__RootComponent__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1322:2: ( rule__RootComponent__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getRootComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1323:2: ( rule__RootComponent__AssignmentAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMwe2Parser.g:1323:3: rule__RootComponent__AssignmentAssignment_5
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
    // InternalMwe2Parser.g:1331:1: rule__RootComponent__Group__6 : rule__RootComponent__Group__6__Impl ;
    public final void rule__RootComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1335:1: ( rule__RootComponent__Group__6__Impl )
            // InternalMwe2Parser.g:1336:2: rule__RootComponent__Group__6__Impl
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
    // InternalMwe2Parser.g:1342:1: rule__RootComponent__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__RootComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1346:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1347:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1347:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1348:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:1358:1: rule__RootComponent__Group_1_1__0 : rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 ;
    public final void rule__RootComponent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1362:1: ( rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1 )
            // InternalMwe2Parser.g:1363:2: rule__RootComponent__Group_1_1__0__Impl rule__RootComponent__Group_1_1__1
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
    // InternalMwe2Parser.g:1370:1: rule__RootComponent__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__RootComponent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1374:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1375:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1375:1: ( CommercialAt )
            // InternalMwe2Parser.g:1376:2: CommercialAt
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
    // InternalMwe2Parser.g:1385:1: rule__RootComponent__Group_1_1__1 : rule__RootComponent__Group_1_1__1__Impl ;
    public final void rule__RootComponent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1389:1: ( rule__RootComponent__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1390:2: rule__RootComponent__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1396:1: rule__RootComponent__Group_1_1__1__Impl : ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__RootComponent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1400:1: ( ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1401:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1401:1: ( ( rule__RootComponent__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1402:2: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getRootComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1403:2: ( rule__RootComponent__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1403:3: rule__RootComponent__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1412:1: rule__RootComponent__Group_2__0 : rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 ;
    public final void rule__RootComponent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1416:1: ( rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1 )
            // InternalMwe2Parser.g:1417:2: rule__RootComponent__Group_2__0__Impl rule__RootComponent__Group_2__1
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
    // InternalMwe2Parser.g:1424:1: rule__RootComponent__Group_2__0__Impl : ( Colon ) ;
    public final void rule__RootComponent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1428:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1429:1: ( Colon )
            {
            // InternalMwe2Parser.g:1429:1: ( Colon )
            // InternalMwe2Parser.g:1430:2: Colon
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
    // InternalMwe2Parser.g:1439:1: rule__RootComponent__Group_2__1 : rule__RootComponent__Group_2__1__Impl ;
    public final void rule__RootComponent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1443:1: ( rule__RootComponent__Group_2__1__Impl )
            // InternalMwe2Parser.g:1444:2: rule__RootComponent__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1450:1: rule__RootComponent__Group_2__1__Impl : ( ( rule__RootComponent__NameAssignment_2_1 ) ) ;
    public final void rule__RootComponent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1454:1: ( ( ( rule__RootComponent__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1455:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1455:1: ( ( rule__RootComponent__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1456:2: ( rule__RootComponent__NameAssignment_2_1 )
            {
             before(grammarAccess.getRootComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1457:2: ( rule__RootComponent__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1457:3: rule__RootComponent__NameAssignment_2_1
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
    // InternalMwe2Parser.g:1466:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1470:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMwe2Parser.g:1471:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMwe2Parser.g:1478:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1482:1: ( ( () ) )
            // InternalMwe2Parser.g:1483:1: ( () )
            {
            // InternalMwe2Parser.g:1483:1: ( () )
            // InternalMwe2Parser.g:1484:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalMwe2Parser.g:1485:2: ()
            // InternalMwe2Parser.g:1485:3: 
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
    // InternalMwe2Parser.g:1493:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1497:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMwe2Parser.g:1498:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMwe2Parser.g:1505:1: rule__Component__Group__1__Impl : ( ( rule__Component__Alternatives_1 )? ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1509:1: ( ( ( rule__Component__Alternatives_1 )? ) )
            // InternalMwe2Parser.g:1510:1: ( ( rule__Component__Alternatives_1 )? )
            {
            // InternalMwe2Parser.g:1510:1: ( ( rule__Component__Alternatives_1 )? )
            // InternalMwe2Parser.g:1511:2: ( rule__Component__Alternatives_1 )?
            {
             before(grammarAccess.getComponentAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:1512:2: ( rule__Component__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CommercialAt||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMwe2Parser.g:1512:3: rule__Component__Alternatives_1
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
    // InternalMwe2Parser.g:1520:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1524:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMwe2Parser.g:1525:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMwe2Parser.g:1532:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1536:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalMwe2Parser.g:1537:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalMwe2Parser.g:1537:1: ( ( rule__Component__Group_2__0 )? )
            // InternalMwe2Parser.g:1538:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalMwe2Parser.g:1539:2: ( rule__Component__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Colon) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMwe2Parser.g:1539:3: rule__Component__Group_2__0
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
    // InternalMwe2Parser.g:1547:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1551:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMwe2Parser.g:1552:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMwe2Parser.g:1559:1: rule__Component__Group__3__Impl : ( ( rule__Component__AutoInjectAssignment_3 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1563:1: ( ( ( rule__Component__AutoInjectAssignment_3 )? ) )
            // InternalMwe2Parser.g:1564:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            {
            // InternalMwe2Parser.g:1564:1: ( ( rule__Component__AutoInjectAssignment_3 )? )
            // InternalMwe2Parser.g:1565:2: ( rule__Component__AutoInjectAssignment_3 )?
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAssignment_3()); 
            // InternalMwe2Parser.g:1566:2: ( rule__Component__AutoInjectAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AutoInject) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMwe2Parser.g:1566:3: rule__Component__AutoInjectAssignment_3
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
    // InternalMwe2Parser.g:1574:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1578:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMwe2Parser.g:1579:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMwe2Parser.g:1586:1: rule__Component__Group__4__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1590:1: ( ( LeftCurlyBracket ) )
            // InternalMwe2Parser.g:1591:1: ( LeftCurlyBracket )
            {
            // InternalMwe2Parser.g:1591:1: ( LeftCurlyBracket )
            // InternalMwe2Parser.g:1592:2: LeftCurlyBracket
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
    // InternalMwe2Parser.g:1601:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1605:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMwe2Parser.g:1606:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalMwe2Parser.g:1613:1: rule__Component__Group__5__Impl : ( ( rule__Component__AssignmentAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1617:1: ( ( ( rule__Component__AssignmentAssignment_5 )* ) )
            // InternalMwe2Parser.g:1618:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            {
            // InternalMwe2Parser.g:1618:1: ( ( rule__Component__AssignmentAssignment_5 )* )
            // InternalMwe2Parser.g:1619:2: ( rule__Component__AssignmentAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getAssignmentAssignment_5()); 
            // InternalMwe2Parser.g:1620:2: ( rule__Component__AssignmentAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMwe2Parser.g:1620:3: rule__Component__AssignmentAssignment_5
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
    // InternalMwe2Parser.g:1628:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1632:1: ( rule__Component__Group__6__Impl )
            // InternalMwe2Parser.g:1633:2: rule__Component__Group__6__Impl
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
    // InternalMwe2Parser.g:1639:1: rule__Component__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1643:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:1644:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1644:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:1645:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:1655:1: rule__Component__Group_1_1__0 : rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 ;
    public final void rule__Component__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1659:1: ( rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1 )
            // InternalMwe2Parser.g:1660:2: rule__Component__Group_1_1__0__Impl rule__Component__Group_1_1__1
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
    // InternalMwe2Parser.g:1667:1: rule__Component__Group_1_1__0__Impl : ( CommercialAt ) ;
    public final void rule__Component__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1671:1: ( ( CommercialAt ) )
            // InternalMwe2Parser.g:1672:1: ( CommercialAt )
            {
            // InternalMwe2Parser.g:1672:1: ( CommercialAt )
            // InternalMwe2Parser.g:1673:2: CommercialAt
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
    // InternalMwe2Parser.g:1682:1: rule__Component__Group_1_1__1 : rule__Component__Group_1_1__1__Impl ;
    public final void rule__Component__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1686:1: ( rule__Component__Group_1_1__1__Impl )
            // InternalMwe2Parser.g:1687:2: rule__Component__Group_1_1__1__Impl
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
    // InternalMwe2Parser.g:1693:1: rule__Component__Group_1_1__1__Impl : ( ( rule__Component__ModuleAssignment_1_1_1 ) ) ;
    public final void rule__Component__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1697:1: ( ( ( rule__Component__ModuleAssignment_1_1_1 ) ) )
            // InternalMwe2Parser.g:1698:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            {
            // InternalMwe2Parser.g:1698:1: ( ( rule__Component__ModuleAssignment_1_1_1 ) )
            // InternalMwe2Parser.g:1699:2: ( rule__Component__ModuleAssignment_1_1_1 )
            {
             before(grammarAccess.getComponentAccess().getModuleAssignment_1_1_1()); 
            // InternalMwe2Parser.g:1700:2: ( rule__Component__ModuleAssignment_1_1_1 )
            // InternalMwe2Parser.g:1700:3: rule__Component__ModuleAssignment_1_1_1
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
    // InternalMwe2Parser.g:1709:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1713:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalMwe2Parser.g:1714:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
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
    // InternalMwe2Parser.g:1721:1: rule__Component__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1725:1: ( ( Colon ) )
            // InternalMwe2Parser.g:1726:1: ( Colon )
            {
            // InternalMwe2Parser.g:1726:1: ( Colon )
            // InternalMwe2Parser.g:1727:2: Colon
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
    // InternalMwe2Parser.g:1736:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1740:1: ( rule__Component__Group_2__1__Impl )
            // InternalMwe2Parser.g:1741:2: rule__Component__Group_2__1__Impl
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
    // InternalMwe2Parser.g:1747:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__NameAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1751:1: ( ( ( rule__Component__NameAssignment_2_1 ) ) )
            // InternalMwe2Parser.g:1752:1: ( ( rule__Component__NameAssignment_2_1 ) )
            {
            // InternalMwe2Parser.g:1752:1: ( ( rule__Component__NameAssignment_2_1 ) )
            // InternalMwe2Parser.g:1753:2: ( rule__Component__NameAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_1()); 
            // InternalMwe2Parser.g:1754:2: ( rule__Component__NameAssignment_2_1 )
            // InternalMwe2Parser.g:1754:3: rule__Component__NameAssignment_2_1
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
    // InternalMwe2Parser.g:1763:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1767:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMwe2Parser.g:1768:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMwe2Parser.g:1775:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1779:1: ( ( Import ) )
            // InternalMwe2Parser.g:1780:1: ( Import )
            {
            // InternalMwe2Parser.g:1780:1: ( Import )
            // InternalMwe2Parser.g:1781:2: Import
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
    // InternalMwe2Parser.g:1790:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1794:1: ( rule__Import__Group__1__Impl )
            // InternalMwe2Parser.g:1795:2: rule__Import__Group__1__Impl
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
    // InternalMwe2Parser.g:1801:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1805:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMwe2Parser.g:1806:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMwe2Parser.g:1806:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMwe2Parser.g:1807:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMwe2Parser.g:1808:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMwe2Parser.g:1808:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMwe2Parser.g:1817:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1821:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalMwe2Parser.g:1822:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
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
    // InternalMwe2Parser.g:1829:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1833:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:1834:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:1834:1: ( ruleFQN )
            // InternalMwe2Parser.g:1835:2: ruleFQN
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
    // InternalMwe2Parser.g:1844:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1848:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalMwe2Parser.g:1849:2: rule__ImportedFQN__Group__1__Impl
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
    // InternalMwe2Parser.g:1855:1: rule__ImportedFQN__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1859:1: ( ( ( FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:1860:1: ( ( FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:1860:1: ( ( FullStopAsterisk )? )
            // InternalMwe2Parser.g:1861:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMwe2Parser.g:1862:2: ( FullStopAsterisk )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FullStopAsterisk) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMwe2Parser.g:1862:3: FullStopAsterisk
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
    // InternalMwe2Parser.g:1871:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1875:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMwe2Parser.g:1876:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalMwe2Parser.g:1883:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__FeatureAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1887:1: ( ( ( rule__Assignment__FeatureAssignment_0 ) ) )
            // InternalMwe2Parser.g:1888:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            {
            // InternalMwe2Parser.g:1888:1: ( ( rule__Assignment__FeatureAssignment_0 ) )
            // InternalMwe2Parser.g:1889:2: ( rule__Assignment__FeatureAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); 
            // InternalMwe2Parser.g:1890:2: ( rule__Assignment__FeatureAssignment_0 )
            // InternalMwe2Parser.g:1890:3: rule__Assignment__FeatureAssignment_0
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
    // InternalMwe2Parser.g:1898:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1902:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMwe2Parser.g:1903:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalMwe2Parser.g:1910:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1914:1: ( ( EqualsSign ) )
            // InternalMwe2Parser.g:1915:1: ( EqualsSign )
            {
            // InternalMwe2Parser.g:1915:1: ( EqualsSign )
            // InternalMwe2Parser.g:1916:2: EqualsSign
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
    // InternalMwe2Parser.g:1925:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1929:1: ( rule__Assignment__Group__2__Impl )
            // InternalMwe2Parser.g:1930:2: rule__Assignment__Group__2__Impl
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
    // InternalMwe2Parser.g:1936:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1940:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMwe2Parser.g:1941:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMwe2Parser.g:1941:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMwe2Parser.g:1942:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMwe2Parser.g:1943:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMwe2Parser.g:1943:3: rule__Assignment__ValueAssignment_2
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
    // InternalMwe2Parser.g:1952:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1956:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // InternalMwe2Parser.g:1957:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
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
    // InternalMwe2Parser.g:1964:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1968:1: ( ( () ) )
            // InternalMwe2Parser.g:1969:1: ( () )
            {
            // InternalMwe2Parser.g:1969:1: ( () )
            // InternalMwe2Parser.g:1970:2: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // InternalMwe2Parser.g:1971:2: ()
            // InternalMwe2Parser.g:1971:3: 
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
    // InternalMwe2Parser.g:1979:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1983:1: ( rule__NullLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:1984:2: rule__NullLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:1990:1: rule__NullLiteral__Group__1__Impl : ( Null ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:1994:1: ( ( Null ) )
            // InternalMwe2Parser.g:1995:1: ( Null )
            {
            // InternalMwe2Parser.g:1995:1: ( Null )
            // InternalMwe2Parser.g:1996:2: Null
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
    // InternalMwe2Parser.g:2006:1: rule__DoubleValue__Group__0 : rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 ;
    public final void rule__DoubleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2010:1: ( rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1 )
            // InternalMwe2Parser.g:2011:2: rule__DoubleValue__Group__0__Impl rule__DoubleValue__Group__1
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
    // InternalMwe2Parser.g:2018:1: rule__DoubleValue__Group__0__Impl : ( ruleIntValue ) ;
    public final void rule__DoubleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2022:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:2023:1: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:2023:1: ( ruleIntValue )
            // InternalMwe2Parser.g:2024:2: ruleIntValue
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
    // InternalMwe2Parser.g:2033:1: rule__DoubleValue__Group__1 : rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 ;
    public final void rule__DoubleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2037:1: ( rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2 )
            // InternalMwe2Parser.g:2038:2: rule__DoubleValue__Group__1__Impl rule__DoubleValue__Group__2
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
    // InternalMwe2Parser.g:2045:1: rule__DoubleValue__Group__1__Impl : ( FullStop ) ;
    public final void rule__DoubleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2049:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2050:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2050:1: ( FullStop )
            // InternalMwe2Parser.g:2051:2: FullStop
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
    // InternalMwe2Parser.g:2060:1: rule__DoubleValue__Group__2 : rule__DoubleValue__Group__2__Impl ;
    public final void rule__DoubleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2064:1: ( rule__DoubleValue__Group__2__Impl )
            // InternalMwe2Parser.g:2065:2: rule__DoubleValue__Group__2__Impl
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
    // InternalMwe2Parser.g:2071:1: rule__DoubleValue__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2075:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2076:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2076:1: ( RULE_INT )
            // InternalMwe2Parser.g:2077:2: RULE_INT
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
    // InternalMwe2Parser.g:2087:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2091:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalMwe2Parser.g:2092:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
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
    // InternalMwe2Parser.g:2099:1: rule__IntValue__Group__0__Impl : ( ( rule__IntValue__Alternatives_0 )? ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2103:1: ( ( ( rule__IntValue__Alternatives_0 )? ) )
            // InternalMwe2Parser.g:2104:1: ( ( rule__IntValue__Alternatives_0 )? )
            {
            // InternalMwe2Parser.g:2104:1: ( ( rule__IntValue__Alternatives_0 )? )
            // InternalMwe2Parser.g:2105:2: ( rule__IntValue__Alternatives_0 )?
            {
             before(grammarAccess.getIntValueAccess().getAlternatives_0()); 
            // InternalMwe2Parser.g:2106:2: ( rule__IntValue__Alternatives_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PlusSign && LA21_0<=HyphenMinus)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMwe2Parser.g:2106:3: rule__IntValue__Alternatives_0
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
    // InternalMwe2Parser.g:2114:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2118:1: ( rule__IntValue__Group__1__Impl )
            // InternalMwe2Parser.g:2119:2: rule__IntValue__Group__1__Impl
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
    // InternalMwe2Parser.g:2125:1: rule__IntValue__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2129:1: ( ( RULE_INT ) )
            // InternalMwe2Parser.g:2130:1: ( RULE_INT )
            {
            // InternalMwe2Parser.g:2130:1: ( RULE_INT )
            // InternalMwe2Parser.g:2131:2: RULE_INT
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
    // InternalMwe2Parser.g:2141:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2145:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalMwe2Parser.g:2146:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
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
    // InternalMwe2Parser.g:2153:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2157:1: ( ( () ) )
            // InternalMwe2Parser.g:2158:1: ( () )
            {
            // InternalMwe2Parser.g:2158:1: ( () )
            // InternalMwe2Parser.g:2159:2: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalMwe2Parser.g:2160:2: ()
            // InternalMwe2Parser.g:2160:3: 
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
    // InternalMwe2Parser.g:2168:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2172:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalMwe2Parser.g:2173:2: rule__BooleanLiteral__Group__1__Impl
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
    // InternalMwe2Parser.g:2179:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2183:1: ( ( ( rule__BooleanLiteral__Alternatives_1 ) ) )
            // InternalMwe2Parser.g:2184:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            {
            // InternalMwe2Parser.g:2184:1: ( ( rule__BooleanLiteral__Alternatives_1 ) )
            // InternalMwe2Parser.g:2185:2: ( rule__BooleanLiteral__Alternatives_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives_1()); 
            // InternalMwe2Parser.g:2186:2: ( rule__BooleanLiteral__Alternatives_1 )
            // InternalMwe2Parser.g:2186:3: rule__BooleanLiteral__Alternatives_1
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
    // InternalMwe2Parser.g:2195:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2199:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMwe2Parser.g:2200:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalMwe2Parser.g:2207:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2211:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2212:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2212:1: ( RULE_ID )
            // InternalMwe2Parser.g:2213:2: RULE_ID
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
    // InternalMwe2Parser.g:2222:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2226:1: ( rule__FQN__Group__1__Impl )
            // InternalMwe2Parser.g:2227:2: rule__FQN__Group__1__Impl
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
    // InternalMwe2Parser.g:2233:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2237:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMwe2Parser.g:2238:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMwe2Parser.g:2238:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMwe2Parser.g:2239:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMwe2Parser.g:2240:2: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==FullStop) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMwe2Parser.g:2240:3: rule__FQN__Group_1__0
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
    // InternalMwe2Parser.g:2249:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2253:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMwe2Parser.g:2254:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalMwe2Parser.g:2261:1: rule__FQN__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2265:1: ( ( FullStop ) )
            // InternalMwe2Parser.g:2266:1: ( FullStop )
            {
            // InternalMwe2Parser.g:2266:1: ( FullStop )
            // InternalMwe2Parser.g:2267:2: FullStop
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
    // InternalMwe2Parser.g:2276:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2280:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMwe2Parser.g:2281:2: rule__FQN__Group_1__1__Impl
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
    // InternalMwe2Parser.g:2287:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2291:1: ( ( RULE_ID ) )
            // InternalMwe2Parser.g:2292:1: ( RULE_ID )
            {
            // InternalMwe2Parser.g:2292:1: ( RULE_ID )
            // InternalMwe2Parser.g:2293:2: RULE_ID
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
    // InternalMwe2Parser.g:2303:1: rule__StringLiteral__Group_0__0 : rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 ;
    public final void rule__StringLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2307:1: ( rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1 )
            // InternalMwe2Parser.g:2308:2: rule__StringLiteral__Group_0__0__Impl rule__StringLiteral__Group_0__1
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
    // InternalMwe2Parser.g:2315:1: rule__StringLiteral__Group_0__0__Impl : ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) ;
    public final void rule__StringLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2319:1: ( ( ( rule__StringLiteral__BeginAssignment_0_0 ) ) )
            // InternalMwe2Parser.g:2320:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            {
            // InternalMwe2Parser.g:2320:1: ( ( rule__StringLiteral__BeginAssignment_0_0 ) )
            // InternalMwe2Parser.g:2321:2: ( rule__StringLiteral__BeginAssignment_0_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_0_0()); 
            // InternalMwe2Parser.g:2322:2: ( rule__StringLiteral__BeginAssignment_0_0 )
            // InternalMwe2Parser.g:2322:3: rule__StringLiteral__BeginAssignment_0_0
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
    // InternalMwe2Parser.g:2330:1: rule__StringLiteral__Group_0__1 : rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 ;
    public final void rule__StringLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2334:1: ( rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2 )
            // InternalMwe2Parser.g:2335:2: rule__StringLiteral__Group_0__1__Impl rule__StringLiteral__Group_0__2
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
    // InternalMwe2Parser.g:2342:1: rule__StringLiteral__Group_0__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) ;
    public final void rule__StringLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2346:1: ( ( ( rule__StringLiteral__PartsAssignment_0_1 )? ) )
            // InternalMwe2Parser.g:2347:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            {
            // InternalMwe2Parser.g:2347:1: ( ( rule__StringLiteral__PartsAssignment_0_1 )? )
            // InternalMwe2Parser.g:2348:2: ( rule__StringLiteral__PartsAssignment_0_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_1()); 
            // InternalMwe2Parser.g:2349:2: ( rule__StringLiteral__PartsAssignment_0_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA23_0>=ReverseSolidusQuotationMark && LA23_0<=ReverseSolidusReverseSolidus)||LA23_0==RULE_ID||(LA23_0>=RULE_WS && LA23_0<=RULE_ANY_OTHER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMwe2Parser.g:2349:3: rule__StringLiteral__PartsAssignment_0_1
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
    // InternalMwe2Parser.g:2357:1: rule__StringLiteral__Group_0__2 : rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 ;
    public final void rule__StringLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2361:1: ( rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3 )
            // InternalMwe2Parser.g:2362:2: rule__StringLiteral__Group_0__2__Impl rule__StringLiteral__Group_0__3
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
    // InternalMwe2Parser.g:2369:1: rule__StringLiteral__Group_0__2__Impl : ( ( rule__StringLiteral__Group_0_2__0 )* ) ;
    public final void rule__StringLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2373:1: ( ( ( rule__StringLiteral__Group_0_2__0 )* ) )
            // InternalMwe2Parser.g:2374:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            {
            // InternalMwe2Parser.g:2374:1: ( ( rule__StringLiteral__Group_0_2__0 )* )
            // InternalMwe2Parser.g:2375:2: ( rule__StringLiteral__Group_0_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_0_2()); 
            // InternalMwe2Parser.g:2376:2: ( rule__StringLiteral__Group_0_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DollarSignLeftCurlyBracket) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMwe2Parser.g:2376:3: rule__StringLiteral__Group_0_2__0
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
    // InternalMwe2Parser.g:2384:1: rule__StringLiteral__Group_0__3 : rule__StringLiteral__Group_0__3__Impl ;
    public final void rule__StringLiteral__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2388:1: ( rule__StringLiteral__Group_0__3__Impl )
            // InternalMwe2Parser.g:2389:2: rule__StringLiteral__Group_0__3__Impl
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
    // InternalMwe2Parser.g:2395:1: rule__StringLiteral__Group_0__3__Impl : ( ( rule__StringLiteral__EndAssignment_0_3 ) ) ;
    public final void rule__StringLiteral__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2399:1: ( ( ( rule__StringLiteral__EndAssignment_0_3 ) ) )
            // InternalMwe2Parser.g:2400:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            {
            // InternalMwe2Parser.g:2400:1: ( ( rule__StringLiteral__EndAssignment_0_3 ) )
            // InternalMwe2Parser.g:2401:2: ( rule__StringLiteral__EndAssignment_0_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_0_3()); 
            // InternalMwe2Parser.g:2402:2: ( rule__StringLiteral__EndAssignment_0_3 )
            // InternalMwe2Parser.g:2402:3: rule__StringLiteral__EndAssignment_0_3
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
    // InternalMwe2Parser.g:2411:1: rule__StringLiteral__Group_0_2__0 : rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 ;
    public final void rule__StringLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2415:1: ( rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1 )
            // InternalMwe2Parser.g:2416:2: rule__StringLiteral__Group_0_2__0__Impl rule__StringLiteral__Group_0_2__1
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
    // InternalMwe2Parser.g:2423:1: rule__StringLiteral__Group_0_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) ;
    public final void rule__StringLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2427:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) ) )
            // InternalMwe2Parser.g:2428:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            {
            // InternalMwe2Parser.g:2428:1: ( ( rule__StringLiteral__PartsAssignment_0_2_0 ) )
            // InternalMwe2Parser.g:2429:2: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_0()); 
            // InternalMwe2Parser.g:2430:2: ( rule__StringLiteral__PartsAssignment_0_2_0 )
            // InternalMwe2Parser.g:2430:3: rule__StringLiteral__PartsAssignment_0_2_0
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
    // InternalMwe2Parser.g:2438:1: rule__StringLiteral__Group_0_2__1 : rule__StringLiteral__Group_0_2__1__Impl ;
    public final void rule__StringLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2442:1: ( rule__StringLiteral__Group_0_2__1__Impl )
            // InternalMwe2Parser.g:2443:2: rule__StringLiteral__Group_0_2__1__Impl
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
    // InternalMwe2Parser.g:2449:1: rule__StringLiteral__Group_0_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) ;
    public final void rule__StringLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2453:1: ( ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? ) )
            // InternalMwe2Parser.g:2454:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            {
            // InternalMwe2Parser.g:2454:1: ( ( rule__StringLiteral__PartsAssignment_0_2_1 )? )
            // InternalMwe2Parser.g:2455:2: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_0_2_1()); 
            // InternalMwe2Parser.g:2456:2: ( rule__StringLiteral__PartsAssignment_0_2_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA25_0>=ReverseSolidusQuotationMark && LA25_0<=ReverseSolidusReverseSolidus)||LA25_0==RULE_ID||(LA25_0>=RULE_WS && LA25_0<=RULE_ANY_OTHER)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMwe2Parser.g:2456:3: rule__StringLiteral__PartsAssignment_0_2_1
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
    // InternalMwe2Parser.g:2465:1: rule__StringLiteral__Group_1__0 : rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 ;
    public final void rule__StringLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2469:1: ( rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1 )
            // InternalMwe2Parser.g:2470:2: rule__StringLiteral__Group_1__0__Impl rule__StringLiteral__Group_1__1
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
    // InternalMwe2Parser.g:2477:1: rule__StringLiteral__Group_1__0__Impl : ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) ;
    public final void rule__StringLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2481:1: ( ( ( rule__StringLiteral__BeginAssignment_1_0 ) ) )
            // InternalMwe2Parser.g:2482:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            {
            // InternalMwe2Parser.g:2482:1: ( ( rule__StringLiteral__BeginAssignment_1_0 ) )
            // InternalMwe2Parser.g:2483:2: ( rule__StringLiteral__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginAssignment_1_0()); 
            // InternalMwe2Parser.g:2484:2: ( rule__StringLiteral__BeginAssignment_1_0 )
            // InternalMwe2Parser.g:2484:3: rule__StringLiteral__BeginAssignment_1_0
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
    // InternalMwe2Parser.g:2492:1: rule__StringLiteral__Group_1__1 : rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 ;
    public final void rule__StringLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2496:1: ( rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2 )
            // InternalMwe2Parser.g:2497:2: rule__StringLiteral__Group_1__1__Impl rule__StringLiteral__Group_1__2
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
    // InternalMwe2Parser.g:2504:1: rule__StringLiteral__Group_1__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) ;
    public final void rule__StringLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2508:1: ( ( ( rule__StringLiteral__PartsAssignment_1_1 )? ) )
            // InternalMwe2Parser.g:2509:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            {
            // InternalMwe2Parser.g:2509:1: ( ( rule__StringLiteral__PartsAssignment_1_1 )? )
            // InternalMwe2Parser.g:2510:2: ( rule__StringLiteral__PartsAssignment_1_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_1()); 
            // InternalMwe2Parser.g:2511:2: ( rule__StringLiteral__PartsAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA26_0>=ReverseSolidusQuotationMark && LA26_0<=ReverseSolidusReverseSolidus)||LA26_0==RULE_ID||(LA26_0>=RULE_WS && LA26_0<=RULE_ANY_OTHER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMwe2Parser.g:2511:3: rule__StringLiteral__PartsAssignment_1_1
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
    // InternalMwe2Parser.g:2519:1: rule__StringLiteral__Group_1__2 : rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 ;
    public final void rule__StringLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2523:1: ( rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3 )
            // InternalMwe2Parser.g:2524:2: rule__StringLiteral__Group_1__2__Impl rule__StringLiteral__Group_1__3
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
    // InternalMwe2Parser.g:2531:1: rule__StringLiteral__Group_1__2__Impl : ( ( rule__StringLiteral__Group_1_2__0 )* ) ;
    public final void rule__StringLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2535:1: ( ( ( rule__StringLiteral__Group_1_2__0 )* ) )
            // InternalMwe2Parser.g:2536:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            {
            // InternalMwe2Parser.g:2536:1: ( ( rule__StringLiteral__Group_1_2__0 )* )
            // InternalMwe2Parser.g:2537:2: ( rule__StringLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getStringLiteralAccess().getGroup_1_2()); 
            // InternalMwe2Parser.g:2538:2: ( rule__StringLiteral__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DollarSignLeftCurlyBracket) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMwe2Parser.g:2538:3: rule__StringLiteral__Group_1_2__0
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
    // InternalMwe2Parser.g:2546:1: rule__StringLiteral__Group_1__3 : rule__StringLiteral__Group_1__3__Impl ;
    public final void rule__StringLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2550:1: ( rule__StringLiteral__Group_1__3__Impl )
            // InternalMwe2Parser.g:2551:2: rule__StringLiteral__Group_1__3__Impl
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
    // InternalMwe2Parser.g:2557:1: rule__StringLiteral__Group_1__3__Impl : ( ( rule__StringLiteral__EndAssignment_1_3 ) ) ;
    public final void rule__StringLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2561:1: ( ( ( rule__StringLiteral__EndAssignment_1_3 ) ) )
            // InternalMwe2Parser.g:2562:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            {
            // InternalMwe2Parser.g:2562:1: ( ( rule__StringLiteral__EndAssignment_1_3 ) )
            // InternalMwe2Parser.g:2563:2: ( rule__StringLiteral__EndAssignment_1_3 )
            {
             before(grammarAccess.getStringLiteralAccess().getEndAssignment_1_3()); 
            // InternalMwe2Parser.g:2564:2: ( rule__StringLiteral__EndAssignment_1_3 )
            // InternalMwe2Parser.g:2564:3: rule__StringLiteral__EndAssignment_1_3
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
    // InternalMwe2Parser.g:2573:1: rule__StringLiteral__Group_1_2__0 : rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 ;
    public final void rule__StringLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2577:1: ( rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1 )
            // InternalMwe2Parser.g:2578:2: rule__StringLiteral__Group_1_2__0__Impl rule__StringLiteral__Group_1_2__1
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
    // InternalMwe2Parser.g:2585:1: rule__StringLiteral__Group_1_2__0__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) ;
    public final void rule__StringLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2589:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) ) )
            // InternalMwe2Parser.g:2590:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            {
            // InternalMwe2Parser.g:2590:1: ( ( rule__StringLiteral__PartsAssignment_1_2_0 ) )
            // InternalMwe2Parser.g:2591:2: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_0()); 
            // InternalMwe2Parser.g:2592:2: ( rule__StringLiteral__PartsAssignment_1_2_0 )
            // InternalMwe2Parser.g:2592:3: rule__StringLiteral__PartsAssignment_1_2_0
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
    // InternalMwe2Parser.g:2600:1: rule__StringLiteral__Group_1_2__1 : rule__StringLiteral__Group_1_2__1__Impl ;
    public final void rule__StringLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2604:1: ( rule__StringLiteral__Group_1_2__1__Impl )
            // InternalMwe2Parser.g:2605:2: rule__StringLiteral__Group_1_2__1__Impl
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
    // InternalMwe2Parser.g:2611:1: rule__StringLiteral__Group_1_2__1__Impl : ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) ;
    public final void rule__StringLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2615:1: ( ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? ) )
            // InternalMwe2Parser.g:2616:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            {
            // InternalMwe2Parser.g:2616:1: ( ( rule__StringLiteral__PartsAssignment_1_2_1 )? )
            // InternalMwe2Parser.g:2617:2: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            {
             before(grammarAccess.getStringLiteralAccess().getPartsAssignment_1_2_1()); 
            // InternalMwe2Parser.g:2618:2: ( rule__StringLiteral__PartsAssignment_1_2_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA28_0>=ReverseSolidusQuotationMark && LA28_0<=ReverseSolidusReverseSolidus)||LA28_0==RULE_ID||(LA28_0>=RULE_WS && LA28_0<=RULE_ANY_OTHER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMwe2Parser.g:2618:3: rule__StringLiteral__PartsAssignment_1_2_1
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
    // InternalMwe2Parser.g:2627:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2631:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // InternalMwe2Parser.g:2632:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
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
    // InternalMwe2Parser.g:2639:1: rule__PropertyReference__Group__0__Impl : ( DollarSignLeftCurlyBracket ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2643:1: ( ( DollarSignLeftCurlyBracket ) )
            // InternalMwe2Parser.g:2644:1: ( DollarSignLeftCurlyBracket )
            {
            // InternalMwe2Parser.g:2644:1: ( DollarSignLeftCurlyBracket )
            // InternalMwe2Parser.g:2645:2: DollarSignLeftCurlyBracket
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
    // InternalMwe2Parser.g:2654:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2658:1: ( rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2 )
            // InternalMwe2Parser.g:2659:2: rule__PropertyReference__Group__1__Impl rule__PropertyReference__Group__2
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
    // InternalMwe2Parser.g:2666:1: rule__PropertyReference__Group__1__Impl : ( rulePropertyReferenceImpl ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2670:1: ( ( rulePropertyReferenceImpl ) )
            // InternalMwe2Parser.g:2671:1: ( rulePropertyReferenceImpl )
            {
            // InternalMwe2Parser.g:2671:1: ( rulePropertyReferenceImpl )
            // InternalMwe2Parser.g:2672:2: rulePropertyReferenceImpl
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
    // InternalMwe2Parser.g:2681:1: rule__PropertyReference__Group__2 : rule__PropertyReference__Group__2__Impl ;
    public final void rule__PropertyReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2685:1: ( rule__PropertyReference__Group__2__Impl )
            // InternalMwe2Parser.g:2686:2: rule__PropertyReference__Group__2__Impl
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
    // InternalMwe2Parser.g:2692:1: rule__PropertyReference__Group__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__PropertyReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2696:1: ( ( RightCurlyBracket ) )
            // InternalMwe2Parser.g:2697:1: ( RightCurlyBracket )
            {
            // InternalMwe2Parser.g:2697:1: ( RightCurlyBracket )
            // InternalMwe2Parser.g:2698:2: RightCurlyBracket
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
    // InternalMwe2Parser.g:2708:1: rule__Module__CanonicalNameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Module__CanonicalNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2712:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2713:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2713:2: ( ruleFQN )
            // InternalMwe2Parser.g:2714:3: ruleFQN
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
    // InternalMwe2Parser.g:2723:1: rule__Module__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2727:1: ( ( ruleImport ) )
            // InternalMwe2Parser.g:2728:2: ( ruleImport )
            {
            // InternalMwe2Parser.g:2728:2: ( ruleImport )
            // InternalMwe2Parser.g:2729:3: ruleImport
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
    // InternalMwe2Parser.g:2738:1: rule__Module__DeclaredPropertiesAssignment_4 : ( ruleDeclaredProperty ) ;
    public final void rule__Module__DeclaredPropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2742:1: ( ( ruleDeclaredProperty ) )
            // InternalMwe2Parser.g:2743:2: ( ruleDeclaredProperty )
            {
            // InternalMwe2Parser.g:2743:2: ( ruleDeclaredProperty )
            // InternalMwe2Parser.g:2744:3: ruleDeclaredProperty
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
    // InternalMwe2Parser.g:2753:1: rule__Module__RootAssignment_5 : ( ruleRootComponent ) ;
    public final void rule__Module__RootAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2757:1: ( ( ruleRootComponent ) )
            // InternalMwe2Parser.g:2758:2: ( ruleRootComponent )
            {
            // InternalMwe2Parser.g:2758:2: ( ruleRootComponent )
            // InternalMwe2Parser.g:2759:3: ruleRootComponent
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
    // InternalMwe2Parser.g:2768:1: rule__DeclaredProperty__TypeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DeclaredProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2772:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2773:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2773:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2774:3: ( ruleFQN )
            {
             before(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
            // InternalMwe2Parser.g:2775:3: ( ruleFQN )
            // InternalMwe2Parser.g:2776:4: ruleFQN
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
    // InternalMwe2Parser.g:2787:1: rule__DeclaredProperty__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__DeclaredProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2791:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2792:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2792:2: ( ruleFQN )
            // InternalMwe2Parser.g:2793:3: ruleFQN
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
    // InternalMwe2Parser.g:2802:1: rule__DeclaredProperty__DefaultAssignment_3_1 : ( ruleValue ) ;
    public final void rule__DeclaredProperty__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2806:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:2807:2: ( ruleValue )
            {
            // InternalMwe2Parser.g:2807:2: ( ruleValue )
            // InternalMwe2Parser.g:2808:3: ruleValue
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
    // InternalMwe2Parser.g:2817:1: rule__RootComponent__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2821:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2822:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2822:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2823:3: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:2824:3: ( ruleFQN )
            // InternalMwe2Parser.g:2825:4: ruleFQN
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
    // InternalMwe2Parser.g:2836:1: rule__RootComponent__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootComponent__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2840:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2841:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2841:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2842:3: ( ruleFQN )
            {
             before(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:2843:3: ( ruleFQN )
            // InternalMwe2Parser.g:2844:4: ruleFQN
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
    // InternalMwe2Parser.g:2855:1: rule__RootComponent__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__RootComponent__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2859:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2860:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2860:2: ( ruleFQN )
            // InternalMwe2Parser.g:2861:3: ruleFQN
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
    // InternalMwe2Parser.g:2870:1: rule__RootComponent__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__RootComponent__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2874:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:2875:2: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:2875:2: ( ( AutoInject ) )
            // InternalMwe2Parser.g:2876:3: ( AutoInject )
            {
             before(grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:2877:3: ( AutoInject )
            // InternalMwe2Parser.g:2878:4: AutoInject
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
    // InternalMwe2Parser.g:2889:1: rule__RootComponent__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__RootComponent__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2893:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:2894:2: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:2894:2: ( ruleAssignment )
            // InternalMwe2Parser.g:2895:3: ruleAssignment
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
    // InternalMwe2Parser.g:2904:1: rule__Component__TypeAssignment_1_0 : ( ( ruleFQN ) ) ;
    public final void rule__Component__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2908:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2909:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2909:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2910:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
            // InternalMwe2Parser.g:2911:3: ( ruleFQN )
            // InternalMwe2Parser.g:2912:4: ruleFQN
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
    // InternalMwe2Parser.g:2923:1: rule__Component__ModuleAssignment_1_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Component__ModuleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2927:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:2928:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:2928:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2929:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
            // InternalMwe2Parser.g:2930:3: ( ruleFQN )
            // InternalMwe2Parser.g:2931:4: ruleFQN
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
    // InternalMwe2Parser.g:2942:1: rule__Component__NameAssignment_2_1 : ( ruleFQN ) ;
    public final void rule__Component__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2946:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:2947:2: ( ruleFQN )
            {
            // InternalMwe2Parser.g:2947:2: ( ruleFQN )
            // InternalMwe2Parser.g:2948:3: ruleFQN
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
    // InternalMwe2Parser.g:2957:1: rule__Component__AutoInjectAssignment_3 : ( ( AutoInject ) ) ;
    public final void rule__Component__AutoInjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2961:1: ( ( ( AutoInject ) ) )
            // InternalMwe2Parser.g:2962:2: ( ( AutoInject ) )
            {
            // InternalMwe2Parser.g:2962:2: ( ( AutoInject ) )
            // InternalMwe2Parser.g:2963:3: ( AutoInject )
            {
             before(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0()); 
            // InternalMwe2Parser.g:2964:3: ( AutoInject )
            // InternalMwe2Parser.g:2965:4: AutoInject
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
    // InternalMwe2Parser.g:2976:1: rule__Component__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Component__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2980:1: ( ( ruleAssignment ) )
            // InternalMwe2Parser.g:2981:2: ( ruleAssignment )
            {
            // InternalMwe2Parser.g:2981:2: ( ruleAssignment )
            // InternalMwe2Parser.g:2982:3: ruleAssignment
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
    // InternalMwe2Parser.g:2991:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:2995:1: ( ( ruleImportedFQN ) )
            // InternalMwe2Parser.g:2996:2: ( ruleImportedFQN )
            {
            // InternalMwe2Parser.g:2996:2: ( ruleImportedFQN )
            // InternalMwe2Parser.g:2997:3: ruleImportedFQN
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
    // InternalMwe2Parser.g:3006:1: rule__Assignment__FeatureAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Assignment__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3010:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3011:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3011:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3012:3: ( ruleFQN )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0()); 
            // InternalMwe2Parser.g:3013:3: ( ruleFQN )
            // InternalMwe2Parser.g:3014:4: ruleFQN
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
    // InternalMwe2Parser.g:3025:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3029:1: ( ( ruleValue ) )
            // InternalMwe2Parser.g:3030:2: ( ruleValue )
            {
            // InternalMwe2Parser.g:3030:2: ( ruleValue )
            // InternalMwe2Parser.g:3031:3: ruleValue
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
    // InternalMwe2Parser.g:3040:1: rule__DoubleLiteral__ValueAssignment : ( ruleDoubleValue ) ;
    public final void rule__DoubleLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3044:1: ( ( ruleDoubleValue ) )
            // InternalMwe2Parser.g:3045:2: ( ruleDoubleValue )
            {
            // InternalMwe2Parser.g:3045:2: ( ruleDoubleValue )
            // InternalMwe2Parser.g:3046:3: ruleDoubleValue
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
    // InternalMwe2Parser.g:3055:1: rule__IntegerLiteral__ValueAssignment : ( ruleIntValue ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3059:1: ( ( ruleIntValue ) )
            // InternalMwe2Parser.g:3060:2: ( ruleIntValue )
            {
            // InternalMwe2Parser.g:3060:2: ( ruleIntValue )
            // InternalMwe2Parser.g:3061:3: ruleIntValue
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
    // InternalMwe2Parser.g:3070:1: rule__BooleanLiteral__IsTrueAssignment_1_0 : ( ( True ) ) ;
    public final void rule__BooleanLiteral__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3074:1: ( ( ( True ) ) )
            // InternalMwe2Parser.g:3075:2: ( ( True ) )
            {
            // InternalMwe2Parser.g:3075:2: ( ( True ) )
            // InternalMwe2Parser.g:3076:3: ( True )
            {
             before(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3077:3: ( True )
            // InternalMwe2Parser.g:3078:4: True
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
    // InternalMwe2Parser.g:3089:1: rule__Reference__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3093:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3094:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3094:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3095:3: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            // InternalMwe2Parser.g:3096:3: ( ruleFQN )
            // InternalMwe2Parser.g:3097:4: ruleFQN
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
    // InternalMwe2Parser.g:3108:1: rule__StringLiteral__BeginAssignment_0_0 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__BeginAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3112:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3113:2: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3113:2: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3114:3: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0()); 
            // InternalMwe2Parser.g:3115:3: ( Apostrophe )
            // InternalMwe2Parser.g:3116:4: Apostrophe
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
    // InternalMwe2Parser.g:3127:1: rule__StringLiteral__PartsAssignment_0_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3131:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3132:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3132:2: ( rulePlainString )
            // InternalMwe2Parser.g:3133:3: rulePlainString
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
    // InternalMwe2Parser.g:3142:1: rule__StringLiteral__PartsAssignment_0_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3146:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3147:2: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3147:2: ( rulePropertyReference )
            // InternalMwe2Parser.g:3148:3: rulePropertyReference
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
    // InternalMwe2Parser.g:3157:1: rule__StringLiteral__PartsAssignment_0_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3161:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3162:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3162:2: ( rulePlainString )
            // InternalMwe2Parser.g:3163:3: rulePlainString
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
    // InternalMwe2Parser.g:3172:1: rule__StringLiteral__EndAssignment_0_3 : ( ( Apostrophe ) ) ;
    public final void rule__StringLiteral__EndAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3176:1: ( ( ( Apostrophe ) ) )
            // InternalMwe2Parser.g:3177:2: ( ( Apostrophe ) )
            {
            // InternalMwe2Parser.g:3177:2: ( ( Apostrophe ) )
            // InternalMwe2Parser.g:3178:3: ( Apostrophe )
            {
             before(grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0()); 
            // InternalMwe2Parser.g:3179:3: ( Apostrophe )
            // InternalMwe2Parser.g:3180:4: Apostrophe
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
    // InternalMwe2Parser.g:3191:1: rule__StringLiteral__BeginAssignment_1_0 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3195:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3196:2: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3196:2: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3197:3: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0()); 
            // InternalMwe2Parser.g:3198:3: ( QuotationMark )
            // InternalMwe2Parser.g:3199:4: QuotationMark
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
    // InternalMwe2Parser.g:3210:1: rule__StringLiteral__PartsAssignment_1_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3214:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3215:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3215:2: ( rulePlainString )
            // InternalMwe2Parser.g:3216:3: rulePlainString
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
    // InternalMwe2Parser.g:3225:1: rule__StringLiteral__PartsAssignment_1_2_0 : ( rulePropertyReference ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3229:1: ( ( rulePropertyReference ) )
            // InternalMwe2Parser.g:3230:2: ( rulePropertyReference )
            {
            // InternalMwe2Parser.g:3230:2: ( rulePropertyReference )
            // InternalMwe2Parser.g:3231:3: rulePropertyReference
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
    // InternalMwe2Parser.g:3240:1: rule__StringLiteral__PartsAssignment_1_2_1 : ( rulePlainString ) ;
    public final void rule__StringLiteral__PartsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3244:1: ( ( rulePlainString ) )
            // InternalMwe2Parser.g:3245:2: ( rulePlainString )
            {
            // InternalMwe2Parser.g:3245:2: ( rulePlainString )
            // InternalMwe2Parser.g:3246:3: rulePlainString
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
    // InternalMwe2Parser.g:3255:1: rule__StringLiteral__EndAssignment_1_3 : ( ( QuotationMark ) ) ;
    public final void rule__StringLiteral__EndAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3259:1: ( ( ( QuotationMark ) ) )
            // InternalMwe2Parser.g:3260:2: ( ( QuotationMark ) )
            {
            // InternalMwe2Parser.g:3260:2: ( ( QuotationMark ) )
            // InternalMwe2Parser.g:3261:3: ( QuotationMark )
            {
             before(grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0()); 
            // InternalMwe2Parser.g:3262:3: ( QuotationMark )
            // InternalMwe2Parser.g:3263:4: QuotationMark
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
    // InternalMwe2Parser.g:3274:1: rule__PropertyReferenceImpl__ReferableAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PropertyReferenceImpl__ReferableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3278:1: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:3279:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:3279:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:3280:3: ( ruleFQN )
            {
             before(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            // InternalMwe2Parser.g:3281:3: ( ruleFQN )
            // InternalMwe2Parser.g:3282:4: ruleFQN
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
    // InternalMwe2Parser.g:3293:1: rule__PlainString__ValueAssignment : ( ruleConstantValue ) ;
    public final void rule__PlainString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMwe2Parser.g:3297:1: ( ( ruleConstantValue ) )
            // InternalMwe2Parser.g:3298:2: ( ruleConstantValue )
            {
            // InternalMwe2Parser.g:3298:2: ( ruleConstantValue )
            // InternalMwe2Parser.g:3299:3: ruleConstantValue
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
            return "680:1: rule__Value__Alternatives : ( ( ruleComponent ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) | ( ruleIntegerLiteral ) | ( ruleDoubleLiteral ) | ( ruleNullLiteral ) | ( ruleReference ) );";
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
            return "1053:2: ( rule__DeclaredProperty__TypeAssignment_1 )?";
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