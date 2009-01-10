/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.execution.internal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.IdRef;
import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.Property;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.WorkflowRef;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.execution.MweInstantiationException;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.xtext.resource.ClassloaderClasspathUriResolver;

public class InternalInstantiator extends MweSwitch<Object> {
	private Map<String, Object> localVars = new HashMap<String, Object>();

	private TypeSystem typeSystem = null;
	private File file;
	private Stack<Type> typeStack = new Stack<Type>();

	public InternalInstantiator(TypeSystem typeSystem, File file, Map<String, Object> params) {
		super();
		this.typeSystem = typeSystem;
		if (params != null)
			localVars.putAll(params);
		this.file = file;
	}

	public Object instantiate() {
		return doSwitch(file);
	}

	@Override
	public Object caseFile(File object) {
		for (Property p : object.getProperties()) {
			doSwitch(p);
		}
		return doSwitch(object.getValue());
	}

	@Override
	public Object caseIdRef(IdRef object) {
		if (!localVars.containsKey(object.getId()))
			throw new MweInstantiationException("Couldn't find bean with id " + object.getId(), object);
		return localVars.get(object.getId());
	}

	@Override
	public Object caseWorkflowRef(WorkflowRef object) {
		URI uri = URI.createURI(object.getUri());
		uri = new ClassloaderClasspathUriResolver().resolve(getClass().getClassLoader(), uri);
		Resource resource2 = object.eResource();
		Resource resource = resource2.getResourceSet().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
		try {
			typeStack.push(null);
			File f = (File) resource.getContents().get(0); // TODO error handling
			Map<String, Object> params = new HashMap<String, Object>();
			for (Assignment ass : object.getAssignments()) {
				Object doSwitch = doSwitch(ass.getValue());
				params.put(ass.getFeature(), doSwitch);
			}
			return new InternalInstantiator(typeSystem,f,params).instantiate();
		} finally {
			typeStack.pop();
		}
	}

	@Override
	public Object caseComplexValue(ComplexValue complexValue) {
		Type t = findType(complexValue);
		if (t==null)
			throw new RuntimeException("Couldn't find type for "+complexValue);
		Object result = t.newInstance();
		if (complexValue.getId() != null)
			localVars.put(complexValue.getId(), result);
		try {
			typeStack.push(t);
			for (Assignment ass : complexValue.getAssignments()) {
				Object doSwitch = doSwitch(ass.getValue());
				t.inject(result, ass.getFeature(), doSwitch);
			}
		} finally {
			typeStack.pop();
		}
		return result;
	}

	private Type findType(ComplexValue complexValue) {
		if (complexValue.getClassName() != null)
			return typeSystem.typeForName(MweUtil.toString(complexValue.getClassName()), file);

		Assignment ass = (Assignment) complexValue.eContainer();
		if (ass == null)
			return null;
		Type peek = typeStack.peek();
		return peek.typeForFeature(ass.getFeature());
	}

	private Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
	@Override
	public Object caseSimpleValue(SimpleValue object) {
		String value = object.getValue();
		Matcher m = p.matcher(value);
		while (m.find()) {
			String var = m.group(1);
			String string = (String) localVars.get(var);
			value = m.replaceFirst(string);
			m = p.matcher(value);
		}
		return value;
	}

	@Override
	public Object caseLocalVariable(LocalVariable object) {
		if (!localVars.containsKey(object.getValue())) {
			if (object.getValue() == null)
				throw new MweInstantiationException("The parameter '" + object.getName() + "' must be passed in.",
						object);
			localVars.put(object.getName(),doSwitch(object.getValue()));
		}
		return super.caseLocalVariable(object);
	}

}
