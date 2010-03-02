package org.eclipse.emf.mwe2.language.scoping;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class MapBasedScope implements IScope {
	
	private Map<String, ? extends EObject> entries;
	
	public MapBasedScope(Map<String, ? extends EObject> entries) {
		this.entries = entries;
	}

	public IScope getOuterScope() {
		return IScope.NULLSCOPE;
	}
	
	public Iterable<IEObjectDescription> getAllContents() {
		return Iterables.transform(entries.entrySet(), new Function<Map.Entry<String, ? extends EObject>, IEObjectDescription>() {
			public IEObjectDescription apply(Map.Entry<String, ? extends EObject> from) {
				return new MapEntry(from);
			}
		});
	}
	
	public Iterable<IEObjectDescription> getContents() {
		return getAllContents();
	}
	
	public IEObjectDescription getContentByName(String name) {
		EObject element = entries.get(name);
		if (element != null)
			return EObjectDescription.create(name, element);
		return null;
	}
	
	public IEObjectDescription getContentByEObject(EObject object) {
		URI uri = EcoreUtil2.getURI(object);
		for(Map.Entry<String, ? extends EObject> entry: entries.entrySet()) {
			if (uri.equals(EcoreUtil2.getURI(entry.getValue())))
				return new MapEntry(entry);
		}
		return null;
	}
	
	public static class MapEntry implements IEObjectDescription {

		private final Map.Entry<String, ? extends EObject> entry;

		public MapEntry(Map.Entry<String, ? extends EObject> entry) {
			this.entry = entry;
		}
		
		public String getName() {
			return entry.getKey();
		}

		public String getQualifiedName() {
			return entry.getKey();
		}

		public EObject getEObjectOrProxy() {
			return entry.getValue();
		}

		public URI getEObjectURI() {
			return EcoreUtil2.getURI(entry.getValue());
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
