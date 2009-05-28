/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;

/**
 * Initializes EMF support. Allows to register additional Packages.
 */

public class StandaloneSetup {

	private static String platformRootPath = null;

	public static String getPlatformRootPath() {
		return platformRootPath;
	}

	private Log log = LogFactory.getLog(getClass());
	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
	}

	/**
	 * sets the platform uri for standalone execution
	 * 
	 * @param pathToPlatform
	 */
	@SuppressWarnings("unchecked")
	public void setPlatformUri(String pathToPlatform) {
		File f = new File(pathToPlatform);
		if (!f.exists())
			throw new ConfigurationException("The platformUri location '" + pathToPlatform + "' does not exist");
		if (!f.isDirectory())
			throw new ConfigurationException("The platformUri location must point to a directory");
		String path = f.getAbsolutePath();
		try {
			path = f.getCanonicalPath();
		}
		catch (IOException e) {
			log.error("Error when registering platform location", e);
		}
		if (platformRootPath == null || !platformRootPath.equals(path)) {
			platformRootPath = path;
			log.info("Registering platform uri '" + path + "'");
			if (f.exists()) {
				for (File subdir : f.listFiles(new FileFilter() {
					public boolean accept(File arg0) {
						return arg0.exists() && arg0.isDirectory() && !arg0.getName().startsWith(".");
					}
				})) {
					String s = subdir.getName();
					try {
						URI uri = URI.createFileURI(subdir.getCanonicalPath() + "/");
						EcorePlugin.getPlatformResourceMap().put(s, uri);
						if (log.isDebugEnabled()) {
							log.debug("Registering project " + s + " at '" + subdir.getCanonicalPath() + "'");
						}
					}
					catch (IOException e) {
						throw new ConfigurationException("Error when registering platform location", e);
					}
				}
			}
		}
	}

	/**
	 * 
	 * @param uriMap
	 */
	@SuppressWarnings("unchecked")
	public void addUriMap(final Mapping uriMap) {
		log.info("Adding URI mapping from '" + uriMap.getFrom() + "' to '" + uriMap.getTo() + "'");
		final URI baseUri = URI.createURI(uriMap.getFrom());
		final URI mappedUri = URI.createURI(uriMap.getTo());
		if (mappedUri == null)
			throw new ConfigurationException("cannot make URI out of " + uriMap.getTo());
		else {
		URIConverter.URI_MAP.put(baseUri, mappedUri);
	}
	}

	/**
	 * Adds an extension
	 * 
	 * @param m
	 *            <tt>from</tt>: extension name, <tt>to</tt> factory classname
	 * @throws ConfigurationException
	 *             <ul>
	 *             <li>The factory class for the extension cannot be found
	 *             <li>The inner factory class for the extension cannot be found
	 *             </ul>
	 */
	@SuppressWarnings("unchecked")
	public void addExtensionMap(final Mapping m) throws ConfigurationException {
		log.info("Adding Extension mapping from '" + m.getFrom() + "' to '" + m.getTo() + "'");
		try {
			// locate the factory class of the extension
			Class factoryClass = ResourceLoaderFactory.createResourceLoader().loadClass(m.getTo());
			if (factoryClass == null)
				throw new ConfigurationException("cannot find class " + m.getTo() + " for extension " + m.getFrom());
			Object factoryInstance = null;
			if (factoryClass.isInterface()) {
				final Class[] innerClasses = factoryClass.getDeclaredClasses();
				factoryClass = null;
				for (int j = 0; j < innerClasses.length; j++) {
					if (Resource.Factory.class.isAssignableFrom(innerClasses[j])) {
						factoryClass = innerClasses[j];
					}
				}
				if (factoryClass == null)
					throw new ConfigurationException("cannot find inner factory class " + m.getTo() + " for extension "
							+ m.getFrom());
				final Field instanceField = factoryClass.getField("INSTANCE");
				factoryInstance = instanceField.get(null);
			}
			else {
				factoryInstance = factoryClass.newInstance();
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(m.getFrom(), factoryInstance);
		}
		catch (final Exception e) {
			throw new ConfigurationException(e);
		}
	}

	public void addRegisterGeneratedEPackage(String interfacename) {
		Class clazz = ResourceLoaderFactory.createResourceLoader().loadClass(interfacename);
		if (clazz == null)
			throw new ConfigurationException("Couldn't find an interface " + interfacename);
		try {
			EPackage pack = (EPackage) clazz.getDeclaredField("eINSTANCE").get(null);
			registry.put(pack.getNsURI(), pack);
			log.info("Adding generated EPackage '" + interfacename + "'");

		}
		catch (Exception e) {
			throw new ConfigurationException("Couldn't register " + interfacename
					+ ". Is it the generated EPackage interface? : " + e.getMessage());
		}
	}

	protected ResourceSet resourceSet = new ResourceSetImpl();
	protected Registry registry = EPackage.Registry.INSTANCE;

	public void setResourceSet(ResourceSet resourceSet) {
		log
				.info("Using resourceSet registry. The registered Packages will not be registered in the global EPackage.Registry.INSTANCE!");
		this.resourceSet = resourceSet;
		this.registry = resourceSet.getPackageRegistry();
	}

	public void setResourceSetImpl(ResourceSetImpl resourceSet) {
		setResourceSet(resourceSet);
	}

	public void addRegisterEcoreFile(String fileName) throws IllegalArgumentException, SecurityException {
		Resource res = resourceSet.getResource(createURI(fileName), true);
		if (res == null)
			throw new ConfigurationException("Couldn't find resource under  " + fileName);
		if (!res.isLoaded()) {
			try {
				res.load(null);
			}
			catch (IOException e) {
				throw new ConfigurationException("Couldn't load resource under  " + fileName + " : " + e.getMessage());
			}
		}
		List<EObject> result = res.getContents();
		for (EObject object : result) {
			if (object instanceof EPackage) {
				String nsUri = ((EPackage) object).getNsURI();
				if (registry.get(nsUri) == null) {
					registry.put(nsUri, object);
					log.info("Adding dynamic EPackage '" + nsUri + "' from '" + fileName + "'");
				}
				else if (log.isDebugEnabled()) {
					log.debug("Dynamic EPackage '" + nsUri + "' from '" + fileName + "' already in the registry!");
				}
			}
		}
	}

	public EPackage getPackage(String nsUri) {
		return (EPackage) registry.get(nsUri);
	}

	private URI createURI(String path) {
		if (path == null)
			throw new IllegalArgumentException();

		URI uri = URI.createURI(path);
		if (uri.isRelative()) {
			URI resolvedURI = URI.createFileURI(new File(path).getAbsolutePath());
			return resolvedURI;
		}
		return uri;
	}
}
