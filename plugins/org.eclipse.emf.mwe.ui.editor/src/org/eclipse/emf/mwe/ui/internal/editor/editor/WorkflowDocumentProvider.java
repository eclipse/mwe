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

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowPartitionScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */
public class WorkflowDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(final Object element)
			throws CoreException {
		final IDocument document = super.createDocument(element);
		if (document != null) {
			final IDocumentPartitioner partitioner =
					new FastPartitioner(
							new WorkflowPartitionScanner(),
							new String[] {
									WorkflowPartitionScanner.XML_START_TAG,
									WorkflowPartitionScanner.XML_END_TAG,
									WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION,
									WorkflowPartitionScanner.XML_DOCTYPE,
									WorkflowPartitionScanner.XML_TEXT,
									WorkflowPartitionScanner.XML_COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}
