module org.nasdanika.models.maven.processors {
		
	requires transitive org.nasdanika.models.maven;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.maven.processors;
	opens org.nasdanika.models.maven.processors; // For loading resources
	
}
