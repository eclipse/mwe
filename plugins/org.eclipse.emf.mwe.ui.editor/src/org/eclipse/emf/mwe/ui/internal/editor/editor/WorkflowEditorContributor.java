package org.eclipse.emf.mwe.ui.internal.editor.editor;

import java.util.ResourceBundle;

import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.texteditor.BasicTextEditorActionContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.RetargetTextEditorAction;

/**
 * Manages the installation and deinstallation of actions for the editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class WorkflowEditorContributor extends
		BasicTextEditorActionContributor {

	protected RetargetTextEditorAction contentAssistProposal;

	protected RetargetTextEditorAction contentAssistTip;

	protected RetargetTextEditorAction formatProposal;

	/**
	 * Constructor for WorkflowEditorContributor. Creates a new contributor in
	 * the form of adding Content Assist, Content Format and Assist tip menu
	 * items
	 */
	public WorkflowEditorContributor() {
		super();
		final ResourceBundle bundle =
				WorkflowEditorPlugin.getDefault().getResourceBundle();

		contentAssistProposal =
				new RetargetTextEditorAction(bundle, "ContentAssistProposal.");
		formatProposal =
				new RetargetTextEditorAction(bundle, "ContentFormatProposal.");
		contentAssistTip =
				new RetargetTextEditorAction(bundle, "ContentAssistTip.");
	}

	@Override
	public void contributeToMenu(final IMenuManager mm) {
		super.contributeToMenu(mm);
		final IMenuManager editMenu =
				mm.findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
		if (editMenu != null) {
			editMenu.add(new Separator());
			editMenu.add(contentAssistProposal);
			editMenu.add(formatProposal);
			editMenu.add(contentAssistTip);
		}
	}

	/**
	 * 
	 * Contributes to the toolbar.
	 * 
	 * @see EditorActionBarContributor#contributeToToolBar
	 */
	@Override
	public void contributeToToolBar(final IToolBarManager tbm) {
		super.contributeToToolBar(tbm);
		tbm.add(new Separator());
	}

	@Override
	public void setActiveEditor(final IEditorPart part) {
		super.setActiveEditor(part);

		ITextEditor editor = null;
		if (part instanceof ITextEditor)
			editor = (ITextEditor) part;

		contentAssistProposal.setAction(getAction(editor,
				"ContentAssistProposal"));
		formatProposal.setAction(getAction(editor, "ContentFormatProposal"));
		contentAssistTip.setAction(getAction(editor, "ContentAssistTip"));

	}

}
