/**
 */
package org.nasdanika.models.maven.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.maven.License;
import org.nasdanika.models.maven.MavenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.LicenseImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.LicenseImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.LicenseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.LicenseImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseImpl extends MinimalEObjectImpl.Container implements License {
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.LICENSE;
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
	public String getComments() {
		return (String)eDynamicGet(MavenPackage.LICENSE__COMMENTS, MavenPackage.Literals.LICENSE__COMMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eDynamicSet(MavenPackage.LICENSE__COMMENTS, MavenPackage.Literals.LICENSE__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistribution() {
		return (String)eDynamicGet(MavenPackage.LICENSE__DISTRIBUTION, MavenPackage.Literals.LICENSE__DISTRIBUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistribution(String newDistribution) {
		eDynamicSet(MavenPackage.LICENSE__DISTRIBUTION, MavenPackage.Literals.LICENSE__DISTRIBUTION, newDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(MavenPackage.LICENSE__NAME, MavenPackage.Literals.LICENSE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(MavenPackage.LICENSE__NAME, MavenPackage.Literals.LICENSE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(MavenPackage.LICENSE__URL, MavenPackage.Literals.LICENSE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(MavenPackage.LICENSE__URL, MavenPackage.Literals.LICENSE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.LICENSE__COMMENTS:
				return getComments();
			case MavenPackage.LICENSE__DISTRIBUTION:
				return getDistribution();
			case MavenPackage.LICENSE__NAME:
				return getName();
			case MavenPackage.LICENSE__URL:
				return getUrl();
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
			case MavenPackage.LICENSE__COMMENTS:
				setComments((String)newValue);
				return;
			case MavenPackage.LICENSE__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case MavenPackage.LICENSE__NAME:
				setName((String)newValue);
				return;
			case MavenPackage.LICENSE__URL:
				setUrl((String)newValue);
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
			case MavenPackage.LICENSE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case MavenPackage.LICENSE__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case MavenPackage.LICENSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MavenPackage.LICENSE__URL:
				setUrl(URL_EDEFAULT);
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
			case MavenPackage.LICENSE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? getComments() != null : !COMMENTS_EDEFAULT.equals(getComments());
			case MavenPackage.LICENSE__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? getDistribution() != null : !DISTRIBUTION_EDEFAULT.equals(getDistribution());
			case MavenPackage.LICENSE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MavenPackage.LICENSE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
		}
		return super.eIsSet(featureID);
	}

} //LicenseImpl
