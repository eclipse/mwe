/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class MweLocationInFileProvider extends DefaultLocationInFileProvider {
	
	@Override
	protected boolean useKeyword(Keyword keyword, EObject context) {
		String value = keyword.getValue();
		return value.matches("\\w+");
	}
	
	@Override
	protected EStructuralFeature getIdentifierFeature(EObject obj) {
		if (obj instanceof Module)
			return Mwe2Package.Literals.MODULE__CANONICAL_NAME;
		if (obj instanceof Import)
			return Mwe2Package.Literals.IMPORT__IMPORTED_NAMESPACE;
		if (obj instanceof Component) {
			if (((Component) obj).getName() != null)
				return Mwe2Package.Literals.REFERRABLE__NAME;
			if (((Component) obj).getType() != null)
				return Mwe2Package.Literals.REFERRABLE__TYPE;
			if (((Component) obj).getModule() != null)
				return Mwe2Package.Literals.COMPONENT__MODULE;
		}
		if (obj instanceof Assignment) {
			return Mwe2Package.Literals.ASSIGNMENT__FEATURE;
		}
		return super.getIdentifierFeature(obj);
	}
}
