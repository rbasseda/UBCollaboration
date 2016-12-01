


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

package edu.bridgeport.cs441.collaborator.bugsreport.handlers;

import edu.bridgeport.cs441.collaborator.bugsreport.BugsReporter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Alaa Elsaka
 * 
 */
public class BugsReportHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// TODO Auto-generated method stub
		
		BugsReporter br = new BugsReporter();
		
		
		MessageDialog.openInformation(
				window.getShell(),
				"Project Analysis: Testing Project Analysis",
				br.getAnnotations());
		
		
	/*	MessageDialog.openInformation(
				window.getShell(),
				"UBCollaboration: Course project of CS441",
				"Bugs Report code here");*/
		return null;
	}

}
