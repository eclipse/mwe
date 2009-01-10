/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.app;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine;

public class WorkflowRunner
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("workflow", new XMIResourceFactoryImpl());
		WorkflowPackage.eINSTANCE.eClass();
		run(args[0]);
	}
	
	public static void run(String workflow)
	{
		URI uri = URI.createFileURI(workflow);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource workflowResource = resourceSet.getResource(uri, true);
		
		WorkflowEngine engine = null;
		
		if(workflowResource.getContents().get(0) instanceof WorkflowEngine)
		{
			engine = (WorkflowEngine) workflowResource.getContents().get(0);
		}
		else
		{
			engine = RuntimeFactory.eINSTANCE.createWorkflowEngine();
			engine.setWorkflow((WorkflowComponent) workflowResource.getContents().get(0));
			engine.setContext(RuntimeFactory.eINSTANCE.createWorkflowContext());
		}
		
		engine.run();		
	}
	
	private WorkflowRunner()
	{}
}
