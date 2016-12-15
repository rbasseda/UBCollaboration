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
public class Base {
     public Base next;
     public Base(){
    	 next = null;
     }
     
     public void setNext(Base n){
    	 next = n;
     }
     
     public void add(Base n){
    	 if( next == null)
    		 next = n;
    	 else 
    		 add(n);

     }
     
     public void handle(int i){
    	 next.handle(i);
     }
}
