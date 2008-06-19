package org.eclipse.emf.mwe.di.execution;

import java.util.Map;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.execution.internal.InternalInstantiator;
import org.eclipse.emf.mwe.di.types.CompositeTypeSystem;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.emf.mwe.di.types.emf.EMFTypeSystem;
import org.eclipse.emf.mwe.di.types.java.JavaTypeSystem;

public class Instantiator {
	
	public Object instantiate(File file) {
		return instantiate(file,null,new CompositeTypeSystem(new EMFTypeSystem(),new JavaTypeSystem(Thread.currentThread().getContextClassLoader())));
	}
	
	public Object instantiate(File file, Map<String,Object> params, TypeSystem typeSystem) {
		return new InternalInstantiator(typeSystem,file, params).instantiate();
	}
	
}
