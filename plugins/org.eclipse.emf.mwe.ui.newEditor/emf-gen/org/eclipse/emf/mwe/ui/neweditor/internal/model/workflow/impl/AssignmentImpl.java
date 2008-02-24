/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssignmentImpl.java,v 1.1 2008/02/24 23:50:27 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.AbstractValue;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.AssignmentImpl#getToAssignTo <em>To Assign To</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends WorkflowElementImpl implements Assignment {
    /**
     * The default value of the '{@link #getToAssignTo() <em>To Assign To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToAssignTo()
     * @generated
     * @ordered
     */
    protected static final String TO_ASSIGN_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToAssignTo() <em>To Assign To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToAssignTo()
     * @generated
     * @ordered
     */
    protected String toAssignTo = TO_ASSIGN_TO_EDEFAULT;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected AbstractValue value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getToAssignTo() {
        return toAssignTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setToAssignTo(String newToAssignTo) {
        String oldToAssignTo = toAssignTo;
        toAssignTo = newToAssignTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ASSIGNMENT__TO_ASSIGN_TO, oldToAssignTo, toAssignTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(AbstractValue newValue, NotificationChain msgs) {
        AbstractValue oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ASSIGNMENT__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(AbstractValue newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.ASSIGNMENT__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.ASSIGNMENT__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ASSIGNMENT__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WorkflowPackage.ASSIGNMENT__VALUE:
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WorkflowPackage.ASSIGNMENT__TO_ASSIGN_TO:
                return getToAssignTo();
            case WorkflowPackage.ASSIGNMENT__VALUE:
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WorkflowPackage.ASSIGNMENT__TO_ASSIGN_TO:
                setToAssignTo((String)newValue);
                return;
            case WorkflowPackage.ASSIGNMENT__VALUE:
                setValue((AbstractValue)newValue);
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
            case WorkflowPackage.ASSIGNMENT__TO_ASSIGN_TO:
                setToAssignTo(TO_ASSIGN_TO_EDEFAULT);
                return;
            case WorkflowPackage.ASSIGNMENT__VALUE:
                setValue((AbstractValue)null);
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
            case WorkflowPackage.ASSIGNMENT__TO_ASSIGN_TO:
                return TO_ASSIGN_TO_EDEFAULT == null ? toAssignTo != null : !TO_ASSIGN_TO_EDEFAULT.equals(toAssignTo);
            case WorkflowPackage.ASSIGNMENT__VALUE:
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (toAssignTo: ");
        result.append(toAssignTo);
        result.append(')');
        return result.toString();
    }

} //AssignmentImpl
