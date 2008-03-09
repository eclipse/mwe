/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
final class Reflection {

    private static final String ADDER_PREFIX = "add";

    private static final String SETTER_PREFIX = "set";

    /**
     * Hidden constructor because of utility class.
     */
    private Reflection() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(final IFile file, final String className)
            throws CoreException {
        final IProject project = file.getProject();
        final ProjectIncludingResourceLoader loader =
                new ProjectIncludingResourceLoader(project);
        Class<?> clazz = null;
        clazz = loader.loadClass(className);
        return clazz;
    }

    public static Method getMatchingMethod(final Method[] methods,
            final Class<?> type) {
        if (methods == null || methods.length == 0)
            return null;

        for (final Method m : methods) {
            final Class<?>[] parameters = m.getParameterTypes();
            for (final Class<?> p : parameters) {

                Class<?> cast = null;
                try {
                    cast = type.asSubclass(p);
                } catch (final ClassCastException e) {
                    // Do nothing
                }

                if (cast != null)
                    return m;
            }
        }
        return null;
    }

    public static Method[] getSetter(final Class<?> clazz, final String name) {
        Method[] methods = null;

        methods = getMethods(clazz, setterName(name));
        if (methods == null) {
            methods = getMethods(clazz, adderName(name));
        }

        return methods;
    }

    private static String adderName(final String name) {
        return ADDER_PREFIX + toUpperCaseFirst(name);
    }

    private static Method[] getMethods(final Class<?> clazz,
            final String fieldName) {
        final Method[] allMethods = clazz.getMethods();
        final List<Method> methodList = new ArrayList<Method>();
        for (final Method m : allMethods) {
            final int modifiers = m.getModifiers();
            if (fieldName.equals(m.getName()) && Modifier.isPublic(modifiers)
                    && !Modifier.isAbstract(modifiers)) {
                methodList.add(m);
            }
        }

        final Method[] retArray =
                (!methodList.isEmpty()) ? methodList.toArray(new Method[0])
                        : null;
        return retArray;
    }

    private static boolean isConcrete(final Class<?> clazz) {
        final int modifiers = clazz.getModifiers();
        final Class<?>[] parameters = new Class[0];
        Constructor<?> constructor = null;
        try {
            constructor = clazz.getConstructor(parameters);
        } catch (final SecurityException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (final NoSuchMethodException e) {
            // Do nothing
        }
        return !Modifier.isAbstract(modifiers)
                && !Modifier.isInterface(modifiers) && (constructor != null);
    }

    private static String setterName(final String name) {
        return SETTER_PREFIX + toUpperCaseFirst(name);
    }

    private static String toUpperCaseFirst(final String name) {
        if (name == null || name.isEmpty())
            return name;
        else if (name.length() == 1)
            return name.toUpperCase();

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
