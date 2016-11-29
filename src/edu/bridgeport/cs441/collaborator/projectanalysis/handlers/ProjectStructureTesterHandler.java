/**
 * ProjectStructureAnalyzer.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 28, 2016
 */
package edu.bridgeport.cs441.collaborator.projectanalysis.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.bridgeport.cs441.collaborator.projectanalysis.ProjectStructureAnalyzer;

import org.eclipse.jface.dialogs.MessageDialog;

/**
 * ProjectStructureTesterHandler is a handler that allows the testing for ProjectStructureAnalyzer. Depending upon decisions
 * based upon the implementation of my portion of the code, this handler may eventually be completely removed. 
 * 
 * If anyone else has any code that needs to be run in the UI context, feel free to repurose this handler as you may need.
 * 
 * @author Peter Yasutake
 *
 */
public class ProjectStructureTesterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		ProjectStructureAnalyzer psa = new ProjectStructureAnalyzer();
		
		String projects = "";
		try {
			projects = psa.displayWorkplaceTree();
		}
		catch (CoreException ce){
			
		}
		
		MessageDialog.openInformation(
				window.getShell(),
				"Project Analysis: Testing Project Analysis",
				projects);
		
		
		return null;
	}
}
