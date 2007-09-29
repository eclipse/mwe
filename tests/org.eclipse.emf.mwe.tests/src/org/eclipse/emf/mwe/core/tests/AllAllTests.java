package org.eclipse.emf.mwe.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.core.tests");
		// $JUnit-BEGIN$
		suite.addTest(AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.core.tests.ast.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.core.tests.ast.parser.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.core.tests.ast.util.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.core.tests.lib.AllTests.suite());
		suite.addTest(org.eclipse.emf.mwe.core.tests.util.AllTests.suite());
		// $JUnit-END$
		return suite;
	}

}
