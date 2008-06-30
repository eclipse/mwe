/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.WorkflowRef;
import org.eclipse.emf.mwe.di.xml.Xml2MweConverter;
import org.eclipse.emf.mwe.di.xml.conversion.AttributeBasedSelector;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class FileValueCreator extends AbstractValueCreatorModule {

	public FileValueCreator() {
		super();
		selector =
				new AttributeBasedSelector(
						new String[] { Xml2MweConverter.FILE });
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.ICreator#create(Node)
	 */
	public EObject create(final Node item) {
		final WorkflowRef wf = FACTORY.createWorkflowRef();
		wf.setUri(getAttribute(item, Xml2MweConverter.FILE));
		final NamedNodeMap attributes = item.getAttributes();
		EList<Assignment> assignments = getAssignments(attributes);
		addToValue(wf, assignments);

		final NodeList childNodes = item.getChildNodes();
		assignments = getAssignments(childNodes);
		addToValue(wf, assignments);
		return wf;
	}
}
