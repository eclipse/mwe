/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.DescriptionAddingContainer;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.AbstractContainer;

/**
 * This container manager can handle resources that are not yet contained in any
 * container and that do not allow to compute a container handle for them. The use
 * case is a standalone environments that was not yet properly compiled, e.g. the
 * module was not copied to the /bin folder of the eclipse project and therefore the
 * resource is not on the classpath of the current Java process.
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class Mwe2StateBasedContainerManager extends StateBasedContainerManager {

	/**
	 * In contrast to {@link StateBasedContainerManager#getVisibleContainers(IResourceDescription, IResourceDescriptions) super.getVisibleContainers(..)}, this
	 * implementation will never return an empty list of containers.
	 * 
	 * If the current resource (desc) is not in any container, a new container will be created.
	 * 
	 * see https://bugs.eclipse.org/bugs/show_bug.cgi?id=378958
	 */
	@Override
	public List<IContainer> getVisibleContainers(final IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
		String root = internalGetContainerHandle(desc, resourceDescriptions);
		List<String> handles = getState(resourceDescriptions).getVisibleContainerHandles(root);
		List<IContainer> result = getVisibleContainers(handles, resourceDescriptions);
		if (result.isEmpty())
			result.add(new AbstractContainer() {
				@Override
				public Iterable<IResourceDescription> getResourceDescriptions() {
					return Collections.singletonList(desc);
				}
			});
		else {
			IContainer first = result.get(0);
			if (!first.hasResourceDescription(desc.getURI())) {
				first = new DescriptionAddingContainer(desc, first);
				result.set(0, first);
			}
		}
		return result;
	}

}
