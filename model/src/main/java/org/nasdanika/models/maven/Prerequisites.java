/**
 */
package org.nasdanika.models.maven;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Prerequisites#getMaven <em>Maven</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getPrerequisites()
 * @model
 * @generated
 */
public interface Prerequisites extends EObject {
	/**
	 * Returns the value of the '<em><b>Maven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven</em>' attribute.
	 * @see #setMaven(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getPrerequisites_Maven()
	 * @model
	 * @generated
	 */
	String getMaven();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Prerequisites#getMaven <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven</em>' attribute.
	 * @see #getMaven()
	 * @generated
	 */
	void setMaven(String value);

} // Prerequisites
