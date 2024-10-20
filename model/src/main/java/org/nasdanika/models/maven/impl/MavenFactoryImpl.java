/**
 */
package org.nasdanika.models.maven.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.maven.Activation;
import org.nasdanika.models.maven.BuildBase;
import org.nasdanika.models.maven.CiManagement;
import org.nasdanika.models.maven.Contributor;
import org.nasdanika.models.maven.Coordinates;
import org.nasdanika.models.maven.Dependency;
import org.nasdanika.models.maven.Developer;
import org.nasdanika.models.maven.DistributionManagement;
import org.nasdanika.models.maven.IssueManagement;
import org.nasdanika.models.maven.License;
import org.nasdanika.models.maven.MailingList;
import org.nasdanika.models.maven.MavenFactory;
import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.Model;
import org.nasdanika.models.maven.ModelBase;
import org.nasdanika.models.maven.Organization;
import org.nasdanika.models.maven.Parent;
import org.nasdanika.models.maven.Prerequisites;
import org.nasdanika.models.maven.Profile;
import org.nasdanika.models.maven.Reporting;
import org.nasdanika.models.maven.Repository;
import org.nasdanika.models.maven.Scm;
import org.nasdanika.models.maven.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MavenFactoryImpl extends EFactoryImpl implements MavenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MavenFactory init() {
		try {
			MavenFactory theMavenFactory = (MavenFactory)EPackage.Registry.INSTANCE.getEFactory(MavenPackage.eNS_URI);
			if (theMavenFactory != null) {
				return theMavenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MavenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MavenPackage.COORDINATES: return createCoordinates();
			case MavenPackage.MODEL_BASE: return createModelBase();
			case MavenPackage.DEPENDENCY: return createDependency();
			case MavenPackage.MODULE: return createModule();
			case MavenPackage.MODEL: return createModel();
			case MavenPackage.PARENT: return createParent();
			case MavenPackage.CONTRIBUTOR: return createContributor();
			case MavenPackage.DEVELOPER: return createDeveloper();
			case MavenPackage.ISSUE_MANAGEMENT: return createIssueManagement();
			case MavenPackage.LICENSE: return createLicense();
			case MavenPackage.ORGANIZATION: return createOrganization();
			case MavenPackage.PREREQUISITES: return createPrerequisites();
			case MavenPackage.PROFILE: return createProfile();
			case MavenPackage.BUILD_BASE: return createBuildBase();
			case MavenPackage.ACTIVATION: return createActivation();
			case MavenPackage.MAILING_LIST: return createMailingList();
			case MavenPackage.SCM: return createScm();
			case MavenPackage.REPOSITORY: return createRepository();
			case MavenPackage.REPORTING: return createReporting();
			case MavenPackage.CI_MANAGEMENT: return createCiManagement();
			case MavenPackage.DISTRIBUTION_MANAGEMENT: return createDistributionManagement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinates createCoordinates() {
		CoordinatesImpl coordinates = new CoordinatesImpl();
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelBase createModelBase() {
		ModelBaseImpl modelBase = new ModelBaseImpl();
		return modelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.maven.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Developer createDeveloper() {
		DeveloperImpl developer = new DeveloperImpl();
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueManagement createIssueManagement() {
		IssueManagementImpl issueManagement = new IssueManagementImpl();
		return issueManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prerequisites createPrerequisites() {
		PrerequisitesImpl prerequisites = new PrerequisitesImpl();
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildBase createBuildBase() {
		BuildBaseImpl buildBase = new BuildBaseImpl();
		return buildBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activation createActivation() {
		ActivationImpl activation = new ActivationImpl();
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MailingList createMailingList() {
		MailingListImpl mailingList = new MailingListImpl();
		return mailingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scm createScm() {
		ScmImpl scm = new ScmImpl();
		return scm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reporting createReporting() {
		ReportingImpl reporting = new ReportingImpl();
		return reporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiManagement createCiManagement() {
		CiManagementImpl ciManagement = new CiManagementImpl();
		return ciManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionManagement createDistributionManagement() {
		DistributionManagementImpl distributionManagement = new DistributionManagementImpl();
		return distributionManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MavenPackage getMavenPackage() {
		return (MavenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MavenPackage getPackage() {
		return MavenPackage.eINSTANCE;
	}

} //MavenFactoryImpl
