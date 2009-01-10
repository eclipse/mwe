/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.service.IServiceRegistrationFactory;

/**
 * used to register components to be used at runtime.
 */
public class MWEUIConfig implements IServiceRegistrationFactory {

	public Set<IServiceRegistration> registrations() {
		Set<IServiceRegistration> generated = new HashSet<IServiceRegistration>();
		// do stuff 
		return generated;
	}

}
			
