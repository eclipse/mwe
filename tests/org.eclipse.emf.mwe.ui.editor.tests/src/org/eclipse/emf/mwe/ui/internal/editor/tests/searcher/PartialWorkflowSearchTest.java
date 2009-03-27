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

package org.eclipse.emf.mwe.ui.internal.editor.tests.searcher;

import org.eclipse.emf.mwe.ui.internal.editor.base.ParserTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jface.text.IDocument;

public class PartialWorkflowSearchTest extends ParserTestBase {

	private static final String WORKFLOW1 = "<workflow>\n" + "    <f";

	private static final String WORKFLOW2 = "<workflow>\n" + "    <foo>\n" + "        <g";

	private static final String WORKFLOW3 = "<workflow>\n" + "    <foo>\n" + "    </foo>\n" + "    <g";

	private static final String WORKFLOW4 = "<workflow>\n" + "    <foo/>\n" + "    <g";

	public void testPartialWorkflowSearch1() {
		search(WORKFLOW1, 12, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch2() {
		search(WORKFLOW1, 100, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch3() {
		search(WORKFLOW2, 12, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch4() {
		search(WORKFLOW2, 20, "foo");
	}

	public void testPartialWorkflowSearch5() {
		search(WORKFLOW2, 100, "foo");
	}

	public void testPartialWorkflowSearch6() {
		search(WORKFLOW3, 12, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch7() {
		search(WORKFLOW3, 17, "foo");
	}

	public void testPartialWorkflowSearch8() {
		search(WORKFLOW3, 100, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch9() {
		search(WORKFLOW4, 12, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	public void testPartialWorkflowSearch10() {
		search(WORKFLOW4, 17, "foo");
	}

	public void testPartialWorkflowSearch11() {
		search(WORKFLOW4, 100, IWorkflowElementTypeInfo.WORKFLOW_TAG);
	}

	private void search(final String workflow, final int offset, final String tag) {
		final IDocument document = createDocument(workflow);
		final AbstractWorkflowElement root = parse(document);
		assertNotNull(root);
		final AbstractWorkflowElement foundElement = WorkflowElementSearcher.searchCompleteParentElement(root,
				document, offset);
		assertNotNull(foundElement);
		assertEquals(tag, foundElement.getName());
	}
}
