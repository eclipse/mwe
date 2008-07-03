/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.tests.analyze;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;
import org.eclipse.emf.mwe.di.ui.base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class AnalyzerTest extends AbstractUITests {

	public void testSimpleSetter1() {
		final String workflow = "stubs.ObjectA { name = 'test' }";
		final File file = createModelFile(workflow);
		final InternalAnalyzer analyzer = new InternalAnalyzer(project);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(0, diag.getChildren().size());
	}
}
