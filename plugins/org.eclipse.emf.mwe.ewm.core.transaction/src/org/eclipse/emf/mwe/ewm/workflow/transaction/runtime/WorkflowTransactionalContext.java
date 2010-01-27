/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowTransactionalContext.java,v 1.2 2010/01/27 22:01:34 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.runtime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowClearLogCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowGetExecutionInfoCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowGetParameterValueCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowGetStateCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowLogDebugCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowLogErrorCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowLogExceptionCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowLogInfoCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowLogWarningCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowSetExecutionInfoCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowSetParameterValueCommand;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands.WorkflowSetStateCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Workflow Transactional Context</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext#getEditingDomain <em>Editing Domain</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage#getWorkflowTransactionalContext()
 * @model kind="class"
 * @generated
 */
public class WorkflowTransactionalContext extends WorkflowContext
{
	/**
	 * The default value of the '{@link #getEditingDomain() <em>Editing Domain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEditingDomain()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionalEditingDomain EDITING_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditingDomain() <em>Editing Domain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEditingDomain()
	 * @generated
	 * @ordered
	 */
	protected TransactionalEditingDomain editingDomain = EDITING_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkflowTransactionalContext()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RuntimePackage.Literals.WORKFLOW_TRANSACTIONAL_CONTEXT;
	}

	/**
	 * Returns the value of the '<em><b>Editing Domain</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Domain</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Editing Domain</em>' attribute.
	 * @see #setEditingDomain(TransactionalEditingDomain)
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage#getWorkflowTransactionalContext_EditingDomain()
	 * @model dataType="org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionalEditingDomain" required="true" transient="true"
	 * @generated NOT
	 */
	public TransactionalEditingDomain getEditingDomain()
	{
		if (editingDomain == null)
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

		return editingDomain;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext#getEditingDomain <em>Editing Domain</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Editing Domain</em>' attribute.
	 * @see #getEditingDomain()
	 * @generated
	 */
	public void setEditingDomain(TransactionalEditingDomain newEditingDomain)
	{
		TransactionalEditingDomain oldEditingDomain = editingDomain;
		editingDomain = newEditingDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN, oldEditingDomain, editingDomain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN:
				return getEditingDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN:
				setEditingDomain((TransactionalEditingDomain) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN:
				setEditingDomain(EDITING_DOMAIN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN:
				return EDITING_DOMAIN_EDEFAULT == null ? editingDomain != null : !EDITING_DOMAIN_EDEFAULT.equals(editingDomain);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editingDomain: ");
		result.append(editingDomain);
		result.append(')');
		return result.toString();
	}

	@Override
	public EObject getParameterValue(WorkflowParameter parameter) throws WorkflowRuntimeException
	{
		WorkflowGetParameterValueCommand command = new WorkflowGetParameterValueCommand(this, parameter);

		try
		{
			getEditingDomain().runExclusive(command);
			return command.getResult();
		}
		catch (InterruptedException e)
		{
			throw new WorkflowRuntimeException(e);
		}
	}

	@Override
	public void setParameterValue(WorkflowParameter parameter, EObject value) throws WorkflowRuntimeException
	{
		WorkflowSetParameterValueCommand command = new WorkflowSetParameterValueCommand(this, parameter, value);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void clearLog(WorkflowComponent component)
	{
		WorkflowClearLogCommand command = new WorkflowClearLogCommand(this, component);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public WorkflowComponentExecutionInfo getExecutionInfo(WorkflowComponent component)
	{
		WorkflowGetExecutionInfoCommand command = new WorkflowGetExecutionInfoCommand(this, component);

		try
		{
			getEditingDomain().runExclusive(command);
			return command.getResult();
		}
		catch (InterruptedException e)
		{
			logException(component, e);
			return null;
		}
	}

	@Override
	public WorkflowState getState(WorkflowComponent component)
	{
		WorkflowGetStateCommand command = new WorkflowGetStateCommand(this, component);

		try
		{
			getEditingDomain().runExclusive(command);
			return command.getResult();
		}
		catch (InterruptedException e)
		{
			logException(component, e);
			return null;
		}
	}

	@Override
	public void logDebug(WorkflowComponent component, String message)
	{
		WorkflowLogDebugCommand command = new WorkflowLogDebugCommand(this, component, message);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void logError(WorkflowComponent component, String message)
	{
		WorkflowLogErrorCommand command = new WorkflowLogErrorCommand(this, component, message);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void logException(WorkflowComponent component, Exception exception)
	{
		WorkflowLogExceptionCommand command = new WorkflowLogExceptionCommand(this, component, exception);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void logInfo(WorkflowComponent component, String message)
	{
		WorkflowLogInfoCommand command = new WorkflowLogInfoCommand(this, component, message);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void logWarning(WorkflowComponent component, String message)
	{
		WorkflowLogWarningCommand command = new WorkflowLogWarningCommand(this, component, message);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void setExecutionInfo(WorkflowComponent component, WorkflowComponentExecutionInfo executionInfo)
	{
		WorkflowSetExecutionInfoCommand command = new WorkflowSetExecutionInfoCommand(this, component, executionInfo);
		getEditingDomain().getCommandStack().execute(command);
	}

	@Override
	public void setState(WorkflowComponent component, WorkflowState state)
	{
		WorkflowSetStateCommand command = new WorkflowSetStateCommand(this, component, state);
		getEditingDomain().getCommandStack().execute(command);
	}
} // WorkflowTransactionalContext
