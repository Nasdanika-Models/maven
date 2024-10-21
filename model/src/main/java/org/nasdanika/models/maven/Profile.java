/**
 */
package org.nasdanika.models.maven;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Profile#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Profile#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Profile#getBuildBase <em>Build Base</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends ModelBase {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getProfile_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Profile#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Activation)
	 * @see org.nasdanika.models.maven.MavenPackage#getProfile_Activation()
	 * @model containment="true"
	 * @generated
	 */
	Activation getActivation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Profile#getActivation <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' containment reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Activation value);

	/**
	 * Returns the value of the '<em><b>Build Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Base</em>' containment reference.
	 * @see #setBuildBase(BuildBase)
	 * @see org.nasdanika.models.maven.MavenPackage#getProfile_BuildBase()
	 * @model containment="true"
	 * @generated
	 */
	BuildBase getBuildBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Profile#getBuildBase <em>Build Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Base</em>' containment reference.
	 * @see #getBuildBase()
	 * @generated
	 */
	void setBuildBase(BuildBase value);
	
	default void load(org.apache.maven.model.Profile profile, MavenFactory factory) {
		ModelBase.super.load(profile, factory);
		
//		setActivation(Activation)
//		setBuildBase(BuildBase)
		setId(profile.getId());
		setSource(profile.getSource());				
	}

} // Profile
