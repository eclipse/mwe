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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.container.IfComponent;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public final class ClassLookupTable {

    private static Map<String, Class<?>> lookupTable;

    static {
        lookupTable = new HashMap<String, Class<?>>();
        initTable();
    }

    /**
     * Don't allow instantiation.
     */
    private ClassLookupTable() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(final WorkflowElement element) {
        if (element == null)
            throw new IllegalArgumentException();

        Class<?> clazz = null;
        final String elementName = element.getName();
        if (lookupTable.containsKey(elementName)) {
            clazz = lookupTable.get(elementName);
        }
        return clazz;
    }

    public static String getClassName(final WorkflowElement element) {
        if (element == null)
            throw new IllegalArgumentException();

        String name = null;
        final Class<?> clazz = getClass(element);
        if (clazz != null) {
            name = clazz.getCanonicalName();
        }
        return name;
    }

    private static void initTable() {
        lookupTable.put("if", IfComponent.class);
    }
}
