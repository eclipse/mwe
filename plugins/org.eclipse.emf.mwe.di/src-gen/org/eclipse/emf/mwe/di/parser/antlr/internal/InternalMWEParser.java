// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g 2009-01-13 09:51:31

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
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "';'", "'var'", "'='", "'file'", "':'", "'{'", "'}'", "'+='"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalMWEParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g"; }


     
        public InternalMWEParser(TokenStream input, IAstFactory factory, Grammar g) {
            this(input);
            this.factory = factory;
    		grammar = g;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = InternalMWEParser.class.getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	} 



    // $ANTLR start entryRuleFile
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:66:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:66:46: (iv_ruleFile= ruleFile EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:67:2: iv_ruleFile= ruleFile EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile71);
            iv_ruleFile=ruleFile();
            _fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile81); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:74:1: ruleFile returns [EObject current=null] : ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports = null;

        EObject lv_properties = null;

        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:76:33: ( ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:3: (lv_imports= ruleImport )* (lv_properties= ruleProperty )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:77:3: (lv_imports= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:80:6: lv_imports= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFile141);
            	    lv_imports=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create("File");
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "imports", lv_imports, "Import", currentNode);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:98:3: (lv_properties= ruleProperty )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:101:6: lv_properties= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile180);
            	    lv_properties=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create("File");
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "properties", lv_properties, "Property", currentNode);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:119:4: (lv_value= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:122:6: lv_value= ruleComplexValue
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile220);
            lv_value=ruleComplexValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create("File");
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "value", lv_value, "ComplexValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:147:48: (iv_ruleImport= ruleImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:148:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport257);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport267); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:155:1: ruleImport returns [EObject current=null] : (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_JavaImport = null;

        EObject this_GenericImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:157:33: ( (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:158:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:158:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
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
                        new NoViableAltException("158:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("158:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:159:5: this_JavaImport= ruleJavaImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleJavaImport_in_ruleImport314);
                    this_JavaImport=ruleJavaImport();
                    _fsp--;

                     
                            current = this_JavaImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:169:5: this_GenericImport= ruleGenericImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericImport_in_ruleImport341);
                    this_GenericImport=ruleGenericImport();
                    _fsp--;

                     
                            current = this_GenericImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:184:1: entryRuleJavaImport returns [EObject current=null] : iv_ruleJavaImport= ruleJavaImport EOF ;
    public final EObject entryRuleJavaImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:184:52: (iv_ruleJavaImport= ruleJavaImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:185:2: iv_ruleJavaImport= ruleJavaImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleJavaImport_in_entryRuleJavaImport373);
            iv_ruleJavaImport=ruleJavaImport();
            _fsp--;

             current =iv_ruleJavaImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaImport383); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:192:1: ruleJavaImport returns [EObject current=null] : ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard=null;
        EObject lv_javaImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:194:33: ( ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:3: ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:3: ( 'import' (lv_javaImport= ruleQualifiedName ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:195:4: 'import' (lv_javaImport= ruleQualifiedName )
            {
            match(input,11,FOLLOW_11_in_ruleJavaImport419); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:199:1: (lv_javaImport= ruleQualifiedName )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:202:6: lv_javaImport= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaImport453);
            lv_javaImport=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create("JavaImport");
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "javaImport", lv_javaImport, "QualifiedName", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:220:3: ( '.' (lv_wildcard= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:220:4: '.' (lv_wildcard= '*' )
                    {
                    match(input,12,FOLLOW_12_in_ruleJavaImport468); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:224:1: (lv_wildcard= '*' )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:226:6: lv_wildcard= '*'
                    {
                    lv_wildcard=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleJavaImport489); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::Keyword */, "wildcard"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("JavaImport");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	        	factory.set(current, "wildcard", true, "*", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleJavaImport513); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:255:1: entryRuleGenericImport returns [EObject current=null] : iv_ruleGenericImport= ruleGenericImport EOF ;
    public final EObject entryRuleGenericImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:255:55: (iv_ruleGenericImport= ruleGenericImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:256:2: iv_ruleGenericImport= ruleGenericImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleGenericImport_in_entryRuleGenericImport546);
            iv_ruleGenericImport=ruleGenericImport();
            _fsp--;

             current =iv_ruleGenericImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericImport556); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:263:1: ruleGenericImport returns [EObject current=null] : ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject ruleGenericImport() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:265:33: ( ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:266:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:266:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:266:2: ( 'import' (lv_value= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:266:2: ( 'import' (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:266:3: 'import' (lv_value= RULE_STRING )
            {
            match(input,11,FOLLOW_11_in_ruleGenericImport591); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:270:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:272:6: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericImport612); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "value"); 
                

            	        if (current==null) {
            	            current = factory.create("GenericImport");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "value", lv_value, "STRING", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:290:3: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:290:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleGenericImport634); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:301:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:301:50: (iv_ruleProperty= ruleProperty EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:302:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty669);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty679); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:309:1: ruleProperty returns [EObject current=null] : (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable = null;

        EObject this_PropertiesFileImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:311:33: ( (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:312:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:312:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
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
                        new NoViableAltException("312:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("312:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:313:5: this_LocalVariable= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty726);
                    this_LocalVariable=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:323:5: this_PropertiesFileImport= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty753);
                    this_PropertiesFileImport=rulePropertiesFileImport();
                    _fsp--;

                     
                            current = this_PropertiesFileImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:338:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:338:55: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:339:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable785);
            iv_ruleLocalVariable=ruleLocalVariable();
            _fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable795); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:346:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:348:33: ( ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:3: ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:3: ( 'var' (lv_name= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:349:4: 'var' (lv_name= RULE_ID )
            {
            match(input,15,FOLLOW_15_in_ruleLocalVariable831); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:353:1: (lv_name= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:355:6: lv_name= RULE_ID
            {
            lv_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable852); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "name"); 
                

            	        if (current==null) {
            	            current = factory.create("LocalVariable");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "name", lv_name, "ID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:373:3: ( '=' (lv_value= ruleValue ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:373:4: '=' (lv_value= ruleValue )
                    {
                    match(input,16,FOLLOW_16_in_ruleLocalVariable874); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:377:1: (lv_value= ruleValue )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:380:6: lv_value= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLocalVariable908);
                    lv_value=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create("LocalVariable");
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	        	factory.set(current, "value", lv_value, "Value", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleLocalVariable924); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:409:1: entryRulePropertiesFileImport returns [EObject current=null] : iv_rulePropertiesFileImport= rulePropertiesFileImport EOF ;
    public final EObject entryRulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesFileImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:409:62: (iv_rulePropertiesFileImport= rulePropertiesFileImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:410:2: iv_rulePropertiesFileImport= rulePropertiesFileImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport957);
            iv_rulePropertiesFileImport=rulePropertiesFileImport();
            _fsp--;

             current =iv_rulePropertiesFileImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesFileImport967); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:417:1: rulePropertiesFileImport returns [EObject current=null] : ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:419:33: ( ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:3: ( 'var' 'file' ) (lv_file= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:3: ( 'var' 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:420:4: 'var' 'file'
            {
            match(input,15,FOLLOW_15_in_rulePropertiesFileImport1003); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            match(input,17,FOLLOW_17_in_rulePropertiesFileImport1012); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:428:2: (lv_file= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:430:6: lv_file= RULE_STRING
            {
            lv_file=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport1034); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "file"); 
                

            	        if (current==null) {
            	            current = factory.create("PropertiesFileImport");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "file", lv_file, "STRING", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePropertiesFileImport1055); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:459:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:459:47: (iv_ruleValue= ruleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:460:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1088);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1098); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:467:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue = null;

        EObject this_ComplexValue = null;

        EObject this_IdRef = null;

        EObject this_WorkflowRef = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:469:33: ( ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
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
                    new NoViableAltException("470:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING||(LA9_0>=18 && LA9_0<=19)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_ID) ) {
                        int LA9_2 = input.LA(2);

                        if ( (LA9_2==12||(LA9_2>=18 && LA9_2<=19)) ) {
                            alt9=1;
                        }
                        else if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==14||LA9_2==16||(LA9_2>=20 && LA9_2<=21)) ) {
                            alt9=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("470:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 9, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("470:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:470:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
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
                                    new NoViableAltException("470:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:471:5: this_SimpleValue= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue1147);
                                    this_SimpleValue=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:481:5: this_ComplexValue= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue1174);
                                    this_ComplexValue=ruleComplexValue();
                                    _fsp--;

                                     
                                            current = this_ComplexValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:491:5: this_IdRef= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue1202);
                            this_IdRef=ruleIdRef();
                            _fsp--;

                             
                                    current = this_IdRef; 
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:501:5: this_WorkflowRef= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue1230);
                    this_WorkflowRef=ruleWorkflowRef();
                    _fsp--;

                     
                            current = this_WorkflowRef; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:516:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:516:53: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:517:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1262);
            iv_ruleSimpleValue=ruleSimpleValue();
            _fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValue1272); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:524:1: ruleSimpleValue returns [EObject current=null] : (lv_value= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:526:33: ( (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:527:1: (lv_value= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:527:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:529:6: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue1317); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives/@terminal" /* xtext::RuleCall */, "value"); 
                

            	        if (current==null) {
            	            current = factory.create("SimpleValue");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "value", lv_value, "STRING", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:556:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:556:54: (iv_ruleComplexValue= ruleComplexValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:557:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleComplexValue_in_entryRuleComplexValue1362);
            iv_ruleComplexValue=ruleComplexValue();
            _fsp--;

             current =iv_ruleComplexValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexValue1372); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:564:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;
        Token lv_fooBar=null;
        EObject lv_className = null;

        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:566:33: ( ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:5: (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:567:5: (lv_className= ruleQualifiedName )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:570:6: lv_className= ruleQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue1434);
                    lv_className=ruleQualifiedName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create("ComplexValue");
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	        	factory.set(current, "className", lv_className, "QualifiedName", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:588:3: ( ':' (lv_id= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:588:4: ':' (lv_id= RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleComplexValue1449); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:592:1: (lv_id= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:594:6: lv_id= RULE_ID
                    {
                    lv_id=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue1470); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "id"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("ComplexValue");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	        	factory.set(current, "id", lv_id, "ID", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:612:5: (lv_fooBar= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:614:6: lv_fooBar= '{'
            {
            lv_fooBar=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleComplexValue1505); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, "fooBar"); 
                

            	        if (current==null) {
            	            current = factory.create("ComplexValue");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "fooBar", true, "{", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:632:3: (lv_assignments= ruleAssignment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==16||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:635:6: lv_assignments= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue1552);
            	    lv_assignments=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create("ComplexValue");
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "assignments", lv_assignments, "Assignment", currentNode);
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

            match(input,20,FOLLOW_20_in_ruleComplexValue1567); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:664:1: entryRuleWorkflowRef returns [EObject current=null] : iv_ruleWorkflowRef= ruleWorkflowRef EOF ;
    public final EObject entryRuleWorkflowRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:664:53: (iv_ruleWorkflowRef= ruleWorkflowRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:665:2: iv_ruleWorkflowRef= ruleWorkflowRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1600);
            iv_ruleWorkflowRef=ruleWorkflowRef();
            _fsp--;

             current =iv_ruleWorkflowRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRef1610); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:672:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri=null;
        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:674:33: ( ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:4: ( 'file' (lv_uri= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:4: ( 'file' (lv_uri= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:675:5: 'file' (lv_uri= RULE_STRING )
            {
            match(input,17,FOLLOW_17_in_ruleWorkflowRef1647); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:679:1: (lv_uri= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:681:6: lv_uri= RULE_STRING
            {
            lv_uri=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef1668); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "uri"); 
                

            	        if (current==null) {
            	            current = factory.create("WorkflowRef");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "uri", lv_uri, "STRING", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleWorkflowRef1689); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:703:2: (lv_assignments= ruleAssignment )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:706:6: lv_assignments= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef1724);
            	    lv_assignments=ruleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create("WorkflowRef");
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "assignments", lv_assignments, "Assignment", currentNode);
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

            match(input,20,FOLLOW_20_in_ruleWorkflowRef1739); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:735:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:735:47: (iv_ruleIdRef= ruleIdRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:736:2: iv_ruleIdRef= ruleIdRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef1772);
            iv_ruleIdRef=ruleIdRef();
            _fsp--;

             current =iv_ruleIdRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef1782); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:743:1: ruleIdRef returns [EObject current=null] : (lv_id= RULE_ID ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:745:33: ( (lv_id= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:746:1: (lv_id= RULE_ID )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:746:1: (lv_id= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:748:6: lv_id= RULE_ID
            {
            lv_id=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef1827); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives/@terminal" /* xtext::RuleCall */, "id"); 
                

            	        if (current==null) {
            	            current = factory.create("IdRef");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "id", lv_id, "ID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:773:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:773:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:774:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1870);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1880); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:781:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature=null;
        Token lv_operator=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:783:33: ( ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:4: (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:784:4: (lv_feature= RULE_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:786:6: lv_feature= RULE_ID
                    {
                    lv_feature=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1928); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "feature"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("Assignment");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	        	factory.set(current, "feature", lv_feature, "ID", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:804:3: (lv_operator= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:806:6: lv_operator= ( '=' | '+=' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:806:18: ( '=' | '+=' )
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
                    new NoViableAltException("806:18: ( '=' | '+=' )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:806:19: '='
                    {
                    match(input,16,FOLLOW_16_in_ruleAssignment1962); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0" /* xtext::Keyword */, "operator"); 
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:811:6: '+='
                    {
                    match(input,21,FOLLOW_21_in_ruleAssignment1977); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1" /* xtext::Keyword */, "operator"); 
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create("Assignment");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "operator", input.LT(-1), null, currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:829:3: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:832:6: lv_value= ruleValue
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment2025);
            lv_value=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create("Assignment");
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	        	factory.set(current, "value", lv_value, "Value", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:850:3: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:850:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleAssignment2040); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:861:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:861:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:862:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2075);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2085); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:869:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:871:33: ( ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:872:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:872:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:872:2: (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:872:2: (lv_parts= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:874:6: lv_parts= RULE_ID
            {
            lv_parts=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2131); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "parts"); 
                

            	        if (current==null) {
            	            current = factory.create("QualifiedName");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	        	factory.add(current, "parts", lv_parts, "ID", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:892:2: ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
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
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:892:3: (lv_parts= '.' ) (lv_parts= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:892:3: (lv_parts= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:894:6: lv_parts= '.'
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleQualifiedName2164); 

            	            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, "parts"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create("QualifiedName");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "parts", input.LT(-1), ".", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:912:2: (lv_parts= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.g:914:6: lv_parts= RULE_ID
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2197); 
            	     
            	        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "parts"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create("QualifiedName");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	        	factory.add(current, "parts", lv_parts, "ID", currentNode);
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


 

    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile71 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFile141 = new BitSet(new long[]{0x00000000000C8820L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFile180 = new BitSet(new long[]{0x00000000000C8020L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleFile220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_ruleImport314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_ruleImport341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_entryRuleJavaImport373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaImport383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJavaImport419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaImport453 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleJavaImport468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJavaImport489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJavaImport513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_entryRuleGenericImport546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericImport556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGenericImport591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericImport612 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGenericImport634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable852 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleLocalVariable874 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLocalVariable908 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocalVariable924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesFileImport967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport1003 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertiesFileImport1012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport1034 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePropertiesFileImport1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_entryRuleComplexValue1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexValue1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue1434 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleComplexValue1449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue1470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexValue1505 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue1552 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleComplexValue1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRef1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWorkflowRef1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef1668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowRef1689 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef1724 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowRef1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef1772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1928 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleAssignment1962 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_21_in_ruleAssignment1977 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment2025 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAssignment2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2131 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName2164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2197 = new BitSet(new long[]{0x0000000000001002L});

}
