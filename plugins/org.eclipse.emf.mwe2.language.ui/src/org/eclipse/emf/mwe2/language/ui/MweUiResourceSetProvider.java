/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
