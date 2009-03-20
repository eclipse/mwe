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


/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class Property {

	private String name;

	private String value;

	private String file;

	public Property(AbstractWorkflowElement element) {
		if (element == null || !element.isProperty())
			throw new IllegalArgumentException();

		name = element.getAttributeValue(IWorkflowAttribute.NAME_ATTRIBUTE);
		if (element.isSimpleProperty()) {
			setValue(element.getAttributeValue(IWorkflowAttribute.VALUE_ATTRIBUTE));
		}
		else if (element.isFileProperty()) {
			setFile(element.getAttributeValue(IWorkflowAttribute.FILE_ATTRIBUTE));
		}
		else
			throw new RuntimeException("Incomplete property specification");

	}

	public Property(String name) {
		this.name = name;
	}

	/**
	 * Returns the value of field <code>file</code>.
	 * 
	 * @return value of <code>file</code>.
	 */
	public String getFile() {
		return file;
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
	 * Checks if the specification of the current property is complete.
	 * 
	 * @return <code>true</code> if the specification of the current property is
	 *         complete, otherwise <code>false</code>
	 */
	public boolean isComplete() {
		return isSimple() ^ isReference();
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

	/**
	 * Checks if property holds a simple value.
	 * 
	 * @return <code>true</code> if the current property holds a simple value,
	 *         otherwise <code>false</code>
	 */
	public boolean isSimple() {
		return value != null && file == null;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * Sets a new value for field <code>value</code>.
	 * 
	 * @param value
	 *            new value for <code>value</code>.
	 */
	public void setValue(String value) {
		this.value = (value != null) ? value : "";
	}
}
