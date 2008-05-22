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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class AssignmentPropertyContentProposalComputer extends
		TagContentProposalComputer {

	private class ContainerCache {

		private final int offset;

		private final WorkflowElement element;

		public ContainerCache(final WorkflowElement element, final int offset) {
			this.element = element;
			this.offset = offset;
		}

		public WorkflowElement getElement() {
			return element;
		}

		public int getOffset() {
			return offset;
		}

		public boolean isCached(final int offset) {
			return offset == getOffset();
		}
	}

	private static final String CLASS_ATTRIBUTE = "class";

	private ContainerCache containerCache;

	public AssignmentPropertyContentProposalComputer(
			final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	@Override
	public boolean isApplicable(final int offset) {
		return super.isApplicable(offset) && hasContainer(offset);
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> resultSet = new HashSet<String>();
		try {
			final WorkflowElement container = getContainer(offset);
			if (container != null) {
				final String className =
						container.getAttributeValue(CLASS_ATTRIBUTE);
				if (className == null)
					throw new IllegalStateException();

				final Class<?> clazz = Class.forName(className);
				final Set<String> settableProperties =
						ReflectionManager.getSettableProperties(clazz);
				resultSet.addAll(settableProperties);
			}
			return resultSet;
		} catch (final ClassNotFoundException e) {
			return resultSet;
		}
	}

	private void cacheElement(final WorkflowElement element, final int offset) {
		containerCache = new ContainerCache(element, offset);
	}

	private WorkflowElement getContainer(final int offset) {
		if (containerCache != null && containerCache.isCached(offset))
			return containerCache.getElement();

		final WorkflowElement element =
				WorkflowElementSearcher.searchContainerElement(editor,
						document, offset);

		if (element != null) {
			cacheElement(element, offset);
		}

		return element;
	}

	private boolean hasContainer(final int offset) {
		return getContainer(offset) != null;
	}

}
