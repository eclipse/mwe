/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.DescriptionAddingContainer;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.DefaultContainer;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class Mwe2StateBasedContainerManager extends StateBasedContainerManager {

	/**
	 * In contrast to super.{@link #getVisibleContainers(IResourceDescription, IResourceDescriptions)}, this
	 * implementation will never return an empty list of containers.
	 * 
	 * If the current resource (desc) is not in any container, a new container will be created.
	 * 
	 * see https://bugs.eclipse.org/bugs/show_bug.cgi?id=378958
	 */
	@Override
	public List<IContainer> getVisibleContainers(IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
		String root = internalGetContainerHandle(desc, resourceDescriptions);
		List<String> handles = getState(resourceDescriptions).getVisibleContainerHandles(root);
		List<IContainer> result = getVisibleContainers(handles, resourceDescriptions);
		if (result.isEmpty())
			result.add(new DefaultContainer(Collections.singleton(desc)));
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
