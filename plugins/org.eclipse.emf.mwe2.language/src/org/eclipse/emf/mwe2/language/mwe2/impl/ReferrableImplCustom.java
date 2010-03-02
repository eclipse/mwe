package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;

public class ReferrableImplCustom extends ReferrableImpl {

	@Override
	public JvmType getActualType() {
		JvmType jvmType = getType();
		if (jvmType != null)
			return jvmType;
		EObject container = eContainer();
		if (container instanceof Assignment) {
			JvmFeature containerFeature = ((Assignment) container).getFeature();
			if (containerFeature != null && containerFeature instanceof JvmOperation) {
				JvmFormalParameter parameter = ((JvmOperation) containerFeature).getParameters().get(0);
				return parameter.getParameterType().getType();
			}
		}
		return null;
	}
	
}
