package org.eclipse.emf.mwe2.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalMwe2Parser extends AbstractInternalAntlrParser {
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

        public InternalMwe2Parser(TokenStream input, Mwe2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected Mwe2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalMwe2Parser.g:62:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMwe2Parser.g:62:47: (iv_ruleModule= ruleModule EOF )
            // InternalMwe2Parser.g:63:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMwe2Parser.g:69:1: ruleModule returns [EObject current=null] : ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_declaredProperties_4_0 = null;

        EObject lv_root_5_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:75:2: ( ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) )
            // InternalMwe2Parser.g:76:2: ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            {
            // InternalMwe2Parser.g:76:2: ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            // InternalMwe2Parser.g:77:3: () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) )
            {
            // InternalMwe2Parser.g:77:3: ()
            // InternalMwe2Parser.g:78:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModuleAccess().getModuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Module,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
            		
            // InternalMwe2Parser.g:88:3: ( (lv_canonicalName_2_0= ruleFQN ) )
            // InternalMwe2Parser.g:89:4: (lv_canonicalName_2_0= ruleFQN )
            {
            // InternalMwe2Parser.g:89:4: (lv_canonicalName_2_0= ruleFQN )
            // InternalMwe2Parser.g:90:5: lv_canonicalName_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_canonicalName_2_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"canonicalName",
            						lv_canonicalName_2_0,
            						"org.eclipse.emf.mwe2.language.Mwe2.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMwe2Parser.g:107:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:108:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalMwe2Parser.g:108:4: (lv_imports_3_0= ruleImport )
            	    // InternalMwe2Parser.g:109:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"org.eclipse.emf.mwe2.language.Mwe2.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMwe2Parser.g:126:3: ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Var) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMwe2Parser.g:127:4: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    {
            	    // InternalMwe2Parser.g:127:4: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    // InternalMwe2Parser.g:128:5: lv_declaredProperties_4_0= ruleDeclaredProperty
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declaredProperties_4_0=ruleDeclaredProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declaredProperties",
            	    						lv_declaredProperties_4_0,
            	    						"org.eclipse.emf.mwe2.language.Mwe2.DeclaredProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMwe2Parser.g:145:3: ( (lv_root_5_0= ruleRootComponent ) )
            // InternalMwe2Parser.g:146:4: (lv_root_5_0= ruleRootComponent )
            {
            // InternalMwe2Parser.g:146:4: (lv_root_5_0= ruleRootComponent )
            // InternalMwe2Parser.g:147:5: lv_root_5_0= ruleRootComponent
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_root_5_0=ruleRootComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_5_0,
            						"org.eclipse.emf.mwe2.language.Mwe2.RootComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDeclaredProperty"
    // InternalMwe2Parser.g:168:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // InternalMwe2Parser.g:168:57: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:169:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
            {
             newCompositeNode(grammarAccess.getDeclaredPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredProperty=ruleDeclaredProperty();

            state._fsp--;

             current =iv_ruleDeclaredProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredProperty"


    // $ANTLR start "ruleDeclaredProperty"
    // InternalMwe2Parser.g:175:1: ruleDeclaredProperty returns [EObject current=null] : (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:181:2: ( (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? ) )
            // InternalMwe2Parser.g:182:2: (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? )
            {
            // InternalMwe2Parser.g:182:2: (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? )
            // InternalMwe2Parser.g:183:3: otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0());
            		
            // InternalMwe2Parser.g:187:3: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMwe2Parser.g:188:4: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:188:4: ( ruleFQN )
                    // InternalMwe2Parser.g:189:5: ruleFQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeclaredPropertyRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleFQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMwe2Parser.g:203:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalMwe2Parser.g:204:4: (lv_name_2_0= ruleFQN )
            {
            // InternalMwe2Parser.g:204:4: (lv_name_2_0= ruleFQN )
            // InternalMwe2Parser.g:205:5: lv_name_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.emf.mwe2.language.Mwe2.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMwe2Parser.g:222:3: (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EqualsSign) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:223:4: otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,EqualsSign,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMwe2Parser.g:227:4: ( (lv_default_4_0= ruleValue ) )
                    // InternalMwe2Parser.g:228:5: (lv_default_4_0= ruleValue )
                    {
                    // InternalMwe2Parser.g:228:5: (lv_default_4_0= ruleValue )
                    // InternalMwe2Parser.g:229:6: lv_default_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_4_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"org.eclipse.emf.mwe2.language.Mwe2.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredProperty"


    // $ANTLR start "entryRuleRootComponent"
    // InternalMwe2Parser.g:251:1: entryRuleRootComponent returns [EObject current=null] : iv_ruleRootComponent= ruleRootComponent EOF ;
    public final EObject entryRuleRootComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootComponent = null;


        try {
            // InternalMwe2Parser.g:251:54: (iv_ruleRootComponent= ruleRootComponent EOF )
            // InternalMwe2Parser.g:252:2: iv_ruleRootComponent= ruleRootComponent EOF
            {
             newCompositeNode(grammarAccess.getRootComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootComponent=ruleRootComponent();

            state._fsp--;

             current =iv_ruleRootComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootComponent"


    // $ANTLR start "ruleRootComponent"
    // InternalMwe2Parser.g:258:1: ruleRootComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleRootComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_autoInject_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:264:2: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) )
            // InternalMwe2Parser.g:265:2: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:265:2: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            // InternalMwe2Parser.g:266:3: () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket
            {
            // InternalMwe2Parser.g:266:3: ()
            // InternalMwe2Parser.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            // InternalMwe2Parser.g:273:3: ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==CommercialAt) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMwe2Parser.g:274:4: ( ( ruleFQN ) )
                    {
                    // InternalMwe2Parser.g:274:4: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:275:5: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:275:5: ( ruleFQN )
                    // InternalMwe2Parser.g:276:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRootComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:291:4: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    {
                    // InternalMwe2Parser.g:291:4: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    // InternalMwe2Parser.g:292:5: otherlv_2= CommercialAt ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,CommercialAt,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0());
                    				
                    // InternalMwe2Parser.g:296:5: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:297:6: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:297:6: ( ruleFQN )
                    // InternalMwe2Parser.g:298:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRootComponentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMwe2Parser.g:314:3: (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMwe2Parser.g:315:4: otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootComponentAccess().getColonKeyword_2_0());
                    			
                    // InternalMwe2Parser.g:319:4: ( (lv_name_5_0= ruleFQN ) )
                    // InternalMwe2Parser.g:320:5: (lv_name_5_0= ruleFQN )
                    {
                    // InternalMwe2Parser.g:320:5: (lv_name_5_0= ruleFQN )
                    // InternalMwe2Parser.g:321:6: lv_name_5_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootComponentRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.emf.mwe2.language.Mwe2.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMwe2Parser.g:339:3: ( (lv_autoInject_6_0= AutoInject ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AutoInject) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMwe2Parser.g:340:4: (lv_autoInject_6_0= AutoInject )
                    {
                    // InternalMwe2Parser.g:340:4: (lv_autoInject_6_0= AutoInject )
                    // InternalMwe2Parser.g:341:5: lv_autoInject_6_0= AutoInject
                    {
                    lv_autoInject_6_0=(Token)match(input,AutoInject,FOLLOW_9); 

                    					newLeafNode(lv_autoInject_6_0, grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRootComponentRule());
                    					}
                    					setWithLastConsumed(current, "autoInject", lv_autoInject_6_0 != null, "auto-inject");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMwe2Parser.g:357:3: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMwe2Parser.g:358:4: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // InternalMwe2Parser.g:358:4: (lv_assignment_8_0= ruleAssignment )
            	    // InternalMwe2Parser.g:359:5: lv_assignment_8_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignment",
            	    						lv_assignment_8_0,
            	    						"org.eclipse.emf.mwe2.language.Mwe2.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootComponent"


    // $ANTLR start "entryRuleComponent"
    // InternalMwe2Parser.g:384:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMwe2Parser.g:384:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMwe2Parser.g:385:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMwe2Parser.g:391:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_autoInject_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:397:2: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) )
            // InternalMwe2Parser.g:398:2: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:398:2: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            // InternalMwe2Parser.g:399:3: () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket
            {
            // InternalMwe2Parser.g:399:3: ()
            // InternalMwe2Parser.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            // InternalMwe2Parser.g:406:3: ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==CommercialAt) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalMwe2Parser.g:407:4: ( ( ruleFQN ) )
                    {
                    // InternalMwe2Parser.g:407:4: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:408:5: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:408:5: ( ruleFQN )
                    // InternalMwe2Parser.g:409:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:424:4: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    {
                    // InternalMwe2Parser.g:424:4: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    // InternalMwe2Parser.g:425:5: otherlv_2= CommercialAt ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,CommercialAt,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0());
                    				
                    // InternalMwe2Parser.g:429:5: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:430:6: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:430:6: ( ruleFQN )
                    // InternalMwe2Parser.g:431:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMwe2Parser.g:447:3: (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMwe2Parser.g:448:4: otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_2_0());
                    			
                    // InternalMwe2Parser.g:452:4: ( (lv_name_5_0= ruleFQN ) )
                    // InternalMwe2Parser.g:453:5: (lv_name_5_0= ruleFQN )
                    {
                    // InternalMwe2Parser.g:453:5: (lv_name_5_0= ruleFQN )
                    // InternalMwe2Parser.g:454:6: lv_name_5_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.emf.mwe2.language.Mwe2.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMwe2Parser.g:472:3: ( (lv_autoInject_6_0= AutoInject ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==AutoInject) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:473:4: (lv_autoInject_6_0= AutoInject )
                    {
                    // InternalMwe2Parser.g:473:4: (lv_autoInject_6_0= AutoInject )
                    // InternalMwe2Parser.g:474:5: lv_autoInject_6_0= AutoInject
                    {
                    lv_autoInject_6_0=(Token)match(input,AutoInject,FOLLOW_9); 

                    					newLeafNode(lv_autoInject_6_0, grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "autoInject", lv_autoInject_6_0 != null, "auto-inject");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMwe2Parser.g:490:3: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMwe2Parser.g:491:4: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // InternalMwe2Parser.g:491:4: (lv_assignment_8_0= ruleAssignment )
            	    // InternalMwe2Parser.g:492:5: lv_assignment_8_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignment",
            	    						lv_assignment_8_0,
            	    						"org.eclipse.emf.mwe2.language.Mwe2.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleImport"
    // InternalMwe2Parser.g:517:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMwe2Parser.g:517:47: (iv_ruleImport= ruleImport EOF )
            // InternalMwe2Parser.g:518:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMwe2Parser.g:524:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:530:2: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // InternalMwe2Parser.g:531:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // InternalMwe2Parser.g:531:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // InternalMwe2Parser.g:532:3: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMwe2Parser.g:536:3: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // InternalMwe2Parser.g:537:4: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // InternalMwe2Parser.g:537:4: (lv_importedNamespace_1_0= ruleImportedFQN )
            // InternalMwe2Parser.g:538:5: lv_importedNamespace_1_0= ruleImportedFQN
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleImportedFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.eclipse.emf.mwe2.language.Mwe2.ImportedFQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalMwe2Parser.g:559:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalMwe2Parser.g:559:51: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalMwe2Parser.g:560:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             newCompositeNode(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedFQN=ruleImportedFQN();

            state._fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalMwe2Parser.g:566:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:572:2: ( (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:573:2: (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:573:2: (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? )
            // InternalMwe2Parser.g:574:3: this_FQN_0= ruleFQN (kw= FullStopAsterisk )?
            {

            			newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMwe2Parser.g:584:3: (kw= FullStopAsterisk )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStopAsterisk) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:585:4: kw= FullStopAsterisk
                    {
                    kw=(Token)match(input,FullStopAsterisk,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleAssignment"
    // InternalMwe2Parser.g:595:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMwe2Parser.g:595:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMwe2Parser.g:596:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMwe2Parser.g:602:1: ruleAssignment returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:608:2: ( ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMwe2Parser.g:609:2: ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMwe2Parser.g:609:2: ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
            // InternalMwe2Parser.g:610:3: ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMwe2Parser.g:610:3: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:611:4: ( ruleFQN )
            {
            // InternalMwe2Parser.g:611:4: ( ruleFQN )
            // InternalMwe2Parser.g:612:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalMwe2Parser.g:630:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMwe2Parser.g:631:4: (lv_value_2_0= ruleValue )
            {
            // InternalMwe2Parser.g:631:4: (lv_value_2_0= ruleValue )
            // InternalMwe2Parser.g:632:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.emf.mwe2.language.Mwe2.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalMwe2Parser.g:653:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMwe2Parser.g:653:46: (iv_ruleValue= ruleValue EOF )
            // InternalMwe2Parser.g:654:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMwe2Parser.g:660:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_DoubleLiteral_4= ruleDoubleLiteral | this_NullLiteral_5= ruleNullLiteral | this_Reference_6= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_IntegerLiteral_3 = null;

        EObject this_DoubleLiteral_4 = null;

        EObject this_NullLiteral_5 = null;

        EObject this_Reference_6 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:666:2: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_DoubleLiteral_4= ruleDoubleLiteral | this_NullLiteral_5= ruleNullLiteral | this_Reference_6= ruleReference ) )
            // InternalMwe2Parser.g:667:2: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_DoubleLiteral_4= ruleDoubleLiteral | this_NullLiteral_5= ruleNullLiteral | this_Reference_6= ruleReference )
            {
            // InternalMwe2Parser.g:667:2: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_DoubleLiteral_4= ruleDoubleLiteral | this_NullLiteral_5= ruleNullLiteral | this_Reference_6= ruleReference )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalMwe2Parser.g:668:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:677:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMwe2Parser.g:686:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMwe2Parser.g:695:3: this_IntegerLiteral_3= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_3=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMwe2Parser.g:704:3: this_DoubleLiteral_4= ruleDoubleLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_4=ruleDoubleLiteral();

                    state._fsp--;


                    			current = this_DoubleLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMwe2Parser.g:713:3: this_NullLiteral_5= ruleNullLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteral_5=ruleNullLiteral();

                    state._fsp--;


                    			current = this_NullLiteral_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMwe2Parser.g:722:3: this_Reference_6= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_6=ruleReference();

                    state._fsp--;


                    			current = this_Reference_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNullLiteral"
    // InternalMwe2Parser.g:734:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // InternalMwe2Parser.g:734:52: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // InternalMwe2Parser.g:735:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // InternalMwe2Parser.g:741:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= Null ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:747:2: ( ( () otherlv_1= Null ) )
            // InternalMwe2Parser.g:748:2: ( () otherlv_1= Null )
            {
            // InternalMwe2Parser.g:748:2: ( () otherlv_1= Null )
            // InternalMwe2Parser.g:749:3: () otherlv_1= Null
            {
            // InternalMwe2Parser.g:749:3: ()
            // InternalMwe2Parser.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Null,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalMwe2Parser.g:764:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalMwe2Parser.g:764:54: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalMwe2Parser.g:765:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalMwe2Parser.g:771:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleDoubleValue ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:777:2: ( ( (lv_value_0_0= ruleDoubleValue ) ) )
            // InternalMwe2Parser.g:778:2: ( (lv_value_0_0= ruleDoubleValue ) )
            {
            // InternalMwe2Parser.g:778:2: ( (lv_value_0_0= ruleDoubleValue ) )
            // InternalMwe2Parser.g:779:3: (lv_value_0_0= ruleDoubleValue )
            {
            // InternalMwe2Parser.g:779:3: (lv_value_0_0= ruleDoubleValue )
            // InternalMwe2Parser.g:780:4: lv_value_0_0= ruleDoubleValue
            {

            				newCompositeNode(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDoubleValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.emf.mwe2.language.Mwe2.DoubleValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleDoubleValue"
    // InternalMwe2Parser.g:800:1: entryRuleDoubleValue returns [String current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final String entryRuleDoubleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDoubleValue = null;


        try {
            // InternalMwe2Parser.g:800:51: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // InternalMwe2Parser.g:801:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getDoubleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;

             current =iv_ruleDoubleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // InternalMwe2Parser.g:807:1: ruleDoubleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntValue_0= ruleIntValue kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDoubleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_IntValue_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:813:2: ( (this_IntValue_0= ruleIntValue kw= FullStop this_INT_2= RULE_INT ) )
            // InternalMwe2Parser.g:814:2: (this_IntValue_0= ruleIntValue kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalMwe2Parser.g:814:2: (this_IntValue_0= ruleIntValue kw= FullStop this_INT_2= RULE_INT )
            // InternalMwe2Parser.g:815:3: this_IntValue_0= ruleIntValue kw= FullStop this_INT_2= RULE_INT
            {

            			newCompositeNode(grammarAccess.getDoubleValueAccess().getIntValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_IntValue_0=ruleIntValue();

            state._fsp--;


            			current.merge(this_IntValue_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,FullStop,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleValueAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleValueAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMwe2Parser.g:841:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalMwe2Parser.g:841:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalMwe2Parser.g:842:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMwe2Parser.g:848:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleIntValue ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:854:2: ( ( (lv_value_0_0= ruleIntValue ) ) )
            // InternalMwe2Parser.g:855:2: ( (lv_value_0_0= ruleIntValue ) )
            {
            // InternalMwe2Parser.g:855:2: ( (lv_value_0_0= ruleIntValue ) )
            // InternalMwe2Parser.g:856:3: (lv_value_0_0= ruleIntValue )
            {
            // InternalMwe2Parser.g:856:3: (lv_value_0_0= ruleIntValue )
            // InternalMwe2Parser.g:857:4: lv_value_0_0= ruleIntValue
            {

            				newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleIntValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.emf.mwe2.language.Mwe2.IntValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleIntValue"
    // InternalMwe2Parser.g:877:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalMwe2Parser.g:877:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalMwe2Parser.g:878:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalMwe2Parser.g:884:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus | kw= PlusSign )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:890:2: ( ( (kw= HyphenMinus | kw= PlusSign )? this_INT_2= RULE_INT ) )
            // InternalMwe2Parser.g:891:2: ( (kw= HyphenMinus | kw= PlusSign )? this_INT_2= RULE_INT )
            {
            // InternalMwe2Parser.g:891:2: ( (kw= HyphenMinus | kw= PlusSign )? this_INT_2= RULE_INT )
            // InternalMwe2Parser.g:892:3: (kw= HyphenMinus | kw= PlusSign )? this_INT_2= RULE_INT
            {
            // InternalMwe2Parser.g:892:3: (kw= HyphenMinus | kw= PlusSign )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinus) ) {
                alt15=1;
            }
            else if ( (LA15_0==PlusSign) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalMwe2Parser.g:893:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntValueAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:899:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntValueAccess().getPlusSignKeyword_0_1());
                    			

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIntValueAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMwe2Parser.g:916:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalMwe2Parser.g:916:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:917:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMwe2Parser.g:923:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:929:2: ( ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalMwe2Parser.g:930:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalMwe2Parser.g:930:2: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            // InternalMwe2Parser.g:931:3: () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            {
            // InternalMwe2Parser.g:931:3: ()
            // InternalMwe2Parser.g:932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalMwe2Parser.g:938:3: ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==True) ) {
                alt16=1;
            }
            else if ( (LA16_0==False) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMwe2Parser.g:939:4: ( (lv_isTrue_1_0= True ) )
                    {
                    // InternalMwe2Parser.g:939:4: ( (lv_isTrue_1_0= True ) )
                    // InternalMwe2Parser.g:940:5: (lv_isTrue_1_0= True )
                    {
                    // InternalMwe2Parser.g:940:5: (lv_isTrue_1_0= True )
                    // InternalMwe2Parser.g:941:6: lv_isTrue_1_0= True
                    {
                    lv_isTrue_1_0=(Token)match(input,True,FOLLOW_2); 

                    						newLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "isTrue", lv_isTrue_1_0 != null, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:954:4: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleReference"
    // InternalMwe2Parser.g:963:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMwe2Parser.g:963:50: (iv_ruleReference= ruleReference EOF )
            // InternalMwe2Parser.g:964:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMwe2Parser.g:970:1: ruleReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:976:2: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:977:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:977:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:978:3: ( ruleFQN )
            {
            // InternalMwe2Parser.g:978:3: ( ruleFQN )
            // InternalMwe2Parser.g:979:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFQN"
    // InternalMwe2Parser.g:996:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalMwe2Parser.g:996:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalMwe2Parser.g:997:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMwe2Parser.g:1003:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:1009:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalMwe2Parser.g:1010:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalMwe2Parser.g:1010:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalMwe2Parser.g:1011:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalMwe2Parser.g:1018:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==FullStop) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMwe2Parser.g:1019:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMwe2Parser.g:1036:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:1038:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMwe2Parser.g:1039:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMwe2Parser.g:1048:1: ruleStringLiteral returns [EObject current=null] : ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_begin_0_0=null;
        Token lv_end_4_0=null;
        Token lv_begin_5_0=null;
        Token lv_end_9_0=null;
        EObject lv_parts_1_0 = null;

        EObject lv_parts_2_0 = null;

        EObject lv_parts_3_0 = null;

        EObject lv_parts_6_0 = null;

        EObject lv_parts_7_0 = null;

        EObject lv_parts_8_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:1055:2: ( ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) ) )
            // InternalMwe2Parser.g:1056:2: ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) )
            {
            // InternalMwe2Parser.g:1056:2: ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Apostrophe) ) {
                alt24=1;
            }
            else if ( (LA24_0==QuotationMark) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMwe2Parser.g:1057:3: ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) )
                    {
                    // InternalMwe2Parser.g:1057:3: ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) )
                    // InternalMwe2Parser.g:1058:4: ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) )
                    {
                    // InternalMwe2Parser.g:1058:4: ( (lv_begin_0_0= Apostrophe ) )
                    // InternalMwe2Parser.g:1059:5: (lv_begin_0_0= Apostrophe )
                    {
                    // InternalMwe2Parser.g:1059:5: (lv_begin_0_0= Apostrophe )
                    // InternalMwe2Parser.g:1060:6: lv_begin_0_0= Apostrophe
                    {
                    lv_begin_0_0=(Token)match(input,Apostrophe,FOLLOW_16); 

                    						newLeafNode(lv_begin_0_0, grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringLiteralRule());
                    						}
                    						setWithLastConsumed(current, "begin", lv_begin_0_0, "\'");
                    					

                    }


                    }

                    // InternalMwe2Parser.g:1072:4: ( (lv_parts_1_0= rulePlainString ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA18_0>=ReverseSolidusQuotationMark && LA18_0<=ReverseSolidusReverseSolidus)||LA18_0==RULE_ID||(LA18_0>=RULE_WS && LA18_0<=RULE_ANY_OTHER)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMwe2Parser.g:1073:5: (lv_parts_1_0= rulePlainString )
                            {
                            // InternalMwe2Parser.g:1073:5: (lv_parts_1_0= rulePlainString )
                            // InternalMwe2Parser.g:1074:6: lv_parts_1_0= rulePlainString
                            {

                            						newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_17);
                            lv_parts_1_0=rulePlainString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                            						}
                            						add(
                            							current,
                            							"parts",
                            							lv_parts_1_0,
                            							"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalMwe2Parser.g:1091:4: ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==DollarSignLeftCurlyBracket) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMwe2Parser.g:1092:5: ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )?
                    	    {
                    	    // InternalMwe2Parser.g:1092:5: ( (lv_parts_2_0= rulePropertyReference ) )
                    	    // InternalMwe2Parser.g:1093:6: (lv_parts_2_0= rulePropertyReference )
                    	    {
                    	    // InternalMwe2Parser.g:1093:6: (lv_parts_2_0= rulePropertyReference )
                    	    // InternalMwe2Parser.g:1094:7: lv_parts_2_0= rulePropertyReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parts_2_0=rulePropertyReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_2_0,
                    	    								"org.eclipse.emf.mwe2.language.Mwe2.PropertyReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMwe2Parser.g:1111:5: ( (lv_parts_3_0= rulePlainString ) )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA19_0>=ReverseSolidusQuotationMark && LA19_0<=ReverseSolidusReverseSolidus)||LA19_0==RULE_ID||(LA19_0>=RULE_WS && LA19_0<=RULE_ANY_OTHER)) ) {
                    	        alt19=1;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // InternalMwe2Parser.g:1112:6: (lv_parts_3_0= rulePlainString )
                    	            {
                    	            // InternalMwe2Parser.g:1112:6: (lv_parts_3_0= rulePlainString )
                    	            // InternalMwe2Parser.g:1113:7: lv_parts_3_0= rulePlainString
                    	            {

                    	            							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0());
                    	            						
                    	            pushFollow(FOLLOW_17);
                    	            lv_parts_3_0=rulePlainString();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"parts",
                    	            								lv_parts_3_0,
                    	            								"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // InternalMwe2Parser.g:1131:4: ( (lv_end_4_0= Apostrophe ) )
                    // InternalMwe2Parser.g:1132:5: (lv_end_4_0= Apostrophe )
                    {
                    // InternalMwe2Parser.g:1132:5: (lv_end_4_0= Apostrophe )
                    // InternalMwe2Parser.g:1133:6: lv_end_4_0= Apostrophe
                    {
                    lv_end_4_0=(Token)match(input,Apostrophe,FOLLOW_2); 

                    						newLeafNode(lv_end_4_0, grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringLiteralRule());
                    						}
                    						setWithLastConsumed(current, "end", lv_end_4_0, "\'");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMwe2Parser.g:1147:3: ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) )
                    {
                    // InternalMwe2Parser.g:1147:3: ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) )
                    // InternalMwe2Parser.g:1148:4: ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) )
                    {
                    // InternalMwe2Parser.g:1148:4: ( (lv_begin_5_0= QuotationMark ) )
                    // InternalMwe2Parser.g:1149:5: (lv_begin_5_0= QuotationMark )
                    {
                    // InternalMwe2Parser.g:1149:5: (lv_begin_5_0= QuotationMark )
                    // InternalMwe2Parser.g:1150:6: lv_begin_5_0= QuotationMark
                    {
                    lv_begin_5_0=(Token)match(input,QuotationMark,FOLLOW_18); 

                    						newLeafNode(lv_begin_5_0, grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringLiteralRule());
                    						}
                    						setWithLastConsumed(current, "begin", lv_begin_5_0, "\"");
                    					

                    }


                    }

                    // InternalMwe2Parser.g:1162:4: ( (lv_parts_6_0= rulePlainString ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA21_0>=ReverseSolidusQuotationMark && LA21_0<=ReverseSolidusReverseSolidus)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMwe2Parser.g:1163:5: (lv_parts_6_0= rulePlainString )
                            {
                            // InternalMwe2Parser.g:1163:5: (lv_parts_6_0= rulePlainString )
                            // InternalMwe2Parser.g:1164:6: lv_parts_6_0= rulePlainString
                            {

                            						newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_parts_6_0=rulePlainString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                            						}
                            						add(
                            							current,
                            							"parts",
                            							lv_parts_6_0,
                            							"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalMwe2Parser.g:1181:4: ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==DollarSignLeftCurlyBracket) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMwe2Parser.g:1182:5: ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )?
                    	    {
                    	    // InternalMwe2Parser.g:1182:5: ( (lv_parts_7_0= rulePropertyReference ) )
                    	    // InternalMwe2Parser.g:1183:6: (lv_parts_7_0= rulePropertyReference )
                    	    {
                    	    // InternalMwe2Parser.g:1183:6: (lv_parts_7_0= rulePropertyReference )
                    	    // InternalMwe2Parser.g:1184:7: lv_parts_7_0= rulePropertyReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parts_7_0=rulePropertyReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"org.eclipse.emf.mwe2.language.Mwe2.PropertyReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMwe2Parser.g:1201:5: ( (lv_parts_8_0= rulePlainString ) )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA22_0>=ReverseSolidusQuotationMark && LA22_0<=ReverseSolidusReverseSolidus)||LA22_0==RULE_ID||(LA22_0>=RULE_WS && LA22_0<=RULE_ANY_OTHER)) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalMwe2Parser.g:1202:6: (lv_parts_8_0= rulePlainString )
                    	            {
                    	            // InternalMwe2Parser.g:1202:6: (lv_parts_8_0= rulePlainString )
                    	            // InternalMwe2Parser.g:1203:7: lv_parts_8_0= rulePlainString
                    	            {

                    	            							newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0());
                    	            						
                    	            pushFollow(FOLLOW_19);
                    	            lv_parts_8_0=rulePlainString();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"parts",
                    	            								lv_parts_8_0,
                    	            								"org.eclipse.emf.mwe2.language.Mwe2.PlainString");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // InternalMwe2Parser.g:1221:4: ( (lv_end_9_0= QuotationMark ) )
                    // InternalMwe2Parser.g:1222:5: (lv_end_9_0= QuotationMark )
                    {
                    // InternalMwe2Parser.g:1222:5: (lv_end_9_0= QuotationMark )
                    // InternalMwe2Parser.g:1223:6: lv_end_9_0= QuotationMark
                    {
                    lv_end_9_0=(Token)match(input,QuotationMark,FOLLOW_2); 

                    						newLeafNode(lv_end_9_0, grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringLiteralRule());
                    						}
                    						setWithLastConsumed(current, "end", lv_end_9_0, "\"");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePropertyReference"
    // InternalMwe2Parser.g:1243:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:1245:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalMwe2Parser.g:1246:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalMwe2Parser.g:1255:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PropertyReferenceImpl_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMwe2Parser.g:1262:2: ( (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket ) )
            // InternalMwe2Parser.g:1263:2: (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1263:2: (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket )
            // InternalMwe2Parser.g:1264:3: otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,DollarSignLeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            this_PropertyReferenceImpl_1=rulePropertyReferenceImpl();

            state._fsp--;


            			current = this_PropertyReferenceImpl_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRulePropertyReferenceImpl"
    // InternalMwe2Parser.g:1287:1: entryRulePropertyReferenceImpl returns [EObject current=null] : iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF ;
    public final EObject entryRulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceImpl = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:1289:2: (iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:1290:2: iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyReferenceImpl=rulePropertyReferenceImpl();

            state._fsp--;

             current =iv_rulePropertyReferenceImpl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePropertyReferenceImpl"


    // $ANTLR start "rulePropertyReferenceImpl"
    // InternalMwe2Parser.g:1299:1: rulePropertyReferenceImpl returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalMwe2Parser.g:1306:2: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:1307:2: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:1307:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:1308:3: ( ruleFQN )
            {
            // InternalMwe2Parser.g:1308:3: ( ruleFQN )
            // InternalMwe2Parser.g:1309:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPropertyReferenceImplRule());
            				}
            			

            				newCompositeNode(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePropertyReferenceImpl"


    // $ANTLR start "entryRulePlainString"
    // InternalMwe2Parser.g:1329:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // InternalMwe2Parser.g:1329:52: (iv_rulePlainString= rulePlainString EOF )
            // InternalMwe2Parser.g:1330:2: iv_rulePlainString= rulePlainString EOF
            {
             newCompositeNode(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainString=rulePlainString();

            state._fsp--;

             current =iv_rulePlainString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainString"


    // $ANTLR start "rulePlainString"
    // InternalMwe2Parser.g:1336:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMwe2Parser.g:1342:2: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // InternalMwe2Parser.g:1343:2: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // InternalMwe2Parser.g:1343:2: ( (lv_value_0_0= ruleConstantValue ) )
            // InternalMwe2Parser.g:1344:3: (lv_value_0_0= ruleConstantValue )
            {
            // InternalMwe2Parser.g:1344:3: (lv_value_0_0= ruleConstantValue )
            // InternalMwe2Parser.g:1345:4: lv_value_0_0= ruleConstantValue
            {

            				newCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleConstantValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPlainStringRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.emf.mwe2.language.Mwe2.ConstantValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainString"


    // $ANTLR start "entryRuleConstantValue"
    // InternalMwe2Parser.g:1365:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // InternalMwe2Parser.g:1365:53: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalMwe2Parser.g:1366:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalMwe2Parser.g:1372:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+ ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMwe2Parser.g:1378:2: ( (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+ )
            // InternalMwe2Parser.g:1379:2: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+
            {
            // InternalMwe2Parser.g:1379:2: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+
            int cnt25=0;
            loop25:
            do {
                int alt25=8;
                switch ( input.LA(1) ) {
                case RULE_WS:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt25=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt25=3;
                    }
                    break;
                case ReverseSolidusApostrophe:
                    {
                    alt25=4;
                    }
                    break;
                case ReverseSolidusQuotationMark:
                    {
                    alt25=5;
                    }
                    break;
                case ReverseSolidusDollarSignLeftCurlyBracket:
                    {
                    alt25=6;
                    }
                    break;
                case ReverseSolidusReverseSolidus:
                    {
                    alt25=7;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalMwe2Parser.g:1380:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_21); 

            	    			current.merge(this_WS_0);
            	    		

            	    			newLeafNode(this_WS_0, grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalMwe2Parser.g:1388:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_21); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalMwe2Parser.g:1396:3: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    			current.merge(this_ID_2);
            	    		

            	    			newLeafNode(this_ID_2, grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalMwe2Parser.g:1404:3: kw= ReverseSolidusApostrophe
            	    {
            	    kw=(Token)match(input,ReverseSolidusApostrophe,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalMwe2Parser.g:1410:3: kw= ReverseSolidusQuotationMark
            	    {
            	    kw=(Token)match(input,ReverseSolidusQuotationMark,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalMwe2Parser.g:1416:3: kw= ReverseSolidusDollarSignLeftCurlyBracket
            	    {
            	    kw=(Token)match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalMwe2Parser.g:1422:3: kw= ReverseSolidusReverseSolidus
            	    {
            	    kw=(Token)match(input,ReverseSolidusReverseSolidus,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\7\1\3\2\uffff\1\7";
    static final String dfa_3s = "\1\33\1\13\1\33\1\uffff\1\4\1\13\1\33\1\uffff\1\4";
    static final String dfa_4s = "\3\33\1\uffff\3\33\1\uffff\1\33";
    static final String dfa_5s = "\3\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "187:3: ( ( ruleFQN ) )?";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\uffff\1\12\5\uffff\1\13\5\uffff\1\12";
    static final String dfa_10s = "\2\4\3\uffff\2\34\1\13\1\uffff\1\33\3\uffff\1\4";
    static final String dfa_11s = "\1\34\1\33\3\uffff\2\34\1\33\1\uffff\1\33\3\uffff\1\33";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\3\3\uffff\1\6\1\uffff\1\7\1\4\1\5\1\uffff";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\2\uffff\1\4\1\10\1\4\7\uffff\2\3\1\6\1\5\1\uffff\1\2\1\uffff\2\2\1\uffff\1\1\1\7",
            "\1\2\6\uffff\1\12\11\uffff\1\11\1\2\1\uffff\1\12\1\2\2\12",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\13\11\uffff\1\14\2\uffff\1\13\1\uffff\2\13",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\2\6\uffff\1\12\11\uffff\1\11\1\2\1\uffff\1\12\1\2\2\12"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "667:2: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_DoubleLiteral_4= ruleDoubleLiteral | this_NullLiteral_5= ruleNullLiteral | this_Reference_6= ruleReference )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000009000820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001B5E0390L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002400010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000018805D400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000018803D400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000018801C402L});

}