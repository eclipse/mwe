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

@SuppressWarnings("all")
public class InternalMwe2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_20", "KEYWORD_18", "KEYWORD_19", "KEYWORD_17", "KEYWORD_16", "KEYWORD_14", "KEYWORD_15", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int KEYWORD_7=22;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_ID=24;
    public static final int KEYWORD_17=7;
    public static final int KEYWORD_10=12;
    public static final int KEYWORD_1=16;
    public static final int KEYWORD_18=5;
    public static final int KEYWORD_19=6;
    public static final int KEYWORD_9=11;
    public static final int KEYWORD_2=17;
    public static final int KEYWORD_16=8;
    public static final int KEYWORD_11=13;
    public static final int KEYWORD_4=19;
    public static final int RULE_WS=27;
    public static final int KEYWORD_20=4;
    public static final int KEYWORD_13=15;
    public static final int EOF=-1;
    public static final int KEYWORD_14=9;
    public static final int KEYWORD_5=20;
    public static final int KEYWORD_6=21;
    public static final int RULE_ANY_OTHER=28;
    public static final int KEYWORD_12=14;
    public static final int KEYWORD_15=10;
    public static final int RULE_SL_COMMENT=26;
    public static final int KEYWORD_8=23;
    public static final int KEYWORD_3=18;

    // delegates
    // delegators


        public InternalMwe2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMwe2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMwe2Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g"; }




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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:61:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:62:2: (iv_ruleModule= ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:63:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule67);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule77); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:70:1: ruleModule returns [EObject current=null] : ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_declaredProperties_4_0 = null;

        EObject lv_root_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:73:28: ( ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:74:1: ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:74:1: ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:74:2: () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:74:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:75:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleModule124); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:85:1: ( (lv_canonicalName_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:86:1: (lv_canonicalName_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:86:1: (lv_canonicalName_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:87:3: lv_canonicalName_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModule145);
            lv_canonicalName_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"canonicalName",
                    		lv_canonicalName_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:103:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:104:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:104:1: (lv_imports_3_0= ruleImport )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:105:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule166);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:121:3: ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:122:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:122:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:123:3: lv_declaredProperties_4_0= ruleDeclaredProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredProperty_in_ruleModule188);
            	    lv_declaredProperties_4_0=ruleDeclaredProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredProperties",
            	            		lv_declaredProperties_4_0, 
            	            		"DeclaredProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:139:3: ( (lv_root_5_0= ruleRootComponent ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:140:1: (lv_root_5_0= ruleRootComponent )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:140:1: (lv_root_5_0= ruleRootComponent )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:141:3: lv_root_5_0= ruleRootComponent
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRootComponent_in_ruleModule210);
            lv_root_5_0=ruleRootComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_5_0, 
                    		"RootComponent");
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:165:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:166:2: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:167:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
            {
             newCompositeNode(grammarAccess.getDeclaredPropertyRule()); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty245);
            iv_ruleDeclaredProperty=ruleDeclaredProperty();

            state._fsp--;

             current =iv_ruleDeclaredProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredProperty255); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:174:1: ruleDeclaredProperty returns [EObject current=null] : (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:177:28: ( (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:178:1: (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:178:1: (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:179:2: otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleDeclaredProperty293); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:183:1: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:184:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:184:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:185:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclaredPropertyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty316);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:198:3: ( (lv_name_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:199:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:199:1: (lv_name_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:200:3: lv_name_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty338);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:216:2: (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_5) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:217:2: otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleDeclaredProperty352); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0());
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:221:1: ( (lv_default_4_0= ruleValue ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:222:1: (lv_default_4_0= ruleValue )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:222:1: (lv_default_4_0= ruleValue )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:223:3: lv_default_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleDeclaredProperty373);
                    lv_default_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclaredPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_4_0, 
                            		"Value");
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:247:1: entryRuleRootComponent returns [EObject current=null] : iv_ruleRootComponent= ruleRootComponent EOF ;
    public final EObject entryRuleRootComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:248:2: (iv_ruleRootComponent= ruleRootComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:249:2: iv_ruleRootComponent= ruleRootComponent EOF
            {
             newCompositeNode(grammarAccess.getRootComponentRule()); 
            pushFollow(FOLLOW_ruleRootComponent_in_entryRuleRootComponent410);
            iv_ruleRootComponent=ruleRootComponent();

            state._fsp--;

             current =iv_ruleRootComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootComponent420); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:256:1: ruleRootComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) ;
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
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:259:28: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:260:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:260:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:260:2: () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:260:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:261:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootComponentAccess().getComponentAction_0(),
                        current);
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:266:2: ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_6) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:266:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:266:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:267:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:267:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:268:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRootComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent478);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:282:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:282:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:283:2: otherlv_2= KEYWORD_6 ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleRootComponent498); 

                        	newLeafNode(otherlv_2, grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0());
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:287:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:288:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:288:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:289:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRootComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent521);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:302:4: (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_4) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:303:2: otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleRootComponent537); 

                        	newLeafNode(otherlv_4, grammarAccess.getRootComponentAccess().getColonKeyword_2_0());
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:307:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:308:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:308:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:309:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent558);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRootComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:325:4: ( (lv_autoInject_6_0= KEYWORD_20 ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:326:1: (lv_autoInject_6_0= KEYWORD_20 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:326:1: (lv_autoInject_6_0= KEYWORD_20 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:327:3: lv_autoInject_6_0= KEYWORD_20
                    {
                    lv_autoInject_6_0=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleRootComponent579); 

                            newLeafNode(lv_autoInject_6_0, grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRootComponentRule());
                    	        }
                           		setWithLastConsumed(current, "autoInject", true, "auto-inject");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleRootComponent606); 

                	newLeafNode(otherlv_7, grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:346:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:347:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:347:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:348:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleRootComponent627);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignment",
            	            		lv_assignment_8_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleRootComponent641); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:377:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:378:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:379:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent676);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent686); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:386:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) ;
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
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:389:28: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:390:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:390:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:390:2: () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:390:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:391:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentAccess().getComponentAction_0(),
                        current);
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:396:2: ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==KEYWORD_6) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:396:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:396:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:397:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:397:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:398:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent744);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:412:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:412:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:413:2: otherlv_2= KEYWORD_6 ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponent764); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0());
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:417:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:418:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:418:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:419:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent787);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:432:5: (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_4) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:433:2: otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleComponent804); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_2_0());
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:437:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:438:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:438:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:439:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent825);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:455:4: ( (lv_autoInject_6_0= KEYWORD_20 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:456:1: (lv_autoInject_6_0= KEYWORD_20 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:456:1: (lv_autoInject_6_0= KEYWORD_20 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:457:3: lv_autoInject_6_0= KEYWORD_20
                    {
                    lv_autoInject_6_0=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComponent846); 

                            newLeafNode(lv_autoInject_6_0, grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                           		setWithLastConsumed(current, "autoInject", true, "auto-inject");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleComponent873); 

                	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:476:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:477:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:477:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:478:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponent894);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignment",
            	            		lv_assignment_8_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleComponent908); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:507:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:508:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:509:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport943);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport953); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:516:1: ruleImport returns [EObject current=null] : (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:519:28: ( (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:520:1: (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:520:1: (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:521:2: otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleImport991); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:525:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:526:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:526:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:527:3: lv_importedNamespace_1_0= ruleImportedFQN
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImportedFQN_in_ruleImport1012);
            lv_importedNamespace_1_0=ruleImportedFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"ImportedFQN");
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:551:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:552:1: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:553:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             newCompositeNode(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN1048);
            iv_ruleImportedFQN=ruleImportedFQN();

            state._fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN1059); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:560:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:564:6: ( (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:565:1: (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:565:1: (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:566:5: this_FQN_0= ruleFQN (kw= KEYWORD_10 )?
            {
             
                    newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleImportedFQN1106);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:576:1: (kw= KEYWORD_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_10) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:577:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleImportedFQN1125); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:590:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:591:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:592:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1166);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1176); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:599:1: ruleAssignment returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:602:28: ( ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:603:1: ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:603:1: ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:603:2: ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:603:2: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:604:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:604:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:605:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifyableElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssignment1224);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleAssignment1237); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:623:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:624:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:624:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:625:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1258);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:649:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:650:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:651:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1293);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1303); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:658:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_Reference_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:661:28: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:662:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:662:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:663:5: this_Component_0= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleValue1350);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                            current = this_Component_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:673:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue1377);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                            current = this_StringLiteral_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:683:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue1404);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                            current = this_BooleanLiteral_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:693:5: this_Reference_3= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1431);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                            current = this_Reference_3;
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:709:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:710:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:711:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1465);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1475); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:718:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:721:28: ( ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:722:1: ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:722:1: ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:722:2: () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:722:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:723:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:728:2: ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_16) ) {
                alt15=1;
            }
            else if ( (LA15_0==KEYWORD_17) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:728:3: ( (lv_isTrue_1_0= KEYWORD_16 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:728:3: ( (lv_isTrue_1_0= KEYWORD_16 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:729:1: (lv_isTrue_1_0= KEYWORD_16 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:729:1: (lv_isTrue_1_0= KEYWORD_16 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:730:3: lv_isTrue_1_0= KEYWORD_16
                    {
                    lv_isTrue_1_0=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleBooleanLiteral1529); 

                            newLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "isTrue", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:746:2: otherlv_2= KEYWORD_17
                    {
                    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleBooleanLiteral1561); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:758:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:759:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:760:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1597);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1607); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:767:1: ruleReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:770:28: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:771:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:771:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:772:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:772:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:773:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleReference1654);
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:794:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:795:1: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:796:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1689);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1700); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:803:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:807:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:808:1: (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:808:1: (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:808:6: this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1740); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:815:1: (kw= KEYWORD_3 this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_3) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:816:2: kw= KEYWORD_3 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFQN1759); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1774); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:836:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:840:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:841:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1826);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1836); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:851:1: ruleStringLiteral returns [EObject current=null] : ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) ) ;
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
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:855:28: ( ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:1: ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:1: ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_2) ) {
                alt23=1;
            }
            else if ( (LA23_0==KEYWORD_1) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:2: ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:2: ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:3: ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:856:3: ( (lv_begin_0_0= KEYWORD_2 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:857:1: (lv_begin_0_0= KEYWORD_2 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:857:1: (lv_begin_0_0= KEYWORD_2 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:858:3: lv_begin_0_0= KEYWORD_2
                    {
                    lv_begin_0_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringLiteral1885); 

                            newLeafNode(lv_begin_0_0, grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "begin", lv_begin_0_0, "\'");
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:872:2: ( (lv_parts_1_0= rulePlainString ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KEYWORD_14||(LA17_0>=KEYWORD_11 && LA17_0<=KEYWORD_13)||LA17_0==RULE_ID||(LA17_0>=RULE_WS && LA17_0<=RULE_ANY_OTHER)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:873:1: (lv_parts_1_0= rulePlainString )
                            {
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:873:1: (lv_parts_1_0= rulePlainString )
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:874:3: lv_parts_1_0= rulePlainString
                            {
                             
                            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral1919);
                            lv_parts_1_0=rulePlainString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parts",
                                    		lv_parts_1_0, 
                                    		"PlainString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:890:3: ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==KEYWORD_9) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:890:4: ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )?
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:890:4: ( (lv_parts_2_0= rulePropertyReference ) )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:891:1: (lv_parts_2_0= rulePropertyReference )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:891:1: (lv_parts_2_0= rulePropertyReference )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:892:3: lv_parts_2_0= rulePropertyReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyReference_in_ruleStringLiteral1942);
                    	    lv_parts_2_0=rulePropertyReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parts",
                    	            		lv_parts_2_0, 
                    	            		"PropertyReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:908:2: ( (lv_parts_3_0= rulePlainString ) )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==KEYWORD_14||(LA18_0>=KEYWORD_11 && LA18_0<=KEYWORD_13)||LA18_0==RULE_ID||(LA18_0>=RULE_WS && LA18_0<=RULE_ANY_OTHER)) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:909:1: (lv_parts_3_0= rulePlainString )
                    	            {
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:909:1: (lv_parts_3_0= rulePlainString )
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:910:3: lv_parts_3_0= rulePlainString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral1963);
                    	            lv_parts_3_0=rulePlainString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"parts",
                    	                    		lv_parts_3_0, 
                    	                    		"PlainString");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:926:5: ( (lv_end_4_0= KEYWORD_2 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:927:1: (lv_end_4_0= KEYWORD_2 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:927:1: (lv_end_4_0= KEYWORD_2 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:928:3: lv_end_4_0= KEYWORD_2
                    {
                    lv_end_4_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringLiteral1985); 

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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:943:6: ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:943:6: ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:943:7: ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:943:7: ( (lv_begin_5_0= KEYWORD_1 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:944:1: (lv_begin_5_0= KEYWORD_1 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:944:1: (lv_begin_5_0= KEYWORD_1 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:945:3: lv_begin_5_0= KEYWORD_1
                    {
                    lv_begin_5_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringLiteral2025); 

                            newLeafNode(lv_begin_5_0, grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "begin", lv_begin_5_0, "\"");
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:959:2: ( (lv_parts_6_0= rulePlainString ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_14||(LA20_0>=KEYWORD_11 && LA20_0<=KEYWORD_13)||LA20_0==RULE_ID||(LA20_0>=RULE_WS && LA20_0<=RULE_ANY_OTHER)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:960:1: (lv_parts_6_0= rulePlainString )
                            {
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:960:1: (lv_parts_6_0= rulePlainString )
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:961:3: lv_parts_6_0= rulePlainString
                            {
                             
                            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral2059);
                            lv_parts_6_0=rulePlainString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parts",
                                    		lv_parts_6_0, 
                                    		"PlainString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:977:3: ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==KEYWORD_9) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:977:4: ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )?
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:977:4: ( (lv_parts_7_0= rulePropertyReference ) )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:978:1: (lv_parts_7_0= rulePropertyReference )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:978:1: (lv_parts_7_0= rulePropertyReference )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:979:3: lv_parts_7_0= rulePropertyReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyReference_in_ruleStringLiteral2082);
                    	    lv_parts_7_0=rulePropertyReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parts",
                    	            		lv_parts_7_0, 
                    	            		"PropertyReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:995:2: ( (lv_parts_8_0= rulePlainString ) )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==KEYWORD_14||(LA21_0>=KEYWORD_11 && LA21_0<=KEYWORD_13)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:996:1: (lv_parts_8_0= rulePlainString )
                    	            {
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:996:1: (lv_parts_8_0= rulePlainString )
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:997:3: lv_parts_8_0= rulePlainString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral2103);
                    	            lv_parts_8_0=rulePlainString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getStringLiteralRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"parts",
                    	                    		lv_parts_8_0, 
                    	                    		"PlainString");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1013:5: ( (lv_end_9_0= KEYWORD_1 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1014:1: (lv_end_9_0= KEYWORD_1 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1014:1: (lv_end_9_0= KEYWORD_1 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1015:3: lv_end_9_0= KEYWORD_1
                    {
                    lv_end_9_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringLiteral2125); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1040:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1044:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1045:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference2184);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference2194); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1055:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PropertyReferenceImpl_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1059:28: ( (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1060:1: (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1060:1: (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1061:2: otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePropertyReference2236); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePropertyReferenceImpl_in_rulePropertyReference2258);
            this_PropertyReferenceImpl_1=rulePropertyReferenceImpl();

            state._fsp--;


                    current = this_PropertyReferenceImpl_1;
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePropertyReference2270); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1090:1: entryRulePropertyReferenceImpl returns [EObject current=null] : iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF ;
    public final EObject entryRulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceImpl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1094:2: (iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1095:2: iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceImplRule()); 
            pushFollow(FOLLOW_rulePropertyReferenceImpl_in_entryRulePropertyReferenceImpl2315);
            iv_rulePropertyReferenceImpl=rulePropertyReferenceImpl();

            state._fsp--;

             current =iv_rulePropertyReferenceImpl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReferenceImpl2325); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1105:1: rulePropertyReferenceImpl returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1109:28: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1110:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1110:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1111:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1111:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1112:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyReferenceImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePropertyReferenceImpl2376);
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1136:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1137:2: (iv_rulePlainString= rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1138:2: iv_rulePlainString= rulePlainString EOF
            {
             newCompositeNode(grammarAccess.getPlainStringRule()); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString2414);
            iv_rulePlainString=rulePlainString();

            state._fsp--;

             current =iv_rulePlainString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString2424); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1145:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1148:28: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1149:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1149:1: ( (lv_value_0_0= ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1150:1: (lv_value_0_0= ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1150:1: (lv_value_0_0= ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1151:3: lv_value_0_0= ruleConstantValue
            {
             
            	        newCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_rulePlainString2469);
            lv_value_0_0=ruleConstantValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlainStringRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ConstantValue");
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1175:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1176:1: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1177:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue2504);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue2515); 

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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1184:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+ ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1188:6: ( (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+ )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1189:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1189:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+
            int cnt24=0;
            loop24:
            do {
                int alt24=8;
                switch ( input.LA(1) ) {
                case RULE_WS:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt24=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt24=3;
                    }
                    break;
                case KEYWORD_12:
                    {
                    alt24=4;
                    }
                    break;
                case KEYWORD_11:
                    {
                    alt24=5;
                    }
                    break;
                case KEYWORD_14:
                    {
                    alt24=6;
                    }
                    break;
                case KEYWORD_13:
                    {
                    alt24=7;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1189:6: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConstantValue2555); 

            	    		current.merge(this_WS_0);
            	        
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1197:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2581); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1205:10: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantValue2607); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1214:2: kw= KEYWORD_12
            	    {
            	    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleConstantValue2631); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1221:2: kw= KEYWORD_11
            	    {
            	    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleConstantValue2650); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1228:2: kw= KEYWORD_14
            	    {
            	    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleConstantValue2669); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1235:2: kw= KEYWORD_13
            	    {
            	    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleConstantValue2688); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    static final String DFA3_eotS =
        "\11\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\3\2\uffff\1\7\1\3\2\uffff\1\7";
    static final String DFA3_minS =
        "\1\30\1\12\1\30\1\uffff\1\4\1\12\1\30\1\uffff\1\4";
    static final String DFA3_maxS =
        "\3\30\1\uffff\3\30\1\uffff\1\30";
    static final String DFA3_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String DFA3_specialS =
        "\11\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\7\uffff\1\2\1\uffff\2\3\2\uffff\1\4",
            "\1\5",
            "",
            "\1\3\5\uffff\1\7\7\uffff\1\6\1\3\2\7\1\3\1\uffff\1\7",
            "\1\3\7\uffff\1\2\1\uffff\2\3\2\uffff\1\4",
            "\1\10",
            "",
            "\1\3\5\uffff\1\7\7\uffff\1\6\1\3\2\7\1\3\1\uffff\1\7"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "183:1: ( ( ruleFQN ) )?";
        }
    }
    static final String DFA14_eotS =
        "\10\uffff";
    static final String DFA14_eofS =
        "\1\uffff\1\6\5\uffff\1\6";
    static final String DFA14_minS =
        "\2\4\3\uffff\1\30\1\uffff\1\4";
    static final String DFA14_maxS =
        "\2\30\3\uffff\1\30\1\uffff\1\30";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\uffff\1\4\1\uffff";
    static final String DFA14_specialS =
        "\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\2\uffff\2\4\7\uffff\2\3\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\1",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "662:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleModule124 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModule145 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule166 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_ruleModule188 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_ruleRootComponent_in_ruleModule210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredProperty255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleDeclaredProperty293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty338 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleDeclaredProperty352 = new BitSet(new long[]{0x00000000016B0190L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDeclaredProperty373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootComponent_in_entryRuleRootComponent410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootComponent420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent478 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleRootComponent498 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent521 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleRootComponent537 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleRootComponent558 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleRootComponent579 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleRootComponent606 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleRootComponent627 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRootComponent641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent744 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComponent764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent787 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleComponent804 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent825 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComponent846 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleComponent873 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComponent894 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleComponent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleImport991 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_ruleImport1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN1048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportedFQN1106 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleImportedFQN1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssignment1224 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleAssignment1237 = new BitSet(new long[]{0x00000000016B0190L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleValue1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleBooleanLiteral1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleBooleanLiteral1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleReference1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1740 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFQN1759 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1774 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringLiteral1885 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleStringLiteral1919 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleStringLiteral1942 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleStringLiteral1963 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringLiteral1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringLiteral2025 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleStringLiteral2059 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleStringLiteral2082 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleStringLiteral2103 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringLiteral2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePropertyReference2236 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePropertyReferenceImpl_in_rulePropertyReference2258 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulePropertyReference2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceImpl_in_entryRulePropertyReferenceImpl2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReferenceImpl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePropertyReferenceImpl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString2414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rulePlainString2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConstantValue2555 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2581 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantValue2607 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleConstantValue2631 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleConstantValue2650 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleConstantValue2669 = new BitSet(new long[]{0x000000001900E202L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleConstantValue2688 = new BitSet(new long[]{0x000000001900E202L});

}