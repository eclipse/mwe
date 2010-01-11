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

import org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage;
import org.eclipse.emf.mwe.concept.mweConcept.Property;

import org.eclipse.emf.mwe.properties.mweProperties.CompoundString;
import org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage;
import org.eclipse.emf.mwe.properties.mweProperties.NaturalLine;
import org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends ConfigurationElementImpl implements Property
{
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
   * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected static final String DELIMITER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected String delimiter = DELIMITER_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected CompoundString value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return MweConceptPackage.Literals.PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(String newDelimiter)
  {
    String oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY__DELIMITER, oldDelimiter, delimiter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundString getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(CompoundString newValue, NotificationChain msgs)
  {
    CompoundString oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(CompoundString newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.PROPERTY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MweConceptPackage.PROPERTY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MweConceptPackage.PROPERTY__VALUE, newValue, newValue));
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
      case MweConceptPackage.PROPERTY__VALUE:
        return basicSetValue(null, msgs);
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
      case MweConceptPackage.PROPERTY__NAME:
        return getName();
      case MweConceptPackage.PROPERTY__DELIMITER:
        return getDelimiter();
      case MweConceptPackage.PROPERTY__VALUE:
        return getValue();
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
      case MweConceptPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case MweConceptPackage.PROPERTY__DELIMITER:
        setDelimiter((String)newValue);
        return;
      case MweConceptPackage.PROPERTY__VALUE:
        setValue((CompoundString)newValue);
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
      case MweConceptPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MweConceptPackage.PROPERTY__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
        return;
      case MweConceptPackage.PROPERTY__VALUE:
        setValue((CompoundString)null);
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
      case MweConceptPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MweConceptPackage.PROPERTY__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
      case MweConceptPackage.PROPERTY__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NaturalLine.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PropertyEntry.class)
    {
      switch (derivedFeatureID)
      {
        case MweConceptPackage.PROPERTY__NAME: return MwePropertiesPackage.PROPERTY_ENTRY__NAME;
        case MweConceptPackage.PROPERTY__DELIMITER: return MwePropertiesPackage.PROPERTY_ENTRY__DELIMITER;
        case MweConceptPackage.PROPERTY__VALUE: return MwePropertiesPackage.PROPERTY_ENTRY__VALUE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NaturalLine.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PropertyEntry.class)
    {
      switch (baseFeatureID)
      {
        case MwePropertiesPackage.PROPERTY_ENTRY__NAME: return MweConceptPackage.PROPERTY__NAME;
        case MwePropertiesPackage.PROPERTY_ENTRY__DELIMITER: return MweConceptPackage.PROPERTY__DELIMITER;
        case MwePropertiesPackage.PROPERTY_ENTRY__VALUE: return MweConceptPackage.PROPERTY__VALUE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
