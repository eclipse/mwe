/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.mwe.utils;

import java.io.File;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCleaner extends AbstractWorkflowComponent {

    private static final Log logger = LogFactory.getLog(DirectoryCleaner.class);

    private String directories;

    public void setDirectories(final String directories) {
        this.directories = directories;
    }
    
    @Override
	public String getLogMessage() {
    	return "cleaning directory '"+directories+"'";
    }

    @Override
    protected void invokeInternal(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
        if (directories != null) {
            final StringTokenizer st = new StringTokenizer(directories, ",");
            while (st.hasMoreElements()) {
                final String dir = st.nextToken().trim();
                final File f = new File(dir);
                if (f.exists() && f.isDirectory()) {
                    logger.info("Cleaning " + f.getAbsolutePath());
                    final File[] contents = f.listFiles();
                    for (final File file : contents) {
                        if (!delete(file)) {
                            logger.error("Couldn't delete " + file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }

    public void checkConfiguration(final Issues issues) {
        if (directories == null) {
            issues.addWarning("No directories specified!");
        }
    }

    // Deletes all files and subdirectories under dir.
    // Returns true if all deletions were successful.
    // If a deletion fails, the method stops attempting to delete and returns
    // false.
    public boolean delete(final File file) {
        if (file.isDirectory()) {
            final String[] children = file.list();
            for (String element : children) {
                boolean success = delete(new File(file, element));
                if (!success) {
					return false;
				}
            }
        }

        // The directory is now empty so delete it
        return file.delete();
    }

}

/*******************************************************************************
 * $Log: DirectoryCleaner.java,v $
 * Revision 1.1  2008/01/03 09:50:12  sefftinge
 * DirectoryCleaner is not specific to EMF
 *
 * Revision 1.3  2007/12/14 21:22:57  bkolb
 * fixing copyrights, preparations for build
 *
 * Revision 1.2  2007/09/26 13:26:57  bkolb
 * cleanUP
 *
 * Revision 1.1  2007/09/25 18:09:24  bkolb
 * initial check-in
 *  * restructured projects
 *  * separation between internal and external API
 *  * replaced some internals with Eclipse/EMF features
 *
 * Revision 1.13  2007/08/16 12:07:31  sefftinge
 * added URL to my name
 *
 * Revision 1.12  2006/11/22 13:29:03  voelter
 * *** empty log message ***
 *
 * Revision 1.11  2006/09/11 09:43:24  voelter
 * version changed to 4.1.1
 *
 * Revision 1.10  2006/04/26 09:53:37  sefftinge
 * Java 5 migration (not finished yet)
 *
 * Revision 1.9  2006/04/20 17:40:37  sefftinge
 * clean up
 * Revision 1.8 2006/04/20 17:33:17 sefftinge
 * clean up
 * 
 * Revision 1.7 2006/03/11 18:35:14 voelter *** empty log message ***
 * 
 * Revision 1.6 2006/03/08 11:11:40 sefftinge workflowfactory rewritten
 * 
 * Revision 1.5 2006/02/03 20:36:59 voelter *** empty log message ***
 * 
 * Revision 1.4 2006/01/31 15:42:17 sefftinge license added
 * 
 * Revision 1.3 2006/01/16 19:02:25 sefftinge issues mech. reactivated
 * 
 * Revision 1.2 2006/01/16 14:44:17 sefftinge - logging with
 * apache.commons.logging no single logger instance anymore - runtime Issues
 * mechanism removed - issues for checkConfiguration simply collects Strings,
 * now Revision 1.1 2006/01/11 16:37:18 voelter alles neu macht der mai
 * 
 * Revision 1.1 2006/01/11 14:05:18 arnohaase *** empty log message ***
 * 
 * Revision 1.1 2006/01/11 13:52:10 arnohaase *** empty log message ***
 * 
 * Revision 1.1 2005/12/12 20:36:39 arnohaase *** empty log message ***
 * 
 * Revision 1.3 2005/10/14 12:10:08 sefftinge *** empty log message ***
 * 
 * Revision 1.2 2005/09/23 09:34:00 sefftinge *** empty log message ***
 * 
 * Revision 1.1 2005/09/21 17:25:52 sefftinge *** empty log message ***
 * 
 * 
 ******************************************************************************/
