/*******************************************************************************
 * Copyright (c) 2010, 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.ecore;

import java.io.OutputStream;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenEnumGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.util.LineFilterOutputStream;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class CvsIdFilteringGeneratorAdapterFactoryDescriptor implements
		GeneratorAdapterFactory.Descriptor {

	/**
	 * @author Sebastian Zarnekow - Initial contribution and API
	 */
	protected class IdFilteringGenModelGeneratorAdapterFactory extends
			GenModelGeneratorAdapterFactory {

		protected class IdFilteringGenPackageAdapter extends
				GenPackageGeneratorAdapter {
			protected IdFilteringGenPackageAdapter(
					GeneratorAdapterFactory generatorAdapterFactory) {
				super(generatorAdapterFactory);
				if (explicitLineDelimiter != null) {
					setLineDelimiter(explicitLineDelimiter);
				}
			}

			@Override
			protected OutputStream createOutputStream(URI workspacePath)
					throws Exception {
				return CvsIdFilteringGeneratorAdapterFactoryDescriptor.this
						.createOutputStream(
								super.createOutputStream(workspacePath),
								getLineDelimiter());
			}
			
			@Override
			protected void createImportManager(String packageName, String className) {
				super.createImportManager(packageName, className);
				if (explicitLineDelimiter != null)
					importManager.setLineDelimiter(explicitLineDelimiter);
			}

			@Override
			public String getLineDelimiter(URI workspacePath, String encoding) {
				if (explicitLineDelimiter != null)
					return explicitLineDelimiter;
				return super.getLineDelimiter(workspacePath, encoding);
			}
		}

		protected class IdFilteringGenEnumAdapter extends
				GenEnumGeneratorAdapter {
			protected IdFilteringGenEnumAdapter(
					GeneratorAdapterFactory generatorAdapterFactory) {
				super(generatorAdapterFactory);
				if (explicitLineDelimiter != null) {
					setLineDelimiter(explicitLineDelimiter);
				}
			}

			@Override
			protected OutputStream createOutputStream(URI workspacePath)
					throws Exception {
				return CvsIdFilteringGeneratorAdapterFactoryDescriptor.this
						.createOutputStream(
								super.createOutputStream(workspacePath),
								getLineDelimiter());
			}
			
			@Override
			protected void createImportManager(String packageName, String className) {
				super.createImportManager(packageName, className);
				if (explicitLineDelimiter != null)
					importManager.setLineDelimiter(explicitLineDelimiter);
			}

			@Override
			public String getLineDelimiter(URI workspacePath, String encoding) {
				if (explicitLineDelimiter != null)
					return explicitLineDelimiter;
				return super.getLineDelimiter(workspacePath, encoding);
			}
		}

		protected class IdFilteringGenClassAdapter extends
				GenClassGeneratorAdapter {
			protected IdFilteringGenClassAdapter(
					GeneratorAdapterFactory generatorAdapterFactory) {
				super(generatorAdapterFactory);
				if (explicitLineDelimiter != null) {
					setLineDelimiter(explicitLineDelimiter);
				}
			}

			@Override
			protected OutputStream createOutputStream(URI workspacePath)
					throws Exception {
				return CvsIdFilteringGeneratorAdapterFactoryDescriptor.this
						.createOutputStream(
								super.createOutputStream(workspacePath),
								getLineDelimiter());
			}
			
			@Override
			protected void createImportManager(String packageName, String className) {
				super.createImportManager(packageName, className);
				if (explicitLineDelimiter != null)
					importManager.setLineDelimiter(explicitLineDelimiter);
			}

			@Override
			public String getLineDelimiter(URI workspacePath, String encoding) {
				if (explicitLineDelimiter != null)
					return explicitLineDelimiter;
				return super.getLineDelimiter(workspacePath, encoding);
			}
		}

		@Override
		public Adapter createGenClassAdapter() {
			return new IdFilteringGenClassAdapter(this);
		}

		@Override
		public Adapter createGenEnumAdapter() {
			return new IdFilteringGenEnumAdapter(this);
		}

		@Override
		public Adapter createGenModelAdapter() {
			if (genModelGeneratorAdapter == null) {
				genModelGeneratorAdapter = new GenModelGeneratorAdapter(this) {
					// we handle these ones on our own
					@Override
					protected void generateModelBuildProperties(
							GenModel genModel,
							org.eclipse.emf.common.util.Monitor monitor) {
					}

					@Override
					protected void generateModelManifest(GenModel genModel,
							org.eclipse.emf.common.util.Monitor monitor) {
					}

					@Override
					protected void generateModelPluginClass(GenModel genModel,
							org.eclipse.emf.common.util.Monitor monitor) {
					}

					@Override
					protected void generateModelPluginProperties(
							GenModel genModel,
							org.eclipse.emf.common.util.Monitor monitor) {
					}
				};
			}
			return genModelGeneratorAdapter;
		}

		@Override
		public Adapter createGenPackageAdapter() {
			return new IdFilteringGenPackageAdapter(this);
		}
	}
	
	/* @Nullable */
	private final String explicitLineDelimiter;
	
	public CvsIdFilteringGeneratorAdapterFactoryDescriptor() {
		this(null);
	}
	
	/**
	 * @since 2.7
	 */
	public CvsIdFilteringGeneratorAdapterFactoryDescriptor(String lineDelimiter) {
		super();
		this.explicitLineDelimiter = lineDelimiter;
	}

	protected OutputStream createOutputStream(OutputStream stream,
			String lineDelimiter) throws Exception {
		if (lineDelimiter != null)
			return new LineFilterOutputStream(stream, " * $Id" + "$",
					lineDelimiter);
		return new LineFilterOutputStream(stream, " * $Id" + "$");
	}

	public GeneratorAdapterFactory createAdapterFactory() {
		return new IdFilteringGenModelGeneratorAdapterFactory();
	}
}