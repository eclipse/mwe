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

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getErrors <em>Errors</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getDebugs <em>Debugs</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog()
 * @model kind="class"
 * @generated
 */
public class WorkflowLog extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap entries;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowLogEntryType LOG_LEVEL_EDEFAULT = WorkflowLogEntryType.ERROR;
	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected WorkflowLogEntryType logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLog()
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
		return RuntimePackage.Literals.WORKFLOW_LOG;
	}

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' attribute list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_Entries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	public FeatureMap getEntries()
	{
		if (entries == null)
		{
			entries = new BasicFeatureMap(this, RuntimePackage.WORKFLOW_LOG__ENTRIES);
		}
		return entries;
	}

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_Errors()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	public EList<WorkflowLogEntry> getErrors()
	{
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__ERRORS);
	}

	/**
	 * Returns the value of the '<em><b>Warnings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warnings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnings</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_Warnings()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	public EList<WorkflowLogEntry> getWarnings()
	{
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__WARNINGS);
	}

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infos</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_Infos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	public EList<WorkflowLogEntry> getInfos()
	{
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__INFOS);
	}

	/**
	 * Returns the value of the '<em><b>Debugs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debugs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debugs</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_Debugs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	public EList<WorkflowLogEntry> getDebugs()
	{
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__DEBUGS);
	}

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #setLogLevel(WorkflowLogEntryType)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog_LogLevel()
	 * @model
	 * @generated
	 */
	public WorkflowLogEntryType getLogLevel()
	{
		return logLevel;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #getLogLevel()
	 * @generated
	 */
	public void setLogLevel(WorkflowLogEntryType newLogLevel)
	{
		WorkflowLogEntryType oldLogLevel = logLevel;
		logLevel = newLogLevel == null ? LOG_LEVEL_EDEFAULT : newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_LOG__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void logError(String message)
	{
		if(getLogLevel().getValue() >= WorkflowLogEntryType.ERROR_VALUE)
			getErrors().add(createLogEntry(WorkflowLogEntryType.ERROR, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void logWarning(String message)
	{
		if(getLogLevel().getValue() >= WorkflowLogEntryType.WARNING_VALUE)
			getWarnings().add(createLogEntry(WorkflowLogEntryType.WARNING, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void logInfo(String message)
	{
		if(getLogLevel().getValue() >= WorkflowLogEntryType.INFO_VALUE)
			getInfos().add(createLogEntry(WorkflowLogEntryType.INFO, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void logDebug(String message)
	{
		if(getLogLevel().getValue() >= WorkflowLogEntryType.DEBUG_VALUE)
			getDebugs().add(createLogEntry(WorkflowLogEntryType.DEBUG, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageDataType="org.eclipse.emf.mwe.ewm.workflow.runtime.Exception"
	 * @generated NOT
	 */
	public void logException(Exception e)
	{
		logError("Runtime Exception: " + e.getLocalizedMessage());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		e.printStackTrace(new PrintWriter(out));
		logError(out.toString());
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
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return ((InternalEList<?>)getWarnings()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return ((InternalEList<?>)getInfos()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return ((InternalEList<?>)getDebugs()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				if (coreType) return getEntries();
				return ((FeatureMap.Internal)getEntries()).getWrapper();
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return getErrors();
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return getWarnings();
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return getInfos();
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return getDebugs();
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				return getLogLevel();
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
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				((FeatureMap.Internal)getEntries()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				getDebugs().clear();
				getDebugs().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				setLogLevel((WorkflowLogEntryType)newValue);
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
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				getEntries().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				getErrors().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				getWarnings().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				getInfos().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				getDebugs().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				setLogLevel(LOG_LEVEL_EDEFAULT);
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
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				return entries != null && !entries.isEmpty();
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return !getErrors().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return !getWarnings().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return !getInfos().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return !getDebugs().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				return logLevel != LOG_LEVEL_EDEFAULT;
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
		result.append(" (entries: ");
		result.append(entries);
		result.append(", logLevel: ");
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

	private WorkflowLogEntry createLogEntry(WorkflowLogEntryType type, String message)
	{
		WorkflowLogEntry entry = RuntimeFactory.eINSTANCE.createWorkflowLogEntry();
		entry.setType(type);
		entry.setTimestamp(new Timestamp(System.currentTimeMillis()));
		entry.setMessage(message);
		return entry;
	}
} // WorkflowLog
