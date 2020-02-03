/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.outline;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class Mwe2OutlineComparator extends SortOutlineContribution.DefaultComparator {

	@Override
	public int getCategory(IOutlineNode node) {
		if (node instanceof EStructuralFeatureNode) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeatureNode) node).getEStructuralFeature();
			if (eStructuralFeature == Mwe2Package.Literals.MODULE__IMPORTS)
				return 0;
			else if (eStructuralFeature == Mwe2Package.Literals.MODULE__DECLARED_PROPERTIES)
				return 10;
		}
		return 20;
	}

}
