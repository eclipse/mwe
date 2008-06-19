package org.eclipse.emf.mwe.di.types.emf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe.di.types.Type;

public class EMFType implements Type {

	private EClass eclass;

	public EMFType(EClass class1) {
		this.eclass = class1;
	}

	@SuppressWarnings("unchecked")
	public void inject(Object target, String feature, Object value) {
		EObject t = (EObject) target;
		EStructuralFeature f = t.eClass().getEStructuralFeature(feature);
		if (f.isMany()) {
			((EList<Object>)t.eGet(f)).add(value);
		} else {
			t.eSet(f,value);
		}
	}

	public Object newInstance() {
		return eclass.getEPackage().getEFactoryInstance().create(eclass);
	}

	public Type typeForFeature(String featureName) {
		EStructuralFeature feature = eclass.getEStructuralFeature(featureName);
		if (feature instanceof EReference) {
			return new EMFType((EClass) feature.getEType());
		}
		return null;
	}

}
