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

package org.eclipse.emf.mwe.ui.internal.editor.base;

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.impl.xml.XMLWorkflowSyntaxFactoryImpl;
import org.eclipse.emf.mwe.ui.internal.editor.parser.ParserProblemException;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */
public class ParserTestBase extends PluginTestBase {

	private WorkflowContentHandler contentHandler;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		WorkflowSyntaxFactory.installFactory(new XMLWorkflowSyntaxFactoryImpl());
		contentHandler = new WorkflowContentHandler();
		contentHandler.setProject(project);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.base.PluginTestBase#getProjectName()
	 */
	@Override
	protected String getProjectName() {
		return "org.eclipse.emf.mwe.ui.editor";
	}

	// Helper methods

	protected AbstractWorkflowElement parse(final String workflow) {
		final IDocument document = new Document(workflow);
		return parse(document);
	}

	protected AbstractWorkflowElement parse(final IDocument document) {
		contentHandler.setDocument(document);
		try {
			return DocumentParser.parse(document, contentHandler, project);
		}
		catch (final ParserProblemException e) {
			return DocumentParser.getRootElement();
		}
	}

}
