/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.container;

public class ConditionEvaluationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ConditionEvaluationException() {
		super();
	}
	
	public ConditionEvaluationException( String message ) {
		super( message );
	}

}
