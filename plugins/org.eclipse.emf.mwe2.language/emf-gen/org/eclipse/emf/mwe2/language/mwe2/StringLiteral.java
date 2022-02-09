/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Value
{
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(String)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral_Begin()
	 * @model
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.StringPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringPart> getParts();

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

} // StringLiteral
