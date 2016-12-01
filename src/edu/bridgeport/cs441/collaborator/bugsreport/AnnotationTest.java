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

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
    String author();
    String date();
    String bug();
}


//Applying annotation to the class
@MyAnnotation(author="aelsaka",date="30/11/2016",bug="FirstBug")
public class AnnotationTest
{
    // Applying annotation to the method
    @MyAnnotation(author="aelsaka",date="22/10/2011",bug="AnotherBug")
    public String testAnnotation()
    {
 
        return "some Annotations";
    } 

}