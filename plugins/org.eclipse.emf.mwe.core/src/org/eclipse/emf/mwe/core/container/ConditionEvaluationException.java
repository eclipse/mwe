/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
