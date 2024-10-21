/**
 */
package org.nasdanika.models.maven.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.maven.Dependency;
import org.nasdanika.models.maven.DistributionManagement;
import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.ModelBase;
import org.nasdanika.models.maven.Reporting;
import org.nasdanika.models.maven.Repository;

import org.nasdanika.ncore.StringProperty;
import org.nasdanika.ncore.impl.StringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getManagedDependencies <em>Managed Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getDistributionManagement <em>Distribution Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getPluginRepositories <em>Plugin Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ModelBaseImpl#getReporting <em>Reporting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelBaseImpl extends StringIdentityImpl implements ModelBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.MODEL_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Dependency> getDependencies() {
		return (EList<Dependency>)eDynamicGet(MavenPackage.MODEL_BASE__DEPENDENCIES, MavenPackage.Literals.MODEL_BASE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Dependency> getManagedDependencies() {
		return (EList<Dependency>)eDynamicGet(MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES, MavenPackage.Literals.MODEL_BASE__MANAGED_DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionManagement getDistributionManagement() {
		return (DistributionManagement)eDynamicGet(MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT, MavenPackage.Literals.MODEL_BASE__DISTRIBUTION_MANAGEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionManagement(DistributionManagement newDistributionManagement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDistributionManagement, MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionManagement(DistributionManagement newDistributionManagement) {
		eDynamicSet(MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT, MavenPackage.Literals.MODEL_BASE__DISTRIBUTION_MANAGEMENT, newDistributionManagement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.maven.Module> getModules() {
		return (EList<org.nasdanika.models.maven.Module>)eDynamicGet(MavenPackage.MODEL_BASE__MODULES, MavenPackage.Literals.MODEL_BASE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Repository> getRepositories() {
		return (EList<Repository>)eDynamicGet(MavenPackage.MODEL_BASE__REPOSITORIES, MavenPackage.Literals.MODEL_BASE__REPOSITORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Repository> getPluginRepositories() {
		return (EList<Repository>)eDynamicGet(MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES, MavenPackage.Literals.MODEL_BASE__PLUGIN_REPOSITORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StringProperty> getProperties() {
		return (EList<StringProperty>)eDynamicGet(MavenPackage.MODEL_BASE__PROPERTIES, MavenPackage.Literals.MODEL_BASE__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reporting getReporting() {
		return (Reporting)eDynamicGet(MavenPackage.MODEL_BASE__REPORTING, MavenPackage.Literals.MODEL_BASE__REPORTING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReporting(Reporting newReporting, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReporting, MavenPackage.MODEL_BASE__REPORTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReporting(Reporting newReporting) {
		eDynamicSet(MavenPackage.MODEL_BASE__REPORTING, MavenPackage.Literals.MODEL_BASE__REPORTING, newReporting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MavenPackage.MODEL_BASE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES:
				return ((InternalEList<?>)getManagedDependencies()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT:
				return basicSetDistributionManagement(null, msgs);
			case MavenPackage.MODEL_BASE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES:
				return ((InternalEList<?>)getPluginRepositories()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MavenPackage.MODEL_BASE__REPORTING:
				return basicSetReporting(null, msgs);
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
			case MavenPackage.MODEL_BASE__DEPENDENCIES:
				return getDependencies();
			case MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES:
				return getManagedDependencies();
			case MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT:
				return getDistributionManagement();
			case MavenPackage.MODEL_BASE__MODULES:
				return getModules();
			case MavenPackage.MODEL_BASE__REPOSITORIES:
				return getRepositories();
			case MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES:
				return getPluginRepositories();
			case MavenPackage.MODEL_BASE__PROPERTIES:
				return getProperties();
			case MavenPackage.MODEL_BASE__REPORTING:
				return getReporting();
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
			case MavenPackage.MODEL_BASE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES:
				getManagedDependencies().clear();
				getManagedDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT:
				setDistributionManagement((DistributionManagement)newValue);
				return;
			case MavenPackage.MODEL_BASE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.models.maven.Module>)newValue);
				return;
			case MavenPackage.MODEL_BASE__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES:
				getPluginRepositories().clear();
				getPluginRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case MavenPackage.MODEL_BASE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends StringProperty>)newValue);
				return;
			case MavenPackage.MODEL_BASE__REPORTING:
				setReporting((Reporting)newValue);
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
			case MavenPackage.MODEL_BASE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES:
				getManagedDependencies().clear();
				return;
			case MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT:
				setDistributionManagement((DistributionManagement)null);
				return;
			case MavenPackage.MODEL_BASE__MODULES:
				getModules().clear();
				return;
			case MavenPackage.MODEL_BASE__REPOSITORIES:
				getRepositories().clear();
				return;
			case MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES:
				getPluginRepositories().clear();
				return;
			case MavenPackage.MODEL_BASE__PROPERTIES:
				getProperties().clear();
				return;
			case MavenPackage.MODEL_BASE__REPORTING:
				setReporting((Reporting)null);
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
			case MavenPackage.MODEL_BASE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case MavenPackage.MODEL_BASE__MANAGED_DEPENDENCIES:
				return !getManagedDependencies().isEmpty();
			case MavenPackage.MODEL_BASE__DISTRIBUTION_MANAGEMENT:
				return getDistributionManagement() != null;
			case MavenPackage.MODEL_BASE__MODULES:
				return !getModules().isEmpty();
			case MavenPackage.MODEL_BASE__REPOSITORIES:
				return !getRepositories().isEmpty();
			case MavenPackage.MODEL_BASE__PLUGIN_REPOSITORIES:
				return !getPluginRepositories().isEmpty();
			case MavenPackage.MODEL_BASE__PROPERTIES:
				return !getProperties().isEmpty();
			case MavenPackage.MODEL_BASE__REPORTING:
				return getReporting() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelBaseImpl
