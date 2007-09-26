/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorManager {

    protected Map<RGB,Color> fColorTable = new HashMap<RGB,Color>(10);

    public void dispose() {
        final Iterator<Color> e = fColorTable.values().iterator();
        while (e.hasNext()) {
			(e.next()).dispose();
		}
    }

    public Color getColor(final RGB rgb) {
        Color color = fColorTable.get(rgb);
        if (color == null) {
            color = new Color(Display.getCurrent(), rgb);
            fColorTable.put(rgb, color);
        }
        return color;
    }
}
