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

package org.eclipse.emf.mwe.ui.internal.editor.tests.references;

import org.eclipse.emf.mwe.ui.internal.editor.base.ReferencesTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;

public class SimpleReferencesTest extends ReferencesTestBase {

	public static final String WORKFLOW1 = "<workflow>\n"
			+ "    <fragment file=\"/res/import1.mwe\" inheritAll=\"true\"/>\n" + "</workflow>\n";

	public static final String WORKFLOW2 = "<workflow>\n"
			+ "    <fragment file=\"/res/import2.mwe\" inheritAll=\"true\"/>\n" + "</workflow>\n";

	public static final String RESOURCE_IMPORT1 = "<workflow>\n" + "    <property name=\"a1\" value=\"\"/>\n"
			+ "    <property name=\"a2\" value=\"\"/>\n" + "</workflow>\n";

	public static final String RESOURCE_IMPORT2 = "<workflow>\n" + "    <property name=\"b1\" value=\"\"/>\n"
			+ "    <property name=\"b2\" value=\"\"/>\n" + "    <property file=\"/res/prop1.properties\"/>\n"
			+ "</workflow>\n";

	public static final String RESOURCE_PROP1 = "fa1=foo\n" + "fa2 = bar";

	public void testParseReferencedWorkflow1() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		assertNotNull(root);
		final AbstractWorkflowElement fragment = root.getChild(0).getChild(0);
		assertNotNull(fragment);
		assertTrue(fragment.isFragment());
		assertFalse(fragment.isEmpty());
		assertEquals(2, fragment.getPropertyCount());
		assertTrue(fragment.hasSimpleValueProperty("a1"));
		assertTrue(fragment.hasSimpleValueProperty("a2"));
	}

	public void testParseReferencedWorkflow2() {
		final AbstractWorkflowElement root = parse(WORKFLOW2);
		assertNotNull(root);
		final AbstractWorkflowElement fragment = root.getChild(0).getChild(0);
		assertNotNull(fragment);
		assertTrue(fragment.isFragment());
		assertFalse(fragment.isEmpty());
		assertEquals(4, fragment.getPropertyCount());
		assertTrue(fragment.hasSimpleValueProperty("b1"));
		assertTrue(fragment.hasSimpleValueProperty("b2"));
		assertTrue(fragment.hasSimpleValueProperty("fa1"));
		assertTrue(fragment.hasSimpleValueProperty("fa2"));
	}
}
