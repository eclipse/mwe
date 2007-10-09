package org.eclipse.emf.mwe.tests.lib;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests.lib");
		//$JUnit-BEGIN$
		suite.addTestSuite(AbstractWorkflowComponentTest.class);
		//$JUnit-END$
		return suite;
	}

}
