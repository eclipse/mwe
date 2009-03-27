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

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.jface.text.IDocument;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.LocatorImpl;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.19 $
 */

public final class DocumentParser {

	public static final String TAG_POSITIONS = "__tag_positions";

	private static AbstractWorkflowElement root;

	/**
	 * Don't allow instantiation.
	 */
	private DocumentParser() {
		throw new UnsupportedOperationException();
	}

	public static AbstractWorkflowElement getRootElement() {
		return root;
	}

	public static AbstractWorkflowElement parse(final IDocument document, final WorkflowContentHandler handler) {
		return parse(document, handler, (IProject) null);
	}

	public static AbstractWorkflowElement parse(final IDocument document, final WorkflowContentHandler handler,
			final IProject project) {
		if (document == null)
			return null;

		final WorkflowContentHandler contentHandler = (handler != null) ? handler : new WorkflowContentHandler();
		contentHandler.setProject(project);
		contentHandler.setDocument(document);
		contentHandler.setPositionCategory(TAG_POSITIONS);
		contentHandler.setDocumentLocator(new LocatorImpl());
		final String text = document.get();
		final XMLParser xmlParser = new XMLParser();
		xmlParser.setContentHandler(contentHandler);
		try {
			xmlParser.parse(text);
		}
		catch (final SAXException e) {
			Log.logError("", e);
		}
		final AbstractWorkflowElement root = xmlParser.getRootElement();
		return root;
	}

	public static AbstractWorkflowElement parse(final IDocument document, final WorkflowContentHandler handler,
			final WorkflowEditor editor) {
		if (document == null)
			return null;

		final WorkflowContentHandler contentHandler = (handler != null) ? handler : new WorkflowContentHandler();
		contentHandler.setDocument(document);
		contentHandler.setEditor(editor);
		contentHandler.setPositionCategory(TAG_POSITIONS);
		contentHandler.setDocumentLocator(new LocatorImpl());
		final String text = document.get();
		final XMLParser xmlParser = new XMLParser();
		xmlParser.setContentHandler(contentHandler);
		try {
			xmlParser.parse(text);
		}
		catch (final SAXException e) {
			if (editor != null) {
				MarkerManager.createMarkerFromParserException(editor.getInputFile(), document, e);
			}
			else {
				Log.logError(e);
			}
		}
		root = xmlParser.getRootElement();
		return getRootElement();
	}
}
