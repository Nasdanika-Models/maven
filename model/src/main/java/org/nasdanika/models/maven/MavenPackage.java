/**
 */
package org.nasdanika.models.maven;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.maven.MavenFactory
 * @model kind="package"
 * @generated
 */
public interface MavenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maven";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/maven";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.maven";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MavenPackage eINSTANCE = org.nasdanika.models.maven.impl.MavenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.CoordinatesImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ModelBaseImpl <em>Model Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ModelBaseImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModelBase()
	 * @generated
	 */
	int MODEL_BASE = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Managed Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__MANAGED_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__DISTRIBUTION_MANAGEMENT = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__MODULES = 3;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__REPOSITORIES = 4;

	/**
	 * The feature id for the '<em><b>Plugin Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__PLUGIN_REPOSITORIES = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__REPORTING = 7;

	/**
	 * The number of structural features of the '<em>Model Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Model Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.DependencyImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__GROUP_ID = COORDINATES__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ARTIFACT_ID = COORDINATES__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VERSION = COORDINATES__VERSION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = COORDINATES__TARGET;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLASSIFIER = COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__EXCLUSIONS = COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Management Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MANAGEMENT_KEY = COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OPTIONAL = COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SCOPE = COORDINATES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SYSTEM_PATH = COORDINATES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = COORDINATES_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = COORDINATES_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ModuleImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ModelImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPENDENCIES = MODEL_BASE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Managed Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MANAGED_DEPENDENCIES = MODEL_BASE__MANAGED_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DISTRIBUTION_MANAGEMENT = MODEL_BASE__DISTRIBUTION_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODULES = MODEL_BASE__MODULES;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPOSITORIES = MODEL_BASE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Plugin Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PLUGIN_REPOSITORIES = MODEL_BASE__PLUGIN_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROPERTIES = MODEL_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPORTING = MODEL_BASE__REPORTING;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GROUP_ID = MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARTIFACT_ID = MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TARGET = MODEL_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MODEL_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = MODEL_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ci Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CI_MANAGEMENT = MODEL_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTRIBUTORS = MODEL_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEVELOPERS = MODEL_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Issue Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ISSUE_MANAGEMENT = MODEL_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LICENSES = MODEL_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mailing Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAILING_LISTS = MODEL_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORGANIZATION = MODEL_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARENT = MODEL_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PREREQUISITES = MODEL_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROFILES = MODEL_BASE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MODEL_BASE_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = MODEL_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ParentImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 5;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__GROUP_ID = COORDINATES__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__ARTIFACT_ID = COORDINATES__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__VERSION = COORDINATES__VERSION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__TARGET = COORDINATES__TARGET;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__RELATIVE_PATH = COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_OPERATION_COUNT = COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ContributorImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Organization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ORGANIZATION_URL = 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ROLES = 5;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TIMEZONE = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__URL = 7;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.DeveloperImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__PROPERTIES = CONTRIBUTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__EMAIL = CONTRIBUTOR__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__NAME = CONTRIBUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ORGANIZATION = CONTRIBUTOR__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Organization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ORGANIZATION_URL = CONTRIBUTOR__ORGANIZATION_URL;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ROLES = CONTRIBUTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__TIMEZONE = CONTRIBUTOR__TIMEZONE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__URL = CONTRIBUTOR__URL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ID = CONTRIBUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = CONTRIBUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_OPERATION_COUNT = CONTRIBUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.IssueManagementImpl <em>Issue Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.IssueManagementImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getIssueManagement()
	 * @generated
	 */
	int ISSUE_MANAGEMENT = 8;

	/**
	 * The number of structural features of the '<em>Issue Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Issue Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.LicenseImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 9;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 3;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.OrganizationImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URL = 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.PrerequisitesImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getPrerequisites()
	 * @generated
	 */
	int PREREQUISITES = 11;

	/**
	 * The feature id for the '<em><b>Maven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES__MAVEN = 0;

	/**
	 * The number of structural features of the '<em>Prerequisites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prerequisites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ProfileImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 12;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DEPENDENCIES = MODEL_BASE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Managed Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MANAGED_DEPENDENCIES = MODEL_BASE__MANAGED_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Distribution Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DISTRIBUTION_MANAGEMENT = MODEL_BASE__DISTRIBUTION_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MODULES = MODEL_BASE__MODULES;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REPOSITORIES = MODEL_BASE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Plugin Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PLUGIN_REPOSITORIES = MODEL_BASE__PLUGIN_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PROPERTIES = MODEL_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REPORTING = MODEL_BASE__REPORTING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ID = MODEL_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SOURCE = MODEL_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ACTIVATION = MODEL_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Build Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BUILD_BASE = MODEL_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = MODEL_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = MODEL_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.BuildBaseImpl <em>Build Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.BuildBaseImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getBuildBase()
	 * @generated
	 */
	int BUILD_BASE = 13;

	/**
	 * The number of structural features of the '<em>Build Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Build Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ActivationImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 14;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.MailingListImpl <em>Mailing List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.MailingListImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getMailingList()
	 * @generated
	 */
	int MAILING_LIST = 15;

	/**
	 * The number of structural features of the '<em>Mailing List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mailing List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ScmImpl <em>Scm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ScmImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getScm()
	 * @generated
	 */
	int SCM = 16;

	/**
	 * The number of structural features of the '<em>Scm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.RepositoryImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 17;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.ReportingImpl <em>Reporting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.ReportingImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getReporting()
	 * @generated
	 */
	int REPORTING = 18;

	/**
	 * The number of structural features of the '<em>Reporting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reporting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.CiManagementImpl <em>Ci Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.CiManagementImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getCiManagement()
	 * @generated
	 */
	int CI_MANAGEMENT = 19;

	/**
	 * The number of structural features of the '<em>Ci Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ci Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CI_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.maven.impl.DistributionManagementImpl <em>Distribution Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.maven.impl.DistributionManagementImpl
	 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDistributionManagement()
	 * @generated
	 */
	int DISTRIBUTION_MANAGEMENT = 20;

	/**
	 * The number of structural features of the '<em>Distribution Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Distribution Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see org.nasdanika.models.maven.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Coordinates#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.nasdanika.models.maven.Coordinates#getGroupId()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Coordinates#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see org.nasdanika.models.maven.Coordinates#getArtifactId()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Coordinates#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.maven.Coordinates#getVersion()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Version();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.maven.Coordinates#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.maven.Coordinates#getTarget()
	 * @see #getCoordinates()
	 * @generated
	 */
	EReference getCoordinates_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.ModelBase <em>Model Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Base</em>'.
	 * @see org.nasdanika.models.maven.ModelBase
	 * @generated
	 */
	EClass getModelBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getDependencies()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getManagedDependencies <em>Managed Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managed Dependencies</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getManagedDependencies()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_ManagedDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.ModelBase#getDistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution Management</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getDistributionManagement()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_DistributionManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getModules()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getRepositories()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getPluginRepositories <em>Plugin Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Repositories</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getPluginRepositories()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_PluginRepositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.ModelBase#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getProperties()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.ModelBase#getReporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reporting</em>'.
	 * @see org.nasdanika.models.maven.ModelBase#getReporting()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_Reporting();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.nasdanika.models.maven.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getClassifier()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Dependency#getExclusions <em>Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclusions</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getExclusions()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Exclusions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getManagementKey <em>Management Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Key</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getManagementKey()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_ManagementKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getOptional()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getScope()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getSystemPath <em>System Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Path</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getSystemPath()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_SystemPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.maven.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.models.maven.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Module#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.maven.Module#getPath()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Path();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.maven.Module#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.nasdanika.models.maven.Module#getModel()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Model();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.nasdanika.models.maven.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.maven.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.maven.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Model#getCiManagement <em>Ci Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ci Management</em>'.
	 * @see org.nasdanika.models.maven.Model#getCiManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CiManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Model#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributors</em>'.
	 * @see org.nasdanika.models.maven.Model#getContributors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contributors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Model#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developers</em>'.
	 * @see org.nasdanika.models.maven.Model#getDevelopers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Developers();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Model#getIssueManagement <em>Issue Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Issue Management</em>'.
	 * @see org.nasdanika.models.maven.Model#getIssueManagement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_IssueManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Model#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Licenses</em>'.
	 * @see org.nasdanika.models.maven.Model#getLicenses()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Licenses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Model#getMailingLists <em>Mailing Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mailing Lists</em>'.
	 * @see org.nasdanika.models.maven.Model#getMailingLists()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MailingLists();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Model#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see org.nasdanika.models.maven.Model#getOrganization()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Model#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.nasdanika.models.maven.Model#getParent()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Model#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prerequisites</em>'.
	 * @see org.nasdanika.models.maven.Model#getPrerequisites()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Prerequisites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Model#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see org.nasdanika.models.maven.Model#getProfiles()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Profiles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.nasdanika.models.maven.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Parent#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see org.nasdanika.models.maven.Parent#getRelativePath()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_RelativePath();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see org.nasdanika.models.maven.Contributor
	 * @generated
	 */
	EClass getContributor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.maven.Contributor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getProperties()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getEMail()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_EMail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getName()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getOrganization()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getOrganizationUrl <em>Organization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Url</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getOrganizationUrl()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_OrganizationUrl();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.maven.Contributor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getRoles()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getTimezone()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Timezone();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Contributor#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.maven.Contributor#getUrl()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see org.nasdanika.models.maven.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Developer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.maven.Developer#getId()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.IssueManagement <em>Issue Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Management</em>'.
	 * @see org.nasdanika.models.maven.IssueManagement
	 * @generated
	 */
	EClass getIssueManagement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see org.nasdanika.models.maven.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.License#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.nasdanika.models.maven.License#getComments()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.License#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see org.nasdanika.models.maven.License#getDistribution()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.maven.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.maven.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.models.maven.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.maven.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Organization#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.maven.Organization#getUrl()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Prerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisites</em>'.
	 * @see org.nasdanika.models.maven.Prerequisites
	 * @generated
	 */
	EClass getPrerequisites();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Prerequisites#getMaven <em>Maven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven</em>'.
	 * @see org.nasdanika.models.maven.Prerequisites#getMaven()
	 * @see #getPrerequisites()
	 * @generated
	 */
	EAttribute getPrerequisites_Maven();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.nasdanika.models.maven.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Profile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.maven.Profile#getId()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.maven.Profile#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.maven.Profile#getSource()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Profile#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see org.nasdanika.models.maven.Profile#getActivation()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.maven.Profile#getBuildBase <em>Build Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Base</em>'.
	 * @see org.nasdanika.models.maven.Profile#getBuildBase()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_BuildBase();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.BuildBase <em>Build Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Base</em>'.
	 * @see org.nasdanika.models.maven.BuildBase
	 * @generated
	 */
	EClass getBuildBase();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see org.nasdanika.models.maven.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.MailingList <em>Mailing List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailing List</em>'.
	 * @see org.nasdanika.models.maven.MailingList
	 * @generated
	 */
	EClass getMailingList();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Scm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scm</em>'.
	 * @see org.nasdanika.models.maven.Scm
	 * @generated
	 */
	EClass getScm();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.nasdanika.models.maven.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting</em>'.
	 * @see org.nasdanika.models.maven.Reporting
	 * @generated
	 */
	EClass getReporting();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.CiManagement <em>Ci Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ci Management</em>'.
	 * @see org.nasdanika.models.maven.CiManagement
	 * @generated
	 */
	EClass getCiManagement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.maven.DistributionManagement <em>Distribution Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Management</em>'.
	 * @see org.nasdanika.models.maven.DistributionManagement
	 * @generated
	 */
	EClass getDistributionManagement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MavenFactory getMavenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.CoordinatesImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();
		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__GROUP_ID = eINSTANCE.getCoordinates_GroupId();
		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__ARTIFACT_ID = eINSTANCE.getCoordinates_ArtifactId();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__VERSION = eINSTANCE.getCoordinates_Version();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATES__TARGET = eINSTANCE.getCoordinates_Target();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ModelBaseImpl <em>Model Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ModelBaseImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModelBase()
		 * @generated
		 */
		EClass MODEL_BASE = eINSTANCE.getModelBase();
		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__DEPENDENCIES = eINSTANCE.getModelBase_Dependencies();
		/**
		 * The meta object literal for the '<em><b>Managed Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__MANAGED_DEPENDENCIES = eINSTANCE.getModelBase_ManagedDependencies();
		/**
		 * The meta object literal for the '<em><b>Distribution Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__DISTRIBUTION_MANAGEMENT = eINSTANCE.getModelBase_DistributionManagement();
		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__MODULES = eINSTANCE.getModelBase_Modules();
		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__REPOSITORIES = eINSTANCE.getModelBase_Repositories();
		/**
		 * The meta object literal for the '<em><b>Plugin Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__PLUGIN_REPOSITORIES = eINSTANCE.getModelBase_PluginRepositories();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__PROPERTIES = eINSTANCE.getModelBase_Properties();
		/**
		 * The meta object literal for the '<em><b>Reporting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__REPORTING = eINSTANCE.getModelBase_Reporting();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.DependencyImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();
		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__CLASSIFIER = eINSTANCE.getDependency_Classifier();
		/**
		 * The meta object literal for the '<em><b>Exclusions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__EXCLUSIONS = eINSTANCE.getDependency_Exclusions();
		/**
		 * The meta object literal for the '<em><b>Management Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__MANAGEMENT_KEY = eINSTANCE.getDependency_ManagementKey();
		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__OPTIONAL = eINSTANCE.getDependency_Optional();
		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__SCOPE = eINSTANCE.getDependency_Scope();
		/**
		 * The meta object literal for the '<em><b>System Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__SYSTEM_PATH = eINSTANCE.getDependency_SystemPath();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ModuleImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PATH = eINSTANCE.getModule_Path();
		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODEL = eINSTANCE.getModule_Model();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ModelImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();
		/**
		 * The meta object literal for the '<em><b>Ci Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CI_MANAGEMENT = eINSTANCE.getModel_CiManagement();
		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTRIBUTORS = eINSTANCE.getModel_Contributors();
		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEVELOPERS = eINSTANCE.getModel_Developers();
		/**
		 * The meta object literal for the '<em><b>Issue Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ISSUE_MANAGEMENT = eINSTANCE.getModel_IssueManagement();
		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LICENSES = eINSTANCE.getModel_Licenses();
		/**
		 * The meta object literal for the '<em><b>Mailing Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MAILING_LISTS = eINSTANCE.getModel_MailingLists();
		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ORGANIZATION = eINSTANCE.getModel_Organization();
		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARENT = eINSTANCE.getModel_Parent();
		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PREREQUISITES = eINSTANCE.getModel_Prerequisites();
		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROFILES = eINSTANCE.getModel_Profiles();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ParentImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();
		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__RELATIVE_PATH = eINSTANCE.getParent_RelativePath();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ContributorImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__PROPERTIES = eINSTANCE.getContributor_Properties();
		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__EMAIL = eINSTANCE.getContributor_EMail();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__NAME = eINSTANCE.getContributor_Name();
		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ORGANIZATION = eINSTANCE.getContributor_Organization();
		/**
		 * The meta object literal for the '<em><b>Organization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ORGANIZATION_URL = eINSTANCE.getContributor_OrganizationUrl();
		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ROLES = eINSTANCE.getContributor_Roles();
		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__TIMEZONE = eINSTANCE.getContributor_Timezone();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__URL = eINSTANCE.getContributor_Url();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.DeveloperImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__ID = eINSTANCE.getDeveloper_Id();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.IssueManagementImpl <em>Issue Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.IssueManagementImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getIssueManagement()
		 * @generated
		 */
		EClass ISSUE_MANAGEMENT = eINSTANCE.getIssueManagement();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.LicenseImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();
		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__COMMENTS = eINSTANCE.getLicense_Comments();
		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__DISTRIBUTION = eINSTANCE.getLicense_Distribution();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.OrganizationImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__URL = eINSTANCE.getOrganization_Url();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.PrerequisitesImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getPrerequisites()
		 * @generated
		 */
		EClass PREREQUISITES = eINSTANCE.getPrerequisites();
		/**
		 * The meta object literal for the '<em><b>Maven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITES__MAVEN = eINSTANCE.getPrerequisites_Maven();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ProfileImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__ID = eINSTANCE.getProfile_Id();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__SOURCE = eINSTANCE.getProfile_Source();
		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__ACTIVATION = eINSTANCE.getProfile_Activation();
		/**
		 * The meta object literal for the '<em><b>Build Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__BUILD_BASE = eINSTANCE.getProfile_BuildBase();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.BuildBaseImpl <em>Build Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.BuildBaseImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getBuildBase()
		 * @generated
		 */
		EClass BUILD_BASE = eINSTANCE.getBuildBase();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ActivationImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.MailingListImpl <em>Mailing List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.MailingListImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getMailingList()
		 * @generated
		 */
		EClass MAILING_LIST = eINSTANCE.getMailingList();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ScmImpl <em>Scm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ScmImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getScm()
		 * @generated
		 */
		EClass SCM = eINSTANCE.getScm();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.RepositoryImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.ReportingImpl <em>Reporting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.ReportingImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getReporting()
		 * @generated
		 */
		EClass REPORTING = eINSTANCE.getReporting();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.CiManagementImpl <em>Ci Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.CiManagementImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getCiManagement()
		 * @generated
		 */
		EClass CI_MANAGEMENT = eINSTANCE.getCiManagement();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.maven.impl.DistributionManagementImpl <em>Distribution Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.maven.impl.DistributionManagementImpl
		 * @see org.nasdanika.models.maven.impl.MavenPackageImpl#getDistributionManagement()
		 * @generated
		 */
		EClass DISTRIBUTION_MANAGEMENT = eINSTANCE.getDistributionManagement();

	}

} //MavenPackage
