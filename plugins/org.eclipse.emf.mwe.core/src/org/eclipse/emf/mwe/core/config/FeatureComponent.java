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
package org.eclipse.emf.mwe.core.config;

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.container.ConditionEvaluationException;
import org.eclipse.emf.mwe.core.container.ConditionalComponent;
import org.eclipse.emf.mwe.core.issues.Issues;

public class FeatureComponent extends ConditionalComponent {

	public FeatureComponent() {
		super("feature");
	}

	private String isSelected = null;
	private String isNotSelected = null;

	public void setIsSelected(final String name) {
		this.isSelected = name;
	}

	public void setIsNotSelected(final String name) {
		this.isNotSelected = name;
	}

	@Override
	public void checkConfiguration(final Issues issues) throws ConfigurationException {
		super.checkConfiguration(issues);
		if (isSelected == null && isNotSelected == null) {
			issues.addError(this, "you have to specify eithre an exists or notExits.");
		}
	}

	@Override
	public boolean evaluate() {
		ConfigurationModel configuration = GlobalConfigurationHolder.getConfiguration();
		if (configuration == null)
			throw new ConditionEvaluationException("no configuration model specified.");

		if ((isSelected != null) && !configuration.featureExists(isSelected))
			throw new ConditionEvaluationException("the feature '" + isSelected
					+ "' is not defined in the configuration model.");
		if ((isNotSelected != null) && !configuration.featureExists(isNotSelected))
			throw new ConditionEvaluationException("the feature '" + isNotSelected
					+ "' is not defined in the configuration model.");
		try {
			if ((isSelected != null) && (isNotSelected == null))
				return configuration.isFeatureSelected(isSelected);
			if ((isSelected == null) && (isNotSelected != null))
				return !configuration.isFeatureSelected(isNotSelected);
			if ((isSelected != null) && (isNotSelected != null))
				return configuration.isFeatureSelected(isSelected) && !configuration.isFeatureSelected(isNotSelected);
		}
		catch (FeatureNotFound cannotHappen) {
			// this has been handled before in the checks above.
			throw new ConditionEvaluationException("exception: " + cannotHappen.getMessage());
		}
		return false;
	}

	@Override
	public String getLogMessage() {
		try {
			return "feature ( exists " + isSelected + " ): " + evaluate();
		}
		catch (ConditionEvaluationException ex) {
			return "feature ( exists " + isSelected + " ): cannot be evaluated; " + ex.getMessage();
		}
	}

}
