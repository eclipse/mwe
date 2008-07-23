package org.eclipse.emf.mwe.di.types.java;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe.di.execution.MweInstantiationException;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.xtext.util.Strings;

public class JavaType implements Type, StaticType {

	public boolean hasProperty(final String name) {
		return typeForFeature(name) != null;
	}

	private final Class<?> clazz;

	public JavaType(final Class<?> class1) {
		this.clazz = class1;
	}

	public void inject(final Object target, final String feature, final Object value) {
		try {
			final Class<?> class1 = target.getClass();
			final String[] methodNames = methodNames(feature);
			for (final String methodName : methodNames) {
				try {
					final Method method = class1.getMethod(methodName, new Class[] { value.getClass() });
					if (method != null) {
						method.invoke(target, value);
						return;
					}
				}
				catch (final NoSuchMethodException e) {
					// ignore
				}
			}
			throw new MweInstantiationException("Couldn't find method " + Arrays.toString(methodNames(feature)) + "("
					+ value.getClass().getSimpleName() + ") for type " + class1.getSimpleName(), null);
		}
		catch (final Exception e) {
			throw new WrappedException(e);
		}
	}

	public Object newInstance() {
		try {
			return clazz.newInstance();
		}
		catch (final Exception e) {
			throw new WrappedException(e);
		}
	}

	public Type typeForFeature(final String feature) {
		final String[] methodNames = methodNames(feature);
		for (final String methodName : methodNames) {
			final Method[] methods = clazz.getMethods();
			for (final Method method : methods) {
				if (method.getParameterTypes().length == 1 && method.getName().equals(methodName))
					return new JavaType(method.getParameterTypes()[0]);
			}
		}
		return null;
	}

	private String[] methodNames(final String feature) {
		if (feature == null)
			return new String[] { "add", "set" };
		return new String[] { "add" + Strings.toFirstUpper(feature), "set" + Strings.toFirstUpper(feature) };
	}

}
