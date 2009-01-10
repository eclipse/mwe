/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.JavaImport#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.JavaImport#getJavaImport <em>Java Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.MwePackage#getJavaImport()
 * @model
 * @generated
 */
public interface JavaImport extends Import {
	/**
	 * Returns the value of the '<em><b>Java Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Import</em>' containment reference.
	 * @see #setJavaImport(QualifiedName)
	 * @see org.eclipse.emf.mwe.MwePackage#getJavaImport_JavaImport()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getJavaImport();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.JavaImport#getJavaImport <em>Java Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Import</em>' containment reference.
	 * @see #getJavaImport()
	 * @generated
	 */
	void setJavaImport(QualifiedName value);

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard</em>' attribute.
	 * @see #setWildcard(boolean)
	 * @see org.eclipse.emf.mwe.MwePackage#getJavaImport_Wildcard()
	 * @model
	 * @generated
	 */
	boolean isWildcard();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.JavaImport#isWildcard <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard</em>' attribute.
	 * @see #isWildcard()
	 * @generated
	 */
	void setWildcard(boolean value);

} // JavaImport
