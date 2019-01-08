/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe2.launch.ui.shortcut;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class Mwe2LaunchShortcut implements ILaunchShortcut {

	public static final String BUNDLE_ID = "org.eclipse.emf.mwe2.launch";

	private IFile currFile;

	private final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

	public void launch(final ISelection selection, final String mode) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Object object = structuredSelection.getFirstElement();
			if (object instanceof IAdaptable) {
				currFile = (IFile) ((IAdaptable) object).getAdapter(IResource.class);
				launch(mode);
			}
		}
	}

	public void launch(final IEditorPart editor, final String mode) {
		final IEditorInput input = editor.getEditorInput();
		currFile = (IFile) input.getAdapter(IFile.class);
		launch(mode);
	}

	private void launch(final String mode) {
		try {
			locateWfRunner(currFile, mode);
		}
		catch (final CoreException e) {
			MessageDialog.openError(null, "Problem running workflow.", e.getMessage());
			return;
		}

		final LaunchConfigurationInfo info = new LaunchConfigurationInfo(currFile);
		ILaunchConfiguration[] configs;
		ILaunchConfiguration config = null;
		try {
			configs = launchManager.getLaunchConfigurations();
			for (final ILaunchConfiguration configuration : configs) {
				if (info.configEquals(configuration)) {
					config = configuration;
					break;
				}
			}
			if (config == null) {
				config = createConfiguration(info);
			}
			DebugUITools.launch(config, mode);
			currFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		}
		catch (final CoreException e) {
			MessageDialog.openError(null, "Problem running workflow.", e.getMessage());
			return;
		}
	}

	private void locateWfRunner(final IResource resource, String mode) throws CoreException {
		final IJavaProject project = JavaCore.create(resource.getProject());
		if (!isOnClasspath(Mwe2Launcher.class.getName(), project)) {
			throw new DebugException(new Status(IStatus.ERROR, BUNDLE_ID, "Please put bundle '"+BUNDLE_ID+"' on your project's classpath."));
		}
	}

	public boolean isOnClasspath(String fullyQualifiedName, IJavaProject project) {
		if (fullyQualifiedName.indexOf('$') != -1)
			fullyQualifiedName = fullyQualifiedName.replace('$', '.');
		try {
			IType type = project.findType(fullyQualifiedName);
			return type != null && type.exists();
		} catch (JavaModelException e) {
		}
		return false;
	}

	public class TypeDeclarationSearchRequestor extends SearchRequestor {

		private IType match = null;

		@Override
		public void acceptSearchMatch(final SearchMatch match) {
			this.match = (IType) match.getElement();
		}

		public boolean match() {
			return match != null;
		}
	}

	protected ILaunchConfiguration createConfiguration(final LaunchConfigurationInfo info) throws CoreException {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		final ILaunchConfigurationType configType = launchManager
				.getLaunchConfigurationType("org.eclipse.emf.mwe2.launch.Mwe2LaunchConfigurationType");

		wc = configType.newInstance(null, launchManager.generateLaunchConfigurationName(info.name));

		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, info.project);
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, Mwe2Launcher.class.getName());
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, false);
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, info.wfFile);
		
		try {
			Field attrExcludeTestCodeField = IJavaLaunchConfigurationConstants.class.getDeclaredField("ATTR_EXCLUDE_TEST_CODE");
			String attrExcludeTestCode = (String) attrExcludeTestCodeField.get(null);
			wc.setAttribute(attrExcludeTestCode, !info.includeTestCode);
		} catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// ok, old eclipse
		}
		
		wc.setAttribute(RefreshTab.ATTR_REFRESH_SCOPE, "${workspace}");
		wc.setAttribute(RefreshTab.ATTR_REFRESH_RECURSIVE, true);

		config = wc.doSave();

		return config;
	}

	private class LaunchConfigurationInfo {
		private final String name;

		private final String project;

		private final String wfFile;

		private boolean includeTestCode;

		private LaunchConfigurationInfo(final IFile file) {
			name = file.getName();
			project = file.getProject().getName();
			wfFile = file.getProjectRelativePath().toString();
			includeTestCode = isIncludeTestCode(file);
		}

		private boolean configEquals(final ILaunchConfiguration a) throws CoreException {
			return wfFile.equals(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, "X"))
				&& Mwe2Launcher.class.getName().equals(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "X"))
				&& project.equals(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "X"))
				&& a.getType().getIdentifier().equals("org.eclipse.emf.mwe2.launch.Mwe2LaunchConfigurationType");
		}

	}

	private static boolean isIncludeTestCode(IFile file) {
		IJavaProject javaProject = JavaCore.create(file.getProject());
		if (javaProject != null) {
			IClasspathEntry entry;
			try {
				Method getClasspathEntryFor = IJavaProject.class.getDeclaredMethod("getClasspathEntryFor", IPath.class);
				Method isTest = IClasspathEntry.class.getDeclaredMethod("isTest");
				
				IJavaElement javaElement = JavaCore.create(file.getParent());
				if (javaElement instanceof IPackageFragmentRoot) {
					entry = (IClasspathEntry) getClasspathEntryFor.invoke(javaProject, javaElement.getPath());
				} else if (javaElement instanceof IPackageFragment) {
					entry = (IClasspathEntry) getClasspathEntryFor.invoke(javaProject, 
							((org.eclipse.jdt.core.IPackageFragment) javaElement).getParent().getPath());
				} else {
					entry = null;
				}
				if (entry != null && !((boolean) isTest.invoke(entry))) {
					return false;
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// ok, old eclipse
				return true;
			}
		}
		return true;
	}
}
