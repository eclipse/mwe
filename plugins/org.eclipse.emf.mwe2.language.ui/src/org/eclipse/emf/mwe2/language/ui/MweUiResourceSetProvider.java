/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui;

import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.jdt.core.IJavaProject;

public class MweUiResourceSetProvider extends MweResourceSetProvider {

	@Override
	protected boolean isExpectedContext(Object classpathURIContext) {
		return classpathURIContext instanceof IJavaProject;
	}
}
