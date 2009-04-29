package org.eclipse.emf.mwe.tests.util;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests.util");
		//$JUnit-BEGIN$
		suite.addTestSuite(ReaderTest.class);
		suite.addTestSuite(ResourceLoaderFactoryTest.class);
		suite.addTestSuite(WriterTest.class);
		//$JUnit-END$
		return suite;
	}

}
