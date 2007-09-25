/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions;

import java.lang.reflect.Method;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * Action group with 2 actions: "Toggle Breakpoints" and "Enable/Disable Breakpoints".<br>
 * Despite of usual breakpoint actions these actions can be used not only for vertical ruler context menu (incl.
 * double click), but also for editor context menu. That way "in line" breakpoints can be handled.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class BreakpointActionGroup extends ActionGroup {

	private EnableDisableBreakpointAction enableAction;

	private ToggleBreakpointAction toggleAction;

	private int lastSelectedLine;

	private int lastSelectedOffset;

	private IVerticalRuler verticalRuler;

	private boolean rulerSelected;

	private StyledText textWidget;

	// -------------------------------------------------------------------------

	public BreakpointActionGroup(final TextEditor editor) {
		Assert.isNotNull(editor);

		// Note: We don't want to define a new "IOurOwnTextEditor" interface, so we do it via Reflection
		Object obj = getterMethod("getSourceViewer", editor);
		if (obj == null)
			return;
		textWidget = ((ISourceViewer) obj).getTextWidget();

		obj = getterMethod("getVerticalRuler", editor);
		if (obj == null)
			return;
		verticalRuler = (IVerticalRuler) obj;

		enableAction = new EnableDisableBreakpointAction(editor, this);
		toggleAction = new ToggleBreakpointAction(editor, this);

		// set lastSelectedLine if RightMouseClick on text
		textWidget.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (e.button == 3)
					updateLastSelectedOffset(e.x, e.y);
			}

		});

		// set lastSelectedLine if RightMouseClick or DoubleClick on vertical ruler
		verticalRuler.getControl().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (e.button == 3)
					updateLastSelectedLine(e.y);

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				updateLastSelectedLine(e.y);
				// see note below for why we call it here
				toggleAction.run();
			}

		});
	}

	private void updateLastSelectedLine(int y) {
		// Note: we use our own "lastSelectedLine mechanism" (not the ruler's one) because of sequencing problems
		// our action mouseHandler would be called after the ruler mouseHandler, so for doubleClick the
		// lastSelectedLine value may not be correct
		// (see AbstractTextEditor.createPartCOntrol(): createVerticalRuler() is before createActions()
		rulerSelected = true;
		lastSelectedLine = verticalRuler.toDocumentLineNumber(y);
			lastSelectedOffset = textWidget.getOffsetAtLocation(new Point(0, y));
	}

	private void updateLastSelectedOffset(int x, int y) {
		rulerSelected = false;
		lastSelectedLine = verticalRuler.toDocumentLineNumber(y);
		lastSelectedOffset = textWidget.getOffsetAtLocation(new Point(x, y));
	}

	// -------------------------------------------------------------------------

	public boolean isRulerSelected() {
		return rulerSelected;
	}

	public int getLastSelectedLine() {
		return lastSelectedLine;
	}

	public int getLastSelectedOffset() {
		return lastSelectedOffset;
	}

	public int getOffsetAtLine(int line) {
		return textWidget.getOffsetAtLine(line);
	}

	// -------------------------------------------------------------------------

	@Override
	public void fillContextMenu(IMenuManager manager) {
		toggleAction.updateText();
		manager.appendToGroup("mwe", toggleAction);
		enableAction.updateText();
		manager.appendToGroup("mwe", enableAction);
	}

	@Override
	public void dispose() {
		enableAction = null;
		toggleAction = null;
		super.dispose();
	}

	private Object getterMethod(String name, Object element) {
		try {
			Method m = findMethod(name, element.getClass());
			if (m != null) {
				m.setAccessible(true);
				return m.invoke(element, new Object[] {});
			}
		} catch (Exception e) {
			System.out.println("error");
		}
		return null;
	}

	private Method findMethod(String name, Class<?> clazz) {
		if (!Object.class.equals(clazz)) {
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods)
				if (method.getName().equals(name))
					return method;
			return findMethod(name, clazz.getSuperclass());
		}
		return null;
	}

}
