/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.mwe.concept.mweConcept.FileRef;
import org.eclipse.emf.mwe.concept.mweConcept.MWEString;
import org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.FileRefImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileRefImpl extends MinimalEObjectImpl.Container implements FileRef
{
  /**
   * The cached value of the '{@link #getFilePath() <em>File Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilePath()
   * @generated
   * @ordered
   */
  protected MWEString filePath;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileRefImpl()
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
    return MweConceptPackage.Literals.FILE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MWEString getFilePath()
  {
    return filePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilePath(MWEString newFilePath, NotificationChain msgs)
  {
    MWEString oldFilePath = filePath;
    filePath = newFilePath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MweConceptPackage.FILE_REF__FILE_PATH, oldFilePath, newFilePath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilePath(MWEString newFilePath)
  {
    if (newFilePath != filePath)
    {
      NotificationChain msgs = null;
      if (filePath != null)
        msgs = ((InternalEObject)filePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.FILE_REF__FILE_PATH, null, msgs);
      if (newFilePath != null)
        msgs = ((InternalEObject)newFilePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.FILE_REF__FILE_PATH, null, msgs);
      msgs = basicSetFilePath(newFilePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.FILE_REF__FILE_PATH, newFilePath, newFilePath));
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
      case MweConceptPackage.FILE_REF__FILE_PATH:
        return basicSetFilePath(null, msgs);
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
      case MweConceptPackage.FILE_REF__FILE_PATH:
        return getFilePath();
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
      case MweConceptPackage.FILE_REF__FILE_PATH:
        setFilePath((MWEString)newValue);
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
      case MweConceptPackage.FILE_REF__FILE_PATH:
        setFilePath((MWEString)null);
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
      case MweConceptPackage.FILE_REF__FILE_PATH:
        return filePath != null;
    }
    return super.eIsSet(featureID);
  }

} //FileRefImpl
