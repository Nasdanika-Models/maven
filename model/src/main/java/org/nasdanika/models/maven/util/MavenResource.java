package org.nasdanika.models.maven.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.maven.MavenFactory;
import org.nasdanika.models.maven.Project;

public class MavenResource extends ResourceImpl {

	protected MavenResource() {
		super();
	}

	protected MavenResource(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		MavenXpp3Reader xpp3Reader = new MavenXpp3Reader();
		try (inputStream) {
			Model model = xpp3Reader.read(inputStream);
			Project project = createProject();
			loadProject(model, project);
			getContents().add(project);
		} catch (XmlPullParserException e) {
			throw new IOException(e);
		}
	}
	
	protected Project createProject() {
		return MavenFactory.eINSTANCE.createProject();
	}
	
	protected void loadProject(Model model, Project project) {
		project.setGroupId(model.getGroupId());
		project.setArtifactId(model.getArtifactId());
		project.setVersion(model.getVersion());
		project.setName(model.getName());
		project.setDescription(model.getDescription());
		
//		## ModelBase
//
//		getDependencies()
//		getDependencyManagement()
//		getDistributionManagement()
//		getLocation(Object)
//		getModules()
//		getPluginRepositories()
//		getProperties()
//		getReporting()
//		getReports()
//		getRepositories()
//
//		## Model
//
//		getBuild()
//		getChildProjectUrlInheritAppendPath()
//		getCiManagement()
//		getContributors()
//		getDevelopers()
//		getId()
//		getInceptionYear()
//		getIssueManagement()
//		getLicenses()
//		getMailingLists()
//		getModelEncoding()
//		getModelVersion()
//		getOrganization()
//		getPackaging()
//		getParent()
//		getPomFile()
//		getPrerequisites()
//		getProfiles()
//		getProjectDirectory()
//		getScm()
//		getUrl()
//		isChildProjectUrlInheritAppendPath()		
		
	}
	

}
