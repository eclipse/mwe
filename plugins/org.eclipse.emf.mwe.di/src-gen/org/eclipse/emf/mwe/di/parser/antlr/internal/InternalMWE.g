/*
Generated with Xtext
*/
grammar InternalMWE;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.emf.mwe.di.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {
 
 	private MWEGrammarAccess grammarAccess;
 	
    public InternalMWEParser(TokenStream input, IAstFactory factory, MWEGrammarAccess grammarAccess) {
        super(input, factory, grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}





// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prFile().getRule(), currentNode); }
	 iv_ruleFile=ruleFile 
	 { $current=$iv_ruleFile.current; } 
	 EOF 
;

// Rule File
ruleFile returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prFile().ele000ParserRuleCallImport(), currentNode); 
	    }
	    lv_imports=ruleImport 
	    {
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.add($current, "imports", lv_imports, "Import", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prFile().ele010ParserRuleCallProperty(), currentNode); 
	    }
	    lv_properties=ruleProperty 
	    {
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.add($current, "properties", lv_properties, "Property", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prFile().ele10ParserRuleCallComplexValue(), currentNode); 
	    }
	    lv_value=ruleComplexValue 
	    {
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.set($current, "value", lv_value, "ComplexValue", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
));







// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prImport().getRule(), currentNode); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.prImport().ele0ParserRuleCallJavaImport(), currentNode); 
    }
    this_JavaImport=ruleJavaImport
    { 
        $current = $this_JavaImport.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.prImport().ele1ParserRuleCallGenericImport(), currentNode); 
    }
    this_GenericImport=ruleGenericImport
    { 
        $current = $this_GenericImport.current; 
        currentNode = currentNode.getParent();
    }
);







// Entry rule entryRuleJavaImport
entryRuleJavaImport returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prJavaImport().getRule(), currentNode); }
	 iv_ruleJavaImport=ruleJavaImport 
	 { $current=$iv_ruleJavaImport.current; } 
	 EOF 
;

// Rule JavaImport
ruleJavaImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
((('import' 
    {
        createLeafNode(grammarAccess.prJavaImport().ele000KeywordImport(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prJavaImport().ele0010ParserRuleCallQualifiedName(), currentNode); 
	    }
	    lv_javaImport=ruleQualifiedName 
	    {
	        if ($current==null) {
	            $current = factory.create("JavaImport");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.set($current, "javaImport", lv_javaImport, "QualifiedName", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))('.' 
    {
        createLeafNode(grammarAccess.prJavaImport().ele010KeywordFullStop(), null); 
    }
(	
	
	    lv_wildcard='*' 
    {
        createLeafNode(grammarAccess.prJavaImport().ele0110KeywordAsterisk(), "wildcard"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("JavaImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "wildcard", true, "*", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))?)';' 
    {
        createLeafNode(grammarAccess.prJavaImport().ele1KeywordSemicolon(), null); 
    }
);







// Entry rule entryRuleGenericImport
entryRuleGenericImport returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prGenericImport().getRule(), currentNode); }
	 iv_ruleGenericImport=ruleGenericImport 
	 { $current=$iv_ruleGenericImport.current; } 
	 EOF 
;

// Rule GenericImport
ruleGenericImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(('import' 
    {
        createLeafNode(grammarAccess.prGenericImport().ele00KeywordImport(), null); 
    }
(	
	
	    lv_value=RULE_STRING
    { 
    createLeafNode(grammarAccess.prGenericImport().ele010LexerRuleCallSTRING(), "value"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("GenericImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "value", lv_value, "STRING", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))(';' 
    {
        createLeafNode(grammarAccess.prGenericImport().ele1KeywordSemicolon(), null); 
    }
)?);







// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prProperty().getRule(), currentNode); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.prProperty().ele0ParserRuleCallLocalVariable(), currentNode); 
    }
    this_LocalVariable=ruleLocalVariable
    { 
        $current = $this_LocalVariable.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.prProperty().ele1ParserRuleCallPropertiesFileImport(), currentNode); 
    }
    this_PropertiesFileImport=rulePropertiesFileImport
    { 
        $current = $this_PropertiesFileImport.current; 
        currentNode = currentNode.getParent();
    }
);







// Entry rule entryRuleLocalVariable
entryRuleLocalVariable returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prLocalVariable().getRule(), currentNode); }
	 iv_ruleLocalVariable=ruleLocalVariable 
	 { $current=$iv_ruleLocalVariable.current; } 
	 EOF 
;

// Rule LocalVariable
ruleLocalVariable returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
((('var' 
    {
        createLeafNode(grammarAccess.prLocalVariable().ele000KeywordVar(), null); 
    }
(	
	
	    lv_name=RULE_ID
    { 
    createLeafNode(grammarAccess.prLocalVariable().ele0010LexerRuleCallID(), "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("LocalVariable");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "name", lv_name, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))('=' 
    {
        createLeafNode(grammarAccess.prLocalVariable().ele010KeywordEqualsSign(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prLocalVariable().ele0110ParserRuleCallValue(), currentNode); 
	    }
	    lv_value=ruleValue 
	    {
	        if ($current==null) {
	            $current = factory.create("LocalVariable");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.set($current, "value", lv_value, "Value", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))?)';' 
    {
        createLeafNode(grammarAccess.prLocalVariable().ele1KeywordSemicolon(), null); 
    }
);







// Entry rule entryRulePropertiesFileImport
entryRulePropertiesFileImport returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prPropertiesFileImport().getRule(), currentNode); }
	 iv_rulePropertiesFileImport=rulePropertiesFileImport 
	 { $current=$iv_rulePropertiesFileImport.current; } 
	 EOF 
;

// Rule PropertiesFileImport
rulePropertiesFileImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
((('var' 
    {
        createLeafNode(grammarAccess.prPropertiesFileImport().ele000KeywordVar(), null); 
    }
'file' 
    {
        createLeafNode(grammarAccess.prPropertiesFileImport().ele001KeywordFile(), null); 
    }
)(	
	
	    lv_file=RULE_STRING
    { 
    createLeafNode(grammarAccess.prPropertiesFileImport().ele010LexerRuleCallSTRING(), "file"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("PropertiesFileImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "file", lv_file, "STRING", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))';' 
    {
        createLeafNode(grammarAccess.prPropertiesFileImport().ele1KeywordSemicolon(), null); 
    }
);







// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prValue().getRule(), currentNode); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(((
    { 
        currentNode=createCompositeNode(grammarAccess.prValue().ele000ParserRuleCallSimpleValue(), currentNode); 
    }
    this_SimpleValue=ruleSimpleValue
    { 
        $current = $this_SimpleValue.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.prValue().ele001ParserRuleCallComplexValue(), currentNode); 
    }
    this_ComplexValue=ruleComplexValue
    { 
        $current = $this_ComplexValue.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode(grammarAccess.prValue().ele01ParserRuleCallIdRef(), currentNode); 
    }
    this_IdRef=ruleIdRef
    { 
        $current = $this_IdRef.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode(grammarAccess.prValue().ele1ParserRuleCallWorkflowRef(), currentNode); 
    }
    this_WorkflowRef=ruleWorkflowRef
    { 
        $current = $this_WorkflowRef.current; 
        currentNode = currentNode.getParent();
    }
);







// Entry rule entryRuleSimpleValue
entryRuleSimpleValue returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prSimpleValue().getRule(), currentNode); }
	 iv_ruleSimpleValue=ruleSimpleValue 
	 { $current=$iv_ruleSimpleValue.current; } 
	 EOF 
;

// Rule SimpleValue
ruleSimpleValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(	
	
	    lv_value=RULE_STRING
    { 
    createLeafNode(grammarAccess.prSimpleValue().ele0LexerRuleCallSTRING(), "value"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("SimpleValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "value", lv_value, "STRING", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
);









// Entry rule entryRuleComplexValue
entryRuleComplexValue returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prComplexValue().getRule(), currentNode); }
	 iv_ruleComplexValue=ruleComplexValue 
	 { $current=$iv_ruleComplexValue.current; } 
	 EOF 
;

// Rule ComplexValue
ruleComplexValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(((((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prComplexValue().ele00000ParserRuleCallQualifiedName(), currentNode); 
	    }
	    lv_className=ruleQualifiedName 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.set($current, "className", lv_className, "QualifiedName", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)?(':' 
    {
        createLeafNode(grammarAccess.prComplexValue().ele00010KeywordColon(), null); 
    }
(	
	
	    lv_id=RULE_ID
    { 
    createLeafNode(grammarAccess.prComplexValue().ele000110LexerRuleCallID(), "id"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "id", lv_id, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))?)(	
	
	    lv_fooBar='{' 
    {
        createLeafNode(grammarAccess.prComplexValue().ele0010KeywordLeftCurlyBracket(), "fooBar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "fooBar", true, "{", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prComplexValue().ele010ParserRuleCallAssignment(), currentNode); 
	    }
	    lv_assignments=ruleAssignment 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.add($current, "assignments", lv_assignments, "Assignment", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*)'}' 
    {
        createLeafNode(grammarAccess.prComplexValue().ele1KeywordRightCurlyBracket(), null); 
    }
);







// Entry rule entryRuleWorkflowRef
entryRuleWorkflowRef returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prWorkflowRef().getRule(), currentNode); }
	 iv_ruleWorkflowRef=ruleWorkflowRef 
	 { $current=$iv_ruleWorkflowRef.current; } 
	 EOF 
;

// Rule WorkflowRef
ruleWorkflowRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(((('file' 
    {
        createLeafNode(grammarAccess.prWorkflowRef().ele0000KeywordFile(), null); 
    }
(	
	
	    lv_uri=RULE_STRING
    { 
    createLeafNode(grammarAccess.prWorkflowRef().ele00010LexerRuleCallSTRING(), "uri"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("WorkflowRef");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "uri", lv_uri, "STRING", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))'{' 
    {
        createLeafNode(grammarAccess.prWorkflowRef().ele001KeywordLeftCurlyBracket(), null); 
    }
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prWorkflowRef().ele010ParserRuleCallAssignment(), currentNode); 
	    }
	    lv_assignments=ruleAssignment 
	    {
	        if ($current==null) {
	            $current = factory.create("WorkflowRef");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.add($current, "assignments", lv_assignments, "Assignment", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*)'}' 
    {
        createLeafNode(grammarAccess.prWorkflowRef().ele1KeywordRightCurlyBracket(), null); 
    }
);







// Entry rule entryRuleIdRef
entryRuleIdRef returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prIdRef().getRule(), currentNode); }
	 iv_ruleIdRef=ruleIdRef 
	 { $current=$iv_ruleIdRef.current; } 
	 EOF 
;

// Rule IdRef
ruleIdRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
(	
	
	    lv_id=RULE_ID
    { 
    createLeafNode(grammarAccess.prIdRef().ele0LexerRuleCallID(), "id"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("IdRef");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "id", lv_id, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
);







// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prAssignment().getRule(), currentNode); }
	 iv_ruleAssignment=ruleAssignment 
	 { $current=$iv_ruleAssignment.current; } 
	 EOF 
;

// Rule Assignment
ruleAssignment returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
((((	
	
	    lv_feature=RULE_ID
    { 
    createLeafNode(grammarAccess.prAssignment().ele0000LexerRuleCallID(), "feature"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "feature", lv_feature, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)?(	
	
	    lv_operator=('=' 
    {
        createLeafNode(grammarAccess.prAssignment().ele00100KeywordEqualsSign(), "operator"); 
    }

    |'+=' 
    {
        createLeafNode(grammarAccess.prAssignment().ele00101KeywordPlusSignEqualsSign(), "operator"); 
    }
) 
	    {
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.set($current, "operator", input.LT(-1), null, currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.prAssignment().ele010ParserRuleCallValue(), currentNode); 
	    }
	    lv_value=ruleValue 
	    {
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	        	factory.set($current, "value", lv_value, "Value", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))(';' 
    {
        createLeafNode(grammarAccess.prAssignment().ele1KeywordSemicolon(), null); 
    }
)?);







// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.prQualifiedName().getRule(), currentNode); }
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current; } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    }:
((	
	
	    lv_parts=RULE_ID
    { 
    createLeafNode(grammarAccess.prQualifiedName().ele00LexerRuleCallID(), "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.add($current, "parts", lv_parts, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)((	
	
	    lv_parts='.' 
    {
        createLeafNode(grammarAccess.prQualifiedName().ele100KeywordFullStop(), "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.add($current, "parts", input.LT(-1), ".", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)(	
	
	    lv_parts=RULE_ID
    { 
    createLeafNode(grammarAccess.prQualifiedName().ele110LexerRuleCallID(), "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	        	factory.add($current, "parts", lv_parts, "ID", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
))*);





































RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : 
			  '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | 
              '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
              ;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/';

RULE_SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


