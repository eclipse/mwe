/*******************************************************************************
 * Copyright (c) 2009 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import java.sql.Timestamp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry()
 * @model kind="class"
 * @generated
 */
public class WorkflowLogEntry extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowLogEntryType TYPE_EDEFAULT = WorkflowLogEntryType.ERROR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected WorkflowLogEntryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Timestamp timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLogEntry()
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
		return RuntimePackage.Literals.WORKFLOW_LOG_ENTRY;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #setType(WorkflowLogEntryType)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry_Type()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowLogEntryType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #getType()
	 * @generated
	 */
	public void setType(WorkflowLogEntryType newType)
	{
		WorkflowLogEntryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_LOG_ENTRY__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Timestamp)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry_Timestamp()
	 * @model dataType="org.eclipse.emf.mwe.ewm.workflow.runtime.Timestamp"
	 * @generated
	 */
	public Timestamp getTimestamp()
	{
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(Timestamp newTimestamp)
	{
		Timestamp oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_LOG_ENTRY__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry_Message()
	 * @model required="true"
	 * @generated
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	public void setMessage(String newMessage)
	{
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_LOG_ENTRY__MESSAGE, oldMessage, message));
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
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TYPE:
				return getType();
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TIMESTAMP:
				return getTimestamp();
			case RuntimePackage.WORKFLOW_LOG_ENTRY__MESSAGE:
				return getMessage();
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
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TYPE:
				setType((WorkflowLogEntryType)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TIMESTAMP:
				setTimestamp((Timestamp)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG_ENTRY__MESSAGE:
				setMessage((String)newValue);
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
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case RuntimePackage.WORKFLOW_LOG_ENTRY__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TYPE:
				return type != TYPE_EDEFAULT;
			case RuntimePackage.WORKFLOW_LOG_ENTRY__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case RuntimePackage.WORKFLOW_LOG_ENTRY__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} // WorkflowLogEntry
