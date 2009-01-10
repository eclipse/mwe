/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.types;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.File;

public class CompositeTypeSystem implements TypeSystem {

	private List<TypeSystem> children = new ArrayList<TypeSystem>();

	public CompositeTypeSystem(List<TypeSystem> children) {
		super();
		if (children != null)
			this.children.addAll(children);
	}

	public CompositeTypeSystem(TypeSystem... typeSystem) {
		for (TypeSystem ts : typeSystem) {
			if (ts!=null)
				children.add(ts);
		}
	}

	public Type typeForName(String name, File file) {
		for (TypeSystem ts : children) {
			Type t = ts.typeForName(name, file);
			if (t!=null)
				return t;
		}
		return null;
	}

}
