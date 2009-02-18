/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComplexValueImpl.java,v 1.1 2009/02/18 19:38:26 sefftinge Exp $
 */
package org.eclipse.emf.mwe.di.mwe.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.mwe.di.mwe.Assignment;
import org.eclipse.emf.mwe.di.mwe.ComplexValue;
import org.eclipse.emf.mwe.di.mwe.MwePackage;
import org.eclipse.emf.mwe.di.mwe.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl#isFooBar <em>Foo Bar</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexValueImpl extends ValueImpl implements ComplexValue
{
  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected QualifiedName className;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #isFooBar() <em>Foo Bar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFooBar()
   * @generated
   * @ordered
   */
  protected static final boolean FOO_BAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFooBar() <em>Foo Bar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFooBar()
   * @generated
   * @ordered
   */
  protected boolean fooBar = FOO_BAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexValueImpl()
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
    return MwePackage.Literals.COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassName(QualifiedName newClassName, NotificationChain msgs)
  {
    QualifiedName oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MwePackage.COMPLEX_VALUE__CLASS_NAME, oldClassName, newClassName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(QualifiedName newClassName)
  {
    if (newClassName != className)
    {
      NotificationChain msgs = null;
      if (className != null)
        msgs = ((InternalEObject)className).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MwePackage.COMPLEX_VALUE__CLASS_NAME, null, msgs);
      if (newClassName != null)
        msgs = ((InternalEObject)newClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MwePackage.COMPLEX_VALUE__CLASS_NAME, null, msgs);
      msgs = basicSetClassName(newClassName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MwePackage.COMPLEX_VALUE__CLASS_NAME, newClassName, newClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MwePackage.COMPLEX_VALUE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFooBar()
  {
    return fooBar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFooBar(boolean newFooBar)
  {
    boolean oldFooBar = fooBar;
    fooBar = newFooBar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MwePackage.COMPLEX_VALUE__FOO_BAR, oldFooBar, fooBar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, MwePackage.COMPLEX_VALUE__ASSIGNMENTS);
    }
    return assignments;
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
      case MwePackage.COMPLEX_VALUE__CLASS_NAME:
        return basicSetClassName(null, msgs);
      case MwePackage.COMPLEX_VALUE__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case MwePackage.COMPLEX_VALUE__CLASS_NAME:
        return getClassName();
      case MwePackage.COMPLEX_VALUE__ID:
        return getId();
      case MwePackage.COMPLEX_VALUE__FOO_BAR:
        return isFooBar() ? Boolean.TRUE : Boolean.FALSE;
      case MwePackage.COMPLEX_VALUE__ASSIGNMENTS:
        return getAssignments();
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
      case MwePackage.COMPLEX_VALUE__CLASS_NAME:
        setClassName((QualifiedName)newValue);
        return;
      case MwePackage.COMPLEX_VALUE__ID:
        setId((String)newValue);
        return;
      case MwePackage.COMPLEX_VALUE__FOO_BAR:
        setFooBar(((Boolean)newValue).booleanValue());
        return;
      case MwePackage.COMPLEX_VALUE__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
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
      case MwePackage.COMPLEX_VALUE__CLASS_NAME:
        setClassName((QualifiedName)null);
        return;
      case MwePackage.COMPLEX_VALUE__ID:
        setId(ID_EDEFAULT);
        return;
      case MwePackage.COMPLEX_VALUE__FOO_BAR:
        setFooBar(FOO_BAR_EDEFAULT);
        return;
      case MwePackage.COMPLEX_VALUE__ASSIGNMENTS:
        getAssignments().clear();
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
      case MwePackage.COMPLEX_VALUE__CLASS_NAME:
        return className != null;
      case MwePackage.COMPLEX_VALUE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MwePackage.COMPLEX_VALUE__FOO_BAR:
        return fooBar != FOO_BAR_EDEFAULT;
      case MwePackage.COMPLEX_VALUE__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", fooBar: ");
    result.append(fooBar);
    result.append(')');
    return result.toString();
  }

} //ComplexValueImpl
