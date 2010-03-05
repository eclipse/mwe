/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime;

/**
 * @author Sven Efftinge - initial contribution and API
 * 
 * Mwe supports delegating the creation of objects to {@link IFactory}.
 * Just declare an instance of this interface instead of the concrete class.
 * Not that your implementation needs to have a default constructor.
 * 
 * Any setter or adder methods declared on the factory implementations will be called before
 * the MWE engine calls {@link #create()}. The rest of the assignments will be set on the created Object.
 * 
 * @param <T>
 */
public interface IFactory<T> {
	public T create();
}
