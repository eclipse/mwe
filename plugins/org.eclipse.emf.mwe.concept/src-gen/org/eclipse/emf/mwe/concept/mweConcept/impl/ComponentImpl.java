/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.mwe.concept.mweConcept.Component;
import org.eclipse.emf.mwe.concept.mweConcept.ConfigurationElement;
import org.eclipse.emf.mwe.concept.mweConcept.FileRef;
import org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage;

import org.eclipse.xtext.common.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl#getFileRef <em>File Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends LiteralImpl implements Component
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return MweConceptPackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MweConceptPackage.COMPONENT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.COMPONENT__TYPE, oldType, type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MweConceptPackage.COMPONENT__FILE_REF, oldFileRef, newFileRef);
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
        msgs = ((InternalEObject)fileRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.COMPONENT__FILE_REF, null, msgs);
      if (newFileRef != null)
        msgs = ((InternalEObject)newFileRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.COMPONENT__FILE_REF, null, msgs);
      msgs = basicSetFileRef(newFileRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.COMPONENT__FILE_REF, newFileRef, newFileRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigurationElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ConfigurationElement>(ConfigurationElement.class, this, MweConceptPackage.COMPONENT__ELEMENTS);
    }
    return elements;
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
      case MweConceptPackage.COMPONENT__FILE_REF:
        return basicSetFileRef(null, msgs);
      case MweConceptPackage.COMPONENT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case MweConceptPackage.COMPONENT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case MweConceptPackage.COMPONENT__FILE_REF:
        return getFileRef();
      case MweConceptPackage.COMPONENT__NAME:
        return getName();
      case MweConceptPackage.COMPONENT__ELEMENTS:
        return getElements();
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
      case MweConceptPackage.COMPONENT__TYPE:
        setType((Type)newValue);
        return;
      case MweConceptPackage.COMPONENT__FILE_REF:
        setFileRef((FileRef)newValue);
        return;
      case MweConceptPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case MweConceptPackage.COMPONENT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ConfigurationElement>)newValue);
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
      case MweConceptPackage.COMPONENT__TYPE:
        setType((Type)null);
        return;
      case MweConceptPackage.COMPONENT__FILE_REF:
        setFileRef((FileRef)null);
        return;
      case MweConceptPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MweConceptPackage.COMPONENT__ELEMENTS:
        getElements().clear();
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
      case MweConceptPackage.COMPONENT__TYPE:
        return type != null;
      case MweConceptPackage.COMPONENT__FILE_REF:
        return fileRef != null;
      case MweConceptPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MweConceptPackage.COMPONENT__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
