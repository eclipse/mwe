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
	private IJavaProject jp = null;
	private Map<String, String> properties = new HashMap<String, String>();
	private Map<String, IType> beans = new HashMap<String, IType>();

	public boolean validate(EObject object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		doSwitch(object);
		return false;
	}

	@Override
	public Object caseComplexValue(ComplexValue object) {
		try {
			IType type = jp.findType(MweUtil.toString(object.getClassName()));
			if (object.getId() != null) {
				if (beans.containsKey(object.getId())) {
					diagnostics.add(MweDiagnostic.warning("overwrites existing bean with id '" + object.getId()
							+ "' of type " + beans.get(object.getId()).getElementName(), object));
				}
				beans.put(object.getId(), type);
			}
			
			for (Assignment ass : object.getAssignments()) {
				//TODO validate
			}
			
		} catch (JavaModelException e) {
			diagnostics.add(MweDiagnostic.error(e.getMessage(), object, e));
		}
		return super.caseComplexValue(object);
	}

}
