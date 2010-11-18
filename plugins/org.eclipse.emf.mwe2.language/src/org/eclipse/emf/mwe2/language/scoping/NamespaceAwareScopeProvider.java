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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflow;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

public class NamespaceAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

//	@Inject
//	private AbstractTypeScopeProvider typeScopeProvider;
//
//	@Override
//	protected IScope getGlobalScope(EObject context, EReference reference) {
//		EClass referenceType = reference.getEReferenceType();
//		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.JVM_TYPE, referenceType)) {
//			ResourceSet resourceSet = context.eResource().getResourceSet();
//			IJvmTypeProvider typeProvider = typeScopeProvider.getTypeProviderFactory().findOrCreateTypeProvider(resourceSet);
//			return typeScopeProvider.createTypeScope(typeProvider);
//		} else {
//			return super.getGlobalScope(context, reference);
//		}
//	}
	
	@Override
	protected List<ImportNormalizer> getImportedNamespaceResolvers(EObject context) {
		if (context instanceof Module) {
			Module module = (Module) context;
			List<ImportNormalizer> result = super.getImportedNamespaceResolvers(context);
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
		return Collections.emptyList();
	}

}
