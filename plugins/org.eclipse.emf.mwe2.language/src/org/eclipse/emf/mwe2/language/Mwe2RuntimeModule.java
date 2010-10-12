/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.mwe2.language.resource.MweLocationInFileProvider;
import org.eclipse.emf.mwe2.language.resource.MweResourceDescriptionManager;
import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.emf.mwe2.language.scoping.NamespaceAwareScopeProvider;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Provider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class Mwe2RuntimeModule extends org.eclipse.emf.mwe2.language.AbstractMwe2RuntimeModule {
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return QualifiedNameProvider.class;
	}
	
	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate")).to(NamespaceAwareScopeProvider.class);
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Mwe2ValueConverters.class;
	}
	
	@Override
	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
		return null;
	}
	
	public Class<? extends Provider<XtextResourceSet>> provideXtextResourceSet() {
		return MweResourceSetProvider.class;
	}
	
	@Override
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return MweLocationInFileProvider.class;
	}
	
	public Class<? extends IResourceDescription.Manager> bindIResourceDescription$Manager() {
		return MweResourceDescriptionManager.class;
	}
	
}
