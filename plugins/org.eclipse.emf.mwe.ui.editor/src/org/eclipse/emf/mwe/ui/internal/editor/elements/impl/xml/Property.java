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

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class Property {

	private String name;

	private String value;

	private String file;

	private boolean imported;

	private boolean valueReference;

	public Property(final AbstractWorkflowElement element) {
		if (element == null || (!element.isProperty() && !element.hasAttribute(IWorkflowAttribute.VALUE_ATTRIBUTE)))
			throw new IllegalArgumentException();

		if (element.hasAttribute(IWorkflowAttribute.NAME_ATTRIBUTE)) {
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
		else if (element.getAttributeCount() == 1 && element.hasAttribute(IWorkflowAttribute.VALUE_ATTRIBUTE)) {
			name = element.getName();
			setValue(element.getAttributeValue(IWorkflowAttribute.VALUE_ATTRIBUTE));
		}
		else
			throw new RuntimeException("Incomplete property specification");
	}

	public Property(final String name) {
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
	 * Checks if property holds a file valueReference.
	 * 
	 * @return <code>true</code> if the current property holds a file
	 *         valueReference, otherwise <code>false</code>
	 */
	public boolean isFileReference() {
		return value == null && file != null;
	}

	/**
	 * Returns the value of field <code>imported</code>.
	 * 
	 * @return value of <code>imported</code>.
	 */
	public boolean isImported() {
		return imported;
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
	 * Checks if property holds a value valueReference.
	 * 
	 * @return <code>true</code> if the current property holds a value
	 *         valueReference, otherwise <code>false</code>
	 */
	public boolean isValueReference() {
		return file == null && valueReference;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(final String file) {
		this.file = file;
	}

	/**
	 * Sets a new value for field <code>imported</code>.
	 * 
	 * @param imported
	 *            new value for <code>imported</code>.
	 */
	public void setImported(final boolean imported) {
		this.imported = imported;
	}

	/**
	 * Sets a new value for field <code>value</code>.
	 * 
	 * @param value
	 *            new value for <code>value</code>.
	 */
	public void setValue(final String value) {
		this.value = value;
	}

	/**
	 * Sets a new value for field <code>valueReference</code>.
	 * 
	 * @param valueReference
	 *            new value for <code>valueReference</code>.
	 */
	public void setValueReference(final boolean valueReference) {
		this.valueReference = valueReference;
	}
}
