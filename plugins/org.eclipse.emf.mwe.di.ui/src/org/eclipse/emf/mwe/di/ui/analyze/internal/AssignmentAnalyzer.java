/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class AssignmentAnalyzer extends MweSwitch<Diagnostic> {

	protected static final String FALSE_VALUE = "false";
	protected static final String TRUE_VALUE = "true";

	private final IProject project;
	private final ComplexValue analyzedObject;
	private final IType type;

	public AssignmentAnalyzer(final IProject project, final ComplexValue analyzedObject, final IType type) {
		if (analyzedObject == null || type == null || project == null) {
			throw new IllegalArgumentException();
		}

		this.project = project;
		this.analyzedObject = analyzedObject;
		this.type = type;
	}

	public Diagnostic evaluate(final Value value) {
		final Diagnostic res = doSwitch(value);
		return res;
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseAssignment(org.eclipse.emf.mwe.Assignment)
	 */
	@Override
	public Diagnostic caseAssignment(final Assignment object) {
		final String featureName = object.getFeature();
		final String objectName = MweUtil.toString(analyzedObject.getClassName());
		final Value value = object.getValue();
		if (value instanceof SimpleValue) {
			final SimpleValue sv = (SimpleValue) value;
			final IType argType = getValueType(sv.getValue());
			final IMethod method = TypeUtils.getSetter(project, type, featureName, argType);
			if (method == null)
				return MweDiagnostic.error("No setter for '" + featureName + "' in object '" + objectName + "'",
						analyzedObject, null);
		}
		return null;
	}

	private IType getValueType(final String value) {
		if (value == null)
			return null;

		IType type = null;
		if (isBooleanValue(value)) {
			type = TypeUtils.findType(project, "java.lang.Boolean");
		}
		else {
			type = TypeUtils.findType(project, "java.lang.String");
		}
		return type;
	}

	private boolean isBooleanValue(final String value) {
		return value.equalsIgnoreCase(TRUE_VALUE) ^ value.equalsIgnoreCase(FALSE_VALUE);
	}
}
