/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleValueImpl.java,v 1.1 2008/02/22 16:41:24 pschonbac Exp $
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.SimpleValue;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.SimpleValueImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleValueImpl extends AbstractValueImpl implements SimpleValue {
    /**
     * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected static final String VAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected String val = VAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.SIMPLE_VALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVal() {
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVal(String newVal) {
        String oldVal = val;
        val = newVal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SIMPLE_VALUE__VAL, oldVal, val));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WorkflowPackage.SIMPLE_VALUE__VAL:
                return getVal();
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
            case WorkflowPackage.SIMPLE_VALUE__VAL:
                setVal((String)newValue);
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
            case WorkflowPackage.SIMPLE_VALUE__VAL:
                setVal(VAL_EDEFAULT);
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
            case WorkflowPackage.SIMPLE_VALUE__VAL:
                return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
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
        result.append(" (val: ");
        result.append(val);
        result.append(')');
        return result.toString();
    }

} //SimpleValueImpl
