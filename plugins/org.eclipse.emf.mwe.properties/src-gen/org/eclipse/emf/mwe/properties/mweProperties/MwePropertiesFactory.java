/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage
 * @generated
 */
public interface MwePropertiesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MwePropertiesFactory eINSTANCE = org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Property File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property File</em>'.
   * @generated
   */
  PropertyFile createPropertyFile();

  /**
   * Returns a new object of class '<em>Natural Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Natural Line</em>'.
   * @generated
   */
  NaturalLine createNaturalLine();

  /**
   * Returns a new object of class '<em>Blank Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blank Line</em>'.
   * @generated
   */
  BlankLine createBlankLine();

  /**
   * Returns a new object of class '<em>Property Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Comment</em>'.
   * @generated
   */
  PropertyComment createPropertyComment();

  /**
   * Returns a new object of class '<em>Property Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Entry</em>'.
   * @generated
   */
  PropertyEntry createPropertyEntry();

  /**
   * Returns a new object of class '<em>Compound String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound String</em>'.
   * @generated
   */
  CompoundString createCompoundString();

  /**
   * Returns a new object of class '<em>Compound String Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound String Part</em>'.
   * @generated
   */
  CompoundStringPart createCompoundStringPart();

  /**
   * Returns a new object of class '<em>Empty Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Property Value</em>'.
   * @generated
   */
  EmptyPropertyValue createEmptyPropertyValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MwePropertiesPackage getMwePropertiesPackage();

} //MwePropertiesFactory
