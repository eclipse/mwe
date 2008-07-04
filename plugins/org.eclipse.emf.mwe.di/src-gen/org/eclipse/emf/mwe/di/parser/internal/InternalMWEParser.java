// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-07-04 13:33:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_LEXER_BODY", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "';'", "'var'", "'='", "'file'", "':'", "'{'", "'}'", "'+='"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_LEXER_BODY=10;

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
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0" /* xtext::ParserRule */, currentNode); 
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

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:76:5: lv_imports= ruleImport
            	    {
            	     
            	            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleImport_in_ruleFile135);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:87:3: (lv_properties= ruleProperty )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:89:5: lv_properties= ruleProperty
            	    {
            	     
            	            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile165);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:100:4: (lv_value= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:5: lv_value= ruleComplexValue
            {
             
                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile196);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:118:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:118:48: (iv_ruleImport= ruleImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:119:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport232);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport242); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:126:1: ruleImport returns [EObject current=null] : (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_JavaImport = null;

        EObject this_GenericImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:128:33: ( (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:129:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:129:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("129:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("129:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:130:5: this_JavaImport= ruleJavaImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleJavaImport_in_ruleImport289);
                    this_JavaImport=ruleJavaImport();
                    _fsp--;

                     
                            current = this_JavaImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:140:5: this_GenericImport= ruleGenericImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericImport_in_ruleImport316);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:153:1: entryRuleJavaImport returns [EObject current=null] : iv_ruleJavaImport= ruleJavaImport EOF ;
    public final EObject entryRuleJavaImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:153:52: (iv_ruleJavaImport= ruleJavaImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:154:2: iv_ruleJavaImport= ruleJavaImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleJavaImport_in_entryRuleJavaImport350);
            iv_ruleJavaImport=ruleJavaImport();
            _fsp--;

             current =iv_ruleJavaImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaImport360); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:1: ruleJavaImport returns [EObject current=null] : ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard=null;
        EObject lv_javaImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:163:33: ( ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:3: ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:3: ( 'import' (lv_javaImport= ruleQualifiedName ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:164:4: 'import' (lv_javaImport= ruleQualifiedName )
            {
            match(input,12,FOLLOW_12_in_ruleJavaImport396); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:169:1: (lv_javaImport= ruleQualifiedName )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:171:5: lv_javaImport= ruleQualifiedName
            {
             
                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaImport425);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:182:3: ( '.' (lv_wildcard= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:182:4: '.' (lv_wildcard= '*' )
                    {
                    match(input,13,FOLLOW_13_in_ruleJavaImport437); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:187:1: (lv_wildcard= '*' )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:188:5: lv_wildcard= '*'
                    {
                    lv_wildcard=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleJavaImport455); 

                            if (current==null) {
                                current = factory.create("JavaImport");
                                associateNodeWithAstElement(currentNode, current);
                            }
                            factory.set(current, "wildcard", true,"*");        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::Keyword */, "wildcard");    

                    }


                    }
                    break;

            }


            }

            match(input,15,FOLLOW_15_in_ruleJavaImport470); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:206:1: entryRuleGenericImport returns [EObject current=null] : iv_ruleGenericImport= ruleGenericImport EOF ;
    public final EObject entryRuleGenericImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:206:55: (iv_ruleGenericImport= ruleGenericImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:2: iv_ruleGenericImport= ruleGenericImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleGenericImport_in_entryRuleGenericImport506);
            iv_ruleGenericImport=ruleGenericImport();
            _fsp--;

             current =iv_ruleGenericImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericImport516); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:214:1: ruleGenericImport returns [EObject current=null] : ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject ruleGenericImport() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:216:33: ( ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:2: ( 'import' (lv_value= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:2: ( 'import' (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:3: 'import' (lv_value= RULE_STRING )
            {
            match(input,12,FOLLOW_12_in_ruleGenericImport551); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:222:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:223:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericImport569); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "value"); 
                

                    if (current==null) {
                        current = factory.create("GenericImport");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "value", lv_value,"STRING");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:234:3: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:234:4: ';'
                    {
                    match(input,15,FOLLOW_15_in_ruleGenericImport588); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                        

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:244:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:244:50: (iv_ruleProperty= ruleProperty EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:245:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty626);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty636); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:252:1: ruleProperty returns [EObject current=null] : (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable = null;

        EObject this_PropertiesFileImport = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:254:33: ( (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:255:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:255:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("255:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("255:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:256:5: this_LocalVariable= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty683);
                    this_LocalVariable=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:266:5: this_PropertiesFileImport= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty710);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:279:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:279:55: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:280:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable744);
            iv_ruleLocalVariable=ruleLocalVariable();
            _fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable754); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:287:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:289:33: ( ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:3: ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:3: ( 'var' (lv_name= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:4: 'var' (lv_name= RULE_ID )
            {
            match(input,16,FOLLOW_16_in_ruleLocalVariable790); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:295:1: (lv_name= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:296:5: lv_name= RULE_ID
            {
            lv_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable808); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "name"); 
                

                    if (current==null) {
                        current = factory.create("LocalVariable");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "name", lv_name,"ID");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:307:3: ( '=' (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:307:4: '=' (lv_value= ruleValue )
            {
            match(input,17,FOLLOW_17_in_ruleLocalVariable827); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:312:1: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:314:5: lv_value= ruleValue
            {
             
                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleLocalVariable856);
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


            }

            match(input,15,FOLLOW_15_in_ruleLocalVariable868); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:335:1: entryRulePropertiesFileImport returns [EObject current=null] : iv_rulePropertiesFileImport= rulePropertiesFileImport EOF ;
    public final EObject entryRulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesFileImport = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:335:62: (iv_rulePropertiesFileImport= rulePropertiesFileImport EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:336:2: iv_rulePropertiesFileImport= rulePropertiesFileImport EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport904);
            iv_rulePropertiesFileImport=rulePropertiesFileImport();
            _fsp--;

             current =iv_rulePropertiesFileImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertiesFileImport914); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:343:1: rulePropertiesFileImport returns [EObject current=null] : ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:345:33: ( ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:3: ( 'var' 'file' ) (lv_file= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:3: ( 'var' 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:346:4: 'var' 'file'
            {
            match(input,16,FOLLOW_16_in_rulePropertiesFileImport950); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            match(input,18,FOLLOW_18_in_rulePropertiesFileImport960); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:356:2: (lv_file= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:357:5: lv_file= RULE_STRING
            {
            lv_file=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport979); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "file"); 
                

                    if (current==null) {
                        current = factory.create("PropertiesFileImport");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "file", lv_file,"STRING");    

            }


            }

            match(input,15,FOLLOW_15_in_rulePropertiesFileImport997); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:378:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:378:47: (iv_ruleValue= ruleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:379:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1033);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1043); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:386:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue = null;

        EObject this_ComplexValue = null;

        EObject this_IdRef = null;

        EObject this_WorkflowRef = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:388:33: ( ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||(LA9_0>=19 && LA9_0<=20)) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("389:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_STRING||(LA8_0>=19 && LA8_0<=20)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_ID) ) {
                        int LA8_2 = input.LA(2);

                        if ( (LA8_2==13||(LA8_2>=19 && LA8_2<=20)) ) {
                            alt8=1;
                        }
                        else if ( (LA8_2==EOF||LA8_2==RULE_ID||LA8_2==15||LA8_2==17||(LA8_2>=21 && LA8_2<=22)) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("389:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 8, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("389:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==RULE_STRING) ) {
                                alt7=1;
                            }
                            else if ( (LA7_0==RULE_ID||(LA7_0>=19 && LA7_0<=20)) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("389:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:390:5: this_SimpleValue= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue1092);
                                    this_SimpleValue=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:400:5: this_ComplexValue= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue1119);
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
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:410:5: this_IdRef= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue1147);
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
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:420:5: this_WorkflowRef= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue1175);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:433:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:433:53: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:434:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.8" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1209);
            iv_ruleSimpleValue=ruleSimpleValue();
            _fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValue1219); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:441:1: ruleSimpleValue returns [EObject current=null] : (lv_value= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:443:33: ( (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:444:1: (lv_value= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:444:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:445:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue1260); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.8/@alternatives/@terminal" /* xtext::RuleCall */, "value"); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:463:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:463:54: (iv_ruleComplexValue= ruleComplexValue EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:464:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleComplexValue_in_entryRuleComplexValue1304);
            iv_ruleComplexValue=ruleComplexValue();
            _fsp--;

             current =iv_ruleComplexValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexValue1314); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:471:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;
        Token lv_fooBar=null;
        EObject lv_className = null;

        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:473:33: ( ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:5: (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:5: (lv_className= ruleQualifiedName )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:476:5: lv_className= ruleQualifiedName
                    {
                     
                            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue1370);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:487:3: ( ':' (lv_id= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:487:4: ':' (lv_id= RULE_ID )
                    {
                    match(input,19,FOLLOW_19_in_ruleComplexValue1382); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:492:1: (lv_id= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:493:5: lv_id= RULE_ID
                    {
                    lv_id=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue1400); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "id"); 
                        

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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:504:5: (lv_fooBar= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:505:5: lv_fooBar= '{'
            {
            lv_fooBar=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleComplexValue1428); 

                    if (current==null) {
                        current = factory.create("ComplexValue");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "fooBar", true,"{");        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, "fooBar");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:513:3: (lv_assignments= ruleAssignment )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==17||LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:515:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue1460);
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
            	    break loop12;
                }
            } while (true);


            }

            match(input,21,FOLLOW_21_in_ruleComplexValue1472); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:536:1: entryRuleWorkflowRef returns [EObject current=null] : iv_ruleWorkflowRef= ruleWorkflowRef EOF ;
    public final EObject entryRuleWorkflowRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:536:53: (iv_ruleWorkflowRef= ruleWorkflowRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:537:2: iv_ruleWorkflowRef= ruleWorkflowRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1508);
            iv_ruleWorkflowRef=ruleWorkflowRef();
            _fsp--;

             current =iv_ruleWorkflowRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRef1518); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:544:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri=null;
        EObject lv_assignments = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:546:33: ( ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:4: ( 'file' (lv_uri= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:4: ( 'file' (lv_uri= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:547:5: 'file' (lv_uri= RULE_STRING )
            {
            match(input,18,FOLLOW_18_in_ruleWorkflowRef1555); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:552:1: (lv_uri= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:553:5: lv_uri= RULE_STRING
            {
            lv_uri=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef1573); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "uri"); 
                

                    if (current==null) {
                        current = factory.create("WorkflowRef");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "uri", lv_uri,"STRING");    

            }


            }

            match(input,20,FOLLOW_20_in_ruleWorkflowRef1591); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:569:2: (lv_assignments= ruleAssignment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==17||LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:571:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef1621);
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
            	    break loop13;
                }
            } while (true);


            }

            match(input,21,FOLLOW_21_in_ruleWorkflowRef1633); 

                    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:592:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:592:47: (iv_ruleIdRef= ruleIdRef EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:593:2: iv_ruleIdRef= ruleIdRef EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.12" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef1669);
            iv_ruleIdRef=ruleIdRef();
            _fsp--;

             current =iv_ruleIdRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef1679); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:600:1: ruleIdRef returns [EObject current=null] : (lv_id= RULE_ID ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:602:33: ( (lv_id= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:603:1: (lv_id= RULE_ID )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:603:1: (lv_id= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:604:5: lv_id= RULE_ID
            {
            lv_id=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef1720); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.12/@alternatives/@terminal" /* xtext::RuleCall */, "id"); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:620:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:620:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:621:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1762);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1772); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:628:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature=null;
        Token lv_operator=null;
        EObject lv_value = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:630:33: ( ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:4: (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:631:4: (lv_feature= RULE_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:632:5: lv_feature= RULE_ID
                    {
                    lv_feature=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1816); 
                     
                        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "feature"); 
                        

                            if (current==null) {
                                current = factory.create("Assignment");
                                associateNodeWithAstElement(currentNode, current);
                            }
                            factory.set(current, "feature", lv_feature,"ID");    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:643:3: (lv_operator= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:644:5: lv_operator= ( '=' | '+=' )
            {
            lv_operator=(Token)input.LT(1);
            if ( input.LA(1)==17||input.LA(1)==22 ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ruleAssignment1842);    throw mse;
            }


                    if (current==null) {
                        current = factory.create("Assignment");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "operator", lv_operator,null);        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Alternatives */, "operator");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:654:3: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:656:5: lv_value= ruleValue
            {
             
                    currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1885);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:667:3: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:667:4: ';'
                    {
                    match(input,15,FOLLOW_15_in_ruleAssignment1897); 

                            createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
                        

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:677:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:677:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:678:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1935);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1945); 

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:685:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:687:33: ( ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:688:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:688:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:688:2: (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:688:2: (lv_parts= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:689:5: lv_parts= RULE_ID
            {
            lv_parts=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1987); 
             
                createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "parts"); 
                

                    if (current==null) {
                        current = factory.create("QualifiedName");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.add(current, "parts", lv_parts,"ID");    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:700:2: ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:700:3: (lv_parts= '.' ) (lv_parts= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:700:3: (lv_parts= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:701:5: lv_parts= '.'
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleQualifiedName2013); 

            	            if (current==null) {
            	                current = factory.create("QualifiedName");
            	                associateNodeWithAstElement(currentNode, current);
            	            }
            	            factory.add(current, "parts", lv_parts,".");        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, "parts");    

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:709:2: (lv_parts= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:710:5: lv_parts= RULE_ID
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2033); 
            	     
            	        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "parts"); 
            	        

            	            if (current==null) {
            	                current = factory.create("QualifiedName");
            	                associateNodeWithAstElement(currentNode, current);
            	            }
            	            factory.add(current, "parts", lv_parts,"ID");    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    public static final BitSet FOLLOW_ruleImport_in_ruleFile135 = new BitSet(new long[]{0x0000000000191020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFile165 = new BitSet(new long[]{0x0000000000190020L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleFile196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_ruleImport289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_ruleImport316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_entryRuleJavaImport350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaImport360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleJavaImport396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaImport425 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleJavaImport437 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJavaImport455 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJavaImport470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_entryRuleGenericImport506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericImport516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGenericImport551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericImport569 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGenericImport588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLocalVariable790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalVariable827 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLocalVariable856 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_entryRulePropertiesFileImport904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertiesFileImport914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePropertiesFileImport950 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertiesFileImport960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_entryRuleSimpleValue1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValue1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_entryRuleComplexValue1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexValue1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue1370 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleComplexValue1382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue1400 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComplexValue1428 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue1460 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_21_in_ruleComplexValue1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_entryRuleWorkflowRef1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRef1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkflowRef1555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef1573 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowRef1591 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef1621 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_21_in_ruleWorkflowRef1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef1669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1816 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_set_in_ruleAssignment1842 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1885 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAssignment1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1987 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName2013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2033 = new BitSet(new long[]{0x0000000000002002L});

}