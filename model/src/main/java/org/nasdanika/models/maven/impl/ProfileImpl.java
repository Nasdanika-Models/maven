/**
 */
package org.nasdanika.models.maven.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.maven.Activation;
import org.nasdanika.models.maven.BuildBase;
import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.Profile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.ProfileImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ProfileImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ProfileImpl#getBuildBase <em>Build Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends ModelBaseImpl implements Profile {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(MavenPackage.PROFILE__SOURCE, MavenPackage.Literals.PROFILE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(MavenPackage.PROFILE__SOURCE, MavenPackage.Literals.PROFILE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activation getActivation() {
		return (Activation)eDynamicGet(MavenPackage.PROFILE__ACTIVATION, MavenPackage.Literals.PROFILE__ACTIVATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation(Activation newActivation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newActivation, MavenPackage.PROFILE__ACTIVATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivation(Activation newActivation) {
		eDynamicSet(MavenPackage.PROFILE__ACTIVATION, MavenPackage.Literals.PROFILE__ACTIVATION, newActivation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildBase getBuildBase() {
		return (BuildBase)eDynamicGet(MavenPackage.PROFILE__BUILD_BASE, MavenPackage.Literals.PROFILE__BUILD_BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildBase(BuildBase newBuildBase, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBuildBase, MavenPackage.PROFILE__BUILD_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildBase(BuildBase newBuildBase) {
		eDynamicSet(MavenPackage.PROFILE__BUILD_BASE, MavenPackage.Literals.PROFILE__BUILD_BASE, newBuildBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.PROFILE__ACTIVATION:
				return basicSetActivation(null, msgs);
			case MavenPackage.PROFILE__BUILD_BASE:
				return basicSetBuildBase(null, msgs);
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
			case MavenPackage.PROFILE__SOURCE:
				return getSource();
			case MavenPackage.PROFILE__ACTIVATION:
				return getActivation();
			case MavenPackage.PROFILE__BUILD_BASE:
				return getBuildBase();
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
			case MavenPackage.PROFILE__SOURCE:
				setSource((String)newValue);
				return;
			case MavenPackage.PROFILE__ACTIVATION:
				setActivation((Activation)newValue);
				return;
			case MavenPackage.PROFILE__BUILD_BASE:
				setBuildBase((BuildBase)newValue);
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
			case MavenPackage.PROFILE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case MavenPackage.PROFILE__ACTIVATION:
				setActivation((Activation)null);
				return;
			case MavenPackage.PROFILE__BUILD_BASE:
				setBuildBase((BuildBase)null);
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
			case MavenPackage.PROFILE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case MavenPackage.PROFILE__ACTIVATION:
				return getActivation() != null;
			case MavenPackage.PROFILE__BUILD_BASE:
				return getBuildBase() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileImpl
