package org.nasdanika.models.maven.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.maven.MavenFactory;
import org.nasdanika.models.maven.Project;

public class MavenResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new MavenResource(uri) {
			
			@Override
			protected Project createProject() {
				return MavenResourceFactory.this.createProject(this);
			}
			
		};
	}
	
	/**
	 * Override to customize creation of a compilation unit
	 * @param resource
	 * @return
	 */
	protected Project createProject(MavenResource resource) {
		return MavenFactory.eINSTANCE.createProject();
	}

}
