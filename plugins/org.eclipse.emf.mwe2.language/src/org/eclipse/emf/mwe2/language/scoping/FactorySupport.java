/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe2.runtime.IFactory;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction") 
public class FactorySupport {
	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;

	public void setTypeScopeProvider(AbstractTypeScopeProvider typeScopeProvider) {
		this.typeScopeProvider = typeScopeProvider;
	}

	public JvmType findFactoriesCreationType(JvmType containerType) {
		JvmType factoryType = getFactoryType(containerType);
		if (factoryType == null)
			return null;
		return findFactoriesCreationType(containerType, factoryType);
	}

	public JvmType findFactoriesCreationType(JvmType containerType,
			JvmType factoryType) {
		if (containerType instanceof JvmDeclaredType) {
			EList<JvmTypeReference> superTypes = ((JvmDeclaredType) containerType)
					.getSuperTypes();
			for (JvmTypeReference ref : superTypes) {
				if (ref.getType().equals(factoryType)) {
					JvmParameterizedTypeReference r = (JvmParameterizedTypeReference) ref;
					if (r.getArguments().get(0) instanceof JvmParameterizedTypeReference) {
						return r.getArguments().get(0).getType();
					}
					return null;
				} else {
					JvmType result = findFactoriesCreationType(ref.getType(),
							factoryType);
					if (result != null)
						return result;
				}
			}
		}
		return null;
	}

	public JvmType getFactoryType(EObject ctx) {
		ResourceSet resourceSet = ctx.eResource().getResourceSet();
		String factoryName = IFactory.class.getName();
		IJvmTypeProvider typeProvider = typeScopeProvider.getTypeProvider(resourceSet);
		return typeProvider.findTypeByName(factoryName);
	}
}
