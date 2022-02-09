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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject <em>Auto Inject</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Component#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends Referrable, Value
{
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.eclipse.emf.mwe2.language.mwe2.Module)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_Module()
	 * @model
	 * @generated
	 */
	org.eclipse.emf.mwe2.language.mwe2.Module getModule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Component#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.eclipse.emf.mwe2.language.mwe2.Module value);

	/**
	 * Returns the value of the '<em><b>Auto Inject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Inject</em>' attribute.
	 * @see #setAutoInject(boolean)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_AutoInject()
	 * @model
	 * @generated
	 */
	boolean isAutoInject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject <em>Auto Inject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Inject</em>' attribute.
	 * @see #isAutoInject()
	 * @generated
	 */
	void setAutoInject(boolean value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getComponent_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignment();

} // Component
