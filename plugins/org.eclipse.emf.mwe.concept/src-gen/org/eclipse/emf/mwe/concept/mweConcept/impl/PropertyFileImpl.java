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

import org.eclipse.emf.mwe.concept.mweConcept.FileRef;
import org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage;
import org.eclipse.emf.mwe.concept.mweConcept.PropertyFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyFileImpl#getFileRef <em>File Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyFileImpl extends PropertyImpl implements PropertyFile
{
  /**
   * The cached value of the '{@link #getFileRef() <em>File Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileRef()
   * @generated
   * @ordered
   */
  protected FileRef fileRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyFileImpl()
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
    return MweConceptPackage.Literals.PROPERTY_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileRef getFileRef()
  {
    return fileRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileRef(FileRef newFileRef, NotificationChain msgs)
  {
    FileRef oldFileRef = fileRef;
    fileRef = newFileRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY_FILE__FILE_REF, oldFileRef, newFileRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileRef(FileRef newFileRef)
  {
    if (newFileRef != fileRef)
    {
      NotificationChain msgs = null;
      if (fileRef != null)
        msgs = ((InternalEObject)fileRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.PROPERTY_FILE__FILE_REF, null, msgs);
      if (newFileRef != null)
        msgs = ((InternalEObject)newFileRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.PROPERTY_FILE__FILE_REF, null, msgs);
      msgs = basicSetFileRef(newFileRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY_FILE__FILE_REF, newFileRef, newFileRef));
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
      case MweConceptPackage.PROPERTY_FILE__FILE_REF:
        return basicSetFileRef(null, msgs);
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
      case MweConceptPackage.PROPERTY_FILE__FILE_REF:
        return getFileRef();
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
      case MweConceptPackage.PROPERTY_FILE__FILE_REF:
        setFileRef((FileRef)newValue);
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
      case MweConceptPackage.PROPERTY_FILE__FILE_REF:
        setFileRef((FileRef)null);
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
      case MweConceptPackage.PROPERTY_FILE__FILE_REF:
        return fileRef != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyFileImpl
