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

package org.eclipse.emf.mwe.ui.internal.editor.tests.searcher;

import org.eclipse.emf.mwe.ui.internal.editor.base.ParserTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.13 $
 */

public class WorkflowElementSearcherTest extends ParserTestBase {

	private static final String WORKFLOW1 = "<workflow>\n" + "	\n" + "	<property name=\"platformURI\" value=\"..\"/>\n"
			+ "	\n" + "	<component class=\"org.eclipse.xtext.parser.ParserComponent\">\n"
			+ "		<modelFile value=\"${modelFile}\"/>\n" + "		<outputSlot value=\"${outputSlot}\"/>\n"
			+ "	</component>\n" + "	\n" + "	<component class=\"oaw.xtend.XtendComponent\">\n"
			+ "	   <metaModel id=\"mm\" class=\"org.eclipse.m2t.type.emf.EmfRegistryMetaModel\"/>\n"
			+ "		<invoke value=\"org::openarchitectureware::xtext::XtextExtensions::fixTypes(${outputSlot})\"/>\n"
			+ "	</component>\n" + "	\n" + "	<component class=\"oaw.xtext.CheckComponent2\">\n"
			+ "	 	<metaModel idRef=\"mm\"/>\n"
			+ "       <expression value=\"${outputSlot}.eAllContents.union({${outputSlot}})\"/>\n"
			+ "	   <checkFile value=\"org::openarchitectureware::xtext::Checks\"/>\n" + "	</component>\n" + "	\n"
			+ "	<component class=\"oaw.xtend.XtendComponent\">\n" + "	 	<metaModel idRef=\"mm\"/>\n"
			+ "		<invoke value=\"org::openarchitectureware::xtext::XtextExtensions::complete(${outputSlot})\"/>\n"
			+ "	</component>\n" + "	\n" + "</workflow>\n";

	private static final String WORKFLOW2 = "<workflow>\n" + "	\n" + "	<property name=\"platformURI\" value=\"..\"/>\n"
			+ "	\n" + "	<component class=\"org.eclipse.xtext.parser.ParserComponent\">\n"
			+ "		<modelFile value=\"${modelFile}\"/>\n" + "		<outputSlot value=\"${outputSlot}\"/>\n";

	private static final String WORKFLOW3 = "<workflow>\n" + "	<property file=\'generate.properties\'/>\n"
			+ "	<component file=\'org/openarchitectureware/xtext/Generator.oaw\' inheritAll=\'true\'/>\n"
			+ "	<component class=\'org.eclipse.xtend.XtendComponent\'>\n" + "	<\n" + "</workflow>";

	public void testFindContainerCompleteWorkflow() {
		final IDocument document = createDocument(WORKFLOW1);
		final AbstractWorkflowElement root = parse(document);
		final int offset = 160;
		final AbstractWorkflowElement foundElement = WorkflowElementSearcher.searchContainerElement(root, document,
				offset);
		assertNotNull(foundElement);
		assertEquals("component", foundElement.getName());
		assertTrue(foundElement.hasAttribute("class"));
		assertEquals("org.eclipse.xtext.parser.ParserComponent", foundElement.getAttributeValue("class"));
	}

	public void testFindContainerPartialWorkflow1() {
		final IDocument document = createDocument(WORKFLOW2);
		final AbstractWorkflowElement root = parse(document);
		final int offset = 160;
		final AbstractWorkflowElement foundElement = WorkflowElementSearcher.searchContainerElement(root, document,
				offset);
		assertNotNull(foundElement);
		assertEquals("component", foundElement.getName());
		assertTrue(foundElement.hasAttribute("class"));
		assertEquals("org.eclipse.xtext.parser.ParserComponent", foundElement.getAttributeValue("class"));
	}

	public void testFindContainerPartialWorkflow2() {
		final IDocument document = createDocument(WORKFLOW3);
		final AbstractWorkflowElement root = parse(document);
		int offset = document.getLength() - 1;
		offset -= 12;
		final AbstractWorkflowElement foundElement = WorkflowElementSearcher.searchContainerElement(root, document,
				offset);
		assertNotNull(foundElement);
		assertEquals("component", foundElement.getName());
		assertTrue(foundElement.hasAttribute("class"));
		assertEquals("org.eclipse.xtend.XtendComponent", foundElement.getAttributeValue("class"));
	}

	private IDocument createDocument(final String text) {
		return new Document(text);
	}

	private AbstractWorkflowElement parse(final IDocument document) {
		return DocumentParser.parse(document, null, project);
	}

}
