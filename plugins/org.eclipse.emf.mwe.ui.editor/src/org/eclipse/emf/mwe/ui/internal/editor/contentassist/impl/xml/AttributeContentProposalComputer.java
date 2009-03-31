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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.6 $
 */

public class AttributeContentProposalComputer extends
		AbstractContentProposalComputer {

	public AttributeContentProposalComputer(final IFile file,
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isApplicable</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#isApplicable(int)
	 */
	public boolean isApplicable(final int offset) {
		return isAttribute();
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		final TextInfo currentText = currentText(document, offset);

		if (currentText.isWhiteSpace()) {
			text = name + "= \"\" ";
		} else {
			text = name;
		}
		return text;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> result = new HashSet<String>();
		final Collection<IWorkflowAttribute> allAttributes =
				editor.getAttributes();

		if (allAttributes != null) {
			for (final IWorkflowAttribute attr : allAttributes) {
				final String name = createProposalText(attr.getName(), offset);
				result.add(name);
			}
		}
		return result;
	}
}
