package org.eclipse.emf.mwe2.language.ui.scoping;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.ITypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.inject.Inject;

public class NamespaceAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Override
	protected IScope getGlobalScope(EObject context, EReference reference) {
		EClass referenceType = reference.getEReferenceType();
		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.TYPE, referenceType)) {
			ResourceSet resourceSet = context.eResource().getResourceSet();
			ITypeProvider typeProvider = typeScopeProvider.getTypeProviderFactory().findTypeProvider(resourceSet);
			if (typeProvider == null)
				typeProvider = typeScopeProvider.getTypeProviderFactory().createTypeProvider(resourceSet);
			return typeScopeProvider.createTypeScope(typeProvider);
		} else {
			return super.getGlobalScope(context, reference);
		}
	}
	
	@Override
	public Set<ImportNormalizer> getImportNormalizer(EObject context) {
		return super.getImportNormalizer(context);
	}
	
	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;
	
}
