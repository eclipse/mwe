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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class DefaultContentProposalComputer extends TagContentProposalComputer {

	private static final String WORKFLOW_TAG_NAME = "workflow";

	public DefaultContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	@Override
	public boolean isApplicable(final int offset) {
		return isOutsideTag();
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		text = "<" + name + ">";
		if (!WORKFLOW_TAG_NAME.equals(name)) {
			text = "\t" + text;
		}
		return text;
	}

}
