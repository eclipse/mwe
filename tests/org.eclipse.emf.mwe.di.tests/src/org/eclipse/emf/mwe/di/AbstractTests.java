package org.eclipse.emf.mwe.di;

import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.xtext.junit.AbstractXtextTests;

public abstract class AbstractTests extends AbstractXtextTests {

	public AbstractTests() {
		super();
	}

	public AbstractTests(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		MwePackage.eINSTANCE.getAssignment();
		MWEStandaloneSetup.doSetup();
		setCurrentLanguage(MWEStandaloneSetup.getLanguageDescriptor());
	}

}