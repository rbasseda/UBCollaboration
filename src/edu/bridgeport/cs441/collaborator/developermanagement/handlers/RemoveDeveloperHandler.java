/**
 * 
 */
package edu.bridgeport.cs441.collaborator.developermanagement.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is handling the remove user requests.
 * 
 * @author Reza Basseda, Tejas Surve
 * 
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RemoveDeveloperHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		//TODO: You have to complete this code
		//TODO: Decide about the number of command we need
		
		MessageDialog.openInformation(
				window.getShell(),
				"UBCollaboration: Course project of CS441",
				"Write remove user code here");
		return null;
	}

}
