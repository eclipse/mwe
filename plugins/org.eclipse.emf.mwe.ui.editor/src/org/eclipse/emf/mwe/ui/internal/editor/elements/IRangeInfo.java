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
 */

public interface IRangeInfo {
	/**
	 * Returns the position range of the whole element.
	 * 
	 * @return position range of whole element
	 */
	ElementPositionRange getElementRange();

	/**
	 * Returns the position range of the end element.
	 * 
	 * @return position range of end element
	 */
	ElementPositionRange getEndElementRange();

	/**
	 * Returns the position range of the first line of the start element.
	 * 
	 * @return position range of the first line of the start element
	 */
	ElementPositionRange getFirstLineRange();

	/**
	 * Returns the value of field <code>startElementRange</code>.
	 * 
	 * @return value of <code>startElementRange</code>
	 */
	ElementPositionRange getStartElementRange();

	/**
	 * Sets the position range of the end element.
	 * 
	 * @param endElementRange
	 *            position range of end element
	 */
	void setEndElementRange(final ElementPositionRange endElementRange);

	/**
	 * Sets the position range of the start element.
	 * 
	 * @param startElementRange
	 *            position range of start element
	 */
	void setStartElementRange(final ElementPositionRange startElementRange);
}
