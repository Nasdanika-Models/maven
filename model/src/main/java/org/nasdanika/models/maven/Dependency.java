/**
 */
package org.nasdanika.models.maven;

import org.apache.maven.model.Exclusion;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getExclusions <em>Exclusions</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getManagementKey <em>Management Key</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getSystemPath <em>System Path</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Dependency#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends Coordinates {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' attribute.
	 * @see #setClassifier(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_Classifier()
	 * @model
	 * @generated
	 */
	String getClassifier();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getClassifier <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' attribute.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(String value);

	/**
	 * Returns the value of the '<em><b>Exclusions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Coordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusions</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_Exclusions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinates> getExclusions();

	/**
	 * Returns the value of the '<em><b>Management Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Key</em>' attribute.
	 * @see #setManagementKey(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_ManagementKey()
	 * @model
	 * @generated
	 */
	String getManagementKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getManagementKey <em>Management Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Key</em>' attribute.
	 * @see #getManagementKey()
	 * @generated
	 */
	void setManagementKey(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_Optional()
	 * @model
	 * @generated
	 */
	String getOptional();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>System Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Path</em>' attribute.
	 * @see #setSystemPath(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_SystemPath()
	 * @model
	 * @generated
	 */
	String getSystemPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getSystemPath <em>System Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Path</em>' attribute.
	 * @see #getSystemPath()
	 * @generated
	 */
	void setSystemPath(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getDependency_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	default void load(org.apache.maven.model.Dependency dependency, MavenFactory factory) {
		setArtifactId(dependency.getArtifactId());
		setGroupId(dependency.getGroupId());
		setVersion(dependency.getVersion());		
		
		EList<Coordinates> exclusions = getExclusions();
		for (Exclusion ex: dependency.getExclusions()) {
			Coordinates excl = factory.createCoordinates();
			excl.setArtifactId(ex.getArtifactId());
			excl.setGroupId(ex.getGroupId());
			exclusions.add(excl);
		}
		
		setClassifier(dependency.getClassifier());
		setManagementKey(dependency.getManagementKey());
		setOptional(dependency.getOptional());
		setScope(dependency.getScope());
		setSystemPath(dependency.getSystemPath());
		setType(dependency.getType());
	}

} // Dependency
