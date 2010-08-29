/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.launch.runtime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.factory.Mwe2ExecutionEngine;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflow;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.xtext.mwe.RuntimeResourceSetInitializer;
import org.eclipse.xtext.mwe.UriFilter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class Mwe2Runner {

	@Inject
	private RuntimeResourceSetInitializer initializer;

	@Inject
	private Mwe2ExecutionEngine engine;

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject(optional=true)
	private IWorkflowContext context = new WorkflowContextImpl();
	
	public void run(URI createURI, Map<String, String> params) {
		Resource resource = resourceSetProvider.get().getResource(createURI, true);
		if (resource != null) {
			if (!resource.getContents().isEmpty()) {
				EObject eObject = resource.getContents().get(0);
				if (eObject instanceof Module) {
					run(((Module) eObject).getCanonicalName(), params);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Couldn't load module from URI " + createURI);
	}

	public void run(String moduleName, Map<String, String> params) {
		Module module = findModule(moduleName);
		if (module == null)
			throw new IllegalArgumentException("Couldn't find module with name '" + moduleName + "'.");
		EcoreUtil.resolveAll(module);
		if (!module.eResource().getErrors().isEmpty()) {
			throw new IllegalStateException(module.eResource().getErrors().toString());
		}
		Map<String, Object> actualParams = getRealParams(params);
		Object object = null;
		try {
			object = engine.create(module, actualParams);
		} catch (RuntimeException e) {
			throw new RuntimeException("Problems instantiating module " + moduleName + ": " + e.getMessage(), e);
		}
		if (!(object instanceof IWorkflow)) {
			throw new IllegalArgumentException("The root element must be of type IWorkflow but was '"
					+ object.getClass() + "'.");
		}
		try {
			((IWorkflow) object).run(context);
		} catch (RuntimeException e) {
			throw new RuntimeException("Problems running workflow " + moduleName + ": " + e.getMessage(), e);
		}
	}

	protected Map<String, Object> getRealParams(Map<String, String> params) {
		HashMap<String, Object> map = Maps.newHashMap();
		map.putAll(params);
		return map;
	}

	protected Module findModule(String moduleName) {
		ResourceSet resourceSet = initializer.getInitializedResourceSet(getPathes(), new UriFilter() {
			public boolean matches(URI uri) {
				return "mwe2".equalsIgnoreCase(uri.fileExtension());
			}
		});
		IResourceDescriptions descriptions = initializer.getDescriptions(resourceSet);
		for (IResourceDescription desc : descriptions.getAllResourceDescriptions()) {
			Iterable<IEObjectDescription> iterable = desc.getExportedObjects(Mwe2Package.Literals.MODULE, moduleName);
			for (IEObjectDescription objDesc : iterable) {
				return (Module) resourceSet.getEObject(objDesc.getEObjectURI(), true);
			}
		}
		return null;
	}

	protected List<String> getPathes() {
		return initializer.getClassPathEntries();
	}

	public void setEngine(Mwe2ExecutionEngine engine) {
		this.engine = engine;
	}

	public void setInitializer(RuntimeResourceSetInitializer initializer) {
		this.initializer = initializer;
	}
	
	public void setWorkflowContext (IWorkflowContext context) {
		this.context = context;
	}
	
	public IWorkflowContext getWorkflowContext () {
		return context;
	}

}
