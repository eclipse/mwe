/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core.issues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.WorkflowComponent;

public class IssuesImpl implements Issues {
	private final List<Diagnostic> issues = new ArrayList<Diagnostic>();

	public void add(final Diagnostic issue) {
			issues.add(issue);
	}

	public void addError(final WorkflowComponent ctx, final String msg,
			final Object element, final Throwable t, final List<Object> additionalData) {
		add(createError(ctx, msg, element, t, additionalData));
	}

	public void addError(final WorkflowComponent ctx, final String msg) {
		addError(ctx, msg, null, null, Collections.emptyList());
	}

	public void addError(final String msg, final Object element) {
		addError(null, msg, element, null, Collections.emptyList());
	}

	public void addError(final String msg) {
		addError(msg, (Object) null);
	}
	
	public void addError(WorkflowComponent compnent, String msg, Object obj) {
		addError(compnent,msg, obj, null, Collections.EMPTY_LIST);
	}

	public boolean hasErrors() {
		return getErrors().length!=0;
	}

	public Diagnostic[] getErrors() {
		return filterIssues(Diagnostic.ERROR);
	}

	public void addWarning(final WorkflowComponent ctx, final String msg) {
		addWarning(ctx, msg, null, null, Collections.emptyList());
	}

	public void addWarning(final String msg, final Object element) {
		addWarning(null, msg, element, null, Collections.emptyList());
	}

	public void addWarning(final WorkflowComponent ctx, final String msg,
			final Object element, final Throwable t, final List<Object> additionalData) {
		add(createWarning(ctx, msg, element, t, additionalData));
	}

	public void addWarning(final String msg) {
		addWarning(msg, null);
	}
	
	public void addWarning(WorkflowComponent compnent, String msg, Object obj) {
		addWarning(compnent,msg, obj, null, Collections.EMPTY_LIST);
	}

	public Diagnostic[] getWarnings() {
		return filterIssues(Diagnostic.WARNING);
	}

	public boolean hasWarnings() {
		return getWarnings().length!=0;
	}

	public void addInfo(final WorkflowComponent ctx, final String msg) {
		addInfo(ctx, msg, null, null, Collections.emptyList());
	}

	public void addInfo(final String msg, final Object element) {
		addInfo(null, msg, element, null, Collections.emptyList());
	}

	public void addInfo(final WorkflowComponent ctx, final String msg,
			final Object element, final Throwable t, final List<Object> additionalData) {
		add(createInfo(ctx, msg, element, t, additionalData));
	}
	
	public void addInfo(WorkflowComponent compnent, String msg, Object obj) {
		addInfo(compnent,msg, obj, null, Collections.EMPTY_LIST);
	}

	public void addInfo(final String msg) {
		addInfo(msg, null);
	}

	public Diagnostic[] getInfos() {
		return filterIssues(Diagnostic.INFO);
	}

	public boolean hasInfos() {
		return getInfos().length!=0;
	}

	@Override
	public String toString() {
		final StringBuffer buff = new StringBuffer();
		Diagnostic[] issues = getInfos();
		for (final Diagnostic issue : issues) {
			buff.append("\n" + issue.toString());
		}
		issues = getWarnings();
		for (final Diagnostic issue : issues) {
			buff.append("\n" + issue.toString());
		}
		issues = getErrors();
		for (final Diagnostic issue : issues) {
			buff.append("\n" + issue.toString());
		}
		return buff.toString();
	}

	public void clear() {
		issues.clear();
	}

	private static MWEDiagnostic createDiagnostic(final int severity,
			final WorkflowComponent ctx, final String msg, final Object element, final Throwable t,
			final List<Object> additionalData) {
		MWEDiagnostic diagnostic = new MWEDiagnostic(severity, msg, element, t,
				additionalData, ctx);
		return diagnostic;
	}

	private static MWEDiagnostic createInfo(final WorkflowComponent ctx, final String msg,
			final Object element, final Throwable t, final List<Object> additionalData) {
		MWEDiagnostic diagnostic = createDiagnostic(Diagnostic.INFO, ctx, msg,
				element, t, additionalData);
		return diagnostic;
	}

	private static MWEDiagnostic createWarning(final WorkflowComponent ctx,
			final String msg, final Object element, final Throwable t, final List<Object> additionalData) {
		MWEDiagnostic diagnostic = createDiagnostic(Diagnostic.WARNING, ctx,
				msg, element, t, additionalData);
		;
		return diagnostic;
	}

	private static MWEDiagnostic createError(final WorkflowComponent ctx, final String msg,
			final Object element, final Throwable t, final List<Object> additionalData) {
		MWEDiagnostic diagnostic = createDiagnostic(Diagnostic.ERROR, ctx, msg,
				element, t, additionalData);
		return diagnostic;
	}

	private Diagnostic[] filterIssues(final int severity) {
		List<Diagnostic>result = new ArrayList<Diagnostic>();
		for (Diagnostic diagnostic : issues) {
			if ( diagnostic.getSeverity()==severity){
				result.add(diagnostic);
			}
		}
		return result.toArray(new Diagnostic[result.size()]);
	}
	
	public Diagnostic[] getIssues() {
		return issues.toArray(new Diagnostic[issues.size()]);
	}

}
