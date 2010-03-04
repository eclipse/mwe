package org.eclipse.emf.mwe2.language.validation;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.language.mwe2.AbstractReference;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.emf.mwe2.language.scoping.FactorySupport;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.IAssignabilityComputer;
import org.eclipse.xtext.validation.Check;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class Mwe2JavaValidator extends AbstractMwe2JavaValidator {

	@Inject
	private IAssignabilityComputer assignabilityComputer;

	@Inject
	private FactorySupport factorySupport;

	public final static String INCOMPATIBLE_ASSIGNMENT = "incompatible_assignment";

	@Check
	public void checkCompatibility(Assignment assignment) {
		JvmFeature feature = assignment.getFeature();
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
			JvmParameterizedTypeReference right = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			JvmType actualType = assignment.getValue().getActualType();
			JvmType factoryType = factorySupport.findFactoriesCreationType(actualType);
			if (factoryType != null) {
				right.setType(factoryType);
			} else {
				right.setType(actualType);
			}
			if (!assignabilityComputer.isAssignableFrom(left, right)) {
				error("A value of type '" + actualType.getCanonicalName()
						+ "' can not be assigned to the feature "
						+ feature.getSimpleName(),
						Mwe2Package.ASSIGNMENT__VALUE, INCOMPATIBLE_ASSIGNMENT);
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
			if (!assignabilityComputer.isAssignableFrom(left, right)) {
				error("A value of type '" + actualType.getCanonicalName()
						+ "' can not be assigned to a reference of type "
						+ property.getType().getCanonicalName(),
						Mwe2Package.DECLARED_PROPERTY__DEFAULT, INCOMPATIBLE_ASSIGNMENT);
			}
		}
	}

	public final static String UNUSED_LOCAL = "unused_local_variable";
	public final static String DUPLICATE_LOCAL = "duplicate_local_variable";

	@Check
	public void checkReferables(Module referable) {
		TreeIterator<EObject> iterator = referable.eResource().getAllContents();
		Set<Referrable> referenced = Sets.newHashSet();
		Multimap<String,Referrable> declared = Multimaps.newHashMultimap();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof Referrable) {
				String name = ((Referrable) next).getName();
				if (name != null) {
					declared.put(name,(Referrable) next);
				}
			} else if (next instanceof AbstractReference) {
				referenced.add(((AbstractReference) next).getReferable());
			}
		}
		HashSet<Referrable> set = Sets.newHashSet(declared.values());
		set.removeAll(referenced);
		for (Referrable referrable : set) {
			warning("The var '" + referrable.getName() + "' is never read locally.",
					referrable, Mwe2Package.REFERRABLE__NAME, UNUSED_LOCAL);
		}
		for (String name : declared.keySet()) {
			Collection<Referrable> collection = declared.get(name);
			if (collection.size()>1) {
				for (Referrable referrable : collection) {
					error("Duplicate var '" + referrable.getName() + "'.",
							referrable, Mwe2Package.REFERRABLE__NAME, DUPLICATE_LOCAL);
				}
			}
		}
	}
	
	public final static String MISSING_DEFAULT_CONSTRUCTOR = "missing_default_constructor";
	
	@Check
	public void checkInstantiable(Component component) {
		if (component.getModule() != null)
			return;
		JvmDeclaredType declaredType = (JvmDeclaredType) component.getActualType();
		for(JvmMember member: declaredType.getMembers()) {
			if (member instanceof JvmConstructor) {
				if (((JvmConstructor) member).getParameters().isEmpty() && member.getVisibility().equals(JvmVisibility.PUBLIC))
					return;
			}
		}
		error("'" + declaredType.getCanonicalName() + "' does not have a public default constructor.",
				component, Mwe2Package.REFERRABLE__TYPE, MISSING_DEFAULT_CONSTRUCTOR);
	}
	
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> ePackages = super.getEPackages();
		ePackages.add(Mwe2Package.eINSTANCE);
		return ePackages;
	}

}
