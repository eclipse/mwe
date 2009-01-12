package org.eclipse.emf.mwe.di.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.service.IServiceRegistrationFactory;

/**
 * used to register components to be used at runtime.
 */
public class MWEUIConfig implements IServiceRegistrationFactory {

	public Set<IServiceRegistration> registrations() {
		Set<IServiceRegistration> generated = new HashSet<IServiceRegistration>();
		// do stuff 
		return generated;
	}

}
			
