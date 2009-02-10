package org.eclipse.emf.mwe.di;

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

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// register the generated EPackage
		MwePackage.eINSTANCE.getAssignable();
		with(MWEStandaloneSetup.class);
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