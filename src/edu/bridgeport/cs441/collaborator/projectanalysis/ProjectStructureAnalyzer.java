/**
 * ProjectStructureAnalyzer.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 22, 2016
 */
package edu.bridgeport.cs441.collaborator.projectanalysis;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * ProjectStructureAnalyzer provides analytics for the structure of the collaborative project.
 * 
 * @author Peter Yasutake
 *
 */
public class ProjectStructureAnalyzer {
	
	
	private IWorkspaceRoot workspaceRoot;
	private IWorkbench workbench;

	
	public ProjectStructureAnalyzer() {
		
		workbench = PlatformUI.getWorkbench();
		workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	}
	
	public String displayWorkplaceTree() throws CoreException{
		String displayWorkplace = "";
		
		displayWorkplace += "Workplace:\n";
		for (IProject contents : workspaceRoot.getProjects()){
			displayWorkplace += this.displayProjectTree(contents) + "\n";
		}
		
		return displayWorkplace;
	}
	
	public String displayProjectTree(IProject printProject) throws CoreException{
		String displayTree = "";
		
		displayTree += "-" + printProject.getName() + "\n";
		for (IResource contents : printProject.members()){
			displayTree += "---" + contents.getName() + "\n";
		}
		
		return displayTree;
	}

	
}
