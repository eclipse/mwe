/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.NullLiteral;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractMwe2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Mwe2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Mwe2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Mwe2Package.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case Mwe2Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Mwe2Package.COMPONENT:
				if (rule == grammarAccess.getComponentRule()
						|| rule == grammarAccess.getValueRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRootComponentRule()) {
					sequence_RootComponent(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.DECLARED_PROPERTY:
				sequence_DeclaredProperty(context, (DeclaredProperty) semanticObject); 
				return; 
			case Mwe2Package.DOUBLE_LITERAL:
				sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
				return; 
			case Mwe2Package.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Mwe2Package.INTEGER_LITERAL:
				sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
				return; 
			case Mwe2Package.MODULE:
				sequence_Module(context, (org.eclipse.emf.mwe2.language.mwe2.Module) semanticObject); 
				return; 
			case Mwe2Package.NULL_LITERAL:
				sequence_NullLiteral(context, (NullLiteral) semanticObject); 
				return; 
			case Mwe2Package.PLAIN_STRING:
				sequence_PlainString(context, (PlainString) semanticObject); 
				return; 
			case Mwe2Package.PROPERTY_REFERENCE:
				sequence_PropertyReferenceImpl(context, (PropertyReference) semanticObject); 
				return; 
			case Mwe2Package.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case Mwe2Package.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (feature=[JvmIdentifiableElement|FQN] value=Value)
	 * </pre>
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ASSIGNMENT__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ASSIGNMENT__FEATURE));
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getFeatureJvmIdentifiableElementFQNParserRuleCall_0_0_1(), semanticObject.eGet(Mwe2Package.Literals.ASSIGNMENT__FEATURE, false));
		feeder.accept(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns BooleanLiteral
	 *     BooleanLiteral returns BooleanLiteral
	 *
	 * Constraint:
	 *     isTrue?='true'?
	 * </pre>
	 */
	protected void sequence_BooleanLiteral(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Component returns Component
	 *     Value returns Component
	 *
	 * Constraint:
	 *     ((type=[JvmType|FQN] | module=[Module|FQN])? name=FQN? autoInject?='auto-inject'? assignment+=Assignment*)
	 * </pre>
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclaredProperty returns DeclaredProperty
	 *
	 * Constraint:
	 *     (type=[JvmType|FQN]? name=FQN default=Value?)
	 * </pre>
	 */
	protected void sequence_DeclaredProperty(ISerializationContext context, DeclaredProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns DoubleLiteral
	 *     DoubleLiteral returns DoubleLiteral
	 *
	 * Constraint:
	 *     value=DoubleValue
	 * </pre>
	 */
	protected void sequence_DoubleLiteral(ISerializationContext context, DoubleLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.DOUBLE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.DOUBLE_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleLiteralAccess().getValueDoubleValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=ImportedFQN
	 * </pre>
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns IntegerLiteral
	 *     IntegerLiteral returns IntegerLiteral
	 *
	 * Constraint:
	 *     value=IntValue
	 * </pre>
	 */
	protected void sequence_IntegerLiteral(ISerializationContext context, IntegerLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.INTEGER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerLiteralAccess().getValueIntValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Module returns Module
	 *
	 * Constraint:
	 *     (canonicalName=FQN imports+=Import* declaredProperties+=DeclaredProperty* root=RootComponent)
	 * </pre>
	 */
	protected void sequence_Module(ISerializationContext context, org.eclipse.emf.mwe2.language.mwe2.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns NullLiteral
	 *     NullLiteral returns NullLiteral
	 *
	 * Constraint:
	 *     {NullLiteral}
	 * </pre>
	 */
	protected void sequence_NullLiteral(ISerializationContext context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PlainString returns PlainString
	 *
	 * Constraint:
	 *     value=ConstantValue
	 * </pre>
	 */
	protected void sequence_PlainString(ISerializationContext context, PlainString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.PLAIN_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.PLAIN_STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PropertyReference returns PropertyReference
	 *     PropertyReferenceImpl returns PropertyReference
	 *
	 * Constraint:
	 *     referable=[DeclaredProperty|FQN]
	 * </pre>
	 */
	protected void sequence_PropertyReferenceImpl(ISerializationContext context, PropertyReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1(), semanticObject.eGet(Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     referable=[Referrable|FQN]
	 * </pre>
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1(), semanticObject.eGet(Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RootComponent returns Component
	 *
	 * Constraint:
	 *     ((type=[JvmType|FQN] | module=[Module|FQN]) name=FQN? autoInject?='auto-inject'? assignment+=Assignment*)
	 * </pre>
	 */
	protected void sequence_RootComponent(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     (
	 *         (begin=''' parts+=PlainString? (parts+=PropertyReference parts+=PlainString?)* end=''') | 
	 *         (begin='"' parts+=PlainString? (parts+=PropertyReference parts+=PlainString?)* end='"')
	 *     )
	 * </pre>
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
