package org.eclipse.emf.mwe.properties.parser.antlr.internal; 

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
import org.eclipse.emf.mwe.properties.services.MWEPropertiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMWEPropertiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_LINE_TERMINATOR", "RULE_SL_COMMENT", "RULE_ID", "RULE_ANY_OTHER", "'='", "':'", "'\\\\'", "'\\\\:'", "'\\\\='", "'/'", "'.'"
    };
    public static final int RULE_LINE_TERMINATOR=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_SL_COMMENT=6;

        public InternalMWEPropertiesParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g"; }



     	private MWEPropertiesGrammarAccess grammarAccess;
     	
        public InternalMWEPropertiesParser(TokenStream input, IAstFactory factory, MWEPropertiesGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PropertyFile";	
       	} 



    // $ANTLR start entryRulePropertyFile
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:72:1: entryRulePropertyFile returns [EObject current=null] : iv_rulePropertyFile= rulePropertyFile EOF ;
    public final EObject entryRulePropertyFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFile = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:73:2: (iv_rulePropertyFile= rulePropertyFile EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:74:2: iv_rulePropertyFile= rulePropertyFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyFileRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyFile_in_entryRulePropertyFile75);
            iv_rulePropertyFile=rulePropertyFile();
            _fsp--;

             current =iv_rulePropertyFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFile85); 

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
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:81:1: rulePropertyFile returns [EObject current=null] : ( (lv_entries_0_0= ruleNaturalLine ) )* ;
    public final EObject rulePropertyFile() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:86:6: ( ( (lv_entries_0_0= ruleNaturalLine ) )* )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:87:1: ( (lv_entries_0_0= ruleNaturalLine ) )*
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:87:1: ( (lv_entries_0_0= ruleNaturalLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WS && LA1_0<=RULE_ID)||(LA1_0>=12 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:88:1: (lv_entries_0_0= ruleNaturalLine )
            	    {
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:88:1: (lv_entries_0_0= ruleNaturalLine )
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:89:3: lv_entries_0_0= ruleNaturalLine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPropertyFileAccess().getEntriesNaturalLineParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNaturalLine_in_rulePropertyFile130);
            	    lv_entries_0_0=ruleNaturalLine();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPropertyFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entries",
            	    	        		lv_entries_0_0, 
            	    	        		"NaturalLine", 
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


    // $ANTLR start entryRuleNaturalLine
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:119:1: entryRuleNaturalLine returns [EObject current=null] : iv_ruleNaturalLine= ruleNaturalLine EOF ;
    public final EObject entryRuleNaturalLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLine = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:120:2: (iv_ruleNaturalLine= ruleNaturalLine EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:121:2: iv_ruleNaturalLine= ruleNaturalLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNaturalLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleNaturalLine_in_entryRuleNaturalLine166);
            iv_ruleNaturalLine=ruleNaturalLine();
            _fsp--;

             current =iv_ruleNaturalLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLine176); 

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
    // $ANTLR end entryRuleNaturalLine


    // $ANTLR start ruleNaturalLine
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:128:1: ruleNaturalLine returns [EObject current=null] : (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry ) ;
    public final EObject ruleNaturalLine() throws RecognitionException {
        EObject current = null;

        EObject this_BlankLine_0 = null;

        EObject this_PropertyComment_1 = null;

        EObject this_PropertyEntry_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:133:6: ( (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:134:1: (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:134:1: (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                switch ( input.LA(2) ) {
                case RULE_SL_COMMENT:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_LINE_TERMINATOR:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                case 12:
                case 13:
                case 14:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("134:1: (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry )", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LINE_TERMINATOR:
                {
                alt2=1;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 12:
            case 13:
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("134:1: (this_BlankLine_0= ruleBlankLine | this_PropertyComment_1= rulePropertyComment | this_PropertyEntry_2= rulePropertyEntry )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:135:5: this_BlankLine_0= ruleBlankLine
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNaturalLineAccess().getBlankLineParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlankLine_in_ruleNaturalLine223);
                    this_BlankLine_0=ruleBlankLine();
                    _fsp--;

                     
                            current = this_BlankLine_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:145:5: this_PropertyComment_1= rulePropertyComment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNaturalLineAccess().getPropertyCommentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertyComment_in_ruleNaturalLine250);
                    this_PropertyComment_1=rulePropertyComment();
                    _fsp--;

                     
                            current = this_PropertyComment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:155:5: this_PropertyEntry_2= rulePropertyEntry
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNaturalLineAccess().getPropertyEntryParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePropertyEntry_in_ruleNaturalLine277);
                    this_PropertyEntry_2=rulePropertyEntry();
                    _fsp--;

                     
                            current = this_PropertyEntry_2; 
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
    // $ANTLR end ruleNaturalLine


    // $ANTLR start entryRuleBlankLine
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:171:1: entryRuleBlankLine returns [EObject current=null] : iv_ruleBlankLine= ruleBlankLine EOF ;
    public final EObject entryRuleBlankLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlankLine = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:172:2: (iv_ruleBlankLine= ruleBlankLine EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:173:2: iv_ruleBlankLine= ruleBlankLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlankLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlankLine_in_entryRuleBlankLine312);
            iv_ruleBlankLine=ruleBlankLine();
            _fsp--;

             current =iv_ruleBlankLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankLine322); 

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
    // $ANTLR end entryRuleBlankLine


    // $ANTLR start ruleBlankLine
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:180:1: ruleBlankLine returns [EObject current=null] : ( () ( RULE_WS )? RULE_LINE_TERMINATOR ) ;
    public final EObject ruleBlankLine() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:185:6: ( ( () ( RULE_WS )? RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:186:1: ( () ( RULE_WS )? RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:186:1: ( () ( RULE_WS )? RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:186:2: () ( RULE_WS )? RULE_LINE_TERMINATOR
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:186:2: ()
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:187:5: 
            {
             
                    temp=factory.create(grammarAccess.getBlankLineAccess().getBlankLineAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBlankLineAccess().getBlankLineAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:197:2: ( RULE_WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:197:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleBlankLine366); 
                     
                        createLeafNode(grammarAccess.getBlankLineAccess().getWSTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleBlankLine376); 
             
                createLeafNode(grammarAccess.getBlankLineAccess().getLINE_TERMINATORTerminalRuleCall_2(), null); 
                

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
    // $ANTLR end ruleBlankLine


    // $ANTLR start entryRulePropertyComment
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:213:1: entryRulePropertyComment returns [EObject current=null] : iv_rulePropertyComment= rulePropertyComment EOF ;
    public final EObject entryRulePropertyComment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyComment = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:214:2: (iv_rulePropertyComment= rulePropertyComment EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:215:2: iv_rulePropertyComment= rulePropertyComment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyCommentRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyComment_in_entryRulePropertyComment411);
            iv_rulePropertyComment=rulePropertyComment();
            _fsp--;

             current =iv_rulePropertyComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyComment421); 

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
    // $ANTLR end entryRulePropertyComment


    // $ANTLR start rulePropertyComment
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:222:1: rulePropertyComment returns [EObject current=null] : ( ( RULE_WS )? ( (lv_value_1_0= RULE_SL_COMMENT ) ) RULE_LINE_TERMINATOR ) ;
    public final EObject rulePropertyComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:227:6: ( ( ( RULE_WS )? ( (lv_value_1_0= RULE_SL_COMMENT ) ) RULE_LINE_TERMINATOR ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:228:1: ( ( RULE_WS )? ( (lv_value_1_0= RULE_SL_COMMENT ) ) RULE_LINE_TERMINATOR )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:228:1: ( ( RULE_WS )? ( (lv_value_1_0= RULE_SL_COMMENT ) ) RULE_LINE_TERMINATOR )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:228:2: ( RULE_WS )? ( (lv_value_1_0= RULE_SL_COMMENT ) ) RULE_LINE_TERMINATOR
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:228:2: ( RULE_WS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:228:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyComment456); 
                     
                        createLeafNode(grammarAccess.getPropertyCommentAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:232:3: ( (lv_value_1_0= RULE_SL_COMMENT ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:233:1: (lv_value_1_0= RULE_SL_COMMENT )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:233:1: (lv_value_1_0= RULE_SL_COMMENT )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:234:3: lv_value_1_0= RULE_SL_COMMENT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rulePropertyComment474); 

            			createLeafNode(grammarAccess.getPropertyCommentAccess().getValueSL_COMMENTTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyCommentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"SL_COMMENT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_rulePropertyComment488); 
             
                createLeafNode(grammarAccess.getPropertyCommentAccess().getLINE_TERMINATORTerminalRuleCall_2(), null); 
                

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
    // $ANTLR end rulePropertyComment


    // $ANTLR start entryRulePropertyEntry
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:268:1: entryRulePropertyEntry returns [EObject current=null] : iv_rulePropertyEntry= rulePropertyEntry EOF ;
    public final EObject entryRulePropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyEntry = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:269:2: (iv_rulePropertyEntry= rulePropertyEntry EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:270:2: iv_rulePropertyEntry= rulePropertyEntry EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyEntryRule(), currentNode); 
            pushFollow(FOLLOW_rulePropertyEntry_in_entryRulePropertyEntry523);
            iv_rulePropertyEntry=rulePropertyEntry();
            _fsp--;

             current =iv_rulePropertyEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyEntry533); 

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
    // $ANTLR end entryRulePropertyEntry


    // $ANTLR start rulePropertyEntry
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:277:1: rulePropertyEntry returns [EObject current=null] : ( ( RULE_WS )? ( (lv_name_1_0= ruleKey ) ) ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) ) ) ;
    public final EObject rulePropertyEntry() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_delimiter_2_0 = null;

        EObject lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_delimiter_4_0 = null;

        EObject lv_value_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:282:6: ( ( ( RULE_WS )? ( (lv_name_1_0= ruleKey ) ) ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:283:1: ( ( RULE_WS )? ( (lv_name_1_0= ruleKey ) ) ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:283:1: ( ( RULE_WS )? ( (lv_name_1_0= ruleKey ) ) ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:283:2: ( RULE_WS )? ( (lv_name_1_0= ruleKey ) ) ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:283:2: ( RULE_WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:283:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyEntry568); 
                     
                        createLeafNode(grammarAccess.getPropertyEntryAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:287:3: ( (lv_name_1_0= ruleKey ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:288:1: (lv_name_1_0= ruleKey )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:288:1: (lv_name_1_0= ruleKey )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:289:3: lv_name_1_0= ruleKey
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyEntryAccess().getNameKeyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleKey_in_rulePropertyEntry590);
            lv_name_1_0=ruleKey();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyEntryRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"Key", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:311:2: ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=9 && LA6_1<=10)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_LINE_TERMINATOR||LA6_1==RULE_ID||(LA6_1>=12 && LA6_1<=14)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("311:2: ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) )", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=9 && LA6_0<=10)) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("311:2: ( ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) ) | ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:311:3: ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:311:3: ( ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:311:4: ( (lv_delimiter_2_0= ruleDelimiter ) ) ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:311:4: ( (lv_delimiter_2_0= ruleDelimiter ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:312:1: (lv_delimiter_2_0= ruleDelimiter )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:312:1: (lv_delimiter_2_0= ruleDelimiter )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:313:3: lv_delimiter_2_0= ruleDelimiter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyEntryAccess().getDelimiterDelimiterParserRuleCall_2_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDelimiter_in_rulePropertyEntry613);
                    lv_delimiter_2_0=ruleDelimiter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyEntryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"delimiter",
                    	        		lv_delimiter_2_0, 
                    	        		"Delimiter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:335:2: ( (lv_value_3_0= ruleCompoundStringLeadingDelimiter ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:336:1: (lv_value_3_0= ruleCompoundStringLeadingDelimiter )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:336:1: (lv_value_3_0= ruleCompoundStringLeadingDelimiter )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:337:3: lv_value_3_0= ruleCompoundStringLeadingDelimiter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyEntryAccess().getValueCompoundStringLeadingDelimiterParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundStringLeadingDelimiter_in_rulePropertyEntry634);
                    lv_value_3_0=ruleCompoundStringLeadingDelimiter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyEntryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"CompoundStringLeadingDelimiter", 
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
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:360:6: ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:360:6: ( ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:360:7: ( (lv_delimiter_4_0= ruleSimpleDelimiter ) ) ( (lv_value_5_0= ruleCompoundString ) )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:360:7: ( (lv_delimiter_4_0= ruleSimpleDelimiter ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:361:1: (lv_delimiter_4_0= ruleSimpleDelimiter )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:361:1: (lv_delimiter_4_0= ruleSimpleDelimiter )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:362:3: lv_delimiter_4_0= ruleSimpleDelimiter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyEntryAccess().getDelimiterSimpleDelimiterParserRuleCall_2_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleDelimiter_in_rulePropertyEntry663);
                    lv_delimiter_4_0=ruleSimpleDelimiter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyEntryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"delimiter",
                    	        		lv_delimiter_4_0, 
                    	        		"SimpleDelimiter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:384:2: ( (lv_value_5_0= ruleCompoundString ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:385:1: (lv_value_5_0= ruleCompoundString )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:385:1: (lv_value_5_0= ruleCompoundString )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:386:3: lv_value_5_0= ruleCompoundString
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyEntryAccess().getValueCompoundStringParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundString_in_rulePropertyEntry684);
                    lv_value_5_0=ruleCompoundString();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyEntryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_5_0, 
                    	        		"CompoundString", 
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
    // $ANTLR end rulePropertyEntry


    // $ANTLR start entryRuleDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:416:1: entryRuleDelimiter returns [String current=null] : iv_ruleDelimiter= ruleDelimiter EOF ;
    public final String entryRuleDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDelimiter = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:417:2: (iv_ruleDelimiter= ruleDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:418:2: iv_ruleDelimiter= ruleDelimiter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelimiterRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelimiter_in_entryRuleDelimiter723);
            iv_ruleDelimiter=ruleDelimiter();
            _fsp--;

             current =iv_ruleDelimiter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelimiter734); 

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
    // $ANTLR end entryRuleDelimiter


    // $ANTLR start ruleDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:425:1: ruleDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WS_0= RULE_WS )? (kw= '=' | kw= ':' ) (this_WS_3= RULE_WS )? ) ;
    public final AntlrDatatypeRuleToken ruleDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token kw=null;
        Token this_WS_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:430:6: ( ( (this_WS_0= RULE_WS )? (kw= '=' | kw= ':' ) (this_WS_3= RULE_WS )? ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:431:1: ( (this_WS_0= RULE_WS )? (kw= '=' | kw= ':' ) (this_WS_3= RULE_WS )? )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:431:1: ( (this_WS_0= RULE_WS )? (kw= '=' | kw= ':' ) (this_WS_3= RULE_WS )? )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:431:2: (this_WS_0= RULE_WS )? (kw= '=' | kw= ':' ) (this_WS_3= RULE_WS )?
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:431:2: (this_WS_0= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:431:7: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleDelimiter775); 

                    		current.merge(this_WS_0);
                        
                     
                        createLeafNode(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_0(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:438:3: (kw= '=' | kw= ':' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==9) ) {
                alt8=1;
            }
            else if ( (LA8_0==10) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("438:3: (kw= '=' | kw= ':' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:439:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,9,FOLLOW_9_in_ruleDelimiter796); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDelimiterAccess().getEqualsSignKeyword_1_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:446:2: kw= ':'
                    {
                    kw=(Token)input.LT(1);
                    match(input,10,FOLLOW_10_in_ruleDelimiter815); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDelimiterAccess().getColonKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:451:2: (this_WS_3= RULE_WS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:451:7: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleDelimiter832); 

                    		current.merge(this_WS_3);
                        
                     
                        createLeafNode(grammarAccess.getDelimiterAccess().getWSTerminalRuleCall_2(), null); 
                        

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
    // $ANTLR end ruleDelimiter


    // $ANTLR start entryRuleSimpleDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:466:1: entryRuleSimpleDelimiter returns [String current=null] : iv_ruleSimpleDelimiter= ruleSimpleDelimiter EOF ;
    public final String entryRuleSimpleDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleDelimiter = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:467:2: (iv_ruleSimpleDelimiter= ruleSimpleDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:468:2: iv_ruleSimpleDelimiter= ruleSimpleDelimiter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleDelimiterRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleDelimiter_in_entryRuleSimpleDelimiter880);
            iv_ruleSimpleDelimiter=ruleSimpleDelimiter();
            _fsp--;

             current =iv_ruleSimpleDelimiter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDelimiter891); 

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
    // $ANTLR end entryRuleSimpleDelimiter


    // $ANTLR start ruleSimpleDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:475:1: ruleSimpleDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WS_0= RULE_WS ;
    public final AntlrDatatypeRuleToken ruleSimpleDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:480:6: (this_WS_0= RULE_WS )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:481:5: this_WS_0= RULE_WS
            {
            this_WS_0=(Token)input.LT(1);
            match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSimpleDelimiter930); 

            		current.merge(this_WS_0);
                
             
                createLeafNode(grammarAccess.getSimpleDelimiterAccess().getWSTerminalRuleCall(), null); 
                

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
    // $ANTLR end ruleSimpleDelimiter


    // $ANTLR start entryRuleCompoundString
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:496:1: entryRuleCompoundString returns [EObject current=null] : iv_ruleCompoundString= ruleCompoundString EOF ;
    public final EObject entryRuleCompoundString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundString = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:497:2: (iv_ruleCompoundString= ruleCompoundString EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:498:2: iv_ruleCompoundString= ruleCompoundString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundString_in_entryRuleCompoundString974);
            iv_ruleCompoundString=ruleCompoundString();
            _fsp--;

             current =iv_ruleCompoundString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundString984); 

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
    // $ANTLR end entryRuleCompoundString


    // $ANTLR start ruleCompoundString
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:505:1: ruleCompoundString returns [EObject current=null] : ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) ) ;
    public final EObject ruleCompoundString() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_2_0 = null;

        EObject lv_parts_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:510:6: ( ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LINE_TERMINATOR) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||(LA12_0>=12 && LA12_0<=14)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("511:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:2: ( () RULE_LINE_TERMINATOR )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:2: ( () RULE_LINE_TERMINATOR )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:3: () RULE_LINE_TERMINATOR
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:511:3: ()
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:512:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCompoundStringAccess().getCompoundStringAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCompoundStringAccess().getCompoundStringAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1028); 
                     
                        createLeafNode(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:527:6: ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:527:6: ( ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:527:7: ( (lv_parts_2_0= ruleCompoundStringPart ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:527:7: ( (lv_parts_2_0= ruleCompoundStringPart ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:528:1: (lv_parts_2_0= ruleCompoundStringPart )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:528:1: (lv_parts_2_0= ruleCompoundStringPart )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:529:3: lv_parts_2_0= ruleCompoundStringPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundStringPart_in_ruleCompoundString1056);
                    lv_parts_2_0=ruleCompoundStringPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"parts",
                    	        		lv_parts_2_0, 
                    	        		"CompoundStringPart", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:551:2: ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==11) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:551:4: '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) )
                    	    {
                    	    match(input,11,FOLLOW_11_in_ruleCompoundString1067); 

                    	            createLeafNode(grammarAccess.getCompoundStringAccess().getReverseSolidusKeyword_1_1_0(), null); 
                    	        
                    	    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1076); 
                    	     
                    	        createLeafNode(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1(), null); 
                    	        
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:559:1: ( RULE_WS )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==RULE_WS) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:559:2: RULE_WS
                    	            {
                    	            match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCompoundString1085); 
                    	             
                    	                createLeafNode(grammarAccess.getCompoundStringAccess().getWSTerminalRuleCall_1_1_2(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:563:3: ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) )
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:564:1: (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter )
                    	    {
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:564:1: (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter )
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:565:3: lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundString1107);
                    	    lv_parts_6_0=ruleCompoundStringPartLeadingDelimiter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompoundStringRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_6_0, 
                    	    	        		"CompoundStringPartLeadingDelimiter", 
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
                    	    break loop11;
                        }
                    } while (true);

                    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1118); 
                     
                        createLeafNode(grammarAccess.getCompoundStringAccess().getLINE_TERMINATORTerminalRuleCall_1_2(), null); 
                        

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
    // $ANTLR end ruleCompoundString


    // $ANTLR start entryRuleCompoundStringLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:599:1: entryRuleCompoundStringLeadingDelimiter returns [EObject current=null] : iv_ruleCompoundStringLeadingDelimiter= ruleCompoundStringLeadingDelimiter EOF ;
    public final EObject entryRuleCompoundStringLeadingDelimiter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStringLeadingDelimiter = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:600:2: (iv_ruleCompoundStringLeadingDelimiter= ruleCompoundStringLeadingDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:601:2: iv_ruleCompoundStringLeadingDelimiter= ruleCompoundStringLeadingDelimiter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringLeadingDelimiterRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundStringLeadingDelimiter_in_entryRuleCompoundStringLeadingDelimiter1154);
            iv_ruleCompoundStringLeadingDelimiter=ruleCompoundStringLeadingDelimiter();
            _fsp--;

             current =iv_ruleCompoundStringLeadingDelimiter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringLeadingDelimiter1164); 

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
    // $ANTLR end entryRuleCompoundStringLeadingDelimiter


    // $ANTLR start ruleCompoundStringLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:608:1: ruleCompoundStringLeadingDelimiter returns [EObject current=null] : ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) ) ;
    public final EObject ruleCompoundStringLeadingDelimiter() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_2_0 = null;

        EObject lv_parts_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:613:6: ( ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LINE_TERMINATOR) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_SL_COMMENT && LA15_0<=RULE_ID)||(LA15_0>=12 && LA15_0<=14)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("614:1: ( ( () RULE_LINE_TERMINATOR ) | ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:2: ( () RULE_LINE_TERMINATOR )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:2: ( () RULE_LINE_TERMINATOR )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:3: () RULE_LINE_TERMINATOR
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:614:3: ()
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:615:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCompoundStringLeadingDelimiterAccess().getEmptyPropertyValueAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getEmptyPropertyValueAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1208); 
                     
                        createLeafNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:630:6: ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:630:6: ( ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:630:7: ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) ) ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )* RULE_LINE_TERMINATOR
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:630:7: ( (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter ) )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:631:1: (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter )
                    {
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:631:1: (lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter )
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:632:3: lv_parts_2_0= ruleCompoundStringPartLeadingDelimiter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundStringLeadingDelimiter1236);
                    lv_parts_2_0=ruleCompoundStringPartLeadingDelimiter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundStringLeadingDelimiterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"parts",
                    	        		lv_parts_2_0, 
                    	        		"CompoundStringPartLeadingDelimiter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:654:2: ( '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==11) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:654:4: '\\\\' RULE_LINE_TERMINATOR ( RULE_WS )? ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) )
                    	    {
                    	    match(input,11,FOLLOW_11_in_ruleCompoundStringLeadingDelimiter1247); 

                    	            createLeafNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getReverseSolidusKeyword_1_1_0(), null); 
                    	        
                    	    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1256); 
                    	     
                    	        createLeafNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_1_1(), null); 
                    	        
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:662:1: ( RULE_WS )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==RULE_WS) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:662:2: RULE_WS
                    	            {
                    	            match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCompoundStringLeadingDelimiter1265); 
                    	             
                    	                createLeafNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getWSTerminalRuleCall_1_1_2(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:666:3: ( (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter ) )
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:667:1: (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter )
                    	    {
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:667:1: (lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter )
                    	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:668:3: lv_parts_6_0= ruleCompoundStringPartLeadingDelimiter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getPartsCompoundStringPartLeadingDelimiterParserRuleCall_1_1_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundStringLeadingDelimiter1287);
                    	    lv_parts_6_0=ruleCompoundStringPartLeadingDelimiter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompoundStringLeadingDelimiterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"parts",
                    	    	        		lv_parts_6_0, 
                    	    	        		"CompoundStringPartLeadingDelimiter", 
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
                    	    break loop14;
                        }
                    } while (true);

                    match(input,RULE_LINE_TERMINATOR,FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1298); 
                     
                        createLeafNode(grammarAccess.getCompoundStringLeadingDelimiterAccess().getLINE_TERMINATORTerminalRuleCall_1_2(), null); 
                        

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
    // $ANTLR end ruleCompoundStringLeadingDelimiter


    // $ANTLR start entryRuleCompoundStringPartLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:702:1: entryRuleCompoundStringPartLeadingDelimiter returns [EObject current=null] : iv_ruleCompoundStringPartLeadingDelimiter= ruleCompoundStringPartLeadingDelimiter EOF ;
    public final EObject entryRuleCompoundStringPartLeadingDelimiter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStringPartLeadingDelimiter = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:703:2: (iv_ruleCompoundStringPartLeadingDelimiter= ruleCompoundStringPartLeadingDelimiter EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:704:2: iv_ruleCompoundStringPartLeadingDelimiter= ruleCompoundStringPartLeadingDelimiter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringPartLeadingDelimiterRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_entryRuleCompoundStringPartLeadingDelimiter1334);
            iv_ruleCompoundStringPartLeadingDelimiter=ruleCompoundStringPartLeadingDelimiter();
            _fsp--;

             current =iv_ruleCompoundStringPartLeadingDelimiter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiter1344); 

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
    // $ANTLR end entryRuleCompoundStringPartLeadingDelimiter


    // $ANTLR start ruleCompoundStringPartLeadingDelimiter
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:711:1: ruleCompoundStringPartLeadingDelimiter returns [EObject current=null] : ( (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue ) ) ;
    public final EObject ruleCompoundStringPartLeadingDelimiter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:716:6: ( ( (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:717:1: ( (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:717:1: ( (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:718:1: (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:718:1: (lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:719:3: lv_value_0_0= ruleCompoundStringPartLeadingDelimiterValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompoundStringPartLeadingDelimiterAccess().getValueCompoundStringPartLeadingDelimiterValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_ruleCompoundStringPartLeadingDelimiter1389);
            lv_value_0_0=ruleCompoundStringPartLeadingDelimiterValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompoundStringPartLeadingDelimiterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"CompoundStringPartLeadingDelimiterValue", 
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
    // $ANTLR end ruleCompoundStringPartLeadingDelimiter


    // $ANTLR start entryRuleCompoundStringPartLeadingDelimiterValue
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:749:1: entryRuleCompoundStringPartLeadingDelimiterValue returns [String current=null] : iv_ruleCompoundStringPartLeadingDelimiterValue= ruleCompoundStringPartLeadingDelimiterValue EOF ;
    public final String entryRuleCompoundStringPartLeadingDelimiterValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStringPartLeadingDelimiterValue = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:750:2: (iv_ruleCompoundStringPartLeadingDelimiterValue= ruleCompoundStringPartLeadingDelimiterValue EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:751:2: iv_ruleCompoundStringPartLeadingDelimiterValue= ruleCompoundStringPartLeadingDelimiterValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringPartLeadingDelimiterValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_entryRuleCompoundStringPartLeadingDelimiterValue1425);
            iv_ruleCompoundStringPartLeadingDelimiterValue=ruleCompoundStringPartLeadingDelimiterValue();
            _fsp--;

             current =iv_ruleCompoundStringPartLeadingDelimiterValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiterValue1436); 

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
    // $ANTLR end entryRuleCompoundStringPartLeadingDelimiterValue


    // $ANTLR start ruleCompoundStringPartLeadingDelimiterValue
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:758:1: ruleCompoundStringPartLeadingDelimiterValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonWSConstant_0= ruleNonWSConstant (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* ) ;
    public final AntlrDatatypeRuleToken ruleCompoundStringPartLeadingDelimiterValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_1=null;
        AntlrDatatypeRuleToken this_NonWSConstant_0 = null;

        AntlrDatatypeRuleToken this_NonWSConstant_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:763:6: ( (this_NonWSConstant_0= ruleNonWSConstant (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:764:1: (this_NonWSConstant_0= ruleNonWSConstant (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:764:1: (this_NonWSConstant_0= ruleNonWSConstant (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:765:5: this_NonWSConstant_0= ruleNonWSConstant (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartLeadingDelimiterValue1483);
            this_NonWSConstant_0=ruleNonWSConstant();
            _fsp--;


            		current.merge(this_NonWSConstant_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:775:1: (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:775:6: this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )?
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCompoundStringPartLeadingDelimiterValue1504); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getWSTerminalRuleCall_1_0(), null); 
            	        
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:782:1: (this_NonWSConstant_2= ruleNonWSConstant )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=RULE_SL_COMMENT && LA16_0<=RULE_ID)||(LA16_0>=12 && LA16_0<=14)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:783:5: this_NonWSConstant_2= ruleNonWSConstant
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getCompoundStringPartLeadingDelimiterValueAccess().getNonWSConstantParserRuleCall_1_1(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartLeadingDelimiterValue1532);
            	            this_NonWSConstant_2=ruleNonWSConstant();
            	            _fsp--;


            	            		current.merge(this_NonWSConstant_2);
            	                
            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end ruleCompoundStringPartLeadingDelimiterValue


    // $ANTLR start entryRuleCompoundStringPart
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:801:1: entryRuleCompoundStringPart returns [EObject current=null] : iv_ruleCompoundStringPart= ruleCompoundStringPart EOF ;
    public final EObject entryRuleCompoundStringPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStringPart = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:802:2: (iv_ruleCompoundStringPart= ruleCompoundStringPart EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:803:2: iv_ruleCompoundStringPart= ruleCompoundStringPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundStringPart_in_entryRuleCompoundStringPart1581);
            iv_ruleCompoundStringPart=ruleCompoundStringPart();
            _fsp--;

             current =iv_ruleCompoundStringPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPart1591); 

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
    // $ANTLR end entryRuleCompoundStringPart


    // $ANTLR start ruleCompoundStringPart
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:810:1: ruleCompoundStringPart returns [EObject current=null] : ( (lv_value_0_0= ruleCompoundStringPartValue ) ) ;
    public final EObject ruleCompoundStringPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:815:6: ( ( (lv_value_0_0= ruleCompoundStringPartValue ) ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:816:1: ( (lv_value_0_0= ruleCompoundStringPartValue ) )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:816:1: ( (lv_value_0_0= ruleCompoundStringPartValue ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:817:1: (lv_value_0_0= ruleCompoundStringPartValue )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:817:1: (lv_value_0_0= ruleCompoundStringPartValue )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:818:3: lv_value_0_0= ruleCompoundStringPartValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompoundStringPartAccess().getValueCompoundStringPartValueParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompoundStringPartValue_in_ruleCompoundStringPart1636);
            lv_value_0_0=ruleCompoundStringPartValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompoundStringPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"CompoundStringPartValue", 
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
    // $ANTLR end ruleCompoundStringPart


    // $ANTLR start entryRuleCompoundStringPartValue
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:848:1: entryRuleCompoundStringPartValue returns [String current=null] : iv_ruleCompoundStringPartValue= ruleCompoundStringPartValue EOF ;
    public final String entryRuleCompoundStringPartValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStringPartValue = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:849:2: (iv_ruleCompoundStringPartValue= ruleCompoundStringPartValue EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:850:2: iv_ruleCompoundStringPartValue= ruleCompoundStringPartValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundStringPartValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundStringPartValue_in_entryRuleCompoundStringPartValue1672);
            iv_ruleCompoundStringPartValue=ruleCompoundStringPartValue();
            _fsp--;

             current =iv_ruleCompoundStringPartValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStringPartValue1683); 

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
    // $ANTLR end entryRuleCompoundStringPartValue


    // $ANTLR start ruleCompoundStringPartValue
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:857:1: ruleCompoundStringPartValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Key_0= ruleKey (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* ) ;
    public final AntlrDatatypeRuleToken ruleCompoundStringPartValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_1=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_NonWSConstant_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:862:6: ( (this_Key_0= ruleKey (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:863:1: (this_Key_0= ruleKey (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:863:1: (this_Key_0= ruleKey (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )* )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:864:5: this_Key_0= ruleKey (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getCompoundStringPartValueAccess().getKeyParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleKey_in_ruleCompoundStringPartValue1730);
            this_Key_0=ruleKey();
            _fsp--;


            		current.merge(this_Key_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:874:1: (this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:874:6: this_WS_1= RULE_WS (this_NonWSConstant_2= ruleNonWSConstant )?
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCompoundStringPartValue1751); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCompoundStringPartValueAccess().getWSTerminalRuleCall_1_0(), null); 
            	        
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:881:1: (this_NonWSConstant_2= ruleNonWSConstant )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=RULE_SL_COMMENT && LA18_0<=RULE_ID)||(LA18_0>=12 && LA18_0<=14)) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:882:5: this_NonWSConstant_2= ruleNonWSConstant
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getCompoundStringPartValueAccess().getNonWSConstantParserRuleCall_1_1(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartValue1779);
            	            this_NonWSConstant_2=ruleNonWSConstant();
            	            _fsp--;


            	            		current.merge(this_NonWSConstant_2);
            	                
            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end ruleCompoundStringPartValue


    // $ANTLR start entryRuleNonWSConstant
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:900:1: entryRuleNonWSConstant returns [String current=null] : iv_ruleNonWSConstant= ruleNonWSConstant EOF ;
    public final String entryRuleNonWSConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonWSConstant = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:901:2: (iv_ruleNonWSConstant= ruleNonWSConstant EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:902:2: iv_ruleNonWSConstant= ruleNonWSConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonWSConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleNonWSConstant_in_entryRuleNonWSConstant1829);
            iv_ruleNonWSConstant=ruleNonWSConstant();
            _fsp--;

             current =iv_ruleNonWSConstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonWSConstant1840); 

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
    // $ANTLR end entryRuleNonWSConstant


    // $ANTLR start ruleNonWSConstant
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:909:1: ruleNonWSConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleNonWSConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SL_COMMENT_1=null;
        AntlrDatatypeRuleToken this_NonWsNonCommentConstant_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:914:6: ( (this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:915:1: (this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:915:1: (this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=12 && LA20_0<=14)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SL_COMMENT) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("915:1: (this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant | this_SL_COMMENT_1= RULE_SL_COMMENT )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:916:5: this_NonWsNonCommentConstant_0= ruleNonWsNonCommentConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonWSConstantAccess().getNonWsNonCommentConstantParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNonWsNonCommentConstant_in_ruleNonWSConstant1887);
                    this_NonWsNonCommentConstant_0=ruleNonWsNonCommentConstant();
                    _fsp--;


                    		current.merge(this_NonWsNonCommentConstant_0);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:927:10: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)input.LT(1);
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleNonWSConstant1913); 

                    		current.merge(this_SL_COMMENT_1);
                        
                     
                        createLeafNode(grammarAccess.getNonWSConstantAccess().getSL_COMMENTTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end ruleNonWSConstant


    // $ANTLR start entryRuleNonWsNonCommentConstant
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:942:1: entryRuleNonWsNonCommentConstant returns [String current=null] : iv_ruleNonWsNonCommentConstant= ruleNonWsNonCommentConstant EOF ;
    public final String entryRuleNonWsNonCommentConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonWsNonCommentConstant = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:943:2: (iv_ruleNonWsNonCommentConstant= ruleNonWsNonCommentConstant EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:944:2: iv_ruleNonWsNonCommentConstant= ruleNonWsNonCommentConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonWsNonCommentConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleNonWsNonCommentConstant_in_entryRuleNonWsNonCommentConstant1959);
            iv_ruleNonWsNonCommentConstant=ruleNonWsNonCommentConstant();
            _fsp--;

             current =iv_ruleNonWsNonCommentConstant.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonWsNonCommentConstant1970); 

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
    // $ANTLR end entryRuleNonWsNonCommentConstant


    // $ANTLR start ruleNonWsNonCommentConstant
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:951:1: ruleNonWsNonCommentConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Key_0= ruleKey ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )* ) ;
    public final AntlrDatatypeRuleToken ruleNonWsNonCommentConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Key_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:956:6: ( (this_Key_0= ruleKey ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )* ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:957:1: (this_Key_0= ruleKey ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )* )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:957:1: (this_Key_0= ruleKey ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )* )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:958:5: this_Key_0= ruleKey ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleKey_in_ruleNonWsNonCommentConstant2017);
            this_Key_0=ruleKey();
            _fsp--;


            		current.merge(this_Key_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:968:1: ( (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=9 && LA23_0<=10)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:968:2: (kw= ':' | kw= '=' ) (this_Key_3= ruleKey )?
            	    {
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:968:2: (kw= ':' | kw= '=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==10) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==9) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("968:2: (kw= ':' | kw= '=' )", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:969:2: kw= ':'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,10,FOLLOW_10_in_ruleNonWsNonCommentConstant2037); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getNonWsNonCommentConstantAccess().getColonKeyword_1_0_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:976:2: kw= '='
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,9,FOLLOW_9_in_ruleNonWsNonCommentConstant2056); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getNonWsNonCommentConstantAccess().getEqualsSignKeyword_1_0_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:981:2: (this_Key_3= ruleKey )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID||(LA22_0>=12 && LA22_0<=14)) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:982:5: this_Key_3= ruleKey
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getNonWsNonCommentConstantAccess().getKeyParserRuleCall_1_1(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleKey_in_ruleNonWsNonCommentConstant2080);
            	            this_Key_3=ruleKey();
            	            _fsp--;


            	            		current.merge(this_Key_3);
            	                
            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end ruleNonWsNonCommentConstant


    // $ANTLR start entryRuleKey
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1000:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1001:2: (iv_ruleKey= ruleKey EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1002:2: iv_ruleKey= ruleKey EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKeyRule(), currentNode); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey2130);
            iv_ruleKey=ruleKey();
            _fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey2141); 

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
    // $ANTLR end entryRuleKey


    // $ANTLR start ruleKey
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1009:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN | kw= '\\\\:' | kw= '\\\\=' | kw= '/' )+ ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1014:6: ( (this_FQN_0= ruleFQN | kw= '\\\\:' | kw= '\\\\=' | kw= '/' )+ )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1015:1: (this_FQN_0= ruleFQN | kw= '\\\\:' | kw= '\\\\=' | kw= '/' )+
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1015:1: (this_FQN_0= ruleFQN | kw= '\\\\:' | kw= '\\\\=' | kw= '/' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt24=1;
                    }
                    break;
                case 12:
                    {
                    alt24=2;
                    }
                    break;
                case 13:
                    {
                    alt24=3;
                    }
                    break;
                case 14:
                    {
                    alt24=4;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1016:5: this_FQN_0= ruleFQN
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getKeyAccess().getFQNParserRuleCall_0(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleFQN_in_ruleKey2188);
            	    this_FQN_0=ruleFQN();
            	    _fsp--;


            	    		current.merge(this_FQN_0);
            	        
            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1028:2: kw= '\\\\:'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleKey2212); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getKeyAccess().getReverseSolidusColonKeyword_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1035:2: kw= '\\\\='
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleKey2231); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getKeyAccess().getReverseSolidusEqualsSignKeyword_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1042:2: kw= '/'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,14,FOLLOW_14_in_ruleKey2250); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getKeyAccess().getSolidusKeyword_3(), null); 
            	        

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
    // $ANTLR end ruleKey


    // $ANTLR start entryRuleFQN
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1055:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1056:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1057:2: iv_ruleFQN= ruleFQN EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFQNRule(), currentNode); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2292);
            iv_ruleFQN=ruleFQN();
            _fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2303); 

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
    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1064:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1069:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1070:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1070:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1070:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2343); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1077:1: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.emf.mwe.properties/src-gen/org/eclipse/emf/mwe/properties/parser/antlr/internal/InternalMWEProperties.g:1078:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,15,FOLLOW_15_in_ruleFQN2362); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getFQNAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2377); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
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


 

    public static final BitSet FOLLOW_rulePropertyFile_in_entryRulePropertyFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLine_in_rulePropertyFile130 = new BitSet(new long[]{0x00000000000070F2L});
    public static final BitSet FOLLOW_ruleNaturalLine_in_entryRuleNaturalLine166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLine176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_ruleNaturalLine223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyComment_in_ruleNaturalLine250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyEntry_in_ruleNaturalLine277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankLine_in_entryRuleBlankLine312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankLine322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleBlankLine366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleBlankLine376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyComment_in_entryRulePropertyComment411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyComment421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyComment456 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rulePropertyComment474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_rulePropertyComment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyEntry_in_entryRulePropertyEntry523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyEntry533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyEntry568 = new BitSet(new long[]{0x0000000000007080L});
    public static final BitSet FOLLOW_ruleKey_in_rulePropertyEntry590 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleDelimiter_in_rulePropertyEntry613 = new BitSet(new long[]{0x00000000000070E0L});
    public static final BitSet FOLLOW_ruleCompoundStringLeadingDelimiter_in_rulePropertyEntry634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDelimiter_in_rulePropertyEntry663 = new BitSet(new long[]{0x00000000000070A0L});
    public static final BitSet FOLLOW_ruleCompoundString_in_rulePropertyEntry684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelimiter_in_entryRuleDelimiter723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelimiter734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleDelimiter775 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleDelimiter796 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10_in_ruleDelimiter815 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleDelimiter832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDelimiter_in_entryRuleSimpleDelimiter880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDelimiter891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSimpleDelimiter930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundString_in_entryRuleCompoundString974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundString984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPart_in_ruleCompoundString1056 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleCompoundString1067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1076 = new BitSet(new long[]{0x00000000000070D0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCompoundString1085 = new BitSet(new long[]{0x00000000000070C0L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundString1107 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundString1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringLeadingDelimiter_in_entryRuleCompoundStringLeadingDelimiter1154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringLeadingDelimiter1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundStringLeadingDelimiter1236 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleCompoundStringLeadingDelimiter1247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1256 = new BitSet(new long[]{0x00000000000070D0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCompoundStringLeadingDelimiter1265 = new BitSet(new long[]{0x00000000000070C0L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_ruleCompoundStringLeadingDelimiter1287 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_LINE_TERMINATOR_in_ruleCompoundStringLeadingDelimiter1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiter_in_entryRuleCompoundStringPartLeadingDelimiter1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiter1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_ruleCompoundStringPartLeadingDelimiter1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartLeadingDelimiterValue_in_entryRuleCompoundStringPartLeadingDelimiterValue1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartLeadingDelimiterValue1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartLeadingDelimiterValue1483 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCompoundStringPartLeadingDelimiterValue1504 = new BitSet(new long[]{0x00000000000070D2L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartLeadingDelimiterValue1532 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCompoundStringPart_in_entryRuleCompoundStringPart1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPart1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartValue_in_ruleCompoundStringPart1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStringPartValue_in_entryRuleCompoundStringPartValue1672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStringPartValue1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_ruleCompoundStringPartValue1730 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCompoundStringPartValue1751 = new BitSet(new long[]{0x00000000000070D2L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_ruleCompoundStringPartValue1779 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNonWSConstant_in_entryRuleNonWSConstant1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonWSConstant1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWsNonCommentConstant_in_ruleNonWSConstant1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleNonWSConstant1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonWsNonCommentConstant_in_entryRuleNonWsNonCommentConstant1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonWsNonCommentConstant1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_ruleNonWsNonCommentConstant2017 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10_in_ruleNonWsNonCommentConstant2037 = new BitSet(new long[]{0x0000000000007682L});
    public static final BitSet FOLLOW_9_in_ruleNonWsNonCommentConstant2056 = new BitSet(new long[]{0x0000000000007682L});
    public static final BitSet FOLLOW_ruleKey_in_ruleNonWsNonCommentConstant2080 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey2130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleKey2188 = new BitSet(new long[]{0x0000000000007082L});
    public static final BitSet FOLLOW_12_in_ruleKey2212 = new BitSet(new long[]{0x0000000000007082L});
    public static final BitSet FOLLOW_13_in_ruleKey2231 = new BitSet(new long[]{0x0000000000007082L});
    public static final BitSet FOLLOW_14_in_ruleKey2250 = new BitSet(new long[]{0x0000000000007082L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2343 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFQN2362 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2377 = new BitSet(new long[]{0x0000000000008002L});

}