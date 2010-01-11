/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundString#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getCompoundString()
 * @model
 * @generated
 */
public interface CompoundString extends EObject
{
  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference list.
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getCompoundString_Parts()
   * @model containment="true"
   * @generated
   */
  EList<CompoundStringPart> getParts();

} // CompoundString
