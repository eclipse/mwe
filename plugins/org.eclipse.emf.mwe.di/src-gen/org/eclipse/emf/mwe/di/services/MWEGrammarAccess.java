/*
Generated with Xtext
*/

package org.eclipse.emf.mwe.di.services;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.parser.BaseEPackageAccess;

public class MWEGrammarAccess extends BaseEPackageAccess implements IGrammarAccess {

	private static final String MWE_GRAMMAR_CP_URI = "org/eclipse/emf/mwe/di/MWE.xmi";
	private static Grammar GRAMMAR = null;
	
	@SuppressWarnings("unused")
	public Grammar getGrammar() {	
		if (GRAMMAR==null) {
			// assert the XtextPackage implementation is loaded
			XtextPackage xtextPackage = XtextPackage.eINSTANCE;
			GRAMMAR = (Grammar) loadGrammarFile(MWEGrammarAccess.class.getClassLoader(),MWE_GRAMMAR_CP_URI);
		}
		return GRAMMAR;
	}
	
	public String getGrammarClasspathURI() {
		return MWE_GRAMMAR_CP_URI;
	}
   
}
