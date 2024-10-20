import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.maven.util.MavenEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.maven {
	exports org.nasdanika.models.maven;
	exports org.nasdanika.models.maven.impl;
	exports org.nasdanika.models.maven.util;
	
	requires transitive org.nasdanika.ncore;
	requires transitive org.nasdanika.capability;
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	
	requires transitive maven.model;
	requires plexus.utils;

	provides CapabilityFactory with	MavenEPackageResourceSetCapabilityFactory;
	
}