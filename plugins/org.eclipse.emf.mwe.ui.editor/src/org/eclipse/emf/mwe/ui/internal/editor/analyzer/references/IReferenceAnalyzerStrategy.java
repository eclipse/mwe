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

import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */
public interface IReferenceAnalyzerStrategy {

	/**
	 * Analyzes <code>element</code> if it contains any references to other
	 * elements or files.
	 * 
	 * @param element
	 */
	void analyzeElement(IWorkflowElement element);

	/**
	 * Clear all cached information.
	 */
	void clearCache();

	/**
	 * Checks if <code>element</code> is applicable for the current analyzer.
	 * 
	 * @param element
	 *            the element.
	 * @return <code>true</code> if <code>element</code> is applicable,
	 *         otherwise <code>false</code>.
	 */
	boolean isApplicable(IWorkflowElement element);

	/**
	 * Sets the reference information store.
	 * 
	 * @param store
	 *            the store.
	 */
	void setReferenceInfoStore(ReferenceInfoStore store);
}
