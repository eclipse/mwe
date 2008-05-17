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

import org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */

public class IDRefContentProposalComputer extends
		AbstractSpecializedStringContentProposalComputer {

	private static final String[] TRIGGER_ATTRIBUTES = { "idRef" };

	public IDRefContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	@Override
	public String[] getTriggerAttributeNames() {
		return TRIGGER_ATTRIBUTES;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createProposalText</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.AbstractContentProposalComputer#createProposalText(java.lang.String,
	 *      int)
	 */
	@Override
	protected String createProposalText(final String name, final int offset) {
		return name;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> resultSet = new HashSet<String>();
		final Collection<ReferenceInfo> references = editor.getReferences();

		if (references != null) {
			for (final ReferenceInfo info : references) {
				final String referenceID = info.getReferenceValue();
				final String proposalText =
						createProposalText(referenceID, offset);
				resultSet.add(proposalText);
			}
		}
		return resultSet;
	}

}
