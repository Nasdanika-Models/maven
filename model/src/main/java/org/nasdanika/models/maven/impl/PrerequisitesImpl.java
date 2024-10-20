/**
 */
package org.nasdanika.models.maven.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.Prerequisites;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.PrerequisitesImpl#getMaven <em>Maven</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisitesImpl extends MinimalEObjectImpl.Container implements Prerequisites {
	/**
	 * The default value of the '{@link #getMaven() <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaven()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisitesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.PREREQUISITES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaven() {
		return (String)eDynamicGet(MavenPackage.PREREQUISITES__MAVEN, MavenPackage.Literals.PREREQUISITES__MAVEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaven(String newMaven) {
		eDynamicSet(MavenPackage.PREREQUISITES__MAVEN, MavenPackage.Literals.PREREQUISITES__MAVEN, newMaven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.PREREQUISITES__MAVEN:
				return getMaven();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MavenPackage.PREREQUISITES__MAVEN:
				setMaven((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MavenPackage.PREREQUISITES__MAVEN:
				setMaven(MAVEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MavenPackage.PREREQUISITES__MAVEN:
				return MAVEN_EDEFAULT == null ? getMaven() != null : !MAVEN_EDEFAULT.equals(getMaven());
		}
		return super.eIsSet(featureID);
	}

} //PrerequisitesImpl
