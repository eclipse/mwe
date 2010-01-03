package org.eclipse.emf.mwe.ewm.ui.editor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowFactory;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;

public class WorkflowParameterEditorHelper implements IWorkflowParameterEditorHelper
{
	public Command createAddCommand(EditingDomain editingDomain, WorkflowUnitOfWork component, WorkflowParameter parameter)
	{
//		return AddCommand.create(editingDomain, component, WorkflowPackage.Literals.WORKFLOW_UNIT_OF_WORK__PARAMETERS, parameter);
		return null;
	}

	public WorkflowParameter createParameter()
	{
		WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setType(EcorePackage.Literals.ESTRING);
		parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		return parameter;
	}

	public Command createRemove(EditingDomain editingDomain, WorkflowUnitOfWork component, WorkflowParameter parameter)
	{
//		return RemoveCommand.create(editingDomain, component, WorkflowPackage.Literals.WORKFLOW_UNIT_OF_WORK__PARAMETERS, parameter);
		return null;
	}

	public EClass getParameterEClass()
	{
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER;
	}
}
