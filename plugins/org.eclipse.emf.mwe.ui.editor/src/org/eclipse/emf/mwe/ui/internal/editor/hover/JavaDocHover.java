/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.hover;

import org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.ui.IEditorPart;


/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class JavaDocHover implements IJavaEditorTextHover, ITextHover,
ITextHoverExtension2 {

	/**
	 * This automatically generated method overrides the implementation
	 * of <code>getHoverInfo</code> inherited from the superclass.
	 *
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 */
	@SuppressWarnings("deprecation")
	public String getHoverInfo(final ITextViewer textViewer, final IRegion hoverRegion) {
		final Object obj = getHoverInfo2(textViewer, hoverRegion);
		if (obj instanceof String)
			return (String) obj;
		else
			return null;
	}

	/**
	 * This automatically generated method overrides the implementation
	 * of <code>getHoverInfo2</code> inherited from the superclass.
	 *
	 * @see org.eclipse.jface.text.ITextHoverExtension2#getHoverInfo2(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 */
	public Object getHoverInfo2(final ITextViewer textViewer, final IRegion hoverRegion) {
		// TODO Automatically generated method stub. Review needed!
		return null;
	}

	/**
	 * This automatically generated method overrides the implementation
	 * of <code>getHoverRegion</code> inherited from the superclass.
	 *
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(final ITextViewer textViewer, final int offset) {
		// TODO Automatically generated method stub. Review needed!
		return null;
	}

	/**
	 * This automatically generated method overrides the implementation
	 * of <code>setEditor</code> inherited from the superclass.
	 *
	 * @see org.eclipse.jdt.ui.text.java.hover.IJavaEditorTextHover#setEditor(org.eclipse.ui.IEditorPart)
	 */
	public void setEditor(final IEditorPart editor) {
		// TODO Automatically generated method stub. Review needed!

	}

}
