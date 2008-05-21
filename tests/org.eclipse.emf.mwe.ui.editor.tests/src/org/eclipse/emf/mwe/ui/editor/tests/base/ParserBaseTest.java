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

package org.eclipse.emf.mwe.ui.editor.tests.base;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.jface.text.Document;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class ParserBaseTest extends TestCase {

	protected XMLParser parser;

	private WorkflowContentHandler contentHandler;

	@Override
	protected void setUp() throws Exception {
		parser = new XMLParser();
		contentHandler = new WorkflowContentHandler();
		parser.setContentHandler(contentHandler);
	}

	// Helper methods

	protected void setUpDocument(final String content) {
		final Document document = new Document(content);
		contentHandler.setDocument(document);
	}
}
