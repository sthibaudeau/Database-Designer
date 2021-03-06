/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.entityrelation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Identifier#isPrimary <em>Primary</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Identifier#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(boolean)
	 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getIdentifier_Primary()
	 * @model
	 * @generated
	 */
	boolean isPrimary();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Identifier#isPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #isPrimary()
	 * @generated
	 */
	void setPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Attribute}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.entityrelation.Attribute#getUseInIdentifier <em>Use In Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getIdentifier_Attributes()
	 * @see org.obeonetwork.dsl.entityrelation.Attribute#getUseInIdentifier
	 * @model opposite="useInIdentifier"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Identifier
