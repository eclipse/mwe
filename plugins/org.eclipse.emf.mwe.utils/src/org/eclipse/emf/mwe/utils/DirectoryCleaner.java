/*******************************************************************************
 * Copyright (c) 2007, 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCleaner extends AbstractWorkflowComponent2 {

	private static final String COMPONENT_NAME = "Directory Cleaner";

	private static final Log LOG = LogFactory.getLog(DirectoryCleaner.class);

	private String directory;

	private final Collection<String> excludes = new HashSet<String>();

	private final Collection<String> defaultExcludes = Arrays.asList(new String[] { "CVS", ".cvsignore", ".svn", ".gitignore" });

	private boolean useDefaultExcludes = true;

	/**
	 * Sets the directory.
	 *
	 * @param directory
	 *            name of directory
	 */
	public void setDirectory(final String directory) {
		this.directory = directory;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "cleaning directory '" + directory + "'";
	}

	@Override
	protected void invokeInternal(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
		if (directory != null) {
			final StringTokenizer st = new StringTokenizer(directory, ",");
			while (st.hasMoreElements()) {
				final String dir = st.nextToken().trim();
				final File f = new File(dir);
				if (f.exists() && f.isDirectory()) {
					LOG.info("Cleaning " + f.getAbsolutePath());
					try {
						cleanFolder(f.getAbsolutePath());
					}
					catch (FileNotFoundException e) {
						issues.addError(e.getMessage());
					}
				}
			}
		}
	}

	@Override
	protected void checkConfigurationInternal(final Issues issues) {
		if (directory == null) {
			issues.addWarning("No directories specified!");
		}
	}

	/**
	 * Deletes all files and subdirectories under dir. Returns true if all
	 * deletions were successful. If a deletion fails, the method stops
	 * attempting to delete and returns false.
	 */
	public void cleanFolder(String srcGenPath) throws FileNotFoundException {
		File f = new File(srcGenPath);
		if (!f.exists())
			throw new FileNotFoundException(srcGenPath + " " + f.getAbsolutePath());
		LOG.debug("Cleaning folder " + f.getPath());
		cleanFolder(f, new FileFilter() {
			@Override
			public boolean accept(File path) {
				return !isExcluded(path);
			}
		}, false, false);
	}

	public boolean isExcluded(File path) {
		if (useDefaultExcludes && defaultExcludes.contains(path.getName()))
			return true;
		return excludes.contains(path.getName());
	}

	public boolean cleanFolder(File parentFolder, final FileFilter filter, boolean continueOnError,
			boolean deleteParentFolder) throws FileNotFoundException {
		if (!parentFolder.exists())
			throw new FileNotFoundException(parentFolder.getAbsolutePath());
		FileFilter myFilter = filter;
		if (myFilter == null) {
			myFilter = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return true;
				}
			};
		}
		LOG.debug("Cleaning folder " + parentFolder.toString());
		final File[] contents = parentFolder.listFiles(myFilter);
		for (int j = 0; contents!=null && j < contents.length; j++) {
			final File file = contents[j];
			if (file.isDirectory()) {
				if (!cleanFolder(file, myFilter, continueOnError, false) && !continueOnError)
					return false;
			}
			else {
				if (!file.delete()) {
					LOG.error("Couldn't delete " + file.getAbsolutePath());
					if (!continueOnError)
						return false;
				}
			}
		}
		if (deleteParentFolder) {
			if (!parentFolder.delete()) {
				LOG.error("Couldn't delete " + parentFolder.getAbsolutePath());
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns if the default excludes are used.
	 *
	 * @return <code>true</code>, if the default excludes are used, otherwise
	 *         <code>false</code>.
	 */
	public boolean isUseDefaultExcludes() {
		return useDefaultExcludes;
	}

	/**
	 * Sets if the default excludes are used.
	 *
	 * @param useDefaultExcludes
	 *            If <code>true</code>, the default excludes are used, if
	 *            <code>false</code>, the default excludes are ignored.
	 */
	public void setUseDefaultExcludes(final boolean useDefaultExcludes) {
		this.useDefaultExcludes = useDefaultExcludes;
	}

	/**
	 * Adds an exclude.
	 *
	 * @param exclude
	 *            the exclude
	 */
	public void addExclude(final String exclude) {
		excludes.add(exclude);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}

}
