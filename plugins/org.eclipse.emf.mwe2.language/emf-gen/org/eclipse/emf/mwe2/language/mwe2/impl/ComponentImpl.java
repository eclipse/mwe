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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl#isAutoInject <em>Auto Inject</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ReferrableImplCustom implements Component
{
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.emf.mwe2.language.mwe2.Module module;

	/**
	 * The default value of the '{@link #isAutoInject() <em>Auto Inject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoInject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_INJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoInject() <em>Auto Inject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoInject()
	 * @generated
	 * @ordered
	 */
	protected boolean autoInject = AUTO_INJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignment;

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
		return Mwe2Package.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.emf.mwe2.language.mwe2.Module getModule()
	{
		if (module != null && module.eIsProxy())
		{
			InternalEObject oldModule = (InternalEObject)module;
			module = (org.eclipse.emf.mwe2.language.mwe2.Module)eResolveProxy(oldModule);
			if (module != oldModule)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mwe2Package.COMPONENT__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.emf.mwe2.language.mwe2.Module basicGetModule()
	{
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(org.eclipse.emf.mwe2.language.mwe2.Module newModule)
	{
		org.eclipse.emf.mwe2.language.mwe2.Module oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.COMPONENT__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoInject()
	{
		return autoInject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoInject(boolean newAutoInject)
	{
		boolean oldAutoInject = autoInject;
		autoInject = newAutoInject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.COMPONENT__AUTO_INJECT, oldAutoInject, autoInject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment> getAssignment()
	{
		if (assignment == null)
		{
			assignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, Mwe2Package.COMPONENT__ASSIGNMENT);
		}
		return assignment;
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
			case Mwe2Package.COMPONENT__ASSIGNMENT:
				return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
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
			case Mwe2Package.COMPONENT__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case Mwe2Package.COMPONENT__AUTO_INJECT:
				return isAutoInject();
			case Mwe2Package.COMPONENT__ASSIGNMENT:
				return getAssignment();
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
			case Mwe2Package.COMPONENT__MODULE:
				setModule((org.eclipse.emf.mwe2.language.mwe2.Module)newValue);
				return;
			case Mwe2Package.COMPONENT__AUTO_INJECT:
				setAutoInject((Boolean)newValue);
				return;
			case Mwe2Package.COMPONENT__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>)newValue);
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
			case Mwe2Package.COMPONENT__MODULE:
				setModule((org.eclipse.emf.mwe2.language.mwe2.Module)null);
				return;
			case Mwe2Package.COMPONENT__AUTO_INJECT:
				setAutoInject(AUTO_INJECT_EDEFAULT);
				return;
			case Mwe2Package.COMPONENT__ASSIGNMENT:
				getAssignment().clear();
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
			case Mwe2Package.COMPONENT__MODULE:
				return module != null;
			case Mwe2Package.COMPONENT__AUTO_INJECT:
				return autoInject != AUTO_INJECT_EDEFAULT;
			case Mwe2Package.COMPONENT__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
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
		result.append(" (autoInject: ");
		result.append(autoInject);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
