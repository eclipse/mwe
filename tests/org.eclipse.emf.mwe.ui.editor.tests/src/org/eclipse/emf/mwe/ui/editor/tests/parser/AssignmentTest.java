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

package org.eclipse.emf.mwe.ui.editor.tests.parser;

import org.eclipse.emf.mwe.ui.editor.tests.base.ParserBaseTest;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.xml.sax.SAXException;

public class AssignmentTest extends ParserBaseTest {

	private static String WORKFLOW1 =
			"<?xml  version=\"1.0\" encoding=\"ISO-8859-1\"?>\n"
					+ "<workflow>\n"
					+ "    \n"
					+ "    <property name=\"platformURI\" value=\"..\"/>\n"
					+ "    \n"
					+ "    <component class=\"org.openarchitectureware.xtext.parser.ParserComponent\">\n"
					+ "        <modelFile value=\"${modelFile}\"/>\n"
					+ "        <outputSlot value=\"${outputSlot}\"/>\n"
					+ "    </component>\n"
					+ "    \n"
					+ "    <component class=\"oaw.xtend.XtendComponent\">\n"
					+ "       <metaModel id=\"mm\" class=\"org.eclipse.m2t.type.emf.EmfRegistryMetaModel\"/>\n"
					+ "        <invoke value=\"org::openarchitectureware::xtext::XtextExtensions::fixTypes(${outputSlot})\"/>\n"
					+ "    </component>\n"
					+ "    \n"
					+ "    <component class=\"oaw.xtext.CheckComponent2\">\n"
					+ "        <metaModel idRef=\"mm\"/>\n"
					+ "       <expression value=\"${outputSlot}.eAllContents.union({${outputSlot}})\"/>\n"
					+ "       <checkFile value=\"org::openarchitectureware::xtext::Checks\"/>\n"
					+ "    </component>\n"
					+ "    \n"
					+ "    <component class=\"oaw.xtend.XtendComponent\">\n"
					+ "        <metaModel idRef=\"mm\"/>\n"
					+ "        <invoke value=\"org::openarchitectureware::xtext::XtextExtensions::complete(${outputSlot})\"/>\n"
					+ "    </component>\n" + "    \n" + "</workflow>\n";

	public void testCompleteWorkflow() throws SAXException {
		setUpDocument(WORKFLOW1);
		parser.parse(WORKFLOW1);
		final WorkflowElement root = parser.getRootElement();
		assertEquals(1, root.getChildrenCount());
		final WorkflowElement workflow = root.getChild(0);
		assertEquals(5, workflow.getChildrenCount());
		int properties = 0;
		int components = 0;
		for (int i = 0; i < workflow.getChildrenCount(); i++) {
			final WorkflowElement element = workflow.getChild(i);
			if (element.isProperty())
				properties++;
			else if (element.isComponent())
				components++;
		}
		assertEquals(1, properties);
		assertEquals(4, components);
		assertTrue(workflow.getChild(0).isLeaf());
		assertEquals(2, workflow.getChild(0).getAttributeCount());
		assertEquals(2, workflow.getChild(1).getChildrenCount());
		assertEquals(1, workflow.getChild(1).getAttributeCount());
		assertEquals(2, workflow.getChild(2).getChildrenCount());
		assertEquals(1, workflow.getChild(2).getAttributeCount());
		assertEquals(3, workflow.getChild(3).getChildrenCount());
		assertEquals(1, workflow.getChild(3).getAttributeCount());
		assertEquals(2, workflow.getChild(4).getChildrenCount());
		assertEquals(1, workflow.getChild(4).getAttributeCount());
	}
}
