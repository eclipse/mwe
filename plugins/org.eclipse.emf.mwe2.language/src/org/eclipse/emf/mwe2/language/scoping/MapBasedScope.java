/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class MapBasedScope implements IScope {
	
	private Map<QualifiedName, ? extends EObject> entries;
	
	public MapBasedScope(Map<QualifiedName, ? extends EObject> entries) {
		this.entries = entries;
	}

	public IScope getOuterScope() {
		return IScope.NULLSCOPE;
	}
	
	public Iterable<IEObjectDescription> getAllContents() {
		return Iterables.transform(entries.entrySet(), new Function<Map.Entry<QualifiedName, ? extends EObject>, IEObjectDescription>() {
			public IEObjectDescription apply(Map.Entry<QualifiedName, ? extends EObject> from) {
				return new MapEntry(from);
			}
		});
	}
	
	public Iterable<IEObjectDescription> getContents() {
		return getAllContents();
	}
	
	public IEObjectDescription getContentByName(QualifiedName qualifiedName) {
		EObject element = entries.get(qualifiedName);
		if (element != null)
			return EObjectDescription.create(qualifiedName, element);
		return null;
	}
	
	public IEObjectDescription getContentByEObject(EObject object) {
		URI uri = EcoreUtil.getURI(object);
		for(Map.Entry<QualifiedName, ? extends EObject> entry: entries.entrySet()) {
			if (uri.equals(EcoreUtil.getURI(entry.getValue())))
				return new MapEntry(entry);
		}
		return null;
	}
	
	public Iterable<IEObjectDescription> getAllContentsByEObject(EObject object) {
		List<IEObjectDescription> result = Lists.newArrayList();
		URI uri = EcoreUtil.getURI(object);
		for(Map.Entry<QualifiedName, ? extends EObject> entry: entries.entrySet()) {
			if (uri.equals(EcoreUtil.getURI(entry.getValue())))
				result.add(new MapEntry(entry));
		}
		return result;
	}
	
	public static class MapEntry implements IEObjectDescription {

		private final Map.Entry<QualifiedName, ? extends EObject> entry;

		public MapEntry(Map.Entry<QualifiedName, ? extends EObject> entry) {
			this.entry = entry;
		}
		
		public QualifiedName getName() {
			return entry.getKey();
		}

		public QualifiedName getQualifiedName() {
			return entry.getKey();
		}

		public EObject getEObjectOrProxy() {
			return entry.getValue();
		}

		public URI getEObjectURI() {
			return EcoreUtil.getURI(entry.getValue());
		}

		public EClass getEClass() {
			return entry.getValue().eClass();
		}

		public String getUserData(String name) {
			return null;
		}

		public String[] getUserDataKeys() {
			return new String[0];
		}
		
	}
}
