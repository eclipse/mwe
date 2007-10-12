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
@SuppressWarnings("restriction")
public class JarEntryEditorInput extends org.eclipse.jdt.internal.ui.javaeditor.JarEntryEditorInput implements IStorageEditorInput {

	private IStorage fJarEntryFile;

	public JarEntryEditorInput(final IStorage jarEntryFile) {
		super(jarEntryFile);
	}

	public String getFullPath() {
		return fJarEntryFile.getFullPath().toString();
	}


	@Override
	public String getToolTipText() {
		//TODO: ER: add corresponding plugin to the text
		// as it is for Files; This would be new, since it is also
		// not available in Java
		return fJarEntryFile.getFullPath().makeRelative().toString();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		IEditorRegistry registry = PlatformUI.getWorkbench()
				.getEditorRegistry();
		return registry.getImageDescriptor(fJarEntryFile.getFullPath()
				.getFileExtension());
	}

	@Override
	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		if (adapter == IStorage.class) {
			return fJarEntryFile;
		}
        return fJarEntryFile.getAdapter(adapter);
	}

}
