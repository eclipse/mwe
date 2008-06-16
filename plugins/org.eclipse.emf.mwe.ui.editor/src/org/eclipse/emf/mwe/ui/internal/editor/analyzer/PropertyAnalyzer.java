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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.6 $
 */
public class PropertyAnalyzer extends DefaultAnalyzer {

	protected static final String PROPERTY_REGEX = "^(.*?)\\s*=\\s*.*$";

	private static final String INVALID_PROPERTY_MSG = "Property not valid";

	public PropertyAnalyzer(final IFile file, final IDocument document,
			final PropertyStore propertyStore) {
		super(file, document, propertyStore);
	}

	/**
	 * This method overrides the implementation of <code>checkValidity</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementImpl)
	 */
	@Override
	public void checkValidity(final IWorkflowElement element) {
		if (element.getName().equals(IWorkflowElement.PROPERTY_TAG)
				&& !element.isProperty()) {
			createMarker(element, INVALID_PROPERTY_MSG);
		}
		if (element.isSimpleProperty()) {
			propertyStore.add(element
					.getAttributeValue(IWorkflowElement.NAME_ATTRIBUTE));
		} else if (element.isFileProperty()) {
			parseFileProperties(element);
		}
	}

	private void parseFileProperties(final IWorkflowElement element) {
		final IWorkflowAttribute attribute =
				element.getAttribute(IWorkflowElement.FILE_ATTRIBUTE);
		final String content =
				ReflectionManager.getFileContent(file, document, attribute);
		if (content == null)
			return;

		final Pattern p = Pattern.compile(PROPERTY_REGEX, Pattern.MULTILINE);
		final Matcher m = p.matcher(content);
		while (m.find()) {
			final String propertyName = m.group(1);
			propertyStore.add(propertyName);
		}
	}
}
