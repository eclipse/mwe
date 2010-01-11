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
 * A representation of the model object '<em><b>Property File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyFile#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyFile()
 * @model
 * @generated
 */
public interface PropertyFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe.properties.mweProperties.NaturalLine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyFile_Entries()
   * @model containment="true"
   * @generated
   */
  EList<NaturalLine> getEntries();

} // PropertyFile
