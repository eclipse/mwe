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

import org.eclipse.core.resources.IFile;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class Property {

	private String name;

	private String value;

	private IFile file;

	public Property(String name) {
		this(name, (String) null);
	}

	public Property(String name, String value) {
		if (name == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.name = name;
		this.value = (value != null) ? value : "";
	}

	public Property(String name, IFile file) {
		if (name == null || name.length() == 0 || file == null)
			throw new IllegalArgumentException();

		this.name = name;
		this.file = file;
	}

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the value of field <code>value</code>.
	 * 
	 * @return value of <code>value</code>.
	 */
	public String getValue() {
		return value;
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
	 * Checks if property holds a simple value.
	 * 
	 * @return <code>true</code> if the current property holds a simple value,
	 *         otherwise <code>false</code>
	 */
	public boolean isSimpleValue() {
		return value != null && file == null;
	}

	/**
	 * Checks if property holds a reference.
	 * 
	 * @return <code>true</code> if the current property holds a reference,
	 *         otherwise <code>false</code>
	 */
	public boolean isReference() {
		return value != null && file == null;
	}

}
