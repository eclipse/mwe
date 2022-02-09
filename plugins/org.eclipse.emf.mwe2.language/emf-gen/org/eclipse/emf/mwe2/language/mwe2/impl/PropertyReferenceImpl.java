/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.mwe2.language.mwe2.AbstractReference;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.PropertyReferenceImpl#getReferable <em>Referable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyReferenceImpl extends StringPartImpl implements PropertyReference
{
	/**
	 * The cached value of the '{@link #getReferable() <em>Referable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferable()
	 * @generated
	 * @ordered
	 */
	protected Referrable referable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyReferenceImpl()
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
		return Mwe2Package.Literals.PROPERTY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referrable getReferable()
	{
		if (referable != null && referable.eIsProxy())
		{
			InternalEObject oldReferable = (InternalEObject)referable;
			referable = (Referrable)eResolveProxy(oldReferable);
			if (referable != oldReferable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mwe2Package.PROPERTY_REFERENCE__REFERABLE, oldReferable, referable));
			}
		}
		return referable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referrable basicGetReferable()
	{
		return referable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferable(Referrable newReferable)
	{
		Referrable oldReferable = referable;
		referable = newReferable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.PROPERTY_REFERENCE__REFERABLE, oldReferable, referable));
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
			case Mwe2Package.PROPERTY_REFERENCE__REFERABLE:
				if (resolve) return getReferable();
				return basicGetReferable();
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
			case Mwe2Package.PROPERTY_REFERENCE__REFERABLE:
				setReferable((Referrable)newValue);
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
			case Mwe2Package.PROPERTY_REFERENCE__REFERABLE:
				setReferable((Referrable)null);
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
			case Mwe2Package.PROPERTY_REFERENCE__REFERABLE:
				return referable != null;
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
		if (baseClass == AbstractReference.class)
		{
			switch (derivedFeatureID)
			{
				case Mwe2Package.PROPERTY_REFERENCE__REFERABLE: return Mwe2Package.ABSTRACT_REFERENCE__REFERABLE;
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
		if (baseClass == AbstractReference.class)
		{
			switch (baseFeatureID)
			{
				case Mwe2Package.ABSTRACT_REFERENCE__REFERABLE: return Mwe2Package.PROPERTY_REFERENCE__REFERABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PropertyReferenceImpl
