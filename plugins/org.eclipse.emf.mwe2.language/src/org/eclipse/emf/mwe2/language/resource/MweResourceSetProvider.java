/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.resource;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction") 
public class MweResourceSetProvider implements Provider<XtextResourceSet>{

	@Inject
	private Provider<IJvmTypeProvider.Factory> typeProviderFactory;
	
	public XtextResourceSet get() {
		XtextResourceSet result = new SynchronizedXtextResourceSet() {
			@Override
			public void setClasspathURIContext(Object classpathURIContext) {
				super.setClasspathURIContext(classpathURIContext);
				if (isExpectedContext(classpathURIContext))
					ensureTypeFactoryExists(this);
			}
		};
		return result;
	}
	
	protected boolean isExpectedContext(Object classpathURIContext) {
		return true;
	}

	protected void ensureTypeFactoryExists(ResourceSet resourceSet) {
		IJvmTypeProvider.Factory factory = typeProviderFactory.get();
		factory.findOrCreateTypeProvider(resourceSet);
	}

}
