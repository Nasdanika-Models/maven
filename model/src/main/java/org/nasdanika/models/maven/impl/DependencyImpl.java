/**
 */
package org.nasdanika.models.maven.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.maven.Coordinates;
import org.nasdanika.models.maven.Dependency;
import org.nasdanika.models.maven.MavenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getExclusions <em>Exclusions</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getManagementKey <em>Management Key</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getSystemPath <em>System Path</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.DependencyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends CoordinatesImpl implements Dependency {
	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getManagementKey() <em>Management Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEMENT_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSystemPath() <em>System Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifier() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__CLASSIFIER, MavenPackage.Literals.DEPENDENCY__CLASSIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifier(String newClassifier) {
		eDynamicSet(MavenPackage.DEPENDENCY__CLASSIFIER, MavenPackage.Literals.DEPENDENCY__CLASSIFIER, newClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Coordinates> getExclusions() {
		return (EList<Coordinates>)eDynamicGet(MavenPackage.DEPENDENCY__EXCLUSIONS, MavenPackage.Literals.DEPENDENCY__EXCLUSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagementKey() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__MANAGEMENT_KEY, MavenPackage.Literals.DEPENDENCY__MANAGEMENT_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagementKey(String newManagementKey) {
		eDynamicSet(MavenPackage.DEPENDENCY__MANAGEMENT_KEY, MavenPackage.Literals.DEPENDENCY__MANAGEMENT_KEY, newManagementKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptional() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__OPTIONAL, MavenPackage.Literals.DEPENDENCY__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(String newOptional) {
		eDynamicSet(MavenPackage.DEPENDENCY__OPTIONAL, MavenPackage.Literals.DEPENDENCY__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__SCOPE, MavenPackage.Literals.DEPENDENCY__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		eDynamicSet(MavenPackage.DEPENDENCY__SCOPE, MavenPackage.Literals.DEPENDENCY__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPath() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__SYSTEM_PATH, MavenPackage.Literals.DEPENDENCY__SYSTEM_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPath(String newSystemPath) {
		eDynamicSet(MavenPackage.DEPENDENCY__SYSTEM_PATH, MavenPackage.Literals.DEPENDENCY__SYSTEM_PATH, newSystemPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(MavenPackage.DEPENDENCY__TYPE, MavenPackage.Literals.DEPENDENCY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(MavenPackage.DEPENDENCY__TYPE, MavenPackage.Literals.DEPENDENCY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.DEPENDENCY__EXCLUSIONS:
				return ((InternalEList<?>)getExclusions()).basicRemove(otherEnd, msgs);
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
			case MavenPackage.DEPENDENCY__CLASSIFIER:
				return getClassifier();
			case MavenPackage.DEPENDENCY__EXCLUSIONS:
				return getExclusions();
			case MavenPackage.DEPENDENCY__MANAGEMENT_KEY:
				return getManagementKey();
			case MavenPackage.DEPENDENCY__OPTIONAL:
				return getOptional();
			case MavenPackage.DEPENDENCY__SCOPE:
				return getScope();
			case MavenPackage.DEPENDENCY__SYSTEM_PATH:
				return getSystemPath();
			case MavenPackage.DEPENDENCY__TYPE:
				return getType();
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
			case MavenPackage.DEPENDENCY__CLASSIFIER:
				setClassifier((String)newValue);
				return;
			case MavenPackage.DEPENDENCY__EXCLUSIONS:
				getExclusions().clear();
				getExclusions().addAll((Collection<? extends Coordinates>)newValue);
				return;
			case MavenPackage.DEPENDENCY__MANAGEMENT_KEY:
				setManagementKey((String)newValue);
				return;
			case MavenPackage.DEPENDENCY__OPTIONAL:
				setOptional((String)newValue);
				return;
			case MavenPackage.DEPENDENCY__SCOPE:
				setScope((String)newValue);
				return;
			case MavenPackage.DEPENDENCY__SYSTEM_PATH:
				setSystemPath((String)newValue);
				return;
			case MavenPackage.DEPENDENCY__TYPE:
				setType((String)newValue);
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
			case MavenPackage.DEPENDENCY__CLASSIFIER:
				setClassifier(CLASSIFIER_EDEFAULT);
				return;
			case MavenPackage.DEPENDENCY__EXCLUSIONS:
				getExclusions().clear();
				return;
			case MavenPackage.DEPENDENCY__MANAGEMENT_KEY:
				setManagementKey(MANAGEMENT_KEY_EDEFAULT);
				return;
			case MavenPackage.DEPENDENCY__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case MavenPackage.DEPENDENCY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case MavenPackage.DEPENDENCY__SYSTEM_PATH:
				setSystemPath(SYSTEM_PATH_EDEFAULT);
				return;
			case MavenPackage.DEPENDENCY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MavenPackage.DEPENDENCY__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? getClassifier() != null : !CLASSIFIER_EDEFAULT.equals(getClassifier());
			case MavenPackage.DEPENDENCY__EXCLUSIONS:
				return !getExclusions().isEmpty();
			case MavenPackage.DEPENDENCY__MANAGEMENT_KEY:
				return MANAGEMENT_KEY_EDEFAULT == null ? getManagementKey() != null : !MANAGEMENT_KEY_EDEFAULT.equals(getManagementKey());
			case MavenPackage.DEPENDENCY__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? getOptional() != null : !OPTIONAL_EDEFAULT.equals(getOptional());
			case MavenPackage.DEPENDENCY__SCOPE:
				return SCOPE_EDEFAULT == null ? getScope() != null : !SCOPE_EDEFAULT.equals(getScope());
			case MavenPackage.DEPENDENCY__SYSTEM_PATH:
				return SYSTEM_PATH_EDEFAULT == null ? getSystemPath() != null : !SYSTEM_PATH_EDEFAULT.equals(getSystemPath());
			case MavenPackage.DEPENDENCY__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //DependencyImpl
