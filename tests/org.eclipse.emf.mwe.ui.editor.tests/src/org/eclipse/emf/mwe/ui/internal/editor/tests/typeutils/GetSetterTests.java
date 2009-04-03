/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils;

import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.base.TypeTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;

public class GetSetterTests extends TypeTestBase {

	private static final String WORKFLOW1 = "<workflow>\n" + "<property name='foo' value='bar'/>\n" + "</workflow>";

	private static final String WORKFLOW2 = "<workflow>\n" + "<property file='res/prop1.properties'/>\n"
			+ "</workflow>";

	private static final String WORKFLOW3 = "<workflow>\n"
			+ "<fragment file='org/eclipse/xtext/generator/StandardRuntimeFragments.mwe' inheritAll='true'/>\n"
			+ "</workflow>";

	public static final String RESOURCE_PROP1 = "foo=bar";

	public void testSimpleDirectSetters1() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final Set<String> actual = TypeUtils.getSetters(project, workflow, false, false, false,
				new NullProgressMonitor());
		final String[] expected = new String[] { "abstract" };
		assertTrue(equalElements(expected, actual));
	}

	public void testSimpleDirectSetters2() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final Set<String> actual = TypeUtils.getSetters(project, workflow, false, true, false,
				new NullProgressMonitor());
		final String[] expected = new String[] { "abstract" };
		assertTrue(equalElements(expected, actual));
	}

	public void testSimpleDirectSetters3() {
		final AbstractWorkflowElement root = parse(WORKFLOW2);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final Set<String> actual = TypeUtils.getSetters(project, workflow, false, true, false,
				new NullProgressMonitor());
		final String[] expected = new String[] { "abstract" };
		assertTrue(equalElements(expected, actual));
	}

	public void testSimpleInheritedSetters1() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final Set<String> actual = TypeUtils
				.getSetters(project, workflow, false, true, true, new NullProgressMonitor());
		final String[] expected = new String[] { "abstract", "location", "ownLocation", "bean", "feature", "if" };
		assertTrue(isSubset(expected, actual));
	}

	public void testSimpleInheritedSetters2() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final Set<String> actual = TypeUtils.getSetters(project, workflow, true, true, true, new NullProgressMonitor());
		final String[] expected = new String[] { "abstract", "resource", "id" };
		assertTrue(equalElements(expected, actual));
	}

	public void testInheritedSettersAndProperties() {
		final AbstractWorkflowElement root = parse(WORKFLOW3);
		assertNotNull(root);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertNotNull(workflow);
		final AbstractWorkflowElement fragment = workflow.getChild(0);
		assertNotNull(fragment);
		assertTrue(fragment.isFragment());
		final Set<String> actual = TypeUtils
				.getSetters(project, fragment, false, true, true, new NullProgressMonitor());
		final String[] expected = new String[] { "file.extensions" };
		assertTrue(isSubset(expected, actual));
	}
}
