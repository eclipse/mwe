/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.config;


public interface ConfigurationModel {

	Object getFeature( String featureName );

	boolean featureExists( String featureName );
	
	boolean isFeatureSelected(String featureName) throws FeatureNotFound;

	public Object getAttributeValue( String featureName, String attributeName ) throws FeatureNotFound, AttributeNotFound;
	
}
