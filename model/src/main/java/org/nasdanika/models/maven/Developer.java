/**
 */
package org.nasdanika.models.maven;

import org.nasdanika.ncore.StringIdentity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.maven.MavenPackage#getDeveloper()
 * @model
 * @generated
 */
public interface Developer extends Contributor, StringIdentity {
	default void load(org.apache.maven.model.Developer developer) {
		Contributor.super.load(developer);
		setId(developer.getId());
	}

} // Developer
