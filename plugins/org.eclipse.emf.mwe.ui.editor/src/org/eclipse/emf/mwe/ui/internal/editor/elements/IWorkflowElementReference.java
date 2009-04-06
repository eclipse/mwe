/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import java.util.Collection;

import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfoStore;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public interface IWorkflowElementReference {

	/**
	 * Adds a reference to the current element hierarchy.
	 * 
	 * @param element
	 *            the reference info
	 */
	void addReference(AbstractWorkflowElement element);

	/**
	 * Adds a reference definition to the current element hierarchy.
	 * 
	 * @param element
	 *            the reference info
	 * @return <code>true</code> if adding the definition succeeded,
	 *         <code>false</code> if a definition with this name exists already
	 */
	boolean addReferenceDefinition(AbstractWorkflowElement element);

	/**
	 * Returns all known reference definitions.
	 * 
	 * @return collection of all known reference definitions.
	 */
	Collection<ReferenceInfo> getReferenceDefinitions();

	/**
	 * Returns the referenced element, if any.
	 * 
	 * @return the referenced element or <code>null</code> if no such element
	 *         exists.
	 */
	AbstractWorkflowElement getReferencedElement();

	/**
	 * Returns a collection of all unresolved references.
	 * 
	 * @return collection of all unresolved references
	 */
	Collection<ReferenceInfo> getUnresolvedReferences();

	/**
	 * Checks if current element contains a reference to another element.
	 * 
	 * @return <code>true</code> if current element contains a reference,
	 *         otherwise <code>false</code>
	 */
	boolean hasReference();

	/**
	 * Checks if current element contains a reference definition
	 * 
	 * @return <code>true</code> if current element contains a reference
	 *         definition, otherwise <code>false</code>
	 */
	boolean hasReferenceDefinition();

	/**
	 * Checks if the reference contained in the current element is resolved.
	 * 
	 * @return <code>true</code> if the contained reference is resolved,
	 *         otherwise <code>false</code>
	 */
	boolean hasResolvedReference();

	/**
	 * Sets the reference info store for the element hierarchy.
	 * 
	 * @param store
	 *            the reference info store
	 */
	void setReferenceInfoStore(ReferenceInfoStore store);
}
