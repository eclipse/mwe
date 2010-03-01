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

public class InternalMwe2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'module'", "';'", "'var'", "'='", "'@'", "'as'", "'auto-inject'", "'{'", "'}'", "'import'", "'.*'", "'true'", "'false'", "'.'", "'${'", "':'", "'\\''", "'\"'", "'\\\\'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_SL_COMMENT=8;

        public InternalMwe2Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g"; }



     	private Mwe2GrammarAccess grammarAccess;
     	
        public InternalMwe2Parser(TokenStream input, IAstFactory factory, Mwe2GrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	} 



    // $ANTLR start entryRuleModule
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:72:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:73:2: (iv_ruleModule= ruleModule EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:74:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();
            _fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

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
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:81:1: ruleModule returns [EObject current=null] : ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ';' ( (lv_imports_4_0= ruleImport ) )* ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )* ( (lv_root_6_0= ruleComponent ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_canonicalName_2_0 = null;

        EObject lv_imports_4_0 = null;

        EObject lv_declaredProperties_5_0 = null;

        EObject lv_root_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:86:6: ( ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ';' ( (lv_imports_4_0= ruleImport ) )* ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )* ( (lv_root_6_0= ruleComponent ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:1: ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ';' ( (lv_imports_4_0= ruleImport ) )* ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )* ( (lv_root_6_0= ruleComponent ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:1: ( () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ';' ( (lv_imports_4_0= ruleImport ) )* ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )* ( (lv_root_6_0= ruleComponent ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:2: () 'module' ( (lv_canonicalName_2_0= ruleFQN ) ) ';' ( (lv_imports_4_0= ruleImport ) )* ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )* ( (lv_root_6_0= ruleComponent ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:87:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:88:5: 
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

            match(input,9,FOLLOW_9_in_ruleModule129); 

                    createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_1(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:102:1: ( (lv_canonicalName_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:103:1: (lv_canonicalName_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:103:1: (lv_canonicalName_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:104:3: lv_canonicalName_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getCanonicalNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModule150);
            lv_canonicalName_2_0=ruleFQN();
            _fsp--;


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

            match(input,10,FOLLOW_10_in_ruleModule160); 

                    createLeafNode(grammarAccess.getModuleAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:130:1: ( (lv_imports_4_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:131:1: (lv_imports_4_0= ruleImport )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:131:1: (lv_imports_4_0= ruleImport )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:132:3: lv_imports_4_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule181);
            	    lv_imports_4_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_4_0, 
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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:154:3: ( (lv_declaredProperties_5_0= ruleDeclaredProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:155:1: (lv_declaredProperties_5_0= ruleDeclaredProperty )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:155:1: (lv_declaredProperties_5_0= ruleDeclaredProperty )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:156:3: lv_declaredProperties_5_0= ruleDeclaredProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getDeclaredPropertiesDeclaredPropertyParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredProperty_in_ruleModule203);
            	    lv_declaredProperties_5_0=ruleDeclaredProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declaredProperties",
            	    	        		lv_declaredProperties_5_0, 
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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:178:3: ( (lv_root_6_0= ruleComponent ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:179:1: (lv_root_6_0= ruleComponent )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:179:1: (lv_root_6_0= ruleComponent )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:180:3: lv_root_6_0= ruleComponent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRootComponentParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleModule225);
            lv_root_6_0=ruleComponent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"root",
            	        		lv_root_6_0, 
            	        		"Component", 
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
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:212:1: entryRuleDeclaredProperty returns [EObject current=null] : iv_ruleDeclaredProperty= ruleDeclaredProperty EOF ;
    public final EObject entryRuleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredProperty = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:213:2: (iv_ruleDeclaredProperty= ruleDeclaredProperty EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:214:2: iv_ruleDeclaredProperty= ruleDeclaredProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaredPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty263);
            iv_ruleDeclaredProperty=ruleDeclaredProperty();
            _fsp--;

             current =iv_ruleDeclaredProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredProperty273); 

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
    // $ANTLR end entryRuleDeclaredProperty


    // $ANTLR start ruleDeclaredProperty
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:221:1: ruleDeclaredProperty returns [EObject current=null] : ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ';' ) ;
    public final EObject ruleDeclaredProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_default_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:226:6: ( ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ';' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:227:1: ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ';' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:227:1: ( 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ';' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:227:3: 'var' ( ( ruleFQN ) )? ( (lv_name_2_0= ruleFQN ) ) ( '=' ( (lv_default_4_0= ruleValue ) ) )? ';'
            {
            match(input,11,FOLLOW_11_in_ruleDeclaredProperty308); 

                    createLeafNode(grammarAccess.getDeclaredPropertyAccess().getVarKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:231:1: ( ( ruleFQN ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:232:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:232:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:233:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getTypeTypeCrossReference_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty331);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:247:3: ( (lv_name_2_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:248:1: (lv_name_2_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:248:1: (lv_name_2_0= ruleFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:249:3: lv_name_2_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getNameFQNParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDeclaredProperty353);
            lv_name_2_0=ruleFQN();
            _fsp--;


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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:271:2: ( '=' ( (lv_default_4_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:271:4: '=' ( (lv_default_4_0= ruleValue ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleDeclaredProperty364); 

                            createLeafNode(grammarAccess.getDeclaredPropertyAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:275:1: ( (lv_default_4_0= ruleValue ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:276:1: (lv_default_4_0= ruleValue )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:276:1: (lv_default_4_0= ruleValue )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:277:3: lv_default_4_0= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDeclaredPropertyAccess().getDefaultValueParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleDeclaredProperty385);
                    lv_default_4_0=ruleValue();
                    _fsp--;


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

            match(input,10,FOLLOW_10_in_ruleDeclaredProperty397); 

                    createLeafNode(grammarAccess.getDeclaredPropertyAccess().getSemicolonKeyword_4(), null); 
                

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
    // $ANTLR end ruleDeclaredProperty


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:311:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:312:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:313:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent433);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent443); 

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
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:320:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( 'as' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_autoInject_6_0=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_assignment_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:325:6: ( ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( 'as' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:326:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( 'as' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:326:1: ( () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( 'as' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:326:2: () ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )? ( 'as' ( (lv_name_5_0= ruleFQN ) ) )? ( (lv_autoInject_6_0= 'auto-inject' ) )? '{' ( (lv_assignment_8_0= ruleAssignment ) )* '}'
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:326:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:327:5: 
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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:337:2: ( ( ( ruleFQN ) ) | ( '@' ( ( ruleFQN ) ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:337:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:337:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:338:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:338:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:339:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent501);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:354:6: ( '@' ( ( ruleFQN ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:354:6: ( '@' ( ( ruleFQN ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:354:8: '@' ( ( ruleFQN ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleComponent518); 

                            createLeafNode(grammarAccess.getComponentAccess().getCommercialAtKeyword_1_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:358:1: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:359:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:359:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:360:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getModuleModuleCrossReference_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent541);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:374:5: ( 'as' ( (lv_name_5_0= ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:374:7: 'as' ( (lv_name_5_0= ruleFQN ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleComponent555); 

                            createLeafNode(grammarAccess.getComponentAccess().getAsKeyword_2_0(), null); 
                        
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:378:1: ( (lv_name_5_0= ruleFQN ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:379:1: (lv_name_5_0= ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:379:1: (lv_name_5_0= ruleFQN )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:380:3: lv_name_5_0= ruleFQN
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getNameFQNParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent576);
                    lv_name_5_0=ruleFQN();
                    _fsp--;


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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:402:4: ( (lv_autoInject_6_0= 'auto-inject' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:403:1: (lv_autoInject_6_0= 'auto-inject' )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:403:1: (lv_autoInject_6_0= 'auto-inject' )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:404:3: lv_autoInject_6_0= 'auto-inject'
                    {
                    lv_autoInject_6_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleComponent596); 

                            createLeafNode(grammarAccess.getComponentAccess().getAutoInjectAutoInjectKeyword_3_0(), "autoInject"); 
                        

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

            match(input,16,FOLLOW_16_in_ruleComponent620); 

                    createLeafNode(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:427:1: ( (lv_assignment_8_0= ruleAssignment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:428:1: (lv_assignment_8_0= ruleAssignment )
            	    {
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:428:1: (lv_assignment_8_0= ruleAssignment )
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:429:3: lv_assignment_8_0= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getAssignmentAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComponent641);
            	    lv_assignment_8_0=ruleAssignment();
            	    _fsp--;


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
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleComponent652); 

                    createLeafNode(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleImport
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:463:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:464:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:465:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport688);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport698); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:472:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:477:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:478:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:478:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:478:3: 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            {
            match(input,18,FOLLOW_18_in_ruleImport733); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:482:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:483:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:483:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:484:3: lv_importedNamespace_1_0= ruleImportedFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImportedFQN_in_ruleImport754);
            lv_importedNamespace_1_0=ruleImportedFQN();
            _fsp--;


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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleImportedFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:514:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:515:2: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:516:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN791);
            iv_ruleImportedFQN=ruleImportedFQN();
            _fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN802); 

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
    // $ANTLR end entryRuleImportedFQN


    // $ANTLR start ruleImportedFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:523:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:528:6: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:529:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:529:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:530:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleImportedFQN849);
            this_FQN_0=ruleFQN();
            _fsp--;


            		current.merge(this_FQN_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:540:1: (kw= '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:541:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleImportedFQN868); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getImportedFQNAccess().getFullStopAsteriskKeyword_1(), null); 
                        

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
    // $ANTLR end ruleImportedFQN


    // $ANTLR start entryRuleAssignment
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:554:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:555:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:556:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment910);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment920); 

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:563:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:568:6: ( ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ';' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:569:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ';' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:569:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ';' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:569:2: ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ';'
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:569:2: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:570:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:570:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:571:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment963); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getFeatureOperationCrossReference_0_0(), "feature"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_ruleAssignment973); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:587:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:588:1: (lv_value_2_0= ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:588:1: (lv_value_2_0= ruleValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:589:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment994);
            lv_value_2_0=ruleValue();
            _fsp--;


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

            match(input,10,FOLLOW_10_in_ruleAssignment1004); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:623:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:624:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:625:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1040);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1050); 

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
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:632:1: ruleValue returns [EObject current=null] : (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;

        EObject this_Reference_3 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:637:6: ( (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:638:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:638:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=14 && LA10_1<=16)||LA10_1==22) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||LA10_1==10||LA10_1==17) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("638:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt10=1;
                }
                break;
            case 25:
            case 26:
                {
                alt10=2;
                }
                break;
            case 20:
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("638:1: (this_Component_0= ruleComponent | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral | this_Reference_3= ruleReference )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:639:5: this_Component_0= ruleComponent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getComponentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleValue1097);
                    this_Component_0=ruleComponent();
                    _fsp--;

                     
                            current = this_Component_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:649:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue1124);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:659:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue1151);
                    this_BooleanLiteral_2=ruleBooleanLiteral();
                    _fsp--;

                     
                            current = this_BooleanLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:669:5: this_Reference_3= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1178);
                    this_Reference_3=ruleReference();
                    _fsp--;

                     
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
    // $ANTLR end ruleValue


    // $ANTLR start entryRuleStringLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:685:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:686:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:687:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1213);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1223); 

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
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:694:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleMWEString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:699:6: ( ( (lv_value_0_0= ruleMWEString ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:700:1: ( (lv_value_0_0= ruleMWEString ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:700:1: ( (lv_value_0_0= ruleMWEString ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:701:1: (lv_value_0_0= ruleMWEString )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:701:1: (lv_value_0_0= ruleMWEString )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:702:3: lv_value_0_0= ruleMWEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStringLiteralAccess().getValueMWEStringParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMWEString_in_ruleStringLiteral1268);
            lv_value_0_0=ruleMWEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"MWEString", 
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
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:732:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:733:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:734:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1303);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1313); 

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
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:741:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:746:6: ( ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:747:1: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:747:1: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:747:2: () ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:747:2: ()
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:748:5: 
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

            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:758:2: ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("758:2: ( ( (lv_isTrue_1_0= 'true' ) ) | 'false' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:758:3: ( (lv_isTrue_1_0= 'true' ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:758:3: ( (lv_isTrue_1_0= 'true' ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:759:1: (lv_isTrue_1_0= 'true' )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:759:1: (lv_isTrue_1_0= 'true' )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:760:3: lv_isTrue_1_0= 'true'
                    {
                    lv_isTrue_1_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBooleanLiteral1366); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_0_0(), "isTrue"); 
                        

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
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:780:7: 'false'
                    {
                    match(input,21,FOLLOW_21_in_ruleBooleanLiteral1395); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1(), null); 
                        

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
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:792:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:793:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:794:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1432);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1442); 

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:801:1: ruleReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:806:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:807:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:807:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:808:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:808:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:809:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1484); 

            		createLeafNode(grammarAccess.getReferenceAccess().getReferableReferrableCrossReference_0(), "referable"); 
            	

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
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:829:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:830:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:831:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1520);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1531); 

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
    // $ANTLR end entryRuleFQN


    // $ANTLR start ruleFQN
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:838:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:843:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:844:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:844:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:844:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1571); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:851:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:852:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleFQN1590); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1605); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end ruleFQN


    // $ANTLR start entryRuleMWEString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:872:1: entryRuleMWEString returns [EObject current=null] : iv_ruleMWEString= ruleMWEString EOF ;
    public final EObject entryRuleMWEString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMWEString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:876:2: (iv_ruleMWEString= ruleMWEString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:877:2: iv_ruleMWEString= ruleMWEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMWEStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleMWEString_in_entryRuleMWEString1658);
            iv_ruleMWEString=ruleMWEString();
            _fsp--;

             current =iv_ruleMWEString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEString1668); 

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
    // $ANTLR end entryRuleMWEString


    // $ANTLR start ruleMWEString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:887:1: ruleMWEString returns [EObject current=null] : ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) ) ;
    public final EObject ruleMWEString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_begin_0_0 = null;

        EObject lv_parts_1_0 = null;

        AntlrDatatypeRuleToken lv_end_2_0 = null;

        AntlrDatatypeRuleToken lv_begin_3_0 = null;

        EObject lv_parts_4_0 = null;

        AntlrDatatypeRuleToken lv_end_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:893:6: ( ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("894:1: ( ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:2: ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:2: ( ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:3: ( (lv_begin_0_0= ruleSingleQuote ) ) ( (lv_parts_1_0= ruleMWEStringPart ) )* ( (lv_end_2_0= ruleSingleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:894:3: ( (lv_begin_0_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:895:1: (lv_begin_0_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:895:1: (lv_begin_0_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:896:3: lv_begin_0_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleMWEString1719);
                    lv_begin_0_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_0_0, 
                    	        		"SingleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:918:2: ( (lv_parts_1_0= ruleMWEStringPart ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_ANY_OTHER)||(LA13_0>=9 && LA13_0<=18)||(LA13_0>=20 && LA13_0<=24)||LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:919:1: (lv_parts_1_0= ruleMWEStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:919:1: (lv_parts_1_0= ruleMWEStringPart )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:920:3: lv_parts_1_0= ruleMWEStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMWEStringPart_in_ruleMWEString1740);
                    	    lv_parts_1_0=ruleMWEStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_1_0, 
                    	    	        		"MWEStringPart", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:942:3: ( (lv_end_2_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:943:1: (lv_end_2_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:943:1: (lv_end_2_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:944:3: lv_end_2_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleMWEString1762);
                    lv_end_2_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_2_0, 
                    	        		"SingleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:967:6: ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:967:6: ( ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:967:7: ( (lv_begin_3_0= ruleDoubleQuote ) ) ( (lv_parts_4_0= ruleMWEStringPart ) )* ( (lv_end_5_0= ruleDoubleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:967:7: ( (lv_begin_3_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:968:1: (lv_begin_3_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:968:1: (lv_begin_3_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:969:3: lv_begin_3_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleMWEString1791);
                    lv_begin_3_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_3_0, 
                    	        		"DoubleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:991:2: ( (lv_parts_4_0= ruleMWEStringPart ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_ANY_OTHER)||(LA14_0>=9 && LA14_0<=18)||(LA14_0>=20 && LA14_0<=24)||LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:992:1: (lv_parts_4_0= ruleMWEStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:992:1: (lv_parts_4_0= ruleMWEStringPart )
                    	    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:993:3: lv_parts_4_0= ruleMWEStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMWEStringPart_in_ruleMWEString1812);
                    	    lv_parts_4_0=ruleMWEStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_4_0, 
                    	    	        		"MWEStringPart", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1015:3: ( (lv_end_5_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1016:1: (lv_end_5_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1016:1: (lv_end_5_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1017:3: lv_end_5_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleMWEString1834);
                    lv_end_5_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_5_0, 
                    	        		"DoubleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleMWEString


    // $ANTLR start entryRuleMWEStringPart
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1050:1: entryRuleMWEStringPart returns [EObject current=null] : iv_ruleMWEStringPart= ruleMWEStringPart EOF ;
    public final EObject entryRuleMWEStringPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMWEStringPart = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1051:2: (iv_ruleMWEStringPart= ruleMWEStringPart EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1052:2: iv_ruleMWEStringPart= ruleMWEStringPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMWEStringPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1875);
            iv_ruleMWEStringPart=ruleMWEStringPart();
            _fsp--;

             current =iv_ruleMWEStringPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEStringPart1885); 

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
    // $ANTLR end entryRuleMWEStringPart


    // $ANTLR start ruleMWEStringPart
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1059:1: ruleMWEStringPart returns [EObject current=null] : (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString ) ;
    public final EObject ruleMWEStringPart() throws RecognitionException {
        EObject current = null;

        EObject this_ReplaceableString_0 = null;

        EObject this_PlainString_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1064:6: ( (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1065:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1065:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_ANY_OTHER)||(LA16_0>=9 && LA16_0<=18)||(LA16_0>=20 && LA16_0<=22)||LA16_0==24||LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1066:5: this_ReplaceableString_0= ruleReplaceableString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReplaceableString_in_ruleMWEStringPart1932);
                    this_ReplaceableString_0=ruleReplaceableString();
                    _fsp--;

                     
                            current = this_ReplaceableString_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1076:5: this_PlainString_1= rulePlainString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePlainString_in_ruleMWEStringPart1959);
                    this_PlainString_1=rulePlainString();
                    _fsp--;

                     
                            current = this_PlainString_1; 
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
    // $ANTLR end ruleMWEStringPart


    // $ANTLR start entryRuleReplaceableString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1092:1: entryRuleReplaceableString returns [EObject current=null] : iv_ruleReplaceableString= ruleReplaceableString EOF ;
    public final EObject entryRuleReplaceableString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceableString = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1093:2: (iv_ruleReplaceableString= ruleReplaceableString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1094:2: iv_ruleReplaceableString= ruleReplaceableString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReplaceableStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1994);
            iv_ruleReplaceableString=ruleReplaceableString();
            _fsp--;

             current =iv_ruleReplaceableString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableString2004); 

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
    // $ANTLR end entryRuleReplaceableString


    // $ANTLR start ruleReplaceableString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1101:1: ruleReplaceableString returns [EObject current=null] : ( '${' ( (lv_property_1_0= ruleValue ) ) '}' ) ;
    public final EObject ruleReplaceableString() throws RecognitionException {
        EObject current = null;

        EObject lv_property_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1106:6: ( ( '${' ( (lv_property_1_0= ruleValue ) ) '}' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1107:1: ( '${' ( (lv_property_1_0= ruleValue ) ) '}' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1107:1: ( '${' ( (lv_property_1_0= ruleValue ) ) '}' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1107:3: '${' ( (lv_property_1_0= ruleValue ) ) '}'
            {
            match(input,23,FOLLOW_23_in_ruleReplaceableString2039); 

                    createLeafNode(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1111:1: ( (lv_property_1_0= ruleValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1112:1: (lv_property_1_0= ruleValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1112:1: (lv_property_1_0= ruleValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1113:3: lv_property_1_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReplaceableStringAccess().getPropertyValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleReplaceableString2060);
            lv_property_1_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReplaceableStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"property",
            	        		lv_property_1_0, 
            	        		"Value", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleReplaceableString2070); 

                    createLeafNode(grammarAccess.getReplaceableStringAccess().getRightCurlyBracketKeyword_2(), null); 
                

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
    // $ANTLR end ruleReplaceableString


    // $ANTLR start entryRulePlainString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1147:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1148:2: (iv_rulePlainString= rulePlainString EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1149:2: iv_rulePlainString= rulePlainString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlainStringRule(), currentNode); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString2106);
            iv_rulePlainString=rulePlainString();
            _fsp--;

             current =iv_rulePlainString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString2116); 

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
    // $ANTLR end entryRulePlainString


    // $ANTLR start rulePlainString
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1156:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1161:6: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1162:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1162:1: ( (lv_value_0_0= ruleConstantValue ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1163:1: (lv_value_0_0= ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1163:1: (lv_value_0_0= ruleConstantValue )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1164:3: lv_value_0_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_rulePlainString2161);
            lv_value_0_0=ruleConstantValue();
            _fsp--;


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
    // $ANTLR end rulePlainString


    // $ANTLR start entryRuleConstantValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1194:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1195:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1196:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue2197);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue2208); 

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
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1203:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token kw=null;
        Token this_ANY_OTHER_7=null;
        Token this_ID_9=null;
        AntlrDatatypeRuleToken this_EscapedDoubleQuote_5 = null;

        AntlrDatatypeRuleToken this_EscapedSingleQuote_6 = null;

        AntlrDatatypeRuleToken this_EscapedBackslash_8 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1208:6: ( (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1209:1: (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1209:1: (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' )
            int alt17=20;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            case 17:
                {
                alt17=4;
                }
                break;
            case 13:
                {
                alt17=5;
                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt17=6;
                    }
                    break;
                case 27:
                    {
                    alt17=9;
                    }
                    break;
                case 25:
                    {
                    alt17=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1209:1: (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' )", 17, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ANY_OTHER:
                {
                alt17=8;
                }
                break;
            case RULE_ID:
                {
                alt17=10;
                }
                break;
            case 20:
                {
                alt17=11;
                }
                break;
            case 21:
                {
                alt17=12;
                }
                break;
            case 12:
                {
                alt17=13;
                }
                break;
            case 18:
                {
                alt17=14;
                }
                break;
            case 9:
                {
                alt17=15;
                }
                break;
            case 15:
                {
                alt17=16;
                }
                break;
            case 11:
                {
                alt17=17;
                }
                break;
            case 14:
                {
                alt17=18;
                }
                break;
            case 10:
                {
                alt17=19;
                }
                break;
            case 22:
                {
                alt17=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1209:1: (this_WS_0= RULE_WS | kw= ':' | kw= '{' | kw= '}' | kw= '@' | this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote | this_EscapedSingleQuote_6= ruleEscapedSingleQuote | this_ANY_OTHER_7= RULE_ANY_OTHER | this_EscapedBackslash_8= ruleEscapedBackslash | this_ID_9= RULE_ID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | kw= 'module' | kw= 'auto-inject' | kw= 'var' | kw= 'as' | kw= ';' | kw= '.' )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1209:6: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConstantValue2248); 

                    		current.merge(this_WS_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1218:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleConstantValue2272); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getColonKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1225:2: kw= '{'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleConstantValue2291); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getLeftCurlyBracketKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1232:2: kw= '}'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleConstantValue2310); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getRightCurlyBracketKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1239:2: kw= '@'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleConstantValue2329); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getCommercialAtKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1246:5: this_EscapedDoubleQuote_5= ruleEscapedDoubleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue2357);
                    this_EscapedDoubleQuote_5=ruleEscapedDoubleQuote();
                    _fsp--;


                    		current.merge(this_EscapedDoubleQuote_5);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1258:5: this_EscapedSingleQuote_6= ruleEscapedSingleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue2390);
                    this_EscapedSingleQuote_6=ruleEscapedSingleQuote();
                    _fsp--;


                    		current.merge(this_EscapedSingleQuote_6);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1269:10: this_ANY_OTHER_7= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_7=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2416); 

                    		current.merge(this_ANY_OTHER_7);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1278:5: this_EscapedBackslash_8= ruleEscapedBackslash
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_ruleConstantValue2449);
                    this_EscapedBackslash_8=ruleEscapedBackslash();
                    _fsp--;


                    		current.merge(this_EscapedBackslash_8);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1289:10: this_ID_9= RULE_ID
                    {
                    this_ID_9=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantValue2475); 

                    		current.merge(this_ID_9);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1298:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleConstantValue2499); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getTrueKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1305:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleConstantValue2518); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getFalseKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1312:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleConstantValue2537); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1319:2: kw= 'import'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleConstantValue2556); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getImportKeyword_13(), null); 
                        

                    }
                    break;
                case 15 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1326:2: kw= 'module'
                    {
                    kw=(Token)input.LT(1);
                    match(input,9,FOLLOW_9_in_ruleConstantValue2575); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getModuleKeyword_14(), null); 
                        

                    }
                    break;
                case 16 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1333:2: kw= 'auto-inject'
                    {
                    kw=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleConstantValue2594); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getAutoInjectKeyword_15(), null); 
                        

                    }
                    break;
                case 17 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1340:2: kw= 'var'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleConstantValue2613); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getVarKeyword_16(), null); 
                        

                    }
                    break;
                case 18 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1347:2: kw= 'as'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleConstantValue2632); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getAsKeyword_17(), null); 
                        

                    }
                    break;
                case 19 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1354:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleConstantValue2651); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getSemicolonKeyword_18(), null); 
                        

                    }
                    break;
                case 20 :
                    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1361:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleConstantValue2670); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getFullStopKeyword_19(), null); 
                        

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
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1374:1: entryRuleSingleQuote returns [String current=null] : iv_ruleSingleQuote= ruleSingleQuote EOF ;
    public final String entryRuleSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleQuote = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1375:2: (iv_ruleSingleQuote= ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1376:2: iv_ruleSingleQuote= ruleSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote2711);
            iv_ruleSingleQuote=ruleSingleQuote();
            _fsp--;

             current =iv_ruleSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote2722); 

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
    // $ANTLR end entryRuleSingleQuote


    // $ANTLR start ruleSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1383:1: ruleSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1388:6: (kw= '\\'' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1390:2: kw= '\\''
            {
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleSingleQuote2759); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getSingleQuoteAccess().getApostropheKeyword(), null); 
                

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
    // $ANTLR end ruleSingleQuote


    // $ANTLR start entryRuleEscapedSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1403:1: entryRuleEscapedSingleQuote returns [String current=null] : iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF ;
    public final String entryRuleEscapedSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedSingleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1407:2: (iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1408:2: iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote2805);
            iv_ruleEscapedSingleQuote=ruleEscapedSingleQuote();
            _fsp--;

             current =iv_ruleEscapedSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote2816); 

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
    // $ANTLR end entryRuleEscapedSingleQuote


    // $ANTLR start ruleEscapedSingleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1418:1: ruleEscapedSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_SingleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1424:6: ( (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1425:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1425:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1426:5: this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote2867);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote2894);
            this_SingleQuote_1=ruleSingleQuote();
            _fsp--;


            		current.merge(this_SingleQuote_1);
                
             
                    currentNode = currentNode.getParent();
                

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
    // $ANTLR end ruleEscapedSingleQuote


    // $ANTLR start entryRuleDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1458:1: entryRuleDoubleQuote returns [String current=null] : iv_ruleDoubleQuote= ruleDoubleQuote EOF ;
    public final String entryRuleDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDoubleQuote = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1459:2: (iv_ruleDoubleQuote= ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1460:2: iv_ruleDoubleQuote= ruleDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote2944);
            iv_ruleDoubleQuote=ruleDoubleQuote();
            _fsp--;

             current =iv_ruleDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote2955); 

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
    // $ANTLR end entryRuleDoubleQuote


    // $ANTLR start ruleDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1467:1: ruleDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\"' ;
    public final AntlrDatatypeRuleToken ruleDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1472:6: (kw= '\"' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1474:2: kw= '\"'
            {
            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleDoubleQuote2992); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getDoubleQuoteAccess().getQuotationMarkKeyword(), null); 
                

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
    // $ANTLR end ruleDoubleQuote


    // $ANTLR start entryRuleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1487:1: entryRuleEscapedDoubleQuote returns [String current=null] : iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF ;
    public final String entryRuleEscapedDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedDoubleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1491:2: (iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1492:2: iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote3038);
            iv_ruleEscapedDoubleQuote=ruleEscapedDoubleQuote();
            _fsp--;

             current =iv_ruleEscapedDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote3049); 

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
    // $ANTLR end entryRuleEscapedDoubleQuote


    // $ANTLR start ruleEscapedDoubleQuote
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1502:1: ruleEscapedDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_DoubleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1508:6: ( (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1509:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1509:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1510:5: this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote3100);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote3127);
            this_DoubleQuote_1=ruleDoubleQuote();
            _fsp--;


            		current.merge(this_DoubleQuote_1);
                
             
                    currentNode = currentNode.getParent();
                

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
    // $ANTLR end ruleEscapedDoubleQuote


    // $ANTLR start entryRuleBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1542:1: entryRuleBackslash returns [String current=null] : iv_ruleBackslash= ruleBackslash EOF ;
    public final String entryRuleBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackslash = null;


        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1543:2: (iv_ruleBackslash= ruleBackslash EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1544:2: iv_ruleBackslash= ruleBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash3177);
            iv_ruleBackslash=ruleBackslash();
            _fsp--;

             current =iv_ruleBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash3188); 

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
    // $ANTLR end entryRuleBackslash


    // $ANTLR start ruleBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1551:1: ruleBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\\\' ;
    public final AntlrDatatypeRuleToken ruleBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1556:6: (kw= '\\\\' )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1558:2: kw= '\\\\'
            {
            kw=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleBackslash3225); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBackslashAccess().getReverseSolidusKeyword(), null); 
                

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
    // $ANTLR end ruleBackslash


    // $ANTLR start entryRuleEscapedBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1571:1: entryRuleEscapedBackslash returns [String current=null] : iv_ruleEscapedBackslash= ruleEscapedBackslash EOF ;
    public final String entryRuleEscapedBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedBackslash = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1575:2: (iv_ruleEscapedBackslash= ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1576:2: iv_ruleEscapedBackslash= ruleEscapedBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash3271);
            iv_ruleEscapedBackslash=ruleEscapedBackslash();
            _fsp--;

             current =iv_ruleEscapedBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash3282); 

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
    // $ANTLR end entryRuleEscapedBackslash


    // $ANTLR start ruleEscapedBackslash
    // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1586:1: ruleEscapedBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) ;
    public final AntlrDatatypeRuleToken ruleEscapedBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_Backslash_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1592:6: ( (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1593:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            {
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1593:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            // ../org.eclipse.emf.mwe2.language/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/internal/InternalMwe2.g:1594:5: this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash3333);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash3360);
            this_Backslash_1=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_1);
                
             
                    currentNode = currentNode.getParent();
                

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
    // $ANTLR end ruleEscapedBackslash


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\3\4\2\uffff\1\4";
    static final String DFA3_maxS =
        "\1\4\1\26\1\4\2\uffff\1\26";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\5\uffff\1\4\1\uffff\1\4\11\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\5\uffff\1\4\1\uffff\1\4\11\uffff\1\2"
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
            return "231:1: ( ( ruleFQN ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleModule129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModule150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleModule160 = new BitSet(new long[]{0x000000000005E810L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule181 = new BitSet(new long[]{0x000000000005E810L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_ruleModule203 = new BitSet(new long[]{0x000000000001E810L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleModule225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredProperty_in_entryRuleDeclaredProperty263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredProperty273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDeclaredProperty308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDeclaredProperty353 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_ruleDeclaredProperty364 = new BitSet(new long[]{0x000000000631E010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleDeclaredProperty385 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleDeclaredProperty397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent501 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_13_in_ruleComponent518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent541 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleComponent555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent576 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleComponent596 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponent620 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComponent641 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleComponent652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_ruleImport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportedFQN849 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleImportedFQN868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment963 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssignment973 = new BitSet(new long[]{0x000000000631E010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment994 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleAssignment1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleValue1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_ruleStringLiteral1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBooleanLiteral1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanLiteral1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1571 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleFQN1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1605 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleMWEString_in_entryRuleMWEString1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEString1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleMWEString1719 = new BitSet(new long[]{0x000000000BF7FE70L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_ruleMWEString1740 = new BitSet(new long[]{0x000000000BF7FE70L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleMWEString1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleMWEString1791 = new BitSet(new long[]{0x000000000DF7FE70L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_ruleMWEString1812 = new BitSet(new long[]{0x000000000DF7FE70L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleMWEString1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEStringPart1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_ruleMWEStringPart1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleMWEStringPart1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableString2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReplaceableString2039 = new BitSet(new long[]{0x000000000631E010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleReplaceableString2060 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReplaceableString2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rulePlainString2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue2197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConstantValue2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConstantValue2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConstantValue2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConstantValue2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConstantValue2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_ruleConstantValue2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantValue2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstantValue2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConstantValue2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstantValue2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConstantValue2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleConstantValue2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConstantValue2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantValue2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConstantValue2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleConstantValue2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConstantValue2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSingleQuote2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote2805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote2867 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDoubleQuote2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote3100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash3177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBackslash3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash3271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash3333 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash3360 = new BitSet(new long[]{0x0000000000000002L});

}