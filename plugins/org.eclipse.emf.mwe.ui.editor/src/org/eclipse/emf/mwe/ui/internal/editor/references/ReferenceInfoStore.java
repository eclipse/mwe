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

package org.eclipse.emf.mwe.ui.internal.editor.references;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
public class ReferenceInfoStore {

	private final IFile file;

	private final Set<ReferenceInfo> definitionSet = new HashSet<ReferenceInfo>();

	private final List<ReferenceInfo> references = new LinkedList<ReferenceInfo>();

	public ReferenceInfoStore(final IFile file) {
		this.file = file;
	}

	public boolean addDefinition(final AbstractWorkflowElement element) {
		if (element == null || !element.hasAttribute(IWorkflowAttribute.ID_ATTRIBUTE))
			throw new IllegalArgumentException();

		final ReferenceInfo info = createReferenceInfo(element);
		return !definitionSet.add(info);
	}

	public void addReference(final AbstractWorkflowElement element) {
		if (element == null || !element.hasAttribute(IWorkflowAttribute.ID_REF_ATTRIBUTE))
			throw new IllegalArgumentException();

		final ReferenceInfo info = createReferenceInfo(element);
		references.add(info);
	}

	public void clear() {
		definitionSet.clear();
		references.clear();
	}

	public Collection<ReferenceInfo> getDefinitions() {
		return definitionSet;
	}

	public AbstractWorkflowElement getReferencedElement(final AbstractWorkflowElement element) {
		if (element == null || !element.hasReference())
			throw new IllegalArgumentException();

		final String idRef = element.getAttributeValue(IWorkflowAttribute.ID_REF_ATTRIBUTE);
		for (final ReferenceInfo info : definitionSet) {
			final IWorkflowAttribute attr = info.getAttribute();
			if (idRef.equals(attr.getValue()))
				return info.getElement();
		}
		return null;
	}

	public Collection<ReferenceInfo> getReferences() {
		return references;
	}

	public Collection<ReferenceInfo> getUnresolvedReferences() {
		final List<ReferenceInfo> result = new ArrayList<ReferenceInfo>();

		for (final ReferenceInfo info : references) {
			if (!isResolvable(info)) {
				result.add(info);
			}
		}
		return result;
	}

	public boolean hasDefinition(final AbstractWorkflowElement element) {
		if (element == null | !element.hasReferenceDefinition())
			throw new IllegalArgumentException();

		final String id = element.getAttributeValue(IWorkflowAttribute.ID_ATTRIBUTE);
		for (final ReferenceInfo info : definitionSet) {
			final IWorkflowAttribute attr = info.getAttribute();
			if (id.equals(attr.getValue()))
				return true;
		}
		return false;
	}

	public boolean isResolvable(final AbstractWorkflowElement element) {
		if (element == null || !element.hasReference())
			throw new IllegalArgumentException();

		return isResolvable(createReferenceInfo(element));
	}

	public boolean isResolvable(final ReferenceInfo info) {
		if (info == null || !info.getElement().hasAttribute(IWorkflowAttribute.ID_REF_ATTRIBUTE))
			throw new IllegalArgumentException();

		return definitionSet.contains(info);
	}

	private ReferenceInfo createReferenceInfo(final AbstractWorkflowElement element) {
		IWorkflowAttribute attribute = element.getAttribute(IWorkflowAttribute.ID_ATTRIBUTE);
		if (attribute == null) {
			attribute = element.getAttribute(IWorkflowAttribute.ID_REF_ATTRIBUTE);
		}

		if (attribute == null)
			throw new IllegalArgumentException();

		return new ReferenceInfo(file, element, attribute);
	}
}
