/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowLoopComponentOrchestrationStrategy.java,v 1.1 2009/05/14 04:12:28 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Loop Component Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopComponentOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowLoopComponentOrchestrationStrategy extends WorkflowComponentOrchestrationStrategy
{
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected WorkflowExecutionPredicate condition;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLoopComponentOrchestrationStrategy()
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
		return OrchestrationPackage.Literals.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY;
	}

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(WorkflowExecutionPredicate)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopComponentOrchestrationStrategy_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowExecutionPredicate getCondition()
	{
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(WorkflowExecutionPredicate newCondition, NotificationChain msgs)
	{
		WorkflowExecutionPredicate oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	public void setCondition(WorkflowExecutionPredicate newCondition)
	{
		if (newCondition != condition)
		{
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, newCondition, newCondition));
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
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return basicSetCondition(null, msgs);
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
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return getCondition();
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
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				setCondition((WorkflowExecutionPredicate)newValue);
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
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				setCondition((WorkflowExecutionPredicate)null);
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
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#run(org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public void run(WorkflowComponent component, WorkflowContext context)
	{
		boolean runOnce = false;
		
		while(getCondition().evaluate(component, context))
		{
			runOnce = true;
			super.run(component, context);
			
			if(!(component.getState(context) instanceof WorkflowSuccessState))
				break;
		}
		
		if(!runOnce)
			component.setState(context, StateFactory.eINSTANCE.createWorkflowSkippedState());
	}

	
} // WorkflowLoopComponentOrchestrationStrategy
