package org.eclipse.emf.mwe2.language.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
     	
        public InternalMwe2Parser(TokenStream input, IAstFactory factory, Mwe2GrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:65:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:66:2: (iv_ruleModule= ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:67:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:74:1: ruleModule returns [EObject current=null] : ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_declaredProperties_4_0 = null;

        EObject lv_root_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:79:6: ( ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:80:1: ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:80:1: ( () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:80:2: () otherlv_1= KEYWORD_19 ( (lv_canonicalName_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )* ( (lv_root_5_0= ruleRootComponent ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:80:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:81:5: 
            {
             
                    temp=factory.create(grammarAccess.getModuleAccess().getModuleAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModuleAccess().getModuleAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleModule124); 

                	createLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:96:1: ( (lv_canonicalName_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:97:1: (lv_canonicalName_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:97:1: (lv_canonicalName_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:98:3: lv_canonicalName_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModule145);
            lv_canonicalName_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"canonicalName",
            	        		lv_canonicalName_2_0, 
            	        		"FQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:120:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:121:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:121:1: (lv_imports_3_0= ruleImport )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:122:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule166);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_3_0, 
            	    	        		"Import", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:144:3: ( (lv_declaredProperties_4_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:145:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:145:1: (lv_declaredProperties_4_0= ruleDeclaredProperty )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:146:3: lv_declaredProperties_4_0= ruleDeclaredProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredProperty_in_ruleModule188);
            	    lv_declaredProperties_4_0=ruleDeclaredProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declaredProperties",
            	    	        		lv_declaredProperties_4_0, 
            	    	        		"DeclaredProperty", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:168:3: ( (lv_root_5_0= ruleRootComponent ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:169:1: (lv_root_5_0= ruleRootComponent )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:169:1: (lv_root_5_0= ruleRootComponent )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:170:3: lv_root_5_0= ruleRootComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRootRootComponentParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRootComponent_in_ruleModule210);
            lv_root_5_0=ruleRootComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"root",
            	        		lv_root_5_0, 
            	        		"RootComponent", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:200:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:201:2: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:202:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaredPropertyRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:209:1: ruleDeclaredProperty returns [EObject current=null] : (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:214:6: ( (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:215:1: (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:215:1: (otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:216:2: otherlv_0= KEYWORD_15 ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleDeclaredProperty293); 

                	createLeafNode(otherlv_0, grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:220:1: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:221:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:221:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:222:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeJvmTypeCrossReference_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty316);
                    ruleFQN();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:236:3: ( (lv_name_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:237:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:237:1: (lv_name_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:238:3: lv_name_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty338);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"FQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:260:2: (otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_5) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:261:2: otherlv_3= KEYWORD_5 ( (lv_default_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleDeclaredProperty352); 

                        	createLeafNode(otherlv_3, grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0(), null);
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:265:1: ( (lv_default_4_0= ruleValue ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:266:1: (lv_default_4_0= ruleValue )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:266:1: (lv_default_4_0= ruleValue )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:267:3: lv_default_4_0= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleDeclaredProperty373);
                    lv_default_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"default",
                    	        		lv_default_4_0, 
                    	        		"Value", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:297:1: entryRuleRootComponent returns [EObject current=null] : iv_ruleRootComponent= ruleRootComponent EOF ;
    public final EObject entryRuleRootComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:298:2: (iv_ruleRootComponent= ruleRootComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:299:2: iv_ruleRootComponent= ruleRootComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRootComponentRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:306:1: ruleRootComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) ;
    public final EObject ruleRootComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_autoInject_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:311:6: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:312:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:312:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:312:2: () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) ) (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:312:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:313:5: 
            {
             
                    temp=factory.create(grammarAccess.getRootComponentAccess().getComponentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRootComponentAccess().getComponentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:323:2: ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )
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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:323:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:323:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:324:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:324:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:325:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent478);
                    ruleFQN();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:340:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:340:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:341:2: otherlv_2= KEYWORD_6 ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleRootComponent498); 

                        	createLeafNode(otherlv_2, grammarAccess.getRootComponentAccess().getCommercialAtKeyword_1_1_0(), null);
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:345:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:346:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:346:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:347:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getModuleModuleCrossReference_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent521);
                    ruleFQN();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:361:4: (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_4) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:362:2: otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleRootComponent537); 

                        	createLeafNode(otherlv_4, grammarAccess.getRootComponentAccess().getColonKeyword_2_0(), null);
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:366:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:367:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:367:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:368:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getNameFQNParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleRootComponent558);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"FQN", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:390:4: ( (lv_autoInject_6_0= KEYWORD_20 ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:391:1: (lv_autoInject_6_0= KEYWORD_20 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:391:1: (lv_autoInject_6_0= KEYWORD_20 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:392:3: lv_autoInject_6_0= KEYWORD_20
                    {
                    lv_autoInject_6_0=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleRootComponent579); 

                            createLeafNode(lv_autoInject_6_0, grammarAccess.getRootComponentAccess().getAutoInjectAutoInjectKeyword_3_0(), "autoInject");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "autoInject", true, "auto-inject", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleRootComponent606); 

                	createLeafNode(otherlv_7, grammarAccess.getRootComponentAccess().getLeftCurlyBracketKeyword_4(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:417:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:418:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:418:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:419:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRootComponentAccess().getAssignmentAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleRootComponent627);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRootComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignment",
            	    	        		lv_assignment_8_0, 
            	    	        		"Assignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleRootComponent641); 

                	createLeafNode(otherlv_9, grammarAccess.getRootComponentAccess().getRightCurlyBracketKeyword_6(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:454:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:455:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:456:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:463:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_autoInject_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:468:6: ( ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:469:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:469:1: ( () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:469:2: () ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )? (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= KEYWORD_20 ) )? otherlv_7= KEYWORD_7 ( (lv_assignment_8_0= ruleAssignment ) )* otherlv_9= KEYWORD_8
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:469:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:470:5: 
            {
             
                    temp=factory.create(grammarAccess.getComponentAccess().getComponentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getComponentAccess().getComponentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:480:2: ( ( ( ruleFQN ) ) | (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) ) )?
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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:480:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:480:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:481:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:481:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:482:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent744);
                    ruleFQN();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:497:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:497:6: (otherlv_2= KEYWORD_6 ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:498:2: otherlv_2= KEYWORD_6 ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComponent764); 

                        	createLeafNode(otherlv_2, grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0(), null);
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:502:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:503:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:503:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:504:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent787);
                    ruleFQN();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:518:5: (otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_4) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:519:2: otherlv_4= KEYWORD_4 ( (lv_name_5_0= ruleFQN ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleComponent804); 

                        	createLeafNode(otherlv_4, grammarAccess.getComponentAccess().getColonKeyword_2_0(), null);
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:523:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:524:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:524:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:525:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent825);
                    lv_name_5_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"FQN", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:547:4: ( (lv_autoInject_6_0= KEYWORD_20 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:548:1: (lv_autoInject_6_0= KEYWORD_20 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:548:1: (lv_autoInject_6_0= KEYWORD_20 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:549:3: lv_autoInject_6_0= KEYWORD_20
                    {
                    lv_autoInject_6_0=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComponent846); 

                            createLeafNode(lv_autoInject_6_0, grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0(), "autoInject");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "autoInject", true, "auto-inject", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleComponent873); 

                	createLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:574:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:575:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:575:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:576:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponent894);
            	    lv_assignment_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignment",
            	    	        		lv_assignment_8_0, 
            	    	        		"Assignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleComponent908); 

                	createLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:611:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:612:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:613:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:620:1: ruleImport returns [EObject current=null] : (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:625:6: ( (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:626:1: (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:626:1: (otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:627:2: otherlv_0= KEYWORD_18 ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleImport991); 

                	createLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:631:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:632:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:632:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:633:3: lv_importedNamespace_1_0= ruleImportedFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImportedFQN_in_ruleImport1012);
            lv_importedNamespace_1_0=ruleImportedFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importedNamespace",
            	        		lv_importedNamespace_1_0, 
            	        		"ImportedFQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:663:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:664:1: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:665:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedFQNRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:672:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:677:6: ( (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:678:1: (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:678:1: (this_FQN_0= ruleFQN (kw= KEYWORD_10 )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:679:5: this_FQN_0= ruleFQN (kw= KEYWORD_10 )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleImportedFQN1106);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:689:1: (kw= KEYWORD_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_10) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:690:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleImportedFQN1125); 

                            current.merge(kw);
                            createLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:703:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:704:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:705:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:712:1: ruleAssignment returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:717:6: ( ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:718:1: ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:718:1: ( ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:718:2: ( ( ruleFQN ) ) otherlv_1= KEYWORD_5 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:718:2: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:719:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:719:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:720:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getFeatureJvmFeatureCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssignment1224);
            ruleFQN();

            state._fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleAssignment1237); 

                	createLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null);
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:739:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:740:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:740:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:741:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1258);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:771:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:772:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:773:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:780:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_Reference_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:785:6: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:786:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:786:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:787:5: this_Component_0= ruleComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleValue1350);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                            current = this_Component_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:797:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue1377);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                            current = this_StringLiteral_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:807:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue1404);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                            current = this_BooleanLiteral_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:817:5: this_Reference_3= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1431);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                            current = this_Reference_3;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:833:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:834:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:835:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:842:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:847:6: ( ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:848:1: ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:848:1: ( () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:848:2: () ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:848:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:849:5: 
            {
             
                    temp=factory.create(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:859:2: ( ( (lv_isTrue_1_0= KEYWORD_16 ) ) | otherlv_2= KEYWORD_17 )
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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:859:3: ( (lv_isTrue_1_0= KEYWORD_16 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:859:3: ( (lv_isTrue_1_0= KEYWORD_16 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:860:1: (lv_isTrue_1_0= KEYWORD_16 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:860:1: (lv_isTrue_1_0= KEYWORD_16 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:861:3: lv_isTrue_1_0= KEYWORD_16
                    {
                    lv_isTrue_1_0=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleBooleanLiteral1529); 

                            createLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0(), "isTrue");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTrue", true, "true", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:883:2: otherlv_2= KEYWORD_17
                    {
                    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleBooleanLiteral1561); 

                        	createLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1(), null);
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:895:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:896:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:897:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:904:1: ruleReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:909:6: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:910:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:910:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:911:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:911:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:912:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleReference1654);
            ruleFQN();

            state._fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:934:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:935:1: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:936:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:943:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:948:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:949:1: (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:949:1: (this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:949:6: this_ID_0= RULE_ID (kw= KEYWORD_3 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1740); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:956:1: (kw= KEYWORD_3 this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_3) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:957:2: kw= KEYWORD_3 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFQN1759); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1774); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:977:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:981:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:982:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:992:1: ruleStringLiteral returns [EObject current=null] : ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:998:6: ( ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:1: ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:1: ( ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) ) | ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) ) )
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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:2: ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:2: ( ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:3: ( (lv_begin_0_0= KEYWORD_2 ) ) ( (lv_parts_1_0= rulePlainString ) )? ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )* ( (lv_end_4_0= KEYWORD_2 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:999:3: ( (lv_begin_0_0= KEYWORD_2 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1000:1: (lv_begin_0_0= KEYWORD_2 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1000:1: (lv_begin_0_0= KEYWORD_2 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1001:3: lv_begin_0_0= KEYWORD_2
                    {
                    lv_begin_0_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringLiteral1885); 

                            createLeafNode(lv_begin_0_0, grammarAccess.getStringLiteralAccess().getBeginApostropheKeyword_0_0_0(), "begin");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "begin", lv_begin_0_0, "\'", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1021:2: ( (lv_parts_1_0= rulePlainString ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KEYWORD_14||(LA17_0>=KEYWORD_11 && LA17_0<=KEYWORD_13)||LA17_0==RULE_ID||(LA17_0>=RULE_WS && LA17_0<=RULE_ANY_OTHER)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1022:1: (lv_parts_1_0= rulePlainString )
                            {
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1022:1: (lv_parts_1_0= rulePlainString )
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1023:3: lv_parts_1_0= rulePlainString
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral1919);
                            lv_parts_1_0=rulePlainString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"parts",
                            	        		lv_parts_1_0, 
                            	        		"PlainString", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1045:3: ( ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )? )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==KEYWORD_9) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1045:4: ( (lv_parts_2_0= rulePropertyReference ) ) ( (lv_parts_3_0= rulePlainString ) )?
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1045:4: ( (lv_parts_2_0= rulePropertyReference ) )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1046:1: (lv_parts_2_0= rulePropertyReference )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1046:1: (lv_parts_2_0= rulePropertyReference )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1047:3: lv_parts_2_0= rulePropertyReference
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_0_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyReference_in_ruleStringLiteral1942);
                    	    lv_parts_2_0=rulePropertyReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_2_0, 
                    	    	        		"PropertyReference", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1069:2: ( (lv_parts_3_0= rulePlainString ) )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==KEYWORD_14||(LA18_0>=KEYWORD_11 && LA18_0<=KEYWORD_13)||LA18_0==RULE_ID||(LA18_0>=RULE_WS && LA18_0<=RULE_ANY_OTHER)) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1070:1: (lv_parts_3_0= rulePlainString )
                    	            {
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1070:1: (lv_parts_3_0= rulePlainString )
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1071:3: lv_parts_3_0= rulePlainString
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_0_2_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral1963);
                    	            lv_parts_3_0=rulePlainString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"parts",
                    	            	        		lv_parts_3_0, 
                    	            	        		"PlainString", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

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

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1093:5: ( (lv_end_4_0= KEYWORD_2 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1094:1: (lv_end_4_0= KEYWORD_2 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1094:1: (lv_end_4_0= KEYWORD_2 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1095:3: lv_end_4_0= KEYWORD_2
                    {
                    lv_end_4_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringLiteral1985); 

                            createLeafNode(lv_end_4_0, grammarAccess.getStringLiteralAccess().getEndApostropheKeyword_0_3_0(), "end");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_4_0, "\'", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1116:6: ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1116:6: ( ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1116:7: ( (lv_begin_5_0= KEYWORD_1 ) ) ( (lv_parts_6_0= rulePlainString ) )? ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )* ( (lv_end_9_0= KEYWORD_1 ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1116:7: ( (lv_begin_5_0= KEYWORD_1 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1117:1: (lv_begin_5_0= KEYWORD_1 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1117:1: (lv_begin_5_0= KEYWORD_1 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1118:3: lv_begin_5_0= KEYWORD_1
                    {
                    lv_begin_5_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringLiteral2025); 

                            createLeafNode(lv_begin_5_0, grammarAccess.getStringLiteralAccess().getBeginQuotationMarkKeyword_1_0_0(), "begin");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "begin", lv_begin_5_0, "\"", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1138:2: ( (lv_parts_6_0= rulePlainString ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_14||(LA20_0>=KEYWORD_11 && LA20_0<=KEYWORD_13)||LA20_0==RULE_ID||(LA20_0>=RULE_WS && LA20_0<=RULE_ANY_OTHER)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1139:1: (lv_parts_6_0= rulePlainString )
                            {
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1139:1: (lv_parts_6_0= rulePlainString )
                            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1140:3: lv_parts_6_0= rulePlainString
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral2059);
                            lv_parts_6_0=rulePlainString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"parts",
                            	        		lv_parts_6_0, 
                            	        		"PlainString", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1162:3: ( ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )? )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==KEYWORD_9) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1162:4: ( (lv_parts_7_0= rulePropertyReference ) ) ( (lv_parts_8_0= rulePlainString ) )?
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1162:4: ( (lv_parts_7_0= rulePropertyReference ) )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1163:1: (lv_parts_7_0= rulePropertyReference )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1163:1: (lv_parts_7_0= rulePropertyReference )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1164:3: lv_parts_7_0= rulePropertyReference
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPropertyReferenceParserRuleCall_1_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyReference_in_ruleStringLiteral2082);
                    	    lv_parts_7_0=rulePropertyReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_7_0, 
                    	    	        		"PropertyReference", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1186:2: ( (lv_parts_8_0= rulePlainString ) )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==KEYWORD_14||(LA21_0>=KEYWORD_11 && LA21_0<=KEYWORD_13)||LA21_0==RULE_ID||(LA21_0>=RULE_WS && LA21_0<=RULE_ANY_OTHER)) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1187:1: (lv_parts_8_0= rulePlainString )
                    	            {
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1187:1: (lv_parts_8_0= rulePlainString )
                    	            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1188:3: lv_parts_8_0= rulePlainString
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getPartsPlainStringParserRuleCall_1_2_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainString_in_ruleStringLiteral2103);
                    	            lv_parts_8_0=rulePlainString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"parts",
                    	            	        		lv_parts_8_0, 
                    	            	        		"PlainString", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

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

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1210:5: ( (lv_end_9_0= KEYWORD_1 ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1211:1: (lv_end_9_0= KEYWORD_1 )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1211:1: (lv_end_9_0= KEYWORD_1 )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1212:3: lv_end_9_0= KEYWORD_1
                    {
                    lv_end_9_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringLiteral2125); 

                            createLeafNode(lv_end_9_0, grammarAccess.getStringLiteralAccess().getEndQuotationMarkKeyword_1_3_0(), "end");
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_9_0, "\"", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1243:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1247:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1248:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyReferenceRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1258:1: rulePropertyReference returns [EObject current=null] : (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PropertyReferenceImpl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1264:6: ( (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1265:1: (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1265:1: (otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8 )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1266:2: otherlv_0= KEYWORD_9 this_PropertyReferenceImpl_1= rulePropertyReferenceImpl otherlv_2= KEYWORD_8
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePropertyReference2236); 

                	createLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0(), null);
                
             
                    currentNode=createCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyReferenceImplParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_rulePropertyReferenceImpl_in_rulePropertyReference2258);
            this_PropertyReferenceImpl_1=rulePropertyReferenceImpl();

            state._fsp--;


                    current = this_PropertyReferenceImpl_1;
                    currentNode = currentNode.getParent();
                
            otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePropertyReference2270); 

                	createLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1295:1: entryRulePropertyReferenceImpl returns [EObject current=null] : iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF ;
    public final EObject entryRulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceImpl = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1299:2: (iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1300:2: iv_rulePropertyReferenceImpl= rulePropertyReferenceImpl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyReferenceImplRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1310:1: rulePropertyReferenceImpl returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePropertyReferenceImpl() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1316:6: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1317:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1317:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1318:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1318:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1319:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyReferenceImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyCrossReference_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePropertyReferenceImpl2376);
            ruleFQN();

            state._fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1344:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1345:2: (iv_rulePlainString= rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1346:2: iv_rulePlainString= rulePlainString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlainStringRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1353:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1358:6: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1359:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1359:1: ( (lv_value_0_0= ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1360:1: (lv_value_0_0= ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1360:1: (lv_value_0_0= ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1361:3: lv_value_0_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_rulePlainString2469);
            lv_value_0_0=ruleConstantValue();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPlainStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"ConstantValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1391:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1392:1: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1393:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
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
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1400:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+ ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_ID_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1405:6: ( (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+ )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1406:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1406:1: (this_WS_0= RULE_WS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_ID_2= RULE_ID | kw= KEYWORD_12 | kw= KEYWORD_11 | kw= KEYWORD_14 | kw= KEYWORD_13 )+
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
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1406:6: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConstantValue2555); 

            	    		current.merge(this_WS_0);
            	        
            	     
            	        createLeafNode(this_WS_0, grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1414:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2581); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        createLeafNode(this_ANY_OTHER_1, grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1422:10: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantValue2607); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(this_ID_2, grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1431:2: kw= KEYWORD_12
            	    {
            	    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleConstantValue2631); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusApostropheKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1438:2: kw= KEYWORD_11
            	    {
            	    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleConstantValue2650); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusQuotationMarkKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1445:2: kw= KEYWORD_14
            	    {
            	    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleConstantValue2669); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2Parser.g:1452:2: kw= KEYWORD_13
            	    {
            	    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleConstantValue2688); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getConstantValueAccess().getReverseSolidusReverseSolidusKeyword_6(), null); 
            	        

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

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
            return "220:1: ( ( ruleFQN ) )?";
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
            return "786:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )";
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