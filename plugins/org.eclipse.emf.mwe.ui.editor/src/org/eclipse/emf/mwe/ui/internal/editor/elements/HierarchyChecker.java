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

package org.eclipse.emf.mwe.ui.internal.editor.elements;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.8 $
 */
public final class HierarchyChecker {

	/**
	 * Don't allow instantiation.
	 */
	private HierarchyChecker() {
		throw new UnsupportedOperationException();
	}

	public static boolean checkChildValidity(final IWorkflowElement parentElement, final IWorkflowElement childElement) {
		boolean res = true;

		if (parentElement == null)
			throw new IllegalArgumentException();

		if (parentElement.isWorkflowFile() && !childElement.isInstantiable()) {
			res = false;
		}
		else if (parentElement.isWorkflow()) {
			if (!parentElement.isLeaf() && childElement.isProperty()) {
				final int lastElement = parentElement.getChildrenCount() - 1;
				if (!parentElement.getChild(lastElement).isProperty()) {
					res = false;
				}
			}
			else if (parentElement.isAssignment() || parentElement.isAssignmentProperty()) {
				if (childElement.isProperty()) {
					res = false;
				}
			}
		}
		return res;
	}
}
