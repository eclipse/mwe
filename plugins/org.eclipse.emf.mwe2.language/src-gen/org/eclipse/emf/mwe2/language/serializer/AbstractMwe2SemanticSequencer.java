package org.eclipse.emf.mwe2.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractMwe2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Mwe2GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Mwe2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Mwe2Package.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.COMPONENT:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRootComponentRule()) {
					sequence_RootComponent(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.DECLARED_PROPERTY:
				if(context == grammarAccess.getDeclaredPropertyRule()) {
					sequence_DeclaredProperty(context, (DeclaredProperty) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.PLAIN_STRING:
				if(context == grammarAccess.getPlainStringRule()) {
					sequence_PlainString(context, (PlainString) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.PROPERTY_REFERENCE:
				if(context == grammarAccess.getPropertyReferenceRule() ||
				   context == grammarAccess.getPropertyReferenceImplRule()) {
					sequence_PropertyReferenceImpl(context, (PropertyReference) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.REFERENCE:
				if(context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case Mwe2Package.STRING_LITERAL:
				if(context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (feature=[JvmIdentifiableElement|FQN] value=Value)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=[JvmType|FQN] | module=[Module|FQN])? name=FQN? autoInject?='auto-inject'? assignment+=Assignment*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[JvmType|FQN]? name=FQN default=Value?)
	 */
	protected void sequence_DeclaredProperty(EObject context, DeclaredProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=ImportedFQN
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (canonicalName=FQN imports+=Import* declaredProperties+=DeclaredProperty* root=RootComponent)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ConstantValue
	 */
	protected void sequence_PlainString(EObject context, PlainString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.PLAIN_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.PLAIN_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlainStringAccess().getValueConstantValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referable=[DeclaredProperty|FQN]
	 */
	protected void sequence_PropertyReferenceImpl(EObject context, PropertyReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyReferenceImplAccess().getReferableDeclaredPropertyFQNParserRuleCall_0_1(), semanticObject.getReferable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referable=[Referrable|FQN]
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getReferableReferrableFQNParserRuleCall_0_1(), semanticObject.getReferable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type=[JvmType|FQN] | module=[Module|FQN]) name=FQN? autoInject?='auto-inject'? assignment+=Assignment*)
	 */
	protected void sequence_RootComponent(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (begin=''' parts+=PlainString? (parts+=PropertyReference parts+=PlainString?)* end=''') | 
	 *         (begin='"' parts+=PlainString? (parts+=PropertyReference parts+=PlainString?)* end='"')
	 *     )
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
