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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.11 $
 */

public class TagContentProposalComputer extends AbstractContentProposalComputer {

	protected static final String[] DEFAULT_PROPOSALS = { "workflow", "compose", "component", "fragment" };

	public TagContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
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
		return isTag();
	}

	protected Set<String> createDefaultProposals(@SuppressWarnings("unused") final int offset) {
		final Set<String> resultSet = new HashSet<String>();
		for (final String s : DEFAULT_PROPOSALS) {
			resultSet.add(s);
		}
		return resultSet;
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		final String text = "<" + name + ">";
		return text;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		Set<String> resultSet;
		final AbstractWorkflowElement element = WorkflowElementSearcher.searchCompleteParentElement(getRoot(),
				document, offset);
		if (element != null) {
			resultSet = TypeUtils.getSetters(file.getProject(), element, false, true, true);
		}
		else {
			resultSet = createDefaultProposals(offset);
		}

		return resultSet;
	}
}
