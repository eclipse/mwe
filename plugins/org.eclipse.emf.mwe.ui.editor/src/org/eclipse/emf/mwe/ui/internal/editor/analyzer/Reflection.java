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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.7 $
 */
final class Reflection {

    public static final String COMPONENT_SUFFIX = "Component";

    private static final String ADDER_PREFIX = "add";

    private static final String SETTER_PREFIX = "set";

    /**
     * Don't allow instantiation.
     */
    private Reflection() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(final IFile file, final String className) {
        final ProjectIncludingResourceLoader loader = getResourceLoader(file);
        Class<?> clazz = null;

        if (loader != null) {
            clazz = loader.loadClass(className);
        }

        return clazz;
    }

    public static String getComponentName(final String name) {
        return toUpperCaseFirst(name) + COMPONENT_SUFFIX;
    }

    public static ProjectIncludingResourceLoader getResourceLoader(
            final IFile file) {
        final IProject project = file.getProject();
        ProjectIncludingResourceLoader loader = null;
        try {
            loader = new ProjectIncludingResourceLoader(project);
        } catch (final CoreException e) {
            Log.logError("Could not create resource loader", e);
        }

        return loader;
    }

    public static Method getSetter(final Class<?> clazz, final String name,
            final Class<?> type) {
        Method method = null;

        method = getMethod(clazz, setterName(name), type);
        if (method == null) {
            method = getMethod(clazz, adderName(name), type);
        }

        return method;
    }

    private static String adderName(final String name) {
        return ADDER_PREFIX + toUpperCaseFirst(name);
    }

    private static Method getMethod(final Class<?> clazz, final String name,
            final Class<?> type) {
        Method method = null;
        final Class<?>[] param = new Class<?>[1];
        param[0] = type;
        final Class<?>[] objectParam = new Class<?>[1];
        objectParam[0] = Object.class;

        Method m = null;
        if (type != null) {
            m = getMethod(clazz, name, param);
        }

        if (m == null) {
            m = getMethod(clazz, name, objectParam);
        }

        if (m != null) {
            final int modifiers = m.getModifiers();
            if (name.equals(m.getName()) && Modifier.isPublic(modifiers)
                    && !Modifier.isAbstract(modifiers)) {
                method = m;
            }
        }
        return method;
    }

    private static Method getMethod(final Class<?> clazz, final String name,
            final Class<?>[] param) {
        try {
            final Method m = clazz.getDeclaredMethod(name, param);
            return m;
        } catch (final SecurityException e) {
            Log.logError("Security error", e);
        } catch (final NoSuchMethodException e) {
            // Do nothing
        }
        return null;
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
        if (name == null || name.length() == 0)
            return name;
        else if (name.length() == 1)
            return name.toUpperCase();

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
