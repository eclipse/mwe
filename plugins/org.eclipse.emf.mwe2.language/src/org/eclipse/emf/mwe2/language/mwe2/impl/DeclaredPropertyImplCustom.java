package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.mwe2.language.mwe2.Module;

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
}
