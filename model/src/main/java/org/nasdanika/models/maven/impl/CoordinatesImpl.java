/**
 */
package org.nasdanika.models.maven.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.maven.Coordinates;
import org.nasdanika.models.maven.MavenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.CoordinatesImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.CoordinatesImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.CoordinatesImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatesImpl extends MinimalEObjectImpl.Container implements Coordinates {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.COORDINATES;
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
	public String getGroupId() {
		return (String)eDynamicGet(MavenPackage.COORDINATES__GROUP_ID, MavenPackage.Literals.COORDINATES__GROUP_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		eDynamicSet(MavenPackage.COORDINATES__GROUP_ID, MavenPackage.Literals.COORDINATES__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactId() {
		return (String)eDynamicGet(MavenPackage.COORDINATES__ARTIFACT_ID, MavenPackage.Literals.COORDINATES__ARTIFACT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactId(String newArtifactId) {
		eDynamicSet(MavenPackage.COORDINATES__ARTIFACT_ID, MavenPackage.Literals.COORDINATES__ARTIFACT_ID, newArtifactId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(MavenPackage.COORDINATES__VERSION, MavenPackage.Literals.COORDINATES__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(MavenPackage.COORDINATES__VERSION, MavenPackage.Literals.COORDINATES__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.COORDINATES__GROUP_ID:
				return getGroupId();
			case MavenPackage.COORDINATES__ARTIFACT_ID:
				return getArtifactId();
			case MavenPackage.COORDINATES__VERSION:
				return getVersion();
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
			case MavenPackage.COORDINATES__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case MavenPackage.COORDINATES__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case MavenPackage.COORDINATES__VERSION:
				setVersion((String)newValue);
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
			case MavenPackage.COORDINATES__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case MavenPackage.COORDINATES__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case MavenPackage.COORDINATES__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case MavenPackage.COORDINATES__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? getGroupId() != null : !GROUP_ID_EDEFAULT.equals(getGroupId());
			case MavenPackage.COORDINATES__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? getArtifactId() != null : !ARTIFACT_ID_EDEFAULT.equals(getArtifactId());
			case MavenPackage.COORDINATES__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
		}
		return super.eIsSet(featureID);
	}

} //CoordinatesImpl
