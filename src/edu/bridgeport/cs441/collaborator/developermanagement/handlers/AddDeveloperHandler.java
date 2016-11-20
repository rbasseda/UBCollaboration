package edu.bridgeport.cs441.collaborator.developermanagement.handlers;
/**
*
* AddUserHandler.java
*
* Copyright (C) The University of Bridgeport, 2016
* All rights reserved.
*
* This software may be modified and distributed under the terms
* of the BSD license.  See the LICENSE file for details.
*
* Created on: November 17th, 2016   
* 
*/



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @author Reza Basseda
 * 
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AddDeveloperHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		//TODO: You have to complete this code
		//TODO: Decide about the number of command we need
		
		MessageDialog.openInformation(
				window.getShell(),
				"UBCollaboration: Course project of CS441",
				"Write add user code here");
		return null;
	}
}
