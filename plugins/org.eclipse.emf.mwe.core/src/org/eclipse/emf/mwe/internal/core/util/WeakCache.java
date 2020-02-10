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
package org.eclipse.emf.mwe.internal.core.util;

import java.util.Collection;
import java.util.WeakHashMap;

public abstract class WeakCache<K, V> {

	protected abstract V createNew(K arg0);

	private final WeakHashMap<K, V> internal = new WeakHashMap<K, V>();

	public V get(final K key) {
		if (internal.containsKey(key))
			return internal.get(key);
		final V r = createNew(key);
		internal.put(key, r);
		return r;
	}

	public Collection<V> getValues() {
		return internal.values();
	}

	/**
	 * Clears the cache.
	 * 
	 * @since 4.2
	 */
	public void clear() {
		internal.clear();
	}

}
