/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowPackage.java,v 1.3 2008/02/24 00:54:52 pschonbac Exp $
 */
package workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "workflow";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "workflow";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "workflow";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

    /**
     * The meta object id for the '{@link workflow.impl.WorkflowFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.WorkflowFileImpl
     * @see workflow.impl.WorkflowPackageImpl#getWorkflowFile()
     * @generated
     */
    int WORKFLOW_FILE = 0;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_FILE__ASSIGNMENT = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_FILE__PROPERTIES = 1;

    /**
     * The number of structural features of the '<em>File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_FILE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link workflow.impl.WorkflowElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.WorkflowElementImpl
     * @see workflow.impl.WorkflowPackageImpl#getWorkflowElement()
     * @generated
     */
    int WORKFLOW_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_ELEMENT__LABEL = 0;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_ELEMENT__LENGTH = 1;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_ELEMENT__OFFSET = 2;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_ELEMENT__IMAGE = 3;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link workflow.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.PropertyImpl
     * @see workflow.impl.WorkflowPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__LABEL = WORKFLOW_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__LENGTH = WORKFLOW_ELEMENT__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__OFFSET = WORKFLOW_ELEMENT__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__IMAGE = WORKFLOW_ELEMENT__IMAGE;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link workflow.impl.SimplePropertyImpl <em>Simple Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.SimplePropertyImpl
     * @see workflow.impl.WorkflowPackageImpl#getSimpleProperty()
     * @generated
     */
    int SIMPLE_PROPERTY = 3;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__LABEL = PROPERTY__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__LENGTH = PROPERTY__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__OFFSET = PROPERTY__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__IMAGE = PROPERTY__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__NAME = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Simple Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link workflow.impl.FilePropertyImpl <em>File Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.FilePropertyImpl
     * @see workflow.impl.WorkflowPackageImpl#getFileProperty()
     * @generated
     */
    int FILE_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY__LABEL = PROPERTY__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY__LENGTH = PROPERTY__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY__OFFSET = PROPERTY__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY__IMAGE = PROPERTY__IMAGE;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY__FILE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>File Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link workflow.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.AssignmentImpl
     * @see workflow.impl.WorkflowPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 5;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__LABEL = WORKFLOW_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__LENGTH = WORKFLOW_ELEMENT__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OFFSET = WORKFLOW_ELEMENT__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__IMAGE = WORKFLOW_ELEMENT__IMAGE;

    /**
     * The feature id for the '<em><b>To Assign To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__TO_ASSIGN_TO = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__VALUE = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link workflow.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.AbstractValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getAbstractValue()
     * @generated
     */
    int ABSTRACT_VALUE = 6;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_VALUE__LABEL = WORKFLOW_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_VALUE__LENGTH = WORKFLOW_ELEMENT__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_VALUE__OFFSET = WORKFLOW_ELEMENT__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_VALUE__IMAGE = WORKFLOW_ELEMENT__IMAGE;

    /**
     * The number of structural features of the '<em>Abstract Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_VALUE_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link workflow.impl.ComplexValueImpl <em>Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.ComplexValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getComplexValue()
     * @generated
     */
    int COMPLEX_VALUE = 7;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__LABEL = ABSTRACT_VALUE__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__LENGTH = ABSTRACT_VALUE__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__OFFSET = ABSTRACT_VALUE__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__IMAGE = ABSTRACT_VALUE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__NAME = ABSTRACT_VALUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE__ASSIGNMENT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Complex Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link workflow.impl.SimpleValueImpl <em>Simple Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.SimpleValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getSimpleValue()
     * @generated
     */
    int SIMPLE_VALUE = 8;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE__LABEL = ABSTRACT_VALUE__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE__LENGTH = ABSTRACT_VALUE__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE__OFFSET = ABSTRACT_VALUE__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE__IMAGE = ABSTRACT_VALUE__IMAGE;

    /**
     * The feature id for the '<em><b>Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE__VAL = ABSTRACT_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simple Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link workflow.impl.ObjectValueImpl <em>Object Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.ObjectValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getObjectValue()
     * @generated
     */
    int OBJECT_VALUE = 9;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__LABEL = COMPLEX_VALUE__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__LENGTH = COMPLEX_VALUE__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__OFFSET = COMPLEX_VALUE__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__IMAGE = COMPLEX_VALUE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__NAME = COMPLEX_VALUE__NAME;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__ASSIGNMENT = COMPLEX_VALUE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Clazz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE__CLAZZ = COMPLEX_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Object Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VALUE_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link workflow.impl.ReferencedValueImpl <em>Referenced Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.ReferencedValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getReferencedValue()
     * @generated
     */
    int REFERENCED_VALUE = 10;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE__LABEL = ABSTRACT_VALUE__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE__LENGTH = ABSTRACT_VALUE__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE__OFFSET = ABSTRACT_VALUE__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE__IMAGE = ABSTRACT_VALUE__IMAGE;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE__REF = ABSTRACT_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Referenced Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCED_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link workflow.impl.FileValueImpl <em>File Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workflow.impl.FileValueImpl
     * @see workflow.impl.WorkflowPackageImpl#getFileValue()
     * @generated
     */
    int FILE_VALUE = 11;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__LABEL = COMPLEX_VALUE__LABEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__LENGTH = COMPLEX_VALUE__LENGTH;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__OFFSET = COMPLEX_VALUE__OFFSET;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__IMAGE = COMPLEX_VALUE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__NAME = COMPLEX_VALUE__NAME;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__ASSIGNMENT = COMPLEX_VALUE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE__FILE = COMPLEX_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>File Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_VALUE_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link workflow.WorkflowFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File</em>'.
     * @see workflow.WorkflowFile
     * @generated
     */
    EClass getWorkflowFile();

    /**
     * Returns the meta object for the containment reference '{@link workflow.WorkflowFile#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Assignment</em>'.
     * @see workflow.WorkflowFile#getAssignment()
     * @see #getWorkflowFile()
     * @generated
     */
    EReference getWorkflowFile_Assignment();

    /**
     * Returns the meta object for the containment reference list '{@link workflow.WorkflowFile#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see workflow.WorkflowFile#getProperties()
     * @see #getWorkflowFile()
     * @generated
     */
    EReference getWorkflowFile_Properties();

    /**
     * Returns the meta object for class '{@link workflow.WorkflowElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see workflow.WorkflowElement
     * @generated
     */
    EClass getWorkflowElement();

    /**
     * Returns the meta object for the attribute '{@link workflow.WorkflowElement#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see workflow.WorkflowElement#getLabel()
     * @see #getWorkflowElement()
     * @generated
     */
    EAttribute getWorkflowElement_Label();

    /**
     * Returns the meta object for the attribute '{@link workflow.WorkflowElement#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see workflow.WorkflowElement#getLength()
     * @see #getWorkflowElement()
     * @generated
     */
    EAttribute getWorkflowElement_Length();

    /**
     * Returns the meta object for the attribute '{@link workflow.WorkflowElement#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset</em>'.
     * @see workflow.WorkflowElement#getOffset()
     * @see #getWorkflowElement()
     * @generated
     */
    EAttribute getWorkflowElement_Offset();

    /**
     * Returns the meta object for the attribute '{@link workflow.WorkflowElement#getImage <em>Image</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Image</em>'.
     * @see workflow.WorkflowElement#getImage()
     * @see #getWorkflowElement()
     * @generated
     */
    EAttribute getWorkflowElement_Image();

    /**
     * Returns the meta object for class '{@link workflow.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see workflow.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for class '{@link workflow.SimpleProperty <em>Simple Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Property</em>'.
     * @see workflow.SimpleProperty
     * @generated
     */
    EClass getSimpleProperty();

    /**
     * Returns the meta object for the attribute '{@link workflow.SimpleProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see workflow.SimpleProperty#getName()
     * @see #getSimpleProperty()
     * @generated
     */
    EAttribute getSimpleProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link workflow.SimpleProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see workflow.SimpleProperty#getValue()
     * @see #getSimpleProperty()
     * @generated
     */
    EAttribute getSimpleProperty_Value();

    /**
     * Returns the meta object for class '{@link workflow.FileProperty <em>File Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Property</em>'.
     * @see workflow.FileProperty
     * @generated
     */
    EClass getFileProperty();

    /**
     * Returns the meta object for the attribute '{@link workflow.FileProperty#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see workflow.FileProperty#getFile()
     * @see #getFileProperty()
     * @generated
     */
    EAttribute getFileProperty_File();

    /**
     * Returns the meta object for class '{@link workflow.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see workflow.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the attribute '{@link workflow.Assignment#getToAssignTo <em>To Assign To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To Assign To</em>'.
     * @see workflow.Assignment#getToAssignTo()
     * @see #getAssignment()
     * @generated
     */
    EAttribute getAssignment_ToAssignTo();

    /**
     * Returns the meta object for the containment reference '{@link workflow.Assignment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see workflow.Assignment#getValue()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Value();

    /**
     * Returns the meta object for class '{@link workflow.AbstractValue <em>Abstract Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Value</em>'.
     * @see workflow.AbstractValue
     * @generated
     */
    EClass getAbstractValue();

    /**
     * Returns the meta object for class '{@link workflow.ComplexValue <em>Complex Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Value</em>'.
     * @see workflow.ComplexValue
     * @generated
     */
    EClass getComplexValue();

    /**
     * Returns the meta object for the attribute '{@link workflow.ComplexValue#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see workflow.ComplexValue#getName()
     * @see #getComplexValue()
     * @generated
     */
    EAttribute getComplexValue_Name();

    /**
     * Returns the meta object for the containment reference list '{@link workflow.ComplexValue#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignment</em>'.
     * @see workflow.ComplexValue#getAssignment()
     * @see #getComplexValue()
     * @generated
     */
    EReference getComplexValue_Assignment();

    /**
     * Returns the meta object for class '{@link workflow.SimpleValue <em>Simple Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Value</em>'.
     * @see workflow.SimpleValue
     * @generated
     */
    EClass getSimpleValue();

    /**
     * Returns the meta object for the attribute '{@link workflow.SimpleValue#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val</em>'.
     * @see workflow.SimpleValue#getVal()
     * @see #getSimpleValue()
     * @generated
     */
    EAttribute getSimpleValue_Val();

    /**
     * Returns the meta object for class '{@link workflow.ObjectValue <em>Object Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object Value</em>'.
     * @see workflow.ObjectValue
     * @generated
     */
    EClass getObjectValue();

    /**
     * Returns the meta object for the attribute '{@link workflow.ObjectValue#getClazz <em>Clazz</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Clazz</em>'.
     * @see workflow.ObjectValue#getClazz()
     * @see #getObjectValue()
     * @generated
     */
    EAttribute getObjectValue_Clazz();

    /**
     * Returns the meta object for class '{@link workflow.ReferencedValue <em>Referenced Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referenced Value</em>'.
     * @see workflow.ReferencedValue
     * @generated
     */
    EClass getReferencedValue();

    /**
     * Returns the meta object for the attribute '{@link workflow.ReferencedValue#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see workflow.ReferencedValue#getRef()
     * @see #getReferencedValue()
     * @generated
     */
    EAttribute getReferencedValue_Ref();

    /**
     * Returns the meta object for class '{@link workflow.FileValue <em>File Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Value</em>'.
     * @see workflow.FileValue
     * @generated
     */
    EClass getFileValue();

    /**
     * Returns the meta object for the attribute '{@link workflow.FileValue#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see workflow.FileValue#getFile()
     * @see #getFileValue()
     * @generated
     */
    EAttribute getFileValue_File();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    WorkflowFactory getWorkflowFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link workflow.impl.WorkflowFileImpl <em>File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.WorkflowFileImpl
         * @see workflow.impl.WorkflowPackageImpl#getWorkflowFile()
         * @generated
         */
        EClass WORKFLOW_FILE = eINSTANCE.getWorkflowFile();

        /**
         * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKFLOW_FILE__ASSIGNMENT = eINSTANCE.getWorkflowFile_Assignment();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKFLOW_FILE__PROPERTIES = eINSTANCE.getWorkflowFile_Properties();

        /**
         * The meta object literal for the '{@link workflow.impl.WorkflowElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.WorkflowElementImpl
         * @see workflow.impl.WorkflowPackageImpl#getWorkflowElement()
         * @generated
         */
        EClass WORKFLOW_ELEMENT = eINSTANCE.getWorkflowElement();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKFLOW_ELEMENT__LABEL = eINSTANCE.getWorkflowElement_Label();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKFLOW_ELEMENT__LENGTH = eINSTANCE.getWorkflowElement_Length();

        /**
         * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKFLOW_ELEMENT__OFFSET = eINSTANCE.getWorkflowElement_Offset();

        /**
         * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKFLOW_ELEMENT__IMAGE = eINSTANCE.getWorkflowElement_Image();

        /**
         * The meta object literal for the '{@link workflow.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.PropertyImpl
         * @see workflow.impl.WorkflowPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '{@link workflow.impl.SimplePropertyImpl <em>Simple Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.SimplePropertyImpl
         * @see workflow.impl.WorkflowPackageImpl#getSimpleProperty()
         * @generated
         */
        EClass SIMPLE_PROPERTY = eINSTANCE.getSimpleProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_PROPERTY__NAME = eINSTANCE.getSimpleProperty_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_PROPERTY__VALUE = eINSTANCE.getSimpleProperty_Value();

        /**
         * The meta object literal for the '{@link workflow.impl.FilePropertyImpl <em>File Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.FilePropertyImpl
         * @see workflow.impl.WorkflowPackageImpl#getFileProperty()
         * @generated
         */
        EClass FILE_PROPERTY = eINSTANCE.getFileProperty();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_PROPERTY__FILE = eINSTANCE.getFileProperty_File();

        /**
         * The meta object literal for the '{@link workflow.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.AssignmentImpl
         * @see workflow.impl.WorkflowPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '<em><b>To Assign To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIGNMENT__TO_ASSIGN_TO = eINSTANCE.getAssignment_ToAssignTo();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

        /**
         * The meta object literal for the '{@link workflow.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.AbstractValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getAbstractValue()
         * @generated
         */
        EClass ABSTRACT_VALUE = eINSTANCE.getAbstractValue();

        /**
         * The meta object literal for the '{@link workflow.impl.ComplexValueImpl <em>Complex Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.ComplexValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getComplexValue()
         * @generated
         */
        EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_VALUE__NAME = eINSTANCE.getComplexValue_Name();

        /**
         * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_VALUE__ASSIGNMENT = eINSTANCE.getComplexValue_Assignment();

        /**
         * The meta object literal for the '{@link workflow.impl.SimpleValueImpl <em>Simple Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.SimpleValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getSimpleValue()
         * @generated
         */
        EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

        /**
         * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_VALUE__VAL = eINSTANCE.getSimpleValue_Val();

        /**
         * The meta object literal for the '{@link workflow.impl.ObjectValueImpl <em>Object Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.ObjectValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getObjectValue()
         * @generated
         */
        EClass OBJECT_VALUE = eINSTANCE.getObjectValue();

        /**
         * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_VALUE__CLAZZ = eINSTANCE.getObjectValue_Clazz();

        /**
         * The meta object literal for the '{@link workflow.impl.ReferencedValueImpl <em>Referenced Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.ReferencedValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getReferencedValue()
         * @generated
         */
        EClass REFERENCED_VALUE = eINSTANCE.getReferencedValue();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCED_VALUE__REF = eINSTANCE.getReferencedValue_Ref();

        /**
         * The meta object literal for the '{@link workflow.impl.FileValueImpl <em>File Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workflow.impl.FileValueImpl
         * @see workflow.impl.WorkflowPackageImpl#getFileValue()
         * @generated
         */
        EClass FILE_VALUE = eINSTANCE.getFileValue();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_VALUE__FILE = eINSTANCE.getFileValue_File();

    }

} //WorkflowPackage
