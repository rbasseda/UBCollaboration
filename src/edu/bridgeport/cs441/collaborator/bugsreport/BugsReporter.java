


/**
 * JoinDiscussionHandler.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 29, 2016
 */

package edu.bridgeport.cs441.collaborator.bugsreport;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * @author Alaa Elsaka
 *
 */
public class BugsReporter  {

	private String test = "This is Test";
	private IWorkspaceRoot workspaceRoot;
	private IWorkbench workbench;

	
	void print(){
		System.out.println("This is to test for Bug report");
	}
	
	
	
	public static List<IJavaProject> getJavaProjects() {
	      List<IJavaProject> projectList = new LinkedList<IJavaProject>();
	      try {
	         IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	         IProject[] projects = workspaceRoot.getProjects();
	         for(int i = 0; i < projects.length; i++) {
	            IProject project = projects[i];
	            if(project.isOpen() && project.hasNature(JavaCore.NATURE_ID)) {
	               projectList.add(JavaCore.create(project));
	            }
	         } 
	      }
	      catch(CoreException ce) {
	         ce.printStackTrace();
	      }
	      return projectList;
	   }
	
	public String display(List<IJavaProject> projects) {
		String displayWorkplace = "Workplace:\n";
		
		for( IJavaProject project : projects)
			displayWorkplace += project.getElementName() + "\n";
		
		return displayWorkplace;
	}
	
	public IProject[] getProjects(){
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		return projects;
		}
	
	public String display2(IProject[] projects) {
		String displayWorkplace = "Workplace:\n";
		
		for( IProject project : projects)
			displayWorkplace += project.getName() + "\n";
		
		return displayWorkplace;
	}
	
	 
	public static String getJavaProjectsTest() throws CoreException{
	    
	//	IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	//	IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		//return workspaceRoot.toString();
		//
		String test = "test";
		
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject("Money");
		test = prj.getName();
		return test;// "Successful return";

		
	}
	
	public String getAnnotations()
	// Function to show annotation information
	{
		AnnotationTest test=new AnnotationTest(); // Instantiating Test class
		String Annotation = "";


	        Class c= test.getClass(); // Getting Class reference
	       // Method m=c.getMethod("testMethod"); // Getting Method reference
	        // Getting Class annotation
	        MyAnnotation annotation1=
	          (MyAnnotation)c.getAnnotation(MyAnnotation.class);
	        // Getting Method annotation
	        //  MyAnnotation annotation2=m.getAnnotation(MyAnnotation.class);
	        // Displaying annotation information
	        Annotation +="Author of the class: "+ annotation1.author();
	        // Displaying annotation information
	        Annotation += " Date of Writing the class: "+annotation1.date();
	        // Displaying annotation information
	        Annotation += " Bugs found in the class: "+annotation1.bug();
           return Annotation;
	}
	
	
}
