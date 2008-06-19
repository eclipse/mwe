// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-06-19 10:31:08

package org.eclipse.emf.mwe.di.parser.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;


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


     
        public InternalMWEParser(TokenStream input, IElementFactory factory, Grammar g) {
            this(input);
            this.factory = factory;
    		grammar = g;
        }
        
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = InternalMWEParser.class.getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/internal/InternalMWE.tokens");
        }



    // $ANTLR start internalParse
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:91:1: internalParse returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject internalParse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:91:46: (iv_ruleFile= ruleFile EOF )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:92:3: iv_ruleFile= ruleFile EOF
            {
             currentNode = createCompositeNode("//@parserRules.0" /* xtext::ParserRule */, currentNode); 
            pushFollow(FOLLOW_ruleFile_in_internalParse78);
            iv_ruleFile=ruleFile();
            _fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_internalParse88); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end internalParse


    // $ANTLR start ruleFile
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:100:1: ruleFile returns [EObject current=null] : ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports = null;

        EObject lv_properties = null;

        EObject lv_value = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:101:33: ( ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:1: ( ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* ) (lv_value= ruleComplexValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:2: ( (lv_imports= ruleImport )* (lv_properties= ruleProperty )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:3: (lv_imports= ruleImport )* (lv_properties= ruleProperty )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:3: (lv_imports= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:104:5: lv_imports= ruleImport
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleImport_in_ruleFile134);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:115:3: (lv_properties= ruleProperty )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:117:5: lv_properties= ruleProperty
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile164);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:128:4: (lv_value= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:130:5: lv_value= ruleComplexValue
            {
             
                    currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile195);
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

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFile


    // $ANTLR start ruleImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:146:1: ruleImport returns [EObject current=null] : (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_JavaImport = null;

        EObject this_GenericImport = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:147:33: ( (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:148:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:148:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )
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
                        new NoViableAltException("148:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("148:1: (this_JavaImport= ruleJavaImport | this_GenericImport= ruleGenericImport )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:149:5: this_JavaImport= ruleJavaImport
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleJavaImport_in_ruleImport243);
                    this_JavaImport=ruleJavaImport();
                    _fsp--;

                     
                            current = this_JavaImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:159:5: this_GenericImport= ruleGenericImport
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleGenericImport_in_ruleImport270);
                    this_GenericImport=ruleGenericImport();
                    _fsp--;

                     
                            current = this_GenericImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start ruleJavaImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:172:1: ruleJavaImport returns [EObject current=null] : ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard=null;
        EObject lv_javaImport = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:173:33: ( ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:1: ( ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:2: ( ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:3: ( 'import' (lv_javaImport= ruleQualifiedName ) ) ( '.' (lv_wildcard= '*' ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:3: ( 'import' (lv_javaImport= ruleQualifiedName ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:174:4: 'import' (lv_javaImport= ruleQualifiedName )
            {
            match(input,12,FOLLOW_12_in_ruleJavaImport305); 

                    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:179:1: (lv_javaImport= ruleQualifiedName )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:181:5: lv_javaImport= ruleQualifiedName
            {
             
                    currentNode=createCompositeNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJavaImport334);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:192:3: ( '.' (lv_wildcard= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:192:4: '.' (lv_wildcard= '*' )
                    {
                    match(input,13,FOLLOW_13_in_ruleJavaImport346); 

                            createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:197:1: (lv_wildcard= '*' )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:198:5: lv_wildcard= '*'
                    {
                    lv_wildcard=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleJavaImport364); 

                            if (current==null) {
                                current = factory.create("JavaImport");
                                associateNodeWithAstElement(currentNode, current);
                            }
                            factory.set(current, "wildcard", true,"*");        createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::Keyword */, currentNode,"wildcard");    

                    }


                    }
                    break;

            }


            }

            match(input,15,FOLLOW_15_in_ruleJavaImport379); 

                    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJavaImport


    // $ANTLR start ruleGenericImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:216:1: ruleGenericImport returns [EObject current=null] : ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject ruleGenericImport() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:217:33: ( ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:218:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:218:1: ( ( 'import' (lv_value= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:218:2: ( 'import' (lv_value= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:218:2: ( 'import' (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:218:3: 'import' (lv_value= RULE_STRING )
            {
            match(input,12,FOLLOW_12_in_ruleGenericImport415); 

                    createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:223:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:224:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenericImport433); 
             
                createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
                

                    if (current==null) {
                        current = factory.create("GenericImport");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "value", lv_value,"STRING");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:235:3: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:235:4: ';'
                    {
                    match(input,15,FOLLOW_15_in_ruleGenericImport452); 

                            createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                        

                    }
                    break;

            }


            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGenericImport


    // $ANTLR start ruleProperty
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:245:1: ruleProperty returns [EObject current=null] : (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable = null;

        EObject this_PropertiesFileImport = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:246:33: ( (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:247:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:247:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("247:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("247:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:248:5: this_LocalVariable= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty502);
                    this_LocalVariable=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:258:5: this_PropertiesFileImport= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty529);
                    this_PropertiesFileImport=rulePropertiesFileImport();
                    _fsp--;

                     
                            current = this_PropertiesFileImport; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start ruleLocalVariable
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:271:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name=null;
        EObject lv_value = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:272:33: ( ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:1: ( ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:2: ( ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:3: ( 'var' (lv_name= RULE_ID ) ) ( '=' (lv_value= ruleValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:3: ( 'var' (lv_name= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:273:4: 'var' (lv_name= RULE_ID )
            {
            match(input,16,FOLLOW_16_in_ruleLocalVariable564); 

                    createLeafNode("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:278:1: (lv_name= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:279:5: lv_name= RULE_ID
            {
            lv_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable582); 
             
                createLeafNode("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"name"); 
                

                    if (current==null) {
                        current = factory.create("LocalVariable");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "name", lv_name,"ID");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:3: ( '=' (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:290:4: '=' (lv_value= ruleValue )
            {
            match(input,17,FOLLOW_17_in_ruleLocalVariable601); 

                    createLeafNode("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:295:1: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:297:5: lv_value= ruleValue
            {
             
                    currentNode=createCompositeNode("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleLocalVariable630);
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

            match(input,15,FOLLOW_15_in_ruleLocalVariable642); 

                    createLeafNode("//@parserRules.5/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalVariable


    // $ANTLR start rulePropertiesFileImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:318:1: rulePropertiesFileImport returns [EObject current=null] : ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:319:33: ( ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:1: ( ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) ) ';'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:2: ( ( 'var' 'file' ) (lv_file= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:3: ( 'var' 'file' ) (lv_file= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:3: ( 'var' 'file' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:320:4: 'var' 'file'
            {
            match(input,16,FOLLOW_16_in_rulePropertiesFileImport679); 

                    createLeafNode("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            match(input,18,FOLLOW_18_in_rulePropertiesFileImport689); 

                    createLeafNode("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:330:2: (lv_file= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:331:5: lv_file= RULE_STRING
            {
            lv_file=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport708); 
             
                createLeafNode("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"file"); 
                

                    if (current==null) {
                        current = factory.create("PropertiesFileImport");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "file", lv_file,"STRING");    

            }


            }

            match(input,15,FOLLOW_15_in_rulePropertiesFileImport726); 

                    createLeafNode("//@parserRules.6/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePropertiesFileImport


    // $ANTLR start ruleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:352:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue = null;

        EObject this_ComplexValue = null;

        EObject this_IdRef = null;

        EObject this_WorkflowRef = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:353:33: ( ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
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
                    new NoViableAltException("354:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
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
                        else if ( (LA8_2==RULE_ID||LA8_2==15||LA8_2==17||(LA8_2>=21 && LA8_2<=22)) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("354:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 8, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("354:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:354:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
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
                                    new NoViableAltException("354:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:355:5: this_SimpleValue= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode("//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue776);
                                    this_SimpleValue=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:365:5: this_ComplexValue= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode("//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue803);
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
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:375:5: this_IdRef= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode("//@parserRules.7/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue831);
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
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:385:5: this_WorkflowRef= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.7/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue859);
                    this_WorkflowRef=ruleWorkflowRef();
                    _fsp--;

                     
                            current = this_WorkflowRef; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValue


    // $ANTLR start ruleSimpleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:398:1: ruleSimpleValue returns [EObject current=null] : (lv_value= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:399:33: ( (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:400:1: (lv_value= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:400:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:401:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue899); 
             
                createLeafNode("//@parserRules.8/@alternatives/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
                

                    if (current==null) {
                        current = factory.create("SimpleValue");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "value", lv_value,"STRING");    

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleValue


    // $ANTLR start ruleComplexValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:419:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;
        Token lv_fooBar=null;
        EObject lv_className = null;

        EObject lv_assignments = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:420:33: ( ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:2: ( ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:3: ( ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:4: ( (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:5: (lv_className= ruleQualifiedName )? ( ':' (lv_id= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:421:5: (lv_className= ruleQualifiedName )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:423:5: lv_className= ruleQualifiedName
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue964);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:434:3: ( ':' (lv_id= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:434:4: ':' (lv_id= RULE_ID )
                    {
                    match(input,19,FOLLOW_19_in_ruleComplexValue976); 

                            createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:439:1: (lv_id= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:440:5: lv_id= RULE_ID
                    {
                    lv_id=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue994); 
                     
                        createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
                        

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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:451:5: (lv_fooBar= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:452:5: lv_fooBar= '{'
            {
            lv_fooBar=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleComplexValue1022); 

                    if (current==null) {
                        current = factory.create("ComplexValue");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "fooBar", true,"{");        createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, currentNode,"fooBar");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:460:3: (lv_assignments= ruleAssignment )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==17||LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:462:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue1054);
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

            match(input,21,FOLLOW_21_in_ruleComplexValue1066); 

                    createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComplexValue


    // $ANTLR start ruleWorkflowRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:483:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri=null;
        EObject lv_assignments = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:484:33: ( ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:4: ( 'file' (lv_uri= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:4: ( 'file' (lv_uri= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:5: 'file' (lv_uri= RULE_STRING )
            {
            match(input,18,FOLLOW_18_in_ruleWorkflowRef1104); 

                    createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:490:1: (lv_uri= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:491:5: lv_uri= RULE_STRING
            {
            lv_uri=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef1122); 
             
                createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"uri"); 
                

                    if (current==null) {
                        current = factory.create("WorkflowRef");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "uri", lv_uri,"STRING");    

            }


            }

            match(input,20,FOLLOW_20_in_ruleWorkflowRef1140); 

                    createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:507:2: (lv_assignments= ruleAssignment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==17||LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:509:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef1170);
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

            match(input,21,FOLLOW_21_in_ruleWorkflowRef1182); 

                    createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWorkflowRef


    // $ANTLR start ruleIdRef
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:530:1: ruleIdRef returns [EObject current=null] : (lv_id= RULE_ID ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:531:33: ( (lv_id= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:532:1: (lv_id= RULE_ID )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:532:1: (lv_id= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:533:5: lv_id= RULE_ID
            {
            lv_id=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef1224); 
             
                createLeafNode("//@parserRules.12/@alternatives/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
                

                    if (current==null) {
                        current = factory.create("IdRef");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "id", lv_id,"ID");    

            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIdRef


    // $ANTLR start ruleAssignment
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:549:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature=null;
        Token lv_operator=null;
        EObject lv_value = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:550:33: ( ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:1: ( ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:2: ( ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:3: ( (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:4: (lv_feature= RULE_ID )? (lv_operator= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:551:4: (lv_feature= RULE_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:552:5: lv_feature= RULE_ID
                    {
                    lv_feature=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1275); 
                     
                        createLeafNode("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"feature"); 
                        

                            if (current==null) {
                                current = factory.create("Assignment");
                                associateNodeWithAstElement(currentNode, current);
                            }
                            factory.set(current, "feature", lv_feature,"ID");    

                    }
                    break;

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:563:3: (lv_operator= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:564:5: lv_operator= ( '=' | '+=' )
            {
            lv_operator=(Token)input.LT(1);
            if ( input.LA(1)==17||input.LA(1)==22 ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ruleAssignment1301);    throw mse;
            }


                    if (current==null) {
                        current = factory.create("Assignment");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "operator", lv_operator,null);        createLeafNode("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Alternatives */, currentNode,"operator");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:574:3: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:576:5: lv_value= ruleValue
            {
             
                    currentNode=createCompositeNode("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1344);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:587:3: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:587:4: ';'
                    {
                    match(input,15,FOLLOW_15_in_ruleAssignment1356); 

                            createLeafNode("//@parserRules.13/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                        

                    }
                    break;

            }


            }


            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start ruleQualifiedName
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:597:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:598:33: ( ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:599:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:599:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:599:2: (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:599:2: (lv_parts= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:600:5: lv_parts= RULE_ID
            {
            lv_parts=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1401); 
             
                createLeafNode("//@parserRules.14/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
                

                    if (current==null) {
                        current = factory.create("QualifiedName");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.add(current, "parts", lv_parts,"ID");    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:611:2: ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
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
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:611:3: (lv_parts= '.' ) (lv_parts= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:611:3: (lv_parts= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:612:5: lv_parts= '.'
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleQualifiedName1427); 

            	            if (current==null) {
            	                current = factory.create("QualifiedName");
            	                associateNodeWithAstElement(currentNode, current);
            	            }
            	            factory.add(current, "parts", lv_parts,".");        createLeafNode("//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, currentNode,"parts");    

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:620:2: (lv_parts= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:621:5: lv_parts= RULE_ID
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1447); 
            	     
            	        createLeafNode("//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
            	        

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

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
                IParseError error = createParseError(re);
                reportError(error, re);
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedName


 

    public static final BitSet FOLLOW_ruleFile_in_internalParse78 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_internalParse88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFile134 = new BitSet(new long[]{0x0000000000191020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFile164 = new BitSet(new long[]{0x0000000000190020L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleFile195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaImport_in_ruleImport243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericImport_in_ruleImport270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleJavaImport305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJavaImport334 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleJavaImport346 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJavaImport364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJavaImport379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGenericImport415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenericImport433 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGenericImport452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLocalVariable564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable582 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalVariable601 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLocalVariable630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePropertiesFileImport679 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertiesFileImport689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue964 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleComplexValue976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue994 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComplexValue1022 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue1054 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_21_in_ruleComplexValue1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWorkflowRef1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef1122 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowRef1140 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef1170 = new BitSet(new long[]{0x0000000000620020L});
    public static final BitSet FOLLOW_21_in_ruleWorkflowRef1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1275 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_set_in_ruleAssignment1301 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1344 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAssignment1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1401 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName1427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1447 = new BitSet(new long[]{0x0000000000002002L});

}