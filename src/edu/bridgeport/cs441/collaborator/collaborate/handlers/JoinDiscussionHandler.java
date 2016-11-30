/**
 * JoinDiscussionHandler.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * Created on: Nov 20, 2016
 */
package edu.bridgeport.cs441.collaborator.collaborate.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.window.Window;

/**
 * @author Reza Basseda
 *
 */
public class JoinDiscussionHandler{
		
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	
	
	public void execute(ExecutionEvent event) throws ExecutionException{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		LoginPage login = new LoginPage(window.getShell());
		// TODO Auto-generated method stub
		
		
		if (login.open() == Window.OK) {
            String user = login.getUser();
            String pw = login.getPassword();
            System.out.println(user);
            System.out.println(pw);
            
            
    }
		
		/*MessageDialog.openInformation(
				window.getShell(),
				"UBCollaboration: Login Portal",
				"Write join discussion code here");
		return null;*/
	}

}

