package org.eclipse.emf.mwe.ewm.ui.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

public class WorkflowParameterEditorHelperConfiguration
{
	public WorkflowParameterEditorHelperConfiguration(IConfigurationElement config)
	{
		this.config = config;
	}
	
	public IWorkflowParameterEditorHelper getHelper()
	{
		try
		{
			if(helper == null)
				helper = (IWorkflowParameterEditorHelper) config.createExecutableExtension("helper");
		}
		catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return helper;
	}
	
	private IConfigurationElement config;
	private IWorkflowParameterEditorHelper helper;
}
