/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.di.execution.Instantiator;
import org.eclipse.emf.mwe.di.xml.Xml2MweConverter;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.util.StringInputStream;

public abstract class AbstractTests extends AbstractXtextTests {

	public AbstractTests() {
		super();
	}

	public AbstractTests(final String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// register the generated EPackage
		MwePackage.eINSTANCE.getAssignable();
		// do stand alone setup of MWE DI language
		MWEStandaloneSetup.doSetup();
		setCurrentLanguage(MWEStandaloneSetup.getServiceScope());
	}

	protected File createModelFile(final String model) {
		if (model == null)
			return null;

		try {
			final File file = (File) loadModel(URI.createURI("foo.mwe"), model);
			return file;
		}
		catch (final Exception e) {
			return null;
		}
	}

	protected Object instantiate(final File file) {
		if (file == null)
			return null;

		final Instantiator instantiator = new Instantiator();
		return instantiator.instantiate(file);
	}

	protected File fileFromXML(final String xmlWorkflow) {
		if (xmlWorkflow == null)
			return null;

		final File file = new Xml2MweConverter().fromXML(new StringInputStream(xmlWorkflow));
		return file;
	}

}