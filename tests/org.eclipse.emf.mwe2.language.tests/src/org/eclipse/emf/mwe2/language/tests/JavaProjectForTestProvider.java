/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.ui.junit.util.JavaProjectSetupUtil;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class JavaProjectForTestProvider {

	private static IJavaProject javaProject;
	
	public IJavaProject getJavaProject(ResourceSet resourceSet) {
		if (javaProject == null)
			throw new IllegalStateException("javaProject is null");
		return javaProject;
	}

	public static void setUp() throws Exception {
		javaProject = JavaProjectSetupUtil.createJavaProject("myProject");
	}

	public static void tearDown() throws Exception {
		if (javaProject != null) {
			JavaProjectSetupUtil.deleteJavaProject(javaProject);
			javaProject = null;
		}
	}

}
