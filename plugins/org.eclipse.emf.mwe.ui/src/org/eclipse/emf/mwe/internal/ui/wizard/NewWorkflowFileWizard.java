/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public class NewWorkflowFileWizard extends BasicNewResourceWizard {
	private Page mainPage;

	private String extension = "mwe";

	String initialContents = "";
	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new Page(getSelection());//$NON-NLS-1$
		addPage(mainPage);
	}

	/*
	 * (non-Javadoc) Method declared on IWorkbenchWizard.
	 */

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("New File");
		setNeedsProgressMonitor(true);
	}

	/*
	 * (non-Javadoc) Method declared on BasicNewResourceWizard.
	 */
	@Override
	protected void initializeDefaultPageImageDescriptor() {
		ImageDescriptor desc =
		// IDEWorkbenchPlugin.getIDEImageDescriptor("wizban/newfile_wiz.png");//$NON-NLS-1$
		AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.ui.ide", "$nl$/icons/full/wizban/newfile_wiz.png");
		setDefaultPageImageDescriptor(desc);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getFileName().endsWith("." + extension);
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public boolean performFinish() {
		final IFile file = mainPage.createNewFile();
		if (file == null) {
			return false;
		}

		selectAndReveal(file);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
					Activator.logError(e);
				}
			}
		});
		return true;
	}

	class Page extends WizardNewFileCreationPage {

		public Page(IStructuredSelection selection) {
			super("newFilePage1", selection);
			setFileName("newWorkflowFile." + extension);
			setTitle("New Workflow File");
			setDescription("Creates a new Workflow File");
		}

		@Override
		public String getErrorMessage() {
			if (!getFileName().endsWith("." + extension))
				return "file extension must be ." + extension;
			return null;
		}

		@Override
		protected InputStream getInitialContents() {
			return new ByteArrayInputStream(initialContents.getBytes());
		}
	}

}
