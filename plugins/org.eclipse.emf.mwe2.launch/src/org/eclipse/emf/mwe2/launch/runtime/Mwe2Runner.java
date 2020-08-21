/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.xtext.mwe.RuntimeResourceSetInitializer;
import org.eclipse.xtext.mwe.UriFilter;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
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
	private Provider<IWorkflowContext> ctxProvider;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	public void run(URI createURI, Map<String, String> params) {
		run(createURI, params, ctxProvider.get());
	}

	public void run(URI createURI, Map<String, String> params, IWorkflowContext ctx) {
		ResourceSet resourceSet = getConfiguredResourceSet();
		Resource resource = resourceSet.getResource(createURI, true);
		if (resource != null) {
			if (!resource.getContents().isEmpty()) {
				EObject eObject = resource.getContents().get(0);
				if (eObject instanceof Module) {
					run(((Module) eObject), params, ctx);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Couldn't load module from URI " + createURI);
	}

	public void run(String moduleName, Map<String, String> params) {
		run(moduleName, params, ctxProvider.get());
	}
	
	public void run(String moduleName, Map<String, String> params, IWorkflowContext ctx) {
		Module module = findModule(moduleName);
		if (module == null) {
			throw new IllegalStateException("Couldn't find module "+moduleName);
		}
		run(module, params, ctx);
	}
	
	public void run(Module module, Map<String, String> params, IWorkflowContext ctx) {
		if (module == null) {
			throw new IllegalArgumentException("No module provided ");
		}
		EcoreUtil.resolveAll(module);
		if (!module.eResource().getErrors().isEmpty()) {
			throw new IllegalStateException(module.eResource().getErrors().toString());
		}
		Map<QualifiedName, Object> actualParams = getRealParams(params);
		Object object = null;
		try {
			object = engine.create(module, actualParams);
		} catch (RuntimeException e) {
			throw new RuntimeException("Problems instantiating module " + module.getCanonicalName() + ": " + e.getMessage(), e);
		}
		if (!(object instanceof IWorkflow)) {
			throw new IllegalArgumentException("The root element must be of type IWorkflow but was '"
					+ object.getClass() + "'.");
		}
		try {
			((IWorkflow) object).run(ctx);
		} catch (RuntimeException e) {
			throw new RuntimeException("Problems running workflow " + module.getCanonicalName() + ": " + e.getMessage(), e);
		}
	}

	protected Map<QualifiedName, Object> getRealParams(Map<String, String> params) {
		HashMap<QualifiedName, Object> map = Maps.newHashMap();
		for (Map.Entry<String, String> param : params.entrySet()) {
			map.put(qualifiedNameConverter.toQualifiedName(param.getKey()), param.getValue());
		}
		return map;
	}

	protected Module findModule(String moduleName) {
		System.err.println(moduleName);
		ResourceSet resourceSet = getConfiguredResourceSet();
		IResourceDescriptions descriptions = initializer.getDescriptions(resourceSet);
		for (IResourceDescription desc : descriptions.getAllResourceDescriptions()) {
			Iterable<IEObjectDescription> iterable = desc.getExportedObjects(Mwe2Package.Literals.MODULE,
					qualifiedNameConverter.toQualifiedName(moduleName), false);
			for (IEObjectDescription objDesc : iterable) {
				return (Module) resourceSet.getEObject(objDesc.getEObjectURI(), true);
			}
		}
		return null;
	}

	protected ResourceSet getConfiguredResourceSet() {
		ResourceSet resourceSet = initializer.getInitializedResourceSet(getPathes(), new UriFilter() {
			public boolean matches(URI uri) {
				return "mwe2".equalsIgnoreCase(uri.fileExtension());
			}
		});
		return resourceSet;
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

}
