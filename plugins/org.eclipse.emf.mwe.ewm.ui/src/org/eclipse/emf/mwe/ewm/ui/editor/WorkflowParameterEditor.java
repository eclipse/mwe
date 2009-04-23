package org.eclipse.emf.mwe.ewm.ui.editor;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WorkflowParameterEditor extends Composite
{

	/**
	 * Create the composite
	 * @param parent
	 * @param style
	 */
	public WorkflowParameterEditor(Composite parent, int style, DataBindingContext context, EditingDomain editingDomain)
	{
		super(parent, style);
		this.context = context;
		this.editingDomain = editingDomain;
		
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		setLayout(gridLayout);

		final Label nameLabel = new Label(this, SWT.NONE);
		nameLabel.setText("Name:");

		Text name = new Text(this, SWT.BORDER);
		final GridData gd_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
		name.setLayoutData(gd_name);

		final Label descriptionLabel = new Label(this, SWT.NONE);
		descriptionLabel.setText("Description:");

		Text description = new Text(this, SWT.BORDER);
		final GridData gd_description = new GridData(SWT.FILL, SWT.CENTER, true, false);
		description.setLayoutData(gd_description);

		final Label typeLabel = new Label(this, SWT.NONE);
		typeLabel.setLayoutData(new GridData());
		typeLabel.setText("Type:");

		Combo type = new Combo(this, SWT.READ_ONLY);
		type.setItems(new String[] {"String"});
		type.select(0);
		final GridData gd_type = new GridData(SWT.FILL, SWT.CENTER, true, false);
		type.setLayoutData(gd_type);

		final Label strategyLabel = new Label(this, SWT.NONE);
		strategyLabel.setText("Strategy:");

		Combo strategy = new Combo(this, SWT.READ_ONLY);
		strategy.setItems(new String[] {"Default"});
		strategy.select(0);
		final GridData gd_strategy = new GridData(SWT.FILL, SWT.CENTER, true, false);
		strategy.setLayoutData(gd_strategy);

		final Button required = new Button(this, SWT.CHECK);
		final GridData gd_required = new GridData();
		required.setLayoutData(gd_required);
		required.setText("Required");
		new Label(this, SWT.NONE);
		
		nameWidgetObserver = SWTObservables.observeText(name, SWT.Modify);
		descriptionWidgetObserver = SWTObservables.observeText(description, SWT.Modify);
	}
	
	public void bindToParameter(WorkflowParameter parameter)
	{
		if(nameBinding != null)
		{
			context.removeBinding(nameBinding);
			context.removeBinding(descriptionBinding);
		}
		
		IObservableValue nameObserver = EMFEditObservables.observeValue(editingDomain, parameter, WorkflowPackage.Literals.WORKFLOW_PARAMETER__NAME);
		IObservableValue descriptionObserver = EMFEditObservables.observeValue(editingDomain, parameter, WorkflowPackage.Literals.WORKFLOW_PARAMETER__DESCRIPTION);
		
		nameBinding = context.bindValue(nameWidgetObserver, nameObserver, null, null);
		descriptionBinding = context.bindValue(descriptionWidgetObserver, descriptionObserver, null, null);
	}
	
	@Override
	protected void checkSubclass()
	{
	// Disable the check that prevents subclassing of SWT components
	}

	private DataBindingContext context;
	private EditingDomain editingDomain;
	private Binding nameBinding;
	private Binding descriptionBinding;
	private IObservableValue nameWidgetObserver;
	private IObservableValue descriptionWidgetObserver;
}
