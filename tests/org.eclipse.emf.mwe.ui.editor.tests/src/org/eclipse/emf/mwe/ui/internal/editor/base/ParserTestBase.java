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

package org.eclipse.emf.mwe.ui.internal.editor.base;

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.impl.xml.XMLWorkflowSyntaxFactoryImpl;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */
public class ParserTestBase extends PluginTestBase {

	protected XMLParser parser;

	private WorkflowContentHandler contentHandler;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		WorkflowSyntaxFactory.installFactory(new XMLWorkflowSyntaxFactoryImpl());
		parser = new XMLParser();
		contentHandler = new WorkflowContentHandler();
		contentHandler.setProject(project);
		parser.setContentHandler(contentHandler);
	}

	// Helper methods

	protected void setUpDocument(final String content) {
		final Document document = new Document(content);
		contentHandler.setDocument(document);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.base.PluginTestBase#getProjectName()
	 */
	@Override
	protected String getProjectName() {
		return "org.eclipse.emf.mwe.ui.editor";
	}

	protected IDocument createDocument(final String text) {
		return new Document(text);
	}

	protected AbstractWorkflowElement parse(final IDocument document) {
		return DocumentParser.parse(document, null, project);
	}

}
