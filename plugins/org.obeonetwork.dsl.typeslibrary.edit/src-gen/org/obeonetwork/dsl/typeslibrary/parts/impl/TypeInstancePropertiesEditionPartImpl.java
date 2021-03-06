/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.typeslibrary.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart;
import org.obeonetwork.dsl.typeslibrary.parts.TypeslibraryViewsRepository;
import org.obeonetwork.dsl.typeslibrary.providers.TypeslibraryMessages;


// End of user code

/**
 * 
 * 
 */
public class TypeInstancePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TypeInstancePropertiesEditionPart {

	protected EObjectFlatComboViewer nativeType;
	protected Text length;
	protected Text precision;
	protected Text literals;
	protected Button editLiterals;
	private EList literalsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeInstancePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence typeInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = typeInstanceStep.addStep(TypeslibraryViewsRepository.TypeInstance.Properties.class);
		propertiesStep.addStep(TypeslibraryViewsRepository.TypeInstance.Properties.nativeType);
		propertiesStep.addStep(TypeslibraryViewsRepository.TypeInstance.Properties.length);
		propertiesStep.addStep(TypeslibraryViewsRepository.TypeInstance.Properties.precision);
		propertiesStep.addStep(TypeslibraryViewsRepository.TypeInstance.Properties.literals);
		
		
		composer = new PartComposer(typeInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == TypeslibraryViewsRepository.TypeInstance.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == TypeslibraryViewsRepository.TypeInstance.Properties.nativeType) {
					return createNativeTypeFlatComboViewer(parent);
				}
				if (key == TypeslibraryViewsRepository.TypeInstance.Properties.length) {
					return createLengthText(parent);
				}
				if (key == TypeslibraryViewsRepository.TypeInstance.Properties.precision) {
					return createPrecisionText(parent);
				}
				if (key == TypeslibraryViewsRepository.TypeInstance.Properties.literals) {
					return createLiteralsMultiValuedEditor(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(TypeslibraryMessages.TypeInstancePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNativeTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, TypeslibraryMessages.TypeInstancePropertiesEditionPart_NativeTypeLabel, propertiesEditionComponent.isRequired(TypeslibraryViewsRepository.TypeInstance.Properties.nativeType, TypeslibraryViewsRepository.SWT_KIND));
		nativeType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(TypeslibraryViewsRepository.TypeInstance.Properties.nativeType, TypeslibraryViewsRepository.SWT_KIND));
		nativeType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		nativeType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.nativeType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNativeType()));
			}

		});
		GridData nativeTypeData = new GridData(GridData.FILL_HORIZONTAL);
		nativeType.setLayoutData(nativeTypeData);
		nativeType.setID(TypeslibraryViewsRepository.TypeInstance.Properties.nativeType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TypeslibraryViewsRepository.TypeInstance.Properties.nativeType, TypeslibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLengthText(Composite parent) {
		SWTUtils.createPartLabel(parent, TypeslibraryMessages.TypeInstancePropertiesEditionPart_LengthLabel, propertiesEditionComponent.isRequired(TypeslibraryViewsRepository.TypeInstance.Properties.length, TypeslibraryViewsRepository.SWT_KIND));
		length = new Text(parent, SWT.BORDER);
		GridData lengthData = new GridData(GridData.FILL_HORIZONTAL);
		length.setLayoutData(lengthData);
		length.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.length, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, length.getText()));
			}

		});
		length.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.length, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, length.getText()));
				}
			}

		});
		EditingUtils.setID(length, TypeslibraryViewsRepository.TypeInstance.Properties.length);
		EditingUtils.setEEFtype(length, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TypeslibraryViewsRepository.TypeInstance.Properties.length, TypeslibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPrecisionText(Composite parent) {
		SWTUtils.createPartLabel(parent, TypeslibraryMessages.TypeInstancePropertiesEditionPart_PrecisionLabel, propertiesEditionComponent.isRequired(TypeslibraryViewsRepository.TypeInstance.Properties.precision, TypeslibraryViewsRepository.SWT_KIND));
		precision = new Text(parent, SWT.BORDER);
		GridData precisionData = new GridData(GridData.FILL_HORIZONTAL);
		precision.setLayoutData(precisionData);
		precision.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.precision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, precision.getText()));
			}

		});
		precision.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.precision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, precision.getText()));
				}
			}

		});
		EditingUtils.setID(precision, TypeslibraryViewsRepository.TypeInstance.Properties.precision);
		EditingUtils.setEEFtype(precision, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(TypeslibraryViewsRepository.TypeInstance.Properties.precision, TypeslibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createLiteralsMultiValuedEditor(Composite parent) {
		literals = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData literalsData = new GridData(GridData.FILL_HORIZONTAL);
		literalsData.horizontalSpan = 2;
		literals.setLayoutData(literalsData);
		EditingUtils.setID(literals, TypeslibraryViewsRepository.TypeInstance.Properties.literals);
		EditingUtils.setEEFtype(literals, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editLiterals = new Button(parent, SWT.NONE);
		editLiterals.setText(TypeslibraryMessages.TypeInstancePropertiesEditionPart_LiteralsLabel);
		GridData editLiteralsData = new GridData();
		editLiterals.setLayoutData(editLiteralsData);
		editLiterals.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						literals.getShell(), "TypeInstance", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						literalsList, TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					literalsList = dialog.getResult();
					if (literalsList == null) {
						literalsList = new BasicEList();
					}
					literals.setText(literalsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeInstancePropertiesEditionPartImpl.this, TypeslibraryViewsRepository.TypeInstance.Properties.literals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(literalsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editLiterals, TypeslibraryViewsRepository.TypeInstance.Properties.literals);
		EditingUtils.setEEFtype(editLiterals, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#getNativeType()
	 * 
	 */
	public EObject getNativeType() {
		if (nativeType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) nativeType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#initNativeType(EObjectFlatComboSettings)
	 */
	public void initNativeType(EObjectFlatComboSettings settings) {
		nativeType.setInput(settings);
		if (current != null) {
			nativeType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#setNativeType(EObject newValue)
	 * 
	 */
	public void setNativeType(EObject newValue) {
		if (newValue != null) {
			nativeType.setSelection(new StructuredSelection(newValue));
		} else {
			nativeType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#setNativeTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNativeTypeButtonMode(ButtonsModeEnum newValue) {
		nativeType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#addFilterNativeType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNativeType(ViewerFilter filter) {
		nativeType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#addBusinessFilterNativeType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNativeType(ViewerFilter filter) {
		nativeType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#getLength()
	 * 
	 */
	public String getLength() {
		return length.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#setLength(String newValue)
	 * 
	 */
	public void setLength(String newValue) {
		if (newValue != null) {
			length.setText(newValue);
		} else {
			length.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#getPrecision()
	 * 
	 */
	public String getPrecision() {
		return precision.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#setPrecision(String newValue)
	 * 
	 */
	public void setPrecision(String newValue) {
		if (newValue != null) {
			precision.setText(newValue);
		} else {
			precision.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#getLiterals()
	 * 
	 */
	public EList getLiterals() {
		return literalsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart#setLiterals(EList newValue)
	 * 
	 */
	public void setLiterals(EList newValue) {
		literalsList = newValue;
		if (newValue != null) {
			literals.setText(literalsList.toString());
		} else {
			literals.setText(""); //$NON-NLS-1$
		}
	}

	public void addToLiterals(Object newValue) {
		literalsList.add(newValue);
		if (newValue != null) {
			literals.setText(literalsList.toString());
		} else {
			literals.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToLiterals(Object newValue) {
		literalsList.remove(newValue);
		if (newValue != null) {
			literals.setText(literalsList.toString());
		} else {
			literals.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return TypeslibraryMessages.TypeInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
