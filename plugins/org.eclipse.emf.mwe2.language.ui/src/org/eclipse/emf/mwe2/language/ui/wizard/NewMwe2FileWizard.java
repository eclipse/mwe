/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.wizard;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NewMwe2FileWizard extends BasicNewResourceWizard {

	public static final String WIZARD_ID = "org.eclipse.emf.mwe2.language.ui.wizard.NewMwe2FileWizard"; //$NON-NLS-1$

	private WizardNewFileCreationPage mainPage;

	private static final Logger logger = Logger.getLogger(NewMwe2FileWizard.class);

	@Inject
	@Named("file.extensions")
	private String extension;
	
	@Inject
	private IWorkspace workspace;
	
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewFileCreationPage("newFilePage1", getSelection()) { //$NON-NLS-1$
			@Override
			protected InputStream getInitialContents() {
				String module = getModule();
				if (module != null) {
					String content = String.format(Messages.NewMwe2FileWizard_initialContent, module);
					return new StringInputStream(content);
				}
				return new StringInputStream(""); //$NON-NLS-1$
			}
			
			protected String getModule() {
				IPath path = getContainerFullPath();
				IProject project = null;
				for(IProject p: workspace.getRoot().getProjects()) {
					if (p.getFullPath().isPrefixOf(path)) {
						project = p;
						break;
					}
				}
				IJavaProject javaProject = JavaCore.create(project);
				if (javaProject != null) {
					try {
						IPackageFragmentRoot root = null;
						for(IPackageFragmentRoot candidate: javaProject.getPackageFragmentRoots()) {
							if (candidate.getPath().isPrefixOf(path)) {
								root = candidate;
								break;
							}
						}
						if (root != null) {
							IPath relativePath = path.makeRelativeTo(root.getPath());
							String pack = relativePath.toString().replace('/', '.');
							String fileName = getFileName();
							fileName = fileName.substring(0, fileName.indexOf("." + extension)); //$NON-NLS-1$
							String module = pack + "." + fileName; //$NON-NLS-1$
							return module;
						}
					} catch (JavaModelException e) {
						logger.error(e.getMessage(), e);
					}
				}
				return null;
			}
		};
		mainPage.setTitle(Messages.NewMwe2FileWizard_title);
		mainPage.setDescription(Messages.NewMwe2FileWizard_description);
		mainPage.setFileExtension(extension);
		addPage(mainPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(Messages.NewMwe2FileWizard_title);
		setNeedsProgressMonitor(true);
	}
	
	@Override
	protected void initializeDefaultPageImageDescriptor() {
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.ui.ide", //$NON-NLS-1$
				"$nl$/icons/full/wizban/newfile_wiz.png"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(descriptor);
	}

	@Override
	public boolean performFinish() {
		IFile file = mainPage.createNewFile();
		if (file == null) {
			return false;
		}

		selectAndReveal(file);
		
		// Open editor on new file. Cannot use the URIEditorOpener since the file was not built yet.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IDE.openEditor(page, file, true);
				}
			}
		} catch (PartInitException e) {
			logger.error(e.getMessage(), e);
		}

		return true;
	}
}
