/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.internal.ui.debug.launching.ui.launchable;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class LaunchableTester extends PropertyTester {

	private static final String ROOT_ELEMENT_NAME = "workflow";

	/**
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object,
	 *      java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public boolean test(final Object receiver, final String property, final Object[] args, final Object expectedValue) {
		if (receiver == null)
			return false;

		final IAdaptable adaptable = (IAdaptable) receiver;
		final IFile file = adaptable.getAdapter(IFile.class);
		if (file != null)
			return checkFileCriteria(file);

		return false;
	}

	private boolean checkFileCriteria(final IFile file) {
		if (!file.exists())
			return false;

		try {
			final InputStream stream = file.getContents();
			final XMLContentHandler contentHandler = new XMLContentHandler();
			final XMLReader reader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
			reader.setContentHandler(contentHandler);
			final InputSource inputSource = new InputSource(stream);
			reader.parse(inputSource);
			final String rootName = contentHandler.getRootName();
			return ROOT_ELEMENT_NAME.equals(rootName);
		}
		catch (final CoreException e) {
			e.printStackTrace();
			return false;
		}
		catch (final SAXException e) {
			e.printStackTrace();
			return false;
		}
		catch (final ParserConfigurationException e) {
			e.printStackTrace();
			return false;
		}
		catch (final IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
