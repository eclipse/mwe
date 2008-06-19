/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportImpl.java,v 1.1 2008/06/19 07:53:38 sefftinge Exp $
 */
package org.eclipse.emf.mwe.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.mwe.Import;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ImportImpl extends EObjectImpl implements Import {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MwePackage.Literals.IMPORT;
	}

} //ImportImpl
