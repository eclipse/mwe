/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowComponentProxy.java,v 1.1 2009/04/25 04:21:35 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponentProxy()
 * @model kind="class"
 * @generated
 */
public class WorkflowComponentProxy extends WorkflowComponent
{
	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent targetComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentProxy()
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
		return WorkflowPackage.Literals.WORKFLOW_COMPONENT_PROXY;
	}

	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(WorkflowComponent)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponentProxy_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowComponent getTargetComponent()
	{
		if (targetComponent != null && targetComponent.eIsProxy())
		{
			InternalEObject oldTargetComponent = (InternalEObject)targetComponent;
			targetComponent = (WorkflowComponent)eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent basicGetTargetComponent()
	{
		return targetComponent;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	public void setTargetComponent(WorkflowComponent newTargetComponent)
	{
		WorkflowComponent oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				if (resolve) return getTargetComponent();
				return basicGetTargetComponent();
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				setTargetComponent((WorkflowComponent)newValue);
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				setTargetComponent((WorkflowComponent)null);
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				return targetComponent != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#accept(org.eclipse.emf.mwe.ewm.workflow.IWorkflowVisitor)
	 */
	@Override
	public void accept(IWorkflowVisitor visitor)
	{
		getTargetComponent().accept(visitor);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#clearLog(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public void clearLog(WorkflowContext context)
	{
		getTargetComponent().clearLog(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getComponentOrchestrationStrategy()
	 */
	@Override
	public WorkflowComponentOrchestrationStrategy getComponentOrchestrationStrategy()
	{
		return getTargetComponent().getComponentOrchestrationStrategy();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getDescription()
	 */
	@Override
	public String getDescription()
	{
		return getTargetComponent().getDescription();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getExecutionInfo(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public WorkflowComponentExecutionInfo getExecutionInfo(WorkflowContext context)
	{
		return getTargetComponent().getExecutionInfo(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getLog(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public WorkflowLog getLog(WorkflowContext context)
	{
		return getTargetComponent().getLog(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getName()
	 */
	@Override
	public String getName()
	{
		return getTargetComponent().getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getState(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public WorkflowState getState(WorkflowContext context)
	{
		return getTargetComponent().getState(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getType()
	 */
	@Override
	public String getType()
	{
		return getTargetComponent().getType();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#run(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext)
	 */
	@Override
	public WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException
	{
		return getTargetComponent().run(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#setComponentOrchestrationStrategy(org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy)
	 */
	@Override
	public void setComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy newComponentOrchestrationStrategy)
	{
		getTargetComponent().setComponentOrchestrationStrategy(newComponentOrchestrationStrategy);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String newDescription)
	{
		getTargetComponent().setDescription(newDescription);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#setExecutionInfo(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo)
	 */
	@Override
	public void setExecutionInfo(WorkflowContext context, WorkflowComponentExecutionInfo executionInfo)
	{
		getTargetComponent().setExecutionInfo(context, executionInfo);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#setName(java.lang.String)
	 */
	@Override
	public void setName(String newName)
	{
		getTargetComponent().setName(newName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#SetState(org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext, org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState)
	 */
	@Override
	public void setState(WorkflowContext context, WorkflowState state)
	{
		getTargetComponent().setState(context, state);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#setType(java.lang.String)
	 */
	@Override
	public void setType(String newType)
	{
		getTargetComponent().setType(newType);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#toString()
	 */
	@Override
	public String toString()
	{
		return getTargetComponent().toString();
	}

	
} // WorkflowComponentProxy
