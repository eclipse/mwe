/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.execution;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public interface IReflectionHandler {
	/**
	 * @param className
	 * @return
	 */
	public Object instantiate(String className);
	
	/**
	 * @param target
	 * @param feature
	 * @param multiple
	 * @param value
	 */
	public void inject(Object target, String feature, Object value);

	/**
	 * @param parentsType
	 * @param feature
	 * @param multi
	 */
	public String getFeaturesTypeName(String type, String feature);
}
