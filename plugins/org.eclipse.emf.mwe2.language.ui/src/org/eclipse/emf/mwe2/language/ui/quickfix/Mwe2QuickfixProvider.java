
package org.eclipse.emf.mwe2.language.ui.quickfix;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.impl.JvmTypeUriFactory;
import org.eclipse.emf.mwe2.language.validation.Mwe2JavaValidator;
import org.eclipse.emf.mwe2.runtime.IFactory;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.dialogs.ITypeInfoFilterExtension;
import org.eclipse.jdt.ui.dialogs.ITypeInfoRequestor;
import org.eclipse.jdt.ui.dialogs.TypeSelectionExtension;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

public class Mwe2QuickfixProvider extends DefaultQuickfixProvider {

	private static final Logger logger = Logger.getLogger(Mwe2QuickfixProvider.class);
	
	@Inject(optional=true)
	private IWorkbench workbench;
	
	@Inject
	private IWorkspace workspace;
	
	@Fix(Mwe2JavaValidator.ABSTRACT_OR_INTERFACE)
	public void assignValidType(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Define type explicitly", "Choose a compatible type for the component.", null, 
				new ISemanticModification() {
					public void apply(EObject element, IModificationContext context) {
						Component component = (Component) element;
						if (component != null) {
							IJavaProject project = findEnclosingProject(element.eResource());
							Assignment assignment = EcoreUtil2.getContainerOfType(component, Assignment.class);
							JvmIdentifiableElement feature = assignment.getFeature();
							JvmType actualType = component.getActualType();
							if (feature instanceof JvmOperation) {
								List<JvmFormalParameter> parameters = ((JvmOperation) feature).getParameters();
								JvmFormalParameter parameter = parameters.get(0);
								actualType = parameter.getParameterType().getType();
							} else if (feature instanceof DeclaredProperty) {
								actualType = ((DeclaredProperty) feature).getType();
							}
							String type = chooseType(project, actualType);
							if (type != null) {
								JvmType jvmType = findJvmType(component, type);
								component.setType(jvmType);
							}
						}
					}
				});
	}
	
	public static JvmType findJvmType(EObject context, String type) {
		URI fqnURI = JvmTypeUriFactory.getURIForFqn(type);
		JvmType jvmType = JvmTypeUriFactory.findJvmType(fqnURI, context);
		return jvmType;
	}
	
	public static class ComponentTypeSelectionExtension extends TypeSelectionExtension {
		
		private final String superType;

		public ComponentTypeSelectionExtension(String superType) {
			this.superType = superType;
		}
		
		@Override
		public ITypeInfoFilterExtension getFilterExtension() {
			return new ITypeInfoFilterExtension() {
				public boolean select(ITypeInfoRequestor typeInfoRequestor) {
					return !Flags.isAbstract(typeInfoRequestor.getModifiers());
				}
			};
		}
		
		@Override
		public ISelectionStatusValidator getSelectionValidator() {
			return new ISelectionStatusValidator() {
				public IStatus validate(Object[] selection) {
					if(selection.length == 1) {
						try {
							IType type = (IType) selection[0];
				            ITypeHierarchy hierarchy = type.newSupertypeHierarchy(new NullProgressMonitor());
				            IType curr = type;
				            while (curr != null) {
				                if (superType.equals(curr.getFullyQualifiedName())) {
				                    return Status.OK_STATUS;
				                }
				                curr = hierarchy.getSuperclass(curr);
				            }
				            IType[] interfaces = hierarchy.getAllSuperInterfaces(type);
				            for(IType intf: interfaces) {
				            	if (IFactory.class.getName().equals(intf.getFullyQualifiedName())) {
				                	// TODO check right factory type
				                	return Status.OK_STATUS;
				                }
				            	if (superType.equals(intf.getFullyQualifiedName())) {
				            		return Status.OK_STATUS;
				            	}
				            }
				        } 
				        catch (JavaModelException e) {
				        	logger.error(e.getMessage(), e);
				        	return Status.CANCEL_STATUS;
				        }
					}
					return new Status(IStatus.ERROR, "org.eclipse.emf.mwe2.language.ui", "The component type must be a subtype of " + superType.replace('$', '.'));
				}
			};
		}
		
	}
	
	public IJavaProject findEnclosingProject(Resource resource) {
		URI resourceURI = resource.getURI();
		IFile file = workspace.getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
		if (file == null)
			return null;
		IProject project = file.getProject();
		if (project == null)
			return null;
		IJavaProject result = JavaCore.create(project);
		return result;
	}
	
	public String chooseType(IJavaProject project, JvmType actualType) {
		if (project == null)
			return null;
		IWorkbenchWindow activeWindow = workbench.getActiveWorkbenchWindow();
		Shell shell = activeWindow.getShell();
		try {
			SelectionDialog dialog = JavaUI.createTypeDialog(shell, 
					activeWindow, 
					SearchEngine.createJavaSearchScope(new IJavaElement[]{ project }),
					IJavaElementSearchConstants.CONSIDER_CLASSES, false, "", 
					new ComponentTypeSelectionExtension(actualType.getIdentifier()));
			dialog.setTitle("Select component type");
			dialog.setMessage("Select component type");
			dialog.create();
			if(dialog.open() == IDialogConstants.OK_ID) {
				Object[] results = dialog.getResult(); 
				if(results != null && results.length > 0) {
					IType result = (IType) results[0];
					return result.getFullyQualifiedName();
				}
			}
			return null;
		} catch(JavaModelException e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

}
