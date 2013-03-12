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
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipException;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.w3c.dom.Document;

/**
 * Initializes EMF support. Allows to register additional Packages.
 * 
 * <h1>Configuration</h1>
 * 
 * <h2>platformUri</h2> 
 * Set the path to the root of the platform, usually ".." 
 * 
 * <h2>URI Mapping</h2> 
 * Map one URI to another. This is for example required when some resource refers to another with
 * <tt>platform:/plugin</tt> URIs. Platform plugin URIs cannot be resolved in standalone mode, thus these
 * URIs must be mapped to file or platform resource URIs.
 * 
 * <pre>
 * uriMap = {
 *   from = "platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"
 *   to = "platform:/resource/myproject/model/Ecore.ecore"
 * }
 * </pre>
 * 
 * <h2>Bundle name mapping</h2>
 * In the case that the folder name of a project does not match the bundle name, maps the bundle name to the real
 * directory name on the platform.
 * 
 * <pre>
 * bundleNameMap = {
 *   from = "my.bundle.name"
 *   to = "bundledirectoryname"
 * }
 * </pre>
 */
public class StandaloneSetup {

	private static String platformRootPath = null;
	private Map<String, String> bundleNameMapping = new HashMap<String, String>();

	public static String getPlatformRootPath() {
		return platformRootPath;
	}

	private Log log = LogFactory.getLog(getClass());
	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
	}
	
	private boolean ignoreBrokenProjectFiles = false;
	
	/**
	 * Allows to ignore exception that occur while reading {@code .project} or {@code Manifest.MF}
	 * files.
	 * 
	 * Default is {@code false}.
	 */
	public void setIgnoreBrokenProjectFiles(boolean ignoreBrokenProjectFiles) {
		this.ignoreBrokenProjectFiles = ignoreBrokenProjectFiles;
	}
	
	public boolean isIgnoreBrokenProjectFiles() {
		return ignoreBrokenProjectFiles;
	}

	public void setLogResourceUriMap(boolean doLog) {
		if (!doLog)
			return;
		List<Entry<String, URI>> entrySet = new ArrayList<Entry<String, URI>>(EcorePlugin.getPlatformResourceMap()
				.entrySet());
		Collections.sort(entrySet, new Comparator<Entry<String, URI>>() {
			public int compare(Entry<String, URI> o1, Entry<String, URI> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for (Entry<String, URI> entry : entrySet) {
			log.info(entry.getKey() + " - " + entry.getValue());
		}
	}

	public void setScanClassPath(boolean doScan) {
		if (!doScan)
			return;
		String property = System.getProperty("java.class.path");
		String separator = System.getProperty("path.separator");
		if (property != null) {
			String[] entries = property.split(separator);
			for (String entry : entries) {
				try {
					File f = new File(entry).getCanonicalFile();
					if (f.getPath().endsWith(".jar")) {
						registerBundle(f);
					}
					else if (!scanFolder(f)) {
						// eclipse bin folder?
						File dotProject = new File(f.getParentFile(), ".project");
						if (dotProject.exists())
							registerProject(dotProject);
					}
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	/**
	 * sets the platform uri for standalone execution
	 * 
	 * @param pathToPlatform
	 */
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
				scanFolder(f);
			}
		}
	}

	protected boolean scanFolder(File f) {
		return scanFolder(f, new HashSet<String>());
	}

	protected boolean scanFolder(File f, Set<String> visitedPathes) {
		try {
			if (!visitedPathes.add(f.getCanonicalPath()))
				return true;
		}
		catch (IOException e) {
			log.error(e.getMessage(), e);
			return true;
		}
		File[] files = f.listFiles();
		boolean containsProject = false;
		File dotProject = null;
		if (files != null) {
			for (File file : files) {
				if (file.exists() && file.isDirectory() && !file.getName().startsWith(".")) {
					containsProject |= scanFolder(file, visitedPathes);
				}
				else if (".project".equals(file.getName())) {
					dotProject = file;
				}
				else if (file.getName().endsWith(".jar")) {
					registerBundle(file);
				}
			}
		}
		if (!containsProject && dotProject != null)
			registerProject(dotProject);
		return containsProject || dotProject != null;
	}

	protected void registerBundle(File file) {
		try {
			JarFile jarFile = new JarFile(file);
			Manifest manifest = jarFile.getManifest();
			if (manifest == null)
				return;
			String name = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
			if (name != null) {
				final int indexOf = name.indexOf(';');
				if (indexOf > 0)
					name = name.substring(0, indexOf);
				if (EcorePlugin.getPlatformResourceMap().containsKey(name))
					return;
				String path = "archive:" + file.toURI() + "!/";
				URI uri = URI.createURI(path);
				EcorePlugin.getPlatformResourceMap().put(name, uri);
			}
		}
		catch (ZipException e) {
			log.warn("Could not open Jar file " + file.getAbsolutePath() + ".");
		}
		catch (Exception e) {
			handleException(file, e);
		}
	}

	private void handleException(File file, Exception exception) {
		if (isIgnoreBrokenProjectFiles()) {
			try {
				log.warn("Couldn't read " + file.getCanonicalPath());
			} catch (IOException e) {
				log.warn("Couldn't read " + file.getAbsolutePath());
			}
		} else {
			throw new RuntimeException(exception);
		}
	}

	protected void registerProject(File file) {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new FileInputStream(file));
			String name = document.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();

			URI uri = URI.createFileURI(file.getParentFile().getCanonicalPath() + File.separator);
			EcorePlugin.getPlatformResourceMap().put(name, uri);
			if (bundleNameMapping.get(name) != null) {
				EcorePlugin.getPlatformResourceMap().put(bundleNameMapping.get(name), uri);
			}
			if (log.isDebugEnabled()) {
				log.debug("Registering project " + name + " at '" + uri + "'");
			}
		}
		catch (Exception e) {
			handleException(file, e);
		}
	}

	/**
	 * 
	 * @param uriMap
	 */
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
	public void addExtensionMap(final Mapping m) throws ConfigurationException {
		log.info("Adding Extension mapping from '" + m.getFrom() + "' to '" + m.getTo() + "'");
		try {
			// locate the factory class of the extension
			Class<?> factoryClass = ResourceLoaderFactory.createResourceLoader().loadClass(m.getTo());
			if (factoryClass == null)
				throw new ConfigurationException("cannot find class " + m.getTo() + " for extension " + m.getFrom());
			Object factoryInstance = null;
			if (factoryClass.isInterface()) {
				final Class<?>[] innerClasses = factoryClass.getDeclaredClasses();
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
		Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(interfacename);
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
		log.info("Using resourceSet registry. The registered Packages will not be registered in the global EPackage.Registry.INSTANCE!");
		this.resourceSet = resourceSet;
		this.registry = resourceSet.getPackageRegistry();
	}

	public void setResourceSetImpl(ResourceSetImpl resourceSet) {
		setResourceSet(resourceSet);
	}

	protected GenModelHelper createGenModelHelper() {
		return new GenModelHelper();
	}

	public void addRegisterGenModelFile(String fileName) {
		createGenModelHelper().registerGenModel(resourceSet, createURI(fileName));
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
				registerPackage(fileName, object);
			}
			for (final TreeIterator<EObject> it = object.eAllContents(); it.hasNext();) {
				EObject child = it.next();
				if (child instanceof EPackage) {
					registerPackage(fileName, child);
				}
			}
		}
	}

	public EPackage getPackage(String nsUri) {
		return (EPackage) registry.get(nsUri);
	}

	public void addBundleNameMap(Mapping mapping) {
		bundleNameMapping.put(mapping.getFrom(), mapping.getTo());
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

	private void registerPackage(String fileName, EObject object) {
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
