/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.mwe.concept.mweConcept.MWEString;
import org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage;

import org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MWE String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MWEStringImpl extends CompoundStringImpl implements MWEString
{
  /**
   * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBegin()
   * @generated
   * @ordered
   */
  protected static final String BEGIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBegin()
   * @generated
   * @ordered
   */
  protected String begin = BEGIN_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MWEStringImpl()
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
    return MweConceptPackage.Literals.MWE_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBegin()
  {
    return begin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBegin(String newBegin)
  {
    String oldBegin = begin;
    begin = newBegin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.MWE_STRING__BEGIN, oldBegin, begin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.MWE_STRING__END, oldEnd, end));
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
      case MweConceptPackage.MWE_STRING__BEGIN:
        return getBegin();
      case MweConceptPackage.MWE_STRING__END:
        return getEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MweConceptPackage.MWE_STRING__BEGIN:
        setBegin((String)newValue);
        return;
      case MweConceptPackage.MWE_STRING__END:
        setEnd((String)newValue);
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
      case MweConceptPackage.MWE_STRING__BEGIN:
        setBegin(BEGIN_EDEFAULT);
        return;
      case MweConceptPackage.MWE_STRING__END:
        setEnd(END_EDEFAULT);
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
      case MweConceptPackage.MWE_STRING__BEGIN:
        return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
      case MweConceptPackage.MWE_STRING__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
    result.append(" (begin: ");
    result.append(begin);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //MWEStringImpl
