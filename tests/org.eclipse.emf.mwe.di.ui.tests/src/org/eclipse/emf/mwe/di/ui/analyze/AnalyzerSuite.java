/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.mwe.di.ui.analyze.internal.DummyAnalyzerTest;
import org.eclipse.emf.mwe.di.ui.analyze.internal.EMFAnalyzerTest;
import org.eclipse.emf.mwe.di.ui.analyze.internal.JavaAnalyzerTest;
import org.eclipse.emf.mwe.di.ui.analyze.internal.LocalVariableDefinitionTest;
import org.eclipse.emf.mwe.di.ui.analyze.internal.VariableRegistryTest;

public class AnalyzerSuite {

	public static Test suite() {
		final TestSuite suite = new TestSuite("Test suite for org.eclipse.emf.mwe.di.ui.analyze");
		// $JUnit-BEGIN$
		suite.addTestSuite(JavaAnalyzerTest.class);
		suite.addTestSuite(EMFAnalyzerTest.class);
		suite.addTestSuite(DummyAnalyzerTest.class);
		suite.addTestSuite(LocalVariableDefinitionTest.class);
		suite.addTestSuite(VariableRegistryTest.class);
		// $JUnit-END$
		return suite;
	}

}
