module org.nasdanika.models.maven {
	exports org.nasdanika.models.maven;
	exports org.nasdanika.models.maven.impl;
	exports org.nasdanika.models.maven.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires maven.model;
	requires plexus.utils;
//	requires plexus.utils;
	
}