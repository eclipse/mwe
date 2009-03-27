/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.parser;

import org.eclipse.emf.mwe.ui.internal.editor.base.ParserTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;

public class PropertyTest extends ParserTestBase {

	private static final String WORKFLOW1 = "<workflow>\n" + "</workflow>";

	private static final String WORKFLOW2 = "<workflow>\n" + "    <property name=\"foo\" value=\"bar\"/>\n"
			+ "</workflow>";

	private static final String WORKFLOW3 = "<workflow>\n" + "    <property file=\"prop1.properties\"/>\n"
			+ "</workflow>";

	public static final String RESOURCE_PROP1 = "a=b";

	public void testEmptyWorkflow() {
		final AbstractWorkflowElement root = parse(WORKFLOW1);
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertTrue(root.isWorkflowFile());
		assertTrue(workflow.isWorkflow());
	}

	public void testFileProperty() {
		final AbstractWorkflowElement root = parse(WORKFLOW3);
		assertEquals(1, root.getChildrenCount());
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertEquals(1, workflow.getChildrenCount());
		final AbstractWorkflowElement property = workflow.getChild(0);
		assertEquals(1, property.getAttributeCount());
		assertEquals("prop1.properties", property.getAttributeValue("file"));
	}

	public void testSimpleProperty() {
		final AbstractWorkflowElement root = parse(WORKFLOW2);
		assertEquals(1, root.getChildrenCount());
		final AbstractWorkflowElement workflow = root.getChild(0);
		assertEquals(1, workflow.getChildrenCount());
		final AbstractWorkflowElement property = workflow.getChild(0);
		assertEquals(2, property.getAttributeCount());
		assertEquals("foo", property.getAttributeValue("name"));
		assertEquals("bar", property.getAttributeValue("value"));
	}
}
