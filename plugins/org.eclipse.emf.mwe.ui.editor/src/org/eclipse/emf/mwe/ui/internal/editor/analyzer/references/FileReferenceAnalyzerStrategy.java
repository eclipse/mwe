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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer.references;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jface.text.IDocument;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.LocatorImpl;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.11 $
 */
public class FileReferenceAnalyzerStrategy extends
		AbstractReferenceAnalyzerStrategy {

	protected static final String PROPERTIES_EXTENSION = ".properties";

	public FileReferenceAnalyzerStrategy(final IFile file,
			final IDocument document, final ReferenceInfoStore store) {
		super(file, document, store);
	}

	/**
	 * This method overrides the implementation of <code>clearCache</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#clearCache()
	 */
	@Override
	public void clearCache() {
		super.clearCache();
	}

	/**
	 * This method overrides the implementation of <code>isApplicable</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.IReferenceAnalyzerStrategy#isApplicable(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	public boolean isApplicable(final IWorkflowElement element) {
		return element != null
				&& element.hasAttribute(IWorkflowElement.FILE_ATTRIBUTE);
	}

	/**
	 * This method overrides the implementation of <code>doAnalyze</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.AbstractReferenceAnalyzerStrategy#doAnalyze(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	protected void doAnalyze(final IWorkflowElement element) {
		final IWorkflowAttribute attribute =
				element.getAttribute(IWorkflowElement.FILE_ATTRIBUTE);
		final ClassLoader loader = TypeUtils.getResourceLoader(file);
		final String fileName = attribute.getValue();
		if (store.containsFileName(fileName))
			return;

		store.addFileName(fileName);

		if (!fileName.endsWith(PROPERTIES_EXTENSION)) {
			final String referencedContent =
					TypeUtils.getFileContent(file, document, attribute);
			if (referencedContent == null) {
				MarkerManager.createMarker(file, document, attribute, "File '"
						+ attribute.getValue() + "' could not be found", true,
						false);
				return;
			}

			final XMLParser parser = new XMLParser();
			final WorkflowContentHandler contentHandler =
					new WorkflowContentHandler();
			contentHandler.setDocument(document);
			contentHandler.setPositionCategory("dummy");
			contentHandler.setDocumentLocator(new LocatorImpl());
			try {
				parser.parse(referencedContent);
				final IWorkflowElement root = parser.getRootElement();
				final ReferenceAnalyzer analyzer =
						new ReferenceAnalyzer(file, document, store);
				analyzer.analyzeElement(root);
			} catch (final SAXException e) {
				Log.logError("Parse error", e);
			}
		}
	}
}
