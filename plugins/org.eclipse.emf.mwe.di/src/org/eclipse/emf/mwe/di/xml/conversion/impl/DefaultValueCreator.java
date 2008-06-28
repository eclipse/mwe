/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.xml.Xml2MweConverter;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class DefaultValueCreator extends AbstractValueCreatorModule {

	public DefaultValueCreator() {
		alwaysApplicable();
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createValue</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.di.xml.conversion.ICreator#create(Node)
	 */
	public EObject create(final Node item) {
		final ComplexValue complexVal = FACTORY.createComplexValue();
		complexVal.setClassName(MweUtil.toQualifiedName(getAttribute(item,
				Xml2MweConverter.CLASS)));
		complexVal.setId(getAttribute(item, Xml2MweConverter.ID));
		final NamedNodeMap attributes = item.getAttributes();
		EList<Assignment> assignments = getAssignments(attributes);
		addToValue(complexVal, assignments);

		final NodeList childNodes = item.getChildNodes();
		assignments = getAssignments(childNodes);
		addToValue(complexVal, assignments);
		return complexVal;
	}
}
