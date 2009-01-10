/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class DefaultContentProposalComputer extends TagContentProposalComputer {

	public DefaultContentProposalComputer(IFile file,
			final WorkflowEditor editor, final IDocument document,
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
		if (useContractedElementCompletion(offset, document)) {
			text = name;
		} else {
			text = "\t<" + name + "></" + name + ">";
		}
		return text;
	}

}
