/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getDeclaredProperty()
 * @model
 * @generated
 */
public interface DeclaredProperty extends Referrable, JvmIdentifiableElement
{
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Value)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getDeclaredProperty_Default()
	 * @model containment="true"
	 * @generated
	 */
	Value getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Value value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getDeclaredProperties <em>Declared Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(org.eclipse.emf.mwe2.language.mwe2.Module)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getDeclaredProperty_Module()
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module#getDeclaredProperties
	 * @model opposite="declaredProperties" transient="false"
	 * @generated
	 */
	org.eclipse.emf.mwe2.language.mwe2.Module getModule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.eclipse.emf.mwe2.language.mwe2.Module value);

} // DeclaredProperty
