/*******************************************************************************
 * Copyright (c) 2008-2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.validation;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe2.language.mwe2.AbstractReference;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.emf.mwe2.language.scoping.FactorySupport;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.runtime.Mandatory;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class Mwe2JavaValidator extends AbstractMwe2JavaValidator {

	@Inject
	private TypeConformanceComputer assignabilityComputer;

	@Inject
	private FactorySupport factorySupport;
	
	@Inject
	private Mwe2ScopeProvider scopeProvider;
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	public final static String INCOMPATIBLE_ASSIGNMENT = "incompatible_assignment";

	@Check
	public void checkCompatibility(Assignment assignment) {
		JvmIdentifiableElement feature = assignment.getFeature();
		if (feature.eIsProxy())
			return;
		JvmTypeReference left = null; 
		if (feature instanceof JvmOperation) {
			JvmOperation op = (JvmOperation) feature;
			left = op.getParameters().get(0).getParameterType();
		} else if (feature instanceof DeclaredProperty) {
			DeclaredProperty property = (DeclaredProperty) feature;
			JvmType propertyType = property.getActualType();
			JvmParameterizedTypeReference propertyTypeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			propertyTypeRef.setType(propertyType);
			left = propertyTypeRef;
		} else {
			throw new UnsupportedOperationException(
					"Can not handle features of type "
							+ feature.getClass().getName() + " - " + feature);
		}
		if (left != null) {
			if (assignment.getValue() == null || assignment.getValue().eIsProxy())
				return;
			JvmParameterizedTypeReference right = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			JvmType actualType = assignment.getValue().getActualType();
			if (actualType == null || actualType.eIsProxy())
				return;
			JvmType factoryType = factorySupport.findFactoriesCreationType(actualType);
			if (factoryType != null) {
				right.setType(factoryType);
			} else {
				right.setType(actualType);
			}
			if (!assignabilityComputer.isConformant(left, right)) {
				error(
						"A value of type '" + actualType.getIdentifier()
						+ "' can not be assigned to the feature "
						+ feature.getIdentifier(),
						Mwe2Package.Literals.ASSIGNMENT__VALUE,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						INCOMPATIBLE_ASSIGNMENT);
			}
		}
	}
	
	@Check
	public void checkCompatibility(DeclaredProperty property) {
		if (property.getType()!=null && property.getDefault()!=null) {
			JvmParameterizedTypeReference left = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			left.setType(property.getType());
			JvmParameterizedTypeReference right = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			JvmType actualType = property.getDefault().getActualType();
			JvmType factoryType = factorySupport.findFactoriesCreationType(actualType);
			if (factoryType != null) {
				right.setType(factoryType);
			} else {
				right.setType(actualType);
			}
			if (!assignabilityComputer.isConformant(left, right)) {
				error(
						"A value of type '" + actualType.getIdentifier()
						+ "' can not be assigned to a reference of type "
						+ property.getType().getIdentifier(),
						Mwe2Package.Literals.DECLARED_PROPERTY__DEFAULT,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						INCOMPATIBLE_ASSIGNMENT);
			}
		}
	}

	public final static String UNUSED_LOCAL = "unused_local_variable";
	public final static String DUPLICATE_LOCAL = "duplicate_local_variable";

	@Check
	public void checkReferables(Module referable) {
		TreeIterator<EObject> iterator = referable.eResource().getAllContents();
		Set<String> referenced = Sets.newHashSet();
		Multimap<String, Referrable> declared = HashMultimap.create();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof Referrable) {
				String name = ((Referrable) next).getName();
				if (name != null) {
					declared.put(name, (Referrable) next);
				}
			} else if (next instanceof AbstractReference) {
				referenced.add(((AbstractReference) next).getReferable().getName());
			}
			if (next instanceof Component) {
				Component component = (Component) next;
				if (component.isAutoInject()) {
					Set<String> featureNames = collectFeatureNames(component);
					Set<String> explicitlyAssignedFeature = Sets.newHashSet();
					for(Assignment assignment: component.getAssignment()) {
						explicitlyAssignedFeature.add(assignment.getFeatureName());
					}
					featureNames.removeAll(explicitlyAssignedFeature);
					featureNames.retainAll(declared.keySet());
					referenced.addAll(featureNames);
				}
			}
		}
		Multimap<String, Referrable> copy = HashMultimap.create(declared);
		copy.keySet().removeAll(referenced);
		for (Referrable referrable : copy.values()) {
			warning(
					"The var '" + referrable.getName() + "' is never read locally.",
					referrable,
					Mwe2Package.Literals.REFERRABLE__NAME,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					UNUSED_LOCAL);
		}
		for (String name : declared.keySet()) {
			Collection<Referrable> collection = declared.get(name);
			if (collection.size()>1) {
				for (Referrable referrable : collection) {
					error(
							"Duplicate var '" + referrable.getName() + "'.",
							referrable, 
							Mwe2Package.Literals.REFERRABLE__NAME,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
							DUPLICATE_LOCAL);
				}
			}
		}
	}
	
	public Set<String> collectFeatureNames(Component component) {
		Set<String> result = Sets.newHashSet();
		IScope scope = scopeProvider.createComponentFeaturesScope(component);
		for(IEObjectDescription description: scope.getAllElements()) {
			result.add(qualifiedNameConverter.toString(description.getName()));
		}
		return result;
	}
	
	public final static String MISSING_DEFAULT_CONSTRUCTOR = "missing_default_constructor";
	
	@Check
	public void checkInstantiable(Component component) {
		if (component.getModule() != null)
			return;
		JvmType actualType = component.getActualType();
		if (actualType == null || actualType.eIsProxy())
			return;
		JvmDeclaredType declaredType = (JvmDeclaredType) actualType;
		if (!declaredType.isAbstract() && 
				!(declaredType instanceof JvmGenericType && ((JvmGenericType) declaredType).isInterface())) {
			for(JvmMember member: declaredType.getMembers()) {
				if (member instanceof JvmConstructor) {
					if (((JvmConstructor) member).getParameters().isEmpty() && member.getVisibility().equals(JvmVisibility.PUBLIC))
						return;
				}
			}
			error(
					"'" + declaredType.getIdentifier() + "' does not have a public default constructor.",
					component, 
					Mwe2Package.Literals.REFERRABLE__TYPE,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					MISSING_DEFAULT_CONSTRUCTOR);
		}
	}
	
	public final static String ABSTRACT_OR_INTERFACE = "abstract_or_interface";
	
	@Check
	public void checkComponentTypeIsInterfaceOrAbstract(Component component) {
		if (component.getModule() != null)
			return;
		JvmType actualType = component.getActualType();
		if (actualType == null || actualType.eIsProxy())
			return;
		JvmDeclaredType declaredType = (JvmDeclaredType) actualType;
		if (declaredType.isAbstract() || 
				(declaredType instanceof JvmGenericType && ((JvmGenericType) declaredType).isInterface())) {
			error(
					"'" + declaredType.getIdentifier() + "' is not instantiable.",
					component, 
					Mwe2Package.Literals.REFERRABLE__TYPE,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					ABSTRACT_OR_INTERFACE);
		}
	}
	
	public final static String MISSING_MANDATORY_FEATURE = "missing_mandatory_feature";
	
	@Check
	public void checkManadatoryFeaturesAssigned(Component component) {
		Map<String, JvmIdentifiableElement> mandatoryFeatures = collectMandatoryFeatures(component);
		if (!mandatoryFeatures.isEmpty()) {
			Map<String, Referrable> availableProperties = collectReferablesUpTo(component);
			Set<String> assignedFeatures = getAssignedFeatures(availableProperties, component);
			mandatoryFeatures.keySet().removeAll(assignedFeatures);
			if (!mandatoryFeatures.isEmpty()) {
				List<String> missingAssignments = Lists.newArrayList(mandatoryFeatures.keySet());
				Collections.sort(missingAssignments);
				String concatenated = Strings.concat(", ", missingAssignments);
				EStructuralFeature feature = null;
				if (component.getType() != null)
					feature = Mwe2Package.Literals.REFERRABLE__TYPE;
				else if (component.getModule() != null)
					feature = Mwe2Package.Literals.COMPONENT__MODULE;
				else if (component.getName() != null)
					feature = Mwe2Package.Literals.REFERRABLE__NAME;
				if (missingAssignments.size() == 1)
					error(
							"Mandatory feature was not assigned: '" + concatenated + "'.", 
							component, 
							feature,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
							MISSING_MANDATORY_FEATURE);
				else
					error(
							"Mandatory features were not assigned: '" + concatenated + "'.", 
							component, 
							feature,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
							MISSING_MANDATORY_FEATURE);
			}
		}
	}
	
	private Set<String> getAssignedFeatures(
			Map<String, Referrable> availableProperties, Component component) {
		Set<String> result = Sets.newHashSet();
		if (component.isAutoInject()) {
			result.addAll(availableProperties.keySet());
		}
		for(Assignment assignment: component.getAssignment()) {
			if (assignment.getFeature() != null && !assignment.getFeature().eIsProxy()) {
				JvmIdentifiableElement feature = assignment.getFeature();
				if (feature instanceof JvmOperation) {
					result.add(Strings.toFirstLower((((JvmOperation)feature).getSimpleName().substring(3))));
				} else if (feature instanceof JvmFeature) {
					result.add(((JvmFeature) feature).getSimpleName());
				} else {
					result.add(((DeclaredProperty)feature).getName());
				}
			}
				
		}
		return result;
	}

	public Map<String, Referrable> collectReferablesUpTo(Component component) {
		List<Referrable> result = Lists.newArrayList();
		scopeProvider.collectReferablesUpTo(component, true, result);
		Map<String, Referrable> indexed = Maps.newHashMap();
		for(Referrable referrable: result) {
			if (referrable.getName() != null) {
				indexed.put(referrable.getName(), referrable);
			}
		}
		return indexed;
	}
	
	public Map<String, JvmIdentifiableElement> collectMandatoryFeatures(Component component) {
		Map<String, JvmIdentifiableElement> result = Maps.newHashMap();
		IScope scope = scopeProvider.createComponentFeaturesScope(component);
		for(IEObjectDescription description: scope.getAllElements()) {
			JvmIdentifiableElement jvmFeature = (JvmIdentifiableElement) description.getEObjectOrProxy();
			if (isMandatory(jvmFeature)) {
				result.put(qualifiedNameConverter.toString(description.getName()), jvmFeature);
			}
		}
		return result;
	}
	
	public boolean isMandatory(JvmIdentifiableElement feature) {
		if (feature.eIsProxy())
			return false;
		if (feature instanceof DeclaredProperty) {
			return ((DeclaredProperty) feature).getDefault() == null;
		}
		JvmOperation operation = (JvmOperation) feature;
		for(JvmAnnotationReference annotation: operation.getAnnotations()) {
			if (Mandatory.class.getName().equals(annotation.getAnnotation().getIdentifier()))
				return true;
		}
		return false;
	}
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> ePackages = super.getEPackages();
		ePackages.add(Mwe2Package.eINSTANCE);
		return ePackages;
	}

}
