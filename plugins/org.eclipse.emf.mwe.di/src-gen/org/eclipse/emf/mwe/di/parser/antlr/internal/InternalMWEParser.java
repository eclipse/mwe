package org.eclipse.emf.mwe.di.parser.antlr.internal; 

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
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "';'", "'var'", "'='", "'file'", "':'", "'{'", "'}'", "'+='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMWEParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g"; }


     
     	private MWEGrammarAccess grammarAccess;
     	
        public InternalMWEParser(TokenStream input, IAstFactory factory, MWEGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	} 



    // $ANTLR start entryRuleFile
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:70:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:70:46: (iv_ruleFile= ruleFile EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:71:2: iv_ruleFile= ruleFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.prFile().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile72);
            iv_ruleFile=ruleFile();
            _fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile82); 

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
    // $ANTLR end entryRuleFile


    // $ANTLR start ruleFile
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:78:1: ruleFile returns [EObject current=null] : ( ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* ) (lv_value_2= ruleComplexValue ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_properties_1 = null;

        EObject lv_value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:83:6: ( ( ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* ) (lv_value_2= ruleComplexValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:1: ( ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* ) (lv_value_2= ruleComplexValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:1: ( ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* ) (lv_value_2= ruleComplexValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:2: ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* ) (lv_value_2= ruleComplexValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:2: ( (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:3: (lv_imports_0= ruleImport )* (lv_properties_1= ruleProperty )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:84:3: (lv_imports_0= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:87:6: lv_imports_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prFile().ele000ParserRuleCallImport(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFile142);
            	    lv_imports_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prFile().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "imports", lv_imports_0, "Import", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:105:3: (lv_properties_1= ruleProperty )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:108:6: lv_properties_1= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prFile().ele010ParserRuleCallProperty(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile181);
            	    lv_properties_1=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prFile().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_1, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:126:4: (lv_value_2= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:129:6: lv_value_2= ruleComplexValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.prFile().ele10ParserRuleCallComplexValue(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile221);
            lv_value_2=ruleComplexValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.prFile().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_2, "ComplexValue", currentNode);
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
    // $ANTLR end ruleFile


    // $ANTLR start entryRuleImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:156:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:156:48: (iv_ruleImport= ruleImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:157:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.prImport().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport260);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport270); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:164:1: ruleImport returns [EObject current=null] : (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_JavaImport_0 = null;

        EObject this_GenericImport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:169:6: ( (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:170:1: (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:170:1: (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("170:1: (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("170:1: (this_JavaImport_0= ruleJavaImport | this_GenericImport_1= ruleGenericImport )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:171:5: this_JavaImport_0= ruleJavaImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prImport().ele0ParserRuleCallJavaImport(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleJavaImport_in_ruleImport317);
                    this_JavaImport_0=ruleJavaImport();
                    _fsp--;

                     
                            current = this_JavaImport_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:181:5: this_GenericImport_1= ruleGenericImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prImport().ele1ParserRuleCallGenericImport(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericImport_in_ruleImport344);
                    this_GenericImport_1=ruleGenericImport();
                    _fsp--;

                     
                            current = this_GenericImport_1; 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleJavaImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:198:1: entryRuleJavaImport returns [EObject current=null] : iv_ruleJavaImport= ruleJavaImport EOF ;
    public final EObject entryRuleJavaImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:198:52: (iv_ruleJavaImport= ruleJavaImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:199:2: iv_ruleJavaImport= ruleJavaImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.prJavaImport().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleJavaImport_in_entryRuleJavaImport378);
            iv_ruleJavaImport=ruleJavaImport();
            _fsp--;

             current =iv_ruleJavaImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaImport388); 

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
    // $ANTLR end entryRuleJavaImport


    // $ANTLR start ruleJavaImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:206:1: ruleJavaImport returns [EObject current=null] : ( ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? ) ';' ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard_3=null;
        EObject lv_javaImport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:211:6: ( ( ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:1: ( ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:1: ( ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:2: ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:2: ( ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:3: ( 'import' (lv_javaImport_1= ruleQualifiedName ) ) ( '.' (lv_wildcard_3= '*' ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:3: ( 'import' (lv_javaImport_1= ruleQualifiedName ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:212:4: 'import' (lv_javaImport_1= ruleQualifiedName )
            {
            match(input,11,FOLLOW_11_in_ruleJavaImport424); 

                    createLeafNode(grammarAccess.prJavaImport().ele000KeywordImport(), null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:216:1: (lv_javaImport_1= ruleQualifiedName )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:219:6: lv_javaImport_1= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.prJavaImport().ele0010ParserRuleCallQualifiedName(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaImport458);
            lv_javaImport_1=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.prJavaImport().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "javaImport", lv_javaImport_1, "QualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:237:3: ( '.' (lv_wildcard_3= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:237:4: '.' (lv_wildcard_3= '*' )
                    {
                    match(input,12,FOLLOW_12_in_ruleJavaImport473); 

                            createLeafNode(grammarAccess.prJavaImport().ele010KeywordFullStop(), null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:241:1: (lv_wildcard_3= '*' )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:243:6: lv_wildcard_3= '*'
                    {
                    lv_wildcard_3=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleJavaImport494); 

                            createLeafNode(grammarAccess.prJavaImport().ele0110KeywordAsterisk(), "wildcard"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prJavaImport().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "wildcard", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleJavaImport519); 

                    createLeafNode(grammarAccess.prJavaImport().ele1KeywordSemicolon(), null); 
                

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
    // $ANTLR end ruleJavaImport


    // $ANTLR start entryRuleGenericImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:275:1: entryRuleGenericImport returns [EObject current=null] : iv_ruleGenericImport= ruleGenericImport EOF ;
    public final EObject entryRuleGenericImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:275:55: (iv_ruleGenericImport= ruleGenericImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:276:2: iv_ruleGenericImport= ruleGenericImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.prGenericImport().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleGenericImport_in_entryRuleGenericImport554);
            iv_ruleGenericImport=ruleGenericImport();
            _fsp--;

             current =iv_ruleGenericImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericImport564); 

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
    // $ANTLR end entryRuleGenericImport


    // $ANTLR start ruleGenericImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:283:1: ruleGenericImport returns [EObject current=null] : ( ( 'import' (lv_value_1= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject ruleGenericImport() throws RecognitionException {
        EObject current = null;

        Token lv_value_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:288:6: ( ( ( 'import' (lv_value_1= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:289:1: ( ( 'import' (lv_value_1= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:289:1: ( ( 'import' (lv_value_1= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:289:2: ( 'import' (lv_value_1= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:289:2: ( 'import' (lv_value_1= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:289:3: 'import' (lv_value_1= RULE_STRING )
            {
            match(input,11,FOLLOW_11_in_ruleGenericImport599); 

                    createLeafNode(grammarAccess.prGenericImport().ele00KeywordImport(), null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:293:1: (lv_value_1= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:295:6: lv_value_1= RULE_STRING
            {
            lv_value_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericImport621); 

            		createLeafNode(grammarAccess.prGenericImport().ele010LexerRuleCallSTRING(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prGenericImport().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:313:3: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:313:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleGenericImport640); 

                            createLeafNode(grammarAccess.prGenericImport().ele1KeywordSemicolon(), null); 
                        

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
    // $ANTLR end ruleGenericImport


    // $ANTLR start entryRuleProperty
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:326:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:326:50: (iv_ruleProperty= ruleProperty EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:327:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.prProperty().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty677);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty687); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:334:1: ruleProperty returns [EObject current=null] : (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable_0 = null;

        EObject this_PropertiesFileImport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:339:6: ( (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:340:1: (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:340:1: (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==17) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("340:1: (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("340:1: (this_LocalVariable_0= ruleLocalVariable | this_PropertiesFileImport_1= rulePropertiesFileImport )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:341:5: this_LocalVariable_0= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prProperty().ele0ParserRuleCallLocalVariable(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty734);
                    this_LocalVariable_0=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:351:5: this_PropertiesFileImport_1= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prProperty().ele1ParserRuleCallPropertiesFileImport(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty761);
                    this_PropertiesFileImport_1=rulePropertiesFileImport();
                    _fsp--;

                     
                            current = this_PropertiesFileImport_1; 
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


    // $ANTLR start entryRuleLocalVariable
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:368:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:368:55: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:369:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.prLocalVariable().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable795);
            iv_ruleLocalVariable=ruleLocalVariable();
            _fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable805); 

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
    // $ANTLR end entryRuleLocalVariable


    // $ANTLR start ruleLocalVariable
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:376:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? ) ';' ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_value_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:381:6: ( ( ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:1: ( ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:1: ( ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:2: ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:2: ( ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:3: ( 'var' (lv_name_1= RULE_ID ) ) ( '=' (lv_value_3= ruleValue ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:3: ( 'var' (lv_name_1= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:382:4: 'var' (lv_name_1= RULE_ID )
            {
            match(input,15,FOLLOW_15_in_ruleLocalVariable841); 

                    createLeafNode(grammarAccess.prLocalVariable().ele000KeywordVar(), null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:386:1: (lv_name_1= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:388:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable863); 

            		createLeafNode(grammarAccess.prLocalVariable().ele0010LexerRuleCallID(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prLocalVariable().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:406:3: ( '=' (lv_value_3= ruleValue ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:406:4: '=' (lv_value_3= ruleValue )
                    {
                    match(input,16,FOLLOW_16_in_ruleLocalVariable882); 

                            createLeafNode(grammarAccess.prLocalVariable().ele010KeywordEqualsSign(), null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:410:1: (lv_value_3= ruleValue )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:413:6: lv_value_3= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.prLocalVariable().ele0110ParserRuleCallValue(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLocalVariable916);
                    lv_value_3=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prLocalVariable().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_3, "Value", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleLocalVariable932); 

                    createLeafNode(grammarAccess.prLocalVariable().ele1KeywordSemicolon(), null); 
                

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
    // $ANTLR end ruleLocalVariable


    // $ANTLR start entryRulePropertiesFileImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:444:1: entryRulePropertiesFileImport returns [EObject current=null] : iv_rulePropertiesFileImport= rulePropertiesFileImport EOF ;
    public final EObject entryRulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesFileImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:444:62: (iv_rulePropertiesFileImport= rulePropertiesFileImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:445:2: iv_rulePropertiesFileImport= rulePropertiesFileImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.prPropertiesFileImport().getRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport967);
            iv_rulePropertiesFileImport=rulePropertiesFileImport();
            _fsp--;

             current =iv_rulePropertiesFileImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesFileImport977); 

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
    // $ANTLR end entryRulePropertiesFileImport


    // $ANTLR start rulePropertiesFileImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:452:1: rulePropertiesFileImport returns [EObject current=null] : ( ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) ) ';' ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:457:6: ( ( ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:1: ( ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:1: ( ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:2: ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:2: ( ( 'var' 'file' ) (lv_file_2= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:3: ( 'var' 'file' ) (lv_file_2= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:3: ( 'var' 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:458:4: 'var' 'file'
            {
            match(input,15,FOLLOW_15_in_rulePropertiesFileImport1013); 

                    createLeafNode(grammarAccess.prPropertiesFileImport().ele000KeywordVar(), null); 
                
            match(input,17,FOLLOW_17_in_rulePropertiesFileImport1022); 

                    createLeafNode(grammarAccess.prPropertiesFileImport().ele001KeywordFile(), null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:466:2: (lv_file_2= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:468:6: lv_file_2= RULE_STRING
            {
            lv_file_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport1045); 

            		createLeafNode(grammarAccess.prPropertiesFileImport().ele010LexerRuleCallSTRING(), "file"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prPropertiesFileImport().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "file", lv_file_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePropertiesFileImport1063); 

                    createLeafNode(grammarAccess.prPropertiesFileImport().ele1KeywordSemicolon(), null); 
                

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
    // $ANTLR end rulePropertiesFileImport


    // $ANTLR start entryRuleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:499:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:499:47: (iv_ruleValue= ruleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:500:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.prValue().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1098);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1108); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:507:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef ) | this_WorkflowRef_3= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;

        EObject this_ComplexValue_1 = null;

        EObject this_IdRef_2 = null;

        EObject this_WorkflowRef_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:512:6: ( ( ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef ) | this_WorkflowRef_3= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:1: ( ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef ) | this_WorkflowRef_3= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:1: ( ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef ) | this_WorkflowRef_3= ruleWorkflowRef )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=18 && LA10_0<=19)) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("513:1: ( ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef ) | this_WorkflowRef_3= ruleWorkflowRef )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:2: ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:2: ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING||(LA9_0>=18 && LA9_0<=19)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_ID) ) {
                        int LA9_2 = input.LA(2);

                        if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==14||LA9_2==16||(LA9_2>=20 && LA9_2<=21)) ) {
                            alt9=2;
                        }
                        else if ( (LA9_2==12||(LA9_2>=18 && LA9_2<=19)) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("513:2: ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef )", 9, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("513:2: ( (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue ) | this_IdRef_2= ruleIdRef )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:3: (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:513:3: (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==RULE_STRING) ) {
                                alt8=1;
                            }
                            else if ( (LA8_0==RULE_ID||(LA8_0>=18 && LA8_0<=19)) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("513:3: (this_SimpleValue_0= ruleSimpleValue | this_ComplexValue_1= ruleComplexValue )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:514:5: this_SimpleValue_0= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode(grammarAccess.prValue().ele000ParserRuleCallSimpleValue(), currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue1157);
                                    this_SimpleValue_0=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue_0; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:524:5: this_ComplexValue_1= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode(grammarAccess.prValue().ele001ParserRuleCallComplexValue(), currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue1184);
                                    this_ComplexValue_1=ruleComplexValue();
                                    _fsp--;

                                     
                                            current = this_ComplexValue_1; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:534:5: this_IdRef_2= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode(grammarAccess.prValue().ele01ParserRuleCallIdRef(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue1212);
                            this_IdRef_2=ruleIdRef();
                            _fsp--;

                             
                                    current = this_IdRef_2; 
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:544:5: this_WorkflowRef_3= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prValue().ele1ParserRuleCallWorkflowRef(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue1240);
                    this_WorkflowRef_3=ruleWorkflowRef();
                    _fsp--;

                     
                            current = this_WorkflowRef_3; 
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


    // $ANTLR start entryRuleSimpleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:561:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:561:53: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:562:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.prSimpleValue().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1274);
            iv_ruleSimpleValue=ruleSimpleValue();
            _fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValue1284); 

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
    // $ANTLR end entryRuleSimpleValue


    // $ANTLR start ruleSimpleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:569:1: ruleSimpleValue returns [EObject current=null] : (lv_value_0= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:574:6: ( (lv_value_0= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:575:1: (lv_value_0= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:575:1: (lv_value_0= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:577:6: lv_value_0= RULE_STRING
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue1330); 

            		createLeafNode(grammarAccess.prSimpleValue().ele0LexerRuleCallSTRING(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prSimpleValue().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // $ANTLR end ruleSimpleValue


    // $ANTLR start entryRuleComplexValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:606:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:606:54: (iv_ruleComplexValue= ruleComplexValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:607:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.prComplexValue().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleComplexValue_in_entryRuleComplexValue1374);
            iv_ruleComplexValue=ruleComplexValue();
            _fsp--;

             current =iv_ruleComplexValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexValue1384); 

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
    // $ANTLR end entryRuleComplexValue


    // $ANTLR start ruleComplexValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:614:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_2=null;
        Token lv_fooBar_3=null;
        EObject lv_className_0 = null;

        EObject lv_assignments_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:619:6: ( ( ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:1: ( ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:1: ( ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:2: ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:2: ( ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:3: ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) ) (lv_assignments_4= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:3: ( ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:4: ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? ) (lv_fooBar_3= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:4: ( (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:5: (lv_className_0= ruleQualifiedName )? ( ':' (lv_id_2= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:620:5: (lv_className_0= ruleQualifiedName )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:623:6: lv_className_0= ruleQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.prComplexValue().ele00000ParserRuleCallQualifiedName(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue1446);
                    lv_className_0=ruleQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prComplexValue().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "className", lv_className_0, "QualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:641:3: ( ':' (lv_id_2= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:641:4: ':' (lv_id_2= RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleComplexValue1461); 

                            createLeafNode(grammarAccess.prComplexValue().ele00010KeywordColon(), null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:645:1: (lv_id_2= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:647:6: lv_id_2= RULE_ID
                    {
                    lv_id_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue1483); 

                    		createLeafNode(grammarAccess.prComplexValue().ele000110LexerRuleCallID(), "id"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prComplexValue().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "id", lv_id_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:665:5: (lv_fooBar_3= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:667:6: lv_fooBar_3= '{'
            {
            lv_fooBar_3=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleComplexValue1515); 

                    createLeafNode(grammarAccess.prComplexValue().ele0010KeywordLeftCurlyBracket(), "fooBar"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prComplexValue().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "fooBar", true, "{", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:686:3: (lv_assignments_4= ruleAssignment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==16||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:689:6: lv_assignments_4= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prComplexValue().ele010ParserRuleCallAssignment(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue1563);
            	    lv_assignments_4=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prComplexValue().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "assignments", lv_assignments_4, "Assignment", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleComplexValue1578); 

                    createLeafNode(grammarAccess.prComplexValue().ele1KeywordRightCurlyBracket(), null); 
                

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
    // $ANTLR end ruleComplexValue


    // $ANTLR start entryRuleWorkflowRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:720:1: entryRuleWorkflowRef returns [EObject current=null] : iv_ruleWorkflowRef= ruleWorkflowRef EOF ;
    public final EObject entryRuleWorkflowRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:720:53: (iv_ruleWorkflowRef= ruleWorkflowRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:721:2: iv_ruleWorkflowRef= ruleWorkflowRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.prWorkflowRef().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1613);
            iv_ruleWorkflowRef=ruleWorkflowRef();
            _fsp--;

             current =iv_ruleWorkflowRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRef1623); 

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
    // $ANTLR end entryRuleWorkflowRef


    // $ANTLR start ruleWorkflowRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:728:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri_1=null;
        EObject lv_assignments_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:733:6: ( ( ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:1: ( ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:1: ( ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:2: ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:2: ( ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:3: ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' ) (lv_assignments_3= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:3: ( ( 'file' (lv_uri_1= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:4: ( 'file' (lv_uri_1= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:4: ( 'file' (lv_uri_1= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:734:5: 'file' (lv_uri_1= RULE_STRING )
            {
            match(input,17,FOLLOW_17_in_ruleWorkflowRef1660); 

                    createLeafNode(grammarAccess.prWorkflowRef().ele0000KeywordFile(), null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:738:1: (lv_uri_1= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:740:6: lv_uri_1= RULE_STRING
            {
            lv_uri_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef1682); 

            		createLeafNode(grammarAccess.prWorkflowRef().ele00010LexerRuleCallSTRING(), "uri"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prWorkflowRef().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "uri", lv_uri_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleWorkflowRef1700); 

                    createLeafNode(grammarAccess.prWorkflowRef().ele001KeywordLeftCurlyBracket(), null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:762:2: (lv_assignments_3= ruleAssignment )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:765:6: lv_assignments_3= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prWorkflowRef().ele010ParserRuleCallAssignment(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef1735);
            	    lv_assignments_3=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prWorkflowRef().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "assignments", lv_assignments_3, "Assignment", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleWorkflowRef1750); 

                    createLeafNode(grammarAccess.prWorkflowRef().ele1KeywordRightCurlyBracket(), null); 
                

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
    // $ANTLR end ruleWorkflowRef


    // $ANTLR start entryRuleIdRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:796:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:796:47: (iv_ruleIdRef= ruleIdRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:797:2: iv_ruleIdRef= ruleIdRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.prIdRef().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef1785);
            iv_ruleIdRef=ruleIdRef();
            _fsp--;

             current =iv_ruleIdRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef1795); 

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
    // $ANTLR end entryRuleIdRef


    // $ANTLR start ruleIdRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:804:1: ruleIdRef returns [EObject current=null] : (lv_id_0= RULE_ID ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:809:6: ( (lv_id_0= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:810:1: (lv_id_0= RULE_ID )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:810:1: (lv_id_0= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:812:6: lv_id_0= RULE_ID
            {
            lv_id_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef1841); 

            		createLeafNode(grammarAccess.prIdRef().ele0LexerRuleCallID(), "id"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prIdRef().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "id", lv_id_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // $ANTLR end ruleIdRef


    // $ANTLR start entryRuleAssignment
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:839:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:839:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:840:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.prAssignment().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1883);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1893); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:847:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0=null;
        Token lv_operator_1=null;
        EObject lv_value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:852:6: ( ( ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:1: ( ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:1: ( ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:2: ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:2: ( ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:3: ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) ) (lv_value_2= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:3: ( (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:4: (lv_feature_0= RULE_ID )? (lv_operator_1= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:853:4: (lv_feature_0= RULE_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:855:6: lv_feature_0= RULE_ID
                    {
                    lv_feature_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1942); 

                    		createLeafNode(grammarAccess.prAssignment().ele0000LexerRuleCallID(), "feature"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prAssignment().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "feature", lv_feature_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:873:3: (lv_operator_1= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:875:6: lv_operator_1= ( '=' | '+=' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:875:20: ( '=' | '+=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("875:20: ( '=' | '+=' )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:875:21: '='
                    {
                    match(input,16,FOLLOW_16_in_ruleAssignment1973); 

                            createLeafNode(grammarAccess.prAssignment().ele00100KeywordEqualsSign(), "operator"); 
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:881:6: '+='
                    {
                    match(input,21,FOLLOW_21_in_ruleAssignment1989); 

                            createLeafNode(grammarAccess.prAssignment().ele00101KeywordPlusSignEqualsSign(), "operator"); 
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.prAssignment().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "operator", /* lv_operator_1 */ input.LT(-1), null, lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:901:3: (lv_value_2= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:904:6: lv_value_2= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.prAssignment().ele010ParserRuleCallValue(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment2039);
            lv_value_2=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.prAssignment().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_2, "Value", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:922:3: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:922:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleAssignment2054); 

                            createLeafNode(grammarAccess.prAssignment().ele1KeywordSemicolon(), null); 
                        

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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleQualifiedName
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:935:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:935:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:936:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.prQualifiedName().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2091);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2101); 

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
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:943:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts_0= RULE_ID ) ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts_0=null;
        Token lv_parts_1=null;
        Token lv_parts_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:948:6: ( ( (lv_parts_0= RULE_ID ) ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:949:1: ( (lv_parts_0= RULE_ID ) ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:949:1: ( (lv_parts_0= RULE_ID ) ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:949:2: (lv_parts_0= RULE_ID ) ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:949:2: (lv_parts_0= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:951:6: lv_parts_0= RULE_ID
            {
            lv_parts_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2148); 

            		createLeafNode(grammarAccess.prQualifiedName().ele00LexerRuleCallID(), "parts"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prQualifiedName().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		add(current, "parts", lv_parts_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:969:2: ( (lv_parts_1= '.' ) (lv_parts_2= RULE_ID ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:969:3: (lv_parts_1= '.' ) (lv_parts_2= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:969:3: (lv_parts_1= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:971:6: lv_parts_1= '.'
            	    {
            	    lv_parts_1=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleQualifiedName2178); 

            	            createLeafNode(grammarAccess.prQualifiedName().ele100KeywordFullStop(), "parts"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prQualifiedName().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "parts", /* lv_parts_1 */ input.LT(-1), ".", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:990:2: (lv_parts_2= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:992:6: lv_parts_2= RULE_ID
            	    {
            	    lv_parts_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2213); 

            	    		createLeafNode(grammarAccess.prQualifiedName().ele110LexerRuleCallID(), "parts"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prQualifiedName().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "parts", lv_parts_2, "ID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end ruleQualifiedName


 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile72 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFile142 = new BitSet(new long[]{0x00000000000C8820L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFile181 = new BitSet(new long[]{0x00000000000C8020L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleFile221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_ruleImport317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_ruleImport344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_entryRuleJavaImport378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaImport388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJavaImport424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaImport458 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleJavaImport473 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJavaImport494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJavaImport519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_entryRuleGenericImport554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericImport564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGenericImport599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericImport621 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGenericImport640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable863 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleLocalVariable882 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLocalVariable916 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocalVariable932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesFileImport977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport1013 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertiesFileImport1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport1045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePropertiesFileImport1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_entryRuleComplexValue1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexValue1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue1446 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleComplexValue1461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue1483 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexValue1515 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue1563 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleComplexValue1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRef1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWorkflowRef1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef1682 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowRef1700 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef1735 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowRef1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1942 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleAssignment1973 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_21_in_ruleAssignment1989 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment2039 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAssignment2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2148 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName2178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2213 = new BitSet(new long[]{0x0000000000001002L});

}