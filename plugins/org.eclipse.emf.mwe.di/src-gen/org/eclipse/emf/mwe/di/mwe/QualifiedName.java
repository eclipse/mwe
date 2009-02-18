/**
 * <copyright>
 * </copyright>
 *
 * $Id: QualifiedName.java,v 1.1 2009/02/18 19:38:21 sefftinge Exp $
 */
package org.eclipse.emf.mwe.di.mwe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.QualifiedName#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends EObject
{
  /**
   * Returns the value of the '<em><b>Parts</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' attribute list.
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getQualifiedName_Parts()
   * @model unique="false"
   * @generated
   */
  EList<String> getParts();

} // QualifiedName
