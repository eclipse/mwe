/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConcatItemProvider.java,v 1.1 2010/01/03 16:33:37 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.examples.concat.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.mwe.ewm.examples.concat.Concat;
import org.eclipse.emf.mwe.ewm.examples.concat.ConcatPackage;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowFactory;

import org.eclipse.emf.mwe.ewm.workflow.provider.WorkflowUnitOfWorkItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.mwe.ewm.examples.concat.Concat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcatItemProvider
	extends WorkflowUnitOfWorkItemProvider
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
	public ConcatItemProvider(AdapterFactory adapterFactory)
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

			addInputMessagePropertyDescriptor(object);
			addInputAppendMessagePropertyDescriptor(object);
			addOutputMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputMessagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Concat_inputMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Concat_inputMessage_feature", "_UI_Concat_type"),
				 ConcatPackage.Literals.CONCAT__INPUT_MESSAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Append Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputAppendMessagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Concat_inputAppendMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Concat_inputAppendMessage_feature", "_UI_Concat_type"),
				 ConcatPackage.Literals.CONCAT__INPUT_APPEND_MESSAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputMessagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Concat_outputMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Concat_outputMessage_feature", "_UI_Concat_type"),
				 ConcatPackage.Literals.CONCAT__OUTPUT_MESSAGE,
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
			childrenFeatures.add(ConcatPackage.Literals.CONCAT__INPUT_MESSAGE);
			childrenFeatures.add(ConcatPackage.Literals.CONCAT__INPUT_APPEND_MESSAGE);
			childrenFeatures.add(ConcatPackage.Literals.CONCAT__OUTPUT_MESSAGE);
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
	 * This returns Concat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Concat"));
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
		String label = ((Concat)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Concat_type") :
			getString("_UI_Concat_type") + " " + label;
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
				(ConcatPackage.Literals.CONCAT__INPUT_MESSAGE,
				 WorkflowFactory.eINSTANCE.createWorkflowParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ConcatPackage.Literals.CONCAT__INPUT_APPEND_MESSAGE,
				 WorkflowFactory.eINSTANCE.createWorkflowParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ConcatPackage.Literals.CONCAT__OUTPUT_MESSAGE,
				 WorkflowFactory.eINSTANCE.createWorkflowParameter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ConcatPackage.Literals.CONCAT__INPUT_MESSAGE ||
			childFeature == ConcatPackage.Literals.CONCAT__INPUT_APPEND_MESSAGE ||
			childFeature == ConcatPackage.Literals.CONCAT__OUTPUT_MESSAGE;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
		return ConcatEditPlugin.INSTANCE;
	}

}
