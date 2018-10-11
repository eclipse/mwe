/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.eclipse.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.Messages;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

/**
 * This class is an action handler that responds to a context menu run or debug
 * action.<br>
 * It creates a launchConfiguration if there is non already for the specified
 * workflow file, stores it and starts it in the resp. mode
 * 
 */
public class MWELaunchShortcut implements ILaunchShortcut {

	private IFile currFile;

	private final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

	@Override
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

	@Override
	public void launch(final IEditorPart editor, final String mode) {
		final IEditorInput input = editor.getEditorInput();
		currFile = input.getAdapter(IFile.class);
		launch(mode);
	}

	private void launch(final String mode) {
		try {
			locateWfRunner(currFile, mode);
		}
		catch (final CoreException e) {
			Activator.logError(e);
			Activator.showError(e.getStatus());
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
			Activator.logError(e);
			Activator.showError(e.getStatus());
			return;
		}
	}

	private void locateWfRunner(final IResource resource, String mode) throws CoreException {
		final IJavaProject project = JavaCore.create(resource.getProject());
		if (!isOnClasspath(WorkflowRunner.class.getName(), project)) {
			throw new DebugException(Activator.createErrorStatus(Messages.MWELaunchShortcut_ExecutionError
					+ WorkflowRunner.class.getName() + Messages.MWELaunchShortcut_NeededonClasspath, null));
		}
	}

	// TODO: HB: After migration check from oAW this method is not used anymore, anyway it exists in oAW code base too, maybo for reference?
	@SuppressWarnings("unused")
	private boolean checkClasspathEntries(final IResource resource, String classNameToFind) throws CoreException {
		// TODO: ER: put required oAW packages always to the classpath
		final IJavaProject project = JavaCore.create(resource.getProject());
		final SearchPattern pattern = SearchPattern
				.createPattern(classNameToFind, IJavaSearchConstants.TYPE, IJavaSearchConstants.DECLARATIONS,
						SearchPattern.R_PATTERN_MATCH | SearchPattern.R_CASE_SENSITIVE);
		final IJavaSearchScope scope = SearchEngine.createJavaSearchScope(new IJavaElement[] { project }, true);
		final TypeDeclarationSearchRequestor requestor = new TypeDeclarationSearchRequestor();

		final SearchEngine searchEngine = new SearchEngine();
		searchEngine.search(pattern, new SearchParticipant[] { SearchEngine.getDefaultSearchParticipant() },
				scope, requestor, null);
		return requestor.match();
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
				.getLaunchConfigurationType(MWELaunchConfigurationConstants.WORKFLOW_LAUNCH_CONFIGURATION_TYPE_ID);

		// 2nd param is Name of the LaunchConfig in the Config Window
		wc = configType.newInstance(null, launchManager.generateLaunchConfigurationName(info.name));

		// the 4 values displayed in the Config main window
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, info.project);
		wc.setAttribute(MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE, info.wfFile);
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, false);
		wc.setAttribute(MWELaunchConfigurationConstants.ATTR_MWE_JAVA_DEBUG_MODE, false);

		// the values displayed in the VM arguments field
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, Messages.MWELaunchShortcut_NeededVMArguments);

		config = wc.doSave();

		return config;
	}

	private class LaunchConfigurationInfo {
		private final String name;

		private final String project;

		private final String wfFile;

		private LaunchConfigurationInfo(final IFile file) {
			name = file.getName();
			project = file.getProject().getName();
			wfFile = file.getFullPath().toString();
		}

		private boolean configEquals(final ILaunchConfiguration a) throws CoreException {
			return wfFile.equals(a.getAttribute(MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE, "X"))
					&& project.equals(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "X"));
		}

	}
}
