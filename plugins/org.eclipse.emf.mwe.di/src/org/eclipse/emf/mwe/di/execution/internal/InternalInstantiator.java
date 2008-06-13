package org.eclipse.emf.mwe.di.execution.internal;

import static org.eclipse.emf.mwe.di.MweUtil.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.mwe.di.execution.IReflectionHandler;
import org.eclipse.emf.mwe.di.execution.MweInstantiationException;
import org.eclipse.emf.mwe.util.MweSwitch;


public class InternalInstantiator extends MweSwitch<Object> {
	private Map<String, String> properties = new HashMap<String, String>();
	private Map<String, Object> beans = new HashMap<String, Object>();
	
	private IReflectionHandler reflHandler = null;

	public InternalInstantiator(IReflectionHandler reflHandler) {
		super();
		this.reflHandler = reflHandler;
	}

	public Object instantiate(File file, Map<String, String> params, Map<String, Object> beans) {
		if (params != null)
			properties.putAll(params);
		if (beans != null)
			this.beans.putAll(beans);
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
		if (!beans.containsKey(object.getId()))
			throw new MweInstantiationException("Couldn't find bean with id " + object.getId(), object);
		return beans.get(object.getId());
	}
	
	@Override
	public Object caseWorkflowRef(WorkflowRef object) {
		Resource resource = object.eResource().getResourceSet().createResource(URI.createURI(object.getUri()));
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
		EObject object2 = resource.getContents().get(0);
		return doSwitch(object2);
	}

	@Override
	public Object caseComplexValue(ComplexValue complexValue) {
		String className = findJavaClassName(complexValue);
		Object result = reflHandler.instantiate(className);
		if (complexValue.getId() != null)
			beans.put(complexValue.getId(), result);
		for (Assignment ass : complexValue.getAssignments()) {
			Object doSwitch = doSwitch(ass.getValue());
			reflHandler.inject(result, ass.getFeature(), isMulti(ass), doSwitch);
		}
		return result;
	}
	
	private String findJavaClassName(ComplexValue complexValue) {
		if (complexValue.getClassName()!=null) 
			return MweUtil.toString(complexValue.getClassName());
		
		Assignment ass = (Assignment) complexValue.eContainer();
		if (ass==null)
			return null;
		
		String parentsType = findJavaClassName((ComplexValue) ass.eContainer());
		return reflHandler.getFeaturesTypeName(parentsType,ass.getFeature(),isMulti(ass));
	}


	@Override
	public Object caseSimpleValue(SimpleValue object) {
		return object.getValue();
	}

	@Override
	public Object caseLocalVariable(LocalVariable object) {
		if (!properties.containsKey(object.getValue())) {
			if (object.getValue() == null)
				throw new MweInstantiationException("The parameter '" + object.getName() + "' must be passed in.",
						object);
			properties.put(object.getValue(), object.getName());
		}
		return super.caseLocalVariable(object);
	}

	public Object instantiate(File file) {
		return instantiate(file, null, null);
	}
}
