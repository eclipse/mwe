/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.mwe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides static helper methods to deal with element fields using reflection.
 */
public class ReflectionUtil {

	private static final Map<String, Map<String, Field>> fieldDictionary = new HashMap<String, Map<String, Field>>();

	// -------------------------------------------------------------------------

	private ReflectionUtil() {
	}

	// -------------------------------------------------------------------------

	/**
	 * return a String representation of the element. It is "null", the content of a String or the simple class
	 * name for all other types.<br>
	 * Hint: Primitives wrapper classes are not handled specially, so the result is not the primitive value but
	 * the class name. But since getFieldValue(..) returns a String representation of primitives, this should not
	 * be a problem here.
	 * 
	 * @param element the element
	 * @return the string representation
	 */
	public static String getSimpleName(Object element) {
		return (element == null ? "null" : (element instanceof String) ? (String) element : getSimpleClassName(element));
	}

	/**
	 * Null save toString
	 * @param element the element
	 * @return the string representation
	 */
	public static String getNameToString(Object element) {
		return (element == null ? "null" : element.toString());
	}

	/**
	 * check if the element has member fields. For an array it checks if it is not empty.
	 * 
	 * @param element the element
	 * @return yes or no
	 */
	public static boolean checkFields(Object element) {
		if (element == null || element instanceof String)
			return false;
		if (Object[].class.isAssignableFrom(element.getClass()))
			return ((Object[]) element).length > 0;
		Map<String, Field> fields = getFieldMap(element.getClass());
		return !fields.isEmpty();
	}

	/**
	 * returns a list of names of the fields. For an array it returns "[i]" as name where i is the position in the
	 * array.
	 * 
	 * @param element
	 * @return the list of field names
	 */
	public static List<String> getFieldNames(Object element) {
		List<String> result = new ArrayList<String>();
		if (element instanceof Object[])
			for (int i = 0; i < ((Object[]) element).length; i++)
				result.add("[" + i + "]");
		else
			result.addAll(getFieldMap(element.getClass()).keySet());
		return result;
	}

	/**
	 * Returns the value of a field of an object.<br>
	 * For primitives it returns a string representation.<br>
	 * It returns null in case of any exceptions.
	 * 
	 * @param object the questioned object
	 * @param name the name of the field
	 * @return the value
	 */
	public static Object getFieldValue(Object object, String name) {
		try {
			Field field = getField(object, name);
			Class<?> type = field.getType();
			if (type.isPrimitive() || (type == String.class))
				return field.get(object).toString();
			return field.get(object);
		} catch (Exception e) {
			// IllegalAccessException and NullPointerException
		}
		return null;
	}

	// -------------------------------------------------------------------------

	// similar to getClass().getSimpleName(), but handles arrays differently
	private static String getSimpleClassName(Object element) {
		String fqn = element.getClass().getName();
		int index = fqn.lastIndexOf('.');
		if (element instanceof Object[])
			return fqn.substring(index + 1, fqn.length() - 1) + "[" + ((Object[]) element).length + "]";
		return fqn.substring(index + 1);
	}

	private static Field getField(Object object, String name) {
		try {
			return getFieldMap(object.getClass()).get(name);
		} catch (Exception e) {
		}
		return null;
	}

	// collect all declared fields (also private and static) of a class and it's super classes
	// cache the map by class for multiple use.
	private static synchronized Map<String, Field> getFieldMap(final Class<?> cls) {
		final String clsName = cls.getName();
		if (!fieldDictionary.containsKey(clsName)) {
			final Map<String, Field> fieldMap = new HashMap<String, Field>();
			Class<?> clazz = cls;
			while (!Object.class.equals(clazz)) {
				Field[] fields = cls.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					Field field = fields[i];
					field.setAccessible(true);
					// super class fields are not considered if the same name was already in an inheriting class
					if (!fieldMap.containsKey(field.getName()))
						fieldMap.put(field.getName(), field);
					}
				clazz = clazz.getSuperclass();
			}
			fieldDictionary.put(clsName, fieldMap);
		}
		return fieldDictionary.get(clsName);
	}

}
