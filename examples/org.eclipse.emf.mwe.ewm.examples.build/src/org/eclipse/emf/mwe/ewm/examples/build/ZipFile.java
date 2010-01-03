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
package org.eclipse.emf.mwe.ewm.examples.build;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getInputFileParameter <em>Input File Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getOutputFileParameter <em>Output File Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile()
 * @model kind="class"
 * @generated
 */
public class ZipFile extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getWorkingDirectoryParameter() <em>Working Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter workingDirectoryParameter;

	/**
	 * The cached value of the '{@link #getInputFileParameter() <em>Input File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFileParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter inputFileParameter;

	/**
	 * The cached value of the '{@link #getOutputFileParameter() <em>Output File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFileParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter outputFileParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipFile()
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
		return BuildPackage.Literals.ZIP_FILE;
	}

	/**
	 * Returns the value of the '<em><b>Working Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Directory Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory Parameter</em>' containment reference.
	 * @see #setWorkingDirectoryParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile_WorkingDirectoryParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getWorkingDirectoryParameter()
	{
		return workingDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingDirectoryParameter(WorkflowParameter newWorkingDirectoryParameter, NotificationChain msgs)
	{
		WorkflowParameter oldWorkingDirectoryParameter = workingDirectoryParameter;
		workingDirectoryParameter = newWorkingDirectoryParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER, oldWorkingDirectoryParameter, newWorkingDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory Parameter</em>' containment reference.
	 * @see #getWorkingDirectoryParameter()
	 * @generated
	 */
	public void setWorkingDirectoryParameter(WorkflowParameter newWorkingDirectoryParameter)
	{
		if (newWorkingDirectoryParameter != workingDirectoryParameter)
		{
			NotificationChain msgs = null;
			if (workingDirectoryParameter != null)
				msgs = ((InternalEObject)workingDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER, null, msgs);
			if (newWorkingDirectoryParameter != null)
				msgs = ((InternalEObject)newWorkingDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER, null, msgs);
			msgs = basicSetWorkingDirectoryParameter(newWorkingDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER, newWorkingDirectoryParameter, newWorkingDirectoryParameter));
	}

	/**
	 * Returns the value of the '<em><b>Input File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input File Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input File Parameter</em>' containment reference.
	 * @see #setInputFileParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile_InputFileParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getInputFileParameter()
	{
		return inputFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputFileParameter(WorkflowParameter newInputFileParameter, NotificationChain msgs)
	{
		WorkflowParameter oldInputFileParameter = inputFileParameter;
		inputFileParameter = newInputFileParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER, oldInputFileParameter, newInputFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getInputFileParameter <em>Input File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input File Parameter</em>' containment reference.
	 * @see #getInputFileParameter()
	 * @generated
	 */
	public void setInputFileParameter(WorkflowParameter newInputFileParameter)
	{
		if (newInputFileParameter != inputFileParameter)
		{
			NotificationChain msgs = null;
			if (inputFileParameter != null)
				msgs = ((InternalEObject)inputFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER, null, msgs);
			if (newInputFileParameter != null)
				msgs = ((InternalEObject)newInputFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER, null, msgs);
			msgs = basicSetInputFileParameter(newInputFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER, newInputFileParameter, newInputFileParameter));
	}

	/**
	 * Returns the value of the '<em><b>Output File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Parameter</em>' containment reference.
	 * @see #setOutputFileParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile_OutputFileParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getOutputFileParameter()
	{
		return outputFileParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputFileParameter(WorkflowParameter newOutputFileParameter, NotificationChain msgs)
	{
		WorkflowParameter oldOutputFileParameter = outputFileParameter;
		outputFileParameter = newOutputFileParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER, oldOutputFileParameter, newOutputFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getOutputFileParameter <em>Output File Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Parameter</em>' containment reference.
	 * @see #getOutputFileParameter()
	 * @generated
	 */
	public void setOutputFileParameter(WorkflowParameter newOutputFileParameter)
	{
		if (newOutputFileParameter != outputFileParameter)
		{
			NotificationChain msgs = null;
			if (outputFileParameter != null)
				msgs = ((InternalEObject)outputFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER, null, msgs);
			if (newOutputFileParameter != null)
				msgs = ((InternalEObject)newOutputFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER, null, msgs);
			msgs = basicSetOutputFileParameter(newOutputFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER, newOutputFileParameter, newOutputFileParameter));
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
			case BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER:
				return basicSetWorkingDirectoryParameter(null, msgs);
			case BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER:
				return basicSetInputFileParameter(null, msgs);
			case BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER:
				return basicSetOutputFileParameter(null, msgs);
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
			case BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER:
				return getWorkingDirectoryParameter();
			case BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER:
				return getInputFileParameter();
			case BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER:
				return getOutputFileParameter();
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
			case BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER:
				setInputFileParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER:
				setOutputFileParameter((WorkflowParameter)newValue);
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
			case BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)null);
				return;
			case BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER:
				setInputFileParameter((WorkflowParameter)null);
				return;
			case BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER:
				setOutputFileParameter((WorkflowParameter)null);
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
			case BuildPackage.ZIP_FILE__WORKING_DIRECTORY_PARAMETER:
				return workingDirectoryParameter != null;
			case BuildPackage.ZIP_FILE__INPUT_FILE_PARAMETER:
				return inputFileParameter != null;
			case BuildPackage.ZIP_FILE__OUTPUT_FILE_PARAMETER:
				return outputFileParameter != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork#run(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException
	{
		File workingDirectory = new File((String) workingDirectoryParameter.getValue(context));
		String[] command = {"zip", (String) outputFileParameter.getValue(context), (String) inputFileParameter.getValue(context)};
		int rc = 0;
		
		try
		{
			logDebug(context, "Executing command: zip " + command[1] + " " + command[2]);
			Process process = Runtime.getRuntime().exec(command, null, workingDirectory);
			rc = process.waitFor();
		}
		catch (Exception e)
		{
			logException(context, e);
			return StateFactory.eINSTANCE.createWorkflowErrorState();
		}
		
		return rc == 0 ? StateFactory.eINSTANCE.createWorkflowSuccessState() : StateFactory.eINSTANCE.createWorkflowFailedState();
	}
} // ZipFile
