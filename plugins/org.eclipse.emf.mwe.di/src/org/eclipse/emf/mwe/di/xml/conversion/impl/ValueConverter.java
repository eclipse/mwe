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

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.mwe.di.xml.conversion.AbstractCreatorConverter;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class ValueConverter extends AbstractCreatorConverter {

	public ValueConverter() {
		super();
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>setup</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractInjectorConverter#setup()
	 */
	@Override
	protected void setup() {
		creators.add(new ValueCreator());
		creators.add(new IdRefValueCreator());
		creators.add(new FileValueCreator());
		creators.add(new DefaultValueCreator());
	}

}
