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
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
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
