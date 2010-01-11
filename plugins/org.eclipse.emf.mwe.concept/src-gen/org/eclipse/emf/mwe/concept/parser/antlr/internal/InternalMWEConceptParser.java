package org.eclipse.emf.mwe.concept.parser.antlr.internal; 

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
import org.eclipse.emf.mwe.concept.services.MWEConceptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEConceptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'import'", "';'", "'.*'", "'='", "'as'", "'{'", "'}'", "','", "'property'", "'file'", "'.'", "'true'", "'false'", "'${'", "':'", "'\\''", "'\"'", "'\\\\'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_SL_COMMENT=8;

        public InternalMWEConceptParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g"; }



     	private MWEConceptGrammarAccess grammarAccess;
     	
        public InternalMWEConceptParser(TokenStream input, IAstFactory factory, MWEConceptGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MWEFile";	
       	} 



    // $ANTLR start entryRuleMWEFile
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:72:1: entryRuleMWEFile returns [EObject current=null] : iv_ruleMWEFile= ruleMWEFile EOF ;
    public final EObject entryRuleMWEFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMWEFile = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:73:2: (iv_ruleMWEFile= ruleMWEFile EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:74:2: iv_ruleMWEFile= ruleMWEFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMWEFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleMWEFile_in_entryRuleMWEFile75);
            iv_ruleMWEFile=ruleMWEFile();
            _fsp--;

             current =iv_ruleMWEFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEFile85); 

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
    // $ANTLR end entryRuleMWEFile


    // $ANTLR start ruleMWEFile
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:81:1: ruleMWEFile returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_root_2_0= ruleComponentWithType ) ) ) ;
    public final EObject ruleMWEFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_root_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:86:6: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_root_2_0= ruleComponentWithType ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:87:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_root_2_0= ruleComponentWithType ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:87:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_root_2_0= ruleComponentWithType ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:87:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_root_2_0= ruleComponentWithType ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:87:2: ()
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:88:5: 
            {
             
                    temp=factory.create(grammarAccess.getMWEFileAccess().getMWEFileAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMWEFileAccess().getMWEFileAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:98:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:99:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:99:1: (lv_imports_1_0= ruleImport )
            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:100:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMWEFileAccess().getImportsImportParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleMWEFile140);
            	    lv_imports_1_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMWEFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_1_0, 
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

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:122:3: ( (lv_root_2_0= ruleComponentWithType ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:123:1: (lv_root_2_0= ruleComponentWithType )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:123:1: (lv_root_2_0= ruleComponentWithType )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:124:3: lv_root_2_0= ruleComponentWithType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMWEFileAccess().getRootComponentWithTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComponentWithType_in_ruleMWEFile162);
            lv_root_2_0=ruleComponentWithType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMWEFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"root",
            	        		lv_root_2_0, 
            	        		"ComponentWithType", 
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
    // $ANTLR end ruleMWEFile


    // $ANTLR start entryRuleImport
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:154:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:155:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:156:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport198);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport208); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:163:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:168:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ';' ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:169:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ';' )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:169:1: ( 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ';' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:169:3: 'import' ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) ';'
            {
            match(input,9,FOLLOW_9_in_ruleImport243); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:173:1: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:174:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:174:1: (lv_importedNamespace_1_0= ruleImportedFQN )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:175:3: lv_importedNamespace_1_0= ruleImportedFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImportedFQN_in_ruleImport264);
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

            match(input,10,FOLLOW_10_in_ruleImport274); 

                    createLeafNode(grammarAccess.getImportAccess().getSemicolonKeyword_2(), null); 
                

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:209:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:210:2: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:211:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportedFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN311);
            iv_ruleImportedFQN=ruleImportedFQN();
            _fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportedFQN322); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:218:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:223:6: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:224:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:224:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:225:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleImportedFQN369);
            this_FQN_0=ruleFQN();
            _fsp--;


            		current.merge(this_FQN_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:235:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:236:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleImportedFQN388); 

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


    // $ANTLR start entryRuleSetting
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:249:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:250:2: (iv_ruleSetting= ruleSetting EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:251:2: iv_ruleSetting= ruleSetting EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSettingRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetting_in_entryRuleSetting430);
            iv_ruleSetting=ruleSetting();
            _fsp--;

             current =iv_ruleSetting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetting440); 

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
    // $ANTLR end entryRuleSetting


    // $ANTLR start ruleSetting
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:258:1: ruleSetting returns [EObject current=null] : ( ( ( ruleValidID ) ) ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:263:6: ( ( ( ( ruleValidID ) ) ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:264:1: ( ( ( ruleValidID ) ) ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:264:1: ( ( ( ruleValidID ) ) ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:264:2: ( ( ruleValidID ) ) ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:264:2: ( ( ruleValidID ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:265:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:265:1: ( ruleValidID )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:266:3: ruleValidID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSettingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getSettingAccess().getFeatureOperationCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValidID_in_ruleSetting488);
            ruleValidID();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:280:2: ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==10||(LA3_0>=13 && LA3_0<=14)||(LA3_0>=17 && LA3_0<=18)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("280:2: ( ( '=' ( (lv_value_2_0= ruleAttributeList ) ) ) | ( (lv_value_3_0= ruleComponent ) ) )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:280:3: ( '=' ( (lv_value_2_0= ruleAttributeList ) ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:280:3: ( '=' ( (lv_value_2_0= ruleAttributeList ) ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:280:5: '=' ( (lv_value_2_0= ruleAttributeList ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleSetting500); 

                            createLeafNode(grammarAccess.getSettingAccess().getEqualsSignKeyword_1_0_0(), null); 
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:284:1: ( (lv_value_2_0= ruleAttributeList ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:285:1: (lv_value_2_0= ruleAttributeList )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:285:1: (lv_value_2_0= ruleAttributeList )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:286:3: lv_value_2_0= ruleAttributeList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSettingAccess().getValueAttributeListParserRuleCall_1_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_ruleSetting521);
                    lv_value_2_0=ruleAttributeList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
                    	        		"AttributeList", 
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
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:309:6: ( (lv_value_3_0= ruleComponent ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:309:6: ( (lv_value_3_0= ruleComponent ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:310:1: (lv_value_3_0= ruleComponent )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:310:1: (lv_value_3_0= ruleComponent )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:311:3: lv_value_3_0= ruleComponent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSettingAccess().getValueComponentParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleComponent_in_ruleSetting549);
                    lv_value_3_0=ruleComponent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"Component", 
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
    // $ANTLR end ruleSetting


    // $ANTLR start entryRuleComponent
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:341:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:342:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:343:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent586);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent596); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:350:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )? ( 'as' ( (lv_name_4_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject lv_fileRef_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_elements_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:355:6: ( ( () ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )? ( 'as' ( (lv_name_4_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:356:1: ( () ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )? ( 'as' ( (lv_name_4_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:356:1: ( () ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )? ( 'as' ( (lv_name_4_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:356:2: () ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )? ( 'as' ( (lv_name_4_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:356:2: ()
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:357:5: 
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

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:367:2: ( ( ( ruleFQN ) ) | ( (lv_fileRef_2_0= ruleFileRef ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2>=20 && LA4_2<=21)||(LA4_2>=24 && LA4_2<=25)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==10||(LA4_2>=13 && LA4_2<=14)||LA4_2==19) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:367:3: ( ( ruleFQN ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:367:3: ( ( ruleFQN ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:368:1: ( ruleFQN )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:368:1: ( ruleFQN )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:369:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getTypeTypeCrossReference_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleComponent654);
                    ruleFQN();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:384:6: ( (lv_fileRef_2_0= ruleFileRef ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:384:6: ( (lv_fileRef_2_0= ruleFileRef ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:385:1: (lv_fileRef_2_0= ruleFileRef )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:385:1: (lv_fileRef_2_0= ruleFileRef )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:386:3: lv_fileRef_2_0= ruleFileRef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getFileRefFileRefParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFileRef_in_ruleComponent681);
                    lv_fileRef_2_0=ruleFileRef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fileRef",
                    	        		lv_fileRef_2_0, 
                    	        		"FileRef", 
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

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:408:4: ( 'as' ( (lv_name_4_0= ruleValidID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:408:6: 'as' ( (lv_name_4_0= ruleValidID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleComponent694); 

                            createLeafNode(grammarAccess.getComponentAccess().getAsKeyword_2_0(), null); 
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:412:1: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:413:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:413:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:414:3: lv_name_4_0= ruleValidID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValidID_in_ruleComponent715);
                    lv_name_4_0=ruleValidID();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"ValidID", 
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

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:436:4: ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==10) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("436:4: ( ';' | ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:436:6: ';'
                    {
                    match(input,10,FOLLOW_10_in_ruleComponent728); 

                            createLeafNode(grammarAccess.getComponentAccess().getSemicolonKeyword_3_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:441:6: ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:441:6: ( '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}' )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:441:8: '{' ( (lv_elements_7_0= ruleConfigurationElement ) )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleComponent745); 

                            createLeafNode(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:445:1: ( (lv_elements_7_0= ruleConfigurationElement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||(LA6_0>=17 && LA6_0<=18)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:446:1: (lv_elements_7_0= ruleConfigurationElement )
                    	    {
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:446:1: (lv_elements_7_0= ruleConfigurationElement )
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:447:3: lv_elements_7_0= ruleConfigurationElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getElementsConfigurationElementParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleComponent766);
                    	    lv_elements_7_0=ruleConfigurationElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"elements",
                    	    	        		lv_elements_7_0, 
                    	    	        		"ConfigurationElement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleComponent777); 

                            createLeafNode(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_1_2(), null); 
                        

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
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleComponentWithType
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:481:1: entryRuleComponentWithType returns [EObject current=null] : iv_ruleComponentWithType= ruleComponentWithType EOF ;
    public final EObject entryRuleComponentWithType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentWithType = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:482:2: (iv_ruleComponentWithType= ruleComponentWithType EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:483:2: iv_ruleComponentWithType= ruleComponentWithType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentWithTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType815);
            iv_ruleComponentWithType=ruleComponentWithType();
            _fsp--;

             current =iv_ruleComponentWithType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentWithType825); 

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
    // $ANTLR end entryRuleComponentWithType


    // $ANTLR start ruleComponentWithType
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:490:1: ruleComponentWithType returns [EObject current=null] : ( ( ( ruleFQN ) ) ( 'as' ( (lv_name_2_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) ) ) ;
    public final EObject ruleComponentWithType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:495:6: ( ( ( ( ruleFQN ) ) ( 'as' ( (lv_name_2_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:496:1: ( ( ( ruleFQN ) ) ( 'as' ( (lv_name_2_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:496:1: ( ( ( ruleFQN ) ) ( 'as' ( (lv_name_2_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:496:2: ( ( ruleFQN ) ) ( 'as' ( (lv_name_2_0= ruleValidID ) ) )? ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:496:2: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:497:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:497:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:498:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getComponentWithTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getComponentWithTypeAccess().getTypeTypeCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleComponentWithType873);
            ruleFQN();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:512:2: ( 'as' ( (lv_name_2_0= ruleValidID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:512:4: 'as' ( (lv_name_2_0= ruleValidID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleComponentWithType884); 

                            createLeafNode(grammarAccess.getComponentWithTypeAccess().getAsKeyword_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:516:1: ( (lv_name_2_0= ruleValidID ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:517:1: (lv_name_2_0= ruleValidID )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:517:1: (lv_name_2_0= ruleValidID )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:518:3: lv_name_2_0= ruleValidID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComponentWithTypeAccess().getNameValidIDParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValidID_in_ruleComponentWithType905);
                    lv_name_2_0=ruleValidID();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComponentWithTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"ValidID", 
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

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:540:4: ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("540:4: ( ';' | ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:540:6: ';'
                    {
                    match(input,10,FOLLOW_10_in_ruleComponentWithType918); 

                            createLeafNode(grammarAccess.getComponentWithTypeAccess().getSemicolonKeyword_2_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:545:6: ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:545:6: ( '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}' )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:545:8: '{' ( (lv_elements_5_0= ruleConfigurationElement ) )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleComponentWithType935); 

                            createLeafNode(grammarAccess.getComponentWithTypeAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:549:1: ( (lv_elements_5_0= ruleConfigurationElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||(LA9_0>=17 && LA9_0<=18)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:550:1: (lv_elements_5_0= ruleConfigurationElement )
                    	    {
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:550:1: (lv_elements_5_0= ruleConfigurationElement )
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:551:3: lv_elements_5_0= ruleConfigurationElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getComponentWithTypeAccess().getElementsConfigurationElementParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleComponentWithType956);
                    	    lv_elements_5_0=ruleConfigurationElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getComponentWithTypeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"elements",
                    	    	        		lv_elements_5_0, 
                    	    	        		"ConfigurationElement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleComponentWithType967); 

                            createLeafNode(grammarAccess.getComponentWithTypeAccess().getRightCurlyBracketKeyword_2_1_2(), null); 
                        

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
    // $ANTLR end ruleComponentWithType


    // $ANTLR start entryRuleConfigurationElement
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:585:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:586:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:587:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1005);
            iv_ruleConfigurationElement=ruleConfigurationElement();
            _fsp--;

             current =iv_ruleConfigurationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement1015); 

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
    // $ANTLR end entryRuleConfigurationElement


    // $ANTLR start ruleConfigurationElement
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:594:1: ruleConfigurationElement returns [EObject current=null] : (this_Setting_0= ruleSetting | this_Property_1= ruleProperty ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Setting_0 = null;

        EObject this_Property_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:599:6: ( (this_Setting_0= ruleSetting | this_Property_1= ruleProperty ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:600:1: (this_Setting_0= ruleSetting | this_Property_1= ruleProperty )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:600:1: (this_Setting_0= ruleSetting | this_Property_1= ruleProperty )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:601:5: this_Setting_0= ruleSetting
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConfigurationElementAccess().getSettingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetting_in_ruleConfigurationElement1062);
                    this_Setting_0=ruleSetting();
                    _fsp--;

                     
                            current = this_Setting_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:611:5: this_Property_1= ruleProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConfigurationElementAccess().getPropertyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleConfigurationElement1089);
                    this_Property_1=ruleProperty();
                    _fsp--;

                     
                            current = this_Property_1; 
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
    // $ANTLR end ruleConfigurationElement


    // $ANTLR start entryRuleAttributeList
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:629:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:630:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:631:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeListRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList1126);
            iv_ruleAttributeList=ruleAttributeList();
            _fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList1136); 

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
    // $ANTLR end entryRuleAttributeList


    // $ANTLR start ruleAttributeList
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:638:1: ruleAttributeList returns [EObject current=null] : ( (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? ) | (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? ) ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject lv_content_3_0 = null;

        EObject this_Reference_4 = null;

        EObject lv_content_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:643:6: ( ( (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? ) | (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:644:1: ( (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? ) | (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:644:1: ( (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? ) | (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=21)||(LA16_0>=24 && LA16_0<=25)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("644:1: ( (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? ) | (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:644:2: (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:644:2: (this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )? )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:645:5: this_SimpleAttribute_0= ruleSimpleAttribute ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeListAccess().getSimpleAttributeParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_ruleAttributeList1184);
                    this_SimpleAttribute_0=ruleSimpleAttribute();
                    _fsp--;

                     
                            current = this_SimpleAttribute_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:653:1: ( () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+ )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==16) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:653:2: () ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+
                            {
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:653:2: ()
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:654:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.add(temp, "content", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAttributeListAccess().getAttributeListContentAction_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:669:2: ( ',' ( (lv_content_3_0= ruleSimpleAttribute ) ) )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==16) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:669:4: ',' ( (lv_content_3_0= ruleSimpleAttribute ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleAttributeList1204); 

                            	            createLeafNode(grammarAccess.getAttributeListAccess().getCommaKeyword_0_1_1_0(), null); 
                            	        
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:673:1: ( (lv_content_3_0= ruleSimpleAttribute ) )
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:674:1: (lv_content_3_0= ruleSimpleAttribute )
                            	    {
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:674:1: (lv_content_3_0= ruleSimpleAttribute )
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:675:3: lv_content_3_0= ruleSimpleAttribute
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getAttributeListAccess().getContentSimpleAttributeParserRuleCall_0_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSimpleAttribute_in_ruleAttributeList1225);
                            	    lv_content_3_0=ruleSimpleAttribute();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getAttributeListRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"content",
                            	    	        		lv_content_3_0, 
                            	    	        		"SimpleAttribute", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:698:6: (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:698:6: (this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )? )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:699:5: this_Reference_4= ruleReference ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeListAccess().getReferenceParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleAttributeList1259);
                    this_Reference_4=ruleReference();
                    _fsp--;

                     
                            current = this_Reference_4; 
                            currentNode = currentNode.getParent();
                        
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:707:1: ( () ( ',' ( (lv_content_7_0= ruleReference ) ) )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==16) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:707:2: () ( ',' ( (lv_content_7_0= ruleReference ) ) )+
                            {
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:707:2: ()
                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:708:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0().getType().getClassifier());
                                    try {
                                    	factory.add(temp, "content", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAttributeListAccess().getAttributeListContentAction_1_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:723:2: ( ',' ( (lv_content_7_0= ruleReference ) ) )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==16) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:723:4: ',' ( (lv_content_7_0= ruleReference ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleAttributeList1279); 

                            	            createLeafNode(grammarAccess.getAttributeListAccess().getCommaKeyword_1_1_1_0(), null); 
                            	        
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:727:1: ( (lv_content_7_0= ruleReference ) )
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:728:1: (lv_content_7_0= ruleReference )
                            	    {
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:728:1: (lv_content_7_0= ruleReference )
                            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:729:3: lv_content_7_0= ruleReference
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getAttributeListAccess().getContentReferenceParserRuleCall_1_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleReference_in_ruleAttributeList1300);
                            	    lv_content_7_0=ruleReference();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getAttributeListRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"content",
                            	    	        		lv_content_7_0, 
                            	    	        		"Reference", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);


                            }
                            break;

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
        }
        return current;
    }
    // $ANTLR end ruleAttributeList


    // $ANTLR start entryRuleProperty
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:759:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:760:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:761:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1341);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1351); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:768:1: ruleProperty returns [EObject current=null] : (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleProperty_0 = null;

        EObject this_PropertyFile_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:773:6: ( (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:774:1: (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:774:1: (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==18) ) {
                    int LA17_2 = input.LA(3);

                    if ( ((LA17_2>=20 && LA17_2<=21)||(LA17_2>=24 && LA17_2<=25)) ) {
                        alt17=2;
                    }
                    else if ( (LA17_2==12||LA17_2==19) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("774:1: (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile )", 17, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==RULE_ID||LA17_1==17) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("774:1: (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile )", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("774:1: (this_SimpleProperty_0= ruleSimpleProperty | this_PropertyFile_1= rulePropertyFile )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:775:5: this_SimpleProperty_0= ruleSimpleProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getSimplePropertyParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleProperty_in_ruleProperty1398);
                    this_SimpleProperty_0=ruleSimpleProperty();
                    _fsp--;

                     
                            current = this_SimpleProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:785:5: this_PropertyFile_1= rulePropertyFile
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getPropertyFileParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertyFile_in_ruleProperty1425);
                    this_PropertyFile_1=rulePropertyFile();
                    _fsp--;

                     
                            current = this_PropertyFile_1; 
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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleSimpleProperty
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:803:1: entryRuleSimpleProperty returns [EObject current=null] : iv_ruleSimpleProperty= ruleSimpleProperty EOF ;
    public final EObject entryRuleSimpleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleProperty = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:804:2: (iv_ruleSimpleProperty= ruleSimpleProperty EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:805:2: iv_ruleSimpleProperty= ruleSimpleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimplePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty1462);
            iv_ruleSimpleProperty=ruleSimpleProperty();
            _fsp--;

             current =iv_ruleSimpleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProperty1472); 

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
    // $ANTLR end entryRuleSimpleProperty


    // $ANTLR start ruleSimpleProperty
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:812:1: ruleSimpleProperty returns [EObject current=null] : ( 'property' ( (lv_name_1_0= ruleFQN ) ) ( (lv_delimiter_2_0= '=' ) ) ( (lv_value_3_0= ruleMWEString ) ) ) ;
    public final EObject ruleSimpleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_delimiter_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:817:6: ( ( 'property' ( (lv_name_1_0= ruleFQN ) ) ( (lv_delimiter_2_0= '=' ) ) ( (lv_value_3_0= ruleMWEString ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:818:1: ( 'property' ( (lv_name_1_0= ruleFQN ) ) ( (lv_delimiter_2_0= '=' ) ) ( (lv_value_3_0= ruleMWEString ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:818:1: ( 'property' ( (lv_name_1_0= ruleFQN ) ) ( (lv_delimiter_2_0= '=' ) ) ( (lv_value_3_0= ruleMWEString ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:818:3: 'property' ( (lv_name_1_0= ruleFQN ) ) ( (lv_delimiter_2_0= '=' ) ) ( (lv_value_3_0= ruleMWEString ) )
            {
            match(input,17,FOLLOW_17_in_ruleSimpleProperty1507); 

                    createLeafNode(grammarAccess.getSimplePropertyAccess().getPropertyKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:822:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:823:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:823:1: (lv_name_1_0= ruleFQN )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:824:3: lv_name_1_0= ruleFQN
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimplePropertyAccess().getNameFQNParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleSimpleProperty1528);
            lv_name_1_0=ruleFQN();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimplePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"FQN", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:846:2: ( (lv_delimiter_2_0= '=' ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:847:1: (lv_delimiter_2_0= '=' )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:847:1: (lv_delimiter_2_0= '=' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:848:3: lv_delimiter_2_0= '='
            {
            lv_delimiter_2_0=(Token)input.LT(1);
            match(input,12,FOLLOW_12_in_ruleSimpleProperty1546); 

                    createLeafNode(grammarAccess.getSimplePropertyAccess().getDelimiterEqualsSignKeyword_2_0(), "delimiter"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimplePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "delimiter", lv_delimiter_2_0, "=", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:867:2: ( (lv_value_3_0= ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:868:1: (lv_value_3_0= ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:868:1: (lv_value_3_0= ruleMWEString )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:869:3: lv_value_3_0= ruleMWEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimplePropertyAccess().getValueMWEStringParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMWEString_in_ruleSimpleProperty1580);
            lv_value_3_0=ruleMWEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimplePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"MWEString", 
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
    // $ANTLR end ruleSimpleProperty


    // $ANTLR start entryRulePropertyFile
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:899:1: entryRulePropertyFile returns [EObject current=null] : iv_rulePropertyFile= rulePropertyFile EOF ;
    public final EObject entryRulePropertyFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFile = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:900:2: (iv_rulePropertyFile= rulePropertyFile EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:901:2: iv_rulePropertyFile= rulePropertyFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyFileRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyFile_in_entryRulePropertyFile1616);
            iv_rulePropertyFile=rulePropertyFile();
            _fsp--;

             current =iv_rulePropertyFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFile1626); 

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
    // $ANTLR end entryRulePropertyFile


    // $ANTLR start rulePropertyFile
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:908:1: rulePropertyFile returns [EObject current=null] : ( 'property' ( (lv_fileRef_1_0= ruleFileRef ) ) ) ;
    public final EObject rulePropertyFile() throws RecognitionException {
        EObject current = null;

        EObject lv_fileRef_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:913:6: ( ( 'property' ( (lv_fileRef_1_0= ruleFileRef ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:914:1: ( 'property' ( (lv_fileRef_1_0= ruleFileRef ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:914:1: ( 'property' ( (lv_fileRef_1_0= ruleFileRef ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:914:3: 'property' ( (lv_fileRef_1_0= ruleFileRef ) )
            {
            match(input,17,FOLLOW_17_in_rulePropertyFile1661); 

                    createLeafNode(grammarAccess.getPropertyFileAccess().getPropertyKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:918:1: ( (lv_fileRef_1_0= ruleFileRef ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:919:1: (lv_fileRef_1_0= ruleFileRef )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:919:1: (lv_fileRef_1_0= ruleFileRef )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:920:3: lv_fileRef_1_0= ruleFileRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyFileAccess().getFileRefFileRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFileRef_in_rulePropertyFile1682);
            lv_fileRef_1_0=ruleFileRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"fileRef",
            	        		lv_fileRef_1_0, 
            	        		"FileRef", 
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
    // $ANTLR end rulePropertyFile


    // $ANTLR start entryRuleAttribute
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:950:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:951:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:952:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1718);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1728); 

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:959:1: ruleAttribute returns [EObject current=null] : (this_SimpleAttribute_0= ruleSimpleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject this_Reference_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:964:6: ( (this_SimpleAttribute_0= ruleSimpleAttribute | this_Reference_1= ruleReference ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:965:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_Reference_1= ruleReference )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:965:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_Reference_1= ruleReference )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=21)||(LA18_0>=24 && LA18_0<=25)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("965:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_Reference_1= ruleReference )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:966:5: this_SimpleAttribute_0= ruleSimpleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_ruleAttribute1775);
                    this_SimpleAttribute_0=ruleSimpleAttribute();
                    _fsp--;

                     
                            current = this_SimpleAttribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:976:5: this_Reference_1= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleAttribute1802);
                    this_Reference_1=ruleReference();
                    _fsp--;

                     
                            current = this_Reference_1; 
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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleSimpleAttribute
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:992:1: entryRuleSimpleAttribute returns [EObject current=null] : iv_ruleSimpleAttribute= ruleSimpleAttribute EOF ;
    public final EObject entryRuleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttribute = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:993:2: (iv_ruleSimpleAttribute= ruleSimpleAttribute EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:994:2: iv_ruleSimpleAttribute= ruleSimpleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1837);
            iv_ruleSimpleAttribute=ruleSimpleAttribute();
            _fsp--;

             current =iv_ruleSimpleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute1847); 

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
    // $ANTLR end entryRuleSimpleAttribute


    // $ANTLR start ruleSimpleAttribute
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1001:1: ruleSimpleAttribute returns [EObject current=null] : ( (lv_value_0_0= ruleMWEString ) ) ;
    public final EObject ruleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1006:6: ( ( (lv_value_0_0= ruleMWEString ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1007:1: ( (lv_value_0_0= ruleMWEString ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1007:1: ( (lv_value_0_0= ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1008:1: (lv_value_0_0= ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1008:1: (lv_value_0_0= ruleMWEString )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1009:3: lv_value_0_0= ruleMWEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSimpleAttributeAccess().getValueMWEStringParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMWEString_in_ruleSimpleAttribute1892);
            lv_value_0_0=ruleMWEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleAttributeRule().getType().getClassifier());
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
    // $ANTLR end ruleSimpleAttribute


    // $ANTLR start entryRuleReference
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1039:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1040:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1041:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1927);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1937); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1048:1: ruleReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1053:6: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1054:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1054:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1055:1: ( RULE_ID )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1055:1: ( RULE_ID )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1056:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1979); 

            		createLeafNode(grammarAccess.getReferenceAccess().getComponentComponentCrossReference_0(), "component"); 
            	

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


    // $ANTLR start entryRuleValidID
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1076:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1077:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1078:2: iv_ruleValidID= ruleValidID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValidIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID2015);
            iv_ruleValidID=ruleValidID();
            _fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID2026); 

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
    // $ANTLR end entryRuleValidID


    // $ANTLR start ruleValidID
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1085:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'property' | kw= 'file' ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1090:6: ( (this_ID_0= RULE_ID | kw= 'property' | kw= 'file' ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1091:1: (this_ID_0= RULE_ID | kw= 'property' | kw= 'file' )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1091:1: (this_ID_0= RULE_ID | kw= 'property' | kw= 'file' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                alt19=2;
                }
                break;
            case 18:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1091:1: (this_ID_0= RULE_ID | kw= 'property' | kw= 'file' )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1091:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2066); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1100:2: kw= 'property'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleValidID2090); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getValidIDAccess().getPropertyKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1107:2: kw= 'file'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleValidID2109); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getValidIDAccess().getFileKeyword_2(), null); 
                        

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
    // $ANTLR end ruleValidID


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1120:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1121:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1122:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2150);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2161); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1129:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1134:6: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1135:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1135:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1136:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleFQN2208);
            this_ValidID_0=ruleValidID();
            _fsp--;


            		current.merge(this_ValidID_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1146:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1147:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,19,FOLLOW_19_in_ruleFQN2227); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	     
            	            currentNode=createCompositeNode(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleFQN2249);
            	    this_ValidID_2=ruleValidID();
            	    _fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1173:1: entryRuleMWEString returns [EObject current=null] : iv_ruleMWEString= ruleMWEString EOF ;
    public final EObject entryRuleMWEString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMWEString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1177:2: (iv_ruleMWEString= ruleMWEString EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1178:2: iv_ruleMWEString= ruleMWEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMWEStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleMWEString_in_entryRuleMWEString2304);
            iv_ruleMWEString=ruleMWEString();
            _fsp--;

             current =iv_ruleMWEString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEString2314); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1188:1: ruleMWEString returns [EObject current=null] : ( ( (lv_parts_0_0= ruleBoolean ) ) | ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) ) ) ;
    public final EObject ruleMWEString() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;

        AntlrDatatypeRuleToken lv_begin_1_0 = null;

        EObject lv_parts_2_0 = null;

        AntlrDatatypeRuleToken lv_end_3_0 = null;

        AntlrDatatypeRuleToken lv_begin_4_0 = null;

        EObject lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_end_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1194:6: ( ( ( (lv_parts_0_0= ruleBoolean ) ) | ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1195:1: ( ( (lv_parts_0_0= ruleBoolean ) ) | ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1195:1: ( ( (lv_parts_0_0= ruleBoolean ) ) | ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt23=1;
                }
                break;
            case 24:
                {
                alt23=2;
                }
                break;
            case 25:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1195:1: ( ( (lv_parts_0_0= ruleBoolean ) ) | ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) ) | ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1195:2: ( (lv_parts_0_0= ruleBoolean ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1195:2: ( (lv_parts_0_0= ruleBoolean ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1196:1: (lv_parts_0_0= ruleBoolean )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1196:1: (lv_parts_0_0= ruleBoolean )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1197:3: lv_parts_0_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getPartsBooleanParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBoolean_in_ruleMWEString2364);
                    lv_parts_0_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"parts",
                    	        		lv_parts_0_0, 
                    	        		"Boolean", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1220:6: ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1220:6: ( ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1220:7: ( (lv_begin_1_0= ruleSingleQuote ) ) ( (lv_parts_2_0= ruleMWEStringPart ) )* ( (lv_end_3_0= ruleSingleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1220:7: ( (lv_begin_1_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1221:1: (lv_begin_1_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1221:1: (lv_begin_1_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1222:3: lv_begin_1_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getBeginSingleQuoteParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleMWEString2392);
                    lv_begin_1_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_1_0, 
                    	        		"SingleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1244:2: ( (lv_parts_2_0= ruleMWEStringPart ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_ANY_OTHER)||LA21_0==9||LA21_0==12||(LA21_0>=14 && LA21_0<=15)||(LA21_0>=17 && LA21_0<=23)||LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1245:1: (lv_parts_2_0= ruleMWEStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1245:1: (lv_parts_2_0= ruleMWEStringPart )
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1246:3: lv_parts_2_0= ruleMWEStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMWEStringPart_in_ruleMWEString2413);
                    	    lv_parts_2_0=ruleMWEStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_2_0, 
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
                    	    break loop21;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1268:3: ( (lv_end_3_0= ruleSingleQuote ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1269:1: (lv_end_3_0= ruleSingleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1269:1: (lv_end_3_0= ruleSingleQuote )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1270:3: lv_end_3_0= ruleSingleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getEndSingleQuoteParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSingleQuote_in_ruleMWEString2435);
                    lv_end_3_0=ruleSingleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_3_0, 
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
                case 3 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1293:6: ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1293:6: ( ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1293:7: ( (lv_begin_4_0= ruleDoubleQuote ) ) ( (lv_parts_5_0= ruleMWEStringPart ) )* ( (lv_end_6_0= ruleDoubleQuote ) )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1293:7: ( (lv_begin_4_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1294:1: (lv_begin_4_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1294:1: (lv_begin_4_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1295:3: lv_begin_4_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getBeginDoubleQuoteParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleMWEString2464);
                    lv_begin_4_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"begin",
                    	        		lv_begin_4_0, 
                    	        		"DoubleQuote", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1317:2: ( (lv_parts_5_0= ruleMWEStringPart ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_ANY_OTHER)||LA22_0==9||LA22_0==12||(LA22_0>=14 && LA22_0<=15)||(LA22_0>=17 && LA22_0<=23)||LA22_0==26) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1318:1: (lv_parts_5_0= ruleMWEStringPart )
                    	    {
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1318:1: (lv_parts_5_0= ruleMWEStringPart )
                    	    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1319:3: lv_parts_5_0= ruleMWEStringPart
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getPartsMWEStringPartParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMWEStringPart_in_ruleMWEString2485);
                    	    lv_parts_5_0=ruleMWEStringPart();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_5_0, 
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
                    	    break loop22;
                        }
                    } while (true);

                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1341:3: ( (lv_end_6_0= ruleDoubleQuote ) )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1342:1: (lv_end_6_0= ruleDoubleQuote )
                    {
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1342:1: (lv_end_6_0= ruleDoubleQuote )
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1343:3: lv_end_6_0= ruleDoubleQuote
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMWEStringAccess().getEndDoubleQuoteParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoubleQuote_in_ruleMWEString2507);
                    lv_end_6_0=ruleDoubleQuote();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMWEStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"end",
                    	        		lv_end_6_0, 
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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1378:1: entryRuleMWEStringPart returns [EObject current=null] : iv_ruleMWEStringPart= ruleMWEStringPart EOF ;
    public final EObject entryRuleMWEStringPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMWEStringPart = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1379:2: (iv_ruleMWEStringPart= ruleMWEStringPart EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1380:2: iv_ruleMWEStringPart= ruleMWEStringPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMWEStringPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart2550);
            iv_ruleMWEStringPart=ruleMWEStringPart();
            _fsp--;

             current =iv_ruleMWEStringPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMWEStringPart2560); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1387:1: ruleMWEStringPart returns [EObject current=null] : (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString ) ;
    public final EObject ruleMWEStringPart() throws RecognitionException {
        EObject current = null;

        EObject this_ReplaceableString_0 = null;

        EObject this_PlainString_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1392:6: ( (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1393:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1393:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_ANY_OTHER)||LA24_0==9||LA24_0==12||(LA24_0>=14 && LA24_0<=15)||(LA24_0>=17 && LA24_0<=21)||LA24_0==23||LA24_0==26) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1393:1: (this_ReplaceableString_0= ruleReplaceableString | this_PlainString_1= rulePlainString )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1394:5: this_ReplaceableString_0= ruleReplaceableString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMWEStringPartAccess().getReplaceableStringParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReplaceableString_in_ruleMWEStringPart2607);
                    this_ReplaceableString_0=ruleReplaceableString();
                    _fsp--;

                     
                            current = this_ReplaceableString_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1404:5: this_PlainString_1= rulePlainString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMWEStringPartAccess().getPlainStringParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePlainString_in_ruleMWEStringPart2634);
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


    // $ANTLR start entryRuleBoolean
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1420:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1421:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1422:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2669);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2679); 

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
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1429:1: ruleBoolean returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1434:6: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1435:1: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1435:1: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1435:2: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1435:2: ()
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1436:5: 
            {
             
                    temp=factory.create(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBooleanAccess().getBooleanStringPartAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1446:2: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1447:1: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1447:1: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1448:1: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1448:1: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            else if ( (LA25_0==21) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1448:1: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1449:3: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleBoolean2733); 

                            createLeafNode(grammarAccess.getBooleanAccess().getValueTrueKeyword_1_0_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_1_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1467:8: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleBoolean2762); 

                            createLeafNode(grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0_1(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_1_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


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
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleReplaceableString
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1496:1: entryRuleReplaceableString returns [EObject current=null] : iv_ruleReplaceableString= ruleReplaceableString EOF ;
    public final EObject entryRuleReplaceableString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceableString = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1497:2: (iv_ruleReplaceableString= ruleReplaceableString EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1498:2: iv_ruleReplaceableString= ruleReplaceableString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReplaceableStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString2814);
            iv_ruleReplaceableString=ruleReplaceableString();
            _fsp--;

             current =iv_ruleReplaceableString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableString2824); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1505:1: ruleReplaceableString returns [EObject current=null] : ( '${' ( (lv_property_1_0= rulePropertyReference ) ) '}' ) ;
    public final EObject ruleReplaceableString() throws RecognitionException {
        EObject current = null;

        EObject lv_property_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1510:6: ( ( '${' ( (lv_property_1_0= rulePropertyReference ) ) '}' ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1511:1: ( '${' ( (lv_property_1_0= rulePropertyReference ) ) '}' )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1511:1: ( '${' ( (lv_property_1_0= rulePropertyReference ) ) '}' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1511:3: '${' ( (lv_property_1_0= rulePropertyReference ) ) '}'
            {
            match(input,22,FOLLOW_22_in_ruleReplaceableString2859); 

                    createLeafNode(grammarAccess.getReplaceableStringAccess().getDollarSignLeftCurlyBracketKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1515:1: ( (lv_property_1_0= rulePropertyReference ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1516:1: (lv_property_1_0= rulePropertyReference )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1516:1: (lv_property_1_0= rulePropertyReference )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1517:3: lv_property_1_0= rulePropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReplaceableStringAccess().getPropertyPropertyReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePropertyReference_in_ruleReplaceableString2880);
            lv_property_1_0=rulePropertyReference();
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
            	        		"PropertyReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleReplaceableString2890); 

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


    // $ANTLR start entryRulePropertyReference
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1551:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1555:2: (iv_rulePropertyReference= rulePropertyReference EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1556:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyReference_in_entryRulePropertyReference2932);
            iv_rulePropertyReference=rulePropertyReference();
            _fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReference2942); 

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
    // $ANTLR end entryRulePropertyReference


    // $ANTLR start rulePropertyReference
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1566:1: rulePropertyReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1572:6: ( ( ( ruleFQN ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1573:1: ( ( ruleFQN ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1573:1: ( ( ruleFQN ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1574:1: ( ruleFQN )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1574:1: ( ruleFQN )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1575:3: ruleFQN
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryCrossReference_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePropertyReference2993);
            ruleFQN();
            _fsp--;

             
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
    // $ANTLR end rulePropertyReference


    // $ANTLR start entryRulePlainString
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1600:1: entryRulePlainString returns [EObject current=null] : iv_rulePlainString= rulePlainString EOF ;
    public final EObject entryRulePlainString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainString = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1601:2: (iv_rulePlainString= rulePlainString EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1602:2: iv_rulePlainString= rulePlainString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlainStringRule(), currentNode); 
            pushFollow(FOLLOW_rulePlainString_in_entryRulePlainString3032);
            iv_rulePlainString=rulePlainString();
            _fsp--;

             current =iv_rulePlainString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainString3042); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1609:1: rulePlainString returns [EObject current=null] : ( (lv_value_0_0= ruleConstantValue ) ) ;
    public final EObject rulePlainString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1614:6: ( ( (lv_value_0_0= ruleConstantValue ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1615:1: ( (lv_value_0_0= ruleConstantValue ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1615:1: ( (lv_value_0_0= ruleConstantValue ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1616:1: (lv_value_0_0= ruleConstantValue )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1616:1: (lv_value_0_0= ruleConstantValue )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1617:3: lv_value_0_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_rulePlainString3087);
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


    // $ANTLR start entryRuleFileRef
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1647:1: entryRuleFileRef returns [EObject current=null] : iv_ruleFileRef= ruleFileRef EOF ;
    public final EObject entryRuleFileRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1651:2: (iv_ruleFileRef= ruleFileRef EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1652:2: iv_ruleFileRef= ruleFileRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleFileRef_in_entryRuleFileRef3128);
            iv_ruleFileRef=ruleFileRef();
            _fsp--;

             current =iv_ruleFileRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileRef3138); 

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
    // $ANTLR end entryRuleFileRef


    // $ANTLR start ruleFileRef
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1662:1: ruleFileRef returns [EObject current=null] : ( 'file' ( (lv_filePath_1_0= ruleMWEString ) ) ) ;
    public final EObject ruleFileRef() throws RecognitionException {
        EObject current = null;

        EObject lv_filePath_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1668:6: ( ( 'file' ( (lv_filePath_1_0= ruleMWEString ) ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1669:1: ( 'file' ( (lv_filePath_1_0= ruleMWEString ) ) )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1669:1: ( 'file' ( (lv_filePath_1_0= ruleMWEString ) ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1669:3: 'file' ( (lv_filePath_1_0= ruleMWEString ) )
            {
            match(input,18,FOLLOW_18_in_ruleFileRef3177); 

                    createLeafNode(grammarAccess.getFileRefAccess().getFileKeyword_0(), null); 
                
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1673:1: ( (lv_filePath_1_0= ruleMWEString ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1674:1: (lv_filePath_1_0= ruleMWEString )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1674:1: (lv_filePath_1_0= ruleMWEString )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1675:3: lv_filePath_1_0= ruleMWEString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFileRefAccess().getFilePathMWEStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMWEString_in_ruleFileRef3198);
            lv_filePath_1_0=ruleMWEString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"filePath",
            	        		lv_filePath_1_0, 
            	        		"MWEString", 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleFileRef


    // $ANTLR start entryRuleConstantValue
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1708:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1709:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1710:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue3239);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue3250); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1717:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ANY_OTHER_6=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Colon_1 = null;

        AntlrDatatypeRuleToken this_OpeningBrace_2 = null;

        AntlrDatatypeRuleToken this_ClosingBrace_3 = null;

        AntlrDatatypeRuleToken this_EscapedDoubleQuote_4 = null;

        AntlrDatatypeRuleToken this_EscapedSingleQuote_5 = null;

        AntlrDatatypeRuleToken this_EscapedBackslash_7 = null;

        AntlrDatatypeRuleToken this_ValidID_8 = null;

        AntlrDatatypeRuleToken this_Dot_13 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1722:6: ( (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1723:1: (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1723:1: (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot )
            int alt26=14;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt26=1;
                }
                break;
            case 23:
                {
                alt26=2;
                }
                break;
            case 14:
                {
                alt26=3;
                }
                break;
            case 15:
                {
                alt26=4;
                }
                break;
            case 26:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt26=8;
                    }
                    break;
                case 25:
                    {
                    alt26=5;
                    }
                    break;
                case 24:
                    {
                    alt26=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1723:1: (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot )", 26, 5, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ANY_OTHER:
                {
                alt26=7;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
                {
                alt26=9;
                }
                break;
            case 20:
                {
                alt26=10;
                }
                break;
            case 21:
                {
                alt26=11;
                }
                break;
            case 12:
                {
                alt26=12;
                }
                break;
            case 9:
                {
                alt26=13;
                }
                break;
            case 19:
                {
                alt26=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1723:1: (this_WS_0= RULE_WS | this_Colon_1= ruleColon | this_OpeningBrace_2= ruleOpeningBrace | this_ClosingBrace_3= ruleClosingBrace | this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote | this_EscapedSingleQuote_5= ruleEscapedSingleQuote | this_ANY_OTHER_6= RULE_ANY_OTHER | this_EscapedBackslash_7= ruleEscapedBackslash | this_ValidID_8= ruleValidID | kw= 'true' | kw= 'false' | kw= '=' | kw= 'import' | this_Dot_13= ruleDot )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1723:6: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleConstantValue3290); 

                    		current.merge(this_WS_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1732:5: this_Colon_1= ruleColon
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getColonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleColon_in_ruleConstantValue3323);
                    this_Colon_1=ruleColon();
                    _fsp--;


                    		current.merge(this_Colon_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1744:5: this_OpeningBrace_2= ruleOpeningBrace
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getOpeningBraceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOpeningBrace_in_ruleConstantValue3356);
                    this_OpeningBrace_2=ruleOpeningBrace();
                    _fsp--;


                    		current.merge(this_OpeningBrace_2);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1756:5: this_ClosingBrace_3= ruleClosingBrace
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getClosingBraceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClosingBrace_in_ruleConstantValue3389);
                    this_ClosingBrace_3=ruleClosingBrace();
                    _fsp--;


                    		current.merge(this_ClosingBrace_3);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1768:5: this_EscapedDoubleQuote_4= ruleEscapedDoubleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedDoubleQuoteParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue3422);
                    this_EscapedDoubleQuote_4=ruleEscapedDoubleQuote();
                    _fsp--;


                    		current.merge(this_EscapedDoubleQuote_4);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1780:5: this_EscapedSingleQuote_5= ruleEscapedSingleQuote
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedSingleQuoteParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue3455);
                    this_EscapedSingleQuote_5=ruleEscapedSingleQuote();
                    _fsp--;


                    		current.merge(this_EscapedSingleQuote_5);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1791:10: this_ANY_OTHER_6= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_6=(Token)input.LT(1);
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue3481); 

                    		current.merge(this_ANY_OTHER_6);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getANY_OTHERTerminalRuleCall_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1800:5: this_EscapedBackslash_7= ruleEscapedBackslash
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getEscapedBackslashParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEscapedBackslash_in_ruleConstantValue3514);
                    this_EscapedBackslash_7=ruleEscapedBackslash();
                    _fsp--;


                    		current.merge(this_EscapedBackslash_7);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1812:5: this_ValidID_8= ruleValidID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getValidIDParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleValidID_in_ruleConstantValue3547);
                    this_ValidID_8=ruleValidID();
                    _fsp--;


                    		current.merge(this_ValidID_8);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1824:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleConstantValue3571); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getTrueKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1831:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleConstantValue3590); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getFalseKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1838:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleConstantValue3609); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getEqualsSignKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1845:2: kw= 'import'
                    {
                    kw=(Token)input.LT(1);
                    match(input,9,FOLLOW_9_in_ruleConstantValue3628); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getConstantValueAccess().getImportKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1852:5: this_Dot_13= ruleDot
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstantValueAccess().getDotParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDot_in_ruleConstantValue3656);
                    this_Dot_13=ruleDot();
                    _fsp--;


                    		current.merge(this_Dot_13);
                        
                     
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
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleColon
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1870:1: entryRuleColon returns [String current=null] : iv_ruleColon= ruleColon EOF ;
    public final String entryRuleColon() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColon = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1871:2: (iv_ruleColon= ruleColon EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1872:2: iv_ruleColon= ruleColon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColonRule(), currentNode); 
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon3702);
            iv_ruleColon=ruleColon();
            _fsp--;

             current =iv_ruleColon.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon3713); 

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
    // $ANTLR end entryRuleColon


    // $ANTLR start ruleColon
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1879:1: ruleColon returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleColon() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1884:6: (kw= ':' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1886:2: kw= ':'
            {
            kw=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleColon3750); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getColonAccess().getColonKeyword(), null); 
                

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
    // $ANTLR end ruleColon


    // $ANTLR start entryRuleDot
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1899:1: entryRuleDot returns [String current=null] : iv_ruleDot= ruleDot EOF ;
    public final String entryRuleDot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDot = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1900:2: (iv_ruleDot= ruleDot EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1901:2: iv_ruleDot= ruleDot EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDotRule(), currentNode); 
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot3790);
            iv_ruleDot=ruleDot();
            _fsp--;

             current =iv_ruleDot.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot3801); 

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
    // $ANTLR end entryRuleDot


    // $ANTLR start ruleDot
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1908:1: ruleDot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleDot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1913:6: (kw= '.' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1915:2: kw= '.'
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleDot3838); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getDotAccess().getFullStopKeyword(), null); 
                

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
    // $ANTLR end ruleDot


    // $ANTLR start entryRuleSingleQuote
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1928:1: entryRuleSingleQuote returns [String current=null] : iv_ruleSingleQuote= ruleSingleQuote EOF ;
    public final String entryRuleSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleQuote = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1929:2: (iv_ruleSingleQuote= ruleSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1930:2: iv_ruleSingleQuote= ruleSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote3878);
            iv_ruleSingleQuote=ruleSingleQuote();
            _fsp--;

             current =iv_ruleSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuote3889); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1937:1: ruleSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1942:6: (kw= '\\'' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1944:2: kw= '\\''
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleSingleQuote3926); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1957:1: entryRuleEscapedSingleQuote returns [String current=null] : iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF ;
    public final String entryRuleEscapedSingleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedSingleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1961:2: (iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1962:2: iv_ruleEscapedSingleQuote= ruleEscapedSingleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedSingleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote3972);
            iv_ruleEscapedSingleQuote=ruleEscapedSingleQuote();
            _fsp--;

             current =iv_ruleEscapedSingleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedSingleQuote3983); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1972:1: ruleEscapedSingleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedSingleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_SingleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1978:6: ( (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1979:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1979:1: (this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:1980:5: this_Backslash_0= ruleBackslash this_SingleQuote_1= ruleSingleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote4034);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedSingleQuoteAccess().getSingleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote4061);
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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2012:1: entryRuleDoubleQuote returns [String current=null] : iv_ruleDoubleQuote= ruleDoubleQuote EOF ;
    public final String entryRuleDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDoubleQuote = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2013:2: (iv_ruleDoubleQuote= ruleDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2014:2: iv_ruleDoubleQuote= ruleDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote4111);
            iv_ruleDoubleQuote=ruleDoubleQuote();
            _fsp--;

             current =iv_ruleDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuote4122); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2021:1: ruleDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\"' ;
    public final AntlrDatatypeRuleToken ruleDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2026:6: (kw= '\"' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2028:2: kw= '\"'
            {
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleDoubleQuote4159); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2041:1: entryRuleEscapedDoubleQuote returns [String current=null] : iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF ;
    public final String entryRuleEscapedDoubleQuote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedDoubleQuote = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2045:2: (iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2046:2: iv_ruleEscapedDoubleQuote= ruleEscapedDoubleQuote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedDoubleQuoteRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote4205);
            iv_ruleEscapedDoubleQuote=ruleEscapedDoubleQuote();
            _fsp--;

             current =iv_ruleEscapedDoubleQuote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedDoubleQuote4216); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2056:1: ruleEscapedDoubleQuote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) ;
    public final AntlrDatatypeRuleToken ruleEscapedDoubleQuote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_DoubleQuote_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2062:6: ( (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2063:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2063:1: (this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2064:5: this_Backslash_0= ruleBackslash this_DoubleQuote_1= ruleDoubleQuote
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote4267);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedDoubleQuoteAccess().getDoubleQuoteParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote4294);
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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2096:1: entryRuleBackslash returns [String current=null] : iv_ruleBackslash= ruleBackslash EOF ;
    public final String entryRuleBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackslash = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2097:2: (iv_ruleBackslash= ruleBackslash EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2098:2: iv_ruleBackslash= ruleBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleBackslash_in_entryRuleBackslash4344);
            iv_ruleBackslash=ruleBackslash();
            _fsp--;

             current =iv_ruleBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackslash4355); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2105:1: ruleBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\\\' ;
    public final AntlrDatatypeRuleToken ruleBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2110:6: (kw= '\\\\' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2112:2: kw= '\\\\'
            {
            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleBackslash4392); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2125:1: entryRuleEscapedBackslash returns [String current=null] : iv_ruleEscapedBackslash= ruleEscapedBackslash EOF ;
    public final String entryRuleEscapedBackslash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEscapedBackslash = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2129:2: (iv_ruleEscapedBackslash= ruleEscapedBackslash EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2130:2: iv_ruleEscapedBackslash= ruleEscapedBackslash EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEscapedBackslashRule(), currentNode); 
            pushFollow(FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash4438);
            iv_ruleEscapedBackslash=ruleEscapedBackslash();
            _fsp--;

             current =iv_ruleEscapedBackslash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscapedBackslash4449); 

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
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2140:1: ruleEscapedBackslash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) ;
    public final AntlrDatatypeRuleToken ruleEscapedBackslash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Backslash_0 = null;

        AntlrDatatypeRuleToken this_Backslash_1 = null;


         setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2146:6: ( (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash ) )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2147:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2147:1: (this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2148:5: this_Backslash_0= ruleBackslash this_Backslash_1= ruleBackslash
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash4500);
            this_Backslash_0=ruleBackslash();
            _fsp--;


            		current.merge(this_Backslash_0);
                
             
                    currentNode = currentNode.getParent();
                
             
                    currentNode=createCompositeNode(grammarAccess.getEscapedBackslashAccess().getBackslashParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleBackslash_in_ruleEscapedBackslash4527);
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


    // $ANTLR start entryRuleOpeningBrace
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2180:1: entryRuleOpeningBrace returns [String current=null] : iv_ruleOpeningBrace= ruleOpeningBrace EOF ;
    public final String entryRuleOpeningBrace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpeningBrace = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2181:2: (iv_ruleOpeningBrace= ruleOpeningBrace EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2182:2: iv_ruleOpeningBrace= ruleOpeningBrace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOpeningBraceRule(), currentNode); 
            pushFollow(FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace4577);
            iv_ruleOpeningBrace=ruleOpeningBrace();
            _fsp--;

             current =iv_ruleOpeningBrace.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpeningBrace4588); 

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
    // $ANTLR end entryRuleOpeningBrace


    // $ANTLR start ruleOpeningBrace
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2189:1: ruleOpeningBrace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleOpeningBrace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2194:6: (kw= '{' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2196:2: kw= '{'
            {
            kw=(Token)input.LT(1);
            match(input,14,FOLLOW_14_in_ruleOpeningBrace4625); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getOpeningBraceAccess().getLeftCurlyBracketKeyword(), null); 
                

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
    // $ANTLR end ruleOpeningBrace


    // $ANTLR start entryRuleClosingBrace
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2209:1: entryRuleClosingBrace returns [String current=null] : iv_ruleClosingBrace= ruleClosingBrace EOF ;
    public final String entryRuleClosingBrace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClosingBrace = null;


        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2210:2: (iv_ruleClosingBrace= ruleClosingBrace EOF )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2211:2: iv_ruleClosingBrace= ruleClosingBrace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClosingBraceRule(), currentNode); 
            pushFollow(FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace4665);
            iv_ruleClosingBrace=ruleClosingBrace();
            _fsp--;

             current =iv_ruleClosingBrace.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosingBrace4676); 

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
    // $ANTLR end entryRuleClosingBrace


    // $ANTLR start ruleClosingBrace
    // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2218:1: ruleClosingBrace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleClosingBrace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2223:6: (kw= '}' )
            // ../org.eclipse.emf.mwe.concept/src-gen/org/eclipse/emf/mwe/concept/parser/antlr/internal/InternalMWEConcept.g:2225:2: kw= '}'
            {
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleClosingBrace4713); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getClosingBraceAccess().getRightCurlyBracketKeyword(), null); 
                

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
    // $ANTLR end ruleClosingBrace


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\105\uffff";
    static final String DFA11_eofS =
        "\10\uffff\2\7\24\uffff\1\7\17\uffff\1\7\26\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\1\4\3\12\1\4\1\uffff\4\4\3\12\5\4\1\30\17\4\1\30\12"+
        "\4\3\17\3\4\3\17\7\4\6\17";
    static final String DFA11_maxS =
        "\1\22\1\uffff\1\22\2\23\1\31\1\22\1\uffff\2\22\2\32\3\23\1\22\16"+
        "\32\2\22\16\32\1\22\3\23\3\32\3\23\3\32\1\22\1\32\1\22\1\32\6\23";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\75\uffff";
    static final String DFA11_specialS =
        "\105\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\14\uffff\1\2\1\1",
            "",
            "\1\3\5\uffff\1\1\1\uffff\3\1\2\uffff\1\4\1\5",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6\1\10\1\11\2\uffff\1\12\1\13",
            "\1\14\14\uffff\1\15\1\16",
            "",
            "\1\7\5\uffff\1\1\2\uffff\2\1\1\7\1\uffff\2\7",
            "\1\7\5\uffff\1\1\2\uffff\2\1\1\7\1\uffff\2\7",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6",
            "\1\1\1\uffff\1\7\2\1\4\uffff\1\6",
            "\1\57\14\uffff\1\60\1\61",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\63\1\62\1\64",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\7\5\uffff\1\1\2\uffff\2\1\1\7\1\uffff\2\7",
            "\1\65\14\uffff\1\66\1\67",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\72\1\71\1\70",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\7\5\uffff\1\1\2\uffff\2\1\1\7\1\uffff\2\7",
            "\1\74\3\uffff\1\73",
            "\1\74\3\uffff\1\73",
            "\1\74\3\uffff\1\73",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\76\3\uffff\1\75",
            "\1\76\3\uffff\1\75",
            "\1\76\3\uffff\1\75",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\77\14\uffff\1\100\1\101",
            "\1\26\1\20\1\25\2\uffff\1\34\2\uffff\1\33\1\uffff\1\22\1\23"+
            "\1\uffff\1\27\1\30\1\35\1\31\1\32\1\17\1\21\1\36\1\uffff\1\24",
            "\1\102\14\uffff\1\103\1\104",
            "\1\46\1\40\1\45\2\uffff\1\54\2\uffff\1\53\1\uffff\1\42\1\43"+
            "\1\uffff\1\47\1\50\1\55\1\51\1\52\1\37\1\41\1\uffff\1\56\1\44",
            "\1\74\3\uffff\1\73",
            "\1\74\3\uffff\1\73",
            "\1\74\3\uffff\1\73",
            "\1\76\3\uffff\1\75",
            "\1\76\3\uffff\1\75",
            "\1\76\3\uffff\1\75"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "600:1: (this_Setting_0= ruleSetting | this_Property_1= ruleProperty )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMWEFile_in_entryRuleMWEFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMWEFile140 = new BitSet(new long[]{0x0000000000060210L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_ruleMWEFile162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleImport243 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_ruleImport264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportedFQN_in_entryRuleImportedFQN311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportedFQN322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportedFQN369 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleImportedFQN388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetting440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleSetting488 = new BitSet(new long[]{0x0000000000067410L});
    public static final BitSet FOLLOW_12_in_ruleSetting500 = new BitSet(new long[]{0x0000000003300010L});
    public static final BitSet FOLLOW_ruleAttributeList_in_ruleSetting521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSetting549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponent654 = new BitSet(new long[]{0x0000000000006400L});
    public static final BitSet FOLLOW_ruleFileRef_in_ruleComponent681 = new BitSet(new long[]{0x0000000000006400L});
    public static final BitSet FOLLOW_13_in_ruleComponent694 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponent715 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_10_in_ruleComponent728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent745 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleComponent766 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_15_in_ruleComponent777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentWithType_in_entryRuleComponentWithType815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentWithType825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleComponentWithType873 = new BitSet(new long[]{0x0000000000006400L});
    public static final BitSet FOLLOW_13_in_ruleComponentWithType884 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponentWithType905 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_10_in_ruleComponentWithType918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponentWithType935 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleComponentWithType956 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_15_in_ruleComponentWithType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetting_in_ruleConfigurationElement1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleConfigurationElement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList1126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttributeList1184 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAttributeList1204 = new BitSet(new long[]{0x0000000003300000L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttributeList1225 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttributeList1259 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAttributeList1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttributeList1300 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_ruleProperty1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_ruleProperty1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProperty_in_entryRuleSimpleProperty1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProperty1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleProperty1507 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSimpleProperty1528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleProperty1546 = new BitSet(new long[]{0x0000000003300000L});
    public static final BitSet FOLLOW_ruleMWEString_in_ruleSimpleProperty1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFile_in_entryRulePropertyFile1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFile1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePropertyFile1661 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleFileRef_in_rulePropertyFile1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttribute1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEString_in_ruleSimpleAttribute1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleValidID2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleValidID2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFQN2208 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFQN2227 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFQN2249 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleMWEString_in_entryRuleMWEString2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEString2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleMWEString2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleMWEString2392 = new BitSet(new long[]{0x0000000005FED270L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_ruleMWEString2413 = new BitSet(new long[]{0x0000000005FED270L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleMWEString2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleMWEString2464 = new BitSet(new long[]{0x0000000006FED270L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_ruleMWEString2485 = new BitSet(new long[]{0x0000000006FED270L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleMWEString2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMWEStringPart_in_entryRuleMWEStringPart2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMWEStringPart2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_ruleMWEStringPart2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_ruleMWEStringPart2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoolean2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBoolean2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableString_in_entryRuleReplaceableString2814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableString2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleReplaceableString2859 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rulePropertyReference_in_ruleReplaceableString2880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleReplaceableString2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReference_in_entryRulePropertyReference2932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReference2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePropertyReference2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainString_in_entryRulePlainString3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainString3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_rulePlainString3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileRef_in_entryRuleFileRef3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileRef3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFileRef3177 = new BitSet(new long[]{0x0000000003300000L});
    public static final BitSet FOLLOW_ruleMWEString_in_ruleFileRef3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue3239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleConstantValue3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_ruleConstantValue3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_ruleConstantValue3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_ruleConstantValue3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_ruleConstantValue3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_ruleConstantValue3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleConstantValue3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_ruleConstantValue3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleConstantValue3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstantValue3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConstantValue3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstantValue3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleConstantValue3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_ruleConstantValue3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColon3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDot3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_entryRuleSingleQuote3878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuote3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSingleQuote3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedSingleQuote_in_entryRuleEscapedSingleQuote3972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedSingleQuote3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedSingleQuote4034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSingleQuote_in_ruleEscapedSingleQuote4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_entryRuleDoubleQuote4111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuote4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDoubleQuote4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedDoubleQuote_in_entryRuleEscapedDoubleQuote4205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedDoubleQuote4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedDoubleQuote4267 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDoubleQuote_in_ruleEscapedDoubleQuote4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_entryRuleBackslash4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackslash4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBackslash4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEscapedBackslash_in_entryRuleEscapedBackslash4438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscapedBackslash4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash4500 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBackslash_in_ruleEscapedBackslash4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpeningBrace_in_entryRuleOpeningBrace4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpeningBrace4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpeningBrace4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosingBrace_in_entryRuleClosingBrace4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosingBrace4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClosingBrace4713 = new BitSet(new long[]{0x0000000000000002L});

}