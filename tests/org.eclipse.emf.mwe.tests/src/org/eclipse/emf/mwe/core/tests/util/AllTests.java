package org.eclipse.emf.mwe.core.tests.util;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.core.tests.util");
		//$JUnit-BEGIN$
		suite.addTestSuite(ResourceLoaderFactoryTest.class);
		//$JUnit-END$
		return suite;
	}

}
