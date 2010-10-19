/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflow;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

import com.google.inject.Inject;

public class NamespaceAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;

	@Override
	protected IScope getGlobalScope(EObject context, EReference reference) {
		EClass referenceType = reference.getEReferenceType();
		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.JVM_TYPE, referenceType)) {
			ResourceSet resourceSet = context.eResource().getResourceSet();
			IJvmTypeProvider typeProvider = typeScopeProvider.getTypeProviderFactory().findTypeProvider(resourceSet);
			if (typeProvider == null)
				typeProvider = typeScopeProvider.getTypeProviderFactory().createTypeProvider(resourceSet);
			return typeScopeProvider.createTypeScope(typeProvider);
		} else {
			return super.getGlobalScope(context, reference);
		}
	}
	
	@Override
	protected Set<ImportNormalizer> getImportedNamespaceResolvers(EObject context) {
		if (context instanceof Module) {
			Module module = (Module) context;
			Set<ImportNormalizer> result = super.getImportedNamespaceResolvers(context);
			result.add(createImportedNamespaceResolver("java.lang.*"));
			result.add(createImportedNamespaceResolver(IWorkflow.class.getPackage().getName() + ".*"));
			String name = module.getCanonicalName();
			int dot = name.lastIndexOf('.');
			if (dot >= 0) {
				name = name.substring(0, dot) + ".*";
				result.add(createImportedNamespaceResolver(name));
			}
			return result;
		}
		return Collections.emptySet();
	}

}
