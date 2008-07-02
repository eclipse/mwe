package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class InternalAnalyzer extends MweSwitch<Object> {

	private DiagnosticChain diagnostics;
	private IJavaProject jp;
	private final Map<String, String> properties = new HashMap<String, String>();
	private final Map<String, IType> beans = new HashMap<String, IType>();

	public boolean validate(final EObject object,
			final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		doSwitch(object);
		return false;
	}

	@Override
	public Object caseComplexValue(final ComplexValue object) {
		try {
			final IType type = jp.findType(MweUtil.toString(object.getClassName()));
			if (object.getId() != null) {
				if (beans.containsKey(object.getId())) {
					diagnostics.add(MweDiagnostic.warning("overwrites existing bean with id '" + object.getId()
							+ "' of type " + beans.get(object.getId()).getElementName(), object));
				}
				else {
					beans.put(object.getId(), type);
				}
			}

			for (final Assignment ass : object.getAssignments()) {
				//TODO validate
			}

		} catch (final JavaModelException e) {
			diagnostics.add(MweDiagnostic.error(e.getMessage(), object, e));
		}
		return super.caseComplexValue(object);
	}
}
