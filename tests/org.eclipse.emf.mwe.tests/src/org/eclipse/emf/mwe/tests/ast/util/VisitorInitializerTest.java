/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.com) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.ast.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.util.VisitorInitializer;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Peter Friese - Initial contribution and API
 */
public class VisitorInitializerTest extends Assert {

	private static String invokePrivateMethod(Class<?> targetClass, Object targetInstance, String methodName, Class<?>[] argClasses, Object[] argObjects)
			throws InvocationTargetException {

		try {
			Method method = targetClass.getDeclaredMethod(methodName, argClasses);
			method.setAccessible(true);
			Object result = method.invoke(targetInstance, argObjects);
			if (result instanceof String) {
				String string = (String) result;
				return string;
			}
			else {
				fail();
			}
		}
		catch (SecurityException e) {
			fail();
		}
		catch (IllegalArgumentException e) {
			fail();
		}
		catch (NoSuchMethodException e) {
			fail();
		}
		catch (IllegalAccessException e) {
			fail();
		}
		return null;
	}
	
	protected String invokeTranslateFileName(VisitorInitializer mi, String filename) throws InvocationTargetException {
		Class<?>[] argClasses = {String.class};
		Object[] argObjects = {filename};
		return invokePrivateMethod(VisitorInitializer.class, mi, "translateFileURI", argClasses, argObjects);
	}

	@Test public void testTranslateFileName() throws InvocationTargetException {
		Issues issues = new IssuesImpl();
		Map<String, String> properties = new HashMap<String, String>();
		Map<String, ComponentAST> beans = new HashMap<String, ComponentAST>();
		VisitorInitializer mi = new VisitorInitializer(issues, properties, beans);
		
		assertEquals("test.xml.mwe", invokeTranslateFileName(mi, "test.xml"));
		assertEquals("test.mwe", invokeTranslateFileName(mi, "test.mwe"));
		assertEquals("workflow.mwe", invokeTranslateFileName(mi, "workflow.mwe"));
		assertEquals("workflow.oaw", invokeTranslateFileName(mi, "workflow.oaw"));
		assertEquals("workflow.mwe", invokeTranslateFileName(mi, "workflow"));
	}
}
