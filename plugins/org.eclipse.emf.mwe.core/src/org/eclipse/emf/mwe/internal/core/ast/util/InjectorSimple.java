/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.internal.core.ast.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InjectorSimple implements Injector {

	private Method m = null;

	private String name = null;

	public InjectorSimple(final Method m, final String name) {
		this.m = m;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(final Object target, final Object val) {
		try {
			m.invoke(target, new Object[] { val });
		}
		catch (final InvocationTargetException e) {
			throw new RuntimeException(e.getTargetException());
		}
		catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Class<?> getRequiredType() {
		return m.getParameterTypes()[0];
	}

}
