/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.obeonetwork.dsl.database.Constraint;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.parts.ConstraintPropertiesEditionPart;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject constraint, String editing_mode) {
		super(editingContext, constraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DatabaseViewsRepository.class;
		partKey = DatabaseViewsRepository.Constraint.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Constraint constraint = (Constraint)elt;
			final ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			// init values
			if (constraint.getName() != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), constraint.getName()));
			
			if (constraint.getExpression() != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.expression))
				basePart.setExpression(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), constraint.getExpression()));
			if (constraint.getComments() != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.comments))
				basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), constraint.getComments()));
			// init filters
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == DatabaseViewsRepository.Constraint.Properties.name) {
			return DatabasePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == DatabaseViewsRepository.Constraint.Properties.expression) {
			return DatabasePackage.eINSTANCE.getConstraint_Expression();
		}
		if (editorKey == DatabaseViewsRepository.Constraint.Properties.comments) {
			return DatabasePackage.eINSTANCE.getDatabaseElement_Comments();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Constraint constraint = (Constraint)semanticObject;
		if (DatabaseViewsRepository.Constraint.Properties.name == event.getAffectedEditor()) {
			constraint.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Constraint.Properties.expression == event.getAffectedEditor()) {
			constraint.setExpression((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Constraint.Properties.comments == event.getAffectedEditor()) {
			constraint.setComments((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			if (DatabasePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DatabasePackage.eINSTANCE.getConstraint_Expression().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.expression)){
				if (msg.getNewValue() != null) {
					basePart.setExpression(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExpression("");
				}
			}
			if (DatabasePackage.eINSTANCE.getDatabaseElement_Comments().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Constraint.Properties.comments)){
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DatabaseViewsRepository.Constraint.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DatabaseViewsRepository.Constraint.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Constraint.Properties.expression == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getConstraint_Expression().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getConstraint_Expression().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Constraint.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
