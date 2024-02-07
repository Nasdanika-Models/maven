package org.nasdanika.models.maven.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.maven.Project;
import org.nasdanika.models.maven.util.MavenResourceFactory;

public class MavenTests {
	
	@Test
	public void testMavenResourceFactory() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new MavenResourceFactory());
		
		String pomXmlPath = new File("pom.xml").getCanonicalPath();
		Resource pomXmlResource = resourceSet.getResource(URI.createFileURI(pomXmlPath), true);
		for (EObject root: pomXmlResource.getContents()) {
			Project project = (Project) root;
			System.out.println(project.getGroupId());
			System.out.println(project.getArtifactId());
			System.out.println(project.getVersion());
			System.out.println(project.getName());			
			System.out.println(project.getDescription());			
		}		
	}
		
	@Test
	public void testMaven() throws Exception {
		MavenXpp3Reader xpp3Reader = new MavenXpp3Reader();
		try (InputStream in = new FileInputStream("pom.xml")) {
			Model model = xpp3Reader.read(in);
			Build build = model.getBuild();
			System.out.println(build.getSourceDirectory());
			System.out.println(build.getTestSourceDirectory());
			List<Plugin> plugins = build.getPlugins();
			for (Plugin plugin: plugins) {
				System.out.println(plugin.getArtifactId() + " " +  plugin.getConfiguration());
			}
		}
	}

}
