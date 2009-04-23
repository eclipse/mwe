package org.eclipse.emf.mwe.ewm.ui.editor;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class WorkflowComponentEditor extends Composite
{

	private Combo combo;
	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 */
	public WorkflowComponentEditor(Composite parent, int style, DataBindingContext context, EditingDomain editingDomain)
	{
		super(parent, style);
		this.context = context;
		this.editingDomain = editingDomain;
		
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		setLayout(gridLayout);
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);

		toolkit.createLabel(this, "Name:", SWT.NONE);

		Text componentName = toolkit.createText(this, null, SWT.NONE);
		final GridData gd_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
		componentName.setLayoutData(gd_name);

		toolkit.createLabel(this, "Type:", SWT.NONE);

		Text componentType = toolkit.createText(this, null, SWT.NONE);
		final GridData gd_type = new GridData(SWT.FILL, SWT.CENTER, true, false);
		componentType.setLayoutData(gd_type);

		final Label label = toolkit.createLabel(this, "Description:", SWT.NONE);
		label.setLayoutData(new GridData());

		Text componentDescription = toolkit.createText(this, null);
		final GridData gd_description = new GridData(SWT.FILL, SWT.CENTER, true, false);
		componentDescription.setLayoutData(gd_description);

		final Label strategyLabel = new Label(this, SWT.NONE);
		toolkit.adapt(strategyLabel, true, true);
		strategyLabel.setText("Strategy:");

		combo = new Combo(this, SWT.READ_ONLY);
		combo.setItems(WorkflowEditorExtensions.getComponentOrchestrationStrategies());
		toolkit.adapt(combo, true, true);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		combo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e)
			{
				String selected = combo.getItem(combo.getSelectionIndex());
				WorkflowComponentOrchestrationStrategy strategy = WorkflowEditorExtensions.createComponentOrchestrationStrategy(selected);
				Command command = SetCommand.create(WorkflowComponentEditor.this.editingDomain, component, WorkflowPackage.Literals.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY, strategy);
				WorkflowComponentEditor.this.editingDomain.getCommandStack().execute(command);
			}});

		nameWidgetObserver = SWTObservables.observeText(componentName, SWT.Modify);
		typeWidgetObserver = SWTObservables.observeText(componentType, SWT.Modify);
		descriptionWidgetObserver = SWTObservables.observeText(componentDescription, SWT.Modify);
	}

	public void bindToComponent(WorkflowComponent component)
	{
		this.component = component;

		combo.select(combo.indexOf(WorkflowEditorExtensions.getDisplayNameForComponentStrategy(component.getComponentOrchestrationStrategy().eClass().getName())));

		if(nameBinding != null)
		{
			context.removeBinding(nameBinding);
			context.removeBinding(typeBinding);
			context.removeBinding(descriptionBinding);
		}
		
		IObservableValue nameObservable = EMFEditObservables.observeValue(editingDomain, component, WorkflowPackage.Literals.WORKFLOW_COMPONENT__NAME);
		IObservableValue typeObservable = EMFEditObservables.observeValue(editingDomain, component, WorkflowPackage.Literals.WORKFLOW_COMPONENT__TYPE);
		IObservableValue descriptionObservable = EMFEditObservables.observeValue(editingDomain, component, WorkflowPackage.Literals.WORKFLOW_COMPONENT__DESCRIPTION);
		
		context.bindValue(nameWidgetObserver, nameObservable, null, null);
		context.bindValue(typeWidgetObserver, typeObservable, null, null);
		context.bindValue(descriptionWidgetObserver, descriptionObservable, null, null);
	}
	
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private DataBindingContext context;
	private EditingDomain editingDomain;
	private WorkflowComponent component;
	Binding nameBinding;
	Binding typeBinding;
	Binding descriptionBinding;
	IObservableValue nameWidgetObserver;
	IObservableValue typeWidgetObserver;
	IObservableValue descriptionWidgetObserver;
}
