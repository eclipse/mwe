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
 * A representation of the model object '<em><b>Java Compiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClassNameParameter <em>Class Name Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClasspathParameter <em>Classpath Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler()
 * @model kind="class"
 * @generated
 */
public class JavaCompiler extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getClassNameParameter() <em>Class Name Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNameParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter classNameParameter;

	/**
	 * The cached value of the '{@link #getClasspathParameter() <em>Classpath Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasspathParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter classpathParameter;

	/**
	 * The cached value of the '{@link #getWorkingDirectoryParameter() <em>Working Directory Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectoryParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter workingDirectoryParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaCompiler()
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
		return BuildPackage.Literals.JAVA_COMPILER;
	}

	/**
	 * Returns the value of the '<em><b>Class Name Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name Parameter</em>' reference.
	 * @see #setClassNameParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler_ClassNameParameter()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowParameter getClassNameParameter()
	{
		if (classNameParameter != null && classNameParameter.eIsProxy())
		{
			InternalEObject oldClassNameParameter = (InternalEObject)classNameParameter;
			classNameParameter = (WorkflowParameter)eResolveProxy(oldClassNameParameter);
			if (classNameParameter != oldClassNameParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER, oldClassNameParameter, classNameParameter));
			}
		}
		return classNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetClassNameParameter()
	{
		return classNameParameter;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClassNameParameter <em>Class Name Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name Parameter</em>' reference.
	 * @see #getClassNameParameter()
	 * @generated
	 */
	public void setClassNameParameter(WorkflowParameter newClassNameParameter)
	{
		WorkflowParameter oldClassNameParameter = classNameParameter;
		classNameParameter = newClassNameParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER, oldClassNameParameter, classNameParameter));
	}

	/**
	 * Returns the value of the '<em><b>Classpath Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classpath Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classpath Parameter</em>' reference.
	 * @see #setClasspathParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler_ClasspathParameter()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowParameter getClasspathParameter()
	{
		if (classpathParameter != null && classpathParameter.eIsProxy())
		{
			InternalEObject oldClasspathParameter = (InternalEObject)classpathParameter;
			classpathParameter = (WorkflowParameter)eResolveProxy(oldClasspathParameter);
			if (classpathParameter != oldClasspathParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER, oldClasspathParameter, classpathParameter));
			}
		}
		return classpathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetClasspathParameter()
	{
		return classpathParameter;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClasspathParameter <em>Classpath Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classpath Parameter</em>' reference.
	 * @see #getClasspathParameter()
	 * @generated
	 */
	public void setClasspathParameter(WorkflowParameter newClasspathParameter)
	{
		WorkflowParameter oldClasspathParameter = classpathParameter;
		classpathParameter = newClasspathParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER, oldClasspathParameter, classpathParameter));
	}

	/**
	 * Returns the value of the '<em><b>Working Directory Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Directory Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory Parameter</em>' reference.
	 * @see #setWorkingDirectoryParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler_WorkingDirectoryParameter()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowParameter getWorkingDirectoryParameter()
	{
		if (workingDirectoryParameter != null && workingDirectoryParameter.eIsProxy())
		{
			InternalEObject oldWorkingDirectoryParameter = (InternalEObject)workingDirectoryParameter;
			workingDirectoryParameter = (WorkflowParameter)eResolveProxy(oldWorkingDirectoryParameter);
			if (workingDirectoryParameter != oldWorkingDirectoryParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER, oldWorkingDirectoryParameter, workingDirectoryParameter));
			}
		}
		return workingDirectoryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetWorkingDirectoryParameter()
	{
		return workingDirectoryParameter;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory Parameter</em>' reference.
	 * @see #getWorkingDirectoryParameter()
	 * @generated
	 */
	public void setWorkingDirectoryParameter(WorkflowParameter newWorkingDirectoryParameter)
	{
		WorkflowParameter oldWorkingDirectoryParameter = workingDirectoryParameter;
		workingDirectoryParameter = newWorkingDirectoryParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER, oldWorkingDirectoryParameter, workingDirectoryParameter));
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
			case BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER:
				if (resolve) return getClassNameParameter();
				return basicGetClassNameParameter();
			case BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER:
				if (resolve) return getClasspathParameter();
				return basicGetClasspathParameter();
			case BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER:
				if (resolve) return getWorkingDirectoryParameter();
				return basicGetWorkingDirectoryParameter();
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
			case BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER:
				setClassNameParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER:
				setClasspathParameter((WorkflowParameter)newValue);
				return;
			case BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)newValue);
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
			case BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER:
				setClassNameParameter((WorkflowParameter)null);
				return;
			case BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER:
				setClasspathParameter((WorkflowParameter)null);
				return;
			case BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER:
				setWorkingDirectoryParameter((WorkflowParameter)null);
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
			case BuildPackage.JAVA_COMPILER__CLASS_NAME_PARAMETER:
				return classNameParameter != null;
			case BuildPackage.JAVA_COMPILER__CLASSPATH_PARAMETER:
				return classpathParameter != null;
			case BuildPackage.JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER:
				return workingDirectoryParameter != null;
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
		String[] command = {"javac", "-cp", (String) classpathParameter.getValue(context), (String) classNameParameter.getValue(context) + ".java"};
		int rc = 0;
		
		try
		{
			logDebug(context, "Executing command: javac -cp " + command[2] + " " + command[3]);
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

} // JavaCompiler
