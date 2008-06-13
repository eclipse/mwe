package org.eclipse.emf.mwe.di.ui.analyze;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;

public class Analyzer implements EValidator {

	private DiagnosticChain diagnostics;

	public boolean validate(EObject object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return new InternalAnalyzer().validate(object, diagnostics, context);
	}

	public boolean validate(EClass class1, EObject object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return false;
	}

	public boolean validate(EDataType dataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return false;
	}

}
