package org.eclipse.emf.mwe.tests.ast;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests.ast");
		//$JUnit-BEGIN$
		suite.addTestSuite(WorkflowParserTest.class);
		//$JUnit-END$
		return suite;
	}

}
