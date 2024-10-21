/**
 */
package org.nasdanika.models.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.function.Function;

import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getCiManagement <em>Ci Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getIssueManagement <em>Issue Management</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getMailingLists <em>Mailing Lists</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.Model#getInceptionYear <em>Inception Year</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.maven.MavenPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends ModelBase, Coordinates {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ci Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci Management</em>' containment reference.
	 * @see #setCiManagement(CiManagement)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_CiManagement()
	 * @model containment="true"
	 * @generated
	 */
	CiManagement getCiManagement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getCiManagement <em>Ci Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci Management</em>' containment reference.
	 * @see #getCiManagement()
	 * @generated
	 */
	void setCiManagement(CiManagement value);

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Contributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Contributors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contributor> getContributors();

	/**
	 * Returns the value of the '<em><b>Developers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Developer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developers</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Developers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Developer> getDevelopers();

	/**
	 * Returns the value of the '<em><b>Issue Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Management</em>' containment reference.
	 * @see #setIssueManagement(IssueManagement)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_IssueManagement()
	 * @model containment="true"
	 * @generated
	 */
	IssueManagement getIssueManagement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getIssueManagement <em>Issue Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Management</em>' containment reference.
	 * @see #getIssueManagement()
	 * @generated
	 */
	void setIssueManagement(IssueManagement value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.License}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Licenses()
	 * @model containment="true"
	 * @generated
	 */
	EList<License> getLicenses();

	/**
	 * Returns the value of the '<em><b>Mailing Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.MailingList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailing Lists</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_MailingLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<MailingList> getMailingLists();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Organization()
	 * @model containment="true"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Parent)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Parent()
	 * @model containment="true"
	 * @generated
	 */
	Parent getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Parent value);

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference.
	 * @see #setPrerequisites(Prerequisites)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Prerequisites()
	 * @model containment="true"
	 * @generated
	 */
	Prerequisites getPrerequisites();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getPrerequisites <em>Prerequisites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisites</em>' containment reference.
	 * @see #getPrerequisites()
	 * @generated
	 */
	void setPrerequisites(Prerequisites value);

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.maven.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();
	
	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' attribute.
	 * @see #setPackaging(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_Packaging()
	 * @model
	 * @generated
	 */
	String getPackaging();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getPackaging <em>Packaging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' attribute.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(String value);

	/**
	 * Returns the value of the '<em><b>Inception Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inception Year</em>' attribute.
	 * @see #setInceptionYear(String)
	 * @see org.nasdanika.models.maven.MavenPackage#getModel_InceptionYear()
	 * @model
	 * @generated
	 */
	String getInceptionYear();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.maven.Model#getInceptionYear <em>Inception Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inception Year</em>' attribute.
	 * @see #getInceptionYear()
	 * @generated
	 */
	void setInceptionYear(String value);

	default void load(org.apache.maven.model.Model model) {
		load(model, MavenFactory.eINSTANCE);
	}
		
	default void load(org.apache.maven.model.Model model, MavenFactory factory) {
		ModelBase.super.load(model, factory);
		
		setArtifactId(model.getArtifactId());
		setGroupId(model.getGroupId());
		setVersion(model.getVersion());		
		setPackaging(model.getPackaging());
		
		setInceptionYear(model.getInceptionYear());
		
		List<Contributor> contributors = getContributors();		
		for (org.apache.maven.model.Contributor c: model.getContributors()) {
			Contributor contributor = factory.createContributor();
			contributor.load(c);
			contributors.add(contributor);
		}
		
		setDescription(model.getDescription());
		
		List<Developer> developers = getDevelopers();		
		for (org.apache.maven.model.Developer d: model.getDevelopers()) {
			Developer developer = factory.createDeveloper();
			developer.load(d);
			developers.add(developer);
		}
		
		setName(model.getName());
		
		org.apache.maven.model.Organization org = model.getOrganization();
		if (org != null) {
			Organization o = factory.createOrganization();
			o.load(org);
			setOrganization(o);
		}
		
		org.apache.maven.model.Parent parent = model.getParent();
		if (parent != null) {
			Parent p = factory.createParent();
			p.load(parent);
			setParent(p);
			
			if (Util.isBlank(getGroupId())) {
				setGroupId(parent.getGroupId());
			}
			
			if (Util.isBlank(getVersion())) {
				setVersion(parent.getVersion());
			}				
			
		}
		
		setId(getGroupId() + ":" + getArtifactId() + ":" + getPackaging() + ":" + getVersion());
		
		EList<Profile> profiles = getProfiles();
		for (org.apache.maven.model.Profile p: model.getProfiles()) {
			Profile profile = factory.createProfile();
			profile.load(p, factory);
			profiles.add(profile);
		}

//		setPrerequisites(Prerequisites)		
//		setCiManagement(CiManagement)
//		setIssueManagement(IssueManagement)
//		getLicenses()
//		getMailingLists()

	}
		
	default void load(Reader reader, MavenFactory factory) throws IOException, XmlPullParserException {
		MavenXpp3Reader mReader = new MavenXpp3Reader();
		load(mReader.read(reader), factory);				
	}
		
	default void load(InputStream in, MavenFactory factory) throws IOException, XmlPullParserException {
		MavenXpp3Reader mReader = new MavenXpp3Reader();
		load(mReader.read(in), factory);
	}
		
	default void load(File pomFile, MavenFactory factory) throws IOException, XmlPullParserException {
		try (InputStream in = new FileInputStream(pomFile)) {
			load(in, factory);
		}
	}
	
	default void load(Reader reader) throws IOException, XmlPullParserException {
		MavenXpp3Reader mReader = new MavenXpp3Reader();
		load(mReader.read(reader));				
	}
		
	default void load(InputStream in) throws IOException, XmlPullParserException {
		MavenXpp3Reader mReader = new MavenXpp3Reader();
		load(mReader.read(in));
	}
		
	default void load(File pomFile) throws IOException, XmlPullParserException {
		try (InputStream in = new FileInputStream(pomFile)) {
			load(in);
		}
	}
	
	@Override
	default void resolve(Function<Coordinates, Model> resolver) {
		// Not resolving self
		eContents().forEach(c -> {
			if (c instanceof Coordinates) {
				((Coordinates) c).resolve(resolver);
			}
		});
	}

} // Model
