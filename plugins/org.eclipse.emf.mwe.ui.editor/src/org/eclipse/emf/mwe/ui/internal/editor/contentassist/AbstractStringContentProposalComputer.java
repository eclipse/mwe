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

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public abstract class AbstractStringContentProposalComputer extends
		AbstractContentProposalComputer {

	public AbstractStringContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

}
