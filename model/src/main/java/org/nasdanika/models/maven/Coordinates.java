/**
 */
package org.nasdanika.models.maven;

import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Coordinates#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Coordinates#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Coordinates#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Coordinates#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getCoordinates()
 * @model
 * @generated
 */
public interface Coordinates extends EObject {

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getCoordinates_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Coordinates#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getCoordinates_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Coordinates#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getCoordinates_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Coordinates#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Model)
	 * @see org.nasdanika.models.maven.MavenPackage#getCoordinates_Target()
	 * @model
	 * @generated
	 */
	Model getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Coordinates#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Model value);
	
	/**
	 * Resolves target for this object and children
	 * @param resolver
	 */
	default void resolve(Function<Coordinates,Model> resolver) {
		setTarget(resolver.apply(this));
		eContents().forEach(c -> {
			if (c instanceof Coordinates) {
				((Coordinates) c).resolve(resolver);
			}
		});
	}	
	
} // Coordinates
