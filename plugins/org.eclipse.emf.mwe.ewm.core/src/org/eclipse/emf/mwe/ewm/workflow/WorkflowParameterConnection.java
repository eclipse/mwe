/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getTargetParameters <em>Target Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterConnection()
 * @model kind="class"
 * @generated
 */
public class WorkflowParameterConnection extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getSourceParameter() <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter sourceParameter;

	/**
	 * The cached value of the '{@link #getTargetParameters() <em>Target Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameter> targetParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterConnection()
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
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER_CONNECTION;
	}

	/**
	 * Returns the value of the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Parameter</em>' reference.
	 * @see #setSourceParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterConnection_SourceParameter()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowParameter getSourceParameter()
	{
		if (sourceParameter != null && sourceParameter.eIsProxy())
		{
			InternalEObject oldSourceParameter = (InternalEObject)sourceParameter;
			sourceParameter = (WorkflowParameter)eResolveProxy(oldSourceParameter);
			if (sourceParameter != oldSourceParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER, oldSourceParameter, sourceParameter));
			}
		}
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetSourceParameter()
	{
		return sourceParameter;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getSourceParameter <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Parameter</em>' reference.
	 * @see #getSourceParameter()
	 * @generated
	 */
	public void setSourceParameter(WorkflowParameter newSourceParameter)
	{
		WorkflowParameter oldSourceParameter = sourceParameter;
		sourceParameter = newSourceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER, oldSourceParameter, sourceParameter));
	}

	/**
	 * Returns the value of the '<em><b>Target Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameters</em>' reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterConnection_TargetParameters()
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection
	 * @model opposite="connection" required="true"
	 * @generated
	 */
	public EList<WorkflowParameter> getTargetParameters()
	{
		if (targetParameters == null)
		{
			targetParameters = new EObjectWithInverseResolvingEList<WorkflowParameter>(WorkflowParameter.class, this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION);
		}
		return targetParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				return ((InternalEList<?>)getTargetParameters()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER:
				if (resolve) return getSourceParameter();
				return basicGetSourceParameter();
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				return getTargetParameters();
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER:
				setSourceParameter((WorkflowParameter)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				getTargetParameters().clear();
				getTargetParameters().addAll((Collection<? extends WorkflowParameter>)newValue);
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER:
				setSourceParameter((WorkflowParameter)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				getTargetParameters().clear();
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER:
				return sourceParameter != null;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS:
				return targetParameters != null && !targetParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ParameterConnection
