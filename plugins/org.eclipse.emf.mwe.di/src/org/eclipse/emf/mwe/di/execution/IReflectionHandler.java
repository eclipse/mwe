package org.eclipse.emf.mwe.di.execution;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public interface IReflectionHandler {
	/**
	 * @param className
	 * @return
	 */
	public Object instantiate(String className);
	
	/**
	 * @param target
	 * @param feature
	 * @param multiple
	 * @param value
	 */
	public void inject(Object target, String feature, Object value);

	/**
	 * @param parentsType
	 * @param feature
	 * @param multi
	 */
	public String getFeaturesTypeName(String type, String feature);
}
