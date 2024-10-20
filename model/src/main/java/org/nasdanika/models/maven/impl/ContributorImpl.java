/**
 */
package org.nasdanika.models.maven.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.maven.Contributor;
import org.nasdanika.models.maven.MavenPackage;

import org.nasdanika.ncore.StringProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getOrganizationUrl <em>Organization Url</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ContributorImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributorImpl extends MinimalEObjectImpl.Container implements Contributor {
	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

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
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganizationUrl() <em>Organization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

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
	protected ContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.CONTRIBUTOR;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<StringProperty> getProperties() {
		return (EList<StringProperty>)eDynamicGet(MavenPackage.CONTRIBUTOR__PROPERTIES, MavenPackage.Literals.CONTRIBUTOR__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__EMAIL, MavenPackage.Literals.CONTRIBUTOR__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__EMAIL, MavenPackage.Literals.CONTRIBUTOR__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__NAME, MavenPackage.Literals.CONTRIBUTOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__NAME, MavenPackage.Literals.CONTRIBUTOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganization() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__ORGANIZATION, MavenPackage.Literals.CONTRIBUTOR__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(String newOrganization) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__ORGANIZATION, MavenPackage.Literals.CONTRIBUTOR__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationUrl() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__ORGANIZATION_URL, MavenPackage.Literals.CONTRIBUTOR__ORGANIZATION_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationUrl(String newOrganizationUrl) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__ORGANIZATION_URL, MavenPackage.Literals.CONTRIBUTOR__ORGANIZATION_URL, newOrganizationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRoles() {
		return (EList<String>)eDynamicGet(MavenPackage.CONTRIBUTOR__ROLES, MavenPackage.Literals.CONTRIBUTOR__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimezone() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__TIMEZONE, MavenPackage.Literals.CONTRIBUTOR__TIMEZONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimezone(String newTimezone) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__TIMEZONE, MavenPackage.Literals.CONTRIBUTOR__TIMEZONE, newTimezone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(MavenPackage.CONTRIBUTOR__URL, MavenPackage.Literals.CONTRIBUTOR__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(MavenPackage.CONTRIBUTOR__URL, MavenPackage.Literals.CONTRIBUTOR__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.CONTRIBUTOR__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.CONTRIBUTOR__PROPERTIES:
				return getProperties();
			case MavenPackage.CONTRIBUTOR__EMAIL:
				return getEMail();
			case MavenPackage.CONTRIBUTOR__NAME:
				return getName();
			case MavenPackage.CONTRIBUTOR__ORGANIZATION:
				return getOrganization();
			case MavenPackage.CONTRIBUTOR__ORGANIZATION_URL:
				return getOrganizationUrl();
			case MavenPackage.CONTRIBUTOR__ROLES:
				return getRoles();
			case MavenPackage.CONTRIBUTOR__TIMEZONE:
				return getTimezone();
			case MavenPackage.CONTRIBUTOR__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MavenPackage.CONTRIBUTOR__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends StringProperty>)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__EMAIL:
				setEMail((String)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__NAME:
				setName((String)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__ORGANIZATION_URL:
				setOrganizationUrl((String)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case MavenPackage.CONTRIBUTOR__URL:
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
			case MavenPackage.CONTRIBUTOR__PROPERTIES:
				getProperties().clear();
				return;
			case MavenPackage.CONTRIBUTOR__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case MavenPackage.CONTRIBUTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MavenPackage.CONTRIBUTOR__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case MavenPackage.CONTRIBUTOR__ORGANIZATION_URL:
				setOrganizationUrl(ORGANIZATION_URL_EDEFAULT);
				return;
			case MavenPackage.CONTRIBUTOR__ROLES:
				getRoles().clear();
				return;
			case MavenPackage.CONTRIBUTOR__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case MavenPackage.CONTRIBUTOR__URL:
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
			case MavenPackage.CONTRIBUTOR__PROPERTIES:
				return !getProperties().isEmpty();
			case MavenPackage.CONTRIBUTOR__EMAIL:
				return EMAIL_EDEFAULT == null ? getEMail() != null : !EMAIL_EDEFAULT.equals(getEMail());
			case MavenPackage.CONTRIBUTOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MavenPackage.CONTRIBUTOR__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? getOrganization() != null : !ORGANIZATION_EDEFAULT.equals(getOrganization());
			case MavenPackage.CONTRIBUTOR__ORGANIZATION_URL:
				return ORGANIZATION_URL_EDEFAULT == null ? getOrganizationUrl() != null : !ORGANIZATION_URL_EDEFAULT.equals(getOrganizationUrl());
			case MavenPackage.CONTRIBUTOR__ROLES:
				return !getRoles().isEmpty();
			case MavenPackage.CONTRIBUTOR__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? getTimezone() != null : !TIMEZONE_EDEFAULT.equals(getTimezone());
			case MavenPackage.CONTRIBUTOR__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
		}
		return super.eIsSet(featureID);
	}

} //ContributorImpl
