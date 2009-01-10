/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.xml.conversion;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public abstract class AbstractInjectorModule extends AbstractModule implements
		IInjector {

	protected AbstractInjectorConverter converter;

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractModule#setConverter(org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter)
	 */
	@Override
	public void setConverter(final AbstractConverter converter) {
		this.converter = (AbstractInjectorConverter) converter;
	}

}
