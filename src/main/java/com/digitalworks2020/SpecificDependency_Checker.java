package com.digitalworks2020;

import java.util.List;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name="dependency-check",defaultPhase=LifecyclePhase.CLEAN)		
public class SpecificDependency_Checker extends AbstractMojo {

	@Parameter(defaultValue="${project}", required=true, readonly=true)
	MavenProject project;
	
	@Parameter(property="dependency_id")
	String dependency_id;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Mojo Plugins are awesome");		
		getLog().info("Listing Dependency " + dependency_id  +" in " + project.getName() + " if exists!!");
		List<Dependency> dependencies =  project.getDependencies();
		
		for (Dependency dependency : dependencies) {
            if(dependency.getArtifactId().equals(dependency_id))
            {
            	getLog().info(dependency.toString());
            }
        }
	}

}
