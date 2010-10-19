/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	public QualifiedName qualifiedName(Module module) {
		return toValue(module.getCanonicalName());
	}
	
}
