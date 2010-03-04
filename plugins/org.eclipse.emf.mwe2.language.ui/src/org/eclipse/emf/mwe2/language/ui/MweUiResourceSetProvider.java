package org.eclipse.emf.mwe2.language.ui;

import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.jdt.core.IJavaProject;

public class MweUiResourceSetProvider extends MweResourceSetProvider {

	@Override
	protected boolean isExpectedContext(Object classpathURIContext) {
		return classpathURIContext instanceof IJavaProject;
	}
}
