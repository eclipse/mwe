/**
 * <copyright>
 * </copyright>
 *
 * $Id: ValueImpl.java,v 1.1 2008/06/13 09:57:49 sefftinge Exp $
 */
package org.eclipse.emf.mwe.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ValueImpl extends EObjectImpl implements Value {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MwePackage.Literals.VALUE;
	}

} //ValueImpl
