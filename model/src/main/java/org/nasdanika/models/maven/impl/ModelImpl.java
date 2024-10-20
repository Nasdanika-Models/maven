/**
 */
package org.nasdanika.models.maven.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.maven.CiManagement;
import org.nasdanika.models.maven.Contributor;
import org.nasdanika.models.maven.Coordinates;
import org.nasdanika.models.maven.Developer;
import org.nasdanika.models.maven.IssueManagement;
import org.nasdanika.models.maven.License;
import org.nasdanika.models.maven.MailingList;
import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.Model;
import org.nasdanika.models.maven.Organization;
import org.nasdanika.models.maven.Parent;
import org.nasdanika.models.maven.Prerequisites;
import org.nasdanika.models.maven.Profile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getCiManagement <em>Ci Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getIssueManagement <em>Issue Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getMailingLists <em>Mailing Lists</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelImpl#getProfiles <em>Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ModelBaseImpl implements Model {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return (String)eDynamicGet(MavenPackage.MODEL__GROUP_ID, MavenPackage.Literals.COORDINATES__GROUP_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		eDynamicSet(MavenPackage.MODEL__GROUP_ID, MavenPackage.Literals.COORDINATES__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactId() {
		return (String)eDynamicGet(MavenPackage.MODEL__ARTIFACT_ID, MavenPackage.Literals.COORDINATES__ARTIFACT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactId(String newArtifactId) {
		eDynamicSet(MavenPackage.MODEL__ARTIFACT_ID, MavenPackage.Literals.COORDINATES__ARTIFACT_ID, newArtifactId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(MavenPackage.MODEL__VERSION, MavenPackage.Literals.COORDINATES__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(MavenPackage.MODEL__VERSION, MavenPackage.Literals.COORDINATES__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getTarget() {
		return (Model)eDynamicGet(MavenPackage.MODEL__TARGET, MavenPackage.Literals.COORDINATES__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetTarget() {
		return (Model)eDynamicGet(MavenPackage.MODEL__TARGET, MavenPackage.Literals.COORDINATES__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Model newTarget) {
		eDynamicSet(MavenPackage.MODEL__TARGET, MavenPackage.Literals.COORDINATES__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(MavenPackage.MODEL__NAME, MavenPackage.Literals.MODEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(MavenPackage.MODEL__NAME, MavenPackage.Literals.MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(MavenPackage.MODEL__DESCRIPTION, MavenPackage.Literals.MODEL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(MavenPackage.MODEL__DESCRIPTION, MavenPackage.Literals.MODEL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiManagement getCiManagement() {
		return (CiManagement)eDynamicGet(MavenPackage.MODEL__CI_MANAGEMENT, MavenPackage.Literals.MODEL__CI_MANAGEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCiManagement(CiManagement newCiManagement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCiManagement, MavenPackage.MODEL__CI_MANAGEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiManagement(CiManagement newCiManagement) {
		eDynamicSet(MavenPackage.MODEL__CI_MANAGEMENT, MavenPackage.Literals.MODEL__CI_MANAGEMENT, newCiManagement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Contributor> getContributors() {
		return (EList<Contributor>)eDynamicGet(MavenPackage.MODEL__CONTRIBUTORS, MavenPackage.Literals.MODEL__CONTRIBUTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Developer> getDevelopers() {
		return (EList<Developer>)eDynamicGet(MavenPackage.MODEL__DEVELOPERS, MavenPackage.Literals.MODEL__DEVELOPERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueManagement getIssueManagement() {
		return (IssueManagement)eDynamicGet(MavenPackage.MODEL__ISSUE_MANAGEMENT, MavenPackage.Literals.MODEL__ISSUE_MANAGEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueManagement(IssueManagement newIssueManagement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIssueManagement, MavenPackage.MODEL__ISSUE_MANAGEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueManagement(IssueManagement newIssueManagement) {
		eDynamicSet(MavenPackage.MODEL__ISSUE_MANAGEMENT, MavenPackage.Literals.MODEL__ISSUE_MANAGEMENT, newIssueManagement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<License> getLicenses() {
		return (EList<License>)eDynamicGet(MavenPackage.MODEL__LICENSES, MavenPackage.Literals.MODEL__LICENSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MailingList> getMailingLists() {
		return (EList<MailingList>)eDynamicGet(MavenPackage.MODEL__MAILING_LISTS, MavenPackage.Literals.MODEL__MAILING_LISTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOrganization() {
		return (Organization)eDynamicGet(MavenPackage.MODEL__ORGANIZATION, MavenPackage.Literals.MODEL__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganization, MavenPackage.MODEL__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(Organization newOrganization) {
		eDynamicSet(MavenPackage.MODEL__ORGANIZATION, MavenPackage.Literals.MODEL__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parent getParent() {
		return (Parent)eDynamicGet(MavenPackage.MODEL__PARENT, MavenPackage.Literals.MODEL__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParent, MavenPackage.MODEL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Parent newParent) {
		eDynamicSet(MavenPackage.MODEL__PARENT, MavenPackage.Literals.MODEL__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prerequisites getPrerequisites() {
		return (Prerequisites)eDynamicGet(MavenPackage.MODEL__PREREQUISITES, MavenPackage.Literals.MODEL__PREREQUISITES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrerequisites(Prerequisites newPrerequisites, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPrerequisites, MavenPackage.MODEL__PREREQUISITES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrerequisites(Prerequisites newPrerequisites) {
		eDynamicSet(MavenPackage.MODEL__PREREQUISITES, MavenPackage.Literals.MODEL__PREREQUISITES, newPrerequisites);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Profile> getProfiles() {
		return (EList<Profile>)eDynamicGet(MavenPackage.MODEL__PROFILES, MavenPackage.Literals.MODEL__PROFILES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.MODEL__CI_MANAGEMENT:
				return basicSetCiManagement(null, msgs);
			case MavenPackage.MODEL__CONTRIBUTORS:
				return ((InternalEList<?>)getContributors()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL__DEVELOPERS:
				return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL__ISSUE_MANAGEMENT:
				return basicSetIssueManagement(null, msgs);
			case MavenPackage.MODEL__LICENSES:
				return ((InternalEList<?>)getLicenses()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL__MAILING_LISTS:
				return ((InternalEList<?>)getMailingLists()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case MavenPackage.MODEL__PARENT:
				return basicSetParent(null, msgs);
			case MavenPackage.MODEL__PREREQUISITES:
				return basicSetPrerequisites(null, msgs);
			case MavenPackage.MODEL__PROFILES:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
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
			case MavenPackage.MODEL__GROUP_ID:
				return getGroupId();
			case MavenPackage.MODEL__ARTIFACT_ID:
				return getArtifactId();
			case MavenPackage.MODEL__VERSION:
				return getVersion();
			case MavenPackage.MODEL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MavenPackage.MODEL__NAME:
				return getName();
			case MavenPackage.MODEL__DESCRIPTION:
				return getDescription();
			case MavenPackage.MODEL__CI_MANAGEMENT:
				return getCiManagement();
			case MavenPackage.MODEL__CONTRIBUTORS:
				return getContributors();
			case MavenPackage.MODEL__DEVELOPERS:
				return getDevelopers();
			case MavenPackage.MODEL__ISSUE_MANAGEMENT:
				return getIssueManagement();
			case MavenPackage.MODEL__LICENSES:
				return getLicenses();
			case MavenPackage.MODEL__MAILING_LISTS:
				return getMailingLists();
			case MavenPackage.MODEL__ORGANIZATION:
				return getOrganization();
			case MavenPackage.MODEL__PARENT:
				return getParent();
			case MavenPackage.MODEL__PREREQUISITES:
				return getPrerequisites();
			case MavenPackage.MODEL__PROFILES:
				return getProfiles();
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
			case MavenPackage.MODEL__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MavenPackage.MODEL__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MavenPackage.MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case MavenPackage.MODEL__TARGET:
				setTarget((Model)newValue);
				return;
			case MavenPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case MavenPackage.MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MavenPackage.MODEL__CI_MANAGEMENT:
				setCiManagement((CiManagement)newValue);
				return;
			case MavenPackage.MODEL__CONTRIBUTORS:
				getContributors().clear();
				getContributors().addAll((Collection<? extends Contributor>)newValue);
				return;
			case MavenPackage.MODEL__DEVELOPERS:
				getDevelopers().clear();
				getDevelopers().addAll((Collection<? extends Developer>)newValue);
				return;
			case MavenPackage.MODEL__ISSUE_MANAGEMENT:
				setIssueManagement((IssueManagement)newValue);
				return;
			case MavenPackage.MODEL__LICENSES:
				getLicenses().clear();
				getLicenses().addAll((Collection<? extends License>)newValue);
				return;
			case MavenPackage.MODEL__MAILING_LISTS:
				getMailingLists().clear();
				getMailingLists().addAll((Collection<? extends MailingList>)newValue);
				return;
			case MavenPackage.MODEL__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case MavenPackage.MODEL__PARENT:
				setParent((Parent)newValue);
				return;
			case MavenPackage.MODEL__PREREQUISITES:
				setPrerequisites((Prerequisites)newValue);
				return;
			case MavenPackage.MODEL__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Profile>)newValue);
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
			case MavenPackage.MODEL__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MavenPackage.MODEL__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MavenPackage.MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MavenPackage.MODEL__TARGET:
				setTarget((Model)null);
				return;
			case MavenPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MavenPackage.MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MavenPackage.MODEL__CI_MANAGEMENT:
				setCiManagement((CiManagement)null);
				return;
			case MavenPackage.MODEL__CONTRIBUTORS:
				getContributors().clear();
				return;
			case MavenPackage.MODEL__DEVELOPERS:
				getDevelopers().clear();
				return;
			case MavenPackage.MODEL__ISSUE_MANAGEMENT:
				setIssueManagement((IssueManagement)null);
				return;
			case MavenPackage.MODEL__LICENSES:
				getLicenses().clear();
				return;
			case MavenPackage.MODEL__MAILING_LISTS:
				getMailingLists().clear();
				return;
			case MavenPackage.MODEL__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case MavenPackage.MODEL__PARENT:
				setParent((Parent)null);
				return;
			case MavenPackage.MODEL__PREREQUISITES:
				setPrerequisites((Prerequisites)null);
				return;
			case MavenPackage.MODEL__PROFILES:
				getProfiles().clear();
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
			case MavenPackage.MODEL__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? getGroupId() != null : !GROUP_ID_EDEFAULT.equals(getGroupId());
			case MavenPackage.MODEL__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? getArtifactId() != null : !ARTIFACT_ID_EDEFAULT.equals(getArtifactId());
			case MavenPackage.MODEL__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case MavenPackage.MODEL__TARGET:
				return basicGetTarget() != null;
			case MavenPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MavenPackage.MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case MavenPackage.MODEL__CI_MANAGEMENT:
				return getCiManagement() != null;
			case MavenPackage.MODEL__CONTRIBUTORS:
				return !getContributors().isEmpty();
			case MavenPackage.MODEL__DEVELOPERS:
				return !getDevelopers().isEmpty();
			case MavenPackage.MODEL__ISSUE_MANAGEMENT:
				return getIssueManagement() != null;
			case MavenPackage.MODEL__LICENSES:
				return !getLicenses().isEmpty();
			case MavenPackage.MODEL__MAILING_LISTS:
				return !getMailingLists().isEmpty();
			case MavenPackage.MODEL__ORGANIZATION:
				return getOrganization() != null;
			case MavenPackage.MODEL__PARENT:
				return getParent() != null;
			case MavenPackage.MODEL__PREREQUISITES:
				return getPrerequisites() != null;
			case MavenPackage.MODEL__PROFILES:
				return !getProfiles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Coordinates.class) {
			switch (derivedFeatureID) {
				case MavenPackage.MODEL__GROUP_ID: return MavenPackage.COORDINATES__GROUP_ID;
				case MavenPackage.MODEL__ARTIFACT_ID: return MavenPackage.COORDINATES__ARTIFACT_ID;
				case MavenPackage.MODEL__VERSION: return MavenPackage.COORDINATES__VERSION;
				case MavenPackage.MODEL__TARGET: return MavenPackage.COORDINATES__TARGET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Coordinates.class) {
			switch (baseFeatureID) {
				case MavenPackage.COORDINATES__GROUP_ID: return MavenPackage.MODEL__GROUP_ID;
				case MavenPackage.COORDINATES__ARTIFACT_ID: return MavenPackage.MODEL__ARTIFACT_ID;
				case MavenPackage.COORDINATES__VERSION: return MavenPackage.MODEL__VERSION;
				case MavenPackage.COORDINATES__TARGET: return MavenPackage.MODEL__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModelImpl
