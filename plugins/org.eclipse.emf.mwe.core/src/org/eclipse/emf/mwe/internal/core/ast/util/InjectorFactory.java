/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowComponent;

public class InjectorFactory {

    public final static Injector getInjector(final Class<?> c, final String name) {
        Injector inj = getInjector1(c, name);
        inj = inj == null ? getInjector2(c, name) : inj;
        inj = inj == null ? getInjector3(c, name) : inj;
        inj = inj == null ? getInjector4(c, name) : inj;
        inj = inj == null ? getInjector5(c, name) : inj;
        return inj;
    }

    private final static Injector getInjector1(final Class<?> c, final String name) {
        final String adderName = "add" + firstUpper(name);
        final Method[] ms = c.getMethods();
        for (final Method method : ms) {
            final int mod = method.getModifiers();
            if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && (method.getParameterTypes().length == 1)) {
                final String mn = method.getName();
                if (mn.equals(adderName)) {
					return new InjectorSimple(method, name);
				}
            }
        }
        return null;
    }

    private final static Injector getInjector2(final Class<?> c, final String name) {
        final String getterName = "get" + firstUpper(name);
        final Method[] ms = c.getMethods();
        for (final Method method : ms) {
            final int mod = method.getModifiers();
            if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && (method.getParameterTypes().length == 0)) {
                final String mn = method.getName();
                if (mn.equals(getterName) && List.class.isAssignableFrom(method.getReturnType())) {
					return new InjectorList(method, name);
				}
            }
        }
        return null;
    }

    private final static Injector getInjector3(final Class<?> c, final String name) {
        final String setterName = "set" + firstUpper(name);
        final Method[] ms = c.getMethods();
        for (final Method method : ms) {
            final int mod = method.getModifiers();
            if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && (method.getParameterTypes().length == 1)) {
                final String mn = method.getName();
                if (mn.equals(setterName) && !List.class.isAssignableFrom(method.getParameterTypes()[0])) {
					return new InjectorSimple(method, name);
				}
            }
        }
        return null;
    }

    private final static Injector getInjector4(final Class<?> c, final String name) {
        final Method[] ms = c.getMethods();
        for (final Method method : ms) {
            final int mod = method.getModifiers();
            if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && (method.getParameterTypes().length == 2)) {
                final String mn = method.getName();
                if (mn.equals("put") && method.getParameterTypes()[0].isAssignableFrom(String.class)) {
					return new InjectorPut(method, name);
				}
            }
        }
        return null;
    }

    private final static Injector getInjector5(final Class<?> c, final String name) {
        final String setterName = "addComponent";
        final Method[] ms = c.getMethods();
        for (final Method method : ms) {
            final int mod = method.getModifiers();
            if (Modifier.isPublic(mod) && !Modifier.isStatic(mod) && (method.getParameterTypes().length == 1)) {
                final String mn = method.getName();
                if (mn.equals(setterName) && !WorkflowComponent.class.isAssignableFrom(method.getParameterTypes()[0])) {
					return new InjectorSimple(method, name);
				}
            }
        }
        return null;
    }
    
    public static String firstUpper(final String str) {
		return str.substring(0, 1).toUpperCase().concat(str.substring(1));
	}




}
