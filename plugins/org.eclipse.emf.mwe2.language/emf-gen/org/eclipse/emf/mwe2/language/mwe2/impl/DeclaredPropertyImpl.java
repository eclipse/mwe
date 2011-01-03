/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Value;

import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmIdentifyableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredPropertyImpl extends ReferrableImplCustom implements DeclaredProperty
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmAnnotationReference> annotations;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final JvmVisibility VISIBILITY_EDEFAULT = JvmVisibility.DEFAULT;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected JvmVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedName = FULLY_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Value default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredPropertyImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Mwe2Package.Literals.DECLARED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmAnnotationReference> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentWithInverseEList<JvmAnnotationReference>(JvmAnnotationReference.class, this, Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS, TypesPackage.JVM_ANNOTATION_REFERENCE__TARGET);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType getDeclaringType()
	{
		if (eContainerFeatureID() != Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE) return null;
		return (JvmDeclaredType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaringType(JvmDeclaredType newDeclaringType, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newDeclaringType, Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringType(JvmDeclaredType newDeclaringType)
	{
		if (newDeclaringType != eInternalContainer() || (eContainerFeatureID() != Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE && newDeclaringType != null))
		{
			if (EcoreUtil.isAncestor(this, newDeclaringType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeclaringType != null)
				msgs = ((InternalEObject)newDeclaringType).eInverseAdd(this, TypesPackage.JVM_DECLARED_TYPE__MEMBERS, JvmDeclaredType.class, msgs);
			msgs = basicSetDeclaringType(newDeclaringType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE, newDeclaringType, newDeclaringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmVisibility getVisibility()
	{
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(JvmVisibility newVisibility)
	{
		JvmVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName()
	{
		return fullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedName(String newFullyQualifiedName)
	{
		String oldFullyQualifiedName = fullyQualifiedName;
		fullyQualifiedName = newFullyQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME, oldFullyQualifiedName, fullyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getDefault()
	{
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Value newDefault, NotificationChain msgs)
	{
		Value oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Value newDefault)
	{
		if (newDefault != default_)
		{
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.DECLARED_PROPERTY__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mwe2Package.DECLARED_PROPERTY__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule()
	{
		if (eContainerFeatureID() != Mwe2Package.DECLARED_PROPERTY__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newModule, Mwe2Package.DECLARED_PROPERTY__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule)
	{
		if (newModule != eInternalContainer() || (eContainerFeatureID() != Mwe2Package.DECLARED_PROPERTY__MODULE && newModule != null))
		{
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, Mwe2Package.MODULE__DECLARED_PROPERTIES, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mwe2Package.DECLARED_PROPERTY__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanonicalName()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotations()).basicAdd(otherEnd, msgs);
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeclaringType((JvmDeclaredType)otherEnd, msgs);
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				return basicSetDeclaringType(null, msgs);
			case Mwe2Package.DECLARED_PROPERTY__DEFAULT:
				return basicSetDefault(null, msgs);
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				return eInternalContainer().eInverseRemove(this, TypesPackage.JVM_DECLARED_TYPE__MEMBERS, JvmDeclaredType.class, msgs);
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				return eInternalContainer().eInverseRemove(this, Mwe2Package.MODULE__DECLARED_PROPERTIES, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				return getAnnotations();
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				return getDeclaringType();
			case Mwe2Package.DECLARED_PROPERTY__VISIBILITY:
				return getVisibility();
			case Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case Mwe2Package.DECLARED_PROPERTY__DEFAULT:
				return getDefault();
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				return getModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends JvmAnnotationReference>)newValue);
				return;
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				setDeclaringType((JvmDeclaredType)newValue);
				return;
			case Mwe2Package.DECLARED_PROPERTY__VISIBILITY:
				setVisibility((JvmVisibility)newValue);
				return;
			case Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName((String)newValue);
				return;
			case Mwe2Package.DECLARED_PROPERTY__DEFAULT:
				setDefault((Value)newValue);
				return;
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				setModule((Module)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				setDeclaringType((JvmDeclaredType)null);
				return;
			case Mwe2Package.DECLARED_PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case Mwe2Package.DECLARED_PROPERTY__DEFAULT:
				setDefault((Value)null);
				return;
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				setModule((Module)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE:
				return getDeclaringType() != null;
			case Mwe2Package.DECLARED_PROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? fullyQualifiedName != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(fullyQualifiedName);
			case Mwe2Package.DECLARED_PROPERTY__DEFAULT:
				return default_ != null;
			case Mwe2Package.DECLARED_PROPERTY__MODULE:
				return getModule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == JvmAnnotationTarget.class)
		{
			switch (derivedFeatureID)
			{
				case Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS: return TypesPackage.JVM_ANNOTATION_TARGET__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JvmIdentifyableElement.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == JvmMember.class)
		{
			switch (derivedFeatureID)
			{
				case Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE: return TypesPackage.JVM_MEMBER__DECLARING_TYPE;
				case Mwe2Package.DECLARED_PROPERTY__VISIBILITY: return TypesPackage.JVM_MEMBER__VISIBILITY;
				case Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME: return TypesPackage.JVM_MEMBER__FULLY_QUALIFIED_NAME;
				default: return -1;
			}
		}
		if (baseClass == JvmFeature.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == JvmAnnotationTarget.class)
		{
			switch (baseFeatureID)
			{
				case TypesPackage.JVM_ANNOTATION_TARGET__ANNOTATIONS: return Mwe2Package.DECLARED_PROPERTY__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == JvmIdentifyableElement.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == JvmMember.class)
		{
			switch (baseFeatureID)
			{
				case TypesPackage.JVM_MEMBER__DECLARING_TYPE: return Mwe2Package.DECLARED_PROPERTY__DECLARING_TYPE;
				case TypesPackage.JVM_MEMBER__VISIBILITY: return Mwe2Package.DECLARED_PROPERTY__VISIBILITY;
				case TypesPackage.JVM_MEMBER__FULLY_QUALIFIED_NAME: return Mwe2Package.DECLARED_PROPERTY__FULLY_QUALIFIED_NAME;
				default: return -1;
			}
		}
		if (baseClass == JvmFeature.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", fullyQualifiedName: ");
		result.append(fullyQualifiedName);
		result.append(')');
		return result.toString();
	}

} //DeclaredPropertyImpl
