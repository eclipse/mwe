package org.eclipse.emf.mwe.core.customizer;

@SuppressWarnings("serial")
public class CustomizationException extends RuntimeException {

	public CustomizationException() {
		super();
	}
	
	public CustomizationException( final String message ) {
		super(message);
	}
	
}
