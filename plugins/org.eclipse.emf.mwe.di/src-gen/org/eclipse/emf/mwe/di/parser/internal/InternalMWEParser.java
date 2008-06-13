// $ANTLR 3.0.1 ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g 2008-06-13 17:38:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_LEXER_BODY", "RULE_ANY_OTHER", "'property'", "'='", "';'", "'properties'", "'id'", "'{'", "'}'", "'file'", "'idRef'", "'+='", "'.'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=5;
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:100:1: ruleFile returns [EObject current=null] : ( (lv_properties= ruleProperty )* (lv_value= ruleComplexValue ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_properties = null;

        EObject lv_value = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:101:33: ( ( (lv_properties= ruleProperty )* (lv_value= ruleComplexValue ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:1: ( (lv_properties= ruleProperty )* (lv_value= ruleComplexValue ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:1: ( (lv_properties= ruleProperty )* (lv_value= ruleComplexValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:2: (lv_properties= ruleProperty )* (lv_value= ruleComplexValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:102:2: (lv_properties= ruleProperty )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:104:5: lv_properties= ruleProperty
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFile133);
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
            	    break loop1;
                }
            } while (true);

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:115:3: (lv_value= ruleComplexValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:117:5: lv_value= ruleComplexValue
            {
             
                    currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleComplexValue_in_ruleFile163);
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


    // $ANTLR start ruleProperty
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:133:1: ruleProperty returns [EObject current=null] : (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariable = null;

        EObject this_PropertiesFileImport = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:134:33: ( (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:135:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:135:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("135:1: (this_LocalVariable= ruleLocalVariable | this_PropertiesFileImport= rulePropertiesFileImport )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:136:5: this_LocalVariable= ruleLocalVariable
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleProperty211);
                    this_LocalVariable=ruleLocalVariable();
                    _fsp--;

                     
                            current = this_LocalVariable; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:146:5: this_PropertiesFileImport= rulePropertiesFileImport
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertiesFileImport_in_ruleProperty238);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:159:1: ruleLocalVariable returns [EObject current=null] : ( ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) ) ( ';' )? ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name=null;
        Token lv_value=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:160:33: ( ( ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:1: ( ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:1: ( ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:2: ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:2: ( ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:3: ( 'property' (lv_name= RULE_ID ) ) ( '=' (lv_value= RULE_STRING ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:3: ( 'property' (lv_name= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:161:4: 'property' (lv_name= RULE_ID )
            {
            match(input,12,FOLLOW_12_in_ruleLocalVariable273); 

                    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:166:1: (lv_name= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:167:5: lv_name= RULE_ID
            {
            lv_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable291); 
             
                createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"name"); 
                

                    if (current==null) {
                        current = factory.create("LocalVariable");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "name", lv_name,"ID");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:178:3: ( '=' (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:178:4: '=' (lv_value= RULE_STRING )
            {
            match(input,13,FOLLOW_13_in_ruleLocalVariable310); 

                    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:183:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:184:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalVariable328); 
             
                createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
                

                    if (current==null) {
                        current = factory.create("LocalVariable");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "value", lv_value,"STRING");    

            }


            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:195:4: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:195:5: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleLocalVariable348); 

                            createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                        

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
    // $ANTLR end ruleLocalVariable


    // $ANTLR start rulePropertiesFileImport
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:205:1: rulePropertiesFileImport returns [EObject current=null] : ( ( 'properties' (lv_file= RULE_STRING ) ) ( ';' )? ) ;
    public final EObject rulePropertiesFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_file=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:206:33: ( ( ( 'properties' (lv_file= RULE_STRING ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:1: ( ( 'properties' (lv_file= RULE_STRING ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:1: ( ( 'properties' (lv_file= RULE_STRING ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:2: ( 'properties' (lv_file= RULE_STRING ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:2: ( 'properties' (lv_file= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:207:3: 'properties' (lv_file= RULE_STRING )
            {
            match(input,15,FOLLOW_15_in_rulePropertiesFileImport386); 

                    createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:212:1: (lv_file= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:213:5: lv_file= RULE_STRING
            {
            lv_file=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertiesFileImport404); 
             
                createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"file"); 
                

                    if (current==null) {
                        current = factory.create("PropertiesFileImport");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "file", lv_file,"STRING");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:224:3: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:224:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_rulePropertiesFileImport423); 

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
    // $ANTLR end rulePropertiesFileImport


    // $ANTLR start ruleValue
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:234:1: ruleValue returns [EObject current=null] : ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue = null;

        EObject this_ComplexValue = null;

        EObject this_IdRef = null;

        EObject this_WorkflowRef = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:235:33: ( ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=16 && LA7_0<=17)||LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("236:1: ( ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef ) | this_WorkflowRef= ruleWorkflowRef )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    {
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=16 && LA6_0<=17)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==20) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("236:2: ( (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue ) | this_IdRef= ruleIdRef )", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            {
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:236:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==RULE_STRING) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==RULE_ID||(LA5_0>=16 && LA5_0<=17)) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("236:3: (this_SimpleValue= ruleSimpleValue | this_ComplexValue= ruleComplexValue )", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:237:5: this_SimpleValue= ruleSimpleValue
                                    {
                                     
                                            currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleValue_in_ruleValue475);
                                    this_SimpleValue=ruleSimpleValue();
                                    _fsp--;

                                     
                                            current = this_SimpleValue; 
                                            currentNode = currentNode.getParent();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:247:5: this_ComplexValue= ruleComplexValue
                                    {
                                     
                                            currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                        
                                    pushFollow(FOLLOW_ruleComplexValue_in_ruleValue502);
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
                            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:257:5: this_IdRef= ruleIdRef
                            {
                             
                                    currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
                                
                            pushFollow(FOLLOW_ruleIdRef_in_ruleValue530);
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
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:267:5: this_WorkflowRef= ruleWorkflowRef
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleWorkflowRef_in_ruleValue558);
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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:280:1: ruleSimpleValue returns [EObject current=null] : (lv_value= RULE_STRING ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:281:33: ( (lv_value= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:282:1: (lv_value= RULE_STRING )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:282:1: (lv_value= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:283:5: lv_value= RULE_STRING
            {
            lv_value=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValue598); 
             
                createLeafNode("//@parserRules.5/@alternatives/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:301:1: ruleComplexValue returns [EObject current=null] : ( ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;
        Token lv_fooBar=null;
        EObject lv_className = null;

        EObject lv_assignments = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:302:33: ( ( ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:1: ( ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:2: ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:2: ( ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:3: ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:3: ( ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:4: ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? ) (lv_fooBar= '{' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:4: ( (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:5: (lv_className= ruleQualifiedName )? ( 'id' (lv_id= RULE_ID ) )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:303:5: (lv_className= ruleQualifiedName )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:305:5: lv_className= ruleQualifiedName
                    {
                     
                            currentNode=createCompositeNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexValue663);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:316:3: ( 'id' (lv_id= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:316:4: 'id' (lv_id= RULE_ID )
                    {
                    match(input,16,FOLLOW_16_in_ruleComplexValue675); 

                            createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                        
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:321:1: (lv_id= RULE_ID )
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:322:5: lv_id= RULE_ID
                    {
                    lv_id=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexValue693); 
                     
                        createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
                        

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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:333:5: (lv_fooBar= '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:334:5: lv_fooBar= '{'
            {
            lv_fooBar=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_ruleComplexValue721); 

                    if (current==null) {
                        current = factory.create("ComplexValue");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "fooBar", true,"{");        createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, currentNode,"fooBar");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:342:3: (lv_assignments= ruleAssignment )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:344:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleComplexValue753);
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
            	    break loop10;
                }
            } while (true);


            }

            match(input,18,FOLLOW_18_in_ruleComplexValue765); 

                    createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:365:1: ruleWorkflowRef returns [EObject current=null] : ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) ;
    public final EObject ruleWorkflowRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri=null;
        EObject lv_assignments = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:366:33: ( ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:1: ( ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* ) '}'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:2: ( ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' ) (lv_assignments= ruleAssignment )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:3: ( ( 'file' (lv_uri= RULE_STRING ) ) '{' )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:4: ( 'file' (lv_uri= RULE_STRING ) ) '{'
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:4: ( 'file' (lv_uri= RULE_STRING ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:367:5: 'file' (lv_uri= RULE_STRING )
            {
            match(input,19,FOLLOW_19_in_ruleWorkflowRef803); 

                    createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:372:1: (lv_uri= RULE_STRING )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:373:5: lv_uri= RULE_STRING
            {
            lv_uri=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkflowRef821); 
             
                createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"uri"); 
                

                    if (current==null) {
                        current = factory.create("WorkflowRef");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "uri", lv_uri,"STRING");    

            }


            }

            match(input,17,FOLLOW_17_in_ruleWorkflowRef839); 

                    createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:389:2: (lv_assignments= ruleAssignment )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:391:5: lv_assignments= ruleAssignment
            	    {
            	     
            	            currentNode=createCompositeNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleWorkflowRef869);
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
            	    break loop11;
                }
            } while (true);


            }

            match(input,18,FOLLOW_18_in_ruleWorkflowRef881); 

                    createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:412:1: ruleIdRef returns [EObject current=null] : ( 'idRef' (lv_id= RULE_ID ) ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token lv_id=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:413:33: ( ( 'idRef' (lv_id= RULE_ID ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:414:1: ( 'idRef' (lv_id= RULE_ID ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:414:1: ( 'idRef' (lv_id= RULE_ID ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:414:2: 'idRef' (lv_id= RULE_ID )
            {
            match(input,20,FOLLOW_20_in_ruleIdRef916); 

                    createLeafNode("//@parserRules.9/@alternatives/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
                
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:419:1: (lv_id= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:420:5: lv_id= RULE_ID
            {
            lv_id=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdRef934); 
             
                createLeafNode("//@parserRules.9/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
                

                    if (current==null) {
                        current = factory.create("IdRef");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "id", lv_id,"ID");    

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
    // $ANTLR end ruleIdRef


    // $ANTLR start ruleAssignment
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:436:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature=null;
        Token lv_operator=null;
        EObject lv_value = null;


         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:437:33: ( ( ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:1: ( ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:1: ( ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )? )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:2: ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) ) ( ';' )?
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:2: ( ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:3: ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) ) (lv_value= ruleValue )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:3: ( (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:4: (lv_feature= RULE_ID ) (lv_operator= ( '=' | '+=' ) )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:438:4: (lv_feature= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:439:5: lv_feature= RULE_ID
            {
            lv_feature=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment986); 
             
                createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"feature"); 
                

                    if (current==null) {
                        current = factory.create("Assignment");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "feature", lv_feature,"ID");    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:450:2: (lv_operator= ( '=' | '+=' ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:451:5: lv_operator= ( '=' | '+=' )
            {
            lv_operator=(Token)input.LT(1);
            if ( input.LA(1)==13||input.LA(1)==21 ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ruleAssignment1011);    throw mse;
            }


                    if (current==null) {
                        current = factory.create("Assignment");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.set(current, "operator", lv_operator,null);        createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Alternatives */, currentNode,"operator");    

            }


            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:461:3: (lv_value= ruleValue )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:463:5: lv_value= ruleValue
            {
             
                    currentNode=createCompositeNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1054);
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

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:3: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:474:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_ruleAssignment1066); 

                            createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
                        

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
    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:484:1: ruleQualifiedName returns [EObject current=null] : ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_parts=null;

         EObject temp=null; 
        try {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:485:33: ( ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* ) )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:486:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:486:1: ( (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )* )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:486:2: (lv_parts= RULE_ID ) ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            {
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:486:2: (lv_parts= RULE_ID )
            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:487:5: lv_parts= RULE_ID
            {
            lv_parts=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1111); 
             
                createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
                

                    if (current==null) {
                        current = factory.create("QualifiedName");
                        associateNodeWithAstElement(currentNode, current);
                    }
                    factory.add(current, "parts", lv_parts,"ID");    

            }

            // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:2: ( (lv_parts= '.' ) (lv_parts= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:3: (lv_parts= '.' ) (lv_parts= RULE_ID )
            	    {
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:498:3: (lv_parts= '.' )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:499:5: lv_parts= '.'
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleQualifiedName1137); 

            	            if (current==null) {
            	                current = factory.create("QualifiedName");
            	                associateNodeWithAstElement(currentNode, current);
            	            }
            	            factory.add(current, "parts", lv_parts,".");        createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, currentNode,"parts");    

            	    }

            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:507:2: (lv_parts= RULE_ID )
            	    // ./src-gen/org/eclipse/emf/mwe/di/parser/internal/InternalMWE.g:508:5: lv_parts= RULE_ID
            	    {
            	    lv_parts=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1157); 
            	     
            	        createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
            	        

            	            if (current==null) {
            	                current = factory.create("QualifiedName");
            	                associateNodeWithAstElement(currentNode, current);
            	            }
            	            factory.add(current, "parts", lv_parts,"ID");    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    public static final BitSet FOLLOW_ruleProperty_in_ruleFile133 = new BitSet(new long[]{0x0000000000039010L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleFile163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleProperty211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertiesFileImport_in_ruleProperty238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLocalVariable273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocalVariable310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalVariable328 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleLocalVariable348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePropertiesFileImport386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertiesFileImport404 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePropertiesFileImport423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValue_in_ruleValue475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexValue_in_ruleValue502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleValue530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRef_in_ruleValue558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValue598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexValue663 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleComplexValue675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexValue693 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexValue721 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleComplexValue753 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleComplexValue765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowRef803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkflowRef821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWorkflowRef839 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleWorkflowRef869 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleWorkflowRef881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIdRef916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdRef934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment986 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_set_in_ruleAssignment1011 = new BitSet(new long[]{0x00000000001B0030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1054 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAssignment1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1111 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1157 = new BitSet(new long[]{0x0000000000400002L});

}