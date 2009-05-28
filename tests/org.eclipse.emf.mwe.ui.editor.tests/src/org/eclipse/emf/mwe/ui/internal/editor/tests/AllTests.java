/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.mwe.ui.internal.editor.tests.parser.AllParserTests;
import org.eclipse.emf.mwe.ui.internal.editor.tests.references.AllReferencesTests;
import org.eclipse.emf.mwe.ui.internal.editor.tests.searcher.AllSearcherTests;
import org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils.AllTypeUtilsTests;

public class AllTests {

	public static Test suite() {
		final TestSuite suite = new TestSuite("Test for org.eclipse.emf.mwe.ui.internal.editor.tests");
		// $JUnit-BEGIN$
		suite.addTest(AllParserTests.suite());
		suite.addTest(AllSearcherTests.suite());
		suite.addTest(AllTypeUtilsTests.suite());
		suite.addTest(AllReferencesTests.suite());
		// $JUnit-END$
		return suite;
	}

}
