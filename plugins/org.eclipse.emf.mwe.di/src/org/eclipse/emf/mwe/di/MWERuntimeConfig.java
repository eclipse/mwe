package org.eclipse.emf.mwe.di;

import java.util.Set;

/**
 * used to register components to be used at runtime.
 */
public class MWERuntimeConfig extends AbstractMWERuntimeConfig {

	public Set<IServiceRegistration> registrations() {
		
		
		Set<IServiceRegistration> generated = super.registrations();
		// do stuff 
		return generated;
	}

}
			
