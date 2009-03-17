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

import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public interface IClassMapping {
	/**
	 * Returns the name of the mapped class for this element if there is one.
	 * 
	 * @return name of the mapped class or <code>null</code> if there is none
	 */
	String getMappedClassName();

	/**
	 * Returns the type of the mapped class for this element if there is one.
	 * 
	 * @return type of the mapped class or <code>null</code> if there is none
	 */
	IType getMappedClassType();

	/**
	 * Checks if the current element has a class it is mapped to.
	 * 
	 * @return <code>true</code> if there exists a class to which the current
	 *         element is mapped, otherwise <code>false</code>
	 */
	boolean hasMappedClass();
}
