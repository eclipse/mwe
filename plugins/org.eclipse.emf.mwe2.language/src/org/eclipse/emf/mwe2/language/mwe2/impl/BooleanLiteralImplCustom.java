package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.xtext.common.types.JvmType;

public class BooleanLiteralImplCustom extends BooleanLiteralImpl {

	public JvmType getActualType() {
		return findJvmType(getURIForPrimitive("boolean"));
	}
}
