package org.eclipse.emf.mwe2.language.scoping;

import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

public class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	public String qualifiedName(Module module) {
		return module.getCanonicalName();
	}
	
}
