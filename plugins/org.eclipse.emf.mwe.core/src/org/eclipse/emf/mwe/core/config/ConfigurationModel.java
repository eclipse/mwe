package org.eclipse.emf.mwe.core.config;


public interface ConfigurationModel {

	Object getFeature( String featureName );

	boolean featureExists( String featureName );
	
	boolean isFeatureSelected(String featureName) throws FeatureNotFound;

	public Object getAttributeValue( String featureName, String attributeName ) throws FeatureNotFound, AttributeNotFound;
	
}
