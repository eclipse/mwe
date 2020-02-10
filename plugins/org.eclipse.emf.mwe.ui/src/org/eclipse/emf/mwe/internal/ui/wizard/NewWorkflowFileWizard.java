/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.Messages;
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

	private final String extension = Messages.NewWorkflowFileWizard_Extension;

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
	public void init(final IWorkbench workbench, final IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(Messages.NewWorkflowFileWizard_DialogTitle);
		setNeedsProgressMonitor(true);
	}

	/*
	 * (non-Javadoc) Method declared on BasicNewResourceWizard.
	 */
	@Override
	protected void initializeDefaultPageImageDescriptor() {
		final ImageDescriptor desc =
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
		if (file == null)
			return false;

		selectAndReveal(file);
		getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				}
				catch (final PartInitException e) {
					Activator.logError(e);
				}
			}
		});
		return true;
	}

	class Page extends WizardNewFileCreationPage {

		public Page(final IStructuredSelection selection) {
			super("newFilePage1", selection);
			setFileName(Messages.NewWorkflowFileWizard_DefaultFileName + extension);
			setTitle(Messages.NewWorkflowFileWizard_WindowTitle);
			setDescription(Messages.NewWorkflowFileWizard_WindowDescription);
		}

		@Override
		public String getErrorMessage() {
			if (!getFileName().endsWith("." + extension))
				return Messages.NewWorkflowFileWizard_WrongExtension + extension;
			return null;
		}

		@Override
		protected InputStream getInitialContents() {
			return new ByteArrayInputStream(initialContents.getBytes());
		}
	}

}
