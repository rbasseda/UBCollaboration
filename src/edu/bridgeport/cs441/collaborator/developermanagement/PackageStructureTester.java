package edu.bridgeport.cs441.collaborator.developermanagement;

import org.eclipse.core.runtime.CoreException;

/**
 * Main class used to test the PackageStructureAnalyzer class.
 * @author Peter Yasutake
 *
 */
public class PackageStructureTester {

	public static void main(String[] args) {
		
		ProjectStructureAnalyzer psa = new ProjectStructureAnalyzer();
		
		try{
			psa.displayWorkplaceTree();
			
		}
		catch(CoreException ce){
			System.out.println("Core Error while printing!");
		}
		
	}

}
