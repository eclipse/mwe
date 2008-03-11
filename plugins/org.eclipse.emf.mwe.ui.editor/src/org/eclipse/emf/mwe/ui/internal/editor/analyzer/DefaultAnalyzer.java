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

import java.lang.reflect.Method;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class DefaultAnalyzer implements IElementAnalyzer {

    protected static final String NAME_ATTRIBUTE = "name";

    protected static final String VALUE_ATTRIBUTE = "value";

    protected static final String CLASS_ATTRIBUTE = "class";

    protected static final String MAPPING_ERROR_MSG =
            "Could not determine a class mapping for element";

    private static final String FALSE = "false";

    private static final String TRUE = "true";

    protected final IFile file;

    protected final IDocument document;

    public DefaultAnalyzer(final IFile file, final IDocument document) {
        this.file = file;
        this.document = document;
    }

    /**
     * This method overrides the implementation of <code>checkValidity</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.IElementAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    @Override
    public void checkValidity(final WorkflowElement element) {
        final Class<?> mappedClass = getMappedClass(element);
        if (mappedClass == null)
            return;

        for (int i = 0; i < element.getAttributeCount(); i++) {
            final WorkflowAttribute attr = element.getAttribute(i);

            if ((!attr.getName().equals(CLASS_ATTRIBUTE))
                    && (!attr.getName().equals(VALUE_ATTRIBUTE))) {
                checkAttributes(mappedClass, element, attr);
            }
        }
        for (int i = 0; i < element.getChildrenCount(); i++) {
            checkChildValidity(element.getChild(i), mappedClass);
        }
    }

    /**
     * Returns the value of field <code>document</code>.
     * 
     * @return value of <code>document</code>.
     */
    public IDocument getDocument() {
        return document;
    }

    /**
     * Returns the value of field <code>file</code>.
     * 
     * @return value of <code>file</code>.
     */
    public IFile getFile() {
        return file;
    }

    protected void checkAttributes(final Class<?> mappedClass,
            final WorkflowElement element, final WorkflowAttribute attribute) {
        final Class<? extends Object> type = computeAttributeType(attribute);
        final Method[] methods =
                Reflection.getSetter(mappedClass, attribute.getName());
        Method chosenMethod = null;

        if (methods != null) {
            chosenMethod = Reflection.getMatchingMethod(methods, type);
        }

        if (chosenMethod == null) {
            createMarker(element, "No attribute '" + attribute.getName()
                    + "' available in class '" + mappedClass.getSimpleName()
                    + "'");
        }
    }

    protected void checkChildValidity(final WorkflowElement child,
            final Class<?> mappedClass) {
        if (child.isProperty())
            return;

        Method[] methods = null;
        methods = Reflection.getSetter(mappedClass, child.getName());

        Method chosenMethod = null;
        if (methods != null) {
            final Class<? extends Object> type = computeComponentType(child);
            if (type != null) {
                chosenMethod = Reflection.getMatchingMethod(methods, type);
            }

            if (chosenMethod == null) {
                chosenMethod =
                        Reflection.getMatchingMethod(methods, Object.class);
            }
        }

        if (chosenMethod == null) {
            createMarker(child, "Class '" + mappedClass.getCanonicalName()
                    + "' is not a valid component");
        }
    }

    protected Class<?> computeAttributeType(final WorkflowAttribute attribute) {
        Class<?> type = null;
        final String value = attribute.getValue();
        if (isBooleanValue(value)) {
            type = Boolean.class;
        } else {
            type = String.class;
        }
        return type;
    }

    protected Class<?> computeComponentType(final WorkflowElement element) {
        Class<?> type = null;
        final String classValue = element.getAttributeValue(CLASS_ATTRIBUTE);
        if (classValue != null) {
            final Class<?> clazz = getMappedClass(classValue);
            if (clazz != null) {
                type = clazz;
            }
        } else {
            final String value = element.getAttributeValue(VALUE_ATTRIBUTE);
            if (value != null) {
                if (isBooleanValue(value)) {
                    type = Boolean.class;
                } else {
                    type = String.class;
                }
            } else {
                createMarker(element, "Type of component '"
                        + element.getName() + "' cannot be determined");
            }
        }
        return type;
    }

    protected void createMarker(final WorkflowElement element,
            final String message) {
        Marker.createMarker(getFile(), getDocument(), element, message);
    }

    protected String getDefaultName() {
        return null;
    }

    protected Class<?> getMappedClass(final WorkflowElement element) {
        final String mappedClassName = getMappedClassName(element);
        if (mappedClassName == null) {
            createMarker(element, MAPPING_ERROR_MSG + " '" + element.getName()
                    + "'");
            return null;
        }

        final Class<?> mappedClass = getMappedClass(mappedClassName);
        if (mappedClass == null) {
            createMarker(element, "Class '" + mappedClassName
                    + "' cannot be resolved");
        }
        return mappedClass;
    }

    protected boolean isBooleanValue(final String value) {
        return value.equalsIgnoreCase(TRUE) ^ value.equalsIgnoreCase(FALSE);
    }

    private Class<?> getMappedClass(final String mappedClassName) {
        try {
            return Reflection.getClass(getFile(), mappedClassName);
        } catch (final CoreException e) {
            return null;
        }
    }

    private String getMappedClassName(final WorkflowElement element) {
        String name = null;
        if (element.hasAttribute(CLASS_ATTRIBUTE)) {
            name = element.getAttributeValue(CLASS_ATTRIBUTE);
        } else {
            name = ClassLookupTable.getClassName(element);
        }

        if (name == null) {
            name = getDefaultName();
        }

        return name;
    }
}
