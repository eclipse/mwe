package org.eclipse.emf.mwe.internal.ui.workflow.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.internal.core.resources.ResourceLoaderDefaultImpl;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * This ResourceLoader is capable of loading resources from a specific Java project within the workspace.
 * Typical use is when invoking a workflow from within a plugin.
 *  
 * @author Axel Terfloth (axel.terfloth@itemis.de)
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class ProjectIncludingResourceLoader extends ResourceLoaderDefaultImpl {
    private ClassLoader projectCL;
    
	public ProjectIncludingResourceLoader(IProject project) throws CoreException {
		super();
		projectCL = createClassLoader(project);
	}

	/**
	 * Builds a classloader for a Java project from the workspace. 
	 * @param project An Eclipse project
	 * @throws CoreException
	 */
	public ClassLoader createClassLoader (IProject project) throws CoreException {
		IJavaProject jp = JavaCore.create(project);
		
		IClasspathEntry[] javacp = jp.getResolvedClasspath(true);		
		URL[] url = new URL[javacp.length];

		for (int i=0; i<javacp.length; i++)
			try {
				url[i] = javacp[i].getPath().toFile().toURL();
			} catch (MalformedURLException e) {
				Activator.logError(e);
			}
		return new URLClassLoader(url);
	}

	@Override
	protected URL internalGetResource(String path) {
		URL resource = projectCL.getResource(path);
		if ( resource == null ) {
			resource = super.internalGetResource(path);
		}
		return resource;
	}

	@Override
	protected InputStream internalGetResourceAsStream(String path) {
		URL url = internalGetResource(path);
		try {
			return url != null ? url.openStream() : null;
		} catch (IOException e) {
			return null;
		}
	}

}