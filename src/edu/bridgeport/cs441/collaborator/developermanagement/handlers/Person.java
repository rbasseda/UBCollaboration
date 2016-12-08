package edu.bridgeport.cs441.collaborator.developermanagement.handlers;

/**
 * @author Tejas Surve
 *
 */


public class Person {
	protected String fName;
	protected String lName;
	
	/**
	 * @param fName 
	 * @param lName
	 */
	
	public Person(String fName, String lName) {
		
		this.fName = fName;
		this.lName = lName;
		
	}
	
	
	
	public Person() {
		
	}



	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
}
