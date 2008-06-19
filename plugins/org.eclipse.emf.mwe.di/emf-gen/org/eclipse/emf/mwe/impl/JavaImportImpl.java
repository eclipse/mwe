/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaImportImpl.java,v 1.1 2008/06/19 07:53:37 sefftinge Exp $
 */
package org.eclipse.emf.mwe.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.impl.JavaImportImpl#getJavaImport <em>Java Import</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.impl.JavaImportImpl#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaImportImpl extends ImportImpl implements JavaImport {
	/**
	 * The cached value of the '{@link #getJavaImport() <em>Java Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaImport()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName javaImport;

	/**
	 * The default value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WILDCARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWildcard()
	 * @generated
	 * @ordered
	 */
	protected boolean wildcard = WILDCARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MwePackage.Literals.JAVA_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getJavaImport() {
		return javaImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaImport(QualifiedName newJavaImport, NotificationChain msgs) {
		QualifiedName oldJavaImport = javaImport;
		javaImport = newJavaImport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MwePackage.JAVA_IMPORT__JAVA_IMPORT, oldJavaImport, newJavaImport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaImport(QualifiedName newJavaImport) {
		if (newJavaImport != javaImport) {
			NotificationChain msgs = null;
			if (javaImport != null)
				msgs = ((InternalEObject)javaImport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MwePackage.JAVA_IMPORT__JAVA_IMPORT, null, msgs);
			if (newJavaImport != null)
				msgs = ((InternalEObject)newJavaImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MwePackage.JAVA_IMPORT__JAVA_IMPORT, null, msgs);
			msgs = basicSetJavaImport(newJavaImport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MwePackage.JAVA_IMPORT__JAVA_IMPORT, newJavaImport, newJavaImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWildcard() {
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWildcard(boolean newWildcard) {
		boolean oldWildcard = wildcard;
		wildcard = newWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MwePackage.JAVA_IMPORT__WILDCARD, oldWildcard, wildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MwePackage.JAVA_IMPORT__JAVA_IMPORT:
				return basicSetJavaImport(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MwePackage.JAVA_IMPORT__JAVA_IMPORT:
				return getJavaImport();
			case MwePackage.JAVA_IMPORT__WILDCARD:
				return isWildcard() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MwePackage.JAVA_IMPORT__JAVA_IMPORT:
				setJavaImport((QualifiedName)newValue);
				return;
			case MwePackage.JAVA_IMPORT__WILDCARD:
				setWildcard(((Boolean)newValue).booleanValue());
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MwePackage.JAVA_IMPORT__JAVA_IMPORT:
				setJavaImport((QualifiedName)null);
				return;
			case MwePackage.JAVA_IMPORT__WILDCARD:
				setWildcard(WILDCARD_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MwePackage.JAVA_IMPORT__JAVA_IMPORT:
				return javaImport != null;
			case MwePackage.JAVA_IMPORT__WILDCARD:
				return wildcard != WILDCARD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (wildcard: ");
		result.append(wildcard);
		result.append(')');
		return result.toString();
	}

} //JavaImportImpl
