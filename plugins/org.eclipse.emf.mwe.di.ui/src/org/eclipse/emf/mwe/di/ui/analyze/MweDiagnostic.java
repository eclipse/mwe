package org.eclipse.emf.mwe.di.ui.analyze;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.jdt.core.JavaModelException;

public class MweDiagnostic extends BasicDiagnostic {
	private static final String ID = "org.eclipse.emf.mwe.core";

	private final EObject context;

	private MweDiagnostic(final int severity, final String msg,
			final EObject context, final Throwable t,
			final List<Object> additionalData) {
		super(severity, ID, Diagnostic.OK, msg, toArray(context, t,
				additionalData));
		this.context = context;
	}

	private static Object[] toArray(Object element, Throwable t, List<Object> additionalData) {
		List<Object> data = new ArrayList<Object>();
		if (element != null) {
			data.add(element);
		}
		if (t != null) {
			data.add(t);
		}
		if (additionalData != null) {
			data.addAll(additionalData);
		}
		return data.toArray();
	}
	
	public EObject getContext() {
		return context;
	}
	
	public static MweDiagnostic error(String message, EObject ctx) {
		return new MweDiagnostic(Diagnostic.ERROR, message, ctx, null, null);
	}
	public static MweDiagnostic warning(String message, EObject ctx) {
		return new MweDiagnostic(Diagnostic.WARNING, message, ctx, null, null);
	}

	public static Diagnostic error(String message, EObject ctx, Throwable e) {
		return new MweDiagnostic(Diagnostic.ERROR, message, ctx, e, null);
	}
	
}
