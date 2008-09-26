
/*
Generated with Xtext
*/
grammar InternalMWE;

options {
	superClass=AbstractAntlrParser;
}

@lexer::header {
package org.eclipse.emf.mwe.di.parser.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
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
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
}

@parser::members {
 
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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}



// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0" /* xtext::ParserRule */, currentNode); }
	 iv_ruleFile=ruleFile 
	 { $current=$iv_ruleFile.current; } 
	 EOF 
;

// Rule File
ruleFile returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(((	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_imports=ruleImport 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "imports", lv_imports,null);
	         }
	
)*(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_properties=ruleProperty 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "properties", lv_properties,null);
	         }
	
)*)(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_value=ruleComplexValue 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("File");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "value", lv_value,null);
	         }
	
));
    


// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1" /* xtext::ParserRule */, currentNode); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
    }
    this_JavaImport=ruleJavaImport
    { 
        $current = $this_JavaImport.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_GenericImport=ruleGenericImport
    { 
        $current = $this_GenericImport.current; 
        currentNode = currentNode.getParent();
    }
);
    


// Entry rule entryRuleJavaImport
entryRuleJavaImport returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2" /* xtext::ParserRule */, currentNode); }
	 iv_ruleJavaImport=ruleJavaImport 
	 { $current=$iv_ruleJavaImport.current; } 
	 EOF 
;

// Rule JavaImport
ruleJavaImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
((('import' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_javaImport=ruleQualifiedName 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("JavaImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "javaImport", lv_javaImport,null);
	         }
	
))('.' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    lv_wildcard='*' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::Keyword */, "wildcard"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("JavaImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "wildcard", true,"*");
	         }
	
))?)';' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
);
    


// Entry rule entryRuleGenericImport
entryRuleGenericImport returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3" /* xtext::ParserRule */, currentNode); }
	 iv_ruleGenericImport=ruleGenericImport 
	 { $current=$iv_ruleGenericImport.current; } 
	 EOF 
;

// Rule GenericImport
ruleGenericImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(('import' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    lv_value=RULE_STRING
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "value"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("GenericImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "value", lv_value,"STRING");
	         }
	
))(';' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
)?);
    


// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4" /* xtext::ParserRule */, currentNode); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.0" /* xtext::RuleCall */, currentNode); 
    }
    this_LocalVariable=ruleLocalVariable
    { 
        $current = $this_LocalVariable.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_PropertiesFileImport=rulePropertiesFileImport
    { 
        $current = $this_PropertiesFileImport.current; 
        currentNode = currentNode.getParent();
    }
);
    


// Entry rule entryRuleLocalVariable
entryRuleLocalVariable returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5" /* xtext::ParserRule */, currentNode); }
	 iv_ruleLocalVariable=ruleLocalVariable 
	 { $current=$iv_ruleLocalVariable.current; } 
	 EOF 
;

// Rule LocalVariable
ruleLocalVariable returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
((('var' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    lv_name=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "name"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("LocalVariable");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "name", lv_name,"ID");
	         }
	
))('=' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_value=ruleValue 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("LocalVariable");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "value", lv_value,null);
	         }
	
))?)';' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
);
    


// Entry rule entryRulePropertiesFileImport
entryRulePropertiesFileImport returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6" /* xtext::ParserRule */, currentNode); }
	 iv_rulePropertiesFileImport=rulePropertiesFileImport 
	 { $current=$iv_rulePropertiesFileImport.current; } 
	 EOF 
;

// Rule PropertiesFileImport
rulePropertiesFileImport returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
((('var' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
'file' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
)(	
	
	    lv_file=RULE_STRING
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "file"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("PropertiesFileImport");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "file", lv_file,"STRING");
	         }
	
))';' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
);
    


// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7" /* xtext::ParserRule */, currentNode); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(((
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.0" /* xtext::RuleCall */, currentNode); 
    }
    this_SimpleValue=ruleSimpleValue
    { 
        $current = $this_SimpleValue.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_ComplexValue=ruleComplexValue
    { 
        $current = $this_ComplexValue.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_IdRef=ruleIdRef
    { 
        $current = $this_IdRef.current; 
        currentNode = currentNode.getParent();
    }
)
    |
    { 
        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.1" /* xtext::RuleCall */, currentNode); 
    }
    this_WorkflowRef=ruleWorkflowRef
    { 
        $current = $this_WorkflowRef.current; 
        currentNode = currentNode.getParent();
    }
);
    


// Entry rule entryRuleSimpleValue
entryRuleSimpleValue returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8" /* xtext::ParserRule */, currentNode); }
	 iv_ruleSimpleValue=ruleSimpleValue 
	 { $current=$iv_ruleSimpleValue.current; } 
	 EOF 
;

// Rule SimpleValue
ruleSimpleValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(	
	
	    lv_value=RULE_STRING
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives/@terminal" /* xtext::RuleCall */, "value"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("SimpleValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "value", lv_value,"STRING");
	         }
	
);
    




// Entry rule entryRuleComplexValue
entryRuleComplexValue returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10" /* xtext::ParserRule */, currentNode); }
	 iv_ruleComplexValue=ruleComplexValue 
	 { $current=$iv_ruleComplexValue.current; } 
	 EOF 
;

// Rule ComplexValue
ruleComplexValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(((((	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_className=ruleQualifiedName 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "className", lv_className,null);
	         }
	
)?(':' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    lv_id=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "id"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "id", lv_id,"ID");
	         }
	
))?)(	
	
	    lv_fooBar='{' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::Keyword */, "fooBar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "fooBar", true,"{");
	         }
	
))(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_assignments=ruleAssignment 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("ComplexValue");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "assignments", lv_assignments,null);
	         }
	
)*)'}' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
);
    


// Entry rule entryRuleWorkflowRef
entryRuleWorkflowRef returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11" /* xtext::ParserRule */, currentNode); }
	 iv_ruleWorkflowRef=ruleWorkflowRef 
	 { $current=$iv_ruleWorkflowRef.current; } 
	 EOF 
;

// Rule WorkflowRef
ruleWorkflowRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(((('file' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0" /* xtext::Keyword */, null); 
    }
(	
	
	    lv_uri=RULE_STRING
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "uri"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("WorkflowRef");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "uri", lv_uri,"STRING");
	         }
	
))'{' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
)(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_assignments=ruleAssignment 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("WorkflowRef");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "assignments", lv_assignments,null);
	         }
	
)*)'}' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
);
    


// Entry rule entryRuleIdRef
entryRuleIdRef returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12" /* xtext::ParserRule */, currentNode); }
	 iv_ruleIdRef=ruleIdRef 
	 { $current=$iv_ruleIdRef.current; } 
	 EOF 
;

// Rule IdRef
ruleIdRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
(	
	
	    lv_id=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives/@terminal" /* xtext::RuleCall */, "id"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("IdRef");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "id", lv_id,"ID");
	         }
	
);
    


// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13" /* xtext::ParserRule */, currentNode); }
	 iv_ruleAssignment=ruleAssignment 
	 { $current=$iv_ruleAssignment.current; } 
	 EOF 
;

// Rule Assignment
ruleAssignment returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
((((	
	
	    lv_feature=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "feature"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "feature", lv_feature,"ID");
	         }
	
)?(	
	
	    lv_operator=('=' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0" /* xtext::Keyword */, "operator"); 
    }

    |'+=' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1" /* xtext::Keyword */, "operator"); 
    }
) 
	    {
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "operator", input.LT(-1),null);
	         }
	
))(	
	
	    
	    { 
	        currentNode=createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal" /* xtext::RuleCall */, currentNode); 
	    }
	    lv_value=ruleValue 
	    {
	        currentNode = currentNode.getParent();
	        if ($current==null) {
	            $current = factory.create("Assignment");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.set($current, "value", lv_value,null);
	         }
	
))(';' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.1" /* xtext::Keyword */, null); 
    }
)?);
    


// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [EObject current=null] :
	{ currentNode = createCompositeNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14" /* xtext::ParserRule */, currentNode); }
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current; } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); }:
((	
	
	    lv_parts=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0/@terminal" /* xtext::RuleCall */, "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "parts", lv_parts,"ID");
	         }
	
)((	
	
	    lv_parts='.' 
    {
        createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal" /* xtext::Keyword */, "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "parts", input.LT(-1),".");
	         }
	
)(	
	
	    lv_parts=RULE_ID
    { 
    createLeafNode("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal" /* xtext::RuleCall */, "parts"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create("QualifiedName");
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        factory.add($current, "parts", lv_parts,"ID");
	         }
	
))*);
    



RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |                '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

RULE_SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')? {$channel=HIDDEN;};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

RULE_ANY_OTHER : .;


