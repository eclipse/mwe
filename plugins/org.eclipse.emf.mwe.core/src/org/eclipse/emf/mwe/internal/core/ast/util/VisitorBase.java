/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyFileAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;

public abstract class VisitorBase {

	protected Log log = LogFactory.getLog(getClass());

	protected ResourceLoader loader = ResourceLoaderFactory.createResourceLoader();

	public final Object visit(final AbstractASTBase ele) {
		Object result = visitAbstractASTBase(ele);
		if (result == null && ele instanceof InclusionAST) {
			result = visitInclusionAST((InclusionAST) ele);
		}
		if (result == null && ele instanceof ComponentAST) {
			result = visitComponentAST((ComponentAST) ele);
		}
		if (result == null && ele instanceof DeclaredPropertyAST) {
			result = visitDeclaredPropertyAST((DeclaredPropertyAST) ele);
		}
		if (result == null && ele instanceof DeclaredPropertyFileAST) {
			result = visitDeclaredPropertyFileAST((DeclaredPropertyFileAST) ele);
		}
		if (result == null && ele instanceof ReferenceAST) {
			result = visitReferenceAST((ReferenceAST) ele);
		}
		if (result == null && ele instanceof SimpleParamAST) {
			result = visitSimpleParamAST((SimpleParamAST) ele);
		}
		return result;
	}

	public Object visitAbstractASTBase(final AbstractASTBase ele) {
		return null;
	}

	public Object visitComponentAST(final ComponentAST ele) {
		return null;
	}

	public Object visitInclusionAST(final InclusionAST ele) {
		return null;
	}

	public Object visitDeclaredPropertyAST(final DeclaredPropertyAST ele) {
		return null;
	}

	public Object visitDeclaredPropertyFileAST(final DeclaredPropertyFileAST ele) {
		return null;
	}

	public Object visitReferenceAST(final ReferenceAST ele) {
		return null;
	}

	public Object visitSimpleParamAST(final SimpleParamAST ele) {
		return null;
	}

}
