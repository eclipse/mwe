// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-10-13 11:39:59

package org.eclipse.emf.mwe.di.parser.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEParser extends AbstractAntlrParser {
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
    public String getGrammarFileName() { return "./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g"; }


     
        public InternalMWEParser(TokenStream input, IAstFactory factory, Grammar g) {
            this(input);
            this.factory = factory;
    		grammar = g;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = InternalMWEParser.class.getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/internal/InternalMWE.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "File";	
       	} 



    // $ANTLR start entryRuleFile
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:63:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:63:46: (iv_ruleFile= ruleFile EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:64:2: iv_ruleFile= ruleFile EOF
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:71:1: ruleFile returns [EObject current=null] : ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports = null;

        EObject lv_properties = null;

        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:73:33: ( ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:3: (lv_imports= ruleImport )* (lv_properties= ruleProperty )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:74:3: (lv_imports= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:77:6: lv_imports= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFile141);
            	    lv_imports=ruleImport();
            	    _fsp--;


            	    	        currentNode = currentNode.getParent();
            	    	        if (current==null) {
            	    	            current = factory.create("File");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "imports", lv_imports,null);
            	    	         

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:91:3: (lv_properties= ruleProperty )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:94:6: lv_properties= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile180);
            	    lv_properties=ruleProperty();
            	    _fsp--;


            	    	        currentNode = currentNode.getParent();
            	    	        if (current==null) {
            	    	            current = factory.create("File");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "properties", lv_properties,null);
            	    	         

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:108:4: (lv_value= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:111:6: lv_value= ruleComplexValue
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile220);
            lv_value=ruleComplexValue();
            _fsp--;


            	        currentNode = currentNode.getParent();
            	        if (current==null) {
            	            current = factory.create("File");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "value", lv_value,null);
            	         

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:130:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:130:48: (iv_ruleImport= ruleImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:131:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport259);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport269); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:138:1: ruleImport returns [EObject current=null] : (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_JavaImport = null;

        EObject this_GenericImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:140:33: ( (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:141:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:141:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
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
                        new NoViableAltException("141:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("141:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:142:5: this_JavaImport= ruleJavaImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleJavaImport_in_ruleImport316);
                    this_JavaImport=ruleJavaImport();
                    _fsp--;

                     
                            current = this_JavaImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:152:5: this_GenericImport= ruleGenericImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericImport_in_ruleImport343);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:165:1: entryRuleJavaImport returns [EObject current=null] : iv_ruleJavaImport= ruleJavaImport EOF ;
    public final EObject entryRuleJavaImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:165:52: (iv_ruleJavaImport= ruleJavaImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:166:2: iv_ruleJavaImport= ruleJavaImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleJavaImport_in_entryRuleJavaImport377);
            iv_ruleJavaImport=ruleJavaImport();
            _fsp--;

             current =iv_ruleJavaImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaImport387); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:173:1: ruleJavaImport returns [EObject current=null] : ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard=null;
        EObject lv_javaImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:175:33: ( ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:3: ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:3: ( 'import' (lv_javaImport= ruleQualifiedName ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:176:4: 'import' (lv_javaImport= ruleQualifiedName )
            {
            match(input,11,FOLLOW_11_in_ruleJavaImport423); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:180:1: (lv_javaImport= ruleQualifiedName )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:183:6: lv_javaImport= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaImport457);
            lv_javaImport=ruleQualifiedName();
            _fsp--;


            	        currentNode = currentNode.getParent();
            	        if (current==null) {
            	            current = factory.create("JavaImport");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "javaImport", lv_javaImport,null);
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:197:3: ( '.' (lv_wildcard= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:197:4: '.' (lv_wildcard= '*' )
                    {
                    match(input,12,FOLLOW_12_in_ruleJavaImport472); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:201:1: (lv_wildcard= '*' )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:203:6: lv_wildcard= '*'
                    {
                    lv_wildcard=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleJavaImport493); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::Keyword */, "wildcard"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("JavaImport");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        factory.set(current, "wildcard", true,"*");
                    	         

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleJavaImport517); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:226:1: entryRuleGenericImport returns [EObject current=null] : iv_ruleGenericImport= ruleGenericImport EOF ;
    public final EObject entryRuleGenericImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:226:55: (iv_ruleGenericImport= ruleGenericImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:227:2: iv_ruleGenericImport= ruleGenericImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleGenericImport_in_entryRuleGenericImport552);
            iv_ruleGenericImport=ruleGenericImport();
            _fsp--;

             current =iv_ruleGenericImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericImport562); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:234:1: ruleGenericImport returns [EObject current=null] : ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject ruleGenericImport() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:33: ( ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:2: ( 'import' (lv_value= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:2: ( 'import' (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:3: 'import' (lv_value= RULE_STRING )
            {
            match(input,11,FOLLOW_11_in_ruleGenericImport597); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:241:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:243:6: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericImport618); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "value"); 
                

            	        if (current==null) {
            	            current = factory.create("GenericImport");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "value", lv_value,"STRING");
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:257:3: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:257:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleGenericImport640); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:266:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:266:50: (iv_ruleProperty= ruleProperty EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:267:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4" /* xtext::ParserRule */, currentNode); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:274:1: ruleProperty returns [EObject current=null] : (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable = null;

        EObject this_PropertiesFileImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:276:33: ( (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:277:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:277:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
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
                        new NoViableAltException("277:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("277:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:278:5: this_LocalVariable= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty734);
                    this_LocalVariable=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:288:5: this_PropertiesFileImport= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty761);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:301:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:301:55: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:302:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5" /* xtext::ParserRule */, currentNode); 
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:309:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:311:33: ( ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:3: ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:3: ( 'var' (lv_name= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:4: 'var' (lv_name= RULE_ID )
            {
            match(input,15,FOLLOW_15_in_ruleLocalVariable841); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:316:1: (lv_name= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:318:6: lv_name= RULE_ID
            {
            lv_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable862); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "name"); 
                

            	        if (current==null) {
            	            current = factory.create("LocalVariable");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "name", lv_name,"ID");
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:332:3: ( '=' (lv_value= ruleValue ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:332:4: '=' (lv_value= ruleValue )
                    {
                    match(input,16,FOLLOW_16_in_ruleLocalVariable884); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:336:1: (lv_value= ruleValue )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:339:6: lv_value= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLocalVariable918);
                    lv_value=ruleValue();
                    _fsp--;


                    	        currentNode = currentNode.getParent();
                    	        if (current==null) {
                    	            current = factory.create("LocalVariable");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        factory.set(current, "value", lv_value,null);
                    	         

                    }


                    }
                    break;

            }


            }

            match(input,14,FOLLOW_14_in_ruleLocalVariable934); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:362:1: entryRulePropertiesFileImport returns [EObject current=null] : iv_rulePropertiesFileImport= rulePropertiesFileImport EOF ;
    public final EObject entryRulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesFileImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:362:62: (iv_rulePropertiesFileImport= rulePropertiesFileImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:363:2: iv_rulePropertiesFileImport= rulePropertiesFileImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport969);
            iv_rulePropertiesFileImport=rulePropertiesFileImport();
            _fsp--;

             current =iv_rulePropertiesFileImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesFileImport979); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:370:1: rulePropertiesFileImport returns [EObject current=null] : ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:372:33: ( ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:3: ( 'var' 'file' ) (lv_file= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:3: ( 'var' 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:4: 'var' 'file'
            {
            match(input,15,FOLLOW_15_in_rulePropertiesFileImport1015); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            match(input,17,FOLLOW_17_in_rulePropertiesFileImport1024); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:381:2: (lv_file= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:383:6: lv_file= RULE_STRING
            {
            lv_file=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport1046); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "file"); 
                

            	        if (current==null) {
            	            current = factory.create("PropertiesFileImport");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "file", lv_file,"STRING");
            	         

            }


            }

            match(input,14,FOLLOW_14_in_rulePropertiesFileImport1067); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:406:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:406:47: (iv_ruleValue= ruleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:407:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1102);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1112); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:414:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue = null;

        EObject this_ComplexValue = null;

        EObject this_IdRef = null;

        EObject this_WorkflowRef = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:416:33: ( ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
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
                    new NoViableAltException("417:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
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
                                new NoViableAltException("417:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 9, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("417:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:417:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
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
                                    new NoViableAltException("417:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:418:5: this_SimpleValue= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue1161);
                                    this_SimpleValue=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:428:5: this_ComplexValue= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue1188);
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
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:5: this_IdRef= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue1216);
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
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:448:5: this_WorkflowRef= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue1244);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:461:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:461:53: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:462:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1278);
            iv_ruleSimpleValue=ruleSimpleValue();
            _fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValue1288); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:469:1: ruleSimpleValue returns [EObject current=null] : (lv_value= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:471:33: ( (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:472:1: (lv_value= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:472:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:6: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue1333); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives/@terminal" /* xtext::RuleCall */, "value"); 
                

            	        if (current==null) {
            	            current = factory.create("SimpleValue");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "value", lv_value,"STRING");
            	         

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:495:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:495:54: (iv_ruleComplexValue= ruleComplexValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:496:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleComplexValue_in_entryRuleComplexValue1380);
            iv_ruleComplexValue=ruleComplexValue();
            _fsp--;

             current =iv_ruleComplexValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexValue1390); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:503:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;
        Token lv_fooBar=null;
        EObject lv_className = null;

        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:505:33: ( ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:5: (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:506:5: (lv_className= ruleQualifiedName )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:509:6: lv_className= ruleQualifiedName
                    {
                     
                    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue1452);
                    lv_className=ruleQualifiedName();
                    _fsp--;


                    	        currentNode = currentNode.getParent();
                    	        if (current==null) {
                    	            current = factory.create("ComplexValue");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        factory.set(current, "className", lv_className,null);
                    	         

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:523:3: ( ':' (lv_id= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:523:4: ':' (lv_id= RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleComplexValue1467); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:527:1: (lv_id= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:529:6: lv_id= RULE_ID
                    {
                    lv_id=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue1488); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "id"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("ComplexValue");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        factory.set(current, "id", lv_id,"ID");
                    	         

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:543:5: (lv_fooBar= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:545:6: lv_fooBar= '{'
            {
            lv_fooBar=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleComplexValue1523); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, "fooBar"); 
                

            	        if (current==null) {
            	            current = factory.create("ComplexValue");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "fooBar", true,"{");
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:559:3: (lv_assignments= ruleAssignment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==16||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:562:6: lv_assignments= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue1570);
            	    lv_assignments=ruleAssignment();
            	    _fsp--;


            	    	        currentNode = currentNode.getParent();
            	    	        if (current==null) {
            	    	            current = factory.create("ComplexValue");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "assignments", lv_assignments,null);
            	    	         

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleComplexValue1585); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:585:1: entryRuleWorkflowRef returns [EObject current=null] : iv_ruleWorkflowRef= ruleWorkflowRef EOF ;
    public final EObject entryRuleWorkflowRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:585:53: (iv_ruleWorkflowRef= ruleWorkflowRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:586:2: iv_ruleWorkflowRef= ruleWorkflowRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1620);
            iv_ruleWorkflowRef=ruleWorkflowRef();
            _fsp--;

             current =iv_ruleWorkflowRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRef1630); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:593:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri=null;
        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:595:33: ( ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:4: ( 'file' (lv_uri= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:4: ( 'file' (lv_uri= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:596:5: 'file' (lv_uri= RULE_STRING )
            {
            match(input,17,FOLLOW_17_in_ruleWorkflowRef1667); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:600:1: (lv_uri= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:602:6: lv_uri= RULE_STRING
            {
            lv_uri=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef1688); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "uri"); 
                

            	        if (current==null) {
            	            current = factory.create("WorkflowRef");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "uri", lv_uri,"STRING");
            	         

            }


            }

            match(input,19,FOLLOW_19_in_ruleWorkflowRef1709); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:620:2: (lv_assignments= ruleAssignment )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:623:6: lv_assignments= ruleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef1744);
            	    lv_assignments=ruleAssignment();
            	    _fsp--;


            	    	        currentNode = currentNode.getParent();
            	    	        if (current==null) {
            	    	            current = factory.create("WorkflowRef");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "assignments", lv_assignments,null);
            	    	         

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleWorkflowRef1759); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:646:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:646:47: (iv_ruleIdRef= ruleIdRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:647:2: iv_ruleIdRef= ruleIdRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef1794);
            iv_ruleIdRef=ruleIdRef();
            _fsp--;

             current =iv_ruleIdRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef1804); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:654:1: ruleIdRef returns [EObject current=null] : (lv_id= RULE_ID ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:656:33: ( (lv_id= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:657:1: (lv_id= RULE_ID )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:657:1: (lv_id= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:659:6: lv_id= RULE_ID
            {
            lv_id=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef1849); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives/@terminal" /* xtext::RuleCall */, "id"); 
                

            	        if (current==null) {
            	            current = factory.create("IdRef");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "id", lv_id,"ID");
            	         

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:678:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:678:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:679:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1894);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1904); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:686:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature=null;
        Token lv_operator=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:688:33: ( ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:4: (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:4: (lv_feature= RULE_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:691:6: lv_feature= RULE_ID
                    {
                    lv_feature=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1952); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "feature"); 
                        

                    	        if (current==null) {
                    	            current = factory.create("Assignment");
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        factory.set(current, "feature", lv_feature,"ID");
                    	         

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:705:3: (lv_operator= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:707:6: lv_operator= ( '=' | '+=' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:707:18: ( '=' | '+=' )
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
                    new NoViableAltException("707:18: ( '=' | '+=' )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:707:19: '='
                    {
                    match(input,16,FOLLOW_16_in_ruleAssignment1986); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0" /* xtext::Keyword */, "operator"); 
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:712:6: '+='
                    {
                    match(input,21,FOLLOW_21_in_ruleAssignment2001); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1" /* xtext::Keyword */, "operator"); 
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create("Assignment");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "operator", input.LT(-1),null);
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:726:3: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:729:6: lv_value= ruleValue
            {
             
            	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment2049);
            lv_value=ruleValue();
            _fsp--;


            	        currentNode = currentNode.getParent();
            	        if (current==null) {
            	            current = factory.create("Assignment");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.set(current, "value", lv_value,null);
            	         

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:743:3: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:743:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleAssignment2064); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:752:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:752:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:753:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2101);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2111); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:760:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:762:33: ( ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:763:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:763:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:763:2: (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:763:2: (lv_parts= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:765:6: lv_parts= RULE_ID
            {
            lv_parts=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2157); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "parts"); 
                

            	        if (current==null) {
            	            current = factory.create("QualifiedName");
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        factory.add(current, "parts", lv_parts,"ID");
            	         

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:779:2: ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
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
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:779:3: (lv_parts= '.' ) (lv_parts= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:779:3: (lv_parts= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:781:6: lv_parts= '.'
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleQualifiedName2190); 

            	            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, "parts"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create("QualifiedName");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "parts", input.LT(-1),".");
            	    	         

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:795:2: (lv_parts= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:797:6: lv_parts= RULE_ID
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2223); 
            	     
            	        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "parts"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create("QualifiedName");
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        factory.add(current, "parts", lv_parts,"ID");
            	    	         

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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_ruleImport316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_ruleImport343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_entryRuleJavaImport377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaImport387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJavaImport423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaImport457 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleJavaImport472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJavaImport493 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJavaImport517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_entryRuleGenericImport552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericImport562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGenericImport597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericImport618 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGenericImport640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable862 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleLocalVariable884 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLocalVariable918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocalVariable934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesFileImport979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport1015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertiesFileImport1024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport1046 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePropertiesFileImport1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_entryRuleComplexValue1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexValue1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue1452 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleComplexValue1467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue1488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexValue1523 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue1570 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleComplexValue1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRef1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWorkflowRef1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef1688 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowRef1709 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef1744 = new BitSet(new long[]{0x0000000000310020L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowRef1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1952 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleAssignment1986 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_21_in_ruleAssignment2001 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment2049 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAssignment2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2157 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName2190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2223 = new BitSet(new long[]{0x0000000000001002L});

}