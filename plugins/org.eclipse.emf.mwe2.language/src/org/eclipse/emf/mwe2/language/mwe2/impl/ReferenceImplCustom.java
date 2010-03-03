package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.xtext.common.types.JvmType;

public class ReferenceImplCustom extends ReferenceImpl {

	@Override
	public JvmType getActualType() {
		Referrable referrable = getReferable();
		if (referrable == null)
			return null;
		return referrable.getActualType();
	}
}
