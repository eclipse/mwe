/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parsetree;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.di.parsetree.internal.InternalMWEParseTreeConstructor;
import org.eclipse.xtext.parsetree.AbstractParseTreeConstructor;

public class MWEParseTreeConstructor extends AbstractParseTreeConstructor {

	public void update(EObject object) {
		new InternalMWEParseTreeConstructor(getFactory(),getGrammar(),getValueConverterService()).update(object);
	}
}
