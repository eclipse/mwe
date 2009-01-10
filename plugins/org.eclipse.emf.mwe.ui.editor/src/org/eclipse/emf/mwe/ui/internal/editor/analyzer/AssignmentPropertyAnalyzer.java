/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.9 $
 */
public class AssignmentPropertyAnalyzer extends DefaultAnalyzer {

	public AssignmentPropertyAnalyzer(final IFile file,
			final IDocument document, final PropertyStore propertyStore) {
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
		for (final IWorkflowAttribute attr : element.getAttributes()) {
			if (!isPropertyReference(attr))
				continue;

			checkPropertyReference(attr);
		}
	}
}
