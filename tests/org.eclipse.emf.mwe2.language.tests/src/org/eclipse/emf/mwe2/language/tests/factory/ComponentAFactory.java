/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.factory;

import org.eclipse.emf.mwe2.runtime.IFactory;

public class ComponentAFactory implements IFactory<ComponentA>{
	private String x;
	public void setX(String x) {
		this.x = x;
	}

	public ComponentA create() {
		ComponentA a = new ComponentA();
		if (x!=null) {
			a.addY(x);
		}
		return a;
	}

}
