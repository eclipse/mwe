package org.eclipse.emf.mwe.ewm.ui.editor;

import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy;

public class WorkflowEditorExtensions
{
	public static String[] getComponentOrchestrationStrategies()
	{
		if(components == null)
			initOrchestrationExtensions();
		
		String[] names = components.keySet().toArray(new String[0]);
		Arrays.sort(names);
		return names;
	}
	
	public static WorkflowComponentOrchestrationStrategy createComponentOrchestrationStrategy(String name)
	{
		if(components == null)
			initOrchestrationExtensions();
		
		WorkflowComponentOrchestrationStrategyFactory factory = components.get(name);
		
		if(factory == null)
			return null;
		
		return factory.create();
	}
	
	public static String getDisplayNameForComponentStrategy(String className)
	{
		if(componentXRef == null)
			initOrchestrationExtensions();
		
		return componentXRef.get(className);
	}
	
	public static IWorkflowParameterEditorHelper getParameterHelper(String type)
	{
		if(parameterEditorHelpers == null)
			initParameterExtensions();
		
		return parameterEditorHelpers.get(type).getHelper();
	}
	
	public static IWorkflowParameterEditorHelper getParameterHelper(EClass eClass)
	{
		if(parameterEditorHelperXRef == null)
			initParameterExtensions();

		return parameterEditorHelpers.get(parameterEditorHelperXRef.get(eClass.getName())).getHelper();
	}
	
	public static String[] getParameterTypes()
	{
		String types[] = parameterEditorHelpers.keySet().toArray(new String[0]);
		Arrays.sort(types);
		return types;
	}
	
	private WorkflowEditorExtensions()
	{}
	
	private static void initOrchestrationExtensions()
	{
		components = new HashMap<String, WorkflowComponentOrchestrationStrategyFactory>();
		componentXRef = new HashMap<String, String>();
		
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint("org.eclipse.emf.mwe.ewm.ui", "orchestration").getExtensions();
		
		for(IExtension extension : extensions)
		{
			for(IConfigurationElement configElement : extension.getConfigurationElements())
			{
				parseOrchestrationType(configElement);
			}
		}
	}
	
	private static void initParameterExtensions()
	{
		parameterEditorHelpers = new HashMap<String, WorkflowParameterEditorHelperConfiguration>();
		parameterEditorHelperXRef = new HashMap<String, String>();
		
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint("org.eclipse.emf.mwe.ewm.ui", "parameter").getExtensions();
		
		for(IExtension extension : extensions)
		{
			for(IConfigurationElement configElement : extension.getConfigurationElements())
			{
				parseParameterType(configElement);
			}
		}
	}

	private static void parseOrchestrationType(IConfigurationElement configElement)
	{
		if(configElement.getName().equals("component"))
		{
			String displayName = configElement.getAttribute("displayName");
			String nsURI = configElement.getAttribute("nsURI");
			String className = configElement.getAttribute("class");
			className = className.substring(className.lastIndexOf('.') + 1);
			
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
			components.put(displayName, new WorkflowComponentOrchestrationStrategyFactory(ePackage, className));
			componentXRef.put(className, displayName);
		}
	}
	
	private static void parseParameterType(IConfigurationElement configElement)
	{
		if(configElement.getName().equals("type"))
		{
			String name = configElement.getAttribute("name");
			String type = configElement.getAttribute("class");
			type = type.substring(type.lastIndexOf('.') + 1);
			
			parameterEditorHelpers.put(name, new WorkflowParameterEditorHelperConfiguration(configElement));
			parameterEditorHelperXRef.put(type, name);
		}
	}

	private static class WorkflowComponentOrchestrationStrategyFactory
	{
		public WorkflowComponentOrchestrationStrategyFactory(EPackage ePackage, String name)
		{
			this.ePackage = ePackage;
			this.name = name;
		}
		
		public WorkflowComponentOrchestrationStrategy create()
		{
			return (WorkflowComponentOrchestrationStrategy) ePackage.getEFactoryInstance().create((EClass) ePackage.getEClassifier(name));
		}
		
		private EPackage ePackage;
		private String name;
	}
	
	private static HashMap<String, WorkflowComponentOrchestrationStrategyFactory> components;
	public static HashMap<String, String> componentXRef;
	
	public static HashMap<String, WorkflowParameterEditorHelperConfiguration> parameterEditorHelpers;
	public static HashMap<String, String> parameterEditorHelperXRef;
}
