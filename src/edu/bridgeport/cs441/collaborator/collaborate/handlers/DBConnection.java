package edu.bridgeport.cs441.collaborator.collaborate.handlers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * @author Subha, Jay
 *
 */
public class DBConnection //create class Connectivity
{ 
		
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		
	    static final String DB_URL = "jdbc:mysql://localhost/demo";
 
	    
	    static final String USER = "root" ;
	    static final String PASS = "root";
	   
	    public static void main(String[] args) 
	    {
	    	Connection conn = null;
	    	try 
	    	{
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
	    		System.out.println("Connecting to a selected database...");
	    		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    		System.out.println("Connected database successfully...");	    	
                }
	    	catch(SQLException se) 
	    	{
	    		se.printStackTrace();
	    	}
	    	catch(Exception e) 
	    	{
	    		e.printStackTrace();
	    	}
	    	finally  
	    	{
	    		try  
	    		{
	    			if(conn!=null)
	    			conn.close(); 
	    		}
	    		catch(SQLException se)
	    		{
	    			se.printStackTrace();
	    		}
	    	}
	    	System.out.println("Goodbye!"); 
	    }
}

