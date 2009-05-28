/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class InjectorList implements Injector {
    public Method getter;

    public String name = null;

    public InjectorList(final Method m, final String n) {
        getter = m;
        name = n;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unchecked")
	public void setValue(final Object target, final Object val) {
        try {
            ((List<Object>) getter.invoke(target, new Object[0])).add(val);
        } catch (final InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Class<?> getRequiredType() {
        return Object.class;
    }
}
