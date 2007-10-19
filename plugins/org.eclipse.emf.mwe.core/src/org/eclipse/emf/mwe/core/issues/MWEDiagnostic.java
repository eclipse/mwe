package org.eclipse.emf.mwe.core.issues;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.internal.core.util.ComponentPrinter;

public class MWEDiagnostic extends BasicDiagnostic {

	private static final String ID = "org.eclipse.emf.mwe.core";

	private final Object element;
	private final WorkflowComponent ctx;

	public MWEDiagnostic(final int severity, final String msg,
			final Object element, final Throwable t,
			final List<Object> additionalData, final WorkflowComponent ctx) {
		super(severity, ID, Diagnostic.OK, msg, setup(element, t,
				additionalData, ctx));
		this.element = element;
		this.ctx = ctx;
	}

	private static Object[] setup(final Object element, final Throwable t,
			final List<Object> additionalData, final WorkflowComponent ctx) {
		List<Object> data = new ArrayList<Object>();
		if (element != null) {
			data.add(element);
		}
		if (t != null) {
			data.add(t);
		}
		if (ctx != null) {
			data.add(ctx);
		}
		if (additionalData != null) {
			data.addAll(additionalData);
		}
		return data.toArray();
	}

	public Object getElement() {
		return element;
	}

	public WorkflowComponent getContext() {
		return ctx;
	}

	@Override
	public String toString() {
		StringBuilder buff = new StringBuilder();
		buff.append("[");
		switch (severity) {
		case WARNING: {
			buff.append("WARNING");
			break;
		}
		case ERROR: {
			buff.append("ERROR");
			break;
		}
		default:
			buff.append("INFO");
			break;
		}
		buff.append("]");
		if (getMessage() != null) {
			buff.append(": " + getMessage());
		}
		buff.append("(Element: ");
		if (getElement() != null) {
			buff.append(getElementStringRep());
		} else {
			buff.append("-UNKNOWN-");
		}
		buff.append("; Reported by: ");
		if (getContext() != null) {
			buff.append(ComponentPrinter.getString(getContext()));
		} else {
			buff.append("-UNKNOWN-");
		}
		buff.append(")");
		if (getException() != null) {
			Throwable t = getException();
			StringWriter stringWriter = new StringWriter();
			t.printStackTrace(new PrintWriter(stringWriter));
			buff.append("\n\t " + stringWriter.toString());
		}

		return buff.toString();
	}

	private String getElementStringRep() {
		Object element = getElement();
		if (element instanceof EObject) {
			EObject eo = (EObject) element;
			String name = getEName(eo);
			if (name == null) {
				return eo.toString();
			}
			StringBuffer qfn = new StringBuffer();
			qfn.append(name);
			while (eo.eContainer() != null) {
				eo = eo.eContainer();
				name = getEName(eo);
				if (name != null) {
					qfn.insert(0, name + ".");
				}
			}
			return qfn.toString();
		}
		return element.toString();
	}

	private String getEName(final EObject eo) {
		EStructuralFeature f = eo.eClass().getEStructuralFeature("name");
		if (f == null) {
			return null;
		}
		return (String) eo.eGet(f);
	}

}
