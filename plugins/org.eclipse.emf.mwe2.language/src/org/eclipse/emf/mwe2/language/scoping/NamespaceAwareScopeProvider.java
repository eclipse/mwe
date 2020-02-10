/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import static com.google.common.collect.Lists.*;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflow;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

public class NamespaceAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> result = newArrayList();
		result.add(createImportedNamespaceResolver("java.lang.*", ignoreCase));
		result.add(createImportedNamespaceResolver(IWorkflow.class.getPackage().getName() + ".*", ignoreCase));
		return result;
	}

	@Override
	protected boolean isRelativeImport() {
		return false;
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
		List<ImportNormalizer> list = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
		if (context instanceof Module) {
			list = newArrayList(list);
			String name = ((Module) context).getCanonicalName();
			int dot = name.lastIndexOf('.');
			if (dot >= 0) {
				name = name.substring(0, dot) + ".*";
				list.add(createImportedNamespaceResolver(name, ignoreCase));
			}
		}
		return list;
	}

}
