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
 * A representation of the model object '<em><b>Java Jar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getClassNameParameter <em>Class Name Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getOutputFileParameter <em>Output File Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar()
 * @model kind="class"
 * @generated
 */
public class JavaJar extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getClassNameParameter() <em>Class Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNameParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter classNameParameter;

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
	protected JavaJar()
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
		return BuildPackage.Literals.JAVA_JAR;
	}

	/**
	 * Returns the value of the '<em><b>Class Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name Parameter</em>' containment reference.
	 * @see #setClassNameParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar_ClassNameParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getClassNameParameter()
	{
		return classNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassNameParameter(WorkflowParameter newClassNameParameter, NotificationChain msgs)
	{
		WorkflowParameter oldClassNameParameter = classNameParameter;
		classNameParameter = newClassNameParameter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER, oldClassNameParameter, newClassNameParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getClassNameParameter <em>Class Name Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name Parameter</em>' containment reference.
	 * @see #getClassNameParameter()
	 * @generated
	 */
	public void setClassNameParameter(WorkflowParameter newClassNameParameter)
	{
		if (newClassNameParameter != classNameParameter)
		{
			NotificationChain msgs = null;
			if (classNameParameter != null)
				msgs = ((InternalEObject)classNameParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER, null, msgs);
			if (newClassNameParameter != null)
				msgs = ((InternalEObject)newClassNameParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER, null, msgs);
			msgs = basicSetClassNameParameter(newClassNameParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER, newClassNameParameter, newClassNameParameter));
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
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar_WorkingDirectoryParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER, oldWorkingDirectoryParameter, newWorkingDirectoryParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)workingDirectoryParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER, null, msgs);
			if (newWorkingDirectoryParameter != null)
				msgs = ((InternalEObject)newWorkingDirectoryParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER, null, msgs);
			msgs = basicSetWorkingDirectoryParameter(newWorkingDirectoryParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER, newWorkingDirectoryParameter, newWorkingDirectoryParameter));
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
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar_OutputFileParameter()
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER, oldOutputFileParameter, newOutputFileParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getOutputFileParameter <em>Output File Parameter</em>}' containment reference.
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
				msgs = ((InternalEObject)outputFileParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER, null, msgs);
			if (newOutputFileParameter != null)
				msgs = ((InternalEObject)newOutputFileParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER, null, msgs);
			msgs = basicSetOutputFileParameter(newOutputFileParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER, newOutputFileParameter, newOutputFileParameter));
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
			case BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER:
				return basicSetClassNameParameter(null, msgs);
			case BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER:
				return basicSetWorkingDirectoryParameter(null, msgs);
			case BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER:
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
			case BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER:
				return getClassNameParameter();
			case BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER:
				return getWorkingDirectoryParameter();
			case BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER:
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
			case BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER:
				setClassNameParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER:
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
			case BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER:
				setClassNameParameter((WorkflowParameter)null);
				return;
			case BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)null);
				return;
			case BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER:
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
			case BuildPackage.JAVA_JAR__CLASS_NAME_PARAMETER:
				return classNameParameter != null;
			case BuildPackage.JAVA_JAR__WORKING_DIRECTORY_PARAMETER:
				return workingDirectoryParameter != null;
			case BuildPackage.JAVA_JAR__OUTPUT_FILE_PARAMETER:
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
		String[] command = {"jar", "-cf", (String) outputFileParameter.getValue(context), (String) classNameParameter.getValue(context) + ".class"};
		int rc = 0;
		
		try
		{
			logDebug(context, "Executing command: jar -cf " + command[2] + " " + command[3]);
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

} // JavaJar
