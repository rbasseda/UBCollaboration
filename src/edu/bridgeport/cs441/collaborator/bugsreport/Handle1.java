package edu.bridgeport.cs441.collaborator.bugsreport;
/**
 * JoinDiscussionHandler.java
 * 
 * Copyright (C) The University of Bridgeport, 2016
 * All rights reserved.
 * 
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 * 
 * The purpose of this class is to test Annotations
 * 
 *  @author Alaa Elsaka    
 *  
 * Created on: Nov 30, 2016
 */
public class Handle1 extends Base {

	public void handle(int i){
		if(i == 1)
			System.out.println(" Bug No 1 Handled perfectly ");
		else {
		System.out.println(" Can't handle it, only Bug No 1");
			super.handle(i);
		}
	}
}
