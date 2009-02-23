/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.di.mwe.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.mwe.di.mwe.MwePackage;
import org.eclipse.emf.mwe.di.mwe.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.impl.QualifiedNameImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedNameImpl extends EObjectImpl implements QualifiedName
{
  /**
   * The cached value of the '{@link #getParts() <em>Parts</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParts()
   * @generated
   * @ordered
   */
  protected EList<String> parts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedNameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MwePackage.Literals.QUALIFIED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParts()
  {
    if (parts == null)
    {
      parts = new EDataTypeEList<String>(String.class, this, MwePackage.QUALIFIED_NAME__PARTS);
    }
    return parts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MwePackage.QUALIFIED_NAME__PARTS:
        return getParts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MwePackage.QUALIFIED_NAME__PARTS:
        getParts().clear();
        getParts().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MwePackage.QUALIFIED_NAME__PARTS:
        getParts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MwePackage.QUALIFIED_NAME__PARTS:
        return parts != null && !parts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (parts: ");
    result.append(parts);
    result.append(')');
    return result.toString();
  }

} //QualifiedNameImpl
