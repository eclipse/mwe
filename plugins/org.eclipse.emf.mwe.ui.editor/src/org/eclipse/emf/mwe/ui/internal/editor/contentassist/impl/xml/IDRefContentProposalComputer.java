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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class IDRefContentProposalComputer extends AbstractSpecializedStringContentProposalComputer {

	private static final String[] TRIGGER_ATTRIBUTES = { "idRef" };

	public IDRefContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	@Override
	public String[] getTriggerAttributeNames() {
		return TRIGGER_ATTRIBUTES;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createProposalText</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.AbstractContentProposalComputer#createProposalText(java.lang.String,
	 *      int)
	 */
	@Override
	protected String createProposalText(final String name, final int offset) {
		return name;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> resultSet = new HashSet<String>();
		final AbstractWorkflowElement rootElement = editor.getRootElement();
		Collection<ReferenceInfo> referenceDefinitions = null;
		if (rootElement != null) {
			referenceDefinitions = rootElement.getReferenceDefinitions();
		}

		if (referenceDefinitions != null) {
			for (final ReferenceInfo info : referenceDefinitions) {
				final String referenceID = info.getReferenceValue();
				resultSet.add(referenceID);
			}
		}
		return resultSet;
	}
}
