/**
 */
package org.nasdanika.models.maven;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Parent#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Coordinates {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getParent_RelativePath()
	 * @model
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Parent#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

} // Parent
