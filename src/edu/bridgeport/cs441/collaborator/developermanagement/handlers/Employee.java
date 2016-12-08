package edu.bridgeport.cs441.collaborator.developermanagement.handlers;

/**
 * @author Tejas Surve
 *
 */

public class Employee extends Person{
	
	protected int emp_id;

	public Employee(String fName, String lName, int emp_id) {
		super(fName, lName);
		this.emp_id = emp_id;
	}

	public Employee(String fName, String lName) {
		super(fName, lName);
	}	
	
}
