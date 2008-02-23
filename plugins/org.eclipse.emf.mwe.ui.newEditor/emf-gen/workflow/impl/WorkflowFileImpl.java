/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowFileImpl.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Assignment;
import workflow.Property;
import workflow.WorkflowFile;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.WorkflowFileImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link workflow.impl.WorkflowFileImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowFileImpl extends EObjectImpl implements WorkflowFile {
    /**
     * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignment()
     * @generated
     * @ordered
     */
    protected Assignment assignment;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkflowFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.WORKFLOW_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment getAssignment() {
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs) {
        Assignment oldAssignment = assignment;
        assignment = newAssignment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT, oldAssignment, newAssignment);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignment(Assignment newAssignment) {
        if (newAssignment != assignment) {
            NotificationChain msgs = null;
            if (assignment != null)
                msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT, null, msgs);
            if (newAssignment != null)
                msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT, null, msgs);
            msgs = basicSetAssignment(newAssignment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT, newAssignment, newAssignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, WorkflowPackage.WORKFLOW_FILE__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT:
                return basicSetAssignment(null, msgs);
            case WorkflowPackage.WORKFLOW_FILE__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
            case WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT:
                return getAssignment();
            case WorkflowPackage.WORKFLOW_FILE__PROPERTIES:
                return getProperties();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT:
                setAssignment((Assignment)newValue);
                return;
            case WorkflowPackage.WORKFLOW_FILE__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
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
            case WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT:
                setAssignment((Assignment)null);
                return;
            case WorkflowPackage.WORKFLOW_FILE__PROPERTIES:
                getProperties().clear();
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
            case WorkflowPackage.WORKFLOW_FILE__ASSIGNMENT:
                return assignment != null;
            case WorkflowPackage.WORKFLOW_FILE__PROPERTIES:
                return properties != null && !properties.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //WorkflowFileImpl
