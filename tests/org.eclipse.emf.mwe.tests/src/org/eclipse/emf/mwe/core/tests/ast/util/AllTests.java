package org.eclipse.emf.mwe.core.tests.ast.util;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.core.tests.ast.util");
		//$JUnit-BEGIN$
		suite.addTestSuite(VisitorAnalyzerTest.class);
		suite.addTestSuite(WorkflowFactoryTest.class);
		//$JUnit-END$
		return suite;
	}

}
