package org.eclipse.emf.mwe.di.types.emf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.types.Type;

public class EMFType extends StaticType {

	private final EClass eclass;

	public EMFType(final EClass eclass) {
		this.eclass = eclass;
	}

	@Override
	public String getName() {
		return eclass.getName();
	}

	@Override
	public boolean hasProperty(final String name) {
		return getFeature(name) != null;
	}

	@SuppressWarnings("unchecked")
	public void inject(final Object target, final String feature, final Object value) {
		final EObject t = (EObject) target;
		final EStructuralFeature f = t.eClass().getEStructuralFeature(feature);
		if (f.isMany()) {
			((EList<Object>) t.eGet(f)).add(value);
		}
		else {
			t.eSet(f, value);
		}
	}

	public Object newInstance() {
		return eclass.getEPackage().getEFactoryInstance().create(eclass);
	}

	public Type typeForFeature(final String featureName) {
		final EStructuralFeature feature = eclass.getEStructuralFeature(featureName);
		if (feature instanceof EReference)
			return new EMFType((EClass) feature.getEType());
		return null;
	}

	private EStructuralFeature getFeature(final String name) {
		if (name == null)
			return null;

		return eclass.getEStructuralFeature(name);
	}

}
