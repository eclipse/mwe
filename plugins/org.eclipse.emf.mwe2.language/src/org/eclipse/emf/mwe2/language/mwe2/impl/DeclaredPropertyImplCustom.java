package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.common.types.JvmType;

public class DeclaredPropertyImplCustom extends DeclaredPropertyImpl {

	@Override
	public String getCanonicalName() {
		Module module = getModule();
		if (module != null) {
			String moduleName = module.getCanonicalName();
			if (name != null)
				return moduleName + "." + name;
			return moduleName + ".UNNAMED";
		}
		return name;
	}
	
	@Override
	public String getSimpleName() {
		return name;
	}
	
	@Override
	public JvmType getActualType() {
		JvmType result = super.getActualType();
		if (result != null)
			return result;
		Value value = getDefault();
		if (value != null) {
			return value.getActualType();
		}
		return null;
	}
}
