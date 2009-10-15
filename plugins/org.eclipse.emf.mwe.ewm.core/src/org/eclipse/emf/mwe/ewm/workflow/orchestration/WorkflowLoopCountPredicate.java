/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowLoopCountPredicate.java,v 1.5 2009/10/15 15:18:26 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workflow Loop Count Predicate</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getCurrentCount <em>Current Count</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getLoopCount <em>Loop Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopCountPredicate()
 * @model kind="class"
 * @generated
 */
public class WorkflowLoopCountPredicate extends WorkflowExecutionPredicate
{
	/**
	 * The cached value of the '{@link #getCurrentCount() <em>Current Count</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCurrentCount()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter currentCount;

	/**
	 * The cached value of the '{@link #getLoopCount() <em>Loop Count</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLoopCount()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter loopCount;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLoopCountPredicate()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return OrchestrationPackage.Literals.WORKFLOW_LOOP_COUNT_PREDICATE;
	}

	/**
	 * Returns the value of the '<em><b>Current Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Count</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Count</em>' containment reference.
	 * @see #setCurrentCount(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopCountPredicate_CurrentCount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getCurrentCount()
	{
		return currentCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentCount(WorkflowParameter newCurrentCount, NotificationChain msgs)
	{
		WorkflowParameter oldCurrentCount = currentCount;
		currentCount = newCurrentCount;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT, oldCurrentCount, newCurrentCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getCurrentCount <em>Current Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Count</em>' containment reference.
	 * @see #getCurrentCount()
	 * @generated
	 */
	public void setCurrentCount(WorkflowParameter newCurrentCount)
	{
		if (newCurrentCount != currentCount)
		{
			NotificationChain msgs = null;
			if (currentCount != null)
				msgs = ((InternalEObject)currentCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT, null, msgs);
			if (newCurrentCount != null)
				msgs = ((InternalEObject)newCurrentCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT, null, msgs);
			msgs = basicSetCurrentCount(newCurrentCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT, newCurrentCount, newCurrentCount));
	}

	/**
	 * Returns the value of the '<em><b>Loop Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Count</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Count</em>' containment reference.
	 * @see #setLoopCount(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopCountPredicate_LoopCount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameter getLoopCount()
	{
		return loopCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCount(WorkflowParameter newLoopCount, NotificationChain msgs)
	{
		WorkflowParameter oldLoopCount = loopCount;
		loopCount = newLoopCount;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT, oldLoopCount, newLoopCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getLoopCount <em>Loop Count</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Loop Count</em>' containment reference.
	 * @see #getLoopCount()
	 * @generated
	 */
	public void setLoopCount(WorkflowParameter newLoopCount)
	{
		if (newLoopCount != loopCount)
		{
			NotificationChain msgs = null;
			if (loopCount != null)
				msgs = ((InternalEObject)loopCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT, null, msgs);
			if (newLoopCount != null)
				msgs = ((InternalEObject)newLoopCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT, null, msgs);
			msgs = basicSetLoopCount(newLoopCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT, newLoopCount, newLoopCount));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT:
				return basicSetCurrentCount(null, msgs);
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT:
				return basicSetLoopCount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT:
				return getCurrentCount();
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT:
				return getLoopCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT:
				setCurrentCount((WorkflowParameter)newValue);
				return;
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT:
				setLoopCount((WorkflowParameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT:
				setCurrentCount((WorkflowParameter)null);
				return;
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT:
				setLoopCount((WorkflowParameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT:
				return currentCount != null;
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT:
				return loopCount != null;
		}
		return super.eIsSet(featureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate#evaluate(org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent,
	 * org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public boolean evaluate(WorkflowComponent component, WorkflowContext context)
	{
		try
		{
			WorkflowState currentState = component.getState(context);
			
			if (currentState instanceof WorkflowIdleState || currentState instanceof WorkflowFailedState || currentState instanceof WorkflowErrorState)
				getCurrentCount().setValue(context, new Integer(0));

			int current = (Integer) getCurrentCount().getValue(context);
			int loop = (Integer) getLoopCount().getValue(context);
			
			if(current < loop)
			{
				getCurrentCount().setValue(context, ++current);
				return true;
			}
		}
		catch (WorkflowRuntimeException e)
		{
			component.logException(context, e);
		}

		return false;
	}

} // WorkflowLoopCountPredicate
