/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.util;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowComponentWithID;
import org.eclipse.emf.mwe.core.container.CompositeComponent;

public class ComponentPrinter {

	public static String getString(final WorkflowComponent comp) {
		if (comp instanceof CompositeComponent) {
			final CompositeComponent cc = (CompositeComponent) comp;
			String nameAndLocation = getShortName(cc)+": executing ";
			if (cc.getName() != null && !"".equals(cc.getName()))
				nameAndLocation += cc.getName();
			if (cc.getResource() != null)
				nameAndLocation += " " + cc.getResource();
			if (cc.getLocation() != null)
				nameAndLocation += " " + cc.getLocation();
			if (!"".equals(nameAndLocation))
				return nameAndLocation;
			}
		if (comp instanceof WorkflowComponentWithID) {
			final WorkflowComponentWithID wid = (WorkflowComponentWithID) comp;
			String logMessage = wid.getLogMessage();
			if (wid.getId() != null && !"".equals(wid.getId())) {
				return getShortName(wid)+"("+wid.getId()+")" + ((logMessage == null) ? "" : ": "+logMessage);
			}
            return getShortName(wid) + ((logMessage == null) ? "" : ": "+logMessage) ;
    	}
		return comp.getClass().getName();
	}

	private static String getShortName(WorkflowComponentWithID wid) {
		return wid.getClass().getSimpleName();
	}

	public static String getShortString(final WorkflowComponent comp) {
		if(comp == null)
			return "no Name";
		if (comp instanceof WorkflowComponentWithID) {
			final WorkflowComponentWithID wid = (WorkflowComponentWithID) comp;
			if (wid.getId() != null && !"".equals(wid.getId()))
				return wid.getId();
			}
		if (comp instanceof CompositeComponent) {
			final CompositeComponent cc = (CompositeComponent) comp;
			String nameAndLocation = "";
			if (cc.getName() != null && !"".equals(cc.getName()))
				nameAndLocation += cc.getName();
			if (cc.getResource() != null) {
				int pos = cc.getResource().lastIndexOf("/");
				nameAndLocation += " " + cc.getResource().substring(pos + 1);
			}
			if (!"".equals(nameAndLocation))
				return nameAndLocation;
			}
		return comp.getClass().getName();
	}

	public static String getContainerName(final WorkflowComponent comp) {
		final CompositeComponent cc = comp.getContainer();
		if(cc != null && cc.getResource() != null) {
			int pos = cc.getResource().lastIndexOf("/");
			return cc.getResource().substring(pos + 1);
		}
		return "no container";
	}

	public static String getElementName(final WorkflowComponent comp) {
		if (comp instanceof WorkflowComponentWithID) {
			final WorkflowComponentWithID wid = (WorkflowComponentWithID) comp;
			if (wid.getId() != null && !"".equals(wid.getId()))
				return wid.getId();
			}
		if (comp instanceof CompositeComponent) {
			final CompositeComponent cc = (CompositeComponent) comp;
			if (cc.getResource() != null) {
				int pos = cc.getResource().lastIndexOf("/");
				return cc.getResource().substring(pos + 1);
			}
		}
		return comp.getClass().getSimpleName();
	}
}
