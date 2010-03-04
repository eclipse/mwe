package org.eclipse.emf.mwe2.language.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.inject.Inject;

public class JvmTypesAwareGlobalScopeProvider extends DefaultGlobalScopeProvider {
	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference.getEReferenceType().getEPackage() == TypesPackage.eINSTANCE) {
			return typeScopeProvider.getScope(context, reference);
		}
		return super.getScope(context, reference);
	}
}
