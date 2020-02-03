/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
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

	private Throwable throwable;

	private String feature;

	public MWEDiagnostic(final int severity, final String msg, final Object element, final String feature,
			final Throwable t, final List<Object> additionalData, final WorkflowComponent ctx) {
		super(severity, ID, Diagnostic.OK, msg, setup(element, feature, additionalData, ctx));
		this.throwable = t;
		this.element = element;
		this.feature = feature;
		this.ctx = ctx;
	}

	@Override
	public Throwable getException() {
		if (this.throwable == null)
			return super.getException();
		return this.throwable;
	}

	private static Object[] setup(final Object element, String feature, final List<Object> additionalData,
			final WorkflowComponent ctx) {
		List<Object> data = new ArrayList<Object>();
		// adding information to data, see Diagnostic.getData() java doc
		data.add(0, element);
		// we reserve the slot with index 1 even if feature==null, because
		// adding ctx or additionalData in the following steps
		// may cause conflicts or unexpected behavior
		data.add(1, feature);
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
			if (feature != null) {
				buff.append(" Feature: " + feature);
			}
		}
		else {
			buff.append("-UNKNOWN-");
		}
		buff.append("; Reported by: ");
		if (getContext() != null) {
			buff.append(ComponentPrinter.getString(getContext()));
		}
		else {
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
		Object nameValue = eo.eGet(f);
		if (nameValue instanceof String)
			return (String) nameValue;
		return null;
	}

}
