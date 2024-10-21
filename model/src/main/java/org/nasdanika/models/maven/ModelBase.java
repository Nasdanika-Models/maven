/**
 */
package org.nasdanika.models.maven;

import java.util.Map.Entry;

import org.apache.maven.model.DependencyManagement;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.ncore.StringProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getManagedDependencies <em>Managed Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getDistributionManagement <em>Distribution Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getPluginRepositories <em>Plugin Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.ModelBase#getReporting <em>Reporting</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getModelBase()
 * @model
 * @generated
 */
public interface ModelBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Managed Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Dependencies</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_ManagedDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getManagedDependencies();

	/**
	 * Returns the value of the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Management</em>' containment reference.
	 * @see #setDistributionManagement(DistributionManagement)
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_DistributionManagement()
	 * @model containment="true"
	 * @generated
	 */
	DistributionManagement getDistributionManagement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.ModelBase#getDistributionManagement <em>Distribution Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Management</em>' containment reference.
	 * @see #getDistributionManagement()
	 * @generated
	 */
	void setDistributionManagement(DistributionManagement value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.models.maven.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Plugin Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Repositories</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_PluginRepositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getPluginRepositories();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ncore.StringProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting</em>' containment reference.
	 * @see #setReporting(Reporting)
	 * @see org.nasdanika.models.maven.MavenPackage#getModelBase_Reporting()
	 * @model containment="true"
	 * @generated
	 */
	Reporting getReporting();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.ModelBase#getReporting <em>Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting</em>' containment reference.
	 * @see #getReporting()
	 * @generated
	 */
	void setReporting(Reporting value);
	
	default void load(org.apache.maven.model.ModelBase modelBase, MavenFactory factory) {
		EList<Dependency> dependencies = getDependencies();
		for (org.apache.maven.model.Dependency d: modelBase.getDependencies()) {
			Dependency dep = factory.createDependency();
			dep.load(d, factory);
			dependencies.add(dep);
		}
		DependencyManagement dm = modelBase.getDependencyManagement();
		EList<Dependency> managedDependencies = getManagedDependencies();
		if (dm != null) {
			for (org.apache.maven.model.Dependency d: dm.getDependencies()) {
				Dependency dep = factory.createDependency();
				dep.load(d, factory);
				managedDependencies.add(dep);
			}			
		}
		EList<Module> modules = getModules();
		for (String m: modelBase.getModules()) {
			Module module = factory.createModule();
			module.setPath(m);
			modules.add(module);
		}
		EList<StringProperty> properties = getProperties();
		for (Entry<Object, Object> p: modelBase.getProperties().entrySet()) {
			StringProperty prop = StringProperty.wrap((String) p.getKey(), (String) p.getValue());
			properties.add(prop);
		}
//		getDistributionManagement()
//		getPluginRepositories()
//		getRepositories()
//		setDistributionManagement(DistributionManagement)
//		setReporting(Reporting)
	}

} // ModelBase
