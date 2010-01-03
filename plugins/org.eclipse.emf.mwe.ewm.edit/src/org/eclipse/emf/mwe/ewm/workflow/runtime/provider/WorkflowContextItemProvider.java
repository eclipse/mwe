/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowContextItemProvider.java,v 1.6 2010/01/03 21:25:07 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime.provider;


import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowContextItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContextItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addThreadPoolPropertyDescriptor(object);
			addLogLevelPropertyDescriptor(object);
			addWorkflowPropertyDescriptor(object);
			addActiveComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Thread Pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadPoolPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkflowContext_threadPool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkflowContext_threadPool_feature", "_UI_WorkflowContext_type"),
				 RuntimePackage.Literals.WORKFLOW_CONTEXT__THREAD_POOL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogLevelPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkflowContext_logLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkflowContext_logLevel_feature", "_UI_WorkflowContext_type"),
				 RuntimePackage.Literals.WORKFLOW_CONTEXT__LOG_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflowPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkflowContext_workflow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkflowContext_workflow_feature", "_UI_WorkflowContext_type"),
				 RuntimePackage.Literals.WORKFLOW_CONTEXT__WORKFLOW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveComponentsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkflowContext_activeComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkflowContext_activeComponents_feature", "_UI_WorkflowContext_type"),
				 RuntimePackage.Literals.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(RuntimePackage.Literals.WORKFLOW_CONTEXT__PARAMETERS);
			childrenFeatures.add(RuntimePackage.Literals.WORKFLOW_CONTEXT__STATES);
			childrenFeatures.add(RuntimePackage.Literals.WORKFLOW_CONTEXT__LOG);
			childrenFeatures.add(RuntimePackage.Literals.WORKFLOW_CONTEXT__EXECUTION_INFO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WorkflowContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkflowContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		ExecutorService labelValue = ((WorkflowContext)object).getThreadPool();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkflowContext_type") :
			getString("_UI_WorkflowContext_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(WorkflowContext.class))
		{
			case RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL:
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RuntimePackage.Literals.WORKFLOW_CONTEXT__PARAMETERS,
				 RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.WORKFLOW_PARAMETER_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(RuntimePackage.Literals.WORKFLOW_CONTEXT__STATES,
				 RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.WORKFLOW_STATE_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(RuntimePackage.Literals.WORKFLOW_CONTEXT__LOG,
				 RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.WORKFLOW_LOG_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(RuntimePackage.Literals.WORKFLOW_CONTEXT__EXECUTION_INFO,
				 RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.WORKFLOW_COMPONENT_EXECUTION_INFO_MAP)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
