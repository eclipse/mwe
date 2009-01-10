/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.mwe.di.xml.conversion.AbstractInjectorModule;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public abstract class AbstractElementInjectorModule extends
		AbstractInjectorModule implements IMweFactory {

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractModule#relevantNodeTypes()
	 */
	@Override
	public short[] relevantNodeTypes() {
		return new short[] { Node.ELEMENT_NODE };
	}

}
