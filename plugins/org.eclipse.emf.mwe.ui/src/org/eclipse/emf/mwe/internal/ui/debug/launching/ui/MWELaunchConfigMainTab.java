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
package org.eclipse.emf.mwe.internal.ui.debug.launching.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.mwe.internal.ui.eclipse.launch.MWELaunchConfigurationConstants;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

/**
 * This class defines the workflow launch config main tab. It is based on the Java one
 * <code>org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab</code>, but shows a workflow file instead of
 * a Java class.<br>
 * There is an additional <code>javaDebugCheckbox</code> to be able to select the debug process (MWE debug or
 * Java debug)
 * 
 */
public class MWELaunchConfigMainTab extends JavaLaunchTab {

	private WidgetListener fListener = new WidgetListener();

	private Text projText;

	private Button projButton;

	private Text wfText;

	private Button wfButton;

	private Button stopInMainCheckbox;

	private Button javaDebugCheckbox;

	private Path wfPath;

	// ********************************************************** create Control

	public String getName() {
		return "Main";
	}

	public void createControl(Composite parent) {
		Font font = parent.getFont();

		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		comp.setLayout(topLayout);
		comp.setFont(font);

		// Project group
		projButton = createPushButton(parent, "&Browse...", null);
		projText = createGroup(comp, "&Project:", projButton, null);

		createVerticalSpacer(comp, 1);

		// workflow group
		wfButton = createPushButton(parent, "&Search...", null);
		stopInMainCheckbox = createCheckButton(parent, "St&op in main");
		javaDebugCheckbox = createCheckButton(parent, "Java Debug");
		wfText = createGroup(comp, "initial Workflow File", wfButton, new Button[] { stopInMainCheckbox,
				javaDebugCheckbox });
	}

	private Text createGroup(Composite comp, String title, Button searchButton, Button[] checkButtons) {
		Font font = comp.getFont();
		Group group = new Group(comp, SWT.NONE);
		group.setText(title);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setFont(font);
		Text text = new Text(group, SWT.SINGLE | SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.setFont(font);
		text.addModifyListener(fListener);
		searchButton.setParent(group);
		searchButton.addSelectionListener(fListener);
		if (checkButtons != null)
			for (Button button : checkButtons) {
				button.setParent(group);
				GridData gd = new GridData();
				gd.horizontalSpan = 2;
				button.setLayoutData(gd);
				button.addSelectionListener(fListener);
			}
		return text;
	}

	// *********************************************************** data handling

	public void setDefaults(ILaunchConfigurationWorkingCopy config) {
		// is called when a new LauchConfig is created
		// nothing to do
	}

	@Override
	public void initializeFrom(ILaunchConfiguration config) {
		super.initializeFrom(config);

		try {
			projText.setText(config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, ""));
			setWfText(config.getAttribute(MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE, ""));
			stopInMainCheckbox.setSelection(config.getAttribute(
					IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, false));
			javaDebugCheckbox.setSelection(config.getAttribute(
					MWELaunchConfigurationConstants.ATTR_MWE_JAVA_DEBUG_MODE, false));
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}
	}

	private void setWfText(String fullName) {
		wfPath = new Path(fullName);
		String projectName = projText.getText().trim();
		int pos = fullName.indexOf(projectName);
		if (projectName.length() > 0 && pos >= 0) {
			wfText.setText(fullName.substring(pos + projectName.length() + 1));
		} else
			wfText.setText(fullName);
	}

	public void performApply(ILaunchConfigurationWorkingCopy config) {
		config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, projText.getText().trim());
		config.setAttribute(MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE, wfPath.toString());
		config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, stopInMainCheckbox
				.getSelection());
		config.setAttribute(MWELaunchConfigurationConstants.ATTR_MWE_JAVA_DEBUG_MODE, javaDebugCheckbox
				.getSelection());
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		String text = wfText.getText().trim();
		if (text.length() > 0) {
			if (getWorkspaceRoot().findMember(wfPath) == null) {
				setErrorMessage("Specified file does not exist");
				return false;
			}
		} else {
			setMessage("Specify a workflow file");
		}
		return super.isValid(launchConfig);
	}

	// *********************************************************** event handler

	private class WidgetListener implements ModifyListener, SelectionListener {

		public void modifyText(ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		public void widgetDefaultSelected(SelectionEvent e) {
			// do nothing
		}

		public void widgetSelected(SelectionEvent e) {
			Object source = e.getSource();
			if (source == projButton)
				handleProjectButtonSelected();
			else if (source == wfButton)
				handleWfButtonSelected();
			else
				updateLaunchConfigurationDialog();
		}
	}

	private void handleWfButtonSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), getWorkspaceRoot(),
				IResource.FILE);
		dialog.setTitle("select starting workflow file");
		dialog.setMessage("select starting workflow file");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			setWfText(file.getFullPath().toString());
		}
	}

	private void handleProjectButtonSelected() {
		IJavaProject project = chooseJavaProject();
		if (project == null)
			return;
		String projectName = project.getElementName();
		projText.setText(projectName);
	}

	private IJavaProject chooseJavaProject() {
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setTitle("Project Selection");
		dialog.setMessage("Select a project to constrain your search.");
		try {
			dialog.setElements(JavaCore.create(getWorkspaceRoot()).getJavaProjects());
		} catch (JavaModelException jme) {
			Activator.logError(jme);
		}
		IJavaProject javaProject = getJavaProject();
		if (javaProject != null) {
			dialog.setInitialSelections(new Object[] { javaProject });
		}
		if (dialog.open() == Window.OK) {
			return (IJavaProject) dialog.getFirstResult();
		}
		return null;
	}

	private IJavaProject getJavaProject() {
		String projectName = projText.getText().trim();
		if (projectName.length() < 1) {
			return null;
		}
		return JavaCore.create(getWorkspaceRoot()).getJavaProject(projectName);
	}

	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

}
