
/*
Generated with Xtext
*/
grammar InternalMWE;

options {
	superClass=AbstractAntlrParser;
}

@lexer::header {
package org.eclipse.emf.mwe.di.parser.internal;
}

@lexer::members {

  public Token nextToken() {
        while (true) {
            this.token = null;
            this.channel = Token.DEFAULT_CHANNEL;
            this.tokenStartCharIndex = input.index();
            this.tokenStartCharPositionInLine = input.getCharPositionInLine();
            this.tokenStartLine = input.getLine();
            this.text = null;
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            try {
                mTokens();
                if ( this.token==null ) {
                    emit();
                }
                else if ( this.token==Token.SKIP_TOKEN ) {
                    continue;
                }
                return this.token;
            }
            catch (RecognitionException re) {
                reportError(re);
                if ( re instanceof NoViableAltException ) { recover(re); }
                                // create token that holds mismatched char
                Token t = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
                                          Token.HIDDEN_CHANNEL,
                                          this.tokenStartCharIndex,
                                          getCharIndex()-1);
                t.setLine(this.tokenStartLine);
                t.setCharPositionInLine(this.tokenStartCharPositionInLine);
                emit(t);
                return this.token;
            }
        }
    }
}

@parser::header {
package org.eclipse.emf.mwe.di.parser.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
}

@parser::members {
 
    public InternalMWEParser(TokenStream input, IElementFactory factory, Grammar g) {
        this(input);
        this.factory = factory;
		grammar = g;
    }
    
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = InternalMWEParser.class.getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/internal/InternalMWE.tokens");
    }
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
        IParseError error = createParseError(re);
        reportError(error, re);
    } 
}

internalParse returns [EObject current=null] :
	 { currentNode = createCompositeNode("//@parserRules.0" /* xtext::ParserRule */, currentNode); }
	 iv_ruleFile=ruleFile 
	 { $current=$iv_ruleFile.current; } 
	 EOF 
;


// Rule File
ruleFile returns [EObject current=null] 
    @init { EObject temp=null; }:
((
    
    { 
        currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_properties=ruleProperty 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("File");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "properties", lv_properties,null);    }
)*(
    
    { 
        currentNode=createCompositeNode("//@parserRules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_value=ruleComplexValue 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("File");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "value", lv_value,null);    }
));



// Rule Property
ruleProperty returns [EObject current=null] 
    @init { EObject temp=null; }:
(
    { 
        currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
    }
    this_LocalVariable=ruleLocalVariable
    { 
        $current = $this_LocalVariable.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode("//@parserRules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_PropertiesFileImport=rulePropertiesFileImport
    { 
        $current = $this_PropertiesFileImport.current; 
        currentNode = currentNode.getParent();
    }
);



// Rule LocalVariable
ruleLocalVariable returns [EObject current=null] 
    @init { EObject temp=null; }:
((('property' 

    {
        createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_name=RULE_ID
    { 
    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"name"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("LocalVariable");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "name", lv_name,"ID");    }
))('=' 

    {
        createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_value=RULE_STRING
    { 
    createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("LocalVariable");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "value", lv_value,"STRING");    }
)))(';' 

    {
        createLeafNode("//@parserRules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
)?);



// Rule PropertiesFileImport
rulePropertiesFileImport returns [EObject current=null] 
    @init { EObject temp=null; }:
(('properties' 

    {
        createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_file=RULE_STRING
    { 
    createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"file"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("PropertiesFileImport");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "file", lv_file,"STRING");    }
))(';' 

    {
        createLeafNode("//@parserRules.3/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
)?);



// Rule Value
ruleValue returns [EObject current=null] 
    @init { EObject temp=null; }:
(((
    { 
        currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
    }
    this_SimpleValue=ruleSimpleValue
    { 
        $current = $this_SimpleValue.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_ComplexValue=ruleComplexValue
    { 
        $current = $this_ComplexValue.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_IdRef=ruleIdRef
    { 
        $current = $this_IdRef.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode("//@parserRules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_WorkflowRef=ruleWorkflowRef
    { 
        $current = $this_WorkflowRef.current; 
        currentNode = currentNode.getParent();
    }
);



// Rule SimpleValue
ruleSimpleValue returns [EObject current=null] 
    @init { EObject temp=null; }:
(
    lv_value=RULE_STRING
    { 
    createLeafNode("//@parserRules.5/@alternatives/@terminal" /* xtext::RuleCall */, currentNode,"value"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("SimpleValue");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "value", lv_value,"STRING");    }
);





// Rule ComplexValue
ruleComplexValue returns [EObject current=null] 
    @init { EObject temp=null; }:
(((((
    
    { 
        currentNode=createCompositeNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_className=ruleQualifiedName 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("ComplexValue");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "className", lv_className,null);    }
)?('id' 

    {
        createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_id=RULE_ID
    { 
    createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("ComplexValue");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "id", lv_id,"ID");    }
))?)(
    lv_fooBar='{' 
 
    {
        if ($current==null) {
            $current = factory.create("ComplexValue");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "fooBar", true,"{");        createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, currentNode,"fooBar");    }
))(
    
    { 
        currentNode=createCompositeNode("//@parserRules.7/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_assignments=ruleAssignment 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("ComplexValue");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "assignments", lv_assignments,null);    }
)*)'}' 

    {
        createLeafNode("//@parserRules.7/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
);



// Rule WorkflowRef
ruleWorkflowRef returns [EObject current=null] 
    @init { EObject temp=null; }:
(((('file' 

    {
        createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_uri=RULE_STRING
    { 
    createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"uri"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("WorkflowRef");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "uri", lv_uri,"STRING");    }
))'{' 

    {
        createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
)(
    
    { 
        currentNode=createCompositeNode("//@parserRules.8/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_assignments=ruleAssignment 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("WorkflowRef");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "assignments", lv_assignments,null);    }
)*)'}' 

    {
        createLeafNode("//@parserRules.8/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
);



// Rule IdRef
ruleIdRef returns [EObject current=null] 
    @init { EObject temp=null; }:
('idRef' 

    {
        createLeafNode("//@parserRules.9/@alternatives/@abstractTokens.0" /* xtext::Keyword */, currentNode,null); 
    }
(
    lv_id=RULE_ID
    { 
    createLeafNode("//@parserRules.9/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"id"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("IdRef");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "id", lv_id,"ID");    }
));



// Rule Assignment
ruleAssignment returns [EObject current=null] 
    @init { EObject temp=null; }:
((((
    lv_feature=RULE_ID
    { 
    createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"feature"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("Assignment");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "feature", lv_feature,"ID");    }
)('=' 

    {
        createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
)?)(
    
    { 
        currentNode=createCompositeNode("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
    }
    lv_value=ruleValue 
    {
        currentNode = currentNode.getParent();
        if ($current==null) {
            $current = factory.create("Assignment");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.set($current, "value", lv_value,null);    }
))(';' 

    {
        createLeafNode("//@parserRules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, currentNode,null); 
    }
)?);



// Rule QualifiedName
ruleQualifiedName returns [EObject current=null] 
    @init { EObject temp=null; }:
((
    lv_parts=RULE_ID
    { 
    createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("QualifiedName");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "parts", lv_parts,"ID");    }
)((
    lv_parts='.' 
 
    {
        if ($current==null) {
            $current = factory.create("QualifiedName");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "parts", lv_parts,".");        createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, currentNode,"parts");    }
)(
    lv_parts=RULE_ID
    { 
    createLeafNode("//@parserRules.11/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode,"parts"); 
    }
 
    {
        if ($current==null) {
            $current = factory.create("QualifiedName");
            associateNodeWithAstElement(currentNode, $current);
        }
        factory.add($current, "parts", lv_parts,"ID");    }
))*);




RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

RULE_SL_COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

RULE_LEXER_BODY : '<#' '.'* '#>';

RULE_ANY_OTHER : .;


