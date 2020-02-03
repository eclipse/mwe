/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.factory;

import org.eclipse.emf.mwe2.runtime.IFactory;

public class ComponentAFactory implements IFactory<ComponentA>{
	private String x;
	public void setX(String x) {
		this.x = x;
	}

	@Override
	public ComponentA create() {
		ComponentA a = new ComponentA();
		if (x!=null) {
			a.addY(x);
		}
		return a;
	}

}
