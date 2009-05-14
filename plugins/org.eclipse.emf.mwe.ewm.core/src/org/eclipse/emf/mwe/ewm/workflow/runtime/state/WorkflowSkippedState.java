/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowSkippedState.java,v 1.1 2009/05/14 04:12:31 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime.state;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Skipped State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowSkippedState()
 * @model kind="class"
 * @generated
 */
public class WorkflowSkippedState extends WorkflowState
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowSkippedState()
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
		return StatePackage.Literals.WORKFLOW_SKIPPED_STATE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState#getDisplayName()
	 */
	@Override
	public String getDisplayName()
	{
		return "Skipped";
	}

} // WorkflowSkippedState
