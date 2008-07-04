/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.mwe.di.ui.tests.analyzer.AnalyzerTests;
import org.eclipse.emf.mwe.di.ui.tests.infrastructure.InfrastructureTests;


public class AllTests {

	public static Test suite() {
		final TestSuite suite = new TestSuite("Test suite for org.eclipse.emf.mwe.di.ui.tests");
		//$JUnit-BEGIN$
		suite.addTest(InfrastructureTests.suite());
		suite.addTest(AnalyzerTests.suite());
		//$JUnit-END$
		return suite;
	}

}
