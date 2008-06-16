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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class ReferenceInfo {

	private final IFile file;

	private final IWorkflowElement element;

	private final IWorkflowAttribute attribute;

	public ReferenceInfo(final IFile file, final IWorkflowElement element,
			final IWorkflowAttribute attribute) {
		if (element == null || attribute == null)
			throw new IllegalArgumentException();

		this.file = file;
		this.element = element;
		this.attribute = attribute;
	}

	/**
	 * This method overrides the implementation of <code>equals</code>
	 * inherited from the superclass.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// CHECKSTYLE:OFF
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ReferenceInfo other = (ReferenceInfo) obj;
		if (getReferenceValue() == null) {
			if (other.getReferenceValue() != null)
				return false;
		} else if (!getReferenceValue().equals(other.getReferenceValue()))
			return false;
		return true;
	}

	// CHECKSTYLE:ON

	/**
	 * Returns the value of field <code>attribute</code>.
	 * 
	 * @return value of <code>attribute</code>.
	 */
	public IWorkflowAttribute getAttribute() {
		return attribute;
	}

	/**
	 * Returns the value of field <code>element</code>.
	 * 
	 * @return value of <code>element</code>.
	 */
	public IWorkflowElement getElement() {
		return element;
	}

	/**
	 * Returns the value of field <code>file</code>.
	 * 
	 * @return value of <code>file</code>.
	 */
	public IFile getFile() {
		return file;
	}

	/**
	 * Returns the reference value.
	 * 
	 * @return the value of the reference.
	 */
	public String getReferenceValue() {
		return attribute.getValue();
	}

	/**
	 * This method overrides the implementation of <code>hashCode</code>
	 * inherited from the superclass.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result =
				prime
						* result
						+ ((getReferenceValue() == null) ? 0
								: getReferenceValue().hashCode());
		return result;
	}
}
