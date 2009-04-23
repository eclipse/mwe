package org.eclipse.emf.mwe.ewm.ui.editor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;

public interface IWorkflowParameterEditorHelper
{
	Command createAddCommand(EditingDomain editingDomain, WorkflowUnitOfWork component, WorkflowParameter parameter);
	WorkflowParameter createParameter();
	Command createRemove(EditingDomain editingDomain, WorkflowUnitOfWork component, WorkflowParameter parameter);
	EClass getParameterEClass();
}
