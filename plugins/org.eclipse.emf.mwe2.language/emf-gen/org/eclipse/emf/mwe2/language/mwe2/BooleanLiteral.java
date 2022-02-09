/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral#isIsTrue <em>Is True</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Value
{
	/**
	 * Returns the value of the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is True</em>' attribute.
	 * @see #setIsTrue(boolean)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getBooleanLiteral_IsTrue()
	 * @model
	 * @generated
	 */
	boolean isIsTrue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral#isIsTrue <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is True</em>' attribute.
	 * @see #isIsTrue()
	 * @generated
	 */
	void setIsTrue(boolean value);

} // BooleanLiteral
