package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.xtext.common.types.JvmType;

public class StringLiteralImplCustom extends StringLiteralImpl {

	public JvmType getActualType() {
		return findJvmType(getURIForFqn(String.class.getName()));
	}
}
