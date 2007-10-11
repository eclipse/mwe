package org.eclipse.emf.mwe.tests.ast.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.tests.ast.parser");
		//$JUnit-BEGIN$
		suite.addTestSuite(XmlLocationAnalyserTest.class);
		//$JUnit-END$
		return suite;
	}

}
