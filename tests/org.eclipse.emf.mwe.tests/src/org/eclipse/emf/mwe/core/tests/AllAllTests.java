package org.eclipse.emf.mwe.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests");
		// $JUnit-BEGIN$
		suite.addTest(AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.tests.ast.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.tests.ast.parser.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.tests.ast.util.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.tests.lib.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.tests.util.AllTests.suite());
		// $JUnit-END$
		return suite;
	}

}
