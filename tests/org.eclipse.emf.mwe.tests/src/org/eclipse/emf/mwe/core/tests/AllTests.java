package org.eclipse.emf.mwe.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(WorkflowRunnerTest.class);
		//$JUnit-END$
		return suite;
	}

}
