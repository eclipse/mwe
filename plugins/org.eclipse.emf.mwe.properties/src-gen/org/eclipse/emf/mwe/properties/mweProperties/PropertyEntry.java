/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyEntry()
 * @model
 * @generated
 */
public interface PropertyEntry extends NaturalLine
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' attribute.
   * @see #setDelimiter(String)
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyEntry_Delimiter()
   * @model
   * @generated
   */
  String getDelimiter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getDelimiter <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' attribute.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(CompoundString)
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#getPropertyEntry_Value()
   * @model containment="true"
   * @generated
   */
  CompoundString getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(CompoundString value);

} // PropertyEntry
