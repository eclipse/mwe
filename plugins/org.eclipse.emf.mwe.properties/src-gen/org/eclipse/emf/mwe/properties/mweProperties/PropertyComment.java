/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyComment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyComment()
 * @model
 * @generated
 */
public interface PropertyComment extends NaturalLine
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyComment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyComment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // PropertyComment
