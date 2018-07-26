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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AutoInject", "Import", "Module", "False", "True", "ReverseSolidusDollarSignLeftCurlyBracket", "Var", "DollarSignLeftCurlyBracket", "FullStopAsterisk", "ReverseSolidusQuotationMark", "ReverseSolidusApostrophe", "ReverseSolidusReverseSolidus", "QuotationMark", "Apostrophe", "FullStop", "Colon", "EqualsSign", "CommercialAt", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Import=5;
    public static final int DollarSignLeftCurlyBracket=11;
    public static final int ReverseSolidusReverseSolidus=15;
    public static final int Var=10;
    public static final int True=8;
    public static final int ReverseSolidusApostrophe=14;
    public static final int False=7;
    public static final int QuotationMark=16;
    public static final int RULE_SL_COMMENT=26;
    public static final int EqualsSign=20;
    public static final int AutoInject=4;
    public static final int Colon=19;
    public static final int RightCurlyBracket=23;
    public static final int EOF=-1;
    public static final int Apostrophe=17;
    public static final int FullStop=18;
    public static final int RULE_ID=24;
    public static final int RULE_WS=27;
    public static final int LeftCurlyBracket=22;
    public static final int RULE_ANY_OTHER=28;
    public static final int CommercialAt=21;
    public static final int ReverseSolidusQuotationMark=13;
    public static final int FullStopAsterisk=12;
    public static final int RULE_ML_COMMENT=25;
    public static final int ReverseSolidusDollarSignLeftCurlyBracket=9;
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
    // InternalMwe2Parser.g:61:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMwe2Parser.g:62:2: (iv_ruleModule= ruleModule EOF )
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
    // InternalMwe2Parser.g:70:1: ruleModule returns [EObject current=null] : ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_declaredProperties_4_0 = null;

        EObject lv_root_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:73:28: ( ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) )
            // InternalMwe2Parser.g:74:1: ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            {
            // InternalMwe2Parser.g:74:1: ( () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            // InternalMwe2Parser.g:74:2: () otherlv_1= Module ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) )
            {
            // InternalMwe2Parser.g:74:2: ()
            // InternalMwe2Parser.g:75:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Module,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // InternalMwe2Parser.g:85:1: ( (lv_canonicalName_2_0= ruleFQN ) )
            // InternalMwe2Parser.g:86:1: (lv_canonicalName_2_0= ruleFQN )
            {
            // InternalMwe2Parser.g:86:1: (lv_canonicalName_2_0= ruleFQN )
            // InternalMwe2Parser.g:87:3: lv_canonicalName_2_0= ruleFQN
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

            // InternalMwe2Parser.g:103:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMwe2Parser.g:104:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalMwe2Parser.g:104:1: (lv_imports_3_0= ruleImport )
            	    // InternalMwe2Parser.g:105:3: lv_imports_3_0= ruleImport
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

            // InternalMwe2Parser.g:121:3: ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Var) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMwe2Parser.g:122:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    {
            	    // InternalMwe2Parser.g:122:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    // InternalMwe2Parser.g:123:3: lv_declaredProperties_4_0= ruleDeclaredProperty
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

            // InternalMwe2Parser.g:139:3: ( (lv_root_5_0= ruleRootComponent ) )
            // InternalMwe2Parser.g:140:1: (lv_root_5_0= ruleRootComponent )
            {
            // InternalMwe2Parser.g:140:1: (lv_root_5_0= ruleRootComponent )
            // InternalMwe2Parser.g:141:3: lv_root_5_0= ruleRootComponent
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
    // InternalMwe2Parser.g:165:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // InternalMwe2Parser.g:166:2: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // InternalMwe2Parser.g:167:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
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
    // InternalMwe2Parser.g:174:1: ruleDeclaredProperty returns [EObject current=null] : (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:177:28: ( (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? ) )
            // InternalMwe2Parser.g:178:1: (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? )
            {
            // InternalMwe2Parser.g:178:1: (otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )? )
            // InternalMwe2Parser.g:179:2: otherlv_0= Var ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0());
                
            // InternalMwe2Parser.g:183:1: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMwe2Parser.g:184:1: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:184:1: ( ruleFQN )
                    // InternalMwe2Parser.g:185:3: ruleFQN
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

            // InternalMwe2Parser.g:199:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalMwe2Parser.g:200:1: (lv_name_2_0= ruleFQN )
            {
            // InternalMwe2Parser.g:200:1: (lv_name_2_0= ruleFQN )
            // InternalMwe2Parser.g:201:3: lv_name_2_0= ruleFQN
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

            // InternalMwe2Parser.g:217:2: (otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EqualsSign) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMwe2Parser.g:218:2: otherlv_3= EqualsSign ( (lv_default_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,EqualsSign,FOLLOW_6); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0());
                        
                    // InternalMwe2Parser.g:222:1: ( (lv_default_4_0= ruleValue ) )
                    // InternalMwe2Parser.g:223:1: (lv_default_4_0= ruleValue )
                    {
                    // InternalMwe2Parser.g:223:1: (lv_default_4_0= ruleValue )
                    // InternalMwe2Parser.g:224:3: lv_default_4_0= ruleValue
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
    // InternalMwe2Parser.g:248:1: entryRuleRootComponent returns [EObject current=null] : iv_ruleRootComponent= ruleRootComponent EOF ;
    public final EObject entryRuleRootComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootComponent = null;


        try {
            // InternalMwe2Parser.g:249:2: (iv_ruleRootComponent= ruleRootComponent EOF )
            // InternalMwe2Parser.g:250:2: iv_ruleRootComponent= ruleRootComponent EOF
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
    // InternalMwe2Parser.g:257:1: ruleRootComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) ;
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
            // InternalMwe2Parser.g:260:28: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) )
            // InternalMwe2Parser.g:261:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:261:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            // InternalMwe2Parser.g:261:2: () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) ) (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket
            {
            // InternalMwe2Parser.g:261:2: ()
            // InternalMwe2Parser.g:262:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootComponentAccess().getComponentAction_0(),
                        current);
                

            }

            // InternalMwe2Parser.g:267:2: ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )
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
                    // InternalMwe2Parser.g:267:3: ( ( ruleFQN ) )
                    {
                    // InternalMwe2Parser.g:267:3: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:268:1: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:268:1: ( ruleFQN )
                    // InternalMwe2Parser.g:269:3: ruleFQN
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
                    // InternalMwe2Parser.g:284:6: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    {
                    // InternalMwe2Parser.g:284:6: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    // InternalMwe2Parser.g:285:2: otherlv_2= CommercialAt ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,CommercialAt,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0());
                        
                    // InternalMwe2Parser.g:289:1: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:290:1: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:290:1: ( ruleFQN )
                    // InternalMwe2Parser.g:291:3: ruleFQN
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

            // InternalMwe2Parser.g:305:4: (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMwe2Parser.g:306:2: otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getRootComponentAccess().getColonKeyword_2_0());
                        
                    // InternalMwe2Parser.g:310:1: ( (lv_name_5_0= ruleFQN ) )
                    // InternalMwe2Parser.g:311:1: (lv_name_5_0= ruleFQN )
                    {
                    // InternalMwe2Parser.g:311:1: (lv_name_5_0= ruleFQN )
                    // InternalMwe2Parser.g:312:3: lv_name_5_0= ruleFQN
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

            // InternalMwe2Parser.g:328:4: ( (lv_autoInject_6_0= AutoInject ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AutoInject) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMwe2Parser.g:329:1: (lv_autoInject_6_0= AutoInject )
                    {
                    // InternalMwe2Parser.g:329:1: (lv_autoInject_6_0= AutoInject )
                    // InternalMwe2Parser.g:330:3: lv_autoInject_6_0= AutoInject
                    {
                    lv_autoInject_6_0=(Token)match(input,AutoInject,FOLLOW_9); 

                            newLeafNode(lv_autoInject_6_0, grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRootComponentRule());
                    	        }
                           		setWithLastConsumed(current, "autoInject", true, "auto-inject");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalMwe2Parser.g:349:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMwe2Parser.g:350:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // InternalMwe2Parser.g:350:1: (lv_assignment_8_0= ruleAssignment )
            	    // InternalMwe2Parser.g:351:3: lv_assignment_8_0= ruleAssignment
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
    // InternalMwe2Parser.g:380:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMwe2Parser.g:381:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalMwe2Parser.g:382:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalMwe2Parser.g:389:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) ;
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
            // InternalMwe2Parser.g:392:28: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket ) )
            // InternalMwe2Parser.g:393:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:393:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket )
            // InternalMwe2Parser.g:393:2: () ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )? (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= AutoInject ) )? otherlv_7= LeftCurlyBracket ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= RightCurlyBracket
            {
            // InternalMwe2Parser.g:393:2: ()
            // InternalMwe2Parser.g:394:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentAccess().getComponentAction_0(),
                        current);
                

            }

            // InternalMwe2Parser.g:399:2: ( ( ( ruleFQN ) ) | (otherlv_2= CommercialAt ( ( ruleFQN ) ) ) )?
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
                    // InternalMwe2Parser.g:399:3: ( ( ruleFQN ) )
                    {
                    // InternalMwe2Parser.g:399:3: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:400:1: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:400:1: ( ruleFQN )
                    // InternalMwe2Parser.g:401:3: ruleFQN
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
                    // InternalMwe2Parser.g:416:6: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    {
                    // InternalMwe2Parser.g:416:6: (otherlv_2= CommercialAt ( ( ruleFQN ) ) )
                    // InternalMwe2Parser.g:417:2: otherlv_2= CommercialAt ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,CommercialAt,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0());
                        
                    // InternalMwe2Parser.g:421:1: ( ( ruleFQN ) )
                    // InternalMwe2Parser.g:422:1: ( ruleFQN )
                    {
                    // InternalMwe2Parser.g:422:1: ( ruleFQN )
                    // InternalMwe2Parser.g:423:3: ruleFQN
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

            // InternalMwe2Parser.g:437:5: (otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Colon) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMwe2Parser.g:438:2: otherlv_4= Colon ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_2_0());
                        
                    // InternalMwe2Parser.g:442:1: ( (lv_name_5_0= ruleFQN ) )
                    // InternalMwe2Parser.g:443:1: (lv_name_5_0= ruleFQN )
                    {
                    // InternalMwe2Parser.g:443:1: (lv_name_5_0= ruleFQN )
                    // InternalMwe2Parser.g:444:3: lv_name_5_0= ruleFQN
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

            // InternalMwe2Parser.g:460:4: ( (lv_autoInject_6_0= AutoInject ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==AutoInject) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMwe2Parser.g:461:1: (lv_autoInject_6_0= AutoInject )
                    {
                    // InternalMwe2Parser.g:461:1: (lv_autoInject_6_0= AutoInject )
                    // InternalMwe2Parser.g:462:3: lv_autoInject_6_0= AutoInject
                    {
                    lv_autoInject_6_0=(Token)match(input,AutoInject,FOLLOW_9); 

                            newLeafNode(lv_autoInject_6_0, grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                           		setWithLastConsumed(current, "autoInject", true, "auto-inject");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalMwe2Parser.g:481:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMwe2Parser.g:482:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // InternalMwe2Parser.g:482:1: (lv_assignment_8_0= ruleAssignment )
            	    // InternalMwe2Parser.g:483:3: lv_assignment_8_0= ruleAssignment
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
    // InternalMwe2Parser.g:512:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMwe2Parser.g:513:2: (iv_ruleImport= ruleImport EOF )
            // InternalMwe2Parser.g:514:2: iv_ruleImport= ruleImport EOF
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
    // InternalMwe2Parser.g:521:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:524:28: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // InternalMwe2Parser.g:525:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // InternalMwe2Parser.g:525:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // InternalMwe2Parser.g:526:2: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalMwe2Parser.g:530:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // InternalMwe2Parser.g:531:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // InternalMwe2Parser.g:531:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // InternalMwe2Parser.g:532:3: lv_importedNamespace_1_0= ruleImportedFQN
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
    // InternalMwe2Parser.g:556:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalMwe2Parser.g:557:1: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalMwe2Parser.g:558:2: iv_ruleImportedFQN= ruleImportedFQN EOF
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
    // InternalMwe2Parser.g:565:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:569:6: ( (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? ) )
            // InternalMwe2Parser.g:570:1: (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? )
            {
            // InternalMwe2Parser.g:570:1: (this_FQN_0= ruleFQN (kw= FullStopAsterisk )? )
            // InternalMwe2Parser.g:571:5: this_FQN_0= ruleFQN (kw= FullStopAsterisk )?
            {
             
                    newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_11);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalMwe2Parser.g:581:1: (kw= FullStopAsterisk )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStopAsterisk) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMwe2Parser.g:582:2: kw= FullStopAsterisk
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
            // InternalMwe2Parser.g:596:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMwe2Parser.g:597:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalMwe2Parser.g:604:1: ruleAssignment returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:607:28: ( ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMwe2Parser.g:608:1: ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMwe2Parser.g:608:1: ( ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
            // InternalMwe2Parser.g:608:2: ( ( ruleFQN ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMwe2Parser.g:608:2: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:609:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:609:1: ( ruleFQN )
            // InternalMwe2Parser.g:610:3: ruleFQN
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
                
            // InternalMwe2Parser.g:629:1: ( (lv_value_2_0= ruleValue ) )
            // InternalMwe2Parser.g:630:1: (lv_value_2_0= ruleValue )
            {
            // InternalMwe2Parser.g:630:1: (lv_value_2_0= ruleValue )
            // InternalMwe2Parser.g:631:3: lv_value_2_0= ruleValue
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
    // InternalMwe2Parser.g:655:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMwe2Parser.g:656:2: (iv_ruleValue= ruleValue EOF )
            // InternalMwe2Parser.g:657:2: iv_ruleValue= ruleValue EOF
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
    // InternalMwe2Parser.g:664:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_Reference_3 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:667:28: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) )
            // InternalMwe2Parser.g:668:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            {
            // InternalMwe2Parser.g:668:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalMwe2Parser.g:669:5: this_Component_0= ruleComponent
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
                    // InternalMwe2Parser.g:679:5: this_StringLiteral_1= ruleStringLiteral
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
                    // InternalMwe2Parser.g:689:5: this_BooleanLiteral_2= ruleBooleanLiteral
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
                    // InternalMwe2Parser.g:699:5: this_Reference_3= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalMwe2Parser.g:715:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalMwe2Parser.g:716:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMwe2Parser.g:717:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalMwe2Parser.g:724:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:727:28: ( ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalMwe2Parser.g:728:1: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalMwe2Parser.g:728:1: ( () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False ) )
            // InternalMwe2Parser.g:728:2: () ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            {
            // InternalMwe2Parser.g:728:2: ()
            // InternalMwe2Parser.g:729:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // InternalMwe2Parser.g:734:2: ( ( (lv_isTrue_1_0= True ) ) | otherlv_2= False )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==True) ) {
                alt15=1;
            }
            else if ( (LA15_0==False) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMwe2Parser.g:734:3: ( (lv_isTrue_1_0= True ) )
                    {
                    // InternalMwe2Parser.g:734:3: ( (lv_isTrue_1_0= True ) )
                    // InternalMwe2Parser.g:735:1: (lv_isTrue_1_0= True )
                    {
                    // InternalMwe2Parser.g:735:1: (lv_isTrue_1_0= True )
                    // InternalMwe2Parser.g:736:3: lv_isTrue_1_0= True
                    {
                    lv_isTrue_1_0=(Token)match(input,True,FOLLOW_2); 

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
                    // InternalMwe2Parser.g:752:2: otherlv_2= False
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
    // InternalMwe2Parser.g:764:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMwe2Parser.g:765:2: (iv_ruleReference= ruleReference EOF )
            // InternalMwe2Parser.g:766:2: iv_ruleReference= ruleReference EOF
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
    // InternalMwe2Parser.g:773:1: ruleReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:776:28: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:777:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:777:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:778:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:778:1: ( ruleFQN )
            // InternalMwe2Parser.g:779:3: ruleFQN
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
    // InternalMwe2Parser.g:801:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalMwe2Parser.g:802:1: (iv_ruleFQN= ruleFQN EOF )
            // InternalMwe2Parser.g:803:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalMwe2Parser.g:810:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:814:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalMwe2Parser.g:815:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalMwe2Parser.g:815:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalMwe2Parser.g:815:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // InternalMwe2Parser.g:822:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==FullStop) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMwe2Parser.g:823:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

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
    // InternalMwe2Parser.g:843:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalMwe2Parser.g:847:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMwe2Parser.g:848:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMwe2Parser.g:858:1: ruleStringLiteral returns [EObject current=null] : ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) ) ;
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
            // InternalMwe2Parser.g:862:28: ( ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) ) )
            // InternalMwe2Parser.g:863:1: ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) )
            {
            // InternalMwe2Parser.g:863:1: ( ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) ) | ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Apostrophe) ) {
                alt23=1;
            }
            else if ( (LA23_0==QuotationMark) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMwe2Parser.g:863:2: ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) )
                    {
                    // InternalMwe2Parser.g:863:2: ( ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) ) )
                    // InternalMwe2Parser.g:863:3: ( (lv_begin_0_0= Apostrophe ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= Apostrophe ) )
                    {
                    // InternalMwe2Parser.g:863:3: ( (lv_begin_0_0= Apostrophe ) )
                    // InternalMwe2Parser.g:864:1: (lv_begin_0_0= Apostrophe )
                    {
                    // InternalMwe2Parser.g:864:1: (lv_begin_0_0= Apostrophe )
                    // InternalMwe2Parser.g:865:3: lv_begin_0_0= Apostrophe
                    {
                    lv_begin_0_0=(Token)match(input,Apostrophe,FOLLOW_14); 

                            newLeafNode(lv_begin_0_0, grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "begin", lv_begin_0_0, "\'");
                    	    

                    }


                    }

                    // InternalMwe2Parser.g:879:2: ( (lv_parts_1_0= rulePlainString ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA17_0>=ReverseSolidusQuotationMark && LA17_0<=ReverseSolidusReverseSolidus)||LA17_0==RULE_ID||(LA17_0>=RULE_WS && LA17_0<=RULE_ANY_OTHER)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMwe2Parser.g:880:1: (lv_parts_1_0= rulePlainString )
                            {
                            // InternalMwe2Parser.g:880:1: (lv_parts_1_0= rulePlainString )
                            // InternalMwe2Parser.g:881:3: lv_parts_1_0= rulePlainString
                            {
                             
                            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_15);
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

                    // InternalMwe2Parser.g:897:3: ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==DollarSignLeftCurlyBracket) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMwe2Parser.g:897:4: ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )?
                    	    {
                    	    // InternalMwe2Parser.g:897:4: ( (lv_parts_2_0= rulePropertyReference ) )
                    	    // InternalMwe2Parser.g:898:1: (lv_parts_2_0= rulePropertyReference )
                    	    {
                    	    // InternalMwe2Parser.g:898:1: (lv_parts_2_0= rulePropertyReference )
                    	    // InternalMwe2Parser.g:899:3: lv_parts_2_0= rulePropertyReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_14);
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

                    	    // InternalMwe2Parser.g:915:2: ( (lv_parts_3_0= rulePlainString ) )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA18_0>=ReverseSolidusQuotationMark && LA18_0<=ReverseSolidusReverseSolidus)||LA18_0==RULE_ID||(LA18_0>=RULE_WS && LA18_0<=RULE_ANY_OTHER)) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // InternalMwe2Parser.g:916:1: (lv_parts_3_0= rulePlainString )
                    	            {
                    	            // InternalMwe2Parser.g:916:1: (lv_parts_3_0= rulePlainString )
                    	            // InternalMwe2Parser.g:917:3: lv_parts_3_0= rulePlainString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_15);
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
                    	    break loop19;
                        }
                    } while (true);

                    // InternalMwe2Parser.g:933:5: ( (lv_end_4_0= Apostrophe ) )
                    // InternalMwe2Parser.g:934:1: (lv_end_4_0= Apostrophe )
                    {
                    // InternalMwe2Parser.g:934:1: (lv_end_4_0= Apostrophe )
                    // InternalMwe2Parser.g:935:3: lv_end_4_0= Apostrophe
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
                    // InternalMwe2Parser.g:950:6: ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) )
                    {
                    // InternalMwe2Parser.g:950:6: ( ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) ) )
                    // InternalMwe2Parser.g:950:7: ( (lv_begin_5_0= QuotationMark ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= QuotationMark ) )
                    {
                    // InternalMwe2Parser.g:950:7: ( (lv_begin_5_0= QuotationMark ) )
                    // InternalMwe2Parser.g:951:1: (lv_begin_5_0= QuotationMark )
                    {
                    // InternalMwe2Parser.g:951:1: (lv_begin_5_0= QuotationMark )
                    // InternalMwe2Parser.g:952:3: lv_begin_5_0= QuotationMark
                    {
                    lv_begin_5_0=(Token)match(input,QuotationMark,FOLLOW_16); 

                            newLeafNode(lv_begin_5_0, grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "begin", lv_begin_5_0, "\"");
                    	    

                    }


                    }

                    // InternalMwe2Parser.g:966:2: ( (lv_parts_6_0= rulePlainString ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA20_0>=ReverseSolidusQuotationMark && LA20_0<=ReverseSolidusReverseSolidus)||LA20_0==RULE_ID||(LA20_0>=RULE_WS && LA20_0<=RULE_ANY_OTHER)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMwe2Parser.g:967:1: (lv_parts_6_0= rulePlainString )
                            {
                            // InternalMwe2Parser.g:967:1: (lv_parts_6_0= rulePlainString )
                            // InternalMwe2Parser.g:968:3: lv_parts_6_0= rulePlainString
                            {
                             
                            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_17);
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

                    // InternalMwe2Parser.g:984:3: ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==DollarSignLeftCurlyBracket) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMwe2Parser.g:984:4: ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )?
                    	    {
                    	    // InternalMwe2Parser.g:984:4: ( (lv_parts_7_0= rulePropertyReference ) )
                    	    // InternalMwe2Parser.g:985:1: (lv_parts_7_0= rulePropertyReference )
                    	    {
                    	    // InternalMwe2Parser.g:985:1: (lv_parts_7_0= rulePropertyReference )
                    	    // InternalMwe2Parser.g:986:3: lv_parts_7_0= rulePropertyReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_16);
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

                    	    // InternalMwe2Parser.g:1002:2: ( (lv_parts_8_0= rulePlainString ) )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==ReverseSolidusDollarSignLeftCurlyBracket||(LA21_0>=ReverseSolidusQuotationMark && LA21_0<=ReverseSolidusReverseSolidus)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // InternalMwe2Parser.g:1003:1: (lv_parts_8_0= rulePlainString )
                    	            {
                    	            // InternalMwe2Parser.g:1003:1: (lv_parts_8_0= rulePlainString )
                    	            // InternalMwe2Parser.g:1004:3: lv_parts_8_0= rulePlainString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_17);
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
                    	    break loop22;
                        }
                    } while (true);

                    // InternalMwe2Parser.g:1020:5: ( (lv_end_9_0= QuotationMark ) )
                    // InternalMwe2Parser.g:1021:1: (lv_end_9_0= QuotationMark )
                    {
                    // InternalMwe2Parser.g:1021:1: (lv_end_9_0= QuotationMark )
                    // InternalMwe2Parser.g:1022:3: lv_end_9_0= QuotationMark
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
    // InternalMwe2Parser.g:1047:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalMwe2Parser.g:1051:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalMwe2Parser.g:1052:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalMwe2Parser.g:1062:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PropertyReferenceImpl_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalMwe2Parser.g:1066:28: ( (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket ) )
            // InternalMwe2Parser.g:1067:1: (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket )
            {
            // InternalMwe2Parser.g:1067:1: (otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket )
            // InternalMwe2Parser.g:1068:2: otherlv_0= DollarSignLeftCurlyBracket this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,DollarSignLeftCurlyBracket,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1()); 
                
            pushFollow(FOLLOW_18);
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
    // InternalMwe2Parser.g:1097:1: entryRulePropertyReferenceImpl returns [EObject current=null] : iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF ;
    public final EObject entryRulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceImpl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalMwe2Parser.g:1101:2: (iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF )
            // InternalMwe2Parser.g:1102:2: iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF
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
    // InternalMwe2Parser.g:1112:1: rulePropertyReferenceImpl returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalMwe2Parser.g:1116:28: ( ( ( ruleFQN ) ) )
            // InternalMwe2Parser.g:1117:1: ( ( ruleFQN ) )
            {
            // InternalMwe2Parser.g:1117:1: ( ( ruleFQN ) )
            // InternalMwe2Parser.g:1118:1: ( ruleFQN )
            {
            // InternalMwe2Parser.g:1118:1: ( ruleFQN )
            // InternalMwe2Parser.g:1119:3: ruleFQN
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
    // InternalMwe2Parser.g:1144:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // InternalMwe2Parser.g:1145:2: (iv_rulePlainString= rulePlainString EOF )
            // InternalMwe2Parser.g:1146:2: iv_rulePlainString= rulePlainString EOF
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
    // InternalMwe2Parser.g:1153:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:1156:28: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // InternalMwe2Parser.g:1157:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // InternalMwe2Parser.g:1157:1: ( (lv_value_0_0= ruleConstantValue ) )
            // InternalMwe2Parser.g:1158:1: (lv_value_0_0= ruleConstantValue )
            {
            // InternalMwe2Parser.g:1158:1: (lv_value_0_0= ruleConstantValue )
            // InternalMwe2Parser.g:1159:3: lv_value_0_0= ruleConstantValue
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
    // InternalMwe2Parser.g:1183:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // InternalMwe2Parser.g:1184:1: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalMwe2Parser.g:1185:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalMwe2Parser.g:1192:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+ ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalMwe2Parser.g:1196:6: ( (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+ )
            // InternalMwe2Parser.g:1197:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+
            {
            // InternalMwe2Parser.g:1197:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | kw= ReverseSolidusDollarSignLeftCurlyBracket | kw= ReverseSolidusReverseSolidus )+
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
                case ReverseSolidusApostrophe:
                    {
                    alt24=4;
                    }
                    break;
                case ReverseSolidusQuotationMark:
                    {
                    alt24=5;
                    }
                    break;
                case ReverseSolidusDollarSignLeftCurlyBracket:
                    {
                    alt24=6;
                    }
                    break;
                case ReverseSolidusReverseSolidus:
                    {
                    alt24=7;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalMwe2Parser.g:1197:6: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_19); 

            	    		current.merge(this_WS_0);
            	        
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // InternalMwe2Parser.g:1205:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_19); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // InternalMwe2Parser.g:1213:10: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // InternalMwe2Parser.g:1222:2: kw= ReverseSolidusApostrophe
            	    {
            	    kw=(Token)match(input,ReverseSolidusApostrophe,FOLLOW_19); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // InternalMwe2Parser.g:1229:2: kw= ReverseSolidusQuotationMark
            	    {
            	    kw=(Token)match(input,ReverseSolidusQuotationMark,FOLLOW_19); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // InternalMwe2Parser.g:1236:2: kw= ReverseSolidusDollarSignLeftCurlyBracket
            	    {
            	    kw=(Token)match(input,ReverseSolidusDollarSignLeftCurlyBracket,FOLLOW_19); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // InternalMwe2Parser.g:1243:2: kw= ReverseSolidusReverseSolidus
            	    {
            	    kw=(Token)match(input,ReverseSolidusReverseSolidus,FOLLOW_19); 

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
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\7\1\3\2\uffff\1\7";
    static final String dfa_3s = "\1\30\1\12\1\30\1\uffff\1\4\1\12\1\30\1\uffff\1\4";
    static final String dfa_4s = "\3\30\1\uffff\3\30\1\uffff\1\30";
    static final String dfa_5s = "\3\uffff\1\2\3\uffff\1\1\1\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
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
            return "183:1: ( ( ruleFQN ) )?";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\1\6\5\uffff\1\6";
    static final String dfa_10s = "\2\4\3\uffff\1\30\1\uffff\1\4";
    static final String dfa_11s = "\2\30\3\uffff\1\30\1\uffff\1\30";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\3\1\uffff\1\4\1\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\2\uffff\2\4\7\uffff\2\3\1\uffff\1\2\1\uffff\2\2\1\uffff\1\1",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\2\5\uffff\1\6\7\uffff\1\5\1\2\1\uffff\1\6\1\2\2\6"
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
            return "668:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001200420L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000016B0190L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000480010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001902EA00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001901EA00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001900E202L});

}