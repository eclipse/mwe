package org.eclipse.emf.mwe.di.execution.internal;

import java.lang.reflect.Method;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe.di.execution.IReflectionHandler;
import org.eclipse.emf.mwe.di.execution.MweInstantiationException;
import org.eclipse.xtext.util.Strings;

public class InternalDefaultReflectionHandler implements IReflectionHandler {

	public void inject(Object target, String feature, boolean multiple, Object value) {
		try {
			Class<? extends Object> class1 = target.getClass();
			Method method = class1.getMethod(methodName(feature, multiple), new Class[] { value.getClass() });
			if (method != null) {
				method.invoke(target, value);
			} else {
				throw new MweInstantiationException("Couldn't find method " + methodName(feature, multiple) + "("
						+ value.getClass().getSimpleName() + ") for type " + class1.getSimpleName(), null);
			}
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	private String methodName(String feature, boolean multiple) {
		return multiple ? "add" + Strings.toFirstUpper(feature) : "set" + Strings.toFirstUpper(feature);
	}

	public Object instantiate(String className) {
		Class<Object> clazz = classForName(className);
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private Class<Object> classForName(String className) {
		try {
			Class<Object> clazz = (Class<Object>) Thread.currentThread().getContextClassLoader().loadClass(className);
			return clazz;
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	public String getFeaturesTypeName(String type, String feature, boolean multi) {
		Class<Object> clazz = classForName(type);
		String methodName = methodName(feature, multi);
		for (Method m : clazz.getMethods()) {
			if (m.getName().equals(methodName) && m.getParameterTypes().length==1) {
				return m.getParameterTypes()[0].getName();
			}
		}
		return null;
	}

}
