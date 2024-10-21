package org.nasdanika.models.maven.tests;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.maven.MavenFactory;
import org.nasdanika.models.maven.Parent;

public class MavenTests {
	
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
	
	@Test
	public void testLoadModel() throws Exception {
		org.nasdanika.models.maven.Model model = MavenFactory.eINSTANCE.createModel();
		try (InputStream in = new FileInputStream("pom.xml")) {
			model.load(in);
		}
		System.out.println(model.getName());
		System.out.println(model.getGroupId());
		System.out.println(model.getArtifactId());
		System.out.println(model.getVersion());
		
		Parent parent = model.getParent();
		System.out.println(parent.getGroupId());
		System.out.println(parent.getArtifactId());
		System.out.println(parent.getVersion());		
	}	

}
