package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;

public class ComponentImplCustom extends ComponentImpl {

	@Override
	public JvmType getActualType() {
		JvmType result = super.getActualType();
		if (result != null)
			return result;
		EObject container = eContainer();
		if (container instanceof Assignment) {
			JvmFeature containerFeature = ((Assignment) container).getFeature();
			if (containerFeature != null && containerFeature instanceof JvmOperation) {
				JvmFormalParameter parameter = ((JvmOperation) containerFeature).getParameters().get(0);
				return parameter.getParameterType().getType();
			}
		}
		if (result == null && module != null) {
			Module module = getModule();
			result = module.getRoot().getActualType();
		}
		return result;
	}
	
}
