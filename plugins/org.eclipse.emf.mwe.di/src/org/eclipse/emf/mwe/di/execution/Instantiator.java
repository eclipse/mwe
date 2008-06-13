package org.eclipse.emf.mwe.di.execution;

import java.util.Map;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.execution.internal.InternalDefaultReflectionHandler;
import org.eclipse.emf.mwe.di.execution.internal.InternalInstantiator;

public class Instantiator {
	
	public Object instantiate(File file) {
		return instantiate(file,null,null);
	}
	
	public Object instantiate(File file, Map<String,String> params, Map<String,Object> beans) {
		return new InternalInstantiator(reflectionHandler).instantiate(file, params, beans);
	}
	
	private IReflectionHandler reflectionHandler = new InternalDefaultReflectionHandler();
}
