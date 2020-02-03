/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.mwe2.language.formatting.Mwe2Formatter;
import org.eclipse.emf.mwe2.language.resource.MweLocationInFileProvider;
import org.eclipse.emf.mwe2.language.resource.MweResourceDescriptionStrategy;
import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.emf.mwe2.language.scoping.Mwe2StateBasedContainerManager;
import org.eclipse.emf.mwe2.language.scoping.NamespaceAwareScopeProvider;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.emf.mwe2.language.validation.MweRawSuperTypes;
import org.eclipse.xtext.common.types.util.RawSuperTypes;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Provider;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class Mwe2RuntimeModule extends org.eclipse.emf.mwe2.language.AbstractMwe2RuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return QualifiedNameProvider.class;
	}

	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate"))
				.to(NamespaceAwareScopeProvider.class);
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

	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MweResourceDescriptionStrategy.class;
	}

	@Override
	public Class<? extends Manager> bindIContainer$Manager() {
		return Mwe2StateBasedContainerManager.class;
	}

	public Class<? extends RawSuperTypes> bindRawSuperTypes() {
		return MweRawSuperTypes.class;
	}

	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return Mwe2Formatter.class;
	}

}
