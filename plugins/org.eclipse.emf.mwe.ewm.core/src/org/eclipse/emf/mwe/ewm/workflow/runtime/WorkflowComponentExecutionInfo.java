/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowComponentExecutionInfo.java,v 1.2 2009/05/22 18:16:23 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import java.sql.Timestamp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Component Execution Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getEndTime <em>End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfo()
 * @model kind="class"
 * @generated
 */
public class WorkflowComponentExecutionInfo extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Timestamp startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Timestamp endTime = END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentExecutionInfo()
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
		return RuntimePackage.Literals.WORKFLOW_COMPONENT_EXECUTION_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Timestamp)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfo_StartTime()
	 * @model dataType="org.eclipse.emf.mwe.ewm.workflow.runtime.Timestamp" required="true"
	 * @generated
	 */
	public Timestamp getStartTime()
	{
		return startTime;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	public void setStartTime(Timestamp newStartTime)
	{
		Timestamp oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME, oldStartTime, startTime));
	}

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Timestamp)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfo_EndTime()
	 * @model dataType="org.eclipse.emf.mwe.ewm.workflow.runtime.Timestamp" required="true"
	 * @generated
	 */
	public Timestamp getEndTime()
	{
		return endTime;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	public void setEndTime(Timestamp newEndTime)
	{
		Timestamp oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME, oldEndTime, endTime));
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
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME:
				return getStartTime();
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME:
				return getEndTime();
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
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME:
				setStartTime((Timestamp)newValue);
				return;
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME:
				setEndTime((Timestamp)newValue);
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
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
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
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case RuntimePackage.WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} // WorkflowComponentExecutionInfo
