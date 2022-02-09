/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl#getCanonicalName <em>Canonical Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl#getDeclaredProperties <em>Declared Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements org.eclipse.emf.mwe2.language.mwe2.Module
{
	/**
	 * The default value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected String canonicalName = CANONICAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getDeclaredProperties() <em>Declared Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredProperty> declaredProperties;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Component root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl()
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
		return Mwe2Package.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCanonicalName()
	{
		return canonicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanonicalName(String newCanonicalName)
	{
		String oldCanonicalName = canonicalName;
		canonicalName = newCanonicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.MODULE__CANONICAL_NAME, oldCanonicalName, canonicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<Import>(Import.class, this, Mwe2Package.MODULE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeclaredProperty> getDeclaredProperties()
	{
		if (declaredProperties == null)
		{
			declaredProperties = new EObjectContainmentWithInverseEList<DeclaredProperty>(DeclaredProperty.class, this, Mwe2Package.MODULE__DECLARED_PROPERTIES, Mwe2Package.DECLARED_PROPERTY__MODULE);
		}
		return declaredProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getRoot()
	{
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Component newRoot, NotificationChain msgs)
	{
		Component oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mwe2Package.MODULE__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(Component newRoot)
	{
		if (newRoot != root)
		{
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.MODULE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.MODULE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.MODULE__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeclaredProperties()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case Mwe2Package.MODULE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				return ((InternalEList<?>)getDeclaredProperties()).basicRemove(otherEnd, msgs);
			case Mwe2Package.MODULE__ROOT:
				return basicSetRoot(null, msgs);
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
			case Mwe2Package.MODULE__CANONICAL_NAME:
				return getCanonicalName();
			case Mwe2Package.MODULE__IMPORTS:
				return getImports();
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				return getDeclaredProperties();
			case Mwe2Package.MODULE__ROOT:
				return getRoot();
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
			case Mwe2Package.MODULE__CANONICAL_NAME:
				setCanonicalName((String)newValue);
				return;
			case Mwe2Package.MODULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				getDeclaredProperties().clear();
				getDeclaredProperties().addAll((Collection<? extends DeclaredProperty>)newValue);
				return;
			case Mwe2Package.MODULE__ROOT:
				setRoot((Component)newValue);
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
			case Mwe2Package.MODULE__CANONICAL_NAME:
				setCanonicalName(CANONICAL_NAME_EDEFAULT);
				return;
			case Mwe2Package.MODULE__IMPORTS:
				getImports().clear();
				return;
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				getDeclaredProperties().clear();
				return;
			case Mwe2Package.MODULE__ROOT:
				setRoot((Component)null);
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
			case Mwe2Package.MODULE__CANONICAL_NAME:
				return CANONICAL_NAME_EDEFAULT == null ? canonicalName != null : !CANONICAL_NAME_EDEFAULT.equals(canonicalName);
			case Mwe2Package.MODULE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Mwe2Package.MODULE__DECLARED_PROPERTIES:
				return declaredProperties != null && !declaredProperties.isEmpty();
			case Mwe2Package.MODULE__ROOT:
				return root != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (canonicalName: ");
		result.append(canonicalName);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
