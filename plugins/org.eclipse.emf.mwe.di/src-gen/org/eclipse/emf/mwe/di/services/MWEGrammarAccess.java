/*
Generated with Xtext
*/

package org.eclipse.emf.mwe.di.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.BaseEPackageAccess;

public class MWEGrammarAccess extends BaseEPackageAccess implements IGrammarAccess {

	private static final String MWE_GRAMMAR_CP_URI = "classpath:/org/eclipse/emf/mwe/di/MWE.xmi";
	private static Grammar GRAMMAR = null;
	
	@SuppressWarnings("unused")
	public synchronized Grammar getGrammar() {	
		if (GRAMMAR==null) {
			// assert the XtextPackage implementation is loaded
			XtextPackage xtextPackage = XtextPackage.eINSTANCE;
			GRAMMAR = (Grammar) loadGrammarFile(MWEGrammarAccess.class.getClassLoader(),MWE_GRAMMAR_CP_URI);
		}
		return GRAMMAR;
	}
	
	
	public ParserRule pr_File() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0"),true); 
	}

	public ParserRule pr_Import() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1"),true); 
	}

	public ParserRule pr_JavaImport() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2"),true); 
	}

	public ParserRule pr_GenericImport() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3"),true); 
	}

	public ParserRule pr_Property() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4"),true); 
	}

	public ParserRule pr_LocalVariable() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5"),true); 
	}

	public ParserRule pr_PropertiesFileImport() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6"),true); 
	}

	public ParserRule pr_Value() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7"),true); 
	}

	public ParserRule pr_SimpleValue() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.8"),true); 
	}

	public ParserRule pr_Assignable() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.9"),true); 
	}

	public ParserRule pr_ComplexValue() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10"),true); 
	}

	public ParserRule pr_WorkflowRef() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11"),true); 
	}

	public ParserRule pr_IdRef() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.12"),true); 
	}

	public ParserRule pr_Assignment() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13"),true); 
	}

	public ParserRule pr_QualifiedName() {
		return (ParserRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14"),true); 
	}

	
	public LexerRule lr_ID() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.0"),true); 
	}

	public LexerRule lr_INT() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.1"),true); 
	}

	public LexerRule lr_STRING() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.2"),true); 
	}

	public LexerRule lr_ML_COMMENT() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.3"),true); 
	}

	public LexerRule lr_SL_COMMENT() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.4"),true); 
	}

	public LexerRule lr_WS() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.5"),true); 
	}

	public LexerRule lr_ANY_OTHER() {
		return (LexerRule) getGrammar().eResource().getResourceSet().getEObject(URI.createURI("classpath:/org/eclipse/xtext/builtin/XtextBuiltin.xmi#//@lexerRules.6"),true); 
	}

   
}
