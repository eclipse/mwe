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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.mwe.core.customizer.WorkflowCustomization;

public class InjectorPut implements Injector {
	public Method putMethod;

	public String name = null;

	public InjectorPut(final Method m, final String n) {
		putMethod = m;
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setValue(final Object target, final Object val) {
		try {
			putMethod.invoke(target, new Object[] { name, val });
		} catch (final InvocationTargetException e) {
			throw new RuntimeException(e.getTargetException());
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Class<?> getRequiredType() {
		Class<?> defaultClass = putMethod.getParameterTypes()[1];
        Class<?> overriddenClass = WorkflowCustomization.getKeywordMapping(getName());
        if ( overriddenClass != null ) {
        	if ( !defaultClass.isAssignableFrom(overriddenClass)) {
                throw new RuntimeException( "the customized class '"+overriddenClass.getName()+"' for the keyword '"+
                		getName()+"' is not a subtype of the default class '"+defaultClass.getName()+"'; falling back to default.");
        	} else {
			return overriddenClass;
		}
        } else {
		return defaultClass;
        }    	
	}
}
