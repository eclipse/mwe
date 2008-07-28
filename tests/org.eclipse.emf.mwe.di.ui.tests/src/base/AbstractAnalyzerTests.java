/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
 
package base;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.di.ui.analyze.internal.AbstractAnalyzer;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class AbstractAnalyzerTests extends AbstractUITests {

	protected static final String NO_VARIABLE_MSG = "no variable";
	protected static final String VAR_NOT_SET_MSG = "not been set";
	protected static final String DUPLICATE_MSG = "already defined";
	protected static final String REFERENCED_MSG = "referenced";
	protected static final String NO_SETTER_MSG = "No setter";
	protected static final String RESOLVE_MSG = "resolve";
	protected BasicDiagnostic diag;
	protected AbstractAnalyzer<Object> analyzer;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		diag = new BasicDiagnostic();
		analyzer = new InternalAnalyzer(null, diag, null);
	}

	protected int getMessageCount(final Diagnostic diagnostic) {
		return diagnostic.getChildren().size();
	}

	private boolean isInRange(final Diagnostic diagnostic, final int index) {
		return diagnostic != null && 0 <= index && index < getMessageCount(diagnostic);
	}

	protected boolean isError(final Diagnostic diagnostic, final int index, final String text) {
		if (!isInRange(diagnostic, index) || text == null)
			throw new IllegalArgumentException();
	
		return diagnostic.getChildren().get(index).getSeverity() == Diagnostic.ERROR
				&& messageContains(diagnostic, index, text);
	}

	protected boolean isWarning(final Diagnostic diagnostic, final int index, final String text) {
		if (!isInRange(diagnostic, index) || text == null)
			throw new IllegalArgumentException();
	
		return diagnostic.getChildren().get(index).getSeverity() == Diagnostic.WARNING
				&& messageContains(diagnostic, index, text);
	}

	private boolean messageContains(final Diagnostic diagnostic, final int index, final String text) {
		if (!isInRange(diagnostic, index) || text == null)
			throw new IllegalArgumentException();
	
		return diagnostic.getChildren().get(index).getMessage().contains(text);
	}

}
