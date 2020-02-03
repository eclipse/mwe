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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 
 */
public class Mwe2ScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject
	private IInjectableFeatureLookup featureLookup;

	@Inject
	private FactorySupport factorySupport;
	
	@Inject
	private Provider<NameComputation> nameComputationProvider;

	public IScope scope_Assignment_feature(Assignment context, EReference reference) {
		if (context.eContainer() == null)
			throw new IllegalStateException("context.eContainer may not be null");
		if (!(context.eContainer() instanceof Component))
			throw new IllegalStateException("context.eContainer has to be instance of Component");
		Component container = (Component) context.eContainer();
		return createComponentFeaturesScope(container);
	}

	public IScope scope_AbstractReference_referable(StringLiteral owner, EReference reference) {
		return createReferenceScopeUpTo(owner.eContainer(), false);
	}

	public IScope scope_AbstractReference_referable(BooleanLiteral owner, EReference reference) {
		return createReferenceScopeUpTo(owner.eContainer(), false);
	}

	public IScope scope_AbstractReference_referable(DeclaredProperty owner, EReference reference) {
		return createReferenceScopeUpTo(owner, true);
	}

	public IScope scope_AbstractReference_referable(Assignment owner, EReference reference) {
		return createReferenceScopeUpTo(owner, true);
	}

	public IScope createReferenceScopeUpTo(EObject object, boolean allowObjects) {
		List<Referrable> result = Lists.newArrayList();
		collectReferablesUpTo(object, allowObjects, result);
		return createLocalScope(result);
	}

	public void collectReferablesUpTo(EObject object, boolean allowObjects, List<Referrable> result) {
		Module module = EcoreUtil2.getContainerOfType(object, Module.class);
		for (DeclaredProperty prop : module.getDeclaredProperties()) {
			if (prop == object || prop.getDefault() == object)
				return;
			if (isAllowed(prop.getDefault(), allowObjects))
				result.add(prop);
		}
		if (allowObjects)
			collectReferablesUpTo(module.getRoot(), object, result);
	}

	protected boolean isAllowed(Value value, boolean allowObjects) {
		return allowObjects || !(value instanceof Component); // TODO: discuss
																// how we handle
																// component
																// references in
																// strings
	}

	public boolean collectReferablesUpTo(Component component, EObject object, List<Referrable> result) {
		result.add(component);
		if (component == object)
			return false;
		for (Assignment assignment : component.getAssignment()) {
			if (assignment == object)
				return false;
			if (assignment.getValue() instanceof Component) {
				if (!collectReferablesUpTo((Component) assignment.getValue(), object, result))
					return false;
			}
		}
		return true;
	}

	public IScope createComponentFeaturesScope(Component container) {
		if (container.getModule() != null) {
			return createLocalScope(container.getModule().getDeclaredProperties());
		} else {
			JvmType containerType = container.getActualType();
			if (containerType == null || containerType.eIsProxy())
				return IScope.NULLSCOPE;
			Map<QualifiedName, JvmFeature> features = Maps.newHashMap();
			JvmType createType = factorySupport.findFactoriesCreationType(containerType);
			if (createType != null) {
				features.putAll(featureLookup.getInjectableFeatures(createType));
			}
			features.putAll(featureLookup.getInjectableFeatures(containerType));
			return new MapBasedScope(features);
		}
	}

	public void setFactorySupport(FactorySupport factorySupport) {
		this.factorySupport = factorySupport;
	}

	public void setFeatureLookup(IInjectableFeatureLookup featureLookup) {
		this.featureLookup = featureLookup;
	}

	public IInjectableFeatureLookup getFeatureLookup() {
		return featureLookup;
	}

	protected IScope createLocalScope(List<? extends EObject> elements) {
		return Scopes.scopeFor(elements, nameComputationProvider.get(), IScope.NULLSCOPE);
	}
	
	protected static class NameComputation implements Function<EObject, QualifiedName> {
		@Inject
		private IQualifiedNameConverter qualifiedNameConverter;

		private SimpleAttributeResolver<EObject, String> nameResolver = SimpleAttributeResolver.newResolver(String.class, "name");
		
		@Override
		public QualifiedName apply(EObject from) {
			String name = nameResolver.apply(from);
			if (name != null && name.length() > 0)
				return qualifiedNameConverter.toQualifiedName(nameResolver.apply(from));
			return null;
		}
	}
}
