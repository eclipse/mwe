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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.10 $
 */

public class TagContentProposalComputer extends
		AbstractContentProposalComputer {

	protected static final String[] DEFAULT_PROPOSALS =
			{ "workflow", "property", "component", "bean" };

	public TagContentProposalComputer(final IFile file,
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
		return isTag();
	}

	protected Set<String> createDefaultProposals(final int offset) {
		final Set<String> resultSet = new HashSet<String>();
		for (final String s : DEFAULT_PROPOSALS) {
			resultSet.add(s);
		}
		return resultSet;
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		if (useContractedElementCompletion(offset, document)) {
			text = name;
		} else {
			text = "<" + name + ">";
		}
		return text;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> resultSet = createDefaultProposals(offset);
		final Collection<WorkflowElement> allElements = editor.getElements();

		if (allElements != null) {
			for (final Object el : allElements) {
				final WorkflowElement element = (WorkflowElement) el;
				final String name = element.getName();
				resultSet.add(name);
			}
		}
		return resultSet;
	}
}
