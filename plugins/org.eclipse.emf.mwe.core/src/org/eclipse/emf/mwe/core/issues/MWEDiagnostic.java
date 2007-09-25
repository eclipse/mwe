package org.eclipse.emf.mwe.core.issues;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.internal.core.util.ComponentPrinter;

public class MWEDiagnostic implements Diagnostic, DiagnosticChain {

	private static final String ID = "org.eclipse.emf.mwe.core";

	/**
	 * The severity.
	 * 
	 * @see #getSeverity
	 */
	protected int severity;

	/**
	 * The message.
	 * 
	 * @see #getMessage
	 */
	protected String message;

	/**
	 * The message.
	 * 
	 * @see #getMessage
	 */
	protected List<Diagnostic> children;

	/**
	 * The data.
	 * 
	 * @see #getData
	 */
	protected List<Object> data = new ArrayList<Object>();

	/**
	 * The source.
	 * 
	 * @see #getSource
	 */
	protected String source = ID;

	/**
	 * The code.
	 * 
	 * @see #getCode
	 */
	protected int code = Diagnostic.OK;

	private final Object element;
	private final WorkflowComponent ctx;

	private final Throwable throwable;

	public MWEDiagnostic(int severity, String msg, Object element, Throwable t,
			List<Object> additionalData, WorkflowComponent ctx) {
		throwable = t;
		message = msg;
		setSeverity(severity);
		this.element = element;
		this.ctx = ctx;
		if (getElement() != null) {
			data.add(element);
		}
		if (getException() != null) {
			data.add(getException());
		}
		if (getContext() != null) {
			data.add(getContext());
		}
		if (additionalData != null) {
			data.addAll(additionalData);
		}
	}

	protected void setSeverity(int severity) {
		this.severity = severity;
	}

	public int getSeverity() {
		return severity;
	}

	public String getMessage() {
		return message;
	}

	public List<?> getData() {
		return data;
	}

	public List<Diagnostic> getChildren() {
		if (children == null) {
			return Collections.emptyList();
		}
		return Collections.unmodifiableList(children);
	}

	protected void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	protected void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void add(Diagnostic diagnostic) {
		if (children == null) {
			children = new BasicEList<Diagnostic>();
		}

		children.add(diagnostic);
		int childSeverity = diagnostic.getSeverity();
		if (childSeverity > getSeverity()) {
			severity = childSeverity;
		}
	}

	public void addAll(Diagnostic diagnostic) {
		for (Diagnostic child : diagnostic.getChildren()) {
			add(child);
		}
	}

	public void merge(Diagnostic diagnostic) {
		if (diagnostic.getChildren().isEmpty()) {
			add(diagnostic);
		} else {
			addAll(diagnostic);
		}
	}

	public int recomputeSeverity() {
		if (children != null) {
			severity = OK;
			for (Diagnostic child : children) {
				int childSeverity = child instanceof BasicDiagnostic ? ((BasicDiagnostic) child)
						.recomputeSeverity()
						: child.getSeverity();
				if (childSeverity > severity) {
					severity = childSeverity;
				}
			}
		}

		return severity;
	}

	public Throwable getException() {
		return throwable;
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
			if (name == null)
				return eo.toString();
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

	private String getEName(EObject eo) {
		EStructuralFeature f = eo.eClass().getEStructuralFeature("name");
		if (f == null)
			return null;
		return (String) eo.eGet(f);
	}

}
