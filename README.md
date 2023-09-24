# Maven

Ecore model, graph nodes, and processors for Maven - module, organization, developer, ... Link to a Java module

Use [Maven Model](https://mvnrepository.com/artifact/org.apache.maven/maven-model) as a guide to create the Ecore model and to load the model from XML. https://maven.apache.org/archives/maven-1.x/reference/maven-model/3.0.2/apidocs/org/apache/maven/project/io/xpp3/MavenXpp3Reader.html
Introduce ``Coordinates`` base class - not in the Maven model.

May use https://maven.apache.org/ref/3.6.0/maven-resolver-provider/ to build effective pom - https://github.com/indrabasak/stackoverflow-indra/blob/master/effective-pom/src/main/java/com/basaki/EffectivePomBuilder.java

Use cases:

* Local Maven files - scan, generate dependencies report
* Integrate with the [GitLab](https://github.com/Nasdanika-Models/gitlab) model - scan multiple repositories, load ``pom.xml``'s, establish relationships between repositories, developers, organizations, repositories, ... Generate an HTML site
* Same as above plus cross-link with organization-specific entities such as an org/people hierarchy. Loading with creation of sub-classes of model classes. E.g. a subclass of ``Developer`` with a bi-directional reference to a person in the people hierarchy - this way it will be possible to retrieve a list of Maven projects where a person listed as a developer from a Person object. It will also be possible to roll up this information along the hierarchy and get a list of all Maven projects for a particular organization. Developer role may be linked to a documentation for the role - playbooks etc.         
* Automated governance:
    * Dependencies (especially internal)
    * Data quality:
        * Presence of, say, description, developers, organization sections in the pom file.
        * Cross-referencing. E.g. developers in ``pom.xml`` shall also be in the [CODEOWNERS](https://docs.gitlab.com/ee/user/project/codeowners/) file. 
* Maven URI scheme, e.g. ``maven`` and [URIHandler](https://download.eclipse.org/modeling/emf/emf/javadoc/2.4.3/org/eclipse/emf/ecore/resource/URIHandler.html). URI format: ``<scheme>://<groupId>/<artifactId>/<version>/<file>[/<jar path>]``. This would allow to transparently load resources from Maven repositories.        

https://github.com/yahro/maven-classloader/blob/master/src/main/java/com/bigfatgun/MavenClassLoader.java is an old example of creating a classloader from Maven coordinates. 
A similar logic may be implemented in Coordinates (GAV).createClassLoader() operation.

