package org.eclipse.emf.mwe.internal.ui.debug.model.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.PlatformUI;

/**
 * An EditorInput for a JarEntryFile.
 * copied from org.eclipse.jdt.internal.ui.javaeditor.JarEntryEditorInput 
 */
public class JarEntryEditorInput extends org.eclipse.jdt.internal.ui.javaeditor.JarEntryEditorInput implements IStorageEditorInput {

	private IStorage fJarEntryFile;

	public JarEntryEditorInput(IStorage jarEntryFile) {
		super(jarEntryFile);
	}

	public String getFullPath() {
		return fJarEntryFile.getFullPath().toString();
	}


	public String getToolTipText() {
		//TODO: ER: add corresponding plugin to the text
		// as it is for Files; This would be new, since it is also
		// not available in Java
		return fJarEntryFile.getFullPath().makeRelative().toString();
	}

	public ImageDescriptor getImageDescriptor() {
		IEditorRegistry registry = PlatformUI.getWorkbench()
				.getEditorRegistry();
		return registry.getImageDescriptor(fJarEntryFile.getFullPath()
				.getFileExtension());
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		if (adapter == IStorage.class) {
			return fJarEntryFile;
		}
        return fJarEntryFile.getAdapter(adapter);
	}

}
