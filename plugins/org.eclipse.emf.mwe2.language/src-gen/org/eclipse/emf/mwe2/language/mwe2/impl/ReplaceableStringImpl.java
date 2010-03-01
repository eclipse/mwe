/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.ReplaceableString;
import org.eclipse.emf.mwe2.language.mwe2.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replaceable String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ReplaceableStringImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplaceableStringImpl extends MWEStringPartImpl implements ReplaceableString
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Value property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReplaceableStringImpl()
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
    return Mwe2Package.Literals.REPLACEABLE_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Value newProperty, NotificationChain msgs)
  {
    Value oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mwe2Package.REPLACEABLE_STRING__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Value newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.REPLACEABLE_STRING__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.REPLACEABLE_STRING__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.REPLACEABLE_STRING__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Mwe2Package.REPLACEABLE_STRING__PROPERTY:
        return basicSetProperty(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Mwe2Package.REPLACEABLE_STRING__PROPERTY:
        return getProperty();
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
      case Mwe2Package.REPLACEABLE_STRING__PROPERTY:
        setProperty((Value)newValue);
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
      case Mwe2Package.REPLACEABLE_STRING__PROPERTY:
        setProperty((Value)null);
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
      case Mwe2Package.REPLACEABLE_STRING__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

} //ReplaceableStringImpl
