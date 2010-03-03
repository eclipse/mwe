package org.eclipse.emf.mwe2.language.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.scoping.FactorySupport;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.IAssignabilityComputer;
import org.eclipse.xtext.validation.Check;

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
		if (feature instanceof JvmOperation) {
			JvmOperation op = (JvmOperation) feature;
			JvmTypeReference left = op.getParameters().get(0).getParameterType();
			JvmParameterizedTypeReference reference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
			JvmType actualType = assignment.getValue().getActualType();
			JvmType factoryType = factorySupport.findFactoriesCreationType(actualType);
			if (factoryType!=null) {
				reference.setType(factoryType);
			} else {
				reference.setType(actualType);
			}
			if (!assignabilityComputer.isAssignableFrom(left, reference))
				error("A value of type '"+actualType+"' can not be assigned to the feature "+op.getFullyQualifiedName(), Mwe2Package.ASSIGNMENT__VALUE,INCOMPATIBLE_ASSIGNMENT);
		} else {
			throw new UnsupportedOperationException("Can not handle features of type "+feature.getClass().getName());
		}
	}
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> ePackages = super.getEPackages();
		ePackages.add(Mwe2Package.eINSTANCE);
		return ePackages;
	}

}
