/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowParameterPredicate.java,v 1.2 2009/05/14 04:53:53 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Parameter Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParameterPredicate()
 * @model kind="class"
 * @generated
 */
public class WorkflowParameterPredicate extends WorkflowExecutionPredicate
{
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterPredicate()
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
		return OrchestrationPackage.Literals.WORKFLOW_PARAMETER_PREDICATE;
	}

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParameterPredicate_Parameter()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowParameter getParameter()
	{
		if (parameter != null && parameter.eIsProxy())
		{
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (WorkflowParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetParameter()
	{
		return parameter;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	public void setParameter(WorkflowParameter newParameter)
	{
		WorkflowParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER, oldParameter, parameter));
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
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER:
				setParameter((WorkflowParameter)newValue);
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
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER:
				setParameter((WorkflowParameter)null);
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
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate#evaluate(org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public boolean evaluate(WorkflowComponent component, WorkflowContext context)
	{
		try
		{
			return (Boolean) getParameter().getValue(context);
		}
		catch (WorkflowRuntimeException e)
		{
			component.getLog(context).logException(e);
		}
		
		return false;
	}
} // WorkflowParameterPredicate
