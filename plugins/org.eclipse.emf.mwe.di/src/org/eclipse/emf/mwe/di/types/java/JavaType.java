package org.eclipse.emf.mwe.di.types.java;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe.di.execution.MweInstantiationException;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.xtext.util.Strings;

public class JavaType implements Type {

	private Class<?> clazz;

	public JavaType(Class<?> class1) {
		this.clazz = class1;
	}

	public void inject(Object target, String feature, Object value) {
		try {
			Class<?> class1 = target.getClass();
			String[] methodNames = methodNames(feature);
			for (String methodName : methodNames) {
				try {
					Method method = class1.getMethod(methodName, new Class[] { value.getClass() });
					if (method != null) {
						method.invoke(target, value);
						return;
					}
				} catch (NoSuchMethodException e) {
					// ignore
				}
			}
			throw new MweInstantiationException("Couldn't find method " + Arrays.toString(methodNames(feature)) + "("
					+ value.getClass().getSimpleName() + ") for type " + class1.getSimpleName(), null);
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	private String[] methodNames(String feature) {
		if (feature==null) {
			return new String[] {"add","set"};
		}
		return new String[] { "add" + Strings.toFirstUpper(feature), "set" + Strings.toFirstUpper(feature) };
	}

	public Type typeForFeature(String feature) {
		String[] methodNames = methodNames(feature);
		for (String methodName : methodNames) {
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if (method.getParameterTypes().length==1 && method.getName().equals(methodName))
					return new JavaType(method.getParameterTypes()[0]);
			}
		}
		return null;
	}

	public Object newInstance() {
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

}
