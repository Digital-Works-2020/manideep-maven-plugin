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

@Mojo(name="project-info",defaultPhase=LifecyclePhase.CLEAN)		
public class ProjectBasicInfo extends AbstractMojo {

	@Parameter(defaultValue="${project}", required=true, readonly=true)
	MavenProject project;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Mojo Plugins are awesome");
		
		//Printing Name of the project
		getLog().info("Project Name is " + project.getName());
		
		//Printing Modules Info
		List<String> modules = project.getModules();
		if(modules.size() >= 1)
		{
			getLog().info("List of Modules in the project are follows:");
			project.getModules().forEach(m-> getLog().info(m.toString()));
		}
		
		//Printing Dependency Info
		List<Dependency> dependencies = project.getDependencies();
		if(dependencies.size() >= 1)
		{
			getLog().info("List of Dependencies in the project are follows:");
			project.getDependencies().forEach(d-> getLog().info(d.toString()));
		}
	}

}
