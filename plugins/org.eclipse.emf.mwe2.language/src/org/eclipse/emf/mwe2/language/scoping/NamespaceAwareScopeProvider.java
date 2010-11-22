/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import static com.google.common.collect.Lists.*;

import java.util.List;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflow;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

public class NamespaceAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Override
	protected List<ImportNormalizer> getImplicitImports() {
		List<ImportNormalizer> result = newArrayList();
		result.add(createImportedNamespaceResolver("java.lang.*"));
		result.add(createImportedNamespaceResolver(IWorkflow.class.getPackage().getName() + ".*"));
		return result;
	}
	
}
