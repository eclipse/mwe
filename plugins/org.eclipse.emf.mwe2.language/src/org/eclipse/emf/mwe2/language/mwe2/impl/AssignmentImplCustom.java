package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.util.Strings;

public class AssignmentImplCustom extends AssignmentImpl {
	
	@Override
	public String getFeatureName() {
		JvmFeature jvmFeature = getFeature();
		String name = jvmFeature.getSimpleName();
		if (name.startsWith("add") || name.startsWith("set")) {
			return Strings.toFirstLower(name.substring(3));
		}
		return name;
	}
}
