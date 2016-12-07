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

import java.sql.*;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.window.Window;


/**
 * @author Reza Basseda, Subha Bir Mathema, Jay Sheth
 *
 */
public class JoinDiscussionHandler extends AbstractHandler{
		
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException{
		Shell shell = HandlerUtil.getActiveShellChecked(event);
		LoginPage login = new LoginPage(shell);
		
		 if (login.open() == Window.OK) {			 
			 
			 String username = login.getUser();
			 String password = login.getPassword();
			 
			 if(loginCheck(username, password)){
				 System.out.println("credential match");
			 }
			 else {
				 System.out.println("credential unmatch");
			 }
			 
			 //when clicked OK check the authentication
			 
			 //If failure display wrong username password
			 
			 //If success start chat
			 
			 
		 }
		return null;
	}

	private  boolean loginCheck(String username, String password){
        String query;
        String dbUsername, dbPassword;
        boolean login = false;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ubcollaberation", "root", "admin");
            Statement stmt = (Statement) con.createStatement();
            query = "SELECT username, password FROM login;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            
            
            while(rs.next()){
                dbUsername = rs.getString("username");
                dbPassword = rs.getString("password");

                if(dbUsername.equals(username) && dbPassword.equals(password)){
                   login = true;
                }
            }
            con.close();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return login;
    
}
	
}


