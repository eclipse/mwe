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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer.references;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.7 $
 */
public class ReferenceInfoStore {

	private final IFile file;

	private final Set<ReferenceInfo> definitionSet =
			new HashSet<ReferenceInfo>();

	private final List<ReferenceInfo> references =
			new LinkedList<ReferenceInfo>();

	private final Set<String> fileNameSet = new HashSet<String>();

	public ReferenceInfoStore(final IFile file) {
		this.file = file;
	}

	public boolean addDefinition(final IWorkflowElement element) {
		if (element == null
				|| !element.hasAttribute(IWorkflowElement.ID_ATTRIBUTE))
			throw new IllegalArgumentException();

		final ReferenceInfo info = createReferenceInfo(element);
		return !definitionSet.add(info);
	}

	public boolean addFileName(final String name) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		return fileNameSet.add(name);
	}

	public void addReference(final IWorkflowElement element) {
		if (element == null
				|| !element.hasAttribute(IWorkflowElement.ID_REF_ATTRIBUTE))
			throw new IllegalArgumentException();

		final ReferenceInfo info = createReferenceInfo(element);
		references.add(info);
	}

	public void clear() {
		definitionSet.clear();
		references.clear();
		fileNameSet.clear();
	}

	public boolean containsFileName(final String name) {
		if (name == null)
			return false;

		return fileNameSet.contains(name);
	}

	public Collection<ReferenceInfo> getReferenceDefinitions() {
		return definitionSet;
	}

	public Collection<ReferenceInfo> getReferences() {
		return references;
	}

	public boolean isDefined(final ReferenceInfo info) {
		if (info == null
				|| !info.getElement().hasAttribute(
						IWorkflowElement.ID_REF_ATTRIBUTE))
			throw new IllegalArgumentException();

		return definitionSet.contains(info);
	}

	private ReferenceInfo createReferenceInfo(final IWorkflowElement element) {
		WorkflowAttribute attribute =
				element.getAttribute(IWorkflowElement.ID_ATTRIBUTE);
		if (attribute == null) {
			attribute = element.getAttribute(IWorkflowElement.ID_REF_ATTRIBUTE);
		}

		if (attribute == null)
			throw new IllegalArgumentException();

		return new ReferenceInfo(file, element, attribute);
	}
}
