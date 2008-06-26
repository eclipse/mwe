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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class TagContentProposalComputerRegistry extends
ContentProposalComputerRegistry {

	public TagContentProposalComputerRegistry(final IFile file,
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
		computers.add(new ClassContentProposalComputer(file, editor, document,
				tagScanner));
		computers.add(new IDRefContentProposalComputer(file, editor, document,
				tagScanner));
		computers.add(new PropertyContentProposalComputer(file, editor,
				document, tagScanner));
		computers.add(new AttributeContentProposalComputer(file, editor,
				document, tagScanner));
		computers.add(new AssignmentPropertyContentProposalComputer(file,
				editor, document, tagScanner));
		computers.add(new TagContentProposalComputer(file, editor, document,
				tagScanner));
		computers.add(new DefaultContentProposalComputer(file, editor,
				document, tagScanner));
	}

}
