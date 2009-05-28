/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils;

import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.base.TypeTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class ClassHierarchyTests extends TypeTestBase {

	public void testGetAllClasses() {
		final Set<String> allClasses = TypeUtils.getAllClasses(project, new NullProgressMonitor());
		assertNotNull(allClasses);

		assertTrue(allClasses.size() >= 6000);
		assertTrue(allClasses.contains("org.eclipse.xtend.XtendComponent"));
		assertTrue(allClasses.contains("java.lang.String"));
		assertTrue(checkForSubstring(allClasses, "org.eclipse.emf.mwe.utils"));
	}

	public void testGetSubClasses() {
		final IType baseType = getType("org.eclipse.emf.mwe.core.WorkflowComponent");
		assertNotNull(baseType);
		final Set<IType> subClasses = TypeUtils.getSubTypes(project, baseType, new NullProgressMonitor());
		assertNotNull(subClasses);
		assertTrue(subClasses.size() >= 10);
		assertTrue(TypeUtils.createClassNameSet(subClasses).contains("org.eclipse.xtend.XtendComponent"));
	}
}
